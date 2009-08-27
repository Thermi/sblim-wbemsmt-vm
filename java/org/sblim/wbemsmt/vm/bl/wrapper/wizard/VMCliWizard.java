 /** 
  * VMCliWizard.java
  *
  * © Copyright IBM Corp.  2009,2008
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: TODO Add class description
  * 
  */
package org.sblim.wbemsmt.vm.bl.wrapper.wizard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.cim.CIMClass;
import javax.cim.CIMClassProperty;
import javax.cim.CIMInstance;
import javax.cim.CIMProperty;
import javax.cim.UnsignedInteger16;
import javax.cim.UnsignedInteger64;

import org.apache.commons.lang.StringUtils;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFcoHelper;
import org.sblim.wbemsmt.bl.fco.FcoUtil;
import org.sblim.wbemsmt.bl.fielddata.GenericFieldData;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.bl.userdataconfig.UserDataConfiguration;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tasklauncher.userdataconfig.UserdataDocument;
import org.sblim.wbemsmt.tasklauncher.userdataconfig.EntryDocument.Entry;
import org.sblim.wbemsmt.tasklauncher.userdataconfig.UserdataDocument.Userdata;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.wrapper.list.VMList;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.HostSystem;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VM;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VMBusinessObject;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.Disk;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.Network;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.RASDContainer;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.RASDProperty;
import org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryConfigItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ResourceAllocationSettingData;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ResourcePool;

/**
 * Stores the user data in a xml file with the following structure:
 * 
 * type
 * name of the vm
 * memory
 *  size
 * processor
 *  amount
 * disk number
 *  wbemsmt-poolid pool.instanceID
 *  wbemsmt-path rasd.objectPath
 *  field1 value
 *  field2 value
 * network number
 *  wbemsmt-poolid pool.instanceID
 *  wbemsmt-path rasd.objectPath
 *  field1 value
 *  field2 value
 * vssd
 *  field1 value
 *  field2 value    
 */
public class VMCliWizard extends VMWizard {

    private static final String CLI_VSSD = "vssd";
    private static final String CLI_PROCESSOR_RASD = "processor";
    private static final String CLI_MEMORY_RASD = "memory";
    private static final String CLI_WBEMSMT_PATH = "wbemsmt-path";
    private static final String CLI_WBEMSMT_POOLID = "wbemsmt-poolid";
    private static final String CLI_DISK = "disk";
    private static final String CLI_NETWORK = "network";
    private static final String CLI_SIZE = "size";
    private static final String CLI_AMOUNT = "amount";
    private static final String CLI_VM = "vm";
    private static final String CLI_TYPE = "type";
    private static final String CLI_USERDEFINED = "userdefined";
    private static final boolean PRETTY = true;
    
    private UserDataConfiguration cliWizardConfig;
    private boolean execute;
    private String[] referencableSystems;
    private List<String> configValues;
    
    public VMCliWizard(VMCimAdapter adapter) {
        super(adapter);
    }

    private void init(Userdata userdata) throws WbemsmtException {
        
        Entry entryType = cliWizardConfig.findEntry(userdata, CLI_TYPE, null);
        Entry entryName = cliWizardConfig.findEntry(userdata, CLI_VM, null);
        if (entryName != null && entryName != null)
        {
            String type = entryType.getValue();
            String name = entryName.getValue();
            
            if (name.equals(CLI_USERDEFINED))
            {
                startFromScratch();
            }
            else
            {
                hostSystem = adapter.getHostSystems().getHostedSystemByType(type);
                virtualSystemType = hostSystem.getVirtualSystemType();
                setVM(hostSystem.getVmList().getVmByName(name));
            }
        }
    }

