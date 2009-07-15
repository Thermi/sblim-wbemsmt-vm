/** 
 * WelcomeDataContainerImpl.java
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

public class WelcomeDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements
        org.sblim.wbemsmt.vm.container.edit.WelcomeDataContainer,
        org.sblim.wbemsmt.vm.container.edit.WelcomeItemDataContainerHeader {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Picture;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Welcometext;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_CreateLink;

    private java.util.List icItems = new java.util.ArrayList();

    private MultiLinePanel itemsPanel;
    private int itemsCount;

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_VMName;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Info;

    WelcomeDataContainerImplLayouter layouter = null;

    public WelcomeDataContainerImplLayouter getLayouter() {
        return layouter;
    }

    public WelcomeDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,
            String bindingPrefix) throws WbemsmtException {

        super(adapter, bindingPrefix, "WelcomeDataContainer.caption", true);

        adapter.periodicalRefresh(this);

        layouter = new WelcomeDataContainerImplLayouter();
        //layout is done in the edit-method of the Editbean
        //layouter.layout(getPanelForCustomLayout(),this,bundle);

        setFooter(getPanelForCustomLayout(), "WelcomeDataContainer.footerText");
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
            String label = bundle.getString("WelcomeDataContainer.picture");
            String binding = bindingPrefix + "_usr_Picture.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.jsf.PictureDataConverter();
            boolean readOnly = false;
            ic_usr_Picture = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFPictureComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        //the container is dynamic so udpate the access time
        adapter.updateAccesTime(this);
        super.checkForUpdateControls();

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
            String label = bundle.getString("WelcomeDataContainer.welcometext");
            String binding = bindingPrefix + "_usr_Welcometext.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.jsf.MemoDataConverter();
            boolean readOnly = false;
            ic_usr_Welcometext = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFMemoComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        //the container is dynamic so udpate the access time
        adapter.updateAccesTime(this);
        super.checkForUpdateControls();

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
            String label = bundle.getString("WelcomeDataContainer.createLink");
            String binding = bindingPrefix + "_usr_CreateLink.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.jsf.LinkDataConverter();
            boolean readOnly = false;
            ic_usr_CreateLink = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLinkComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        //the container is dynamic so udpate the access time
        adapter.updateAccesTime(this);
        super.checkForUpdateControls();

        return ic_usr_CreateLink;
    }

    /**
     * 
     * linked container WelcomeItemDataContainer
     */
    public java.util.List getItems() {
        //the container is dynamic so udpate the access time
        adapter.updateAccesTime(this);
        super.checkForUpdateControls();
        return icItems;
    }

    public MultiLinePanel getItemsPanel() {
        if (itemsPanel == null) {
            itemsPanel = new ItemsPanel(adapter,
                    bindingPrefix, // the prefix for binding values
                    "#{" + bindingPrefix + "itemsPanel", // binding for Title
                    "WelcomeItemDataContainer_AsItems_InWelcomeDataContainer.caption", //Key for title
                    org.sblim.wbemsmt.vm.container.edit.jsf.WelcomeItemDataContainer_AsItems_InWelcomeDataContainerImpl.COLS);
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
            return org.sblim.wbemsmt.vm.container.edit.jsf.WelcomeItemDataContainer_AsItems_InWelcomeDataContainerImpl.orientationOfColumnAsCss[column];
        }
    }

    private void addItems(
            org.sblim.wbemsmt.vm.container.edit.jsf.WelcomeItemDataContainer_AsItems_InWelcomeDataContainerImpl child) {

        getItems().add(child);
        getItemsPanel().addComponents(child.getComponents());

        //((LabeledJSFInputComponent)getItems_usr_VMNameHeader()).getDependentChildFields().add(child.get_usr_VMName());
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
        //the container is dynamic so udpate the access time
        adapter.updateAccesTime(this);
        super.checkForUpdateControls();

        List result = new ArrayList();
        result.addAll(icItems);

        while (result.size() < MIN_TABLE_LENGTH) {
            try {
                org.sblim.wbemsmt.vm.container.edit.jsf.WelcomeItemDataContainer_AsItems_InWelcomeDataContainerImpl item = new org.sblim.wbemsmt.vm.container.edit.jsf.WelcomeItemDataContainer_AsItems_InWelcomeDataContainerImpl(
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
                (LabeledJSFInputComponent) getItemsHeader_usr_VMName(),
                (LabeledJSFInputComponent) getItemsHeader_usr_Info(), };
    }

    private String[] getItemsFieldNames() {
        return new String[] { "_usr_VMName", "_usr_Info", };
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
            String label = bundle.getString("WelcomeItemDataContainer.VMName");
            String binding = bindingPrefix + "itemsHeader_usr_VMName.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            icItemsHeader_usr_VMName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_VMName)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent) icItemsHeader_usr_VMName)
                .setHeader(true);

        return icItemsHeader_usr_VMName;
    }

    /**
     * Header for field Info
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Info() {
        if (icItemsHeader_usr_Info == null) {
            String label = bundle.getString("WelcomeItemDataContainer.Info");
            String binding = bindingPrefix + "itemsHeader_usr_Info.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.jsf.MemoDataConverter();
            boolean readOnly = false;
            icItemsHeader_usr_Info = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFMemoComponent(
                    parent, label, binding, converter, readOnly);
            ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFMemoComponent) icItemsHeader_usr_Info)
                    .setOrientation(org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT);
        }
        ((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFMemoComponent) icItemsHeader_usr_Info)
                .setHeader(true);

        return icItemsHeader_usr_Info;
    }

    public void reload() {
        super.reload();
        if (ic_usr_Picture != null) {
            ic_usr_Picture.setLabelText(bundle.getString("WelcomeDataContainer.picture"));
        }
        if (ic_usr_Welcometext != null) {
            ic_usr_Welcometext.setLabelText(bundle.getString("WelcomeDataContainer.welcometext"));
        }
        if (ic_usr_CreateLink != null) {
            ic_usr_CreateLink.setLabelText(bundle.getString("WelcomeDataContainer.createLink"));
        }
    }

    public String[] getResourceBundleNames() {
        return new String[] { "messages", "messagesVm" };
    }

    public void countAndCreateChildren() throws WbemsmtException {

        try {
            int count = adapter.count("items",
                    org.sblim.wbemsmt.vm.container.edit.WelcomeItemDataContainer.class, this);
            if (count != itemsCount) {
                itemsCount = count;
                clearItems();
                for (int i = 0; i < count; i++) {
                    addItems(new org.sblim.wbemsmt.vm.container.edit.jsf.WelcomeItemDataContainer_AsItems_InWelcomeDataContainerImpl(
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