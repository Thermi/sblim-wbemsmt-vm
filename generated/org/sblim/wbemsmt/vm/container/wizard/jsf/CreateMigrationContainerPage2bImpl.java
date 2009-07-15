/** 
 * CreateMigrationContainerPage2bImpl.java
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

public class CreateMigrationContainerPage2bImpl extends
        org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements
        org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2b {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_MigrationTargetHostname;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_MigrationTargetPort;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_MigrationTargetNamespace;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_MigrationTargetUser;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_MigrationTargetPassword;

    public CreateMigrationContainerPage2bImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,
            String bindingPrefix) throws WbemsmtException {

        super(adapter, bindingPrefix, "CreateMigrationContainerPage2b.caption",
                "CreateMigrationContainerPage2b.subTitle", false);

        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_MigrationTargetHostname());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_MigrationTargetPort());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_MigrationTargetNamespace());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_MigrationTargetUser());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_MigrationTargetPassword());

        setFooter(getPanelForCustomLayout(), "CreateMigrationContainerPage2b.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_MigrationTargetHostname() {
        if (ic_usr_MigrationTargetHostname == null) {
            String label = bundle
                    .getString("CreateMigrationContainerPage2b.migrationTargetHostname");
            String binding = bindingPrefix + "_usr_MigrationTargetHostname.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_MigrationTargetHostname = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ic_usr_MigrationTargetHostname.setRequired(true);
            ;
        }

        return ic_usr_MigrationTargetHostname;
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_MigrationTargetPort() {
        if (ic_usr_MigrationTargetPort == null) {
            String label = bundle.getString("CreateMigrationContainerPage2b.migrationTargetPort");
            String binding = bindingPrefix + "_usr_MigrationTargetPort.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            boolean readOnly = false;
            ic_usr_MigrationTargetPort = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ic_usr_MigrationTargetPort.setRequired(true);
            ;
        }

        return ic_usr_MigrationTargetPort;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_MigrationTargetNamespace() {
        if (ic_usr_MigrationTargetNamespace == null) {
            String label = bundle
                    .getString("CreateMigrationContainerPage2b.migrationTargetNamespace");
            String binding = bindingPrefix + "_usr_MigrationTargetNamespace.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_MigrationTargetNamespace = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ic_usr_MigrationTargetNamespace.setRequired(true);
            ;
        }

        return ic_usr_MigrationTargetNamespace;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_MigrationTargetUser() {
        if (ic_usr_MigrationTargetUser == null) {
            String label = bundle.getString("CreateMigrationContainerPage2b.migrationTargetUser");
            String binding = bindingPrefix + "_usr_MigrationTargetUser.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_MigrationTargetUser = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ic_usr_MigrationTargetUser.setRequired(true);
            ;
        }

        return ic_usr_MigrationTargetUser;
    }

    /**
     * 
     * DataType STRING
     * UIType PASSWORD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_MigrationTargetPassword() {
        if (ic_usr_MigrationTargetPassword == null) {
            String label = bundle
                    .getString("CreateMigrationContainerPage2b.migrationTargetPassword");
            String binding = bindingPrefix + "_usr_MigrationTargetPassword.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_MigrationTargetPassword = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFPasswordFieldComponent(
                    parent, label, binding, converter, readOnly);
            ic_usr_MigrationTargetPassword.setRequired(true);
            ;
        }

        return ic_usr_MigrationTargetPassword;
    }

    public void reload() {
        super.reload();
        if (ic_usr_MigrationTargetHostname != null) {
            ic_usr_MigrationTargetHostname.setLabelText(bundle
                    .getString("CreateMigrationContainerPage2b.migrationTargetHostname"));
        }
        if (ic_usr_MigrationTargetPort != null) {
            ic_usr_MigrationTargetPort.setLabelText(bundle
                    .getString("CreateMigrationContainerPage2b.migrationTargetPort"));
        }
        if (ic_usr_MigrationTargetNamespace != null) {
            ic_usr_MigrationTargetNamespace.setLabelText(bundle
                    .getString("CreateMigrationContainerPage2b.migrationTargetNamespace"));
        }
        if (ic_usr_MigrationTargetUser != null) {
            ic_usr_MigrationTargetUser.setLabelText(bundle
                    .getString("CreateMigrationContainerPage2b.migrationTargetUser"));
        }
        if (ic_usr_MigrationTargetPassword != null) {
            ic_usr_MigrationTargetPassword.setLabelText(bundle
                    .getString("CreateMigrationContainerPage2b.migrationTargetPassword"));
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
        fields.add(get_usr_MigrationTargetHostname());
        fields.add(get_usr_MigrationTargetPort());
        fields.add(get_usr_MigrationTargetNamespace());
        fields.add(get_usr_MigrationTargetUser());
        fields.add(get_usr_MigrationTargetPassword());
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
        CreateMigrationContainerPage2bImpl source = (CreateMigrationContainerPage2bImpl) sourceContainer;

        get_usr_MigrationTargetHostname().copyFrom(source.get_usr_MigrationTargetHostname());
        get_usr_MigrationTargetPort().copyFrom(source.get_usr_MigrationTargetPort());
        get_usr_MigrationTargetNamespace().copyFrom(source.get_usr_MigrationTargetNamespace());
        get_usr_MigrationTargetUser().copyFrom(source.get_usr_MigrationTargetUser());
        get_usr_MigrationTargetPassword().copyFrom(source.get_usr_MigrationTargetPassword());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}