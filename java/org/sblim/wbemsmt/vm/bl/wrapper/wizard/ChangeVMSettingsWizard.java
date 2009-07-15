 /** 
  * ChangeVMSettingsWizard.java
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
  * Description: Wizard to change settings of a vm (including vssd and rasds)
  * 
  */
package org.sblim.wbemsmt.vm.bl.wrapper.wizard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageDefinition;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.vm.VMErrCodes;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VM;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VMBusinessObject;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.Disk;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.Network;
import org.sblim.wbemsmt.vm.container.wizard.ChangeVMSettingsSummaryDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.ConfigItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DiskDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DiskItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.MemoryDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.NetworkDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.NetworkItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.ProcessorDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.VMConfigDataContainer;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ConcreteJob;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ResourceAllocationSettingData;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemManagementCapabilities;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemManagementService;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemSettingData;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemManagementService.AddResourceSettingsResult;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemManagementService.ModifyResourceSettingsResult;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemManagementService.ModifySystemSettingsResult;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemManagementService.RemoveResourceSettingsResult;

public class ChangeVMSettingsWizard extends VMWizard {

    private boolean addResourceSupported;
    private boolean removeResourceSupported;
    private boolean modifySettingsSupported;
    private boolean modifyResourceSupported;
    private ArrayList networksAtStart;
    private ArrayList disksAtStart;
    private String processorAtStart,processorWeightAtStart,processorLimitAtStart;
    private String memoryAtStart;


    public ChangeVMSettingsWizard(VMCimAdapter adapter) {
        super(adapter);
    }

    public void create(ChangeVMSettingsSummaryDataContainer container) throws WbemsmtException {
        
        
        List toAdd = new ArrayList();
        List toModify = new ArrayList();
        List toDelete = new ArrayList();
        sortResourcesByState(toAdd, toModify, toDelete);
        
        modifySettings(container);
        removeResources(container, toDelete);
        modifyResources(container, toModify);
        addResources(container, toAdd);
        
        if (vssd.isModified() || toDelete.size() > 0 || toAdd.size() > 0 || toModify.size() > 0){
        	vm.reload();
        	
        	//Making the LastKeySelected null forces it to reload so that it can initialize
        	//the SelectionHierarchy
        	//adapter.setLastKeySelect(null);
        	adapter.setPathOfTreeNode(vm.getCimObjectPath());
        }
        adapter.setActiveWizard(null);
    }
    
    private void modifySettings(ChangeVMSettingsSummaryDataContainer container)
            throws WbemsmtException {
        CIM_VirtualSystemManagementService service = hostSystem.getVirtualSystemManagementService();

        MessageList messageList = MessageList.init(container);
        String unknown = adapter.getBundle().getString("unknown");

        if (modifySettingsSupported && vssd.isModified()) {

            try {
                ModifySystemSettingsResult result = service.invoke_ModifySystemSettings(
                        adapter.getCimClient(),
                        vssd);

                if (result.getResultObject().intValue() == CIM_VirtualSystemManagementService.METHOD_MODIFYSYSTEMSETTINGS.VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error
                        .intValue()) {
                    // everything okay
                    adapter.setMarkedForReload();
                }
                else if (result.getResultObject().intValue() == CIM_VirtualSystemManagementService.METHOD_MODIFYSYSTEMSETTINGS.VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started
                        .intValue()) {
                    CIM_ConcreteJob job = result.get_Job();
                    boolean ok = waitForJob(messageList, job);
                    if (ok) {
                        adapter.setMarkedForReload();
                    }
                    else {
                        addMessage(messageList, VMErrCodes.MSGDEF_MOD_SET_FAILED, vssd, job,unknown);
                    }
                }
                else {
                    addMessage(messageList, VMErrCodes.MSGDEF_MOD_SET_FAILED, vssd, null,unknown);
                }

            }
            catch (WbemsmtException e) {
                ExceptionUtil.handleException(e);
            }
        }
    }
    

