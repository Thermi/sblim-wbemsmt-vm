/** 
 * ChangeVMSettingsWizard.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/jsf/wizardClass.vm
 *
 * Contributors: 
 *   Prashanth Karnam <prkarnam@in.ibm.com>
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.wizard.jsf;

import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tools.resources.LocaleManager;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.wizard.adapter.IPageWizardAdapter;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;
import org.sblim.wbemsmt.tools.wizard.jsf.JSFWizardBase;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.apache.myfaces.custom.div.Div;

public class ChangeVMSettingsWizard extends JSFWizardBase implements IPageWizardAdapter {

    private org.sblim.wbemsmt.vm.wizard.ChangeVMSettingsWizardContainer container = null;

    String binding = "objectActionController.currentWizard.currentPanel.";

    org.sblim.wbemsmt.vm.container.wizard.jsf.VMConfigDataContainerImpl panel1 = null;
    org.sblim.wbemsmt.vm.container.wizard.jsf.ProcessorDataContainerImpl panel2 = null;
    org.sblim.wbemsmt.vm.container.wizard.jsf.MemoryDataContainerImpl panel3 = null;
    org.sblim.wbemsmt.vm.container.wizard.jsf.NetworkDataContainerImpl panel4 = null;
    org.sblim.wbemsmt.vm.container.wizard.jsf.DiskDataContainerImpl panel5 = null;
    org.sblim.wbemsmt.vm.container.wizard.jsf.ChangeVMSettingsSummaryDataContainerImpl panel6 = null;

    final org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter;

    public ChangeVMSettingsWizard(final org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter) {
        super(adapter, ResourceBundleManager.getResourceBundle(new String[] { "messages",
                "messagesVm" }, LocaleManager.getCurrent(FacesContext.getCurrentInstance())
                .getCurrentLocale()), "ChangeVMSettingsWizard.title");
        this.adapter = adapter;
        this.container = new org.sblim.wbemsmt.vm.wizard.ChangeVMSettingsWizardContainer(adapter,
                new org.sblim.wbemsmt.vm.wizard.ChangeVMSettingsWizardContainerPanels() {
                    //update the child objects

                    public Object getVssd() throws WbemsmtException {
                        //Workaround for Bug https://issues.apache.org/jira/browse/MYFACES-1438
                        //Create the panel everytime the panel is needed 
                        //if (panel1!= null)
                        //{
                        //	return panel1;
                        //}

                        try {
                            panel1 = new org.sblim.wbemsmt.vm.container.wizard.jsf.VMConfigDataContainerImpl(
                                    adapter, binding);
                            panel1.countAndCreateChildren();

                            HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext
                                    .getCurrentInstance().getApplication().createComponent(
                                            HtmlPanelGrid.COMPONENT_TYPE);
                            childEditFields.setStyleClass("childTable");

                            //add the single childs

                            //add the childs with occurence list
                            {

                                HtmlPanelGrid childPanel = panel1.getItemsPanel().getOuterPanel();
                                childPanel
                                        .setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                                                .asJsfId("vssdChild_items"));
                                childEditFields.getChildren().add(childPanel);
                            }

                            Div div = (Div) FacesContext.getCurrentInstance().getApplication()
                                    .createComponent(Div.COMPONENT_TYPE);
                            div.setStyleClass("divWrappingChildTable");
                            div.getChildren().add(childEditFields);

                            panel1.getChildPanel().getChildren().add(div);

                            return panel1;
                        }
                        catch (Exception e) {
                            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                                    "Cannot process Wizard ChangeVMSettingsWizard", e);
                        }
                    }

                    //update the child objects

                    public Object getProcessor() throws WbemsmtException {
                        //Workaround for Bug https://issues.apache.org/jira/browse/MYFACES-1438
                        //Create the panel everytime the panel is needed 
                        //if (panel2!= null)
                        //{
                        //	return panel2;
                        //}

                        try {
                            panel2 = new org.sblim.wbemsmt.vm.container.wizard.jsf.ProcessorDataContainerImpl(
                                    adapter, binding);
                            panel2.countAndCreateChildren();

                            HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext
                                    .getCurrentInstance().getApplication().createComponent(
                                            HtmlPanelGrid.COMPONENT_TYPE);
                            childEditFields.setStyleClass("childTable");

                            //add the single childs

                            //add the childs with occurence list

                            Div div = (Div) FacesContext.getCurrentInstance().getApplication()
                                    .createComponent(Div.COMPONENT_TYPE);
                            div.setStyleClass("divWrappingChildTable");
                            div.getChildren().add(childEditFields);

                            panel2.getChildPanel().getChildren().add(div);

                            return panel2;
                        }
                        catch (Exception e) {
                            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                                    "Cannot process Wizard ChangeVMSettingsWizard", e);
                        }
                    }

                    //update the child objects

                    public Object getMemory() throws WbemsmtException {
                        //Workaround for Bug https://issues.apache.org/jira/browse/MYFACES-1438
                        //Create the panel everytime the panel is needed 
                        //if (panel3!= null)
                        //{
                        //	return panel3;
                        //}

                        try {
                            panel3 = new org.sblim.wbemsmt.vm.container.wizard.jsf.MemoryDataContainerImpl(
                                    adapter, binding);
                            panel3.countAndCreateChildren();

                            HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext
                                    .getCurrentInstance().getApplication().createComponent(
                                            HtmlPanelGrid.COMPONENT_TYPE);
                            childEditFields.setStyleClass("childTable");

                            //add the single childs

                            //add the childs with occurence list

                            Div div = (Div) FacesContext.getCurrentInstance().getApplication()
                                    .createComponent(Div.COMPONENT_TYPE);
                            div.setStyleClass("divWrappingChildTable");
                            div.getChildren().add(childEditFields);

                            panel3.getChildPanel().getChildren().add(div);

                            return panel3;
                        }
                        catch (Exception e) {
                            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                                    "Cannot process Wizard ChangeVMSettingsWizard", e);
                        }
                    }

                    //update the child objects

                    public Object getNetwork() throws WbemsmtException {
                        //Workaround for Bug https://issues.apache.org/jira/browse/MYFACES-1438
                        //Create the panel everytime the panel is needed 
                        //if (panel4!= null)
                        //{
                        //	return panel4;
                        //}

                        try {
                            panel4 = new org.sblim.wbemsmt.vm.container.wizard.jsf.NetworkDataContainerImpl(
                                    adapter, binding);
                            panel4.countAndCreateChildren();

                            HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext
                                    .getCurrentInstance().getApplication().createComponent(
                                            HtmlPanelGrid.COMPONENT_TYPE);
                            childEditFields.setStyleClass("childTable");

                            //add the single childs

                            //add the childs with occurence list
                            {

                                HtmlPanelGrid childPanel = panel4.getNetworksPanel()
                                        .getOuterPanel();
                                childPanel
                                        .setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                                                .asJsfId("networkChild_networks"));
                                childEditFields.getChildren().add(childPanel);
                            }

                            Div div = (Div) FacesContext.getCurrentInstance().getApplication()
                                    .createComponent(Div.COMPONENT_TYPE);
                            div.setStyleClass("divWrappingChildTable");
                            div.getChildren().add(childEditFields);

                            panel4.getChildPanel().getChildren().add(div);

                            return panel4;
                        }
                        catch (Exception e) {
                            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                                    "Cannot process Wizard ChangeVMSettingsWizard", e);
                        }
                    }

                    //update the child objects

                    public Object getDisk() throws WbemsmtException {
                        //Workaround for Bug https://issues.apache.org/jira/browse/MYFACES-1438
                        //Create the panel everytime the panel is needed 
                        //if (panel5!= null)
                        //{
                        //	return panel5;
                        //}

                        try {
                            panel5 = new org.sblim.wbemsmt.vm.container.wizard.jsf.DiskDataContainerImpl(
                                    adapter, binding);
                            panel5.countAndCreateChildren();

                            HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext
                                    .getCurrentInstance().getApplication().createComponent(
                                            HtmlPanelGrid.COMPONENT_TYPE);
                            childEditFields.setStyleClass("childTable");

                            //add the single childs

                            //add the childs with occurence list
                            {

                                HtmlPanelGrid childPanel = panel5.getDisksPanel().getOuterPanel();
                                childPanel
                                        .setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                                                .asJsfId("diskChild_disks"));
                                childEditFields.getChildren().add(childPanel);
                            }

                            Div div = (Div) FacesContext.getCurrentInstance().getApplication()
                                    .createComponent(Div.COMPONENT_TYPE);
                            div.setStyleClass("divWrappingChildTable");
                            div.getChildren().add(childEditFields);

                            panel5.getChildPanel().getChildren().add(div);

                            return panel5;
                        }
                        catch (Exception e) {
                            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                                    "Cannot process Wizard ChangeVMSettingsWizard", e);
                        }
                    }

                    //update the child objects

                    public Object getSummary() throws WbemsmtException {
                        //Workaround for Bug https://issues.apache.org/jira/browse/MYFACES-1438
                        //Create the panel everytime the panel is needed 
                        //if (panel6!= null)
                        //{
                        //	return panel6;
                        //}

                        try {
                            panel6 = new org.sblim.wbemsmt.vm.container.wizard.jsf.ChangeVMSettingsSummaryDataContainerImpl(
                                    adapter, binding);
                            panel6.countAndCreateChildren();

                            HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext
                                    .getCurrentInstance().getApplication().createComponent(
                                            HtmlPanelGrid.COMPONENT_TYPE);
                            childEditFields.setStyleClass("childTable");

                            //add the single childs

                            //add the childs with occurence list
                            {

                                HtmlPanelGrid childPanel = panel6.getConfigItemsPanel()
                                        .getOuterPanel();
                                childPanel
                                        .setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                                                .asJsfId("summaryChild_configItems"));
                                childEditFields.getChildren().add(childPanel);
                            }
                            {

                                HtmlPanelGrid childPanel = panel6.getDisksPanel().getOuterPanel();
                                childPanel
                                        .setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                                                .asJsfId("summaryChild_disks"));
                                childEditFields.getChildren().add(childPanel);
                            }
                            {

                                HtmlPanelGrid childPanel = panel6.getNetworksPanel()
                                        .getOuterPanel();
                                childPanel
                                        .setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                                                .asJsfId("summaryChild_networks"));
                                childEditFields.getChildren().add(childPanel);
                            }

                            Div div = (Div) FacesContext.getCurrentInstance().getApplication()
                                    .createComponent(Div.COMPONENT_TYPE);
                            div.setStyleClass("divWrappingChildTable");
                            div.getChildren().add(childEditFields);

                            panel6.getChildPanel().getChildren().add(div);

                            return panel6;
                        }
                        catch (Exception e) {
                            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                                    "Cannot process Wizard ChangeVMSettingsWizard", e);
                        }
                    }
                });
        super.initialize();
        try {
            super.initWizard((IWizardContainer) container, this);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
        logger.fine("Wizard initialized");
    }

    public void cleanUPPage(String panelName) {
        //cleanup is done in the adapter
    }

    public boolean savePageValues(String actualPanelName) {
        //save pageValues is done in the JSFWizardBase.next-Method, delegating the call to the adapter
        return true;
    }

    public IWizardContainer getWizardContainer() {
        return container;
    }

    public void setSummaryText(String nextPanelName) {
        //adapter-based wizards having no SummaryText
        //if wanted a method like getSummaryText shoule be imlemented in AbstractBaseCimAdapter
    }

    public String wizardComplete() {
        //everything necessary for completion is done in the Adaper
        return "";
    }

    public void reload() {
        //do nothing
    }

    //Workaround for a bug within myFaces - Everytime a new panel is created the childs are created also

    public void countAndCreateChilds(DataContainer dataContainer) throws WbemsmtException {
        if (dataContainer instanceof org.sblim.wbemsmt.vm.container.wizard.jsf.VMConfigDataContainerImpl) {
            //update the child objects
            try {
                panel1.updateControls();

                HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance()
                        .getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
                childEditFields.setStyleClass("childTable");

                //add the childs with occurence list
                {

                    HtmlPanelGrid childPanel = panel1.getItemsPanel().getOuterPanel();
                    childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                            .asJsfId("vssdChild_items"));
                    childEditFields.getChildren().add(childPanel);
                }
                panel1.getChildPanel().getChildren().clear();

                Div div = (Div) FacesContext.getCurrentInstance().getApplication().createComponent(
                        Div.COMPONENT_TYPE);
                div.setStyleClass("divWrappingChildTable");
                div.getChildren().add(childEditFields);

                panel1.getChildPanel().getChildren().add(div);
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_WIZARD_LOGIC,
                        "Cannot process Wizard ChangeVMSettingsWizard", e);
            }
        }
        if (dataContainer instanceof org.sblim.wbemsmt.vm.container.wizard.jsf.ProcessorDataContainerImpl) {
            //update the child objects
            try {
                panel2.updateControls();

                HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance()
                        .getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
                childEditFields.setStyleClass("childTable");

                //add the childs with occurence list
                panel2.getChildPanel().getChildren().clear();

                Div div = (Div) FacesContext.getCurrentInstance().getApplication().createComponent(
                        Div.COMPONENT_TYPE);
                div.setStyleClass("divWrappingChildTable");
                div.getChildren().add(childEditFields);

                panel2.getChildPanel().getChildren().add(div);
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_WIZARD_LOGIC,
                        "Cannot process Wizard ChangeVMSettingsWizard", e);
            }
        }
        if (dataContainer instanceof org.sblim.wbemsmt.vm.container.wizard.jsf.MemoryDataContainerImpl) {
            //update the child objects
            try {
                panel3.updateControls();

                HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance()
                        .getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
                childEditFields.setStyleClass("childTable");

                //add the childs with occurence list
                panel3.getChildPanel().getChildren().clear();

                Div div = (Div) FacesContext.getCurrentInstance().getApplication().createComponent(
                        Div.COMPONENT_TYPE);
                div.setStyleClass("divWrappingChildTable");
                div.getChildren().add(childEditFields);

                panel3.getChildPanel().getChildren().add(div);
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_WIZARD_LOGIC,
                        "Cannot process Wizard ChangeVMSettingsWizard", e);
            }
        }
        if (dataContainer instanceof org.sblim.wbemsmt.vm.container.wizard.jsf.NetworkDataContainerImpl) {
            //update the child objects
            try {
                panel4.updateControls();

                HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance()
                        .getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
                childEditFields.setStyleClass("childTable");

                //add the childs with occurence list
                {

                    HtmlPanelGrid childPanel = panel4.getNetworksPanel().getOuterPanel();
                    childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                            .asJsfId("networkChild_networks"));
                    childEditFields.getChildren().add(childPanel);
                }
                panel4.getChildPanel().getChildren().clear();

                Div div = (Div) FacesContext.getCurrentInstance().getApplication().createComponent(
                        Div.COMPONENT_TYPE);
                div.setStyleClass("divWrappingChildTable");
                div.getChildren().add(childEditFields);

                panel4.getChildPanel().getChildren().add(div);
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_WIZARD_LOGIC,
                        "Cannot process Wizard ChangeVMSettingsWizard", e);
            }
        }
        if (dataContainer instanceof org.sblim.wbemsmt.vm.container.wizard.jsf.DiskDataContainerImpl) {
            //update the child objects
            try {
                panel5.updateControls();

                HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance()
                        .getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
                childEditFields.setStyleClass("childTable");

                //add the childs with occurence list
                {

                    HtmlPanelGrid childPanel = panel5.getDisksPanel().getOuterPanel();
                    childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                            .asJsfId("diskChild_disks"));
                    childEditFields.getChildren().add(childPanel);
                }
                panel5.getChildPanel().getChildren().clear();

                Div div = (Div) FacesContext.getCurrentInstance().getApplication().createComponent(
                        Div.COMPONENT_TYPE);
                div.setStyleClass("divWrappingChildTable");
                div.getChildren().add(childEditFields);

                panel5.getChildPanel().getChildren().add(div);
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_WIZARD_LOGIC,
                        "Cannot process Wizard ChangeVMSettingsWizard", e);
            }
        }
        if (dataContainer instanceof org.sblim.wbemsmt.vm.container.wizard.jsf.ChangeVMSettingsSummaryDataContainerImpl) {
            //update the child objects
            try {
                panel6.updateControls();

                HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance()
                        .getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
                childEditFields.setStyleClass("childTable");

                //add the childs with occurence list
                {

                    HtmlPanelGrid childPanel = panel6.getConfigItemsPanel().getOuterPanel();
                    childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                            .asJsfId("summaryChild_configItems"));
                    childEditFields.getChildren().add(childPanel);
                }
                {

                    HtmlPanelGrid childPanel = panel6.getDisksPanel().getOuterPanel();
                    childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                            .asJsfId("summaryChild_disks"));
                    childEditFields.getChildren().add(childPanel);
                }
                {

                    HtmlPanelGrid childPanel = panel6.getNetworksPanel().getOuterPanel();
                    childPanel.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                            .asJsfId("summaryChild_networks"));
                    childEditFields.getChildren().add(childPanel);
                }
                panel6.getChildPanel().getChildren().clear();

                Div div = (Div) FacesContext.getCurrentInstance().getApplication().createComponent(
                        Div.COMPONENT_TYPE);
                div.setStyleClass("divWrappingChildTable");
                div.getChildren().add(childEditFields);

                panel6.getChildPanel().getChildren().add(div);
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_WIZARD_LOGIC,
                        "Cannot process Wizard ChangeVMSettingsWizard", e);
            }
        }
    }

    public String getFinishText() {
        return bundle.getString("ChangeVMSettingsWizard.finishText", bundle
                .getString("wizard.finishText"));
    }

    public String getJavaScriptWaitStatement() {
        String text = bundle.getString("ChangeVMSettingsWizard.createWaitText", bundle
                .getString("wizard.createWaitText"));
        return org.sblim.wbemsmt.tools.jsf.JavascriptUtil.getShowWaitCall(text);
    }
}