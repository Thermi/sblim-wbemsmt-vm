/**
 * DeleteVMListener.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF
 * THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.ActionGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/actionListener.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.vm.listener;

import org.sblim.wbemsmt.tasklauncher.event.TaskLauncherContextMenuEventListener;
import org.sblim.wbemsmt.tasklauncher.event.TaskLauncherContextMenuEventListenerImpl;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;

public class DeleteVMListener extends TaskLauncherContextMenuEventListenerImpl implements
        org.sblim.wbemsmt.tasklauncher.event.DeleteListener {

    String jsfListener = "org.sblim.wbemsmt.vm.listener.jsf.DeleteVMListener";
    String swingListener = "org.sblim.wbemsmt.vm.listener.jswing.DeleteVMListener";

    //String cmdListener = "org.sblim.wbemsmt.vm.listener.cli.DeleteVMListener";

    public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemsmtException {

        if (event.getType() == TaskLauncherTreeNodeEvent.TYPE_CLICKED) {
            String listenerClass = null;
            try {

                if (RuntimeUtil.getInstance().isJSF()) {
                    listenerClass = jsfListener;
                }
                else if (RuntimeUtil.getInstance().isSwing()) {
                    listenerClass = swingListener;
                }
                //			else if (RuntimeUtil.getInstance().isCommandline())
                //			{
                //				listenerClass = cmdListener; 
                //			}

                TaskLauncherContextMenuEventListener listener = (TaskLauncherContextMenuEventListener) Class
                        .forName(listenerClass).newInstance();
                return listener.processEvent(event);
            }
            catch (WbemsmtException e) {
                throw e;
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "Cannot process Event with listener " + listenerClass, e);
            }

        }
        return null;
    }

}