    private void removeResources(ChangeVMSettingsSummaryDataContainer container, List toDelete)
            throws WbemsmtException {
        CIM_VirtualSystemManagementService service = hostSystem.getVirtualSystemManagementService();

        MessageList messageList = MessageList.init(container);
        String unknown = adapter.getBundle().getString("unknown");
        
        
        
        if (removeResourceSupported)
        {
            
            for (Iterator iterator = toDelete.iterator(); iterator.hasNext();) {
                try {
                    CIM_ResourceAllocationSettingData rasd = (CIM_ResourceAllocationSettingData) iterator.next();
                    RemoveResourceSettingsResult result = service.invoke_RemoveResourceSettings(adapter.getCimClient(), new CIM_ResourceAllocationSettingData[]{rasd});
                    
                    if (result.getResultObject().intValue() == CIM_VirtualSystemManagementService.METHOD_REMOVERESOURCESETTINGS.VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error.intValue())
                    {
                        //everything okay
                        adapter.setMarkedForReload();
                    }
                    else if (result.getResultObject().intValue() == CIM_VirtualSystemManagementService.METHOD_REMOVERESOURCESETTINGS.VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started.intValue())
                    {
                        CIM_ConcreteJob job = result.get_Job();
                        boolean ok = waitForJob(messageList, job);
                        if (ok)
                        {
                            adapter.setMarkedForReload();
                        }
                        else
                        {
                            addMessage(messageList,VMErrCodes.MSGDEF_REM_RES_FAILED,rasd,job,unknown);
                        }
                    }
                    else
                    {
                        addMessage(messageList,VMErrCodes.MSGDEF_REM_RES_FAILED,rasd,null,unknown);
                    }
                    
                }
                catch (WbemsmtException e) {
                    ExceptionUtil.handleException(e);
                }
            }
        }
    }

    private void modifyResources(ChangeVMSettingsSummaryDataContainer container, List toModify)
            throws WbemsmtException {
        CIM_VirtualSystemManagementService service = hostSystem.getVirtualSystemManagementService();

        MessageList messageList = MessageList.init(container);
        String unknown = adapter.getBundle().getString("unknown");

        if (modifyResourceSupported) {

            for (Iterator iterator = toModify.iterator(); iterator.hasNext();) {
                try {
                    CIM_ResourceAllocationSettingData rasd = (CIM_ResourceAllocationSettingData) iterator.next();
                    ModifyResourceSettingsResult result = service.invoke_ModifyResourceSettings(
                            adapter.getCimClient(),
                            new CIM_ResourceAllocationSettingData[] { rasd });

                    if (result.getResultObject().intValue() == CIM_VirtualSystemManagementService.METHOD_MODIFYRESOURCESETTINGS.VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error.intValue()) {
                        // everything okay
                        adapter.setMarkedForReload();
                    }
                    else if (result.getResultObject().intValue() == CIM_VirtualSystemManagementService.METHOD_MODIFYRESOURCESETTINGS.VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started.intValue()) {
                        CIM_ConcreteJob job = result.get_Job();
                        boolean ok = waitForJob(messageList, job);
                        if (ok) {
                            adapter.setMarkedForReload();
                        }
                        else {
                            addMessage(messageList, VMErrCodes.MSGDEF_MOD_RES_FAILED, rasd, job,unknown);
                        }
                    }
                    else {
                        addMessage(messageList, VMErrCodes.MSGDEF_MOD_RES_FAILED, rasd, null,unknown);
                    }

                }
                catch (WbemsmtException e) {
                    ExceptionUtil.handleException(e);
                }
            }
        }
    }
    
