/**
 * DiskItemDataContainer.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER
 * MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.vm.container.wizard;

public interface DiskItemDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String FIELD_USR_FIELD1 = "usr_Field1";
    public static final String FIELD_USR_FIELD2 = "usr_Field2";
    public static final String FIELD_USR_FIELD3 = "usr_Field3";
    public static final String FIELD_USR_FIELD4 = "usr_Field4";
    public static final String FIELD_USR_REMOVE = "usr_Remove";

    /** 
     * Defined Fields
     **/

    /**
     * <br>
     * DataType GENERICFIELDDATA<br>
     * UIType GENERIC<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Field1();

    /**
     * <br>
     * DataType GENERICFIELDDATA<br>
     * UIType GENERIC<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Field2();

    /**
     * <br>
     * DataType GENERICFIELDDATA<br>
     * UIType GENERIC<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Field3();

    /**
     * <br>
     * DataType GENERICFIELDDATA<br>
     * UIType GENERIC<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Field4();

    /**
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Remove();

    /** 
     * Linked DataContainers
     **/

}