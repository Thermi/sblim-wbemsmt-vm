 /** 
  * ActiveTargetSystemSelectedValidator.java
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
  * Description: Checks if a active target system was selected 
  * 
  */
package org.sblim.wbemsmt.vm.validator;

import javax.wbem.WBEMException;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.validator.Validator;
import org.sblim.wbemsmt.vm.VMErrCodes;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.MigrationWizard;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2b;

public class TargetFoundValidator extends Validator {

	
	private final CreateMigrationContainerPage2b container;

	/**
	 * Creates a new Validator
	 * @param component the component where the selected index is extracted from
	 * @param key the resourceBundle key of the value that is not allowed
	 * @param adapter
	 * @param values the array with the possible values
	 */
	public TargetFoundValidator(CreateMigrationContainerPage2b container, VMCimAdapter adapter) {
		super(adapter);
		this.container = container;
	}

	/**
	 * @see org.sblim.wbemsmt.tools.validator.Validator#validate()
	 */
	public void validateElement(MessageList result) throws WbemsmtException {
		
		MigrationWizard.CimClientInfo clientInfo = null;
		clientInfo = MigrationWizard.getWBEMClientInfo(container, null);
		
		WBEMClient client = clientInfo.getClient();
		
		if (client == null)
		{
			String msg = "-";
			if (clientInfo.getThrowable() instanceof WBEMException)
			{
				WBEMException cimException = (WBEMException) clientInfo.getThrowable();
				msg = cimException.getMessage();
				result.addMessage(
						Message.create(
								VMErrCodes.MSGDEF_INVALID_CIM_CLIENT_PARAMETERS,
								adapter.getBundle(),
								new Object[]{msg}));
				return;
			}
			throw new WbemsmtException(WbemsmtException.ERR_VALIDATION,"Cannot create WBEMClient",clientInfo.getThrowable());
			
		}
		
		String url = clientInfo.getUrl();
		String username = clientInfo.getUsername();
		
    	logger.info("Checking " + url + " with user " + username);
    	
    	String cimClientNamespace = clientInfo.getNamespace();
    	String enteredNamespace = "//" + clientInfo.getHostname() + clientInfo.getNamespace();
		if (cimClientNamespace.endsWith("/") && !enteredNamespace.endsWith("/"))
    	{
    		cimClientNamespace = cimClientNamespace.substring(0,cimClientNamespace.length()-1);
    	}
    	
		cimClientNamespace = cimClientNamespace.replaceAll("//", "/");
		enteredNamespace = enteredNamespace.replaceAll("//", "/");
		
    	if (!enteredNamespace.equals(cimClientNamespace))
    	{
			result.addMessage(
					Message.create(
							VMErrCodes.MSGDEF_NAMESPACES_NOT_THE_SAME,
							adapter.getBundle(),
							new Object[]{enteredNamespace,cimClientNamespace}));
    	}
    	
	}

	protected LabeledBaseInputComponentIf[] getComponents() {
		return new LabeledBaseInputComponentIf[]{container.get_usr_MigrationTargetHostname(),
				                                 container.get_usr_MigrationTargetNamespace(),
				                                 container.get_usr_MigrationTargetPort(),
				                                 container.get_usr_MigrationTargetPassword(),
				                                 container.get_usr_MigrationTargetUser()} ;
	}

}
