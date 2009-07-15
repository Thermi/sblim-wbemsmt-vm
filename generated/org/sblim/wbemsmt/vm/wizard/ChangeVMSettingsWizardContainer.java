/** 
 * ChangeVMSettingsWizardContainer.java
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
 * @author: org.sblim.wbemsmt.dcg.generator.WizardGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/wizardContainer.vm
 *
 * Contributors: 
 *   Prashanth Karnam <prkarnam@in.ibm.com>
 * 
 * Description: WizardContainer for 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.wizard;

import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Logger;

import org.sblim.wbemsmt.tools.wizard.WizardStepList;
import org.sblim.wbemsmt.tools.wizard.container.AbstractWizardContainerBase;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;

public class ChangeVMSettingsWizardContainer extends AbstractWizardContainerBase implements
        IWizardContainer {

    org.sblim.wbemsmt.tools.wizard.WizardContainerUtil util = new ChangeVMSettingsWizardContainerUtil();
    static Logger logger = Logger.getLogger(ChangeVMSettingsWizardContainer.class.getName());

    public static final String WIZARD_PANEL_VSSD = "vssd";
    public static final String WIZARD_PANEL_PROCESSOR = "processor";
    public static final String WIZARD_PANEL_MEMORY = "memory";
    public static final String WIZARD_PANEL_NETWORK = "network";
    public static final String WIZARD_PANEL_DISK = "disk";
    public static final String WIZARD_PANEL_SUMMARY = "summary";

    private final ChangeVMSettingsWizardContainerPanels panels;

    public ChangeVMSettingsWizardContainer(AbstractBaseCimAdapter adapter,
            ChangeVMSettingsWizardContainerPanels panels) {
        super(adapter);
        this.panels = panels;
        hmPages = new HashMap();
        stepList = new WizardStepList();
    }

    public void initWizardContainer() throws WbemsmtException {
        logger.fine("initWizardContainer");

        hmPages.put(WIZARD_PANEL_VSSD, panels.getVssd());
        hmPages.put(WIZARD_PANEL_PROCESSOR, panels.getProcessor());
        hmPages.put(WIZARD_PANEL_MEMORY, panels.getMemory());
        hmPages.put(WIZARD_PANEL_NETWORK, panels.getNetwork());
        hmPages.put(WIZARD_PANEL_DISK, panels.getDisk());
        hmPages.put(WIZARD_PANEL_SUMMARY, panels.getSummary());
        util.addInitialWizardSteps(this, stepList, hmPages);
    }

    public String getNextWizardPageName() {
        String nextPanelName = util.getNextPanel(getCurrentPageName(), hmPages);
        util.updateWizardStepList(nextPanelName, stepList);
        return nextPanelName;
    }

    public boolean isLast(String pageName) {
        if (pageName.equals(WIZARD_PANEL_SUMMARY)) {
            return true;
        }
        else
            return false;
    }

    public boolean isFirst(String pageName) {
        if (pageName.equals(WIZARD_PANEL_VSSD)) {
            return true;
        }
        else
            return false;
    }

    public void cleanUP(String pageName) {
        //cleanup is done in the adapter
    }

    public boolean isValid(String propertyName, Object value, Vector result) {
        //validation is done in the adapter
        return true;
    }

    protected void buildSummaryText() {
        //wizard has no summary - fields are updated in the adapter
    }

    public void postWizardFinish() {

    }

    public void preWizardFinish() throws Exception {

    }

    public Object getPage(String actualPanelName) throws WbemsmtException {

        if (WIZARD_PANEL_VSSD.equals(actualPanelName)) {
            return panels.getVssd();
        }
        if (WIZARD_PANEL_PROCESSOR.equals(actualPanelName)) {
            return panels.getProcessor();
        }
        if (WIZARD_PANEL_MEMORY.equals(actualPanelName)) {
            return panels.getMemory();
        }
        if (WIZARD_PANEL_NETWORK.equals(actualPanelName)) {
            return panels.getNetwork();
        }
        if (WIZARD_PANEL_DISK.equals(actualPanelName)) {
            return panels.getDisk();
        }
        if (WIZARD_PANEL_SUMMARY.equals(actualPanelName)) {
            return panels.getSummary();
        }

        throw new WbemsmtException(WbemsmtException.ERR_WIZARD_LOGIC, "For WizardPage "
                + actualPanelName + " no Implementation was found");
    }

}