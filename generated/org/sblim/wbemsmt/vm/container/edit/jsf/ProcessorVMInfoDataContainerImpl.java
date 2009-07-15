/** 
 * ProcessorVMInfoDataContainerImpl.java
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

public class ProcessorVMInfoDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel
        implements org.sblim.wbemsmt.vm.container.edit.ProcessorVMInfoDataContainer,
        org.sblim.wbemsmt.vm.container.edit.ProcessorVMInfoItemDataContainerHeader {

    private java.util.List icItems = new java.util.ArrayList();

    private MultiLinePanel itemsPanel;
    private int itemsCount;

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Current;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Min;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Max;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_DefaultValue;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Weight;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Limit;

    public ProcessorVMInfoDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,
            String bindingPrefix) throws WbemsmtException {

        super(adapter, bindingPrefix, "ProcessorVMInfoDataContainer.caption", false);

        setFooter(getPanelForCustomLayout(), "ProcessorVMInfoDataContainer.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * linked container ProcessorVMInfoItemDataContainer
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
                    "ProcessorVMInfoItemDataContainer_AsItems_InProcessorVMInfoDataContainer.caption", //Key for title
                    org.sblim.wbemsmt.vm.container.edit.jsf.ProcessorVMInfoItemDataContainer_AsItems_InProcessorVMInfoDataContainerImpl.COLS);
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
            return org.sblim.wbemsmt.vm.container.edit.jsf.ProcessorVMInfoItemDataContainer_AsItems_InProcessorVMInfoDataContainerImpl.orientationOfColumnAsCss[column];
        }
    }

    private void addItems(
            org.sblim.wbemsmt.vm.container.edit.jsf.ProcessorVMInfoItemDataContainer_AsItems_InProcessorVMInfoDataContainerImpl child) {

        getItems().add(child);
        getItemsPanel().addComponents(child.getComponents());

        //((LabeledJSFInputComponent)getItems_usr_CurrentHeader()).getDependentChildFields().add(child.get_usr_Current());
        //((LabeledJSFInputComponent)getItems_usr_MinHeader()).getDependentChildFields().add(child.get_usr_Min());
        //((LabeledJSFInputComponent)getItems_usr_MaxHeader()).getDependentChildFields().add(child.get_usr_Max());
        //((LabeledJSFInputComponent)getItems_usr_DefaultValueHeader()).getDependentChildFields().add(child.get_usr_DefaultValue());
        //((LabeledJSFInputComponent)getItems_usr_WeightHeader()).getDependentChildFields().add(child.get_usr_Weight());
        //((LabeledJSFInputComponent)getItems_usr_LimitHeader()).getDependentChildFields().add(child.get_usr_Limit());
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
                org.sblim.wbemsmt.vm.container.edit.jsf.ProcessorVMInfoItemDataContainer_AsItems_InProcessorVMInfoDataContainerImpl item = new org.sblim.wbemsmt.vm.container.edit.jsf.ProcessorVMInfoItemDataContainer_AsItems_InProcessorVMInfoDataContainerImpl(
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
                (LabeledJSFInputComponent) getItemsHeader_usr_Current(),
                (LabeledJSFInputComponent) getItemsHeader_usr_Min(),
                (LabeledJSFInputComponent) getItemsHeader_usr_Max(),
                (LabeledJSFInputComponent) getItemsHeader_usr_DefaultValue(),
                (LabeledJSFInputComponent) getItemsHeader_usr_Weight(),
                (LabeledJSFInputComponent) getItemsHeader_usr_Limit(), };
    }

    private String[] getItemsFieldNames() {
        return new String[] { "_usr_Current", "_usr_Min", "_usr_Max", "_usr_DefaultValue",
                "_usr_Weight", "_usr_Limit", };
    }

    /**
     * Header for:
     * 
     * linked container ProcessorVMInfoItemDataContainer
     */
    public org.sblim.wbemsmt.vm.container.edit.ProcessorVMInfoItemDataContainerHeader getItemsHeader() {
        return this;
    }

    /**
     * Header for field current
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Current() {
        if (icItemsHeader_usr_Current == null) {
            String label = bundle.getString("ProcessorVMInfoItemDataContainer.current");
            String binding = bindingPrefix + "itemsHeader_usr_Current.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icItemsHeader_usr_Current = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_Current)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_Current)
                .setHeader(true);

        return icItemsHeader_usr_Current;
    }

    /**
     * Header for field min
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Min() {
        if (icItemsHeader_usr_Min == null) {
            String label = bundle.getString("ProcessorVMInfoItemDataContainer.min");
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
            String label = bundle.getString("ProcessorVMInfoItemDataContainer.max");
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
            String label = bundle.getString("ProcessorVMInfoItemDataContainer.defaultValue");
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

    /**
     * Header for field weight
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Weight() {
        if (icItemsHeader_usr_Weight == null) {
            String label = bundle.getString("ProcessorVMInfoItemDataContainer.weight");
            String binding = bindingPrefix + "itemsHeader_usr_Weight.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icItemsHeader_usr_Weight = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_Weight)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_Weight)
                .setHeader(true);

        return icItemsHeader_usr_Weight;
    }

    /**
     * Header for field limit
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Limit() {
        if (icItemsHeader_usr_Limit == null) {
            String label = bundle.getString("ProcessorVMInfoItemDataContainer.limit");
            String binding = bindingPrefix + "itemsHeader_usr_Limit.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icItemsHeader_usr_Limit = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_Limit)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_Limit)
                .setHeader(true);

        return icItemsHeader_usr_Limit;
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
                    org.sblim.wbemsmt.vm.container.edit.ProcessorVMInfoItemDataContainer.class,
                    this);
            if (count != itemsCount) {
                itemsCount = count;
                clearItems();
                for (int i = 0; i < count; i++) {
                    addItems(new org.sblim.wbemsmt.vm.container.edit.jsf.ProcessorVMInfoItemDataContainer_AsItems_InProcessorVMInfoDataContainerImpl(
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
        ProcessorVMInfoDataContainerImpl source = (ProcessorVMInfoDataContainerImpl) sourceContainer;

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