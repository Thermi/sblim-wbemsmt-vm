/** 
 * NetworkVMInfoDataContainer.java
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
 * linked container NetworkVMInfoItemDataContainer
 */

package org.sblim.wbemsmt.vm.container.edit;

public interface NetworkVMInfoItemDataContainerHeader {
    /**
     * Header for
     * <br>
     * DataType STRING<br>
     * UIType LABEL<br>
     * Relation to FCO: CIM_ResourceAllocationSettingData.Address<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_Address();

    /**
     * Header for
     * <br>
     * DataType STRING<br>
     * UIType LABEL<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Info();
}