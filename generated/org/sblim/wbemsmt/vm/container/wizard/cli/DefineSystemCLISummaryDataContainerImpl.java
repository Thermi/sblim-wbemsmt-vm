/** 
 * DefineSystemCLISummaryDataContainerImpl.java
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

package org.sblim.wbemsmt.vm.container.wizard.cli;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class DefineSystemCLISummaryDataContainerImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer,
        org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryConfigItemDataContainerHeader {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Memory;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Processor;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_StartAfterCreation;

    private java.util.List icConfigValues = new java.util.ArrayList();

    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icConfigValuesHeader_usr_Name;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icConfigValuesHeader_usr_CurrentValue;
    private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icConfigValuesHeader_usr_Userdefined;

    public DefineSystemCLISummaryDataContainerImpl(AbstractBaseCimAdapter adapter)
            throws WbemsmtException {
        super();
        setAdapter(adapter);
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Memory() {
        if (ic_usr_Memory == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLISummaryDataContainer.memory");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Memory = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,
                    label, null, converter);
        }
        return ic_usr_Memory;
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Processor() {
        if (ic_usr_Processor == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLISummaryDataContainer.processor");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Processor = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_Processor;
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_StartAfterCreation() {
        if (ic_usr_StartAfterCreation == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLISummaryDataContainer.startAfterCreation");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_StartAfterCreation = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_StartAfterCreation;
    }

    /**
     * 
     * linked container DefineSystemCLISummaryConfigItemDataContainer
     */
    public java.util.List getConfigValues() {
        return icConfigValues;
    }

    /**
     * Header for:
     * 
     * linked container DefineSystemCLISummaryConfigItemDataContainer
     */
    public org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryConfigItemDataContainerHeader getConfigValuesHeader() {
        return this;
    }

    /**
     * Header for field name
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getConfigValuesHeader_usr_Name() {
        if (icConfigValuesHeader_usr_Name == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLISummaryConfigItemDataContainer.name");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icConfigValuesHeader_usr_Name = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icConfigValuesHeader_usr_Name;
    }

    /**
     * Header for field currentValue
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getConfigValuesHeader_usr_CurrentValue() {
        if (icConfigValuesHeader_usr_CurrentValue == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLISummaryConfigItemDataContainer.currentValue");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icConfigValuesHeader_usr_CurrentValue = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icConfigValuesHeader_usr_CurrentValue;
    }

    /**
     * Header for field userdefined
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getConfigValuesHeader_usr_Userdefined() {
        if (icConfigValuesHeader_usr_Userdefined == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLISummaryConfigItemDataContainer.userdefined");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            icConfigValuesHeader_usr_Userdefined = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return icConfigValuesHeader_usr_Userdefined;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString(
                    "DefineSystemCLISummaryDataContainer.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            if (get_usr_Memory().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Memory())
                        .getValue();
                printStream.println(get_usr_Memory().getLabelText() + ": " + value);
            }
            if (get_usr_Processor().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Processor())
                        .getValue();
                printStream.println(get_usr_Processor().getLabelText() + ": " + value);
            }
            if (get_usr_StartAfterCreation().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_StartAfterCreation())
                        .getValue();
                printStream.println(get_usr_StartAfterCreation().getLabelText() + ": " + value);
            }
        }

        if (showChilds(listOptions)) {
            traceChilds(printStream, listOptions, title);
        }
    }

    public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title) {
        List listconfigValues = getConfigValues();
        printStream.println();
        printStream.println(getAdapter().getBundle().getString(
                "DefineSystemCLISummaryDataContainer.role.configValues")
                + " "
                + getAdapter().getBundle().getString("items.found",
                        new Object[] { new Integer(listconfigValues.size()) }));
        for (int i = 0; i < listconfigValues.size(); i++) {
            BaseDataContainer child = (BaseDataContainer) listconfigValues.get(i);
            printStream.println();
            printStream.println(getAdapter().getBundle().getString("item") + ": " + (i + 1) + " "
                    + getAdapter().getBundle().getString("of") + " " + listconfigValues.size());
            child.trace(printStream, listOptions, false);
        }

    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        fields.add(get_usr_Memory());
        fields.add(get_usr_Processor());
        fields.add(get_usr_StartAfterCreation());
        return fields;
    }

    /**
     * Return a list of all associated childContainers. A childContainer is a DataContainer
     * @return
     */
    public List getChildContainers() {
        List childs = new ArrayList();
        childs.addAll(getConfigValues());
        return childs;

    }

    public void copyFrom(DataContainer sourceContainer) throws WbemsmtException {
        DefineSystemCLISummaryDataContainerImpl source = (DefineSystemCLISummaryDataContainerImpl) sourceContainer;

        get_usr_Memory().copyFrom(source.get_usr_Memory());
        get_usr_Processor().copyFrom(source.get_usr_Processor());
        get_usr_StartAfterCreation().copyFrom(source.get_usr_StartAfterCreation());

        List targetListForConfigValues = (List) getConfigValues();
        List sourceListForConfigValues = (List) source.getConfigValues();
        if (sourceListForConfigValues.size() != targetListForConfigValues.size()) {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                    "The Lists are not from same size. Source is "
                            + sourceListForConfigValues.size() + " and target is "
                            + targetListForConfigValues.size());
        }
        for (int ii = 0; ii < sourceListForConfigValues.size(); ii++) {
            ((DataContainer) targetListForConfigValues.get(ii))
                    .copyFrom(((DataContainer) sourceListForConfigValues.get(ii)));
        }

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }
}