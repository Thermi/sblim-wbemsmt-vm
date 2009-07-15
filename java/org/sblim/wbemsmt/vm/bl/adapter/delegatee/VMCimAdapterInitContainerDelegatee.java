 /** 
  * MetaclusterCimAdapterInitContainerDelegatee.java
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
  * Description: Delegatee for init container actions
  * 
  */
package org.sblim.wbemsmt.vm.bl.adapter.delegatee;

import org.sblim.wbemsmt.bl.fielddata.LinkData;
import org.sblim.wbemsmt.bl.fielddata.PictureData;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapterInitContainerIf;
import org.sblim.wbemsmt.vm.container.edit.*;
import org.sblim.wbemsmt.vm.container.edit.ConfigItemDataContainer;
import org.sblim.wbemsmt.vm.container.edit.VMConfigDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.*;
import org.sblim.wbemsmt.vm.listener.DefineSystemListener;

public class VMCimAdapterInitContainerDelegatee implements VMCimAdapterInitContainerIf {

	private VMCimAdapter adapter;

	public VMCimAdapterInitContainerDelegatee(VMCimAdapter adapter) {
		this.adapter = adapter;
	}

	public void initContainerImpl(CreateVMPage1DataContainer container) throws WbemsmtException {
	}

	public void initContainerImpl(CreateVMPage2DataContainer container) throws WbemsmtException {
	}

	public void initContainerImpl(CreateVMSummaryDataContainer container) throws WbemsmtException {
	}

	public void initContainerImpl(VMDataContainer container) throws WbemsmtException {
	}

	public void initContainerImpl(VMConfigDataContainer container) throws WbemsmtException {
	}

    public void initContainerImpl(org.sblim.wbemsmt.vm.container.wizard.VMConfigDataContainer container) throws WbemsmtException {
    }

    public void initContainerImpl(CreateVMPage3DataContainer container) throws WbemsmtException {
	}

	public void initContainerImpl(VMOperationsDataContainer container) throws WbemsmtException {
		adapter.getSelectedVM().initContainer(container);
		
	}

	public void initContainerImpl(CreateMigrationContainerPage1 container) throws WbemsmtException {
	}

	public void initContainerImpl(CreateMigrationContainerPage2a container) throws WbemsmtException {
		adapter.getMigrationWizard().initContainer(container);
		
	}

	public void initContainerImpl(CreateMigrationContainerPage2b container) throws WbemsmtException {
		adapter.getMigrationWizard().initContainer(container);
		
	}

	public void initContainerImpl(CreateMigrationContainerSummary container) throws WbemsmtException {
	}


 	public void initContainerImpl(WelcomeDataContainer container) throws WbemsmtException {
		container.get_usr_Picture().setControlValue(new PictureData("/org/sblim/wbemsmt/vm/images/vm.gif"));
		container.get_usr_CreateLink().setControlValue(new LinkData(new DefineSystemListener(),adapter.getBundle().getString("tree.menu.createVM")));
	}
 
 	public void initContainerImpl(WelcomeItemDataContainer container) throws WbemsmtException {
	}

	public void initContainerImpl(VMOverviewDataContainer container) throws WbemsmtException {
	}

	public void initContainerImpl(CreateMigrationContainerPage2c container)
			throws WbemsmtException {
	}

	
	public void initContainerImpl(CreateMigrationContainerPage3 container)
			throws WbemsmtException {
		adapter.getMigrationWizard().initContainer(container);
		
	}

    public void initContainerImpl(VMOverviewItemDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(DiskDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(MemoryDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(NetworkDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(ProcessorDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(ConfigItemDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(org.sblim.wbemsmt.vm.container.wizard.ConfigItemDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(DiskHostInfoDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(DiskHostInfoItemDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(DiskVMInfoDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(DiskVMInfoItemDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(HostSystemInfoDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(HostSystemInfoItemDataContainer container)
            throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(MemoryHostInfoDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(MemoryHostInfoItemDataContainer container)
            throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(MemoryVMInfoDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(MemoryVMInfoItemDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(NetworkHostInfoDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(NetworkHostInfoItemDataContainer container)
            throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(NetworkVMInfoDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(NetworkVMInfoItemDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(ProcessorHostInfoDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(ProcessorHostInfoItemDataContainer container)
            throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(ProcessorVMInfoDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(ProcessorVMInfoItemDataContainer container)
            throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(PossibleOperationsDataContainer container)
            throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(PossibleOperationsItemDataContainer container)
            throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(DiskItemDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(NetworkItemDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(SummaryConfigItemDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(SummaryDiskItemDataContainer container) throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(SummaryNetworkItemDataContainer container)
            throws WbemsmtException {
        // TODO Auto-generated method stub
        
    }

    public void initContainerImpl(ChangeVMSettingsSummaryDataContainer container)
            throws WbemsmtException {
    }

    public void initContainerImpl(DefineSystemCLIDataContainer container) throws WbemsmtException {
    }

    public void initContainerImpl(DefineSystemCLISummaryConfigItemDataContainer container)
            throws WbemsmtException {
    }

    public void initContainerImpl(DefineSystemCLISummaryDataContainer container)
            throws WbemsmtException {
    }


}
