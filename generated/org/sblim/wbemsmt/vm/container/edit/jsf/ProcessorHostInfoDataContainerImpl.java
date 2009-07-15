/** 
 * ProcessorHostInfoDataContainerImpl.java
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

public class ProcessorHostInfoDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel
        implements org.sblim.wbemsmt.vm.container.edit.ProcessorHostInfoDataContainer,
        org.sblim.wbemsmt.vm.container.edit.ProcessorHostInfoItemDataContainerHeader {

    private java.util.List icItems = new java.util.ArrayList();

    private MultiLinePanel itemsPanel;
    private int itemsCount;

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Min;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Max;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_DefaultValue;

    public ProcessorHostInfoDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,
            String bindingPrefix) throws WbemsmtException {

        super(adapter, bindingPrefix, "ProcessorHostInfoDataContainer.caption", false);

        setFooter(getPanelForCustomLayout(), "ProcessorHostInfoDataContainer.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * linked container ProcessorHostInfoItemDataContainer
     */
    public java.util.List getItems() {
        return icItems;
    }

    public MultiLinePanel getItemsPanel() {
        if (itemsPanel == null) {
            itemsPanel = new ItemsPanel(
                    adapter,
                    bindingPrefix, // the prefix for binding values
                    "#{" + bindingPrefix + "itemsPanel", // binding for Title
                    "ProcessorHostInfoItemDataContainer_AsItems_InProcessorHostInfoDataContainer.caption", //Key for title
                    org.sblim.wbemsmt.vm.container.edit.jsf.ProcessorHostInfoItemDataContainer_AsItems_InProcessorHostInfoDataContainerImpl.COLS);
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
            return org.sblim.wbemsmt.vm.container.edit.jsf.ProcessorHostInfoItemDataContainer_AsItems_InProcessorHostInfoDataContainerImpl.orientationOfColumnAsCss[column];
        }
    }

    private void addItems(
            org.sblim.wbemsmt.vm.container.edit.jsf.ProcessorHostInfoItemDataContainer_AsItems_InProcessorHostInfoDataContainerImpl child) {

        getItems().add(child);
        getItemsPanel().addComponents(child.getComponents());

        //((LabeledJSFInputComponent)getItems_usr_MinHeader()).getDependentChildFields().add(child.get_usr_Min());
        //((LabeledJSFInputComponent)getItems_usr_MaxHeader()).getDependentChildFields().add(child.get_usr_Max());
        //((LabeledJSFInputComponent)getItems_usr_DefaultValueHeader()).getDependentChildFields().add(child.get_usr_DefaultValue());
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
                org.sblim.wbemsmt.vm.container.edit.jsf.ProcessorHostInfoItemDataContainer_AsItems_InProcessorHostInfoDataContainerImpl item = new org.sblim.wbemsmt.vm.container.edit.jsf.ProcessorHostInfoItemDataContainer_AsItems_InProcessorHostInfoDataContainerImpl(
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
                (LabeledJSFInputComponent) getItemsHeader_usr_Min(),
                (LabeledJSFInputComponent) getItemsHeader_usr_Max(),
                (LabeledJSFInputComponent) getItemsHeader_usr_DefaultValue(), };
    }

    private String[] getItemsFieldNames() {
        return new String[] { "_usr_Min", "_usr_Max", "_usr_DefaultValue", };
    }

    /**
     * Header for:
     * 
     * linked container ProcessorHostInfoItemDataContainer
     */
    public org.sblim.wbemsmt.vm.container.edit.ProcessorHostInfoItemDataContainerHeader getItemsHeader() {
        return this;
    }

    /**
     * Header for field min
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Min() {
        if (icItemsHeader_usr_Min == null) {
            String label = bundle.getString("ProcessorHostInfoItemDataContainer.min");
            String binding = bindingPrefix + "itemsHeader_usr_Min.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icItemsHeader_usr_Min = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_Min)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_Min)
                .setHeader(true);

        return icItemsHeader_usr_Min;
    }

    /**
     * Header for field max
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Max() {
        if (icItemsHeader_usr_Max == null) {
            String label = bundle.getString("ProcessorHostInfoItemDataContainer.max");
            String binding = bindingPrefix + "itemsHeader_usr_Max.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icItemsHeader_usr_Max = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_Max)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_Max)
                .setHeader(true);

        return icItemsHeader_usr_Max;
    }

    /**
     * Header for field defaultValue
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_DefaultValue() {
        if (icItemsHeader_usr_DefaultValue == null) {
            String label = bundle.getString("ProcessorHostInfoItemDataContainer.defaultValue");
            String binding = bindingPrefix + "itemsHeader_usr_DefaultValue.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icItemsHeader_usr_DefaultValue = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_DefaultValue)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_DefaultValue)
                .setHeader(true);

        return icItemsHeader_usr_DefaultValue;
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
                    org.sblim.wbemsmt.vm.container.edit.ProcessorHostInfoItemDataContainer.class,
                    this);
            if (count != itemsCount) {
                itemsCount = count;
                clearItems();
                for (int i = 0; i < count; i++) {
                    addItems(new org.sblim.wbemsmt.vm.container.edit.jsf.ProcessorHostInfoItemDataContainer_AsItems_InProcessorHostInfoDataContainerImpl(
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
        ProcessorHostInfoDataContainerImpl source = (ProcessorHostInfoDataContainerImpl) sourceContainer;

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