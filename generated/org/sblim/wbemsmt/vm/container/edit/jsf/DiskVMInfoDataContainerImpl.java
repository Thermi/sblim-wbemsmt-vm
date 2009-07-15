/** 
 * DiskVMInfoDataContainerImpl.java
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

//imports for that field of a linked container with occurence = MANY
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class DiskVMInfoDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel
        implements org.sblim.wbemsmt.vm.container.edit.DiskVMInfoDataContainer,
        org.sblim.wbemsmt.vm.container.edit.DiskVMInfoItemDataContainerHeader {

    private java.util.List icItems = new java.util.ArrayList();

    private MultiLinePanel itemsPanel;
    private int itemsCount;

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_InstanceID;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_Address;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Info;

    public DiskVMInfoDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,
            String bindingPrefix) throws WbemsmtException {

        super(adapter, bindingPrefix, "DiskVMInfoDataContainer.caption", false);

        setFooter(getPanelForCustomLayout(), "DiskVMInfoDataContainer.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * linked container DiskVMInfoItemDataContainer
     */
    public java.util.List getItems() {
        return icItems;
    }

    public MultiLinePanel getItemsPanel() {
        if (itemsPanel == null) {
            itemsPanel = new ItemsPanel(adapter,
                    bindingPrefix, // the prefix for binding values
                    "#{" + bindingPrefix + "itemsPanel", // binding for Title
                    "DiskVMInfoItemDataContainer_AsItems_InDiskVMInfoDataContainer.caption", //Key for title
                    org.sblim.wbemsmt.vm.container.edit.jsf.DiskVMInfoItemDataContainer_AsItems_InDiskVMInfoDataContainerImpl.COLS);
            addItemsHeader();
        }

        return itemsPanel;
    }

    static class ItemsPanel extends MultiLinePanel {
        public ItemsPanel(AbstractBaseCimAdapter adapter, String bindingPrefix,
                String bindigForTitle, String keyForTitle, int cols) {
            super(adapter, bindingPrefix, bindigForTitle, keyForTitle, "items", cols);
        }

        protected String getOrientationOfColumnAsCss(int column) {
            return org.sblim.wbemsmt.vm.container.edit.jsf.DiskVMInfoItemDataContainer_AsItems_InDiskVMInfoDataContainerImpl.orientationOfColumnAsCss[column];
        }
    }

    private void addItems(
            org.sblim.wbemsmt.vm.container.edit.jsf.DiskVMInfoItemDataContainer_AsItems_InDiskVMInfoDataContainerImpl child) {

        getItems().add(child);
        getItemsPanel().addComponents(child.getComponents());

        //((LabeledJSFInputComponent)getItems_InstanceIDHeader()).getDependentChildFields().add(child.get_InstanceID());
        //((LabeledJSFInputComponent)getItems_AddressHeader()).getDependentChildFields().add(child.get_Address());
        //((LabeledJSFInputComponent)getItems_usr_InfoHeader()).getDependentChildFields().add(child.get_usr_Info());
    }

    private void clearItems() {
        getItems().clear();
    }

    /**
     * 
     * Get the Items for the UI repesentation
     */
    public java.util.List getItemsForUI() {

        List result = new ArrayList();
        result.addAll(icItems);

        while (result.size() < MIN_TABLE_LENGTH) {
            try {
                org.sblim.wbemsmt.vm.container.edit.jsf.DiskVMInfoItemDataContainer_AsItems_InDiskVMInfoDataContainerImpl item = new org.sblim.wbemsmt.vm.container.edit.jsf.DiskVMInfoItemDataContainer_AsItems_InDiskVMInfoDataContainerImpl(
                        (org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter) adapter, bindingPrefix,
                        result.size());
                DataContainerUtil.setVisibilityOfFields(item, false);
                result.add(item);
            }
            catch (WbemsmtException e) {
                e.printStackTrace();
            }
        }

        itemsPanel.setList(result);

        return result;
    }

    /**
     * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
     * @return
     */
    public String getItemsFooterClass() {
        return "multiLineRowHeader center "
                + (icItems.size() == 0 || getItemsPanel().isHavingCustomFooter() ? "visible "
                        : "hidden ");
    }

    /**
     * manages the style for the label which is displayed if there are no entries in the table
     * @return
     */
    public String getItemsAvailableFooterClass() {
        return icItems.size() > 0 ? " hidden " : " visible ";
    }

    private void addItemsHeader() {
        getItemsPanel().setHeader(getItemsHeaderComponents(), getItemsFieldNames());
    }

    private LabeledJSFInputComponent[] getItemsHeaderComponents() {
        return new LabeledJSFInputComponent[] {
                (LabeledJSFInputComponent) getItemsHeader_InstanceID(),
                (LabeledJSFInputComponent) getItemsHeader_Address(),
                (LabeledJSFInputComponent) getItemsHeader_usr_Info(), };
    }

    private String[] getItemsFieldNames() {
        return new String[] { "_InstanceID", "_Address", "_usr_Info", };
    }

    /**
     * Header for:
     * 
     * linked container DiskVMInfoItemDataContainer
     */
    public org.sblim.wbemsmt.vm.container.edit.DiskVMInfoItemDataContainerHeader getItemsHeader() {
        return this;
    }

    /**
     * Header for field InstanceID
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_InstanceID() {
        if (icItemsHeader_InstanceID == null) {
            String label = bundle.getString("DiskVMInfoItemDataContainer.InstanceID");
            String binding = bindingPrefix + "itemsHeader_InstanceID.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icItemsHeader_InstanceID = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_InstanceID)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_InstanceID)
                .setHeader(true);

        return icItemsHeader_InstanceID;
    }

    /**
     * Header for field Address
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_Address() {
        if (icItemsHeader_Address == null) {
            String label = bundle.getString("DiskVMInfoItemDataContainer.Address");
            String binding = bindingPrefix + "itemsHeader_Address.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icItemsHeader_Address = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_Address)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_Address)
                .setHeader(true);

        return icItemsHeader_Address;
    }

    /**
     * Header for field Info
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Info() {
        if (icItemsHeader_usr_Info == null) {
            String label = bundle.getString("DiskVMInfoItemDataContainer.Info");
            String binding = bindingPrefix + "itemsHeader_usr_Info.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icItemsHeader_usr_Info = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_Info)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_Info)
                .setHeader(true);

        return icItemsHeader_usr_Info;
    }

    public void reload() {
        super.reload();
    }

    public String[] getResourceBundleNames() {
        return new String[] { "messages", "messagesVm" };
    }

    public void countAndCreateChildren() throws WbemsmtException {

        try {
            int count = adapter.count("items",
                    org.sblim.wbemsmt.vm.container.edit.DiskVMInfoItemDataContainer.class, this);
            if (count != itemsCount) {
                itemsCount = count;
                clearItems();
                for (int i = 0; i < count; i++) {
                    addItems(new org.sblim.wbemsmt.vm.container.edit.jsf.DiskVMInfoItemDataContainer_AsItems_InDiskVMInfoDataContainerImpl(
                            (org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter) adapter, bindingPrefix,
                            i));
                }
            }
            getItemsPanel().setList(getItems());
        }
        catch (WbemsmtException e) {
            throw new WbemsmtException(WbemsmtException.ERR_INIT_CONTAINER, e);
        }
    }

    /**
     * count and create childrens
     * @throws WbemsmtException
     */
    public void updateControls() throws WbemsmtException {
        countAndCreateChildren();
        adapter.updateControls(this);

        getItemsPanel().updateRows();
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
        DiskVMInfoDataContainerImpl source = (DiskVMInfoDataContainerImpl) sourceContainer;

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