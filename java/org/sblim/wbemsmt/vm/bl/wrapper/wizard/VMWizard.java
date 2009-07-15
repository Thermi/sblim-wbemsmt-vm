 /** 
  * VMWizard.java
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
  * Description: wizard business object for creating a virtual system
  * 
  */
package org.sblim.wbemsmt.vm.bl.wrapper.wizard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;

import javax.cim.CIMClass;
import javax.cim.CIMClassProperty;
import javax.cim.CIMInstance;
import javax.cim.CIMProperty;
import javax.cim.UnsignedInteger16;
import javax.cim.UnsignedInteger32;
import javax.cim.UnsignedInteger64;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFcoHelper;
import org.sblim.wbemsmt.bl.fco.FcoUtil;
import org.sblim.wbemsmt.bl.fielddata.GenericFieldData;
import org.sblim.wbemsmt.bl.fielddata.MemoData;
import org.sblim.wbemsmt.bl.fielddata.PictureData;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;
import org.sblim.wbemsmt.util.StringUtil;
import org.sblim.wbemsmt.vm.VMErrCodes;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.HostSystem;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VM;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VMBusinessObject;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.Disk;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.Network;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.RASDProperty;
import org.sblim.wbemsmt.vm.container.wizard.ConfigItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.CreateVMPage1DataContainer;
import org.sblim.wbemsmt.vm.container.wizard.CreateVMPage2DataContainer;
import org.sblim.wbemsmt.vm.container.wizard.CreateVMPage3DataContainer;
import org.sblim.wbemsmt.vm.container.wizard.CreateVMSummaryDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DiskDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DiskItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.MemoryDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.NetworkDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.NetworkItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.ProcessorDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.SummaryConfigItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.SummaryDiskItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.SummaryNetworkItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.VMConfigDataContainer;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_AllocationCapabilities;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ComputerSystem;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ConcreteJob;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_EnabledLogicalElementCapabilities;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ResourceAllocationSettingData;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ResourcePool;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemManagementCapabilities;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemManagementService;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemManagementServiceHelper;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemSettingData;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemManagementService.DefineSystemResult;
import org.sblim.wbemsmt.vm.util.Int2Hex;

public class VMWizard  extends VMBaseWizard{

    /**
     * the HostSystem which is used for the new virtual system
     */
    protected HostSystem hostSystem;
    
    
    /**
     * the Network used for the new virtualSysten
     * contains Network objects
     * @see Network
     */
    protected List networks = new ArrayList();
    /**
     * the Disks used for the new virtualSysten
     * contains Disk objects
     * @see Disk
     */
    protected List disks = new ArrayList();
    /**
     * the references virtual system - if the user starts from scratch this is null
     */
    protected VM vm;
    /**
     * The currently used memory
     */
    protected String currentMemory;
    /**
     * The currently used processor
     */
    protected String currentProcessor,currentProcessorWeight,currentProcessorLimit;
    /**
     * The currently used memory
     */
    protected CIM_ResourceAllocationSettingData memoryRasd;
    /**
     * The currently used processor
     */
    protected CIM_ResourceAllocationSettingData processorRasd;
    /**
     * The sample for a Disk RASD
     * used to filter the fileds to be shown
     */
    protected CIM_ResourceAllocationSettingData sampleDiskRasd;
    /**
     * The sample for a Network RASD
     * used to filter the fileds to be shown
     */
    protected CIM_ResourceAllocationSettingData sampleNetworkRasd;
    /**
     * The settings used for the new virtual system
     */
    protected CIM_VirtualSystemSettingData vssd;
    
    /**
     * The names of the properties that are shown in the wizard
     */
    protected List vssdPropertyNames = new ArrayList();
    
    /**
     * The virtual system type of the new Virtual system
     */
    protected String virtualSystemType;
    
    /**
     * contains info if the systen will be started directly after creation
     */
    protected boolean startVirtualSystem;

    
    
    /**
     * Create a new Wizard object
     * @param adapter
     */
	public VMWizard(VMCimAdapter adapter) {
		super(adapter);
	}	

	/**
	 * Invoked if the uses presses the Finish/Create Button
	 * @param container
	 * @throws WbemsmtException
	 */
	public void create(CreateVMSummaryDataContainer container) throws WbemsmtException {
		createImpl(container);
		
	}

    protected void createImpl(DataContainer container) throws WbemsmtException {
        MessageList messageList = MessageList.init(container);

	    CIM_VirtualSystemManagementService managementService = hostSystem.getVirtualSystemManagementService();
        
		List rasdList = new ArrayList();
		rasdList.add(memoryRasd);
		if (managementService.get_Caption().startsWith("LXC")){
			CIMProperty[] properties = processorRasd.getCimInstance().getProperties();
			ArrayList newList = new ArrayList();
			for (int i = 0; i < properties.length; i++){
				if (!properties[i].getName().equalsIgnoreCase("VirtualQuantity") && !properties[i].getName().equalsIgnoreCase("Limit")){
					newList.add(properties[i]);
				}
			}
			CIMInstance newInstance = new CIMInstance(processorRasd.getCimObjectPath(),(CIMProperty[])newList.toArray(new CIMProperty[newList.size()]));
			processorRasd.setCimInstance(newInstance);
		}
		rasdList.add(processorRasd);
		
		for (Iterator iterator = disks.iterator(); iterator.hasNext();) {
            Disk disk = (Disk) iterator.next();
            String vmName = vssd.get_VirtualSystemIdentifier();
            String instance = null;
            if (managementService.get_Caption().startsWith("LXC")){
            	instance = vmName + '/' + disk.getRasd().getCimInstance().getProperty(VM.MOUNT_POINT).getValue();
            } else{
            	instance = vmName + '/' + disk.getRasd().getCimInstance().getProperty(VM.VIRTUAL_DEVICE).getValue();
            }
        	disk.getRasd().set_key_InstanceID(instance);
            rasdList.add(disk.getRasd());
        }
		
        for (Iterator iterator = networks.iterator(); iterator.hasNext();) {
            Network network = (Network) iterator.next();
            String vmName = vssd.get_VirtualSystemIdentifier();
        	String instance = vmName + '/' + network.getRasd().get_Address();
        	network.getRasd().set_key_InstanceID(instance);
            rasdList.add(network.getRasd());
        }

        
        CIM_ResourceAllocationSettingData[] rasds = (CIM_ResourceAllocationSettingData[]) rasdList.toArray(new CIM_ResourceAllocationSettingData[rasdList.size()]);
        
        DefineSystemResult result = managementService.invoke_DefineSystem(adapter.getCimClient(), vssd, rasds, vm != null ? vm.getCurrentSettingData(): null);
        CIM_ComputerSystem resultingSystem = null;

        if (result.getResultObject().intValue() == CIM_VirtualSystemManagementService.METHOD_DEFINESYSTEM.VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error.intValue())
        {
            resultingSystem = result.get_ResultingSystem();
        }
        else if (result.getResultObject().intValue() == CIM_VirtualSystemManagementService.METHOD_DEFINESYSTEM.VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started.intValue())
        {
            CIM_ConcreteJob job = result.get_Job();
            boolean ok = waitForJob(messageList, job);
            if (!ok)
            {
                Message msg = Message.create(VMErrCodes.MSGDEF_DEFINESYSTEM_FAILED, 
                        adapter.getBundle(),
                        new Object[]{ job.get_ErrorDescription() != null ? job.get_ErrorDescription() : ""
                                      });
                logger.severe(msg.getMessageString());
                if (messageList != null)
                    messageList.addMessage(msg);
                resultingSystem = null;
                
            }
        }
        else
        {
            throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Cannot create Virtual System. RC was " + result.getResultObject().intValue());
        }
        
		
        if (resultingSystem != null)
        {
            if (startVirtualSystem)
            {
                VM applicationContainer = new VM(adapter,resultingSystem, adapter.getSelectedHostSystem(),adapter.getAllVMList().size());
                applicationContainer.requestStateChange(messageList,
                        CIM_EnabledLogicalElementCapabilities.PROPERTY_REQUESTEDSTATESSUPPORTED.VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled);
            }
            container.setKey(new CimObjectKey(resultingSystem.getCimObjectPath()));
            
            adapter.setMarkedForReload();
            adapter.setPathOfTreeNode(resultingSystem.getCimObjectPath());
        }
        adapter.setActiveWizard(null);
    }
	
