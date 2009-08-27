package org.sblim.wbemsmt.vm.bl.adapter.delegatee;

import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapterSaveIf;
import org.sblim.wbemsmt.vm.container.edit.VMDataContainer;

public class VMCimAdapterSaveDelegatee implements VMCimAdapterSaveIf {

	private final VMCimAdapter adapter;

	public VMCimAdapterSaveDelegatee(VMCimAdapter adapter) {
		super();
		this.adapter = adapter;
	}

	public MessageList saveImpl(VMDataContainer container) throws WbemsmtException {
		return adapter.getSelectedVM().save(container);
	}

}
