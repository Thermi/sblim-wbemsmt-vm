 /** 
  * MetaclusterCreateListenerSelector.java
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
  * Description: Selector for all create aciton which are independent of the selected node
  * 
  */
package org.sblim.wbemsmt.vm.listener;

import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimAdapterFactory;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageUtil;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeSelectorForCreate;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.vm.VMErrCodes;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;

/**
 * @author Bauschert
 *
 */
public class VMCreateListenerSelector implements TaskLauncherTreeNodeSelectorForCreate {

	private AbstractBaseCimAdapter adapter;

	public void select(ITaskLauncherTreeNode treeNode, AbstractBaseCimAdapter cimAdapter, String createId) throws WbemsmtException {
		
		
		ITaskLauncherTreeNode parent = treeNode;
		try {
			while ( ! (parent instanceof TaskLauncherTreeNode && ((TaskLauncherTreeNode)parent).getName().equals("tree.virtualsystems"))
					&& parent.findNodesByName("tree.virtualsystems").size() == 0
					&& parent.getParent() != null 
					&& parent.getParent() != parent)
			{
				parent = parent.getParent();
			}
		
			List<ITaskLauncherTreeNode> list = parent.findNodesByName("tree.virtualsystems");
			
			if (list.size() == 1)
			{
				TaskLauncherTreeNode node = (TaskLauncherTreeNode) list.get(0);
				this.adapter = CimAdapterFactory.getInstance().getAdapter(VMCimAdapter.class, node.getCimClient());
			}
			else
			{
				MessageUtil.addMessage(VMErrCodes.MSG_CANNOT_SELECT_SERVICE, Message.ERROR, VMCimAdapter.RESOURCE_BUNDLE_NAMES, "cannot.select.service");
			}
			
			
		} catch (WbemsmtException e) {
			throw new WbemsmtException(WbemsmtException.ERR_OBJECT_NOT_FOUND,"Cannot find VM node " + treeNode.getInfo(),e); 
		}

	}

	public boolean execute() {
		return adapter != null;
	}

	public AbstractBaseCimAdapter getAdapter() {
		return adapter;
	}

}
