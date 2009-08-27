 /** 
  * MetaclusterCimAdapterUpdateControlsDelegatee.java
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
  * Description:  Delegatee for updating controls
  * 
  */
package org.sblim.wbemsmt.vm.bl.adapter.delegatee;

import java.util.Collections;
import java.util.List;

import org.sblim.wbemsmt.bl.fielddata.MemoData;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.ComponentProperties;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapterUpdateControlsIf;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VM;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VMByCountComparator;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.host.PossibleOperation;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.vm.Disk;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.vm.Memory;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.vm.Network;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.vm.Processor;
import org.sblim.wbemsmt.vm.bl.wrapper.wizard.VMWizard;
import org.sblim.wbemsmt.vm.container.edit.ConfigItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.DiskHostInfoDataContainer;
import org.sblim.wbemsmt.vm.container.edit.DiskHostInfoItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.DiskVMInfoDataContainer;
import org.sblim.wbemsmt.vm.container.edit.DiskVMInfoItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.HostSystemInfoDataContainer;
import org.sblim.wbemsmt.vm.container.edit.HostSystemInfoItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.MemoryHostInfoDataContainer;
import org.sblim.wbemsmt.vm.container.edit.MemoryHostInfoItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.MemoryVMInfoDataContainer;
import org.sblim.wbemsmt.vm.container.edit.MemoryVMInfoItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.NetworkHostInfoDataContainer;
import org.sblim.wbemsmt.vm.container.edit.NetworkHostInfoItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.NetworkVMInfoDataContainer;
import org.sblim.wbemsmt.vm.container.edit.NetworkVMInfoItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.PossibleOperationsDataContainer;
import org.sblim.wbemsmt.vm.container.edit.PossibleOperationsItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.ProcessorHostInfoDataContainer;
import org.sblim.wbemsmt.vm.container.edit.ProcessorHostInfoItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.ProcessorVMInfoDataContainer;
import org.sblim.wbemsmt.vm.container.edit.ProcessorVMInfoItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.VMDataContainer;
import org.sblim.wbemsmt.vm.container.edit.VMOperationsDataContainer;
import org.sblim.wbemsmt.vm.container.edit.VMOverviewDataContainer;
import org.sblim.wbemsmt.vm.container.edit.VMOverviewItemDataContainer;
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
import org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryConfigItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DiskDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.DiskItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.MemoryDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.NetworkDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.NetworkItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.ProcessorDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.SummaryConfigItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.SummaryDiskItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.SummaryNetworkItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.VMConfigDataContainer;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ComputerSystem;


public class VMCimAdapterUpdateControlsDelegatee implements VMCimAdapterUpdateControlsIf {

	private final VMCimAdapter adapter;

	/**
	 * @param adapter 
	 * 
	 */
	public VMCimAdapterUpdateControlsDelegatee(VMCimAdapter adapter) {
		super();
		this.adapter = adapter;
	}

	public void updateControlsImpl(CreateVMPage1DataContainer container) throws WbemsmtException {
		adapter.getVMWizard().updateControls(container);		
	}

	public void updateControlsImpl(CreateVMPage2DataContainer container) throws WbemsmtException {
		adapter.getVMWizard().updateControls(container);		
	}

	public void updateControlsImpl(CreateVMSummaryDataContainer container) throws WbemsmtException {
		adapter.getVMWizard().updateControls(container);		
	}

	public void updateControlsImpl(VMDataContainer container) throws WbemsmtException {
		adapter.getSelectedVM().updateControls(container);		
	}

	public void updateControlsImpl(org.sblim.wbemsmt.vm.container.edit.VMConfigDataContainer container) throws WbemsmtException {
		adapter.getSelectedVM().updateControls(container);		
	}

    public void updateControlsImpl(VMConfigDataContainer container) throws WbemsmtException {
    	((VMWizard)adapter.getActiveWizard()).updateControls(container);      
    	//adapter.getVMWizard().updateControls(container);
    }

