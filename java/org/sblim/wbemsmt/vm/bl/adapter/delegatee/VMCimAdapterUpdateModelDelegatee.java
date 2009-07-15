 /** 
  * MetaclusterCimAdapterUpdateModelDelegatee.java
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
  * Description:  Delegatee for updating the model
  * 
  */
package org.sblim.wbemsmt.vm.bl.adapter.delegatee;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapterUpdateModelIf;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.VMWizard;
import org.sblim.wbemsmt.vm.container.edit.VMOperationsDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.ConfigItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage1;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2a;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2b;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2c;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage3;
import org.sblim.wbemsmt.vm.container.wizard.CreateVMPage1DataContainer;
import org.sblim.wbemsmt.vm.container.wizard.CreateVMPage2DataContainer;
import org.sblim.wbemsmt.vm.container.wizard.CreateVMPage3DataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DiskDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DiskItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.MemoryDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.NetworkDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.NetworkItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.ProcessorDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.VMConfigDataContainer;

public class VMCimAdapterUpdateModelDelegatee implements VMCimAdapterUpdateModelIf {

	private final VMCimAdapter adapter;

	/**
	 * @param adapter 
	 * 
	 */
	public VMCimAdapterUpdateModelDelegatee(VMCimAdapter adapter) {
		super();
		this.adapter = adapter;
	}

	public void updateModelImpl(CreateVMPage1DataContainer container) throws WbemsmtException {
	    adapter.getVMWizard().setHostSystem(container);
	}

	public void updateModelImpl(CreateVMPage2DataContainer container) throws WbemsmtException {
        adapter.getVMWizard().updateModel(container);
	}

	public void updateModelImpl(CreateVMPage3DataContainer container) throws WbemsmtException {
	    adapter.getVMWizard().updateModel(container);
	}

	public void updateModelImpl(CreateMigrationContainerPage1 container) throws WbemsmtException {
	}

	public void updateModelImpl(CreateMigrationContainerPage2a container) throws WbemsmtException {
	}

	public void updateModelImpl(CreateMigrationContainerPage2b container) throws WbemsmtException {
	}

	public void updateModelImpl(CreateMigrationContainerPage2c container)
			throws WbemsmtException {
	}

	public void updateModelImpl(CreateMigrationContainerPage3 container)
			throws WbemsmtException {
	}

    public void updateModelImpl(DiskDataContainer container) throws WbemsmtException {
    	((VMWizard)adapter.getActiveWizard()).updateModel(container);        
    }

    public void updateModelImpl(MemoryDataContainer container) throws WbemsmtException {
    	((VMWizard)adapter.getActiveWizard()).updateModel(container);
    }

    public void updateModelImpl(NetworkDataContainer container) throws WbemsmtException {
    	((VMWizard)adapter.getActiveWizard()).updateModel(container);
        
    }

    public void updateModelImpl(ProcessorDataContainer container) throws WbemsmtException {
    	((VMWizard)adapter.getActiveWizard()).updateModel(container);
    }

    public void updateModelImpl(VMOperationsDataContainer container) throws WbemsmtException {
        adapter.getSelectedVM().updateModel(container);
        
    }

    public void updateModelImpl(ConfigItemDataContainer container) throws WbemsmtException {
        // do nothing - generic fields in ConfigItemDataContainer are not represented as Action elements
    }

    public void updateModelImpl(DiskItemDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void updateModelImpl(NetworkItemDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void updateModelImpl(VMConfigDataContainer container) throws WbemsmtException {
    	((VMWizard)adapter.getActiveWizard()).updateModel(container);
        //adapter.getVMWizard().updateModel(container);
    }

    public void updateModelImpl(DefineSystemCLIDataContainer container) throws WbemsmtException {
        adapter.getVMCliWizard().updateModel(container);
    }

}