	/**
	 * init the wizard
	 */
	public void init() {
        
        disks.clear();
        networks.clear();
        hostSystem = null;
        vm = null;
        memoryRasd = null;
        processorRasd = null;
        currentMemory = null;
        currentProcessor = null;
        currentProcessorWeight = null;
        currentProcessorLimit = null;
        sampleDiskRasd = null;
        sampleNetworkRasd = null;
    }

	/**
	 * get the list of Network objects
	 * @see Network
	 * @return
	 */
    public List getNetworks() {
        return networks;
    }

    /**
     * get the list of Disk objects
     * @see Disk
     * @return
     */
    public List getDisks() {
        return disks;
    }

    public void updateModel(CreateVMPage2DataContainer container) throws WbemsmtException {
        int idx = ((UnsignedInteger16)container.get_ReferencedSystem().getConvertedControlValue()).intValue();
        //first idx is the "Don't use template text"
        if (idx == 0)
        {
            startFromScratch();
        }
        else
        {
            setVM(hostSystem.getVmList().getHostedSystem(idx-1));
        }
        
    }

    public void updateModel(NetworkDataContainer container) throws WbemsmtException {
        
        if (adapter.getUpdateTrigger() == container.get_usr_Add())
        {
            UnsignedInteger16 idx = (UnsignedInteger16) container.get_usr_Networks().getConvertedControlValue();
            if (idx != null)
            {
                List pools = hostSystem.getResourcePoolsByResourceType(VMCimAdapter.RESOURCE_TYPE_ETHERNET);
                CIM_ResourcePool pool = (CIM_ResourcePool) pools.get(idx.intValue());
                getNetworkFromPool(container, pool);
                
                
            }
        }
        else if (adapter.getUpdateTrigger() == container.get_usr_Remove())
        {
            List list = container.getNetworks();
            boolean removed = false; 
            for (int i = list.size() - 1; i >= 0; i--) {
                NetworkItemDataContainer child = (NetworkItemDataContainer) list.get(i);
                Boolean remove = (Boolean) child.get_usr_Remove().getConvertedControlValue();
                if (remove.booleanValue())
                {
                    Network net = (Network) getNetworks().remove(i);
                    net.setDeleted(true);
                    list.remove(i);
                    removed = true;
                }
            }
            if (removed)
            {
                //reload the children
                container.countAndCreateChildren();
            }
        }
        else //the next button
        {
            List list = container.getNetworks();
            for (int i = 0; i < list.size(); i++) {
                NetworkItemDataContainer child = (NetworkItemDataContainer) list.get(i);
                Network network = (Network) getNetworks().get(i);
                CIM_ResourceAllocationSettingData rasd = network.getRasd();
                CIMInstance cimInstance = rasd.getCimInstance();

                LabeledBaseHeaderComponentIf[] headers = getNetworkGenericHeaders(container);
                
                for (int j = 0; j < headers.length; j++) {
                    LabeledBaseHeaderComponentIf header = headers[j];
                    String propertyName = header.getLabelText();
                    if (StringUtils.isNotEmpty(propertyName))
                    {
                        LabeledBaseInputComponentIf[] components = getNetworkGenericItems(child);
                        CIMProperty property = rasd.getProperty(propertyName);
                        CIMClass cls = AbstractWbemsmtFcoHelper.getClass(getCimClient(), cimInstance.getClassName(), adapter.getNamespace());
                        CIMClassProperty clsProperty = cls.getProperty(propertyName);
                        
                        CIMProperty newProperty = GenericFieldData.setPropertyValue(property, cls, clsProperty, (GenericFieldData) components[j].getConvertedControlValue());
                        rasd = new CIM_ResourceAllocationSettingData(cimInstance.deriveInstance(new CIMProperty[]{newProperty}));
                        network.setRasd(rasd);
                    }
                }
                
            }
        }
    }


    
    
    /**
     * get a Network object from a pool
     * @param container
     * @param pool
     * @return null if no referenced rasd was found (in that case a message is added to the container)
     * @throws WbemsmtException
     */

    protected Network getNetworkFromPool(DataContainer container, CIM_ResourcePool pool)
            throws WbemsmtException {
        
        Network network = null;
        CIM_AllocationCapabilities caps = hostSystem.getCapabilities(pool, VMCimAdapter.RESOURCE_TYPE_ETHERNET);
        
        UnsignedInteger16 resourceType = VMCimAdapter.RESOURCE_TYPE_ETHERNET;
        CIM_ResourceAllocationSettingData rasd = hostSystem.getRasd(caps, VMBusinessObject.TYPE_DEFAULT, resourceType,false); 
        
        //This fixes the issue that when Dealing with Linux Containers if the rasd == null, it creates a new instance of the LXC_Network
        if (this.virtualSystemType.equalsIgnoreCase("LXC")){
        	if (rasd == null){
        		rasd = new CIM_ResourceAllocationSettingData(getDefaultSettingData(VMBusinessObject.RASD_NETWORK, virtualSystemType));
        	} 
        }
        
        if (rasd != null)
        {
        	
            network = new Network();
            network.setAdded(true);
            
            network.setRasd(rasd);
            if (network.getRasd().get_Address() == null)
            {
                network.getRasd().set_Address(generateMacAddress());
            }
            
            network.getRasd().set_PoolID(pool.get_PoolID());
            
            getNetworks().add(network);
            //reload the children
            container.countAndCreateChildren();
        }
        else
        {
            MessageList.init(container).addMessage(Message.create(VMErrCodes.MSGDEF_NO_RASD, adapter.getBundle(),new Object[]{pool.get_PoolID()}));
        }

        if (sampleNetworkRasd == null && rasd != null)
        {
            sampleNetworkRasd = rasd;
        }
        return network;
    }
    