    public void updateControlsImpl(CreateVMPage3DataContainer container) throws WbemsmtException {
		adapter.getVMWizard().updateControls(container);		
	}

	public void updateControlsImpl(VMOperationsDataContainer container) throws WbemsmtException {
		adapter.getSelectedVM().updateControls(container);		
	}

	public void updateControlsImpl(CreateMigrationContainerPage1 container) throws WbemsmtException {
		adapter.getMigrationWizard().updateControls(container);		
	}

	public void updateControlsImpl(CreateMigrationContainerPage2a container) throws WbemsmtException {
		adapter.getMigrationWizard().updateControls(container);		
	}

	public void updateControlsImpl(CreateMigrationContainerPage2b container) throws WbemsmtException {
		adapter.getMigrationWizard().updateControls(container);		
	}

	public void updateControlsImpl(CreateMigrationContainerSummary container) throws WbemsmtException {
		adapter.getMigrationWizard().updateControls(container);		
	}

	public void updateControlsImpl(WelcomeItemDataContainer container) throws WbemsmtException {
	    //do nothing
	}

	public void updateControlsImpl(CreateMigrationContainerPage2c container)
			throws WbemsmtException {
		adapter.getMigrationWizard().updateControls(container);		
	}

	public void updateControlsImpl(CreateMigrationContainerPage3 container)
			throws WbemsmtException {
		adapter.getMigrationWizard().updateControls(container);		
	}

    public void updateControlsImpl(VMOverviewDataContainer container) throws WbemsmtException {
        adapter.updateControls(container.getItems(), adapter.getAllVMList().getFCOs());
    }

    public void updateControlsImpl(WelcomeDataContainer container) throws WbemsmtException {
        List<Object> list = adapter.getAllVMList().getList();
        Collections.sort(list, new VMByCountComparator());
        adapter.updateControls(container.getItems(), list);
        
    }

    public void updateControlsImpl(VMOverviewItemDataContainer container, CIM_ComputerSystem fco)
            throws WbemsmtException {
        
        adapter.updateControls(container,fco);
        
    }

    public void updateControlsImpl(WelcomeItemDataContainer container, VM vm)
            throws WbemsmtException {
        
        String color = vm.isRunning() ? ComponentProperties.COLOR_GREEN : ComponentProperties.COLOR_RED;  
        
        container.get_usr_VMName().setControlValue(vm.getVirtualSystemType() + ":" + vm.getFco().get_ElementName());
        container.get_usr_VMName().getProperties().setColor(color);
        
        container.get_usr_Info().setControlValue(new MemoData(vm.getState()));
        container.get_usr_Info().getProperties().setColor(color);
        
    }

    public void updateControlsImpl(DiskDataContainer container) throws WbemsmtException {
        ((VMWizard)adapter.getActiveWizard()).updateControls(container);
        
    }

    public void updateControlsImpl(MemoryDataContainer container) throws WbemsmtException {
    	((VMWizard)adapter.getActiveWizard()).updateControls(container);
        
    }

    public void updateControlsImpl(NetworkDataContainer container) throws WbemsmtException {
    	((VMWizard)adapter.getActiveWizard()).updateControls(container);
    }

    public void updateControlsImpl(ProcessorDataContainer container) throws WbemsmtException {
    	((VMWizard)adapter.getActiveWizard()).updateControls(container);
    }

    public void updateControlsImpl(VMOverviewItemDataContainer container) throws WbemsmtException {
        //do nothing
    }

    public void updateControlsImpl(ConfigItemDataContainer container) throws WbemsmtException {
        // do nothing
        
    }

    public void updateControlsImpl(org.sblim.wbemsmt.vm.container.wizard.ConfigItemDataContainer container) throws WbemsmtException {
        // do nothing
        
    }

