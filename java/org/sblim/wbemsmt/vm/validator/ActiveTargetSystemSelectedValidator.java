 /** 
  * ActiveTargetSystemSelectedValidator.java
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
  * Description: Checks if a active target system was selected 
  * 
  */
package org.sblim.wbemsmt.vm.validator;

import javax.cim.UnsignedInteger16;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.validator.Validator;
import org.sblim.wbemsmt.vm.VMErrCodes;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.MigrationWizard;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage1;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2a;

public class ActiveTargetSystemSelectedValidator extends Validator {

	
	private final DataContainer container;
	private final VMCimAdapter mcAdapter;

	/**
	 * Creates a new Validator
	 * @param component the component where the selected index is extracted from
	 * @param key the resourceBundle key of the value that is not allowed
	 * @param adapter
	 * @param values the array with the possible values
	 */
	public ActiveTargetSystemSelectedValidator(DataContainer container, VMCimAdapter adapter) {
		super(adapter);
		this.container = container;
		mcAdapter = adapter;
	}

	/**
	 * @see org.sblim.wbemsmt.tools.validator.Validator#validate()
	 */
	public void validateElement(MessageList result) throws WbemsmtException {
		
		boolean firstPage = container instanceof CreateMigrationContainerPage1;
		boolean checkActiveTargets = 
			firstPage 
				&& ((UnsignedInteger16)((CreateMigrationContainerPage1)container).get_usr_PresetOrUserdefined().getConvertedControlValue()).intValue() == MigrationWizard.IDX_USE_PRESET
			|| !firstPage;
		
		if (checkActiveTargets && mcAdapter.getMigrationWizard().getClients().size() == 0)
		{
			result.addMessage(Message.create(VMErrCodes.MSGDEF_NO_ACTIVE_TARGETSYSTEM, adapter.getBundle()));			
		}
		else if (! firstPage)
		{
			UnsignedInteger16 value = (UnsignedInteger16) ((CreateMigrationContainerPage2a)container).get_usr_CimClientPreset().getConvertedControlValue();
			if (value == null)
			{
				result.addMessage(Message.create(VMErrCodes.MSGDEF_NO_TARGETSYSTEM_SELECTED, adapter.getBundle()));
			}
		}
	}

	protected LabeledBaseInputComponentIf[] getComponents() {
		if (container instanceof CreateMigrationContainerPage1)
		{
			return new LabeledBaseInputComponentIf[]{} ;
		}
		else if (container instanceof CreateMigrationContainerPage2a)
		{
			return new LabeledBaseInputComponentIf[]{((CreateMigrationContainerPage2a)container).get_usr_CimClientPreset()} ;
		}
		else
		{
			return new LabeledBaseInputComponentIf[]{} ;
		}
	}

}