    public void updateModel(DiskDataContainer container) throws WbemsmtException {

    	List dList = container.getDisks();
        for (int i = 0; i < dList.size(); i++) {
            DiskItemDataContainer child = (DiskItemDataContainer) dList.get(i);
            Disk disk = (Disk) getDisks().get(i);
            CIM_ResourceAllocationSettingData rasd = disk.getRasd();
            
            LabeledBaseHeaderComponentIf[] headers = getDiskGenericHeaders(container);
            LabeledBaseInputComponentIf[] components = getDiskGenericItems(child);
            
            for (int j = 0; j < headers.length; j++) {
                LabeledBaseHeaderComponentIf header = headers[j];
                String propertyName = header.getLabelText();
                if (StringUtils.isNotEmpty(propertyName))
                {
                    //LabeledBaseInputComponentIf[] components = getDiskGenericItems(child);
                    CIMInstance cimInstance = disk.getRasd().getCimInstance();
                    CIMProperty property = rasd.getProperty(propertyName);
                    CIMClass cls = AbstractWbemsmtFcoHelper.getClass(getCimClient(), cimInstance.getClassName(), adapter.getNamespace());
                    CIMClassProperty clsProperty = cls.getProperty(propertyName);
                    
                    CIMProperty newProperty = GenericFieldData.setPropertyValue(property, cls, clsProperty, (GenericFieldData) components[j].getConvertedControlValue());
                    rasd = new CIM_ResourceAllocationSettingData(cimInstance.deriveInstance(new CIMProperty[]{newProperty}));                    
                    disk.setRasd(rasd);
                }
            }
            
        }
    	
        if (adapter.getUpdateTrigger() == container.get_usr_Add())
        {
            UnsignedInteger16 idx = (UnsignedInteger16) container.get_usr_Disks().getConvertedControlValue();
            if (idx != null)
            {
                List pools = hostSystem.getResourcePoolsByResourceType(VMCimAdapter.RESOURCE_TYPE_DISK);
                CIM_ResourcePool pool = (CIM_ResourcePool) pools.get(idx.intValue());
                getDiskFromPool(container, pool);
                
            } else if (this.virtualSystemType.equalsIgnoreCase("LXC")){
            	CIM_ResourceAllocationSettingData rasd = new CIM_ResourceAllocationSettingData(getDefaultSettingData(RASD_DISK, virtualSystemType) );
            	setupDiskRasd(rasd, container);
            }
            
            
        }
        else if (adapter.getUpdateTrigger() == container.get_usr_Remove())
        {
            List list = container.getDisks();
            boolean removed = false;
            for (int i = list.size() - 1; i >= 0; i--) {
                DiskItemDataContainer child = (DiskItemDataContainer) list.get(i);
                Boolean remove = (Boolean) child.get_usr_Remove().getConvertedControlValue();
                if (remove.booleanValue())
                {
                    Disk disk = (Disk) getDisks().remove(i);
                    disk.setDeleted(true);
                    list.remove(i);
                    removed = true;
                }
            }
            if (removed)
            {
                //reload the children
                container.countAndCreateChildren();
            }
        } 
    }

    /**
     * Sets up basic information on Disk, purpose is for LXC Disks
     */
    private void setupDiskRasd(CIM_ResourceAllocationSettingData rasd, DiskDataContainer container ) throws WbemsmtException {
    	if (rasd != null)
        {
            Disk disk = new Disk();
            disk.setAdded(true);
            disk.setRasd(rasd);
            getDisks().add(disk);
            
            //reload the children
            container.countAndCreateChildren();                    
        }
        else
        {
            MessageList.init(container).addMessage(Message.create(VMErrCodes.MSGDEF_NO_RASD, adapter.getBundle(),null));                    
        }

        if (sampleDiskRasd == null && rasd != null)
        {
            sampleDiskRasd = rasd;
        }
    }
    
    /**
     * get a Disk object from a pool
     * @param container
     * @param pool
     * @return null if no referenced rasd was found (in that case a message is added to the container)
     * @throws WbemsmtException
     */
    protected Disk getDiskFromPool(DataContainer container, CIM_ResourcePool pool)
            throws WbemsmtException {
        
        Disk disk = null;
        
        CIM_AllocationCapabilities caps = hostSystem.getCapabilities(pool, VMCimAdapter.RESOURCE_TYPE_DISK);
        
        UnsignedInteger16 resourceType = VMCimAdapter.RESOURCE_TYPE_DISK;
        CIM_ResourceAllocationSettingData rasd = getRasd(caps, VMBusinessObject.TYPE_DEFAULT, resourceType,false);
        
        if (rasd != null)
        {
            disk = new Disk();
            disk.setAdded(true);
            disk.setRasd(rasd);
            rasd.set_PoolID(pool.get_PoolID());
            getDisks().add(disk);
            
            //reload the children
            container.countAndCreateChildren();                    
        }
        else
        {
            MessageList.init(container).addMessage(Message.create(VMErrCodes.MSGDEF_NO_RASD, adapter.getBundle(),new Object[]{pool.get_PoolID()}));                    
        }

        if (sampleDiskRasd == null && rasd != null)
        {
            sampleDiskRasd = rasd;
        }
        
        return disk;
    }
    
    public void updateModel(MemoryDataContainer container) throws WbemsmtException {
        
        
        LabeledBaseInputComponentIf field = container.get_usr_Size();
        updateMemory(container, field);
        
    }

    protected void updateMemory(DataContainer container, LabeledBaseInputComponentIf sizeInputField)
            throws WbemsmtException {
        
    	String memory = (String) sizeInputField.getConvertedControlValue();
        String memory1 = memory.trim().toLowerCase();
        String memory2 = memory1.substring(0,memory1.length()-2).trim();
        MessageList messages = MessageList.init(container);
        Long value = null;
        if (memory1.endsWith("kb")) {
            value = parseLong(messages,sizeInputField,memory2);
            if (value != null)
                value = checkMinMaxMemory(messages,sizeInputField,value.longValue());
            if (value != null)
                memoryRasd.set_VirtualQuantity(new UnsignedInteger64(value.toString()));
            currentMemory = memory;
        } else if (memory1.endsWith("mb")) {
            value = parseLong(messages,sizeInputField,memory2);
            if (value != null)
                value = checkMinMaxMemory(messages,sizeInputField,value.longValue()*1024);
            if (value != null)
                memoryRasd.set_VirtualQuantity(new UnsignedInteger64(value.toString()));
            currentMemory = memory;
        } else if (memory1.endsWith("gb")) {
            value = parseLong(messages,sizeInputField,memory2);
            if (value != null)
                value = checkMinMaxMemory(messages,sizeInputField,value.longValue()*1024*1024);
            if (value != null)
                memoryRasd.set_VirtualQuantity(new UnsignedInteger64(value.toString()));
            currentMemory = memory;
        } else if (memory1.endsWith("tb")) {
            value = parseLong(messages,sizeInputField,memory2);
            if (value != null)
                value = checkMinMaxMemory(messages,sizeInputField,value.longValue()*1024*1024*1024);
            if (value != null)
                memoryRasd.set_VirtualQuantity(new UnsignedInteger64(value.toString()));
            currentMemory = memory;
        } else {
            value = parseLong(messages,sizeInputField,memory);
            if (value != null)
                value = checkMinMaxMemory(messages,sizeInputField,value.longValue()*1024);
            if (value != null)
                memoryRasd.set_VirtualQuantity(new UnsignedInteger64(value.toString()));
            currentMemory = memory + " MB";
            
        }
        
        if (memoryRasd.get_Limit() == null || memoryRasd.get_Limit().longValue() <  memoryRasd.get_VirtualQuantity().longValue()) {
        	memoryRasd.set_Limit(memoryRasd.get_VirtualQuantity());
        }
        if (memoryRasd.get_Reservation() == null || memoryRasd.get_Reservation().longValue() !=  memoryRasd.get_VirtualQuantity().longValue()) {
        	memoryRasd.set_Reservation(memoryRasd.get_VirtualQuantity());
        }
        
    }