    public void updateControlsImpl(ConfigItemDataContainer container, String propertyName)
            throws WbemsmtException {
        
        adapter.getSelectedVM().updateControls(container,propertyName);
        
    }

    public void updateControlsImpl(org.sblim.wbemsmt.vm.container.wizard.ConfigItemDataContainer container, String propertyName)
    throws WbemsmtException {

    	((VMWizard)adapter.getActiveWizard()).updateControls(container,propertyName);

    }

    public void updateControlsImpl(DiskHostInfoDataContainer container) throws WbemsmtException {
        adapter.getSelectedHostSystem().updateControls(container);
        
    }

    public void updateControlsImpl(DiskHostInfoItemDataContainer container) throws WbemsmtException {
      //do nothing
    }

    public void updateControlsImpl(DiskVMInfoDataContainer container) throws WbemsmtException {
        adapter.getSelectedVM().updateControls(container);
    }

    public void updateControlsImpl(DiskVMInfoItemDataContainer container) throws WbemsmtException {
      //do nothing
    }

    public void updateControlsImpl(HostSystemInfoDataContainer container) throws WbemsmtException {
        adapter.getSelectedHostSystem().updateControls(container);
        
    }

    public void updateControlsImpl(HostSystemInfoItemDataContainer container)
            throws WbemsmtException {
      //do nothing
        
    }

    public void updateControlsImpl(MemoryHostInfoDataContainer container) throws WbemsmtException {
        adapter.getSelectedHostSystem().updateControls(container);
    }

    public void updateControlsImpl(MemoryHostInfoItemDataContainer container)
            throws WbemsmtException {
      //do nothing
    }

    public void updateControlsImpl(MemoryVMInfoDataContainer container) throws WbemsmtException {
        adapter.getSelectedVM().updateControls(container);
        
    }

    public void updateControlsImpl(MemoryVMInfoItemDataContainer container) throws WbemsmtException {
      //do nothing
        
    }

    public void updateControlsImpl(NetworkHostInfoDataContainer container) throws WbemsmtException {
        adapter.getSelectedHostSystem().updateControls(container);    }

    public void updateControlsImpl(NetworkHostInfoItemDataContainer container)
            throws WbemsmtException {
      //do nothing
   }

    public void updateControlsImpl(NetworkVMInfoDataContainer container) throws WbemsmtException {
        adapter.getSelectedVM().updateControls(container);
        
    }

    public void updateControlsImpl(NetworkVMInfoItemDataContainer container)
            throws WbemsmtException {
      //do nothing
        
    }

    public void updateControlsImpl(ProcessorHostInfoDataContainer container)
            throws WbemsmtException {
        adapter.getSelectedHostSystem().updateControls(container);    
    }

    public void updateControlsImpl(ProcessorHostInfoItemDataContainer container)
            throws WbemsmtException {
        //do nothing
    }

    public void updateControlsImpl(ProcessorVMInfoDataContainer container) throws WbemsmtException {
        adapter.getSelectedVM().updateControls(container);
    }

    public void updateControlsImpl(ProcessorVMInfoItemDataContainer container)
            throws WbemsmtException {
        //do nothing
    }

    public void updateControlsImpl(HostSystemInfoItemDataContainer container, VM fco)
            throws WbemsmtException {
        
        adapter.getSelectedHostSystem().updateControls(container,fco);        
    }

    public void updateControlsImpl(DiskVMInfoItemDataContainer container,
            Disk fco) throws WbemsmtException {
        adapter.getSelectedVM().updateControls(container,fco);
    }


    public void updateControlsImpl(MemoryVMInfoItemDataContainer container,
            Memory fco) throws WbemsmtException {
        adapter.getSelectedVM().updateControls(container,fco);
    }


    public void updateControlsImpl(NetworkVMInfoItemDataContainer container,
            Network fco) throws WbemsmtException {
        adapter.getSelectedVM().updateControls(container,fco);
    }


