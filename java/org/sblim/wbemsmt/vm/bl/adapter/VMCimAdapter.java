 /** 
  * MetaclusterCimAdapter.java
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
  * Description: Adapter for Metacluster BusinessLogic
  * 
  */

package org.sblim.wbemsmt.vm.bl.adapter;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.cim.CIMInstance;
import javax.cim.CIMObjectPath;
import javax.cim.UnsignedInteger16;
import javax.wbem.client.WBEMClient;
import javax.wbem.listener.IndicationListener;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.bl.fco.FcoHelper;
import org.sblim.wbemsmt.bl.profiles.ProfileVersion;
import org.sblim.wbemsmt.bl.tree.ICIMInstanceNode;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.InstanceNodeFilter;
import org.sblim.wbemsmt.cim.CIMClientPool;
import org.sblim.wbemsmt.cim.indication.HttpServerConnectionManager;
import org.sblim.wbemsmt.cim.indication.IndicationDestination;
import org.sblim.wbemsmt.cim.indication.IndicationDestinationManager;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.session.WbemsmtSession;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.vm.bl.adapter.delegatee.*;
import org.sblim.wbemsmt.vm.bl.wrapper.list.HostSystemList;
import org.sblim.wbemsmt.vm.bl.wrapper.list.VMList;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.HostSystem;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VM;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.*;
import org.sblim.wbemsmt.vm.container.edit.VMOverviewItemDataContainer;
import org.sblim.wbemsmt.vm.schema.cim_2_17.*;

public class VMCimAdapter extends AbstractBaseCimAdapter implements IndicationListener {

    public static final String PREFIX_CONTAINER_STATE = "vm.container.state.";
    public static final String ACTIVE_CONTAINERS = "vm.activeContainers";
    public static final String ACTIVE_CONTAINERS_CLIENTS = "vm.activeContainers.clients";

    // Constant for LXC profile
    private static final String PROFILE = "LXC_RegisteredProfile";
    
    //TODO for slp lookup use RegisteredProfilesSupported=DMTF:Virtual System Profile
	
	//TODO should we search for IBM* Profiles or for DMTF* Profile
	public static final UnsignedInteger16 ORGID_SVP = CIM_RegisteredProfile.PROPERTY_REGISTEREDORGANIZATION.VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DMTF;
	public static final UnsignedInteger16 ORGID_VSMP = CIM_RegisteredProfile.PROPERTY_REGISTEREDORGANIZATION.VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DMTF;
	public static final UnsignedInteger16 ORGID_VSP = CIM_RegisteredProfile.PROPERTY_REGISTEREDORGANIZATION.VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DMTF;
	
	public static final ProfileVersion VERSION_SVP = new ProfileVersion(1,0,0);
	public static final ProfileVersion VERSION_VSMP = new ProfileVersion(1,0,0);
	public static final ProfileVersion VERSION_VSP = new ProfileVersion(1,0,0);
	
	public static String NAME_SVP = "System Virtualization";
	public static String NAME_VSMP = "Virtual System Migration";
	public static String NAME_VSP = "Virtual System Profile";

	public static String CONFIG_KEY_PRESET_FOR_DESTINATION_URL = "presetForDestinationUrl";
	public static String CONFIG_KEY_INDICATION_LIST_MAX_LENGTH = "indicationListMaxLength";
	public static String CONFIG_KEY_PRELOAD_HOST_SYSTEM = "preloadHostSystem";
    public static String CONFIG_KEY_PRELOAD_VM = "preloadVM";
    public static String CONFIG_KEY_PRELOAD_USES_NEW_CLIENTS = "preloadUsesNewClients";
	
	public static String FILTER_COLLECTION_NAME_OPTIONAL = "DMTF:Conditional/Optional";
	public static String FILTER_COLLECTION_NAME_ALERT = "DMTF:Alert";
	
	public static int DEFAULT_INDICATION_LIST_MAX_LENGTH = 20;
	
	public final static UnsignedInteger16 METHOD_MIGRATEVIRTUALSYSTEMTOHOST = CIM_VirtualSystemMigrationCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MigrateVirtualSystemToHostSupported;
	public final static UnsignedInteger16 METHOD_MIGRATEVIRTUALSYSTEMTOSYSTEM = CIM_VirtualSystemMigrationCapabilities.PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_MigrateVirtualSystemToSystemSupported;
	public final static UnsignedInteger16 METHOD_VIRTUALSYSTEMISMIGRATABLETOHOST = CIM_VirtualSystemMigrationCapabilities.PROPERTY_SYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CheckVirtualSystemIsMigratableToHostSupported;
	public final static UnsignedInteger16 METHOD_VIRTUALSYSTEMISMIGRATABLETOSYSTEM = CIM_VirtualSystemMigrationCapabilities.PROPERTY_SYNCHRONOUSMETHODSSUPPORTED.VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_CheckVirtualSystemIsMigratableToSystemSupported;
	
	public final static int SUPPORED_NO_SUPPORT = 0;
	public final static int SUPPORED_NO_SYNC = 1;
	public final static int SUPPORED_NO_ASYNC = 2;
	
	public static final String[] RESOURCE_BUNDLE_NAMES = new String[]{"messages","messagesVm"};
	
