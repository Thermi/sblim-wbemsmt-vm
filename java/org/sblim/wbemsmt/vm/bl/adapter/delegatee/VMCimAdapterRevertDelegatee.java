package org.sblim.wbemsmt.vm.bl.adapter.delegatee;

import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapterRevertIf;
import org.sblim.wbemsmt.vm.container.edit.VMConfigDataContainer;
import org.sblim.wbemsmt.vm.container.edit.VMDataContainer;
import org.sblim.wbemsmt.vm.container.edit.VMOperationsDataContainer;

public class VMCimAdapterRevertDelegatee implements VMCimAdapterRevertIf {

	private final VMCimAdapter adapter;

	public VMCimAdapterRevertDelegatee(VMCimAdapter adapter) {
		super();
		this.adapter = adapter;
	}

	public MessageList revertImpl(VMDataContainer container) throws WbemsmtException {
		return adapter.getSelectedVM().revert(container);
	}

	public MessageList revertImpl(VMConfigDataContainer container) throws WbemsmtException {
		return null;
	}

	public MessageList revertImpl(VMOperationsDataContainer container) throws WbemsmtException {
		return adapter.getSelectedVM().revert(container);
	}

}