    private void addResources(ChangeVMSettingsSummaryDataContainer container, List toAdd)
            throws WbemsmtException {
        CIM_VirtualSystemManagementService service = hostSystem.getVirtualSystemManagementService();

        MessageList messageList = MessageList.init(container);
        String unknown = adapter.getBundle().getString("unknown");

        if (addResourceSupported) {

            for (Iterator iterator = toAdd.iterator(); iterator.hasNext();) {
                try {
                    CIM_ResourceAllocationSettingData rasd = (CIM_ResourceAllocationSettingData) iterator.next();
                    AddResourceSettingsResult result = service.invoke_AddResourceSettings(
                            adapter.getCimClient(),
                            vm.getCurrentSettingData(),
                            new CIM_ResourceAllocationSettingData[] { rasd });

                    if (result.getResultObject().intValue() == CIM_VirtualSystemManagementService.METHOD_ADDRESOURCESETTINGS.VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error.intValue()) {
                        // everything okay
                        adapter.setMarkedForReload();
                    }
                    else if (result.getResultObject().intValue() == CIM_VirtualSystemManagementService.METHOD_ADDRESOURCESETTINGS.VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started.intValue()) {
                        CIM_ConcreteJob job = result.get_Job();
                        boolean ok = waitForJob(messageList, job);
                        if (ok) {
                            adapter.setMarkedForReload();
                        }
                        else {
                            addMessage(messageList, VMErrCodes.MSGDEF_ADD_RES_FAILED, rasd, job,unknown);
                        }
                    }
                    else {
                        addMessage(messageList, VMErrCodes.MSGDEF_ADD_RES_FAILED, rasd, null,unknown);
                    }

                }
                catch (WbemsmtException e) {
                    ExceptionUtil.handleException(e);
                }
            }
        }
    }
    
    protected void setVM(VM vm) throws WbemsmtException {

        this.vm = vm;
    
        // set the vssd
        vssd = vm.getCurrentSettingData();
                
        CIM_VirtualSystemSettingData[] vssds = new CIM_VirtualSystemSettingData[] { vssd };
        vssdPropertyNames.clear();
        vssdPropertyNames.addAll(getPropertyNames(vssds, virtualSystemType, VMBusinessObject.TYPE_WIZARD));        
        
        // add disks
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
        
        // Get networks
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
        
        // add memory
        currentMemory = vm.getMemory().getCurrent();
        if (StringUtils.isEmpty(currentMemory)) {
            currentMemory = vm.getMemory().getDefaultValue();
        }

    	//TODO: Fix this method to load resources from VSSD using the 
    	//CIM_VirtualSystemSettingDataComponent association to identify correct RASDS 
        memoryRasd = vm.getMemory().getRasd();
        if (memoryRasd == null) {
            memoryRasd = new CIM_ResourceAllocationSettingData(getDefaultSettingData(RASD_MEMORY, virtualSystemType) );
            memoryRasd.set_ResourceType(VMCimAdapter.RESOURCE_TYPE_MEMORY);
            memoryRasd.set_AllocationUnits("KiloBytes");
        }
        
        //add processor
        currentProcessor = vm.getProcessor().getCurrent();
        if (StringUtils.isEmpty(currentProcessor) || currentProcessor.equals( "-1" )) {
            currentProcessor = vm.getProcessor().getDefaultValue();
        }
        
        processorRasd = vm.getProcessor().getRasd();
        if (processorRasd == null) {
            processorRasd = hostSystem.getDefaultProcessor();
            processorRasd.set_ResourceType(VMCimAdapter.RESOURCE_TYPE_CPU);
        }
     
    }

    
    
    
    private void addMessage(MessageList messageList, MessageDefinition msgDef,
            AbstractWbemsmtFco rasd, CIM_ConcreteJob job, String unknown) {

        String errorDesc = job != null && job.get_ErrorDescription() != null ? job.get_ErrorDescription() : unknown;
        
        Message msg = Message.create(msgDef, 
                adapter.getBundle(),
                new Object[]{ rasd.getCimObjectPath().toString(),  errorDesc });
        
        logger.severe(msg.getMessageString());
        
    }