    private void addDisk(Userdata userdata, Disk disk, CIM_ResourcePool pool) throws WbemsmtException {
        
        getDisks().add(disk);
        
        Entry entry = cliWizardConfig.addEntry(userdata, CLI_DISK,  "" + getFreeId(userdata,CLI_DISK, ""));
        cliWizardConfig.addEntry(entry, CLI_WBEMSMT_POOLID, pool.get_key_InstanceID());
        
        List<RASDProperty> properties = getRASDProperties(sampleDiskRasd, RASD_DISK, virtualSystemType);
        for (Iterator<RASDProperty> iterator = properties.iterator(); iterator.hasNext();) {
            RASDProperty property = (RASDProperty) iterator.next();
            String propertyName = property.getFieldname();
            CIMInstance instance = disk.getRasd().getCimInstance();
            CIMClass cls = AbstractWbemsmtFcoHelper.getClass(adapter.getCimClient(), instance.getClassName(), adapter.getNamespace());
            cliWizardConfig.addEntry(entry, propertyName, FcoUtil.getValueAsString(instance , propertyName, cls , adapter.getBundle()));
        }
        
    }

    private void addNetwork(Userdata userdata, Network network, CIM_ResourcePool pool) throws WbemsmtException {
        
        getNetworks().add(network);
        
        Entry entry = cliWizardConfig.addEntry(userdata, CLI_NETWORK,  "" + getFreeId(userdata,CLI_NETWORK, ""));
        cliWizardConfig.addEntry(entry, CLI_WBEMSMT_POOLID, pool.get_key_InstanceID());
        
        List<RASDProperty> properties = getRASDProperties(sampleNetworkRasd, RASD_NETWORK, virtualSystemType);
        for (Iterator<RASDProperty> iterator = properties.iterator(); iterator.hasNext();) {
            RASDProperty property = (RASDProperty) iterator.next();
            String propertyName = property.getFieldname();
            CIMInstance instance = network.getRasd().getCimInstance();
            CIMClass cls = AbstractWbemsmtFcoHelper.getClass(adapter.getCimClient(), instance.getClassName(), adapter.getNamespace());
            cliWizardConfig.addEntry(entry, propertyName, FcoUtil.getValueAsString(instance , propertyName, cls , adapter.getBundle()));
        }
        
    }

    private int getFreeId(Userdata userdata, String key, String valuePrefix) throws WbemsmtException {
        for (int i=0; i < 1000; i++)
        {
            Entry entry = cliWizardConfig.findEntry(userdata, key, valuePrefix + i);
            if (entry == null)
            {
                return i;
            }
        }
        throw new WbemsmtException(WbemsmtException.ERR_FAILED, "No free Id found for key " + key + " and value with prefix " + valuePrefix);
    }

    private void updateDiskValue(DefineSystemCLIDataContainer container, Userdata userdata) {
        UnsignedInteger16 selector = (UnsignedInteger16) container.get_usr_DiskSelector().getConvertedControlValue();
        String diskConfigKey = (String) container.get_usr_DiskConfigKey().getConvertedControlValue();
        if (selector != null && diskConfigKey != null)
        {
            String diskid = getCurrentDiskSelectors(userdata)[selector.intValue()];
            String diskConfigValue = (String) container.get_usr_DiskConfigValue().getConvertedControlValue();
            Entry entry = cliWizardConfig.findEntry(userdata, CLI_DISK,diskid.substring(diskid.lastIndexOf("-")+1));
            if (entry != null)
            {
                if (diskConfigKey != null)
                {
                    entry = cliWizardConfig.findEntry(entry, diskConfigKey, null);
                    entry.setValue(diskConfigValue);
                }
                else
                {
                    //TODO add warning
                }
            }
            else
            {
                //TODO add warning
            }
        }
    }

    private void updateNetworkValue(DefineSystemCLIDataContainer container, Userdata userdata) {
        UnsignedInteger16 selector = (UnsignedInteger16) container.get_usr_NetworkSelector().getConvertedControlValue();
        String networkConfigKey = (String) container.get_usr_NetworkConfigKey().getConvertedControlValue();
        if (selector != null && networkConfigKey != null)
        {
            String networkid = getCurrentNetworkSelectors(userdata)[selector.intValue()];
            String networkConfigValue = (String) container.get_usr_NetworkConfigValue().getConvertedControlValue();
            Entry entry = cliWizardConfig.findEntry(userdata, CLI_NETWORK,networkid.substring(networkid.lastIndexOf("-")+1));
            if (entry != null)
            {
                if (networkConfigKey != null)
                {
                    entry = cliWizardConfig.findEntry(entry, networkConfigKey, null);
                    entry.setValue(networkConfigValue);
                }
                else
                {
                    //TODO add warning
                }
            }
            else
            {
                //TODO add warning
            }
        }
    }
    
