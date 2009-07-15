 /** 
  * HostSystem.java
  *
  * © Copyright IBM Corp. 2008
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
  * Description: TODO Add class description
  * 
  */
package org.sblim.wbemsmt.vm.bl.wrapper.objects;

import java.util.*;
import java.util.logging.Level;

import javax.cim.UnsignedInteger16;
import javax.wbem.client.WBEMClient;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.fielddata.MemoData;
import org.sblim.wbemsmt.bl.fielddata.PictureData;
import org.sblim.wbemsmt.bl.wrapper.preload.PreloadThread;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.vm.bl.adapter.MethodSupport;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.wrapper.list.VMList;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.host.*;
import org.sblim.wbemsmt.vm.container.edit.*;
import org.sblim.wbemsmt.vm.schema.cim_2_17.*;

public class HostSystem extends VMBusinessObject {

    public static final UnsignedInteger16[] POSSIBLE_OPERATIONS = new UnsignedInteger16[]{
        
        CIM_VirtualSystemManagementCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_AddResourcesSupported,
        CIM_VirtualSystemManagementCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DefineSystemSupported,
        CIM_VirtualSystemManagementCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySystemSupported,
        CIM_VirtualSystemManagementCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DestroySystemConfigurationSupported,
        CIM_VirtualSystemManagementCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_ModifyResourceSettingsSupported,
        CIM_VirtualSystemManagementCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_ModifySystemSettingsSupported,
        CIM_VirtualSystemManagementCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_RemoveResourcesSupported,
        CIM_VirtualSystemManagementCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SelectSystemConfigurationSupported,
        CIM_VirtualSystemManagementCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SnapshotSystemSupported
        
    };

    private final CIM_System host;

    private String type;
    private CIM_VirtualSystemManagementCapabilities capabilities;
    private CIM_VirtualSystemMigrationService migrationService;
    private CIM_VirtualSystemManagementService managementService;
    private CIM_VirtualSystemSnapshotService snapshotService;
    private CIM_VirtualSystemMigrationCapabilities migrationCapabilities; 
    private VMList vms;
    private Map capMap = new HashMap();
    private Map resourcePoolsByInstanceid;
    
    private String SUPPORT_NONE = "none";
    private String SUPPORT_ASYNC = "async";
    private String SUPPORT_SYNC = "sync";
    
    private List networks;
    private List disks;

    private Memory memory;

    private Processor processor;

    private HashMap possibleOperations;

    public HostSystem(VMCimAdapter adapter, CIM_System host, String type) {
        super(adapter);
        this.host = host;
        this.vms = new VMList();
        this.type = type;
        
        preload();
        
    }

    private void preload() {
        
        if (!adapter.getPreloadHostSystems())
            return;

        try
        {
            
            WBEMClient client = adapter.getPreloadUsesNewClients() ? adapter.getNewCimClient() : getCimClient();
            
            new PreloadThread(host.get_key_Name(),client)
            {
                public void run() {
                    
                    logger.info("Preloading objects of " + host.getCimObjectPath());

                    preloading = true;
                    try {
                        setCimClient(client);
                        
                        if (!stopPreloading)
                            initResourcePools();
                        if (!stopPreloading)
                            getVirtualSystemSnapshotService();
                        if (!stopPreloading)
                            getVirtualSystemMigrationService();
                        if (!stopPreloading)
                            getVirtualSystemManagementService();
                        if (!stopPreloading)
                            getVirtualSystemManagementCapabilities();
                        if (!stopPreloading)
                            getVirtualSystemMigrationCapabilities();
                        if (!stopPreloading)
                            getCapabilities(CIM_AllocationCapabilities.PROPERTY_RESOURCETYPE.VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Memory);
                        if (!stopPreloading)
                            getCapabilities(CIM_AllocationCapabilities.PROPERTY_RESOURCETYPE.VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Processor);
                        if (!stopPreloading)
                            getProcessor();
                        if (!stopPreloading)
                            getMemory();
                        if (!stopPreloading)
                            getDisks();
                        if (!stopPreloading)
                            getNetworks();
                        if (!stopPreloading)
                            getPossibleOperations();
                        
                        logger.info("Finished preloading objects of " + getCimObjectKey().toString());
                        
                    }
                    catch (WbemsmtException e) {
                        logger.log(Level.SEVERE, "Exception during preload", e);
                    }
                    finally
                    {
                        preloading = false;
                        setCimClient(null);
                    }
                }
            }.start();
            
                
        }
        catch (Exception e) {
            logger.log(Level.SEVERE, "Exception during preload", e);
        }
        finally
        {
            preloading = false;
        }
       
        
    }



