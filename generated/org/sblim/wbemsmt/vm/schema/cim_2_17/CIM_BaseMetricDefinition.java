/**
 * CIM_BaseMetricDefinition.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS PROVIDED UNDER THE
 * TERMS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS
 * FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the
 * Common Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: CIM_BaseMetricDefinition represents the
 *            definitional aspects of a metric, i.e., a definition template containing meta data
 *            about a new metric. Since CIM_BaseMetricDefinition does not capture metric instance
 *            information, it does not contain the value of the metric. The associated class
 *            CIM_BaseMetricValue holds the metric value and encapsulates its runtime behavior. The
 *            purpose of CIM_BaseMetricDefinition is to provide a convenient mechanism for
 *            introducing a new metric definition at runtime and capturing its instance values in a
 *            separate class. This mechanism is targeted specifically at CIM users who would like to
 *            enhance existing CIM schemas by introducing domain-specific metrics that are not
 *            captured in the existing CIM schemas. In addition, vendors of managed resources may
 *            make use of this mechanism if a small subset of a potentially large and heterogeneous
 *            amount of performance-related data needs to be exposed, based on the context in which
 *            the data is captured. Additional meta data for a metric can be provided by subclassing
 *            from CIM_BaseMetricDefinition. The CIM_BaseMetricDefinition should be associated with
 *            the CIM_ManagedElement(s) to which it applies. generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_BaseMetricDefinition extends CIM_ManagedElement {

    public final static String CIM_CLASS_NAME = "CIM_BaseMetricDefinition";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Accuracy
     * Indicates the accuracy of the values reported for this metric. The accuracy is expressed as the value of theAccuracy property in the units specified by the AccuracyUnits property.
     */
    public static class PROPERTY_ACCURACY {
        /**
         * name of the property Accuracy
         */
        public final static String NAME = "Accuracy";

    }

    /**
     * Constants of property AccuracyUnits
     * Identifies the specific units in which the accuracy is expressed. The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Appendix C.1 of DSP0004 V2.4.
     */
    public static class PROPERTY_ACCURACYUNITS {
        /**
         * name of the property AccuracyUnits
         */
        public final static String NAME = "AccuracyUnits";

    }

    /**
     * Constants of property BreakdownDimensions
     * Defines one or more strings that can be used to refine (break down) queries against the BaseMetricValues along a certain dimension. An example is a transaction name, allowing the break down of the total value for all transactions into a set of values, one for each transaction name. Other examples might be application system or user group name. The strings are free format and should be meaningful to the end users of the metric data. The strings indicate which break down dimensions are supported for this metric definition, by the underlying instrumentation.
     */
    public static class PROPERTY_BREAKDOWNDIMENSIONS {
        /**
         * name of the property BreakdownDimensions
         */
        public final static String NAME = "BreakdownDimensions";

    }

    /**
     * Constants of property Calculable
     * An enumerated value that describes the characteristics of the metric, for purposes of performing calculations. The property can take one of the following values: 
     * 1="Non-calculable" -> a string. Arithmetic makes no sense. 
     * 2="Summable" -> It is reasonable to sum this value over many instances of e.g., UnitOfWork, such as the number of files processed in a backup job. For example, if each backup job is a UnitOfWork, and each job backs up 27,000 files on average, then it makes sense to say that 100 backup jobs processed 2,700,000 files. 
     * 3="Non-summable" -> It does not make sense to sum this value over many instances of UnitOfWork. An example would be a metric that measures the queue length when a job arrives at a server. If each job is a UnitOfWork, and the average queue length when each job arrives is 33, it does not make sense to say that the queue length for 100 jobs is 3300. It does make sense to say that the mean is 33.
     */
    public static class PROPERTY_CALCULABLE {
        /**
         * name of the property Calculable
         */
        public final static String NAME = "Calculable";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Non_calculable = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Non-calculable (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Non_calculable = "Non-calculable";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Summable = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Summable (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Summable = "Summable";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Non_summable = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Non-summable (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Non_summable = "Non-summable";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Non_calculable.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Non_calculable;
            }

            if (VALUE_ENTRY_Summable.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Summable;
            }

            if (VALUE_ENTRY_Non_summable.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Non_summable;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Non_calculable.intValue()) {
                return VALUE_ENTRY_Non_calculable;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Summable.intValue()) {
                return VALUE_ENTRY_Summable;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Non_summable.intValue()) {
                return VALUE_ENTRY_Non_summable;
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
         * Value Map for the property Calculable   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Non_calculable,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Summable,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Non_summable };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Calculable   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Non_calculable,
                VALUE_ENTRY_Summable, VALUE_ENTRY_Non_summable };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Calculable   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Non_calculable,
                VALUE_ENTRY_Summable, VALUE_ENTRY_Non_summable };

    }

    /**
     * Constants of property ChangeType
     * ChangeType indicates how the metric value changes, in the form of typical combinations of finer grain attributes such as direction change, minimum and maximum values, and wrapping semantics. 
     * 0="Unknown": The metric designer did not qualify the ChangeType. 
     * 2="N/A": If the "IsContinuous" property is "false", ChangeType does not make sense and MUST be is set to "N/A". 
     * 3="Counter": The metric is a counter metric. These have non-negative integer values which increase monotonically until reaching the maximum representable number and then wrap around and start increasing from 0. Such counters, also known as rollover counters, can be used for instance to count the number of network errors or the number of transactions processed. The only way for a client application to keep track of wrap arounds is to retrieve the value of the counter in appropriately short intervals. 
     * 4="Gauge": The metric is a gauge metric. These have integer or float values that can increase and decrease arbitrarily. A gauge MUST NOT wrap when reaching the minimum or maximum representable number, instead, the value "sticks" at that number. Minimum or maximum values inside of the representable value range at which the metric value "sticks", may or may not be defined. 
     * Vendors may extend this property in the vendor reserved range.
     */
    public static class PROPERTY_CHANGETYPE {
        /**
         * name of the property ChangeType
         */
        public final static String NAME = "ChangeType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_N_A = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry N/A (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_N_A = "N/A";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Counter = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Counter (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Counter = "Counter";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Gauge = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Gauge (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Gauge = "Gauge";

        /**
         * constant for value map entry 5..32767
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 5..32767 )
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

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_N_A.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_N_A;
            }

            if (VALUE_ENTRY_Counter.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Counter;
            }

            if (VALUE_ENTRY_Gauge.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Gauge;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_N_A.intValue()) {
                return VALUE_ENTRY_N_A;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Counter.intValue()) {
                return VALUE_ENTRY_Counter;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Gauge.intValue()) {
                return VALUE_ENTRY_Gauge;
            }

            if (iValue >= 5 || iValue <= 32767) {
                return VALUE_ENTRY_DMTF_Reserved;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Reserved;
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
         * Value Map for the property ChangeType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_N_A,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Counter, VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Gauge };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ChangeType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_N_A,
                VALUE_ENTRY_Counter, VALUE_ENTRY_Gauge, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ChangeType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_N_A, VALUE_ENTRY_Counter, VALUE_ENTRY_Gauge };

    }

    /**
     * Constants of property DataType
     * The data type of the metric. For example, "boolean" (value=1) or "datetime" (=3) may be specified. These types represent the datatypes defined for CIM.
     */
    public static class PROPERTY_DATATYPE {
        /**
         * name of the property DataType
         */
        public final static String NAME = "DataType";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_boolean = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry boolean (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_boolean = "boolean";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_char16 = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry char16 (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_char16 = "char16";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_datetime = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry datetime (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_datetime = "datetime";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_real32 = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry real32 (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_real32 = "real32";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_real64 = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry real64 (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_real64 = "real64";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_sint16 = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry sint16 (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_sint16 = "sint16";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_sint32 = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry sint32 (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_sint32 = "sint32";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_sint64 = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry sint64 (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_sint64 = "sint64";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_sint8 = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry sint8 (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_sint8 = "sint8";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_string = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry string (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_string = "string";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_uint16 = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry uint16 (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_uint16 = "uint16";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_uint32 = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry uint32 (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_uint32 = "uint32";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_uint64 = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry uint64 (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_uint64 = "uint64";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_uint8 = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry uint8 (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_uint8 = "uint8";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_boolean.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_boolean;
            }

            if (VALUE_ENTRY_char16.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_char16;
            }

            if (VALUE_ENTRY_datetime.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_datetime;
            }

            if (VALUE_ENTRY_real32.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_real32;
            }

            if (VALUE_ENTRY_real64.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_real64;
            }

            if (VALUE_ENTRY_sint16.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_sint16;
            }

            if (VALUE_ENTRY_sint32.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_sint32;
            }

            if (VALUE_ENTRY_sint64.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_sint64;
            }

            if (VALUE_ENTRY_sint8.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_sint8;
            }

            if (VALUE_ENTRY_string.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_string;
            }

            if (VALUE_ENTRY_uint16.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_uint16;
            }

            if (VALUE_ENTRY_uint32.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_uint32;
            }

            if (VALUE_ENTRY_uint64.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_uint64;
            }

            if (VALUE_ENTRY_uint8.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_uint8;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_boolean.intValue()) {
                return VALUE_ENTRY_boolean;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_char16.intValue()) {
                return VALUE_ENTRY_char16;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_datetime.intValue()) {
                return VALUE_ENTRY_datetime;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_real32.intValue()) {
                return VALUE_ENTRY_real32;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_real64.intValue()) {
                return VALUE_ENTRY_real64;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_sint16.intValue()) {
                return VALUE_ENTRY_sint16;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_sint32.intValue()) {
                return VALUE_ENTRY_sint32;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_sint64.intValue()) {
                return VALUE_ENTRY_sint64;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_sint8.intValue()) {
                return VALUE_ENTRY_sint8;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_string.intValue()) {
                return VALUE_ENTRY_string;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_uint16.intValue()) {
                return VALUE_ENTRY_uint16;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_uint32.intValue()) {
                return VALUE_ENTRY_uint32;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_uint64.intValue()) {
                return VALUE_ENTRY_uint64;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_uint8.intValue()) {
                return VALUE_ENTRY_uint8;
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
         * Value Map for the property DataType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_boolean,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_char16,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_datetime,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_real32, VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_real64,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_sint16, VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_sint32,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_sint64, VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_sint8,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_string,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_uint16,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_uint32,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_uint64, VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_uint8 };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property DataType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_boolean, VALUE_ENTRY_char16,
                VALUE_ENTRY_datetime, VALUE_ENTRY_real32, VALUE_ENTRY_real64, VALUE_ENTRY_sint16,
                VALUE_ENTRY_sint32, VALUE_ENTRY_sint64, VALUE_ENTRY_sint8, VALUE_ENTRY_string,
                VALUE_ENTRY_uint16, VALUE_ENTRY_uint32, VALUE_ENTRY_uint64, VALUE_ENTRY_uint8 };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property DataType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_boolean,
                VALUE_ENTRY_char16, VALUE_ENTRY_datetime, VALUE_ENTRY_real32, VALUE_ENTRY_real64,
                VALUE_ENTRY_sint16, VALUE_ENTRY_sint32, VALUE_ENTRY_sint64, VALUE_ENTRY_sint8,
                VALUE_ENTRY_string, VALUE_ENTRY_uint16, VALUE_ENTRY_uint32, VALUE_ENTRY_uint64,
                VALUE_ENTRY_uint8 };

    }

    /**
     * Constants of property GatheringType
     * GatheringType indicates how the metric values are gathered by the underlying instrumentation. This allows the client application to choose the right metric for the purpose. 
     * 0="Unknown": Indicates that the GatheringType is not known. 
     * 2="OnChange": Indicates that the CIM metric values get updated immediately when the values inside of the measured resource change. The values of OnChange metrics truly reflect the current situation within the resource at any time. An example is the number of logged on users that gets updated immediately as users log on and off. 
     * 3="Periodic": Indicates that the CIM metric values get updated periodically. For instance, to a client application, a metric value applying to the current time will appear constant during each gathering interval, and then jumps to the new value at the end of each gathering interval. 
     * 4="OnRequest": Indicates that the CIM metric value is determined each time a client application reads it. The values of OnRequest metrics truly return the current situation within the resource if somebody asks for it. However, they do not change "unobserved", and therefore subscribing for value changes of OnRequest metrics is NOT RECOMMENDED.
     */
    public static class PROPERTY_GATHERINGTYPE {
        /**
         * name of the property GatheringType
         */
        public final static String NAME = "GatheringType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OnChange = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry OnChange (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_OnChange = "OnChange";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Periodic = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Periodic (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Periodic = "Periodic";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_OnRequest = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry OnRequest (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_OnRequest = "OnRequest";

        /**
         * constant for value map entry 5..32767
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 5..32767 )
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

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_OnChange.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OnChange;
            }

            if (VALUE_ENTRY_Periodic.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Periodic;
            }

            if (VALUE_ENTRY_OnRequest.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_OnRequest;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OnChange.intValue()) {
                return VALUE_ENTRY_OnChange;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Periodic.intValue()) {
                return VALUE_ENTRY_Periodic;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_OnRequest.intValue()) {
                return VALUE_ENTRY_OnRequest;
            }

            if (iValue >= 5 || iValue <= 32767) {
                return VALUE_ENTRY_DMTF_Reserved;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Reserved;
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
         * Value Map for the property GatheringType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OnChange,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Periodic,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_OnRequest };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property GatheringType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_OnChange,
                VALUE_ENTRY_Periodic, VALUE_ENTRY_OnRequest, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property GatheringType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_OnChange, VALUE_ENTRY_Periodic, VALUE_ENTRY_OnRequest };

    }

    /**
     * Constants of property Id
     * A string that uniquely identifies the metric definition. The use of OSF UUID/GUIDs is recommended.
     */
    public static class PROPERTY_ID {
        /**
         * name of the property Id
         */
        public final static String NAME = "Id";

    }

    /**
     * Constants of property IsContinuous
     * IsContinuous indicates whether or not the metric value is continuous or scalar. Performance metrics are an example of a linear metric. Examples of non-linear metrics include error codes or operational states. Continuous metrics can be compared using the "greater than" relation.
     */
    public static class PROPERTY_ISCONTINUOUS {
        /**
         * name of the property IsContinuous
         */
        public final static String NAME = "IsContinuous";

    }

    /**
     * Constants of property Name
     * The name of the metric. This name does not have to be unique, but should be descriptive and may contain blanks.
     */
    public static class PROPERTY_NAME {
        /**
         * name of the property Name
         */
        public final static String NAME = "Name";

    }

    /**
     * Constants of property ProgrammaticUnits
     * Identifies the specific units of a value. The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Appendix C.1 of DSP0004 V2.4 or later.
     */
    public static class PROPERTY_PROGRAMMATICUNITS {
        /**
         * name of the property ProgrammaticUnits
         */
        public final static String NAME = "ProgrammaticUnits";

    }

    /**
     * Constants of property SampleInterval
     * If metric values are collected at regular intervals, the SampleInterval property indicates the length of the the interval. If non-null, the value of the SampleInterval shall be expressed in interval notation. A value of NULL shall indicate the SampleInterval is unknown. A value of 99990101000000.000000+000 shall indicate the sampling interval is irregular.
     */
    public static class PROPERTY_SAMPLEINTERVAL {
        /**
         * name of the property SampleInterval
         */
        public final static String NAME = "SampleInterval";

    }

    /**
     * Constants of property TimeScope
     * TimeScope indicates the time scope to which the metric value applies. 
     * 0="Unknown" indicates the time scope was not qualified by the metric designer, or is unknown to the provider. 
     * 2="Point" indicates that the metric applies to a point in time. On the corresponding BaseMetricValue instances, TimeStamp specifies the point in time and Duration is always 0. 
     * 3="Interval" indicates that the metric applies to a time interval. On the corresponding BaseMetricValue instances, TimeStamp specifies the end of the time interval and Duration specifies its duration. 
     * 4="StartupInterval" indicates that the metric applies to a time interval that began at the startup of the measured resource (i.e. the ManagedElement associated by MetricDefForMe). On the corresponding BaseMetricValue instances, TimeStamp specifies the end of the time interval. If Duration is 0, this indicates that the startup time of the measured resource is unknown. Else, Duration specifies the duration between startup of the resource and TimeStamp.
     */
    public static class PROPERTY_TIMESCOPE {
        /**
         * name of the property TimeScope
         */
        public final static String NAME = "TimeScope";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Point = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Point (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Point = "Point";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Interval = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Interval (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Interval = "Interval";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_StartupInterval = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry StartupInterval (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_StartupInterval = "StartupInterval";

        /**
         * constant for value map entry 5..32767
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 5..32767 )
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

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Point.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Point;
            }

            if (VALUE_ENTRY_Interval.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Interval;
            }

            if (VALUE_ENTRY_StartupInterval.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_StartupInterval;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Point.intValue()) {
                return VALUE_ENTRY_Point;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Interval.intValue()) {
                return VALUE_ENTRY_Interval;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_StartupInterval.intValue()) {
                return VALUE_ENTRY_StartupInterval;
            }

            if (iValue >= 5 || iValue <= 32767) {
                return VALUE_ENTRY_DMTF_Reserved;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Reserved;
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
         * Value Map for the property TimeScope   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Point,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Interval,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_StartupInterval };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property TimeScope   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Point,
                VALUE_ENTRY_Interval, VALUE_ENTRY_StartupInterval, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property TimeScope   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Point, VALUE_ENTRY_Interval, VALUE_ENTRY_StartupInterval };

    }

    /**
     * Constants of property Units
     * Identifies the specific units of a value. Examples are Bytes, Packets, Jobs, Files, Milliseconds, and Amps.
     */
    public static class PROPERTY_UNITS {
        /**
         * name of the property Units
         */
        public final static String NAME = "Units";

    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
        String[] parentClassPackageList = CIM_ManagedElement.getPackages();

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
     *   CIM_BaseMetricDefinition represents the definitional aspects of a metric, i.e., a definition template containing meta data about a new metric. Since CIM_BaseMetricDefinition does not capture metric instance information, it does not contain the value of the metric. The associated class CIM_BaseMetricValue holds the metric value and encapsulates its runtime behavior. The purpose of CIM_BaseMetricDefinition is to provide a convenient mechanism for introducing a new metric definition at runtime and capturing its instance values in a separate class. This mechanism is targeted specifically at CIM users who would like to enhance existing CIM schemas by introducing domain-specific metrics that are not captured in the existing CIM schemas. In addition, vendors of managed resources may make use of this mechanism if a small subset of a potentially large and heterogeneous amount of performance-related data needs to be exposed, based on the context in which the data is captured. Additional meta data for a metric can be provided by subclassing from CIM_BaseMetricDefinition. The CIM_BaseMetricDefinition should be associated with the CIM_ManagedElement(s) to which it applies.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_BaseMetricDefinition(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_BaseMetricDefinition represents the definitional aspects of a metric, i.e., a definition template containing meta data about a new metric. Since CIM_BaseMetricDefinition does not capture metric instance information, it does not contain the value of the metric. The associated class CIM_BaseMetricValue holds the metric value and encapsulates its runtime behavior. The purpose of CIM_BaseMetricDefinition is to provide a convenient mechanism for introducing a new metric definition at runtime and capturing its instance values in a separate class. This mechanism is targeted specifically at CIM users who would like to enhance existing CIM schemas by introducing domain-specific metrics that are not captured in the existing CIM schemas. In addition, vendors of managed resources may make use of this mechanism if a small subset of a potentially large and heterogeneous amount of performance-related data needs to be exposed, based on the context in which the data is captured. Additional meta data for a metric can be provided by subclassing from CIM_BaseMetricDefinition. The CIM_BaseMetricDefinition should be associated with the CIM_ManagedElement(s) to which it applies.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_BaseMetricDefinition(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_BaseMetricDefinition() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Accuracy", new CIMProperty("Accuracy", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("AccuracyUnits", new CIMProperty("AccuracyUnits",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("BreakdownDimensions", new CIMProperty("BreakdownDimensions",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("Calculable", new CIMProperty("Calculable", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("ChangeType", new CIMProperty("ChangeType", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("DataType", new CIMProperty("DataType", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("GatheringType", new CIMProperty("GatheringType",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Id", new CIMProperty("Id", CIMDataType.STRING_T, null));
        propertiesToCheck.put("IsContinuous", new CIMProperty("IsContinuous",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("Name", new CIMProperty("Name", CIMDataType.STRING_T, null));
        propertiesToCheck.put("ProgrammaticUnits", new CIMProperty("ProgrammaticUnits",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("SampleInterval", new CIMProperty("SampleInterval",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck
                .put("TimeScope", new CIMProperty("TimeScope", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Units", new CIMProperty("Units", CIMDataType.STRING_T, null));

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
     * Get the property Accuracy
     *     * <br>
     * Indicates the accuracy of the values reported for this metric. The accuracy is expressed as the value of theAccuracy property in the units specified by the AccuracyUnits property.
     *     */

    public javax.cim.UnsignedInteger32 get_Accuracy() {
        CIMProperty currentProperty = getProperty(PROPERTY_ACCURACY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ACCURACY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property Accuracy
     * <br>
     * Indicates the accuracy of the values reported for this metric. The accuracy is expressed as the value of theAccuracy property in the units specified by the AccuracyUnits property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Accuracy(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ACCURACY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Accuracy(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ACCURACY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Accuracy by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Accuracy(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_BaseMetricDefinition fco = new CIM_BaseMetricDefinition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ACCURACY.NAME);
        if (property != null) {
            property = setPropertyValue_Accuracy(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ACCURACY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Accuracy
     * <br>
     * Indicates the accuracy of the values reported for this metric. The accuracy is expressed as the value of theAccuracy property in the units specified by the AccuracyUnits property.
     */

    private static CIMProperty setPropertyValue_Accuracy(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property AccuracyUnits
     *     * <br>
     * Identifies the specific units in which the accuracy is expressed. The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Appendix C.1 of DSP0004 V2.4.
     *     */

    public String get_AccuracyUnits() {
        CIMProperty currentProperty = getProperty(PROPERTY_ACCURACYUNITS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ACCURACYUNITS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property AccuracyUnits
     * <br>
     * Identifies the specific units in which the accuracy is expressed. The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Appendix C.1 of DSP0004 V2.4.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AccuracyUnits(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ACCURACYUNITS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_AccuracyUnits(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ACCURACYUNITS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AccuracyUnits by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AccuracyUnits(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_BaseMetricDefinition fco = new CIM_BaseMetricDefinition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ACCURACYUNITS.NAME);
        if (property != null) {
            property = setPropertyValue_AccuracyUnits(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ACCURACYUNITS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AccuracyUnits
     * <br>
     * Identifies the specific units in which the accuracy is expressed. The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Appendix C.1 of DSP0004 V2.4.
     */

    private static CIMProperty setPropertyValue_AccuracyUnits(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property BreakdownDimensions
     *     * <br>
     * Defines one or more strings that can be used to refine (break down) queries against the BaseMetricValues along a certain dimension. An example is a transaction name, allowing the break down of the total value for all transactions into a set of values, one for each transaction name. Other examples might be application system or user group name. The strings are free format and should be meaningful to the end users of the metric data. The strings indicate which break down dimensions are supported for this metric definition, by the underlying instrumentation.
     *     */

    public String[] get_BreakdownDimensions() {
        CIMProperty currentProperty = getProperty(PROPERTY_BREAKDOWNDIMENSIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BREAKDOWNDIMENSIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property BreakdownDimensions
     * <br>
     * Defines one or more strings that can be used to refine (break down) queries against the BaseMetricValues along a certain dimension. An example is a transaction name, allowing the break down of the total value for all transactions into a set of values, one for each transaction name. Other examples might be application system or user group name. The strings are free format and should be meaningful to the end users of the metric data. The strings indicate which break down dimensions are supported for this metric definition, by the underlying instrumentation.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BreakdownDimensions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BREAKDOWNDIMENSIONS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_BreakdownDimensions(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BREAKDOWNDIMENSIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BreakdownDimensions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BreakdownDimensions(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_BaseMetricDefinition fco = new CIM_BaseMetricDefinition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BREAKDOWNDIMENSIONS.NAME);
        if (property != null) {
            property = setPropertyValue_BreakdownDimensions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BREAKDOWNDIMENSIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BreakdownDimensions
     * <br>
     * Defines one or more strings that can be used to refine (break down) queries against the BaseMetricValues along a certain dimension. An example is a transaction name, allowing the break down of the total value for all transactions into a set of values, one for each transaction name. Other examples might be application system or user group name. The strings are free format and should be meaningful to the end users of the metric data. The strings indicate which break down dimensions are supported for this metric definition, by the underlying instrumentation.
     */

    private static CIMProperty setPropertyValue_BreakdownDimensions(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Calculable
     *     * <br>
     * An enumerated value that describes the characteristics of the metric, for purposes of performing calculations. The property can take one of the following values: 
     * 1="Non-calculable" -> a string. Arithmetic makes no sense. 
     * 2="Summable" -> It is reasonable to sum this value over many instances of e.g., UnitOfWork, such as the number of files processed in a backup job. For example, if each backup job is a UnitOfWork, and each job backs up 27,000 files on average, then it makes sense to say that 100 backup jobs processed 2,700,000 files. 
     * 3="Non-summable" -> It does not make sense to sum this value over many instances of UnitOfWork. An example would be a metric that measures the queue length when a job arrives at a server. If each job is a UnitOfWork, and the average queue length when each job arrives is 33, it does not make sense to say that the queue length for 100 jobs is 3300. It does make sense to say that the mean is 33.
     *     */

    public javax.cim.UnsignedInteger16 get_Calculable() {
        CIMProperty currentProperty = getProperty(PROPERTY_CALCULABLE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CALCULABLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property Calculable
     * <br>
     * An enumerated value that describes the characteristics of the metric, for purposes of performing calculations. The property can take one of the following values: 
     * 1="Non-calculable" -> a string. Arithmetic makes no sense. 
     * 2="Summable" -> It is reasonable to sum this value over many instances of e.g., UnitOfWork, such as the number of files processed in a backup job. For example, if each backup job is a UnitOfWork, and each job backs up 27,000 files on average, then it makes sense to say that 100 backup jobs processed 2,700,000 files. 
     * 3="Non-summable" -> It does not make sense to sum this value over many instances of UnitOfWork. An example would be a metric that measures the queue length when a job arrives at a server. If each job is a UnitOfWork, and the average queue length when each job arrives is 33, it does not make sense to say that the queue length for 100 jobs is 3300. It does make sense to say that the mean is 33.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Calculable(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CALCULABLE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Calculable(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CALCULABLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Calculable by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Calculable(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_BaseMetricDefinition fco = new CIM_BaseMetricDefinition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CALCULABLE.NAME);
        if (property != null) {
            property = setPropertyValue_Calculable(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CALCULABLE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Calculable
     * <br>
     * An enumerated value that describes the characteristics of the metric, for purposes of performing calculations. The property can take one of the following values: 
     * 1="Non-calculable" -> a string. Arithmetic makes no sense. 
     * 2="Summable" -> It is reasonable to sum this value over many instances of e.g., UnitOfWork, such as the number of files processed in a backup job. For example, if each backup job is a UnitOfWork, and each job backs up 27,000 files on average, then it makes sense to say that 100 backup jobs processed 2,700,000 files. 
     * 3="Non-summable" -> It does not make sense to sum this value over many instances of UnitOfWork. An example would be a metric that measures the queue length when a job arrives at a server. If each job is a UnitOfWork, and the average queue length when each job arrives is 33, it does not make sense to say that the queue length for 100 jobs is 3300. It does make sense to say that the mean is 33.
     */

    private static CIMProperty setPropertyValue_Calculable(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ChangeType
     *     * <br>
     * ChangeType indicates how the metric value changes, in the form of typical combinations of finer grain attributes such as direction change, minimum and maximum values, and wrapping semantics. 
     * 0="Unknown": The metric designer did not qualify the ChangeType. 
     * 2="N/A": If the "IsContinuous" property is "false", ChangeType does not make sense and MUST be is set to "N/A". 
     * 3="Counter": The metric is a counter metric. These have non-negative integer values which increase monotonically until reaching the maximum representable number and then wrap around and start increasing from 0. Such counters, also known as rollover counters, can be used for instance to count the number of network errors or the number of transactions processed. The only way for a client application to keep track of wrap arounds is to retrieve the value of the counter in appropriately short intervals. 
     * 4="Gauge": The metric is a gauge metric. These have integer or float values that can increase and decrease arbitrarily. A gauge MUST NOT wrap when reaching the minimum or maximum representable number, instead, the value "sticks" at that number. Minimum or maximum values inside of the representable value range at which the metric value "sticks", may or may not be defined. 
     * Vendors may extend this property in the vendor reserved range.
     *     */

    public javax.cim.UnsignedInteger16 get_ChangeType() {
        CIMProperty currentProperty = getProperty(PROPERTY_CHANGETYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CHANGETYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ChangeType
     * <br>
     * ChangeType indicates how the metric value changes, in the form of typical combinations of finer grain attributes such as direction change, minimum and maximum values, and wrapping semantics. 
     * 0="Unknown": The metric designer did not qualify the ChangeType. 
     * 2="N/A": If the "IsContinuous" property is "false", ChangeType does not make sense and MUST be is set to "N/A". 
     * 3="Counter": The metric is a counter metric. These have non-negative integer values which increase monotonically until reaching the maximum representable number and then wrap around and start increasing from 0. Such counters, also known as rollover counters, can be used for instance to count the number of network errors or the number of transactions processed. The only way for a client application to keep track of wrap arounds is to retrieve the value of the counter in appropriately short intervals. 
     * 4="Gauge": The metric is a gauge metric. These have integer or float values that can increase and decrease arbitrarily. A gauge MUST NOT wrap when reaching the minimum or maximum representable number, instead, the value "sticks" at that number. Minimum or maximum values inside of the representable value range at which the metric value "sticks", may or may not be defined. 
     * Vendors may extend this property in the vendor reserved range.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ChangeType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CHANGETYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ChangeType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CHANGETYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ChangeType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ChangeType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_BaseMetricDefinition fco = new CIM_BaseMetricDefinition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CHANGETYPE.NAME);
        if (property != null) {
            property = setPropertyValue_ChangeType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CHANGETYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ChangeType
     * <br>
     * ChangeType indicates how the metric value changes, in the form of typical combinations of finer grain attributes such as direction change, minimum and maximum values, and wrapping semantics. 
     * 0="Unknown": The metric designer did not qualify the ChangeType. 
     * 2="N/A": If the "IsContinuous" property is "false", ChangeType does not make sense and MUST be is set to "N/A". 
     * 3="Counter": The metric is a counter metric. These have non-negative integer values which increase monotonically until reaching the maximum representable number and then wrap around and start increasing from 0. Such counters, also known as rollover counters, can be used for instance to count the number of network errors or the number of transactions processed. The only way for a client application to keep track of wrap arounds is to retrieve the value of the counter in appropriately short intervals. 
     * 4="Gauge": The metric is a gauge metric. These have integer or float values that can increase and decrease arbitrarily. A gauge MUST NOT wrap when reaching the minimum or maximum representable number, instead, the value "sticks" at that number. Minimum or maximum values inside of the representable value range at which the metric value "sticks", may or may not be defined. 
     * Vendors may extend this property in the vendor reserved range.
     */

    private static CIMProperty setPropertyValue_ChangeType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DataType
     *     * <br>
     * The data type of the metric. For example, "boolean" (value=1) or "datetime" (=3) may be specified. These types represent the datatypes defined for CIM.
     *     */

    public javax.cim.UnsignedInteger16 get_DataType() {
        CIMProperty currentProperty = getProperty(PROPERTY_DATATYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DATATYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property DataType
     * <br>
     * The data type of the metric. For example, "boolean" (value=1) or "datetime" (=3) may be specified. These types represent the datatypes defined for CIM.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DataType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DATATYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_DataType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DATATYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DataType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DataType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_BaseMetricDefinition fco = new CIM_BaseMetricDefinition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DATATYPE.NAME);
        if (property != null) {
            property = setPropertyValue_DataType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DATATYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DataType
     * <br>
     * The data type of the metric. For example, "boolean" (value=1) or "datetime" (=3) may be specified. These types represent the datatypes defined for CIM.
     */

    private static CIMProperty setPropertyValue_DataType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property GatheringType
     *     * <br>
     * GatheringType indicates how the metric values are gathered by the underlying instrumentation. This allows the client application to choose the right metric for the purpose. 
     * 0="Unknown": Indicates that the GatheringType is not known. 
     * 2="OnChange": Indicates that the CIM metric values get updated immediately when the values inside of the measured resource change. The values of OnChange metrics truly reflect the current situation within the resource at any time. An example is the number of logged on users that gets updated immediately as users log on and off. 
     * 3="Periodic": Indicates that the CIM metric values get updated periodically. For instance, to a client application, a metric value applying to the current time will appear constant during each gathering interval, and then jumps to the new value at the end of each gathering interval. 
     * 4="OnRequest": Indicates that the CIM metric value is determined each time a client application reads it. The values of OnRequest metrics truly return the current situation within the resource if somebody asks for it. However, they do not change "unobserved", and therefore subscribing for value changes of OnRequest metrics is NOT RECOMMENDED.
     *     */

    public javax.cim.UnsignedInteger16 get_GatheringType() {
        CIMProperty currentProperty = getProperty(PROPERTY_GATHERINGTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_GATHERINGTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property GatheringType
     * <br>
     * GatheringType indicates how the metric values are gathered by the underlying instrumentation. This allows the client application to choose the right metric for the purpose. 
     * 0="Unknown": Indicates that the GatheringType is not known. 
     * 2="OnChange": Indicates that the CIM metric values get updated immediately when the values inside of the measured resource change. The values of OnChange metrics truly reflect the current situation within the resource at any time. An example is the number of logged on users that gets updated immediately as users log on and off. 
     * 3="Periodic": Indicates that the CIM metric values get updated periodically. For instance, to a client application, a metric value applying to the current time will appear constant during each gathering interval, and then jumps to the new value at the end of each gathering interval. 
     * 4="OnRequest": Indicates that the CIM metric value is determined each time a client application reads it. The values of OnRequest metrics truly return the current situation within the resource if somebody asks for it. However, they do not change "unobserved", and therefore subscribing for value changes of OnRequest metrics is NOT RECOMMENDED.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_GatheringType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_GATHERINGTYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_GatheringType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_GATHERINGTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property GatheringType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_GatheringType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_BaseMetricDefinition fco = new CIM_BaseMetricDefinition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_GATHERINGTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_GatheringType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_GATHERINGTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property GatheringType
     * <br>
     * GatheringType indicates how the metric values are gathered by the underlying instrumentation. This allows the client application to choose the right metric for the purpose. 
     * 0="Unknown": Indicates that the GatheringType is not known. 
     * 2="OnChange": Indicates that the CIM metric values get updated immediately when the values inside of the measured resource change. The values of OnChange metrics truly reflect the current situation within the resource at any time. An example is the number of logged on users that gets updated immediately as users log on and off. 
     * 3="Periodic": Indicates that the CIM metric values get updated periodically. For instance, to a client application, a metric value applying to the current time will appear constant during each gathering interval, and then jumps to the new value at the end of each gathering interval. 
     * 4="OnRequest": Indicates that the CIM metric value is determined each time a client application reads it. The values of OnRequest metrics truly return the current situation within the resource if somebody asks for it. However, they do not change "unobserved", and therefore subscribing for value changes of OnRequest metrics is NOT RECOMMENDED.
     */

    private static CIMProperty setPropertyValue_GatheringType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Id
     *     * <br>
     * A string that uniquely identifies the metric definition. The use of OSF UUID/GUIDs is recommended.
     *     */

    public String get_key_Id() {
        CIMProperty currentProperty = getProperty(PROPERTY_ID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Id
     * <br>
     * A string that uniquely identifies the metric definition. The use of OSF UUID/GUIDs is recommended.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_Id(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ID.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_key_Id(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Id by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_Id(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_BaseMetricDefinition fco = new CIM_BaseMetricDefinition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ID.NAME);
        if (property != null) {
            property = setPropertyValue_key_Id(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Id
     * <br>
     * A string that uniquely identifies the metric definition. The use of OSF UUID/GUIDs is recommended.
     */

    private static CIMProperty setPropertyValue_key_Id(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IsContinuous
     *     * <br>
     * IsContinuous indicates whether or not the metric value is continuous or scalar. Performance metrics are an example of a linear metric. Examples of non-linear metrics include error codes or operational states. Continuous metrics can be compared using the "greater than" relation.
     *     */

    public Boolean get_IsContinuous() {
        CIMProperty currentProperty = getProperty(PROPERTY_ISCONTINUOUS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ISCONTINUOUS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property IsContinuous
     * <br>
     * IsContinuous indicates whether or not the metric value is continuous or scalar. Performance metrics are an example of a linear metric. Examples of non-linear metrics include error codes or operational states. Continuous metrics can be compared using the "greater than" relation.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IsContinuous(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ISCONTINUOUS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IsContinuous(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ISCONTINUOUS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IsContinuous by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IsContinuous(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_BaseMetricDefinition fco = new CIM_BaseMetricDefinition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ISCONTINUOUS.NAME);
        if (property != null) {
            property = setPropertyValue_IsContinuous(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ISCONTINUOUS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IsContinuous
     * <br>
     * IsContinuous indicates whether or not the metric value is continuous or scalar. Performance metrics are an example of a linear metric. Examples of non-linear metrics include error codes or operational states. Continuous metrics can be compared using the "greater than" relation.
     */

    private static CIMProperty setPropertyValue_IsContinuous(CIMProperty currentProperty,
            Boolean newValue) {
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
     * The name of the metric. This name does not have to be unique, but should be descriptive and may contain blanks.
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
     * The name of the metric. This name does not have to be unique, but should be descriptive and may contain blanks.
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
        CIM_BaseMetricDefinition fco = new CIM_BaseMetricDefinition(client, namespace);
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
     * The name of the metric. This name does not have to be unique, but should be descriptive and may contain blanks.
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
     * Get the property ProgrammaticUnits
     *     * <br>
     * Identifies the specific units of a value. The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Appendix C.1 of DSP0004 V2.4 or later.
     *     */

    public String get_ProgrammaticUnits() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROGRAMMATICUNITS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROGRAMMATICUNITS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ProgrammaticUnits
     * <br>
     * Identifies the specific units of a value. The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Appendix C.1 of DSP0004 V2.4 or later.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ProgrammaticUnits(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROGRAMMATICUNITS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ProgrammaticUnits(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROGRAMMATICUNITS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ProgrammaticUnits by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ProgrammaticUnits(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_BaseMetricDefinition fco = new CIM_BaseMetricDefinition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROGRAMMATICUNITS.NAME);
        if (property != null) {
            property = setPropertyValue_ProgrammaticUnits(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROGRAMMATICUNITS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ProgrammaticUnits
     * <br>
     * Identifies the specific units of a value. The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Appendix C.1 of DSP0004 V2.4 or later.
     */

    private static CIMProperty setPropertyValue_ProgrammaticUnits(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SampleInterval
     *     * <br>
     * If metric values are collected at regular intervals, the SampleInterval property indicates the length of the the interval. If non-null, the value of the SampleInterval shall be expressed in interval notation. A value of NULL shall indicate the SampleInterval is unknown. A value of 99990101000000.000000+000 shall indicate the sampling interval is irregular.
     *     */

    public javax.cim.CIMDateTime get_SampleInterval() {
        CIMProperty currentProperty = getProperty(PROPERTY_SAMPLEINTERVAL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SAMPLEINTERVAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property SampleInterval
     * <br>
     * If metric values are collected at regular intervals, the SampleInterval property indicates the length of the the interval. If non-null, the value of the SampleInterval shall be expressed in interval notation. A value of NULL shall indicate the SampleInterval is unknown. A value of 99990101000000.000000+000 shall indicate the sampling interval is irregular.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SampleInterval(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SAMPLEINTERVAL.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SampleInterval(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SAMPLEINTERVAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SampleInterval by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SampleInterval(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_BaseMetricDefinition fco = new CIM_BaseMetricDefinition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SAMPLEINTERVAL.NAME);
        if (property != null) {
            property = setPropertyValue_SampleInterval(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SAMPLEINTERVAL.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SampleInterval
     * <br>
     * If metric values are collected at regular intervals, the SampleInterval property indicates the length of the the interval. If non-null, the value of the SampleInterval shall be expressed in interval notation. A value of NULL shall indicate the SampleInterval is unknown. A value of 99990101000000.000000+000 shall indicate the sampling interval is irregular.
     */

    private static CIMProperty setPropertyValue_SampleInterval(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TimeScope
     *     * <br>
     * TimeScope indicates the time scope to which the metric value applies. 
     * 0="Unknown" indicates the time scope was not qualified by the metric designer, or is unknown to the provider. 
     * 2="Point" indicates that the metric applies to a point in time. On the corresponding BaseMetricValue instances, TimeStamp specifies the point in time and Duration is always 0. 
     * 3="Interval" indicates that the metric applies to a time interval. On the corresponding BaseMetricValue instances, TimeStamp specifies the end of the time interval and Duration specifies its duration. 
     * 4="StartupInterval" indicates that the metric applies to a time interval that began at the startup of the measured resource (i.e. the ManagedElement associated by MetricDefForMe). On the corresponding BaseMetricValue instances, TimeStamp specifies the end of the time interval. If Duration is 0, this indicates that the startup time of the measured resource is unknown. Else, Duration specifies the duration between startup of the resource and TimeStamp.
     *     */

    public javax.cim.UnsignedInteger16 get_TimeScope() {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMESCOPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TIMESCOPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property TimeScope
     * <br>
     * TimeScope indicates the time scope to which the metric value applies. 
     * 0="Unknown" indicates the time scope was not qualified by the metric designer, or is unknown to the provider. 
     * 2="Point" indicates that the metric applies to a point in time. On the corresponding BaseMetricValue instances, TimeStamp specifies the point in time and Duration is always 0. 
     * 3="Interval" indicates that the metric applies to a time interval. On the corresponding BaseMetricValue instances, TimeStamp specifies the end of the time interval and Duration specifies its duration. 
     * 4="StartupInterval" indicates that the metric applies to a time interval that began at the startup of the measured resource (i.e. the ManagedElement associated by MetricDefForMe). On the corresponding BaseMetricValue instances, TimeStamp specifies the end of the time interval. If Duration is 0, this indicates that the startup time of the measured resource is unknown. Else, Duration specifies the duration between startup of the resource and TimeStamp.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TimeScope(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMESCOPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_TimeScope(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TIMESCOPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TimeScope by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TimeScope(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_BaseMetricDefinition fco = new CIM_BaseMetricDefinition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TIMESCOPE.NAME);
        if (property != null) {
            property = setPropertyValue_TimeScope(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TIMESCOPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TimeScope
     * <br>
     * TimeScope indicates the time scope to which the metric value applies. 
     * 0="Unknown" indicates the time scope was not qualified by the metric designer, or is unknown to the provider. 
     * 2="Point" indicates that the metric applies to a point in time. On the corresponding BaseMetricValue instances, TimeStamp specifies the point in time and Duration is always 0. 
     * 3="Interval" indicates that the metric applies to a time interval. On the corresponding BaseMetricValue instances, TimeStamp specifies the end of the time interval and Duration specifies its duration. 
     * 4="StartupInterval" indicates that the metric applies to a time interval that began at the startup of the measured resource (i.e. the ManagedElement associated by MetricDefForMe). On the corresponding BaseMetricValue instances, TimeStamp specifies the end of the time interval. If Duration is 0, this indicates that the startup time of the measured resource is unknown. Else, Duration specifies the duration between startup of the resource and TimeStamp.
     */

    private static CIMProperty setPropertyValue_TimeScope(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Units
     *     * <br>
     * Identifies the specific units of a value. Examples are Bytes, Packets, Jobs, Files, Milliseconds, and Amps.
     *     */

    public String get_Units() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNITS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNITS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Units
     * <br>
     * Identifies the specific units of a value. Examples are Bytes, Packets, Jobs, Files, Milliseconds, and Amps.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Units(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNITS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Units(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNITS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Units by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Units(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_BaseMetricDefinition fco = new CIM_BaseMetricDefinition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNITS.NAME);
        if (property != null) {
            property = setPropertyValue_Units(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNITS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Units
     * <br>
     * Identifies the specific units of a value. Examples are Bytes, Packets, Jobs, Files, Milliseconds, and Amps.
     */

    private static CIMProperty setPropertyValue_Units(CIMProperty currentProperty, String newValue) {
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
        return CIM_BaseMetricDefinition.CIM_CLASS_NAME;
    }

}