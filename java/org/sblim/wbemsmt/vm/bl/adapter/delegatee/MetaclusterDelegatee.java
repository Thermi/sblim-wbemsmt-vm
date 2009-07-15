 /** 
  * MetaclusterDelegatee.java
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
  * Description: Base class for all MetaclusterDelegatee
  * 
  */
package org.sblim.wbemsmt.vm.bl.adapter.delegatee;

import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;


public class MetaclusterDelegatee {

	protected final VMCimAdapter adapter;

	protected MetaclusterDelegatee(VMCimAdapter adapter) {
		this.adapter = adapter;
	}
}
