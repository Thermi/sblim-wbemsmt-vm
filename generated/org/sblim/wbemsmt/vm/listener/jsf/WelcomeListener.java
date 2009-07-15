/** 
 * WelcomeListener.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/jsf/welcomeListener.vm
 *
 * Contributors: 
 *   Prashanth Karnam <prkarnam@in.ibm.com>
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.listener.jsf;

import javax.faces.context.FacesContext;
import javax.faces.component.html.*;

import javax.wbem.client.WBEMClient;
import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.bl.welcome.*;
import org.sblim.wbemsmt.exception.WbemsmtException;
import javax.faces.component.UIComponentBase;

import org.apache.myfaces.custom.div.Div;

import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;

import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;

public class WelcomeListener implements JsfWelcomeListener {

    HtmlPanelGrid panel;
    DataContainer dataContainer;

    public void create(String bindingPrefix, WBEMClient cimClient) throws WbemsmtException {
        try {
            org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter = (org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter) CimAdapterFactory
                    .getInstance().getAdapter(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter.class,
                            FacesContext.getCurrentInstance(), cimClient);
            //create container
            org.sblim.wbemsmt.vm.container.edit.jsf.WelcomeDataContainerImpl container = new org.sblim.wbemsmt.vm.container.edit.jsf.WelcomeDataContainerImpl(
                    adapter, bindingPrefix);
            container.getPanelForCustomLayout().setStyleClass("mainTable");

            //update the container and children objects
            container.updateControls();

            this.dataContainer = container;
            panel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication()
                    .createComponent(HtmlPanelGrid.COMPONENT_TYPE);

            container.getLayouter().layout(container.getPanelForCustomLayout(), container,
                    adapter.getBundle());

            HtmlPanelGrid containerPanel = (HtmlPanelGrid) container.getInputFieldContainer();

            HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance()
                    .getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
            childEditFields.setStyleClass("childTable");

            //add the single childs

            //add the childs with occurence list

            HtmlPanelGrid childPanel = container.getItemsPanel().getOuterPanel();
            childPanel.setId(LabeledJSFInputComponent.asJsfId(container.getClass().getName()
                    + "_Child_items"));
            childEditFields.getChildren().add(childPanel);

            Div div = (Div) FacesContext.getCurrentInstance().getApplication().createComponent(
                    Div.COMPONENT_TYPE);
            div.setStyleClass("divWrappingChildTable");
            div.getChildren().add(childEditFields);

            containerPanel.getChildren().add(div);

            UIComponentBase panelToAdd = null;
            java.util.List ajaxPanels = new java.util.ArrayList();
            org.sblim.wbemsmt.ajax.panel.AjaxPanelGroup ajaxPanelGroup = (org.sblim.wbemsmt.ajax.panel.AjaxPanelGroup) FacesContext
                    .getCurrentInstance().getApplication().createComponent(
                            org.sblim.wbemsmt.ajax.panel.AjaxPanelGroup.COMPONENT_TYPE);
            ObjectActionControllerBean oac = (ObjectActionControllerBean) BeanNameConstants.OBJECT_ACTION_CONTROLLER
                    .getBoundValue(FacesContext.getCurrentInstance());
            String key = container.getUpdateIntervalKey();
            if (oac.getUpdateInterval().get(key) == null) {
                oac.getUpdateInterval().put(key, oac.getDefaultUpdateInterval());
            }

            ajaxPanelGroup.setValueBinding("periodicalUpdate",
                    BeanNameConstants.OBJECT_ACTION_CONTROLLER.asValueBinding(FacesContext
                            .getCurrentInstance(), "#'{'{0}.updateInterval[''" + key + "'']'}'"));
            ajaxPanelGroup.getChildren().add(containerPanel);
            ajaxPanelGroup.setId(org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent
                    .asJsfId(container.getClass().getName()));
            ajaxPanels.add(ajaxPanelGroup);
            panelToAdd = ajaxPanelGroup;

            panel.getChildren().add(panelToAdd);

        }
        catch (Exception e) {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                    "Cannot process Event with listener " + getClass().getName(), e);
        }
    }

    public org.sblim.wbemsmt.bl.welcome.WelcomeListener getListenerByPlType()
            throws WbemsmtException {
        return this;
    }

    public UIComponentBase getPanel() {
        return panel;
    }

    public DataContainer getContainer() {
        return dataContainer;
    }
}