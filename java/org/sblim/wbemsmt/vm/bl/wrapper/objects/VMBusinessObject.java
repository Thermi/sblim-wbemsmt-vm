 /** 
  * MetaclusterObjects.java
  *
  * © Copyright IBM Corp. 2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Common Public License from
  * http://www.opensource.org/licenses/cpl1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Baseclass for all Metacluster Objects
  * 
  */
package org.sblim.wbemsmt.vm.bl.wrapper.objects;


import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.util.logging.Level;

import javax.cim.*;

import org.apache.commons.collections.MultiHashMap;
import org.apache.commons.collections.MultiMap;
import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFcoHelper;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.bl.wrapper.WbemsmtBusinessObject;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.util.StringComparator;
import org.sblim.wbemsmt.vm.VMErrCodes;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.RASDProperty;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.RASDPropertyComparator;
import org.sblim.wbemsmt.vm.schema.cim_2_17.*;


public abstract class VMBusinessObject extends WbemsmtBusinessObject{

	public static final boolean TYPE_VIEW = true;
    public static final boolean TYPE_WIZARD = false;
    public static final String RASD_NETWORK = "rasd.network";
    public static final String RASD_MEMORY = "rasd.memory";
    public static final String RASD_DISK = "rasd.disk";
    public static final String RASD_PROCESSOR = "rasd.processor";
    public static final String VSSD = "vssd";
    
    
    private static final MultiMap DEFAULT_PROPERTIES_BY_RASD_TYPE = new MultiHashMap();
    
    static
    {
        DEFAULT_PROPERTIES_BY_RASD_TYPE.put(RASD_NETWORK, CIM_ResourceAllocationSettingData.PROPERTY_POOLID.NAME);
        DEFAULT_PROPERTIES_BY_RASD_TYPE.put(RASD_NETWORK, CIM_ResourceAllocationSettingData.PROPERTY_ADDRESS.NAME);
        DEFAULT_PROPERTIES_BY_RASD_TYPE.put(RASD_DISK, CIM_ResourceAllocationSettingData.PROPERTY_POOLID.NAME);
        DEFAULT_PROPERTIES_BY_RASD_TYPE.put(RASD_DISK, CIM_ResourceAllocationSettingData.PROPERTY_ADDRESS.NAME);
    }
    
    
    /**
     * Default pools
     */
    protected static final String DEFAULT_NETWORK_POOL = "NetworkPool/default";
    protected static final String DEFAULT_DISK_POOL = "DiskPool/Default";
    protected static final String DEFAULT_MEMORY_POOL = "MemoryPool/0";
    protected static final String DEFAULT_PROCESSOR_POOL = "ProcessorPool/0";
    
    public static final ValueType TYPE_MIN = new ValueType("MIN",null,CIM_SettingsDefineCapabilities.PROPERTY_VALUERANGE.VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Minimums);
    public static final ValueType TYPE_MAX = new ValueType("MAX",null,CIM_SettingsDefineCapabilities.PROPERTY_VALUERANGE.VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Maximums);
    public static final ValueType TYPE_DEFAULT = new ValueType("DEFAULT",CIM_SettingsDefineCapabilities.PROPERTY_VALUEROLE.VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Default,null);
    public static final ValueType TYPE_WEIGHT = new ValueType("WEIGHT",null,null);
    public static final ValueType TYPE_LIMIT = new ValueType("LIMIT",null,null);

    protected final VMCimAdapter adapter;
	/**
	 * Stores the RASD by using parts of the RASD, the resource Type and the value range
	 * @see #getKey(CIM_ResourceAllocationSettingData, UnsignedInteger16, UnsignedInteger16)
	 */
    protected Map rasds = new HashMap();

    private NumberFormat FORMAT_BYTES = new DecimalFormat("#######0");
    

	protected VMBusinessObject(VMCimAdapter adapter) {
		super(adapter);
		this.adapter = adapter;
	}

	public VMCimAdapter getAdapter() {
		return adapter;
	}
	
