/** 
 * DefineSystemCLIWizardContainer.java
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

public class DefineSystemCLIWizardContainer extends AbstractWizardContainerBase implements
        IWizardContainer {

    org.sblim.wbemsmt.tools.wizard.WizardContainerUtil util = new DefineSystemCLIWizardContainerUtil();
    static Logger logger = Logger.getLogger(DefineSystemCLIWizardContainer.class.getName());

    public static final String WIZARD_PANEL_INPUT = "input";
    public static final String WIZARD_PANEL_SUMMARY = "summary";

    private final DefineSystemCLIWizardContainerPanels panels;

    public DefineSystemCLIWizardContainer(AbstractBaseCimAdapter adapter,
            DefineSystemCLIWizardContainerPanels panels) {
        super(adapter);
        this.panels = panels;
        hmPages = new HashMap();
        stepList = new WizardStepList();
    }

    public void initWizardContainer() throws WbemsmtException {
        logger.fine("initWizardContainer");

        hmPages.put(WIZARD_PANEL_INPUT, panels.getInput());
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
        if (pageName.equals(WIZARD_PANEL_INPUT)) {
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

        if (WIZARD_PANEL_INPUT.equals(actualPanelName)) {
            return panels.getInput();
        }
        if (WIZARD_PANEL_SUMMARY.equals(actualPanelName)) {
            return panels.getSummary();
        }

        throw new WbemsmtException(WbemsmtException.ERR_WIZARD_LOGIC, "For WizardPage "
                + actualPanelName + " no Implementation was found");
    }

}