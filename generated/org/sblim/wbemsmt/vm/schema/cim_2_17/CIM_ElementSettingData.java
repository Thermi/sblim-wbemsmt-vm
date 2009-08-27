/**
 * CIM_ElementSettingData.java Â© Copyright IBM Corp. 2006,2007 THIS FILE IS PROVIDED UNDER THE TER
 * MS OF THE COMMON PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/cpl1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: ElementSettingData represents the association
 *            between ManagedElements and applicable setting data. This association also describes
 *            whether this is a default or current setting. Each non-null, non-key property of the
 *            associated SettingData instance defines a setting value for the associated
 *            ManagedElement. The properties, IsDefault, IsCurrent, IsNext, IsMinimum, IsMaximum,
 *            and IsPending further qualify those setting values. Note: the referenced SettingData
 *            instance does not reflect the current desired state of the referenced ManagedElement
 *            unless IsCurrent = "Is Current". When IsMinimum and/or IsMaximum properties have the
 *            value "Is Minimum" or "Is Maximum" respectively, the referenced SettingData instance
 *            reflects desired minimum or maximum values respectively. When IsMinimum and IsMaximum
 *            have any other value, the referenced SettingData reflects actual desired values.
 *            generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ElementSettingData extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_ElementSettingData";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property IsCurrent
     * An enumerated integer that indicates that the referenced SettingData represents the last requested values for attributes of the Managed Element or that this information is unknown. 
     * Attributes of the SettingData itself indicate whether it represents the last configuration applied to the ManagedElement or is a transient snapshot of the requested settings. Current operational characteristics of a ManagedElement should be represented with properties of the ManagedElement. element or that this information is unknown. 
     * For a given ManagedElement and all instances of a SettingData subclass, there shall be at most one instance of ElementSettingData which references the ManagedElement and an instance of the SettingData sub-class where there is a specified non-null, non-key property of the SettingData sub-class, and the IsMaximum property on the referencing ElementSettingData instance has a value of "Is Maximum" or the IsMinimum property on the referencing ElementSettingData instance has a value of "Is Minimum" and the IsCurrent property on the referencing ElementSettingData instance has a value of "Is Current". There shall be at most one instance of ElementSettingData which references a ManagedElement and an instance of a SettingData sub-class where the IsCurrent property has a value of "Is Current" and the IsMinimum property does not have a value of "Is Minimum" and the IsMaximum property does not have a value of "Is Maximum".
     */
    public static class PROPERTY_ISCURRENT {
        /**
         * name of the property IsCurrent
         */
        public final static String NAME = "IsCurrent";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Current = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Is Current (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Is_Current = "Is Current";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Not_Current = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Is Not Current (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Is_Not_Current = "Is Not Current";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Is_Current.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Current;
            }

            if (VALUE_ENTRY_Is_Not_Current.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Not_Current;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Current.intValue()) {
                return VALUE_ENTRY_Is_Current;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Not_Current.intValue()) {
                return VALUE_ENTRY_Is_Not_Current;
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
         * Value Map for the property IsCurrent   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Current,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Not_Current };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property IsCurrent   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Is_Current,
                VALUE_ENTRY_Is_Not_Current };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property IsCurrent   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Is_Current, VALUE_ENTRY_Is_Not_Current };

    }

    /**
     * Constants of property IsDefault
     * An enumerated integer that indicates that the referenced setting is a default setting for the element or that this information is unknown.
     */
    public static class PROPERTY_ISDEFAULT {
        /**
         * name of the property IsDefault
         */
        public final static String NAME = "IsDefault";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Default = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Is Default (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Is_Default = "Is Default";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Not_Default = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Is Not Default (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Is_Not_Default = "Is Not Default";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Is_Default.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Default;
            }

            if (VALUE_ENTRY_Is_Not_Default.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Not_Default;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Default.intValue()) {
                return VALUE_ENTRY_Is_Default;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Not_Default.intValue()) {
                return VALUE_ENTRY_Is_Not_Default;
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
         * Value Map for the property IsDefault   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Default,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Not_Default };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property IsDefault   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Is_Default,
                VALUE_ENTRY_Is_Not_Default };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property IsDefault   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Is_Default, VALUE_ENTRY_Is_Not_Default };

    }

    /**
     * Constants of property IsMaximum
     * This property affects the interpretation of all non-null, non-enumerated, non-binary, numeric, non-key properties of the associated SettingData instance. All other properties of the associated SettingData instance are not affected by this property. 
     * Note: It is assumed that the semantics of each property of this set are designed to be compared mathematically. 
     * When IsMaximum = "Is Maxiumum", this property indicates that the affected property values specified in the associated SettingData instance shall define desired maximum setting values. The operational maximum values should be modeled as a properties of the CIM_ManagedElement instance.
     * When IsMaximum = "Is Not Maxiumum", this property indicates that the affected property values specified in the associated SettingData instance shall not define desired maximum setting values. 
     * When IsMaximum = "Unknown", this property indicates that the affected property values specified in the associated SettingData instance may correspond to maximum desired setting values. 
     * When IsMaximum = "Not Applicable", this property indicates that the affected property values specified in the associated SettingData instance shall not be interpreted with respect to whether each defines a desired maximum.
     */
    public static class PROPERTY_ISMAXIMUM {
        /**
         * name of the property IsMaximum
         */
        public final static String NAME = "IsMaximum";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Maximum = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Is Maximum (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Is_Maximum = "Is Maximum";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Is_Not_Maximum = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Is Not Maximum (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Is_Not_Maximum = "Is Not Maximum";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Applicable;
            }

            if (VALUE_ENTRY_Is_Maximum.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Maximum;
            }

            if (VALUE_ENTRY_Is_Not_Maximum.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Is_Not_Maximum;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Maximum.intValue()) {
                return VALUE_ENTRY_Is_Maximum;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Is_Not_Maximum.intValue()) {
                return VALUE_ENTRY_Is_Not_Maximum;
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
         * Value Map for the property IsMaximum   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Applicable,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Maximum,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Is_Not_Maximum };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property IsMaximum   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Is_Maximum, VALUE_ENTRY_Is_Not_Maximum };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property IsMaximum   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Is_Maximum, VALUE_ENTRY_Is_Not_Maximum };

    }

    /**
     * Constants of property IsMinimum
     * This property affects the interpretation of all non-null, non-enumerated, non-binary, numeric, non-key properties of the associated SettingData instance. All other properties of the associated SettingData instance are not affected by this property. 
     * Note: It is assumed that the semantics of each property of this set are designed to be compared mathematically. 
     * When IsMinimum = "Is Miniumum", this property indicates that the affected property values specified in the associated SettingData instance shall define desired minimum setting values. The operational minimum values should be modeled as a properties of the CIM_ManagedElement instance.
     * When IsMinimum = "Is Not Miniumum", this property indicates that the affected property values specified in the associated SettingData instance shall not define desired minimum setting values. 
     * When IsMinimum = "Unknown", this property indicates that the affected property values specified in the associated SettingData instance may correspond to minimum desired setting values. 
     * When IsMinimum = "Not Applicable", this property indicates that the affected property values specified in the associated SettingData instance shall not be interpreted with respect to whether each defines a desired minimum.
     */
    public static class PROPERTY_ISMINIMUM {
        /**
         * name of the property IsMinimum
         */
        public final static String NAME = "IsMinimum";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Minimum = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Is Minimum (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Is_Minimum = "Is Minimum";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Is_Not_Minimum = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Is Not Minimum (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Is_Not_Minimum = "Is Not Minimum";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Applicable;
            }

            if (VALUE_ENTRY_Is_Minimum.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Minimum;
            }

            if (VALUE_ENTRY_Is_Not_Minimum.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Is_Not_Minimum;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Minimum.intValue()) {
                return VALUE_ENTRY_Is_Minimum;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Is_Not_Minimum.intValue()) {
                return VALUE_ENTRY_Is_Not_Minimum;
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
         * Value Map for the property IsMinimum   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Applicable,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Minimum,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Is_Not_Minimum };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property IsMinimum   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Is_Minimum, VALUE_ENTRY_Is_Not_Minimum };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property IsMinimum   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Is_Minimum, VALUE_ENTRY_Is_Not_Minimum };

    }

    /**
     * Constants of property IsNext
     * An enumerated integer indicating whether or not the referenced setting is the next setting to be applied. For example, the application could take place on a re-initialization, reset, reconfiguration request. This could be a permanent setting, or a setting used only one time, as indicated by the flag. If it is a permanent setting then the setting is applied every time the managed element reinitializes, until this flag is manually reset. However, if it is single use, then the flag is automatically cleared after the settings are applied. Also note that if this flag is specified (i.e. set to value other than "Unknown"), then this takes precedence over any SettingData that may have been specified as Default. For example: If the managed element is a computer system, and the value of this flag is "Is Next", then the setting will be effective next time the system resets. And, unless this flag is changed, it will persist for subsequent system resets. However, if this flag is set to "Is Next For Single Use", then this setting will only be used once and the flag would be reset after that to "Is Not Next". So, in the above example, if the system reboots in a quick succession, the setting will not be used at the second reboot.
     */
    public static class PROPERTY_ISNEXT {
        /**
         * name of the property IsNext
         */
        public final static String NAME = "IsNext";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Next = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Is Next (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Is_Next = "Is Next";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Not_Next = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Is Not Next (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Is_Not_Next = "Is Not Next";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Is_Next_For_Single_Use = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Is Next For Single Use (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Is_Next_For_Single_Use = "Is Next For Single Use";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Is_Next.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Next;
            }

            if (VALUE_ENTRY_Is_Not_Next.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Not_Next;
            }

            if (VALUE_ENTRY_Is_Next_For_Single_Use.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Is_Next_For_Single_Use;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Next.intValue()) {
                return VALUE_ENTRY_Is_Next;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Not_Next.intValue()) {
                return VALUE_ENTRY_Is_Not_Next;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Is_Next_For_Single_Use.intValue()) {
                return VALUE_ENTRY_Is_Next_For_Single_Use;
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
         * Value Map for the property IsNext   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Is_Next,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Not_Next,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Is_Next_For_Single_Use };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property IsNext   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Is_Next,
                VALUE_ENTRY_Is_Not_Next, VALUE_ENTRY_Is_Next_For_Single_Use };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property IsNext   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Is_Next, VALUE_ENTRY_Is_Not_Next, VALUE_ENTRY_Is_Next_For_Single_Use };

    }

    /**
     * Constants of property IsPending
     * An enumerated integer that indicates whether or not the referenced CIM_SettingData instance represents outstanding changes to the configuration of the referenced CIM_ManagedElement that are known to be pending and are in the process of being applied. A value of 0 "Unknown" indicates that the referenced instance of CIM_SettingData may represent the last configuration applied to the referenced CIM_ManagedElement. A value of 2 "Is Pending" shall indicate that the referenced instance of CIM_SettingData represents outstanding changes to the configuration of the referenced CIM_ManagedElement that are known to be pending. A value of 3 "Is Not Pending" shall indicate that the referenced instance of CIM_SettingData does not represent outstanding changes to the configuration of the referenced CIM_ManagedElement.
     */
    public static class PROPERTY_ISPENDING {
        /**
         * name of the property IsPending
         */
        public final static String NAME = "IsPending";

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
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Pending = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Is Pending (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Is_Pending = "Is Pending";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Is_Not_Pending = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Is Not Pending (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Is_Not_Pending = "Is Not Pending";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 32768..
         */

        /**
         * constant for value entry Vendor Reserved (corresponds to mapEntry 32768.. )
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

            if (VALUE_ENTRY_Is_Pending.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Pending;
            }

            if (VALUE_ENTRY_Is_Not_Pending.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Is_Not_Pending;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Pending.intValue()) {
                return VALUE_ENTRY_Is_Pending;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Is_Not_Pending.intValue()) {
                return VALUE_ENTRY_Is_Not_Pending;
            }

            if (iValue >= 32768) {
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
         * Value Map for the property IsPending   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Is_Pending,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Is_Not_Pending };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property IsPending   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Is_Pending,
                VALUE_ENTRY_Is_Not_Pending, VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property IsPending   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Is_Pending, VALUE_ENTRY_Is_Not_Pending };

    }

    /**
     * Constants of property ManagedElement
     * 
     */
    public static class PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT {
        /**
         * name of the property ManagedElement
         */
        public final static String NAME = "ManagedElement";

    }

    /**
     * Constants of property SettingData
     * 
     */
    public static class PROPERTY_SETTINGDATA_CIM_SETTINGDATA {
        /**
         * name of the property SettingData
         */
        public final static String NAME = "SettingData";

    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");

    };

    //**********************************************************************
    // Constructors     
    //**********************************************************************

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   ElementSettingData represents the association between ManagedElements and applicable setting data. This association also describes whether this is a default or current setting. Each non-null, non-key property of the associated SettingData instance defines a setting value for the associated ManagedElement. The properties, IsDefault, IsCurrent, IsNext, IsMinimum, IsMaximum, and IsPending further qualify those setting values. 
     * Note: the referenced SettingData instance does not reflect the current desired state of the referenced ManagedElement unless IsCurrent = "Is Current". 
     * When IsMinimum and/or IsMaximum properties have the value "Is Minimum" or "Is Maximum" respectively, the referenced SettingData instance reflects desired minimum or maximum values respectively. When IsMinimum and IsMaximum have any other value, the referenced SettingData reflects actual desired values.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ElementSettingData(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   ElementSettingData represents the association between ManagedElements and applicable setting data. This association also describes whether this is a default or current setting. Each non-null, non-key property of the associated SettingData instance defines a setting value for the associated ManagedElement. The properties, IsDefault, IsCurrent, IsNext, IsMinimum, IsMaximum, and IsPending further qualify those setting values. 
     * Note: the referenced SettingData instance does not reflect the current desired state of the referenced ManagedElement unless IsCurrent = "Is Current". 
     * When IsMinimum and/or IsMaximum properties have the value "Is Minimum" or "Is Maximum" respectively, the referenced SettingData instance reflects desired minimum or maximum values respectively. When IsMinimum and IsMaximum have any other value, the referenced SettingData reflects actual desired values.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ElementSettingData(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ElementSettingData() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck
                .put("IsCurrent", new CIMProperty("IsCurrent", CIMDataType.UINT16_T, null));
        propertiesToCheck
                .put("IsDefault", new CIMProperty("IsDefault", CIMDataType.UINT16_T, null));
        propertiesToCheck
                .put("IsMaximum", new CIMProperty("IsMaximum", CIMDataType.UINT16_T, null));
        propertiesToCheck
                .put("IsMinimum", new CIMProperty("IsMinimum", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("IsNext", new CIMProperty("IsNext", CIMDataType.UINT16_T, null));
        propertiesToCheck
                .put("IsPending", new CIMProperty("IsPending", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ManagedElement", new CIMProperty("ManagedElement", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), null));
        propertiesToCheck.put("SettingData", new CIMProperty("SettingData", new CIMDataType(
                CIM_SettingData.CIM_CLASS_NAME), null));

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
     * Get the property IsCurrent
     *     * <br>
     * An enumerated integer that indicates that the referenced SettingData represents the last requested values for attributes of the Managed Element or that this information is unknown. 
     * Attributes of the SettingData itself indicate whether it represents the last configuration applied to the ManagedElement or is a transient snapshot of the requested settings. Current operational characteristics of a ManagedElement should be represented with properties of the ManagedElement. element or that this information is unknown. 
     * For a given ManagedElement and all instances of a SettingData subclass, there shall be at most one instance of ElementSettingData which references the ManagedElement and an instance of the SettingData sub-class where there is a specified non-null, non-key property of the SettingData sub-class, and the IsMaximum property on the referencing ElementSettingData instance has a value of "Is Maximum" or the IsMinimum property on the referencing ElementSettingData instance has a value of "Is Minimum" and the IsCurrent property on the referencing ElementSettingData instance has a value of "Is Current". There shall be at most one instance of ElementSettingData which references a ManagedElement and an instance of a SettingData sub-class where the IsCurrent property has a value of "Is Current" and the IsMinimum property does not have a value of "Is Minimum" and the IsMaximum property does not have a value of "Is Maximum".
     *     */

    public javax.cim.UnsignedInteger16 get_IsCurrent() {
        CIMProperty currentProperty = getProperty(PROPERTY_ISCURRENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ISCURRENT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property IsCurrent
     * <br>
     * An enumerated integer that indicates that the referenced SettingData represents the last requested values for attributes of the Managed Element or that this information is unknown. 
     * Attributes of the SettingData itself indicate whether it represents the last configuration applied to the ManagedElement or is a transient snapshot of the requested settings. Current operational characteristics of a ManagedElement should be represented with properties of the ManagedElement. element or that this information is unknown. 
     * For a given ManagedElement and all instances of a SettingData subclass, there shall be at most one instance of ElementSettingData which references the ManagedElement and an instance of the SettingData sub-class where there is a specified non-null, non-key property of the SettingData sub-class, and the IsMaximum property on the referencing ElementSettingData instance has a value of "Is Maximum" or the IsMinimum property on the referencing ElementSettingData instance has a value of "Is Minimum" and the IsCurrent property on the referencing ElementSettingData instance has a value of "Is Current". There shall be at most one instance of ElementSettingData which references a ManagedElement and an instance of a SettingData sub-class where the IsCurrent property has a value of "Is Current" and the IsMinimum property does not have a value of "Is Minimum" and the IsMaximum property does not have a value of "Is Maximum".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IsCurrent(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ISCURRENT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IsCurrent(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ISCURRENT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IsCurrent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IsCurrent(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ElementSettingData fco = new CIM_ElementSettingData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ISCURRENT.NAME);
        if (property != null) {
            property = setPropertyValue_IsCurrent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ISCURRENT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IsCurrent
     * <br>
     * An enumerated integer that indicates that the referenced SettingData represents the last requested values for attributes of the Managed Element or that this information is unknown. 
     * Attributes of the SettingData itself indicate whether it represents the last configuration applied to the ManagedElement or is a transient snapshot of the requested settings. Current operational characteristics of a ManagedElement should be represented with properties of the ManagedElement. element or that this information is unknown. 
     * For a given ManagedElement and all instances of a SettingData subclass, there shall be at most one instance of ElementSettingData which references the ManagedElement and an instance of the SettingData sub-class where there is a specified non-null, non-key property of the SettingData sub-class, and the IsMaximum property on the referencing ElementSettingData instance has a value of "Is Maximum" or the IsMinimum property on the referencing ElementSettingData instance has a value of "Is Minimum" and the IsCurrent property on the referencing ElementSettingData instance has a value of "Is Current". There shall be at most one instance of ElementSettingData which references a ManagedElement and an instance of a SettingData sub-class where the IsCurrent property has a value of "Is Current" and the IsMinimum property does not have a value of "Is Minimum" and the IsMaximum property does not have a value of "Is Maximum".
     */

    private static CIMProperty setPropertyValue_IsCurrent(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IsDefault
     *     * <br>
     * An enumerated integer that indicates that the referenced setting is a default setting for the element or that this information is unknown.
     *     */

    public javax.cim.UnsignedInteger16 get_IsDefault() {
        CIMProperty currentProperty = getProperty(PROPERTY_ISDEFAULT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ISDEFAULT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property IsDefault
     * <br>
     * An enumerated integer that indicates that the referenced setting is a default setting for the element or that this information is unknown.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IsDefault(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ISDEFAULT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IsDefault(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ISDEFAULT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IsDefault by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IsDefault(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ElementSettingData fco = new CIM_ElementSettingData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ISDEFAULT.NAME);
        if (property != null) {
            property = setPropertyValue_IsDefault(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ISDEFAULT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IsDefault
     * <br>
     * An enumerated integer that indicates that the referenced setting is a default setting for the element or that this information is unknown.
     */

    private static CIMProperty setPropertyValue_IsDefault(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IsMaximum
     *     * <br>
     * This property affects the interpretation of all non-null, non-enumerated, non-binary, numeric, non-key properties of the associated SettingData instance. All other properties of the associated SettingData instance are not affected by this property. 
     * Note: It is assumed that the semantics of each property of this set are designed to be compared mathematically. 
     * When IsMaximum = "Is Maxiumum", this property indicates that the affected property values specified in the associated SettingData instance shall define desired maximum setting values. The operational maximum values should be modeled as a properties of the CIM_ManagedElement instance.
     * When IsMaximum = "Is Not Maxiumum", this property indicates that the affected property values specified in the associated SettingData instance shall not define desired maximum setting values. 
     * When IsMaximum = "Unknown", this property indicates that the affected property values specified in the associated SettingData instance may correspond to maximum desired setting values. 
     * When IsMaximum = "Not Applicable", this property indicates that the affected property values specified in the associated SettingData instance shall not be interpreted with respect to whether each defines a desired maximum.
     *     */

    public javax.cim.UnsignedInteger16 get_IsMaximum() {
        CIMProperty currentProperty = getProperty(PROPERTY_ISMAXIMUM.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ISMAXIMUM.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property IsMaximum
     * <br>
     * This property affects the interpretation of all non-null, non-enumerated, non-binary, numeric, non-key properties of the associated SettingData instance. All other properties of the associated SettingData instance are not affected by this property. 
     * Note: It is assumed that the semantics of each property of this set are designed to be compared mathematically. 
     * When IsMaximum = "Is Maxiumum", this property indicates that the affected property values specified in the associated SettingData instance shall define desired maximum setting values. The operational maximum values should be modeled as a properties of the CIM_ManagedElement instance.
     * When IsMaximum = "Is Not Maxiumum", this property indicates that the affected property values specified in the associated SettingData instance shall not define desired maximum setting values. 
     * When IsMaximum = "Unknown", this property indicates that the affected property values specified in the associated SettingData instance may correspond to maximum desired setting values. 
     * When IsMaximum = "Not Applicable", this property indicates that the affected property values specified in the associated SettingData instance shall not be interpreted with respect to whether each defines a desired maximum.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IsMaximum(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ISMAXIMUM.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IsMaximum(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ISMAXIMUM.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IsMaximum by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IsMaximum(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ElementSettingData fco = new CIM_ElementSettingData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ISMAXIMUM.NAME);
        if (property != null) {
            property = setPropertyValue_IsMaximum(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ISMAXIMUM.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IsMaximum
     * <br>
     * This property affects the interpretation of all non-null, non-enumerated, non-binary, numeric, non-key properties of the associated SettingData instance. All other properties of the associated SettingData instance are not affected by this property. 
     * Note: It is assumed that the semantics of each property of this set are designed to be compared mathematically. 
     * When IsMaximum = "Is Maxiumum", this property indicates that the affected property values specified in the associated SettingData instance shall define desired maximum setting values. The operational maximum values should be modeled as a properties of the CIM_ManagedElement instance.
     * When IsMaximum = "Is Not Maxiumum", this property indicates that the affected property values specified in the associated SettingData instance shall not define desired maximum setting values. 
     * When IsMaximum = "Unknown", this property indicates that the affected property values specified in the associated SettingData instance may correspond to maximum desired setting values. 
     * When IsMaximum = "Not Applicable", this property indicates that the affected property values specified in the associated SettingData instance shall not be interpreted with respect to whether each defines a desired maximum.
     */

    private static CIMProperty setPropertyValue_IsMaximum(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IsMinimum
     *     * <br>
     * This property affects the interpretation of all non-null, non-enumerated, non-binary, numeric, non-key properties of the associated SettingData instance. All other properties of the associated SettingData instance are not affected by this property. 
     * Note: It is assumed that the semantics of each property of this set are designed to be compared mathematically. 
     * When IsMinimum = "Is Miniumum", this property indicates that the affected property values specified in the associated SettingData instance shall define desired minimum setting values. The operational minimum values should be modeled as a properties of the CIM_ManagedElement instance.
     * When IsMinimum = "Is Not Miniumum", this property indicates that the affected property values specified in the associated SettingData instance shall not define desired minimum setting values. 
     * When IsMinimum = "Unknown", this property indicates that the affected property values specified in the associated SettingData instance may correspond to minimum desired setting values. 
     * When IsMinimum = "Not Applicable", this property indicates that the affected property values specified in the associated SettingData instance shall not be interpreted with respect to whether each defines a desired minimum.
     *     */

    public javax.cim.UnsignedInteger16 get_IsMinimum() {
        CIMProperty currentProperty = getProperty(PROPERTY_ISMINIMUM.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ISMINIMUM.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property IsMinimum
     * <br>
     * This property affects the interpretation of all non-null, non-enumerated, non-binary, numeric, non-key properties of the associated SettingData instance. All other properties of the associated SettingData instance are not affected by this property. 
     * Note: It is assumed that the semantics of each property of this set are designed to be compared mathematically. 
     * When IsMinimum = "Is Miniumum", this property indicates that the affected property values specified in the associated SettingData instance shall define desired minimum setting values. The operational minimum values should be modeled as a properties of the CIM_ManagedElement instance.
     * When IsMinimum = "Is Not Miniumum", this property indicates that the affected property values specified in the associated SettingData instance shall not define desired minimum setting values. 
     * When IsMinimum = "Unknown", this property indicates that the affected property values specified in the associated SettingData instance may correspond to minimum desired setting values. 
     * When IsMinimum = "Not Applicable", this property indicates that the affected property values specified in the associated SettingData instance shall not be interpreted with respect to whether each defines a desired minimum.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IsMinimum(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ISMINIMUM.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IsMinimum(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ISMINIMUM.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IsMinimum by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IsMinimum(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ElementSettingData fco = new CIM_ElementSettingData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ISMINIMUM.NAME);
        if (property != null) {
            property = setPropertyValue_IsMinimum(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ISMINIMUM.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IsMinimum
     * <br>
     * This property affects the interpretation of all non-null, non-enumerated, non-binary, numeric, non-key properties of the associated SettingData instance. All other properties of the associated SettingData instance are not affected by this property. 
     * Note: It is assumed that the semantics of each property of this set are designed to be compared mathematically. 
     * When IsMinimum = "Is Miniumum", this property indicates that the affected property values specified in the associated SettingData instance shall define desired minimum setting values. The operational minimum values should be modeled as a properties of the CIM_ManagedElement instance.
     * When IsMinimum = "Is Not Miniumum", this property indicates that the affected property values specified in the associated SettingData instance shall not define desired minimum setting values. 
     * When IsMinimum = "Unknown", this property indicates that the affected property values specified in the associated SettingData instance may correspond to minimum desired setting values. 
     * When IsMinimum = "Not Applicable", this property indicates that the affected property values specified in the associated SettingData instance shall not be interpreted with respect to whether each defines a desired minimum.
     */

    private static CIMProperty setPropertyValue_IsMinimum(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IsNext
     *     * <br>
     * An enumerated integer indicating whether or not the referenced setting is the next setting to be applied. For example, the application could take place on a re-initialization, reset, reconfiguration request. This could be a permanent setting, or a setting used only one time, as indicated by the flag. If it is a permanent setting then the setting is applied every time the managed element reinitializes, until this flag is manually reset. However, if it is single use, then the flag is automatically cleared after the settings are applied. Also note that if this flag is specified (i.e. set to value other than "Unknown"), then this takes precedence over any SettingData that may have been specified as Default. For example: If the managed element is a computer system, and the value of this flag is "Is Next", then the setting will be effective next time the system resets. And, unless this flag is changed, it will persist for subsequent system resets. However, if this flag is set to "Is Next For Single Use", then this setting will only be used once and the flag would be reset after that to "Is Not Next". So, in the above example, if the system reboots in a quick succession, the setting will not be used at the second reboot.
     *     */

    public javax.cim.UnsignedInteger16 get_IsNext() {
        CIMProperty currentProperty = getProperty(PROPERTY_ISNEXT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ISNEXT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property IsNext
     * <br>
     * An enumerated integer indicating whether or not the referenced setting is the next setting to be applied. For example, the application could take place on a re-initialization, reset, reconfiguration request. This could be a permanent setting, or a setting used only one time, as indicated by the flag. If it is a permanent setting then the setting is applied every time the managed element reinitializes, until this flag is manually reset. However, if it is single use, then the flag is automatically cleared after the settings are applied. Also note that if this flag is specified (i.e. set to value other than "Unknown"), then this takes precedence over any SettingData that may have been specified as Default. For example: If the managed element is a computer system, and the value of this flag is "Is Next", then the setting will be effective next time the system resets. And, unless this flag is changed, it will persist for subsequent system resets. However, if this flag is set to "Is Next For Single Use", then this setting will only be used once and the flag would be reset after that to "Is Not Next". So, in the above example, if the system reboots in a quick succession, the setting will not be used at the second reboot.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IsNext(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ISNEXT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IsNext(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ISNEXT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IsNext by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IsNext(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ElementSettingData fco = new CIM_ElementSettingData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ISNEXT.NAME);
        if (property != null) {
            property = setPropertyValue_IsNext(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ISNEXT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IsNext
     * <br>
     * An enumerated integer indicating whether or not the referenced setting is the next setting to be applied. For example, the application could take place on a re-initialization, reset, reconfiguration request. This could be a permanent setting, or a setting used only one time, as indicated by the flag. If it is a permanent setting then the setting is applied every time the managed element reinitializes, until this flag is manually reset. However, if it is single use, then the flag is automatically cleared after the settings are applied. Also note that if this flag is specified (i.e. set to value other than "Unknown"), then this takes precedence over any SettingData that may have been specified as Default. For example: If the managed element is a computer system, and the value of this flag is "Is Next", then the setting will be effective next time the system resets. And, unless this flag is changed, it will persist for subsequent system resets. However, if this flag is set to "Is Next For Single Use", then this setting will only be used once and the flag would be reset after that to "Is Not Next". So, in the above example, if the system reboots in a quick succession, the setting will not be used at the second reboot.
     */

    private static CIMProperty setPropertyValue_IsNext(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IsPending
     *     * <br>
     * An enumerated integer that indicates whether or not the referenced CIM_SettingData instance represents outstanding changes to the configuration of the referenced CIM_ManagedElement that are known to be pending and are in the process of being applied. A value of 0 "Unknown" indicates that the referenced instance of CIM_SettingData may represent the last configuration applied to the referenced CIM_ManagedElement. A value of 2 "Is Pending" shall indicate that the referenced instance of CIM_SettingData represents outstanding changes to the configuration of the referenced CIM_ManagedElement that are known to be pending. A value of 3 "Is Not Pending" shall indicate that the referenced instance of CIM_SettingData does not represent outstanding changes to the configuration of the referenced CIM_ManagedElement.
     *     */

    public javax.cim.UnsignedInteger16 get_IsPending() {
        CIMProperty currentProperty = getProperty(PROPERTY_ISPENDING.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ISPENDING.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property IsPending
     * <br>
     * An enumerated integer that indicates whether or not the referenced CIM_SettingData instance represents outstanding changes to the configuration of the referenced CIM_ManagedElement that are known to be pending and are in the process of being applied. A value of 0 "Unknown" indicates that the referenced instance of CIM_SettingData may represent the last configuration applied to the referenced CIM_ManagedElement. A value of 2 "Is Pending" shall indicate that the referenced instance of CIM_SettingData represents outstanding changes to the configuration of the referenced CIM_ManagedElement that are known to be pending. A value of 3 "Is Not Pending" shall indicate that the referenced instance of CIM_SettingData does not represent outstanding changes to the configuration of the referenced CIM_ManagedElement.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IsPending(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ISPENDING.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IsPending(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ISPENDING.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IsPending by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IsPending(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ElementSettingData fco = new CIM_ElementSettingData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ISPENDING.NAME);
        if (property != null) {
            property = setPropertyValue_IsPending(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ISPENDING.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IsPending
     * <br>
     * An enumerated integer that indicates whether or not the referenced CIM_SettingData instance represents outstanding changes to the configuration of the referenced CIM_ManagedElement that are known to be pending and are in the process of being applied. A value of 0 "Unknown" indicates that the referenced instance of CIM_SettingData may represent the last configuration applied to the referenced CIM_ManagedElement. A value of 2 "Is Pending" shall indicate that the referenced instance of CIM_SettingData represents outstanding changes to the configuration of the referenced CIM_ManagedElement that are known to be pending. A value of 3 "Is Not Pending" shall indicate that the referenced instance of CIM_SettingData does not represent outstanding changes to the configuration of the referenced CIM_ManagedElement.
     */

    private static CIMProperty setPropertyValue_IsPending(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ManagedElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedElement get_ManagedElement_CIM_ManagedElement(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property ManagedElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ManagedElement_CIM_ManagedElement(CIM_ManagedElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ManagedElement_CIM_ManagedElement(currentProperty,
                    newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ManagedElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ManagedElement_CIM_ManagedElement(WBEMClient client,
            String namespace, CIM_ManagedElement newValue) throws WbemsmtException {
        CIM_ElementSettingData fco = new CIM_ElementSettingData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_ManagedElement_CIM_ManagedElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ManagedElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_ManagedElement_CIM_ManagedElement(
            CIMProperty currentProperty, CIM_ManagedElement newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SettingData
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_SettingData get_SettingData_CIM_SettingData(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SETTINGDATA_CIM_SETTINGDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SETTINGDATA_CIM_SETTINGDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_SettingDataHelper
                .getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property SettingData
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SettingData_CIM_SettingData(CIM_SettingData newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SETTINGDATA_CIM_SETTINGDATA.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SettingData_CIM_SettingData(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SETTINGDATA_CIM_SETTINGDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SettingData by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SettingData_CIM_SettingData(WBEMClient client,
            String namespace, CIM_SettingData newValue) throws WbemsmtException {
        CIM_ElementSettingData fco = new CIM_ElementSettingData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SETTINGDATA_CIM_SETTINGDATA.NAME);
        if (property != null) {
            property = setPropertyValue_SettingData_CIM_SettingData(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SETTINGDATA_CIM_SETTINGDATA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SettingData
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_SettingData_CIM_SettingData(
            CIMProperty currentProperty, CIM_SettingData newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

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
     * returns true if the objects are the same
     * 
     * @return
     * @see org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco\#equals(Object)
     */
    public boolean equals(Object object) {
        if (!(object instanceof CIM_ElementSettingData)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_ElementSettingData.CIM_CLASS_NAME;
    }

}