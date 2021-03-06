/**
 * DefineSystemListener.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS
 * OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/jsf/createListener.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.vm.listener.jsf;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tasklauncher.event.TaskLauncherContextMenuEventListenerImpl;
import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.bl.tree.*;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.wizard.jsf.IWizardController;
import org.sblim.wbemsmt.bl.help.HelpManager;
import org.sblim.wbemsmt.exception.WbemsmtException;

public class DefineSystemListener extends TaskLauncherContextMenuEventListenerImpl {

    public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemsmtException {
        FacesContext fc = FacesContext.getCurrentInstance();
        IWizardController wizardController = (IWizardController) BeanNameConstants.OBJECT_ACTION_CONTROLLER
                .asValueExpression(fc).getValue(fc.getELContext());

        //set the currentListener as topic for the help
        final HelpManager helpManager = (HelpManager) BeanNameConstants.HELP_MANAGER
                .asValueExpression(fc).getValue(fc.getELContext());
        helpManager.setMode(HelpManager.MODE_CREATE);
        helpManager.setCurrentTopic("VM", "DefineSystemListener");

        ITaskLauncherTreeNode treeNode = event.getTreeNode();

        javax.wbem.client.WBEMClient cimClient = treeNode.getCimClient();

        org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter = null;
        if (cimClient != null) {
            adapter = (org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter) CimAdapterFactory
                    .getInstance().getAdapter(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter.class,
                            FacesContext.getCurrentInstance(), cimClient);
        }

        TaskLauncherTreeNodeSelectorForCreate selector = new org.sblim.wbemsmt.vm.listener.DefineSystemListenerSelector();
        selector.select(treeNode, adapter, "DefineSystem");

        if (selector.execute()) {
            adapter = (org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter) selector.getAdapter();

            org.sblim.wbemsmt.vm.wizard.jsf.CreateVMWizard wizard = new org.sblim.wbemsmt.vm.wizard.jsf.CreateVMWizard(
                    adapter);

            if (wizard.canBeExecuted()) {
                wizard.startWizard();
                wizardController.setCurrentWizard(wizard);
                return "wizardPage";
            }
            else {
                return "";
            }
        }
        else {
            return "";
        }

    }
}