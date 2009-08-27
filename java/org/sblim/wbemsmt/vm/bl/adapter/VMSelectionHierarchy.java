 /** 
  * MetaclusterSelectionHierarchy.java
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
  * Description: Selection hierarchy for metacluster adapter
  * 
  */
package org.sblim.wbemsmt.vm.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.SelectionHierarchy;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.HostSystem;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VM;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ComputerSystem;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_System;

public class VMSelectionHierarchy extends SelectionHierarchy {

	private VMCimAdapter adapter;

	public CIM_ComputerSystem getVM() {
		return (CIM_ComputerSystem) get(0);
	}

    public CIM_System getHostSystem() {
        return (CIM_System) get(1);
    }

    public void add(HostSystem hostSystem) {
        cleanup(0);
        adapter.setSelectedHostSystem(hostSystem);
        push(hostSystem.getFco());
    }

    public void add(VM vm) {
		cleanup(1);
		adapter.setSelectedVM(vm);
		push(vm.getFco());
	}


    private void cleanup(int currentLevel) {
		while (size() > currentLevel)
		{
			pop();
		}
	}


	public void setAdapter(VMCimAdapter adapter) {
		this.adapter = adapter;
	}

	public VMCimAdapter getAdapter() {
		return adapter;
	}

	
	
	
}
