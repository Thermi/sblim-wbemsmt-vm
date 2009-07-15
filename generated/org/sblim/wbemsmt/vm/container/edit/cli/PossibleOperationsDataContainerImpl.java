/** 
 * PossibleOperationsDataContainerImpl.java
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

package org.sblim.wbemsmt.vm.container.edit.cli;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class PossibleOperationsDataContainerImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.vm.container.edit.PossibleOperationsDataContainer,
        org.sblim.wbemsmt.vm.container.edit.PossibleOperationsItemDataContainerHeader {

    private java.util.List icItems = new java.util.ArrayList();

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Operation;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Supported;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Type;

    public PossibleOperationsDataContainerImpl(AbstractBaseCimAdapter adapter)
            throws WbemsmtException {
        super();
        setAdapter(adapter);
        adapter.initContainer(this);
    }

    /**
     * 
     * linked container PossibleOperationsItemDataContainer
     */
    public java.util.List getItems() {
        return icItems;
    }

    /**
     * Header for:
     * 
     * linked container PossibleOperationsItemDataContainer
     */
    public org.sblim.wbemsmt.vm.container.edit.PossibleOperationsItemDataContainerHeader getItemsHeader() {
        return this;
    }

    /**
     * Header for field operation
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Operation() {
        if (icItemsHeader_usr_Operation == null) {
            String label = getAdapter().getBundle().getString(
                    "PossibleOperationsItemDataContainer.operation");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icItemsHeader_usr_Operation = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icItemsHeader_usr_Operation;
    }

    /**
     * Header for field supported
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Supported() {
        if (icItemsHeader_usr_Supported == null) {
            String label = getAdapter().getBundle().getString(
                    "PossibleOperationsItemDataContainer.supported");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.NotSupportedConverter();
            icItemsHeader_usr_Supported = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icItemsHeader_usr_Supported;
    }

    /**
     * Header for field type
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Type() {
        if (icItemsHeader_usr_Type == null) {
            String label = getAdapter().getBundle().getString(
                    "PossibleOperationsItemDataContainer.type");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icItemsHeader_usr_Type = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icItemsHeader_usr_Type;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString(
                    "PossibleOperationsDataContainer.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
        }

        if (showChilds(listOptions)) {
            traceChilds(printStream, listOptions, title);
        }
    }

    public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title) {
        List listitems = getItems();
        printStream.println();
        printStream.println(getAdapter().getBundle().getString(
                "PossibleOperationsDataContainer.role.items")
                + " "
                + getAdapter().getBundle().getString("items.found",
                        new Object[] { new Integer(listitems.size()) }));
        for (int i = 0; i < listitems.size(); i++) {
            BaseDataContainer child = (BaseDataContainer) listitems.get(i);
            printStream.println();
            printStream.println(getAdapter().getBundle().getString("item") + ": " + (i + 1) + " "
                    + getAdapter().getBundle().getString("of") + " " + listitems.size());
            child.trace(printStream, listOptions, false);
        }

    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        return fields;
    }

    /**
     * Return a list of all associated childContainers. A childContainer is a DataContainer
     * @return
     */
    public List getChildContainers() {
        List childs = new ArrayList();
        childs.addAll(getItems());
        return childs;

    }

    public void copyFrom(DataContainer sourceContainer) throws WbemsmtException {
        PossibleOperationsDataContainerImpl source = (PossibleOperationsDataContainerImpl) sourceContainer;

        List targetListForItems = (List) getItems();
        List sourceListForItems = (List) source.getItems();
        if (sourceListForItems.size() != targetListForItems.size()) {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                    "The Lists are not from same size. Source is " + sourceListForItems.size()
                            + " and target is " + targetListForItems.size());
        }
        for (int ii = 0; ii < sourceListForItems.size(); ii++) {
            ((DataContainer) targetListForItems.get(ii))
                    .copyFrom(((DataContainer) sourceListForItems.get(ii)));
        }

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }
}