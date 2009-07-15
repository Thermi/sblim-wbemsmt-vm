 /** 
  * Disk.java
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
  * Description: Business value object for a host's disk
  * 
  */

package org.sblim.wbemsmt.vm.bl.wrapper.objects.host;

public class Disk {

    private String pool,  disk;

    public String getPool() {
        return pool;
    }

    public void setPool(String instanceid) {
        this.pool = instanceid;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String info) {
        this.disk = info;
    }
    
    
    
    
    
}
