/**
 * CIM_LogicalDisk.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS PROVIDED UNDER THE TERMS OF
 * THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Eclipse
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: A LogicalDisk is a presentation of a
 *            contiguous range of logical blocks that is identifiable by applications such as
 *            filesystems via the Name field. (DeviceID (key) may use the same name or some other
 *            unique text such as a UUID.) For example in a Windows environment, the Name field may
 *            contain a drive letter. In a Unix environment, it may contain the access path (for
 *            example, '/dev/...'); and in a NetWare environment, may contain the volume name.
 *            LogicalDisks are typically built on a DiskPartition or other LogicalDisks (for
 *            instance, those exposed by a software volume manager). However, it can be based on
 *            other StorageExtents, like CIM_Memory, in the case of a RAM disk. LogicalDisks SHOULD
 *            set the 'Exported' value in ExtentStatus[] if they are intended for application use.
 *            generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_LogicalDisk extends CIM_StorageExtent {

    public final static String CIM_CLASS_NAME = "CIM_LogicalDisk";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ClientSettableUsage
     * Indicates which values from the "Usage" value map can be manipulated by a client using the method"StorageConfigurationService.RequestUsageChange".
     */
    public static class PROPERTY_CLIENTSETTABLEUSAGE {
        /**
         * name of the property ClientSettableUsage
         */
        public final static String NAME = "ClientSettableUsage";

    }

    /**
     * Constants of property NameFormat
     * LogicalDisk names shall use OS Device Name format.
     */
    public static class PROPERTY_NAMEFORMAT {
        /**
         * name of the property NameFormat
         */
        public final static String NAME = "NameFormat";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Other (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Other = "Other";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_OS_Device_Name = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry OS Device Name (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_OS_Device_Name = "OS Device Name";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_OS_Device_Name.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_OS_Device_Name;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_OS_Device_Name.intValue()) {
                return VALUE_ENTRY_OS_Device_Name;
            }
            return null;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property NameFormat   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_OS_Device_Name };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property NameFormat   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other,
                VALUE_ENTRY_OS_Device_Name };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property NameFormat   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_OS_Device_Name };

    }

    /**
     * Constants of property NameNamespace
     * LogicalDisk names shall use OS Device Namespace.
     */
    public static class PROPERTY_NAMENAMESPACE {
        /**
         * name of the property NameNamespace
         */
        public final static String NAME = "NameNamespace";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Other (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Other = "Other";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_OS_Device_Namespace = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry OS Device Namespace (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_OS_Device_Namespace = "OS Device Namespace";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_OS_Device_Namespace.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_OS_Device_Namespace;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_OS_Device_Namespace.intValue()) {
                return VALUE_ENTRY_OS_Device_Namespace;
            }
            return null;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property NameNamespace   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_OS_Device_Namespace };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property NameNamespace   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other,
                VALUE_ENTRY_OS_Device_Namespace };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property NameNamespace   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_OS_Device_Namespace };

    }

    /**
     * Constants of property OtherUsageDescription
     * Populated when "Usage" has the value of "Other".
     */
    public static class PROPERTY_OTHERUSAGEDESCRIPTION {
        /**
         * name of the property OtherUsageDescription
         */
        public final static String NAME = "OtherUsageDescription";

    }

    /**
     * Constants of property Usage
     * Indicates the intended usage or any restrictions that may have been imposed on the usage of this component. For example, an element may be reserved for use by the block server. In that case the Usage of the elementis marked as "Reserved for the ComputerSystem". In the case of "Other", see OtherUsageDescription for more information. In the value map, the "Element Component" refers to a LogicalDisk that is acting as a StorageExtent. In this case, the element no longer appears in the list of volumes or logical disks. Use the method GetElementsBasedOnUsage to locate such volumes or logical disks.
     */
    public static class PROPERTY_USAGE {
        /**
         * name of the property Usage
         */
        public final static String NAME = "Usage";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Other (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Other = "Other";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unrestricted = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Unrestricted (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unrestricted = "Unrestricted";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Reserved_by_the_ComputerSystem__the_block_server_ = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Reserved by the ComputerSystem (the block server) (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Reserved_by_the_ComputerSystem__the_block_server_ = "Reserved by the ComputerSystem (the block server)";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Reserved_by_Replication_Services = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Reserved by Replication Services (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Reserved_by_Replication_Services = "Reserved by Replication Services";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Reserved_by_Migration_Services = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Reserved by Migration Services (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Reserved_by_Migration_Services = "Reserved by Migration Services";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Local_Replica_Source = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Local Replica Source (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Local_Replica_Source = "Local Replica Source";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Remote_Replica_Source = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Remote Replica Source (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Remote_Replica_Source = "Remote Replica Source";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Local_Replica_Target = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Local Replica Target (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Local_Replica_Target = "Local Replica Target";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Remote_Replica_Target = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Remote Replica Target (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Remote_Replica_Target = "Remote Replica Target";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Local_Replica_Source_or_Target = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Local Replica Source or Target (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Local_Replica_Source_or_Target = "Local Replica Source or Target";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Remote_Replica_Source_or_Target = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Remote Replica Source or Target (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Remote_Replica_Source_or_Target = "Remote Replica Source or Target";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Delta_Replica_Target = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Delta Replica Target (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Delta_Replica_Target = "Delta Replica Target";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Element_Component = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry Element Component (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_Element_Component = "Element Component";

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
         * constant for value entry Vendor Reserved (corresponds to mapEntry 32768..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Reserved = "Vendor Reserved";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unrestricted.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unrestricted;
            }

            if (VALUE_ENTRY_Reserved_by_the_ComputerSystem__the_block_server_.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Reserved_by_the_ComputerSystem__the_block_server_;
            }

            if (VALUE_ENTRY_Reserved_by_Replication_Services.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Reserved_by_Replication_Services;
            }

            if (VALUE_ENTRY_Reserved_by_Migration_Services.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Reserved_by_Migration_Services;
            }

            if (VALUE_ENTRY_Local_Replica_Source.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Local_Replica_Source;
            }

            if (VALUE_ENTRY_Remote_Replica_Source.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Remote_Replica_Source;
            }

            if (VALUE_ENTRY_Local_Replica_Target.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Local_Replica_Target;
            }

            if (VALUE_ENTRY_Remote_Replica_Target.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Remote_Replica_Target;
            }

            if (VALUE_ENTRY_Local_Replica_Source_or_Target.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Local_Replica_Source_or_Target;
            }

            if (VALUE_ENTRY_Remote_Replica_Source_or_Target.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Remote_Replica_Source_or_Target;
            }

            if (VALUE_ENTRY_Delta_Replica_Target.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Delta_Replica_Target;
            }

            if (VALUE_ENTRY_Element_Component.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Element_Component;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unrestricted.intValue()) {
                return VALUE_ENTRY_Unrestricted;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Reserved_by_the_ComputerSystem__the_block_server_
                    .intValue()) {
                return VALUE_ENTRY_Reserved_by_the_ComputerSystem__the_block_server_;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Reserved_by_Replication_Services
                    .intValue()) {
                return VALUE_ENTRY_Reserved_by_Replication_Services;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Reserved_by_Migration_Services
                    .intValue()) {
                return VALUE_ENTRY_Reserved_by_Migration_Services;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Local_Replica_Source.intValue()) {
                return VALUE_ENTRY_Local_Replica_Source;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Remote_Replica_Source.intValue()) {
                return VALUE_ENTRY_Remote_Replica_Source;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Local_Replica_Target.intValue()) {
                return VALUE_ENTRY_Local_Replica_Target;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Remote_Replica_Target.intValue()) {
                return VALUE_ENTRY_Remote_Replica_Target;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Local_Replica_Source_or_Target
                    .intValue()) {
                return VALUE_ENTRY_Local_Replica_Source_or_Target;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Remote_Replica_Source_or_Target
                    .intValue()) {
                return VALUE_ENTRY_Remote_Replica_Source_or_Target;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Delta_Replica_Target.intValue()) {
                return VALUE_ENTRY_Delta_Replica_Target;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Element_Component.intValue()) {
                return VALUE_ENTRY_Element_Component;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Reserved;
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
         * Value Map for the property Usage   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unrestricted,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Reserved_by_the_ComputerSystem__the_block_server_,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Reserved_by_Replication_Services,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Reserved_by_Migration_Services,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Local_Replica_Source,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Remote_Replica_Source,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Local_Replica_Target,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Remote_Replica_Target,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Local_Replica_Source_or_Target,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Remote_Replica_Source_or_Target,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Delta_Replica_Target,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Element_Component };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Usage   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Unrestricted,
                VALUE_ENTRY_Reserved_by_the_ComputerSystem__the_block_server_,
                VALUE_ENTRY_Reserved_by_Replication_Services,
                VALUE_ENTRY_Reserved_by_Migration_Services, VALUE_ENTRY_Local_Replica_Source,
                VALUE_ENTRY_Remote_Replica_Source, VALUE_ENTRY_Local_Replica_Target,
                VALUE_ENTRY_Remote_Replica_Target, VALUE_ENTRY_Local_Replica_Source_or_Target,
                VALUE_ENTRY_Remote_Replica_Source_or_Target, VALUE_ENTRY_Delta_Replica_Target,
                VALUE_ENTRY_Element_Component, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Usage   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Unrestricted,
                VALUE_ENTRY_Reserved_by_the_ComputerSystem__the_block_server_,
                VALUE_ENTRY_Reserved_by_Replication_Services,
                VALUE_ENTRY_Reserved_by_Migration_Services, VALUE_ENTRY_Local_Replica_Source,
                VALUE_ENTRY_Remote_Replica_Source, VALUE_ENTRY_Local_Replica_Target,
                VALUE_ENTRY_Remote_Replica_Target, VALUE_ENTRY_Local_Replica_Source_or_Target,
                VALUE_ENTRY_Remote_Replica_Source_or_Target, VALUE_ENTRY_Delta_Replica_Target,
                VALUE_ENTRY_Element_Component };

    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
        String[] parentClassPackageList = CIM_StorageExtent.getPackages();

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
     *   A LogicalDisk is a presentation of a contiguous range of logical blocks that is identifiable by applications such as filesystems via the Name field. (DeviceID (key) may use the same name or some other unique text such as a UUID.) For example in a Windows environment, the Name field may contain a drive letter. In a Unix environment, it may contain the access path (for example, '/dev/...'); and in a NetWare environment, may contain the volume name. LogicalDisks are typically built on a DiskPartition or other LogicalDisks (for instance, those exposed by a software volume manager). However, it can be based on other StorageExtents, like CIM_Memory, in the case of a RAM disk. 
     * 
     * LogicalDisks SHOULD set the 'Exported' value in ExtentStatus[] if they are intended for application use.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_LogicalDisk(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A LogicalDisk is a presentation of a contiguous range of logical blocks that is identifiable by applications such as filesystems via the Name field. (DeviceID (key) may use the same name or some other unique text such as a UUID.) For example in a Windows environment, the Name field may contain a drive letter. In a Unix environment, it may contain the access path (for example, '/dev/...'); and in a NetWare environment, may contain the volume name. LogicalDisks are typically built on a DiskPartition or other LogicalDisks (for instance, those exposed by a software volume manager). However, it can be based on other StorageExtents, like CIM_Memory, in the case of a RAM disk. 
     * 
     * LogicalDisks SHOULD set the 'Exported' value in ExtentStatus[] if they are intended for application use.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_LogicalDisk(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_LogicalDisk() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ClientSettableUsage", new CIMProperty("ClientSettableUsage",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("NameFormat", new CIMProperty("NameFormat", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("NameNamespace", new CIMProperty("NameNamespace",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("OtherUsageDescription", new CIMProperty("OtherUsageDescription",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("Usage", new CIMProperty("Usage", CIMDataType.UINT16_T, null));

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
     * Get the property ClientSettableUsage
     *     * <br>
     * Indicates which values from the "Usage" value map can be manipulated by a client using the method"StorageConfigurationService.RequestUsageChange".
     *     */

    public javax.cim.UnsignedInteger16[] get_ClientSettableUsage() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLIENTSETTABLEUSAGE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLIENTSETTABLEUSAGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property ClientSettableUsage
     * <br>
     * Indicates which values from the "Usage" value map can be manipulated by a client using the method"StorageConfigurationService.RequestUsageChange".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ClientSettableUsage(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLIENTSETTABLEUSAGE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ClientSettableUsage(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLIENTSETTABLEUSAGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ClientSettableUsage by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ClientSettableUsage(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_LogicalDisk fco = new CIM_LogicalDisk(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLIENTSETTABLEUSAGE.NAME);
        if (property != null) {
            property = setPropertyValue_ClientSettableUsage(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLIENTSETTABLEUSAGE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ClientSettableUsage
     * <br>
     * Indicates which values from the "Usage" value map can be manipulated by a client using the method"StorageConfigurationService.RequestUsageChange".
     */

    private static CIMProperty setPropertyValue_ClientSettableUsage(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NameFormat
     *     * <br>
     * LogicalDisk names shall use OS Device Name format.
     *     */

    public javax.cim.UnsignedInteger16 get_NameFormat() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMEFORMAT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property NameFormat
     * <br>
     * LogicalDisk names shall use OS Device Name format.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NameFormat(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMEFORMAT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_NameFormat(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NameFormat by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NameFormat(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_LogicalDisk fco = new CIM_LogicalDisk(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAMEFORMAT.NAME);
        if (property != null) {
            property = setPropertyValue_NameFormat(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NameFormat
     * <br>
     * LogicalDisk names shall use OS Device Name format.
     */

    private static CIMProperty setPropertyValue_NameFormat(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NameNamespace
     *     * <br>
     * LogicalDisk names shall use OS Device Namespace.
     *     */

    public javax.cim.UnsignedInteger16 get_NameNamespace() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMENAMESPACE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAMENAMESPACE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property NameNamespace
     * <br>
     * LogicalDisk names shall use OS Device Namespace.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NameNamespace(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMENAMESPACE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_NameNamespace(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAMENAMESPACE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NameNamespace by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NameNamespace(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_LogicalDisk fco = new CIM_LogicalDisk(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAMENAMESPACE.NAME);
        if (property != null) {
            property = setPropertyValue_NameNamespace(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAMENAMESPACE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NameNamespace
     * <br>
     * LogicalDisk names shall use OS Device Namespace.
     */

    private static CIMProperty setPropertyValue_NameNamespace(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherUsageDescription
     *     * <br>
     * Populated when "Usage" has the value of "Other".
     *     */

    public String get_OtherUsageDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERUSAGEDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERUSAGEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherUsageDescription
     * <br>
     * Populated when "Usage" has the value of "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherUsageDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERUSAGEDESCRIPTION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherUsageDescription(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERUSAGEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherUsageDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherUsageDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_LogicalDisk fco = new CIM_LogicalDisk(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERUSAGEDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherUsageDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERUSAGEDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherUsageDescription
     * <br>
     * Populated when "Usage" has the value of "Other".
     */

    private static CIMProperty setPropertyValue_OtherUsageDescription(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Usage
     *     * <br>
     * Indicates the intended usage or any restrictions that may have been imposed on the usage of this component. For example, an element may be reserved for use by the block server. In that case the Usage of the elementis marked as "Reserved for the ComputerSystem". In the case of "Other", see OtherUsageDescription for more information. In the value map, the "Element Component" refers to a LogicalDisk that is acting as a StorageExtent. In this case, the element no longer appears in the list of volumes or logical disks. Use the method GetElementsBasedOnUsage to locate such volumes or logical disks.
     *     */

    public javax.cim.UnsignedInteger16 get_Usage() {
        CIMProperty currentProperty = getProperty(PROPERTY_USAGE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_USAGE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property Usage
     * <br>
     * Indicates the intended usage or any restrictions that may have been imposed on the usage of this component. For example, an element may be reserved for use by the block server. In that case the Usage of the elementis marked as "Reserved for the ComputerSystem". In the case of "Other", see OtherUsageDescription for more information. In the value map, the "Element Component" refers to a LogicalDisk that is acting as a StorageExtent. In this case, the element no longer appears in the list of volumes or logical disks. Use the method GetElementsBasedOnUsage to locate such volumes or logical disks.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Usage(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_USAGE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Usage(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_USAGE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Usage by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Usage(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_LogicalDisk fco = new CIM_LogicalDisk(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_USAGE.NAME);
        if (property != null) {
            property = setPropertyValue_Usage(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_USAGE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Usage
     * <br>
     * Indicates the intended usage or any restrictions that may have been imposed on the usage of this component. For example, an element may be reserved for use by the block server. In that case the Usage of the elementis marked as "Reserved for the ComputerSystem". In the case of "Other", see OtherUsageDescription for more information. In the value map, the "Element Component" refers to a LogicalDisk that is acting as a StorageExtent. In this case, the element no longer appears in the list of volumes or logical disks. Use the method GetElementsBasedOnUsage to locate such volumes or logical disks.
     */

    private static CIMProperty setPropertyValue_Usage(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
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
        return CIM_LogicalDisk.CIM_CLASS_NAME;
    }

}