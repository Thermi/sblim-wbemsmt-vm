 /** 
  * MetaclusterCimAdapterCreateDelegatee.java
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
  * Description:  Delegatee for creating objects
  * 
  */
package org.sblim.wbemsmt.vm.bl.adapter.delegatee;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapterCreateIf;
import org.sblim.wbemsmt.vm.container.wizard.ChangeVMSettingsSummaryDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerSummary;
import org.sblim.wbemsmt.vm.container.wizard.CreateVMSummaryDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer;

public class VMCimAdapterCreateDelegatee implements
VMCimAdapterCreateIf {

	private final VMCimAdapter adapter;

	public VMCimAdapterCreateDelegatee(VMCimAdapter adapter) {
		this.adapter = adapter;
	}

	public void createImpl(CreateVMSummaryDataContainer container) throws WbemsmtException {
		adapter.getVMWizard().create(container);
	}

	public void createImpl(DefineSystemCLISummaryDataContainer container) throws WbemsmtException {
        adapter.getVMCliWizard().create(container);
    }

	public void createImpl(CreateMigrationContainerSummary container) throws WbemsmtException {
		adapter.getMigrationWizard().create(container);
	}

    public void createImpl(ChangeVMSettingsSummaryDataContainer container) throws WbemsmtException {
        adapter.getChangeSettingsWizard().create(container);
        
    }


}