    private void updateVSSDValue(DefineSystemCLIDataContainer container, Userdata userdata) {
        String configKey = (String) container.get_usr_ConfigKey().getConvertedControlValue();
        String configValue = (String) container.get_usr_ConfigValue().getConvertedControlValue();
        
        if (StringUtils.isNotEmpty(configKey))
        {
            Entry vssdEntry = cliWizardConfig.findEntry(userdata, CLI_VSSD, null);
            Entry entry = cliWizardConfig.findEntry(vssdEntry, configKey, null);
            if (entry != null)
            {
                entry.setValue(configValue);
            }
            else
            {
                //TODO entry with name configKey was not found - add a warning
            }
        }
    }
        
    
    
    private void updateMemoryRASD(Userdata userdata, DataContainer container, LabeledBaseInputComponentIf size) throws WbemsmtException {
        Entry[] entryArray = userdata.getEntryArray();
        for (int i = 0; i < entryArray.length; i++) {
            Entry entry = entryArray[i];
            if (entry.getKey().equals(CLI_MEMORY_RASD))
            {
                String strSize = (String) size.getConvertedControlValue();
                Entry sizeEntry = cliWizardConfig.findEntry(entry,CLI_SIZE, null);
                if (StringUtils.isNotEmpty(strSize))
                {
                    updateMemory(container, size);
                    sizeEntry.setValue(memoryRasd.get_VirtualQuantity().toString());
                }
                else
                {
                    memoryRasd.set_VirtualQuantity(new UnsignedInteger64(sizeEntry.getValue()));
                }
                return;
            }
        }
        Entry entry = cliWizardConfig.addEntry(userdata, CLI_MEMORY_RASD, null);
        cliWizardConfig.addEntry(entry, CLI_SIZE, "0");
        updateMemoryRASD(userdata,container,size);
    }

    private void updateProcessorRASD(Userdata userdata, DataContainer container, LabeledBaseInputComponentIf amount) throws WbemsmtException {
        Entry[] entryArray = userdata.getEntryArray();
        for (int i = 0; i < entryArray.length; i++) {
            Entry entry = entryArray[i];
            if (entry.getKey().equals(CLI_PROCESSOR_RASD))
            {
                String strAmount = (String) amount.getConvertedControlValue();
                Entry amountEntry = cliWizardConfig.findEntry(entry,CLI_AMOUNT, null);
                if (StringUtils.isNotEmpty(strAmount))
                {
                    updateProcessor(container, amount);
                    amountEntry.setValue(processorRasd.get_VirtualQuantity().toString());
                }
                else
                {
                    processorRasd.set_VirtualQuantity(new UnsignedInteger64(amountEntry.getValue()));
                }
                return;
            }
        }
        Entry entry = cliWizardConfig.addEntry(userdata, CLI_PROCESSOR_RASD, null);
        cliWizardConfig.addEntry(entry, CLI_AMOUNT, "1");
        updateProcessorRASD(userdata,container,amount);
    }
    
