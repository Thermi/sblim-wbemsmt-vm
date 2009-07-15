/** 
 * VMCimAdapterCreateIf.java
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
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceCreate.vm
 *
 * Contributors: 
 *   Prashanth Karnam <prkarnam@in.ibm.com>
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

/** 
 * This is the interface containing only the Create-Methods for the delegate
 **/

public interface VMCimAdapterCreateIf extends CreateDelegatee {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages", "messagesVm" };

    /** 
     * Create-Methods
     **/
    public void createImpl(
            org.sblim.wbemsmt.vm.container.wizard.ChangeVMSettingsSummaryDataContainer container)
            throws WbemsmtException;

    public void createImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerSummary container)
            throws WbemsmtException;

    public void createImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMSummaryDataContainer container)
            throws WbemsmtException;

    public void createImpl(
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer container)
            throws WbemsmtException;

}