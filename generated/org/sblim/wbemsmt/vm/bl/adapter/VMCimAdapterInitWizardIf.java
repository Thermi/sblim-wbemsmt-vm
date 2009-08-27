/**
 * VMCimAdapterInitWizardIf.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE
 * TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS
 * FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the
 * Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceInitWizard.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.vm.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

/*
 * * This is the interface containing only the initWizard-Methods for the delegate
 */

public interface VMCimAdapterInitWizardIf extends InitWizardDelegatee {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages", "messagesVm" };

    /** 
     * UpdateControls-Methods
     **/

    public void initWizardImpl(
            org.sblim.wbemsmt.vm.container.wizard.VMConfigDataContainer container,
            org.sblim.wbemsmt.vm.wizard.ChangeVMSettingsWizardContainer wizardContainer,
            String currentPagename) throws WbemsmtException;

    public void initWizardImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMPage1DataContainer container,
            org.sblim.wbemsmt.vm.wizard.CreateVMWizardContainer wizardContainer,
            String currentPagename) throws WbemsmtException;

    public void initWizardImpl(
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer container,
            org.sblim.wbemsmt.vm.wizard.DefineSystemCLIWizardContainer wizardContainer,
            String currentPagename) throws WbemsmtException;

    public void initWizardImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage1 container,
            org.sblim.wbemsmt.vm.wizard.MigrationWizardContainer wizardContainer,
            String currentPagename) throws WbemsmtException;
}