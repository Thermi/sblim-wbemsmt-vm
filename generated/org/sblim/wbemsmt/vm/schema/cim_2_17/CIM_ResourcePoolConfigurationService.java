/**
 * CIM_ResourcePoolConfigurationService.java Â© Copyright IBM Corp. 2006,2007 THIS FILE IS PROVIDED
 * UNDER THE TER MS OF THE COMMON PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR
 * DISTRIBUTION OF THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a
 * current copy of the Common Public License from http://www.opensource.org/licenses/cpl1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: This service provides for active management
 *            of Resource Pools. It allows jobs to be started for the creation and deletion of
 *            ResourcePools as well as addition and subtraction of host resources from ResourcePools
 *            generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import javax.wbem.*;

public class CIM_ResourcePoolConfigurationService extends CIM_Service {

    public final static String CIM_CLASS_NAME = "CIM_ResourcePoolConfigurationService";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constant for method\'s name and parameters
     * Starts a job to add resources to a ResourcePool. If 0 is returned, then the task completed successfully and the use of ConcreteJob was not required. If the task will take some time to complete, a ConcreteJob will be created and its reference returned in the output parameter Job. The resulting pool will be a root pool with no parent pool.
     */

    public static class METHOD_ADDRESOURCESTORESOURCEPOOL {
        /**
         * Constant for method AddResourcesToResourcePool
         */
        public final static String NAME = "AddResourcesToResourcePool";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error = new javax.cim.UnsignedInteger32(
                "0");

        /**
         * constant for value entry Job Completed with No Error (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Job_Completed_with_No_Error = "Job Completed with No Error";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed = new javax.cim.UnsignedInteger32(
                "4");

        /**
         * constant for value entry Failed (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Failed = "Failed";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter = new javax.cim.UnsignedInteger32(
                "5");

        /**
         * constant for value entry Invalid Parameter (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Invalid_Parameter = "Invalid Parameter";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry In Use (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_In_Use = "In Use";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool = new javax.cim.UnsignedInteger32(
                "7");

        /**
         * constant for value entry Incorrect ResourceType for the Pool (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool = "Incorrect ResourceType for the Pool";

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
         * constant for value map entry 4097
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported = new javax.cim.UnsignedInteger32(
                "4097");

        /**
         * constant for value entry Size Not Supported (corresponds to mapEntry 4097 )
         */
        public final static String VALUE_ENTRY_Size_Not_Supported = "Size Not Supported";

        /**
         * constant for value map entry 4098..32767
         */

        /**
         * constant for value entry Method Reserved (corresponds to mapEntry 4098..32767 )
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

            if (VALUE_ENTRY_Job_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Timeout.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout;
            }

            if (VALUE_ENTRY_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed;
            }

            if (VALUE_ENTRY_Invalid_Parameter.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter;
            }

            if (VALUE_ENTRY_In_Use.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use;
            }

            if (VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool;
            }

            if (VALUE_ENTRY_Method_Parameters_Checked___Job_Started.equals(value)) {
                return VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (VALUE_ENTRY_Size_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error.intValue()) {
                return VALUE_ENTRY_Job_Completed_with_No_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported.intValue()) {
                return VALUE_ENTRY_Not_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout.intValue()) {
                return VALUE_ENTRY_Timeout;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed.intValue()) {
                return VALUE_ENTRY_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter.intValue()) {
                return VALUE_ENTRY_Invalid_Parameter;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use.intValue()) {
                return VALUE_ENTRY_In_Use;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool
                    .intValue()) {
                return VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool;
            }

            if (iValue == VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started
                    .intValue()) {
                return VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (iValue == VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported.intValue()) {
                return VALUE_ENTRY_Size_Not_Supported;
            }

            if (iValue >= 4098 || iValue <= 32767) {
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
         * Value Map for the method AddResourcesToResourcePool   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method AddResourcesToResourcePool   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Unknown, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Failed, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_In_Use,
                VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_ENTRY_Size_Not_Supported, VALUE_ENTRY_Method_Reserved,
                VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method AddResourcesToResourcePool   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Job_Completed_with_No_Error, VALUE_ENTRY_Not_Supported,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Timeout, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_In_Use,
                VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started, VALUE_ENTRY_Size_Not_Supported };

        /**
         * constants for parameter HostResources
         */
        public static class PARAMETER_HOSTRESOURCES {
            /*
             * Name of the parameter HostResources
             */
            public final static String NAME = "HostResources";

        }

        /**
         * constants for parameter Pool
         */
        public static class PARAMETER_POOL {
            /*
             * Name of the parameter Pool
             */
            public final static String NAME = "Pool";

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
     * Start a job to change a parent pool using the specified allocation settings If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to change the parent pool. The Job's reference will be returned in the output parameter Job.
     */

    public static class METHOD_CHANGEPARENTRESOURCEPOOL {
        /**
         * Constant for method ChangeParentResourcePool
         */
        public final static String NAME = "ChangeParentResourcePool";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error = new javax.cim.UnsignedInteger32(
                "0");

        /**
         * constant for value entry Job Completed with No Error (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Job_Completed_with_No_Error = "Job Completed with No Error";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed = new javax.cim.UnsignedInteger32(
                "4");

        /**
         * constant for value entry Failed (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Failed = "Failed";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter = new javax.cim.UnsignedInteger32(
                "5");

        /**
         * constant for value entry Invalid Parameter (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Invalid_Parameter = "Invalid Parameter";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry In Use (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_In_Use = "In Use";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool = new javax.cim.UnsignedInteger32(
                "7");

        /**
         * constant for value entry Incorrect ResourceType for the Pool (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool = "Incorrect ResourceType for the Pool";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Insufficient_Resources = new javax.cim.UnsignedInteger32(
                "8");

        /**
         * constant for value entry Insufficient Resources (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Insufficient_Resources = "Insufficient Resources";

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
         * constant for value map entry 4097
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported = new javax.cim.UnsignedInteger32(
                "4097");

        /**
         * constant for value entry Size Not Supported (corresponds to mapEntry 4097 )
         */
        public final static String VALUE_ENTRY_Size_Not_Supported = "Size Not Supported";

        /**
         * constant for value map entry 4098..32767
         */

        /**
         * constant for value entry Method Reserved (corresponds to mapEntry 4098..32767 )
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

            if (VALUE_ENTRY_Job_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Timeout.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout;
            }

            if (VALUE_ENTRY_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed;
            }

            if (VALUE_ENTRY_Invalid_Parameter.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter;
            }

            if (VALUE_ENTRY_In_Use.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use;
            }

            if (VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool;
            }

            if (VALUE_ENTRY_Insufficient_Resources.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Insufficient_Resources;
            }

            if (VALUE_ENTRY_Method_Parameters_Checked___Job_Started.equals(value)) {
                return VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (VALUE_ENTRY_Size_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error.intValue()) {
                return VALUE_ENTRY_Job_Completed_with_No_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported.intValue()) {
                return VALUE_ENTRY_Not_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout.intValue()) {
                return VALUE_ENTRY_Timeout;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed.intValue()) {
                return VALUE_ENTRY_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter.intValue()) {
                return VALUE_ENTRY_Invalid_Parameter;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use.intValue()) {
                return VALUE_ENTRY_In_Use;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool
                    .intValue()) {
                return VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Insufficient_Resources.intValue()) {
                return VALUE_ENTRY_Insufficient_Resources;
            }

            if (iValue == VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started
                    .intValue()) {
                return VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (iValue == VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported.intValue()) {
                return VALUE_ENTRY_Size_Not_Supported;
            }

            if (iValue >= 4098 || iValue <= 32767) {
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
         * Value Map for the method ChangeParentResourcePool   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Insufficient_Resources,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method ChangeParentResourcePool   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Unknown, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Failed, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_In_Use,
                VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool,
                VALUE_ENTRY_Insufficient_Resources, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_ENTRY_Size_Not_Supported, VALUE_ENTRY_Method_Reserved,
                VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method ChangeParentResourcePool   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Job_Completed_with_No_Error, VALUE_ENTRY_Not_Supported,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Timeout, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_In_Use,
                VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool,
                VALUE_ENTRY_Insufficient_Resources,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started, VALUE_ENTRY_Size_Not_Supported };

        /**
         * constants for parameter ChildPool
         */
        public static class PARAMETER_CHILDPOOL {
            /*
             * Name of the parameter ChildPool
             */
            public final static String NAME = "ChildPool";

        }

        /**
         * constants for parameter ParentPool
         */
        public static class PARAMETER_PARENTPOOL {
            /*
             * Name of the parameter ParentPool
             */
            public final static String NAME = "ParentPool";

        }

        /**
         * constants for parameter Settings
         */
        public static class PARAMETER_SETTINGS {
            /*
             * Name of the parameter Settings
             */
            public final static String NAME = "Settings";

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
     * Start a job to create a sub-pool from a parent pool using the specified allocation settings If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to create the sub-pool. The Job's reference will be returned in the output parameter Job.
     */

    public static class METHOD_CREATECHILDRESOURCEPOOL {
        /**
         * Constant for method CreateChildResourcePool
         */
        public final static String NAME = "CreateChildResourcePool";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error = new javax.cim.UnsignedInteger32(
                "0");

        /**
         * constant for value entry Job Completed with No Error (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Job_Completed_with_No_Error = "Job Completed with No Error";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed = new javax.cim.UnsignedInteger32(
                "4");

        /**
         * constant for value entry Failed (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Failed = "Failed";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter = new javax.cim.UnsignedInteger32(
                "5");

        /**
         * constant for value entry Invalid Parameter (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Invalid_Parameter = "Invalid Parameter";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry In Use (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_In_Use = "In Use";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool = new javax.cim.UnsignedInteger32(
                "7");

        /**
         * constant for value entry Incorrect ResourceType for the Pool (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool = "Incorrect ResourceType for the Pool";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Insufficient_Resources = new javax.cim.UnsignedInteger32(
                "8");

        /**
         * constant for value entry Insufficient Resources (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Insufficient_Resources = "Insufficient Resources";

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
         * constant for value map entry 4097
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported = new javax.cim.UnsignedInteger32(
                "4097");

        /**
         * constant for value entry Size Not Supported (corresponds to mapEntry 4097 )
         */
        public final static String VALUE_ENTRY_Size_Not_Supported = "Size Not Supported";

        /**
         * constant for value map entry 4098..32767
         */

        /**
         * constant for value entry Method Reserved (corresponds to mapEntry 4098..32767 )
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

            if (VALUE_ENTRY_Job_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Timeout.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout;
            }

            if (VALUE_ENTRY_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed;
            }

            if (VALUE_ENTRY_Invalid_Parameter.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter;
            }

            if (VALUE_ENTRY_In_Use.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use;
            }

            if (VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool;
            }

            if (VALUE_ENTRY_Insufficient_Resources.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Insufficient_Resources;
            }

            if (VALUE_ENTRY_Method_Parameters_Checked___Job_Started.equals(value)) {
                return VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (VALUE_ENTRY_Size_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error.intValue()) {
                return VALUE_ENTRY_Job_Completed_with_No_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported.intValue()) {
                return VALUE_ENTRY_Not_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout.intValue()) {
                return VALUE_ENTRY_Timeout;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed.intValue()) {
                return VALUE_ENTRY_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter.intValue()) {
                return VALUE_ENTRY_Invalid_Parameter;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use.intValue()) {
                return VALUE_ENTRY_In_Use;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool
                    .intValue()) {
                return VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Insufficient_Resources.intValue()) {
                return VALUE_ENTRY_Insufficient_Resources;
            }

            if (iValue == VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started
                    .intValue()) {
                return VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (iValue == VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported.intValue()) {
                return VALUE_ENTRY_Size_Not_Supported;
            }

            if (iValue >= 4098 || iValue <= 32767) {
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
         * Value Map for the method CreateChildResourcePool   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Insufficient_Resources,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method CreateChildResourcePool   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Unknown, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Failed, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_In_Use,
                VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool,
                VALUE_ENTRY_Insufficient_Resources, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_ENTRY_Size_Not_Supported, VALUE_ENTRY_Method_Reserved,
                VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method CreateChildResourcePool   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Job_Completed_with_No_Error, VALUE_ENTRY_Not_Supported,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Timeout, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_In_Use,
                VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool,
                VALUE_ENTRY_Insufficient_Resources,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started, VALUE_ENTRY_Size_Not_Supported };

        /**
         * constants for parameter ElementName
         */
        public static class PARAMETER_ELEMENTNAME {
            /*
             * Name of the parameter ElementName
             */
            public final static String NAME = "ElementName";

        }

        /**
         * constants for parameter Settings
         */
        public static class PARAMETER_SETTINGS {
            /*
             * Name of the parameter Settings
             */
            public final static String NAME = "Settings";

        }

        /**
         * constants for parameter ParentPool
         */
        public static class PARAMETER_PARENTPOOL {
            /*
             * Name of the parameter ParentPool
             */
            public final static String NAME = "ParentPool";

        }

        /**
         * constants for parameter Pool
         */
        public static class PARAMETER_POOL {
            /*
             * Name of the parameter Pool
             */
            public final static String NAME = "Pool";

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
     * Starts a job to create a root ResourcePool. The ResourcePool will be scoped to the same System as this Service. If 0 is returned, then the task completed successfully and the use of ConcreteJob was not required. If the task will take some time to complete, a ConcreteJob will be created and its reference returned in the output parameter Job. The resulting pool will be a root pool with no parent pool.
     */

    public static class METHOD_CREATERESOURCEPOOL {
        /**
         * Constant for method CreateResourcePool
         */
        public final static String NAME = "CreateResourcePool";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error = new javax.cim.UnsignedInteger32(
                "0");

        /**
         * constant for value entry Job Completed with No Error (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Job_Completed_with_No_Error = "Job Completed with No Error";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed = new javax.cim.UnsignedInteger32(
                "4");

        /**
         * constant for value entry Failed (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Failed = "Failed";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter = new javax.cim.UnsignedInteger32(
                "5");

        /**
         * constant for value entry Invalid Parameter (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Invalid_Parameter = "Invalid Parameter";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry In Use (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_In_Use = "In Use";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool = new javax.cim.UnsignedInteger32(
                "7");

        /**
         * constant for value entry Incorrect ResourceType for the Pool (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool = "Incorrect ResourceType for the Pool";

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
         * constant for value map entry 4097
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported = new javax.cim.UnsignedInteger32(
                "4097");

        /**
         * constant for value entry Size Not Supported (corresponds to mapEntry 4097 )
         */
        public final static String VALUE_ENTRY_Size_Not_Supported = "Size Not Supported";

        /**
         * constant for value map entry 4098..32767
         */

        /**
         * constant for value entry Method Reserved (corresponds to mapEntry 4098..32767 )
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

            if (VALUE_ENTRY_Job_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Timeout.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout;
            }

            if (VALUE_ENTRY_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed;
            }

            if (VALUE_ENTRY_Invalid_Parameter.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter;
            }

            if (VALUE_ENTRY_In_Use.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use;
            }

            if (VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool;
            }

            if (VALUE_ENTRY_Method_Parameters_Checked___Job_Started.equals(value)) {
                return VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (VALUE_ENTRY_Size_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error.intValue()) {
                return VALUE_ENTRY_Job_Completed_with_No_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported.intValue()) {
                return VALUE_ENTRY_Not_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout.intValue()) {
                return VALUE_ENTRY_Timeout;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed.intValue()) {
                return VALUE_ENTRY_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter.intValue()) {
                return VALUE_ENTRY_Invalid_Parameter;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use.intValue()) {
                return VALUE_ENTRY_In_Use;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool
                    .intValue()) {
                return VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool;
            }

            if (iValue == VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started
                    .intValue()) {
                return VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (iValue == VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported.intValue()) {
                return VALUE_ENTRY_Size_Not_Supported;
            }

            if (iValue >= 4098 || iValue <= 32767) {
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
         * Value Map for the method CreateResourcePool   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method CreateResourcePool   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Unknown, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Failed, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_In_Use,
                VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_ENTRY_Size_Not_Supported, VALUE_ENTRY_Method_Reserved,
                VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method CreateResourcePool   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Job_Completed_with_No_Error, VALUE_ENTRY_Not_Supported,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Timeout, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_In_Use,
                VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started, VALUE_ENTRY_Size_Not_Supported };

        /**
         * constants for parameter ElementName
         */
        public static class PARAMETER_ELEMENTNAME {
            /*
             * Name of the parameter ElementName
             */
            public final static String NAME = "ElementName";

        }

        /**
         * constants for parameter HostResources
         */
        public static class PARAMETER_HOSTRESOURCES {
            /*
             * Name of the parameter HostResources
             */
            public final static String NAME = "HostResources";

        }

        /**
         * constants for parameter ResourceType
         */
        public static class PARAMETER_RESOURCETYPE {
            /*
             * Name of the parameter ResourceType
             */
            public final static String NAME = "ResourceType";

        }

        /**
         * constants for parameter Pool
         */
        public static class PARAMETER_POOL {
            /*
             * Name of the parameter Pool
             */
            public final static String NAME = "Pool";

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
     * Start a job to delete a ResourcePool. No allocations may be outstanding or the delete will fail with "In Use." If the resource pool is a root resource pool, any host resources are returned back to the underlying system. If 0 is returned, the function completed successfully, and no ConcreteJob was required. If 4096/0x1000 is returned, a ConcreteJob will be started to delete the ResourcePool. A reference to the Job is returned in the Job parameter.
     */

    public static class METHOD_DELETERESOURCEPOOL {
        /**
         * Constant for method DeleteResourcePool
         */
        public final static String NAME = "DeleteResourcePool";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error = new javax.cim.UnsignedInteger32(
                "0");

        /**
         * constant for value entry Job Completed with No Error (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Job_Completed_with_No_Error = "Job Completed with No Error";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed = new javax.cim.UnsignedInteger32(
                "4");

        /**
         * constant for value entry Failed (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Failed = "Failed";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter = new javax.cim.UnsignedInteger32(
                "5");

        /**
         * constant for value entry Invalid Parameter (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Invalid_Parameter = "Invalid Parameter";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry In Use (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_In_Use = "In Use";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool = new javax.cim.UnsignedInteger32(
                "7");

        /**
         * constant for value entry Incorrect ResourceType for the Pool (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool = "Incorrect ResourceType for the Pool";

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

            if (VALUE_ENTRY_Job_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Timeout.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout;
            }

            if (VALUE_ENTRY_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed;
            }

            if (VALUE_ENTRY_Invalid_Parameter.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter;
            }

            if (VALUE_ENTRY_In_Use.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use;
            }

            if (VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error.intValue()) {
                return VALUE_ENTRY_Job_Completed_with_No_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported.intValue()) {
                return VALUE_ENTRY_Not_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout.intValue()) {
                return VALUE_ENTRY_Timeout;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed.intValue()) {
                return VALUE_ENTRY_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter.intValue()) {
                return VALUE_ENTRY_Invalid_Parameter;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use.intValue()) {
                return VALUE_ENTRY_In_Use;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool
                    .intValue()) {
                return VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool;
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
         * Value Map for the method DeleteResourcePool   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method DeleteResourcePool   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Unknown, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Failed, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_In_Use,
                VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started, VALUE_ENTRY_Method_Reserved,
                VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method DeleteResourcePool   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Job_Completed_with_No_Error, VALUE_ENTRY_Not_Supported,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Timeout, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_In_Use,
                VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started };

        /**
         * constants for parameter Pool
         */
        public static class PARAMETER_POOL {
            /*
             * Name of the parameter Pool
             */
            public final static String NAME = "Pool";

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
     * Starts a job to remove resources from a ResourcePool. If 0 is returned, then the task completed successfully and the use of ConcreteJob was not required. If the task will take some time to complete, a ConcreteJob will be created and its reference returned in the output parameter Job. The resulting pool will be a root pool with no parent pool.
     */

    public static class METHOD_REMOVERESOURCESFROMRESOURCEPOOL {
        /**
         * Constant for method RemoveResourcesFromResourcePool
         */
        public final static String NAME = "RemoveResourcesFromResourcePool";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error = new javax.cim.UnsignedInteger32(
                "0");

        /**
         * constant for value entry Job Completed with No Error (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Job_Completed_with_No_Error = "Job Completed with No Error";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed = new javax.cim.UnsignedInteger32(
                "4");

        /**
         * constant for value entry Failed (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Failed = "Failed";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter = new javax.cim.UnsignedInteger32(
                "5");

        /**
         * constant for value entry Invalid Parameter (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Invalid_Parameter = "Invalid Parameter";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry In Use (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_In_Use = "In Use";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool = new javax.cim.UnsignedInteger32(
                "7");

        /**
         * constant for value entry Incorrect ResourceType for the Pool (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool = "Incorrect ResourceType for the Pool";

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
         * constant for value map entry 4097
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported = new javax.cim.UnsignedInteger32(
                "4097");

        /**
         * constant for value entry Size Not Supported (corresponds to mapEntry 4097 )
         */
        public final static String VALUE_ENTRY_Size_Not_Supported = "Size Not Supported";

        /**
         * constant for value map entry 4098..32767
         */

        /**
         * constant for value entry Method Reserved (corresponds to mapEntry 4098..32767 )
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

            if (VALUE_ENTRY_Job_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Timeout.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout;
            }

            if (VALUE_ENTRY_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed;
            }

            if (VALUE_ENTRY_Invalid_Parameter.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter;
            }

            if (VALUE_ENTRY_In_Use.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use;
            }

            if (VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool;
            }

            if (VALUE_ENTRY_Method_Parameters_Checked___Job_Started.equals(value)) {
                return VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (VALUE_ENTRY_Size_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error.intValue()) {
                return VALUE_ENTRY_Job_Completed_with_No_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported.intValue()) {
                return VALUE_ENTRY_Not_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout.intValue()) {
                return VALUE_ENTRY_Timeout;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed.intValue()) {
                return VALUE_ENTRY_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter.intValue()) {
                return VALUE_ENTRY_Invalid_Parameter;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use.intValue()) {
                return VALUE_ENTRY_In_Use;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool
                    .intValue()) {
                return VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool;
            }

            if (iValue == VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started
                    .intValue()) {
                return VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (iValue == VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported.intValue()) {
                return VALUE_ENTRY_Size_Not_Supported;
            }

            if (iValue >= 4098 || iValue <= 32767) {
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
         * Value Map for the method RemoveResourcesFromResourcePool   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Size_Not_Supported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method RemoveResourcesFromResourcePool   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Unknown, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Failed, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_In_Use,
                VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_ENTRY_Size_Not_Supported, VALUE_ENTRY_Method_Reserved,
                VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method RemoveResourcesFromResourcePool   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Job_Completed_with_No_Error, VALUE_ENTRY_Not_Supported,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Timeout, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_In_Use,
                VALUE_ENTRY_Incorrect_ResourceType_for_the_Pool,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started, VALUE_ENTRY_Size_Not_Supported };

        /**
         * constants for parameter HostResources
         */
        public static class PARAMETER_HOSTRESOURCES {
            /*
             * Name of the parameter HostResources
             */
            public final static String NAME = "HostResources";

        }

        /**
         * constants for parameter Pool
         */
        public static class PARAMETER_POOL {
            /*
             * Name of the parameter Pool
             */
            public final static String NAME = "Pool";

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
     *   This service provides for active management of Resource Pools. It allows jobs to be started for the creation and deletion of ResourcePools as well as addition and subtraction of host resources from ResourcePools
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ResourcePoolConfigurationService(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   This service provides for active management of Resource Pools. It allows jobs to be started for the creation and deletion of ResourcePools as well as addition and subtraction of host resources from ResourcePools
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ResourcePoolConfigurationService(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ResourcePoolConfigurationService() {
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
     * Invokes the Method AddResourcesToResourcePool
     * <br>
     * @param client the cimclient
     * Starts a job to add resources to a ResourcePool. If 0 is returned, then the task completed successfully and the use of ConcreteJob was not required. If the task will take some time to complete, a ConcreteJob will be created and its reference returned in the output parameter Job. The resulting pool will be a root pool with no parent pool.
     *   @param HostResources Array of CIM_LogicalDevice instances to add to the Pool.
     *   @param Pool The pool to add the resources to.
     *
     */

    public AddResourcesToResourcePoolResult invoke_AddResourcesToResourcePool(WBEMClient cimClient
                                 ,CIM_LogicalDevice[] HostResources
                      ,CIM_ResourcePool Pool
                      ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[2];
       CIMArgument[] outParameter = new CIMArgument[1];
    
                    inParameter[0] = ( HostResources == null ? null : new CIMArgument("HostResources", new CIMDataType(CIM_LogicalDevice.CIM_CLASS_NAME,0), getCIMObjectPathes(HostResources)) );
       
                    inParameter[1] = ( Pool == null ? null : new CIMArgument("Pool", new CIMDataType(CIM_ResourcePool.CIM_CLASS_NAME), Pool.getCimObjectPath()) );
       
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_ADDRESOURCESTORESOURCEPOOL.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_ADDRESOURCESTORESOURCEPOOL.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        AddResourcesToResourcePoolResult result = new AddResourcesToResourcePoolResult();
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
     * Result object for the method AddResourcesToResourcePool
     */
    public static class AddResourcesToResourcePoolResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        AddResourcesToResourcePoolResult() {
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
     * Invokes the Method ChangeParentResourcePool
     * <br>
     * @param client the cimclient
     * Start a job to change a parent pool using the specified allocation settings If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to change the parent pool. The Job's reference will be returned in the output parameter Job.
     *   @param ChildPool Reference to the child pool.
     *   @param ParentPool Reference to the parent pool(s).
     *   @param Settings Optional string containing a representation of a CIM_SettingData instance that is used to specify the settings for the Parent Pool.
     *
     */

    public ChangeParentResourcePoolResult invoke_ChangeParentResourcePool(WBEMClient cimClient
                                 ,CIM_ResourcePool ChildPool
                      ,CIM_ResourcePool[] ParentPool
                      ,CIM_ResourceAllocationSettingData[] Settings
                      ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[3];
       CIMArgument[] outParameter = new CIMArgument[1];
    
                    inParameter[0] = ( ChildPool == null ? null : new CIMArgument("ChildPool", new CIMDataType(CIM_ResourcePool.CIM_CLASS_NAME), ChildPool.getCimObjectPath()) );
       
                    inParameter[1] = ( ParentPool == null ? null : new CIMArgument("ParentPool", new CIMDataType(CIM_ResourcePool.CIM_CLASS_NAME,0), getCIMObjectPathes(ParentPool)) );
       
                    inParameter[2] = ( Settings == null ? null : new CIMArgument("Settings", CIMDataType.OBJECT_ARRAY_T, getCIMInstances(Settings)) );
       
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_CHANGEPARENTRESOURCEPOOL.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_CHANGEPARENTRESOURCEPOOL.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        ChangeParentResourcePoolResult result = new ChangeParentResourcePoolResult();
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
     * Result object for the method ChangeParentResourcePool
     */
    public static class ChangeParentResourcePoolResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        ChangeParentResourcePoolResult() {
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
     * Invokes the Method CreateChildResourcePool
     * <br>
     * @param client the cimclient
     * Start a job to create a sub-pool from a parent pool using the specified allocation settings If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to create the sub-pool. The Job's reference will be returned in the output parameter Job.
     *   @param ElementName A end user relevant name for the pool being created. If NULL, then a system supplied default name can be used. The value will be stored in the 'ElementName' property for the created element.
     *   @param Settings String containing a representation of a CIM_SettingData instance that is used to specify the settings for the child Pool.
     *   @param ParentPool The Pool(s) from which to create the new Pool.
     *
     */

    public CreateChildResourcePoolResult invoke_CreateChildResourcePool(WBEMClient cimClient
                                 ,String ElementName
                      ,CIM_ResourceAllocationSettingData[] Settings
                      ,CIM_ResourcePool[] ParentPool
                      ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[3];
       CIMArgument[] outParameter = new CIMArgument[2];
    
                    inParameter[0] = ( ElementName == null ? null : new CIMArgument("ElementName", CIMDataType.STRING_T, ElementName) );
       
                    inParameter[1] = ( Settings == null ? null : new CIMArgument("Settings", CIMDataType.OBJECT_ARRAY_T, getCIMInstances(Settings)) );
       
                    inParameter[2] = ( ParentPool == null ? null : new CIMArgument("ParentPool", new CIMDataType(CIM_ResourcePool.CIM_CLASS_NAME,0), getCIMObjectPathes(ParentPool)) );
       
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_CREATECHILDRESOURCEPOOL.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_CREATECHILDRESOURCEPOOL.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        CreateChildResourcePoolResult result = new CreateChildResourcePoolResult();
        result.setResultObject(resultObject);

        java.util.HashMap<String, CIMArgument> mapOutParameter = new java.util.HashMap<String, CIMArgument>();
        for (int i = 0; i < outParameter.length; i++) {
           CIMArgument argument = outParameter[i];
           if (argument != null)
           {
              mapOutParameter.put(argument.getName(), argument);
           }
        }
                
        
        CIMArgument arg_Pool = (CIMArgument) mapOutParameter.get("Pool");
        if (arg_Pool != null)
       	 {
                                          CIM_ResourcePool out_Pool = CIM_ResourcePoolHelper.getInstance(cimClient,(CIMObjectPath)arg_Pool.getValue());
                                    
           result.set_Pool(out_Pool);
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
     * Result object for the method CreateChildResourcePool
     */
    public static class CreateChildResourcePoolResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        CreateChildResourcePoolResult() {
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
         * The out parameter Pool
         */
        CIM_ResourcePool Pool = null;

        /**
         * Set the out parameter Pool
         * @param value
         */
        void set_Pool(CIM_ResourcePool value) {
            this.Pool = value;
        }

        /**
         * get the out parameter Pool
         * @return
         */
        public CIM_ResourcePool get_Pool() {
            return this.Pool;
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
     * Invokes the Method CreateResourcePool
     * <br>
     * @param client the cimclient
     * Starts a job to create a root ResourcePool. The ResourcePool will be scoped to the same System as this Service. If 0 is returned, then the task completed successfully and the use of ConcreteJob was not required. If the task will take some time to complete, a ConcreteJob will be created and its reference returned in the output parameter Job. The resulting pool will be a root pool with no parent pool.
     *   @param ElementName A end user relevant name for the pool being created. If NULL, then a system supplied default name can be used. The value will be stored in the 'ElementName' property for the created pool.
     *   @param HostResources Array of zero or more devices that are used to create the Pool or modify the source extents. All elements in the array must be of the same type.
     *   @param ResourceType The type of resources the created poolwill manage. If HostResources contains elements, this property must mach their type.
     *
     */

    public CreateResourcePoolResult invoke_CreateResourcePool(WBEMClient cimClient
                                 ,String ElementName
                      ,CIM_LogicalDevice[] HostResources
                      ,String ResourceType
                      ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[3];
       CIMArgument[] outParameter = new CIMArgument[2];
    
                    inParameter[0] = ( ElementName == null ? null : new CIMArgument("ElementName", CIMDataType.STRING_T, ElementName) );
       
                    inParameter[1] = ( HostResources == null ? null : new CIMArgument("HostResources", new CIMDataType(CIM_LogicalDevice.CIM_CLASS_NAME,0), getCIMObjectPathes(HostResources)) );
       
                    inParameter[2] = ( ResourceType == null ? null : new CIMArgument("ResourceType", CIMDataType.STRING_T, ResourceType) );
       
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_CREATERESOURCEPOOL.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_CREATERESOURCEPOOL.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        CreateResourcePoolResult result = new CreateResourcePoolResult();
        result.setResultObject(resultObject);

        java.util.HashMap<String, CIMArgument> mapOutParameter = new java.util.HashMap<String, CIMArgument>();
        for (int i = 0; i < outParameter.length; i++) {
           CIMArgument argument = outParameter[i];
           if (argument != null)
           {
              mapOutParameter.put(argument.getName(), argument);
           }
        }
                
        
        CIMArgument arg_Pool = (CIMArgument) mapOutParameter.get("Pool");
        if (arg_Pool != null)
       	 {
                                          CIM_ResourcePool out_Pool = CIM_ResourcePoolHelper.getInstance(cimClient,(CIMObjectPath)arg_Pool.getValue());
                                    
           result.set_Pool(out_Pool);
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
     * Result object for the method CreateResourcePool
     */
    public static class CreateResourcePoolResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        CreateResourcePoolResult() {
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
         * The out parameter Pool
         */
        CIM_ResourcePool Pool = null;

        /**
         * Set the out parameter Pool
         * @param value
         */
        void set_Pool(CIM_ResourcePool value) {
            this.Pool = value;
        }

        /**
         * get the out parameter Pool
         * @return
         */
        public CIM_ResourcePool get_Pool() {
            return this.Pool;
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
     * Invokes the Method DeleteResourcePool
     * <br>
     * @param client the cimclient
     * Start a job to delete a ResourcePool. No allocations may be outstanding or the delete will fail with "In Use." If the resource pool is a root resource pool, any host resources are returned back to the underlying system. If 0 is returned, the function completed successfully, and no ConcreteJob was required. If 4096/0x1000 is returned, a ConcreteJob will be started to delete the ResourcePool. A reference to the Job is returned in the Job parameter.
     *   @param Pool Reference to the pool to delete.
     *
     */

    public DeleteResourcePoolResult invoke_DeleteResourcePool(WBEMClient cimClient
                                 ,CIM_ResourcePool Pool
                      ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[1];
       CIMArgument[] outParameter = new CIMArgument[1];
    
                    inParameter[0] = ( Pool == null ? null : new CIMArgument("Pool", new CIMDataType(CIM_ResourcePool.CIM_CLASS_NAME), Pool.getCimObjectPath()) );
       
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_DELETERESOURCEPOOL.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_DELETERESOURCEPOOL.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        DeleteResourcePoolResult result = new DeleteResourcePoolResult();
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
     * Result object for the method DeleteResourcePool
     */
    public static class DeleteResourcePoolResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        DeleteResourcePoolResult() {
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
     * Invokes the Method RemoveResourcesFromResourcePool
     * <br>
     * @param client the cimclient
     * Starts a job to remove resources from a ResourcePool. If 0 is returned, then the task completed successfully and the use of ConcreteJob was not required. If the task will take some time to complete, a ConcreteJob will be created and its reference returned in the output parameter Job. The resulting pool will be a root pool with no parent pool.
     *   @param HostResources Array of CIM_LogicalDevice instances to remove from the Pool.
     *   @param Pool The pool to remove the resources from.
     *
     */

    public RemoveResourcesFromResourcePoolResult invoke_RemoveResourcesFromResourcePool(WBEMClient cimClient
                                 ,CIM_LogicalDevice[] HostResources
                      ,CIM_ResourcePool Pool
                      ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[2];
       CIMArgument[] outParameter = new CIMArgument[1];
    
                    inParameter[0] = ( HostResources == null ? null : new CIMArgument("HostResources", new CIMDataType(CIM_LogicalDevice.CIM_CLASS_NAME,0), getCIMObjectPathes(HostResources)) );
       
                    inParameter[1] = ( Pool == null ? null : new CIMArgument("Pool", new CIMDataType(CIM_ResourcePool.CIM_CLASS_NAME), Pool.getCimObjectPath()) );
       
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_REMOVERESOURCESFROMRESOURCEPOOL.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_REMOVERESOURCESFROMRESOURCEPOOL.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        RemoveResourcesFromResourcePoolResult result = new RemoveResourcesFromResourcePoolResult();
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
     * Result object for the method RemoveResourcesFromResourcePool
     */
    public static class RemoveResourcesFromResourcePoolResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        RemoveResourcesFromResourcePoolResult() {
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
        return CIM_ResourcePoolConfigurationService.CIM_CLASS_NAME;
    }

}