 /** 
  * VMLoader.java
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
  * Description: Base class for loading objects of the VM task
  * 
  */
package org.sblim.wbemsmt.vm.listener.cli;

import org.apache.commons.cli.CommandLine;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VM;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ComputerSystem;

public class VMLoader {

	protected CommandLine cmd;

	public VMLoader() {
		super();
	}

	protected void selectHostedSystem(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, String containerName) throws WbemsmtException {
		try {
			
			VMCimAdapter cimAdapter = (VMCimAdapter) adapter;
			
			CIM_ComputerSystem[] applicationContainers = VM.getVMs(cimAdapter.getCimClient(),cimAdapter.getInterOpNamespace());
			for (int i = 0; i < applicationContainers.length; i++) {
				CIM_ComputerSystem system = applicationContainers[i];
				if (system.get_ElementName().equals(containerName))
				{
					CimObjectKey key = new CimObjectKey(system.getCimObjectPath());
					adapter.select(key);
					return;
				}
			}
			
			throw new WbemsmtException(WbemsmtException.ERR_OBJECT_NOT_FOUND,bundle.getString("container.not.found",new Object[]{containerName}));
			
		} catch (WbemsmtException e) {
			throw new WbemsmtException(WbemsmtException.ERR_OBJECT_NOT_FOUND,bundle.getString("container.not.found",new Object[]{containerName}),e);
		}
	}

}
