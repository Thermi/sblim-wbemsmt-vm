/** 
 * WelcomeDataContainer.java
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
 * linked container WelcomeItemDataContainer
 */

package org.sblim.wbemsmt.vm.container.edit;

public interface WelcomeItemDataContainerHeader {
    /**
     * Header for
     * <br>
     * DataType STRING<br>
     * UIType LABEL<br>
     * Relation to FCO: <br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_VMName();

    /**
     * Header for
     * <br>
     * DataType MEMODATA<br>
     * UIType MEMO<br>
     * Relation to FCO: <br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Info();
}