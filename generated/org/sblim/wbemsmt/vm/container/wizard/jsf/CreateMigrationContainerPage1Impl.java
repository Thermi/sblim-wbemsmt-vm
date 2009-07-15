/** 
 * CreateMigrationContainerPage1Impl.java
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

public class CreateMigrationContainerPage1Impl extends
        org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements
        org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage1 {
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_PresetOrUserdefined;

    public CreateMigrationContainerPage1Impl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,
            String bindingPrefix) throws WbemsmtException {

        super(adapter, bindingPrefix, "CreateMigrationContainerPage1.caption",
                "CreateMigrationContainerPage1.subTitle", false);

        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_PresetOrUserdefined());

        setFooter(getPanelForCustomLayout(), "CreateMigrationContainerPage1.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType RADIOBUTTON
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_PresetOrUserdefined() {
        if (ic_usr_PresetOrUserdefined == null) {
            String label = bundle.getString("CreateMigrationContainerPage1.presetOrUserdefined");
            String binding = bindingPrefix + "_usr_PresetOrUserdefined.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
            boolean readOnly = false;
            ic_usr_PresetOrUserdefined = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFRadioButtonComponent(
                    parent, label, binding, converter, readOnly);
            ic_usr_PresetOrUserdefined.setRequired(true);
            ;
        }

        return ic_usr_PresetOrUserdefined;
    }

    public void reload() {
        super.reload();
        if (ic_usr_PresetOrUserdefined != null) {
            ic_usr_PresetOrUserdefined.setLabelText(bundle
                    .getString("CreateMigrationContainerPage1.presetOrUserdefined"));
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
        fields.add(get_usr_PresetOrUserdefined());
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
        CreateMigrationContainerPage1Impl source = (CreateMigrationContainerPage1Impl) sourceContainer;

        get_usr_PresetOrUserdefined().copyFrom(source.get_usr_PresetOrUserdefined());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}