 /** 
  * MigratableToHostValidator.java
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
  * Description: Checks if the migration to a host is possible 
  * 
  */
package org.sblim.wbemsmt.vm.validator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.cim.UnsignedInteger16;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.CimAdapterFactory;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;
import org.sblim.wbemsmt.tools.validator.Validator;
import org.sblim.wbemsmt.vm.VMErrCodes;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.HostSystem;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.MigrationWizard;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.MigrationWizard.CimClientInfo;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2a;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2b;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2c;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_System;

public class MigratableValidator extends Validator {

	
	private final VMCimAdapter mcAdapter;
	private String postMigrateState;

	/**
	 * Creates a new Validator
	 * @param component the component where the selected index is extracted from
	 * @param key the resourceBundle key of the value that is not allowed
	 * @param adapter
	 * @param values the array with the possible values
	 */
	public MigratableValidator(VMCimAdapter adapter, LabeledStringArrayInputComponentIf postMigrateStateField) {
		super(adapter);
		mcAdapter = adapter;
		this.postMigrateState = MigrationWizard.getPostMigrateState(postMigrateStateField);
	}

	/**
	 * @see org.sblim.wbemsmt.tools.validator.Validator#validate()
	 */
	public void validateElement(MessageList result) throws WbemsmtException {
		DataContainer wizardPage = mcAdapter.getMigrationWizard().getPage2();
		if (wizardPage instanceof CreateMigrationContainerPage2a) {
			CreateMigrationContainerPage2a page2a = (CreateMigrationContainerPage2a) wizardPage;
			validateMigratableToSystem(result, page2a);
		}
		else if (wizardPage instanceof CreateMigrationContainerPage2b) {
			CreateMigrationContainerPage2b page2b = (CreateMigrationContainerPage2b) wizardPage;
			validateMigratableToSystem(result, page2b);
		}
		else if (wizardPage instanceof CreateMigrationContainerPage2c) {
			CreateMigrationContainerPage2c page2c = (CreateMigrationContainerPage2c) wizardPage;
			validateMigratableToHost(result, page2c.get_usr_TargetHost());
		}
		throw new WbemsmtException(WbemsmtException.ERR_VALIDATION,"Cannot validate page " + wizardPage);

	}
	
	/**
	 * @see org.sblim.wbemsmt.tools.validator.Validator#validate()
	 */
	private void validateMigratableToHost(MessageList result, LabeledBaseInputComponentIf hostField) throws WbemsmtException {
		
		boolean checkPossible;
		checkPossible = mcAdapter.getSelectedVM().isCheckMigrationToHostEnabled(""+hostField.getConvertedControlValue());

        if (checkPossible)
        {
        	boolean canMigrate = mcAdapter.getSelectedVM().isMigratableToHost(""+hostField.getConvertedControlValue(),postMigrateState);
        	if (!canMigrate)
        	{
        		result.addMessage(Message.create(VMErrCodes.MSGDEF_CONTAINER_NOT_MIGRATABLE_TO_HOST, adapter.getBundle(), new Object[]{mcAdapter.getSelectedVM().getInfo(),""+hostField.getConvertedControlValue()}));			
        	}
        }
        else
        {
        	result.addMessage(Message.create(VMErrCodes.MSGDEF_CONTAINER_MIGRATABLE_CHECK_NOT_POSSIBLE, adapter.getBundle(), new Object[]{mcAdapter.getSelectedVM().getInfo(),""+hostField.getConvertedControlValue()}));
        }
			
	}

	
	/**
	 * @see org.sblim.wbemsmt.tools.validator.Validator#validate()
	 * 
	 * validates if the migration to a already connected target is possible
	 * 
	 */
	private void validateMigratableToSystem(MessageList result, CreateMigrationContainerPage2a container) throws WbemsmtException {
		
		UnsignedInteger16 iPresetIdx = (UnsignedInteger16) container.get_usr_CimClientPreset().getConvertedControlValue();
        WBEMClient targetClient = (WBEMClient) mcAdapter.getMigrationWizard().getClients().get(iPresetIdx.intValue());

        VMCimAdapter adapter2 = (VMCimAdapter) CimAdapterFactory.getInstance().getAdapter(VMCimAdapter.class, targetClient,false);
        
        HostSystem host = adapter2.getHostSystems().getHostedSystemByType(mcAdapter.getSelectedVM().getVirtualSystemType());
        
        if (host != null)
        {
        	
        	CIM_System system = (CIM_System) host.getFco();
        	
        	boolean checkPossible = mcAdapter.getSelectedVM().isCheckMigrationToSystemEnabled();
        	
        	if (checkPossible)
        	{
        		boolean canMigrate = mcAdapter.getSelectedVM().isMigratableToSystem(system,postMigrateState);
        		if (!canMigrate)
        		{
        			result.addMessage(Message.create(VMErrCodes.MSGDEF_CONTAINER_NOT_MIGRATABLE_TO_SYSTEM, adapter.getBundle(), new Object[]{mcAdapter.getSelectedVM().getInfo(),VMCimAdapter.getInfo(targetClient)}));			
        		}
        	}
        	else
        	{
        		result.addMessage(Message.create(VMErrCodes.MSGDEF_CONTAINER_MIGRATABLE_CHECK_NOT_POSSIBLE, adapter.getBundle(), new Object[]{mcAdapter.getSelectedVM().getInfo(),VMCimAdapter.getInfo(targetClient)}));
        	}
        	
        }
        else
        {
        	throw new WbemsmtException(WbemsmtException.ERR_VALIDATION,"Expected exactly one hostsystem  on target " + VMCimAdapter.getInfo(targetClient) );
        }
			
	}
	
