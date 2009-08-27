 /** 
  * MetaclusterCimAdapterInstallValidatorsDelegatee.java
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
  * Description:  Delegatee for installing validators
  * 
  */
package org.sblim.wbemsmt.vm.bl.adapter.delegatee;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.validator.RequiredFieldValidator;
import org.sblim.wbemsmt.tools.validator.Validator;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapterInstallValidatorsIf;
import org.sblim.wbemsmt.vm.container.edit.VMDataContainer;
import org.sblim.wbemsmt.vm.container.edit.VMOperationsDataContainer;
import org.sblim.wbemsmt.vm.container.edit.WelcomeDataContainer;
import org.sblim.wbemsmt.vm.container.edit.WelcomeItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.ChangeVMSettingsSummaryDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage1;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2a;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2b;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2c;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage3;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerSummary;
import org.sblim.wbemsmt.vm.container.wizard.CreateVMPage1DataContainer;
import org.sblim.wbemsmt.vm.container.wizard.CreateVMPage2DataContainer;
import org.sblim.wbemsmt.vm.container.wizard.CreateVMPage3DataContainer;
import org.sblim.wbemsmt.vm.container.wizard.CreateVMSummaryDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DiskDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.MemoryDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.NetworkDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.ProcessorDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.VMConfigDataContainer;
import org.sblim.wbemsmt.vm.validator.ActiveTargetSystemSelectedValidator;
import org.sblim.wbemsmt.vm.validator.ContainerExistsOnTargetSystemValidator;
import org.sblim.wbemsmt.vm.validator.ContainerRunningValidator;
import org.sblim.wbemsmt.vm.validator.ContainerStoppedOnTargetSystemValidator;
import org.sblim.wbemsmt.vm.validator.ElementNameMaxLengthValidator;
import org.sblim.wbemsmt.vm.validator.MigratableValidator;
import org.sblim.wbemsmt.vm.validator.TargetFoundValidator;


public class VMCimAdapterInstallValidatorsDelegatee implements VMCimAdapterInstallValidatorsIf {

	protected final VMCimAdapter adapter;

	/**
	 * @param adapter 
	 * 
	 */
	public VMCimAdapterInstallValidatorsDelegatee(VMCimAdapter adapter) {
		super();
		this.adapter = adapter;
	}

	public void installValidatorsImpl(CreateVMPage1DataContainer container) {
	}

	public void installValidatorsImpl(CreateVMPage2DataContainer container) {
	}

	public void installValidatorsImpl(CreateVMSummaryDataContainer container) {
	}

    public void installValidatorsImpl(CreateVMPage3DataContainer container) {
	}

	public void installValidatorsImpl(VMOperationsDataContainer container) {
	}

	public void installValidatorsImpl(CreateMigrationContainerPage1 container) {
		RequiredFieldValidator requiredFieldValidator = new RequiredFieldValidator(container.get_usr_PresetOrUserdefined(),adapter);
		ContainerRunningValidator containerRunningValidator = new ContainerRunningValidator(adapter);
		ActiveTargetSystemSelectedValidator activeTargetSystemSelectedValidator = new ActiveTargetSystemSelectedValidator(container,adapter);
		
		requiredFieldValidator.addChild(containerRunningValidator);
		containerRunningValidator.addChild(activeTargetSystemSelectedValidator);
		adapter.addValidator(container, requiredFieldValidator);
	}

	public void installValidatorsImpl(CreateMigrationContainerPage2a container) {
		
		ActiveTargetSystemSelectedValidator validator = new ActiveTargetSystemSelectedValidator(container,adapter);
		ContainerExistsOnTargetSystemValidator validator1 = new ContainerExistsOnTargetSystemValidator(container,adapter);
		ContainerStoppedOnTargetSystemValidator validator2 = new ContainerStoppedOnTargetSystemValidator(container,adapter);
		validator.addChild(validator1);
		validator1.addChild(validator2);
		adapter.addValidator(container, validator);
		
	}

	public void installValidatorsImpl(CreateMigrationContainerPage2b container) {
		RequiredFieldValidator requiredFieldValidator1 = new RequiredFieldValidator(container.get_usr_MigrationTargetUser(),adapter);
		RequiredFieldValidator requiredFieldValidator2 = new RequiredFieldValidator(container.get_usr_MigrationTargetPassword(),adapter);
		RequiredFieldValidator requiredFieldValidator3 = new RequiredFieldValidator(container.get_usr_MigrationTargetHostname(),adapter);
		RequiredFieldValidator requiredFieldValidator4 = new RequiredFieldValidator(container.get_usr_MigrationTargetPort(),adapter);

		Validator migratableValidator = new TargetFoundValidator(container,adapter);			

		migratableValidator.addParent(requiredFieldValidator1);
		migratableValidator.addParent(requiredFieldValidator2);
		migratableValidator.addParent(requiredFieldValidator3);
		migratableValidator.addParent(requiredFieldValidator4);
		
		adapter.addValidator(container, migratableValidator);
	}

	public void installValidatorsImpl(CreateMigrationContainerSummary container) {
	}

	public void installValidatorsImpl(WelcomeDataContainer container) {
	}

	public void installValidatorsImpl(WelcomeItemDataContainer container) {
	}

	public void installValidatorsImpl(CreateMigrationContainerPage2c container) {	
		RequiredFieldValidator requiredFieldValidator = new RequiredFieldValidator(container.get_usr_TargetHost(),adapter);
		
		adapter.addValidator(container, requiredFieldValidator);
		
	}

	public void installValidatorsImpl(CreateMigrationContainerPage3 container) {
		RequiredFieldValidator requiredFieldValidator = new RequiredFieldValidator(container.get_usr_PostMigrateState(),adapter);
		Validator migratableValidator = new MigratableValidator(adapter,container.get_usr_PostMigrateState());
		requiredFieldValidator.addChild(migratableValidator);
		adapter.addValidator(container, requiredFieldValidator);
	}

    public void installValidatorsImpl(VMDataContainer container) throws WbemsmtException {
        adapter.addValidator(container, new ElementNameMaxLengthValidator(adapter,container.get_VmName()));
    }

    public void installValidatorsImpl(DiskDataContainer container) throws WbemsmtException {
      //nothing to validate
        
    }

    public void installValidatorsImpl(MemoryDataContainer container) throws WbemsmtException {
        adapter.addValidator(container, new RequiredFieldValidator(container.get_usr_Size(),adapter));
        
    }

    public void installValidatorsImpl(NetworkDataContainer container) throws WbemsmtException {
      //nothing to validate
        
    }

    public void installValidatorsImpl(ProcessorDataContainer container) throws WbemsmtException {
        adapter.addValidator(container, new RequiredFieldValidator(container.get_usr_Amount(),adapter));
    }

    public void installValidatorsImpl(VMConfigDataContainer container) throws WbemsmtException {
        //nothing to validate
        
    }

    public void installValidatorsImpl(ChangeVMSettingsSummaryDataContainer container)
            throws WbemsmtException {
      //nothing to validate
        
    }

    public void installValidatorsImpl(DefineSystemCLIDataContainer container)
            throws WbemsmtException {
        //nothing to validate
        
    }

    public void installValidatorsImpl(DefineSystemCLISummaryDataContainer container)
            throws WbemsmtException {
      //nothing to validate
    }


}