    private void updateDiskRASDs(DataContainer container, Userdata userdata) throws WbemsmtException {
        getDisks();

        Entry[] entryArray = userdata.getEntryArray();
        List<Disk> newDisks = new ArrayList<Disk>();
        
        List<Integer> toRemove = new ArrayList<Integer>();
        
        //first look for existing ones
        for (int i = 0; i < entryArray.length; i++) {
            Entry entry = entryArray[i];
            if (entry.getKey().equals(CLI_DISK))
            {
                boolean found = false;
                
                Entry pathEntry = cliWizardConfig.findEntry(entry, CLI_WBEMSMT_PATH, null);
                if (pathEntry != null)
                {
                    String path = pathEntry.getValue(); 
                    for (int j=0; j < disks.size() && !found; j++) {
                        Disk disk = (Disk) disks.get(j);
                        if (disk.getRasd().getCimObjectPath().toString().equals(path))
                        {
                            updateRasdFromEntry(entry, disk.getRasd());
                            disks.remove(j);
                            newDisks.add(disk);
                            found = true;
                        }
                    }
                }
                if (!found)
                {
                    Entry poolIdEntry = cliWizardConfig.findEntry(entry, CLI_WBEMSMT_POOLID, null);
                    if (poolIdEntry != null)
                    {
                        String poolId = poolIdEntry.getValue();
                        CIM_ResourcePool pool = hostSystem.getResourcePool(poolId);
                        if (pool != null)
                        {
                            Disk disk = getDiskFromPool(container, pool);
                            if (disk != null)
                            {
                                updateRasdFromEntry(entry, disk.getRasd());
                                newDisks.add(disk);
                            }
                        }
                        else
                        {
                            //TODO add a warning that the pool was not found and rasd was removed from config
                            toRemove.add(new Integer(i));
                        }
                        
                    }
                }
            }
        }
        
        //remove the entries
        for (int i = toRemove.size() - 1; i >= 0; i--) {
            Integer idx = (Integer) toRemove.get(i);
            userdata.removeEntry(idx.intValue());
        }
        
        this.disks = newDisks;
    }

    private void updateNetworkRASDs(DataContainer container, Userdata userdata) throws WbemsmtException {
        getNetworks();

        Entry[] entryArray = userdata.getEntryArray();
        List<Network> newNetworks = new ArrayList<Network>();
        
        List<Integer> toRemove = new ArrayList<Integer>();
        
        //first look for existing ones
        for (int i = 0; i < entryArray.length; i++) {
            Entry entry = entryArray[i];
            if (entry.getKey().equals(CLI_NETWORK))
            {
                boolean found = false;
                
                Entry pathEntry = cliWizardConfig.findEntry(entry, CLI_WBEMSMT_PATH, null);
                if (pathEntry != null)
                {
                    String path = pathEntry.getValue(); 
                    for (int j=0; j < networks.size() && !found; j++) {
                        Network network = (Network) networks.get(j);
                        if (network.getRasd().getCimObjectPath().toString().equals(path))
                        {
                            updateRasdFromEntry(entry, network.getRasd());
                            networks.remove(j);
                            newNetworks.add(network);
                            found = true;
                        }
                    }
                }
                if (!found)
                {
                    Entry poolIdEntry = cliWizardConfig.findEntry(entry, CLI_WBEMSMT_POOLID, null);
                    if (poolIdEntry != null)
                    {
                        String poolId = poolIdEntry.getValue();
                        CIM_ResourcePool pool = hostSystem.getResourcePool(poolId);
                        if (pool != null)
                        {
                            Network network = getNetworkFromPool(container, pool);
                            if (network != null)
                            {
                                updateRasdFromEntry(entry, network.getRasd());
                                newNetworks.add(network);
                            }
                        }
                        else
                        {
                            //TODO add a warning that the pool was not found and rasd was removed from config
                            toRemove.add(new Integer(i));
                        }
                        
                    }
                }
            }
        }
        
        //remove the entries
        for (int i = toRemove.size() - 1; i >= 0; i--) {
            Integer idx = (Integer) toRemove.get(i);
            userdata.removeEntry(idx.intValue());
        }
        
        this.networks = newNetworks;
    }    
    
