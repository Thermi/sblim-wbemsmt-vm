 /** 
  * CreateContainerLoader.java
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
  * Description: Class to load a container afer creating the container
  * 
  */
package org.sblim.wbemsmt.vm.listener.cli;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.cli.CimCommandValues;
import org.sblim.wbemsmt.tools.cli.CliDataLoader;
import org.sblim.wbemsmt.tools.cli.CliUtil;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer;

public class CreateVMLoader extends VMLoader implements CliDataLoader {

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.cli.CliDataLoader#load(org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle, org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter, org.apache.commons.cli.CommandLine)
	 */
	public void load(WbemSmtResourceBundle bundle,
			AbstractBaseCimAdapter adapter, CimCommandValues commandValues)
			throws WbemsmtException {
	
	    
	    MessageList ml = new MessageList();
	    
	    String sessionKey = CliUtil.getOption(commandValues,CreateVM.KEY_sessionkey);
	    ((VMCimAdapter) adapter).getVMCliWizard().init(sessionKey,null,null);
	}

    public void loadTracingObject(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter,
            DefineSystemCLISummaryDataContainer container) throws WbemsmtException {
    }

}
