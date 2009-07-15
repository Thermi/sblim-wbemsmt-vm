 /** 
  * LookupServerTask.java
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
  * Description: Class for looking up a metacluster server instrumentation
  * 
  */
package org.sblim.wbemsmt.vm.lookup;

import java.util.logging.Logger;

import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.lookup.Lookup;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;

public class LookupServerTask implements Lookup {

	static Logger logger = Logger.getLogger(LookupServerTask.class.getName()); 
	
	public boolean lookup(WBEMClient cimClient,String namespace) throws WbemsmtException {

		VMCimAdapter.getVirtualSystemProfile(cimClient,namespace);
        VMCimAdapter.getSystemVirtualizationProfiles(cimClient,namespace);
        return true;
		
	}

}
