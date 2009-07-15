/** 
 * CreateVMSummaryDataContainerImpl.java
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

public class CreateVMSummaryDataContainerImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.vm.container.wizard.CreateVMSummaryDataContainer,
        org.sblim.wbemsmt.vm.container.wizard.SummaryConfigItemDataContainerHeader,
        org.sblim.wbemsmt.vm.container.wizard.SummaryDiskItemDataContainerHeader,
        org.sblim.wbemsmt.vm.container.wizard.SummaryNetworkItemDataContainerHeader {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_ReferencedSystem;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Hostsystem;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Processor;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Memory;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_StartContainer;

    private java.util.List icConfigItems = new java.util.ArrayList();

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icConfigItemsHeader_usr_Name;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icConfigItemsHeader_usr_CurrentValue;

    private java.util.List icDisks = new java.util.ArrayList();

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_FromPool;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Path;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Field1;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Field2;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Field3;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Field4;

    private java.util.List icNetworks = new java.util.ArrayList();

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_FromPool;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Mac;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Field1;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Field2;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Field3;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Field4;

    public CreateVMSummaryDataContainerImpl(AbstractBaseCimAdapter adapter) throws WbemsmtException {
        super();
        setAdapter(adapter);
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly true
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_ReferencedSystem() {
        if (ic_usr_ReferencedSystem == null) {
            String label = getAdapter().getBundle().getString(
                    "CreateVMSummaryDataContainer.referencedSystem");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_ReferencedSystem = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_ReferencedSystem;
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly true
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Hostsystem() {
        if (ic_usr_Hostsystem == null) {
            String label = getAdapter().getBundle().getString(
                    "CreateVMSummaryDataContainer.hostsystem");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Hostsystem = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_Hostsystem;
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly true
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Processor() {
        if (ic_Processor == null) {
            String label = getAdapter().getBundle().getString(
                    "CreateVMSummaryDataContainer.Processor");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_Processor = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,
                    label, null, converter);
        }
        return ic_Processor;
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly true
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Memory() {
        if (ic_Memory == null) {
            String label = getAdapter().getBundle()
                    .getString("CreateVMSummaryDataContainer.Memory");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_Memory = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,
                    label, null, converter);
        }
        return ic_Memory;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly true
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_StartContainer() {
        if (ic_usr_StartContainer == null) {
            String label = getAdapter().getBundle().getString(
                    "CreateVMSummaryDataContainer.startContainer");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            ic_usr_StartContainer = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_StartContainer;
    }

    /**
     * 
     * linked container SummaryConfigItemDataContainer
     */
    public java.util.List getConfigItems() {
        return icConfigItems;
    }

    /**
     * Header for:
     * 
     * linked container SummaryConfigItemDataContainer
     */
    public org.sblim.wbemsmt.vm.container.wizard.SummaryConfigItemDataContainerHeader getConfigItemsHeader() {
        return this;
    }

    /**
     * Header for field name
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getConfigItemsHeader_usr_Name() {
        if (icConfigItemsHeader_usr_Name == null) {
            String label = getAdapter().getBundle()
                    .getString("SummaryConfigItemDataContainer.name");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icConfigItemsHeader_usr_Name = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icConfigItemsHeader_usr_Name;
    }

    /**
     * Header for field currentValue
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getConfigItemsHeader_usr_CurrentValue() {
        if (icConfigItemsHeader_usr_CurrentValue == null) {
            String label = getAdapter().getBundle().getString(
                    "SummaryConfigItemDataContainer.currentValue");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icConfigItemsHeader_usr_CurrentValue = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icConfigItemsHeader_usr_CurrentValue;
    }

    /**
     * 
     * linked container SummaryDiskItemDataContainer
     */
    public java.util.List getDisks() {
        return icDisks;
    }

    /**
     * Header for:
     * 
     * linked container SummaryDiskItemDataContainer
     */
    public org.sblim.wbemsmt.vm.container.wizard.SummaryDiskItemDataContainerHeader getDisksHeader() {
        return this;
    }

    /**
     * Header for field fromPool
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_FromPool() {
        if (icDisksHeader_usr_FromPool == null) {
            String label = getAdapter().getBundle().getString(
                    "SummaryDiskItemDataContainer.fromPool");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icDisksHeader_usr_FromPool = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icDisksHeader_usr_FromPool;
    }

    /**
     * Header for field path
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Path() {
        if (icDisksHeader_usr_Path == null) {
            String label = getAdapter().getBundle().getString("SummaryDiskItemDataContainer.path");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icDisksHeader_usr_Path = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icDisksHeader_usr_Path;
    }

    /**
     * Header for field field1
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field1() {
        if (icDisksHeader_usr_Field1 == null) {
            String label = getAdapter().getBundle()
                    .getString("SummaryDiskItemDataContainer.field1");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icDisksHeader_usr_Field1 = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icDisksHeader_usr_Field1;
    }

    /**
     * Header for field field2
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field2() {
        if (icDisksHeader_usr_Field2 == null) {
            String label = getAdapter().getBundle()
                    .getString("SummaryDiskItemDataContainer.field2");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icDisksHeader_usr_Field2 = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icDisksHeader_usr_Field2;
    }

    /**
     * Header for field field3
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field3() {
        if (icDisksHeader_usr_Field3 == null) {
            String label = getAdapter().getBundle()
                    .getString("SummaryDiskItemDataContainer.field3");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icDisksHeader_usr_Field3 = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icDisksHeader_usr_Field3;
    }

    /**
     * Header for field field4
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field4() {
        if (icDisksHeader_usr_Field4 == null) {
            String label = getAdapter().getBundle()
                    .getString("SummaryDiskItemDataContainer.field4");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icDisksHeader_usr_Field4 = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icDisksHeader_usr_Field4;
    }

    /**
     * 
     * linked container SummaryNetworkItemDataContainer
     */
    public java.util.List getNetworks() {
        return icNetworks;
    }

    /**
     * Header for:
     * 
     * linked container SummaryNetworkItemDataContainer
     */
    public org.sblim.wbemsmt.vm.container.wizard.SummaryNetworkItemDataContainerHeader getNetworksHeader() {
        return this;
    }

    /**
     * Header for field fromPool
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_FromPool() {
        if (icNetworksHeader_usr_FromPool == null) {
            String label = getAdapter().getBundle().getString(
                    "SummaryNetworkItemDataContainer.fromPool");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icNetworksHeader_usr_FromPool = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icNetworksHeader_usr_FromPool;
    }

    /**
     * Header for field mac
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Mac() {
        if (icNetworksHeader_usr_Mac == null) {
            String label = getAdapter().getBundle()
                    .getString("SummaryNetworkItemDataContainer.mac");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icNetworksHeader_usr_Mac = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icNetworksHeader_usr_Mac;
    }

    /**
     * Header for field field1
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Field1() {
        if (icNetworksHeader_usr_Field1 == null) {
            String label = getAdapter().getBundle().getString(
                    "SummaryNetworkItemDataContainer.field1");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icNetworksHeader_usr_Field1 = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icNetworksHeader_usr_Field1;
    }

    /**
     * Header for field field2
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Field2() {
        if (icNetworksHeader_usr_Field2 == null) {
            String label = getAdapter().getBundle().getString(
                    "SummaryNetworkItemDataContainer.field2");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icNetworksHeader_usr_Field2 = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icNetworksHeader_usr_Field2;
    }

    /**
     * Header for field field3
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Field3() {
        if (icNetworksHeader_usr_Field3 == null) {
            String label = getAdapter().getBundle().getString(
                    "SummaryNetworkItemDataContainer.field3");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icNetworksHeader_usr_Field3 = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icNetworksHeader_usr_Field3;
    }

    /**
     * Header for field field4
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Field4() {
        if (icNetworksHeader_usr_Field4 == null) {
            String label = getAdapter().getBundle().getString(
                    "SummaryNetworkItemDataContainer.field4");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icNetworksHeader_usr_Field4 = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icNetworksHeader_usr_Field4;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString(
                    "CreateVMSummaryDataContainer.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            if (get_usr_ReferencedSystem().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_ReferencedSystem())
                        .getValue();
                printStream.println(get_usr_ReferencedSystem().getLabelText() + ": " + value);
            }
            if (get_usr_Hostsystem().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Hostsystem())
                        .getValue();
                printStream.println(get_usr_Hostsystem().getLabelText() + ": " + value);
            }
            if (get_Processor().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_Processor())
                        .getValue();
                printStream.println(get_Processor().getLabelText() + ": " + value);
            }
            if (get_Memory().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_Memory())
                        .getValue();
                printStream.println(get_Memory().getLabelText() + ": " + value);
            }
            if (get_usr_StartContainer().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_StartContainer())
                        .getValue();
                printStream.println(get_usr_StartContainer().getLabelText() + ": " + value);
            }
        }

        if (showChilds(listOptions)) {
            traceChilds(printStream, listOptions, title);
        }
    }

    public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title) {
        List listconfigItems = getConfigItems();
        printStream.println();
        printStream.println(getAdapter().getBundle().getString(
                "CreateVMSummaryDataContainer.role.configItems")
                + " "
                + getAdapter().getBundle().getString("items.found",
                        new Object[] { new Integer(listconfigItems.size()) }));
        for (int i = 0; i < listconfigItems.size(); i++) {
            BaseDataContainer child = (BaseDataContainer) listconfigItems.get(i);
            printStream.println();
            printStream.println(getAdapter().getBundle().getString("item") + ": " + (i + 1) + " "
                    + getAdapter().getBundle().getString("of") + " " + listconfigItems.size());
            child.trace(printStream, listOptions, false);
        }
        List listdisks = getDisks();
        printStream.println();
        printStream.println(getAdapter().getBundle().getString(
                "CreateVMSummaryDataContainer.role.disks")
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
        List listnetworks = getNetworks();
        printStream.println();
        printStream.println(getAdapter().getBundle().getString(
                "CreateVMSummaryDataContainer.role.networks")
                + " "
                + getAdapter().getBundle().getString("items.found",
                        new Object[] { new Integer(listnetworks.size()) }));
        for (int i = 0; i < listnetworks.size(); i++) {
            BaseDataContainer child = (BaseDataContainer) listnetworks.get(i);
            printStream.println();
            printStream.println(getAdapter().getBundle().getString("item") + ": " + (i + 1) + " "
                    + getAdapter().getBundle().getString("of") + " " + listnetworks.size());
            child.trace(printStream, listOptions, false);
        }

    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        fields.add(get_usr_ReferencedSystem());
        fields.add(get_usr_Hostsystem());
        fields.add(get_Processor());
        fields.add(get_Memory());
        fields.add(get_usr_StartContainer());
        return fields;
    }

    /**
     * Return a list of all associated childContainers. A childContainer is a DataContainer
     * @return
     */
    public List getChildContainers() {
        List childs = new ArrayList();
        childs.addAll(getConfigItems());
        childs.addAll(getDisks());
        childs.addAll(getNetworks());
        return childs;

    }

    public void copyFrom(DataContainer sourceContainer) throws WbemsmtException {
        CreateVMSummaryDataContainerImpl source = (CreateVMSummaryDataContainerImpl) sourceContainer;

        get_usr_ReferencedSystem().copyFrom(source.get_usr_ReferencedSystem());
        get_usr_Hostsystem().copyFrom(source.get_usr_Hostsystem());
        get_Processor().copyFrom(source.get_Processor());
        get_Memory().copyFrom(source.get_Memory());
        get_usr_StartContainer().copyFrom(source.get_usr_StartContainer());

        List targetListForConfigItems = (List) getConfigItems();
        List sourceListForConfigItems = (List) source.getConfigItems();
        if (sourceListForConfigItems.size() != targetListForConfigItems.size()) {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                    "The Lists are not from same size. Source is "
                            + sourceListForConfigItems.size() + " and target is "
                            + targetListForConfigItems.size());
        }
        for (int ii = 0; ii < sourceListForConfigItems.size(); ii++) {
            ((DataContainer) targetListForConfigItems.get(ii))
                    .copyFrom(((DataContainer) sourceListForConfigItems.get(ii)));
        }

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

        List targetListForNetworks = (List) getNetworks();
        List sourceListForNetworks = (List) source.getNetworks();
        if (sourceListForNetworks.size() != targetListForNetworks.size()) {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                    "The Lists are not from same size. Source is " + sourceListForNetworks.size()
                            + " and target is " + targetListForNetworks.size());
        }
        for (int ii = 0; ii < sourceListForNetworks.size(); ii++) {
            ((DataContainer) targetListForNetworks.get(ii))
                    .copyFrom(((DataContainer) sourceListForNetworks.get(ii)));
        }

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }
}