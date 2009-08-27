 /** 
  * HostedSystemList.java
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
import org.sblim.wbemsmt.vm.bl.wrapper.objects.HostSystem;
import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ManagedElement;



/**
 * @see org.sblim.wbemsmt.vm.bl.wrapper.objects.HostSystem
 */
public class HostSystemList extends ObjectList  {

	public HostSystem getHostSystem(CimObjectKey key)
	{
		return (HostSystem)get(key);
	}
	
	public HostSystem getHostSystem(CIMObjectPath path)
	{
		return getHostSystem(new CimObjectKey(path));
	}

	public HostSystem getHostSystem(CIM_ManagedElement element)
	{
		return getHostSystem(new CimObjectKey(element.getCimObjectPath()));
	}

	public void addHostSystem(HostSystem hostedSystem) throws WbemsmtException
	{
		put(hostedSystem);
	}
	
	protected Object getKey(Object value) throws WbemsmtException {
		HostSystem hostedSystem = (HostSystem) value;
		return hostedSystem.getFco().getCimObjectPath();
	}
	
	protected Object getFco(Object value) {
		HostSystem hostedSystem = (HostSystem) value;
		return hostedSystem.getFco();
	}

	/**
	 * return the HostSysten which is the hostsystem for the given type 
	 * @param typeOfHostedSystem
	 * @return
	 * @throws WbemsmtException
	 */
	public HostSystem getHostedSystemByType(String typeOfHostedSystem) throws WbemsmtException {
		
	    List<Object> list = getList();
	    for (Iterator<Object> iterator = list.iterator(); iterator.hasNext();) {
            HostSystem host = (HostSystem) iterator.next();
            if (host.getVirtualSystemType().equals(typeOfHostedSystem))
            {
                return host;
            }
        }
	    return null;
	}

	public HostSystem getHostedSystem(int i) throws WbemsmtException {
		return (HostSystem) getList().get(i);
	}

	public void clear() throws WbemsmtException {
		super.clear();
	}

    public String[] getVirtualSystemTypeArray() throws WbemsmtException {
        List<Object> list2 = getList();
        
        String[] result = new String[list2.size()]; 
        int i=0;
        for (Iterator<Object> iterator = list2.iterator(); iterator.hasNext();) {
            HostSystem host = (HostSystem) iterator.next();
            result[i++] = host.getVirtualSystemType();
        }
        return result;
    }
	
}