    private void sortResourcesByState(List toAdd, List toModify, List toDelete) {
        //find the resources to delete
        List list = disksAtStart;
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Disk disk = (Disk) iterator.next();
            if (disk.isDeleted())
            {
                toDelete.add(disk.getRasd());
            }
        }
        list = networksAtStart;
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Network network = (Network) iterator.next();
            if (network.isDeleted())
            {
                toDelete.add(network.getRasd());
            }
        }
        
        //find resources to add or those that are modified
        list = getDisks();
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Disk disk = (Disk) iterator.next();
            if (disk.isAdded())
            {
            	String vmName = adapter.getSelectedVM().getHostedSystem().get_Name();
            	String instance = null;
            	if (this.virtualSystemType.equalsIgnoreCase("LXC")){
                	instance = vmName + '/' + disk.getRasd().getCimInstance().getProperty(VM.MOUNT_POINT).getValue();
                } else{
                	instance = vmName + '/' + disk.getRasd().getCimInstance().getProperty(VM.VIRTUAL_DEVICE).getValue();
                }
            	disk.getRasd().set_key_InstanceID(instance);
                toAdd.add(disk.getRasd());
            }
            else if (disk.getRasd().isModified())
            {
                toModify.add(disk.getRasd());
            }
        }
        
        list = getNetworks();
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Network network = (Network) iterator.next();
            if (network.isAdded())
            {
            	String vmName = adapter.getSelectedVM().getHostedSystem().get_Name();
            	String instance = vmName + '/' + network.getRasd().get_Address();
            	network.getRasd().set_key_InstanceID(instance);
                toAdd.add(network.getRasd());
            }
            else if (network.getRasd().isModified())
            {
                toModify.add(network.getRasd());
            }
        }
        
        if (!processorAtStart.equalsIgnoreCase(currentProcessor) || !processorWeightAtStart.equalsIgnoreCase(processorRasd.get_Weight ().toString ()) || !processorLimitAtStart.equalsIgnoreCase(processorRasd.get_Limit ().toString ()))
        {
            toModify.add(processorRasd);
        }
        
        if (!memoryAtStart.equalsIgnoreCase(currentMemory))
        {
            toModify.add(memoryRasd);
        }
    }

    public void init(VMConfigDataContainer container) throws WbemsmtException {
        super.init();
        this.hostSystem = adapter.getSelectedHostSystem();
        
        addResourceSupported = hostSystem.isManagementCapabilitiesSupportingMethod(CIM_VirtualSystemManagementCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_AddResourcesSupported);
        modifyResourceSupported = hostSystem.isManagementCapabilitiesSupportingMethod(CIM_VirtualSystemManagementCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_ModifyResourceSettingsSupported);
        removeResourceSupported = hostSystem.isManagementCapabilitiesSupportingMethod(CIM_VirtualSystemManagementCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_RemoveResourcesSupported);
        modifySettingsSupported = hostSystem.isManagementCapabilitiesSupportingMethod(CIM_VirtualSystemManagementCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_ModifySystemSettingsSupported);

        if (!addResourceSupported
            && !modifyResourceSupported
            && !removeResourceSupported
            && !modifySettingsSupported
        )
        {
            MessageList.init(container).addMessage(Message.create(VMErrCodes.MSGDEF_CHANGE_RES_NOT_POSSIBLE_CAPABILITIES, adapter.getBundle()));
            return;
        }
            
        if (!addResourceSupported)
        {
            MessageList.init(container).addMessage(Message.create(VMErrCodes.MSGDEF_ADD_RES_NOT_POSSIBLE_CAPABILITIES, adapter.getBundle()));
        }

        if (!modifyResourceSupported)
        {
            MessageList.init(container).addMessage(Message.create(VMErrCodes.MSGDEF_MOD_RES_NOT_POSSIBLE_CAPABILITIES, adapter.getBundle()));
        }
        
        if (!removeResourceSupported)
        {
            MessageList.init(container).addMessage(Message.create(VMErrCodes.MSGDEF_REM_RES_NOT_POSSIBLE_CAPABILITIES, adapter.getBundle()));
        }

        if (!modifySettingsSupported)
        {
            MessageList.init(container).addMessage(Message.create(VMErrCodes.MSGDEF_MOD_SET_NOT_POSSIBLE_CAPABILITIES, adapter.getBundle()));
        }

        this.virtualSystemType = hostSystem.getVirtualSystemType();
        setVM(adapter.getSelectedVM());
        
        disksAtStart = new ArrayList();
        disksAtStart.addAll(getDisks());
        
        networksAtStart = new ArrayList();
        networksAtStart.addAll(getNetworks());
        
        memoryAtStart = currentMemory;
        processorAtStart = currentProcessor;
        processorWeightAtStart = processorRasd.get_Weight ().toString ();
        processorLimitAtStart = processorRasd.get_Limit ().toString ();
    }


    
    
    public void updateControls(ConfigItemDataContainer container, String propertyName) {
        super.updateControls(container, propertyName);
        container.get_usr_CurrentValue().getProperties().setReadOnly(!modifySettingsSupported);
    }

    public void updateControls(MemoryDataContainer container) throws WbemsmtException {
        super.updateControls(container);
//        container.get_usr_Size().getProperties().setReadOnly(!modifyResourceSupported || !addResourceSupported);
        container.get_usr_Size().getProperties().setReadOnly(true);
    }

    public void updateControls(ProcessorDataContainer container) throws WbemsmtException {
        super.updateControls(container);
        container.get_usr_Amount().getProperties().setReadOnly(!modifyResourceSupported || !addResourceSupported);
//        container.get_usr_Amount().getProperties().setReadOnly(true);
    }

    
    
    public void updateControls(DiskDataContainer container) throws WbemsmtException {
        super.updateControls(container);
        container.get_usr_Add().getProperties().setReadOnly(!addResourceSupported);
        container.get_usr_Remove().getProperties().setReadOnly(!removeResourceSupported);
        
    }

    public void updateControls(DiskItemDataContainer container, Disk disk) throws WbemsmtException {
        super.updateControls(container, disk);
        setReadOnlyState(getDiskGenericItems(container));
    }

    public void updateControls(NetworkDataContainer container) throws WbemsmtException {
        super.updateControls(container);
        container.get_usr_Add().getProperties().setReadOnly(!addResourceSupported);
        container.get_usr_Remove().getProperties().setReadOnly(!removeResourceSupported);
    }

    public void updateControls(NetworkItemDataContainer container, Network network)
            throws WbemsmtException {
        super.updateControls(container, network);
        setReadOnlyState(getNetworkGenericItems(container));
    }

    public void updateControls(ChangeVMSettingsSummaryDataContainer container) throws WbemsmtException {
        
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
    
    private LabeledBaseHeaderComponentIf[] getDiskGenericHeaders(ChangeVMSettingsSummaryDataContainer container) {
        LabeledBaseHeaderComponentIf[] headers = new LabeledBaseHeaderComponentIf[]
                                                                                {
                container.getDisksHeader().getDisksHeader_usr_Field1(),
                container.getDisksHeader().getDisksHeader_usr_Field2(),
                container.getDisksHeader().getDisksHeader_usr_Field3(),
                container.getDisksHeader().getDisksHeader_usr_Field4()
                                                                                };
        return headers;
    }
    
    
    private LabeledBaseHeaderComponentIf[] getNetworkGenericHeaders(ChangeVMSettingsSummaryDataContainer container) {
        LabeledBaseHeaderComponentIf[] headers = new LabeledBaseHeaderComponentIf[]
                                                                                {
                container.getNetworksHeader().getNetworksHeader_usr_Field1(),
                container.getNetworksHeader().getNetworksHeader_usr_Field2(),
                container.getNetworksHeader().getNetworksHeader_usr_Field3(),
                container.getNetworksHeader().getNetworksHeader_usr_Field4()
                                                                                };
        return headers;
    }

    /**
     * Set the readonly state of all field
     * the fields are read only if the modification of resources is not allowed
     * @param fields
     */
    private void setReadOnlyState(LabeledBaseInputComponentIf[] fields) {
        
        for (int i = 0; i < fields.length; i++) {
            LabeledBaseInputComponentIf field = fields[i];
            field.getProperties().setReadOnly(!modifyResourceSupported);
        }
        
    }
    
    

}
