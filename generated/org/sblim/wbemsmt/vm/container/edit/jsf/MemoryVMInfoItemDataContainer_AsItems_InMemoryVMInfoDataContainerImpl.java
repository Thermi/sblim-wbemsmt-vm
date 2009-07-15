/** 
 * MemoryVMInfoItemDataContainer_AsItems_InMemoryVMInfoDataContainerImpl.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImplMultiLine.vm
 *
 * Contributors: 
 *   Prashanth Karnam <prkarnam@in.ibm.com>
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.container.edit.jsf;

import java.util.*;
import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class MemoryVMInfoItemDataContainer_AsItems_InMemoryVMInfoDataContainerImpl extends
        org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel2 implements
        org.sblim.wbemsmt.vm.container.edit.MemoryVMInfoItemDataContainer {

    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Current;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Min;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Max;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_DefaultValue;

    public static final int COLS = 4;

    public static String[] orientationOfColumnAsCss = new String[] { "left", "left", "left",
            "left",

    };

    public MemoryVMInfoItemDataContainer_AsItems_InMemoryVMInfoDataContainerImpl(
            org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter, String bindingPrefix, int index)
            throws WbemsmtException {
        super(adapter, bindingPrefix, index);
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly true
     * Orientation LEFT
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Current() {
        if (ic_usr_Current == null) {
            String label = bundle.getString("MemoryVMInfoItemDataContainer.current");
            String binding = bindingPrefix + "items[" + index + "]._usr_Current.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = true;
            ic_usr_Current = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent) ic_usr_Current)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }

        return ic_usr_Current;
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     * Orientation LEFT
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Min() {
        if (ic_usr_Min == null) {
            String label = bundle.getString("MemoryVMInfoItemDataContainer.min");
            String binding = bindingPrefix + "items[" + index + "]._usr_Min.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Min = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,
                    label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) ic_usr_Min)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }

        return ic_usr_Min;
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     * Orientation LEFT
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Max() {
        if (ic_usr_Max == null) {
            String label = bundle.getString("MemoryVMInfoItemDataContainer.max");
            String binding = bindingPrefix + "items[" + index + "]._usr_Max.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Max = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,
                    label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) ic_usr_Max)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }

        return ic_usr_Max;
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     * Orientation LEFT
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_DefaultValue() {
        if (ic_usr_DefaultValue == null) {
            String label = bundle.getString("MemoryVMInfoItemDataContainer.defaultValue");
            String binding = bindingPrefix + "items[" + index + "]._usr_DefaultValue.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_DefaultValue = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) ic_usr_DefaultValue)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }

        return ic_usr_DefaultValue;
    }

    /**
     * @return all the Components
     */
    public LabeledJSFInputComponent[] getComponents() {
        return new LabeledJSFInputComponent[] { (LabeledJSFInputComponent) get_usr_Current(),
                (LabeledJSFInputComponent) get_usr_Min(), (LabeledJSFInputComponent) get_usr_Max(),
                (LabeledJSFInputComponent) get_usr_DefaultValue(), };
    }

    public void reload() {
        super.reload();
        if (ic_usr_Current != null) {
            ic_usr_Current.setLabelText(bundle.getString("MemoryVMInfoItemDataContainer.current"));
        }
        if (ic_usr_Min != null) {
            ic_usr_Min.setLabelText(bundle.getString("MemoryVMInfoItemDataContainer.min"));
        }
        if (ic_usr_Max != null) {
            ic_usr_Max.setLabelText(bundle.getString("MemoryVMInfoItemDataContainer.max"));
        }
        if (ic_usr_DefaultValue != null) {
            ic_usr_DefaultValue.setLabelText(bundle
                    .getString("MemoryVMInfoItemDataContainer.defaultValue"));
        }
    }

    public String[] getResourceBundleNames() {
        return new String[] { "messages", "messagesVm" };
    }

    protected String getOrientationOfColumnAsCss(int column) {
        return orientationOfColumnAsCss[column];
    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        fields.add(get_usr_Current());
        fields.add(get_usr_Min());
        fields.add(get_usr_Max());
        fields.add(get_usr_DefaultValue());
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
        MemoryVMInfoItemDataContainer_AsItems_InMemoryVMInfoDataContainerImpl source = (MemoryVMInfoItemDataContainer_AsItems_InMemoryVMInfoDataContainerImpl) sourceContainer;

        get_usr_Current().copyFrom(source.get_usr_Current());
        get_usr_Min().copyFrom(source.get_usr_Min());
        get_usr_Max().copyFrom(source.get_usr_Max());
        get_usr_DefaultValue().copyFrom(source.get_usr_DefaultValue());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}