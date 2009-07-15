 /** 
  * PossibleOperationComparator.java
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
  * Description: Comparator for possible operations
  * 
  */
package org.sblim.wbemsmt.vm.bl.wrapper.objects.host;

import java.util.Comparator;

public class PossibleOperationComparator implements Comparator {

    /* (non-Javadoc)
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    public int compare(Object arg0, Object arg1) {
        PossibleOperation op0 = (PossibleOperation) arg0;
        PossibleOperation op1 = (PossibleOperation) arg1;
        return op0.getName().compareTo(op1.getName());
    }

}
