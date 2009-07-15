/** 
 * ApplicationContainer.java
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
 * Description: Wrapper for HostedSystem businessobjects and the related actions 
 * 
 */
package org.sblim.wbemsmt.vm.bl.wrapper.objects;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

import javax.cim.CIMClass;
import javax.cim.CIMClassProperty;
import javax.cim.CIMDataType;
import javax.cim.CIMDateTime;
import javax.cim.CIMDateTimeInterval;
import javax.cim.CIMInstance;
import javax.cim.CIMObjectPath;
import javax.cim.CIMProperty;
import javax.cim.UnsignedInteger16;
import javax.cim.UnsignedInteger32;
import javax.wbem.WBEMException;
import javax.wbem.client.WBEMClient;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.lang.StringUtils;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFcoHelper;
import org.sblim.wbemsmt.bl.fco.FcoUtil;
import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricDefinitionIf;
import org.sblim.wbemsmt.bl.fielddata.MemoData;
import org.sblim.wbemsmt.bl.fielddata.PictureData;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageDefinition;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.bl.messages.MessageUtil;
import org.sblim.wbemsmt.bl.wrapper.preload.PreloadThread;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.session.WbemsmtSession;
import org.sblim.wbemsmt.tools.input.ComponentProperties;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.vm.VMErrCodes;
import org.sblim.wbemsmt.vm.bl.adapter.MethodSupport;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.vm.Disk;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.vm.Memory;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.vm.Network;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.vm.Processor;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.MigrationWizard;
import org.sblim.wbemsmt.vm.container.edit.ConfigItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.DiskVMInfoDataContainer;
import org.sblim.wbemsmt.vm.container.edit.DiskVMInfoItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.MemoryVMInfoDataContainer;
import org.sblim.wbemsmt.vm.container.edit.MemoryVMInfoItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.NetworkVMInfoDataContainer;
import org.sblim.wbemsmt.vm.container.edit.NetworkVMInfoItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.ProcessorVMInfoDataContainer;
import org.sblim.wbemsmt.vm.container.edit.ProcessorVMInfoItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.VMConfigDataContainer;
import org.sblim.wbemsmt.vm.container.edit.VMDataContainer;
import org.sblim.wbemsmt.vm.container.edit.VMOperationsDataContainer;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ComputerSystem;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ConcreteJob;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_DiskDrive;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ElementSettingData;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_EnabledLogicalElement;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_EnabledLogicalElementCapabilities;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_LogicalDevice;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_LogicalDisk;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_Memory;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_NetworkAdapter;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_NetworkPort;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_Processor;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_RegisteredProfile;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ResourceAllocationSettingData;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ResourcePool;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_System;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemManagementCapabilities;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemManagementService;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemMigrationCapabilities;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemMigrationService;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemMigrationSettingData;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemSettingData;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_EnabledLogicalElement.RequestStateChangeResult;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_VirtualSystemManagementService.DestroySystemResult;

public class VM extends VMBusinessObject {

	public final VMCimAdapter adapter;
	private CIM_ComputerSystem vm;
	private CIM_VirtualSystemSettingData currentSettingData;
	private CIM_VirtualSystemSettingData nextSettingData;
	private CIM_VirtualSystemSettingData defaultSettingData;

	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss:SS");
	public static final CIM_BaseMetricDefinitionIf DEF_NO_UNIT = new CIM_BaseMetricDefinitionIf() {
		public String get_Units() {
			return "";
		}
	};

    public static final String VIRTUAL_DEVICE = "VirtualDevice";
    
    public static final String MOUNT_POINT = "MountPoint";
	
	private CIM_EnabledLogicalElementCapabilities capabilities;
	private final HostSystem hostSystem;
	private String currentMemory;
	private Memory memory;
	private Processor processor;
	private String currentProcessor;
	private List networks;
	private List disks;
	// flag to check if the capabilities are already loaded. Because
	// capabilities are optional the field capabilities cannot be used to check
	// if already loaded
	// because it's okay that capabilities == null;

	private boolean capabilitiesLoaded = false;
	private final int count;
	private List systemDevices;
	private List vssdPropertyNames;

	/**
	 * @param count
	 * @throws WbemsmtException
	 * 
	 */
	public VM(VMCimAdapter adapter, CIM_ComputerSystem system, HostSystem hostSystem, int count) throws WbemsmtException {
		super(adapter);

		this.adapter = adapter;
		this.vm = system;
		this.hostSystem = hostSystem;
		this.count = count;

		preload();
	}

