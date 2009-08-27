 /** 
  * Network.java
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
  * Description: Business value object for a vm's networks
  * 
  */

package org.sblim.wbemsmt.vm.bl.wrapper.objects.vm;

import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ResourceAllocationSettingData;

public class Network {
    
    private String address, poolCaption, poolId;
    /**
     * Holds the RASD, to be used during creation
     */
    private CIM_ResourceAllocationSettingData rasd;
    
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

    public void setRasd(CIM_ResourceAllocationSettingData rasd) {
        this.rasd = rasd;
    }

    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolid) {
        this.poolId = poolid;
    }
    
    
    
}
