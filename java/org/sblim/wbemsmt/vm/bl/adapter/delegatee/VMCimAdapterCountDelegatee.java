 /** 
  * MetaclusterCimAdapterCountDelegatee.java
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
  * Description: Delegatee for counting objects within a list
  * 
  */
package org.sblim.wbemsmt.vm.bl.adapter.delegatee;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapterCountIf;
import org.sblim.wbemsmt.vm.bl.wrapper.list.HostSystemList;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.HostSystem;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.VMWizard;
import org.sblim.wbemsmt.vm.container.edit.*;
import org.sblim.wbemsmt.vm.container.edit.VMConfigDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.*;

public class VMCimAdapterCountDelegatee implements
    VMCimAdapterCountIf {

	protected final VMCimAdapter adapter;
//	public static int counter = 1;

	/**
	 * @param adapter 
	 * 
	 */
	public VMCimAdapterCountDelegatee(VMCimAdapter adapter) {
		super();
		this.adapter = adapter;
	}

	public int countImpl_Items(Class childrenClass, VMOverviewDataContainer container) throws WbemsmtException {
		HostSystemList hostSystems = adapter.getHostSystems();
		int count = 0;
		for (int i=0; i < hostSystems.size();i++)
		{
		    count = count + hostSystems.getHostedSystem(i).getVmList().size();
		}
        return count;
	}

	public int countImpl_Items(Class cls, WelcomeDataContainer container) throws WbemsmtException {
	    return adapter.getAllVMList().size();
	}

    public int countImpl_Items(Class cls, HostSystemInfoDataContainer container) throws WbemsmtException {
        return adapter.getSelectedHostSystem().getVmList().size();
    }


    public int countImpl_Items(Class cls, DiskVMInfoDataContainer container) throws WbemsmtException {
        return adapter.getSelectedVM().getDisks().size();
    }

    public int countImpl_Items(Class cls, MemoryVMInfoDataContainer container) throws WbemsmtException {
        return 1;
    }

    public int countImpl_Items(Class cls, NetworkVMInfoDataContainer container) throws WbemsmtException {
        return adapter.getSelectedVM().getNetworks().size();
    }

    public int countImpl_Items(Class cls, ProcessorVMInfoDataContainer container) throws WbemsmtException {
        return 1;
    }

    public int countImpl_Items(Class cls, NetworkHostInfoDataContainer container) throws WbemsmtException {
        return adapter.getSelectedHostSystem().getNetworks().size();
    }

    public int countImpl_Items(Class cls, ProcessorHostInfoDataContainer container) throws WbemsmtException {
        return 1;
    }
    public int countImpl_Items(Class cls, DiskHostInfoDataContainer container) throws WbemsmtException {
        return adapter.getSelectedHostSystem().getDisks().size();
    }
    
    public int countImpl_Items(Class cls, MemoryHostInfoDataContainer container) throws WbemsmtException {
        return 1;
    }

    public int countImpl_Items(Class childrenClass, PossibleOperationsDataContainer container) throws WbemsmtException {
        return HostSystem.POSSIBLE_OPERATIONS.length;
    }

    public int countImpl_Disks(Class cls, DiskDataContainer container) throws WbemsmtException {
    	if (adapter.getActiveWizard() != null){
        	return ((VMWizard)adapter.getActiveWizard()).getDisks().size();
        }
    	return adapter.getVMWizard().getDisks().size();
    }

    public int countImpl_Networks(Class cls, NetworkDataContainer container) throws WbemsmtException {
        if (adapter.getActiveWizard() != null){
        	return ((VMWizard)adapter.getActiveWizard()).getNetworks().size();
        }
    	return adapter.getVMWizard().getNetworks().size();
    }

    public int countImpl_Items(Class childrenClass, org.sblim.wbemsmt.vm.container.wizard.VMConfigDataContainer container)
            throws WbemsmtException {
        if (adapter.getActiveWizard() != null){
        	return ((VMWizard)adapter.getActiveWizard()).getSettingDataPropertyCount();
        }
        if (adapter.getSelectedVM() != null){
        	return adapter.getSelectedVM().getVssdPropertyNames().size();
        }
        return adapter.getVMWizard().getSettingDataPropertyCount();
   }

    public int countImpl_Items(Class childrenClass, VMConfigDataContainer container)
            throws WbemsmtException {
        return adapter.getSelectedVM().getSettingDataPropertyCount();
    }

    public int countImpl_ConfigItems(Class childClass, CreateVMSummaryDataContainer parent)
            throws WbemsmtException {
        return adapter.getVMWizard().getSettingDataPropertyCount();
    }

    public int countImpl_Disks(Class childClass, CreateVMSummaryDataContainer parent)
            throws WbemsmtException {
        return adapter.getVMWizard().getDisks().size();
    }

    public int countImpl_Networks(Class childClass, CreateVMSummaryDataContainer parent)
            throws WbemsmtException {
        return adapter.getVMWizard().getNetworks().size();
    }

    public int countImpl_ConfigItems(Class childClass, ChangeVMSettingsSummaryDataContainer parent)
            throws WbemsmtException {
        return adapter.getChangeSettingsWizard().getSettingDataPropertyCount();
    }

    public int countImpl_Disks(Class childClass, ChangeVMSettingsSummaryDataContainer parent)
            throws WbemsmtException {
        return adapter.getChangeSettingsWizard().getDisks().size();
    }

    public int countImpl_Networks(Class childClass, ChangeVMSettingsSummaryDataContainer parent)
            throws WbemsmtException {
        return adapter.getChangeSettingsWizard().getNetworks().size();
    }

    public int countImpl_ConfigValues(Class childClass, DefineSystemCLISummaryDataContainer parent)
            throws WbemsmtException {
        return adapter.getVMCliWizard().getConfigValues().size();
    }


}
