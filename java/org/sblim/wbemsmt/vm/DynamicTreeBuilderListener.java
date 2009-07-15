/** 
  * DynamicTreeBuilderListener.java
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
  * Contributors: 
  * 
  * Description: 
  * 
  * Build the tree dynamically
  */

package org.sblim.wbemsmt.vm;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.tree.*;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherContextMenu;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ContextmenuDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ContextmenuDocument.Contextmenu;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.EventListenerDocument.EventListener;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.MenuitemDocument.Menuitem;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.util.StringComparator;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.HostSystem;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VM;
import org.sblim.wbemsmt.vm.listener.*;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ComputerSystem;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_System;

public class DynamicTreeBuilderListener extends TaskLauncherTreeNodeEventListenerImpl {

    public DynamicTreeBuilderListener() {
		super();
	}

	public String processEvent(TaskLauncherTreeNodeEvent event) {

		if ((event.getType() & TaskLauncherTreeNodeEvent.TYPE_REFRESHED) > 0)
		{
			try {
				ContainerNodeInstanceNaming containerNodeInstanceNaming = new ContainerNodeInstanceNaming();

				if (RuntimeUtil.getInstance().isJSF())
				{
					//get the treeNode to add the new nodes
					ITaskLauncherTreeNode treeNode = event.getTreeNode();
					
					//if we got the rootNode, get the first subnode as node to ad the new nodes
					WBEMClient cimClient = treeNode.getCimClient();
					String namespace = treeNode.getNamespace();
					if (cimClient == null && 
						treeNode.getPlainName().equals("root") && 
						treeNode instanceof TaskLauncherDelegaterTreeNode)
					{
						treeNode = (ITaskLauncherTreeNode) ((TaskLauncherDelegaterTreeNode)treeNode).getSubnodes().get(0);
						cimClient = treeNode.getCimClient();
						namespace = treeNode.getNamespace();
					}
					
					//get All the HostSystems
					Map systems = HostSystem.getHostSystemsByVirtualSystemType(cimClient, namespace);
					Set keySet = systems.keySet();
                    String[] names = (String[]) keySet.toArray(new String[keySet.size()]);
					Arrays.sort(names, new StringComparator());
					
					for (int i = 0; i < names.length; i++) {
					    String type = names[i];
                        CIM_System host = (CIM_System) systems.get(type);

                        
                        //Create a new node
                        CIMInstanceNode hostNode = new CIMInstanceNode(cimClient,null,type,host.getCimInstance());
                        //Create the contextmenu and the the items
                        Contextmenu contextmenu = ContextmenuDocument.Factory.newInstance().addNewContextmenu();
                        Menuitem menuitem = contextmenu.addNewMenuitem();
                        menuitem.setDescription("tree.menu.createVM");
                        EventListener listener = menuitem.addNewEventListener();
                        listener.setClassname(DefineSystemListener.class.getName());
                        
                        //set the properties of the node
                        hostNode.setCimObject(host);
                        hostNode.setValue(VMCimAdapter.VIRTUAL_SYSTEM_TYPE, type);
                        hostNode.setValue(VMCimAdapter.NODE_TYPE, VMCimAdapter.NODE_TYPE_HOSTSYSTEM);
                        hostNode.setContextMenu(new TaskLauncherContextMenu(contextmenu,VMCimAdapter.RESOURCE_BUNDLE_NAMES));

                        hostNode.addEventListener(new EditHostSystemListener());
                        
                        //add the node to the parent
                        super.addNode(treeNode, hostNode, false);
                        
                        
                        CIM_ComputerSystem[] vmList = VM.getVMs(type,host, cimClient);
                        for (int j = 0; j < vmList.length; j++) {
                            CIM_ComputerSystem cs = vmList[j];
                            
                            //Create a new node
                            CIMInstanceNode vmNode = new CIMInstanceNode(cimClient,null,cs.get_ElementName(),cs.getCimInstance());
                            
                            //Create the contextmenu and the the items
                            contextmenu = ContextmenuDocument.Factory.newInstance().addNewContextmenu();
                            
                            //Create the change settings item
                            menuitem = contextmenu.addNewMenuitem();
                            menuitem.setDescription("tree.menu.changeVMSettings");
                            listener = menuitem.addNewEventListener();
                            listener.setClassname(ChangeVMSettingsListener.class.getName());

                            //Create the delete item
                            menuitem = contextmenu.addNewMenuitem();
                            menuitem.setDescription("tree.menu.deleteVM");
                            listener = menuitem.addNewEventListener();
                            listener.setClassname(DeleteVMListener.class.getName());

                            /*
                            menuitem = contextmenu.addNewMenuitem();
                            menuitem.setDescription("tree.menu.migrateVM");
                            listener = menuitem.addNewEventListener();
                            listener.setClassname(CreateMigrationListener.class.getName());
                            */

                            //set the properties of the node
                            vmNode.setCimInstanceNaming(containerNodeInstanceNaming);
                            vmNode.setCimObject(cs);
                            vmNode.setContextMenu(new TaskLauncherContextMenu(contextmenu,VMCimAdapter.RESOURCE_BUNDLE_NAMES));
                            vmNode.addEventListener(new EditVMListener());
                            vmNode.setValue(VMCimAdapter.NODE_TYPE, VMCimAdapter.NODE_TYPE_VM);
                            
                            //add the node to the parent
                            super.addNode(hostNode, vmNode, true);
                        }
                        
                        
					}
				}
				else if (RuntimeUtil.getInstance().isSwing())
				{
					throw new IllegalArgumentException("Swing is not supported");
				}
			} catch (WbemsmtException e) {
				ExceptionUtil.handleException(e);
			} 
		
			return null;
		}
		
		return null;
	}

	public boolean isCustomListener() {
		return false;
	}

	public Priority getPriority() {
		return TaskLauncherTreeNodeEventListener.PRIO_HIGHEST;
	}

}