    /**
     * Return the type of the VMs for which this host system is responsible
     * @return
     */
    public String getVirtualSystemType() {
        return type;
    }

    /* (non-Javadoc)
     * @see org.sblim.wbemsmt.bl.WbemsmtBusinessObject#getCimObjectKey()
     */
    public CimObjectKey getCimObjectKey() throws WbemsmtException {
        return new CimObjectKey(host) ;
    }

    public CIM_VirtualSystemManagementCapabilities getVirtualSystemManagementCapabilities() throws WbemsmtException {
        if (capabilities == null && stopPreload())
        {
            capabilities = getVirtualSystemManagementCapabilities(host, getCimClient());
        }
        return capabilities;
    }
    
    /**
     * Checks if the Capabilities class allows the action
     * @param supportedMethodIdx must be a valid value {@link CIM_VirtualSystemManagementCapabilities#CIM_VALUEMAP_SYNCHRONOUSMETHODSSUPPORTED}
     * @return true if the method is suported (either async or syncronous)
     * @throws WbemsmtException 
     */
    

    public boolean isManagementCapabilitiesSupportingMethod(javax.cim.UnsignedInteger16 supportedMethodIdx) throws WbemsmtException {
        CIM_VirtualSystemManagementCapabilities capabilities = getVirtualSystemManagementCapabilities();
        MethodSupport methodSupported = VMCimAdapter.isMethodSupported(capabilities, supportedMethodIdx);
        return methodSupported.isSupported();
    }

    /**
     * get the Virtual system migration service
     * 
     * expects that every virtual system is having zero or one MigrationService
     * 
     * @return the service or null if no service was found
     * @throws WbemsmtException
     */
    public CIM_VirtualSystemMigrationService getVirtualSystemMigrationService() throws WbemsmtException
    {
        if (migrationService == null && stopPreload())
        {
            //first get all associated Services
            List services = host.getAssociated_CIM_Service_CIM_HostedServices(getCimClient(), CIM_VirtualSystemMigrationService.CIM_CLASS_NAME,null,null);
            
            for (Iterator iterator2 = services.iterator(); iterator2.hasNext();) {
                migrationService = (CIM_VirtualSystemMigrationService) iterator2.next();
            }
        }
        
        return migrationService;
        
    
    }

