/** 
 * DiskDataContainer.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/headerClass.vm
 *
 * Contributors: 
 *   Prashanth Karnam <prkarnam@in.ibm.com>
 * 
 * Description: 
 * 
 * Header for:
 * 
 * linked container DiskItemDataContainer
 */

package org.sblim.wbemsmt.vm.container.wizard;

public interface DiskItemDataContainerHeader {
    /**
     * Header for
     * <br>
     * DataType GENERICFIELDDATA<br>
     * UIType GENERIC<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field1();

    /**
     * Header for
     * <br>
     * DataType GENERICFIELDDATA<br>
     * UIType GENERIC<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field2();

    /**
     * Header for
     * <br>
     * DataType GENERICFIELDDATA<br>
     * UIType GENERIC<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field3();

    /**
     * Header for
     * <br>
     * DataType GENERICFIELDDATA<br>
     * UIType GENERIC<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field4();

    /**
     * Header for
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Remove();
}