    private void updateVSSD(DataContainer container, Userdata userdata) throws WbemsmtException {

        Entry entry = cliWizardConfig.findEntry(userdata, CLI_VSSD, null);
        if (entry != null)
        {
            Entry[] array = entry.getEntryArray();
            for (int k = 0; k < array.length; k++) {
                Entry child = array[k];
                
                String propertyName = child.getKey();
                CIMProperty property = vssd.getProperty(propertyName);
                CIMClass cls = AbstractWbemsmtFcoHelper.getClass(adapter.getCimClient(), vssd.getCimInstance().getClassName(), adapter.getNamespace());
                CIMClassProperty clsProperty = cls.getProperty(propertyName);
                
                GenericFieldData fd = GenericFieldData.create(property, cls, clsProperty, adapter.getBundle(), child.getValue());
                
                property = GenericFieldData.setPropertyValue(property, cls, clsProperty, fd);
                vssd.setCimInstance(vssd.getCimInstance().deriveInstance(new CIMProperty[]{property}));
            }
            return;
        }
        
        //create a vssd entry if not found
        entry = cliWizardConfig.addEntry(userdata, CLI_VSSD, null);
        List<String> names = getVssdPropertyNames();
        for (Iterator<String> iterator = names.iterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            Object value = vssd.getProperty(name).getValue();
            cliWizardConfig.addEntry(entry, name, value != null ? value.toString() : null);
        }
        updateVSSD(container,userdata);
        
    }
        
    
    
    private void updateRasdFromEntry(Entry entry, CIM_ResourceAllocationSettingData rasd) throws WbemsmtException {
        Entry[] array = entry.getEntryArray();
        for (int k = 0; k < array.length; k++) {
            Entry child = array[k];
            
            String propertyName = child.getKey();
            if (!propertyName.equals(CLI_WBEMSMT_POOLID) 
                && ! propertyName.equals(CLI_WBEMSMT_PATH) )
            {
                CIMProperty property = rasd.getProperty(propertyName);
                CIMClass cls = AbstractWbemsmtFcoHelper.getClass(adapter.getCimClient(), rasd.getCimInstance().getClassName(), adapter.getNamespace());
                CIMClassProperty clsProperty = cls.getProperty(propertyName);
                
                GenericFieldData fd = GenericFieldData.create(property, cls, clsProperty, adapter.getBundle(), child.getValue());
                
                property = GenericFieldData.setPropertyValue(property, cls, clsProperty, fd);
                rasd.setCimInstance(rasd.getCimInstance().deriveInstance(new CIMProperty[]{property}));
            }
        }
    }

    private String[] getCurrentNetworkSelectors(Userdata userdata) {
        
        return getSelectorsByName(CLI_NETWORK, userdata);
    }

    private void handleAddNetworkButton(DefineSystemCLIDataContainer container, Userdata userdata)
            throws WbemsmtException {
        if (adapter.getUpdateTrigger() == container.get_usr_AddNetwork()) {
            UnsignedInteger16 idx = (UnsignedInteger16) container.get_usr_Networks().getConvertedControlValue();
            if (idx != null) {
                List<CIM_ResourcePool> pools = hostSystem.getResourcePoolsByResourceType(VMCimAdapter.RESOURCE_TYPE_DISK);
                CIM_ResourcePool pool = (CIM_ResourcePool) pools.get(idx.intValue());
                Network network = getNetworkFromPool(container, pool);
                addNetwork(userdata, network, pool);
            }
            else {
                //todo add warning that add was pressed but no pool was selected
            }

        }
    }
    
    public void updateControls(DefineSystemCLISummaryDataContainer container) {
        // TODO Auto-generated method stub
        
    }
    public void updateControls(DefineSystemCLISummaryConfigItemDataContainer container, String key) {
        // TODO Auto-generated method stub
    }

    public void updateControls(DefineSystemCLIDataContainer container) throws WbemsmtException {
        
        container.get_usr_ReferencedSystem().setValues(getReferencableSystems());
        container.get_usr_ReferencedSystem().setControlValue(null);

        container.get_usr_VirtualSystemType().setValues(adapter.getHostSystems().getNameArray());
        container.get_usr_VirtualSystemType().setControlValue(null);
        
        
        container.get_usr_DiskSelector().setValues(getCurrentDiskSelectors(cliWizardConfig.getDocument().getUserdata()));
        container.get_usr_DiskSelector().setControlValue(null);
        
        container.get_usr_NetworkSelector().setValues(getCurrentNetworkSelectors(cliWizardConfig.getDocument().getUserdata()));
        container.get_usr_NetworkSelector().setControlValue(null);
        
        if ( hostSystem != null) {
            container.get_usr_Disks().setValues(getDiskNames());
            container.get_usr_Disks().setControlValue(null);
            container.get_usr_Networks().setValues(getNetworkNames());
            container.get_usr_Networks().setControlValue(null);
        }
        
    }

