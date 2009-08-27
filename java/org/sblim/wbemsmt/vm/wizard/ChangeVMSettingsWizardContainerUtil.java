 /** 
  * CreateHostedSystemWizardContainerUtil.java
  *
  * © Copyright IBM Corp.  2009,2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Util class for the wizard that modifies rasds and vssds
  * 
  */
package org.sblim.wbemsmt.vm.wizard;

import java.util.HashMap;
import java.util.Map;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.wizard.WizardContainerUtil;
import org.sblim.wbemsmt.tools.wizard.WizardStepList;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;

public class ChangeVMSettingsWizardContainerUtil extends WizardContainerUtil {

	static final String[] panelNames = new String[]{
	    ChangeVMSettingsWizardContainer.WIZARD_PANEL_VSSD,
        ChangeVMSettingsWizardContainer.WIZARD_PANEL_DISK,
        ChangeVMSettingsWizardContainer.WIZARD_PANEL_MEMORY,
        ChangeVMSettingsWizardContainer.WIZARD_PANEL_NETWORK,
        ChangeVMSettingsWizardContainer.WIZARD_PANEL_PROCESSOR,
	    ChangeVMSettingsWizardContainer.WIZARD_PANEL_SUMMARY
	};
	
	/**
	 * 
	 */
	public ChangeVMSettingsWizardContainerUtil() {
		super();
		
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.wizard.WizardContainerUtil#getNextPanel(java.lang.String, java.util.Map)
	 */
	public String getNextPanel(String currentPageName, Map<String, DataContainer> hmPages) {
		return getNextPanelDefault(currentPageName,panelNames);	
	
	}

	public void addInitialWizardSteps(IWizardContainer wizardContainer, WizardStepList stepList, HashMap<String, DataContainer> hmPages) {
		super.addInitialWizardStepsDefault(wizardContainer, stepList, panelNames);
	}
	
	
}
