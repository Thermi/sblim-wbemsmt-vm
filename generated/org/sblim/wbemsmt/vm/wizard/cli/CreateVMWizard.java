/**
 * CreateVMWizard.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF
 * THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/wizardClass.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
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

public class CreateVMWizard extends CliWizardBase implements IPageWizardAdapter {

    static Logger logger = Logger.getLogger(CreateVMWizard.class.getName());
    private org.sblim.wbemsmt.vm.wizard.CreateVMWizardContainer container = null;

    public CreateVMWizard(final org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter) {
        super(adapter, ResourceBundleManager.getResourceBundle(new String[] { "messages",
                "messagesVm" }, Locale.getDefault()));
        this.container = new org.sblim.wbemsmt.vm.wizard.CreateVMWizardContainer(adapter,
                new org.sblim.wbemsmt.vm.wizard.CreateVMWizardContainerPanels() {
                    public DataContainer getPage1() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.vm.container.wizard.cli.CreateVMPage1DataContainerImpl(
                                adapter);
                        return dc;
                    }

                    public DataContainer getPage2() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.vm.container.wizard.cli.CreateVMPage2DataContainerImpl(
                                adapter);
                        return dc;
                    }

                    public DataContainer getProcessor() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.vm.container.wizard.cli.ProcessorDataContainerImpl(
                                adapter);
                        return dc;
                    }

                    public DataContainer getMemory() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.vm.container.wizard.cli.MemoryDataContainerImpl(
                                adapter);
                        return dc;
                    }

                    public DataContainer getDisk() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.vm.container.wizard.cli.DiskDataContainerImpl(
                                adapter);
                        return dc;
                    }

                    public DataContainer getNetwork() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.vm.container.wizard.cli.NetworkDataContainerImpl(
                                adapter);
                        return dc;
                    }

                    public DataContainer getPage3() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.vm.container.wizard.cli.CreateVMPage3DataContainerImpl(
                                adapter);
                        return dc;
                    }

                    public DataContainer getSummary() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.vm.container.wizard.cli.CreateVMSummaryDataContainerImpl(
                                adapter);
                        return dc;
                    }

                    public DataContainer getVssd() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.vm.container.wizard.cli.VMConfigDataContainerImpl(
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