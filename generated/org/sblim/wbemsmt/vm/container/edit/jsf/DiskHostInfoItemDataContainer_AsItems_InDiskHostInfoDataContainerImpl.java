/** 
 * DiskHostInfoItemDataContainer_AsItems_InDiskHostInfoDataContainerImpl.java
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

public class DiskHostInfoItemDataContainer_AsItems_InDiskHostInfoDataContainerImpl extends
        org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel2 implements
        org.sblim.wbemsmt.vm.container.edit.DiskHostInfoItemDataContainer {

    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Pool;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Disk;

    public static final int COLS = 2;

    public static String[] orientationOfColumnAsCss = new String[] { "left", "left",

    };

    public DiskHostInfoItemDataContainer_AsItems_InDiskHostInfoDataContainerImpl(
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

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Pool() {
        if (ic_usr_Pool == null) {
            String label = bundle.getString("DiskHostInfoItemDataContainer.pool");
            String binding = bindingPrefix + "items[" + index + "]._usr_Pool.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Pool = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,
                    label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) ic_usr_Pool)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }

        return ic_usr_Pool;
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     * Orientation LEFT
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Disk() {
        if (ic_usr_Disk == null) {
            String label = bundle.getString("DiskHostInfoItemDataContainer.disk");
            String binding = bindingPrefix + "items[" + index + "]._usr_Disk.item";
            logger.fine("Using binding " + binding);
            DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Disk = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,
                    label, binding, converter, readOnly);
            ;
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) ic_usr_Disk)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }

        return ic_usr_Disk;
    }

    /**
     * @return all the Components
     */
    public LabeledJSFInputComponent[] getComponents() {
        return new LabeledJSFInputComponent[] { (LabeledJSFInputComponent) get_usr_Pool(),
                (LabeledJSFInputComponent) get_usr_Disk(), };
    }

    public void reload() {
        super.reload();
        if (ic_usr_Pool != null) {
            ic_usr_Pool.setLabelText(bundle.getString("DiskHostInfoItemDataContainer.pool"));
        }
        if (ic_usr_Disk != null) {
            ic_usr_Disk.setLabelText(bundle.getString("DiskHostInfoItemDataContainer.disk"));
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
        fields.add(get_usr_Pool());
        fields.add(get_usr_Disk());
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
        DiskHostInfoItemDataContainer_AsItems_InDiskHostInfoDataContainerImpl source = (DiskHostInfoItemDataContainer_AsItems_InDiskHostInfoDataContainerImpl) sourceContainer;

        get_usr_Pool().copyFrom(source.get_usr_Pool());
        get_usr_Disk().copyFrom(source.get_usr_Disk());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}