/** 
 * EditHostSystemListenerEditBeanResources.java
 *
 * 
 * 
 * © Copyright IBM Corp. 2008, 
 * 
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE 
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE 
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. 
 * 
 * You can obtain a current copy of the Eclipse Public License from 
 * http://www.opensource.org/licenses/eclipse-1.0.php 
 
 *
 * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/jsf/editBean.vm
 *
 * Contributors: 
 *   Prashanth Karnam <prkarnam@in.ibm.com>
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.listener.jsf;

import javax.faces.component.*;
import javax.faces.component.html.*;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.tree.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.jsf.*;
import org.sblim.wbemsmt.tools.resources.*;
//import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.bl.messages.*;

import org.apache.myfaces.custom.div.Div;

public class EditHostSystemListenerEditBeanResources extends EditBean {

    private org.sblim.wbemsmt.vm.container.edit.jsf.MemoryHostInfoDataContainerImpl currentEditContainer1;

    private org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter1 = null;

    private org.sblim.wbemsmt.vm.container.edit.jsf.ProcessorHostInfoDataContainerImpl currentEditContainer2;

    private org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter2 = null;

    private org.sblim.wbemsmt.vm.container.edit.jsf.NetworkHostInfoDataContainerImpl currentEditContainer3;

    private org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter3 = null;

    private org.sblim.wbemsmt.vm.container.edit.jsf.DiskHostInfoDataContainerImpl currentEditContainer4;

    private org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter4 = null;

    private HtmlPanelGrid panel;

    public EditHostSystemListenerEditBeanResources() {
        super(ResourceBundleManager.getResourceBundle(new String[] { "messages", "messagesVm" },
                LocaleManager.getCurrent(FacesContext.getCurrentInstance()).getCurrentLocale()));
    }

    public String save() throws WbemsmtException {
        saveResult = new MessageList();

        int successCount = 0;

        //Container MemoryHostInfoDataContainer is not saved.
        successCount++;

        //Container ProcessorHostInfoDataContainer is not saved.
        successCount++;

        //Container NetworkHostInfoDataContainer is not saved.
        successCount++;

        //Container DiskHostInfoDataContainer is not saved.
        successCount++;

        //reloadAdapters();

        super.clearEditBeansModified();
        return PAGE_EDIT;
    }

    public void edit(ITaskLauncherTreeNode treeNode) throws WbemsmtException {

        String bindingPrefix = null;
        HtmlPanelGrid childEditFields = null;
        Div div = null;
        panel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(
                HtmlPanelGrid.COMPONENT_TYPE);
        panel.setWidth("100%");
        panel.setCellspacing("0");
        panel.setCellpadding("0");

        UIComponentBase addToThis = panel;

        TaskLauncherTreeNodeSelector selector = null;
        //CimObjectKey key = null;
        HtmlPanelGrid containerPanel = null;
        javax.wbem.client.WBEMClient cimClient = null;

        //This panel is added to container representing the tab. It's the ajaxPanel or the Panel containing the container and it's childs
        UIPanel panelToAdd = null;

        cimClient = treeNode.getCimClient();

        adapter1 = (org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter) CimAdapterFactory.getInstance()
                .getAdapter(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter.class,
                        FacesContext.getCurrentInstance(), cimClient);

        selector = new org.sblim.wbemsmt.bl.tree.CurrentTaskLauncherTreeNodeSelector();
        selector.select(treeNode, adapter1, "editMemory");

        adapter1.setActiveModule(AbstractBaseCimAdapter.ACTIVE_EDIT);

        //ADD THE FIELDS FOR CONTAINER MemoryHostInfoDataContainer in EditPanel ${editPanel.getId()}

        bindingPrefix = "objectActionController.editBeans['Resources'].containers[0].";

        //create cotainner
        currentEditContainer1 = new org.sblim.wbemsmt.vm.container.edit.jsf.MemoryHostInfoDataContainerImpl(
                adapter1, bindingPrefix);
        currentEditContainer1.getPanelForCustomLayout().setStyleClass("mainTable");
        containerPanel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication()
                .createComponent(HtmlPanelGrid.COMPONENT_TYPE);
        containerPanel.getChildren().add(currentEditContainer1.getInputFieldContainer());
        containerPanel.setWidth("100%");
        containerPanel.setCellspacing("0");
        containerPanel.setCellpadding("0");

        //update the child objects

        //update the container and children objects
        currentEditContainer1.updateControls();

        childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication()
                .createComponent(HtmlPanelGrid.COMPONENT_TYPE);
        childEditFields.setStyleClass("childTable");

        //add the single childs

        //add the childs with occurence list
        {
            HtmlPanelGrid childPanel = currentEditContainer1.getItemsPanel().getOuterPanel();
            childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                    .asJsfId("editMemoryChild_items"));
            childEditFields.getChildren().add(childPanel);
        }

        div = (Div) FacesContext.getCurrentInstance().getApplication().createComponent(
                Div.COMPONENT_TYPE);
        div.setStyleClass("divWrappingChildTable");
        div.getChildren().add(childEditFields);

        containerPanel.getChildren().add(div);

        panelToAdd = containerPanel;

        addToThis.getChildren().add(panelToAdd);

        containers.add(currentEditContainer1);

        addFooter(panel, "objectActionController.editBeans['Resources'].");

        cimClient = treeNode.getCimClient();

        adapter2 = (org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter) CimAdapterFactory.getInstance()
                .getAdapter(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter.class,
                        FacesContext.getCurrentInstance(), cimClient);

        selector = new org.sblim.wbemsmt.bl.tree.CurrentTaskLauncherTreeNodeSelector();
        selector.select(treeNode, adapter2, "editProcessor");

        adapter2.setActiveModule(AbstractBaseCimAdapter.ACTIVE_EDIT);

        //ADD THE FIELDS FOR CONTAINER ProcessorHostInfoDataContainer in EditPanel ${editPanel.getId()}

        bindingPrefix = "objectActionController.editBeans['Resources'].containers[1].";

        //create cotainner
        currentEditContainer2 = new org.sblim.wbemsmt.vm.container.edit.jsf.ProcessorHostInfoDataContainerImpl(
                adapter2, bindingPrefix);
        currentEditContainer2.getPanelForCustomLayout().setStyleClass("mainTable");
        containerPanel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication()
                .createComponent(HtmlPanelGrid.COMPONENT_TYPE);
        containerPanel.getChildren().add(currentEditContainer2.getInputFieldContainer());
        containerPanel.setWidth("100%");
        containerPanel.setCellspacing("0");
        containerPanel.setCellpadding("0");

        //update the child objects

        //update the container and children objects
        currentEditContainer2.updateControls();

        childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication()
                .createComponent(HtmlPanelGrid.COMPONENT_TYPE);
        childEditFields.setStyleClass("childTable");

        //add the single childs

        //add the childs with occurence list
        {
            HtmlPanelGrid childPanel = currentEditContainer2.getItemsPanel().getOuterPanel();
            childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                    .asJsfId("editProcessorChild_items"));
            childEditFields.getChildren().add(childPanel);
        }

        div = (Div) FacesContext.getCurrentInstance().getApplication().createComponent(
                Div.COMPONENT_TYPE);
        div.setStyleClass("divWrappingChildTable");
        div.getChildren().add(childEditFields);

        containerPanel.getChildren().add(div);

        panelToAdd = containerPanel;

        addToThis.getChildren().add(panelToAdd);

        containers.add(currentEditContainer2);

        addFooter(panel, "objectActionController.editBeans['Resources'].");

        cimClient = treeNode.getCimClient();

        adapter3 = (org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter) CimAdapterFactory.getInstance()
                .getAdapter(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter.class,
                        FacesContext.getCurrentInstance(), cimClient);

        selector = new org.sblim.wbemsmt.bl.tree.CurrentTaskLauncherTreeNodeSelector();
        selector.select(treeNode, adapter3, "editNetwork");

        adapter3.setActiveModule(AbstractBaseCimAdapter.ACTIVE_EDIT);

        //ADD THE FIELDS FOR CONTAINER NetworkHostInfoDataContainer in EditPanel ${editPanel.getId()}

        bindingPrefix = "objectActionController.editBeans['Resources'].containers[2].";

        //create cotainner
        currentEditContainer3 = new org.sblim.wbemsmt.vm.container.edit.jsf.NetworkHostInfoDataContainerImpl(
                adapter3, bindingPrefix);
        currentEditContainer3.getPanelForCustomLayout().setStyleClass("mainTable");
        containerPanel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication()
                .createComponent(HtmlPanelGrid.COMPONENT_TYPE);
        containerPanel.getChildren().add(currentEditContainer3.getInputFieldContainer());
        containerPanel.setWidth("100%");
        containerPanel.setCellspacing("0");
        containerPanel.setCellpadding("0");

        //update the child objects

        //update the container and children objects
        currentEditContainer3.updateControls();

        childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication()
                .createComponent(HtmlPanelGrid.COMPONENT_TYPE);
        childEditFields.setStyleClass("childTable");

        //add the single childs

        //add the childs with occurence list
        {
            HtmlPanelGrid childPanel = currentEditContainer3.getItemsPanel().getOuterPanel();
            childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                    .asJsfId("editNetworkChild_items"));
            childEditFields.getChildren().add(childPanel);
        }

        div = (Div) FacesContext.getCurrentInstance().getApplication().createComponent(
                Div.COMPONENT_TYPE);
        div.setStyleClass("divWrappingChildTable");
        div.getChildren().add(childEditFields);

        containerPanel.getChildren().add(div);

        panelToAdd = containerPanel;

        addToThis.getChildren().add(panelToAdd);

        containers.add(currentEditContainer3);

        addFooter(panel, "objectActionController.editBeans['Resources'].");

        cimClient = treeNode.getCimClient();

        adapter4 = (org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter) CimAdapterFactory.getInstance()
                .getAdapter(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter.class,
                        FacesContext.getCurrentInstance(), cimClient);

        selector = new org.sblim.wbemsmt.bl.tree.CurrentTaskLauncherTreeNodeSelector();
        selector.select(treeNode, adapter4, "editDisk");

        adapter4.setActiveModule(AbstractBaseCimAdapter.ACTIVE_EDIT);

        //ADD THE FIELDS FOR CONTAINER DiskHostInfoDataContainer in EditPanel ${editPanel.getId()}

        bindingPrefix = "objectActionController.editBeans['Resources'].containers[3].";

        //create cotainner
        currentEditContainer4 = new org.sblim.wbemsmt.vm.container.edit.jsf.DiskHostInfoDataContainerImpl(
                adapter4, bindingPrefix);
        currentEditContainer4.getPanelForCustomLayout().setStyleClass("mainTable");
        containerPanel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication()
                .createComponent(HtmlPanelGrid.COMPONENT_TYPE);
        containerPanel.getChildren().add(currentEditContainer4.getInputFieldContainer());
        containerPanel.setWidth("100%");
        containerPanel.setCellspacing("0");
        containerPanel.setCellpadding("0");

        //update the child objects

        //update the container and children objects
        currentEditContainer4.updateControls();

        childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication()
                .createComponent(HtmlPanelGrid.COMPONENT_TYPE);
        childEditFields.setStyleClass("childTable");

        //add the single childs

        //add the childs with occurence list
        {
            HtmlPanelGrid childPanel = currentEditContainer4.getItemsPanel().getOuterPanel();
            childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                    .asJsfId("editDiskChild_items"));
            childEditFields.getChildren().add(childPanel);
        }

        div = (Div) FacesContext.getCurrentInstance().getApplication().createComponent(
                Div.COMPONENT_TYPE);
        div.setStyleClass("divWrappingChildTable");
        div.getChildren().add(childEditFields);

        containerPanel.getChildren().add(div);

        panelToAdd = containerPanel;

        addToThis.getChildren().add(panelToAdd);

        containers.add(currentEditContainer4);

        addFooter(panel, "objectActionController.editBeans['Resources'].");

        //Creating no OK/Cancel-Button because saving single Tabs is disabled (EditAction.saveSinglePanels)

    }

    public HtmlPanelGrid getPanel() {
        return panel;
    }

    //do nothing but to fullfill the java beans properties convention
    public void setPanel(HtmlPanelGrid grid) {
    }

    public void reload() {
        super.reload();
    }
}