 /** 
  * MetaclusterWizard.java
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
  * Description: Wrapper for Wrapper Object for Samba Wizards
  * 
  */


package org.sblim.wbemsmt.vm.bl.wrapper.wizard;

import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;
import org.sblim.wbemsmt.vm.bl.wrapper.objects.VMBusinessObject;

public class VMBaseWizard extends VMBusinessObject {

	protected final VMCimAdapter adapter;

	public VMBaseWizard(VMCimAdapter adapter) {
		super(adapter);
		this.adapter = adapter;
	}

	public void loadChilds(WBEMClient cimClient) throws WbemsmtException {
		//do nothing per defautl - wizards have no childs
	}

	public CimObjectKey getCimObjectKey() {
		return null;
	}

}
