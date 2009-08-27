 /** 
  * DnsZoneNameFilter.java
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
  * Description: Filtering by the name of the Zone (Instances of Linux_DnsZone)
  * 
  */
package org.sblim.wbemsmt.vm.filter;

import java.util.logging.Logger;

import javax.cim.CIMInstance;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tasklauncher.filter.CIMInstanceFilter;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VM;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ComputerSystem;

public class ContainerFilter extends CIMInstanceFilter {

	private static Logger logger = Logger.getLogger(ContainerFilter.class.getName());
	public static final String INCLUDE_RUNNING = "includeRunning";

	public ContainerFilter(boolean includeRunning)
	{
		addParameter(INCLUDE_RUNNING, ""+ includeRunning);
	}
	
	public ContainerFilter()
	{
		
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.filter.CIMInstanceFilter#accept(org.sblim.wbem.cim.CIMInstance)
	 */
	public boolean accept(CIMInstance cimInstance, WBEMClient cimClient) throws WbemsmtException {
		boolean isMc_ComputerSystem = cimInstance.getClassName().equals(CIM_ComputerSystem.CIM_CLASS_NAME);
		if (isMc_ComputerSystem)
		{
			return accept(new CIM_ComputerSystem(cimInstance), cimClient);
		}
		else
		{
			throw new WbemsmtException(WbemsmtException.ERR_FILTER,"cimInstance was not from type " + CIM_ComputerSystem.CIM_CLASS_NAME + " The type was: " + cimInstance.getClassName());
		}
	}

	private boolean accept(CIM_ComputerSystem system, WBEMClient cimClient) throws WbemsmtException {

		boolean includeRunning = "true".equalsIgnoreCase(getParameter(INCLUDE_RUNNING));
		boolean isRunning = VM.isRunning(system,cimClient);

		boolean result = includeRunning == isRunning;
		
		logger.fine("Container " + system.get_ElementName() + " accepted: " + result);
		
		return result;
	}

}

