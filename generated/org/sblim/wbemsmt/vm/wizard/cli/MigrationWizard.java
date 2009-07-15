/** 
 * MigrationWizard.java
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
 * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/wizardClass.vm
 *
 * Contributors: 
 *   Prashanth Karnam <prkarnam@in.ibm.com>
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.wizard.cli;

import java.util.*;
import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.adapter.DataContainer;

import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.wizard.adapter.IPageWizardAdapter;
import org.sblim.wbemsmt.tools.wizard.cli.*;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;
import org.sblim.wbemsmt.exception.WbemsmtException;

public class MigrationWizard extends CliWizardBase implements IPageWizardAdapter {

    static Logger logger = Logger.getLogger(MigrationWizard.class.getName());
    private org.sblim.wbemsmt.vm.wizard.MigrationWizardContainer container = null;

    public MigrationWizard(final org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter) {
        super(adapter, ResourceBundleManager.getResourceBundle(new String[] { "messages",
                "messagesVm" }, Locale.getDefault()));
        this.container = new org.sblim.wbemsmt.vm.wizard.MigrationWizardContainer(adapter,
                new org.sblim.wbemsmt.vm.wizard.MigrationWizardContainerPanels() {
                    public Object getPanel1() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.vm.container.wizard.cli.CreateMigrationContainerPage1Impl(
                                adapter);
                        return dc;
                    }

                    public Object getPanel2a() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.vm.container.wizard.cli.CreateMigrationContainerPage2aImpl(
                                adapter);
                        return dc;
                    }

                    public Object getPanel2b() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.vm.container.wizard.cli.CreateMigrationContainerPage2bImpl(
                                adapter);
                        return dc;
                    }

                    public Object getSummary() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.vm.container.wizard.cli.CreateMigrationContainerSummaryImpl(
                                adapter);
                        return dc;
                    }

                    public Object getPanel2c() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.vm.container.wizard.cli.CreateMigrationContainerPage2cImpl(
                                adapter);
                        return dc;
                    }

                    public Object getPanel3() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.vm.container.wizard.cli.CreateMigrationContainerPage3Impl(
                                adapter);
                        return dc;
                    }
                });
        super.initialize();
        try {
            super.initWizard((IWizardContainer) container, this);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
        logger.fine("Wizard initialized");
    }

    public void cleanUPPage(String panelName) {
        //cleanup is done in the adapter
    }

    public IWizardContainer getWizardContainer() {
        return container;
    }
}