	/**
	 * Searches RASD by the given ValueRange, Value Role and ResourceType
	 * @param caps
	 * @param valueType defines if the rasd should represent min,max,default
	 * @param valueRole a valueRole of CIM_SettingsDefineCapabilities (if null is ignored)
	 * @param resourceType a ResourceType of CIM_AllocationCapabilities
	 * @param readFromCache
	 * @return null if there is no RASD found
	 * @throws WbemsmtException if there is more than one AllocationCapabilities for the given ResourceType or more than one RASD for the given Value range
	 */
    public CIM_ResourceAllocationSettingData getRasd(CIM_AllocationCapabilities caps,
            ValueType valueType, UnsignedInteger16 resourceType, boolean readFromCache) throws WbemsmtException {
        

        UnsignedInteger16 range = valueType.range;
        UnsignedInteger16 role = valueType.role;
        
        CIM_ResourceAllocationSettingData found = null;
        String key = getKey(caps, resourceType, valueType.type);
        
        if (readFromCache){
        	found = (CIM_ResourceAllocationSettingData) rasds.get(key);
        }
        
        if (found != null)
        {
            return found;
        }
        
        List sds = caps.getAssociations_CIM_SettingsDefineCapabilities(getCimClient(),false,false,null,null);
        
        for (Iterator iterator = sds.iterator(); iterator.hasNext();) {
            CIM_SettingsDefineCapabilities sdc = (CIM_SettingsDefineCapabilities) iterator.next();
            
            boolean valueRangeMatching = range == null || 
                                         sdc.get_ValueRange() != null && range.intValue() == sdc.get_ValueRange().intValue(); 

            boolean valueRoleMatching = role == null || 
                                         sdc.get_ValueRole() != null && role.intValue() == sdc.get_ValueRole().intValue(); 
            
            //As long as the valueRole/valueRange is not set correctly we try to find out by the referenced SettingData
            //if it point to min/max/default
            //TODO remove referencedPathContainsHint if valueRole/valueRange is set correctly
            
            boolean referencedPathContainsHint = sdc
                                                    .getProperty(CIM_SettingsDefineCapabilities.PROPERTY_PARTCOMPONENT_CIM_SETTINGDATA.NAME)
                                                    .getValue()
                                                    .toString()
                                                    .toUpperCase()
                                                    .indexOf(valueType.type) > -1;
            
            if (valueRangeMatching && valueRoleMatching || referencedPathContainsHint)
            {
                if (found == null)
                {
                    CIM_ResourceAllocationSettingData rasd;
                    try {
                        rasd = (CIM_ResourceAllocationSettingData) sdc.get_PartComponent_CIM_SettingData(getCimClient());
                        found = rasd;
                    }
                    catch (WbemsmtException e) {
                        logger.log(Level.WARNING,"Cannot resolve the referenced " + CIM_ResourceAllocationSettingData.CIM_CLASS_NAME + " with object path " + sdc.getProperty(CIM_SettingsDefineCapabilities.PROPERTY_PARTCOMPONENT_CIM_SETTINGDATA.NAME).getValue() + "\n" + e.getMessage());
                    }
                   
                    //try to get the associated objects and compare the objectPathes, for the case that an implementation is not supporting the GetInstance on sample RASDs
                    if (found == null)
                    {
                        String path = sdc.getProperty(CIM_SettingsDefineCapabilities.PROPERTY_PARTCOMPONENT_CIM_SETTINGDATA.NAME).getValue().toString();                    
                        List rasds = caps.getAssociated_CIM_SettingData_CIM_SettingsDefineCapabilitiess(getCimClient(), CIM_ResourceAllocationSettingData.CIM_CLASS_NAME,null,null);
                        for (Iterator iterator2 = rasds.iterator(); found == null && iterator2.hasNext();) {
                            rasd = (CIM_ResourceAllocationSettingData) iterator2.next();
                            if (rasd.getCimObjectPath().toString().equals(path))
                            {
                                found = rasd;
                            }
                        }
                    }
                }
                else
                    logger.warning("Found more than one " + CIM_SettingsDefineCapabilities.CIM_CLASS_NAME + " that associated with " + 
                            " Capabilities " + caps.getCimObjectPath() + " , is having value range " + 
                            (range != null ? ""+range.intValue() : ""+range) + " and value role " + (role != null ? ""+role.intValue() : ""+role));
                    /* TODO comment out if sdc is having correct valueRange and valueType
                    throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                            "Found more than one " + CIM_SettingsDefineCapabilities.CIM_CLASS_NAME + " that associated with " + 
                            " Capabilities " + caps.getCimObjectPath() + " , is having value range " + 
                            (valueRange != null ? ""+valueRange.intValue() : ""+valueRange) + " and value role " + (valueRole != null ? ""+valueRole.intValue() : ""+valueRole));
                     */
            }
            
        }
        
        rasds.put(key, found);
        
        return found;
    }

