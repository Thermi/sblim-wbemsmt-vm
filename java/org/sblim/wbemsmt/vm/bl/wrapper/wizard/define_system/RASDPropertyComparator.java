 /** 
  * RASDPropertyComparator.java
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
  * Description: Comparator for RASD Properties. Comparing by using the order
  * 
  */
package org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system;

import java.util.Comparator;

public class RASDPropertyComparator implements Comparator<RASDProperty> {

    /* (non-Javadoc)
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    public int compare(RASDProperty arg0, RASDProperty arg1) {
        RASDProperty p0 = arg0;
        RASDProperty p1 = arg1;
        return p0.getOrder() - p1.getOrder();
    }

}
