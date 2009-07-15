 /** 
  * MigrationWizard.java
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
  * Description: wrapper for migration wizard related actions
  * 
  */
package org.sblim.wbemsmt.vm.bl.wrapper.wizard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.cim.UnsignedInteger16;
import javax.cim.UnsignedInteger32;
import javax.faces.context.FacesContext;
import javax.wbem.client.WBEMClient;

import org.apache.commons.lang.StringUtils;
import org.sblim.wbemsmt.bl.adapter.CimAdapterFactory;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.bl.tree.CimomTreeNode;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TreeSelector;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.session.WbemsmtSession;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.vm.VMErrCodes;
import org.sblim.wbemsmt.vm.bl.adapter.MethodSupport;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VM;
import org.sblim.wbemsmt.vm.container.wizard.*;
import org.sblim.wbemsmt.vm.schema.cim_2_17.*;
import org.sblim.wbemsmt.vm.validator.ContainerRunningValidator;

public class MigrationWizard  extends VMBaseWizard{

	private static final String HOST_CONTAINER_POST_MIGRATE_STATE_KILL = "kill";
	private static final String HOST_CONTAINER_POST_MIGRATE_STATE_PAUSE = "pause";
	public static final int IDX_USE_PRESET = 0;
	public static final int IDX_USE_USERDEFINED_CIM = 1;
	public static final int IDX_USE_USERDEFINED_NO_CIM = 2;
	private CreateMigrationContainerPage1 page1;
	private CreateMigrationContainerPage2a page2a;
	private CreateMigrationContainerPage2b page2b;
	private CreateMigrationContainerPage2c page2c;
	
    private String slpNamespace;
    private String namespace;
	
	/**
	 * client is only set if preset = IDX_USE_PRESET or IDX_USE_USERDEFINED
	 * if adapter is in dummy mode (MetalusterCimAdapter.USING_INSTANCE_MOFS == true) client is also set if preset = IDX_USE_USERDEFINED_NO_CIM
	 */
	private WBEMClient client;
	/**
	 * slpClient is only set if preset = IDX_USE_PRESET or IDX_USE_USERDEFINED
	 * if adapter is in dummy mode (MetalusterCimAdapter.USING_INSTANCE_MOFS == true) slpClient is also set if preset = IDX_USE_USERDEFINED_NO_CIM
	 */
	private WBEMClient slpClient;
	private ArrayList clients = new ArrayList();
	private int clientSelection;
	private CreateMigrationContainerPage3 page3;
    
	/**
	 * Contains the VirtualSystem type of the VM which is currently migrated
	 */
	private String type;

	public MigrationWizard(VMCimAdapter adapter) {
		super(adapter);
	}	

	public void updateControls(CreateMigrationContainerPage1 container) throws WbemsmtException {
		page1 = container;
		MessageList.init(container).addAll(new ContainerRunningValidator(adapter).validate());
		
		String[] items = new String[]
		        {
				adapter.getBundle().getString("use.preset"),
				adapter.getBundle().getString("use.userdefined"),
				adapter.getBundle().getString("use.userdefined.no.cim")
		        };
		
		page1.get_usr_PresetOrUserdefined().setValues(items);
		
		if (page1.get_usr_PresetOrUserdefined().getConvertedControlValue() == null)
		{
			page1.get_usr_PresetOrUserdefined().setControlValue(new UnsignedInteger16(IDX_USE_PRESET));
		}
		
        //TODO set type
		
	}

	public void updateControls(CreateMigrationContainerPage2a container) {
		page2a = container;
		page2b = null;
		page2c = null;
	}

	public void updateControls(CreateMigrationContainerPage2b container) {
		page2a = null;
		page2b = container;
		page2c = null;
	}
	
	public void updateControls(CreateMigrationContainerPage2c container) {
		page2a = null;
		page2b = null;
		page2c = container;
	}
	