    private String getKey(CIM_AllocationCapabilities fco, UnsignedInteger16 resourceType, String type) {
        
        StringBuffer sb = new StringBuffer();
        sb.append(fco.getCimObjectPath().toString()).append("-");
        
        if (resourceType != null)
        {
            sb.append(CIM_AllocationCapabilities.PROPERTY_RESOURCETYPE.getValueEntry(resourceType));
        }
        else
        {
            sb.append("noResourceType");
        }
        sb.append("-").append(type);
        return sb.toString();
    }

    protected String getMemoryAsString(CIM_ResourceAllocationSettingData sdForMemory) {
        return getMemoryAsString(new CIM_ResourceAllocationSettingData[]{sdForMemory});
    }

    protected String getMemoryAsString(CIM_ResourceAllocationSettingData[] rasds) {
        if (rasds == null || rasds.length == 0 || rasds[0] == null)
        {
            return "";
        }
        else
        {
            //check if there are different units
            Set allocationUnits = new HashSet();
            for (int i = 0; i < rasds.length; i++) {
                CIM_ResourceAllocationSettingData sdForMemory = rasds[i];
                if (isAllocationUnitKiloBytes(sdForMemory))
                {
                    allocationUnits.add("KiloBytes");
                }
                else
                {
                    allocationUnits.add(sdForMemory.get_AllocationUnits());
                }
            }
            if (allocationUnits.size() > 1)
            {
                logger.warning("Dont execute MemoryCalculation for RASDs - more than one AllocationUnit found. Used RASDS");
                for (int i = 0; i < rasds.length; i++) {
                    logger.warning("   " + rasds[i].getCimObjectPath() + " with AllocationUnits " + rasds[i].get_AllocationUnits());
                }
                return "";
            }
            
            double quantity = 0.0;
            
            for (int i = 0; i < rasds.length; i++) {
                CIM_ResourceAllocationSettingData sdForMemory = rasds[i];
                long virtualQuantity = getVirtualQuantity(sdForMemory).longValue();
                if ( virtualQuantity  == -1) {
                	virtualQuantity = 1;                	
                }
                quantity = quantity + virtualQuantity; 
                if (i == rasds.length-1)
                {
                    if (isAllocationUnitKiloBytes(sdForMemory))
                    {
                        return getQuantityFromKB(quantity);
                        
                    }
                    else
                    {
                        logger.warning("Allocation unit of RASD " + sdForMemory.getCimObjectPath() + " not used");
                        return quantity + " " + sdForMemory.get_AllocationUnits(); 
                    }
                }
            }
            return "0 MB";
        }
    }

    protected String getProcessorAsString(CIM_ResourceAllocationSettingData[] rasds) {
        if (rasds == null || rasds.length == 0 || rasds[0] == null)
        {
            return "";
        }
        else
        {
            int count = 0;
            
            for (int i = 0; i < rasds.length; i++) {
                CIM_ResourceAllocationSettingData sdForProcessor = rasds[i];
                if (sdForProcessor.get_VirtualQuantity() == null){
                	sdForProcessor.set_VirtualQuantity(new UnsignedInteger64("0"));
                }
                count = count + getVirtualQuantity(sdForProcessor).intValue();
            }
            return "" + count;
        }
    }

