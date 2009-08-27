/**
 * CIM_StorageExtent.java Â© Copyright IBM Corp. 2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF
 * THE COMMON PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/cpl1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: StorageExtent describes the capabilities and
 *            management of the various media that exist to store data and allow data retrieval.
 *            This superclass could be used to represent the various components of RAID (Hardware or
 *            Software) or as a raw logical extent on top of physical media. generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_StorageExtent extends CIM_LogicalDevice {

    public final static String CIM_CLASS_NAME = "CIM_StorageExtent";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Access
     * Access describes whether the media is readable (value=1), writeable (value=2), or both (value=3). "Unknown" (0) and "Write Once" (4) can also be defined.
     */
    public static class PROPERTY_ACCESS {
        /**
         * name of the property Access
         */
        public final static String NAME = "Access";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Readable = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Readable (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Readable = "Readable";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Writeable = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Writeable (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Writeable = "Writeable";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Read_Write_Supported = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Read/Write Supported (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Read_Write_Supported = "Read/Write Supported";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Write_Once = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Write Once (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Write_Once = "Write Once";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Readable.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Readable;
            }

            if (VALUE_ENTRY_Writeable.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Writeable;
            }

            if (VALUE_ENTRY_Read_Write_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Read_Write_Supported;
            }

            if (VALUE_ENTRY_Write_Once.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Write_Once;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Readable.intValue()) {
                return VALUE_ENTRY_Readable;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Writeable.intValue()) {
                return VALUE_ENTRY_Writeable;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Read_Write_Supported.intValue()) {
                return VALUE_ENTRY_Read_Write_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Write_Once.intValue()) {
                return VALUE_ENTRY_Write_Once;
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
         * Value Map for the property Access   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Readable,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Writeable,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Read_Write_Supported,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Write_Once };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Access   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Readable,
                VALUE_ENTRY_Writeable, VALUE_ENTRY_Read_Write_Supported, VALUE_ENTRY_Write_Once };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Access   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Readable, VALUE_ENTRY_Writeable, VALUE_ENTRY_Read_Write_Supported,
                VALUE_ENTRY_Write_Once };

    }

    /**
     * Constants of property BlockSize
     * Size in bytes of the blocks which form this StorageExtent. If variable block size, then the maximum block size in bytes should be specified. If the block size is unknown or if a block concept is not valid (for example, for AggregateExtents, Memory or LogicalDisks), enter a 1.
     */
    public static class PROPERTY_BLOCKSIZE {
        /**
         * name of the property BlockSize
         */
        public final static String NAME = "BlockSize";

    }

    /**
     * Constants of property ClientSettableUsage
     * Indicates which values from the "Usage" valuemap can be manipulated by a client using the method "StorageConfigurationService.RequestUsageChange".
     */
    public static class PROPERTY_CLIENTSETTABLEUSAGE {
        /**
         * name of the property ClientSettableUsage
         */
        public final static String NAME = "ClientSettableUsage";

    }

    /**
     * Constants of property ConsumableBlocks
     * The maximum number of blocks, of size BlockSize, which are available for consumption when layering StorageExtents using the BasedOn association. This property only has meaning when this StorageExtent is an Antecedent reference in a BasedOn relationship. For example, a StorageExtent could be composed of 120 blocks. However, the Extent itself may use 20 blocks for redundancy data. If another StorageExtent is BasedOn this Extent, only 100 blocks would be available to it. This information ('100 blocks is available for consumption') is indicated in the ConsumableBlocks property.
     */
    public static class PROPERTY_CONSUMABLEBLOCKS {
        /**
         * name of the property ConsumableBlocks
         */
        public final static String NAME = "ConsumableBlocks";

    }

    /**
     * Constants of property DataOrganization
     * Type of data organization used.
     */
    public static class PROPERTY_DATAORGANIZATION {
        /**
         * name of the property DataOrganization
         */
        public final static String NAME = "DataOrganization";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Other = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Other (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Other = "Other";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Fixed_Block = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Fixed Block (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Fixed_Block = "Fixed Block";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Variable_Block = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Variable Block (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Variable_Block = "Variable Block";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Count_Key_Data = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Count Key Data (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Count_Key_Data = "Count Key Data";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Fixed_Block.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Fixed_Block;
            }

            if (VALUE_ENTRY_Variable_Block.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Variable_Block;
            }

            if (VALUE_ENTRY_Count_Key_Data.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Count_Key_Data;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Fixed_Block.intValue()) {
                return VALUE_ENTRY_Fixed_Block;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Variable_Block.intValue()) {
                return VALUE_ENTRY_Variable_Block;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Count_Key_Data.intValue()) {
                return VALUE_ENTRY_Count_Key_Data;
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
         * Value Map for the property DataOrganization   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Fixed_Block,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Variable_Block,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Count_Key_Data };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property DataOrganization   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Fixed_Block, VALUE_ENTRY_Variable_Block, VALUE_ENTRY_Count_Key_Data };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property DataOrganization   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Fixed_Block, VALUE_ENTRY_Variable_Block,
                VALUE_ENTRY_Count_Key_Data };

    }

    /**
     * Constants of property DataRedundancy
     * Number of complete copies of data currently maintained.
     */
    public static class PROPERTY_DATAREDUNDANCY {
        /**
         * name of the property DataRedundancy
         */
        public final static String NAME = "DataRedundancy";

    }

    /**
     * Constants of property DeltaReservation
     * Current value for Delta reservation. This is a percentage that specifies the amount of space that should be reserved in a replica for caching changes.
     */
    public static class PROPERTY_DELTARESERVATION {
        /**
         * name of the property DeltaReservation
         */
        public final static String NAME = "DeltaReservation";

    }

    /**
     * Constants of property ErrorMethodology
     * ErrorMethodology is a free-form string describing the type of error detection and correction supported by this StorageExtent.
     */
    public static class PROPERTY_ERRORMETHODOLOGY {
        /**
         * name of the property ErrorMethodology
         */
        public final static String NAME = "ErrorMethodology";

    }

    /**
     * Constants of property ExtentStatus
     * StorageExtents have additional status information beyond that captured in the OperationalStatus and other properties, inherited from ManagedSystemElement. This additional information (for example, "Protection Disabled", value=9) is captured in the ExtentStatus property. 
     * 'In-Band Access Granted' says that access to data on an extent is granted to some consumer and is only valid when 'Exported' is also set. It is set as a side effect of PrivilegeManagementService.ChangeAccess or equivalent interfaces. 
     * 'Imported' indicates that the extent is used in the current system, but known to be managed by some other system. For example, a server imports volumes from a disk array. 
     * 'Exported' indicates the extent is meant to be used by some comsumer. A disk array's logical units are exported. 
     * Intermediate composite extents may be neither imported nor exported.
     */
    public static class PROPERTY_EXTENTSTATUS {
        /**
         * name of the property ExtentStatus
         */
        public final static String NAME = "ExtentStatus";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Other = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Other (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Other = "Other";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None_Not_Applicable = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry None/Not Applicable (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_None_Not_Applicable = "None/Not Applicable";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Broken = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Broken (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Broken = "Broken";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Data_Lost = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Data Lost (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Data_Lost = "Data Lost";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Dynamic_Reconfig = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Dynamic Reconfig (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Dynamic_Reconfig = "Dynamic Reconfig";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Exposed = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Exposed (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Exposed = "Exposed";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Fractionally_Exposed = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Fractionally Exposed (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Fractionally_Exposed = "Fractionally Exposed";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Partially_Exposed = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Partially Exposed (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Partially_Exposed = "Partially Exposed";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Protection_Disabled = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Protection Disabled (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Protection_Disabled = "Protection Disabled";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Readying = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Readying (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Readying = "Readying";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Rebuild = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Rebuild (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Rebuild = "Rebuild";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Recalculate = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Recalculate (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Recalculate = "Recalculate";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Spare_in_Use = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry Spare in Use (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_Spare_in_Use = "Spare in Use";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Verify_In_Progress = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry Verify In Progress (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_Verify_In_Progress = "Verify In Progress";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_In_Band_Access_Granted = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry In-Band Access Granted (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_In_Band_Access_Granted = "In-Band Access Granted";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Imported = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry Imported (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_Imported = "Imported";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Exported = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry Exported (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_Exported = "Exported";

        /**
         * constant for value map entry 18..32767
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 18..32767 )
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
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_None_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None_Not_Applicable;
            }

            if (VALUE_ENTRY_Broken.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Broken;
            }

            if (VALUE_ENTRY_Data_Lost.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Data_Lost;
            }

            if (VALUE_ENTRY_Dynamic_Reconfig.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Dynamic_Reconfig;
            }

            if (VALUE_ENTRY_Exposed.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Exposed;
            }

            if (VALUE_ENTRY_Fractionally_Exposed.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Fractionally_Exposed;
            }

            if (VALUE_ENTRY_Partially_Exposed.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Partially_Exposed;
            }

            if (VALUE_ENTRY_Protection_Disabled.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Protection_Disabled;
            }

            if (VALUE_ENTRY_Readying.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Readying;
            }

            if (VALUE_ENTRY_Rebuild.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Rebuild;
            }

            if (VALUE_ENTRY_Recalculate.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Recalculate;
            }

            if (VALUE_ENTRY_Spare_in_Use.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Spare_in_Use;
            }

            if (VALUE_ENTRY_Verify_In_Progress.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Verify_In_Progress;
            }

            if (VALUE_ENTRY_In_Band_Access_Granted.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_In_Band_Access_Granted;
            }

            if (VALUE_ENTRY_Imported.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Imported;
            }

            if (VALUE_ENTRY_Exported.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Exported;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None_Not_Applicable.intValue()) {
                return VALUE_ENTRY_None_Not_Applicable;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Broken.intValue()) {
                return VALUE_ENTRY_Broken;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Data_Lost.intValue()) {
                return VALUE_ENTRY_Data_Lost;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Dynamic_Reconfig.intValue()) {
                return VALUE_ENTRY_Dynamic_Reconfig;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Exposed.intValue()) {
                return VALUE_ENTRY_Exposed;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Fractionally_Exposed.intValue()) {
                return VALUE_ENTRY_Fractionally_Exposed;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Partially_Exposed.intValue()) {
                return VALUE_ENTRY_Partially_Exposed;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Protection_Disabled.intValue()) {
                return VALUE_ENTRY_Protection_Disabled;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Readying.intValue()) {
                return VALUE_ENTRY_Readying;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Rebuild.intValue()) {
                return VALUE_ENTRY_Rebuild;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Recalculate.intValue()) {
                return VALUE_ENTRY_Recalculate;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Spare_in_Use.intValue()) {
                return VALUE_ENTRY_Spare_in_Use;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Verify_In_Progress.intValue()) {
                return VALUE_ENTRY_Verify_In_Progress;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_In_Band_Access_Granted.intValue()) {
                return VALUE_ENTRY_In_Band_Access_Granted;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Imported.intValue()) {
                return VALUE_ENTRY_Imported;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Exported.intValue()) {
                return VALUE_ENTRY_Exported;
            }

            if (iValue >= 18 || iValue <= 32767) {
                return VALUE_ENTRY_DMTF_Reserved;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Reserved;
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
         * Value Map for the property ExtentStatus   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None_Not_Applicable,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Broken,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Data_Lost,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Dynamic_Reconfig,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Exposed,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Fractionally_Exposed,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Partially_Exposed,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Protection_Disabled,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Readying,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Rebuild,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Recalculate,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Spare_in_Use,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Verify_In_Progress,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_In_Band_Access_Granted,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Imported,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Exported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ExtentStatus   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Unknown,
                VALUE_ENTRY_None_Not_Applicable, VALUE_ENTRY_Broken, VALUE_ENTRY_Data_Lost,
                VALUE_ENTRY_Dynamic_Reconfig, VALUE_ENTRY_Exposed,
                VALUE_ENTRY_Fractionally_Exposed, VALUE_ENTRY_Partially_Exposed,
                VALUE_ENTRY_Protection_Disabled, VALUE_ENTRY_Readying, VALUE_ENTRY_Rebuild,
                VALUE_ENTRY_Recalculate, VALUE_ENTRY_Spare_in_Use, VALUE_ENTRY_Verify_In_Progress,
                VALUE_ENTRY_In_Band_Access_Granted, VALUE_ENTRY_Imported, VALUE_ENTRY_Exported,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ExtentStatus   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_None_Not_Applicable, VALUE_ENTRY_Broken,
                VALUE_ENTRY_Data_Lost, VALUE_ENTRY_Dynamic_Reconfig, VALUE_ENTRY_Exposed,
                VALUE_ENTRY_Fractionally_Exposed, VALUE_ENTRY_Partially_Exposed,
                VALUE_ENTRY_Protection_Disabled, VALUE_ENTRY_Readying, VALUE_ENTRY_Rebuild,
                VALUE_ENTRY_Recalculate, VALUE_ENTRY_Spare_in_Use, VALUE_ENTRY_Verify_In_Progress,
                VALUE_ENTRY_In_Band_Access_Granted, VALUE_ENTRY_Imported, VALUE_ENTRY_Exported };

    }

    /**
     * Constants of property IsBasedOnUnderlyingRedundancy
     * True indicates that the underlying StorageExtent(s) participate in a StorageRedundancyGroup.
     */
    public static class PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY {
        /**
         * name of the property IsBasedOnUnderlyingRedundancy
         */
        public final static String NAME = "IsBasedOnUnderlyingRedundancy";

    }

    /**
     * Constants of property Name
     * A unique identifier for the Extent.
     */
    public static class PROPERTY_NAME {
        /**
         * name of the property Name
         */
        public final static String NAME = "Name";

    }

    /**
     * Constants of property NameFormat
     * The list here applies to all StorageExtent subclasses. Please look at the Description in each subclass for guidelines on the approriate values for that subclass. Note that any of these formats could apply to a CompositeExtent. 
     * 
     * Note - this property originally touched on two concepts that are now separated into this property and NameNamespace. Values 2,3,4,5,6, and 8 are retained for backwards compatibility but are deprecated in lieu of the corresponding values in CIM_StorageExtent.NameNamespace. 
     * 
     * For example, the preferred source for SCSI virtual (RAID) disk names is from Inquiry VPD page 83 response, type 3 identifiers. These will have NameFormat set to 'NAA' and NameNamespace to 'VPD83Type3'. 
     * 
     * Format of the Name property. Values for extents representing SCSI volumes are (per SCSI SPC-3): 
     * 2 = VPD Page 83, NAA IEEE Registered Extended (VPD83NAA6) 
     * (DEPRECATED) 
     * 3 = VPD Page 83, NAA IEEE Registered (VPD83NAA5) 
     * (DEPRECATED) 
     * 4 = VPD Page 83, (VPD83Type2) (DEPRECATED) 
     * 5 = VPD Page 83, 
     * T10 Vendor Identification (VPD83Type1) (DEPRECATED) 
     * 6 = VPD Page 83, Vendor Specific (VPD83Type0) (DEPRECATED) 
     * 7 = Serial Number/Vendor/Model (SNVM) SNVM is 3 strings representing the vendor name, product name within the vendor namespace, and the serial number within the model namespace. Strings are delimited with a '+'. Spaces may be included and are significant. The serial number is the text representation of the serial number in hexadecimal upper case. This represents the vendor and model ID from SCSI Inquiry data; the vendor field MUST be 8 characters wide and the product field MUST be 16 characters wide. For example, 
     * 'ACME____+SUPER DISK______+124437458' (_ is a space character) 
     * 8 = Node WWN (for single LUN/controller) (NodeWWN) 
     * (DEPRECATED) 
     * 9 = NAA as a generic format. See 
     * http://standards.ieee.org/regauth/oui/tutorials/fibrecomp_id.html. Formatted as 16 or 32 unseparated uppercase hex characters (2 per binary byte). For example '21000020372D3C73' 
     * 10 = EUI as a generic format (EUI64) See 
     * http://standards.ieee.org/regauth/oui/tutorials/EUI64.html. 
     * Formatted as 16 unseparated uppercase hex characters (2 per binary byte) 
     * 11 = T10 vendor identifier format as returned by SCSI Inquiry VPD page 83, identifier type 1. See T10 SPC-3 specification. This is the 8-byte ASCII vendor ID from the T10 registry followed by a vendor specific ASCII identifier; spaces are permitted. For non SCSI volumes, 'SNVM' may be the most appropriate choice. 12 = OS Device Name (for LogicalDisks). See LogicalDisk Name description for details.
     */
    public static class PROPERTY_NAMEFORMAT {
        /**
         * name of the property NameFormat
         */
        public final static String NAME = "NameFormat";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VPD83NAA6 = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry VPD83NAA6 (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_VPD83NAA6 = "VPD83NAA6";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_VPD83NAA5 = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry VPD83NAA5 (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_VPD83NAA5 = "VPD83NAA5";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_VPD83Type2 = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry VPD83Type2 (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_VPD83Type2 = "VPD83Type2";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_VPD83Type1 = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry VPD83Type1 (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_VPD83Type1 = "VPD83Type1";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_VPD83Type0 = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry VPD83Type0 (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_VPD83Type0 = "VPD83Type0";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNVM = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry SNVM (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_SNVM = "SNVM";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_NodeWWN = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry NodeWWN (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_NodeWWN = "NodeWWN";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_NAA = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry NAA (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_NAA = "NAA";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_EUI64 = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry EUI64 (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_EUI64 = "EUI64";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_T10VID = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry T10VID (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_T10VID = "T10VID";

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

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_VPD83NAA6.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VPD83NAA6;
            }

            if (VALUE_ENTRY_VPD83NAA5.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_VPD83NAA5;
            }

            if (VALUE_ENTRY_VPD83Type2.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_VPD83Type2;
            }

            if (VALUE_ENTRY_VPD83Type1.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_VPD83Type1;
            }

            if (VALUE_ENTRY_VPD83Type0.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_VPD83Type0;
            }

            if (VALUE_ENTRY_SNVM.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNVM;
            }

            if (VALUE_ENTRY_NodeWWN.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_NodeWWN;
            }

            if (VALUE_ENTRY_NAA.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_NAA;
            }

            if (VALUE_ENTRY_EUI64.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_EUI64;
            }

            if (VALUE_ENTRY_T10VID.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_T10VID;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VPD83NAA6.intValue()) {
                return VALUE_ENTRY_VPD83NAA6;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_VPD83NAA5.intValue()) {
                return VALUE_ENTRY_VPD83NAA5;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_VPD83Type2.intValue()) {
                return VALUE_ENTRY_VPD83Type2;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_VPD83Type1.intValue()) {
                return VALUE_ENTRY_VPD83Type1;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_VPD83Type0.intValue()) {
                return VALUE_ENTRY_VPD83Type0;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNVM.intValue()) {
                return VALUE_ENTRY_SNVM;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_NodeWWN.intValue()) {
                return VALUE_ENTRY_NodeWWN;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_NAA.intValue()) {
                return VALUE_ENTRY_NAA;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_EUI64.intValue()) {
                return VALUE_ENTRY_EUI64;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_T10VID.intValue()) {
                return VALUE_ENTRY_T10VID;
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
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VPD83NAA6,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_VPD83NAA5,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_VPD83Type2,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_VPD83Type1,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_VPD83Type0,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNVM, VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_NodeWWN,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_NAA, VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_EUI64,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_T10VID,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_OS_Device_Name };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property NameFormat   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_VPD83NAA6, VALUE_ENTRY_VPD83NAA5, VALUE_ENTRY_VPD83Type2,
                VALUE_ENTRY_VPD83Type1, VALUE_ENTRY_VPD83Type0, VALUE_ENTRY_SNVM,
                VALUE_ENTRY_NodeWWN, VALUE_ENTRY_NAA, VALUE_ENTRY_EUI64, VALUE_ENTRY_T10VID,
                VALUE_ENTRY_OS_Device_Name };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property NameFormat   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_VPD83NAA6, VALUE_ENTRY_VPD83NAA5,
                VALUE_ENTRY_VPD83Type2, VALUE_ENTRY_VPD83Type1, VALUE_ENTRY_VPD83Type0,
                VALUE_ENTRY_SNVM, VALUE_ENTRY_NodeWWN, VALUE_ENTRY_NAA, VALUE_ENTRY_EUI64,
                VALUE_ENTRY_T10VID, VALUE_ENTRY_OS_Device_Name };

    }

    /**
     * Constants of property NameNamespace
     * The preferred source SCSI for volume names is SCSI VPD Page 83 responses. Page 83 returns a list of identifiers for various device elements. The metadata for each identifier includes an Association field, identifiers with association of 0 apply to volumes. Page 83 supports several namespaces specified in the Type field in the identifier metadata. See SCSI SPC-3 specification. 
     * 2 = VPD Page 83, Type 3 NAA (NameFormat SHOULD be NAA) 
     * 3 = VPD Page 83, Type 2 EUI64 (NameFormat EUI) 
     * 4 = VPD Page 83, Type 1 T10 Vendor Identification 
     * (NameFormat T10) 
     * Less preferred volume namespaces from other interfaces: 
     * 5 = VPD page 80, Serial number (NameFormat SHOULD be Other) 
     * 6 = FC NodeWWN (NameFormat SHOULD be NAA or EUI) 
     * 7 = Serial Number/Vendor/Model (NameFormat SHOULD be SNVM) 
     * The preferred namespace for LogigicalDisk names is platform specific device namespace; see LogigicalDIsk Description. 
     * 8 = OS Device Namespace.
     */
    public static class PROPERTY_NAMENAMESPACE {
        /**
         * name of the property NameNamespace
         */
        public final static String NAME = "NameNamespace";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VPD83Type3 = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry VPD83Type3 (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_VPD83Type3 = "VPD83Type3";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_VPD83Type2 = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry VPD83Type2 (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_VPD83Type2 = "VPD83Type2";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_VPD83Type1 = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry VPD83Type1 (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_VPD83Type1 = "VPD83Type1";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_VPD80 = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry VPD80 (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_VPD80 = "VPD80";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_NodeWWN = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry NodeWWN (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_NodeWWN = "NodeWWN";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNVM = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry SNVM (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_SNVM = "SNVM";

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

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_VPD83Type3.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VPD83Type3;
            }

            if (VALUE_ENTRY_VPD83Type2.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_VPD83Type2;
            }

            if (VALUE_ENTRY_VPD83Type1.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_VPD83Type1;
            }

            if (VALUE_ENTRY_VPD80.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_VPD80;
            }

            if (VALUE_ENTRY_NodeWWN.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_NodeWWN;
            }

            if (VALUE_ENTRY_SNVM.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNVM;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VPD83Type3.intValue()) {
                return VALUE_ENTRY_VPD83Type3;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_VPD83Type2.intValue()) {
                return VALUE_ENTRY_VPD83Type2;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_VPD83Type1.intValue()) {
                return VALUE_ENTRY_VPD83Type1;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_VPD80.intValue()) {
                return VALUE_ENTRY_VPD80;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_NodeWWN.intValue()) {
                return VALUE_ENTRY_NodeWWN;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNVM.intValue()) {
                return VALUE_ENTRY_SNVM;
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
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VPD83Type3,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_VPD83Type2,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_VPD83Type1,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_VPD80, VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_NodeWWN,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNVM,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_OS_Device_Namespace };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property NameNamespace   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_VPD83Type3, VALUE_ENTRY_VPD83Type2, VALUE_ENTRY_VPD83Type1,
                VALUE_ENTRY_VPD80, VALUE_ENTRY_NodeWWN, VALUE_ENTRY_SNVM,
                VALUE_ENTRY_OS_Device_Namespace };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property NameNamespace   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_VPD83Type3, VALUE_ENTRY_VPD83Type2,
                VALUE_ENTRY_VPD83Type1, VALUE_ENTRY_VPD80, VALUE_ENTRY_NodeWWN, VALUE_ENTRY_SNVM,
                VALUE_ENTRY_OS_Device_Namespace };

    }

    /**
     * Constants of property NoSinglePointOfFailure
     * Indicates whether or not there exists no single point of failure.
     */
    public static class PROPERTY_NOSINGLEPOINTOFFAILURE {
        /**
         * name of the property NoSinglePointOfFailure
         */
        public final static String NAME = "NoSinglePointOfFailure";

    }

    /**
     * Constants of property NumberOfBlocks
     * Total number of logically contiguous blocks, of size Block Size, which form this Extent. The total size of the Extent can be calculated by multiplying BlockSize by NumberOfBlocks. If the BlockSize is 1, this property is the total size of the Extent.
     */
    public static class PROPERTY_NUMBEROFBLOCKS {
        /**
         * name of the property NumberOfBlocks
         */
        public final static String NAME = "NumberOfBlocks";

    }

    /**
     * Constants of property OtherNameFormat
     * A string describing the format of the Name property when NameFormat includes the value 1, "Other".
     */
    public static class PROPERTY_OTHERNAMEFORMAT {
        /**
         * name of the property OtherNameFormat
         */
        public final static String NAME = "OtherNameFormat";

    }

    /**
     * Constants of property OtherNameNamespace
     * A string describing the namespace of the Name property when NameNamespace includes the value 1, "Other".
     */
    public static class PROPERTY_OTHERNAMENAMESPACE {
        /**
         * name of the property OtherNameNamespace
         */
        public final static String NAME = "OtherNameNamespace";

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
     * Constants of property PackageRedundancy
     * How many physical packages can currently fail without data loss. For example, in the storage domain, this might be disk spindles.
     */
    public static class PROPERTY_PACKAGEREDUNDANCY {
        /**
         * name of the property PackageRedundancy
         */
        public final static String NAME = "PackageRedundancy";

    }

    /**
     * Constants of property Primordial
     * If true, "Primordial" indicates that the containing System does not have the ability to create or delete this operational element. This is important because StorageExtents are assembled into higher-level abstractions using the BasedOn association. Although the higher-level abstractions can be created and deleted, the most basic, (i.e. primordial), hardware-based storage entities cannot. They are physically realized as part of the System, or are actually managed by some other System and imported as if they were physically realized. In other words, a Primordial StorageExtent exists in, but is not created by its System and conversely a non-Primordial StorageExtent is created in the context of its System. For StorageVolumes, this property will generally be false. One use of this property is to enable algorithms that aggregate StorageExtent.ConsumableSpace across all, StorageExtents but that also want to distinquish the space that underlies Primordial StoragePools. Since implementations are not required to surface all Component StorageExtents of a StoragePool, this information is not accessible in any other way.
     */
    public static class PROPERTY_PRIMORDIAL {
        /**
         * name of the property Primordial
         */
        public final static String NAME = "Primordial";

    }

    /**
     * Constants of property Purpose
     * A free form string describing the media and/or its use.
     */
    public static class PROPERTY_PURPOSE {
        /**
         * name of the property Purpose
         */
        public final static String NAME = "Purpose";

    }

    /**
     * Constants of property SequentialAccess
     * Boolean set to TRUE if the Storage is sequentially accessed by a MediaAccessDevice. A TapePartition is an example of a sequentially accessed StorageExtent. StorageVolumes, Disk Partitions and LogicalDisks represent randomly accessed Extents.
     */
    public static class PROPERTY_SEQUENTIALACCESS {
        /**
         * name of the property SequentialAccess
         */
        public final static String NAME = "SequentialAccess";

    }

    /**
     * Constants of property Usage
     * Indicates the intended usage or any restrictions that may have been imposed on the usage of this component. For example, an element may be reserved for use by the block server. In that case the Usage of the element is marked as "Reserved for the ComputerSystem". In the case of "Other", see OtherUsageDescription for more information.
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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Reserved_for_ComputerSystem__the_block_server_ = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Reserved for ComputerSystem (the block server) (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Reserved_for_ComputerSystem__the_block_server_ = "Reserved for ComputerSystem (the block server)";

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

            if (VALUE_ENTRY_Reserved_for_ComputerSystem__the_block_server_.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Reserved_for_ComputerSystem__the_block_server_;
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

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Reserved_for_ComputerSystem__the_block_server_
                    .intValue()) {
                return VALUE_ENTRY_Reserved_for_ComputerSystem__the_block_server_;
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
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Reserved_for_ComputerSystem__the_block_server_ };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Usage   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Unrestricted,
                VALUE_ENTRY_Reserved_for_ComputerSystem__the_block_server_,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Usage   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Unrestricted,
                VALUE_ENTRY_Reserved_for_ComputerSystem__the_block_server_ };

    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
        String[] parentClassPackageList = CIM_LogicalDevice.getPackages();

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
     *   StorageExtent describes the capabilities and management of the various media that exist to store data and allow data retrieval. This superclass could be used to represent the various components of RAID (Hardware or Software) or as a raw logical extent on top of physical media.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_StorageExtent(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   StorageExtent describes the capabilities and management of the various media that exist to store data and allow data retrieval. This superclass could be used to represent the various components of RAID (Hardware or Software) or as a raw logical extent on top of physical media.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_StorageExtent(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_StorageExtent() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Access", new CIMProperty("Access", CIMDataType.UINT16_T, null));
        propertiesToCheck
                .put("BlockSize", new CIMProperty("BlockSize", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ClientSettableUsage", new CIMProperty("ClientSettableUsage",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("ConsumableBlocks", new CIMProperty("ConsumableBlocks",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("DataOrganization", new CIMProperty("DataOrganization",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("DataRedundancy", new CIMProperty("DataRedundancy",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("DeltaReservation", new CIMProperty("DeltaReservation",
                CIMDataType.UINT8_T, null));
        propertiesToCheck.put("ErrorMethodology", new CIMProperty("ErrorMethodology",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("ExtentStatus", new CIMProperty("ExtentStatus",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("IsBasedOnUnderlyingRedundancy", new CIMProperty(
                "IsBasedOnUnderlyingRedundancy", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("Name", new CIMProperty("Name", CIMDataType.STRING_T, null));
        propertiesToCheck.put("NameFormat", new CIMProperty("NameFormat", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("NameNamespace", new CIMProperty("NameNamespace",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("NoSinglePointOfFailure", new CIMProperty("NoSinglePointOfFailure",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("NumberOfBlocks", new CIMProperty("NumberOfBlocks",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("OtherNameFormat", new CIMProperty("OtherNameFormat",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherNameNamespace", new CIMProperty("OtherNameNamespace",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherUsageDescription", new CIMProperty("OtherUsageDescription",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("PackageRedundancy", new CIMProperty("PackageRedundancy",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Primordial", new CIMProperty("Primordial", CIMDataType.BOOLEAN_T,
                null));
        propertiesToCheck.put("Purpose", new CIMProperty("Purpose", CIMDataType.STRING_T, null));
        propertiesToCheck.put("SequentialAccess", new CIMProperty("SequentialAccess",
                CIMDataType.BOOLEAN_T, null));
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
     * Get the property Access
     *     * <br>
     * Access describes whether the media is readable (value=1), writeable (value=2), or both (value=3). "Unknown" (0) and "Write Once" (4) can also be defined.
     *     */

    public javax.cim.UnsignedInteger16 get_Access() {
        CIMProperty currentProperty = getProperty(PROPERTY_ACCESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ACCESS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property Access
     * <br>
     * Access describes whether the media is readable (value=1), writeable (value=2), or both (value=3). "Unknown" (0) and "Write Once" (4) can also be defined.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Access(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ACCESS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Access(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ACCESS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Access by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Access(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ACCESS.NAME);
        if (property != null) {
            property = setPropertyValue_Access(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ACCESS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Access
     * <br>
     * Access describes whether the media is readable (value=1), writeable (value=2), or both (value=3). "Unknown" (0) and "Write Once" (4) can also be defined.
     */

    private static CIMProperty setPropertyValue_Access(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property BlockSize
     *     * <br>
     * Size in bytes of the blocks which form this StorageExtent. If variable block size, then the maximum block size in bytes should be specified. If the block size is unknown or if a block concept is not valid (for example, for AggregateExtents, Memory or LogicalDisks), enter a 1.
     *     */

    public javax.cim.UnsignedInteger64 get_BlockSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_BLOCKSIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BLOCKSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property BlockSize
     * <br>
     * Size in bytes of the blocks which form this StorageExtent. If variable block size, then the maximum block size in bytes should be specified. If the block size is unknown or if a block concept is not valid (for example, for AggregateExtents, Memory or LogicalDisks), enter a 1.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BlockSize(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BLOCKSIZE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_BlockSize(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BLOCKSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BlockSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BlockSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BLOCKSIZE.NAME);
        if (property != null) {
            property = setPropertyValue_BlockSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BLOCKSIZE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BlockSize
     * <br>
     * Size in bytes of the blocks which form this StorageExtent. If variable block size, then the maximum block size in bytes should be specified. If the block size is unknown or if a block concept is not valid (for example, for AggregateExtents, Memory or LogicalDisks), enter a 1.
     */

    private static CIMProperty setPropertyValue_BlockSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ClientSettableUsage
     *     * <br>
     * Indicates which values from the "Usage" valuemap can be manipulated by a client using the method "StorageConfigurationService.RequestUsageChange".
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
     * Indicates which values from the "Usage" valuemap can be manipulated by a client using the method "StorageConfigurationService.RequestUsageChange".
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
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
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
     * Indicates which values from the "Usage" valuemap can be manipulated by a client using the method "StorageConfigurationService.RequestUsageChange".
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
     * Get the property ConsumableBlocks
     *     * <br>
     * The maximum number of blocks, of size BlockSize, which are available for consumption when layering StorageExtents using the BasedOn association. This property only has meaning when this StorageExtent is an Antecedent reference in a BasedOn relationship. For example, a StorageExtent could be composed of 120 blocks. However, the Extent itself may use 20 blocks for redundancy data. If another StorageExtent is BasedOn this Extent, only 100 blocks would be available to it. This information ('100 blocks is available for consumption') is indicated in the ConsumableBlocks property.
     *     */

    public javax.cim.UnsignedInteger64 get_ConsumableBlocks() {
        CIMProperty currentProperty = getProperty(PROPERTY_CONSUMABLEBLOCKS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CONSUMABLEBLOCKS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ConsumableBlocks
     * <br>
     * The maximum number of blocks, of size BlockSize, which are available for consumption when layering StorageExtents using the BasedOn association. This property only has meaning when this StorageExtent is an Antecedent reference in a BasedOn relationship. For example, a StorageExtent could be composed of 120 blocks. However, the Extent itself may use 20 blocks for redundancy data. If another StorageExtent is BasedOn this Extent, only 100 blocks would be available to it. This information ('100 blocks is available for consumption') is indicated in the ConsumableBlocks property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ConsumableBlocks(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONSUMABLEBLOCKS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ConsumableBlocks(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CONSUMABLEBLOCKS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ConsumableBlocks by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConsumableBlocks(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONSUMABLEBLOCKS.NAME);
        if (property != null) {
            property = setPropertyValue_ConsumableBlocks(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CONSUMABLEBLOCKS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ConsumableBlocks
     * <br>
     * The maximum number of blocks, of size BlockSize, which are available for consumption when layering StorageExtents using the BasedOn association. This property only has meaning when this StorageExtent is an Antecedent reference in a BasedOn relationship. For example, a StorageExtent could be composed of 120 blocks. However, the Extent itself may use 20 blocks for redundancy data. If another StorageExtent is BasedOn this Extent, only 100 blocks would be available to it. This information ('100 blocks is available for consumption') is indicated in the ConsumableBlocks property.
     */

    private static CIMProperty setPropertyValue_ConsumableBlocks(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DataOrganization
     *     * <br>
     * Type of data organization used.
     *     */

    public javax.cim.UnsignedInteger16 get_DataOrganization() {
        CIMProperty currentProperty = getProperty(PROPERTY_DATAORGANIZATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DATAORGANIZATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property DataOrganization
     * <br>
     * Type of data organization used.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DataOrganization(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DATAORGANIZATION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_DataOrganization(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DATAORGANIZATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DataOrganization by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DataOrganization(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DATAORGANIZATION.NAME);
        if (property != null) {
            property = setPropertyValue_DataOrganization(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DATAORGANIZATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DataOrganization
     * <br>
     * Type of data organization used.
     */

    private static CIMProperty setPropertyValue_DataOrganization(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DataRedundancy
     *     * <br>
     * Number of complete copies of data currently maintained.
     *     */

    public javax.cim.UnsignedInteger16 get_DataRedundancy() {
        CIMProperty currentProperty = getProperty(PROPERTY_DATAREDUNDANCY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DATAREDUNDANCY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property DataRedundancy
     * <br>
     * Number of complete copies of data currently maintained.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DataRedundancy(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DATAREDUNDANCY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_DataRedundancy(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DATAREDUNDANCY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DataRedundancy by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DataRedundancy(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DATAREDUNDANCY.NAME);
        if (property != null) {
            property = setPropertyValue_DataRedundancy(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DATAREDUNDANCY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DataRedundancy
     * <br>
     * Number of complete copies of data currently maintained.
     */

    private static CIMProperty setPropertyValue_DataRedundancy(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DeltaReservation
     *     * <br>
     * Current value for Delta reservation. This is a percentage that specifies the amount of space that should be reserved in a replica for caching changes.
     *     */

    public javax.cim.UnsignedInteger8 get_DeltaReservation() {
        CIMProperty currentProperty = getProperty(PROPERTY_DELTARESERVATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DELTARESERVATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger8) currentProperty.getValue();

    }

    /**
     * Set the property DeltaReservation
     * <br>
     * Current value for Delta reservation. This is a percentage that specifies the amount of space that should be reserved in a replica for caching changes.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DeltaReservation(javax.cim.UnsignedInteger8 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DELTARESERVATION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_DeltaReservation(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DELTARESERVATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DeltaReservation by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DeltaReservation(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger8 newValue) throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DELTARESERVATION.NAME);
        if (property != null) {
            property = setPropertyValue_DeltaReservation(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DELTARESERVATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DeltaReservation
     * <br>
     * Current value for Delta reservation. This is a percentage that specifies the amount of space that should be reserved in a replica for caching changes.
     */

    private static CIMProperty setPropertyValue_DeltaReservation(CIMProperty currentProperty,
            javax.cim.UnsignedInteger8 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ErrorMethodology
     *     * <br>
     * ErrorMethodology is a free-form string describing the type of error detection and correction supported by this StorageExtent.
     *     */

    public String get_ErrorMethodology() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORMETHODOLOGY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORMETHODOLOGY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ErrorMethodology
     * <br>
     * ErrorMethodology is a free-form string describing the type of error detection and correction supported by this StorageExtent.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorMethodology(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORMETHODOLOGY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ErrorMethodology(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORMETHODOLOGY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorMethodology by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorMethodology(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORMETHODOLOGY.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorMethodology(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORMETHODOLOGY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorMethodology
     * <br>
     * ErrorMethodology is a free-form string describing the type of error detection and correction supported by this StorageExtent.
     */

    private static CIMProperty setPropertyValue_ErrorMethodology(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ExtentStatus
     *     * <br>
     * StorageExtents have additional status information beyond that captured in the OperationalStatus and other properties, inherited from ManagedSystemElement. This additional information (for example, "Protection Disabled", value=9) is captured in the ExtentStatus property. 
     * 'In-Band Access Granted' says that access to data on an extent is granted to some consumer and is only valid when 'Exported' is also set. It is set as a side effect of PrivilegeManagementService.ChangeAccess or equivalent interfaces. 
     * 'Imported' indicates that the extent is used in the current system, but known to be managed by some other system. For example, a server imports volumes from a disk array. 
     * 'Exported' indicates the extent is meant to be used by some comsumer. A disk array's logical units are exported. 
     * Intermediate composite extents may be neither imported nor exported.
     *     */

    public javax.cim.UnsignedInteger16[] get_ExtentStatus() {
        CIMProperty currentProperty = getProperty(PROPERTY_EXTENTSTATUS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_EXTENTSTATUS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property ExtentStatus
     * <br>
     * StorageExtents have additional status information beyond that captured in the OperationalStatus and other properties, inherited from ManagedSystemElement. This additional information (for example, "Protection Disabled", value=9) is captured in the ExtentStatus property. 
     * 'In-Band Access Granted' says that access to data on an extent is granted to some consumer and is only valid when 'Exported' is also set. It is set as a side effect of PrivilegeManagementService.ChangeAccess or equivalent interfaces. 
     * 'Imported' indicates that the extent is used in the current system, but known to be managed by some other system. For example, a server imports volumes from a disk array. 
     * 'Exported' indicates the extent is meant to be used by some comsumer. A disk array's logical units are exported. 
     * Intermediate composite extents may be neither imported nor exported.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ExtentStatus(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_EXTENTSTATUS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ExtentStatus(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_EXTENTSTATUS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ExtentStatus by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ExtentStatus(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_EXTENTSTATUS.NAME);
        if (property != null) {
            property = setPropertyValue_ExtentStatus(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_EXTENTSTATUS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ExtentStatus
     * <br>
     * StorageExtents have additional status information beyond that captured in the OperationalStatus and other properties, inherited from ManagedSystemElement. This additional information (for example, "Protection Disabled", value=9) is captured in the ExtentStatus property. 
     * 'In-Band Access Granted' says that access to data on an extent is granted to some consumer and is only valid when 'Exported' is also set. It is set as a side effect of PrivilegeManagementService.ChangeAccess or equivalent interfaces. 
     * 'Imported' indicates that the extent is used in the current system, but known to be managed by some other system. For example, a server imports volumes from a disk array. 
     * 'Exported' indicates the extent is meant to be used by some comsumer. A disk array's logical units are exported. 
     * Intermediate composite extents may be neither imported nor exported.
     */

    private static CIMProperty setPropertyValue_ExtentStatus(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IsBasedOnUnderlyingRedundancy
     *     * <br>
     * True indicates that the underlying StorageExtent(s) participate in a StorageRedundancyGroup.
     *     */

    public Boolean get_IsBasedOnUnderlyingRedundancy() {
        CIMProperty currentProperty = getProperty(PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property IsBasedOnUnderlyingRedundancy
     * <br>
     * True indicates that the underlying StorageExtent(s) participate in a StorageRedundancyGroup.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IsBasedOnUnderlyingRedundancy(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IsBasedOnUnderlyingRedundancy(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IsBasedOnUnderlyingRedundancy by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IsBasedOnUnderlyingRedundancy(WBEMClient client,
            String namespace, Boolean newValue) throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY.NAME);
        if (property != null) {
            property = setPropertyValue_IsBasedOnUnderlyingRedundancy(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IsBasedOnUnderlyingRedundancy
     * <br>
     * True indicates that the underlying StorageExtent(s) participate in a StorageRedundancyGroup.
     */

    private static CIMProperty setPropertyValue_IsBasedOnUnderlyingRedundancy(
            CIMProperty currentProperty, Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Name
     *     * <br>
     * A unique identifier for the Extent.
     *     */

    public String get_Name() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Name
     * <br>
     * A unique identifier for the Extent.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Name(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Name(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Name by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Name(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null) {
            property = setPropertyValue_Name(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Name
     * <br>
     * A unique identifier for the Extent.
     */

    private static CIMProperty setPropertyValue_Name(CIMProperty currentProperty, String newValue) {
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
     * The list here applies to all StorageExtent subclasses. Please look at the Description in each subclass for guidelines on the approriate values for that subclass. Note that any of these formats could apply to a CompositeExtent. 
     * 
     * Note - this property originally touched on two concepts that are now separated into this property and NameNamespace. Values 2,3,4,5,6, and 8 are retained for backwards compatibility but are deprecated in lieu of the corresponding values in CIM_StorageExtent.NameNamespace. 
     * 
     * For example, the preferred source for SCSI virtual (RAID) disk names is from Inquiry VPD page 83 response, type 3 identifiers. These will have NameFormat set to 'NAA' and NameNamespace to 'VPD83Type3'. 
     * 
     * Format of the Name property. Values for extents representing SCSI volumes are (per SCSI SPC-3): 
     * 2 = VPD Page 83, NAA IEEE Registered Extended (VPD83NAA6) 
     * (DEPRECATED) 
     * 3 = VPD Page 83, NAA IEEE Registered (VPD83NAA5) 
     * (DEPRECATED) 
     * 4 = VPD Page 83, (VPD83Type2) (DEPRECATED) 
     * 5 = VPD Page 83, 
     * T10 Vendor Identification (VPD83Type1) (DEPRECATED) 
     * 6 = VPD Page 83, Vendor Specific (VPD83Type0) (DEPRECATED) 
     * 7 = Serial Number/Vendor/Model (SNVM) SNVM is 3 strings representing the vendor name, product name within the vendor namespace, and the serial number within the model namespace. Strings are delimited with a '+'. Spaces may be included and are significant. The serial number is the text representation of the serial number in hexadecimal upper case. This represents the vendor and model ID from SCSI Inquiry data; the vendor field MUST be 8 characters wide and the product field MUST be 16 characters wide. For example, 
     * 'ACME____+SUPER DISK______+124437458' (_ is a space character) 
     * 8 = Node WWN (for single LUN/controller) (NodeWWN) 
     * (DEPRECATED) 
     * 9 = NAA as a generic format. See 
     * http://standards.ieee.org/regauth/oui/tutorials/fibrecomp_id.html. Formatted as 16 or 32 unseparated uppercase hex characters (2 per binary byte). For example '21000020372D3C73' 
     * 10 = EUI as a generic format (EUI64) See 
     * http://standards.ieee.org/regauth/oui/tutorials/EUI64.html. 
     * Formatted as 16 unseparated uppercase hex characters (2 per binary byte) 
     * 11 = T10 vendor identifier format as returned by SCSI Inquiry VPD page 83, identifier type 1. See T10 SPC-3 specification. This is the 8-byte ASCII vendor ID from the T10 registry followed by a vendor specific ASCII identifier; spaces are permitted. For non SCSI volumes, 'SNVM' may be the most appropriate choice. 12 = OS Device Name (for LogicalDisks). See LogicalDisk Name description for details.
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
     * The list here applies to all StorageExtent subclasses. Please look at the Description in each subclass for guidelines on the approriate values for that subclass. Note that any of these formats could apply to a CompositeExtent. 
     * 
     * Note - this property originally touched on two concepts that are now separated into this property and NameNamespace. Values 2,3,4,5,6, and 8 are retained for backwards compatibility but are deprecated in lieu of the corresponding values in CIM_StorageExtent.NameNamespace. 
     * 
     * For example, the preferred source for SCSI virtual (RAID) disk names is from Inquiry VPD page 83 response, type 3 identifiers. These will have NameFormat set to 'NAA' and NameNamespace to 'VPD83Type3'. 
     * 
     * Format of the Name property. Values for extents representing SCSI volumes are (per SCSI SPC-3): 
     * 2 = VPD Page 83, NAA IEEE Registered Extended (VPD83NAA6) 
     * (DEPRECATED) 
     * 3 = VPD Page 83, NAA IEEE Registered (VPD83NAA5) 
     * (DEPRECATED) 
     * 4 = VPD Page 83, (VPD83Type2) (DEPRECATED) 
     * 5 = VPD Page 83, 
     * T10 Vendor Identification (VPD83Type1) (DEPRECATED) 
     * 6 = VPD Page 83, Vendor Specific (VPD83Type0) (DEPRECATED) 
     * 7 = Serial Number/Vendor/Model (SNVM) SNVM is 3 strings representing the vendor name, product name within the vendor namespace, and the serial number within the model namespace. Strings are delimited with a '+'. Spaces may be included and are significant. The serial number is the text representation of the serial number in hexadecimal upper case. This represents the vendor and model ID from SCSI Inquiry data; the vendor field MUST be 8 characters wide and the product field MUST be 16 characters wide. For example, 
     * 'ACME____+SUPER DISK______+124437458' (_ is a space character) 
     * 8 = Node WWN (for single LUN/controller) (NodeWWN) 
     * (DEPRECATED) 
     * 9 = NAA as a generic format. See 
     * http://standards.ieee.org/regauth/oui/tutorials/fibrecomp_id.html. Formatted as 16 or 32 unseparated uppercase hex characters (2 per binary byte). For example '21000020372D3C73' 
     * 10 = EUI as a generic format (EUI64) See 
     * http://standards.ieee.org/regauth/oui/tutorials/EUI64.html. 
     * Formatted as 16 unseparated uppercase hex characters (2 per binary byte) 
     * 11 = T10 vendor identifier format as returned by SCSI Inquiry VPD page 83, identifier type 1. See T10 SPC-3 specification. This is the 8-byte ASCII vendor ID from the T10 registry followed by a vendor specific ASCII identifier; spaces are permitted. For non SCSI volumes, 'SNVM' may be the most appropriate choice. 12 = OS Device Name (for LogicalDisks). See LogicalDisk Name description for details.
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
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
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
     * The list here applies to all StorageExtent subclasses. Please look at the Description in each subclass for guidelines on the approriate values for that subclass. Note that any of these formats could apply to a CompositeExtent. 
     * 
     * Note - this property originally touched on two concepts that are now separated into this property and NameNamespace. Values 2,3,4,5,6, and 8 are retained for backwards compatibility but are deprecated in lieu of the corresponding values in CIM_StorageExtent.NameNamespace. 
     * 
     * For example, the preferred source for SCSI virtual (RAID) disk names is from Inquiry VPD page 83 response, type 3 identifiers. These will have NameFormat set to 'NAA' and NameNamespace to 'VPD83Type3'. 
     * 
     * Format of the Name property. Values for extents representing SCSI volumes are (per SCSI SPC-3): 
     * 2 = VPD Page 83, NAA IEEE Registered Extended (VPD83NAA6) 
     * (DEPRECATED) 
     * 3 = VPD Page 83, NAA IEEE Registered (VPD83NAA5) 
     * (DEPRECATED) 
     * 4 = VPD Page 83, (VPD83Type2) (DEPRECATED) 
     * 5 = VPD Page 83, 
     * T10 Vendor Identification (VPD83Type1) (DEPRECATED) 
     * 6 = VPD Page 83, Vendor Specific (VPD83Type0) (DEPRECATED) 
     * 7 = Serial Number/Vendor/Model (SNVM) SNVM is 3 strings representing the vendor name, product name within the vendor namespace, and the serial number within the model namespace. Strings are delimited with a '+'. Spaces may be included and are significant. The serial number is the text representation of the serial number in hexadecimal upper case. This represents the vendor and model ID from SCSI Inquiry data; the vendor field MUST be 8 characters wide and the product field MUST be 16 characters wide. For example, 
     * 'ACME____+SUPER DISK______+124437458' (_ is a space character) 
     * 8 = Node WWN (for single LUN/controller) (NodeWWN) 
     * (DEPRECATED) 
     * 9 = NAA as a generic format. See 
     * http://standards.ieee.org/regauth/oui/tutorials/fibrecomp_id.html. Formatted as 16 or 32 unseparated uppercase hex characters (2 per binary byte). For example '21000020372D3C73' 
     * 10 = EUI as a generic format (EUI64) See 
     * http://standards.ieee.org/regauth/oui/tutorials/EUI64.html. 
     * Formatted as 16 unseparated uppercase hex characters (2 per binary byte) 
     * 11 = T10 vendor identifier format as returned by SCSI Inquiry VPD page 83, identifier type 1. See T10 SPC-3 specification. This is the 8-byte ASCII vendor ID from the T10 registry followed by a vendor specific ASCII identifier; spaces are permitted. For non SCSI volumes, 'SNVM' may be the most appropriate choice. 12 = OS Device Name (for LogicalDisks). See LogicalDisk Name description for details.
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
     * The preferred source SCSI for volume names is SCSI VPD Page 83 responses. Page 83 returns a list of identifiers for various device elements. The metadata for each identifier includes an Association field, identifiers with association of 0 apply to volumes. Page 83 supports several namespaces specified in the Type field in the identifier metadata. See SCSI SPC-3 specification. 
     * 2 = VPD Page 83, Type 3 NAA (NameFormat SHOULD be NAA) 
     * 3 = VPD Page 83, Type 2 EUI64 (NameFormat EUI) 
     * 4 = VPD Page 83, Type 1 T10 Vendor Identification 
     * (NameFormat T10) 
     * Less preferred volume namespaces from other interfaces: 
     * 5 = VPD page 80, Serial number (NameFormat SHOULD be Other) 
     * 6 = FC NodeWWN (NameFormat SHOULD be NAA or EUI) 
     * 7 = Serial Number/Vendor/Model (NameFormat SHOULD be SNVM) 
     * The preferred namespace for LogigicalDisk names is platform specific device namespace; see LogigicalDIsk Description. 
     * 8 = OS Device Namespace.
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
     * The preferred source SCSI for volume names is SCSI VPD Page 83 responses. Page 83 returns a list of identifiers for various device elements. The metadata for each identifier includes an Association field, identifiers with association of 0 apply to volumes. Page 83 supports several namespaces specified in the Type field in the identifier metadata. See SCSI SPC-3 specification. 
     * 2 = VPD Page 83, Type 3 NAA (NameFormat SHOULD be NAA) 
     * 3 = VPD Page 83, Type 2 EUI64 (NameFormat EUI) 
     * 4 = VPD Page 83, Type 1 T10 Vendor Identification 
     * (NameFormat T10) 
     * Less preferred volume namespaces from other interfaces: 
     * 5 = VPD page 80, Serial number (NameFormat SHOULD be Other) 
     * 6 = FC NodeWWN (NameFormat SHOULD be NAA or EUI) 
     * 7 = Serial Number/Vendor/Model (NameFormat SHOULD be SNVM) 
     * The preferred namespace for LogigicalDisk names is platform specific device namespace; see LogigicalDIsk Description. 
     * 8 = OS Device Namespace.
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
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
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
     * The preferred source SCSI for volume names is SCSI VPD Page 83 responses. Page 83 returns a list of identifiers for various device elements. The metadata for each identifier includes an Association field, identifiers with association of 0 apply to volumes. Page 83 supports several namespaces specified in the Type field in the identifier metadata. See SCSI SPC-3 specification. 
     * 2 = VPD Page 83, Type 3 NAA (NameFormat SHOULD be NAA) 
     * 3 = VPD Page 83, Type 2 EUI64 (NameFormat EUI) 
     * 4 = VPD Page 83, Type 1 T10 Vendor Identification 
     * (NameFormat T10) 
     * Less preferred volume namespaces from other interfaces: 
     * 5 = VPD page 80, Serial number (NameFormat SHOULD be Other) 
     * 6 = FC NodeWWN (NameFormat SHOULD be NAA or EUI) 
     * 7 = Serial Number/Vendor/Model (NameFormat SHOULD be SNVM) 
     * The preferred namespace for LogigicalDisk names is platform specific device namespace; see LogigicalDIsk Description. 
     * 8 = OS Device Namespace.
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
     * Get the property NoSinglePointOfFailure
     *     * <br>
     * Indicates whether or not there exists no single point of failure.
     *     */

    public Boolean get_NoSinglePointOfFailure() {
        CIMProperty currentProperty = getProperty(PROPERTY_NOSINGLEPOINTOFFAILURE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NOSINGLEPOINTOFFAILURE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property NoSinglePointOfFailure
     * <br>
     * Indicates whether or not there exists no single point of failure.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NoSinglePointOfFailure(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NOSINGLEPOINTOFFAILURE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_NoSinglePointOfFailure(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NOSINGLEPOINTOFFAILURE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NoSinglePointOfFailure by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NoSinglePointOfFailure(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NOSINGLEPOINTOFFAILURE.NAME);
        if (property != null) {
            property = setPropertyValue_NoSinglePointOfFailure(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NOSINGLEPOINTOFFAILURE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NoSinglePointOfFailure
     * <br>
     * Indicates whether or not there exists no single point of failure.
     */

    private static CIMProperty setPropertyValue_NoSinglePointOfFailure(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NumberOfBlocks
     *     * <br>
     * Total number of logically contiguous blocks, of size Block Size, which form this Extent. The total size of the Extent can be calculated by multiplying BlockSize by NumberOfBlocks. If the BlockSize is 1, this property is the total size of the Extent.
     *     */

    public javax.cim.UnsignedInteger64 get_NumberOfBlocks() {
        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFBLOCKS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NUMBEROFBLOCKS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property NumberOfBlocks
     * <br>
     * Total number of logically contiguous blocks, of size Block Size, which form this Extent. The total size of the Extent can be calculated by multiplying BlockSize by NumberOfBlocks. If the BlockSize is 1, this property is the total size of the Extent.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NumberOfBlocks(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFBLOCKS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_NumberOfBlocks(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NUMBEROFBLOCKS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NumberOfBlocks by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NumberOfBlocks(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NUMBEROFBLOCKS.NAME);
        if (property != null) {
            property = setPropertyValue_NumberOfBlocks(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NUMBEROFBLOCKS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NumberOfBlocks
     * <br>
     * Total number of logically contiguous blocks, of size Block Size, which form this Extent. The total size of the Extent can be calculated by multiplying BlockSize by NumberOfBlocks. If the BlockSize is 1, this property is the total size of the Extent.
     */

    private static CIMProperty setPropertyValue_NumberOfBlocks(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherNameFormat
     *     * <br>
     * A string describing the format of the Name property when NameFormat includes the value 1, "Other".
     *     */

    public String get_OtherNameFormat() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERNAMEFORMAT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERNAMEFORMAT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherNameFormat
     * <br>
     * A string describing the format of the Name property when NameFormat includes the value 1, "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherNameFormat(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERNAMEFORMAT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherNameFormat(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERNAMEFORMAT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherNameFormat by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherNameFormat(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERNAMEFORMAT.NAME);
        if (property != null) {
            property = setPropertyValue_OtherNameFormat(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERNAMEFORMAT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherNameFormat
     * <br>
     * A string describing the format of the Name property when NameFormat includes the value 1, "Other".
     */

    private static CIMProperty setPropertyValue_OtherNameFormat(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherNameNamespace
     *     * <br>
     * A string describing the namespace of the Name property when NameNamespace includes the value 1, "Other".
     *     */

    public String get_OtherNameNamespace() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERNAMENAMESPACE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERNAMENAMESPACE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherNameNamespace
     * <br>
     * A string describing the namespace of the Name property when NameNamespace includes the value 1, "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherNameNamespace(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERNAMENAMESPACE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherNameNamespace(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERNAMENAMESPACE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherNameNamespace by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherNameNamespace(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERNAMENAMESPACE.NAME);
        if (property != null) {
            property = setPropertyValue_OtherNameNamespace(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERNAMENAMESPACE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherNameNamespace
     * <br>
     * A string describing the namespace of the Name property when NameNamespace includes the value 1, "Other".
     */

    private static CIMProperty setPropertyValue_OtherNameNamespace(CIMProperty currentProperty,
            String newValue) {
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
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
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
     * Get the property PackageRedundancy
     *     * <br>
     * How many physical packages can currently fail without data loss. For example, in the storage domain, this might be disk spindles.
     *     */

    public javax.cim.UnsignedInteger16 get_PackageRedundancy() {
        CIMProperty currentProperty = getProperty(PROPERTY_PACKAGEREDUNDANCY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PACKAGEREDUNDANCY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property PackageRedundancy
     * <br>
     * How many physical packages can currently fail without data loss. For example, in the storage domain, this might be disk spindles.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PackageRedundancy(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PACKAGEREDUNDANCY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PackageRedundancy(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PACKAGEREDUNDANCY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PackageRedundancy by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PackageRedundancy(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PACKAGEREDUNDANCY.NAME);
        if (property != null) {
            property = setPropertyValue_PackageRedundancy(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PACKAGEREDUNDANCY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PackageRedundancy
     * <br>
     * How many physical packages can currently fail without data loss. For example, in the storage domain, this might be disk spindles.
     */

    private static CIMProperty setPropertyValue_PackageRedundancy(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Primordial
     *     * <br>
     * If true, "Primordial" indicates that the containing System does not have the ability to create or delete this operational element. This is important because StorageExtents are assembled into higher-level abstractions using the BasedOn association. Although the higher-level abstractions can be created and deleted, the most basic, (i.e. primordial), hardware-based storage entities cannot. They are physically realized as part of the System, or are actually managed by some other System and imported as if they were physically realized. In other words, a Primordial StorageExtent exists in, but is not created by its System and conversely a non-Primordial StorageExtent is created in the context of its System. For StorageVolumes, this property will generally be false. One use of this property is to enable algorithms that aggregate StorageExtent.ConsumableSpace across all, StorageExtents but that also want to distinquish the space that underlies Primordial StoragePools. Since implementations are not required to surface all Component StorageExtents of a StoragePool, this information is not accessible in any other way.
     *     */

    public Boolean get_Primordial() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIMORDIAL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRIMORDIAL.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property Primordial
     * <br>
     * If true, "Primordial" indicates that the containing System does not have the ability to create or delete this operational element. This is important because StorageExtents are assembled into higher-level abstractions using the BasedOn association. Although the higher-level abstractions can be created and deleted, the most basic, (i.e. primordial), hardware-based storage entities cannot. They are physically realized as part of the System, or are actually managed by some other System and imported as if they were physically realized. In other words, a Primordial StorageExtent exists in, but is not created by its System and conversely a non-Primordial StorageExtent is created in the context of its System. For StorageVolumes, this property will generally be false. One use of this property is to enable algorithms that aggregate StorageExtent.ConsumableSpace across all, StorageExtents but that also want to distinquish the space that underlies Primordial StoragePools. Since implementations are not required to surface all Component StorageExtents of a StoragePool, this information is not accessible in any other way.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Primordial(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIMORDIAL.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Primordial(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRIMORDIAL.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Primordial by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Primordial(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRIMORDIAL.NAME);
        if (property != null) {
            property = setPropertyValue_Primordial(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRIMORDIAL.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Primordial
     * <br>
     * If true, "Primordial" indicates that the containing System does not have the ability to create or delete this operational element. This is important because StorageExtents are assembled into higher-level abstractions using the BasedOn association. Although the higher-level abstractions can be created and deleted, the most basic, (i.e. primordial), hardware-based storage entities cannot. They are physically realized as part of the System, or are actually managed by some other System and imported as if they were physically realized. In other words, a Primordial StorageExtent exists in, but is not created by its System and conversely a non-Primordial StorageExtent is created in the context of its System. For StorageVolumes, this property will generally be false. One use of this property is to enable algorithms that aggregate StorageExtent.ConsumableSpace across all, StorageExtents but that also want to distinquish the space that underlies Primordial StoragePools. Since implementations are not required to surface all Component StorageExtents of a StoragePool, this information is not accessible in any other way.
     */

    private static CIMProperty setPropertyValue_Primordial(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Purpose
     *     * <br>
     * A free form string describing the media and/or its use.
     *     */

    public String get_Purpose() {
        CIMProperty currentProperty = getProperty(PROPERTY_PURPOSE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PURPOSE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Purpose
     * <br>
     * A free form string describing the media and/or its use.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Purpose(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PURPOSE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Purpose(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PURPOSE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Purpose by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Purpose(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PURPOSE.NAME);
        if (property != null) {
            property = setPropertyValue_Purpose(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PURPOSE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Purpose
     * <br>
     * A free form string describing the media and/or its use.
     */

    private static CIMProperty setPropertyValue_Purpose(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SequentialAccess
     *     * <br>
     * Boolean set to TRUE if the Storage is sequentially accessed by a MediaAccessDevice. A TapePartition is an example of a sequentially accessed StorageExtent. StorageVolumes, Disk Partitions and LogicalDisks represent randomly accessed Extents.
     *     */

    public Boolean get_SequentialAccess() {
        CIMProperty currentProperty = getProperty(PROPERTY_SEQUENTIALACCESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SEQUENTIALACCESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property SequentialAccess
     * <br>
     * Boolean set to TRUE if the Storage is sequentially accessed by a MediaAccessDevice. A TapePartition is an example of a sequentially accessed StorageExtent. StorageVolumes, Disk Partitions and LogicalDisks represent randomly accessed Extents.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SequentialAccess(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SEQUENTIALACCESS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SequentialAccess(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SEQUENTIALACCESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SequentialAccess by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SequentialAccess(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SEQUENTIALACCESS.NAME);
        if (property != null) {
            property = setPropertyValue_SequentialAccess(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SEQUENTIALACCESS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SequentialAccess
     * <br>
     * Boolean set to TRUE if the Storage is sequentially accessed by a MediaAccessDevice. A TapePartition is an example of a sequentially accessed StorageExtent. StorageVolumes, Disk Partitions and LogicalDisks represent randomly accessed Extents.
     */

    private static CIMProperty setPropertyValue_SequentialAccess(CIMProperty currentProperty,
            Boolean newValue) {
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
     * Indicates the intended usage or any restrictions that may have been imposed on the usage of this component. For example, an element may be reserved for use by the block server. In that case the Usage of the element is marked as "Reserved for the ComputerSystem". In the case of "Other", see OtherUsageDescription for more information.
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
     * Indicates the intended usage or any restrictions that may have been imposed on the usage of this component. For example, an element may be reserved for use by the block server. In that case the Usage of the element is marked as "Reserved for the ComputerSystem". In the case of "Other", see OtherUsageDescription for more information.
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
        CIM_StorageExtent fco = new CIM_StorageExtent(client, namespace);
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
     * Indicates the intended usage or any restrictions that may have been imposed on the usage of this component. For example, an element may be reserved for use by the block server. In that case the Usage of the element is marked as "Reserved for the ComputerSystem". In the case of "Other", see OtherUsageDescription for more information.
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
        return CIM_StorageExtent.CIM_CLASS_NAME;
    }

}