	public static final String METACLUSTER_NAMESPACE = "/root/cimv2";
	public static final String INTEROP_NAMESPACE = "/root/PG_InterOp";
	
	public static final String METACLUSTER_TASKNAME = "VM";

	/**
	 * Defines the type of a Node
	 */
    public static final String NODE_TYPE = "nodeType";

    /**
     * Used as type if the Node represents a HOSTSYSTEM
     */
    public static final String NODE_TYPE_HOSTSYSTEM = "hostSystem";
    /**
     * Used as type if the Node represents a VM
     */
    public static final String NODE_TYPE_VM = "vm";
    
    /**
     * Used within the node as virtualSystemType
     */
    public static final String VIRTUAL_SYSTEM_TYPE = "vsType";

    InstanceNodeFilter instanceNodeFilterHostSystem = new InstanceNodeFilter()
    {
        public boolean accept(ICIMInstanceNode node)
        {
            return node.getValue(NODE_TYPE) == NODE_TYPE_HOSTSYSTEM;
            
        }
    };

    InstanceNodeFilter instanceNodeFilterVm = new InstanceNodeFilter()
    {
        public boolean accept(ICIMInstanceNode node)
        {
            return node.getValue(NODE_TYPE) == NODE_TYPE_VM;
            
        }
    };
   
	
	private VMSelectionHierarchy selectionHierarchy = new VMSelectionHierarchy();

	
	static Logger logger = Logger.getLogger(VMCimAdapter.class.getName());
	private String interOpNamespace = INTEROP_NAMESPACE;
	private CreateDelegatee createDelegatee;
	private SaveDelegatee saveDelegatee;
	private RevertDelegatee revertDelegatee;
	private DeleteDelegatee deleteDelegatee;
	private UpdateControlsDelegatee updateControlsDelegatee;
	private UpdateModelDelegatee updateModelDelegatee;
	private CountDelegatee countDelegatee;
	private InstallValidatorsDelegatee installValidatorsDelegatee;
	private InitWizardDelegatee initWizardDelegatee;
	private InitContainerDelegatee initContainerDelegatee;
	
	private VM selectedVM;
	
	private HostSystemList hostSystems = new HostSystemList();
	private VMList allVMList = new VMList();

	private VMWizard hostedSystemWizard;
    private ChangeVMSettingsWizard changeSettingsWizard;
	private MigrationWizard migrationWizard;

	private boolean subscriptionsDone;
	private IndicationDestination indicationDestination;
	private CIM_ListenerDestinationCIMXML ourDestination;
    private HostSystem selectedHostSystem;
    private VMBaseWizard activeWizard;
    private VMCliWizard vmCliWizard;
    public static final UnsignedInteger16 RESOURCE_TYPE_CPU = CIM_ResourceAllocationSettingData.PROPERTY_RESOURCETYPE.VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Processor;
    public static final UnsignedInteger16 RESOURCE_TYPE_DISK = CIM_ResourceAllocationSettingData.PROPERTY_RESOURCETYPE.VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Disk_Drive;
    public static final UnsignedInteger16 RESOURCE_TYPE_ETHERNET = CIM_ResourceAllocationSettingData.PROPERTY_RESOURCETYPE.VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Ethernet_Adapter;
    public static final UnsignedInteger16 RESOURCE_TYPE_MEMORY = CIM_ResourceAllocationSettingData.PROPERTY_RESOURCETYPE.VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Memory;
    
	public VMCimAdapter(Locale locale) throws WbemsmtException {
		super();
		
		init(ResourceBundleManager.getResourceBundle(RESOURCE_BUNDLE_NAMES,locale),selectionHierarchy, new FcoHelper());
		
		/**
		 * Only ignore changes in the InstanceMof-Mode
		 */
		getFcoHelper().setNotifyChanges(true);
		
		selectionHierarchy.setAdapter(this);
		
		createDelegatee = new VMCimAdapterCreateDelegatee(this);
		saveDelegatee = new VMCimAdapterSaveDelegatee(this);
		revertDelegatee = new VMCimAdapterRevertDelegatee(this);
		deleteDelegatee = new VMCimAdapterDeleteDelegatee(this);
		updateControlsDelegatee = new VMCimAdapterUpdateControlsDelegatee(this);
		updateModelDelegatee = new VMCimAdapterUpdateModelDelegatee(this);
		countDelegatee = new VMCimAdapterCountDelegatee(this);
		installValidatorsDelegatee = new VMCimAdapterInstallValidatorsDelegatee(this);
		initWizardDelegatee = new VMCimAdapterInitWizardDelegatee(this);
		initContainerDelegatee = new VMCimAdapterInitContainerDelegatee(this);

		hostedSystemWizard =  new VMWizard(this);
		vmCliWizard = new VMCliWizard(this);
		changeSettingsWizard = new ChangeVMSettingsWizard(this);
		migrationWizard = new MigrationWizard(this);
	}

	public void reLoad(WBEMClient cimClient) throws WbemsmtException
	{
		loaded = false;
		load(cimClient);
	}