    private String[] getReferencableSystems() throws WbemsmtException {
        
        if (referencableSystems == null){
            
            VMList allVMList = adapter.getAllVMList();
            referencableSystems = new String[allVMList.size()];
            for (int i = 0; i < referencableSystems.length; i++) {
                VM vm = allVMList.getHostedSystem(i);
                referencableSystems[i] = vm.getVirtualSystemType() + "-" + vm.getHostedSystem().get_key_Name();
            }
        }
        
        return referencableSystems;
    }

    public void updateModel(DefineSystemCLIDataContainer container) throws WbemsmtException {
        
        MessageList ml =  MessageList.init(container);
        
        execute = DataContainerUtil.isTrue(container.get_usr_Execute());
        
        if (adapter.getUpdateTrigger() != container.get_usr_ListOnly())
        {
            UnsignedInteger16 referencedSystem = (UnsignedInteger16) container.get_usr_ReferencedSystem().getConvertedControlValue();
            UnsignedInteger16 virtualSystemType = (UnsignedInteger16) container.get_usr_VirtualSystemType().getConvertedControlValue();
            Boolean deleteSession = (Boolean) container.get_usr_DeleteSession().getConvertedControlValue();
            Boolean cleanSession = (Boolean) container.get_usr_CleanupSession().getConvertedControlValue();

            if (deleteSession != null && deleteSession.booleanValue())
            {
                cliWizardConfig.delete(ml, adapter.getBundle());
                //TODO add message
                return;
            }
            
            if (cleanSession != null && cleanSession.booleanValue())
            {
                cliWizardConfig.init(ml,adapter.getBundle());
                cliWizardConfig.save(ml,adapter.getBundle(), PRETTY);
                //TODO add message
                return;
            }

            UserdataDocument doc = cliWizardConfig.getDocument();
            Userdata userdata = doc.getUserdata();
            //user doesn't want to define a new template or start from scratch
            if (referencedSystem == null && virtualSystemType == null)
            {
                if (userdata == null || cliWizardConfig.findEntry(userdata, CLI_TYPE, null) == null || cliWizardConfig.findEntry(userdata, CLI_VM, null) == null)
                {
                    throw new WbemsmtException(WbemsmtException.ERR_FAILED,"Configuration contains no ReferencedSystem and referenced System was not set");
                }
                init(userdata);
            }
            else if (referencedSystem != null)
            {
                while (userdata.getEntryArray().length > 0)
                {
                    userdata.removeEntry(0);
                }
                VM vm = adapter.getAllVMList().getHostedSystem(referencedSystem.intValue());
                HostSystem host = vm.getHostSystem(); 
                String system = host.getVirtualSystemType()  + "-" + vm.getInfo();
                userdata.setComment("Session for System " + system);
                cliWizardConfig.addEntry(userdata,CLI_TYPE,host.getVirtualSystemType());
                cliWizardConfig.addEntry(userdata,CLI_VM,vm.getHostedSystem().get_key_Name());
                init(userdata);
                addResources(userdata,getDisks(),CLI_DISK,VMBusinessObject.RASD_DISK);
                addResources(userdata,getNetworks(),CLI_NETWORK,VMBusinessObject.RASD_NETWORK);
                addVirtualQuantity(userdata,CLI_MEMORY_RASD, CLI_SIZE, memoryRasd.get_VirtualQuantity());
                addVirtualQuantity(userdata,CLI_PROCESSOR_RASD, CLI_AMOUNT, processorRasd.get_VirtualQuantity());
            }
            else if (virtualSystemType != null)
            {
                while (userdata.getEntryArray().length > 0)
                {
                    userdata.removeEntry(0);
                }
                HostSystem host = adapter.getHostSystems().getHostedSystem(virtualSystemType.intValue());
                String system = host.getVirtualSystemType()  + "-" + CLI_USERDEFINED;    
                userdata.setComment("Session for System " + system);
                cliWizardConfig.addEntry(userdata,CLI_TYPE,host.getVirtualSystemType());
                cliWizardConfig.addEntry(userdata,CLI_VM,CLI_USERDEFINED);
                init(userdata);
            }
            updateMemoryRASD(userdata,container, container.get_usr_Memory());
            updateProcessorRASD(userdata,container, container.get_usr_Processor());
            updateDiskRASDs(container, userdata);
            updateNetworkRASDs(container, userdata);
            updateVSSD(container,userdata);
            
            handleAddDiskButton(container, userdata);
            handleRemoveDiskButton(container, userdata);

            handleAddNetworkButton(container, userdata);
            handleRemoveNetworkButton(container, userdata);
            
            updateDiskValue(container, userdata);
            updateNetworkValue(container, userdata);
            updateVSSDValue(container, userdata);
            
            updateStartVirtualSystem(userdata,((Boolean)container.get_usr_StartAfterCreation().getConvertedControlValue()).booleanValue());
        }
        cliWizardConfig.save(ml,adapter.getBundle(),PRETTY);
        
    }

