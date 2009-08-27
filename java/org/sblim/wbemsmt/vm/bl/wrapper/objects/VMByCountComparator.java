 /** 
  * VMByCountComparator.java
  *
  * © Copyright IBM Corp.  2009,2008
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
  * Description: Comparator for VMs to compore by the counter of a VM
  * 
  */
package org.sblim.wbemsmt.vm.bl.wrapper.objects;

import java.util.Comparator;

public class VMByCountComparator implements Comparator<Object> {

    /* (non-Javadoc)
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    public int compare(Object arg0, Object arg1) {
        VM vm0 = (VM) arg0;
        VM vm1 = (VM) arg1;
        return vm0.getCount() - vm1.getCount();
    }

}
