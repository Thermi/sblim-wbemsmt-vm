 /** 
  * MetaclusterCimAdapterInitWizardDelegatee.java
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
  * Description: Delegatee for metacluster wizard initialization
  * 
  */
package org.sblim.wbemsmt.vm.bl.adapter.delegatee;

import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapterInitWizardIf;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage1;
import org.sblim.wbemsmt.vm.container.wizard.CreateVMPage1DataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.VMConfigDataContainer;
import org.sblim.wbemsmt.vm.wizard.ChangeVMSettingsWizardContainer;
import org.sblim.wbemsmt.vm.wizard.CreateVMWizardContainer;
import org.sblim.wbemsmt.vm.wizard.DefineSystemCLIWizardContainer;
import org.sblim.wbemsmt.vm.wizard.MigrationWizardContainer;

public class VMCimAdapterInitWizardDelegatee implements VMCimAdapterInitWizardIf {

	private final VMCimAdapter adapter;

	public VMCimAdapterInitWizardDelegatee(VMCimAdapter adapter) {
		this.adapter = adapter;
	}

	public void initWizardImpl(CreateVMPage1DataContainer container, CreateVMWizardContainer wizardContainer, String currentPagename) throws WbemsmtException {
	    adapter.setActiveWizard(adapter.getVMWizard());
	    adapter.getVMWizard().init();
	}

	public void initWizardImpl(DefineSystemCLIDataContainer container,
	        DefineSystemCLIWizardContainer wizardContainer, String currentPagename)
	throws WbemsmtException {

	    adapter.setActiveWizard(adapter.getVMCliWizard());
	    if (RuntimeUtil.getInstance().isJSF())
	    {
	        adapter.getVMCliWizard().init("jsftest",MessageList.init(container),adapter.getBundle());
	    }
	    
	}

    public void initWizardImpl(CreateMigrationContainerPage1 container, MigrationWizardContainer wizardContainer, String currentPagename) throws WbemsmtException {
        adapter.setActiveWizard(adapter.getMigrationWizard());
		adapter.getMigrationWizard().initWizard(container);
	}

    public void initWizardImpl(VMConfigDataContainer container, ChangeVMSettingsWizardContainer wizardContainer,
            String currentPagename) throws WbemsmtException {
        
        adapter.setActiveWizard(adapter.getChangeSettingsWizard());
        adapter.getChangeSettingsWizard().init(container);
        
        
    }


}