    public void updateModel(ProcessorDataContainer container) throws WbemsmtException {

        //TODO check min max      
        LabeledBaseInputComponentIf field = container.get_usr_Amount();
        LabeledBaseInputComponentIf field1 = container.get_usr_Weight ();
        LabeledBaseInputComponentIf field2 = container.get_usr_Limit ();
        updateProcessor(container, field);
        updateProcessorWeight(container , field1);
        updateProcessorLimit(container , field2);
    }

    protected void updateProcessor(DataContainer container, LabeledBaseInputComponentIf amount)
            throws WbemsmtException {
        String cpu = (String) amount.getConvertedControlValue();
        MessageList messages = MessageList.init(container);
        try {
            String cpu1 = cpu.trim();
            
            Long value = parseLong(messages,amount,cpu1);
            if (value != null)
                value = checkMinMaxProcessors(messages, amount, value.longValue());
            if (value != null)
            {
                processorRasd.set_VirtualQuantity(new UnsignedInteger64(value.toString()));
            }
            currentProcessor = "" + cpu;
            
        }
        catch (NumberFormatException e) {
            messages.addMessage(Message.create(VMErrCodes.MSGDEF_INVALID_PROCESSOR, adapter.getBundle(), new Object[]{cpu}));
        }
    }
  
    protected void updateProcessorWeight ( DataContainer container, LabeledBaseInputComponentIf weight )
			throws WbemsmtException {
		String weight1 = (String) weight.getConvertedControlValue ();
		MessageList messages = MessageList.init ( container );
		try {
			String weight2 = weight1.trim ();

			Long value = parseLong ( messages, weight, weight2 );
			if (value != null)
				processorRasd.set_Weight ( new UnsignedInteger32 ( value.toString () ) );
				currentProcessorWeight = ""+weight1;
		} catch (NumberFormatException e) {
			messages.addMessage ( Message.create ( VMErrCodes.MSGDEF_INVALID_PROCESSOR, adapter.getBundle (),
					new Object[] { weight } ) );
		}
	}
    
    protected void updateProcessorLimit ( DataContainer container, LabeledBaseInputComponentIf limit )
			throws WbemsmtException {
		String limit1 = (String) limit.getConvertedControlValue ();
		MessageList messages = MessageList.init ( container );
		try {
			String limit2 = limit1.trim ();

			Long value = parseLong ( messages, limit, limit2 );
			if (value != null)
				processorRasd.set_Limit ( new UnsignedInteger64 ( value.toString () ) );
				currentProcessorLimit = ""+limit1;
		} catch (NumberFormatException e) {
			messages.addMessage ( Message.create ( VMErrCodes.MSGDEF_INVALID_PROCESSOR, adapter.getBundle (),
					new Object[] { limit } ) );
		}
	}    
    
    public void updateModel(VMConfigDataContainer container) throws WbemsmtException {

        List items = container.getItems();
        for (Iterator iterator = items.iterator(); iterator.hasNext();) {
            ConfigItemDataContainer child = (ConfigItemDataContainer) iterator.next();
            String propertyName = (String) child.get_usr_Name().getConvertedControlValue();
            CIMProperty property = vssd.getProperty(propertyName);
            CIMClass cls = AbstractWbemsmtFcoHelper.getClass(adapter.getCimClient(), vssd.getCimInstance().getClassName(), adapter.getNamespace());
            CIMClassProperty clsProperty = cls.getProperty(propertyName);
            property = GenericFieldData.setPropertyValue(property, cls, clsProperty, (GenericFieldData)child.get_usr_CurrentValue().getConvertedControlValue());
            vssd.setProperty(property);
        }
        
    }
    
    public void updateModel(CreateVMPage3DataContainer container) {
        
        startVirtualSystem = ((Boolean)container.get_usr_StartContainer().getConvertedControlValue()).booleanValue();
        
    }
    

    public void updateControls(CreateVMPage1DataContainer container) throws WbemsmtException {
        container.get_VirtualSystemType().setValues(adapter.getHostSystems().getVirtualSystemTypeArray());
    }

    public void updateControls(CreateVMPage2DataContainer container) throws WbemsmtException {
        String[] nameArray = (String[]) ArrayUtils.add(hostSystem.getVmList().getNameArray(), 0, adapter.getBundle().getString("dont.use.template"));
        container.get_ReferencedSystem().setValues(nameArray);
        container.get_ReferencedSystem().getProperties().setSize(LabeledBaseInputComponentIf.SIZE_L);
    }

    public void updateControls(CreateVMPage3DataContainer container) {
    }

    public void updateControls(VMConfigDataContainer container) throws WbemsmtException {
        
        adapter.updateControls(container.getItems(), getVssdPropertyNames());
        
    }

    public void updateControls(ConfigItemDataContainer container, String propertyName) {
        
        container.get_usr_Name().setControlValue(propertyName);
        LabeledBaseInputComponentIf infoIcon = container.get_usr_Info();
        LabeledStringArrayInputComponentIf currentValue = container.get_usr_CurrentValue();
        boolean readOnly = false;
    
        updateConfigItem(propertyName, currentValue, infoIcon, readOnly);
        
        
    }

    public void updateControls(NetworkDataContainer container) throws WbemsmtException {
        
        container.get_usr_Networks().setValues(getNetworkNames());
        
        List properties = getRASDProperties(sampleNetworkRasd, RASD_NETWORK, virtualSystemType);
        
        LabeledBaseHeaderComponentIf[] fields = new LabeledBaseHeaderComponentIf[]{
            container.getNetworksHeader().getNetworksHeader_usr_Field1(),
            container.getNetworksHeader().getNetworksHeader_usr_Field2(),
            container.getNetworksHeader().getNetworksHeader_usr_Field3(),
            container.getNetworksHeader().getNetworksHeader_usr_Field4()
        };
        
        setRasdHeaderFields(properties, fields);
        
        adapter.updateControls(container.getNetworks(), getNetworks());        
    }
    
    public void updateControls(NetworkItemDataContainer container, Network network) throws WbemsmtException {
        List properties = getRASDProperties(sampleNetworkRasd, RASD_NETWORK, virtualSystemType);
        LabeledBaseInputComponentIf[] fields = getNetworkGenericItems(container);
        
        setRasdFields(network.getRasd(), properties, fields,true);
    }

