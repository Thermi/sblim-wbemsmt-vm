/**
 * CIM_VirtualSystemSnapshotService.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS PROVIDED
 * UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR
 * DISTRIBUTION OF THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a
 * current copy of the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Service to create, apply and destroy
 *            snapshots of virtual systems. generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import javax.wbem.*;

public class CIM_VirtualSystemSnapshotService extends CIM_Service {

    public final static String CIM_CLASS_NAME = "CIM_VirtualSystemSnapshotService";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constant for method\'s name and parameters
     * Apply a virtual system snapshot to the virtual system that it was created from.
     */

    public static class METHOD_APPLYSNAPSHOT {
        /**
         * Constant for method ApplySnapshot
         */
        public final static String NAME = "ApplySnapshot";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Invalid_Type = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry Invalid Type (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Invalid_Type = "Invalid Type";

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

            if (VALUE_ENTRY_Invalid_Type.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Invalid_Type;
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

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Invalid_Type.intValue()) {
                return VALUE_ENTRY_Invalid_Type;
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
         * Value Map for the method ApplySnapshot   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Invalid_Type,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method ApplySnapshot   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Failed, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Invalid_State, VALUE_ENTRY_Invalid_Type,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_ENTRY_Method_Reserved, VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method ApplySnapshot   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Completed_with_No_Error, VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Timeout, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Invalid_State,
                VALUE_ENTRY_Invalid_Type, VALUE_ENTRY_Method_Parameters_Checked___Job_Started };

        /**
         * constants for parameter Snapshot
         */
        public static class PARAMETER_SNAPSHOT {
            /*
             * Name of the parameter Snapshot
             */
            public final static String NAME = "Snapshot";

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
     * Creates a snapshot of a virtual system.
     */

    public static class METHOD_CREATESNAPSHOT {
        /**
         * Constant for method CreateSnapshot
         */
        public final static String NAME = "CreateSnapshot";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Invalid_Type = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry Invalid Type (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Invalid_Type = "Invalid Type";

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

            if (VALUE_ENTRY_Invalid_Type.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Invalid_Type;
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

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Invalid_Type.intValue()) {
                return VALUE_ENTRY_Invalid_Type;
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
         * Value Map for the method CreateSnapshot   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Invalid_Type,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method CreateSnapshot   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Failed, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Invalid_State, VALUE_ENTRY_Invalid_Type,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_ENTRY_Method_Reserved, VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method CreateSnapshot   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Completed_with_No_Error, VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Timeout, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Invalid_State,
                VALUE_ENTRY_Invalid_Type, VALUE_ENTRY_Method_Parameters_Checked___Job_Started };

        /**
         * constants for parameter AffectedSystem
         */
        public static class PARAMETER_AFFECTEDSYSTEM {
            /*
             * Name of the parameter AffectedSystem
             */
            public final static String NAME = "AffectedSystem";

        }

        /**
         * constants for parameter SnapshotSettings
         */
        public static class PARAMETER_SNAPSHOTSETTINGS {
            /*
             * Name of the parameter SnapshotSettings
             */
            public final static String NAME = "SnapshotSettings";

        }

        /**
         * constants for parameter SnapshotType
         */
        public static class PARAMETER_SNAPSHOTTYPE {
            /*
             * Name of the parameter SnapshotType
             */
            public final static String NAME = "SnapshotType";

            /**
             * constant for value map entry 2
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Full_Snapshot = new javax.cim.UnsignedInteger16(
                    "2");

            /**
             * constant for value entry Full Snapshot (corresponds to mapEntry 2 )
             */
            public final static String VALUE_ENTRY_Full_Snapshot = "Full Snapshot";

            /**
             * constant for value map entry 3
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disk_Snapshot = new javax.cim.UnsignedInteger16(
                    "3");

            /**
             * constant for value entry Disk Snapshot (corresponds to mapEntry 3 )
             */
            public final static String VALUE_ENTRY_Disk_Snapshot = "Disk Snapshot";

            /**
             * constant for value map entry ..
             */

            /**
             * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
             */
            public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

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
            public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

                if (VALUE_ENTRY_Full_Snapshot.equals(value)) {
                    return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Full_Snapshot;
                }

                if (VALUE_ENTRY_Disk_Snapshot.equals(value)) {
                    return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disk_Snapshot;
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

                if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Full_Snapshot.intValue()) {
                    return VALUE_ENTRY_Full_Snapshot;
                }

                if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disk_Snapshot.intValue()) {
                    return VALUE_ENTRY_Disk_Snapshot;
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
             * Value Map for the parameter SnapshotType of the method CreateSnapshot   
             */
            public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                    VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Full_Snapshot,
                    VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disk_Snapshot };

            /**
             * Values
             * Contains all values even those having an integer value range representation within the valueMap
             * Value Map for the parameter SnapshotType of the method CreateSnapshot   
             */
            public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Full_Snapshot,
                    VALUE_ENTRY_Disk_Snapshot, VALUE_ENTRY_DMTF_Reserved,
                    VALUE_ENTRY_Vendor_Specific };

            /**
             * Values for displaying within pulldown elements, lists, radio buttons etc
             * Contains no values that having an integer value range representation within the valueMap
             * 
             * Value Map for the parameter SnapshotType of the method CreateSnapshot   
             */
            public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Full_Snapshot,
                    VALUE_ENTRY_Disk_Snapshot };

        }

        /**
         * constants for parameter ResultingSnapshot
         */
        public static class PARAMETER_RESULTINGSNAPSHOT {
            /*
             * Name of the parameter ResultingSnapshot
             */
            public final static String NAME = "ResultingSnapshot";

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
     * Destroy an existing virtual system snapshot.This method may as a side effect destroy other snapshots that are dependent on the affected snapshot.
     */

    public static class METHOD_DESTROYSNAPSHOT {
        /**
         * Constant for method DestroySnapshot
         */
        public final static String NAME = "DestroySnapshot";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Invalid_Type = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry Invalid Type (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Invalid_Type = "Invalid Type";

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

            if (VALUE_ENTRY_Invalid_Type.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Invalid_Type;
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

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Invalid_Type.intValue()) {
                return VALUE_ENTRY_Invalid_Type;
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
         * Value Map for the method DestroySnapshot   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_State,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Invalid_Type,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method DestroySnapshot   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Failed, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Invalid_State, VALUE_ENTRY_Invalid_Type,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_ENTRY_Method_Reserved, VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method DestroySnapshot   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Completed_with_No_Error, VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Timeout, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Invalid_State,
                VALUE_ENTRY_Invalid_Type, VALUE_ENTRY_Method_Parameters_Checked___Job_Started };

        /**
         * constants for parameter AffectedSnapshot
         */
        public static class PARAMETER_AFFECTEDSNAPSHOT {
            /*
             * Name of the parameter AffectedSnapshot
             */
            public final static String NAME = "AffectedSnapshot";

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
     *   Service to create, apply and destroy snapshots of virtual systems.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_VirtualSystemSnapshotService(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Service to create, apply and destroy snapshots of virtual systems.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_VirtualSystemSnapshotService(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_VirtualSystemSnapshotService() {
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
     * Invokes the Method ApplySnapshot
     * <br>
     * @param client the cimclient
     * Apply a virtual system snapshot to the virtual system that it was created from.
     *   @param Snapshot Reference to the virtual system snapshot.
     *   @param Job If the operation is long running, then optionally a job may be returned.
     *
     */

    public ApplySnapshotResult invoke_ApplySnapshot(WBEMClient cimClient
                                 ,CIM_VirtualSystemSettingData Snapshot
                      ,CIM_ConcreteJob Job
                      ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[2];
       CIMArgument[] outParameter = new CIMArgument[1];
    
                    inParameter[0] = ( Snapshot == null ? null : new CIMArgument("Snapshot", new CIMDataType(CIM_VirtualSystemSettingData.CIM_CLASS_NAME), Snapshot.getCimObjectPath()) );
       
                    inParameter[1] = ( Job == null ? null : new CIMArgument("Job", new CIMDataType(CIM_ConcreteJob.CIM_CLASS_NAME), Job.getCimObjectPath()) );
       
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_APPLYSNAPSHOT.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_APPLYSNAPSHOT.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        ApplySnapshotResult result = new ApplySnapshotResult();
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
     * Result object for the method ApplySnapshot
     */
    public static class ApplySnapshotResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        ApplySnapshotResult() {
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
     * Invokes the Method CreateSnapshot
     * <br>
     * @param client the cimclient
     * Creates a snapshot of a virtual system.
     *   @param AffectedSystem Reference to the affected virtual system.
     *   @param SnapshotSettings Parameter settings.
     *   @param SnapshotType Requested snapshot type:
     *     Full Snapshot: Complete snapshot of the virtual system.
     *     Disk Snapshot: Snapshot of virtual system disks.
     *   @param ResultingSnapshot Resulting virtual system snapshot
     *   @param Job If the operation is long running, then optionally a job may be returned. In this case, the instance of the CIM_VirtualSystemSettingData class representing the new virtual system snapshot is presented via the CIM_AffectedJobElement association with the value of the AffectedElement property referring to the new instance of the CIM_VirtualSystemSettingData class representing the virtual system snapshot and and the value of the ElementEffects set to 5 (Create).
     *
     */

    public CreateSnapshotResult invoke_CreateSnapshot(WBEMClient cimClient
                                 ,CIM_ComputerSystem AffectedSystem
                      ,CIM_SettingData SnapshotSettings
                      ,javax.cim.UnsignedInteger16 SnapshotType
                      ,CIM_VirtualSystemSettingData ResultingSnapshot
                      ,CIM_ConcreteJob Job
                      ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[5];
       CIMArgument[] outParameter = new CIMArgument[2];
    
                    inParameter[0] = ( AffectedSystem == null ? null : new CIMArgument("AffectedSystem", new CIMDataType(CIM_ComputerSystem.CIM_CLASS_NAME), AffectedSystem.getCimObjectPath()) );
       
                    inParameter[1] = ( SnapshotSettings == null ? null : new CIMArgument("SnapshotSettings", CIMDataType.OBJECT_T, SnapshotSettings.getCimInstance()) );
       
                    inParameter[2] = ( SnapshotType == null ? null : new CIMArgument("SnapshotType", CIMDataType.UINT16_T, SnapshotType) );
       
                    inParameter[3] = ( ResultingSnapshot == null ? null : new CIMArgument("ResultingSnapshot", new CIMDataType(CIM_VirtualSystemSettingData.CIM_CLASS_NAME), ResultingSnapshot.getCimObjectPath()) );
       
                    inParameter[4] = ( Job == null ? null : new CIMArgument("Job", new CIMDataType(CIM_ConcreteJob.CIM_CLASS_NAME), Job.getCimObjectPath()) );
       
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_CREATESNAPSHOT.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_CREATESNAPSHOT.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        CreateSnapshotResult result = new CreateSnapshotResult();
        result.setResultObject(resultObject);

        java.util.HashMap<String, CIMArgument> mapOutParameter = new java.util.HashMap<String, CIMArgument>();
        for (int i = 0; i < outParameter.length; i++) {
           CIMArgument argument = outParameter[i];
           if (argument != null)
           {
              mapOutParameter.put(argument.getName(), argument);
           }
        }
                
        
        CIMArgument arg_ResultingSnapshot = (CIMArgument) mapOutParameter.get("ResultingSnapshot");
        if (arg_ResultingSnapshot != null)
       	 {
                                          CIM_VirtualSystemSettingData out_ResultingSnapshot = CIM_VirtualSystemSettingDataHelper.getInstance(cimClient,(CIMObjectPath)arg_ResultingSnapshot.getValue());
                                    
           result.set_ResultingSnapshot(out_ResultingSnapshot);
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
     * Result object for the method CreateSnapshot
     */
    public static class CreateSnapshotResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        CreateSnapshotResult() {
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
         * The out parameter ResultingSnapshot
         */
        CIM_VirtualSystemSettingData ResultingSnapshot = null;

        /**
         * Set the out parameter ResultingSnapshot
         * @param value
         */
        void set_ResultingSnapshot(CIM_VirtualSystemSettingData value) {
            this.ResultingSnapshot = value;
        }

        /**
         * get the out parameter ResultingSnapshot
         * @return
         */
        public CIM_VirtualSystemSettingData get_ResultingSnapshot() {
            return this.ResultingSnapshot;
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
     * Invokes the Method DestroySnapshot
     * <br>
     * @param client the cimclient
     * Destroy an existing virtual system snapshot.This method may as a side effect destroy other snapshots that are dependent on the affected snapshot.
     *   @param AffectedSnapshot Reference to the affected virtual system snapshot.
     *   @param Job If the operation is long running, then optionally a job may be returned.
     *
     */

    public DestroySnapshotResult invoke_DestroySnapshot(WBEMClient cimClient
                                 ,CIM_VirtualSystemSettingData AffectedSnapshot
                      ,CIM_ConcreteJob Job
                      ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[2];
       CIMArgument[] outParameter = new CIMArgument[1];
    
                    inParameter[0] = ( AffectedSnapshot == null ? null : new CIMArgument("AffectedSnapshot", new CIMDataType(CIM_VirtualSystemSettingData.CIM_CLASS_NAME), AffectedSnapshot.getCimObjectPath()) );
       
                    inParameter[1] = ( Job == null ? null : new CIMArgument("Job", new CIMDataType(CIM_ConcreteJob.CIM_CLASS_NAME), Job.getCimObjectPath()) );
       
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_DESTROYSNAPSHOT.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_DESTROYSNAPSHOT.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        DestroySnapshotResult result = new DestroySnapshotResult();
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
     * Result object for the method DestroySnapshot
     */
    public static class DestroySnapshotResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        DestroySnapshotResult() {
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

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_VirtualSystemSnapshotService.CIM_CLASS_NAME;
    }

}