/** 
 * WelcomeListener.java
 *
 * 
 * 
 * © Copyright IBM Corp. 2008, 
 * 
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE 
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE 
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. 
 * 
 * You can obtain a current copy of the Eclipse Public License from 
 * http://www.opensource.org/licenses/eclipse-1.0.php 
 
 *
 * @author: org.sblim.wbemsmt.dcg.generator.ActionGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/welcomeListener.vm
 *
 * Contributors: 
 *   Prashanth Karnam <prkarnam@in.ibm.com>
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.listener;

import org.sblim.wbemsmt.tools.runtime.*;
import org.sblim.wbemsmt.exception.*;

public class WelcomeListener implements org.sblim.wbemsmt.bl.welcome.WelcomeListener {

    String jsfListener = "org.sblim.wbemsmt.vm.listener.jsf.WelcomeListener";
    String swingListener = "org.sblim.wbemsmt.vm.listener.jswing.WelcomeListener";
    String cmdListener = "org.sblim.wbemsmt.vm.listener.cli.WelcomeListener";

    public org.sblim.wbemsmt.bl.welcome.WelcomeListener getListenerByPlType()
            throws WbemsmtException {
        String listenerClass = null;
        try {
            if (RuntimeUtil.getInstance().isJSF()) {
                listenerClass = jsfListener;
            }
            else if (RuntimeUtil.getInstance().isSwing()) {
                listenerClass = swingListener;
            }
            else if (RuntimeUtil.getInstance().isCommandline()) {
                listenerClass = cmdListener;
            }

            org.sblim.wbemsmt.bl.welcome.WelcomeListener listener = (org.sblim.wbemsmt.bl.welcome.WelcomeListener) Class
                    .forName(listenerClass).newInstance();

            return listener;
        }
        catch (Exception e) {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                    "Cannot process Event with listener " + listenerClass, e);
        }
    }
}