    public void updateControlsImpl(ProcessorVMInfoItemDataContainer container,
            Processor processor) throws WbemsmtException {
        adapter.getSelectedVM().updateControls(container,processor);
        
    }

    public void updateControlsImpl(NetworkHostInfoItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.objects.host.Network fco) throws WbemsmtException {
        adapter.getSelectedHostSystem().updateControls(container,fco);
    }
    
    public void updateControlsImpl(ProcessorHostInfoItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.objects.host.Processor fco) throws WbemsmtException {
        adapter.getSelectedHostSystem().updateControls(container,fco);
    }
    public void updateControlsImpl(DiskHostInfoItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.objects.host.Disk fco) throws WbemsmtException {
        adapter.getSelectedHostSystem().updateControls(container,fco);
    }
    
    public void updateControlsImpl(MemoryHostInfoItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.objects.host.Memory fco) throws WbemsmtException {
        adapter.getSelectedHostSystem().updateControls(container,fco);
    }

    public void updateControlsImpl(PossibleOperationsDataContainer container)
            throws WbemsmtException {
        adapter.getSelectedHostSystem().updateControls(container);
        
    }

    public void updateControlsImpl(PossibleOperationsItemDataContainer container)
            throws WbemsmtException {
        // not used
    }

    public void updateControlsImpl(PossibleOperationsItemDataContainer container,
            PossibleOperation fco) throws WbemsmtException {

        adapter.getSelectedHostSystem().updateControls(container,fco);
        
    }

    public void updateControlsImpl(DiskItemDataContainer container) throws WbemsmtException {
        // do nothing
        
    }

    public void updateControlsImpl(NetworkItemDataContainer container) throws WbemsmtException {
        // do nothing
        
    }

    public void updateControlsImpl(DiskItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.Disk fco) throws WbemsmtException {
        ((VMWizard)adapter.getActiveWizard()).updateControls(container,fco);
        
    }
    
    public void updateControlsImpl(NetworkItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.Network fco)
            throws WbemsmtException {
    	((VMWizard)adapter.getActiveWizard()).updateControls(container,fco);
        
    }

    public void updateControlsImpl(SummaryConfigItemDataContainer container)
            throws WbemsmtException {
        // do nothing
    }

    public void updateControlsImpl(SummaryDiskItemDataContainer container) throws WbemsmtException {
        // do nothing
    }

    public void updateControlsImpl(SummaryNetworkItemDataContainer container)
            throws WbemsmtException {
        // do nothing
    }

    public void updateControlsImpl(SummaryConfigItemDataContainer container, String fco)
            throws WbemsmtException {
    	((VMWizard)adapter.getActiveWizard()).updateControls(container,fco);
        
    }

    public void updateControlsImpl(SummaryDiskItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.Disk fco) throws WbemsmtException {
    	((VMWizard)adapter.getActiveWizard()).updateControls(container,fco);
    }

    public void updateControlsImpl(SummaryNetworkItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.Network fco)
            throws WbemsmtException {
    	((VMWizard)adapter.getActiveWizard()).updateControls(container,fco);
        
    }

    public void updateControlsImpl(ChangeVMSettingsSummaryDataContainer container)
            throws WbemsmtException {
        
        adapter.getChangeSettingsWizard().updateControls(container);
        
    }

    public void updateControlsImpl(DefineSystemCLIDataContainer container) throws WbemsmtException {
        adapter.getVMCliWizard().updateControls(container);
    }


    public void updateControlsImpl(DefineSystemCLISummaryDataContainer container)
            throws WbemsmtException {
        adapter.getVMCliWizard().updateControls(container);
    }

    public void updateControlsImpl(DefineSystemCLISummaryConfigItemDataContainer container,
            String key) throws WbemsmtException {
        adapter.getVMCliWizard().updateControls(container,key);
        
    }
    public void updateControlsImpl(DefineSystemCLISummaryConfigItemDataContainer container)
    throws WbemsmtException {
        // do nothing
        
    }

}