    private void addVirtualQuantity(Userdata userdata, String resourceNameForUserConfig, String elementNameForSize,
            UnsignedInteger64 virtualQuantity) {
        
        String quantity = virtualQuantity != null ? virtualQuantity.toString() : null;
        
        Entry entry = cliWizardConfig.addEntry(userdata,resourceNameForUserConfig,null);
        cliWizardConfig.addEntry(entry, elementNameForSize, quantity);
        
    }

    /**
     * add resources to a userdata object
     * @param userdata
     * @param networks
     * @param cliNetwork
     * @param rasdNetwork
     * @throws WbemsmtException 
     */
    private void addResources(Userdata userdata, List<?> rasdContainers, String resourceNameForUserConfig, String rasdType) throws WbemsmtException {
        
        for (Iterator<?> iterator = rasdContainers.iterator(); iterator.hasNext();) {
            RASDContainer container = (RASDContainer) iterator.next();
            CIM_ResourceAllocationSettingData rasd = container.getRasd();
            CIMInstance instance = rasd.getCimInstance();
            CIMClass cls = AbstractWbemsmtFcoHelper.getClass(adapter.getCimClient(), instance.getClassName(), adapter.getNamespace());
            
            Entry entry = cliWizardConfig.addEntry(userdata,resourceNameForUserConfig, ""+getFreeId(userdata, resourceNameForUserConfig, ""));
            cliWizardConfig.addEntry(entry, CLI_WBEMSMT_PATH, rasd.getCimObjectPath().toString());

            List<RASDProperty> properties = getRASDProperties(rasd, rasdType, virtualSystemType);
            for (Iterator<RASDProperty> iterator2 = properties.iterator(); iterator2.hasNext();) {
                RASDProperty rasdProperty = (RASDProperty) iterator2.next();
                String fieldname = rasdProperty.getFieldname();
                cliWizardConfig.addEntry(entry, fieldname, FcoUtil.getValueAsString(instance, fieldname, cls, adapter.getBundle()));
            }
        }
    }

    private void updateStartVirtualSystem(Userdata userdata, boolean start) {
        
        Entry entry = cliWizardConfig.findEntry(userdata, "startVirtualSystem", null);
        if (entry == null)
        {
            entry = cliWizardConfig.addEntry(userdata, "startVirtualSystem", ""+start);
        }
        else
        {
            entry.setValue(""+start);
        }
        startVirtualSystem = start;
        
    }

