/**
 * CIM_VirtualSystemMigrationService.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS PROVIDED
 * UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR
 * DISTRIBUTION OF THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a
 * current copy of the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Service to control the migration of virtual
 *            systems between host systems, including pre-checking to determine if an intended
 *            migration operation is likely to succeed. generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import javax.wbem.*;

public class CIM_VirtualSystemMigrationService extends CIM_Service {

    public final static String CIM_CLASS_NAME = "CIM_VirtualSystemMigrationService";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constant for method\'s name and parameters
     * Method to perform a pre-check to determine whether a virtual system is likely to be successfully migrated to a target host specified by a network name or IP address. This method does not guarantee that a subsequent migration will always succeed, due to dynamic resource availability.
     * Return code description:
     * 0: Success: Check performed; result reported through the value of the [Out] IsMigratable parameter.
     * 1: Error: Method not supported by implementation. No result reported through the value of the [Out] IsMigratable parameter.
     * 2: Error: Check failed for unspecified reasons. No result reported through the value of the [Out] IsMigratable parameter.
     * 3: Error: Check timed out. No result reported through the value of the [Out] IsMigratable parameter.
     * 4: Error: One or more parameters are formally invalid. For example, the value of the DestinationHost parameter could have been specified in an unsupported format.
     * No result reported through the value of the [Out] IsMigratable parameter.
     * 5: Error: The source virtual system, the source host system or the target host system are in a state that does allow initiation of the requested virtual system migration; this may be a temporary condition. No result reported reported through the value of the [Out] IsMigratable parameter.
     * 6: Error: One or more input parameters are incompatible as a set, or with respect to the target host. For example the value of the MigrationNewSettingData parameter contains properties that are not supported by the target host system identified by the value of the DestinationHost parameter. No result reported through the value of the [Out] IsMigratable parameter.
     * Note: The CheckVirtualSystemIsMigratableToHost( ) method is intended as a transitional solution only until modelling of cluster support is available.
     */

    public static class METHOD_CHECKVIRTUALSYSTEMISMIGRATABLETOHOST {
        /**
         * Constant for method CheckVirtualSystemIsMigratableToHost
         */
        public final static String NAME = "CheckVirtualSystemIsMigratableToHost";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error = new javax.cim.UnsignedInteger32(
                "0");

        /**
         * constant for value entry Completed with No Error (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Completed_with_No_Error = "Completed with No Error";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported = new javax.cim.UnsignedInteger32(
                "1");

        /**
         * constant for value entry Not Supported (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Not_Supported = "Not Supported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Failed (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Failed = "Failed";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout = new javax.cim.UnsignedInteger32(
                "3");

        /**
         * constant for value entry Timeout (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Timeout = "Timeout";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter = new javax.cim.UnsignedInteger32(
                "4");

        /**
         * constant for value entry Invalid Parameter (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Invalid_Parameter = "Invalid Parameter";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State = new javax.cim.UnsignedInteger32(
                "5");

        /**
         * constant for value entry Invalid State (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Invalid_State = "Invalid State";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Incompatible_Parameters = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry Incompatible Parameters (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Incompatible_Parameters = "Incompatible Parameters";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 4097..32767
         */

        /**
         * constant for value entry Method Reserved (corresponds to mapEntry 4097..32767 )
         */
        public final static String VALUE_ENTRY_Method_Reserved = "Method Reserved";

        /**
         * constant for value map entry 32768..65535
         */

        /**
         * constant for value entry Vendor Specific (corresponds to mapEntry 32768..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Specific = "Vendor Specific";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger32 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed;
            }

            if (VALUE_ENTRY_Timeout.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout;
            }

            if (VALUE_ENTRY_Invalid_Parameter.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter;
            }

            if (VALUE_ENTRY_Invalid_State.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State;
            }

            if (VALUE_ENTRY_Incompatible_Parameters.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Incompatible_Parameters;
            }

            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger32 getValueMapEntryFromDisplayedValue(
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
        public static int getIndexForDisplay(javax.cim.UnsignedInteger32 currentValue) {
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

        public static String getValueEntry(javax.cim.UnsignedInteger32 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error.intValue()) {
                return VALUE_ENTRY_Completed_with_No_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported.intValue()) {
                return VALUE_ENTRY_Not_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed.intValue()) {
                return VALUE_ENTRY_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout.intValue()) {
                return VALUE_ENTRY_Timeout;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter.intValue()) {
                return VALUE_ENTRY_Invalid_Parameter;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State.intValue()) {
                return VALUE_ENTRY_Invalid_State;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Incompatible_Parameters.intValue()) {
                return VALUE_ENTRY_Incompatible_Parameters;
            }

            if (iValue >= 4097 || iValue <= 32767) {
                return VALUE_ENTRY_Method_Reserved;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Specific;
            }
            return VALUE_ENTRY_DMTF_Reserved;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the method CheckVirtualSystemIsMigratableToHost   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Incompatible_Parameters };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method CheckVirtualSystemIsMigratableToHost   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Failed, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Invalid_State,
                VALUE_ENTRY_Incompatible_Parameters, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Method_Reserved, VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method CheckVirtualSystemIsMigratableToHost   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Completed_with_No_Error, VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Timeout, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Invalid_State,
                VALUE_ENTRY_Incompatible_Parameters };

        /**
         * constants for parameter ComputerSystem
         */
        public static class PARAMETER_COMPUTERSYSTEM {
            /*
             * Name of the parameter ComputerSystem
             */
            public final static String NAME = "ComputerSystem";

        }

        /**
         * constants for parameter DestinationHost
         */
        public static class PARAMETER_DESTINATIONHOST {
            /*
             * Name of the parameter DestinationHost
             */
            public final static String NAME = "DestinationHost";

        }

        /**
         * constants for parameter MigrationSettingData
         */
        public static class PARAMETER_MIGRATIONSETTINGDATA {
            /*
             * Name of the parameter MigrationSettingData
             */
            public final static String NAME = "MigrationSettingData";

        }

        /**
         * constants for parameter NewSystemSettingData
         */
        public static class PARAMETER_NEWSYSTEMSETTINGDATA {
            /*
             * Name of the parameter NewSystemSettingData
             */
            public final static String NAME = "NewSystemSettingData";

        }

        /**
         * constants for parameter NewResourceSettingData
         */
        public static class PARAMETER_NEWRESOURCESETTINGDATA {
            /*
             * Name of the parameter NewResourceSettingData
             */
            public final static String NAME = "NewResourceSettingData";

        }

        /**
         * constants for parameter IsMigratable
         */
        public static class PARAMETER_ISMIGRATABLE {
            /*
             * Name of the parameter IsMigratable
             */
            public final static String NAME = "IsMigratable";

        }
    }

    /**
     * Constant for method\'s name and parameters
     * Method to perform a pre-check to determine whether a virtual system is likely to be successfully migrated to a target system. This method does not guarantee that a subsequent migration will always succeed, due to dynamic resource availability. Return code description:
     * 0: Success: Check performed; result reported through the value of the [Out] IsMigratable parameter.
     * 1: Error: Method not supported by implementation. No result reported through the value of the [Out] IsMigratable parameter.
     * 2: Error: Check failed for unspecified reasons. No result reported through the value of the [Out] IsMigratable parameter.
     * 3: Error: Check timed out. No result reported through the value of the [Out] IsMigratable parameter.
     * 4: Error: One or more parameters are formally invalid. For example, the value of the DestinationSystem parameter does not comprise a valid object path. No result reported through the value of the [Out] IsMigratable parameter.
     * 5: Error: The source virtual system, the source host system or the target host system are in a state that does allow initiation of the requested virtual system migration; this may be a temporary condition. No result reported reported through the value of the [Out] IsMigratable parameter.
     * 6: Error: One or more input parameters are incompatible as a set, or with respect to the target host. For example the value of the NewSettingData parameter contains properties that are not supported by the target host system identified by the value of the DestinationSystem parameter. No result reported through the value of the [Out] IsMigratable parameter.
     */

    public static class METHOD_CHECKVIRTUALSYSTEMISMIGRATABLETOSYSTEM {
        /**
         * Constant for method CheckVirtualSystemIsMigratableToSystem
         */
        public final static String NAME = "CheckVirtualSystemIsMigratableToSystem";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error = new javax.cim.UnsignedInteger32(
                "0");

        /**
         * constant for value entry Completed with No Error (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Completed_with_No_Error = "Completed with No Error";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported = new javax.cim.UnsignedInteger32(
                "1");

        /**
         * constant for value entry Not Supported (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Not_Supported = "Not Supported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Failed (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Failed = "Failed";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout = new javax.cim.UnsignedInteger32(
                "3");

        /**
         * constant for value entry Timeout (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Timeout = "Timeout";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter = new javax.cim.UnsignedInteger32(
                "4");

        /**
         * constant for value entry Invalid Parameter (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Invalid_Parameter = "Invalid Parameter";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State = new javax.cim.UnsignedInteger32(
                "5");

        /**
         * constant for value entry Invalid State (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Invalid_State = "Invalid State";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Incompatible_Parameters = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry Incompatible Parameters (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Incompatible_Parameters = "Incompatible Parameters";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 4097..32767
         */

        /**
         * constant for value entry Method Reserved (corresponds to mapEntry 4097..32767 )
         */
        public final static String VALUE_ENTRY_Method_Reserved = "Method Reserved";

        /**
         * constant for value map entry 32768..65535
         */

        /**
         * constant for value entry Vendor Specific (corresponds to mapEntry 32768..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Specific = "Vendor Specific";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger32 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed;
            }

            if (VALUE_ENTRY_Timeout.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout;
            }

            if (VALUE_ENTRY_Invalid_Parameter.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter;
            }

            if (VALUE_ENTRY_Invalid_State.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State;
            }

            if (VALUE_ENTRY_Incompatible_Parameters.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Incompatible_Parameters;
            }

            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger32 getValueMapEntryFromDisplayedValue(
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
        public static int getIndexForDisplay(javax.cim.UnsignedInteger32 currentValue) {
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

        public static String getValueEntry(javax.cim.UnsignedInteger32 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error.intValue()) {
                return VALUE_ENTRY_Completed_with_No_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported.intValue()) {
                return VALUE_ENTRY_Not_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed.intValue()) {
                return VALUE_ENTRY_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout.intValue()) {
                return VALUE_ENTRY_Timeout;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter.intValue()) {
                return VALUE_ENTRY_Invalid_Parameter;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State.intValue()) {
                return VALUE_ENTRY_Invalid_State;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Incompatible_Parameters.intValue()) {
                return VALUE_ENTRY_Incompatible_Parameters;
            }

            if (iValue >= 4097 || iValue <= 32767) {
                return VALUE_ENTRY_Method_Reserved;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Specific;
            }
            return VALUE_ENTRY_DMTF_Reserved;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the method CheckVirtualSystemIsMigratableToSystem   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Incompatible_Parameters };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method CheckVirtualSystemIsMigratableToSystem   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Failed, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Invalid_State,
                VALUE_ENTRY_Incompatible_Parameters, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Method_Reserved, VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method CheckVirtualSystemIsMigratableToSystem   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Completed_with_No_Error, VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Timeout, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Invalid_State,
                VALUE_ENTRY_Incompatible_Parameters };

        /**
         * constants for parameter ComputerSystem
         */
        public static class PARAMETER_COMPUTERSYSTEM {
            /*
             * Name of the parameter ComputerSystem
             */
            public final static String NAME = "ComputerSystem";

        }

        /**
         * constants for parameter DestinationSystem
         */
        public static class PARAMETER_DESTINATIONSYSTEM {
            /*
             * Name of the parameter DestinationSystem
             */
            public final static String NAME = "DestinationSystem";

        }

        /**
         * constants for parameter MigrationSettingData
         */
        public static class PARAMETER_MIGRATIONSETTINGDATA {
            /*
             * Name of the parameter MigrationSettingData
             */
            public final static String NAME = "MigrationSettingData";

        }

        /**
         * constants for parameter NewSystemSettingData
         */
        public static class PARAMETER_NEWSYSTEMSETTINGDATA {
            /*
             * Name of the parameter NewSystemSettingData
             */
            public final static String NAME = "NewSystemSettingData";

        }

        /**
         * constants for parameter NewResourceSettingData
         */
        public static class PARAMETER_NEWRESOURCESETTINGDATA {
            /*
             * Name of the parameter NewResourceSettingData
             */
            public final static String NAME = "NewResourceSettingData";

        }

        /**
         * constants for parameter IsMigratable
         */
        public static class PARAMETER_ISMIGRATABLE {
            /*
             * Name of the parameter IsMigratable
             */
            public final static String NAME = "IsMigratable";

        }
    }

    /**
     * Constant for method\'s name and parameters
     * Method to move, migrate or relocate a virtual system to a target host specified by a network name or IP address.
     * Return code description:
     * 0: Success: Virtual system was migrated.
     * 1: Error: Method not supported by implementation.
     * 2: Error: Virtual system migration failed for unspecified reasons.
     * 3: Error: Virtual system migration time out; the virtual system state is unknown.
     * 4: Error: One or more parameters are formally invalid. For example, the value of the DestinationHost parameter could have been specified in an unsupported format.
     * 5: Error: The source virtual system, the source host system or the target host system are in a state that does allow initiation of the requested virtual system migration; this may be a temporary condition.
     * 6: Error: One or more input parameters are incompatible as a set, or with respect to the target host. For example the value of the MigrationNewSettingData parameter contains properties that are not supported by the target host system identified by the value of the DestinationHost parameter. Note: The MigrateVirtualSystemToHost( ) methods is intended as a transitional solution only until modelling of cluster support is available.
     */

    public static class METHOD_MIGRATEVIRTUALSYSTEMTOHOST {
        /**
         * Constant for method MigrateVirtualSystemToHost
         */
        public final static String NAME = "MigrateVirtualSystemToHost";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error = new javax.cim.UnsignedInteger32(
                "0");

        /**
         * constant for value entry Completed with No Error (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Completed_with_No_Error = "Completed with No Error";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported = new javax.cim.UnsignedInteger32(
                "1");

        /**
         * constant for value entry Not Supported (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Not_Supported = "Not Supported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Failed (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Failed = "Failed";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout = new javax.cim.UnsignedInteger32(
                "3");

        /**
         * constant for value entry Timeout (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Timeout = "Timeout";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter = new javax.cim.UnsignedInteger32(
                "4");

        /**
         * constant for value entry Invalid Parameter (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Invalid_Parameter = "Invalid Parameter";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State = new javax.cim.UnsignedInteger32(
                "5");

        /**
         * constant for value entry Invalid State (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Invalid_State = "Invalid State";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Incompatible_Parameters = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry Incompatible Parameters (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Incompatible_Parameters = "Incompatible Parameters";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 4096
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started = new javax.cim.UnsignedInteger32(
                "4096");

        /**
         * constant for value entry Method Parameters Checked - Job Started (corresponds to mapEntry 4096 )
         */
        public final static String VALUE_ENTRY_Method_Parameters_Checked___Job_Started = "Method Parameters Checked - Job Started";

        /**
         * constant for value map entry 4097..32767
         */

        /**
         * constant for value entry Method Reserved (corresponds to mapEntry 4097..32767 )
         */
        public final static String VALUE_ENTRY_Method_Reserved = "Method Reserved";

        /**
         * constant for value map entry 32768..65535
         */

        /**
         * constant for value entry Vendor Specific (corresponds to mapEntry 32768..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Specific = "Vendor Specific";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger32 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed;
            }

            if (VALUE_ENTRY_Timeout.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout;
            }

            if (VALUE_ENTRY_Invalid_Parameter.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter;
            }

            if (VALUE_ENTRY_Invalid_State.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State;
            }

            if (VALUE_ENTRY_Incompatible_Parameters.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Incompatible_Parameters;
            }

            if (VALUE_ENTRY_Method_Parameters_Checked___Job_Started.equals(value)) {
                return VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger32 getValueMapEntryFromDisplayedValue(
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
        public static int getIndexForDisplay(javax.cim.UnsignedInteger32 currentValue) {
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

        public static String getValueEntry(javax.cim.UnsignedInteger32 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error.intValue()) {
                return VALUE_ENTRY_Completed_with_No_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported.intValue()) {
                return VALUE_ENTRY_Not_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed.intValue()) {
                return VALUE_ENTRY_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout.intValue()) {
                return VALUE_ENTRY_Timeout;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter.intValue()) {
                return VALUE_ENTRY_Invalid_Parameter;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State.intValue()) {
                return VALUE_ENTRY_Invalid_State;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Incompatible_Parameters.intValue()) {
                return VALUE_ENTRY_Incompatible_Parameters;
            }

            if (iValue == VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started
                    .intValue()) {
                return VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (iValue >= 4097 || iValue <= 32767) {
                return VALUE_ENTRY_Method_Reserved;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Specific;
            }
            return VALUE_ENTRY_DMTF_Reserved;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the method MigrateVirtualSystemToHost   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Incompatible_Parameters,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method MigrateVirtualSystemToHost   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Failed, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Invalid_State,
                VALUE_ENTRY_Incompatible_Parameters, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started, VALUE_ENTRY_Method_Reserved,
                VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method MigrateVirtualSystemToHost   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Completed_with_No_Error, VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Timeout, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Invalid_State,
                VALUE_ENTRY_Incompatible_Parameters,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started };

        /**
         * constants for parameter ComputerSystem
         */
        public static class PARAMETER_COMPUTERSYSTEM {
            /*
             * Name of the parameter ComputerSystem
             */
            public final static String NAME = "ComputerSystem";

        }

        /**
         * constants for parameter DestinationHost
         */
        public static class PARAMETER_DESTINATIONHOST {
            /*
             * Name of the parameter DestinationHost
             */
            public final static String NAME = "DestinationHost";

        }

        /**
         * constants for parameter MigrationSettingData
         */
        public static class PARAMETER_MIGRATIONSETTINGDATA {
            /*
             * Name of the parameter MigrationSettingData
             */
            public final static String NAME = "MigrationSettingData";

        }

        /**
         * constants for parameter NewSystemSettingData
         */
        public static class PARAMETER_NEWSYSTEMSETTINGDATA {
            /*
             * Name of the parameter NewSystemSettingData
             */
            public final static String NAME = "NewSystemSettingData";

        }

        /**
         * constants for parameter NewResourceSettingData
         */
        public static class PARAMETER_NEWRESOURCESETTINGDATA {
            /*
             * Name of the parameter NewResourceSettingData
             */
            public final static String NAME = "NewResourceSettingData";

        }

        /**
         * constants for parameter Job
         */
        public static class PARAMETER_JOB {
            /*
             * Name of the parameter Job
             */
            public final static String NAME = "Job";

        }
    }

    /**
     * Constant for method\'s name and parameters
     * Method to move, migrate or relocate a virtual system to a target system.
     * Return code description:
     * 0: Success: Virtual system was migrated
     * 1: Error: Method not supported by implementation
     * 2: Error: Virtual system migration failed for unspecified reasons
     * 3: Error: Virtual system migration time out; the virtual system state is unknown
     * 4: Error: One or more parameters are formally invalid For example, the value of the Destination System parameter does not contain a valid object path
     * 5: Error: The source virtual system, the source host system or the target host system are in a state that does allow initiation of the requested virtual system migration; this may be a temporary condition.
     * 6: Error: One or more input parameters are incompatible as a set, or with respect to the target host. For example the value of the MigrationNewSettingData parameter contains properties that are not supported by the target host system identified by the value of the DestinationSystem parameter.
     */

    public static class METHOD_MIGRATEVIRTUALSYSTEMTOSYSTEM {
        /**
         * Constant for method MigrateVirtualSystemToSystem
         */
        public final static String NAME = "MigrateVirtualSystemToSystem";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error = new javax.cim.UnsignedInteger32(
                "0");

        /**
         * constant for value entry Completed with No Error (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Completed_with_No_Error = "Completed with No Error";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported = new javax.cim.UnsignedInteger32(
                "1");

        /**
         * constant for value entry Not Supported (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Not_Supported = "Not Supported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Failed (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Failed = "Failed";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout = new javax.cim.UnsignedInteger32(
                "3");

        /**
         * constant for value entry Timeout (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Timeout = "Timeout";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter = new javax.cim.UnsignedInteger32(
                "4");

        /**
         * constant for value entry Invalid Parameter (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Invalid_Parameter = "Invalid Parameter";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State = new javax.cim.UnsignedInteger32(
                "5");

        /**
         * constant for value entry Invalid State (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Invalid_State = "Invalid State";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Incompatible_Parameters = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry Incompatible Parameters (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Incompatible_Parameters = "Incompatible Parameters";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 4096
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started = new javax.cim.UnsignedInteger32(
                "4096");

        /**
         * constant for value entry Method Parameters Checked - Job Started (corresponds to mapEntry 4096 )
         */
        public final static String VALUE_ENTRY_Method_Parameters_Checked___Job_Started = "Method Parameters Checked - Job Started";

        /**
         * constant for value map entry 4097..32767
         */

        /**
         * constant for value entry Method Reserved (corresponds to mapEntry 4097..32767 )
         */
        public final static String VALUE_ENTRY_Method_Reserved = "Method Reserved";

        /**
         * constant for value map entry 32768..65535
         */

        /**
         * constant for value entry Vendor Specific (corresponds to mapEntry 32768..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Specific = "Vendor Specific";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger32 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed;
            }

            if (VALUE_ENTRY_Timeout.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout;
            }

            if (VALUE_ENTRY_Invalid_Parameter.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter;
            }

            if (VALUE_ENTRY_Invalid_State.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State;
            }

            if (VALUE_ENTRY_Incompatible_Parameters.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Incompatible_Parameters;
            }

            if (VALUE_ENTRY_Method_Parameters_Checked___Job_Started.equals(value)) {
                return VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger32 getValueMapEntryFromDisplayedValue(
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
        public static int getIndexForDisplay(javax.cim.UnsignedInteger32 currentValue) {
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

        public static String getValueEntry(javax.cim.UnsignedInteger32 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error.intValue()) {
                return VALUE_ENTRY_Completed_with_No_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported.intValue()) {
                return VALUE_ENTRY_Not_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed.intValue()) {
                return VALUE_ENTRY_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout.intValue()) {
                return VALUE_ENTRY_Timeout;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter.intValue()) {
                return VALUE_ENTRY_Invalid_Parameter;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State.intValue()) {
                return VALUE_ENTRY_Invalid_State;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Incompatible_Parameters.intValue()) {
                return VALUE_ENTRY_Incompatible_Parameters;
            }

            if (iValue == VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started
                    .intValue()) {
                return VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (iValue >= 4097 || iValue <= 32767) {
                return VALUE_ENTRY_Method_Reserved;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Specific;
            }
            return VALUE_ENTRY_DMTF_Reserved;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the method MigrateVirtualSystemToSystem   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Incompatible_Parameters,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method MigrateVirtualSystemToSystem   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Failed, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Invalid_State,
                VALUE_ENTRY_Incompatible_Parameters, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started, VALUE_ENTRY_Method_Reserved,
                VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method MigrateVirtualSystemToSystem   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Completed_with_No_Error, VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Timeout, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Invalid_State,
                VALUE_ENTRY_Incompatible_Parameters,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started };

        /**
         * constants for parameter ComputerSystem
         */
        public static class PARAMETER_COMPUTERSYSTEM {
            /*
             * Name of the parameter ComputerSystem
             */
            public final static String NAME = "ComputerSystem";

        }

        /**
         * constants for parameter DestinationSystem
         */
        public static class PARAMETER_DESTINATIONSYSTEM {
            /*
             * Name of the parameter DestinationSystem
             */
            public final static String NAME = "DestinationSystem";

        }

        /**
         * constants for parameter MigrationSettingData
         */
        public static class PARAMETER_MIGRATIONSETTINGDATA {
            /*
             * Name of the parameter MigrationSettingData
             */
            public final static String NAME = "MigrationSettingData";

        }

        /**
         * constants for parameter NewSystemSettingData
         */
        public static class PARAMETER_NEWSYSTEMSETTINGDATA {
            /*
             * Name of the parameter NewSystemSettingData
             */
            public final static String NAME = "NewSystemSettingData";

        }

        /**
         * constants for parameter NewResourceSettingData
         */
        public static class PARAMETER_NEWRESOURCESETTINGDATA {
            /*
             * Name of the parameter NewResourceSettingData
             */
            public final static String NAME = "NewResourceSettingData";

        }

        /**
         * constants for parameter NewComputerSystem
         */
        public static class PARAMETER_NEWCOMPUTERSYSTEM {
            /*
             * Name of the parameter NewComputerSystem
             */
            public final static String NAME = "NewComputerSystem";

        }

        /**
         * constants for parameter Job
         */
        public static class PARAMETER_JOB {
            /*
             * Name of the parameter Job
             */
            public final static String NAME = "Job";

        }
    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
        String[] parentClassPackageList = CIM_Service.getPackages();

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
     *   Service to control the migration of virtual systems between host systems, including pre-checking to determine if an intended migration operation is likely to succeed.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_VirtualSystemMigrationService(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Service to control the migration of virtual systems between host systems, including pre-checking to determine if an intended migration operation is likely to succeed.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_VirtualSystemMigrationService(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_VirtualSystemMigrationService() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    //**********************************************************************
    // Associators methods     
    //**********************************************************************

    //**********************************************************************
    // Extrinsic Method invocations     
    //**********************************************************************                         

    /**
     * Invokes the Method CheckVirtualSystemIsMigratableToHost
     * <br>
     * @param client the cimclient
     * Method to perform a pre-check to determine whether a virtual system is likely to be successfully migrated to a target host specified by a network name or IP address. This method does not guarantee that a subsequent migration will always succeed, due to dynamic resource availability.
     * Return code description:
     * 0: Success: Check performed; result reported through the value of the [Out] IsMigratable parameter.
     * 1: Error: Method not supported by implementation. No result reported through the value of the [Out] IsMigratable parameter.
     * 2: Error: Check failed for unspecified reasons. No result reported through the value of the [Out] IsMigratable parameter.
     * 3: Error: Check timed out. No result reported through the value of the [Out] IsMigratable parameter.
     * 4: Error: One or more parameters are formally invalid. For example, the value of the DestinationHost parameter could have been specified in an unsupported format.
     * No result reported through the value of the [Out] IsMigratable parameter.
     * 5: Error: The source virtual system, the source host system or the target host system are in a state that does allow initiation of the requested virtual system migration; this may be a temporary condition. No result reported reported through the value of the [Out] IsMigratable parameter.
     * 6: Error: One or more input parameters are incompatible as a set, or with respect to the target host. For example the value of the MigrationNewSettingData parameter contains properties that are not supported by the target host system identified by the value of the DestinationHost parameter. No result reported through the value of the [Out] IsMigratable parameter.
     * Note: The CheckVirtualSystemIsMigratableToHost( ) method is intended as a transitional solution only until modelling of cluster support is available.
     *   @param ComputerSystem Source virtual computer system to be migrated.
     *   @param DestinationHost Target host system for the migration.
     *     Acceptable formats for this parameter are conveyed through values of elements of the DestinationHostFormatsSupported[ ] array property in the instance of the CIM_VirtualSystemMigrationCapabilities that is associated through the CIM_ElementCapabilities assocation.
     *   @param MigrationSettingData String containing an embedded instance of the CIM_VirtualSystemMigrationSettingData class representing migration settings applicable to the migration operation.
     *   @param NewSystemSettingData String containing an embedded instance of the CIM_VirtualSystemSettingData class representing new properties applicable to the virtual system after it is migrated.
     *   @param NewResourceSettingData Array of strings each containing an embedded instance of the CIM_ResourceAllocationSettingData class representing new properties applicable to virtual resources in the scope of the virtual system after it is migrated.
     *
     */

    public CheckVirtualSystemIsMigratableToHostResult invoke_CheckVirtualSystemIsMigratableToHost(WBEMClient cimClient
                                 ,CIM_ComputerSystem ComputerSystem
                      ,String DestinationHost
                      ,CIM_VirtualSystemMigrationSettingData MigrationSettingData
                      ,CIM_VirtualSystemSettingData NewSystemSettingData
                      ,CIM_ResourceAllocationSettingData[] NewResourceSettingData
                      ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[5];
       CIMArgument[] outParameter = new CIMArgument[1];
    
                    inParameter[0] = ( ComputerSystem == null ? null : new CIMArgument("ComputerSystem", new CIMDataType(CIM_ComputerSystem.CIM_CLASS_NAME), ComputerSystem.getCimObjectPath()) );
       
                    inParameter[1] = ( DestinationHost == null ? null : new CIMArgument("DestinationHost", CIMDataType.STRING_T, DestinationHost) );
       
                    inParameter[2] = ( MigrationSettingData == null ? null : new CIMArgument("MigrationSettingData", CIMDataType.OBJECT_T, MigrationSettingData.getCimInstance()) );
       
                    inParameter[3] = ( NewSystemSettingData == null ? null : new CIMArgument("NewSystemSettingData", CIMDataType.OBJECT_T, NewSystemSettingData.getCimInstance()) );
       
                    inParameter[4] = ( NewResourceSettingData == null ? null : new CIMArgument("NewResourceSettingData", CIMDataType.OBJECT_ARRAY_T, getCIMInstances(NewResourceSettingData)) );
       
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_CHECKVIRTUALSYSTEMISMIGRATABLETOHOST.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_CHECKVIRTUALSYSTEMISMIGRATABLETOHOST.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        CheckVirtualSystemIsMigratableToHostResult result = new CheckVirtualSystemIsMigratableToHostResult();
        result.setResultObject(resultObject);

        java.util.HashMap<String, CIMArgument> mapOutParameter = new java.util.HashMap<String, CIMArgument>();
        for (int i = 0; i < outParameter.length; i++) {
           CIMArgument argument = outParameter[i];
           if (argument != null)
           {
              mapOutParameter.put(argument.getName(), argument);
           }
        }
                
        
        CIMArgument arg_IsMigratable = (CIMArgument) mapOutParameter.get("IsMigratable");
        if (arg_IsMigratable != null)
       	 {
              
              Boolean out_IsMigratable = (Boolean)arg_IsMigratable.getValue();    
                      
           result.set_IsMigratable(out_IsMigratable);
       	 }
 
               
     return result;               
   }

    /**
     * Result object for the method CheckVirtualSystemIsMigratableToHost
     */
    public static class CheckVirtualSystemIsMigratableToHostResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        CheckVirtualSystemIsMigratableToHostResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger32 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger32 getResultObject() {
            return this.resultObject;
        }

        /**
         * The out parameter IsMigratable
         */
        Boolean IsMigratable = null;

        /**
         * Set the out parameter IsMigratable
         * @param value
         */
        void set_IsMigratable(Boolean value) {
            this.IsMigratable = value;
        }

        /**
         * get the out parameter IsMigratable
         * @return
         */
        public Boolean get_IsMigratable() {
            return this.IsMigratable;
        }
    }

    /**
     * Invokes the Method CheckVirtualSystemIsMigratableToSystem
     * <br>
     * @param client the cimclient
     * Method to perform a pre-check to determine whether a virtual system is likely to be successfully migrated to a target system. This method does not guarantee that a subsequent migration will always succeed, due to dynamic resource availability. Return code description:
     * 0: Success: Check performed; result reported through the value of the [Out] IsMigratable parameter.
     * 1: Error: Method not supported by implementation. No result reported through the value of the [Out] IsMigratable parameter.
     * 2: Error: Check failed for unspecified reasons. No result reported through the value of the [Out] IsMigratable parameter.
     * 3: Error: Check timed out. No result reported through the value of the [Out] IsMigratable parameter.
     * 4: Error: One or more parameters are formally invalid. For example, the value of the DestinationSystem parameter does not comprise a valid object path. No result reported through the value of the [Out] IsMigratable parameter.
     * 5: Error: The source virtual system, the source host system or the target host system are in a state that does allow initiation of the requested virtual system migration; this may be a temporary condition. No result reported reported through the value of the [Out] IsMigratable parameter.
     * 6: Error: One or more input parameters are incompatible as a set, or with respect to the target host. For example the value of the NewSettingData parameter contains properties that are not supported by the target host system identified by the value of the DestinationSystem parameter. No result reported through the value of the [Out] IsMigratable parameter.
     *   @param ComputerSystem Source virtual computer system to be migrated.
     *   @param DestinationSystem Destination system onto which to migrate the virtual system.
     *   @param MigrationSettingData String containing an embedded instance of the CIM_VirtualSystemMigrationSettingData class representing migration settings applicable to the migration operation.
     *   @param NewSystemSettingData String containing an embedded instance of the CIM_VirtualSystemSettingData class representing new properties applicable to the virtual system after it is migrated.
     *   @param NewResourceSettingData Array of strings each containing an embedded instance of the CIM_ResourceAllocationSettingData class representing new properties applicable to virtual resources in the scope of the virtual system after it is migrated.
     *
     */

    public CheckVirtualSystemIsMigratableToSystemResult invoke_CheckVirtualSystemIsMigratableToSystem(WBEMClient cimClient
                                 ,CIM_ComputerSystem ComputerSystem
                      ,CIM_System DestinationSystem
                      ,CIM_VirtualSystemMigrationSettingData MigrationSettingData
                      ,CIM_VirtualSystemSettingData NewSystemSettingData
                      ,CIM_ResourceAllocationSettingData[] NewResourceSettingData
                      ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[5];
       CIMArgument[] outParameter = new CIMArgument[1];
    
                    inParameter[0] = ( ComputerSystem == null ? null : new CIMArgument("ComputerSystem", new CIMDataType(CIM_ComputerSystem.CIM_CLASS_NAME), ComputerSystem.getCimObjectPath()) );
       
                    inParameter[1] = ( DestinationSystem == null ? null : new CIMArgument("DestinationSystem", new CIMDataType(CIM_System.CIM_CLASS_NAME), DestinationSystem.getCimObjectPath()) );
       
                    inParameter[2] = ( MigrationSettingData == null ? null : new CIMArgument("MigrationSettingData", CIMDataType.OBJECT_T, MigrationSettingData.getCimInstance()) );
       
                    inParameter[3] = ( NewSystemSettingData == null ? null : new CIMArgument("NewSystemSettingData", CIMDataType.OBJECT_T, NewSystemSettingData.getCimInstance()) );
       
                    inParameter[4] = ( NewResourceSettingData == null ? null : new CIMArgument("NewResourceSettingData", CIMDataType.OBJECT_ARRAY_T, getCIMInstances(NewResourceSettingData)) );
       
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_CHECKVIRTUALSYSTEMISMIGRATABLETOSYSTEM.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_CHECKVIRTUALSYSTEMISMIGRATABLETOSYSTEM.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        CheckVirtualSystemIsMigratableToSystemResult result = new CheckVirtualSystemIsMigratableToSystemResult();
        result.setResultObject(resultObject);

        java.util.HashMap<String, CIMArgument> mapOutParameter = new java.util.HashMap<String, CIMArgument>();
        for (int i = 0; i < outParameter.length; i++) {
           CIMArgument argument = outParameter[i];
           if (argument != null)
           {
              mapOutParameter.put(argument.getName(), argument);
           }
        }
                
        
        CIMArgument arg_IsMigratable = (CIMArgument) mapOutParameter.get("IsMigratable");
        if (arg_IsMigratable != null)
       	 {
              
              Boolean out_IsMigratable = (Boolean)arg_IsMigratable.getValue();    
                      
           result.set_IsMigratable(out_IsMigratable);
       	 }
 
               
     return result;               
   }

    /**
     * Result object for the method CheckVirtualSystemIsMigratableToSystem
     */
    public static class CheckVirtualSystemIsMigratableToSystemResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        CheckVirtualSystemIsMigratableToSystemResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger32 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger32 getResultObject() {
            return this.resultObject;
        }

        /**
         * The out parameter IsMigratable
         */
        Boolean IsMigratable = null;

        /**
         * Set the out parameter IsMigratable
         * @param value
         */
        void set_IsMigratable(Boolean value) {
            this.IsMigratable = value;
        }

        /**
         * get the out parameter IsMigratable
         * @return
         */
        public Boolean get_IsMigratable() {
            return this.IsMigratable;
        }
    }

    /**
     * Invokes the Method MigrateVirtualSystemToHost
     * <br>
     * @param client the cimclient
     * Method to move, migrate or relocate a virtual system to a target host specified by a network name or IP address.
     * Return code description:
     * 0: Success: Virtual system was migrated.
     * 1: Error: Method not supported by implementation.
     * 2: Error: Virtual system migration failed for unspecified reasons.
     * 3: Error: Virtual system migration time out; the virtual system state is unknown.
     * 4: Error: One or more parameters are formally invalid. For example, the value of the DestinationHost parameter could have been specified in an unsupported format.
     * 5: Error: The source virtual system, the source host system or the target host system are in a state that does allow initiation of the requested virtual system migration; this may be a temporary condition.
     * 6: Error: One or more input parameters are incompatible as a set, or with respect to the target host. For example the value of the MigrationNewSettingData parameter contains properties that are not supported by the target host system identified by the value of the DestinationHost parameter. Note: The MigrateVirtualSystemToHost( ) methods is intended as a transitional solution only until modelling of cluster support is available.
     *   @param ComputerSystem Source virtual computer system to be migrated.
     *   @param DestinationHost Target host system for the migration.
     *     Acceptable formats for this parameter are conveyed through values of elements of the DestinationHostFormatsSupported[ ] array property in the instance of the CIM_VirtualSystemMigrationCapabilities that is associated through the CIM_ElementCapabilities assocation.
     *   @param MigrationSettingData String containing an embedded instance of the CIM_VirtualSystemMigrationSettingData class representing migration settings applicable to the migration operation.
     *   @param NewSystemSettingData String containing an embedded instance of the CIM_VirtualSystemSettingData class representing new properties applicable to the virtual system after it is migrated.
     *   @param NewResourceSettingData Array of strings each containing an embedded instance of the CIM_ResourceAllocationSettingData class representing new properties applicable to virtual resources in the scope of the virtual system after it is migrated.
     *
     */

    public MigrateVirtualSystemToHostResult invoke_MigrateVirtualSystemToHost(WBEMClient cimClient
                                 ,CIM_ComputerSystem ComputerSystem
                      ,String DestinationHost
                      ,CIM_VirtualSystemMigrationSettingData MigrationSettingData
                      ,CIM_VirtualSystemSettingData NewSystemSettingData
                      ,CIM_ResourceAllocationSettingData[] NewResourceSettingData
                      ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[5];
       CIMArgument[] outParameter = new CIMArgument[1];
    
                    inParameter[0] = ( ComputerSystem == null ? null : new CIMArgument("ComputerSystem", new CIMDataType(CIM_ComputerSystem.CIM_CLASS_NAME), ComputerSystem.getCimObjectPath()) );
       
                    inParameter[1] = ( DestinationHost == null ? null : new CIMArgument("DestinationHost", CIMDataType.STRING_T, DestinationHost) );
       
                    inParameter[2] = ( MigrationSettingData == null ? null : new CIMArgument("MigrationSettingData", CIMDataType.OBJECT_T, MigrationSettingData.getCimInstance()) );
       
                    inParameter[3] = ( NewSystemSettingData == null ? null : new CIMArgument("NewSystemSettingData", CIMDataType.OBJECT_T, NewSystemSettingData.getCimInstance()) );
       
                    inParameter[4] = ( NewResourceSettingData == null ? null : new CIMArgument("NewResourceSettingData", CIMDataType.OBJECT_ARRAY_T, getCIMInstances(NewResourceSettingData)) );
       
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_MIGRATEVIRTUALSYSTEMTOHOST.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_MIGRATEVIRTUALSYSTEMTOHOST.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        MigrateVirtualSystemToHostResult result = new MigrateVirtualSystemToHostResult();
        result.setResultObject(resultObject);

        java.util.HashMap<String, CIMArgument> mapOutParameter = new java.util.HashMap<String, CIMArgument>();
        for (int i = 0; i < outParameter.length; i++) {
           CIMArgument argument = outParameter[i];
           if (argument != null)
           {
              mapOutParameter.put(argument.getName(), argument);
           }
        }
                
        
        CIMArgument arg_Job = (CIMArgument) mapOutParameter.get("Job");
        if (arg_Job != null)
       	 {
                                          CIM_ConcreteJob out_Job = CIM_ConcreteJobHelper.getInstance(cimClient,(CIMObjectPath)arg_Job.getValue());
                                    
           result.set_Job(out_Job);
       	 }
 
               
     return result;               
   }

    /**
     * Result object for the method MigrateVirtualSystemToHost
     */
    public static class MigrateVirtualSystemToHostResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        MigrateVirtualSystemToHostResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger32 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger32 getResultObject() {
            return this.resultObject;
        }

        /**
         * The out parameter Job
         */
        CIM_ConcreteJob Job = null;

        /**
         * Set the out parameter Job
         * @param value
         */
        void set_Job(CIM_ConcreteJob value) {
            this.Job = value;
        }

        /**
         * get the out parameter Job
         * @return
         */
        public CIM_ConcreteJob get_Job() {
            return this.Job;
        }
    }

    /**
     * Invokes the Method MigrateVirtualSystemToSystem
     * <br>
     * @param client the cimclient
     * Method to move, migrate or relocate a virtual system to a target system.
     * Return code description:
     * 0: Success: Virtual system was migrated
     * 1: Error: Method not supported by implementation
     * 2: Error: Virtual system migration failed for unspecified reasons
     * 3: Error: Virtual system migration time out; the virtual system state is unknown
     * 4: Error: One or more parameters are formally invalid For example, the value of the Destination System parameter does not contain a valid object path
     * 5: Error: The source virtual system, the source host system or the target host system are in a state that does allow initiation of the requested virtual system migration; this may be a temporary condition.
     * 6: Error: One or more input parameters are incompatible as a set, or with respect to the target host. For example the value of the MigrationNewSettingData parameter contains properties that are not supported by the target host system identified by the value of the DestinationSystem parameter.
     *   @param ComputerSystem Source virtual computer system to be migrated.
     *   @param DestinationSystem Destination host system whereto migrate the virtual system.
     *   @param MigrationSettingData String containing an embedded instance of the CIM_VirtualSystemMigrationSettingData class representing migration settings applicable to the migration operation.
     *   @param NewSystemSettingData String containing an embedded instance of the CIM_VirtualSystemSettingData class representing new properties applicable to the virtual system after it is migrated.
     *   @param NewResourceSettingData Array of strings each containing an embedded instance of the CIM_ResourceAllocationSettingData class representing new properties applicable to virtual resources in the scope of the virtual system after it is migrated.
     *
     */

    public MigrateVirtualSystemToSystemResult invoke_MigrateVirtualSystemToSystem(WBEMClient cimClient
                                 ,CIM_ComputerSystem ComputerSystem
                      ,CIM_System DestinationSystem
                      ,CIM_VirtualSystemMigrationSettingData MigrationSettingData
                      ,CIM_VirtualSystemSettingData NewSystemSettingData
                      ,CIM_ResourceAllocationSettingData[] NewResourceSettingData
                      ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[5];
       CIMArgument[] outParameter = new CIMArgument[2];
    
                    inParameter[0] = ( ComputerSystem == null ? null : new CIMArgument("ComputerSystem", new CIMDataType(CIM_ComputerSystem.CIM_CLASS_NAME), ComputerSystem.getCimObjectPath()) );
       
                    inParameter[1] = ( DestinationSystem == null ? null : new CIMArgument("DestinationSystem", new CIMDataType(CIM_System.CIM_CLASS_NAME), DestinationSystem.getCimObjectPath()) );
       
                    inParameter[2] = ( MigrationSettingData == null ? null : new CIMArgument("MigrationSettingData", CIMDataType.OBJECT_T, MigrationSettingData.getCimInstance()) );
       
                    inParameter[3] = ( NewSystemSettingData == null ? null : new CIMArgument("NewSystemSettingData", CIMDataType.OBJECT_T, NewSystemSettingData.getCimInstance()) );
       
                    inParameter[4] = ( NewResourceSettingData == null ? null : new CIMArgument("NewResourceSettingData", CIMDataType.OBJECT_ARRAY_T, getCIMInstances(NewResourceSettingData)) );
       
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_MIGRATEVIRTUALSYSTEMTOSYSTEM.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_MIGRATEVIRTUALSYSTEMTOSYSTEM.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        MigrateVirtualSystemToSystemResult result = new MigrateVirtualSystemToSystemResult();
        result.setResultObject(resultObject);

        java.util.HashMap<String, CIMArgument> mapOutParameter = new java.util.HashMap<String, CIMArgument>();
        for (int i = 0; i < outParameter.length; i++) {
           CIMArgument argument = outParameter[i];
           if (argument != null)
           {
              mapOutParameter.put(argument.getName(), argument);
           }
        }
                
        
        CIMArgument arg_NewComputerSystem = (CIMArgument) mapOutParameter.get("NewComputerSystem");
        if (arg_NewComputerSystem != null)
       	 {
                                          CIM_ComputerSystem out_NewComputerSystem = CIM_ComputerSystemHelper.getInstance(cimClient,(CIMObjectPath)arg_NewComputerSystem.getValue());
                                    
           result.set_NewComputerSystem(out_NewComputerSystem);
       	 }
 
             
        
        CIMArgument arg_Job = (CIMArgument) mapOutParameter.get("Job");
        if (arg_Job != null)
       	 {
                                          CIM_ConcreteJob out_Job = CIM_ConcreteJobHelper.getInstance(cimClient,(CIMObjectPath)arg_Job.getValue());
                                    
           result.set_Job(out_Job);
       	 }
 
               
     return result;               
   }

    /**
     * Result object for the method MigrateVirtualSystemToSystem
     */
    public static class MigrateVirtualSystemToSystemResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        MigrateVirtualSystemToSystemResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger32 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger32 getResultObject() {
            return this.resultObject;
        }

        /**
         * The out parameter NewComputerSystem
         */
        CIM_ComputerSystem NewComputerSystem = null;

        /**
         * Set the out parameter NewComputerSystem
         * @param value
         */
        void set_NewComputerSystem(CIM_ComputerSystem value) {
            this.NewComputerSystem = value;
        }

        /**
         * get the out parameter NewComputerSystem
         * @return
         */
        public CIM_ComputerSystem get_NewComputerSystem() {
            return this.NewComputerSystem;
        }

        /**
         * The out parameter Job
         */
        CIM_ConcreteJob Job = null;

        /**
         * Set the out parameter Job
         * @param value
         */
        void set_Job(CIM_ConcreteJob value) {
            this.Job = value;
        }

        /**
         * get the out parameter Job
         * @return
         */
        public CIM_ConcreteJob get_Job() {
            return this.Job;
        }
    }

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_VirtualSystemMigrationService.CIM_CLASS_NAME;
    }

}