    protected boolean isAllocationUnitKiloBytes(CIM_ResourceAllocationSettingData sdForMemory) {
        return sdForMemory.get_AllocationUnits().equalsIgnoreCase("byte*2^10")
            || sdForMemory.get_AllocationUnits().equalsIgnoreCase("KiloBytes");
    }

    /**
     * Get the Quantity as String formated into KB, MB, GB or TB
     * @param quantityInKB
     * @return
     */
    protected String getQuantityFromKB(double quantityInKB) {
        String unit = "KB";
        if (quantityInKB > 1024)
        {
            unit = "MB";
            quantityInKB = quantityInKB / 1024;

            if (quantityInKB > 1024)
            {
                unit = "GB";
                quantityInKB = quantityInKB / 1024;

                if (quantityInKB > 1024)
                {
                    unit = "TB";
                    quantityInKB = quantityInKB / 1024;
                }
            }
        }
        
        return FORMAT_BYTES.format(quantityInKB) + " " + unit;
    }

    /**
     * Get the Quantity as String formated into Bytes, KB, MB, GB or TB
     * @param quantityInBytes
     * @return
     */
    protected String getQuantityFromBytes(double quantityInBytes) {
        String unit = "Bytes";
        if (quantityInBytes > 1024)
        {
            return getQuantityFromKB(quantityInBytes/1024);
        }
        
        return FORMAT_BYTES.format(quantityInBytes) + " " + unit;
    }

    protected boolean waitForJob(MessageList messageList, CIM_ConcreteJob job) throws WbemsmtException {
        while (job.get_ErrorCode() == null)
        {
               try {
                   Thread.sleep(500);
               }
               catch (InterruptedException e) {
                    //do nothing
               }
               job = CIM_ConcreteJobHelper.getInstance(getCimClient(), job.getCimInstance());
        }
           
        if (job.get_ErrorCode().intValue() != 0)
        {
               return false;
        }
        //try to cleanup the job
        try {
         CIM_ConcreteJobHelper.deleteInstance(getCimClient(), job);
        }
        catch (WbemsmtException e) {
             Message msg = Message.create(VMErrCodes.MSGDEF_DELETING_JOB_FAILED, 
                     adapter.getBundle(),
                     new Object[]{ job.getCimObjectPath().toString(),
                                   ExceptionUtil.getEnduserExceptionText(e, adapter.getBundle().getLocale(), adapter.getBundle(), e, Level.WARNING , RuntimeUtil.getLineBreak())
                                   });
             logger.severe(msg.getMessageString());
             if (messageList != null)
                 messageList.addMessage(msg);
        }
        
        return true;
    }

    /**
     * Get a List of all PropertyNames. All properties that are found in the resource "/&lt;type&gt;.&lt;view|wizard&gt;.properties" are excluded from the list.<br>
     * The list is sorted alphabetically<br>
     * In the "/&lt;type&gt;.&lt;wizard&gt;.properties" only thos propertie starting with vssd. are used
     * @param vssds
     * @param virtualSystemType the virtual system type - is used to find the resource /&lt;type&gt;.&lt;view|wizard&gt;.exclude.properties
     * @paran view if set to true exclude properties file with .view. is used. if false exclude.properties with .wizard. is used
     * @return the sorted list with the property names
     * @throws WbemsmtException
     */
    protected List getPropertyNames(CIM_VirtualSystemSettingData[] vssds, String virtualSystemType, boolean view) throws WbemsmtException {
        
        //read all the properties of all vssd
        Set names = new HashSet();
        for (int i = 0; i < vssds.length; i++) {
            CIM_VirtualSystemSettingData vssd = vssds[i];
            CIMProperty[] properties2 = vssd.getProperties();
            for (int j = 0; j < properties2.length; j++) {
                CIMProperty property = properties2[j];
                names.add(property.getName());
            }
        }
        
        String resourceName =  System.getProperty("user.home") + "/" + virtualSystemType + "." + ( view ? "view" : "wizard") + ".properties";
        logger.info("Try to load properties from file: " + resourceName);
        File f = new File(resourceName);
        InputStream stream;
        if (f.exists())
        {
            try {
                stream = new FileInputStream(f);
            }
            catch (FileNotFoundException e) {
                //should not occur
                logger.log(Level.SEVERE,"File not found",e);
                stream = null;
            }
        }
        else
        {
            logger.info("File " + resourceName + " doesn't exist");
            resourceName =  "/" + virtualSystemType + "." + ( view ? "view" : "wizard") + ".properties";
            logger.info("Try to load properties from classpath: " + resourceName);
            stream = getClass().getResourceAsStream(resourceName);
        }

        

        if (stream != null)
        {
            try {
                Properties props = new Properties();
                props.load(stream);
                
                Set excludes = props.keySet();
                for (Iterator iterator = excludes.iterator(); iterator.hasNext();) {
                    String propertyToExclude = (String) iterator.next();
                    if (view)
                    {
                        logger.info("Removing property " + propertyToExclude);
                        names.remove(propertyToExclude);
                    }
                    else if (propertyToExclude.startsWith("vssd."))
                    {
                        propertyToExclude = propertyToExclude.substring("vssd.".length());
                        logger.info("Removing property " + propertyToExclude);
                        names.remove(propertyToExclude);
                    }
                }
            }
            catch (IOException e) {
                logger.log(Level.SEVERE,"exclude.properties " + resourceName + " cannot be loaded ",e);
            }
        }
        else
        {
            logger.info("resource  " + resourceName + " was not found.");
        }
        
        List properties = new ArrayList();
        properties.addAll(names);
        
        Collections.sort(properties, new StringComparator());
        return properties;
    }

