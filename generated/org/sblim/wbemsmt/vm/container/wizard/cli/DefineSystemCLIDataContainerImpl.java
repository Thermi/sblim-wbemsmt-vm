/** 
 * DefineSystemCLIDataContainerImpl.java
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

public class DefineSystemCLIDataContainerImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer {
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_ReferencedSystem;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Memory;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Processor;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Networks;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Disks;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_AddDisk;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_RemoveDisk;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_DiskConfigKey;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_DiskConfigValue;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_DiskSelector;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_AddNetwork;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_RemoveNetwork;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_NetworkConfigKey;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_NetworkConfigValue;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_NetworkSelector;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_ConfigValue;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_ConfigKey;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Execute;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_StartAfterCreation;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_ListOnly;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Sessionkey;
    private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_VirtualSystemType;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_DeleteSession;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_CleanupSession;

    public DefineSystemCLIDataContainerImpl(AbstractBaseCimAdapter adapter) throws WbemsmtException {
        super();
        setAdapter(adapter);
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType LIST
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_ReferencedSystem() {
        if (ic_usr_ReferencedSystem == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.referencedSystem");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            ic_usr_ReferencedSystem = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, null, converter);
        }
        return ic_usr_ReferencedSystem;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Memory() {
        if (ic_usr_Memory == null) {
            String label = getAdapter().getBundle()
                    .getString("DefineSystemCLIDataContainer.memory");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Memory = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,
                    label, null, converter);
        }
        return ic_usr_Memory;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Processor() {
        if (ic_usr_Processor == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.processor");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Processor = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_Processor;
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType LIST
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Networks() {
        if (ic_usr_Networks == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.networks");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            ic_usr_Networks = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, null, converter);
        }
        return ic_usr_Networks;
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType LIST
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Disks() {
        if (ic_usr_Disks == null) {
            String label = getAdapter().getBundle().getString("DefineSystemCLIDataContainer.disks");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            ic_usr_Disks = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, null, converter);
        }
        return ic_usr_Disks;
    }

    /**
     * 
     * DataType ACTION
     * UIType BUTTON
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_AddDisk() {
        if (ic_usr_AddDisk == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.addDisk");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_AddDisk = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(
                    this, label, null, converter);
        }
        return ic_usr_AddDisk;
    }

    /**
     * 
     * DataType ACTION
     * UIType BUTTON
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_RemoveDisk() {
        if (ic_usr_RemoveDisk == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.removeDisk");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_RemoveDisk = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(
                    this, label, null, converter);
        }
        return ic_usr_RemoveDisk;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_DiskConfigKey() {
        if (ic_usr_DiskConfigKey == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.diskConfigKey");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_DiskConfigKey = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_DiskConfigKey;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_DiskConfigValue() {
        if (ic_usr_DiskConfigValue == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.diskConfigValue");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_DiskConfigValue = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_DiskConfigValue;
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType LIST
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_DiskSelector() {
        if (ic_usr_DiskSelector == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.diskSelector");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            ic_usr_DiskSelector = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, null, converter);
        }
        return ic_usr_DiskSelector;
    }

    /**
     * 
     * DataType ACTION
     * UIType BUTTON
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_AddNetwork() {
        if (ic_usr_AddNetwork == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.addNetwork");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_AddNetwork = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(
                    this, label, null, converter);
        }
        return ic_usr_AddNetwork;
    }

    /**
     * 
     * DataType ACTION
     * UIType BUTTON
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_RemoveNetwork() {
        if (ic_usr_RemoveNetwork == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.removeNetwork");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_RemoveNetwork = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(
                    this, label, null, converter);
        }
        return ic_usr_RemoveNetwork;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_NetworkConfigKey() {
        if (ic_usr_NetworkConfigKey == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.networkConfigKey");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_NetworkConfigKey = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_NetworkConfigKey;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_NetworkConfigValue() {
        if (ic_usr_NetworkConfigValue == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.networkConfigValue");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_NetworkConfigValue = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_NetworkConfigValue;
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType LIST
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_NetworkSelector() {
        if (ic_usr_NetworkSelector == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.networkSelector");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            ic_usr_NetworkSelector = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, null, converter);
        }
        return ic_usr_NetworkSelector;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_ConfigValue() {
        if (ic_usr_ConfigValue == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.configValue");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_ConfigValue = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_ConfigValue;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_ConfigKey() {
        if (ic_usr_ConfigKey == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.configKey");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_ConfigKey = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_ConfigKey;
    }

    /**
     * 
     * DataType ACTION
     * UIType BUTTON
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Execute() {
        if (ic_usr_Execute == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.execute");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Execute = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(
                    this, label, null, converter);
        }
        return ic_usr_Execute;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_StartAfterCreation() {
        if (ic_usr_StartAfterCreation == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.startAfterCreation");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            ic_usr_StartAfterCreation = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_StartAfterCreation;
    }

    /**
     * 
     * DataType ACTION
     * UIType BUTTON
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_ListOnly() {
        if (ic_usr_ListOnly == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.listOnly");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_ListOnly = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(
                    this, label, null, converter);
        }
        return ic_usr_ListOnly;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Sessionkey() {
        if (ic_usr_Sessionkey == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.sessionkey");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Sessionkey = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_Sessionkey;
    }

    /**
     * 
     * DataType UNSIGNED_INT16
     * UIType LIST
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_VirtualSystemType() {
        if (ic_usr_VirtualSystemType == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.virtualSystemType");
            org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
            ic_usr_VirtualSystemType = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(
                    this, label, null, converter);
        }
        return ic_usr_VirtualSystemType;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_DeleteSession() {
        if (ic_usr_DeleteSession == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.deleteSession");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            ic_usr_DeleteSession = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_DeleteSession;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_CleanupSession() {
        if (ic_usr_CleanupSession == null) {
            String label = getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.cleanupSession");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
            ic_usr_CleanupSession = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, null, converter);
        }
        return ic_usr_CleanupSession;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString(
                    "DefineSystemCLIDataContainer.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            if (get_usr_ReferencedSystem().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_ReferencedSystem())
                        .getValue();
                printStream.println(get_usr_ReferencedSystem().getLabelText() + ": " + value);
            }
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
            if (get_usr_Networks().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Networks())
                        .getValue();
                printStream.println(get_usr_Networks().getLabelText() + ": " + value);
            }
            if (get_usr_Disks().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Disks())
                        .getValue();
                printStream.println(get_usr_Disks().getLabelText() + ": " + value);
            }
            if (get_usr_DiskConfigKey().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_DiskConfigKey())
                        .getValue();
                printStream.println(get_usr_DiskConfigKey().getLabelText() + ": " + value);
            }
            if (get_usr_DiskConfigValue().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_DiskConfigValue())
                        .getValue();
                printStream.println(get_usr_DiskConfigValue().getLabelText() + ": " + value);
            }
            if (get_usr_DiskSelector().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_DiskSelector())
                        .getValue();
                printStream.println(get_usr_DiskSelector().getLabelText() + ": " + value);
            }
            if (get_usr_NetworkConfigKey().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_NetworkConfigKey())
                        .getValue();
                printStream.println(get_usr_NetworkConfigKey().getLabelText() + ": " + value);
            }
            if (get_usr_NetworkConfigValue().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_NetworkConfigValue())
                        .getValue();
                printStream.println(get_usr_NetworkConfigValue().getLabelText() + ": " + value);
            }
            if (get_usr_NetworkSelector().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_NetworkSelector())
                        .getValue();
                printStream.println(get_usr_NetworkSelector().getLabelText() + ": " + value);
            }
            if (get_usr_ConfigValue().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_ConfigValue())
                        .getValue();
                printStream.println(get_usr_ConfigValue().getLabelText() + ": " + value);
            }
            if (get_usr_ConfigKey().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_ConfigKey())
                        .getValue();
                printStream.println(get_usr_ConfigKey().getLabelText() + ": " + value);
            }
            if (get_usr_StartAfterCreation().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_StartAfterCreation())
                        .getValue();
                printStream.println(get_usr_StartAfterCreation().getLabelText() + ": " + value);
            }
            if (get_usr_Sessionkey().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Sessionkey())
                        .getValue();
                printStream.println(get_usr_Sessionkey().getLabelText() + ": " + value);
            }
            if (get_usr_VirtualSystemType().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_VirtualSystemType())
                        .getValue();
                printStream.println(get_usr_VirtualSystemType().getLabelText() + ": " + value);
            }
            if (get_usr_DeleteSession().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_DeleteSession())
                        .getValue();
                printStream.println(get_usr_DeleteSession().getLabelText() + ": " + value);
            }
            if (get_usr_CleanupSession().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_CleanupSession())
                        .getValue();
                printStream.println(get_usr_CleanupSession().getLabelText() + ": " + value);
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
        fields.add(get_usr_ReferencedSystem());
        fields.add(get_usr_Memory());
        fields.add(get_usr_Processor());
        fields.add(get_usr_Networks());
        fields.add(get_usr_Disks());
        fields.add(get_usr_AddDisk());
        fields.add(get_usr_RemoveDisk());
        fields.add(get_usr_DiskConfigKey());
        fields.add(get_usr_DiskConfigValue());
        fields.add(get_usr_DiskSelector());
        fields.add(get_usr_AddNetwork());
        fields.add(get_usr_RemoveNetwork());
        fields.add(get_usr_NetworkConfigKey());
        fields.add(get_usr_NetworkConfigValue());
        fields.add(get_usr_NetworkSelector());
        fields.add(get_usr_ConfigValue());
        fields.add(get_usr_ConfigKey());
        fields.add(get_usr_Execute());
        fields.add(get_usr_StartAfterCreation());
        fields.add(get_usr_ListOnly());
        fields.add(get_usr_Sessionkey());
        fields.add(get_usr_VirtualSystemType());
        fields.add(get_usr_DeleteSession());
        fields.add(get_usr_CleanupSession());
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
        DefineSystemCLIDataContainerImpl source = (DefineSystemCLIDataContainerImpl) sourceContainer;

        get_usr_ReferencedSystem().copyFrom(source.get_usr_ReferencedSystem());
        get_usr_Memory().copyFrom(source.get_usr_Memory());
        get_usr_Processor().copyFrom(source.get_usr_Processor());
        get_usr_Networks().copyFrom(source.get_usr_Networks());
        get_usr_Disks().copyFrom(source.get_usr_Disks());
        get_usr_AddDisk().copyFrom(source.get_usr_AddDisk());
        get_usr_RemoveDisk().copyFrom(source.get_usr_RemoveDisk());
        get_usr_DiskConfigKey().copyFrom(source.get_usr_DiskConfigKey());
        get_usr_DiskConfigValue().copyFrom(source.get_usr_DiskConfigValue());
        get_usr_DiskSelector().copyFrom(source.get_usr_DiskSelector());
        get_usr_AddNetwork().copyFrom(source.get_usr_AddNetwork());
        get_usr_RemoveNetwork().copyFrom(source.get_usr_RemoveNetwork());
        get_usr_NetworkConfigKey().copyFrom(source.get_usr_NetworkConfigKey());
        get_usr_NetworkConfigValue().copyFrom(source.get_usr_NetworkConfigValue());
        get_usr_NetworkSelector().copyFrom(source.get_usr_NetworkSelector());
        get_usr_ConfigValue().copyFrom(source.get_usr_ConfigValue());
        get_usr_ConfigKey().copyFrom(source.get_usr_ConfigKey());
        get_usr_Execute().copyFrom(source.get_usr_Execute());
        get_usr_StartAfterCreation().copyFrom(source.get_usr_StartAfterCreation());
        get_usr_ListOnly().copyFrom(source.get_usr_ListOnly());
        get_usr_Sessionkey().copyFrom(source.get_usr_Sessionkey());
        get_usr_VirtualSystemType().copyFrom(source.get_usr_VirtualSystemType());
        get_usr_DeleteSession().copyFrom(source.get_usr_DeleteSession());
        get_usr_CleanupSession().copyFrom(source.get_usr_CleanupSession());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }
}