/** 
 * VMCimAdapterCountIf.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceCount.vm
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
 * This is the interface containing only the Count-Methods for the delegate
 **/

public interface VMCimAdapterCountIf extends CountDelegatee {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages", "messagesVm" };

    /** 
     * Count-Methods
     **/
    public int countImpl_Items(Class childClass,
            org.sblim.wbemsmt.vm.container.edit.VMConfigDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Items(Class childClass,
            org.sblim.wbemsmt.vm.container.edit.DiskHostInfoDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Items(Class childClass,
            org.sblim.wbemsmt.vm.container.edit.DiskVMInfoDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Items(Class childClass,
            org.sblim.wbemsmt.vm.container.edit.HostSystemInfoDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Items(Class childClass,
            org.sblim.wbemsmt.vm.container.edit.MemoryHostInfoDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Items(Class childClass,
            org.sblim.wbemsmt.vm.container.edit.MemoryVMInfoDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Items(Class childClass,
            org.sblim.wbemsmt.vm.container.edit.NetworkHostInfoDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Items(Class childClass,
            org.sblim.wbemsmt.vm.container.edit.NetworkVMInfoDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Items(Class childClass,
            org.sblim.wbemsmt.vm.container.edit.PossibleOperationsDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Items(Class childClass,
            org.sblim.wbemsmt.vm.container.edit.ProcessorHostInfoDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Items(Class childClass,
            org.sblim.wbemsmt.vm.container.edit.ProcessorVMInfoDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Items(Class childClass,
            org.sblim.wbemsmt.vm.container.edit.VMOverviewDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Items(Class childClass,
            org.sblim.wbemsmt.vm.container.edit.WelcomeDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Items(Class childClass,
            org.sblim.wbemsmt.vm.container.wizard.VMConfigDataContainer parent)
            throws WbemsmtException;

    public int countImpl_ConfigValues(Class childClass,
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Disks(Class childClass,
            org.sblim.wbemsmt.vm.container.wizard.DiskDataContainer parent) throws WbemsmtException;

    public int countImpl_Networks(Class childClass,
            org.sblim.wbemsmt.vm.container.wizard.NetworkDataContainer parent)
            throws WbemsmtException;

    public int countImpl_ConfigItems(Class childClass,
            org.sblim.wbemsmt.vm.container.wizard.ChangeVMSettingsSummaryDataContainer parent)
            throws WbemsmtException;

    public int countImpl_ConfigItems(Class childClass,
            org.sblim.wbemsmt.vm.container.wizard.CreateVMSummaryDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Disks(Class childClass,
            org.sblim.wbemsmt.vm.container.wizard.ChangeVMSettingsSummaryDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Disks(Class childClass,
            org.sblim.wbemsmt.vm.container.wizard.CreateVMSummaryDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Networks(Class childClass,
            org.sblim.wbemsmt.vm.container.wizard.ChangeVMSettingsSummaryDataContainer parent)
            throws WbemsmtException;

    public int countImpl_Networks(Class childClass,
            org.sblim.wbemsmt.vm.container.wizard.CreateVMSummaryDataContainer parent)
            throws WbemsmtException;

}