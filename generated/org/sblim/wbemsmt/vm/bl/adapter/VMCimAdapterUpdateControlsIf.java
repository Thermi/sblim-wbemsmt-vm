/**
 * VMCimAdapterUpdateControlsIf.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER
 * THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF
 * THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of
 * the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceUpdateControls.vm Contributors:
 *            Prashanth Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.vm.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

/*
 * * This is the interface containing only the UpdateControls-Methods for the delegate
 */

public interface VMCimAdapterUpdateControlsIf extends UpdateControlsDelegatee {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages", "messagesVm" };

    /** 
     * UpdateControls-Methods
     **/
    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.ChangeVMSettingsSummaryDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.ConfigItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.ConfigItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage1 container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2a container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2b container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2c container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage3 container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerSummary container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMPage1DataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMPage2DataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMPage3DataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.CreateVMSummaryDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryConfigItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(org.sblim.wbemsmt.vm.container.wizard.DiskDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.DiskHostInfoDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.DiskHostInfoItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.DiskItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.DiskVMInfoDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.DiskVMInfoItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.HostSystemInfoDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.HostSystemInfoItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.MemoryDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.MemoryHostInfoDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.MemoryHostInfoItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.MemoryVMInfoDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.MemoryVMInfoItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.NetworkDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.NetworkHostInfoDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.NetworkHostInfoItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.NetworkItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.NetworkVMInfoDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.NetworkVMInfoItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.PossibleOperationsDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.PossibleOperationsItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.ProcessorDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.ProcessorHostInfoDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.ProcessorHostInfoItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.ProcessorVMInfoDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.ProcessorVMInfoItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.SummaryConfigItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.SummaryDiskItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.SummaryNetworkItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.VMConfigDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.VMConfigDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(org.sblim.wbemsmt.vm.container.edit.VMDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.VMOperationsDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.VMOverviewDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.VMOverviewItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.WelcomeDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.WelcomeItemDataContainer container)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.ConfigItemDataContainer container,
            java.lang.String fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.DiskHostInfoItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.objects.host.Disk fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.DiskVMInfoItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.objects.vm.Disk fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.HostSystemInfoItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.objects.VM fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.MemoryHostInfoItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.objects.host.Memory fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.MemoryVMInfoItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.objects.vm.Memory fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.NetworkHostInfoItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.objects.host.Network fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.NetworkVMInfoItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.objects.vm.Network fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.PossibleOperationsItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.objects.host.PossibleOperation fco)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.ProcessorHostInfoItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.objects.host.Processor fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.ProcessorVMInfoItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.objects.vm.Processor fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.VMOverviewItemDataContainer container,
            org.sblim.wbemsmt.vm.schema.cim_2_17.CIM_ComputerSystem fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.edit.WelcomeItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.objects.VM fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.ConfigItemDataContainer container,
            java.lang.String fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryConfigItemDataContainer container,
            java.lang.String fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.DiskItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.Disk fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.NetworkItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.Network fco)
            throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.SummaryConfigItemDataContainer container,
            java.lang.String fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.SummaryDiskItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.Disk fco) throws WbemsmtException;

    public void updateControlsImpl(
            org.sblim.wbemsmt.vm.container.wizard.SummaryNetworkItemDataContainer container,
            org.sblim.wbemsmt.vm.bl.wrapper.wizard.define_system.Network fco)
            throws WbemsmtException;
}