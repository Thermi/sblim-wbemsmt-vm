 /** 
  * MigrationWizardContainerUtil.java
  *
  * © Copyright IBM Corp. 2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Common Public License from
  * http://www.opensource.org/licenses/cpl1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Wizard container util for doing a migration
  * 
  */
package org.sblim.wbemsmt.vm.wizard;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.cim.UnsignedInteger16;

import org.sblim.wbemsmt.tools.wizard.WizardContainerUtil;
import org.sblim.wbemsmt.tools.wizard.WizardStep;
import org.sblim.wbemsmt.tools.wizard.WizardStepList;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.MigrationWizard;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage1;

public class MigrationWizardContainerUtil extends
		WizardContainerUtil {

	protected Logger logger = Logger.getLogger(MigrationWizardContainerUtil.class.getName());	

	/**
	 * 
	 */
	public MigrationWizardContainerUtil() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.wizard.WizardContainerUtil#getNextPanel(java.lang.String, java.util.Map)
	 */
	public String getNextPanel(String currentPageName, Map hmPages) {
		
		if (currentPageName.equals(""))
		{
			return MigrationWizardContainer.WIZARD_PANEL_PANEL1;
		}
		else if (currentPageName.equals(MigrationWizardContainer.WIZARD_PANEL_PANEL1))
		{
			CreateMigrationContainerPage1 page1 = (CreateMigrationContainerPage1) hmPages.get(currentPageName);
		
			UnsignedInteger16 index = (UnsignedInteger16)page1.get_usr_PresetOrUserdefined().getConvertedControlValue();
			
			//Check if the user selected MX as record type
			if (index != null && index.intValue() == MigrationWizard.IDX_USE_PRESET)
			{
				return MigrationWizardContainer.WIZARD_PANEL_PANEL2A;
			}
			else if (index != null && index.intValue() == MigrationWizard.IDX_USE_USERDEFINED_CIM)
			{
				return MigrationWizardContainer.WIZARD_PANEL_PANEL2B;
			}
			else if (index != null && index.intValue() == MigrationWizard.IDX_USE_USERDEFINED_NO_CIM)
			{
				return MigrationWizardContainer.WIZARD_PANEL_PANEL2C;
			}
			else
			{
				logger.severe("Cannot handle Value " + (index == null ? "null" : ""+index.intValue()) + " of PresetOrUserDefined-RadioElement");
			}
		} else if (currentPageName.equals(MigrationWizardContainer.WIZARD_PANEL_PANEL2A)
				|| currentPageName.equals(MigrationWizardContainer.WIZARD_PANEL_PANEL2B)
				|| currentPageName.equals(MigrationWizardContainer.WIZARD_PANEL_PANEL2C)
		)
		{
			return MigrationWizardContainer.WIZARD_PANEL_PANEL3;
		}
		else if (currentPageName.equals(MigrationWizardContainer.WIZARD_PANEL_PANEL3))
		{
			return MigrationWizardContainer.WIZARD_PANEL_SUMMARY;
		}
		else
		{
			logger.severe("Cannot handle page name " + currentPageName);
		}
		return currentPageName;
	}
	
	public void addInitialWizardSteps(IWizardContainer wizardContainer, WizardStepList stepList, HashMap hmPages) {

		stepList.addWizardStep(new WizardStep(wizardContainer, MigrationWizardContainer.WIZARD_PANEL_PANEL1));
		//add a step which is just for grouping the following three ones
		stepList.addWizardStep(new WizardStep(wizardContainer, "type",wizardContainer.getAdapter(),"migrationWizard.targetsystem"));
		//add two steps at level 2
		stepList.addWizardStep(new WizardStep(wizardContainer, 2,MigrationWizardContainer.WIZARD_PANEL_PANEL2A));
		stepList.addWizardStep(new WizardStep(wizardContainer, 2,MigrationWizardContainer.WIZARD_PANEL_PANEL2B));
		stepList.addWizardStep(new WizardStep(wizardContainer, 2,MigrationWizardContainer.WIZARD_PANEL_PANEL2C));

		stepList.addWizardStep(new WizardStep(wizardContainer, MigrationWizardContainer.WIZARD_PANEL_PANEL3));
		stepList.addWizardStep(new WizardStep(wizardContainer, MigrationWizardContainer.WIZARD_PANEL_SUMMARY));
		
	}

	public void updateWizardStepList(String newPageName, WizardStepList stepList) {
		
		if (newPageName.equals(MigrationWizardContainer.WIZARD_PANEL_PANEL2A)
			|| newPageName.equals(MigrationWizardContainer.WIZARD_PANEL_PANEL2B)
			|| newPageName.equals(MigrationWizardContainer.WIZARD_PANEL_PANEL2C)
		)
		{
			stepList.getWizardStep(MigrationWizardContainer.WIZARD_PANEL_PANEL2A).setVisited(MigrationWizardContainer.WIZARD_PANEL_PANEL2A.equals(newPageName));
			stepList.getWizardStep(MigrationWizardContainer.WIZARD_PANEL_PANEL2B).setVisited(MigrationWizardContainer.WIZARD_PANEL_PANEL2B.equals(newPageName));
			stepList.getWizardStep(MigrationWizardContainer.WIZARD_PANEL_PANEL2C).setVisited(MigrationWizardContainer.WIZARD_PANEL_PANEL2C.equals(newPageName));
		}
		
		
	}
	
	
	
}
