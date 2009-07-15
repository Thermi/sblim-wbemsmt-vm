/** 
 * CIM_SoftwareInstallationService.java
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
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm
 *
 * Contributors:
 *    Prashanth Karnam <prkarnam@in.ibm.com> 
 * 
 * Description: A subclass of service which provides methods to install (or update) Software Identities in ManagedElements.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import javax.wbem.*;

public class CIM_SoftwareInstallationService extends CIM_Service {

    public final static String CIM_CLASS_NAME = "CIM_SoftwareInstallationService";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constant for method\'s name and parameters
     * This method allows a client application to determine whether a specific SoftwareIdentity can be installed (or updated) on a ManagedElement. It also allows other characteristics to be determined such as whether install will require a reboot. In addition a client can check whether the SoftwareIdentity can be added simulataneously to a specified SofwareIndentityCollection. A client MAY specify either or both of the Collection and Target parameters. The Collection parameter is only supported if SoftwareInstallationService.CanAddToCollection is TRUE.
     */

    public static class METHOD_CHECKSOFTWAREIDENTITY {
        /**
         * Constant for method CheckSoftwareIdentity
         */
        public final static String NAME = "CheckSoftwareIdentity";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unspecified_Error = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Unspecified Error (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unspecified_Error = "Unspecified Error";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Target_In_Use = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry Target In Use (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Target_In_Use = "Target In Use";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Reserved = new javax.cim.UnsignedInteger32(
                "4096");

        /**
         * constant for value entry Method Reserved (corresponds to mapEntry 4096 )
         */
        public final static String VALUE_ENTRY_Method_Reserved = "Method Reserved";

        /**
         * constant for value map entry 4097
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Unsupported_TargetType = new javax.cim.UnsignedInteger32(
                "4097");

        /**
         * constant for value entry Unsupported TargetType (corresponds to mapEntry 4097 )
         */
        public final static String VALUE_ENTRY_Unsupported_TargetType = "Unsupported TargetType";

        /**
         * constant for value map entry 4098
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Unattended_silent_installation_not_supported = new javax.cim.UnsignedInteger32(
                "4098");

        /**
         * constant for value entry Unattended/silent installation not supported (corresponds to mapEntry 4098 )
         */
        public final static String VALUE_ENTRY_Unattended_silent_installation_not_supported = "Unattended/silent installation not supported";

        /**
         * constant for value map entry 4099
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Downgrade_reinstall_not_supported = new javax.cim.UnsignedInteger32(
                "4099");

        /**
         * constant for value entry Downgrade/reinstall not supported (corresponds to mapEntry 4099 )
         */
        public final static String VALUE_ENTRY_Downgrade_reinstall_not_supported = "Downgrade/reinstall not supported";

        /**
         * constant for value map entry 4100
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_Not_enough_memory = new javax.cim.UnsignedInteger32(
                "4100");

        /**
         * constant for value entry Not enough memory (corresponds to mapEntry 4100 )
         */
        public final static String VALUE_ENTRY_Not_enough_memory = "Not enough memory";

        /**
         * constant for value map entry 4101
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_Not_enough_swap_space = new javax.cim.UnsignedInteger32(
                "4101");

        /**
         * constant for value entry Not enough swap-space (corresponds to mapEntry 4101 )
         */
        public final static String VALUE_ENTRY_Not_enough_swap_space = "Not enough swap-space";

        /**
         * constant for value map entry 4102
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_Unsupported_version_transition = new javax.cim.UnsignedInteger32(
                "4102");

        /**
         * constant for value entry Unsupported version transition (corresponds to mapEntry 4102 )
         */
        public final static String VALUE_ENTRY_Unsupported_version_transition = "Unsupported version transition";

        /**
         * constant for value map entry 4103
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_Not_enough_disk_space = new javax.cim.UnsignedInteger32(
                "4103");

        /**
         * constant for value entry Not enough disk space (corresponds to mapEntry 4103 )
         */
        public final static String VALUE_ENTRY_Not_enough_disk_space = "Not enough disk space";

        /**
         * constant for value map entry 4104
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_Software_and_target_operating_system_mismatch = new javax.cim.UnsignedInteger32(
                "4104");

        /**
         * constant for value entry Software and target operating system mismatch (corresponds to mapEntry 4104 )
         */
        public final static String VALUE_ENTRY_Software_and_target_operating_system_mismatch = "Software and target operating system mismatch";

        /**
         * constant for value map entry 4105
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_Missing_dependencies = new javax.cim.UnsignedInteger32(
                "4105");

        /**
         * constant for value entry Missing dependencies (corresponds to mapEntry 4105 )
         */
        public final static String VALUE_ENTRY_Missing_dependencies = "Missing dependencies";

        /**
         * constant for value map entry 4106
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_Not_applicable_to_target = new javax.cim.UnsignedInteger32(
                "4106");

        /**
         * constant for value entry Not applicable to target (corresponds to mapEntry 4106 )
         */
        public final static String VALUE_ENTRY_Not_applicable_to_target = "Not applicable to target";

        /**
         * constant for value map entry 4107
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_No_supported_path_to_image = new javax.cim.UnsignedInteger32(
                "4107");

        /**
         * constant for value entry No supported path to image (corresponds to mapEntry 4107 )
         */
        public final static String VALUE_ENTRY_No_supported_path_to_image = "No supported path to image";

        /**
         * constant for value map entry 4108
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4108_FOR_VALUE_ENTRY_Cannot_add_to_Collection = new javax.cim.UnsignedInteger32(
                "4108");

        /**
         * constant for value entry Cannot add to Collection (corresponds to mapEntry 4108 )
         */
        public final static String VALUE_ENTRY_Cannot_add_to_Collection = "Cannot add to Collection";

        /**
         * constant for value map entry 4109
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4109_FOR_VALUE_ENTRY_Asynchronous_Job_already_in_progress = new javax.cim.UnsignedInteger32(
                "4109");

        /**
         * constant for value entry Asynchronous Job already in progress (corresponds to mapEntry 4109 )
         */
        public final static String VALUE_ENTRY_Asynchronous_Job_already_in_progress = "Asynchronous Job already in progress";

        /**
         * constant for value map entry 4110..32767
         */

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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@e2e0e2e
        public static javax.cim.UnsignedInteger32 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Job_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Unspecified_Error.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unspecified_Error;
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

            if (VALUE_ENTRY_Target_In_Use.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Target_In_Use;
            }

            if (VALUE_ENTRY_Method_Reserved.equals(value)) {
                return VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Reserved;
            }

            if (VALUE_ENTRY_Unsupported_TargetType.equals(value)) {
                return VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Unsupported_TargetType;
            }

            if (VALUE_ENTRY_Unattended_silent_installation_not_supported.equals(value)) {
                return VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Unattended_silent_installation_not_supported;
            }

            if (VALUE_ENTRY_Downgrade_reinstall_not_supported.equals(value)) {
                return VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Downgrade_reinstall_not_supported;
            }

            if (VALUE_ENTRY_Not_enough_memory.equals(value)) {
                return VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_Not_enough_memory;
            }

            if (VALUE_ENTRY_Not_enough_swap_space.equals(value)) {
                return VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_Not_enough_swap_space;
            }

            if (VALUE_ENTRY_Unsupported_version_transition.equals(value)) {
                return VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_Unsupported_version_transition;
            }

            if (VALUE_ENTRY_Not_enough_disk_space.equals(value)) {
                return VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_Not_enough_disk_space;
            }

            if (VALUE_ENTRY_Software_and_target_operating_system_mismatch.equals(value)) {
                return VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_Software_and_target_operating_system_mismatch;
            }

            if (VALUE_ENTRY_Missing_dependencies.equals(value)) {
                return VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_Missing_dependencies;
            }

            if (VALUE_ENTRY_Not_applicable_to_target.equals(value)) {
                return VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_Not_applicable_to_target;
            }

            if (VALUE_ENTRY_No_supported_path_to_image.equals(value)) {
                return VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_No_supported_path_to_image;
            }

            if (VALUE_ENTRY_Cannot_add_to_Collection.equals(value)) {
                return VALUE_MAP_ENTRY_4108_FOR_VALUE_ENTRY_Cannot_add_to_Collection;
            }

            if (VALUE_ENTRY_Asynchronous_Job_already_in_progress.equals(value)) {
                return VALUE_MAP_ENTRY_4109_FOR_VALUE_ENTRY_Asynchronous_Job_already_in_progress;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unspecified_Error.intValue()) {
                return VALUE_ENTRY_Unspecified_Error;
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

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Target_In_Use.intValue()) {
                return VALUE_ENTRY_Target_In_Use;
            }

            if (iValue == VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Reserved.intValue()) {
                return VALUE_ENTRY_Method_Reserved;
            }

            if (iValue == VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Unsupported_TargetType.intValue()) {
                return VALUE_ENTRY_Unsupported_TargetType;
            }

            if (iValue == VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Unattended_silent_installation_not_supported
                    .intValue()) {
                return VALUE_ENTRY_Unattended_silent_installation_not_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Downgrade_reinstall_not_supported
                    .intValue()) {
                return VALUE_ENTRY_Downgrade_reinstall_not_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_Not_enough_memory.intValue()) {
                return VALUE_ENTRY_Not_enough_memory;
            }

            if (iValue == VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_Not_enough_swap_space.intValue()) {
                return VALUE_ENTRY_Not_enough_swap_space;
            }

            if (iValue == VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_Unsupported_version_transition
                    .intValue()) {
                return VALUE_ENTRY_Unsupported_version_transition;
            }

            if (iValue == VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_Not_enough_disk_space.intValue()) {
                return VALUE_ENTRY_Not_enough_disk_space;
            }

            if (iValue == VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_Software_and_target_operating_system_mismatch
                    .intValue()) {
                return VALUE_ENTRY_Software_and_target_operating_system_mismatch;
            }

            if (iValue == VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_Missing_dependencies.intValue()) {
                return VALUE_ENTRY_Missing_dependencies;
            }

            if (iValue == VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_Not_applicable_to_target.intValue()) {
                return VALUE_ENTRY_Not_applicable_to_target;
            }

            if (iValue == VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_No_supported_path_to_image
                    .intValue()) {
                return VALUE_ENTRY_No_supported_path_to_image;
            }

            if (iValue == VALUE_MAP_ENTRY_4108_FOR_VALUE_ENTRY_Cannot_add_to_Collection.intValue()) {
                return VALUE_ENTRY_Cannot_add_to_Collection;
            }

            if (iValue == VALUE_MAP_ENTRY_4109_FOR_VALUE_ENTRY_Asynchronous_Job_already_in_progress
                    .intValue()) {
                return VALUE_ENTRY_Asynchronous_Job_already_in_progress;
            }

            if (iValue >= 4110 || iValue <= 32767) {
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
         * Value Map for the method CheckSoftwareIdentity   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unspecified_Error,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Target_In_Use,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Reserved,
                VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Unsupported_TargetType,
                VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Unattended_silent_installation_not_supported,
                VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Downgrade_reinstall_not_supported,
                VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_Not_enough_memory,
                VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_Not_enough_swap_space,
                VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_Unsupported_version_transition,
                VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_Not_enough_disk_space,
                VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_Software_and_target_operating_system_mismatch,
                VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_Missing_dependencies,
                VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_Not_applicable_to_target,
                VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_No_supported_path_to_image,
                VALUE_MAP_ENTRY_4108_FOR_VALUE_ENTRY_Cannot_add_to_Collection,
                VALUE_MAP_ENTRY_4109_FOR_VALUE_ENTRY_Asynchronous_Job_already_in_progress };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method CheckSoftwareIdentity   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Unspecified_Error, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Failed, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Target_In_Use,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Method_Reserved,
                VALUE_ENTRY_Unsupported_TargetType,
                VALUE_ENTRY_Unattended_silent_installation_not_supported,
                VALUE_ENTRY_Downgrade_reinstall_not_supported, VALUE_ENTRY_Not_enough_memory,
                VALUE_ENTRY_Not_enough_swap_space, VALUE_ENTRY_Unsupported_version_transition,
                VALUE_ENTRY_Not_enough_disk_space,
                VALUE_ENTRY_Software_and_target_operating_system_mismatch,
                VALUE_ENTRY_Missing_dependencies, VALUE_ENTRY_Not_applicable_to_target,
                VALUE_ENTRY_No_supported_path_to_image, VALUE_ENTRY_Cannot_add_to_Collection,
                VALUE_ENTRY_Asynchronous_Job_already_in_progress, VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method CheckSoftwareIdentity   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Job_Completed_with_No_Error, VALUE_ENTRY_Not_Supported,
                VALUE_ENTRY_Unspecified_Error, VALUE_ENTRY_Timeout, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Target_In_Use,
                VALUE_ENTRY_Method_Reserved, VALUE_ENTRY_Unsupported_TargetType,
                VALUE_ENTRY_Unattended_silent_installation_not_supported,
                VALUE_ENTRY_Downgrade_reinstall_not_supported, VALUE_ENTRY_Not_enough_memory,
                VALUE_ENTRY_Not_enough_swap_space, VALUE_ENTRY_Unsupported_version_transition,
                VALUE_ENTRY_Not_enough_disk_space,
                VALUE_ENTRY_Software_and_target_operating_system_mismatch,
                VALUE_ENTRY_Missing_dependencies, VALUE_ENTRY_Not_applicable_to_target,
                VALUE_ENTRY_No_supported_path_to_image, VALUE_ENTRY_Cannot_add_to_Collection,
                VALUE_ENTRY_Asynchronous_Job_already_in_progress };

        /**
         * constants for parameter Source
         */
        public static class PARAMETER_SOURCE {
            /*
             * Name of the parameter Source
             */
            public final static String NAME = "Source";

        }

        /**
         * constants for parameter Target
         */
        public static class PARAMETER_TARGET {
            /*
             * Name of the parameter Target
             */
            public final static String NAME = "Target";

        }

        /**
         * constants for parameter Collection
         */
        public static class PARAMETER_COLLECTION {
            /*
             * Name of the parameter Collection
             */
            public final static String NAME = "Collection";

        }

        /**
         * constants for parameter InstallCharacteristics
         */
        public static class PARAMETER_INSTALLCHARACTERISTICS {
            /*
             * Name of the parameter InstallCharacteristics
             */
            public final static String NAME = "InstallCharacteristics";

            /**
             * constant for value map entry 2
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Target_automatic_reset = new javax.cim.UnsignedInteger16(
                    "2");

            /**
             * constant for value entry Target automatic reset (corresponds to mapEntry 2 )
             */
            public final static String VALUE_ENTRY_Target_automatic_reset = "Target automatic reset";

            /**
             * constant for value map entry 3
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_System_automatic_reset = new javax.cim.UnsignedInteger16(
                    "3");

            /**
             * constant for value entry System automatic reset (corresponds to mapEntry 3 )
             */
            public final static String VALUE_ENTRY_System_automatic_reset = "System automatic reset";

            /**
             * constant for value map entry 4
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Separate_target_reset_Required = new javax.cim.UnsignedInteger16(
                    "4");

            /**
             * constant for value entry Separate target reset Required (corresponds to mapEntry 4 )
             */
            public final static String VALUE_ENTRY_Separate_target_reset_Required = "Separate target reset Required";

            /**
             * constant for value map entry 5
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Separate_system_reset_Required = new javax.cim.UnsignedInteger16(
                    "5");

            /**
             * constant for value entry Separate system reset Required (corresponds to mapEntry 5 )
             */
            public final static String VALUE_ENTRY_Separate_system_reset_Required = "Separate system reset Required";

            /**
             * constant for value map entry 6
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Manual_Reboot_Required = new javax.cim.UnsignedInteger16(
                    "6");

            /**
             * constant for value entry Manual Reboot Required (corresponds to mapEntry 6 )
             */
            public final static String VALUE_ENTRY_Manual_Reboot_Required = "Manual Reboot Required";

            /**
             * constant for value map entry 7
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_No_Reboot_Required = new javax.cim.UnsignedInteger16(
                    "7");

            /**
             * constant for value entry No Reboot Required (corresponds to mapEntry 7 )
             */
            public final static String VALUE_ENTRY_No_Reboot_Required = "No Reboot Required";

            /**
             * constant for value map entry 8
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_User_Intervention_recommended = new javax.cim.UnsignedInteger16(
                    "8");

            /**
             * constant for value entry User Intervention recommended (corresponds to mapEntry 8 )
             */
            public final static String VALUE_ENTRY_User_Intervention_recommended = "User Intervention recommended";

            /**
             * constant for value map entry 9
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_MAY_be_added_to_specified_Collection = new javax.cim.UnsignedInteger16(
                    "9");

            /**
             * constant for value entry MAY be added to specified Collection (corresponds to mapEntry 9 )
             */
            public final static String VALUE_ENTRY_MAY_be_added_to_specified_Collection = "MAY be added to specified Collection";

            /**
             * constant for value map entry ..
             */

            /**
             * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
             */
            public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

            /**
             * constant for value map entry 0x7FFF..0xFFFF
             */

            /**
             * constant for value entry Vendor Specific (corresponds to mapEntry 0x7FFF..0xFFFF )
             */
            public final static String VALUE_ENTRY_Vendor_Specific = "Vendor Specific";

            /**
             * get the ValueMapEntry of the given value
             * @param value the value to find the ValueMapEntry for
             * @return the ValueMap entry or null if not found
             */
            //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@75867586
            public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

                if (VALUE_ENTRY_Target_automatic_reset.equals(value)) {
                    return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Target_automatic_reset;
                }

                if (VALUE_ENTRY_System_automatic_reset.equals(value)) {
                    return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_System_automatic_reset;
                }

                if (VALUE_ENTRY_Separate_target_reset_Required.equals(value)) {
                    return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Separate_target_reset_Required;
                }

                if (VALUE_ENTRY_Separate_system_reset_Required.equals(value)) {
                    return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Separate_system_reset_Required;
                }

                if (VALUE_ENTRY_Manual_Reboot_Required.equals(value)) {
                    return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Manual_Reboot_Required;
                }

                if (VALUE_ENTRY_No_Reboot_Required.equals(value)) {
                    return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_No_Reboot_Required;
                }

                if (VALUE_ENTRY_User_Intervention_recommended.equals(value)) {
                    return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_User_Intervention_recommended;
                }

                if (VALUE_ENTRY_MAY_be_added_to_specified_Collection.equals(value)) {
                    return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_MAY_be_added_to_specified_Collection;
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

                if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Target_automatic_reset.intValue()) {
                    return VALUE_ENTRY_Target_automatic_reset;
                }

                if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_System_automatic_reset.intValue()) {
                    return VALUE_ENTRY_System_automatic_reset;
                }

                if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Separate_target_reset_Required
                        .intValue()) {
                    return VALUE_ENTRY_Separate_target_reset_Required;
                }

                if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Separate_system_reset_Required
                        .intValue()) {
                    return VALUE_ENTRY_Separate_system_reset_Required;
                }

                if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Manual_Reboot_Required.intValue()) {
                    return VALUE_ENTRY_Manual_Reboot_Required;
                }

                if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_No_Reboot_Required.intValue()) {
                    return VALUE_ENTRY_No_Reboot_Required;
                }

                if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_User_Intervention_recommended
                        .intValue()) {
                    return VALUE_ENTRY_User_Intervention_recommended;
                }

                if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_MAY_be_added_to_specified_Collection
                        .intValue()) {
                    return VALUE_ENTRY_MAY_be_added_to_specified_Collection;
                }

                if (iValue >= 0x7FFF || iValue <= 0xFFFF) {
                    return VALUE_ENTRY_Vendor_Specific;
                }
                return VALUE_ENTRY_DMTF_Reserved;

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
             * Value Map for the parameter InstallCharacteristics of the method CheckSoftwareIdentity   
             */
            public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                    VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Target_automatic_reset,
                    VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_System_automatic_reset,
                    VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Separate_target_reset_Required,
                    VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Separate_system_reset_Required,
                    VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Manual_Reboot_Required,
                    VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_No_Reboot_Required,
                    VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_User_Intervention_recommended,
                    VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_MAY_be_added_to_specified_Collection };

            /**
             * Values
             * Contains all values even those having an integer value range representation within the valueMap
             * Value Map for the parameter InstallCharacteristics of the method CheckSoftwareIdentity   
             */
            public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Target_automatic_reset,
                    VALUE_ENTRY_System_automatic_reset, VALUE_ENTRY_Separate_target_reset_Required,
                    VALUE_ENTRY_Separate_system_reset_Required, VALUE_ENTRY_Manual_Reboot_Required,
                    VALUE_ENTRY_No_Reboot_Required, VALUE_ENTRY_User_Intervention_recommended,
                    VALUE_ENTRY_MAY_be_added_to_specified_Collection, VALUE_ENTRY_DMTF_Reserved,
                    VALUE_ENTRY_Vendor_Specific };

            /**
             * Values for displaying within pulldown elements, lists, radio buttons etc
             * Contains no values that having an integer value range representation within the valueMap
             * 
             * Value Map for the parameter InstallCharacteristics of the method CheckSoftwareIdentity   
             */
            public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                    VALUE_ENTRY_Target_automatic_reset, VALUE_ENTRY_System_automatic_reset,
                    VALUE_ENTRY_Separate_target_reset_Required,
                    VALUE_ENTRY_Separate_system_reset_Required, VALUE_ENTRY_Manual_Reboot_Required,
                    VALUE_ENTRY_No_Reboot_Required, VALUE_ENTRY_User_Intervention_recommended,
                    VALUE_ENTRY_MAY_be_added_to_specified_Collection };

        }
    }

    /**
     * Constant for method\'s name and parameters
     * Start a job to download a series of bytes containing a software image to a ManagedElement. 
     * Note that this method is provided to support existing, alternative download mechanisms (such as used for firmware download). The 'normal' mechanism will be to use the InstallFromSoftwareIdentity method. 
     * If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to to perform the install. The Job's reference will be returned in the output parameter Job.
     */

    public static class METHOD_INSTALLFROMBYTESTREAM {
        /**
         * Constant for method InstallFromByteStream
         */
        public final static String NAME = "InstallFromByteStream";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unspecified_Error = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Unspecified Error (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unspecified_Error = "Unspecified Error";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Target_In_Use = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry Target In Use (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Target_In_Use = "Target In Use";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Unsupported_TargetType = new javax.cim.UnsignedInteger32(
                "4097");

        /**
         * constant for value entry Unsupported TargetType (corresponds to mapEntry 4097 )
         */
        public final static String VALUE_ENTRY_Unsupported_TargetType = "Unsupported TargetType";

        /**
         * constant for value map entry 4098
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Unattended_silent_installation_not_supported = new javax.cim.UnsignedInteger32(
                "4098");

        /**
         * constant for value entry Unattended/silent installation not supported (corresponds to mapEntry 4098 )
         */
        public final static String VALUE_ENTRY_Unattended_silent_installation_not_supported = "Unattended/silent installation not supported";

        /**
         * constant for value map entry 4099
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Downgrade_reinstall_not_supported = new javax.cim.UnsignedInteger32(
                "4099");

        /**
         * constant for value entry Downgrade/reinstall not supported (corresponds to mapEntry 4099 )
         */
        public final static String VALUE_ENTRY_Downgrade_reinstall_not_supported = "Downgrade/reinstall not supported";

        /**
         * constant for value map entry 4100
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_Not_enough_memory = new javax.cim.UnsignedInteger32(
                "4100");

        /**
         * constant for value entry Not enough memory (corresponds to mapEntry 4100 )
         */
        public final static String VALUE_ENTRY_Not_enough_memory = "Not enough memory";

        /**
         * constant for value map entry 4101
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_Not_enough_swap_space = new javax.cim.UnsignedInteger32(
                "4101");

        /**
         * constant for value entry Not enough swap-space (corresponds to mapEntry 4101 )
         */
        public final static String VALUE_ENTRY_Not_enough_swap_space = "Not enough swap-space";

        /**
         * constant for value map entry 4102
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_Unsupported_version_transition = new javax.cim.UnsignedInteger32(
                "4102");

        /**
         * constant for value entry Unsupported version transition (corresponds to mapEntry 4102 )
         */
        public final static String VALUE_ENTRY_Unsupported_version_transition = "Unsupported version transition";

        /**
         * constant for value map entry 4103
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_Not_enough_disk_space = new javax.cim.UnsignedInteger32(
                "4103");

        /**
         * constant for value entry Not enough disk space (corresponds to mapEntry 4103 )
         */
        public final static String VALUE_ENTRY_Not_enough_disk_space = "Not enough disk space";

        /**
         * constant for value map entry 4104
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_Software_and_target_operating_system_mismatch = new javax.cim.UnsignedInteger32(
                "4104");

        /**
         * constant for value entry Software and target operating system mismatch (corresponds to mapEntry 4104 )
         */
        public final static String VALUE_ENTRY_Software_and_target_operating_system_mismatch = "Software and target operating system mismatch";

        /**
         * constant for value map entry 4105
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_Missing_dependencies = new javax.cim.UnsignedInteger32(
                "4105");

        /**
         * constant for value entry Missing dependencies (corresponds to mapEntry 4105 )
         */
        public final static String VALUE_ENTRY_Missing_dependencies = "Missing dependencies";

        /**
         * constant for value map entry 4106
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_Not_applicable_to_target = new javax.cim.UnsignedInteger32(
                "4106");

        /**
         * constant for value entry Not applicable to target (corresponds to mapEntry 4106 )
         */
        public final static String VALUE_ENTRY_Not_applicable_to_target = "Not applicable to target";

        /**
         * constant for value map entry 4107
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_No_supported_path_to_image = new javax.cim.UnsignedInteger32(
                "4107");

        /**
         * constant for value entry No supported path to image (corresponds to mapEntry 4107 )
         */
        public final static String VALUE_ENTRY_No_supported_path_to_image = "No supported path to image";

        /**
         * constant for value map entry 4108..32767
         */

        /**
         * constant for value entry Method Reserved (corresponds to mapEntry 4108..32767 )
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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@77347734
        public static javax.cim.UnsignedInteger32 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Job_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Unspecified_Error.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unspecified_Error;
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

            if (VALUE_ENTRY_Target_In_Use.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Target_In_Use;
            }

            if (VALUE_ENTRY_Method_Parameters_Checked___Job_Started.equals(value)) {
                return VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (VALUE_ENTRY_Unsupported_TargetType.equals(value)) {
                return VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Unsupported_TargetType;
            }

            if (VALUE_ENTRY_Unattended_silent_installation_not_supported.equals(value)) {
                return VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Unattended_silent_installation_not_supported;
            }

            if (VALUE_ENTRY_Downgrade_reinstall_not_supported.equals(value)) {
                return VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Downgrade_reinstall_not_supported;
            }

            if (VALUE_ENTRY_Not_enough_memory.equals(value)) {
                return VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_Not_enough_memory;
            }

            if (VALUE_ENTRY_Not_enough_swap_space.equals(value)) {
                return VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_Not_enough_swap_space;
            }

            if (VALUE_ENTRY_Unsupported_version_transition.equals(value)) {
                return VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_Unsupported_version_transition;
            }

            if (VALUE_ENTRY_Not_enough_disk_space.equals(value)) {
                return VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_Not_enough_disk_space;
            }

            if (VALUE_ENTRY_Software_and_target_operating_system_mismatch.equals(value)) {
                return VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_Software_and_target_operating_system_mismatch;
            }

            if (VALUE_ENTRY_Missing_dependencies.equals(value)) {
                return VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_Missing_dependencies;
            }

            if (VALUE_ENTRY_Not_applicable_to_target.equals(value)) {
                return VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_Not_applicable_to_target;
            }

            if (VALUE_ENTRY_No_supported_path_to_image.equals(value)) {
                return VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_No_supported_path_to_image;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unspecified_Error.intValue()) {
                return VALUE_ENTRY_Unspecified_Error;
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

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Target_In_Use.intValue()) {
                return VALUE_ENTRY_Target_In_Use;
            }

            if (iValue == VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started
                    .intValue()) {
                return VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (iValue == VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Unsupported_TargetType.intValue()) {
                return VALUE_ENTRY_Unsupported_TargetType;
            }

            if (iValue == VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Unattended_silent_installation_not_supported
                    .intValue()) {
                return VALUE_ENTRY_Unattended_silent_installation_not_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Downgrade_reinstall_not_supported
                    .intValue()) {
                return VALUE_ENTRY_Downgrade_reinstall_not_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_Not_enough_memory.intValue()) {
                return VALUE_ENTRY_Not_enough_memory;
            }

            if (iValue == VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_Not_enough_swap_space.intValue()) {
                return VALUE_ENTRY_Not_enough_swap_space;
            }

            if (iValue == VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_Unsupported_version_transition
                    .intValue()) {
                return VALUE_ENTRY_Unsupported_version_transition;
            }

            if (iValue == VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_Not_enough_disk_space.intValue()) {
                return VALUE_ENTRY_Not_enough_disk_space;
            }

            if (iValue == VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_Software_and_target_operating_system_mismatch
                    .intValue()) {
                return VALUE_ENTRY_Software_and_target_operating_system_mismatch;
            }

            if (iValue == VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_Missing_dependencies.intValue()) {
                return VALUE_ENTRY_Missing_dependencies;
            }

            if (iValue == VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_Not_applicable_to_target.intValue()) {
                return VALUE_ENTRY_Not_applicable_to_target;
            }

            if (iValue == VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_No_supported_path_to_image
                    .intValue()) {
                return VALUE_ENTRY_No_supported_path_to_image;
            }

            if (iValue >= 4108 || iValue <= 32767) {
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
         * Value Map for the method InstallFromByteStream   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unspecified_Error,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Target_In_Use,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Unsupported_TargetType,
                VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Unattended_silent_installation_not_supported,
                VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Downgrade_reinstall_not_supported,
                VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_Not_enough_memory,
                VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_Not_enough_swap_space,
                VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_Unsupported_version_transition,
                VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_Not_enough_disk_space,
                VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_Software_and_target_operating_system_mismatch,
                VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_Missing_dependencies,
                VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_Not_applicable_to_target,
                VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_No_supported_path_to_image };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method InstallFromByteStream   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Unspecified_Error, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Failed, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Target_In_Use,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_ENTRY_Unsupported_TargetType,
                VALUE_ENTRY_Unattended_silent_installation_not_supported,
                VALUE_ENTRY_Downgrade_reinstall_not_supported, VALUE_ENTRY_Not_enough_memory,
                VALUE_ENTRY_Not_enough_swap_space, VALUE_ENTRY_Unsupported_version_transition,
                VALUE_ENTRY_Not_enough_disk_space,
                VALUE_ENTRY_Software_and_target_operating_system_mismatch,
                VALUE_ENTRY_Missing_dependencies, VALUE_ENTRY_Not_applicable_to_target,
                VALUE_ENTRY_No_supported_path_to_image, VALUE_ENTRY_Method_Reserved,
                VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method InstallFromByteStream   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Job_Completed_with_No_Error, VALUE_ENTRY_Not_Supported,
                VALUE_ENTRY_Unspecified_Error, VALUE_ENTRY_Timeout, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Target_In_Use,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_ENTRY_Unsupported_TargetType,
                VALUE_ENTRY_Unattended_silent_installation_not_supported,
                VALUE_ENTRY_Downgrade_reinstall_not_supported, VALUE_ENTRY_Not_enough_memory,
                VALUE_ENTRY_Not_enough_swap_space, VALUE_ENTRY_Unsupported_version_transition,
                VALUE_ENTRY_Not_enough_disk_space,
                VALUE_ENTRY_Software_and_target_operating_system_mismatch,
                VALUE_ENTRY_Missing_dependencies, VALUE_ENTRY_Not_applicable_to_target,
                VALUE_ENTRY_No_supported_path_to_image };

        /**
         * constants for parameter Job
         */
        public static class PARAMETER_JOB {
            /*
             * Name of the parameter Job
             */
            public final static String NAME = "Job";

        }

        /**
         * constants for parameter Image
         */
        public static class PARAMETER_IMAGE {
            /*
             * Name of the parameter Image
             */
            public final static String NAME = "Image";

        }

        /**
         * constants for parameter Target
         */
        public static class PARAMETER_TARGET {
            /*
             * Name of the parameter Target
             */
            public final static String NAME = "Target";

        }

        /**
         * constants for parameter InstallOptions
         */
        public static class PARAMETER_INSTALLOPTIONS {
            /*
             * Name of the parameter InstallOptions
             */
            public final static String NAME = "InstallOptions";

            /**
             * constant for value map entry 2
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Defer_target_system_reset = new javax.cim.UnsignedInteger16(
                    "2");

            /**
             * constant for value entry Defer target/system reset (corresponds to mapEntry 2 )
             */
            public final static String VALUE_ENTRY_Defer_target_system_reset = "Defer target/system reset";

            /**
             * constant for value map entry 3
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Force_installation = new javax.cim.UnsignedInteger16(
                    "3");

            /**
             * constant for value entry Force installation (corresponds to mapEntry 3 )
             */
            public final static String VALUE_ENTRY_Force_installation = "Force installation";

            /**
             * constant for value map entry 4
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Install = new javax.cim.UnsignedInteger16(
                    "4");

            /**
             * constant for value entry Install (corresponds to mapEntry 4 )
             */
            public final static String VALUE_ENTRY_Install = "Install";

            /**
             * constant for value map entry 5
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Update = new javax.cim.UnsignedInteger16(
                    "5");

            /**
             * constant for value entry Update (corresponds to mapEntry 5 )
             */
            public final static String VALUE_ENTRY_Update = "Update";

            /**
             * constant for value map entry 6
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Repair = new javax.cim.UnsignedInteger16(
                    "6");

            /**
             * constant for value entry Repair (corresponds to mapEntry 6 )
             */
            public final static String VALUE_ENTRY_Repair = "Repair";

            /**
             * constant for value map entry 7
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Reboot = new javax.cim.UnsignedInteger16(
                    "7");

            /**
             * constant for value entry Reboot (corresponds to mapEntry 7 )
             */
            public final static String VALUE_ENTRY_Reboot = "Reboot";

            /**
             * constant for value map entry 8
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Password = new javax.cim.UnsignedInteger16(
                    "8");

            /**
             * constant for value entry Password (corresponds to mapEntry 8 )
             */
            public final static String VALUE_ENTRY_Password = "Password";

            /**
             * constant for value map entry 9
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Uninstall = new javax.cim.UnsignedInteger16(
                    "9");

            /**
             * constant for value entry Uninstall (corresponds to mapEntry 9 )
             */
            public final static String VALUE_ENTRY_Uninstall = "Uninstall";

            /**
             * constant for value map entry 10
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Log = new javax.cim.UnsignedInteger16(
                    "10");

            /**
             * constant for value entry Log (corresponds to mapEntry 10 )
             */
            public final static String VALUE_ENTRY_Log = "Log";

            /**
             * constant for value map entry 11
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_SilentMode = new javax.cim.UnsignedInteger16(
                    "11");

            /**
             * constant for value entry SilentMode (corresponds to mapEntry 11 )
             */
            public final static String VALUE_ENTRY_SilentMode = "SilentMode";

            /**
             * constant for value map entry 12
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_AdministrativeMode = new javax.cim.UnsignedInteger16(
                    "12");

            /**
             * constant for value entry AdministrativeMode (corresponds to mapEntry 12 )
             */
            public final static String VALUE_ENTRY_AdministrativeMode = "AdministrativeMode";

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
            //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@26ca26ca
            public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

                if (VALUE_ENTRY_Defer_target_system_reset.equals(value)) {
                    return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Defer_target_system_reset;
                }

                if (VALUE_ENTRY_Force_installation.equals(value)) {
                    return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Force_installation;
                }

                if (VALUE_ENTRY_Install.equals(value)) {
                    return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Install;
                }

                if (VALUE_ENTRY_Update.equals(value)) {
                    return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Update;
                }

                if (VALUE_ENTRY_Repair.equals(value)) {
                    return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Repair;
                }

                if (VALUE_ENTRY_Reboot.equals(value)) {
                    return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Reboot;
                }

                if (VALUE_ENTRY_Password.equals(value)) {
                    return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Password;
                }

                if (VALUE_ENTRY_Uninstall.equals(value)) {
                    return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Uninstall;
                }

                if (VALUE_ENTRY_Log.equals(value)) {
                    return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Log;
                }

                if (VALUE_ENTRY_SilentMode.equals(value)) {
                    return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_SilentMode;
                }

                if (VALUE_ENTRY_AdministrativeMode.equals(value)) {
                    return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_AdministrativeMode;
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

                if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Defer_target_system_reset
                        .intValue()) {
                    return VALUE_ENTRY_Defer_target_system_reset;
                }

                if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Force_installation.intValue()) {
                    return VALUE_ENTRY_Force_installation;
                }

                if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Install.intValue()) {
                    return VALUE_ENTRY_Install;
                }

                if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Update.intValue()) {
                    return VALUE_ENTRY_Update;
                }

                if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Repair.intValue()) {
                    return VALUE_ENTRY_Repair;
                }

                if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Reboot.intValue()) {
                    return VALUE_ENTRY_Reboot;
                }

                if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Password.intValue()) {
                    return VALUE_ENTRY_Password;
                }

                if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Uninstall.intValue()) {
                    return VALUE_ENTRY_Uninstall;
                }

                if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Log.intValue()) {
                    return VALUE_ENTRY_Log;
                }

                if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_SilentMode.intValue()) {
                    return VALUE_ENTRY_SilentMode;
                }

                if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_AdministrativeMode.intValue()) {
                    return VALUE_ENTRY_AdministrativeMode;
                }

                if (iValue >= 32768 || iValue <= 65535) {
                    return VALUE_ENTRY_Vendor_Specific;
                }
                return VALUE_ENTRY_DMTF_Reserved;

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
             * Value Map for the parameter InstallOptions of the method InstallFromByteStream   
             */
            public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                    VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Defer_target_system_reset,
                    VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Force_installation,
                    VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Install,
                    VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Update,
                    VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Repair,
                    VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Reboot,
                    VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Password,
                    VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Uninstall,
                    VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Log,
                    VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_SilentMode,
                    VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_AdministrativeMode };

            /**
             * Values
             * Contains all values even those having an integer value range representation within the valueMap
             * Value Map for the parameter InstallOptions of the method InstallFromByteStream   
             */
            public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Defer_target_system_reset,
                    VALUE_ENTRY_Force_installation, VALUE_ENTRY_Install, VALUE_ENTRY_Update,
                    VALUE_ENTRY_Repair, VALUE_ENTRY_Reboot, VALUE_ENTRY_Password,
                    VALUE_ENTRY_Uninstall, VALUE_ENTRY_Log, VALUE_ENTRY_SilentMode,
                    VALUE_ENTRY_AdministrativeMode, VALUE_ENTRY_DMTF_Reserved,
                    VALUE_ENTRY_Vendor_Specific };

            /**
             * Values for displaying within pulldown elements, lists, radio buttons etc
             * Contains no values that having an integer value range representation within the valueMap
             * 
             * Value Map for the parameter InstallOptions of the method InstallFromByteStream   
             */
            public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                    VALUE_ENTRY_Defer_target_system_reset, VALUE_ENTRY_Force_installation,
                    VALUE_ENTRY_Install, VALUE_ENTRY_Update, VALUE_ENTRY_Repair,
                    VALUE_ENTRY_Reboot, VALUE_ENTRY_Password, VALUE_ENTRY_Uninstall,
                    VALUE_ENTRY_Log, VALUE_ENTRY_SilentMode, VALUE_ENTRY_AdministrativeMode };

        }

        /**
         * constants for parameter InstallOptionsValues
         */
        public static class PARAMETER_INSTALLOPTIONSVALUES {
            /*
             * Name of the parameter InstallOptionsValues
             */
            public final static String NAME = "InstallOptionsValues";

        }
    }

    /**
     * Constant for method\'s name and parameters
     * Start a job to install or update a SoftwareIdentity (Source) on a ManagedElement (Target). 
     * In addition the method can be used to add the SoftwareIdentity simulataneously to a specified SofwareIndentityCollection. A client MAY specify either or both of the Collection and Target parameters. The Collection parameter is only supported if SoftwareInstallationService.CanAddToCollection is TRUE. 
     * If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to perform the install. The Job's reference will be returned in the output parameter Job.
     */

    public static class METHOD_INSTALLFROMSOFTWAREIDENTITY {
        /**
         * Constant for method InstallFromSoftwareIdentity
         */
        public final static String NAME = "InstallFromSoftwareIdentity";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unspecified_Error = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Unspecified Error (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unspecified_Error = "Unspecified Error";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Target_In_Use = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry Target In Use (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Target_In_Use = "Target In Use";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Unsupported_TargetType = new javax.cim.UnsignedInteger32(
                "4097");

        /**
         * constant for value entry Unsupported TargetType (corresponds to mapEntry 4097 )
         */
        public final static String VALUE_ENTRY_Unsupported_TargetType = "Unsupported TargetType";

        /**
         * constant for value map entry 4098
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Unattended_silent_installation_not_supported = new javax.cim.UnsignedInteger32(
                "4098");

        /**
         * constant for value entry Unattended/silent installation not supported (corresponds to mapEntry 4098 )
         */
        public final static String VALUE_ENTRY_Unattended_silent_installation_not_supported = "Unattended/silent installation not supported";

        /**
         * constant for value map entry 4099
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Downgrade_reinstall_not_supported = new javax.cim.UnsignedInteger32(
                "4099");

        /**
         * constant for value entry Downgrade/reinstall not supported (corresponds to mapEntry 4099 )
         */
        public final static String VALUE_ENTRY_Downgrade_reinstall_not_supported = "Downgrade/reinstall not supported";

        /**
         * constant for value map entry 4100
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_Not_enough_memory = new javax.cim.UnsignedInteger32(
                "4100");

        /**
         * constant for value entry Not enough memory (corresponds to mapEntry 4100 )
         */
        public final static String VALUE_ENTRY_Not_enough_memory = "Not enough memory";

        /**
         * constant for value map entry 4101
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_Not_enough_swap_space = new javax.cim.UnsignedInteger32(
                "4101");

        /**
         * constant for value entry Not enough swap-space (corresponds to mapEntry 4101 )
         */
        public final static String VALUE_ENTRY_Not_enough_swap_space = "Not enough swap-space";

        /**
         * constant for value map entry 4102
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_Unsupported_version_transition = new javax.cim.UnsignedInteger32(
                "4102");

        /**
         * constant for value entry Unsupported version transition (corresponds to mapEntry 4102 )
         */
        public final static String VALUE_ENTRY_Unsupported_version_transition = "Unsupported version transition";

        /**
         * constant for value map entry 4103
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_Not_enough_disk_space = new javax.cim.UnsignedInteger32(
                "4103");

        /**
         * constant for value entry Not enough disk space (corresponds to mapEntry 4103 )
         */
        public final static String VALUE_ENTRY_Not_enough_disk_space = "Not enough disk space";

        /**
         * constant for value map entry 4104
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_Software_and_target_operating_system_mismatch = new javax.cim.UnsignedInteger32(
                "4104");

        /**
         * constant for value entry Software and target operating system mismatch (corresponds to mapEntry 4104 )
         */
        public final static String VALUE_ENTRY_Software_and_target_operating_system_mismatch = "Software and target operating system mismatch";

        /**
         * constant for value map entry 4105
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_Missing_dependencies = new javax.cim.UnsignedInteger32(
                "4105");

        /**
         * constant for value entry Missing dependencies (corresponds to mapEntry 4105 )
         */
        public final static String VALUE_ENTRY_Missing_dependencies = "Missing dependencies";

        /**
         * constant for value map entry 4106
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_Not_applicable_to_target = new javax.cim.UnsignedInteger32(
                "4106");

        /**
         * constant for value entry Not applicable to target (corresponds to mapEntry 4106 )
         */
        public final static String VALUE_ENTRY_Not_applicable_to_target = "Not applicable to target";

        /**
         * constant for value map entry 4107
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_No_supported_path_to_image = new javax.cim.UnsignedInteger32(
                "4107");

        /**
         * constant for value entry No supported path to image (corresponds to mapEntry 4107 )
         */
        public final static String VALUE_ENTRY_No_supported_path_to_image = "No supported path to image";

        /**
         * constant for value map entry 4108
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4108_FOR_VALUE_ENTRY_Cannot_add_to_Collection = new javax.cim.UnsignedInteger32(
                "4108");

        /**
         * constant for value entry Cannot add to Collection (corresponds to mapEntry 4108 )
         */
        public final static String VALUE_ENTRY_Cannot_add_to_Collection = "Cannot add to Collection";

        /**
         * constant for value map entry 4109..32767
         */

        /**
         * constant for value entry Method Reserved (corresponds to mapEntry 4109..32767 )
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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@1ec01ec0
        public static javax.cim.UnsignedInteger32 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Job_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Unspecified_Error.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unspecified_Error;
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

            if (VALUE_ENTRY_Target_In_Use.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Target_In_Use;
            }

            if (VALUE_ENTRY_Method_Parameters_Checked___Job_Started.equals(value)) {
                return VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (VALUE_ENTRY_Unsupported_TargetType.equals(value)) {
                return VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Unsupported_TargetType;
            }

            if (VALUE_ENTRY_Unattended_silent_installation_not_supported.equals(value)) {
                return VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Unattended_silent_installation_not_supported;
            }

            if (VALUE_ENTRY_Downgrade_reinstall_not_supported.equals(value)) {
                return VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Downgrade_reinstall_not_supported;
            }

            if (VALUE_ENTRY_Not_enough_memory.equals(value)) {
                return VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_Not_enough_memory;
            }

            if (VALUE_ENTRY_Not_enough_swap_space.equals(value)) {
                return VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_Not_enough_swap_space;
            }

            if (VALUE_ENTRY_Unsupported_version_transition.equals(value)) {
                return VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_Unsupported_version_transition;
            }

            if (VALUE_ENTRY_Not_enough_disk_space.equals(value)) {
                return VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_Not_enough_disk_space;
            }

            if (VALUE_ENTRY_Software_and_target_operating_system_mismatch.equals(value)) {
                return VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_Software_and_target_operating_system_mismatch;
            }

            if (VALUE_ENTRY_Missing_dependencies.equals(value)) {
                return VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_Missing_dependencies;
            }

            if (VALUE_ENTRY_Not_applicable_to_target.equals(value)) {
                return VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_Not_applicable_to_target;
            }

            if (VALUE_ENTRY_No_supported_path_to_image.equals(value)) {
                return VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_No_supported_path_to_image;
            }

            if (VALUE_ENTRY_Cannot_add_to_Collection.equals(value)) {
                return VALUE_MAP_ENTRY_4108_FOR_VALUE_ENTRY_Cannot_add_to_Collection;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unspecified_Error.intValue()) {
                return VALUE_ENTRY_Unspecified_Error;
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

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Target_In_Use.intValue()) {
                return VALUE_ENTRY_Target_In_Use;
            }

            if (iValue == VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started
                    .intValue()) {
                return VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (iValue == VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Unsupported_TargetType.intValue()) {
                return VALUE_ENTRY_Unsupported_TargetType;
            }

            if (iValue == VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Unattended_silent_installation_not_supported
                    .intValue()) {
                return VALUE_ENTRY_Unattended_silent_installation_not_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Downgrade_reinstall_not_supported
                    .intValue()) {
                return VALUE_ENTRY_Downgrade_reinstall_not_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_Not_enough_memory.intValue()) {
                return VALUE_ENTRY_Not_enough_memory;
            }

            if (iValue == VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_Not_enough_swap_space.intValue()) {
                return VALUE_ENTRY_Not_enough_swap_space;
            }

            if (iValue == VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_Unsupported_version_transition
                    .intValue()) {
                return VALUE_ENTRY_Unsupported_version_transition;
            }

            if (iValue == VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_Not_enough_disk_space.intValue()) {
                return VALUE_ENTRY_Not_enough_disk_space;
            }

            if (iValue == VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_Software_and_target_operating_system_mismatch
                    .intValue()) {
                return VALUE_ENTRY_Software_and_target_operating_system_mismatch;
            }

            if (iValue == VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_Missing_dependencies.intValue()) {
                return VALUE_ENTRY_Missing_dependencies;
            }

            if (iValue == VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_Not_applicable_to_target.intValue()) {
                return VALUE_ENTRY_Not_applicable_to_target;
            }

            if (iValue == VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_No_supported_path_to_image
                    .intValue()) {
                return VALUE_ENTRY_No_supported_path_to_image;
            }

            if (iValue == VALUE_MAP_ENTRY_4108_FOR_VALUE_ENTRY_Cannot_add_to_Collection.intValue()) {
                return VALUE_ENTRY_Cannot_add_to_Collection;
            }

            if (iValue >= 4109 || iValue <= 32767) {
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
         * Value Map for the method InstallFromSoftwareIdentity   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unspecified_Error,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Target_In_Use,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Unsupported_TargetType,
                VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Unattended_silent_installation_not_supported,
                VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Downgrade_reinstall_not_supported,
                VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_Not_enough_memory,
                VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_Not_enough_swap_space,
                VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_Unsupported_version_transition,
                VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_Not_enough_disk_space,
                VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_Software_and_target_operating_system_mismatch,
                VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_Missing_dependencies,
                VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_Not_applicable_to_target,
                VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_No_supported_path_to_image,
                VALUE_MAP_ENTRY_4108_FOR_VALUE_ENTRY_Cannot_add_to_Collection };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method InstallFromSoftwareIdentity   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Unspecified_Error, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Failed, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Target_In_Use,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_ENTRY_Unsupported_TargetType,
                VALUE_ENTRY_Unattended_silent_installation_not_supported,
                VALUE_ENTRY_Downgrade_reinstall_not_supported, VALUE_ENTRY_Not_enough_memory,
                VALUE_ENTRY_Not_enough_swap_space, VALUE_ENTRY_Unsupported_version_transition,
                VALUE_ENTRY_Not_enough_disk_space,
                VALUE_ENTRY_Software_and_target_operating_system_mismatch,
                VALUE_ENTRY_Missing_dependencies, VALUE_ENTRY_Not_applicable_to_target,
                VALUE_ENTRY_No_supported_path_to_image, VALUE_ENTRY_Cannot_add_to_Collection,
                VALUE_ENTRY_Method_Reserved, VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method InstallFromSoftwareIdentity   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Job_Completed_with_No_Error, VALUE_ENTRY_Not_Supported,
                VALUE_ENTRY_Unspecified_Error, VALUE_ENTRY_Timeout, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Target_In_Use,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_ENTRY_Unsupported_TargetType,
                VALUE_ENTRY_Unattended_silent_installation_not_supported,
                VALUE_ENTRY_Downgrade_reinstall_not_supported, VALUE_ENTRY_Not_enough_memory,
                VALUE_ENTRY_Not_enough_swap_space, VALUE_ENTRY_Unsupported_version_transition,
                VALUE_ENTRY_Not_enough_disk_space,
                VALUE_ENTRY_Software_and_target_operating_system_mismatch,
                VALUE_ENTRY_Missing_dependencies, VALUE_ENTRY_Not_applicable_to_target,
                VALUE_ENTRY_No_supported_path_to_image, VALUE_ENTRY_Cannot_add_to_Collection };

        /**
         * constants for parameter Job
         */
        public static class PARAMETER_JOB {
            /*
             * Name of the parameter Job
             */
            public final static String NAME = "Job";

        }

        /**
         * constants for parameter InstallOptions
         */
        public static class PARAMETER_INSTALLOPTIONS {
            /*
             * Name of the parameter InstallOptions
             */
            public final static String NAME = "InstallOptions";

            /**
             * constant for value map entry 2
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Defer_target_system_reset = new javax.cim.UnsignedInteger16(
                    "2");

            /**
             * constant for value entry Defer target/system reset (corresponds to mapEntry 2 )
             */
            public final static String VALUE_ENTRY_Defer_target_system_reset = "Defer target/system reset";

            /**
             * constant for value map entry 3
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Force_installation = new javax.cim.UnsignedInteger16(
                    "3");

            /**
             * constant for value entry Force installation (corresponds to mapEntry 3 )
             */
            public final static String VALUE_ENTRY_Force_installation = "Force installation";

            /**
             * constant for value map entry 4
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Install = new javax.cim.UnsignedInteger16(
                    "4");

            /**
             * constant for value entry Install (corresponds to mapEntry 4 )
             */
            public final static String VALUE_ENTRY_Install = "Install";

            /**
             * constant for value map entry 5
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Update = new javax.cim.UnsignedInteger16(
                    "5");

            /**
             * constant for value entry Update (corresponds to mapEntry 5 )
             */
            public final static String VALUE_ENTRY_Update = "Update";

            /**
             * constant for value map entry 6
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Repair = new javax.cim.UnsignedInteger16(
                    "6");

            /**
             * constant for value entry Repair (corresponds to mapEntry 6 )
             */
            public final static String VALUE_ENTRY_Repair = "Repair";

            /**
             * constant for value map entry 7
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Reboot = new javax.cim.UnsignedInteger16(
                    "7");

            /**
             * constant for value entry Reboot (corresponds to mapEntry 7 )
             */
            public final static String VALUE_ENTRY_Reboot = "Reboot";

            /**
             * constant for value map entry 8
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Password = new javax.cim.UnsignedInteger16(
                    "8");

            /**
             * constant for value entry Password (corresponds to mapEntry 8 )
             */
            public final static String VALUE_ENTRY_Password = "Password";

            /**
             * constant for value map entry 9
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Uninstall = new javax.cim.UnsignedInteger16(
                    "9");

            /**
             * constant for value entry Uninstall (corresponds to mapEntry 9 )
             */
            public final static String VALUE_ENTRY_Uninstall = "Uninstall";

            /**
             * constant for value map entry 10
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Log = new javax.cim.UnsignedInteger16(
                    "10");

            /**
             * constant for value entry Log (corresponds to mapEntry 10 )
             */
            public final static String VALUE_ENTRY_Log = "Log";

            /**
             * constant for value map entry 11
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_SilentMode = new javax.cim.UnsignedInteger16(
                    "11");

            /**
             * constant for value entry SilentMode (corresponds to mapEntry 11 )
             */
            public final static String VALUE_ENTRY_SilentMode = "SilentMode";

            /**
             * constant for value map entry 12
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_AdministrativeMode = new javax.cim.UnsignedInteger16(
                    "12");

            /**
             * constant for value entry AdministrativeMode (corresponds to mapEntry 12 )
             */
            public final static String VALUE_ENTRY_AdministrativeMode = "AdministrativeMode";

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
            //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@24422442
            public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

                if (VALUE_ENTRY_Defer_target_system_reset.equals(value)) {
                    return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Defer_target_system_reset;
                }

                if (VALUE_ENTRY_Force_installation.equals(value)) {
                    return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Force_installation;
                }

                if (VALUE_ENTRY_Install.equals(value)) {
                    return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Install;
                }

                if (VALUE_ENTRY_Update.equals(value)) {
                    return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Update;
                }

                if (VALUE_ENTRY_Repair.equals(value)) {
                    return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Repair;
                }

                if (VALUE_ENTRY_Reboot.equals(value)) {
                    return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Reboot;
                }

                if (VALUE_ENTRY_Password.equals(value)) {
                    return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Password;
                }

                if (VALUE_ENTRY_Uninstall.equals(value)) {
                    return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Uninstall;
                }

                if (VALUE_ENTRY_Log.equals(value)) {
                    return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Log;
                }

                if (VALUE_ENTRY_SilentMode.equals(value)) {
                    return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_SilentMode;
                }

                if (VALUE_ENTRY_AdministrativeMode.equals(value)) {
                    return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_AdministrativeMode;
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

                if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Defer_target_system_reset
                        .intValue()) {
                    return VALUE_ENTRY_Defer_target_system_reset;
                }

                if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Force_installation.intValue()) {
                    return VALUE_ENTRY_Force_installation;
                }

                if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Install.intValue()) {
                    return VALUE_ENTRY_Install;
                }

                if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Update.intValue()) {
                    return VALUE_ENTRY_Update;
                }

                if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Repair.intValue()) {
                    return VALUE_ENTRY_Repair;
                }

                if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Reboot.intValue()) {
                    return VALUE_ENTRY_Reboot;
                }

                if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Password.intValue()) {
                    return VALUE_ENTRY_Password;
                }

                if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Uninstall.intValue()) {
                    return VALUE_ENTRY_Uninstall;
                }

                if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Log.intValue()) {
                    return VALUE_ENTRY_Log;
                }

                if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_SilentMode.intValue()) {
                    return VALUE_ENTRY_SilentMode;
                }

                if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_AdministrativeMode.intValue()) {
                    return VALUE_ENTRY_AdministrativeMode;
                }

                if (iValue >= 32768 || iValue <= 65535) {
                    return VALUE_ENTRY_Vendor_Specific;
                }
                return VALUE_ENTRY_DMTF_Reserved;

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
             * Value Map for the parameter InstallOptions of the method InstallFromSoftwareIdentity   
             */
            public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                    VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Defer_target_system_reset,
                    VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Force_installation,
                    VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Install,
                    VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Update,
                    VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Repair,
                    VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Reboot,
                    VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Password,
                    VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Uninstall,
                    VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Log,
                    VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_SilentMode,
                    VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_AdministrativeMode };

            /**
             * Values
             * Contains all values even those having an integer value range representation within the valueMap
             * Value Map for the parameter InstallOptions of the method InstallFromSoftwareIdentity   
             */
            public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Defer_target_system_reset,
                    VALUE_ENTRY_Force_installation, VALUE_ENTRY_Install, VALUE_ENTRY_Update,
                    VALUE_ENTRY_Repair, VALUE_ENTRY_Reboot, VALUE_ENTRY_Password,
                    VALUE_ENTRY_Uninstall, VALUE_ENTRY_Log, VALUE_ENTRY_SilentMode,
                    VALUE_ENTRY_AdministrativeMode, VALUE_ENTRY_DMTF_Reserved,
                    VALUE_ENTRY_Vendor_Specific };

            /**
             * Values for displaying within pulldown elements, lists, radio buttons etc
             * Contains no values that having an integer value range representation within the valueMap
             * 
             * Value Map for the parameter InstallOptions of the method InstallFromSoftwareIdentity   
             */
            public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                    VALUE_ENTRY_Defer_target_system_reset, VALUE_ENTRY_Force_installation,
                    VALUE_ENTRY_Install, VALUE_ENTRY_Update, VALUE_ENTRY_Repair,
                    VALUE_ENTRY_Reboot, VALUE_ENTRY_Password, VALUE_ENTRY_Uninstall,
                    VALUE_ENTRY_Log, VALUE_ENTRY_SilentMode, VALUE_ENTRY_AdministrativeMode };

        }

        /**
         * constants for parameter InstallOptionsValues
         */
        public static class PARAMETER_INSTALLOPTIONSVALUES {
            /*
             * Name of the parameter InstallOptionsValues
             */
            public final static String NAME = "InstallOptionsValues";

        }

        /**
         * constants for parameter Source
         */
        public static class PARAMETER_SOURCE {
            /*
             * Name of the parameter Source
             */
            public final static String NAME = "Source";

        }

        /**
         * constants for parameter Target
         */
        public static class PARAMETER_TARGET {
            /*
             * Name of the parameter Target
             */
            public final static String NAME = "Target";

        }

        /**
         * constants for parameter Collection
         */
        public static class PARAMETER_COLLECTION {
            /*
             * Name of the parameter Collection
             */
            public final static String NAME = "Collection";

        }
    }

    /**
     * Constant for method\'s name and parameters
     * Start a job to install software from a specific URI in a ManagedElement. 
     * Note that this method is provided to support existing, alternative download mechanisms (such as used for firmware download). The 'normal' mechanism will be to use the InstallFromSoftwareIdentity method.
     * If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to to perform the install. The Job's reference will be returned in the output parameter Job.
     */

    public static class METHOD_INSTALLFROMURI {
        /**
         * Constant for method InstallFromURI
         */
        public final static String NAME = "InstallFromURI";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unspecified_Error = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Unspecified Error (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unspecified_Error = "Unspecified Error";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Target_In_Use = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry Target In Use (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Target_In_Use = "Target In Use";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Unsupported_TargetType = new javax.cim.UnsignedInteger32(
                "4097");

        /**
         * constant for value entry Unsupported TargetType (corresponds to mapEntry 4097 )
         */
        public final static String VALUE_ENTRY_Unsupported_TargetType = "Unsupported TargetType";

        /**
         * constant for value map entry 4098
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Unattended_silent_installation_not_supported = new javax.cim.UnsignedInteger32(
                "4098");

        /**
         * constant for value entry Unattended/silent installation not supported (corresponds to mapEntry 4098 )
         */
        public final static String VALUE_ENTRY_Unattended_silent_installation_not_supported = "Unattended/silent installation not supported";

        /**
         * constant for value map entry 4099
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Downgrade_reinstall_not_supported = new javax.cim.UnsignedInteger32(
                "4099");

        /**
         * constant for value entry Downgrade/reinstall not supported (corresponds to mapEntry 4099 )
         */
        public final static String VALUE_ENTRY_Downgrade_reinstall_not_supported = "Downgrade/reinstall not supported";

        /**
         * constant for value map entry 4100
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_Not_enough_memory = new javax.cim.UnsignedInteger32(
                "4100");

        /**
         * constant for value entry Not enough memory (corresponds to mapEntry 4100 )
         */
        public final static String VALUE_ENTRY_Not_enough_memory = "Not enough memory";

        /**
         * constant for value map entry 4101
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_Not_enough_swap_space = new javax.cim.UnsignedInteger32(
                "4101");

        /**
         * constant for value entry Not enough swap-space (corresponds to mapEntry 4101 )
         */
        public final static String VALUE_ENTRY_Not_enough_swap_space = "Not enough swap-space";

        /**
         * constant for value map entry 4102
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_Unsupported_version_transition = new javax.cim.UnsignedInteger32(
                "4102");

        /**
         * constant for value entry Unsupported version transition (corresponds to mapEntry 4102 )
         */
        public final static String VALUE_ENTRY_Unsupported_version_transition = "Unsupported version transition";

        /**
         * constant for value map entry 4103
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_Not_enough_disk_space = new javax.cim.UnsignedInteger32(
                "4103");

        /**
         * constant for value entry Not enough disk space (corresponds to mapEntry 4103 )
         */
        public final static String VALUE_ENTRY_Not_enough_disk_space = "Not enough disk space";

        /**
         * constant for value map entry 4104
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_Software_and_target_operating_system_mismatch = new javax.cim.UnsignedInteger32(
                "4104");

        /**
         * constant for value entry Software and target operating system mismatch (corresponds to mapEntry 4104 )
         */
        public final static String VALUE_ENTRY_Software_and_target_operating_system_mismatch = "Software and target operating system mismatch";

        /**
         * constant for value map entry 4105
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_Missing_dependencies = new javax.cim.UnsignedInteger32(
                "4105");

        /**
         * constant for value entry Missing dependencies (corresponds to mapEntry 4105 )
         */
        public final static String VALUE_ENTRY_Missing_dependencies = "Missing dependencies";

        /**
         * constant for value map entry 4106
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_Not_applicable_to_target = new javax.cim.UnsignedInteger32(
                "4106");

        /**
         * constant for value entry Not applicable to target (corresponds to mapEntry 4106 )
         */
        public final static String VALUE_ENTRY_Not_applicable_to_target = "Not applicable to target";

        /**
         * constant for value map entry 4107
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_URI_not_accessible = new javax.cim.UnsignedInteger32(
                "4107");

        /**
         * constant for value entry URI not accessible (corresponds to mapEntry 4107 )
         */
        public final static String VALUE_ENTRY_URI_not_accessible = "URI not accessible";

        /**
         * constant for value map entry 4108..32767
         */

        /**
         * constant for value entry Method Reserved (corresponds to mapEntry 4108..32767 )
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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@35dc35dc
        public static javax.cim.UnsignedInteger32 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Job_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Unspecified_Error.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unspecified_Error;
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

            if (VALUE_ENTRY_Target_In_Use.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Target_In_Use;
            }

            if (VALUE_ENTRY_Method_Parameters_Checked___Job_Started.equals(value)) {
                return VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (VALUE_ENTRY_Unsupported_TargetType.equals(value)) {
                return VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Unsupported_TargetType;
            }

            if (VALUE_ENTRY_Unattended_silent_installation_not_supported.equals(value)) {
                return VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Unattended_silent_installation_not_supported;
            }

            if (VALUE_ENTRY_Downgrade_reinstall_not_supported.equals(value)) {
                return VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Downgrade_reinstall_not_supported;
            }

            if (VALUE_ENTRY_Not_enough_memory.equals(value)) {
                return VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_Not_enough_memory;
            }

            if (VALUE_ENTRY_Not_enough_swap_space.equals(value)) {
                return VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_Not_enough_swap_space;
            }

            if (VALUE_ENTRY_Unsupported_version_transition.equals(value)) {
                return VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_Unsupported_version_transition;
            }

            if (VALUE_ENTRY_Not_enough_disk_space.equals(value)) {
                return VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_Not_enough_disk_space;
            }

            if (VALUE_ENTRY_Software_and_target_operating_system_mismatch.equals(value)) {
                return VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_Software_and_target_operating_system_mismatch;
            }

            if (VALUE_ENTRY_Missing_dependencies.equals(value)) {
                return VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_Missing_dependencies;
            }

            if (VALUE_ENTRY_Not_applicable_to_target.equals(value)) {
                return VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_Not_applicable_to_target;
            }

            if (VALUE_ENTRY_URI_not_accessible.equals(value)) {
                return VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_URI_not_accessible;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unspecified_Error.intValue()) {
                return VALUE_ENTRY_Unspecified_Error;
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

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Target_In_Use.intValue()) {
                return VALUE_ENTRY_Target_In_Use;
            }

            if (iValue == VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started
                    .intValue()) {
                return VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
            }

            if (iValue == VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Unsupported_TargetType.intValue()) {
                return VALUE_ENTRY_Unsupported_TargetType;
            }

            if (iValue == VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Unattended_silent_installation_not_supported
                    .intValue()) {
                return VALUE_ENTRY_Unattended_silent_installation_not_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Downgrade_reinstall_not_supported
                    .intValue()) {
                return VALUE_ENTRY_Downgrade_reinstall_not_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_Not_enough_memory.intValue()) {
                return VALUE_ENTRY_Not_enough_memory;
            }

            if (iValue == VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_Not_enough_swap_space.intValue()) {
                return VALUE_ENTRY_Not_enough_swap_space;
            }

            if (iValue == VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_Unsupported_version_transition
                    .intValue()) {
                return VALUE_ENTRY_Unsupported_version_transition;
            }

            if (iValue == VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_Not_enough_disk_space.intValue()) {
                return VALUE_ENTRY_Not_enough_disk_space;
            }

            if (iValue == VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_Software_and_target_operating_system_mismatch
                    .intValue()) {
                return VALUE_ENTRY_Software_and_target_operating_system_mismatch;
            }

            if (iValue == VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_Missing_dependencies.intValue()) {
                return VALUE_ENTRY_Missing_dependencies;
            }

            if (iValue == VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_Not_applicable_to_target.intValue()) {
                return VALUE_ENTRY_Not_applicable_to_target;
            }

            if (iValue == VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_URI_not_accessible.intValue()) {
                return VALUE_ENTRY_URI_not_accessible;
            }

            if (iValue >= 4108 || iValue <= 32767) {
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
         * Value Map for the method InstallFromURI   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unspecified_Error,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Target_In_Use,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Unsupported_TargetType,
                VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Unattended_silent_installation_not_supported,
                VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Downgrade_reinstall_not_supported,
                VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_Not_enough_memory,
                VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_Not_enough_swap_space,
                VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_Unsupported_version_transition,
                VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_Not_enough_disk_space,
                VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_Software_and_target_operating_system_mismatch,
                VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_Missing_dependencies,
                VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_Not_applicable_to_target,
                VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_URI_not_accessible };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method InstallFromURI   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Job_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Unspecified_Error, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Failed, VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Target_In_Use,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_ENTRY_Unsupported_TargetType,
                VALUE_ENTRY_Unattended_silent_installation_not_supported,
                VALUE_ENTRY_Downgrade_reinstall_not_supported, VALUE_ENTRY_Not_enough_memory,
                VALUE_ENTRY_Not_enough_swap_space, VALUE_ENTRY_Unsupported_version_transition,
                VALUE_ENTRY_Not_enough_disk_space,
                VALUE_ENTRY_Software_and_target_operating_system_mismatch,
                VALUE_ENTRY_Missing_dependencies, VALUE_ENTRY_Not_applicable_to_target,
                VALUE_ENTRY_URI_not_accessible, VALUE_ENTRY_Method_Reserved,
                VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method InstallFromURI   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Job_Completed_with_No_Error, VALUE_ENTRY_Not_Supported,
                VALUE_ENTRY_Unspecified_Error, VALUE_ENTRY_Timeout, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_Target_In_Use,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_ENTRY_Unsupported_TargetType,
                VALUE_ENTRY_Unattended_silent_installation_not_supported,
                VALUE_ENTRY_Downgrade_reinstall_not_supported, VALUE_ENTRY_Not_enough_memory,
                VALUE_ENTRY_Not_enough_swap_space, VALUE_ENTRY_Unsupported_version_transition,
                VALUE_ENTRY_Not_enough_disk_space,
                VALUE_ENTRY_Software_and_target_operating_system_mismatch,
                VALUE_ENTRY_Missing_dependencies, VALUE_ENTRY_Not_applicable_to_target,
                VALUE_ENTRY_URI_not_accessible };

        /**
         * constants for parameter Job
         */
        public static class PARAMETER_JOB {
            /*
             * Name of the parameter Job
             */
            public final static String NAME = "Job";

        }

        /**
         * constants for parameter URI
         */
        public static class PARAMETER_URI {
            /*
             * Name of the parameter URI
             */
            public final static String NAME = "URI";

        }

        /**
         * constants for parameter Target
         */
        public static class PARAMETER_TARGET {
            /*
             * Name of the parameter Target
             */
            public final static String NAME = "Target";

        }

        /**
         * constants for parameter InstallOptions
         */
        public static class PARAMETER_INSTALLOPTIONS {
            /*
             * Name of the parameter InstallOptions
             */
            public final static String NAME = "InstallOptions";

            /**
             * constant for value map entry 2
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Defer_target_system_reset = new javax.cim.UnsignedInteger16(
                    "2");

            /**
             * constant for value entry Defer target/system reset (corresponds to mapEntry 2 )
             */
            public final static String VALUE_ENTRY_Defer_target_system_reset = "Defer target/system reset";

            /**
             * constant for value map entry 3
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Force_installation = new javax.cim.UnsignedInteger16(
                    "3");

            /**
             * constant for value entry Force installation (corresponds to mapEntry 3 )
             */
            public final static String VALUE_ENTRY_Force_installation = "Force installation";

            /**
             * constant for value map entry 4
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Install = new javax.cim.UnsignedInteger16(
                    "4");

            /**
             * constant for value entry Install (corresponds to mapEntry 4 )
             */
            public final static String VALUE_ENTRY_Install = "Install";

            /**
             * constant for value map entry 5
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Update = new javax.cim.UnsignedInteger16(
                    "5");

            /**
             * constant for value entry Update (corresponds to mapEntry 5 )
             */
            public final static String VALUE_ENTRY_Update = "Update";

            /**
             * constant for value map entry 6
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Repair = new javax.cim.UnsignedInteger16(
                    "6");

            /**
             * constant for value entry Repair (corresponds to mapEntry 6 )
             */
            public final static String VALUE_ENTRY_Repair = "Repair";

            /**
             * constant for value map entry 7
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Reboot = new javax.cim.UnsignedInteger16(
                    "7");

            /**
             * constant for value entry Reboot (corresponds to mapEntry 7 )
             */
            public final static String VALUE_ENTRY_Reboot = "Reboot";

            /**
             * constant for value map entry 8
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Password = new javax.cim.UnsignedInteger16(
                    "8");

            /**
             * constant for value entry Password (corresponds to mapEntry 8 )
             */
            public final static String VALUE_ENTRY_Password = "Password";

            /**
             * constant for value map entry 9
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Uninstall = new javax.cim.UnsignedInteger16(
                    "9");

            /**
             * constant for value entry Uninstall (corresponds to mapEntry 9 )
             */
            public final static String VALUE_ENTRY_Uninstall = "Uninstall";

            /**
             * constant for value map entry 10
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Log = new javax.cim.UnsignedInteger16(
                    "10");

            /**
             * constant for value entry Log (corresponds to mapEntry 10 )
             */
            public final static String VALUE_ENTRY_Log = "Log";

            /**
             * constant for value map entry 11
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_SilentMode = new javax.cim.UnsignedInteger16(
                    "11");

            /**
             * constant for value entry SilentMode (corresponds to mapEntry 11 )
             */
            public final static String VALUE_ENTRY_SilentMode = "SilentMode";

            /**
             * constant for value map entry 12
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_AdministrativeMode = new javax.cim.UnsignedInteger16(
                    "12");

            /**
             * constant for value entry AdministrativeMode (corresponds to mapEntry 12 )
             */
            public final static String VALUE_ENTRY_AdministrativeMode = "AdministrativeMode";

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
            //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@4100410
            public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

                if (VALUE_ENTRY_Defer_target_system_reset.equals(value)) {
                    return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Defer_target_system_reset;
                }

                if (VALUE_ENTRY_Force_installation.equals(value)) {
                    return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Force_installation;
                }

                if (VALUE_ENTRY_Install.equals(value)) {
                    return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Install;
                }

                if (VALUE_ENTRY_Update.equals(value)) {
                    return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Update;
                }

                if (VALUE_ENTRY_Repair.equals(value)) {
                    return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Repair;
                }

                if (VALUE_ENTRY_Reboot.equals(value)) {
                    return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Reboot;
                }

                if (VALUE_ENTRY_Password.equals(value)) {
                    return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Password;
                }

                if (VALUE_ENTRY_Uninstall.equals(value)) {
                    return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Uninstall;
                }

                if (VALUE_ENTRY_Log.equals(value)) {
                    return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Log;
                }

                if (VALUE_ENTRY_SilentMode.equals(value)) {
                    return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_SilentMode;
                }

                if (VALUE_ENTRY_AdministrativeMode.equals(value)) {
                    return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_AdministrativeMode;
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

                if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Defer_target_system_reset
                        .intValue()) {
                    return VALUE_ENTRY_Defer_target_system_reset;
                }

                if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Force_installation.intValue()) {
                    return VALUE_ENTRY_Force_installation;
                }

                if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Install.intValue()) {
                    return VALUE_ENTRY_Install;
                }

                if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Update.intValue()) {
                    return VALUE_ENTRY_Update;
                }

                if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Repair.intValue()) {
                    return VALUE_ENTRY_Repair;
                }

                if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Reboot.intValue()) {
                    return VALUE_ENTRY_Reboot;
                }

                if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Password.intValue()) {
                    return VALUE_ENTRY_Password;
                }

                if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Uninstall.intValue()) {
                    return VALUE_ENTRY_Uninstall;
                }

                if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Log.intValue()) {
                    return VALUE_ENTRY_Log;
                }

                if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_SilentMode.intValue()) {
                    return VALUE_ENTRY_SilentMode;
                }

                if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_AdministrativeMode.intValue()) {
                    return VALUE_ENTRY_AdministrativeMode;
                }

                if (iValue >= 32768 || iValue <= 65535) {
                    return VALUE_ENTRY_Vendor_Specific;
                }
                return VALUE_ENTRY_DMTF_Reserved;

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
             * Value Map for the parameter InstallOptions of the method InstallFromURI   
             */
            public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                    VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Defer_target_system_reset,
                    VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Force_installation,
                    VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Install,
                    VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Update,
                    VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Repair,
                    VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Reboot,
                    VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Password,
                    VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Uninstall,
                    VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Log,
                    VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_SilentMode,
                    VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_AdministrativeMode };

            /**
             * Values
             * Contains all values even those having an integer value range representation within the valueMap
             * Value Map for the parameter InstallOptions of the method InstallFromURI   
             */
            public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Defer_target_system_reset,
                    VALUE_ENTRY_Force_installation, VALUE_ENTRY_Install, VALUE_ENTRY_Update,
                    VALUE_ENTRY_Repair, VALUE_ENTRY_Reboot, VALUE_ENTRY_Password,
                    VALUE_ENTRY_Uninstall, VALUE_ENTRY_Log, VALUE_ENTRY_SilentMode,
                    VALUE_ENTRY_AdministrativeMode, VALUE_ENTRY_DMTF_Reserved,
                    VALUE_ENTRY_Vendor_Specific };

            /**
             * Values for displaying within pulldown elements, lists, radio buttons etc
             * Contains no values that having an integer value range representation within the valueMap
             * 
             * Value Map for the parameter InstallOptions of the method InstallFromURI   
             */
            public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                    VALUE_ENTRY_Defer_target_system_reset, VALUE_ENTRY_Force_installation,
                    VALUE_ENTRY_Install, VALUE_ENTRY_Update, VALUE_ENTRY_Repair,
                    VALUE_ENTRY_Reboot, VALUE_ENTRY_Password, VALUE_ENTRY_Uninstall,
                    VALUE_ENTRY_Log, VALUE_ENTRY_SilentMode, VALUE_ENTRY_AdministrativeMode };

        }

        /**
         * constants for parameter InstallOptionsValues
         */
        public static class PARAMETER_INSTALLOPTIONSVALUES {
            /*
             * Name of the parameter InstallOptionsValues
             */
            public final static String NAME = "InstallOptionsValues";

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
     *   A subclass of service which provides methods to install (or update) Software Identities in ManagedElements.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_SoftwareInstallationService(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A subclass of service which provides methods to install (or update) Software Identities in ManagedElements.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_SoftwareInstallationService(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_SoftwareInstallationService() {
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
     * Invokes the Method CheckSoftwareIdentity
     * <br>
     * @param client the cimclient
     * This method allows a client application to determine whether a specific SoftwareIdentity can be installed (or updated) on a ManagedElement. It also allows other characteristics to be determined such as whether install will require a reboot. In addition a client can check whether the SoftwareIdentity can be added simulataneously to a specified SofwareIndentityCollection. A client MAY specify either or both of the Collection and Target parameters. The Collection parameter is only supported if SoftwareInstallationService.CanAddToCollection is TRUE.
     *   @param Source Reference to the SoftwareIdentity to be checked.
     *   @param Target Reference to the ManagedElement that the Software Identity is going to be installed in (or updated).
     *   @param Collection Reference to the Collection to which the Software Identity will be added.
     *
     */

    public CheckSoftwareIdentityResult invoke_CheckSoftwareIdentity(WBEMClient cimClient,
            CIM_SoftwareIdentity Source, CIM_ManagedElement Target, CIM_Collection Collection)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[3];
        CIMArgument[] outParameter = new CIMArgument[1];

        inParameter[0] = new CIMArgument("Source", new CIMDataType(
                CIM_SoftwareIdentity.CIM_CLASS_NAME), Source.getCimObjectPath());
        inParameter[1] = new CIMArgument("Target", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), Target.getCimObjectPath());
        inParameter[2] = new CIMArgument("Collection", new CIMDataType(
                CIM_Collection.CIM_CLASS_NAME), Collection.getCimObjectPath());

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_CHECKSOFTWAREIDENTITY.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_CHECKSOFTWAREIDENTITY.NAME, inParameter, outParameter));
        }

        CheckSoftwareIdentityResult result = new CheckSoftwareIdentityResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        CIMArgument arg_InstallCharacteristics = (CIMArgument) mapOutParameter
                .get("InstallCharacteristics");
        if (arg_InstallCharacteristics != null) {

            javax.cim.UnsignedInteger16[] out_InstallCharacteristics = (javax.cim.UnsignedInteger16[]) arg_InstallCharacteristics
                    .getValue();

            result.set_InstallCharacteristics(out_InstallCharacteristics);
        }

        return result;
    }

    /**
     * Result object for the method CheckSoftwareIdentity
     */
    public static class CheckSoftwareIdentityResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        CheckSoftwareIdentityResult() {
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
         * The out parameter InstallCharacteristics
         */
        javax.cim.UnsignedInteger16[] InstallCharacteristics = null;

        /**
         * Set the out parameter InstallCharacteristics
         * @param value
         */
        void set_InstallCharacteristics(javax.cim.UnsignedInteger16[] value) {
            this.InstallCharacteristics = value;
        }

        /**
         * get the out parameter InstallCharacteristics
         * @return
         */
        public javax.cim.UnsignedInteger16[] get_InstallCharacteristics() {
            return this.InstallCharacteristics;
        }
    }

    /**
     * Invokes the Method InstallFromByteStream
     * <br>
     * @param client the cimclient
     * Start a job to download a series of bytes containing a software image to a ManagedElement. 
     * Note that this method is provided to support existing, alternative download mechanisms (such as used for firmware download). The 'normal' mechanism will be to use the InstallFromSoftwareIdentity method. 
     * If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to to perform the install. The Job's reference will be returned in the output parameter Job.
     *   @param Image A array of bytes containing the install image.
     *   @param Target The installation target.
     *   @param InstallOptions Options to control the install process. 
     *     See the InstallOptions parameter of the SoftwareInstallationService.InstallFromSoftwareIdentity method for the description of these values.
     *   @param InstallOptionsValues InstallOptionsValues is an array of strings providing additional information to InstallOptions for the method to install the software. Each entry of this array is related to the entry in InstallOptions that is located at the same index providing additional information for InstallOptions. 
     *     
     *     For further information on the use of InstallOptionsValues parameter, see the description of the InstallOptionsValues parameter of the SoftwareInstallationService.InstallFromSoftwareIdentity method.
     *
     */

    public InstallFromByteStreamResult invoke_InstallFromByteStream(WBEMClient cimClient,
            javax.cim.UnsignedInteger8[] Image, CIM_ManagedElement Target,
            javax.cim.UnsignedInteger16[] InstallOptions, String[] InstallOptionsValues)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[4];
        CIMArgument[] outParameter = new CIMArgument[1];

        inParameter[0] = new CIMArgument("Image", CIMDataType.UINT8_ARRAY_T, Image);
        inParameter[1] = new CIMArgument("Target", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), Target.getCimObjectPath());
        inParameter[2] = new CIMArgument("InstallOptions", CIMDataType.UINT16_ARRAY_T,
                InstallOptions);
        inParameter[3] = new CIMArgument("InstallOptionsValues", CIMDataType.STRING_ARRAY_T,
                InstallOptionsValues);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_INSTALLFROMBYTESTREAM.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_INSTALLFROMBYTESTREAM.NAME, inParameter, outParameter));
        }

        InstallFromByteStreamResult result = new InstallFromByteStreamResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        CIMArgument arg_Job = (CIMArgument) mapOutParameter.get("Job");
        if (arg_Job != null) {
            CIM_ConcreteJob out_Job = CIM_ConcreteJobHelper.getInstance(cimClient,
                    (CIMObjectPath) arg_Job.getValue());

            result.set_Job(out_Job);
        }

        return result;
    }

    /**
     * Result object for the method InstallFromByteStream
     */
    public static class InstallFromByteStreamResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        InstallFromByteStreamResult() {
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
     * Invokes the Method InstallFromSoftwareIdentity
     * <br>
     * @param client the cimclient
     * Start a job to install or update a SoftwareIdentity (Source) on a ManagedElement (Target). 
     * In addition the method can be used to add the SoftwareIdentity simulataneously to a specified SofwareIndentityCollection. A client MAY specify either or both of the Collection and Target parameters. The Collection parameter is only supported if SoftwareInstallationService.CanAddToCollection is TRUE. 
     * If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to perform the install. The Job's reference will be returned in the output parameter Job.
     *   @param InstallOptions Options to control the install process.
     *     Defer target/system reset : do not automatically reset the target/system.
     *     Force installation : Force the installation of the same or an older SoftwareIdentity.Install: Perform an installation of this software on the managed element.
     *     Update: Perform an update of this software on the managed element.
     *     Repair: Perform a repair of the installation of this software on the managed element by forcing all the files required for installing the software to be reinstalled.
     *     Reboot: Reboot or reset the system immediately after the install or update of this software, if the install or the update requires a reboot or reset.
     *     Password: Password will be specified as clear text without any encryption for performing the install or update.
     *     Uninstall: Uninstall the software on the managed element.
     *     Log: Create a log for the install or update of the software.
     *     SilentMode: Perform the install or update without displaying any user interface.
     *     AdministrativeMode: Perform the install or update of the software in the administrative mode.
     *   @param InstallOptionsValues InstallOptionsValues is an array of strings providing additional information to InstallOptions for the method to install the software. Each entry of this array is related to the entry in InstallOptions that is located at the same index providing additional information for InstallOptions. 
     *     If the index in InstallOptions has the value "Password " then a value at the corresponding index of InstallOptionValues shall not be NULL. 
     *     If the index in InstallOptions has the value "Log " then a value at the corresponding index of InstallOptionValues may be NULL. 
     *     If the index in InstallOptions has the value "Defer target/system reset", "Force installation","Install", "Update", "Repair" or "Reboot" then a value at the corresponding index of InstallOptionValues shall be NULL.
     *   @param Source Reference to the source of the install.
     *   @param Target The installation target. If NULL then the SOftwareIdentity will be added to Collection only. The underlying implementation is expected to be able to obtain any necessary metadata from the Software Identity.
     *   @param Collection Reference to the Collection to which the Software Identity SHALL be added. If NULL then the SOftware Identity will not be added to a Collection.
     *
     */

    public InstallFromSoftwareIdentityResult invoke_InstallFromSoftwareIdentity(
            WBEMClient cimClient, javax.cim.UnsignedInteger16[] InstallOptions,
            String[] InstallOptionsValues, CIM_SoftwareIdentity Source, CIM_ManagedElement Target,
            CIM_Collection Collection) throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[5];
        CIMArgument[] outParameter = new CIMArgument[1];

        inParameter[0] = new CIMArgument("InstallOptions", CIMDataType.UINT16_ARRAY_T,
                InstallOptions);
        inParameter[1] = new CIMArgument("InstallOptionsValues", CIMDataType.STRING_ARRAY_T,
                InstallOptionsValues);
        inParameter[2] = new CIMArgument("Source", new CIMDataType(
                CIM_SoftwareIdentity.CIM_CLASS_NAME), Source.getCimObjectPath());
        inParameter[3] = new CIMArgument("Target", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), Target.getCimObjectPath());
        inParameter[4] = new CIMArgument("Collection", new CIMDataType(
                CIM_Collection.CIM_CLASS_NAME), Collection.getCimObjectPath());

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_INSTALLFROMSOFTWAREIDENTITY.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_INSTALLFROMSOFTWAREIDENTITY.NAME, inParameter, outParameter));
        }

        InstallFromSoftwareIdentityResult result = new InstallFromSoftwareIdentityResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        CIMArgument arg_Job = (CIMArgument) mapOutParameter.get("Job");
        if (arg_Job != null) {
            CIM_ConcreteJob out_Job = CIM_ConcreteJobHelper.getInstance(cimClient,
                    (CIMObjectPath) arg_Job.getValue());

            result.set_Job(out_Job);
        }

        return result;
    }

    /**
     * Result object for the method InstallFromSoftwareIdentity
     */
    public static class InstallFromSoftwareIdentityResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        InstallFromSoftwareIdentityResult() {
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
     * Invokes the Method InstallFromURI
     * <br>
     * @param client the cimclient
     * Start a job to install software from a specific URI in a ManagedElement. 
     * Note that this method is provided to support existing, alternative download mechanisms (such as used for firmware download). The 'normal' mechanism will be to use the InstallFromSoftwareIdentity method.
     * If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to to perform the install. The Job's reference will be returned in the output parameter Job.
     *   @param URI A URI for the software based on RFC 2079.
     *   @param Target The installation target.
     *   @param InstallOptions Options to control the install process. 
     *     See the InstallOptions parameter of the SoftwareInstallationService.InstallFromSoftwareIdentity method for the description of these values.
     *   @param InstallOptionsValues InstallOptionsValues is an array of strings providing additionalinformation to InstallOptions for the method to install the software. Each entry of this array is related to the entry in InstallOptions that is located at the same index providing additional information for InstallOptions. 
     *     For further information on the use of InstallOptionsValues parameter, see the description of the InstallOptionsValues parameter of the SoftwareInstallationService.InstallFromSoftwareIdentity method.
     *
     */

    public InstallFromURIResult invoke_InstallFromURI(WBEMClient cimClient, String URI,
            CIM_ManagedElement Target, javax.cim.UnsignedInteger16[] InstallOptions,
            String[] InstallOptionsValues) throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[4];
        CIMArgument[] outParameter = new CIMArgument[1];

        inParameter[0] = new CIMArgument("URI", CIMDataType.STRING_T, URI);
        inParameter[1] = new CIMArgument("Target", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), Target.getCimObjectPath());
        inParameter[2] = new CIMArgument("InstallOptions", CIMDataType.UINT16_ARRAY_T,
                InstallOptions);
        inParameter[3] = new CIMArgument("InstallOptionsValues", CIMDataType.STRING_ARRAY_T,
                InstallOptionsValues);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_INSTALLFROMURI.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_INSTALLFROMURI.NAME, inParameter, outParameter));
        }

        InstallFromURIResult result = new InstallFromURIResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        CIMArgument arg_Job = (CIMArgument) mapOutParameter.get("Job");
        if (arg_Job != null) {
            CIM_ConcreteJob out_Job = CIM_ConcreteJobHelper.getInstance(cimClient,
                    (CIMObjectPath) arg_Job.getValue());

            result.set_Job(out_Job);
        }

        return result;
    }

    /**
     * Result object for the method InstallFromURI
     */
    public static class InstallFromURIResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        InstallFromURIResult() {
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
        return CIM_SoftwareInstallationService.CIM_CLASS_NAME;
    }

}