	public void load(WBEMClient cimClient) throws WbemsmtException {
		
		if (loaded)
			return;
		hostSystems.clear();
        allVMList.clear();
		setCimClient(cimClient);

		//check if there is more than one virtualsystemManagementService found for one virtual system type
		Map hostsByType = HostSystem.getHostSystemsByVirtualSystemType(cimClient,getInterOpNamespace());
		
		int count = 0;
		
		for (Iterator iterator = hostsByType.keySet().iterator(); iterator.hasNext();) {
            String type = (String) iterator.next();
            CIM_System system = (CIM_System) hostsByType.get(type);

            HostSystem hostSystem = new HostSystem(this,system,type);
            
            CIM_ComputerSystem[] vms = VM.getVMs(type,system, getCimClient());
            for (int j = 0; j < vms.length; j++) {
                VM vm = new VM(this,vms[j],hostSystem, count++);
                hostSystem.getVmList().addVM(vm);
                allVMList.addVM(vm);
            }

            hostSystems.addHostSystem(hostSystem);
            
        }
		
	
		loaded = true;
	}
	
	public void loadInitial(WBEMClient cimClient) throws WbemsmtException
	{
		if (getCimClient() == null)
		{
			setCimClient(cimClient);
		}
		
		load(getCimClient());
	}

	public void reLoad(ITaskLauncherTreeNode rootNode) throws WbemsmtException {
		loaded = false;
		load(rootNode);
	}

