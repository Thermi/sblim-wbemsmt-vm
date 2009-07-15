/** 
 * HostSystemInfoItemDataContainerImpl.java
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

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class HostSystemInfoItemDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel
        implements org.sblim.wbemsmt.vm.container.edit.HostSystemInfoItemDataContainer {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_VMName;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Info;

    public HostSystemInfoItemDataContainerImpl(
            org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter, String bindingPrefix)
            throws WbemsmtException {

        super(adapter, bindingPrefix, "HostSystemInfoItemDataContainer.caption", false);

        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_VMName());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Info());

        setFooter(getPanelForCustomLayout(), "HostSystemInfoItemDataContainer.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_VMName() {
        if (ic_usr_VMName == null) {
            String label = bundle.getString("HostSystemInfoItemDataContainer.VMName");
            String binding = bindingPrefix + "_usr_VMName.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_VMName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,
                    label, binding, converter, readOnly);
            ;
        }

        return ic_usr_VMName;
    }

    /**
     * 
     * DataType MEMODATA
     * UIType MEMO
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Info() {
        if (ic_usr_Info == null) {
            String label = bundle.getString("HostSystemInfoItemDataContainer.Info");
            String binding = bindingPrefix + "_usr_Info.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.jsf.MemoDataConverter();
            boolean readOnly = false;
            ic_usr_Info = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFMemoComponent(parent,
                    label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Info;
    }

    public void reload() {
        super.reload();
        if (ic_usr_VMName != null) {
            ic_usr_VMName.setLabelText(bundle.getString("HostSystemInfoItemDataContainer.VMName"));
        }
        if (ic_usr_Info != null) {
            ic_usr_Info.setLabelText(bundle.getString("HostSystemInfoItemDataContainer.Info"));
        }
    }

    public String[] getResourceBundleNames() {
        return new String[] { "messages", "messagesVm" };
    }

    public void countAndCreateChildren() throws WbemsmtException {

    }

    /**
     * count and create childrens
     * @throws WbemsmtException
     */
    public void updateControls() throws WbemsmtException {
        countAndCreateChildren();
        adapter.updateControls(this);

    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        fields.add(get_usr_VMName());
        fields.add(get_usr_Info());
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
        HostSystemInfoItemDataContainerImpl source = (HostSystemInfoItemDataContainerImpl) sourceContainer;

        get_usr_VMName().copyFrom(source.get_usr_VMName());
        get_usr_Info().copyFrom(source.get_usr_Info());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}