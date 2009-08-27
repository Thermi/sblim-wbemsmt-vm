 /** 
  * Memory.java
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
  * Description: Business value object for a VM's memory
  * 
  */

package org.sblim.wbemsmt.vm.bl.wrapper.objects.vm;

import org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ResourceAllocationSettingData;

public class Memory {

    private String min,max,defaultValue,current;

    /**
     * Holds the RASD, to be used during creation
     */
    private CIM_ResourceAllocationSettingData rasd;    
    
    
    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }
    
    public CIM_ResourceAllocationSettingData getRasd() {
        return rasd;
    }

    public void setRasd(CIM_ResourceAllocationSettingData rasdClassname) {
        this.rasd = rasdClassname;
    }
        
    
}
