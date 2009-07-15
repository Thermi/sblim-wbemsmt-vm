/** 
 * ConfigItemDataContainer_AsItems_InVMConfigDataContainerImpl.java
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

package org.sblim.wbemsmt.vm.container.wizard.jsf;

import java.util.*;
import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class ConfigItemDataContainer_AsItems_InVMConfigDataContainerImpl extends
        org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel2 implements
        org.sblim.wbemsmt.vm.container.wizard.ConfigItemDataContainer {

    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Name;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_CurrentValue;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Info;

    public static final int COLS = 3;

    public static String[] orientationOfColumnAsCss = new String[] { "left", "left", "left",

    };

    public ConfigItemDataContainer_AsItems_InVMConfigDataContainerImpl(
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

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Name() {
        if (ic_usr_Name == null) {
            String label = bundle.getString("ConfigItemDataContainer.name");
            String binding = bindingPrefix + "items[" + index + "]._usr_Name.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Name = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,
                    label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) ic_usr_Name)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }

        return ic_usr_Name;
    }

    /**
     * 
     * DataType GENERICFIELDDATA
     * UIType GENERIC
     * ReadOnly false
     * Orientation LEFT
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_CurrentValue() {
        if (ic_usr_CurrentValue == null) {
            String label = bundle.getString("ConfigItemDataContainer.currentValue");
            String binding = bindingPrefix + "items[" + index + "]._usr_CurrentValue.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_CurrentValue = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent(
                    parent, label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent) ic_usr_CurrentValue)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }

        return ic_usr_CurrentValue;
    }

    /**
     * 
     * DataType PICTUREDATA
     * UIType PICTURE
     * ReadOnly false
     * Orientation LEFT
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Info() {
        if (ic_usr_Info == null) {
            String label = bundle.getString("ConfigItemDataContainer.info");
            String binding = bindingPrefix + "items[" + index + "]._usr_Info.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.jsf.PictureDataConverter();
            boolean readOnly = false;
            ic_usr_Info = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFPictureComponent(parent,
                    label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFPictureComponent) ic_usr_Info)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }

        return ic_usr_Info;
    }

    /**
     * @return all the Components
     */
    public LabeledJSFInputComponent[] getComponents() {
        return new LabeledJSFInputComponent[] { (LabeledJSFInputComponent) get_usr_Name(),
                (LabeledJSFInputComponent) get_usr_CurrentValue(),
                (LabeledJSFInputComponent) get_usr_Info(), };
    }

    public void reload() {
        super.reload();
        if (ic_usr_Name != null) {
            ic_usr_Name.setLabelText(bundle.getString("ConfigItemDataContainer.name"));
        }
        if (ic_usr_CurrentValue != null) {
            ic_usr_CurrentValue.setLabelText(bundle
                    .getString("ConfigItemDataContainer.currentValue"));
        }
        if (ic_usr_Info != null) {
            ic_usr_Info.setLabelText(bundle.getString("ConfigItemDataContainer.info"));
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
        fields.add(get_usr_Name());
        fields.add(get_usr_CurrentValue());
        fields.add(get_usr_Info());
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
        ConfigItemDataContainer_AsItems_InVMConfigDataContainerImpl source = (ConfigItemDataContainer_AsItems_InVMConfigDataContainerImpl) sourceContainer;

        get_usr_Name().copyFrom(source.get_usr_Name());
        get_usr_CurrentValue().copyFrom(source.get_usr_CurrentValue());
        get_usr_Info().copyFrom(source.get_usr_Info());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}