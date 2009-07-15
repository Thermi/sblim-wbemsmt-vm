/** 
 * DiskVMInfoItemDataContainer.java
 *
 * 
 * 
 * © Copyright IBM Corp. 2008, 
 * 
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE 
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE 
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. 
 * 
 * You can obtain a current copy of the Eclipse Public License from 
 * http://www.opensource.org/licenses/eclipse-1.0.php 
 
 *
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm
 *
 * Contributors: 
 *   Prashanth Karnam <prkarnam@in.ibm.com>
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.container.edit;

public interface DiskVMInfoItemDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String FIELD_INSTANCEID = "InstanceID";
    public static final String FIELD_ADDRESS = "Address";
    public static final String FIELD_USR_INFO = "usr_Info";

    /** 
     * Defined Fields
     **/

    /**
     * <br>
     * DataType STRING<br>
     * UIType LABEL<br>
     * Relation to FCO: CIM_ResourceAllocationSettingData.InstanceID<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_InstanceID();

    /**
     * <br>
     * DataType STRING<br>
     * UIType LABEL<br>
     * Relation to FCO: CIM_ResourceAllocationSettingData.Address<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Address();

    /**
     * <br>
     * DataType STRING<br>
     * UIType LABEL<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Info();

    /** 
     * Linked DataContainers
     **/

}