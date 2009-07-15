/** 
 * MemoryHostInfoItemDataContainerImpl.java
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

package org.sblim.wbemsmt.vm.container.edit.cli;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class MemoryHostInfoItemDataContainerImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.vm.container.edit.MemoryHostInfoItemDataContainer {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Min;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Max;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_DefaultValue;

    public MemoryHostInfoItemDataContainerImpl(AbstractBaseCimAdapter adapter)
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

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Min() {
        if (ic_usr_Min == null) {
            String label = getAdapter().getBundle()
                    .getString("MemoryHostInfoItemDataContainer.min");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Min = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,
                    label, null, converter);
        }
        return ic_usr_Min;
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Max() {
        if (ic_usr_Max == null) {
            String label = getAdapter().getBundle()
                    .getString("MemoryHostInfoItemDataContainer.max");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Max = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,
                    label, null, converter);
        }
        return ic_usr_Max;
    }

    /**
     * 
     * DataType STRING
     * UIType LABEL
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_DefaultValue() {
        if (ic_usr_DefaultValue == null) {
            String label = getAdapter().getBundle().getString(
                    "MemoryHostInfoItemDataContainer.defaultValue");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_DefaultValue = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_DefaultValue;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString(
                    "MemoryHostInfoItemDataContainer.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            if (get_usr_Min().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Min())
                        .getValue();
                printStream.println(get_usr_Min().getLabelText() + ": " + value);
            }
            if (get_usr_Max().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Max())
                        .getValue();
                printStream.println(get_usr_Max().getLabelText() + ": " + value);
            }
            if (get_usr_DefaultValue().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_DefaultValue())
                        .getValue();
                printStream.println(get_usr_DefaultValue().getLabelText() + ": " + value);
            }
        }

        if (showChilds(listOptions)) {
            traceChilds(printStream, listOptions, title);
        }
    }

    public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title) {

    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        fields.add(get_usr_Min());
        fields.add(get_usr_Max());
        fields.add(get_usr_DefaultValue());
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
        MemoryHostInfoItemDataContainerImpl source = (MemoryHostInfoItemDataContainerImpl) sourceContainer;

        get_usr_Min().copyFrom(source.get_usr_Min());
        get_usr_Max().copyFrom(source.get_usr_Max());
        get_usr_DefaultValue().copyFrom(source.get_usr_DefaultValue());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }
}