    public void updateControls(DiskDataContainer container) throws WbemsmtException {
        
        container.get_usr_Disks().setValues(getDiskNames());
        
        List properties = getRASDProperties(sampleDiskRasd, RASD_DISK, virtualSystemType);
        
        LabeledBaseHeaderComponentIf[] fields = getDiskGenericHeaders(container);
        
        setRasdHeaderFields(properties, fields);                       
        
        adapter.updateControls(container.getDisks(), getDisks());
        
    }

    public void updateControls(DiskItemDataContainer container, Disk disk) throws WbemsmtException {
        
        List properties = getRASDProperties(sampleDiskRasd, RASD_DISK, virtualSystemType);
        LabeledBaseInputComponentIf[] fields = getDiskGenericItems(container);
        
        setRasdFields(disk.getRasd(), properties, fields,true);
        
    }

    public void updateControls(MemoryDataContainer container) throws WbemsmtException {

        if (hostSystem != null)
        {
            container.get_usr_Min().setControlValue(getMemoryAsString(hostSystem.getMinMemory()));
            container.get_usr_Max().setControlValue(getMemoryAsString(hostSystem.getMaxMemory()));
            container.get_usr_Default().setControlValue(getMemoryAsString(hostSystem.getDefaultMemory()));
        }
        container.get_usr_Size().setControlValue(currentMemory);
    }

    public void updateControls(ProcessorDataContainer container) throws WbemsmtException {
        if (hostSystem != null)
        {
            container.get_usr_Min().setControlValue(getMemoryAsString(hostSystem.getMinProcessor()));
            container.get_usr_Max().setControlValue(getMemoryAsString(hostSystem.getMaxProcessor()));
            container.get_usr_Default().setControlValue(getMemoryAsString(hostSystem.getDefaultProcessor()));
//            UnsignedInteger32 s = hostSystem.getDefaultProcessor ().get_Weight ();
//            container.get_usr_Weight ().setControlValue(s!=null?s.toString ():"0");
//            UnsignedInteger64 s1 = hostSystem.getDefaultProcessor ().get_Limit ();
//            container.get_usr_Limit ().setControlValue(s1!=null?s1.toString ():"0");
        }
        container.get_usr_Limit ().setControlValue(currentProcessorLimit!=null?currentProcessorLimit:"0");
        container.get_usr_Weight ().setControlValue(currentProcessorWeight!=null?currentProcessorWeight:"0");
        container.get_usr_Amount().setControlValue(currentProcessor);
    }    

    public void updateControls(CreateVMSummaryDataContainer container) throws WbemsmtException {
        
        container.get_usr_StartContainer().setControlValue(new Boolean(startVirtualSystem));
        container.get_usr_StartContainer().getProperties().setReadOnly(true);
        
        container.get_Memory().setControlValue(currentMemory);
        container.get_Processor().setControlValue(currentProcessor);
        
        List properties = getRASDProperties(sampleDiskRasd, RASD_DISK, virtualSystemType);
        setRasdHeaderFields(properties, getDiskGenericHeaders(container));
        adapter.updateControls(container.getDisks(), getDisks());
        
        properties = getRASDProperties(sampleNetworkRasd, RASD_NETWORK, virtualSystemType);
        setRasdHeaderFields(properties, getNetworkGenericHeaders(container));
        adapter.updateControls(container.getNetworks(), getNetworks());
        
        adapter.updateControls(container.getConfigItems(), getVssdPropertyNames());
    }
    
    
    public void updateControls(SummaryConfigItemDataContainer container, String propertyName) {

        container.get_usr_Name().setControlValue(propertyName);
        LabeledBaseInputComponentIf infoIcon = null;
        LabeledBaseInputComponentIf currentValue = container.get_usr_CurrentValue();
        boolean readOnly = true;
        updateConfigItem(propertyName, currentValue, infoIcon, readOnly);
    }

    public void updateControls(SummaryDiskItemDataContainer container, Disk disk) throws WbemsmtException {
    
        CIM_ResourcePool pool = hostSystem.getReferencedPool(disk.getRasd());
        
        container.get_usr_FromPool().setControlValue(pool != null ? pool.get_Caption() : "");
        container.get_usr_Path().setControlValue(disk.getRasd().get_Address());
        
        List properties = getRASDProperties(sampleDiskRasd, RASD_DISK, virtualSystemType);
        LabeledBaseInputComponentIf[] fields = getDiskGenericItems(container);
        
        setRasdFields(disk.getRasd(), properties, fields,false);        
    }

    public void updateControls(SummaryNetworkItemDataContainer container, Network network) throws WbemsmtException {

        CIM_ResourcePool pool = hostSystem.getReferencedPool(network.getRasd());
        
        container.get_usr_FromPool().setControlValue(pool != null ? pool.get_Caption() : "");
        container.get_usr_Mac().setControlValue(network.getRasd().get_Address());
        
        List properties = getRASDProperties(sampleNetworkRasd, RASD_NETWORK, virtualSystemType);
        LabeledBaseInputComponentIf[] fields = getNetworkGenericItems(container);
        
        setRasdFields(network.getRasd(), properties, fields,false);        
        
    }
        
    public void setHostSystem(CreateVMPage1DataContainer container) throws WbemsmtException {
        virtualSystemType = adapter.getHostSystems().getVirtualSystemTypeArray()[((UnsignedInteger16)container.get_VirtualSystemType().getConvertedControlValue()).intValue()];
        hostSystem = adapter.getHostSystems().getHostedSystemByType(virtualSystemType);

        if (!hostSystem.isManagementCapabilitiesSupportingMethod(CIM_VirtualSystemManagementCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DefineSystemSupported))
        {
            MessageList.init(container).addMessage(Message.create(VMErrCodes.MSGDEF_CREATION_NOT_POSSIBLE_CAPABILITIES, adapter.getBundle()));
        }
    }

    /**
     * returns the number of properties of the vssds that are displayed
     * @return
     * @throws WbemsmtException 
     * @see #getNextSettingData()
     * @see #getCurrentSettingData()
     */
    public int getSettingDataPropertyCount() throws WbemsmtException {
        return getVssdPropertyNames().size();
    }    
    
    public List getVssdPropertyNames() throws WbemsmtException {
        return vssdPropertyNames;
    }

