 /** 
  * RASDProperty.java
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
  * Description: Wrapper for a RASD Property
  * 
  */
package org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system;

public class RASDProperty {

    private final String fieldname;
    private final boolean readOnly;
    private final int order;

    public RASDProperty(String fieldname, boolean readOnly, int order) {
        this.fieldname = fieldname;
        this.readOnly = readOnly;
        this.order = order;
    }

    public String getFieldname() {
        return fieldname;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public int getOrder() {
        return order;
    }
    
    

}
