/**
 * CIM_VirtualSystemManagementCapabilities.java Â© Copyright IBM Corp. 2006,2007 THIS FILE IS
 * PROVIDED UNDER THE TER MS OF THE COMMON PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR
 * DISTRIBUTION OF THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a
 * current copy of the Common Public License from http://www.opensource.org/licenses/cpl1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Capabilities of a
 *            CIM_VirtualSystemManagementService. generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_VirtualSystemManagementCapabilities extends CIM_EnabledLogicalElementCapabilities {

    public final static String CIM_CLASS_NAME = "CIM_VirtualSystemManagementCapabilities";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property AsynchronousMethodsSupported
     * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemManagementService that is supported asynchronously by the implementation.
     */
    public static class PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED {
        /**
         * name of the property AsynchronousMethodsSupported
         */
        public final static String NAME = "AsynchronousMethodsSupported";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_AddResourcesSupported = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry AddResourcesSupported (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_AddResourcesSupported = "AddResourcesSupported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DefineSystemSupported = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry DefineSystemSupported (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_DefineSystemSupported = "DefineSystemSupported";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySystemSupported = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry DestroySystemSupported (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_DestroySystemSupported = "DestroySystemSupported";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DestroySystemConfigurationSupported = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry DestroySystemConfigurationSupported (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_DestroySystemConfigurationSupported = "DestroySystemConfigurationSupported";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_ModifyResourceSettingsSupported = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry ModifyResourceSettingsSupported (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_ModifyResourceSettingsSupported = "ModifyResourceSettingsSupported";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_ModifySystemSettingsSupported = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry ModifySystemSettingsSupported (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_ModifySystemSettingsSupported = "ModifySystemSettingsSupported";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_RemoveResourcesSupported = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry RemoveResourcesSupported (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_RemoveResourcesSupported = "RemoveResourcesSupported";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SelectSystemConfigurationSupported = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry SelectSystemConfigurationSupported (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_SelectSystemConfigurationSupported = "SelectSystemConfigurationSupported";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SnapshotSystemSupported = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry SnapshotSystemSupported (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_SnapshotSystemSupported = "SnapshotSystemSupported";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_AddResourcesSupported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_AddResourcesSupported;
            }

            if (VALUE_ENTRY_DefineSystemSupported.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DefineSystemSupported;
            }

            if (VALUE_ENTRY_DestroySystemSupported.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySystemSupported;
            }

            if (VALUE_ENTRY_DestroySystemConfigurationSupported.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DestroySystemConfigurationSupported;
            }

            if (VALUE_ENTRY_ModifyResourceSettingsSupported.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_ModifyResourceSettingsSupported;
            }

            if (VALUE_ENTRY_ModifySystemSettingsSupported.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_ModifySystemSettingsSupported;
            }

            if (VALUE_ENTRY_RemoveResourcesSupported.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_RemoveResourcesSupported;
            }

            if (VALUE_ENTRY_SelectSystemConfigurationSupported.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SelectSystemConfigurationSupported;
            }

            if (VALUE_ENTRY_SnapshotSystemSupported.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SnapshotSystemSupported;
            }
            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(
                Number indexInPulldown) {
            return getValueMapEntry(VALUE_ENTRIES_FOR_DISPLAY[indexInPulldown.intValue()]);
        }

        /**
         * gets the value for the given valueMap entry (currentValue) and gives back the index of this value within the VALUE_ENTRIES_FOR_DISPLAY array
         *
         * can be used to set the correct selection index for a pulldown field
         *
         * @return -1 if for the currentValue no value within VALUE_ENTRIES_FOR_DISPLAY was found
         * @param currentValue the currentValue to get the index for
         */
        public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue) {
            String valueEntry = getValueEntry(currentValue);
            if (valueEntry != null) {
                for (int i = 0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++) {
                    if (VALUE_ENTRIES_FOR_DISPLAY[i].equals(valueEntry)) {
                        return i;
                    }
                }
            }
            return -1;

        }

        /**
         * get the ValueEntry of the given valueMapEntry
         * @param valueMapEntry the entry within the valueMap to find the ValueEntry for
         * @return the Value entry or null if not found
         */

        public static String getValueEntry(javax.cim.UnsignedInteger16 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_AddResourcesSupported.intValue()) {
                return VALUE_ENTRY_AddResourcesSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DefineSystemSupported.intValue()) {
                return VALUE_ENTRY_DefineSystemSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySystemSupported.intValue()) {
                return VALUE_ENTRY_DestroySystemSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DestroySystemConfigurationSupported
                    .intValue()) {
                return VALUE_ENTRY_DestroySystemConfigurationSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_ModifyResourceSettingsSupported
                    .intValue()) {
                return VALUE_ENTRY_ModifyResourceSettingsSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_ModifySystemSettingsSupported
                    .intValue()) {
                return VALUE_ENTRY_ModifySystemSettingsSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_RemoveResourcesSupported.intValue()) {
                return VALUE_ENTRY_RemoveResourcesSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SelectSystemConfigurationSupported
                    .intValue()) {
                return VALUE_ENTRY_SelectSystemConfigurationSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SnapshotSystemSupported.intValue()) {
                return VALUE_ENTRY_SnapshotSystemSupported;
            }
            return null;

        }

        /**
         * get the ValueEntries of the given valueMapEntries
         * @param values the values to find the ValueMapEntries for
         * @return the array with ValueMap entries. Some of them may be null to if no valueMap entry was found
         */

        public static javax.cim.UnsignedInteger16[] getValueMapEntries(String[] values) {
            javax.cim.UnsignedInteger16[] result = new javax.cim.UnsignedInteger16[values.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = getValueMapEntry(values[i]);
            }

            return result;
        }

        /**
         * get the ValueMapEntries of the given valueEntries
         * @param valueMapEntries the valueMap entries to find the Values for
         * @return the array with Value entries. Some of them may be null to if no value entry was found
         */

        public static String[] getValueEntries(javax.cim.UnsignedInteger16[] values) {
            String[] result = new String[values.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = getValueEntry(values[i]);
            }

            return result;
        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property AsynchronousMethodsSupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_AddResourcesSupported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DefineSystemSupported,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySystemSupported,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DestroySystemConfigurationSupported,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_ModifyResourceSettingsSupported,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_ModifySystemSettingsSupported,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_RemoveResourcesSupported,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SelectSystemConfigurationSupported,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SnapshotSystemSupported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property AsynchronousMethodsSupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_AddResourcesSupported,
                VALUE_ENTRY_DefineSystemSupported, VALUE_ENTRY_DestroySystemSupported,
                VALUE_ENTRY_DestroySystemConfigurationSupported,
                VALUE_ENTRY_ModifyResourceSettingsSupported,
                VALUE_ENTRY_ModifySystemSettingsSupported, VALUE_ENTRY_RemoveResourcesSupported,
                VALUE_ENTRY_SelectSystemConfigurationSupported, VALUE_ENTRY_SnapshotSystemSupported };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property AsynchronousMethodsSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_AddResourcesSupported, VALUE_ENTRY_DefineSystemSupported,
                VALUE_ENTRY_DestroySystemSupported,
                VALUE_ENTRY_DestroySystemConfigurationSupported,
                VALUE_ENTRY_ModifyResourceSettingsSupported,
                VALUE_ENTRY_ModifySystemSettingsSupported, VALUE_ENTRY_RemoveResourcesSupported,
                VALUE_ENTRY_SelectSystemConfigurationSupported, VALUE_ENTRY_SnapshotSystemSupported };

    }

    /**
     * Constants of property IndicationsSupported
     * Enumeration of indication identifiers each identifying an indication that is supported by the implementation.
     * VirtualSystemStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of CIM_ComputerSystem instances representing virtual systems.
     * VirtualResourceStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of CIM_LogicalDevice instances representing resources of virtual systems.
     * ConcreteJobStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of CIM_ConcreteJob instances.
     */
    public static class PROPERTY_INDICATIONSSUPPORTED {
        /**
         * name of the property IndicationsSupported
         */
        public final static String NAME = "IndicationsSupported";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_VirtualSystemStateChangeIndicationsSupported = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry VirtualSystemStateChangeIndicationsSupported (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_VirtualSystemStateChangeIndicationsSupported = "VirtualSystemStateChangeIndicationsSupported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VirtualResourceStateChangeIndicationsSupported = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry VirtualResourceStateChangeIndicationsSupported (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_VirtualResourceStateChangeIndicationsSupported = "VirtualResourceStateChangeIndicationsSupported";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ConcreteJobStateChangeIndicationsSupported = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry ConcreteJobStateChangeIndicationsSupported (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_ConcreteJobStateChangeIndicationsSupported = "ConcreteJobStateChangeIndicationsSupported";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_VirtualSystemStateChangeIndicationsSupported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_VirtualSystemStateChangeIndicationsSupported;
            }

            if (VALUE_ENTRY_VirtualResourceStateChangeIndicationsSupported.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VirtualResourceStateChangeIndicationsSupported;
            }

            if (VALUE_ENTRY_ConcreteJobStateChangeIndicationsSupported.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ConcreteJobStateChangeIndicationsSupported;
            }
            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(
                Number indexInPulldown) {
            return getValueMapEntry(VALUE_ENTRIES_FOR_DISPLAY[indexInPulldown.intValue()]);
        }

        /**
         * gets the value for the given valueMap entry (currentValue) and gives back the index of this value within the VALUE_ENTRIES_FOR_DISPLAY array
         *
         * can be used to set the correct selection index for a pulldown field
         *
         * @return -1 if for the currentValue no value within VALUE_ENTRIES_FOR_DISPLAY was found
         * @param currentValue the currentValue to get the index for
         */
        public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue) {
            String valueEntry = getValueEntry(currentValue);
            if (valueEntry != null) {
                for (int i = 0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++) {
                    if (VALUE_ENTRIES_FOR_DISPLAY[i].equals(valueEntry)) {
                        return i;
                    }
                }
            }
            return -1;

        }

        /**
         * get the ValueEntry of the given valueMapEntry
         * @param valueMapEntry the entry within the valueMap to find the ValueEntry for
         * @return the Value entry or null if not found
         */

        public static String getValueEntry(javax.cim.UnsignedInteger16 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_VirtualSystemStateChangeIndicationsSupported
                    .intValue()) {
                return VALUE_ENTRY_VirtualSystemStateChangeIndicationsSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VirtualResourceStateChangeIndicationsSupported
                    .intValue()) {
                return VALUE_ENTRY_VirtualResourceStateChangeIndicationsSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ConcreteJobStateChangeIndicationsSupported
                    .intValue()) {
                return VALUE_ENTRY_ConcreteJobStateChangeIndicationsSupported;
            }
            return null;

        }

        /**
         * get the ValueEntries of the given valueMapEntries
         * @param values the values to find the ValueMapEntries for
         * @return the array with ValueMap entries. Some of them may be null to if no valueMap entry was found
         */

        public static javax.cim.UnsignedInteger16[] getValueMapEntries(String[] values) {
            javax.cim.UnsignedInteger16[] result = new javax.cim.UnsignedInteger16[values.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = getValueMapEntry(values[i]);
            }

            return result;
        }

        /**
         * get the ValueMapEntries of the given valueEntries
         * @param valueMapEntries the valueMap entries to find the Values for
         * @return the array with Value entries. Some of them may be null to if no value entry was found
         */

        public static String[] getValueEntries(javax.cim.UnsignedInteger16[] values) {
            String[] result = new String[values.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = getValueEntry(values[i]);
            }

            return result;
        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property IndicationsSupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_VirtualSystemStateChangeIndicationsSupported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VirtualResourceStateChangeIndicationsSupported,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ConcreteJobStateChangeIndicationsSupported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property IndicationsSupported   
         */
        public final static String[] VALUE_ENTRIES = {
                VALUE_ENTRY_VirtualSystemStateChangeIndicationsSupported,
                VALUE_ENTRY_VirtualResourceStateChangeIndicationsSupported,
                VALUE_ENTRY_ConcreteJobStateChangeIndicationsSupported };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property IndicationsSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_VirtualSystemStateChangeIndicationsSupported,
                VALUE_ENTRY_VirtualResourceStateChangeIndicationsSupported,
                VALUE_ENTRY_ConcreteJobStateChangeIndicationsSupported };

    }

    /**
     * Constants of property SynchronousMethodsSupported
     * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemManagementService that is supported synchronously by the implementation.
     */
    public static class PROPERTY_SYNCHRONOUSMETHODSSUPPORTED {
        /**
         * name of the property SynchronousMethodsSupported
         */
        public final static String NAME = "SynchronousMethodsSupported";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_AddResourcesSupported = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry AddResourcesSupported (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_AddResourcesSupported = "AddResourcesSupported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DefineSystemSupported = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry DefineSystemSupported (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_DefineSystemSupported = "DefineSystemSupported";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySystemSupported = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry DestroySystemSupported (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_DestroySystemSupported = "DestroySystemSupported";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DestroySystemConfigurationSupported = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry DestroySystemConfigurationSupported (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_DestroySystemConfigurationSupported = "DestroySystemConfigurationSupported";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_ModifyResourceSettingsSupported = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry ModifyResourceSettingsSupported (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_ModifyResourceSettingsSupported = "ModifyResourceSettingsSupported";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_ModifySystemSettingsSupported = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry ModifySystemSettingsSupported (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_ModifySystemSettingsSupported = "ModifySystemSettingsSupported";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_RemoveResourcesSupported = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry RemoveResourcesSupported (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_RemoveResourcesSupported = "RemoveResourcesSupported";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SelectSystemConfigurationSupported = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry SelectSystemConfigurationSupported (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_SelectSystemConfigurationSupported = "SelectSystemConfigurationSupported";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SnapshotSystemSupported = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry SnapshotSystemSupported (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_SnapshotSystemSupported = "SnapshotSystemSupported";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_AddResourcesSupported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_AddResourcesSupported;
            }

            if (VALUE_ENTRY_DefineSystemSupported.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DefineSystemSupported;
            }

            if (VALUE_ENTRY_DestroySystemSupported.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySystemSupported;
            }

            if (VALUE_ENTRY_DestroySystemConfigurationSupported.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DestroySystemConfigurationSupported;
            }

            if (VALUE_ENTRY_ModifyResourceSettingsSupported.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_ModifyResourceSettingsSupported;
            }

            if (VALUE_ENTRY_ModifySystemSettingsSupported.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_ModifySystemSettingsSupported;
            }

            if (VALUE_ENTRY_RemoveResourcesSupported.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_RemoveResourcesSupported;
            }

            if (VALUE_ENTRY_SelectSystemConfigurationSupported.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SelectSystemConfigurationSupported;
            }

            if (VALUE_ENTRY_SnapshotSystemSupported.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SnapshotSystemSupported;
            }
            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(
                Number indexInPulldown) {
            return getValueMapEntry(VALUE_ENTRIES_FOR_DISPLAY[indexInPulldown.intValue()]);
        }

        /**
         * gets the value for the given valueMap entry (currentValue) and gives back the index of this value within the VALUE_ENTRIES_FOR_DISPLAY array
         *
         * can be used to set the correct selection index for a pulldown field
         *
         * @return -1 if for the currentValue no value within VALUE_ENTRIES_FOR_DISPLAY was found
         * @param currentValue the currentValue to get the index for
         */
        public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue) {
            String valueEntry = getValueEntry(currentValue);
            if (valueEntry != null) {
                for (int i = 0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++) {
                    if (VALUE_ENTRIES_FOR_DISPLAY[i].equals(valueEntry)) {
                        return i;
                    }
                }
            }
            return -1;

        }

        /**
         * get the ValueEntry of the given valueMapEntry
         * @param valueMapEntry the entry within the valueMap to find the ValueEntry for
         * @return the Value entry or null if not found
         */

        public static String getValueEntry(javax.cim.UnsignedInteger16 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_AddResourcesSupported.intValue()) {
                return VALUE_ENTRY_AddResourcesSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DefineSystemSupported.intValue()) {
                return VALUE_ENTRY_DefineSystemSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySystemSupported.intValue()) {
                return VALUE_ENTRY_DestroySystemSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DestroySystemConfigurationSupported
                    .intValue()) {
                return VALUE_ENTRY_DestroySystemConfigurationSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_ModifyResourceSettingsSupported
                    .intValue()) {
                return VALUE_ENTRY_ModifyResourceSettingsSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_ModifySystemSettingsSupported
                    .intValue()) {
                return VALUE_ENTRY_ModifySystemSettingsSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_RemoveResourcesSupported.intValue()) {
                return VALUE_ENTRY_RemoveResourcesSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SelectSystemConfigurationSupported
                    .intValue()) {
                return VALUE_ENTRY_SelectSystemConfigurationSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SnapshotSystemSupported.intValue()) {
                return VALUE_ENTRY_SnapshotSystemSupported;
            }
            return null;

        }

        /**
         * get the ValueEntries of the given valueMapEntries
         * @param values the values to find the ValueMapEntries for
         * @return the array with ValueMap entries. Some of them may be null to if no valueMap entry was found
         */

        public static javax.cim.UnsignedInteger16[] getValueMapEntries(String[] values) {
            javax.cim.UnsignedInteger16[] result = new javax.cim.UnsignedInteger16[values.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = getValueMapEntry(values[i]);
            }

            return result;
        }

        /**
         * get the ValueMapEntries of the given valueEntries
         * @param valueMapEntries the valueMap entries to find the Values for
         * @return the array with Value entries. Some of them may be null to if no value entry was found
         */

        public static String[] getValueEntries(javax.cim.UnsignedInteger16[] values) {
            String[] result = new String[values.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = getValueEntry(values[i]);
            }

            return result;
        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property SynchronousMethodsSupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_AddResourcesSupported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DefineSystemSupported,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySystemSupported,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DestroySystemConfigurationSupported,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_ModifyResourceSettingsSupported,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_ModifySystemSettingsSupported,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_RemoveResourcesSupported,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SelectSystemConfigurationSupported,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SnapshotSystemSupported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property SynchronousMethodsSupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_AddResourcesSupported,
                VALUE_ENTRY_DefineSystemSupported, VALUE_ENTRY_DestroySystemSupported,
                VALUE_ENTRY_DestroySystemConfigurationSupported,
                VALUE_ENTRY_ModifyResourceSettingsSupported,
                VALUE_ENTRY_ModifySystemSettingsSupported, VALUE_ENTRY_RemoveResourcesSupported,
                VALUE_ENTRY_SelectSystemConfigurationSupported, VALUE_ENTRY_SnapshotSystemSupported };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property SynchronousMethodsSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_AddResourcesSupported, VALUE_ENTRY_DefineSystemSupported,
                VALUE_ENTRY_DestroySystemSupported,
                VALUE_ENTRY_DestroySystemConfigurationSupported,
                VALUE_ENTRY_ModifyResourceSettingsSupported,
                VALUE_ENTRY_ModifySystemSettingsSupported, VALUE_ENTRY_RemoveResourcesSupported,
                VALUE_ENTRY_SelectSystemConfigurationSupported, VALUE_ENTRY_SnapshotSystemSupported };

    }

    /**
     * Constants of property VirtualSystemTypesSupported
     * Enumeration of strings each designating a type of virtual system that the implementation supports. The types and their string values are implementation dependent.
     */
    public static class PROPERTY_VIRTUALSYSTEMTYPESSUPPORTED {
        /**
         * name of the property VirtualSystemTypesSupported
         */
        public final static String NAME = "VirtualSystemTypesSupported";

    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
        String[] parentClassPackageList = CIM_EnabledLogicalElementCapabilities.getPackages();

        for (int i = 0; i < parentClassPackageList.length; i++) {
            addPackage(parentClassPackageList[i]);
        }

    };

    //**********************************************************************
    // Constructors     
    //**********************************************************************

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Capabilities of a CIM_VirtualSystemManagementService.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_VirtualSystemManagementCapabilities(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Capabilities of a CIM_VirtualSystemManagementService.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_VirtualSystemManagementCapabilities(CIMInstance cimInstance) throws WbemsmtException {

        if (cimInstance == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimInstance parameter does not contain a valid reference.");
        }
        setFromServer(true);
        init(cimInstance, false);
    }

    /**
     * Default constructor
     */
    protected CIM_VirtualSystemManagementCapabilities() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AsynchronousMethodsSupported", new CIMProperty(
                "AsynchronousMethodsSupported", CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("IndicationsSupported", new CIMProperty("IndicationsSupported",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("SynchronousMethodsSupported", new CIMProperty(
                "SynchronousMethodsSupported", CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("VirtualSystemTypesSupported", new CIMProperty(
                "VirtualSystemTypesSupported", CIMDataType.STRING_ARRAY_T, null));

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    /**
     * Get the property AsynchronousMethodsSupported
     *     * <br>
     * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemManagementService that is supported asynchronously by the implementation.
     *     */

    public javax.cim.UnsignedInteger16[] get_AsynchronousMethodsSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property AsynchronousMethodsSupported
     * <br>
     * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemManagementService that is supported asynchronously by the implementation.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AsynchronousMethodsSupported(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_AsynchronousMethodsSupported(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AsynchronousMethodsSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AsynchronousMethodsSupported(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_VirtualSystemManagementCapabilities fco = new CIM_VirtualSystemManagementCapabilities(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_AsynchronousMethodsSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AsynchronousMethodsSupported
     * <br>
     * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemManagementService that is supported asynchronously by the implementation.
     */

    private static CIMProperty setPropertyValue_AsynchronousMethodsSupported(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IndicationsSupported
     *     * <br>
     * Enumeration of indication identifiers each identifying an indication that is supported by the implementation.
     * VirtualSystemStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of CIM_ComputerSystem instances representing virtual systems.
     * VirtualResourceStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of CIM_LogicalDevice instances representing resources of virtual systems.
     * ConcreteJobStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of CIM_ConcreteJob instances.
     *     */

    public javax.cim.UnsignedInteger16[] get_IndicationsSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_INDICATIONSSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INDICATIONSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property IndicationsSupported
     * <br>
     * Enumeration of indication identifiers each identifying an indication that is supported by the implementation.
     * VirtualSystemStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of CIM_ComputerSystem instances representing virtual systems.
     * VirtualResourceStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of CIM_LogicalDevice instances representing resources of virtual systems.
     * ConcreteJobStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of CIM_ConcreteJob instances.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IndicationsSupported(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INDICATIONSSUPPORTED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IndicationsSupported(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INDICATIONSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IndicationsSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IndicationsSupported(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_VirtualSystemManagementCapabilities fco = new CIM_VirtualSystemManagementCapabilities(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INDICATIONSSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_IndicationsSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INDICATIONSSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IndicationsSupported
     * <br>
     * Enumeration of indication identifiers each identifying an indication that is supported by the implementation.
     * VirtualSystemStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of CIM_ComputerSystem instances representing virtual systems.
     * VirtualResourceStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of CIM_LogicalDevice instances representing resources of virtual systems.
     * ConcreteJobStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of CIM_ConcreteJob instances.
     */

    private static CIMProperty setPropertyValue_IndicationsSupported(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SynchronousMethodsSupported
     *     * <br>
     * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemManagementService that is supported synchronously by the implementation.
     *     */

    public javax.cim.UnsignedInteger16[] get_SynchronousMethodsSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_SYNCHRONOUSMETHODSSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property SynchronousMethodsSupported
     * <br>
     * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemManagementService that is supported synchronously by the implementation.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SynchronousMethodsSupported(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYNCHRONOUSMETHODSSUPPORTED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SynchronousMethodsSupported(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SynchronousMethodsSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SynchronousMethodsSupported(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_VirtualSystemManagementCapabilities fco = new CIM_VirtualSystemManagementCapabilities(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYNCHRONOUSMETHODSSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_SynchronousMethodsSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SynchronousMethodsSupported
     * <br>
     * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemManagementService that is supported synchronously by the implementation.
     */

    private static CIMProperty setPropertyValue_SynchronousMethodsSupported(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property VirtualSystemTypesSupported
     *     * <br>
     * Enumeration of strings each designating a type of virtual system that the implementation supports. The types and their string values are implementation dependent.
     *     */

    public String[] get_VirtualSystemTypesSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALSYSTEMTYPESSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VIRTUALSYSTEMTYPESSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property VirtualSystemTypesSupported
     * <br>
     * Enumeration of strings each designating a type of virtual system that the implementation supports. The types and their string values are implementation dependent.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_VirtualSystemTypesSupported(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALSYSTEMTYPESSUPPORTED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_VirtualSystemTypesSupported(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VIRTUALSYSTEMTYPESSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property VirtualSystemTypesSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_VirtualSystemTypesSupported(WBEMClient client,
            String namespace, String[] newValue) throws WbemsmtException {
        CIM_VirtualSystemManagementCapabilities fco = new CIM_VirtualSystemManagementCapabilities(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VIRTUALSYSTEMTYPESSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_VirtualSystemTypesSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VIRTUALSYSTEMTYPESSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property VirtualSystemTypesSupported
     * <br>
     * Enumeration of strings each designating a type of virtual system that the implementation supports. The types and their string values are implementation dependent.
     */

    private static CIMProperty setPropertyValue_VirtualSystemTypesSupported(
            CIMProperty currentProperty, String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    //**********************************************************************
    // Associators methods     
    //**********************************************************************

    //**********************************************************************
    // Extrinsic Method invocations     
    //**********************************************************************                         

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_VirtualSystemManagementCapabilities.CIM_CLASS_NAME;
    }

}