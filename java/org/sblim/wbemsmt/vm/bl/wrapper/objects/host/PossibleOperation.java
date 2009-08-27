 /** 
  * PossibleOperations.java
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
  * Description: Business value object for Possible operations
  * 
  */
package org.sblim.wbemsmt.vm.bl.wrapper.objects.host;

public class PossibleOperation {

    private String name;
    private String support;
    private int idx;
    
    public String getName() {
        return name;
    }
    public String getSupport() {
        return support;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSupport(String support) {
        this.support = support;
    }
    public int getIdx() {
        return idx;
    }
    public void setIdx(int idx) {
        this.idx = idx;
    }
    
    
    
    
    
}
