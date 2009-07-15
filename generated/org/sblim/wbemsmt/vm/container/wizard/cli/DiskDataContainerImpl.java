/** 
 * DiskDataContainerImpl.java
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
 * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/containerImpl.vm
 *
 * Contributors: 
 *   Prashanth Karnam <prkarnam@in.ibm.com>
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.container.wizard.cli;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class DiskDataContainerImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.vm.container.wizard.DiskDataContainer,
        org.sblim.wbemsmt.vm.container.wizard.DiskItemDataContainerHeader {
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Disks;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Add;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Remove;

    private java.util.List icDisks = new java.util.ArrayList();

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Field1;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Field2;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Field3;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Field4;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Remove;

    public DiskDataContainerImpl(AbstractBaseCimAdapter adapter) throws WbemsmtException {
        super();
        setAdapter(adapter);
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType COMBOBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Disks() {
        if (ic_usr_Disks == null) {
            String label = getAdapter().getBundle().getString("DiskDataContainer.disks");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            ic_usr_Disks = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, null, converter);
        }
        return ic_usr_Disks;
    }

    /**
     * 
     * DataType ACTION
     * UIType BUTTON
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Add() {
        if (ic_usr_Add == null) {
            String label = getAdapter().getBundle().getString("DiskDataContainer.add");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Add = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(this,
                    label, null, converter);
        }
        return ic_usr_Add;
    }

    /**
     * 
     * DataType ACTION
     * UIType BUTTON
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Remove() {
        if (ic_usr_Remove == null) {
            String label = getAdapter().getBundle().getString("DiskDataContainer.remove");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Remove = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(this,
                    label, null, converter);
        }
        return ic_usr_Remove;
    }

    /**
     * 
     * linked container DiskItemDataContainer
     */
    public java.util.List getDisks() {
        return icDisks;
    }

    /**
     * Header for:
     * 
     * linked container DiskItemDataContainer
     */
    public org.sblim.wbemsmt.vm.container.wizard.DiskItemDataContainerHeader getDisksHeader() {
        return this;
    }

    /**
     * Header for field field1
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field1() {
        if (icDisksHeader_usr_Field1 == null) {
            String label = getAdapter().getBundle().getString("DiskItemDataContainer.field1");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.GenericFieldDataConverter();
            icDisksHeader_usr_Field1 = new org.sblim.wbemsmt.tools.input.test.LabeledTestGenericDataComponent(
                    this, label, "", converter);
        }
        return icDisksHeader_usr_Field1;
    }

    /**
     * Header for field field2
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field2() {
        if (icDisksHeader_usr_Field2 == null) {
            String label = getAdapter().getBundle().getString("DiskItemDataContainer.field2");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.GenericFieldDataConverter();
            icDisksHeader_usr_Field2 = new org.sblim.wbemsmt.tools.input.test.LabeledTestGenericDataComponent(
                    this, label, "", converter);
        }
        return icDisksHeader_usr_Field2;
    }

    /**
     * Header for field field3
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field3() {
        if (icDisksHeader_usr_Field3 == null) {
            String label = getAdapter().getBundle().getString("DiskItemDataContainer.field3");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.GenericFieldDataConverter();
            icDisksHeader_usr_Field3 = new org.sblim.wbemsmt.tools.input.test.LabeledTestGenericDataComponent(
                    this, label, "", converter);
        }
        return icDisksHeader_usr_Field3;
    }

    /**
     * Header for field field4
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field4() {
        if (icDisksHeader_usr_Field4 == null) {
            String label = getAdapter().getBundle().getString("DiskItemDataContainer.field4");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.GenericFieldDataConverter();
            icDisksHeader_usr_Field4 = new org.sblim.wbemsmt.tools.input.test.LabeledTestGenericDataComponent(
                    this, label, "", converter);
        }
        return icDisksHeader_usr_Field4;
    }

    /**
     * Header for field remove
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Remove() {
        if (icDisksHeader_usr_Remove == null) {
            String label = getAdapter().getBundle().getString("DiskItemDataContainer.remove");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            icDisksHeader_usr_Remove = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icDisksHeader_usr_Remove;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString("DiskDataContainer.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            if (get_usr_Disks().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Disks())
                        .getValue();
                printStream.println(get_usr_Disks().getLabelText() + ": " + value);
            }
        }

        if (showChilds(listOptions)) {
            traceChilds(printStream, listOptions, title);
        }
    }

    public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title) {
        List listdisks = getDisks();
        printStream.println();
        printStream.println(getAdapter().getBundle().getString("DiskDataContainer.role.disks")
                + " "
                + getAdapter().getBundle().getString("items.found",
                        new Object[] { new Integer(listdisks.size()) }));
        for (int i = 0; i < listdisks.size(); i++) {
            BaseDataContainer child = (BaseDataContainer) listdisks.get(i);
            printStream.println();
            printStream.println(getAdapter().getBundle().getString("item") + ": " + (i + 1) + " "
                    + getAdapter().getBundle().getString("of") + " " + listdisks.size());
            child.trace(printStream, listOptions, false);
        }

    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        fields.add(get_usr_Disks());
        fields.add(get_usr_Add());
        fields.add(get_usr_Remove());
        return fields;
    }

    /**
     * Return a list of all associated childContainers. A childContainer is a DataContainer
     * @return
     */
    public List getChildContainers() {
        List childs = new ArrayList();
        childs.addAll(getDisks());
        return childs;

    }

    public void copyFrom(DataContainer sourceContainer) throws WbemsmtException {
        DiskDataContainerImpl source = (DiskDataContainerImpl) sourceContainer;

        get_usr_Disks().copyFrom(source.get_usr_Disks());
        get_usr_Add().copyFrom(source.get_usr_Add());
        get_usr_Remove().copyFrom(source.get_usr_Remove());

        List targetListForDisks = (List) getDisks();
        List sourceListForDisks = (List) source.getDisks();
        if (sourceListForDisks.size() != targetListForDisks.size()) {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                    "The Lists are not from same size. Source is " + sourceListForDisks.size()
                            + " and target is " + targetListForDisks.size());
        }
        for (int ii = 0; ii < sourceListForDisks.size(); ii++) {
            ((DataContainer) targetListForDisks.get(ii))
                    .copyFrom(((DataContainer) sourceListForDisks.get(ii)));
        }

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }
}