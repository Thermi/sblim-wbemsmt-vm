 /** 
  * ContainerNodeInstanceNaming.java
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
  * Description: Naming for container Nodes
  * 
  */
package org.sblim.wbemsmt.vm;

import java.text.MessageFormat;
import java.util.logging.Level;

import javax.cim.CIMInstance;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.session.WbemsmtSession;
import org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNaming;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VM;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ComputerSystem;

/**
 * @author Bauschert
 *
 */
public class ContainerNodeInstanceNaming extends CIMInstanceNaming {

	private final static String FONT_COLOR_TEMPLATE = "<font color=\"{0}\" >{1}</font>";
	
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNaming#getDisplayString(org.sblim.wbem.cim.CIMInstance)
	 */
	public String getDisplayString(CIMInstance cimInstance, WBEMClient cimClient) {
		
		return (String) cimInstance.getProperty(CIM_ComputerSystem.PROPERTY_ELEMENTNAME.NAME).getValue();
		
		
	}

	public String getDisplayString(AbstractWbemsmtFco cimObject, WBEMClient cimClient) {
		

		String value = getDisplayString(cimObject.getCimInstance(),cimClient);
		try {
			
			CIM_ComputerSystem system = new CIM_ComputerSystem(cimObject.getCimInstance());
			String key = VMCimAdapter.getContainerStateSessionKey(system);
			Boolean activeObject = (Boolean) WbemsmtSession.getSession().getAttribute(key);
			
			boolean active = false; 
			if (activeObject != null)
			{
				active = activeObject.booleanValue();
			}
			else
			{
				active = VM.isRunning(system, cimClient);
				WbemsmtSession.getSession().setAttribute(key, new Boolean(active));
			}
			
			if (RuntimeUtil.getInstance().isJSF()) {
				String color = active ? "green" : "red"; 
				value = MessageFormat.format(FONT_COLOR_TEMPLATE, new Object[] {color, value });
			}
		} catch (WbemsmtException e) {
			logger.log(Level.SEVERE,"Cannot create naming for treenode " + value, e);
		}		
		return value;
		
	}
	
}
