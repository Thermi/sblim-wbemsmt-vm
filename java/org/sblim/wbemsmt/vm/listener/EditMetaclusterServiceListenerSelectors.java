 /** 
  * EditMetaclusterServiceListenerSelectors.java
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
  * Description: selectors for the service panel
  * 
  */
package org.sblim.wbemsmt.vm.listener;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeSelector;
import org.sblim.wbemsmt.exception.WbemsmtException;


public class EditMetaclusterServiceListenerSelectors {


	public static class TabIndicationsEditIndicationsSelector implements
			TaskLauncherTreeNodeSelector {

		public void select(ITaskLauncherTreeNode treeNode,
				AbstractBaseCimAdapter adapter, String editPanelId)
				throws WbemsmtException {
			// do nothing we have only one service
		}

	}

	public static class TabMetricsEditMetricsSelectedSelector implements
			TaskLauncherTreeNodeSelector {

		public void select(ITaskLauncherTreeNode treeNode,
				AbstractBaseCimAdapter adapter, String editPanelId)
				throws WbemsmtException {
		}

	}

	public static class TabOverviewOverviewSelector implements
			TaskLauncherTreeNodeSelector {

		public void select(ITaskLauncherTreeNode treeNode,
				AbstractBaseCimAdapter adapter, String editPanelId)
				throws WbemsmtException {
			// do nothing we have only one service
		}

	}

	public static class TabMetricsEditMetricOverviewSelector implements
			TaskLauncherTreeNodeSelector {

		/* (non-Javadoc)
		 * @see org.sblim.wbemsmt.bl.adapter.TaskLauncherTreeNodeSelector#select(org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode, org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter, java.lang.String)
		 */
		public void select(ITaskLauncherTreeNode treeNode,
				AbstractBaseCimAdapter adapter, String editPanelId)
				throws WbemsmtException {
			//// do nothing we have only one service
		}

	}
}
