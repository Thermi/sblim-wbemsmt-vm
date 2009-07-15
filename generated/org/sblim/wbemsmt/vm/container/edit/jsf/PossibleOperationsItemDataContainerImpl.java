/** 
 * PossibleOperationsItemDataContainerImpl.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImpl.vm
 *
 * Contributors: 
 *   Prashanth Karnam <prkarnam@in.ibm.com>
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.container.edit.jsf;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class PossibleOperationsItemDataContainerImpl extends
        org.sblim.wbemsmt.tools.jsf.EditBasePanel implements
        org.sblim.wbemsmt.vm.container.edit.PossibleOperationsItemDataContainer {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Operation;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Supported;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Type;

    public PossibleOperationsItemDataContainerImpl(
            org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter, String bindingPrefix)
            throws WbemsmtException {

        super(adapter, bindingPrefix, "PossibleOperationsItemDataContainer.caption", false);

        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Operation());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Supported());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Type());

        setFooter(getPanelForCustomLayout(), "PossibleOperationsItemDataContainer.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Operation() {
        if (ic_usr_Operation == null) {
            String label = bundle.getString("PossibleOperationsItemDataContainer.operation");
            String binding = bindingPrefix + "_usr_Operation.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Operation = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Operation;
    }

    /**
     * 
     * DataType PICTUREDATA
     * UIType PICTURE
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Supported() {
        if (ic_usr_Supported == null) {
            String label = bundle.getString("PossibleOperationsItemDataContainer.supported");
            String binding = bindingPrefix + "_usr_Supported.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.jsf.PictureDataConverter();
            boolean readOnly = false;
            ic_usr_Supported = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFPictureComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Supported;
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Type() {
        if (ic_usr_Type == null) {
            String label = bundle.getString("PossibleOperationsItemDataContainer.type");
            String binding = bindingPrefix + "_usr_Type.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Type = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,
                    label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Type;
    }

    public void reload() {
        super.reload();
        if (ic_usr_Operation != null) {
            ic_usr_Operation.setLabelText(bundle
                    .getString("PossibleOperationsItemDataContainer.operation"));
        }
        if (ic_usr_Supported != null) {
            ic_usr_Supported.setLabelText(bundle
                    .getString("PossibleOperationsItemDataContainer.supported"));
        }
        if (ic_usr_Type != null) {
            ic_usr_Type.setLabelText(bundle.getString("PossibleOperationsItemDataContainer.type"));
        }
    }

    public String[] getResourceBundleNames() {
        return new String[] { "messages", "messagesVm" };
    }

    public void countAndCreateChildren() throws WbemsmtException {

    }

    /**
     * count and create childrens
     * @throws WbemsmtException
     */
    public void updateControls() throws WbemsmtException {
        countAndCreateChildren();
        adapter.updateControls(this);

    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        fields.add(get_usr_Operation());
        fields.add(get_usr_Supported());
        fields.add(get_usr_Type());
        return fields;
    }

    /**
     * Return a list of all associated childContainers. A childContainer is a DataContainer
     * @return
     */
    public List getChildContainers() {
        List childs = new ArrayList();
        return childs;

    }

    public void copyFrom(DataContainer sourceContainer) throws WbemsmtException {
        PossibleOperationsItemDataContainerImpl source = (PossibleOperationsItemDataContainerImpl) sourceContainer;

        get_usr_Operation().copyFrom(source.get_usr_Operation());
        get_usr_Supported().copyFrom(source.get_usr_Supported());
        get_usr_Type().copyFrom(source.get_usr_Type());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}