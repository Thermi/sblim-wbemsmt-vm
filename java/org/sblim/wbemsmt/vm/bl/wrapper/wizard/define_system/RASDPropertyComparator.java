 /** 
  * RASDPropertyComparator.java
  *
  * © Copyright IBM Corp. 2008
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
  * Description: Comparator for RASD Properties. Comparing by using the order
  * 
  */
package org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system;

import java.util.Comparator;

public class RASDPropertyComparator implements Comparator {

    /* (non-Javadoc)
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    public int compare(Object arg0, Object arg1) {
        RASDProperty p0 = (RASDProperty) arg0;
        RASDProperty p1 = (RASDProperty) arg1;
        return p0.getOrder() - p1.getOrder();
    }

}