    protected void setVM(VM vm) throws WbemsmtException {
        
        this.vm = vm;
    
        /**
         * set the vssd
         */
        CIM_VirtualSystemSettingData selectedVSSD = vm.getCurrentSettingData();
        
        /**
         * set the vssd
         */
        vssd = new CIM_VirtualSystemSettingData(getDefaultSettingData(VSSD, virtualSystemType));
            
        CIMProperty[] vssdProps =  selectedVSSD.getProperties();
        for (int i=0; i < vssdProps.length; i++){        	
        	vssd.setProperty(vssdProps[i]);
        }
        // If VM argument is a reference for defining a new vm, null key/indentifier attributes  
    	vssd.set_VirtualSystemIdentifier(null);
    	vssd.set_ElementName(null);
    	vssd.set_key_InstanceID(null);

        /**
         * add disks
         */
        disks.clear();
        List vmDisks = vm.getDisks();
        for (Iterator iterator = vmDisks.iterator(); iterator.hasNext();) {
            org.sblim.wbemsmt.vm.bl.wrapper.objects.vm.Disk vmDisk = (org.sblim.wbemsmt.vm.bl.wrapper.objects.vm.Disk) iterator.next();
            Disk disk = new Disk();
            CIM_ResourceAllocationSettingData rasd = vmDisk.getRasd();
            if (rasd == null)
            {
                rasd = new CIM_ResourceAllocationSettingData(getDefaultSettingData(RASD_DISK, virtualSystemType) );
                rasd.set_ResourceType(VMCimAdapter.RESOURCE_TYPE_DISK);
                rasd.set_PoolID(vmDisk.getPoolId());
            }
            //TODO remove if poolid is set in RASDs
            //SNIP
            if (rasd.get_PoolID() == null)
            {
                rasd.set_PoolID(DEFAULT_DISK_POOL); 
            }
            //SNAP
            
            rasd.set_Address(vmDisk.getAddress());
            
            disk.setRasd(rasd);
            disks.add(disk);
            
            if (sampleDiskRasd == null && rasd != null)
            {
                sampleDiskRasd = rasd;
            }            
        }
        
        
        /**
         * add networks
         */
    
        networks.clear();
        List vmNetworks = vm.getNetworks();
        for (Iterator iterator = vmNetworks.iterator(); iterator.hasNext();) {
            org.sblim.wbemsmt.vm.bl.wrapper.objects.vm.Network vmNetwork = (org.sblim.wbemsmt.vm.bl.wrapper.objects.vm.Network) iterator.next();
            Network network = new Network();
            CIM_ResourceAllocationSettingData rasd = vmNetwork.getRasd();
            if (rasd == null)
            {
                rasd = new CIM_ResourceAllocationSettingData(getDefaultSettingData(VMBusinessObject.RASD_NETWORK, virtualSystemType) );
                rasd.set_ResourceType(VMCimAdapter.RESOURCE_TYPE_ETHERNET);
                rasd.set_PoolID(vmNetwork.getPoolId());
            }
            network.setRasd(rasd);
            rasd.set_Address(vmNetwork.getAddress());
            //TODO remove if poolid is set in RASDs
            //SNIP
            if (rasd.get_PoolID() == null)
            {
                rasd.set_PoolID(DEFAULT_NETWORK_POOL); 
            }
            //SNAP
            
            networks.add(network);
            
            if (sampleNetworkRasd == null && rasd != null)
            {
                sampleNetworkRasd = rasd;
            }
            
        }
        
        /**
         * add memory
         */
        currentMemory = vm.getMemory().getCurrent();
        if (StringUtils.isEmpty(currentMemory))
        {
            currentMemory = vm.getMemory().getDefaultValue();
        }
        memoryRasd = vm.getMemory().getRasd();
        if (memoryRasd == null)
        {
            memoryRasd = new CIM_ResourceAllocationSettingData(getDefaultSettingData(RASD_MEMORY, virtualSystemType) );
            memoryRasd.set_ResourceType(VMCimAdapter.RESOURCE_TYPE_MEMORY);
            memoryRasd.set_AllocationUnits("KiloBytes");
        }
        //TODO remove if poolid is set in RASDs
        //SNIP
        if (memoryRasd.get_PoolID() == null)
        {
            memoryRasd.set_PoolID(DEFAULT_MEMORY_POOL);
        }
        //SNAP
        
        
        /**
         * add processor
         */
        currentProcessor = vm.getProcessor().getCurrent();
        if (StringUtils.isEmpty(currentProcessor))
        {
            currentProcessor = vm.getProcessor().getDefaultValue();
        }
        
        currentProcessorWeight = vm.getProcessor ().getWeight ();
        currentProcessorLimit = vm.getProcessor ().getLimit ();
        
        processorRasd = vm.getProcessor().getRasd();
        if (processorRasd == null)
        {
            processorRasd = new CIM_ResourceAllocationSettingData(getDefaultSettingData(RASD_PROCESSOR, virtualSystemType) );
            processorRasd.set_ResourceType(VMCimAdapter.RESOURCE_TYPE_CPU);
        }
        //TODO remove if poolid is set in RASDs
        //SNIP
        if (processorRasd.get_PoolID() == null)
        {
            processorRasd.set_PoolID(DEFAULT_PROCESSOR_POOL);
        }
        //SNAP
        
        CIM_VirtualSystemSettingData[] vssds = new CIM_VirtualSystemSettingData[] { vssd };
        vssdPropertyNames.clear();
        vssdPropertyNames.addAll(getPropertyNames(vssds, virtualSystemType, VMBusinessObject.TYPE_WIZARD));        
        
    }

    /**
     * Invoked if the user doesn't want to use an existing virtual system as template/reference
     * @throws WbemsmtException
     */
    protected void startFromScratch() throws WbemsmtException {
        
        this.vm = null;
    
        /**
         * set the vssd
         */
        vssd = new CIM_VirtualSystemSettingData(getDefaultSettingData(VSSD, virtualSystemType));
        vssd.set_VirtualSystemType(virtualSystemType);
        
        /**
         * init the disks
         */
        disks.clear();
        
        /**
         * init the networks
         */
    
        networks.clear();
        
        /**
         * add memory
         */
        memoryRasd = hostSystem.getDefaultMemory();
        currentMemory = getMemoryAsString(memoryRasd);
        
        /**
         * add processor
         */
        processorRasd = hostSystem.getDefaultProcessor();
        currentProcessor = getProcessorAsString(new CIM_ResourceAllocationSettingData[]{processorRasd});
    
        /**
         * set the names of the vssd properties
         */
        CIM_VirtualSystemSettingData[] vssds = new CIM_VirtualSystemSettingData[] { vssd };
        vssdPropertyNames.clear();
        vssdPropertyNames.addAll(getPropertyNames(vssds, virtualSystemType,VMBusinessObject.TYPE_WIZARD));        
        
    }

    
    
    protected String[] getDiskNames() throws WbemsmtException {
    	if (hostSystem == null ) {
    		hostSystem = adapter.getSelectedHostSystem();
    	}
        List diskPools = hostSystem.getResourcePoolsByResourceType(VMCimAdapter.RESOURCE_TYPE_DISK);
        String[] result = new String[diskPools.size()];
        int i=0;
        for (Iterator iterator = diskPools.iterator(); iterator.hasNext();) {
            CIM_ResourcePool pool = (CIM_ResourcePool) iterator.next();
            result[i++] = pool.get_Caption();
        }
        return result;
    }


    protected String[] getNetworkNames() throws WbemsmtException {
        List networkPools = hostSystem.getResourcePoolsByResourceType(VMCimAdapter.RESOURCE_TYPE_ETHERNET);
        String[] result = new String[networkPools.size()];
        int i=0;
        for (Iterator iterator = networkPools.iterator(); iterator.hasNext();) {
            CIM_ResourcePool pool = (CIM_ResourcePool) iterator.next();
            result[i++] = pool.get_Caption();
        }
        return result;
    }
    