    /**
     * Get a List of all PropertyNames. All properties that are found in the resource "/&lt;type&gt;.&lt;wizard&gt;.properties", in the rasd instance and matching the prefix rasdType are included<br>
     * The list is sorted by idx defined in the properties file
     * In the "/&lt;type&gt;.&lt;wizard&gt;.properties" only thos propertie starting with rasdType are used
     * @param rasd the RASD to check if the properties are existing
     * @param rasdType the type of the RASD (see RASD_* variables)
     * @param virtualSystemType the virtual system type - is used to find the resource /&lt;type&gt;.&lt;wizard&gt;.properties
     * @return the sorted list with RASDProperty objects
     * @throws WbemsmtException
     */
    protected List getRASDProperties(CIM_ResourceAllocationSettingData rasd, String rasdType, String virtualSystemType) throws WbemsmtException {
        
        //read all the properties of all vssd
        Set namesInRasd = new HashSet();
        String rasdClassName = "";
        if (rasd != null) {
        	rasdClassName = rasd.getCimInstance().getClassName();
	        CIMProperty[] properties2 = rasd.getProperties();
	        for (int j = 0; j < properties2.length; j++) {
	            CIMProperty property = properties2[j];
	            namesInRasd.add(property.getName());
	        }
        }
        Set result = new HashSet();
        
        String resourceName =  System.getProperty("user.home") + "/" + virtualSystemType + ".wizard.properties";
        
        logger.info("Try to load properties from file : " + resourceName);
        File f = new File(resourceName);
        InputStream stream;
        if (f.exists())
        {
            try {
                stream = new FileInputStream(f);
            }
            catch (FileNotFoundException e) {
                //should not occur
                logger.log(Level.SEVERE,"File not found",e);
                stream = null;
            }
        }
        else
        {
            logger.info("File " + resourceName + " doesn't exist");
            resourceName =  "/" + virtualSystemType + ".wizard.properties";
            logger.info("Try to load properties from classpath: " + resourceName);
            stream = getClass().getResourceAsStream(resourceName);
        }

        if (stream != null)
        {
            try {
                Properties props = new Properties();
                props.load(stream);
                
                Set propKeys = props.keySet();
                for (Iterator iterator = propKeys.iterator(); iterator.hasNext();) {
                    String key = (String) iterator.next();
                    if (key.startsWith(rasdType + "."))
                    {
                        //getting the fieldname
                        String fieldname = props.getProperty(key);
                        boolean readOnly = fieldname.toLowerCase().endsWith(",readonly");
                        if (readOnly)
                        {
                            fieldname = fieldname.substring(0,fieldname.length()-",readonly".length());
                        }
                        int order = Integer.parseInt(key.substring((rasdType + ".").length()));
                        if (namesInRasd.contains(fieldname))
                        {
                            result.add(new RASDProperty(fieldname,readOnly,order));
                        }
                        else
                        {
                            logger.warning("Field " + fieldname + " was not found in class " + rasdClassName + " and is not added to the list");
                        }
                    }
                }
            }
            catch (IOException e) {
                logger.log(Level.SEVERE,"exclude.properties " + resourceName + " cannot be loaded ",e);
            }
        }
        else
        {
            logger.info("resource  " + resourceName + " was not found.");
        }
        
        List properties = new ArrayList();
        properties.addAll(result);
        
        Collections.sort(properties, new RASDPropertyComparator());
        return properties;
    }