    /**
     * Returns the CIM_VirtualSystemMigrationCapabilities of the HostSystem
     * @return
     * @throws WbemsmtException
     */
    public CIM_VirtualSystemMigrationCapabilities getVirtualSystemMigrationCapabilities() throws WbemsmtException {
        
        if (migrationCapabilities == null && stopPreload())
        {
            CIM_VirtualSystemMigrationService service = getVirtualSystemMigrationService();
            if (service !=null)
            {   
                List capabilitiess = service.getAssociated_CIM_Capabilities_CIM_ElementCapabilitiess(getCimClient(), CIM_VirtualSystemMigrationCapabilities.CIM_CLASS_NAME,null,null);
                for (Iterator iterator = capabilitiess.iterator(); iterator.hasNext();) {
                    migrationCapabilities =  (CIM_VirtualSystemMigrationCapabilities) iterator.next();
                    return migrationCapabilities;
                }
                throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"MigrationService " +  service.getCimObjectPath() + " is having no associated instance of class "  + CIM_VirtualSystemMigrationCapabilities.CIM_CLASS_NAME);
            }
        }
        return migrationCapabilities;
        
    }

    
    /**
     * get the Virtual system management service
     * 
     * expects that every virtual system is having zero or one MigrationService
     * 
     * @return the service or null if no service was found
     * @throws WbemsmtException
     */
    public CIM_VirtualSystemManagementService getVirtualSystemManagementService() throws WbemsmtException
    {
        if (managementService == null && stopPreload())
        {
            managementService = getVirtualSystemManagementService(host,getCimClient());
        }
        
        return managementService;
        
    
    }

    public static CIM_VirtualSystemManagementService getVirtualSystemManagementService(CIM_System host, WBEMClient cimClient) throws WbemsmtException {
        //first get all associated Services
        List services = host.getAssociated_CIM_Service_CIM_HostedServices(cimClient, CIM_VirtualSystemManagementService.CIM_CLASS_NAME,null,null);
        
        for (Iterator iterator2 = services.iterator(); iterator2.hasNext();) {
            return (CIM_VirtualSystemManagementService) iterator2.next();
        }
        return null;
    }
    
    /**
     * get the Virtual system snapshot service
     * 
     * expects that every virtual system is having zero or one MigrationService
     * 
     * @return the service or null if no service was found
     * @throws WbemsmtException
     */
    public CIM_VirtualSystemSnapshotService getVirtualSystemSnapshotService() throws WbemsmtException {
        if (snapshotService == null && stopPreload()) {
            //first get all associated Services
            List services = host.getAssociated_CIM_Service_CIM_HostedServices(getCimClient(), CIM_VirtualSystemSnapshotService.CIM_CLASS_NAME,null,null);
            
            for (Iterator iterator2 = services.iterator(); iterator2.hasNext();) {
                snapshotService = (CIM_VirtualSystemSnapshotService) iterator2.next();
            }
        }
        
        return snapshotService;
        
    
    }

    public CIM_System getFco() {
        return host;
    }

    
    public static CIM_System[] getHostSystems(WBEMClient cimClient, String interOpNamespace) throws WbemsmtException {
        List containers = new ArrayList();
        
        CIM_RegisteredProfile[] profiles = VMCimAdapter.getSystemVirtualizationProfiles(cimClient,interOpNamespace);
        for (int i = 0; i < profiles.length; i++) {
            CIM_RegisteredProfile profile = profiles[i];
            List hostList = profile.getAssociated_CIM_ManagedElement_CIM_ElementConformsToProfiles(cimClient,CIM_System.CIM_CLASS_NAME,null,null);
            containers.addAll(hostList);
        }
        
        return (CIM_System[]) containers.toArray(new CIM_System[containers.size()]);
    }


    public VMList getVmList() {
        return vms;
    }

    /**
     * get the CIM_VirtualSystemManagementCapabilities of the host system
     * @param hostSystem
     * @param client
     * @return the Capabilities
     * @throws WbemsmtException 
     */
    public static CIM_VirtualSystemManagementCapabilities getVirtualSystemManagementCapabilities(CIM_System hostSystem, WBEMClient client) throws WbemsmtException {
        List capList = hostSystem.getAssociated_CIM_Capabilities_CIM_ElementCapabilitiess(client, CIM_VirtualSystemManagementCapabilities.CIM_CLASS_NAME,null,null);
        for (Iterator iterator = capList.iterator(); iterator.hasNext();) {
            return (CIM_VirtualSystemManagementCapabilities)iterator.next();
        }
        throw new WbemsmtException(WbemsmtException.ERR_FAILED,"No " + CIM_ElementCapabilities.CIM_CLASS_NAME  + " association from hostSystem " + hostSystem.getCimObjectPath() + " to a " + CIM_VirtualSystemManagementCapabilities.CIM_CLASS_NAME);
    }    


    /**
     * get the Virtual System type of the host system
     * @param hostSystem
     * @param client
     * @return
     * @throws WbemsmtException 
     */
    public static String[] getVirtualSystemTypes(CIM_System hostSystem, WBEMClient client) throws WbemsmtException {
        CIM_VirtualSystemManagementCapabilities virtualSystemManagementCapabilities = getVirtualSystemManagementCapabilities(hostSystem, client);
        if (virtualSystemManagementCapabilities.get_VirtualSystemTypesSupported() == null) {
            logger.warning("Found no VirtualSystemTypesSupported for " + virtualSystemManagementCapabilities.getCimObjectPath());
            
            String classname = virtualSystemManagementCapabilities.getCimInstance().getClassName();
            if (classname.indexOf("_") > -1) {
                String type = classname.substring(0,classname.indexOf("_"));
                return new String[]{type};
            } else {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,"Found no VirtualSystemTypesSupported for " + virtualSystemManagementCapabilities.getCimObjectPath());
            }
        } else {
            return virtualSystemManagementCapabilities.get_VirtualSystemTypesSupported();    
        }
        
    }

    /**
     * return a map which contains as a key the virtualsystem types and as value an instance of CIM_System which is the hostSystem that can manage the virtual system type
     * @param cimClient
     * @param interOpNamespace
     * @return
     * @throws WbemsmtException 
     */
    public static Map getHostSystemsByVirtualSystemType(WBEMClient cimClient, String interOpNamespace) throws WbemsmtException {
        CIM_System[] systems = HostSystem.getHostSystems(cimClient,interOpNamespace);
        
        //check if there is more than one virtualsystemManagementService found for one virtual system type
        Map hostsByType = new HashMap();
        
        for (int i = 0; i < systems.length; i++) {
            CIM_System system = systems[i];
            String[] systemTypes = HostSystem.getVirtualSystemTypes(system, cimClient);
                for (int j = 0; j < systemTypes.length; j++) {
                String type = systemTypes[j];
                if (! hostsByType.containsKey(type))
                {
                    hostsByType.put(type, system);
                }
                else
                {
                    logger.warning("There is already the hostsystem " + ((CIM_System)hostsByType.get(type)).getCimObjectPath() + " found for VirtualSystemType " + type + " HostSystem " + system.getCimObjectPath() + " is not used");
                }
            }
        }
        
        return hostsByType;
    }    
    
    public void updateControls(NetworkHostInfoDataContainer container) throws WbemsmtException {
        
        adapter.updateControls(container.getItems(), getNetworks());
        
    }

    public void updateControls(MemoryHostInfoDataContainer container) throws WbemsmtException {
        
        List list = new ArrayList();
        list.add(getMemory());
        
        adapter.updateControls(container.getItems(), list);
    }

    public void updateControls(DiskHostInfoDataContainer container) throws WbemsmtException {
        adapter.updateControls(container.getItems(), getDisks());
    }    
    
    public void updateControls(ProcessorHostInfoDataContainer container) throws WbemsmtException {

        List list = new ArrayList();
        list.add(getProcessor());
        
        adapter.updateControls(container.getItems(), list);
        
    }

    public void updateControls(HostSystemInfoItemDataContainer container, VM vm) {
        container.get_usr_VMName().setControlValue(vm.getVirtualSystemType() + ":" + vm.getFco().get_ElementName());
        container.get_usr_Info().setControlValue(new MemoData(vm.getState()));
    }

    public void updateControls(HostSystemInfoDataContainer container) throws WbemsmtException {
        
        adapter.updateControls(container.getItems(), getVmList().getList());
        
    }
    

    public CIM_ResourceAllocationSettingData getMinMemory() throws WbemsmtException {
        UnsignedInteger16 resourceType = CIM_AllocationCapabilities.PROPERTY_RESOURCETYPE.VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Memory;
        return getRasd(getCapabilities(resourceType), VMBusinessObject.TYPE_MIN, resourceType,true);
    }

    public CIM_ResourceAllocationSettingData getMaxMemory() throws WbemsmtException {
        UnsignedInteger16 resourceType = CIM_AllocationCapabilities.PROPERTY_RESOURCETYPE.VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Memory;
        return getRasd(getCapabilities(resourceType), VMBusinessObject.TYPE_MAX, resourceType,true);
    }

    public CIM_ResourceAllocationSettingData getDefaultMemory() throws WbemsmtException {
        UnsignedInteger16 resourceType = CIM_AllocationCapabilities.PROPERTY_RESOURCETYPE.VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Memory;
        return getRasd(getCapabilities(resourceType), VMBusinessObject.TYPE_DEFAULT, resourceType,true);
    }

    public CIM_ResourceAllocationSettingData getMinProcessor() throws WbemsmtException {
        UnsignedInteger16 resourceType = CIM_AllocationCapabilities.PROPERTY_RESOURCETYPE.VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Processor;
        return getRasd(getCapabilities(resourceType), VMBusinessObject.TYPE_MIN, resourceType,true);
    }

    public CIM_ResourceAllocationSettingData getMaxProcessor() throws WbemsmtException {
        UnsignedInteger16 resourceType = CIM_AllocationCapabilities.PROPERTY_RESOURCETYPE.VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Processor;
        return getRasd(getCapabilities(resourceType), VMBusinessObject.TYPE_MAX, resourceType,true);
    }

    public CIM_ResourceAllocationSettingData getDefaultProcessor() throws WbemsmtException {
        UnsignedInteger16 resourceType = CIM_AllocationCapabilities.PROPERTY_RESOURCETYPE.VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Processor;
        return getRasd(getCapabilities(resourceType), VMBusinessObject.TYPE_DEFAULT, resourceType,true);
    }

    public CIM_ResourceAllocationSettingData getWeightProcessor() throws WbemsmtException {
        UnsignedInteger16 resourceType = CIM_AllocationCapabilities.PROPERTY_RESOURCETYPE.VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Processor;
        return getRasd(getCapabilities(resourceType), VMBusinessObject.TYPE_WEIGHT, resourceType,true);
    }

    public CIM_ResourceAllocationSettingData getLimitProcessor() throws WbemsmtException {
        UnsignedInteger16 resourceType = CIM_AllocationCapabilities.PROPERTY_RESOURCETYPE.VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Processor;
        return getRasd(getCapabilities(resourceType), VMBusinessObject.TYPE_LIMIT, resourceType,true);
    }

    
    public CIM_AllocationCapabilities getCapabilities(UnsignedInteger16 resourceType) throws WbemsmtException {
        //fist check the cache
        CIM_AllocationCapabilities caps = (CIM_AllocationCapabilities) capMap.get(resourceType);

        //of not found look for it
        if (caps == null && stopPreload())
        {
            //first try to go directly from the host
            
            caps = getCapabilities(host,resourceType);
            
            //if caps is still null try to go via the resource pool
            if (caps == null)
            {
                Collection pools = getResurcePools();
                for (Iterator iterator = pools.iterator(); iterator.hasNext() && caps == null;) {
                    CIM_ResourcePool pool = (CIM_ResourcePool) iterator.next();
                    if (pool.get_ResourceType().intValue() == resourceType.intValue())
                    {
                        caps = getCapabilities(pool,resourceType);
                    }
                }
            }
            if (caps == null)
            {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,"No AllocationCapabilities found for Host " + host.getCimObjectPath() + " and ResourceType " + CIM_ResourcePool.PROPERTY_RESOURCETYPE.getValueEntry(resourceType));
            }
            
            //add it to the cache
            capMap.put(resourceType,caps);
        }
        
        
        return caps;
    }

    /**
     * get a resourcePool with the given InstanceId 
     * association CIM_HostedResourcePools is used to retrieve the Pools of the Host system 
     * @param instanceid
     * @return null if the ResourcePool with the instanceid is not found
     * @throws WbemsmtException if initializing the resource pools failed
     */
    public CIM_ResourcePool getResourcePool(String instanceid) throws WbemsmtException
    {

        if (resourcePoolsByInstanceid == null && stopPreload())
        {
            initResourcePools();
        }
        
        return (CIM_ResourcePool) resourcePoolsByInstanceid.get(instanceid);
        
    }
    
    /**
     * return all resource pools
     * @return
     * @throws WbemsmtException
     */
    public Collection getResurcePools() throws WbemsmtException {
        
        if (resourcePoolsByInstanceid == null && stopPreload())
        {
            initResourcePools();
        }
        
        return resourcePoolsByInstanceid.values();
    }
    
    /**
     * 
     * @param resourceType use one of the RESOURCE constants in VMCimAdapter - if null all resource pools are returned
     * @return
     * @throws WbemsmtException
     */
    public List getResourcePoolsByResourceType(final UnsignedInteger16 resourceType) throws WbemsmtException {
        
        if (resourcePoolsByInstanceid == null && stopPreload())
        {
            initResourcePools();
        }        
        
        List result = new ArrayList();
        result.addAll(resourcePoolsByInstanceid.values());
        
        CollectionUtils.filter(result, new Predicate()
        {

            public boolean evaluate(Object arg0) {
                CIM_ResourcePool pool = (CIM_ResourcePool) arg0;
                return resourceType == null ||
                       pool.get_ResourceType() != null && 
                       pool.get_ResourceType().intValue() == resourceType.intValue();
            }
        });
        
        return result;
        
        
        
    }

    /**
     * Init the Resource Pools
     * @throws WbemsmtException
     */
    private void initResourcePools() throws WbemsmtException {
        resourcePoolsByInstanceid = new HashMap();
        
        List pools = host.getAssociated_CIM_ResourcePool_CIM_HostedResourcePools(getCimClient());
        
        for (Iterator iterator = pools.iterator(); iterator.hasNext();) {
            CIM_ResourcePool pool = (CIM_ResourcePool) iterator.next();
            resourcePoolsByInstanceid.put(pool.get_key_InstanceID(), pool);
        }
    }

    /**
     * Get the Capababilities through the association CIM_ElementCapabilities.<br>
     * Is checking if CIM_ElementCapabilities.Characteristics == 2 == Default and if the Capabilities referenced by the CIM_ElementCapabilities is CIM_AllocationCapabilities
     * @param me
     * @param resourceType
     * @return the Capabilities or null if not found
     * @throws WbemsmtException
     */
    public CIM_AllocationCapabilities getCapabilities(CIM_ManagedElement me, UnsignedInteger16 resourceType) throws WbemsmtException {
        
        CIM_AllocationCapabilities caps = null;
        
        List capList = me.getAssociations_CIM_ElementCapabilities(getCimClient(), false, false, null, null);
        for (Iterator iterator = capList.iterator(); iterator.hasNext() && caps == null;) {
            CIM_ElementCapabilities cap = (CIM_ElementCapabilities) iterator.next();
            UnsignedInteger16[] chars = cap.get_Characteristics();
            boolean found = false;
            
            if (chars == null || chars.length == 0)
            {
                logger.warning("The " + CIM_ElementCapabilities.CIM_CLASS_NAME  + " " + cap.getCimObjectPath() + " contains no " + CIM_ElementCapabilities.PROPERTY_CHARACTERISTICS.NAME);
                found = true;
            }
                
            
            //check all characteristics for a default one
            for (int i = 0; chars != null && i < chars.length && !found; i++) {
                UnsignedInteger16 characteristic = chars[i];
                if (characteristic.intValue() == CIM_ElementCapabilities.PROPERTY_CHARACTERISTICS.VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Default.intValue())
                {
                    found = true;
                }
            }
            
            //check if we have a CIM_AllocationCapabilities
            if (found)
            {
                CIM_Capabilities cap1 = cap.get_Capabilities_CIM_Capabilities(getCimClient());
                if (cap1 instanceof CIM_AllocationCapabilities && ((CIM_AllocationCapabilities)cap1).get_ResourceType().intValue() == resourceType.intValue())
                {
                    caps = (CIM_AllocationCapabilities) cap1;
                }
            }
        }
        
        return caps;
    }

    public Memory getMemory() throws WbemsmtException
    {
        if (memory == null && stopPreload())
        {
            memory = new Memory();
            
            CIM_ResourceAllocationSettingData sdMin = getMinMemory();
            CIM_ResourceAllocationSettingData sdMax = getMaxMemory();
            CIM_ResourceAllocationSettingData sdDefault = getDefaultMemory();
            
            memory.setDefaultValue(getMemoryAsString(sdDefault));
            memory.setMin(getMemoryAsString(sdMin));
            memory.setMax(getMemoryAsString(sdMax));
        }
        return memory;
    }
    
    public Processor getProcessor() throws WbemsmtException {
        
    	if (processor == null && stopPreload()) {
    		processor = new Processor();
            
            CIM_ResourceAllocationSettingData sdMin = getMinProcessor();
            CIM_ResourceAllocationSettingData sdMax = getMaxProcessor();
            CIM_ResourceAllocationSettingData sdDefault = getDefaultProcessor();
            CIM_ResourceAllocationSettingData sdWeight = getWeightProcessor();
            CIM_ResourceAllocationSettingData sdLimit = getLimitProcessor();
            
            processor.setDefaultValue(getMemoryAsString(sdDefault));
            processor.setMin(getMemoryAsString(sdMin));
            processor.setMax(getMemoryAsString(sdMax));
            processor.setWeight(sdDefault.get_Weight ()!=null ? sdDefault.get_Weight ().toString ():"");
            processor.setLimit(sdDefault.get_Limit ()!=null ? sdDefault.get_Limit ().toString ():"");
//            processor.setWeight ( getMemoryAsString(sdWeight) );
//            processor.setLimit ( getMemoryAsString(sdLimit) );
        }
        return processor;
    }

    public List getNetworks() throws WbemsmtException {
        if (networks == null && stopPreload())
        {
            networks = new ArrayList();
            
            Collection c = getResourcePoolsByResourceType(VMCimAdapter.RESOURCE_TYPE_ETHERNET);
            for (Iterator iterator = c.iterator(); iterator.hasNext();) {
                CIM_ResourcePool pool = (CIM_ResourcePool) iterator.next();
                List components = pool.getAssociated_CIM_ManagedElement_CIM_Components(getCimClient(), CIM_NetworkAdapter.CIM_CLASS_NAME, null,null);
                for (Iterator iterator2 = components.iterator(); iterator2.hasNext();) {
                    CIM_NetworkAdapter fco = (CIM_NetworkAdapter) iterator2.next();
                    Network network = new Network();
                    network.setNetwork(fco.get_key_DeviceID());
                    network.setPool(pool.get_Caption() != null ? pool.get_Caption() : "");
                    networks.add(network);
                }
            }
            
        }
        return networks;
    }

    /**
     * get all Disks
     * @return
     * @throws WbemsmtException
     */
    public List getDisks() throws WbemsmtException {
        if (disks == null && stopPreload())
        {
            disks = new ArrayList();
            
            Collection c = getResourcePoolsByResourceType(VMCimAdapter.RESOURCE_TYPE_DISK);
            for (Iterator iterator = c.iterator(); iterator.hasNext();) {
                CIM_ResourcePool pool = (CIM_ResourcePool) iterator.next();
                List components = pool.getAssociated_CIM_ManagedElement_CIM_Components(getCimClient(), CIM_DiskDrive.CIM_CLASS_NAME, null,null);
                for (Iterator iterator2 = components.iterator(); iterator2.hasNext();) {
                    CIM_DiskDrive diskFco = (CIM_DiskDrive) iterator2.next();
                    Disk disk = new Disk();
                    disk.setDisk(diskFco.get_key_DeviceID());
                    disk.setPool(pool.get_Caption() != null ? pool.get_Caption() : "");
                    disks.add(disk);
                    
                }
            }
        }
        return disks;
    }

    public void updateControls(NetworkHostInfoItemDataContainer container, Network fco) {
        container.get_usr_Network().setControlValue(fco.getNetwork());
        container.get_usr_Pool().setControlValue(fco.getPool());
    }

    public void updateControls(ProcessorHostInfoItemDataContainer container, Processor fco) {
        container.get_usr_DefaultValue().setControlValue(processor.getDefaultValue());
        container.get_usr_Min().setControlValue(processor.getMin());
        container.get_usr_Max().setControlValue(processor.getMax());
    }

    public void updateControls(DiskHostInfoItemDataContainer container, Disk fco) {
        container.get_usr_Disk().setControlValue(fco.getDisk());
        container.get_usr_Pool().setControlValue(fco.getPool());
    }

    public void updateControls(MemoryHostInfoItemDataContainer container, Memory fco) {
        container.get_usr_DefaultValue().setControlValue(memory.getDefaultValue());
        container.get_usr_Min().setControlValue(memory.getMin());
        container.get_usr_Max().setControlValue(memory.getMax());
    }

    public void updateControls(PossibleOperationsDataContainer container) throws WbemsmtException {

        adapter.updateControls(container.getItems(), getPossibleOperationsAsList());
        
    }

    private List getPossibleOperationsAsList() throws WbemsmtException {
        List result = new ArrayList();
        result.addAll(getPossibleOperations().values());
        
       Collections.sort(result, new PossibleOperationComparator());
        
        return result;
    }

    /**
     * Get the the pool which is referenced by the rasd
     * @param rasd
     * @return null if the pool was not found, the RASD define no poolId or the caption of the Pool is not set (in that cases the app is logging a warning)
     * @throws WbemsmtException
     */
    public CIM_ResourcePool getReferencedPool(CIM_ResourceAllocationSettingData rasd)
            throws WbemsmtException {
        
        if (rasd.get_PoolID() != null)
        {
            CIM_ResourcePool pool = getResourcePool(rasd.get_PoolID());
            if (pool != null)
            {
                return pool;
            }
            else
            {
                logger.warning("No pool found for poolid " + rasd.get_PoolID() + " which is defined in RASD " + rasd.getCimObjectPath());
            }
        }
        else
        {
            logger.warning("RASD " + rasd.getCimObjectPath() + " is having no PoolId.");
        }
        
        return null;
    }      
    
    public void updateControls(PossibleOperationsItemDataContainer container, PossibleOperation fco) {
        
        container.get_usr_Operation().setControlValue(fco.getName());
        
        if (fco.getSupport() == SUPPORT_NONE)
        {
            container.get_usr_Supported().setControlValue(new PictureData(PictureData.ICON_EMPTY));
            container.get_usr_Type().setControlValue("");
        }
        else
        {
            container.get_usr_Supported().setControlValue(new PictureData(PictureData.ICON_SUPPORTED));
            if (fco.getSupport() == SUPPORT_ASYNC)
            {
                container.get_usr_Type().setControlValue(adapter.getBundle().getString("async"));
            }
            else if (fco.getSupport() == SUPPORT_SYNC)
            {
                container.get_usr_Type().setControlValue(adapter.getBundle().getString("sync"));
            }
        }
        
        
        
    }

    private Map getPossibleOperations() throws WbemsmtException {
        
        if (possibleOperations == null && stopPreload())
        {
            possibleOperations = new HashMap();
            
            CIM_VirtualSystemManagementCapabilities caps = getVirtualSystemManagementCapabilities();
            UnsignedInteger16[] asynchronousMethodsSupported = caps.get_AsynchronousMethodsSupported();
            UnsignedInteger16[] synchronousMethodsSupported = caps.get_SynchronousMethodsSupported();
         
            for (int i=0; i < POSSIBLE_OPERATIONS.length ; i++)
            {
                PossibleOperation op = new PossibleOperation();
                op.setIdx(POSSIBLE_OPERATIONS[i].intValue());
                op.setName(CIM_VirtualSystemManagementCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.getValueEntry(POSSIBLE_OPERATIONS[i]));
                op.setSupport(SUPPORT_NONE);
                
                possibleOperations.put(""+i, op);
                
                boolean found = false;
                
                for (int j = 0; !found && asynchronousMethodsSupported != null && j < asynchronousMethodsSupported.length; j++) {
                    UnsignedInteger16 method = asynchronousMethodsSupported[j];
                    found = method.intValue() == POSSIBLE_OPERATIONS[i].intValue();
                }
                if (found)
                {
                    op.setSupport(SUPPORT_ASYNC);
                } else {
                    for (int j = 0; !found && synchronousMethodsSupported != null && j < synchronousMethodsSupported.length; j++) {
                        UnsignedInteger16 method = synchronousMethodsSupported[j];
                        found = method.intValue() == POSSIBLE_OPERATIONS[i].intValue();
                    }
                    if (found)
                    {
                        op.setSupport(SUPPORT_SYNC);
                    }

                }
            }
        }
        
        return possibleOperations;
    }
    

}
