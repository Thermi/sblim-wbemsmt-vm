/** 
 * VMCimAdapterUpdateModelIf.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceUpdateModel.vm
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
 * This is the interface containing only the updateModel-Methods for the delegate
 **/

public interface VMCimAdapterUpdateModelIf extends UpdateModelDelegatee {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages", "messagesVm" };

    /** 
     * UpdateModel-Methods
     **/
    public void updateModelImpl(
            org.sblim.wbemsmt.vm.container.wizard.ConfigItemDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage1 container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2a container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2b container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2c container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage3 container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMPage1DataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMPage2DataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMPage3DataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(org.sblim.wbemsmt.vm.container.wizard.DiskDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.vm.container.wizard.DiskItemDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(org.sblim.wbemsmt.vm.container.wizard.MemoryDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(org.sblim.wbemsmt.vm.container.wizard.NetworkDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.vm.container.wizard.NetworkItemDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.vm.container.wizard.ProcessorDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.vm.container.wizard.VMConfigDataContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.vm.container.edit.VMOperationsDataContainer container)
            throws WbemsmtException;

}