    /**
     * returns the CIMInstance for a new CIM_VirtualSystemSettingData or a CIM_ResourceAllocationSettingData
     * @param type
     * @param virtualSystemType
     * @return
     * @throws WbemsmtException 
     */
    public CIMInstance getDefaultSettingData(String type, String virtualSystemType) throws WbemsmtException {
        

        String resourceName =  System.getProperty("user.home") + "/" + virtualSystemType + ".defaults.properties";
        
        logger.info("Try to load properties from file : " + resourceName);
        File f = new File(resourceName);
        InputStream stream;
        if (f.exists())
        {
            try {
                stream = new FileInputStream(f);
            }
            catch (FileNotFoundException e) {
                //should not occur
                logger.log(Level.SEVERE,"File not found",e);
                stream = null;
            }
        }
        else
        {
            logger.info("File " + resourceName + " doesn't exist");
            resourceName = "/" + virtualSystemType + ".defaults.properties";
            logger.info("Try to load properties from classpath: " + resourceName);
            stream = getClass().getResourceAsStream(resourceName);
        }
        
        String classname = CIM_ResourceAllocationSettingData.CIM_CLASS_NAME;
        
        if (stream != null)
        {
            try {
                Properties props = new Properties();
                props.load(stream);
                
                classname = props.getProperty(type);
                
                if (classname == null)
                {
                    logger.warning("No entry " + type + " found in " + resourceName);
                }
                
            }
            catch (IOException e) {
                logger.log(Level.SEVERE,"defaults.properties " + resourceName + " cannot be loaded ",e);
            }
        }
        
        try {
            CIMClass cls = AbstractWbemsmtFcoHelper.getClass(adapter.getCimClient(), classname, adapter.getNamespace());
            CIMInstance newInstance = cls.newInstance();
            return newInstance;
        }
        catch (WbemsmtException e) {
            logger.log(Level.SEVERE,"Cannot create instance of  " + classname + " in namespace " + adapter.getNamespace(),e);
            try {
                if (type == VSSD)
                {
                    return new CIM_VirtualSystemSettingData(adapter.getCimClient(),adapter.getNamespace()).getCimInstance();
                }
                else
                {
                    return new CIM_ResourceAllocationSettingData(adapter.getCimClient(),adapter.getNamespace()).getCimInstance();
                }
            }
            catch (WbemsmtException e1) {
                throw e1;
            }
        }
    }    
    
    static class ValueType
    {
        final String type;
        final UnsignedInteger16 range;
        final UnsignedInteger16 role;

        private ValueType(String type, UnsignedInteger16 role, UnsignedInteger16 range)
        {
            this.type = type;
            this.role = role;
            this.range = range;
        }
    }	
    
    /**
     * Wrapper method because virtQuantity is sometimes not returned as UnsignedInt64
     * @param sd
     * @return
     */
    protected Number getVirtualQuantity(CIM_ResourceAllocationSettingData sd)
    {
        CIMProperty property = sd.getProperty(CIM_ResourceAllocationSettingData.PROPERTY_VIRTUALQUANTITY.NAME);
        if (property != null)
        {
            return ((Number)property.getValue());
        }
        else
        {
            return new UnsignedInteger64("0");
        }
    }
}
