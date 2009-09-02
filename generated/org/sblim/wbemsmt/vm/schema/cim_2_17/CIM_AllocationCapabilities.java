/**
 * CIM_AllocationCapabilities.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS PROVIDED UNDER THE
 * TERMS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS
 * FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the
 * Common Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: CIM_AllocationCapabilities extends the
 *            CIM_Capabilities class for thepurposes of expressing the resource allocation
 *            capabilities of the associated managed element for the allocation of a specific
 *            Resource Type. This class describes the supported types of allocations allowed,
 *            specific or general, the sharing modes supported for the device, dedicated and or
 *            shared and the system states where the addition or removal of the Resource Type is
 *            allowed. generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_AllocationCapabilities extends CIM_Capabilities {

    public final static String CIM_CLASS_NAME = "CIM_AllocationCapabilities";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property OtherResourceType
     * A string that describes the resource type when a well defined value is not available and ResourceType has the value "Other".
     */
    public static class PROPERTY_OTHERRESOURCETYPE {
        /**
         * name of the property OtherResourceType
         */
        public final static String NAME = "OtherResourceType";

    }

    /**
     * Constants of property RequestTypesSupported
     * Indicates whether requesting a specific resource is supported 
     * "Specific" -- request can include a request for specific resource 
     * "General" -- request does not include specific resource 
     * "Both" -- both specific and general requests are supported.
     */
    public static class PROPERTY_REQUESTTYPESSUPPORTED {
        /**
         * name of the property RequestTypesSupported
         */
        public final static String NAME = "RequestTypesSupported";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Specific = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Specific (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Specific = "Specific";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_General = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry General (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_General = "General";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Both = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Both (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Both = "Both";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF reserved (corresponds to mapEntry .. )
         */
        public final static String VALUE_ENTRY_DMTF_reserved = "DMTF reserved";

        /**
         * constant for value map entry 0x8000..0xFFFF
         */

        /**
         * constant for value entry Vendor Reserved (corresponds to mapEntry 0x8000..0xFFFF )
         */
        public final static String VALUE_ENTRY_Vendor_Reserved = "Vendor Reserved";

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

            if (VALUE_ENTRY_Specific.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Specific;
            }

            if (VALUE_ENTRY_General.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_General;
            }

            if (VALUE_ENTRY_Both.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Both;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Specific.intValue()) {
                return VALUE_ENTRY_Specific;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_General.intValue()) {
                return VALUE_ENTRY_General;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Both.intValue()) {
                return VALUE_ENTRY_Both;
            }

            if (iValue >= 0x8000 || iValue <= 0xFFFF) {
                return VALUE_ENTRY_Vendor_Reserved;
            }
            return VALUE_ENTRY_DMTF_reserved;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property RequestTypesSupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Specific,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_General, VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Both };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property RequestTypesSupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Specific, VALUE_ENTRY_General, VALUE_ENTRY_Both,
                VALUE_ENTRY_DMTF_reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property RequestTypesSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Specific, VALUE_ENTRY_General, VALUE_ENTRY_Both };

    }

    /**
     * Constants of property ResourceSubType
     * A string describing an implementation specific sub-type for this resource. For example, this may be used to distinguish different models of the same resource type.
     */
    public static class PROPERTY_RESOURCESUBTYPE {
        /**
         * name of the property ResourceSubType
         */
        public final static String NAME = "ResourceSubType";

    }

    /**
     * Constants of property ResourceType
     * The type of resource this allocation setting represents.
     */
    public static class PROPERTY_RESOURCETYPE {
        /**
         * name of the property ResourceType
         */
        public final static String NAME = "ResourceType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Computer_System = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Computer System (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Computer_System = "Computer System";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Processor = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Processor (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Processor = "Processor";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Memory = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Memory (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Memory = "Memory";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IDE_Controller = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry IDE Controller (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_IDE_Controller = "IDE Controller";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Parallel_SCSI_HBA = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Parallel SCSI HBA (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Parallel_SCSI_HBA = "Parallel SCSI HBA";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_FC_HBA = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry FC HBA (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_FC_HBA = "FC HBA";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_iSCSI_HBA = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry iSCSI HBA (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_iSCSI_HBA = "iSCSI HBA";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_IB_HCA = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry IB HCA (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_IB_HCA = "IB HCA";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Ethernet_Adapter = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Ethernet Adapter (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Ethernet_Adapter = "Ethernet Adapter";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Other_Network_Adapter = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Other Network Adapter (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Other_Network_Adapter = "Other Network Adapter";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_I_O_Slot = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry I/O Slot (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_I_O_Slot = "I/O Slot";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_I_O_Device = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry I/O Device (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_I_O_Device = "I/O Device";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Floppy_Drive = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry Floppy Drive (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_Floppy_Drive = "Floppy Drive";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_CD_Drive = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry CD Drive (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_CD_Drive = "CD Drive";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_DVD_drive = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry DVD drive (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_DVD_drive = "DVD drive";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Serial_port = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry Serial port (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_Serial_port = "Serial port";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Parallel_port = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry Parallel port (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_Parallel_port = "Parallel port";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_USB_Controller = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry USB Controller (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_USB_Controller = "USB Controller";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Graphics_controller = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry Graphics controller (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_Graphics_controller = "Graphics controller";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Storage_Extent = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry Storage Extent (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_Storage_Extent = "Storage Extent";

        /**
         * constant for value map entry 22
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Disk = new javax.cim.UnsignedInteger16(
                "22");

        /**
         * constant for value entry Disk (corresponds to mapEntry 22 )
         */
        public final static String VALUE_ENTRY_Disk = "Disk";

        /**
         * constant for value map entry 23
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_Tape = new javax.cim.UnsignedInteger16(
                "23");

        /**
         * constant for value entry Tape (corresponds to mapEntry 23 )
         */
        public final static String VALUE_ENTRY_Tape = "Tape";

        /**
         * constant for value map entry 24
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Other_storage_device = new javax.cim.UnsignedInteger16(
                "24");

        /**
         * constant for value entry Other storage device (corresponds to mapEntry 24 )
         */
        public final static String VALUE_ENTRY_Other_storage_device = "Other storage device";

        /**
         * constant for value map entry 25
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_IEEE_1394_Controller = new javax.cim.UnsignedInteger16(
                "25");

        /**
         * constant for value entry IEEE 1394 Controller (corresponds to mapEntry 25 )
         */
        public final static String VALUE_ENTRY_IEEE_1394_Controller = "IEEE 1394 Controller";

        /**
         * constant for value map entry 26
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_Partitionable_Unit = new javax.cim.UnsignedInteger16(
                "26");

        /**
         * constant for value entry Partitionable Unit (corresponds to mapEntry 26 )
         */
        public final static String VALUE_ENTRY_Partitionable_Unit = "Partitionable Unit";

        /**
         * constant for value map entry 27
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Base_Partitionable_Unit = new javax.cim.UnsignedInteger16(
                "27");

        /**
         * constant for value entry Base Partitionable Unit (corresponds to mapEntry 27 )
         */
        public final static String VALUE_ENTRY_Base_Partitionable_Unit = "Base Partitionable Unit";

        /**
         * constant for value map entry 28
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Power = new javax.cim.UnsignedInteger16(
                "28");

        /**
         * constant for value entry Power (corresponds to mapEntry 28 )
         */
        public final static String VALUE_ENTRY_Power = "Power";

        /**
         * constant for value map entry 29
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Cooling_Capacity = new javax.cim.UnsignedInteger16(
                "29");

        /**
         * constant for value entry Cooling Capacity (corresponds to mapEntry 29 )
         */
        public final static String VALUE_ENTRY_Cooling_Capacity = "Cooling Capacity";

        /**
         * constant for value map entry 30
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Ethernet_Switch_Port = new javax.cim.UnsignedInteger16(
                "30");

        /**
         * constant for value entry Ethernet Switch Port (corresponds to mapEntry 30 )
         */
        public final static String VALUE_ENTRY_Ethernet_Switch_Port = "Ethernet Switch Port";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF reserved (corresponds to mapEntry .. )
         */
        public final static String VALUE_ENTRY_DMTF_reserved = "DMTF reserved";

        /**
         * constant for value map entry 0x8000..0xFFFF
         */

        /**
         * constant for value entry Vendor Reserved (corresponds to mapEntry 0x8000..0xFFFF )
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

            if (VALUE_ENTRY_Computer_System.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Computer_System;
            }

            if (VALUE_ENTRY_Processor.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Processor;
            }

            if (VALUE_ENTRY_Memory.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Memory;
            }

            if (VALUE_ENTRY_IDE_Controller.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IDE_Controller;
            }

            if (VALUE_ENTRY_Parallel_SCSI_HBA.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Parallel_SCSI_HBA;
            }

            if (VALUE_ENTRY_FC_HBA.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_FC_HBA;
            }

            if (VALUE_ENTRY_iSCSI_HBA.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_iSCSI_HBA;
            }

            if (VALUE_ENTRY_IB_HCA.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_IB_HCA;
            }

            if (VALUE_ENTRY_Ethernet_Adapter.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Ethernet_Adapter;
            }

            if (VALUE_ENTRY_Other_Network_Adapter.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Other_Network_Adapter;
            }

            if (VALUE_ENTRY_I_O_Slot.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_I_O_Slot;
            }

            if (VALUE_ENTRY_I_O_Device.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_I_O_Device;
            }

            if (VALUE_ENTRY_Floppy_Drive.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Floppy_Drive;
            }

            if (VALUE_ENTRY_CD_Drive.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_CD_Drive;
            }

            if (VALUE_ENTRY_DVD_drive.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_DVD_drive;
            }

            if (VALUE_ENTRY_Serial_port.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Serial_port;
            }

            if (VALUE_ENTRY_Parallel_port.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Parallel_port;
            }

            if (VALUE_ENTRY_USB_Controller.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_USB_Controller;
            }

            if (VALUE_ENTRY_Graphics_controller.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Graphics_controller;
            }

            if (VALUE_ENTRY_Storage_Extent.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Storage_Extent;
            }

            if (VALUE_ENTRY_Disk.equals(value)) {
                return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Disk;
            }

            if (VALUE_ENTRY_Tape.equals(value)) {
                return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_Tape;
            }

            if (VALUE_ENTRY_Other_storage_device.equals(value)) {
                return VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Other_storage_device;
            }

            if (VALUE_ENTRY_IEEE_1394_Controller.equals(value)) {
                return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_IEEE_1394_Controller;
            }

            if (VALUE_ENTRY_Partitionable_Unit.equals(value)) {
                return VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_Partitionable_Unit;
            }

            if (VALUE_ENTRY_Base_Partitionable_Unit.equals(value)) {
                return VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Base_Partitionable_Unit;
            }

            if (VALUE_ENTRY_Power.equals(value)) {
                return VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Power;
            }

            if (VALUE_ENTRY_Cooling_Capacity.equals(value)) {
                return VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Cooling_Capacity;
            }

            if (VALUE_ENTRY_Ethernet_Switch_Port.equals(value)) {
                return VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Ethernet_Switch_Port;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Computer_System.intValue()) {
                return VALUE_ENTRY_Computer_System;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Processor.intValue()) {
                return VALUE_ENTRY_Processor;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Memory.intValue()) {
                return VALUE_ENTRY_Memory;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IDE_Controller.intValue()) {
                return VALUE_ENTRY_IDE_Controller;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Parallel_SCSI_HBA.intValue()) {
                return VALUE_ENTRY_Parallel_SCSI_HBA;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_FC_HBA.intValue()) {
                return VALUE_ENTRY_FC_HBA;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_iSCSI_HBA.intValue()) {
                return VALUE_ENTRY_iSCSI_HBA;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_IB_HCA.intValue()) {
                return VALUE_ENTRY_IB_HCA;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Ethernet_Adapter.intValue()) {
                return VALUE_ENTRY_Ethernet_Adapter;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Other_Network_Adapter.intValue()) {
                return VALUE_ENTRY_Other_Network_Adapter;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_I_O_Slot.intValue()) {
                return VALUE_ENTRY_I_O_Slot;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_I_O_Device.intValue()) {
                return VALUE_ENTRY_I_O_Device;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Floppy_Drive.intValue()) {
                return VALUE_ENTRY_Floppy_Drive;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_CD_Drive.intValue()) {
                return VALUE_ENTRY_CD_Drive;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_DVD_drive.intValue()) {
                return VALUE_ENTRY_DVD_drive;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Serial_port.intValue()) {
                return VALUE_ENTRY_Serial_port;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Parallel_port.intValue()) {
                return VALUE_ENTRY_Parallel_port;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_USB_Controller.intValue()) {
                return VALUE_ENTRY_USB_Controller;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Graphics_controller.intValue()) {
                return VALUE_ENTRY_Graphics_controller;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Storage_Extent.intValue()) {
                return VALUE_ENTRY_Storage_Extent;
            }

            if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Disk.intValue()) {
                return VALUE_ENTRY_Disk;
            }

            if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_Tape.intValue()) {
                return VALUE_ENTRY_Tape;
            }

            if (iValue == VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Other_storage_device.intValue()) {
                return VALUE_ENTRY_Other_storage_device;
            }

            if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_IEEE_1394_Controller.intValue()) {
                return VALUE_ENTRY_IEEE_1394_Controller;
            }

            if (iValue == VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_Partitionable_Unit.intValue()) {
                return VALUE_ENTRY_Partitionable_Unit;
            }

            if (iValue == VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Base_Partitionable_Unit.intValue()) {
                return VALUE_ENTRY_Base_Partitionable_Unit;
            }

            if (iValue == VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Power.intValue()) {
                return VALUE_ENTRY_Power;
            }

            if (iValue == VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Cooling_Capacity.intValue()) {
                return VALUE_ENTRY_Cooling_Capacity;
            }

            if (iValue == VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Ethernet_Switch_Port.intValue()) {
                return VALUE_ENTRY_Ethernet_Switch_Port;
            }

            if (iValue >= 0x8000 || iValue <= 0xFFFF) {
                return VALUE_ENTRY_Vendor_Reserved;
            }
            return VALUE_ENTRY_DMTF_reserved;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property ResourceType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Computer_System,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Processor,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Memory,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IDE_Controller,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Parallel_SCSI_HBA,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_FC_HBA,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_iSCSI_HBA,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_IB_HCA,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Ethernet_Adapter,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Other_Network_Adapter,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_I_O_Slot,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_I_O_Device,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Floppy_Drive,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_CD_Drive,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_DVD_drive,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Serial_port,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Parallel_port,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_USB_Controller,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Graphics_controller,
                VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Storage_Extent,
                VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Disk, VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_Tape,
                VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Other_storage_device,
                VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_IEEE_1394_Controller,
                VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_Partitionable_Unit,
                VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Base_Partitionable_Unit,
                VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Power,
                VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Cooling_Capacity,
                VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Ethernet_Switch_Port };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ResourceType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Computer_System, VALUE_ENTRY_Processor, VALUE_ENTRY_Memory,
                VALUE_ENTRY_IDE_Controller, VALUE_ENTRY_Parallel_SCSI_HBA, VALUE_ENTRY_FC_HBA,
                VALUE_ENTRY_iSCSI_HBA, VALUE_ENTRY_IB_HCA, VALUE_ENTRY_Ethernet_Adapter,
                VALUE_ENTRY_Other_Network_Adapter, VALUE_ENTRY_I_O_Slot, VALUE_ENTRY_I_O_Device,
                VALUE_ENTRY_Floppy_Drive, VALUE_ENTRY_CD_Drive, VALUE_ENTRY_DVD_drive,
                VALUE_ENTRY_Serial_port, VALUE_ENTRY_Parallel_port, VALUE_ENTRY_USB_Controller,
                VALUE_ENTRY_Graphics_controller, VALUE_ENTRY_Storage_Extent, VALUE_ENTRY_Disk,
                VALUE_ENTRY_Tape, VALUE_ENTRY_Other_storage_device,
                VALUE_ENTRY_IEEE_1394_Controller, VALUE_ENTRY_Partitionable_Unit,
                VALUE_ENTRY_Base_Partitionable_Unit, VALUE_ENTRY_Power,
                VALUE_ENTRY_Cooling_Capacity, VALUE_ENTRY_Ethernet_Switch_Port,
                VALUE_ENTRY_DMTF_reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ResourceType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Computer_System, VALUE_ENTRY_Processor, VALUE_ENTRY_Memory,
                VALUE_ENTRY_IDE_Controller, VALUE_ENTRY_Parallel_SCSI_HBA, VALUE_ENTRY_FC_HBA,
                VALUE_ENTRY_iSCSI_HBA, VALUE_ENTRY_IB_HCA, VALUE_ENTRY_Ethernet_Adapter,
                VALUE_ENTRY_Other_Network_Adapter, VALUE_ENTRY_I_O_Slot, VALUE_ENTRY_I_O_Device,
                VALUE_ENTRY_Floppy_Drive, VALUE_ENTRY_CD_Drive, VALUE_ENTRY_DVD_drive,
                VALUE_ENTRY_Serial_port, VALUE_ENTRY_Parallel_port, VALUE_ENTRY_USB_Controller,
                VALUE_ENTRY_Graphics_controller, VALUE_ENTRY_Storage_Extent, VALUE_ENTRY_Disk,
                VALUE_ENTRY_Tape, VALUE_ENTRY_Other_storage_device,
                VALUE_ENTRY_IEEE_1394_Controller, VALUE_ENTRY_Partitionable_Unit,
                VALUE_ENTRY_Base_Partitionable_Unit, VALUE_ENTRY_Power,
                VALUE_ENTRY_Cooling_Capacity, VALUE_ENTRY_Ethernet_Switch_Port };

    }

    /**
     * Constants of property SharingMode
     * Indicates how access to underlying resource is granted: 
     * "Dedicated" -- exclusive access to underlying resource 
     * "Shared" -- shared use of underlying resource. 
     * Actual quantity is controlled by min, max size, weights, etc.
     */
    public static class PROPERTY_SHARINGMODE {
        /**
         * name of the property SharingMode
         */
        public final static String NAME = "SharingMode";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Dedicated = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Dedicated (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Dedicated = "Dedicated";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Shared = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Shared (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Shared = "Shared";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF reserved (corresponds to mapEntry .. )
         */
        public final static String VALUE_ENTRY_DMTF_reserved = "DMTF reserved";

        /**
         * constant for value map entry 0x8000..0xFFFF
         */

        /**
         * constant for value entry Vendor Reserved (corresponds to mapEntry 0x8000..0xFFFF )
         */
        public final static String VALUE_ENTRY_Vendor_Reserved = "Vendor Reserved";

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

            if (VALUE_ENTRY_Dedicated.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Dedicated;
            }

            if (VALUE_ENTRY_Shared.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Shared;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Dedicated.intValue()) {
                return VALUE_ENTRY_Dedicated;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Shared.intValue()) {
                return VALUE_ENTRY_Shared;
            }

            if (iValue >= 0x8000 || iValue <= 0xFFFF) {
                return VALUE_ENTRY_Vendor_Reserved;
            }
            return VALUE_ENTRY_DMTF_reserved;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property SharingMode   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Dedicated,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Shared };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property SharingMode   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Dedicated, VALUE_ENTRY_Shared, VALUE_ENTRY_DMTF_reserved,
                VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property SharingMode   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Dedicated, VALUE_ENTRY_Shared };

    }

    /**
     * Constants of property SupportedAddStates
     * Indicates the states that the System, to which the resource will be associated via SystemDevice, may be in when a new resource is created.
     */
    public static class PROPERTY_SUPPORTEDADDSTATES {
        /**
         * name of the property SupportedAddStates
         */
        public final static String NAME = "SupportedAddStates";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Enabled (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Enabled = "Enabled";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Disabled (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Disabled = "Disabled";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutting_Down = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Shutting Down (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Shutting_Down = "Shutting Down";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enabled_but_Offline = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Enabled but Offline (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Enabled_but_Offline = "Enabled but Offline";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_In_Test = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry In Test (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_In_Test = "In Test";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Deferred = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Deferred (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Deferred = "Deferred";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Quiesce (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Quiesce = "Quiesce";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Starting = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Starting (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Starting = "Starting";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Paused = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Paused (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Paused = "Paused";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Suspended = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Suspended (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Suspended = "Suspended";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 0x8000..0xFFFF
         */

        /**
         * constant for value entry Vendor Reserved (corresponds to mapEntry 0x8000..0xFFFF )
         */
        public final static String VALUE_ENTRY_Vendor_Reserved = "Vendor Reserved";

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

            if (VALUE_ENTRY_Enabled.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled;
            }

            if (VALUE_ENTRY_Disabled.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled;
            }

            if (VALUE_ENTRY_Shutting_Down.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutting_Down;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable;
            }

            if (VALUE_ENTRY_Enabled_but_Offline.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enabled_but_Offline;
            }

            if (VALUE_ENTRY_In_Test.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_In_Test;
            }

            if (VALUE_ENTRY_Deferred.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Deferred;
            }

            if (VALUE_ENTRY_Quiesce.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce;
            }

            if (VALUE_ENTRY_Starting.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Starting;
            }

            if (VALUE_ENTRY_Paused.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Paused;
            }

            if (VALUE_ENTRY_Suspended.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Suspended;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled.intValue()) {
                return VALUE_ENTRY_Enabled;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled.intValue()) {
                return VALUE_ENTRY_Disabled;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutting_Down.intValue()) {
                return VALUE_ENTRY_Shutting_Down;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enabled_but_Offline.intValue()) {
                return VALUE_ENTRY_Enabled_but_Offline;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_In_Test.intValue()) {
                return VALUE_ENTRY_In_Test;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Deferred.intValue()) {
                return VALUE_ENTRY_Deferred;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce.intValue()) {
                return VALUE_ENTRY_Quiesce;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Starting.intValue()) {
                return VALUE_ENTRY_Starting;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Paused.intValue()) {
                return VALUE_ENTRY_Paused;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Suspended.intValue()) {
                return VALUE_ENTRY_Suspended;
            }

            if (iValue >= 0x8000 || iValue <= 0xFFFF) {
                return VALUE_ENTRY_Vendor_Reserved;
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
         * Value Map for the property SupportedAddStates   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutting_Down,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enabled_but_Offline,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_In_Test,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Deferred,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Starting,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Paused,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Suspended };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property SupportedAddStates   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Enabled, VALUE_ENTRY_Disabled, VALUE_ENTRY_Shutting_Down,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Enabled_but_Offline, VALUE_ENTRY_In_Test,
                VALUE_ENTRY_Deferred, VALUE_ENTRY_Quiesce, VALUE_ENTRY_Starting,
                VALUE_ENTRY_Paused, VALUE_ENTRY_Suspended, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property SupportedAddStates   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Enabled, VALUE_ENTRY_Disabled,
                VALUE_ENTRY_Shutting_Down, VALUE_ENTRY_Not_Applicable,
                VALUE_ENTRY_Enabled_but_Offline, VALUE_ENTRY_In_Test, VALUE_ENTRY_Deferred,
                VALUE_ENTRY_Quiesce, VALUE_ENTRY_Starting, VALUE_ENTRY_Paused,
                VALUE_ENTRY_Suspended };

    }

    /**
     * Constants of property SupportedRemoveStates
     * Indicates the states that the System, to which the resource is associated via SystemDevice, may be in when a the resource is removed .
     */
    public static class PROPERTY_SUPPORTEDREMOVESTATES {
        /**
         * name of the property SupportedRemoveStates
         */
        public final static String NAME = "SupportedRemoveStates";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Enabled (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Enabled = "Enabled";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Disabled (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Disabled = "Disabled";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutting_Down = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Shutting Down (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Shutting_Down = "Shutting Down";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enabled_but_Offline = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Enabled but Offline (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Enabled_but_Offline = "Enabled but Offline";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_In_Test = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry In Test (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_In_Test = "In Test";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Deferred = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Deferred (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Deferred = "Deferred";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Quiesce (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Quiesce = "Quiesce";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Starting = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Starting (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Starting = "Starting";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Paused = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Paused (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Paused = "Paused";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Suspended = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Suspended (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Suspended = "Suspended";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 0x8000..0xFFFF
         */

        /**
         * constant for value entry Vendor Reserved (corresponds to mapEntry 0x8000..0xFFFF )
         */
        public final static String VALUE_ENTRY_Vendor_Reserved = "Vendor Reserved";

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

            if (VALUE_ENTRY_Enabled.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled;
            }

            if (VALUE_ENTRY_Disabled.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled;
            }

            if (VALUE_ENTRY_Shutting_Down.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutting_Down;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable;
            }

            if (VALUE_ENTRY_Enabled_but_Offline.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enabled_but_Offline;
            }

            if (VALUE_ENTRY_In_Test.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_In_Test;
            }

            if (VALUE_ENTRY_Deferred.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Deferred;
            }

            if (VALUE_ENTRY_Quiesce.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce;
            }

            if (VALUE_ENTRY_Starting.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Starting;
            }

            if (VALUE_ENTRY_Paused.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Paused;
            }

            if (VALUE_ENTRY_Suspended.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Suspended;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled.intValue()) {
                return VALUE_ENTRY_Enabled;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled.intValue()) {
                return VALUE_ENTRY_Disabled;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutting_Down.intValue()) {
                return VALUE_ENTRY_Shutting_Down;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enabled_but_Offline.intValue()) {
                return VALUE_ENTRY_Enabled_but_Offline;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_In_Test.intValue()) {
                return VALUE_ENTRY_In_Test;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Deferred.intValue()) {
                return VALUE_ENTRY_Deferred;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce.intValue()) {
                return VALUE_ENTRY_Quiesce;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Starting.intValue()) {
                return VALUE_ENTRY_Starting;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Paused.intValue()) {
                return VALUE_ENTRY_Paused;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Suspended.intValue()) {
                return VALUE_ENTRY_Suspended;
            }

            if (iValue >= 0x8000 || iValue <= 0xFFFF) {
                return VALUE_ENTRY_Vendor_Reserved;
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
         * Value Map for the property SupportedRemoveStates   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutting_Down,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enabled_but_Offline,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_In_Test,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Deferred,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Starting,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Paused,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Suspended };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property SupportedRemoveStates   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Enabled, VALUE_ENTRY_Disabled, VALUE_ENTRY_Shutting_Down,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Enabled_but_Offline, VALUE_ENTRY_In_Test,
                VALUE_ENTRY_Deferred, VALUE_ENTRY_Quiesce, VALUE_ENTRY_Starting,
                VALUE_ENTRY_Paused, VALUE_ENTRY_Suspended, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property SupportedRemoveStates   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Enabled, VALUE_ENTRY_Disabled,
                VALUE_ENTRY_Shutting_Down, VALUE_ENTRY_Not_Applicable,
                VALUE_ENTRY_Enabled_but_Offline, VALUE_ENTRY_In_Test, VALUE_ENTRY_Deferred,
                VALUE_ENTRY_Quiesce, VALUE_ENTRY_Starting, VALUE_ENTRY_Paused,
                VALUE_ENTRY_Suspended };

    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
        String[] parentClassPackageList = CIM_Capabilities.getPackages();

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
     *   CIM_AllocationCapabilities extends the CIM_Capabilities class for thepurposes of expressing the resource allocation capabilities of the associated managed element for the allocation of a specific Resource Type. This class describes the supported types of allocations allowed, specific or general, the sharing modes supported for the device, dedicated and or shared and the system states where the addition or removal of the Resource Type is allowed.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_AllocationCapabilities(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_AllocationCapabilities extends the CIM_Capabilities class for thepurposes of expressing the resource allocation capabilities of the associated managed element for the allocation of a specific Resource Type. This class describes the supported types of allocations allowed, specific or general, the sharing modes supported for the device, dedicated and or shared and the system states where the addition or removal of the Resource Type is allowed.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_AllocationCapabilities(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_AllocationCapabilities() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("OtherResourceType", new CIMProperty("OtherResourceType",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("RequestTypesSupported", new CIMProperty("RequestTypesSupported",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ResourceSubType", new CIMProperty("ResourceSubType",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("ResourceType", new CIMProperty("ResourceType", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("SharingMode", new CIMProperty("SharingMode", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("SupportedAddStates", new CIMProperty("SupportedAddStates",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("SupportedRemoveStates", new CIMProperty("SupportedRemoveStates",
                CIMDataType.UINT16_ARRAY_T, null));

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
     * Get the property OtherResourceType
     *     * <br>
     * A string that describes the resource type when a well defined value is not available and ResourceType has the value "Other".
     *     */

    public String get_OtherResourceType() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERRESOURCETYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERRESOURCETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherResourceType
     * <br>
     * A string that describes the resource type when a well defined value is not available and ResourceType has the value "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherResourceType(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERRESOURCETYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherResourceType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERRESOURCETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherResourceType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherResourceType(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_AllocationCapabilities fco = new CIM_AllocationCapabilities(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERRESOURCETYPE.NAME);
        if (property != null) {
            property = setPropertyValue_OtherResourceType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERRESOURCETYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherResourceType
     * <br>
     * A string that describes the resource type when a well defined value is not available and ResourceType has the value "Other".
     */

    private static CIMProperty setPropertyValue_OtherResourceType(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RequestTypesSupported
     *     * <br>
     * Indicates whether requesting a specific resource is supported 
     * "Specific" -- request can include a request for specific resource 
     * "General" -- request does not include specific resource 
     * "Both" -- both specific and general requests are supported.
     *     */

    public javax.cim.UnsignedInteger16 get_RequestTypesSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUESTTYPESSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REQUESTTYPESSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property RequestTypesSupported
     * <br>
     * Indicates whether requesting a specific resource is supported 
     * "Specific" -- request can include a request for specific resource 
     * "General" -- request does not include specific resource 
     * "Both" -- both specific and general requests are supported.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RequestTypesSupported(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUESTTYPESSUPPORTED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_RequestTypesSupported(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REQUESTTYPESSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RequestTypesSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RequestTypesSupported(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_AllocationCapabilities fco = new CIM_AllocationCapabilities(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REQUESTTYPESSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_RequestTypesSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REQUESTTYPESSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RequestTypesSupported
     * <br>
     * Indicates whether requesting a specific resource is supported 
     * "Specific" -- request can include a request for specific resource 
     * "General" -- request does not include specific resource 
     * "Both" -- both specific and general requests are supported.
     */

    private static CIMProperty setPropertyValue_RequestTypesSupported(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ResourceSubType
     *     * <br>
     * A string describing an implementation specific sub-type for this resource. For example, this may be used to distinguish different models of the same resource type.
     *     */

    public String get_ResourceSubType() {
        CIMProperty currentProperty = getProperty(PROPERTY_RESOURCESUBTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RESOURCESUBTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ResourceSubType
     * <br>
     * A string describing an implementation specific sub-type for this resource. For example, this may be used to distinguish different models of the same resource type.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ResourceSubType(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RESOURCESUBTYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ResourceSubType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RESOURCESUBTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ResourceSubType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ResourceSubType(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_AllocationCapabilities fco = new CIM_AllocationCapabilities(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RESOURCESUBTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_ResourceSubType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RESOURCESUBTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ResourceSubType
     * <br>
     * A string describing an implementation specific sub-type for this resource. For example, this may be used to distinguish different models of the same resource type.
     */

    private static CIMProperty setPropertyValue_ResourceSubType(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ResourceType
     *     * <br>
     * The type of resource this allocation setting represents.
     *     */

    public javax.cim.UnsignedInteger16 get_ResourceType() {
        CIMProperty currentProperty = getProperty(PROPERTY_RESOURCETYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RESOURCETYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ResourceType
     * <br>
     * The type of resource this allocation setting represents.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ResourceType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RESOURCETYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ResourceType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RESOURCETYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ResourceType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ResourceType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_AllocationCapabilities fco = new CIM_AllocationCapabilities(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RESOURCETYPE.NAME);
        if (property != null) {
            property = setPropertyValue_ResourceType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RESOURCETYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ResourceType
     * <br>
     * The type of resource this allocation setting represents.
     */

    private static CIMProperty setPropertyValue_ResourceType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SharingMode
     *     * <br>
     * Indicates how access to underlying resource is granted: 
     * "Dedicated" -- exclusive access to underlying resource 
     * "Shared" -- shared use of underlying resource. 
     * Actual quantity is controlled by min, max size, weights, etc.
     *     */

    public javax.cim.UnsignedInteger16 get_SharingMode() {
        CIMProperty currentProperty = getProperty(PROPERTY_SHARINGMODE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SHARINGMODE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property SharingMode
     * <br>
     * Indicates how access to underlying resource is granted: 
     * "Dedicated" -- exclusive access to underlying resource 
     * "Shared" -- shared use of underlying resource. 
     * Actual quantity is controlled by min, max size, weights, etc.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SharingMode(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SHARINGMODE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SharingMode(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SHARINGMODE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SharingMode by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SharingMode(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_AllocationCapabilities fco = new CIM_AllocationCapabilities(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SHARINGMODE.NAME);
        if (property != null) {
            property = setPropertyValue_SharingMode(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SHARINGMODE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SharingMode
     * <br>
     * Indicates how access to underlying resource is granted: 
     * "Dedicated" -- exclusive access to underlying resource 
     * "Shared" -- shared use of underlying resource. 
     * Actual quantity is controlled by min, max size, weights, etc.
     */

    private static CIMProperty setPropertyValue_SharingMode(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SupportedAddStates
     *     * <br>
     * Indicates the states that the System, to which the resource will be associated via SystemDevice, may be in when a new resource is created.
     *     */

    public javax.cim.UnsignedInteger16[] get_SupportedAddStates() {
        CIMProperty currentProperty = getProperty(PROPERTY_SUPPORTEDADDSTATES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SUPPORTEDADDSTATES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property SupportedAddStates
     * <br>
     * Indicates the states that the System, to which the resource will be associated via SystemDevice, may be in when a new resource is created.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SupportedAddStates(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SUPPORTEDADDSTATES.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SupportedAddStates(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SUPPORTEDADDSTATES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SupportedAddStates by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SupportedAddStates(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_AllocationCapabilities fco = new CIM_AllocationCapabilities(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SUPPORTEDADDSTATES.NAME);
        if (property != null) {
            property = setPropertyValue_SupportedAddStates(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SUPPORTEDADDSTATES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SupportedAddStates
     * <br>
     * Indicates the states that the System, to which the resource will be associated via SystemDevice, may be in when a new resource is created.
     */

    private static CIMProperty setPropertyValue_SupportedAddStates(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SupportedRemoveStates
     *     * <br>
     * Indicates the states that the System, to which the resource is associated via SystemDevice, may be in when a the resource is removed .
     *     */

    public javax.cim.UnsignedInteger16[] get_SupportedRemoveStates() {
        CIMProperty currentProperty = getProperty(PROPERTY_SUPPORTEDREMOVESTATES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SUPPORTEDREMOVESTATES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property SupportedRemoveStates
     * <br>
     * Indicates the states that the System, to which the resource is associated via SystemDevice, may be in when a the resource is removed .
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SupportedRemoveStates(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SUPPORTEDREMOVESTATES.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SupportedRemoveStates(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SUPPORTEDREMOVESTATES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SupportedRemoveStates by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SupportedRemoveStates(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_AllocationCapabilities fco = new CIM_AllocationCapabilities(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SUPPORTEDREMOVESTATES.NAME);
        if (property != null) {
            property = setPropertyValue_SupportedRemoveStates(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SUPPORTEDREMOVESTATES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SupportedRemoveStates
     * <br>
     * Indicates the states that the System, to which the resource is associated via SystemDevice, may be in when a the resource is removed .
     */

    private static CIMProperty setPropertyValue_SupportedRemoveStates(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
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
        return CIM_AllocationCapabilities.CIM_CLASS_NAME;
    }

}