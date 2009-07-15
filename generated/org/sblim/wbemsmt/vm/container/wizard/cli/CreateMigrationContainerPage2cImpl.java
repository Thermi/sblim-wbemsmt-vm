/** 
 * CreateMigrationContainerPage2cImpl.java
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

public class CreateMigrationContainerPage2cImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2c {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_TargetHost;

    public CreateMigrationContainerPage2cImpl(AbstractBaseCimAdapter adapter)
            throws WbemsmtException {
        super();
        setAdapter(adapter);
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
            String label = getAdapter().getBundle().getString(
                    "CreateMigrationContainerPage2c.targetHost");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_TargetHost = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_TargetHost;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString(
                    "CreateMigrationContainerPage2c.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            if (get_usr_TargetHost().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_TargetHost())
                        .getValue();
                printStream.println(get_usr_TargetHost().getLabelText() + ": " + value);
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