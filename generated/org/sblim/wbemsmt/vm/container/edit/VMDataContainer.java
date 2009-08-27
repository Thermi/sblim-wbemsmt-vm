/**
 * VMDataContainer.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF
 * THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.vm.container.edit;

public interface VMDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String FIELD_VMID = "VmID";
    public static final String FIELD_VMNAME = "VmName";
    public static final String FIELD_ENABLEDSTATE = "EnabledState";
    public static final String FIELD_REQUESTEDSTATE = "RequestedState";
    public static final String FIELD_INFO = "Info";

    /** 
     * Defined Fields
     **/

    /**
     * <br>
     * DataType STRING<br>
     * UIType LABEL<br>
     * Relation to FCO: Metacluster_ComputerSystem.get_ContainerID<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_VmID();

    /**
     * <br>
     * DataType STRING<br>
     * UIType LABEL<br>
     * Relation to FCO: Metacluster_ComputerSystem.get_ContainerName<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_VmName();

    /**
     * <br>
     * DataType STRING<br>
     * UIType LABEL<br>
     * Relation to FCO: CIM_ComputerSystem.get_EnabledState<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_EnabledState();

    /**
     * <br>
     * DataType STRING<br>
     * UIType LABEL<br>
     * Relation to FCO: CIM_ComputerSystem.get_RequestedState<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_RequestedState();

    /**
     * <br>
     * DataType STRING<br>
     * UIType LABEL<br>
     * Relation to FCO: CIM_ComputerSystem.Caption<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Info();

    /** 
     * Linked DataContainers
     **/

}