	/**
	 * @see org.sblim.wbemsmt.tools.validator.Validator#validate()
	 */
	private void validateMigratableToSystem(MessageList result, CreateMigrationContainerPage2b container) throws WbemsmtException {
		
		CimClientInfo clientInfo = MigrationWizard.getWBEMClientInfo(container, null);
        WBEMClient targetClient = clientInfo.getClient();
        
        CIM_System[] systems = HostSystem.getHostSystems(targetClient, clientInfo.getNamespace());
        
        if (systems.length > 0)
        {
            
            for (int i = 0; i < systems.length; i++) {
                CIM_System system = systems[i];
                String[] virtualSystemTypes = HostSystem.getVirtualSystemTypes(system,targetClient);
                Set<String> listWithTypes = new HashSet<String>();
                listWithTypes.addAll(Arrays.asList(virtualSystemTypes));
                
                
                if (listWithTypes.contains(mcAdapter.getSelectedVM().getVirtualSystemType()))
                {
                    boolean checkPossible = mcAdapter.getSelectedVM().isCheckMigrationToSystemEnabled();
                    
                    if (checkPossible)
                    {
                        boolean canMigrate = mcAdapter.getSelectedVM().isMigratableToSystem(system, postMigrateState);
                        if (!canMigrate)
                        {
                            result.addMessage(Message.create(VMErrCodes.MSGDEF_CONTAINER_NOT_MIGRATABLE_TO_SYSTEM, adapter.getBundle(), new Object[]{mcAdapter.getSelectedVM().getInfo(),VMCimAdapter.getInfo(targetClient)}));            
                        }
                    }
                    else
                    {
                        result.addMessage(Message.create(VMErrCodes.MSGDEF_CONTAINER_MIGRATABLE_CHECK_NOT_POSSIBLE, adapter.getBundle(), new Object[]{mcAdapter.getSelectedVM().getInfo(),VMCimAdapter.getInfo(targetClient)}));
                    }
                }
            }
            
        	
        }
        else
        {
        	throw new WbemsmtException(WbemsmtException.ERR_VALIDATION,"Found no hostsystem on target " + VMCimAdapter.getInfo(targetClient) );
        }
	}	

	
	protected LabeledBaseInputComponentIf[] getComponents() {
		return new LabeledBaseInputComponentIf[]{} ;
	}

}
