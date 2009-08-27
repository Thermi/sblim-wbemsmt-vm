/**
 * DeleteVMListener.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF
 * THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/jsf/deleteListener.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.vm.listener.jsf;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.bl.adapter.CimAdapterFactory;
import org.sblim.wbemsmt.bl.tree.*;
import org.sblim.wbemsmt.tasklauncher.event.jsf.*;
import org.sblim.wbemsmt.exception.*;

public class DeleteVMListener extends JsfDeleteListener {

    public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemsmtException {
        ITaskLauncherTreeNode treeNode = event.getTreeNode();

        javax.wbem.client.WBEMClient cimClient = treeNode.getCimClient();

        org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter = (org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter) CimAdapterFactory
                .getInstance().getAdapter(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter.class,
                        FacesContext.getCurrentInstance(), cimClient);

        TaskLauncherTreeNodeSelector selector = new org.sblim.wbemsmt.bl.tree.CurrentTaskLauncherTreeNodeSelector();
        selector.select(treeNode, adapter, "deleteVM");

        adapter.delete();
        adapter.reload();
        ITreeSelector treeSelectorBean = (ITreeSelector) BeanNameConstants.TREE_SELECTOR
                .getBoundValue(FacesContext.getCurrentInstance());
        treeSelectorBean.setSelectedTaskLauncherTreeNode(null);

        clearEditBeans();

        return "start";
    }
}