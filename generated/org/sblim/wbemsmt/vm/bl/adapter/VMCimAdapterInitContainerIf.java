/** 
 * VMCimAdapterInitContainerIf.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceInitContainer.vm
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
 * This is the interface containing only the UpdateControls-Methods for the delegate
 **/

public interface VMCimAdapterInitContainerIf extends InitContainerDelegatee {

    /** 
     * InitContainer-Methods
     **/
    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.ChangeVMSettingsSummaryDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.ConfigItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.ConfigItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage1 container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2a container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2b container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2c container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage3 container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerSummary container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMPage1DataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMPage2DataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMPage3DataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMSummaryDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryConfigItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(org.sblim.wbemsmt.vm.container.wizard.DiskDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.DiskHostInfoDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.DiskHostInfoItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.DiskItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.DiskVMInfoDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.DiskVMInfoItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.HostSystemInfoDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.HostSystemInfoItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.MemoryDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.MemoryHostInfoDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.MemoryHostInfoItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.MemoryVMInfoDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.MemoryVMInfoItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.NetworkDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.NetworkHostInfoDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.NetworkHostInfoItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.NetworkItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.NetworkVMInfoDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.NetworkVMInfoItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.PossibleOperationsDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.PossibleOperationsItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.ProcessorDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.ProcessorHostInfoDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.ProcessorHostInfoItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.ProcessorVMInfoDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.ProcessorVMInfoItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.SummaryConfigItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.SummaryDiskItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.SummaryNetworkItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.VMConfigDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.wizard.VMConfigDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(org.sblim.wbemsmt.vm.container.edit.VMDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.VMOperationsDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.VMOverviewDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.VMOverviewItemDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(org.sblim.wbemsmt.vm.container.edit.WelcomeDataContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.vm.container.edit.WelcomeItemDataContainer container)
            throws WbemsmtException;
}