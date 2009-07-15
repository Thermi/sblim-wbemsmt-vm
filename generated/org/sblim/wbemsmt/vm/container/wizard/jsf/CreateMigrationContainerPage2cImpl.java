/** 
 * CreateMigrationContainerPage2cImpl.java
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

package org.sblim.wbemsmt.vm.container.wizard.jsf;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class CreateMigrationContainerPage2cImpl extends
        org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements
        org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2c {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_TargetHost;

    public CreateMigrationContainerPage2cImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,
            String bindingPrefix) throws WbemsmtException {

        super(adapter, bindingPrefix, "CreateMigrationContainerPage2c.caption",
                "CreateMigrationContainerPage2c.subTitle", false);

        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_TargetHost());

        setFooter(getPanelForCustomLayout(), "CreateMigrationContainerPage2c.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_TargetHost() {
        if (ic_usr_TargetHost == null) {
            String label = bundle.getString("CreateMigrationContainerPage2c.targetHost");
            String binding = bindingPrefix + "_usr_TargetHost.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_TargetHost = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_TargetHost;
    }

    public void reload() {
        super.reload();
        if (ic_usr_TargetHost != null) {
            ic_usr_TargetHost.setLabelText(bundle
                    .getString("CreateMigrationContainerPage2c.targetHost"));
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
        fields.add(get_usr_TargetHost());
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
        CreateMigrationContainerPage2cImpl source = (CreateMigrationContainerPage2cImpl) sourceContainer;

        get_usr_TargetHost().copyFrom(source.get_usr_TargetHost());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}