    private void handleRemoveDiskButton(DefineSystemCLIDataContainer container, Userdata userdata)
            throws WbemsmtException {
        if (adapter.getUpdateTrigger() == container.get_usr_RemoveDisk())
        {
            UnsignedInteger16 selector = (UnsignedInteger16) container.get_usr_DiskSelector().getConvertedControlValue();
            if (selector != null)
            {
                String diskid = getCurrentDiskSelectors(userdata)[selector.intValue()];
                int lastIdx = diskid.lastIndexOf("-");
                String idx = diskid.substring(lastIdx+1);
                Entry entry = cliWizardConfig.findEntry(userdata, CLI_DISK ,idx);
                
                if (entry != null)
                {
                    cliWizardConfig.deleteEntry(userdata,entry);
                    getDisks().remove(Integer.parseInt(idx));
                }
            }
            else
            {
                //todo add warning that remove was pressed and selector was empty
            }

        }
    }

    private String[] getCurrentDiskSelectors(Userdata userdata) {
        return getSelectorsByName(CLI_DISK, userdata);
    }

    private String[] getSelectorsByName(String resourceName, Userdata userdata) {
        List<String> result = new ArrayList<String>();
        Entry[] entryArray = userdata.getEntryArray();
        for (int i = 0; i < entryArray.length; i++) {
            Entry entry = entryArray[i];
            if (entry.getKey().equals(resourceName))
            {
                result.add(entry.getKey() + "-" + entry.getValue());
            }
        }
        return (String[]) result.toArray(new String[result.size()]);
    }

    private void handleAddDiskButton(DefineSystemCLIDataContainer container, Userdata userdata)
            throws WbemsmtException {
        if (adapter.getUpdateTrigger() == container.get_usr_AddDisk())
        {
            UnsignedInteger16 idx = (UnsignedInteger16) container.get_usr_Disks().getConvertedControlValue();
            if (idx != null)
            {
                List<CIM_ResourcePool> pools = hostSystem.getResourcePoolsByResourceType(VMCimAdapter.RESOURCE_TYPE_DISK);
                CIM_ResourcePool pool = (CIM_ResourcePool) pools.get(idx.intValue());
                Disk disk = getDiskFromPool(container, pool);
                addDisk(userdata,disk,pool);
            }
            else
            {
                //todo add warning that add was pressed but no pool was selected
            }

        }
    }

    private void handleRemoveNetworkButton(DefineSystemCLIDataContainer container, Userdata userdata)
            throws WbemsmtException {
        if (adapter.getUpdateTrigger() == container.get_usr_RemoveNetwork()) {
            UnsignedInteger16 selector = (UnsignedInteger16) container.get_usr_NetworkSelector().getConvertedControlValue();
            if (selector != null) {
                String networkid = getCurrentNetworkSelectors(userdata)[selector.intValue()];
                int lastIdx = networkid.lastIndexOf("-");
                String idx = networkid.substring(lastIdx+1);
                Entry entry = cliWizardConfig.findEntry(userdata, CLI_NETWORK, idx);
                if (entry != null) {
                    cliWizardConfig.deleteEntry(userdata, entry);
                    getDisks().remove(Integer.parseInt(idx));
                }
            }
            else {
                // todo add warning that remove was pressed and selector was empty
            }

        }
    }

    /**
     * get all the configured values of disk-rasds, network-rasds, and vssds 
     * @return
     */
    public List<String> getConfigValues() {
        if (configValues == null){
            
            configValues = new ArrayList<String>();
        }
        return configValues;
    }

    public void create(DefineSystemCLISummaryDataContainer container) throws WbemsmtException {
        if (execute)
        {
            super.createImpl(container);
        }
        else
        {
            
        }
        
    }

    
    public void init()
    {
        super.init();
        cliWizardConfig = null;
        execute = false;
    }

    public void init(String sessionKey, MessageList ml, WbemSmtResourceBundle bundle) throws WbemsmtException {
        if (sessionKey != null)
        {
            init();
            cliWizardConfig = UserDataConfiguration.loadFromUserHome("wbemsmt-vm-usersession-" + sessionKey + ".xml",ml,bundle);
            cliWizardConfig.save(null, null, PRETTY);
            init(cliWizardConfig.getDocument().getUserdata());
        }
        else
        {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED, "sessionkey is not set");
        }
        
        
    }
    

    
    
}
