/** 
 * WelcomeDataContainerImpl.java
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

public class WelcomeDataContainerImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.vm.container.edit.WelcomeDataContainer,
        org.sblim.wbemsmt.vm.container.edit.WelcomeItemDataContainerHeader {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Picture;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Welcometext;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_CreateLink;

    private java.util.List icItems = new java.util.ArrayList();

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_VMName;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Info;

    public WelcomeDataContainerImpl(AbstractBaseCimAdapter adapter) throws WbemsmtException {
        super();
        setAdapter(adapter);
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType PICTUREDATA
     * UIType PICTURE
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Picture() {
        if (ic_usr_Picture == null) {
            String label = getAdapter().getBundle().getString("WelcomeDataContainer.picture");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.NotSupportedConverter();
            ic_usr_Picture = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,
                    label, null, converter);
        }
        return ic_usr_Picture;
    }

    /**
     * 
     * DataType MEMODATA
     * UIType MEMO
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Welcometext() {
        if (ic_usr_Welcometext == null) {
            String label = getAdapter().getBundle().getString("WelcomeDataContainer.welcometext");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.MemoDataConverter();
            ic_usr_Welcometext = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_Welcometext;
    }

    /**
     * 
     * DataType LINKDATA
     * UIType LINK
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_CreateLink() {
        if (ic_usr_CreateLink == null) {
            String label = getAdapter().getBundle().getString("WelcomeDataContainer.createLink");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.NotSupportedConverter();
            ic_usr_CreateLink = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_CreateLink;
    }

    /**
     * 
     * linked container WelcomeItemDataContainer
     */
    public java.util.List getItems() {
        return icItems;
    }

    /**
     * Header for:
     * 
     * linked container WelcomeItemDataContainer
     */
    public org.sblim.wbemsmt.vm.container.edit.WelcomeItemDataContainerHeader getItemsHeader() {
        return this;
    }

    /**
     * Header for field VMName
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_VMName() {
        if (icItemsHeader_usr_VMName == null) {
            String label = getAdapter().getBundle().getString("WelcomeItemDataContainer.VMName");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icItemsHeader_usr_VMName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icItemsHeader_usr_VMName;
    }

    /**
     * Header for field Info
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Info() {
        if (icItemsHeader_usr_Info == null) {
            String label = getAdapter().getBundle().getString("WelcomeItemDataContainer.Info");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.MemoDataConverter();
            icItemsHeader_usr_Info = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icItemsHeader_usr_Info;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString("WelcomeDataContainer.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            //Field _usr_Picture not supported for cli
            if (get_usr_Welcometext().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Welcometext())
                        .getValue();
                printStream.println(get_usr_Welcometext().getLabelText() + ": " + value);
            }
            //Field _usr_CreateLink not supported for cli
        }

        if (showChilds(listOptions)) {
            traceChilds(printStream, listOptions, title);
        }
    }

    public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title) {
        List listitems = getItems();
        printStream.println();
        printStream.println(getAdapter().getBundle().getString("WelcomeDataContainer.role.items")
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
        fields.add(get_usr_Picture());
        fields.add(get_usr_Welcometext());
        fields.add(get_usr_CreateLink());
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
        WelcomeDataContainerImpl source = (WelcomeDataContainerImpl) sourceContainer;

        get_usr_Picture().copyFrom(source.get_usr_Picture());
        get_usr_Welcometext().copyFrom(source.get_usr_Welcometext());
        get_usr_CreateLink().copyFrom(source.get_usr_CreateLink());

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