/** 
 * NetworkHostInfoDataContainerImpl.java
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

public class NetworkHostInfoDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel
        implements org.sblim.wbemsmt.vm.container.edit.NetworkHostInfoDataContainer,
        org.sblim.wbemsmt.vm.container.edit.NetworkHostInfoItemDataContainerHeader {

    private java.util.List icItems = new java.util.ArrayList();

    private MultiLinePanel itemsPanel;
    private int itemsCount;

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Pool;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Network;

    public NetworkHostInfoDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,
            String bindingPrefix) throws WbemsmtException {

        super(adapter, bindingPrefix, "NetworkHostInfoDataContainer.caption", false);

        setFooter(getPanelForCustomLayout(), "NetworkHostInfoDataContainer.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * linked container NetworkHostInfoItemDataContainer
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
                    "NetworkHostInfoItemDataContainer_AsItems_InNetworkHostInfoDataContainer.caption", //Key for title
                    org.sblim.wbemsmt.vm.container.edit.jsf.NetworkHostInfoItemDataContainer_AsItems_InNetworkHostInfoDataContainerImpl.COLS);
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
            return org.sblim.wbemsmt.vm.container.edit.jsf.NetworkHostInfoItemDataContainer_AsItems_InNetworkHostInfoDataContainerImpl.orientationOfColumnAsCss[column];
        }
    }

    private void addItems(
            org.sblim.wbemsmt.vm.container.edit.jsf.NetworkHostInfoItemDataContainer_AsItems_InNetworkHostInfoDataContainerImpl child) {

        getItems().add(child);
        getItemsPanel().addComponents(child.getComponents());

        //((LabeledJSFInputComponent)getItems_usr_PoolHeader()).getDependentChildFields().add(child.get_usr_Pool());
        //((LabeledJSFInputComponent)getItems_usr_NetworkHeader()).getDependentChildFields().add(child.get_usr_Network());
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
                org.sblim.wbemsmt.vm.container.edit.jsf.NetworkHostInfoItemDataContainer_AsItems_InNetworkHostInfoDataContainerImpl item = new org.sblim.wbemsmt.vm.container.edit.jsf.NetworkHostInfoItemDataContainer_AsItems_InNetworkHostInfoDataContainerImpl(
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
                (LabeledJSFInputComponent) getItemsHeader_usr_Pool(),
                (LabeledJSFInputComponent) getItemsHeader_usr_Network(), };
    }

    private String[] getItemsFieldNames() {
        return new String[] { "_usr_Pool", "_usr_Network", };
    }

    /**
     * Header for:
     * 
     * linked container NetworkHostInfoItemDataContainer
     */
    public org.sblim.wbemsmt.vm.container.edit.NetworkHostInfoItemDataContainerHeader getItemsHeader() {
        return this;
    }

    /**
     * Header for field pool
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Pool() {
        if (icItemsHeader_usr_Pool == null) {
            String label = bundle.getString("NetworkHostInfoItemDataContainer.pool");
            String binding = bindingPrefix + "itemsHeader_usr_Pool.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icItemsHeader_usr_Pool = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_Pool)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_Pool)
                .setHeader(true);

        return icItemsHeader_usr_Pool;
    }

    /**
     * Header for field network
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Network() {
        if (icItemsHeader_usr_Network == null) {
            String label = bundle.getString("NetworkHostInfoItemDataContainer.network");
            String binding = bindingPrefix + "itemsHeader_usr_Network.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icItemsHeader_usr_Network = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_Network)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_Network)
                .setHeader(true);

        return icItemsHeader_usr_Network;
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
                    org.sblim.wbemsmt.vm.container.edit.NetworkHostInfoItemDataContainer.class,
                    this);
            if (count != itemsCount) {
                itemsCount = count;
                clearItems();
                for (int i = 0; i < count; i++) {
                    addItems(new org.sblim.wbemsmt.vm.container.edit.jsf.NetworkHostInfoItemDataContainer_AsItems_InNetworkHostInfoDataContainerImpl(
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
        NetworkHostInfoDataContainerImpl source = (NetworkHostInfoDataContainerImpl) sourceContainer;

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