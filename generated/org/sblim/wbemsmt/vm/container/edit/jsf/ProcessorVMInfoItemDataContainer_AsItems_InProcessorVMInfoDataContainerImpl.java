/** 
 * ProcessorVMInfoItemDataContainer_AsItems_InProcessorVMInfoDataContainerImpl.java
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

public class ProcessorVMInfoItemDataContainer_AsItems_InProcessorVMInfoDataContainerImpl extends
        org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel2 implements
        org.sblim.wbemsmt.vm.container.edit.ProcessorVMInfoItemDataContainer {

    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Current;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Min;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Max;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_DefaultValue;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Weight;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Limit;

    public static final int COLS = 6;

    public static String[] orientationOfColumnAsCss = new String[] { "left", "left", "left",
            "left", "left", "left",

    };

    public ProcessorVMInfoItemDataContainer_AsItems_InProcessorVMInfoDataContainerImpl(
            org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter, String bindingPrefix, int index)
            throws WbemsmtException {
        super(adapter, bindingPrefix, index);
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     * Orientation LEFT
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Current() {
        if (ic_usr_Current == null) {
            String label = bundle.getString("ProcessorVMInfoItemDataContainer.current");
            String binding = bindingPrefix + "items[" + index + "]._usr_Current.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Current = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,
                    label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) ic_usr_Current)
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
            String label = bundle.getString("ProcessorVMInfoItemDataContainer.min");
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
            String label = bundle.getString("ProcessorVMInfoItemDataContainer.max");
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
            String label = bundle.getString("ProcessorVMInfoItemDataContainer.defaultValue");
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
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     * Orientation LEFT
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Weight() {
        if (ic_usr_Weight == null) {
            String label = bundle.getString("ProcessorVMInfoItemDataContainer.weight");
            String binding = bindingPrefix + "items[" + index + "]._usr_Weight.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Weight = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,
                    label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) ic_usr_Weight)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }

        return ic_usr_Weight;
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     * Orientation LEFT
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Limit() {
        if (ic_usr_Limit == null) {
            String label = bundle.getString("ProcessorVMInfoItemDataContainer.limit");
            String binding = bindingPrefix + "items[" + index + "]._usr_Limit.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Limit = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,
                    label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) ic_usr_Limit)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }

        return ic_usr_Limit;
    }

    /**
     * @return all the Components
     */
    public LabeledJSFInputComponent[] getComponents() {
        return new LabeledJSFInputComponent[] { (LabeledJSFInputComponent) get_usr_Current(),
                (LabeledJSFInputComponent) get_usr_Min(), (LabeledJSFInputComponent) get_usr_Max(),
                (LabeledJSFInputComponent) get_usr_DefaultValue(),
                (LabeledJSFInputComponent) get_usr_Weight(),
                (LabeledJSFInputComponent) get_usr_Limit(), };
    }

    public void reload() {
        super.reload();
        if (ic_usr_Current != null) {
            ic_usr_Current.setLabelText(bundle
                    .getString("ProcessorVMInfoItemDataContainer.current"));
        }
        if (ic_usr_Min != null) {
            ic_usr_Min.setLabelText(bundle.getString("ProcessorVMInfoItemDataContainer.min"));
        }
        if (ic_usr_Max != null) {
            ic_usr_Max.setLabelText(bundle.getString("ProcessorVMInfoItemDataContainer.max"));
        }
        if (ic_usr_DefaultValue != null) {
            ic_usr_DefaultValue.setLabelText(bundle
                    .getString("ProcessorVMInfoItemDataContainer.defaultValue"));
        }
        if (ic_usr_Weight != null) {
            ic_usr_Weight.setLabelText(bundle.getString("ProcessorVMInfoItemDataContainer.weight"));
        }
        if (ic_usr_Limit != null) {
            ic_usr_Limit.setLabelText(bundle.getString("ProcessorVMInfoItemDataContainer.limit"));
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
        fields.add(get_usr_Weight());
        fields.add(get_usr_Limit());
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
        ProcessorVMInfoItemDataContainer_AsItems_InProcessorVMInfoDataContainerImpl source = (ProcessorVMInfoItemDataContainer_AsItems_InProcessorVMInfoDataContainerImpl) sourceContainer;

        get_usr_Current().copyFrom(source.get_usr_Current());
        get_usr_Min().copyFrom(source.get_usr_Min());
        get_usr_Max().copyFrom(source.get_usr_Max());
        get_usr_DefaultValue().copyFrom(source.get_usr_DefaultValue());
        get_usr_Weight().copyFrom(source.get_usr_Weight());
        get_usr_Limit().copyFrom(source.get_usr_Limit());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}