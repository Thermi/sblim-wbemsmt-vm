/**
 * EditVMListener.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF
 * THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/jsf/editListener.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.vm.listener.jsf;

import java.util.*;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tasklauncher.event.jsf.*;
import org.sblim.wbemsmt.bl.tree.*;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.jsf.*;
import org.sblim.wbemsmt.tools.resources.*;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;
import org.sblim.wbemsmt.bl.help.HelpManager;

public class EditVMListener extends JsfEditListener {

    public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemsmtException {

        ITaskLauncherTreeNode treeNode = event.getTreeNode();

        FacesContext fc = FacesContext.getCurrentInstance();
        Locale locale = LocaleManager.getCurrent(FacesContext.getCurrentInstance())
                .getCurrentLocale();
        bundle = ResourceBundleManager.getResourceBundle(new String[] { "messages", "messagesVm" },
                locale);
        final ObjectActionControllerBean oac = (ObjectActionControllerBean) BeanNameConstants.OBJECT_ACTION_CONTROLLER
                .asValueExpression(fc).getValue(fc.getELContext());

        //set the currentListener as topic for the help
        final HelpManager helpManager = (HelpManager) BeanNameConstants.HELP_MANAGER
                .asValueExpression(fc).getValue(fc.getELContext());
        helpManager.setMode(HelpManager.MODE_EDIT);
        helpManager.setCurrentTopic("VM", "EditVMListener");

        EditBean bean = null;

        Boolean revert = event.getBooleanParameter(TaskLauncherTreeNodeEvent.PARAM_REVERT);

        if (oac.getCurrentEditListener() != null && revert != null && revert.booleanValue()) {
            oac.getCurrentEditListener().revert(false);
        }

        oac.clearEditBeans();

        TabbedPane tabbedPane = new TabbedPane(bundle);
        String bundleKey;

        //ADD THE CONTAINERS IN TAB tabGeneral			
        bean = new org.sblim.wbemsmt.vm.listener.jsf.EditVMListenerEditBeanTabGeneral();
        editBeans.add(bean);
        bean.edit(treeNode);
        oac.addEditBean("tabGeneral", bean);
        bundleKey = "tab.tabGeneral";
        tabbedPane.addTab("tabGeneral", bundleKey, bean.getPanel());

        //ADD THE CONTAINERS IN TAB tabSettings			
        bean = new org.sblim.wbemsmt.vm.listener.jsf.EditVMListenerEditBeanTabSettings();
        editBeans.add(bean);
        bean.edit(treeNode);
        oac.addEditBean("tabSettings", bean);
        bundleKey = "tab.tabSettings";
        tabbedPane.addTab("tabSettings", bundleKey, bean.getPanel());

        //ADD THE CONTAINERS IN TAB resources			
        bean = new org.sblim.wbemsmt.vm.listener.jsf.EditVMListenerEditBeanResources();
        editBeans.add(bean);
        bean.edit(treeNode);
        oac.addEditBean("resources", bean);
        bundleKey = "tab.resources";
        tabbedPane.addTab("resources", bundleKey, bean.getPanel());

        boolean createOKRevertButtons = !false && true;
        tabbedPane.create(createOKRevertButtons);
        oac.setCurrentEditor(tabbedPane.getPanel());
        oac.setSelectedTabIndex(0);
        oac.setTabbedPane(tabbedPane);
        oac.setCurrentEditListener(this);

        return "editPage";
    }
}