/**
 * VMCimAdapterInstallValidatorsIf.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER
 * THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF
 * THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of
 * the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceInstallValidators.vm Contributors:
 *            Prashanth Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.vm.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

/*
 * * This is the interface containing only the InstallValidator-Methods for the delegate
 */

public interface VMCimAdapterInstallValidatorsIf extends InstallValidatorsDelegatee {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages", "messagesVm" };

    /** 
     * InstallValidator-Methods
     **/
    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.ChangeVMSettingsSummaryDataContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage1 container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2a container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2b container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2c container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage3 container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerSummary container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMPage1DataContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMPage2DataContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMPage3DataContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMSummaryDataContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.DiskDataContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.MemoryDataContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.NetworkDataContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.ProcessorDataContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.vm.container.wizard.VMConfigDataContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(org.sblim.wbemsmt.vm.container.edit.VMDataContainer container)
            throws WbemsmtException;

}