	public void load(ITaskLauncherTreeNode rootNode) throws WbemsmtException {
		try {
			if (loaded == true)
				return;
			hostSystems.clear();
			allVMList.clear();
			
			this.rootNode = rootNode;
			setCimClient(rootNode.getCimClient());

            List nodes = rootNode.findInstanceNodes(instanceNodeFilterHostSystem);
			
            int count = 0;
            
			for (Iterator iter = nodes.iterator(); iter.hasNext();) {
				ICIMInstanceNode node = (ICIMInstanceNode) iter.next();
				CIM_System fco = CIM_SystemHelper.getInstance(getCimClient(), node.getCimInstance());
				HostSystem hostSystem = new HostSystem(this,fco, (String)node.getValue(VIRTUAL_SYSTEM_TYPE));
                hostSystems.addHostSystem(hostSystem);
				
	            List vmNodes = node.findInstanceNodes(instanceNodeFilterVm);
	            
	            for (Iterator iter1 = vmNodes.iterator(); iter1.hasNext();) {
	                ICIMInstanceNode vmnode = (ICIMInstanceNode) iter1.next();
	                VM vm = new VM(this,CIM_ComputerSystemHelper.getInstance(getCimClient(), vmnode.getCimInstance()),hostSystem, count++);
                    hostSystem.getVmList().addVM(vm);
                    allVMList.addVM(vm);
	                hostSystems.addHostSystem(hostSystem);
	            }
				
			}
			selectionHierarchy.clear();

			loaded = true;
			

		} catch (Exception e) {
			throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,e);
		}
	}
	
	public void subscribeForIndications(VM container) throws WbemsmtException
	{
		String preset = getConfigurationValue(CONFIG_KEY_PRESET_FOR_DESTINATION_URL);
		if (preset != null)
		{
			if (!subscriptionsDone)
			{
				try {
					indicationDestination = IndicationDestinationManager.getCurrent().getIndicationDestination(preset);
					HttpServerConnectionManager.getInstance().addListener(this, indicationDestination);
				} catch (IOException e) {
					throw new WbemsmtException(WbemsmtException.ERR_INDICATION_PREPARATION,"Cannot add CIMListener",e);
				} 
				
				ourDestination = getDestination(getFcoHelper(),getCimClient(),getInterOpNamespace(), indicationDestination);
				
				CIM_VirtualSystemMigrationService migrationService = container.getVirtualSystemMigrationService();
				
				if (migrationService != null)
				{
					List profiles = null;
					profiles = migrationService.getAssociated_CIM_RegisteredProfile_CIM_ElementConformsToProfiles(cimClient);
                    for (int i = profiles.size() - 1; i >= 0; i--) {
                    	CIM_RegisteredProfile profile = (CIM_RegisteredProfile) profiles.get(i);
                    	if (!(isVirtualSystemMigrationProfile(profile)))
                    	{
                    		profiles.remove(i);
                    	}
                    }
					if (profiles.size() == 1)
					{
						CIM_RegisteredProfile profile = (CIM_RegisteredProfile) profiles.get(0);
						try {
							subscribe_none_vsmp_072(getFcoHelper(),getCimClient(), getInterOpNamespace(), ourDestination, profile);
						} catch (Exception e) {
							throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,e);
						}
					}
					else
					{
						logger.severe("No indication subscriptions installed - not exactly one migration profile was found. Found " + profiles.size());
					}
				}
				subscriptionsDone = true;
			}
		}
	}

	/**
	 * get the Destination
	 * @param fcoHelper
	 * @param cimClient
	 * @param interOpNamespace
	 * @param indicationDestination the destination which contains the URL to search for
	 * @return
	 * @throws WbemsmtException
	 */
	public static CIM_ListenerDestinationCIMXML getDestination(FcoHelper fcoHelper, WBEMClient cimClient, String interOpNamespace, IndicationDestination indicationDestination) throws WbemsmtException {
		//create the subscriptions
		
		CIM_ListenerDestinationCIMXML ourDestination = null;
        
        List destinations = CIM_ListenerDestinationHelper.enumerateInstances(cimClient,interOpNamespace,true);
        for (Iterator iterator = destinations.iterator(); iterator.hasNext() && ourDestination == null;) {
        	CIM_ListenerDestination destination = (CIM_ListenerDestination) iterator.next();
        	if (destination instanceof CIM_ListenerDestinationCIMXML) {
        		CIM_ListenerDestinationCIMXML xmlDestination = (CIM_ListenerDestinationCIMXML) destination;
        		if (xmlDestination.get_Destination().equals(indicationDestination.getCalculatedUrlString()))
        		{
        			ourDestination =  xmlDestination;
        		}
        		
        	}
        }
        if (ourDestination == null)
        {
        	ourDestination = new CIM_ListenerDestinationCIMXML(cimClient,interOpNamespace);
        	ourDestination.set_key_Name("CIM_ListenerDestinationCIMXML for " + indicationDestination.getCalculatedUrlString());
        	ourDestination.set_PersistenceType(CIM_ListenerDestinationCIMXML.PROPERTY_PERSISTENCETYPE.VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Permanent);
        	ourDestination.set_Destination(indicationDestination.getCalculatedUrlString());
        	ourDestination = (CIM_ListenerDestinationCIMXML) fcoHelper.create(ourDestination, cimClient);
        }
        
        return ourDestination;
	}

	public static void subscribe_none_vsmp_072(FcoHelper fcoHelper, WBEMClient cimClient, String interOpNamespace, CIM_ListenerDestinationCIMXML ourDestination,CIM_RegisteredProfile profile) throws WbemsmtException {
	
		removeSubscriptions(fcoHelper,cimClient,ourDestination);
	
		//create the the filters and the subscriptions 
		createSubscription(fcoHelper,cimClient,interOpNamespace, ourDestination, "LxC_ComputerSystemModification");
		createSubscription(fcoHelper,cimClient,interOpNamespace, ourDestination, "LxC_ComputerSystemCreation");
		createSubscription(fcoHelper,cimClient,interOpNamespace, ourDestination, "LxC_ComputerSystemDeletion");
	}

	private static void removeSubscriptions(FcoHelper fcoHelper, WBEMClient cimClient, CIM_ListenerDestinationCIMXML ourDestination)	throws WbemsmtException {
		
		logger.info("Remove subscriptions for Destination " + (ourDestination != null ? ourDestination.getCimObjectPath().toString() : null));
		
		if (ourDestination != null)
		{
			List subscriptions = ourDestination.getAssociations_CIM_IndicationSubscription(cimClient, false, false, null, null);
            for (Iterator iterator = subscriptions.iterator(); iterator.hasNext();) {
            	CIM_IndicationSubscription subscription = (CIM_IndicationSubscription) iterator.next();
                CIM_IndicationFilter filter = subscription.get_Filter_CIM_IndicationFilter(cimClient);
                
                fcoHelper.delete(subscription, cimClient);
                fcoHelper.delete(filter, cimClient);
            }
		}
	}

	private static void createSubscription(FcoHelper fcoHelper, WBEMClient cimClientInterop, String namespaceInterop, CIM_ListenerDestinationCIMXML ourDestination, String indicationClass)
			throws WbemsmtException {
		CIM_IndicationFilter filter = new CIM_IndicationFilter(cimClientInterop,namespaceInterop);
        filter.set_Query("Select * from " + indicationClass);
        filter.set_QueryLanguage("CIM:CQL");
        filter.set_key_SystemName(ourDestination.get_key_SystemName());
        filter.set_key_Name(indicationClass + " for " + ourDestination.get_Destination());
        filter.set_Description("Indication for Metacluster task");
        filter.set_key_CreationClassName("CIM_IndicationFilter");
        filter.set_key_SystemCreationClassName("CIM_ComputerSystem");
        filter.set_SourceNamespace(namespaceInterop);
        
        filter = (CIM_IndicationFilter) fcoHelper.create(filter, cimClientInterop);
        
        CIM_IndicationSubscription subscription = new CIM_IndicationSubscription(cimClientInterop,namespaceInterop);
        subscription.set_Filter_CIM_IndicationFilter(filter);
        subscription.set_Handler_CIM_ListenerDestination(ourDestination);
        subscription.set_OnFatalErrorPolicy(CIM_IndicationSubscription.PROPERTY_ONFATALERRORPOLICY.VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Ignore);
        subscription = (CIM_IndicationSubscription) fcoHelper.create(subscription, cimClientInterop);
	}
	
	/**
	 * Create Subscriptions
	 * @param ourDestination 
	 * @param profile the registered profile to which the indications belonging
	 * @throws WbemsmtException
	 */
	protected void subscribe_vsmp_072(CIM_ListenerDestinationCIMXML ourDestination,CIM_RegisteredProfile profile) throws WbemsmtException {
		List dependencys = profile.getAssociated_CIM_ManagedElement_CIM_ConcreteDependencys(getCimClient(), CIM_FilterCollection.CIM_CLASS_NAME,null,null);
        for (Iterator iterator = dependencys.iterator(); iterator.hasNext();) {
        	CIM_FilterCollection filterCollection = (CIM_FilterCollection) iterator.next();
            if (filterCollection.get_CollectionName().equals(FILTER_COLLECTION_NAME_ALERT)
            	|| filterCollection.get_CollectionName().equals(FILTER_COLLECTION_NAME_OPTIONAL)
            )
            {
            	boolean foundSubscription = false;
            	//check if we have already subscribed
            	List subscriptions = filterCollection.getAssociations_CIM_FilterCollectionSubscription(getCimClient(), false, false, null, null);
            	for (Iterator iterator2 = subscriptions.iterator(); iterator2.hasNext() && !foundSubscription;) {
            		CIM_FilterCollectionSubscription subscription = (CIM_FilterCollectionSubscription) iterator2.next();
            		if (subscription.get_Handler_CIM_ListenerDestination(getCimClient()).getCimObjectPath().toString().equals(ourDestination.getCimObjectPath().toString()))
            		{
            			foundSubscription = true;
            		}
            	}
            	if (!foundSubscription)
            	{
            		CIM_FilterCollectionSubscription subscription = new CIM_FilterCollectionSubscription(getCimClient(),interOpNamespace);
            		subscription.set_Filter_CIM_FilterCollection(filterCollection);
            		subscription.set_Handler_CIM_ListenerDestination(ourDestination);
            		subscription.set_OnFatalErrorPolicy(CIM_FilterCollectionSubscription.PROPERTY_ONFATALERRORPOLICY.VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Ignore);
            		subscription = (CIM_FilterCollectionSubscription) getFcoHelper().create(subscription, getCimClient());
            	}
            }
            else
            {
            	logger.severe("Unknown FilterCollection " + filterCollection.getCimObjectPath() + " and collectionName " + filterCollection.get_CollectionName());
            }
        }
	}

	public CimObjectKey getKeyByTreeNode(ITaskLauncherTreeNode treeNode) throws WbemsmtException {

		if (treeNode instanceof ICIMInstanceNode) {
			ICIMInstanceNode node = (ICIMInstanceNode) treeNode;
			if (instanceNodeFilterHostSystem.accept(node))
			{
				CimObjectKey key = new CimObjectKey(node);
				return key;
			}
            if (instanceNodeFilterVm.accept(node))
            {
                CimObjectKey hostSystemKey = new CimObjectKey((ICIMInstanceNode) node.getParent());
                CimObjectKey key = new CimObjectKey(node);
                
                hostSystemKey.setNextKey(key);
                
                return hostSystemKey;
            }
		}
		return null;
	}

	public String[] getResourceBundleNames() {
		return RESOURCE_BUNDLE_NAMES;
	}

	public boolean select_0_CIM_System(CimObjectKey key)
	{
		HostSystem host = hostSystems.getHostSystem(key.getObjectPath());
		//if hostSystem was not found try to reload
		if (host == null)
		{
			try {
				CIM_System fco = CIM_SystemHelper.getInstance(cimClient,key.getObjectPath());
				if (fco != null)
				{
				    String[] types = HostSystem.getVirtualSystemTypes(fco, cimClient);
				    Set typeSet = new HashSet();
				    typeSet.addAll(Arrays.asList(types));
				    
				    for (int i=0; i < hostSystems.size(); i++)
				    {
				        typeSet.remove(hostSystems.getHostedSystem(i).getVirtualSystemType());
				    }
				    
				    if (typeSet.size() == 1)
				    {
				        host = new HostSystem(this,fco,(String) typeSet.iterator().next());
				        hostSystems.addHostSystem(host);
				        selectionHierarchy.add(host);
				        return true;
				    }
				    else if (typeSet.size() > 1)
				    {
				        logger.warning("More than one VirtualSystemType found for HostSystem " + fco.getCimObjectPath() + " which is not already registered by an other host system");
				    }
                    else
                    {
                        logger.warning("No VirtualSystemType found for HostSystem " + fco.getCimObjectPath() + " which is not already registered by an other host system");
                    }
				    
				}
			} catch (Exception e) {
				logger.log(Level.SEVERE,"Cannot select HostSystem with key " + key.toString(),e);
			}
			
			return false;
		}
		else
		{
			selectionHierarchy.add(host);
			return true;
		}
	}
	
    public boolean select_1_CIM_ComputerSystem(CimObjectKey key) throws WbemsmtException
    {
        VM vm = getSelectedHostSystem().getVmList().getVM(key.getObjectPath());
        //if hostSystem was not found try to reload
        if (vm == null)
        {
            try {
                CIM_ComputerSystem fco = CIM_ComputerSystemHelper.getInstance(cimClient,key.getObjectPath());
                if (fco != null)
                {
                    vm = new VM(this,fco,getSelectedHostSystem(),getAllVMList().size());
                    getSelectedHostSystem().getVmList().addVM(vm);
                    selectionHierarchy.add(vm);
                    return true;
                }
            } catch (Exception e) {
                logger.log(Level.SEVERE,"Cannot select VM with key " + key.toString(),e);
            }
            
            return false;
        }
        else
        {
            selectionHierarchy.add(vm);
            return true;
        }
    }

    public CreateDelegatee getCreateDelegatee() {
		return createDelegatee;
	}

	public SaveDelegatee getSaveDelegatee() {
		return saveDelegatee;
	}

	public DeleteDelegatee getDeleteDelegatee() {
		return deleteDelegatee;
	}

	public UpdateControlsDelegatee getUpdateControlsDelegatee() {
		return updateControlsDelegatee;
	}

	public UpdateModelDelegatee getUpdateModelDelegatee() {
		return updateModelDelegatee;
	}

	public CountDelegatee getCountDelegatee() {
		return countDelegatee;
	}

	public InstallValidatorsDelegatee getInstallValidatorsDelegatee() {
		return installValidatorsDelegatee;
	}

	public InitWizardDelegatee getInitWizardDelegatee() {
		return initWizardDelegatee;
	}

	public VMSelectionHierarchy getSelectionHierarchy() {
		return selectionHierarchy;
	}

	public VM getSelectedVM() {
		return selectedVM;
	}

	public void setSelectedVM(VM selectedVM) {
		this.selectedVM = selectedVM;
	}

    public HostSystem getSelectedHostSystem() throws WbemsmtException {
        return selectedHostSystem;
    }

    public void setSelectedHostSystem(HostSystem selectedHostedSystem) {
        this.selectedHostSystem = selectedHostedSystem;
        this.selectedVM = null;
    }

    public void clearSelection()
    {
        this.selectedHostSystem = null;
        this.selectedVM = null;
    }
    
    public VMWizard getVMWizard() {
		return hostedSystemWizard;
	}
    
    
    public VMCliWizard getVMCliWizard() {
        return vmCliWizard;
    }

    public VMBaseWizard getActiveWizard()
    {
        return activeWizard;
    }
    
	public void setActiveWizard(VMBaseWizard activeWizard) {
        this.activeWizard = activeWizard;
    }

    public ChangeVMSettingsWizard getChangeSettingsWizard() {
        return changeSettingsWizard;
    }

    public InitContainerDelegatee getInitContainerDelegatee() {
		return initContainerDelegatee;
	}

	public RevertDelegatee getRevertDelegatee() {
		return revertDelegatee;
	}

	public MigrationWizard getMigrationWizard() {
		return migrationWizard;
	}

	public static String getInfo(WBEMClient cimClient) {
		CIMClientPool clientPool = WbemsmtSession.getSession().getCIMClientPool(cimClient);
		return clientPool != null ? clientPool.getHostname() : "-";
	}

	public static CIM_RegisteredProfile[] getVirtualSystemProfile(WBEMClient client,String interOpNamespace) throws WbemsmtException {
		return getProfiles(client,interOpNamespace,  ORGID_VSP, NAME_VSP, VERSION_VSP);
	}

	/**
	 * get the system virtualization profiles
	 * @param client for the interop namespace
	 * @return
	 * @throws WbemsmtException
	 */
	public static CIM_RegisteredProfile[] getSystemVirtualizationProfiles(WBEMClient client,String interOpNamespace) throws WbemsmtException {
		return getProfiles(client, interOpNamespace,ORGID_SVP, NAME_SVP, VERSION_SVP);
	}
	
    /**
     * get the virtual system migration profiles
     * @param client for the interop namespace
     * @return
     * @throws WbemsmtException
     */

	public static CIM_RegisteredProfile[] getVirtualSystemMigrationProfiles(WBEMClient client,String interOpNamespace) throws WbemsmtException {
		return getProfiles(client,interOpNamespace, ORGID_VSMP, NAME_VSMP, VERSION_VSMP);
	}	

	public static boolean isContainerMigrationProfile(CIM_RegisteredProfile profile) throws WbemsmtException
    {
        return isVirtualSystemMigrationProfile(profile);
    }

    public static boolean isVirtualSystemMigrationProfile(CIM_RegisteredProfile profile) throws WbemsmtException
	{
		ProfileVersion version = new ProfileVersion(profile.get_RegisteredVersion());		
		
		return profile.get_RegisteredOrganization().intValue() == ORGID_VSMP.intValue() && 
		profile.get_RegisteredName().equals(NAME_VSMP) && 	
		(version.isNewer(VERSION_VSMP) || version.equals(VERSION_VSMP));
	}

	public static boolean isSystemVirtualizationProfile(CIM_RegisteredProfile profile) throws WbemsmtException
	{
		ProfileVersion version = new ProfileVersion(profile.get_RegisteredVersion());		
		
		return profile.get_RegisteredOrganization().intValue() == ORGID_SVP.intValue() && 
		profile.get_RegisteredName().equals(NAME_SVP) && 	
		(version.isNewer(VERSION_SVP) || version.equals(VERSION_SVP));
	}

	public static boolean isVirtualSystemProfile(CIM_RegisteredProfile profile) throws WbemsmtException
	{
		ProfileVersion version = new ProfileVersion(profile.get_RegisteredVersion());		
		
		return profile.get_RegisteredOrganization().intValue() == ORGID_VSP.intValue() && 
		profile.get_RegisteredName().equals(NAME_VSP) && 	
		(version.isNewer(VERSION_VSP) || version.equals(VERSION_VSP));
	}

	/**
	 * 
	 * @param client a client for the slp namespace
	 * @param organizationId
	 * @param profileName
	 * @param profileversion
	 * @return
	 * @throws WbemsmtException
	 */
	private static CIM_RegisteredProfile[] getProfiles(WBEMClient client, String interOpNamespace, UnsignedInteger16 organizationId,
			String profileName, ProfileVersion profileversion)
			throws WbemsmtException {
		List list = CIM_RegisteredProfileHelper.enumerateInstances(client,interOpNamespace, true);
        List result = new ArrayList();
        
        for (Iterator iter = list.iterator(); iter.hasNext();) {
        	
        	CIM_RegisteredProfile profile = (CIM_RegisteredProfile) iter.next();
        	
        	String registeredVersion = profile.get_RegisteredVersion();
        	if (registeredVersion != null)
        	{
        	    ProfileVersion version = new ProfileVersion(registeredVersion);
        	    
        	    if (profile.get_RegisteredOrganization().intValue() == organizationId.intValue() && 
        	            profile.get_RegisteredName().equals(profileName) && 	
        	            (version.isNewer(profileversion) || version.equals(profileversion)) 
        	    )
        	    {
        	    	if(profile.getCimInstance ().getClassName ().equals(PROFILE))
        	        result.add(profile);
        	    }
        	}
        	else
        	{
        	    logger.warning("The attribute " +  CIM_RegisteredProfile.PROPERTY_REGISTEREDVERSION.NAME  + " of profile " + profile.getCimObjectPath() + " was null - The profile is ignored");
        	}
            
        }
        
        if (result.size() > 0)
        {
        	CIM_RegisteredProfile[] profiles = (CIM_RegisteredProfile[]) result.toArray(new CIM_RegisteredProfile[result.size()]);
        	return profiles;
//			return (CIM_RegisteredProfile) result.get(0);
        }
        else //if (result.size() == 0)
        {
        	throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,MessageFormat.format("Profile {0}:{1}-{2} was not found @ {3}", 
        			new Object[]{CIM_RegisteredProfile.PROPERTY_REGISTEREDORGANIZATION.getValueEntry(organizationId),
        			profileName,
        			profileversion.toString(),
        			interOpNamespace}));
        }