    /**
     * set the header of the rasd tables for disk and network
     * @param properties
     * @param fields
     */
    protected void setRasdHeaderFields(List properties, LabeledBaseHeaderComponentIf[] fields) {
        for (int i=0; i < fields.length; i++)
        {
            
            if (i < properties.size())
            {
                RASDProperty property = (RASDProperty) properties.get(i);
                fields[i].getProperties().setVisible(true);
                fields[i].setLabelText(property.getFieldname());
            }
            else
            {
                fields[i].getProperties().setVisible(false);
                fields[i].setLabelText("");
            }
        }
    }
    
    private LabeledBaseHeaderComponentIf[] getNetworkGenericHeaders(CreateVMSummaryDataContainer container) {
        LabeledBaseHeaderComponentIf[] headers = new LabeledBaseHeaderComponentIf[]
                                                                                {
                container.getNetworksHeader().getNetworksHeader_usr_Field1(),
                container.getNetworksHeader().getNetworksHeader_usr_Field2(),
                container.getNetworksHeader().getNetworksHeader_usr_Field3(),
                container.getNetworksHeader().getNetworksHeader_usr_Field4()
                                                                                };
        return headers;
    }

    private LabeledBaseHeaderComponentIf[] getNetworkGenericHeaders(NetworkDataContainer container) {
        LabeledBaseHeaderComponentIf[] headers = new LabeledBaseHeaderComponentIf[]
                                                                                {
                container.getNetworksHeader().getNetworksHeader_usr_Field1(),
                container.getNetworksHeader().getNetworksHeader_usr_Field2(),
                container.getNetworksHeader().getNetworksHeader_usr_Field3(),
                container.getNetworksHeader().getNetworksHeader_usr_Field4()
                                                                                };
        return headers;
    }

    protected LabeledBaseInputComponentIf[] getNetworkGenericItems(NetworkItemDataContainer child) {
        LabeledBaseInputComponentIf[] components = new LabeledBaseInputComponentIf[]
                                                                                   {
                   child.get_usr_Field1(),
                   child.get_usr_Field2(),
                   child.get_usr_Field3(),
                   child.get_usr_Field4()
                                                                                   };
        return components;
    }    
    
    private LabeledBaseInputComponentIf[] getNetworkGenericItems(SummaryNetworkItemDataContainer child) {
        LabeledBaseInputComponentIf[] components = new LabeledBaseInputComponentIf[]
                                                                                   {
                   child.get_usr_Field1(),
                   child.get_usr_Field2(),
                   child.get_usr_Field3(),
                   child.get_usr_Field4()
                                                                                   };
        return components;
    }

    private LabeledBaseHeaderComponentIf[] getDiskGenericHeaders(DiskDataContainer container) {
        LabeledBaseHeaderComponentIf[] headers = new LabeledBaseHeaderComponentIf[]
                                                                                {
                container.getDisksHeader().getDisksHeader_usr_Field1(),
                container.getDisksHeader().getDisksHeader_usr_Field2(),
                container.getDisksHeader().getDisksHeader_usr_Field3(),
                container.getDisksHeader().getDisksHeader_usr_Field4()
                                                                                };
        return headers;
    }

    private LabeledBaseHeaderComponentIf[] getDiskGenericHeaders(CreateVMSummaryDataContainer container) {
        LabeledBaseHeaderComponentIf[] headers = new LabeledBaseHeaderComponentIf[]
                                                                                {
                container.getDisksHeader().getDisksHeader_usr_Field1(),
                container.getDisksHeader().getDisksHeader_usr_Field2(),
                container.getDisksHeader().getDisksHeader_usr_Field3(),
                container.getDisksHeader().getDisksHeader_usr_Field4()
                                                                                };
        return headers;
    }

    protected LabeledBaseInputComponentIf[] getDiskGenericItems(DiskItemDataContainer child) {
        LabeledBaseInputComponentIf[] components = new LabeledBaseInputComponentIf[]
                                                                                   {
                   child.get_usr_Field1(),
                   child.get_usr_Field2(),
                   child.get_usr_Field3(),
                   child.get_usr_Field4()
                                                                                   };
        return components;
    }

    
    private LabeledBaseInputComponentIf[] getDiskGenericItems(SummaryDiskItemDataContainer child) {
        LabeledBaseInputComponentIf[] components = new LabeledBaseInputComponentIf[]
                                                                                   {
                   child.get_usr_Field1(),
                   child.get_usr_Field2(),
                   child.get_usr_Field3(),
                   child.get_usr_Field4()
                                                                                   };
        return components;
    }
    
    /**
     * generates a Mac Address (example: "00:16:3e:1d:5a:29")
     * @return
     */
    private String generateMacAddress() {
        Random rnd = new Random();
        String[] values = new String[6];
        for (int i = 0; i < values.length; i++) {
            int value = rnd.nextInt(256);
            values[i] = Int2Hex.int2Hex(value);
        }
        
        String result = StringUtil.asString(values, ":");
        return result;
    }

    /**
     * set the rasd fields for disk and network
     * @param properties
     * @param fields
     */
    private void setRasdFields(CIM_ResourceAllocationSettingData rasd, List properties,
            LabeledBaseInputComponentIf[] fields, boolean typeIsGeneric) throws WbemsmtException {
        for (int i=0; i < properties.size() && i < fields.length; i++)
        {
            RASDProperty property = (RASDProperty) properties.get(i);
            CIMInstance instance = rasd.getCimInstance();
            String name = property.getFieldname();
            CIMProperty cimProperty = instance.getProperty(name);
            if (cimProperty != null)
            {
                CIMClass cls = AbstractWbemsmtFcoHelper.getClass(getCimClient(), instance.getClassName(), adapter.getNamespace());
                CIMClassProperty clsProperty = cls.getProperty(name);
                if (typeIsGeneric)
                {
                    if (property.isReadOnly())
                    {
                        fields[i].setControlValue(GenericFieldData.createLabelField(FcoUtil.getValueAsString(instance,name,cls,adapter.getBundle())));
                    }
                    else
                    {
                        fields[i].setControlValue(GenericFieldData.create(cimProperty, cls, clsProperty, adapter.getBundle()));
                    }
                }
                else
                {
                    fields[i].setControlValue(FcoUtil.getValueAsString(instance, name, cls, adapter.getBundle()));
                }
            }
        }
    }