	public void updateControls(CreateMigrationContainerSummary container) throws WbemsmtException {
		
		UnsignedInteger16 iUsePreset = (UnsignedInteger16) page1.get_usr_PresetOrUserdefined().getConvertedControlValue();
        clientSelection = iUsePreset != null ? iUsePreset.intValue() : IDX_USE_PRESET;
        
        if (clientSelection == IDX_USE_PRESET)
        {
        	
        	UnsignedInteger16 iPresetIdx = (UnsignedInteger16) page2a.get_usr_CimClientPreset().getConvertedControlValue();
        	client = (WBEMClient) clients.get(iPresetIdx.intValue());
        	VMCimAdapter adapter2 = (VMCimAdapter) CimAdapterFactory.getInstance().getAdapter(VMCimAdapter.class, client,false);
        	slpClient = adapter2.getCimClient();
        	slpNamespace = adapter2.getInterOpNamespace();
        	namespace = adapter2.getNamespace();
        	container.get_usr_Targetsystem().setControlValue(WbemsmtSession.getSession().getCIMClientPool(client).getNamespace(client));
        }
        else if (clientSelection == IDX_USE_USERDEFINED_CIM)
        {
        	CimClientInfo clientInfo = getWBEMClientInfo(page2b, null);
        	slpClient = clientInfo.getClient();
        	slpNamespace = clientInfo.getNamespace();
        	
        	String virtualSystemType = adapter.getSelectedVM().getCurrentSettingData().get_VirtualSystemType();
        	
        	if (virtualSystemType == null)
        	{
        		adapter.getSelectedVM().checkVirtualSystemType(container);
        	} else
        	{
        		container.get_usr_Targetsystem().setControlValue(WbemsmtSession.getSession().getCIMClientPool(client).getNamespace(client));
        	}
        	

        }
        else if (clientSelection == IDX_USE_USERDEFINED_NO_CIM)
        {
        	String hostname = (String) page2c.get_usr_TargetHost().getConvertedControlValue();
        	container.get_usr_Targetsystem().setControlValue(hostname);
    		//only thing we know about the target is the IP/hostname so we can't create CIMClient objects  
    		client    = null;
    		slpClient = null;
    		slpNamespace = null;
    		namespace = null;
        }
        
        //Set the container info
        container.get_usr_Container().setControlValue(adapter.getSelectedVM().getInfo());
        
        //set the post migrate state
        String [] postmigrateStates = new String[]{
        		adapter.getBundle().getString("postmigratestate.paused"),
        		adapter.getBundle().getString("postmigratestate.killed")};
        
        String postMigrateState = postmigrateStates[((UnsignedInteger16)page3.get_usr_PostMigrateState().getConvertedControlValue()).intValue()];
        container.get_usr_PostMigrateState().setControlValue(postMigrateState);
		
	}

