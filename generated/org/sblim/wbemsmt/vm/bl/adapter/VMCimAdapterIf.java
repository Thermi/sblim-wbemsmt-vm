/** 
 * VMCimAdapterIf.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterface.vm
 *
 * Contributors: 
 *   Prashanth Karnam <prkarnam@in.ibm.com>
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.bl.adapter;

/** 
 * This is the interface containing all Methods
 **/

public interface VMCimAdapterIf extends VMCimAdapterCountIf, VMCimAdapterCreateIf,
        VMCimAdapterDeleteIf, VMCimAdapterInstallValidatorsIf, VMCimAdapterSaveIf,
        VMCimAdapterRevertIf, VMCimAdapterUpdateControlsIf, VMCimAdapterUpdateModelIf,
        VMCimAdapterInitWizardIf, VMCimAdapterInitContainerIf {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages", "messagesVm" };

}