	private void preload() {

		if (!adapter.getPreloadVMs())
			return;

		try {
			WBEMClient client = adapter.getPreloadUsesNewClients() ? adapter.getNewCimClient() : getCimClient();

			new PreloadThread(vm.get_key_Name(), client) {

				public void run() {
					logger.info("Preloading objects of " + vm.getCimObjectPath());

					preloading = true;
					try {
						setCimClient(client);

						while (!stopPreloading && hostSystem.isPreloading()) {
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// do nothing
							}
						}

						load();
						
						logger.info("Finished preloading objects of " + getCimObjectKey().toString());
					} catch (WbemsmtException e) {
						logger.log(Level.SEVERE, "Exception during preload", e);
					} finally {
						preloading = false;
						setCimClient(null);
					}
				}
			}.start();
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Exception during preload", e);
		} finally {
			preloading = false;
		}

	}

	private void load() throws WbemsmtException {
		if (!stopPreloading)
			getCurrentSettingData();
		if (!stopPreloading)
			getNextSettingData();
		if (!stopPreloading)
			getDefaultSettingData();
		if (!stopPreloading)
			getCapabilities();
		if (!stopPreloading)
			getSystemDevices();
		if (!stopPreloading)
			getDisks();
		if (!stopPreloading)
			getNetworks();
		if (!stopPreloading)
			getProcessor();
		 if (!stopPreloading)
			getMemory();
	}
	
	public void reload() throws WbemsmtException{
		clear();
		load();
	}
	
	private void clear() {
		capabilities = null;
		capabilitiesLoaded = false;
		processor = null;
		memory = null;
		disks = null;
		networks = null;
		currentSettingData = null;
		defaultSettingData = null;
		nextSettingData = null;
		systemDevices = null;
		vssdPropertyNames = null;
	}

	/**
	 * Loads the Current Virtual System Settings
	 * 
	 * @return the SettingData Object - never returns null
	 * @throws WbemsmtException
	 *             if the settingData object was not found
	 */
	public CIM_VirtualSystemSettingData getCurrentSettingData() throws WbemsmtException {
		if ((currentSettingData == null || reloadChilds) && stopPreload()) {
			WBEMClient cc = getCimClient();
			currentSettingData = getCurrentSettingData(vm, cc);
		}
		return currentSettingData;
	}

	/**
	 * Loads the Current Virtual System Settings
	 * 
	 * @param system
	 * @param cc
	 * @return the SettingData Object - never returns null
	 * @throws WbemsmtException
	 *             if the settingData object was not found
	 */
	public CIM_VirtualSystemSettingData getCurrentSettingData(CIM_ComputerSystem system, WBEMClient cc) throws WbemsmtException {
		List list = system.getAssociated_CIM_SettingData_CIM_SettingsDefineStates(cc, CIM_VirtualSystemSettingData.CIM_CLASS_NAME, null, null);
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			return (CIM_VirtualSystemSettingData) iter.next();
		}
		throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL, "For system " + system.getCimObjectPath() + " no IBM_ContainerVirtualSystemSettingData was found");
	}

	/**
	 * Tries to find the next SettingDataObject
	 * 
	 * @return the next setting data - never returns null
	 * @throws WbemsmtException
	 *             if the sd was not found or the uniqueness of the found
	 *             settingData-Objects cannot be ensured. For example if there
	 *             are two CIM_ElementSettingData associations with isDefault=1
	 * 
	 * For more see chapters 7.3.11. and 7.3.12 of the Virtual System Profile at
	 * http://www.dmtf.org/standards/published_documents/DSP1057.pdf
	 */
	public CIM_VirtualSystemSettingData getNextSettingData() throws WbemsmtException {

		if (nextSettingData == null && stopPreload()) {
			nextSettingData = getNextSettingData(vm, getCimClient());
		}

		return nextSettingData;
	}

	/**
	 * Tries to find the next SettingDataObject
	 * 
	 * @param system
	 * @param client
	 * @return the next setting data - never returns null
	 * @throws WbemsmtException
	 *             if the sd was not found or the uniqueness of the found
	 *             settingData-Objects cannot be ensured. For example if there
	 *             are two CIM_ElementSettingData associations with isDefault=1
	 */
	public CIM_VirtualSystemSettingData getNextSettingData(CIM_ComputerSystem system, WBEMClient client) throws WbemsmtException {

		// TODO use UsCurrent or isNext ???
		String propertyName = CIM_ElementSettingData.PROPERTY_ISCURRENT.NAME;

		CIM_ElementSettingData defaultSd = null;
		CIM_ElementSettingData nextSd = null;
		CIM_ElementSettingData nextSingleUseSd = null;

		CIM_VirtualSystemSettingData currentSettingData = getCurrentSettingData(system, client);
		List settingDatas = currentSettingData.getAssociations_CIM_ElementSettingData(client, false, false, null, null);
		for (Iterator iterator = settingDatas.iterator(); iterator.hasNext();) {
			CIM_ElementSettingData sd = (CIM_ElementSettingData) iterator.next();

			// TODO use UsCurrent or isNext ???
			int isCurrent = sd.get_IsCurrent() != null ? sd.get_IsCurrent().intValue() : 0;
			int isDefault = sd.get_IsDefault() != null ? sd.get_IsDefault().intValue() : 0;

			if (isCurrent == 3) // 3 specifies is Next = is next for single use
			{
				if (nextSingleUseSd == null) {
					nextSingleUseSd = sd;
				} else {
					throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL, "There is more than one association with " + propertyName + " == 3 associated to settingData " + currentSettingData.getCimObjectPath());
				}
			} else if (isCurrent == CIM_ElementSettingData.PROPERTY_ISCURRENT.VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Current.intValue()) {
				if (nextSd == null) {
					nextSd = sd;
				} else {
					throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL, "There is more than one association with " + propertyName + " == " + CIM_ElementSettingData.PROPERTY_ISCURRENT.VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Current.intValue() + " associated to settingData " + currentSettingData.getCimObjectPath());
				}
			} else if (isDefault == CIM_ElementSettingData.PROPERTY_ISDEFAULT.VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Default.intValue()) {
				if (defaultSd == null) {
					defaultSd = sd;
				} else {
					throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL, "There is more than one association with " + CIM_ElementSettingData.PROPERTY_ISDEFAULT.NAME + " == " + CIM_ElementSettingData.PROPERTY_ISDEFAULT.VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Default.intValue() + " associatzed to settingData " + currentSettingData.getCimObjectPath());
				}
			}
		}

		// nextSingleUse is used before next and next is used before default

		if (nextSingleUseSd != null) {
			nextSettingData = (CIM_VirtualSystemSettingData) adapter.getFcoHelper().reload(nextSingleUseSd.get_SettingData_CIM_SettingData(client), client);
		} else if (nextSd != null) {
			nextSettingData = (CIM_VirtualSystemSettingData) adapter.getFcoHelper().reload(nextSd.get_SettingData_CIM_SettingData(client), client);
		} else if (defaultSd != null) {
			nextSettingData = (CIM_VirtualSystemSettingData) adapter.getFcoHelper().reload(defaultSd.get_SettingData_CIM_SettingData(client), client);
		} else {
			throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL, "No association with " + CIM_ElementSettingData.PROPERTY_ISDEFAULT.NAME + " == " + CIM_ElementSettingData.PROPERTY_ISDEFAULT.VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Default.intValue() + " or " + propertyName + " == " + CIM_ElementSettingData.PROPERTY_ISCURRENT.VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Current.intValue() + "|3" + " associatzed to settingData " + currentSettingData.getCimObjectPath() + " was found.");
		}
		return nextSettingData;
	}

	/**
	 * Tries to find the next SettingDataObject
	 * 
	 * @return the next setting data - never returns null
	 * @throws WbemsmtException
	 *             if the sd was not found or the uniqueness of the found
	 *             settingData-Objects cannot be ensured. For example if there
	 *             are two CIM_ElementSettingData associations with isDefault=1
	 * 
	 * For more see chapters 7.3.11. and 7.3.12 of the Virtual System Profile at
	 * http://www.dmtf.org/standards/published_documents/DSP1057.pdf
	 */
	public CIM_VirtualSystemSettingData getDefaultSettingData() throws WbemsmtException {

		if (defaultSettingData == null && stopPreload()) {
			defaultSettingData = getDefaultSettingData(vm, getCimClient());
		}

		return defaultSettingData;
	}

	/**
	 * Tries to find the next SettingDataObject
	 * 
	 * @param system
	 * @param client
	 * @return the next setting data - never returns null
	 * @throws WbemsmtException
	 *             if the sd was not found or the uniqueness of the found
	 *             settingData-Objects cannot be ensured. For example if there
	 *             are two CIM_ElementSettingData associations with isDefault=1
	 */
	public CIM_VirtualSystemSettingData getDefaultSettingData(CIM_ComputerSystem system, WBEMClient client) throws WbemsmtException {

		CIM_VirtualSystemSettingData defaultSd = null;

		CIM_VirtualSystemSettingData currentSettingData = getCurrentSettingData(system, client);
		List settingDatas = currentSettingData.getAssociations_CIM_ElementSettingData(client, false, false, null, null);
		for (Iterator iterator = settingDatas.iterator(); iterator.hasNext();) {
			CIM_ElementSettingData sd = (CIM_ElementSettingData) iterator.next();

			int iDefault = sd.get_IsDefault() != null ? sd.get_IsDefault().intValue() : 0;

			if (iDefault == CIM_ElementSettingData.PROPERTY_ISDEFAULT.VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Default.intValue()) {
				if (defaultSd == null) {
					defaultSd = (CIM_VirtualSystemSettingData) sd.get_SettingData_CIM_SettingData(client);
				} else {
					throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL, "There is more than one association with " + CIM_ElementSettingData.PROPERTY_ISDEFAULT.NAME + " == " + CIM_ElementSettingData.PROPERTY_ISDEFAULT.VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Default.intValue() + " associatzed to settingData " + currentSettingData.getCimObjectPath());
				}
			}
		}
		return defaultSd;
	}

	public CIM_EnabledLogicalElementCapabilities getCapabilities() throws WbemsmtException {
		if ((!capabilitiesLoaded || reloadChilds) && stopPreload()) {
			WBEMClient cc = getCimClient();
			capabilities = getCapabilities(vm, cc);
		}
		return capabilities;
	}

	public CIM_EnabledLogicalElementCapabilities getCapabilities(CIM_ComputerSystem system, WBEMClient cc) throws WbemsmtException {
		List capabilitiesList = system.getAssociated_CIM_Capabilities_CIM_ElementCapabilitiess(cc, CIM_EnabledLogicalElementCapabilities.CIM_CLASS_NAME, null, null);

		capabilitiesLoaded = true;

		if (capabilitiesList.size() == 1) {
			return (CIM_EnabledLogicalElementCapabilities) capabilitiesList.get(0);
		} else if (capabilitiesList.size() == 0) {
			// this okay - if there is no associated instance then client
			// statemanagement is noit supported
			return null;
		} else {
			throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL, "Found more than one " + CIM_EnabledLogicalElementCapabilities.CIM_CLASS_NAME + " instance associated with the ComputerSystem " + system.getCimObjectPath().toString());
		}

	}

	public void resetCapabilities() {
		capabilitiesLoaded = false;
		capabilities = null;
	}

	public CimObjectKey getCimObjectKey() {
		return new CimObjectKey(vm.getCimObjectPath());
	}
	
	public CIMObjectPath getCimObjectPath(){
		return vm.getCimObjectPath();
	}

	public CIM_ComputerSystem getHostedSystem() {
		return getFco();
	}

	public CIM_ComputerSystem getFco() {
		return vm;
	}

	public void checkVirtualSystemType(DataContainer container) throws WbemsmtException {
		String virtualSystemType = getCurrentSettingData().get_VirtualSystemType();

		if (virtualSystemType == null) {
			Object containerName = adapter.getSelectedVM().getFco().get_ElementName();
			logger.severe("No VirtualSystemType in SettingData " + getCurrentSettingData().getCimObjectPath());
			MessageList.init(container).addMessage(Message.create(VMErrCodes.MSGDEF_CONTAINER_WITH_NO_VIRTUALSYSTEMTYPE, adapter.getBundle(), new Object[] { containerName }));
		}
	}

	/**
	 * checks if the element name can be changed
	 * 
	 * @return
	 * @throws WbemsmtException
	 */
	public boolean isChangeElementNameEnabled() throws WbemsmtException {
		CIM_EnabledLogicalElementCapabilities caps = getCapabilities();
		boolean enabled = false;
		if (caps != null) {
			enabled = caps.get_ElementNameEditSupported() != null && caps.get_ElementNameEditSupported().booleanValue();
		}
		return enabled;
	}

	/**
	 * returns the max length of the element name
	 * 
	 * @return null if no max length is defined or the value as integer object
	 * @throws WbemsmtException
	 */
	public Integer getElementNameMaxLength() throws WbemsmtException {
		CIM_EnabledLogicalElementCapabilities caps = getCapabilities();
		Integer length = null;
		if (caps != null && caps.get_ElementNameEditSupported() != null) {
			length = new Integer(caps.get_MaxElementNameLen().intValue());
		}
		return length;
	}

	public void delete() throws WbemsmtException {

		if (hostSystem.isManagementCapabilitiesSupportingMethod(CIM_VirtualSystemManagementCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySystemSupported)) {
			DestroySystemResult result;
			result = getVirtualSystemManagementService().invoke_DestroySystem(getCimClient(), vm);
			// cs ist set by the invoke method
			if (result.getResultObject().intValue() != 0) {
				throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT, "Cannot delete appContainer " + vm.getCimObjectPath(), new AbstractWbemsmtFco[] { vm });
			}
		} else {
			MessageUtil.addMessage(VMErrCodes.MSGDEF_DELETION_NOT_POSSIBLE_CAPABILITIES, adapter.getBundle());
		}
		// Force the reload of active containers
		adapter.clearActiveContainers();
		adapter.setMarkedForReload();
	}

	
	public MessageList save(VMDataContainer container) throws WbemsmtException {

		currentSettingData = null;
		return null;
	}

	
	public MessageList revert(VMDataContainer container) throws WbemsmtException {
		vm = (CIM_ComputerSystem) adapter.getFcoHelper().reload(vm, getCimClient());
		return null;
	}

	
	/**
	 * Returns true if the container is having associated processes
	 * 
	 * @param system
	 * @param cimClient
	 * @return
	 * @throws WbemsmtException
	 */
	public static boolean isRunning(CIM_ComputerSystem system, WBEMClient cimClient) throws WbemsmtException {
		return CIM_ComputerSystem.PROPERTY_ENABLEDSTATE.VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled.equals(system.get_EnabledState());
	}

	
	public void initContainer(VMOperationsDataContainer container) throws WbemsmtException {
	}

	
	public MessageList revert(VMOperationsDataContainer container) {
		return null;
	}

	
	public MessageList save(VMOperationsDataContainer container) {
		return null;
	}

	
	/**
	 * get all the Application Containers
	 * 
	 * Currently those are all ComputerSystems which are associated with the
	 * container managment profile
	 * 
	 * @see MetaclusterCimAdapter#MANAGED_CONTAINER_PROFILE
	 * 
	 * @param client -
	 *            client for slp namespace
	 * @return
	 * @throws WbemsmtException
	 */
	public static CIM_ComputerSystem[] getVMs(WBEMClient client, String slpNamespace) throws WbemsmtException {

		List vms = new ArrayList();

		CIM_RegisteredProfile[] profiles = VMCimAdapter.getVirtualSystemProfile(client, slpNamespace);
		for (int i = 0; i < profiles.length; i++) {
			CIM_RegisteredProfile profile = profiles[i];
			try {
				List containerList = profile.getAssociated_CIM_ManagedElement_CIM_ElementConformsToProfiles(client, CIM_ComputerSystem.CIM_CLASS_NAME, null, null);
				vms.addAll(containerList);
			} catch (WbemsmtException e1) {
				logger.log(Level.SEVERE, "Cannot get VMs", e1);
			}
		}

		return (CIM_ComputerSystem[]) vms.toArray(new CIM_ComputerSystem[vms.size()]);

	}

	
	public String getInfo() {
		return vm.get_ElementName() + " (" + vm.get_Name() + ")";
	}

	
	public boolean isRunning() throws WbemsmtException {
		return CIM_ComputerSystem.PROPERTY_ENABLEDSTATE.VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled.equals(vm.get_EnabledState());
	}

	
	public boolean isActive() throws WbemsmtException {
		return !CIM_ComputerSystem.PROPERTY_ENABLEDSTATE.VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled.equals(vm.get_EnabledState());
	}

	
	public String getState() {
		return CIM_ComputerSystem.PROPERTY_ENABLEDSTATE.getValueEntry(vm.get_EnabledState());
	}

	
	/**
	 * get the Virtual system management service
	 * 
	 * @see VMCimAdapter#MANAGED_CONTAINER_PROFILE
	 * 
	 * @param client
	 * @return
	 * @throws WbemsmtException
	 */
	public CIM_VirtualSystemManagementService getVirtualSystemManagementService() throws WbemsmtException {
		return hostSystem.getVirtualSystemManagementService();
	}

	
	public CIM_VirtualSystemMigrationService getVirtualSystemMigrationService() throws WbemsmtException {
		return hostSystem.getVirtualSystemMigrationService();
	}

	
	/**
	 * Can return null if no migration service was found
	 * 
	 * @return
	 * @throws WbemsmtException
	 */
	public CIM_VirtualSystemMigrationCapabilities getVirtualSystemMigrationCapabilities() throws WbemsmtException {
		return hostSystem.getVirtualSystemMigrationCapabilities();
	}

	
	/**
	 * 
	 * @param ipOrHostname
	 * @param postMigrateState
	 * @return
	 * @throws WbemsmtException
	 */
	public boolean isMigratableToHost(String ipOrHostname, String postMigrateState) throws WbemsmtException {
		CIM_VirtualSystemMigrationCapabilities capabilities = getVirtualSystemMigrationCapabilities();
		if (capabilities != null) {
			MethodSupport supported = VMCimAdapter.isMethodSupported(capabilities, VMCimAdapter.METHOD_VIRTUALSYSTEMISMIGRATABLETOHOST);
			if (supported != MethodSupport.NOT_SUPPORTED) {
				CIM_ResourceAllocationSettingData[] newResourceSettingData = null;
				CIM_VirtualSystemMigrationSettingData migrationSettingData = MigrationWizard.getMigrationSettingData(adapter, postMigrateState);
				CIM_VirtualSystemSettingData newSystemSettingData = null;
				Boolean isMigratable = new Boolean(false);
				// where is the Migratable prameter of
				// invoke_virtualSystemIsMigratableToHost

				CIM_VirtualSystemMigrationService service = getVirtualSystemMigrationService();
				// VirtualSystemIsMigratableToHostResult result =
				// service.invoke_VirtualSystemIsMigratableToHost(getCimClient(),
				// null, newResourceSettingData, migrationSettingData,
				// newSystemSettingData, appcontainer, ipOrHostname);
				// int rc = result.getResultObject().intValue();
				// //TODO handle job if asynchronous handling is used
				// if (rc == 0)
				// {
				// return isMigratable.booleanValue();
				// }
				// else
				// {
				// return false;
				// }

			}

		}
		return false;
	}

	
	public boolean isMigratableToSystem(CIM_System targetSystem, String postMigrateState) throws WbemsmtException {
		CIM_VirtualSystemMigrationCapabilities capabilities = getVirtualSystemMigrationCapabilities();
		if (capabilities != null) {
			MethodSupport supported = VMCimAdapter.isMethodSupported(capabilities, VMCimAdapter.METHOD_VIRTUALSYSTEMISMIGRATABLETOSYSTEM);
			if (supported != MethodSupport.NOT_SUPPORTED) {
				CIM_ConcreteJob job = null;

				CIM_ResourceAllocationSettingData[] newResourceSettingData = null;
				CIM_VirtualSystemMigrationSettingData migrationSettingData = MigrationWizard.getMigrationSettingData(adapter, postMigrateState);
				CIM_VirtualSystemSettingData newSystemSettingData = null;
				Boolean isMigratable = new Boolean(false);
				// where is the Migratable prameter of invoke_virtualSystemIsMigratableToSystem

				CIM_VirtualSystemMigrationService service = getVirtualSystemMigrationService();

				// VirtualSystemIsMigratableToSystemResult result = service.invoke_VirtualSystemIsMigratableToSystem(getCimClient(), job, system, newResourceSettingData, migrationSettingData, newSystemSettingData, appcontainer);
				//int rc = result.getResultObject().intValue();
				//TODO handle job if asynchronous handling is used
				// if (rc == 0) {
				// 		return isMigratable.booleanValue();
				// } else {
				// 		return false;
				// }

			}

		}
		return false;
	}

	
	public boolean isCheckMigrationToHostEnabled(String hostname) throws WbemsmtException {
		CIM_VirtualSystemMigrationCapabilities capabilities = getVirtualSystemMigrationCapabilities();
		if (capabilities != null) {
			MethodSupport supported = VMCimAdapter.isMethodSupported(capabilities, VMCimAdapter.METHOD_MIGRATEVIRTUALSYSTEMTOHOST);
			return supported != MethodSupport.NOT_SUPPORTED;
		}
		return false;
	}

	
	public boolean isCheckMigrationToSystemEnabled() throws WbemsmtException {
		CIM_VirtualSystemMigrationCapabilities capabilities = getVirtualSystemMigrationCapabilities();
		if (capabilities != null) {
			MethodSupport supported = VMCimAdapter.isMethodSupported(capabilities, VMCimAdapter.METHOD_MIGRATEVIRTUALSYSTEMTOSYSTEM);
			return supported != MethodSupport.NOT_SUPPORTED;
		}
		return false;
	}

	
	public static CIM_ComputerSystem[] getVMs(String type, CIM_System system, WBEMClient cimClient) throws WbemsmtException {

		try {
			List containers = system.getAssociated_CIM_ManagedElement_CIM_HostedDependencys(cimClient, CIM_ComputerSystem.CIM_CLASS_NAME, null, null);
			List computerSystems = new ArrayList();
			for (Iterator iterator = containers.iterator(); iterator.hasNext();) {
				CIM_ComputerSystem cs = (CIM_ComputerSystem) iterator.next();
				if (VM.isVirtualSystem(cimClient, (CIM_ComputerSystem) cs)) {
					computerSystems.add(cs);
				}
			}
			return (CIM_ComputerSystem[]) computerSystems.toArray(new CIM_ComputerSystem[computerSystems.size()]);
		} catch (WbemsmtException e) {

			if (e.getCause() instanceof WBEMException) {
				logger.log(Level.SEVERE, "Cannot load VMs", e);
				WBEMException e1 = (WBEMException) e.getCause();
				MessageDefinition msgDef = VMErrCodes.MSGDEF_CANNOT_LOAD_VM;
				String[] bundles = VMCimAdapter.RESOURCE_BUNDLE_NAMES;
				Object[] objects = new Object[] { type, e1.toString() };
				MessageUtil.addMessage(msgDef, bundles, objects);
				return new CIM_ComputerSystem[] {};
			} else {
				throw e;
			}
		}
	}

	
	public String getVirtualSystemType() {
		return hostSystem.getVirtualSystemType();
	}

	
	public void updateControls(VMDataContainer container) throws WbemsmtException {

		WbemSmtResourceBundle bundle = adapter.getBundle();
		try {
			container.setKey(new CimObjectKey(vm));
			container.get_VmID().setControlValue(vm.get_Name());

			boolean enabled = isChangeElementNameEnabled();

			container.get_VmName().setControlValue(vm.get_ElementName());
			container.get_VmName().getProperties().setReadOnly(!enabled);

			container.get_Info().setControlValue(vm.get_Caption());

			checkVirtualSystemType(container);

			String status;
			String color;
			if (isRunning()) {
				color = ComponentProperties.COLOR_GREEN;
			} else {
				color = ComponentProperties.COLOR_RED;
			}

			int state = -1;
			if (vm.get_EnabledState() != null) {
				state = vm.get_EnabledState().intValue();
			}

			String key = "EnabledState." + state;
			status = bundle.keyExists(key) ? bundle.getString(key) : bundle.getString("EnabledState.other");

			container.get_EnabledState().setControlValue(status);
			container.get_EnabledState().getProperties().setColor(color);

			state = -1;
			if (vm.get_RequestedState() != null) {
				state = vm.get_RequestedState().intValue();
			}

			key = "RequestedState." + state;
			status = bundle.keyExists(key) ? bundle.getString(key) : bundle.getString("RequestedState.other");

			container.get_RequestedState().setControlValue(status);

		} catch (WbemsmtException e) {
			throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS, e);
		}
	}

	
	public void updateControls(VMConfigDataContainer container) throws WbemsmtException {
		adapter.updateControls(container.getItems(), getVssdPropertyNames());
	}

	
	public List getVssdPropertyNames() throws WbemsmtException {

		if (vssdPropertyNames == null) {
			CIM_VirtualSystemSettingData[] vssds = new CIM_VirtualSystemSettingData[] { getCurrentSettingData(), getNextSettingData(), getDefaultSettingData() };

			vssdPropertyNames = getPropertyNames(vssds, getVirtualSystemType(), VMBusinessObject.TYPE_VIEW);
		}

		return vssdPropertyNames;
	}

	
	public void updateControls(ConfigItemDataContainer container, String propertyName) throws WbemsmtException {

		String classNameCurrent = getCurrentSettingData().getCimInstance().getClassName();
		String classNameNext = getNextSettingData().getCimInstance().getClassName();

		boolean nextAndCurrentAreTheSame = classNameCurrent.equalsIgnoreCase(classNameNext);

		container.get_usr_Name().setControlValue(propertyName);

		CIMClass clsCurrent = null;
		CIMClass clsNext = null;
		CIMClassProperty classProperty = null;

		try {
			clsCurrent = AbstractWbemsmtFcoHelper.getClass(getCimClient(), classNameCurrent, adapter.getNamespace());
			clsNext = AbstractWbemsmtFcoHelper.getClass(getCimClient(), classNameCurrent, adapter.getNamespace());
			classProperty = nextAndCurrentAreTheSame ? clsCurrent.getProperty(propertyName) : clsCurrent.getProperty(propertyName) != null ? clsCurrent.getProperty(propertyName) : clsNext.getProperty(propertyName);

			String description = (String) classProperty.getQualifierValue("Description");
			if (StringUtils.isNotEmpty(description)) {
				// create an image with tooltip based on the Description
				// Qualifier of the CIMClassProperty
				container.get_usr_Info().setControlValue(new PictureData(PictureData.ICON_INFO, new MemoData(description)));
			} else {
				container.get_usr_Info().setControlValue(new PictureData(PictureData.ICON_INFO, new MemoData(adapter.getBundle().getString("no.info"))));
			}
		} catch (WbemsmtException e) {
			logger.log(Level.SEVERE, "Cannot get Class ", e);
			container.get_usr_Info().getProperties().setVisible(false);
		}

		container.get_usr_CurrentValue().setControlValue(FcoUtil.getValueAsString(getCurrentSettingData().getCimInstance(), propertyName, clsCurrent, adapter.getBundle()));
		container.get_usr_NextValue().setControlValue(FcoUtil.getValueAsString(getNextSettingData().getCimInstance(), propertyName, clsNext, adapter.getBundle()));
		container.get_usr_DefaultValue().setControlValue(FcoUtil.getValueAsString(getDefaultSettingData().getCimInstance(), propertyName, clsNext, adapter.getBundle()));

	}

	
	public void updateControls(VMOperationsDataContainer container) throws WbemsmtException {
		String[] values = CIM_EnabledLogicalElementCapabilities.PROPERTY_REQUESTEDSTATESSUPPORTED.getValueEntries(getCapabilities().get_RequestedStatesSupported());
		container.get_usr_Action().setValues(values);
	}

	
	public void updateModel(VMOperationsDataContainer container) throws WbemsmtException {

		if (adapter.getUpdateTrigger() == container.get_usr_Execute()) {
			MessageList result = MessageList.init(container);

			UnsignedInteger16 idx = (UnsignedInteger16) container.get_usr_Action().getConvertedControlValue();
			UnsignedInteger16 requestedState = getCapabilities().get_RequestedStatesSupported()[idx.intValue()];

			requestStateChange(result, requestedState);
		}
	}

	
	/**
	 * returns the number of properties of the vssds that are displayed
	 * 
	 * @return
	 * @throws WbemsmtException
	 * @see #getNextSettingData()
	 * @see #getCurrentSettingData()
	 */
	public int getSettingDataPropertyCount() throws WbemsmtException {
		return getVssdPropertyNames().size();
	}

	
	public void updateControls(ProcessorVMInfoDataContainer container) throws WbemsmtException {

		List model = new ArrayList();
		model.add(getProcessor());
		adapter.updateControls(container.getItems(), model);
	}

	
	public void updateControls(NetworkVMInfoDataContainer container) throws WbemsmtException {
		adapter.updateControls(container.getItems(), getNetworks());
	}

	
	public List getNetworks() throws WbemsmtException {
		if (networks == null && stopPreload()) {
			networks = new ArrayList();
			if (isActive()) {
				// network port obsoletes NetworkAdapter - check for old
				// implementations also
				List networkList = getSystemDevices(new Class[] { CIM_NetworkPort.class, CIM_NetworkAdapter.class });
				for (Iterator iterator = networkList.iterator(); iterator.hasNext();) {
					CIM_LogicalDevice networkFco = (CIM_LogicalDevice) iterator.next();
					List defineStates = networkFco.getAssociated_CIM_SettingData_CIM_SettingsDefineStates(getCimClient(), CIM_ResourceAllocationSettingData.CIM_CLASS_NAME, null, null);
					if (defineStates.size() == 1) {
						CIM_ResourceAllocationSettingData rasd = (CIM_ResourceAllocationSettingData) defineStates.get(0);
						networks.add(getNetworkFromRASD(rasd));
					} else {
						logger.warning("Count of RASD associated through SettingsDefinedState != 1 for " + networkFco.getCimObjectPath() + ". Found " + defineStates.size());
					}
				}
			} else {
				CIM_VirtualSystemSettingData sd = getDefaultSettingData();
				if (sd == null) {
					logger.warning("No default VSSD found for VM " + vm.getCimObjectPath());
				} else {
					List rasds = sd.getAssociated_CIM_ResourceAllocationSettingData_CIM_VirtualSystemSettingDataComponents(getCimClient());
					filterRASDsByResourceType(rasds, VMCimAdapter.RESOURCE_TYPE_ETHERNET);
					if (rasds.size() > 0) {
						for(int i = 0; i < rasds.size(); i++){
							networks.add(getNetworkFromRASD((CIM_ResourceAllocationSettingData) rasds.get(i)));
						}
					} else {
						logger.warning("No Network RASD found on VSSD " + sd.getCimObjectPath() );
					}
				}
			}
		}

		return networks;
	}

	private Network getNetworkFromRASD(CIM_ResourceAllocationSettingData rasd) throws WbemsmtException {
		Network result = new Network();
		result.setAddress(rasd.get_Address());
		result.setRasd(rasd);

		CIM_ResourcePool pool = hostSystem.getReferencedPool(rasd);
		if (pool != null) {
			result.setPoolCaption(pool.get_Caption() != null ? pool.get_Caption() : "no referenced pool");
			result.setPoolId(pool.get_PoolID());
		}

		return result;
	}
	
	private Disk getDiskFromRASD(CIM_ResourceAllocationSettingData rasd) throws WbemsmtException {
		Disk result = new Disk();
		result.setAddress(rasd.get_Address());
		result.setInstanceid(rasd.get_key_InstanceID());
		

		CIM_ResourcePool pool = hostSystem.getReferencedPool(rasd);
		if (pool != null) {
			result.setPoolCaption(pool.get_Caption() != null ? pool.get_Caption() : "no referenced pool");
			result.setPoolId(pool.get_PoolID());
		}
		
		//TODO When It is Fixed, erase the following if statement.
		//If LXC it starts off with MountPoint == null and Virtual Device == MountPoint
		//This fixes it setting the MountPoint correct
		if (this.defaultSettingData.get_VirtualSystemType().equalsIgnoreCase("LXC")){
			CIMProperty[] properties = rasd.getCimInstance().getProperties();
        	for(int i = 0; i < properties.length; i++){
        		if (properties[i].getName().equalsIgnoreCase(MOUNT_POINT) && properties[i].getValue() == null ){
        			properties[i] = new CIMProperty(MOUNT_POINT,CIMDataType.STRING_T, rasd.getCimInstance().getProperty(VIRTUAL_DEVICE).getValue());
        		}
        	}
		}
		
		result.setRasd(rasd);
		return result;
	}

	
	public void updateControls(MemoryVMInfoDataContainer container) throws WbemsmtException {

		List model = new ArrayList();
		model.add(getMemory());
		adapter.updateControls(container.getItems(), model);
	}

	
	public Memory getMemory() throws WbemsmtException {

		if (memory == null && stopPreload()) {			
		
			if (getCurrentSettingData() != null) {
				WBEMClient cc = getCimClient();

				List rasds = currentSettingData.getAssociated_CIM_ResourceAllocationSettingData_CIM_VirtualSystemSettingDataComponents(cc, CIM_ResourceAllocationSettingData.CIM_CLASS_NAME, null, null);
				filterRASDsByResourceType(rasds, VMCimAdapter.RESOURCE_TYPE_MEMORY);
				
				if (rasds.size() > 0) { 
					setMemory((CIM_ResourceAllocationSettingData)rasds.get(0));
				} 
			} 			
			if (memory == null) {				
				setMemory(null); // if Null, Default rasd is set 
			}
		}		
		return memory;
	}

	
	protected void setMemory(CIM_ResourceAllocationSettingData rasd) throws WbemsmtException {
		CIM_ResourceAllocationSettingData sdMin = hostSystem.getMinMemory();
		CIM_ResourceAllocationSettingData sdMax = hostSystem.getMaxMemory();
		CIM_ResourceAllocationSettingData sdDefault = hostSystem.getDefaultMemory();

		memory = new Memory();

		memory.setDefaultValue(getMemoryAsString(sdDefault));
		memory.setMin(getMemoryAsString(sdMin));
		memory.setMax(getMemoryAsString(sdMax));
		if  (rasd == null ) {
			memory.setCurrent(getCurrentMemory(sdDefault));
			memory.setRasd(sdDefault);
		} else {
			memory.setCurrent(getCurrentMemory(rasd));
			memory.setRasd(rasd);
		}
	}

	
	public Processor getProcessor() throws WbemsmtException {

		if (processor == null && stopPreload()) {					
			if (getCurrentSettingData() != null) {
				WBEMClient cc = getCimClient();

				List rasds = currentSettingData.getAssociated_CIM_ResourceAllocationSettingData_CIM_VirtualSystemSettingDataComponents(cc, CIM_ResourceAllocationSettingData.CIM_CLASS_NAME, null, null);
				filterRASDsByResourceType(rasds, VMCimAdapter.RESOURCE_TYPE_CPU);
				
				if (rasds.size() > 0) { 
					setProcessor((CIM_ResourceAllocationSettingData)rasds.get(0));
				}  
			} 
			
			if (processor == null) {
				setProcessor(null);				
			}
		}
		return processor;
	}

	
	protected void setProcessor(CIM_ResourceAllocationSettingData rasd) throws WbemsmtException {
		CIM_ResourceAllocationSettingData sdMin = hostSystem.getMinProcessor();
		CIM_ResourceAllocationSettingData sdMax = hostSystem.getMaxProcessor();
		CIM_ResourceAllocationSettingData sdDefault = hostSystem.getDefaultProcessor();
		CIM_ResourceAllocationSettingData sdWeight = hostSystem.getWeightProcessor();
		CIM_ResourceAllocationSettingData sdLimit = hostSystem.getLimitProcessor();
		
		
		processor = new Processor();

		processor.setDefaultValue(sdDefault != null ? "" + getVirtualQuantity(sdDefault) : "");
		processor.setMin(sdMin != null ? "" + getVirtualQuantity(sdMin) : "");
		processor.setMax(sdMax != null ? "" + getVirtualQuantity(sdMax) : "");
		processor.setWeight(sdWeight != null ? "" + getVirtualQuantity(sdWeight) : "");
		processor.setMax(sdLimit != null ? "" + getVirtualQuantity(sdLimit) : "");
		
		if (rasd == null) {
			processor.setCurrent(getCurrentProcessor(sdDefault));
			processor.setRasd(sdDefault);
		} else {
			processor.setCurrent(getCurrentProcessor(rasd));
			processor.setRasd(rasd);
		}		
	}

	
	public void updateControls(DiskVMInfoDataContainer container) throws WbemsmtException {
		adapter.updateControls(container.getItems(), getDisks());
	}

	
	public List getDisks() throws WbemsmtException {
		if (disks == null && stopPreload()) {
			disks = new ArrayList();
			if (isActive()) {
				List devices = getSystemDevices(new Class[] { CIM_DiskDrive.class, CIM_LogicalDisk.class });
				for (Iterator iterator = devices.iterator(); iterator.hasNext();) {
					CIM_LogicalDevice fco = (CIM_LogicalDevice) iterator.next();
					List defineStates = fco.getAssociated_CIM_SettingData_CIM_SettingsDefineStates(getCimClient(), CIM_ResourceAllocationSettingData.CIM_CLASS_NAME, null, null);
					if (defineStates.size() == 1) {
						CIM_ResourceAllocationSettingData rasd = (CIM_ResourceAllocationSettingData) defineStates.get(0);
						disks.add(getDiskFromRASD(rasd));
					} else {
						logger.warning("Not extactly one RASD associated through SettingsDefinedState found for " + fco.getCimObjectPath() + " Found " + defineStates.size());
					}
				}

			} else {
				CIM_VirtualSystemSettingData sd = getDefaultSettingData();
				if (sd == null) {
					logger.warning("No default VSSD found for VM " + vm.getCimObjectPath());
				} else {
					List rasds = sd.getAssociated_CIM_ResourceAllocationSettingData_CIM_VirtualSystemSettingDataComponents(getCimClient());
					filterRASDsByResourceType(rasds, VMCimAdapter.RESOURCE_TYPE_DISK);
					if (rasds.size() > 0) {
						for(int i = 0; i < rasds.size(); i++){
							disks.add(getDiskFromRASD((CIM_ResourceAllocationSettingData) rasds.get(i)));
						}
					} else {
						logger.warning("Not extactly one DiskDrive RASD found on VSSD " + sd.getCimObjectPath() + " Found " + rasds.size());
					}
				}
			}
		}

		return disks;
	}

	
	public void updateControls(ProcessorVMInfoItemDataContainer container, Processor fco) {

		container.get_usr_DefaultValue().setControlValue(fco.getDefaultValue());
		container.get_usr_Min().setControlValue(fco.getMin());
		container.get_usr_Max().setControlValue(fco.getMax());
		container.get_usr_Current().setControlValue(fco.getCurrent());
		container.get_usr_Weight ().setControlValue(fco.getWeight ());
		container.get_usr_Limit ().setControlValue(fco.getLimit ());
	}

	
	public void updateControls(DiskVMInfoItemDataContainer container, Disk fco) {

		container.get_InstanceID().setControlValue(fco.getInstanceid());
		container.get_Address().setControlValue(fco.getAddress());
		container.get_usr_Info().setControlValue(fco.getPoolCaption());
	}

	
	public void updateControls(MemoryVMInfoItemDataContainer container, Memory memory) throws WbemsmtException {

		container.get_usr_DefaultValue().setControlValue(memory.getDefaultValue());
		container.get_usr_Min().setControlValue(memory.getMin());
		container.get_usr_Max().setControlValue(memory.getMax());
		container.get_usr_Current().setControlValue(memory.getCurrent());
	}

	
	public void updateControls(NetworkVMInfoItemDataContainer container, Network fco) {
		container.get_Address().setControlValue(fco.getAddress());
		container.get_usr_Info().setControlValue(fco.getPoolCaption());
	}

	
	/**
	 * If the system is active the approach as desribed in DSP1045 chapter 9.2.1
	 * is taken<br>
	 * If the system is in defined state the approach as desribed in DSP1045
	 * chapter 9.2.2 is taken<br>
	 * 
	 * @return
	 * @throws WbemsmtException
	 */
	private String getCurrentMemory() throws WbemsmtException {

		if (currentMemory != null) {
			return currentMemory;
		}

		double sum = 0.0;
		if (isActive()) {
			List memoryList = getSystemDevices(new Class[] { CIM_Memory.class });
			for (Iterator iterator = memoryList.iterator(); iterator.hasNext();) {
				CIM_Memory memory = (CIM_Memory) iterator.next();
				sum = sum + memory.get_BlockSize().longValue() * memory.get_NumberOfBlocks().longValue();
			}
			currentMemory = getQuantityFromBytes(sum);
		} else {
			CIM_VirtualSystemSettingData sd = getDefaultSettingData();
			if (sd == null) {
				logger.warning("No default VSSD found for VM " + vm.getCimObjectPath());
				currentMemory = "-";
			} else {
				List rasds = sd.getAssociated_CIM_ResourceAllocationSettingData_CIM_VirtualSystemSettingDataComponents(getCimClient());
				filterRASDsByResourceType(rasds, VMCimAdapter.RESOURCE_TYPE_MEMORY);
				currentMemory = getMemoryAsString((CIM_ResourceAllocationSettingData[]) rasds.toArray(new CIM_ResourceAllocationSettingData[rasds.size()]));
			}
		}

		return currentMemory;
	}
	

	private String getCurrentMemory(CIM_ResourceAllocationSettingData rasd) throws WbemsmtException {
		CIM_ResourceAllocationSettingData[] rasds = { rasd };
		return getMemoryAsString(rasds);
	}

	
	private String getCurrentProcessor(CIM_ResourceAllocationSettingData rasd) throws WbemsmtException {
		CIM_ResourceAllocationSettingData[] rasds = { rasd };
		return getProcessorAsString(rasds);
	}

	
	private String getCurrentProcessor() throws WbemsmtException {

		if (currentProcessor != null) {
			return currentProcessor;
		}

		if (isActive()) {
			List processorList = getSystemDevices(new Class[] { CIM_Processor.class });
			currentProcessor = "" + processorList.size();
		} else {
			CIM_VirtualSystemSettingData sd = getDefaultSettingData();
			if (sd == null) {
				logger.warning("No default VSSD found for VM " + vm.getCimObjectPath());
				currentProcessor = "-";
			} else {
				List rasds = sd.getAssociated_CIM_ResourceAllocationSettingData_CIM_VirtualSystemSettingDataComponents(getCimClient());
				filterRASDsByResourceType(rasds, VMCimAdapter.RESOURCE_TYPE_CPU);
				currentProcessor = getProcessorAsString((CIM_ResourceAllocationSettingData[]) rasds.toArray(new CIM_ResourceAllocationSettingData[rasds.size()]));
			}
		}
		return currentProcessor;
	}

	
	/**
	 * removes all the RASDs from the list "rasds" that are having the wrong
	 * resource Type
	 * 
	 * @param rasds
	 *            the List to be filtered
	 * @param resourceType
	 *            only RASDs with that resource Type are included in the liste
	 */
	private void filterRASDsByResourceType(List rasds, UnsignedInteger16 resourceType) {
		for (int i = rasds.size() - 1; i >= 0; i--) {
			CIM_ResourceAllocationSettingData rasd = (CIM_ResourceAllocationSettingData) rasds.get(i);
			if (rasd.get_ResourceType().intValue() != resourceType.intValue()) {
				rasds.remove(i);
			}
		}
	}

	
	/**
	 * checks if the computerSystem is a virtual system by getting all the
	 * registeredProfiles (through the ElementConformsTpProfile) association and
	 * checking if the list with the<br>
	 * profiles contains the VirtualSystemProfile
	 * 
	 * @param cimClient
	 * @param element
	 * @return
	 * @throws WbemsmtException
	 */
	private static boolean isVirtualSystem(WBEMClient cimClient, CIM_ComputerSystem element) throws WbemsmtException {

		List profiles = element.getAssociated_CIM_RegisteredProfile_CIM_ElementConformsToProfiles(cimClient);
		for (Iterator iterator = profiles.iterator(); iterator.hasNext();) {
			CIM_RegisteredProfile profile = (CIM_RegisteredProfile) iterator.next();
			if (VMCimAdapter.isVirtualSystemProfile(profile)) {
				return true;
			}
		}

		return false;
	}

	
	/**
	 * After invoking request state change vm is reloaded, all dependent objects
	 * are cleared and preload is triggered
	 * 
	 * @param messageList
	 *            if null no message is added
	 * @param state
	 * @throws WbemsmtException
	 * @return true if the statechange was successful
	 * @see {@link org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ComputerSystem#invoke_RequestStateChange(WBEMClient, UnsignedInteger16, CIMDateTime)}
	 */
	public boolean requestStateChange(MessageList messageList, UnsignedInteger16 state) throws WbemsmtException {

		// remove the current state from the session
		WbemsmtSession.getSession().removeAttribute(VMCimAdapter.getContainerStateSessionKey(vm));

		String stateText = CIM_EnabledLogicalElement.PROPERTY_REQUESTEDSTATE.getValueEntry(state);

		RequestStateChangeResult result = vm.invoke_RequestStateChange(getCimClient(), state, new CIMDateTimeInterval(0));

		UnsignedInteger32 resultObject = result.getResultObject();
		if (resultObject == null) {
			Message msg = Message.create(VMErrCodes.MSGDEF_NO_RETURN_VALUE, adapter.getBundle(), new Object[] { CIM_EnabledLogicalElement.METHOD_REQUESTSTATECHANGE.NAME, vm.getCimObjectPath() });
			logger.severe(msg.getMessageString());
			if (messageList != null)
				messageList.addMessage(msg);
			return false;
		}

		int rc = resultObject.intValue();
		String rcText = CIM_EnabledLogicalElement.METHOD_REQUESTSTATECHANGE.getValueEntry(resultObject);

		if (rc == CIM_EnabledLogicalElement.METHOD_REQUESTSTATECHANGE.VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error.intValue()) {
			// do nothing special
		} else if (rc == CIM_EnabledLogicalElement.METHOD_REQUESTSTATECHANGE.VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started.intValue()) {
			CIM_ConcreteJob job = result.get_Job();
			boolean ok = waitForJob(messageList, job);
			if (!ok) {
				Message msg = Message.create(VMErrCodes.MSGDEF_STATECHANGE_FAILED, adapter.getBundle(), new Object[] { stateText, job.get_ErrorDescription() != null ? job.get_ErrorDescription() : "" });
				logger.severe(msg.getMessageString());
				if (messageList != null)
					messageList.addMessage(msg);
				return false;

			}
		} else {
			Message msg = Message.create(VMErrCodes.MSGDEF_STATECHANGE_FAILED, adapter.getBundle(), new Object[] { stateText, adapter.getBundle().getString("method.returned", rcText) });
			logger.severe(msg.getMessageString());
			if (messageList != null)
				messageList.addMessage(msg);
			return false;
		}

		//vm = CIM_ComputerSystemHelper.getInstance(getCimClient(), vm.getCimInstance());
		vm = (CIM_ComputerSystem) adapter.getFcoHelper().reload(vm, getCimClient());
		
		Message msg = Message.create(VMErrCodes.MSGDEF_STATECHANGE_SUCCESS, adapter.getBundle(), new Object[] { CIM_EnabledLogicalElement.PROPERTY_ENABLEDSTATE.getValueEntry(vm.get_EnabledState()) });
		logger.severe(msg.getMessageString());
		if (messageList != null)
			messageList.addMessage(msg);
		//clear();
		//preload();
		reload();
		adapter.setMarkedForReload();
		adapter.setPathOfTreeNode(vm.getCimObjectPath());
		return true;
	}
	

	public int getCount() {
		return count;
	}

	
	public List getSystemDevices() throws WbemsmtException {
		if (systemDevices == null) {
			systemDevices = vm.getAssociated_CIM_LogicalDevice_CIM_SystemDevices(getCimClient());
		}
		return systemDevices;
	}

	
	/**
	 * get All SystemDevices
	 * 
	 * @param filterClasses
	 *            include only thos that are subclasses or instancs of these
	 *            classes, for null all systemDevices are returned
	 * @return
	 * @throws WbemsmtException
	 */
	public List getSystemDevices(final Class[] filterClasses) throws WbemsmtException {
		List result = new ArrayList();
		result.addAll(getSystemDevices());

		if (filterClasses != null) {
			CollectionUtils.filter(result, new Predicate() {

				public boolean evaluate(Object arg0) {

					for (int i = 0; i < filterClasses.length; i++) {
						Class cls = filterClasses[i];
						if (cls.isAssignableFrom(arg0.getClass())) {
							return true;
						}
					}

					return false;
				}
			});
		}

		return result;
	}

	
	public HostSystem getHostSystem() {
		return hostSystem;
	}

}