	/**
	 * Do the Migration
	 * @param container
	 * @throws WbemsmtException
	 */
	public void create(CreateMigrationContainerSummary container) throws WbemsmtException {
		
		
		VM selectedApplicationContainer = adapter.getSelectedVM();
		CIM_ComputerSystem systemToMigrate = selectedApplicationContainer.getFco();
		if (clientSelection == IDX_USE_PRESET || clientSelection == IDX_USE_USERDEFINED_CIM)
		{
			
			CIM_VirtualSystemMigrationService migrationService = adapter.getVirtualSystemMigrationService(type);

            CIM_System targetSystem;
            CIM_VirtualSystemManagementService virtualSystemManagementService = adapter.getVirtualSystemManagementService(type);
            List systems = virtualSystemManagementService.getAssociated_CIM_System_CIM_HostedServices(client);
            
            if (systems.size() ==  1)
            {
            	targetSystem = (CIM_System) systems.get(0);
            }
            else
            {
            	throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,"Expected exactly one hostsystem  on target " + VMCimAdapter.getInfo(client));
            }
            
            CIM_VirtualSystemMigrationSettingData migrationSettingData = getMigrationSettingData();
            CIM_ResourceAllocationSettingData[] newResourceSettingData = null;
            CIM_ComputerSystem computerSystem = selectedApplicationContainer.getFco();
//            MigrateVirtualSystemToSystemResult result = migrationService.invoke_MigrateVirtualSystemToSystem(
//            		adapter.getCimClient(),
//            		null,
//            		targetSystem, 
//            		newResourceSettingData, 
//            		migrationSettingData, 
//            		null, 
//            		null, 
//            		computerSystem);
//            handleMigrationRc(container,result.getResultObject(),HypervisorMgrCimAdapter.getInfo(slpClient),result.get_Job());
		}
		else if (clientSelection == IDX_USE_USERDEFINED_NO_CIM)
		{
			if (client != null || slpClient != null)
            {
            	logger.severe("only thing we know about the target is the IP/hostname so we can't create WBEMClient objects. client = "  + client + " slpClient = " + slpClient);  
            }
            
            String hostname = (String) page2c.get_usr_TargetHost().getConvertedControlValue();
            
            CIM_VirtualSystemMigrationService migrationService = adapter.getVirtualSystemMigrationService(type);
            
            CIM_ResourceAllocationSettingData[] newResourceSettingData = null;
            CIM_VirtualSystemMigrationSettingData migrationSettingData = getMigrationSettingData();
            CIM_ComputerSystem computerSystem = selectedApplicationContainer.getFco();
//                MigrateVirtualSystemToHostResult result = migrationService.invoke_MigrateVirtualSystemToHost(adapter.getCimClient(), 
//                		null, 
//                		newResourceSettingData, 
//                		migrationSettingData, 
//                		null, null
//                		, computerSystem,hostname);
//            handleMigrationRc(container,result.getResultObject(), hostname, result.get_Job());
			
		}
		
	}

	private CIM_VirtualSystemMigrationSettingData getMigrationSettingData() throws WbemsmtException {
		LabeledStringArrayInputComponentIf postMigrateStateField = page3.get_usr_PostMigrateState();
		String postMigrateState = getPostMigrateState(postMigrateStateField);

		return getMigrationSettingData(adapter, postMigrateState);
	}

	public static String getPostMigrateState(LabeledStringArrayInputComponentIf postMigrateStateField) {
		String postMigrateState = ((UnsignedInteger16)postMigrateStateField.getConvertedControlValue()).intValue() == 0 ?
				HOST_CONTAINER_POST_MIGRATE_STATE_PAUSE : 
				HOST_CONTAINER_POST_MIGRATE_STATE_KILL;
		return postMigrateState;
	}

	public static CIM_VirtualSystemMigrationSettingData getMigrationSettingData(VMCimAdapter adapter, String postMigrateState) throws WbemsmtException {
	    CIM_VirtualSystemMigrationSettingData virtualSystemMigrationSettingData = new CIM_VirtualSystemMigrationSettingData(adapter.getCimClient(),adapter.getNamespace());
        //virtualSystemMigrationSettingData.set_Options(HOST_CONTAINER_POST_MIGRATE_STATE + "=" + postMigrateState);
        return virtualSystemMigrationSettingData;
	}

	private void handleMigrationRc(CreateMigrationContainerSummary container, UnsignedInteger32 rc, String target, CIM_ConcreteJob job) {

		//TODO handle job if asychronous processing is enabled
		
		MessageList list = MessageList.init(container);
		
		if (rc.intValue() == 0)
		{
			list.addMessage(Message.create(VMErrCodes.MSGDEF_CONTAINER_MIGRATED, adapter.getBundle(), new Object[]{adapter.getSelectedVM().getInfo(),target}));
		}
		else
		{
			list.addMessage(Message.create(VMErrCodes.MSGDEF_CONTAINER_NOT_MIGRATED, adapter.getBundle(), new Object[]{adapter.getSelectedVM().getInfo(),target}));
		}
	
	}

	public void initContainer(CreateMigrationContainerPage2b container) {
		container.get_usr_MigrationTargetNamespace().setControlValue(VMCimAdapter.INTEROP_NAMESPACE);
		container.get_usr_MigrationTargetPort().setControlValue(new UnsignedInteger16(5988));
	}

	public void initContainer(CreateMigrationContainerPage2a container) throws WbemsmtException {
		List list = new ArrayList();
		clients.clear();
		
		
		if (RuntimeUtil.getInstance().isJSF())
		{
			TreeSelector controller = (TreeSelector) BeanNameConstants.TREE_SELECTOR.getBoundValue(FacesContext.getCurrentInstance());
			ITaskLauncherTreeNode nodeWithActiveCimomsNodes = controller.getCurrentTreeFactory().getNodeWithActiveCimomsNodes();
			try {
				if (nodeWithActiveCimomsNodes != null)
				{
					for (Iterator iter = nodeWithActiveCimomsNodes.getSubnodes().iterator(); iter.hasNext();) {
						CimomTreeNode cimomTreeNode = (CimomTreeNode) iter.next();
						ITaskLauncherTreeNode node =  cimomTreeNode.getNodeForTask(VMCimAdapter.METACLUSTER_TASKNAME);
						if (node != null)
						{
							WBEMClient cimClient = node.getCimClient();
							String namespace = node.getNamespace();
							if (!adapter.getNamespace().equals(namespace))
							{
								//retrieve the other adapter
								VMCimAdapter adapter = (VMCimAdapter) CimAdapterFactory.getInstance().getAdapter(VMCimAdapter.class, cimClient, false);
								if (adapter != null)
								{
									cimClient = adapter.getCimClient();
									list.add(WbemsmtSession.getSession().getCIMClientPool(cimClient).getHostname());
									clients.add(cimClient);
								}
							}
						}
					}
				}
			} catch (WbemsmtException e) {
				throw new WbemsmtException(WbemsmtException.ERR_INIT_CONTAINER,e);
			}
		}
		
		if (clients.size() == 0)
		{
			list.add(0,adapter.getBundle().getString("no.targetsystems"));
		}
		
		String[] presets =(String[]) list.toArray(new String[list.size()]);
		
		container.get_usr_CimClientPreset().setValues(presets);
	}

	public ArrayList getClients() {
		return clients;
	}
	
	public static CimClientInfo getWBEMClientInfo(CreateMigrationContainerPage2b page2b)
	{
		return getWBEMClientInfo(page2b, null);
	}

	/**
	 * Creates a CimClientInfo to get the WBEMClient from
	 * 
	 * @param page2b
	 * @param applicationNamespace if null the namespace of the datacontainer is used
	 * @return
	 */
	public static CimClientInfo getWBEMClientInfo(CreateMigrationContainerPage2b page2b, String applicationNamespace)
	{
		String username = (String) page2b.get_usr_MigrationTargetUser().getConvertedControlValue();
		String password = (String) page2b.get_usr_MigrationTargetPassword().getConvertedControlValue();
		String namespace = applicationNamespace != null ? 
								applicationNamespace : 
								(String) page2b.get_usr_MigrationTargetNamespace().getConvertedControlValue();
		String hostname = (String) page2b.get_usr_MigrationTargetHostname().getConvertedControlValue();
		String port = ""+((UnsignedInteger16) page2b.get_usr_MigrationTargetPort().getConvertedControlValue()).intValue();
		
    	username = username == null ? "" : username; 
    	password = StringUtils.isEmpty(password) ? " " : password; 
    	hostname = hostname == null ? "" : hostname; 
    	port = port == null ? "" : port; 
    	namespace = namespace == null ? "" : namespace.trim();
    	
    	if (namespace.length() > 0 && ! namespace.startsWith("/"))
    	{
    		namespace = "/" + namespace;
    		MessageList.init(page2b).addMessage(Message.create(VMErrCodes.MSGDEF_SLASH_ADDED, page2b.getAdapter().getBundle(),new Object[]{namespace}));
    	}
    	
    	String url = "HTTP://" + hostname + ":" + port.trim();
    	CimClientInfo cimClientInfo = new CimClientInfo(url,hostname,port,namespace,username,password);
    	try {
			WBEMClient client = WbemsmtSession.getSession().createCIMClientPool("http", hostname, port, username, password).getCIMClient(namespace);
			cimClientInfo.setClient(client);
		} catch (Throwable e) {
			cimClientInfo.setThrowable(e);
		}
    	
    	return cimClientInfo;
    	
		
	}

	public static class CimClientInfo
	{
		String username;
		String password;
		String namespace;
		String hostname;
		String port;
		WBEMClient client;
		String url;
		Throwable throwable;
		
		public CimClientInfo(String url,String hostname, String port, String namespace, String username, String password) {
			super();
			this.url = url;
			this.hostname = hostname;
			this.port = port;
			this.namespace = namespace;
			this.username = username;
			this.password = password;
		}
		public WBEMClient getClient() {
			return client;
		}
		public String getHostname() {
			return hostname;
		}
		public String getNamespace() {
			return namespace;
		}
		public String getPassword() {
			return password;
		}
		public String getPort() {
			return port;
		}
		public String getUsername() {
			return username;
		}
		public String getUrl() {
			return url;
		}
		public void setClient(WBEMClient client) {
			this.client = client;
		}
		public void setHostname(String hostname) {
			this.hostname = hostname;
		}
		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public void setPort(String port) {
			this.port = port;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public Throwable getThrowable() {
			return throwable;
		}
		public void setThrowable(Throwable exception) {
			this.throwable = exception;
		}
		
		
		
		

	}


	/**
	 * Initializes the Wizard
	 * 
	 * Checks if migration is possible
	 * 
	 * @param container
	 * @throws WbemsmtException
	 */
	
	public void initWizard(CreateMigrationContainerPage1 container) throws WbemsmtException {
		
		VM selectedApplicationContainer = adapter.getSelectedVM();
        
        CIM_VirtualSystemMigrationService service = selectedApplicationContainer.getVirtualSystemMigrationService();
        if (service != null)
        {
        	CIM_VirtualSystemMigrationCapabilities capabilities = selectedApplicationContainer.getVirtualSystemMigrationCapabilities();
        	MethodSupport toHostSupported = VMCimAdapter.isMethodSupported(capabilities, VMCimAdapter.METHOD_MIGRATEVIRTUALSYSTEMTOHOST);
        	MethodSupport toSystemSupported = VMCimAdapter.isMethodSupported(capabilities, VMCimAdapter.METHOD_MIGRATEVIRTUALSYSTEMTOSYSTEM);
        	
        	if (toHostSupported != MethodSupport.NOT_SUPPORTED ||
        		toSystemSupported != MethodSupport.NOT_SUPPORTED)
        	{
        		return;
        	}
        	MessageList.init(container).addMessage(Message.create(VMErrCodes.MSGDEF_MIGRATION_NOT_POSSIBLE_NO_MIGRATION_METHODS, adapter.getBundle(), new Object[]{selectedApplicationContainer.getInfo()}));
        }
        
        MessageList.init(container).addMessage(Message.create(VMErrCodes.MSGDEF_MIGRATION_NOT_POSSIBLE_NO_SERVICE, adapter.getBundle(), new Object[]{selectedApplicationContainer.getInfo()}));
		
		
	}

	public void initContainer(CreateMigrationContainerPage3 container) {

		container.get_usr_PostMigrateState().setValues( new String[]{
				adapter.getBundle().getString("postmigratestate.paused"),
				adapter.getBundle().getString("postmigratestate.killed")}
		);
		
		container.get_usr_PostMigrateState().setControlValue(new UnsignedInteger16(0));
	}

	public void updateControls(CreateMigrationContainerPage3 container) {
		page3 = container;
		
	}
	 
	public boolean usesCIMTarget()
	{
		return page2a != null || page2b != null;
	}
	
	/**
	 * Returns one of the three second pages of the wizard
	 * depends on the selection of the user to reuse a existing cim target, define new cim target or define a new non CIM-System
	 * @return null if the user had made no selection
	 */
	public DataContainer getPage2()
	{
		if (page2a != null)
		{
			return page2a;
		}
		if (page2b != null)
		{
			return page2b;
		}
		if (page2c != null)
		{
			return page2c;
		}
		
		return null;
	}

    public String getVMType() {
        return type;
    }
	
}