//		else
//		{
//			throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,MessageFormat.format("More than one Profile {0}:{1}-{2} was not found @ {4}. Found {5} profiles", 
//					new Object[]{CIM_RegisteredProfile.CIM.VALUEMAP_REGISTEREDORGANIZATION[organizationId],
//					profileName,
//					profileversion,
//					client.getNameSpace().toString(),
//					""+result.size()
//					}));
//			
//		}
	}



	public void reload() throws WbemsmtException {
		super.reload();
	}

	public void cleanup() {
		super.cleanup();

		try {
			hostSystems.clear();
		} catch (WbemsmtException e1) {
			logger.log(Level.SEVERE, "Cannot cleanup applicationContainers",e1);
		}
		if (subscriptionsDone && indicationDestination != null)
		{
			HttpServerConnectionManager.getInstance().removeListener(indicationDestination.getPort().intValue());
			IndicationDestinationManager.getCurrent().recycleIndicationDestination(indicationDestination);
		}
		
		try {
			removeSubscriptions(getFcoHelper(),getCimClient(), ourDestination);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}

	public void setCimClient(WBEMClient cimClient) throws WbemsmtException {
	    
	    super.setCimClient(cimClient);

	    Set appNamespaces = new HashSet();
        Set slpNamespaces = new HashSet();
        
        //get the namespace which was used for initialization of the given cimClient instance
        String tempNamespace = WbemsmtSession.getSession().getCIMClientPool(cimClient).getNamespace(cimClient);
        
        CIM_RegisteredProfile[] profiles = getVirtualSystemProfile(cimClient,tempNamespace);
        for (int i = 0; i < profiles.length; i++) {
        	CIM_RegisteredProfile registeredProfile = profiles[i];
        	slpNamespaces.add(registeredProfile.getCimObjectPath().getNamespace());
        	List meList = registeredProfile.getAssociated_CIM_ManagedElement_CIM_ElementConformsToProfileNames(cimClient);
        	for (Iterator iterator = meList.iterator(); iterator.hasNext();) {
        		CIMObjectPath path = (CIMObjectPath) iterator.next();
        		appNamespaces.add(path.getNamespace());
        	}
        }
        profiles = getSystemVirtualizationProfiles(cimClient,tempNamespace);
        for (int i = 0; i < profiles.length; i++) {
        	CIM_RegisteredProfile registeredProfile = profiles[i];
        	slpNamespaces.add(registeredProfile.getCimObjectPath().getNamespace());
        	List meList = registeredProfile.getAssociated_CIM_ManagedElement_CIM_ElementConformsToProfileNames(cimClient);
        	for (Iterator iterator = meList.iterator(); iterator.hasNext();) {
        		CIMObjectPath path = (CIMObjectPath) iterator.next();
        		appNamespaces.add(path.getNamespace());
        	}
        }
        
        if (appNamespaces.size() != 1)
        {
        	throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"More than one applicationNamespace found " + appNamespaces);
        }
        if (slpNamespaces.size() != 1)
        {
        	throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"More than one slpNamespace found " + slpNamespaces);
        }
        
        // get the application namespace
        namespace = (String) appNamespaces.iterator().next();
        interOpNamespace = (String) slpNamespaces.iterator().next();

	}

	
	public abstract static class CapabilitiesChecker
	{
		public abstract boolean check(CIM_Capabilities capabilities);
	}
	
	public static class VirtualSystemManagementCapabilitiesChecker extends CapabilitiesChecker
	{

		private final String virtualSystemType;

		public VirtualSystemManagementCapabilitiesChecker(String virtualSystemType) {
			this.virtualSystemType = virtualSystemType;
		}

		public boolean check(CIM_Capabilities capability)
		{
			if (capability instanceof CIM_VirtualSystemManagementCapabilities) {
				CIM_VirtualSystemManagementCapabilities virtualSystemManagementCapabilities = (CIM_VirtualSystemManagementCapabilities) capability;
				String[] typesSupported = virtualSystemManagementCapabilities.get_VirtualSystemTypesSupported();
				for (int j = 0; typesSupported != null && j < typesSupported.length; j++) {
					if (typesSupported[j].equals(virtualSystemType))
					{
						return true;
					}
				}
			}
			return false;
		}
		
	}

	public static MethodSupport isMethodSupported(CIM_VirtualSystemMigrationCapabilities capabilities, UnsignedInteger16 supportedMethod) {
		return MethodSupport.isMethodSupported(capabilities.get_SynchronousMethodsSupported(), capabilities.get_AsynchronousMethodsSupported(), supportedMethod);
	}

	public static MethodSupport isMethodSupported(CIM_VirtualSystemManagementCapabilities capabilities, UnsignedInteger16 supportedMethod) {
		return MethodSupport.isMethodSupported(capabilities.get_SynchronousMethodsSupported(), capabilities.get_AsynchronousMethodsSupported(), supportedMethod);
	}

	
	public int getIndicationListMaxLength()
	{
		int result = DEFAULT_INDICATION_LIST_MAX_LENGTH;
		
		String configurationValue = getConfigurationValue(CONFIG_KEY_INDICATION_LIST_MAX_LENGTH);
		if (configurationValue != null)
		{
			try {
				result = Integer.parseInt(configurationValue);
			} catch (NumberFormatException e) {
				logger.log(Level.SEVERE, "Cannot read int value from config property " + CONFIG_KEY_INDICATION_LIST_MAX_LENGTH + " with value " + configurationValue );
			}
		}
		
		return result;
		
		
		
	}
	
	/**
	 * handle the indications
	 */
	public void indicationOccured(String indicationURL, CIMInstance indication) {

		try {
			if (indication.getObjectPath().getObjectName().equals(CIM_InstCreation.CIM_CLASS_NAME))
			{
				CIM_InstIndication instIndication = new CIM_InstCreation(indication);
				addIndication(instIndication);
			}
			else if (indication.getObjectPath().getObjectName().equals(CIM_InstModification.CIM_CLASS_NAME))
			{
				CIM_InstIndication instIndication = new CIM_InstModification(indication);
				addIndication(instIndication);
			}
			else if (indication.getObjectPath().getObjectName().equals(CIM_InstDeletion.CIM_CLASS_NAME))
			{
				CIM_InstIndication instIndication = new CIM_InstDeletion(indication);
				addIndication(instIndication);
			}
			else
			{
				logger.info("Cannot handle indication of type " + indication.getObjectPath().getObjectName());
			}
		} catch (WbemsmtException e) {
			logger.log(Level.SEVERE,"Cannot handle indication of type " + indication.getObjectPath().getObjectName(),e);
		}
		
	}


	private void addIndication(CIM_Indication instIndication) {
        // TODO Auto-generated method stub
        
    }

    public String getInterOpNamespace() {
		return interOpNamespace;
	}

    public void clearActiveContainers() {
        // TODO Auto-generated method stub
        
    }

    public CIM_VirtualSystemMigrationService getVirtualSystemMigrationService(String type) throws WbemsmtException {
        return hostSystems.getHostedSystemByType(type).getVirtualSystemMigrationService();
    }

    public CIM_VirtualSystemManagementService getVirtualSystemManagementService(String type) throws WbemsmtException {
        return hostSystems.getHostedSystemByType(type).getVirtualSystemManagementService();
    }

    public HostSystemList getHostSystems() {
        return hostSystems;
    }

    public VMList getAllVMList() {
        return allVMList;
    }

    public void updateControls(VMOverviewItemDataContainer container, CIM_ComputerSystem fco) {
        // TODO Auto-generated method stub
        
    }

    /**
     * return a session key to store the containers state
     * @param system
     * @return
     */
    public static String getContainerStateSessionKey(CIM_ComputerSystem system) {
        return PREFIX_CONTAINER_STATE + system.getCimObjectPath().toString();
    }
    
    public boolean getPreloadUsesNewClients()
    {
        return "true".equalsIgnoreCase(getConfigurationValue(CONFIG_KEY_PRELOAD_USES_NEW_CLIENTS,getPreloadDefault()));
    }
    
    public boolean getPreloadHostSystems()
    {
        return "true".equalsIgnoreCase(getConfigurationValue(CONFIG_KEY_PRELOAD_HOST_SYSTEM,getPreloadDefault()));
    }

    public boolean getPreloadVMs()
    {
        return "true".equalsIgnoreCase(getConfigurationValue(CONFIG_KEY_PRELOAD_VM,getPreloadDefault()));
    }

    private String getPreloadDefault() {
        return RuntimeUtil.getInstance().isCommandline() ? "false" : "true";
    }

}
