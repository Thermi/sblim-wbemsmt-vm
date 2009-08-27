 /** 
  * Disk.java
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
  * Description: represents a disk for define system
  * 
  */
package org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system;

import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ResourceAllocationSettingData;

public class Disk implements RASDContainer {

    /**
     * Holds RASD, to be used during creation
     */
    private CIM_ResourceAllocationSettingData rasd;
    private boolean deleted;
    private boolean added;
    
    public CIM_ResourceAllocationSettingData getRasd() {
        return rasd;
    }

    public void setRasd(CIM_ResourceAllocationSettingData rasd) {
        this.rasd = rasd;
    }


    public boolean isAdded() {
        return added;
    }

    public void setAdded(boolean added) {
        this.added = added;
        this.deleted = false;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
        this.added = false;
    }
    
    
}
