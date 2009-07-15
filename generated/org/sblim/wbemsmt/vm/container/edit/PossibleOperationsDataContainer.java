/** 
 * PossibleOperationsDataContainer.java
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

public interface PossibleOperationsDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String ROLE_ITEMS = "items";

    /** 
     * Defined Fields
     **/

    /** 
     * Linked DataContainers
     **/

    /**
     * 
     * linked container PossibleOperationsItemDataContainer
     */

    public java.util.List getItems();

    /**
     * Header for:
     * 
     * linked container PossibleOperationsItemDataContainer
     */
    public org.sblim.wbemsmt.vm.container.edit.PossibleOperationsItemDataContainerHeader getItemsHeader();

}