/**
 * CreateMigrationContainerPage2b.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER
 * THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF
 * THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of
 * the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.vm.container.wizard;

public interface CreateMigrationContainerPage2b extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String FIELD_USR_MIGRATIONTARGETHOSTNAME = "usr_MigrationTargetHostname";
    public static final String FIELD_USR_MIGRATIONTARGETPORT = "usr_MigrationTargetPort";
    public static final String FIELD_USR_MIGRATIONTARGETNAMESPACE = "usr_MigrationTargetNamespace";
    public static final String FIELD_USR_MIGRATIONTARGETUSER = "usr_MigrationTargetUser";
    public static final String FIELD_USR_MIGRATIONTARGETPASSWORD = "usr_MigrationTargetPassword";

    /** 
     * Defined Fields
     **/

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_MigrationTargetHostname();

    /**
     * <br>
     * DataType UNSIGNED_INT16<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_MigrationTargetPort();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_MigrationTargetNamespace();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_MigrationTargetUser();

    /**
     * <br>
     * DataType STRING<br>
     * UIType PASSWORD<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_MigrationTargetPassword();

    /** 
     * Linked DataContainers
     **/

}