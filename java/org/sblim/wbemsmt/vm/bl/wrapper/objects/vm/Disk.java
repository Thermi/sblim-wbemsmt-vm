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
  * Description: Business value object for a vm's disk
  * 
  */


package org.sblim.wbemsmt.vm.bl.wrapper.objects.vm;

import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ResourceAllocationSettingData;

public class Disk {

    private String instanceid, address, poolCaption, poolId;

    /**
     * Holds the RASD, to be used during creation
     */
    private CIM_ResourceAllocationSettingData rasd;    
    
    public String getInstanceid() {
        return instanceid;
    }

    public void setInstanceid(String instanceid) {
        this.instanceid = instanceid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Contains the referenced pool
     * @return
     */
    public String getPoolCaption() {
        return poolCaption;
    }

    public void setPoolCaption(String info) {
        this.poolCaption = info;
    }

    public CIM_ResourceAllocationSettingData getRasd() {
        return rasd;
    }

    public void setRasd(CIM_ResourceAllocationSettingData rasdClassname) {
        this.rasd = rasdClassname;
    }
    
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolid) {
        this.poolId = poolid;
    }    
    
    
    
}
