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
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.CimAdapterFactory;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.validator.Validator;
import org.sblim.wbemsmt.vm.VMErrCodes;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VM;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2a;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ComputerSystem;

public class ContainerExistsOnTargetSystemValidator extends Validator {

	
	private final CreateMigrationContainerPage2a container;
	private final VMCimAdapter mcAdapter;

	/**
	 * Creates a new Validator
	 * @param component the component where the selected index is extracted from
	 * @param key the resourceBundle key of the value that is not allowed
	 * @param adapter
	 * @param values the array with the possible values
	 */
	public ContainerExistsOnTargetSystemValidator(CreateMigrationContainerPage2a container, VMCimAdapter adapter) {
		super(adapter);
		this.container = container;
		mcAdapter = adapter;
	}

	/**
	 * @see org.sblim.wbemsmt.tools.validator.Validator#validate()
	 */
	public void validateElement(MessageList result) throws WbemsmtException {
		

		UnsignedInteger16 iPresetIdx = (UnsignedInteger16) container.get_usr_CimClientPreset().getConvertedControlValue();
		WBEMClient targetClient = (WBEMClient) mcAdapter.getMigrationWizard().getClients().get(iPresetIdx.intValue());
		String containerToMigrate = mcAdapter.getSelectedVM().getFco().get_ElementName();

		CIM_ComputerSystem[] applicationContainers;
		VMCimAdapter adapter = (VMCimAdapter) CimAdapterFactory.getInstance().getAdapter(VMCimAdapter.class, targetClient, false);
        targetClient = adapter.getCimClient();
        applicationContainers = VM.getVMs(adapter.getCimClient(),adapter.getInterOpNamespace());
        boolean found = false;
        for (int i = 0; !found && i < applicationContainers.length; i++) {
        	CIM_ComputerSystem system = applicationContainers[i];
        	if (system.get_ElementName().equals(containerToMigrate))
        	{
        		found = true;
        	}
        }
         
        if (!found)
        {
        	result.addMessage(Message.create(VMErrCodes.MSGDEF_CONTAINER_ON_TARGETSYSTEM_NOT_FOUND, adapter.getBundle(),new Object[]{containerToMigrate,VMCimAdapter.getInfo(targetClient)}));
        }
	}

	protected LabeledBaseInputComponentIf[] getComponents() {
		return new LabeledBaseInputComponentIf[]{(container).get_usr_CimClientPreset()} ;
	}

}
