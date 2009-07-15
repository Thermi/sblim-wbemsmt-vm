 /** 
  * HostedSystemList.java
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
  * Description: List for HostedSystem wrapper objects
  * 
  */
package org.sblim.wbemsmt.vm.bl.wrapper.list;

import java.util.Iterator;
import java.util.List;

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.ObjectList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VM;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ManagedElement;



/**
 * @see org.sblim.wbemsmt.vm.bl.wrapper.objects.VM
 */
public class VMList extends ObjectList  {

	public VM getHostedSystem(CimObjectKey key)
	{
		return (VM)get(key);
	}
	
	public VM getHostedSystem(CIMObjectPath path)
	{
		return getVM(path);
	}

	public VM getVM(CIMObjectPath path)
	{
		return getHostedSystem(new CimObjectKey(path));
	}

	public VM getHostedSystem(CIM_ManagedElement element)
	{
		return getHostedSystem(new CimObjectKey(element.getCimObjectPath()));
	}

	public void addVM(VM vm) throws WbemsmtException
	{
		put(vm);
	}
	
	protected Object getKey(Object value) throws WbemsmtException {
		VM hostedSystem = (VM) value;
		return hostedSystem.getFco().get_Name();
	}
	
	protected Object getFco(Object value) {
		VM hostedSystem = (VM) value;
		return hostedSystem.getFco();
	}

	public VM getVmByName(String vm) throws WbemsmtException {
		return (VM) getObjectsByName().get(vm);
	}

	public VM getHostedSystem(int i) throws WbemsmtException {
		return (VM) getList().get(i);
	}

	public void clear() throws WbemsmtException {
		super.clear();
	}
	
	/**
	 * return only the runnning or the stopped containers in this is list
	 * @param running
	 * @return
	 * @throws WbemsmtException 
	 */
	public VMList getList(boolean running) throws WbemsmtException
	{
		VMList filteredList = new VMList();
		
		List list = getList();
		
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			VM appContainer = (VM) iter.next();
			if (appContainer.isRunning() == running)
			{
				filteredList.addVM(appContainer);
			}
		}
		
		return filteredList;
	}
	
	
}
