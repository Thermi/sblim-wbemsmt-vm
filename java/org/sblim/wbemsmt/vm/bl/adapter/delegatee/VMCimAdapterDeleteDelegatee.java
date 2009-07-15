
package org.sblim.wbemsmt.vm.bl.adapter.delegatee;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapterDeleteIf;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ComputerSystem;

public class VMCimAdapterDeleteDelegatee implements
VMCimAdapterDeleteIf {

	private final VMCimAdapter adapter;

	public VMCimAdapterDeleteDelegatee(VMCimAdapter adapter) {
		super();
		this.adapter = adapter;
	}

	public void deleteImpl(CIM_ComputerSystem fco) throws WbemsmtException {
		adapter.getSelectedVM().delete();
	}

}