    /**
     * update one item of the vssd
     * @param propertyName
     * @param currentValue
     * @param infoIcon
     * @param readOnly
     */
    private void updateConfigItem(String propertyName,
            LabeledBaseInputComponentIf currentValue, LabeledBaseInputComponentIf infoIcon,
            boolean readOnly) {
        String classNameCurrent = vssd.getCimInstance().getClassName();
    
        CIMClass vssdClass = null;
        CIMClassProperty classProperty = null;
        
        
        try {
            vssdClass = AbstractWbemsmtFcoHelper.getClass(getCimClient(), classNameCurrent, adapter.getNamespace());
            classProperty =  vssdClass.getProperty(propertyName);
        
            if (infoIcon != null)
            {
                String description = (String) classProperty.getQualifierValue("Description");
                if (StringUtils.isNotEmpty(description))
                {
                    infoIcon.setControlValue(new PictureData(PictureData.ICON_INFO, new MemoData(description)));
                }
                else
                {
                    infoIcon.setControlValue(new PictureData(PictureData.ICON_INFO, new MemoData(adapter.getBundle().getString("no.info"))));
                }
            }
        }
        catch (WbemsmtException e) {
            logger.log(Level.SEVERE, "Cannot get Class ", e);
            infoIcon.getProperties().setVisible(false);
        }
        
        CIMProperty property = vssd.getProperty(propertyName);
        
        if (readOnly)
        {
            String value = FcoUtil.getValueAsString(vssd.getCimInstance(), propertyName,vssdClass, adapter.getBundle());
            currentValue.setControlValue( value );
        }
        else
        {
            GenericFieldData fieldData = GenericFieldData.create(property, vssdClass, classProperty, adapter.getBundle());
            currentValue.setControlValue( fieldData );
        }
    }
    
    /**
     * checks min/max memory
     * @param init
     * @param field
     * @param valueInKb
     * @return the valueInKb if the check was or null if the check failed
     * @throws WbemsmtException
     */
    private Long checkMinMaxMemory(MessageList init, LabeledBaseInputComponentIf field, long valueInKb) throws WbemsmtException {
        
        boolean checkPossible = true;
        
        field.setHasErrors(false);
        
        CIM_ResourceAllocationSettingData minMemory = hostSystem.getMinMemory();
        if (minMemory != null)
        {
            if (isAllocationUnitKiloBytes(minMemory))
            {
                Number limit = getVirtualQuantity(minMemory);
                if (limit != null)
                {
                    if (valueInKb < limit.longValue())
                    {
                        init.addMessage(Message.create(VMErrCodes.MSGDEF_MEM_BELOW_MIN, adapter.getBundle(), new Object[]{getQuantityFromKB(valueInKb),getQuantityFromKB(limit.doubleValue())}));
                        field.setHasErrors(true);
                        return null;
                    }
                }
                else
                {
                    logger.warning(CIM_ResourceAllocationSettingData.PROPERTY_VIRTUALQUANTITY.NAME + " of " + minMemory.getCimObjectPath() + " was not set - so no Min check is done");
                    checkPossible = false;
                }
            }
            else
            {
                logger.warning(CIM_ResourceAllocationSettingData.PROPERTY_ALLOCATIONUNITS.NAME + " of " + minMemory.getCimObjectPath() + " was not KiloBytes - so no Min check is done");
                checkPossible = false;
            }
        }
        
        CIM_ResourceAllocationSettingData maxMemory = hostSystem.getMaxMemory();
        if (maxMemory != null)
        {
            if (isAllocationUnitKiloBytes(maxMemory))
            {
                Number limit = getVirtualQuantity(maxMemory);
                if (limit != null)
                {
                    if (valueInKb > limit.longValue())
                    {
                        init.addMessage(Message.create(VMErrCodes.MSGDEF_MEM_ABOVE_MAX, adapter.getBundle(), new Object[]{getQuantityFromKB(valueInKb),getQuantityFromKB(limit.doubleValue())}));
                        field.setHasErrors(true);
                        return null;
                    }
                }
                else
                {
                    logger.warning(CIM_ResourceAllocationSettingData.PROPERTY_VIRTUALQUANTITY.NAME + " of " + maxMemory.getCimObjectPath() + " was not set - so no Max check is done");
                    checkPossible = false;
                }
            }
            else
            {
                logger.warning(CIM_ResourceAllocationSettingData.PROPERTY_ALLOCATIONUNITS.NAME + " of " + maxMemory.getCimObjectPath() + " was not KiloBytes - so no Max check is done");
                checkPossible = false;
            }
        }

        if (!checkPossible)
        {
            init.addMessage(Message.create(VMErrCodes.MSGDEF_MEM_VALIDATION_PROBLEMS, adapter.getBundle()));
            field.setHasErrors(true);
            return null;
        }
        
        return new Long(valueInKb);
    }

    /**
     * checks min/max processors
     * @param init
     * @param field
     * @param value
     * @return the value if the check was or null if the check failed
     * @throws WbemsmtException
     */
    private Long checkMinMaxProcessors(MessageList init, LabeledBaseInputComponentIf field, long value) throws WbemsmtException {
        
        boolean checkPossible = true;
        
        field.setHasErrors(false);
        
        CIM_ResourceAllocationSettingData minProcessor = hostSystem.getMinProcessor();
        if (minProcessor != null)
        {
            Number limit = getVirtualQuantity(minProcessor);
            if (limit != null)
            {
                if (value < limit.longValue())
                {
                    init.addMessage(Message.create(VMErrCodes.MSGDEF_PROC_BELOW_MIN, adapter.getBundle(), new Object[]{""+value,""+limit.longValue()}));
                    field.setHasErrors(true);
                    return null;
                }
            }
            else
            {
                logger.warning(CIM_ResourceAllocationSettingData.PROPERTY_VIRTUALQUANTITY.NAME + " of " + minProcessor.getCimObjectPath() + " was not set - so no Min check is done");
                checkPossible = false;
            }
        }
        
        CIM_ResourceAllocationSettingData maxProcessor = hostSystem.getMaxProcessor();
        if (maxProcessor != null)
        {
            Number limit = getVirtualQuantity(maxProcessor);
            if (limit != null)
            {
            	long maxValue = limit.longValue();
            	if (maxValue < 1) {
            		maxValue = 1;
            		
            	}
                if (value > maxValue)
                {
                    init.addMessage(Message.create(VMErrCodes.MSGDEF_PROC_ABOVE_MAX, adapter.getBundle(), new Object[]{""+value,""+ maxValue}));
                    field.setHasErrors(true);
                    return null;
                }
            }
            else
            {
                logger.warning(CIM_ResourceAllocationSettingData.PROPERTY_VIRTUALQUANTITY.NAME + " of " + maxProcessor.getCimObjectPath() + " was not set - so no Max check is done");
                checkPossible = false;
            }
        }

        if (!checkPossible)
        {
            init.addMessage(Message.create(VMErrCodes.MSGDEF_PROC_VALIDATION_PROBLEMS, adapter.getBundle()));
            field.setHasErrors(true);
            return null;
        }
        
        return new Long(value);
    }
    
    private Long parseLong(MessageList messages, LabeledBaseInputComponentIf field,
            String valueToParse) {
        
        try {
            long l = Long.parseLong(valueToParse);
            field.setHasErrors(false);
            return new Long(l);
        }
        catch (NumberFormatException e) {
            messages.addMessage(Message.create(VMErrCodes.MSGDEF_NO_LONG, adapter.getBundle(), new Object[]{valueToParse}));
            field.setHasErrors(true);
            return null;
        }
        
        
    }
}
