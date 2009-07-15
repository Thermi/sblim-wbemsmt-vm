/** 
 * CIM_Error.java
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
 * Description: CIM_Error is a specialized class that contains information about the severity, cause, recommended actions and other data related to the failure of a CIM Operation. Instances of this type MAY be included as part of the response to a CIM Operation.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_Error extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_Error";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property CIMStatusCode
     * The CIM status code that characterizes this instance. 
     * This property defines the status codes that MAY be return by a conforming CIM Server or Listener. Note that not all status codes are valid for each operation. The specification for each operation SHOULD define the status codes that may be returned by that operation. 
     * The following values for CIM status code are defined: 
     * 1 - CIM_ERR_FAILED. A general error occurred that is not covered by a more specific error code. 
     * 2 - CIM_ERR_ACCESS_DENIED. Access to a CIM resource was not available to the client. 
     * 3 - CIM_ERR_INVALID_NAMESPACE. The target namespace does not exist. 
     * 4 - CIM_ERR_INVALID_PARAMETER. One or more parameter values passed to the method were invalid. 
     * 5 - CIM_ERR_INVALID_CLASS. The specified Class does not exist. 
     * 6 - CIM_ERR_NOT_FOUND. The requested object could not be found. 
     * 7 - CIM_ERR_NOT_SUPPORTED. The requested operation is not supported. 
     * 8 - CIM_ERR_CLASS_HAS_CHILDREN. Operation cannot be carried out on this class since it has instances. 
     * 9 - CIM_ERR_CLASS_HAS_INSTANCES. Operation cannot be carried out on this class since it has instances. 
     * 10 - CIM_ERR_INVALID_SUPERCLASS. Operation cannot be carried out since the specified superclass does not exist. 
     * 11 - CIM_ERR_ALREADY_EXISTS. Operation cannot be carried out because an object already exists. 
     * 12 - CIM_ERR_NO_SUCH_PROPERTY. The specified Property does not exist. 
     * 13 - CIM_ERR_TYPE_MISMATCH. The value supplied is incompatible with the type. 
     * 14 - CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED. The query language is not recognized or supported. 
     * 15 - CIM_ERR_INVALID_QUERY. The query is not valid for the specified query language. 
     * 16 - CIM_ERR_METHOD_NOT_AVAILABLE. The extrinsic Method could not be executed. 
     * 17 - CIM_ERR_METHOD_NOT_FOUND. The specified extrinsic Method does not exist. 
     * 18 - CIM_ERR_UNEXPECTED_RESPONSE. The returned response to the asynchronous operation was not expected. 
     * 19 - CIM_ERR_INVALID_RESPONSE_DESTINATION. The specified destination for the asynchronous response is not valid. 
     * 20 - CIM_ERR_NAMESPACE_NOT_EMPTY. The specified Namespace is not empty.
     */
    public static class PROPERTY_CIMSTATUSCODE {
        /**
         * name of the property CIMStatusCode
         */
        public final static String NAME = "CIMStatusCode";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_CIM_ERR_FAILED = new javax.cim.UnsignedInteger32(
                "1");

        /**
         * constant for value entry CIM_ERR_FAILED (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_FAILED = "CIM_ERR_FAILED";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIM_ERR_ACCESS_DENIED = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry CIM_ERR_ACCESS_DENIED (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_ACCESS_DENIED = "CIM_ERR_ACCESS_DENIED";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CIM_ERR_INVALID_NAMESPACE = new javax.cim.UnsignedInteger32(
                "3");

        /**
         * constant for value entry CIM_ERR_INVALID_NAMESPACE (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_INVALID_NAMESPACE = "CIM_ERR_INVALID_NAMESPACE";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CIM_ERR_INVALID_PARAMETER = new javax.cim.UnsignedInteger32(
                "4");

        /**
         * constant for value entry CIM_ERR_INVALID_PARAMETER (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_INVALID_PARAMETER = "CIM_ERR_INVALID_PARAMETER";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_CIM_ERR_INVALID_CLASS = new javax.cim.UnsignedInteger32(
                "5");

        /**
         * constant for value entry CIM_ERR_INVALID_CLASS (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_INVALID_CLASS = "CIM_ERR_INVALID_CLASS";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_CIM_ERR_NOT_FOUND = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry CIM_ERR_NOT_FOUND (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_NOT_FOUND = "CIM_ERR_NOT_FOUND";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_CIM_ERR_NOT_SUPPORTED = new javax.cim.UnsignedInteger32(
                "7");

        /**
         * constant for value entry CIM_ERR_NOT_SUPPORTED (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_NOT_SUPPORTED = "CIM_ERR_NOT_SUPPORTED";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_CIM_ERR_CLASS_HAS_CHILDREN = new javax.cim.UnsignedInteger32(
                "8");

        /**
         * constant for value entry CIM_ERR_CLASS_HAS_CHILDREN (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_CLASS_HAS_CHILDREN = "CIM_ERR_CLASS_HAS_CHILDREN";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_CIM_ERR_CLASS_HAS_INSTANCES = new javax.cim.UnsignedInteger32(
                "9");

        /**
         * constant for value entry CIM_ERR_CLASS_HAS_INSTANCES (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_CLASS_HAS_INSTANCES = "CIM_ERR_CLASS_HAS_INSTANCES";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_CIM_ERR_INVALID_SUPERCLASS = new javax.cim.UnsignedInteger32(
                "10");

        /**
         * constant for value entry CIM_ERR_INVALID_SUPERCLASS (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_INVALID_SUPERCLASS = "CIM_ERR_INVALID_SUPERCLASS";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CIM_ERR_ALREADY_EXISTS = new javax.cim.UnsignedInteger32(
                "11");

        /**
         * constant for value entry CIM_ERR_ALREADY_EXISTS (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_ALREADY_EXISTS = "CIM_ERR_ALREADY_EXISTS";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_CIM_ERR_NO_SUCH_PROPERTY = new javax.cim.UnsignedInteger32(
                "12");

        /**
         * constant for value entry CIM_ERR_NO_SUCH_PROPERTY (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_NO_SUCH_PROPERTY = "CIM_ERR_NO_SUCH_PROPERTY";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_CIM_ERR_TYPE_MISMATCH = new javax.cim.UnsignedInteger32(
                "13");

        /**
         * constant for value entry CIM_ERR_TYPE_MISMATCH (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_TYPE_MISMATCH = "CIM_ERR_TYPE_MISMATCH";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED = new javax.cim.UnsignedInteger32(
                "14");

        /**
         * constant for value entry CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED = "CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_CIM_ERR_INVALID_QUERY = new javax.cim.UnsignedInteger32(
                "15");

        /**
         * constant for value entry CIM_ERR_INVALID_QUERY (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_INVALID_QUERY = "CIM_ERR_INVALID_QUERY";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_CIM_ERR_METHOD_NOT_AVAILABLE = new javax.cim.UnsignedInteger32(
                "16");

        /**
         * constant for value entry CIM_ERR_METHOD_NOT_AVAILABLE (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_METHOD_NOT_AVAILABLE = "CIM_ERR_METHOD_NOT_AVAILABLE";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_CIM_ERR_METHOD_NOT_FOUND = new javax.cim.UnsignedInteger32(
                "17");

        /**
         * constant for value entry CIM_ERR_METHOD_NOT_FOUND (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_METHOD_NOT_FOUND = "CIM_ERR_METHOD_NOT_FOUND";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_CIM_ERR_UNEXPECTED_RESPONSE = new javax.cim.UnsignedInteger32(
                "18");

        /**
         * constant for value entry CIM_ERR_UNEXPECTED_RESPONSE (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_UNEXPECTED_RESPONSE = "CIM_ERR_UNEXPECTED_RESPONSE";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_CIM_ERR_INVALID_RESPONSE_DESTINATION = new javax.cim.UnsignedInteger32(
                "19");

        /**
         * constant for value entry CIM_ERR_INVALID_RESPONSE_DESTINATION (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_INVALID_RESPONSE_DESTINATION = "CIM_ERR_INVALID_RESPONSE_DESTINATION";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_CIM_ERR_NAMESPACE_NOT_EMPTY = new javax.cim.UnsignedInteger32(
                "20");

        /**
         * constant for value entry CIM_ERR_NAMESPACE_NOT_EMPTY (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_CIM_ERR_NAMESPACE_NOT_EMPTY = "CIM_ERR_NAMESPACE_NOT_EMPTY";

        /**
         * constant for value map entry 21..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 21.. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@77c077c
        public static javax.cim.UnsignedInteger32 getValueMapEntry(String value) {

            if (VALUE_ENTRY_CIM_ERR_FAILED.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_CIM_ERR_FAILED;
            }

            if (VALUE_ENTRY_CIM_ERR_ACCESS_DENIED.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIM_ERR_ACCESS_DENIED;
            }

            if (VALUE_ENTRY_CIM_ERR_INVALID_NAMESPACE.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CIM_ERR_INVALID_NAMESPACE;
            }

            if (VALUE_ENTRY_CIM_ERR_INVALID_PARAMETER.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CIM_ERR_INVALID_PARAMETER;
            }

            if (VALUE_ENTRY_CIM_ERR_INVALID_CLASS.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_CIM_ERR_INVALID_CLASS;
            }

            if (VALUE_ENTRY_CIM_ERR_NOT_FOUND.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_CIM_ERR_NOT_FOUND;
            }

            if (VALUE_ENTRY_CIM_ERR_NOT_SUPPORTED.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_CIM_ERR_NOT_SUPPORTED;
            }

            if (VALUE_ENTRY_CIM_ERR_CLASS_HAS_CHILDREN.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_CIM_ERR_CLASS_HAS_CHILDREN;
            }

            if (VALUE_ENTRY_CIM_ERR_CLASS_HAS_INSTANCES.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_CIM_ERR_CLASS_HAS_INSTANCES;
            }

            if (VALUE_ENTRY_CIM_ERR_INVALID_SUPERCLASS.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_CIM_ERR_INVALID_SUPERCLASS;
            }

            if (VALUE_ENTRY_CIM_ERR_ALREADY_EXISTS.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CIM_ERR_ALREADY_EXISTS;
            }

            if (VALUE_ENTRY_CIM_ERR_NO_SUCH_PROPERTY.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_CIM_ERR_NO_SUCH_PROPERTY;
            }

            if (VALUE_ENTRY_CIM_ERR_TYPE_MISMATCH.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_CIM_ERR_TYPE_MISMATCH;
            }

            if (VALUE_ENTRY_CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED;
            }

            if (VALUE_ENTRY_CIM_ERR_INVALID_QUERY.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_CIM_ERR_INVALID_QUERY;
            }

            if (VALUE_ENTRY_CIM_ERR_METHOD_NOT_AVAILABLE.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_CIM_ERR_METHOD_NOT_AVAILABLE;
            }

            if (VALUE_ENTRY_CIM_ERR_METHOD_NOT_FOUND.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_CIM_ERR_METHOD_NOT_FOUND;
            }

            if (VALUE_ENTRY_CIM_ERR_UNEXPECTED_RESPONSE.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_CIM_ERR_UNEXPECTED_RESPONSE;
            }

            if (VALUE_ENTRY_CIM_ERR_INVALID_RESPONSE_DESTINATION.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_CIM_ERR_INVALID_RESPONSE_DESTINATION;
            }

            if (VALUE_ENTRY_CIM_ERR_NAMESPACE_NOT_EMPTY.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_CIM_ERR_NAMESPACE_NOT_EMPTY;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_CIM_ERR_FAILED.intValue()) {
                return VALUE_ENTRY_CIM_ERR_FAILED;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIM_ERR_ACCESS_DENIED.intValue()) {
                return VALUE_ENTRY_CIM_ERR_ACCESS_DENIED;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CIM_ERR_INVALID_NAMESPACE.intValue()) {
                return VALUE_ENTRY_CIM_ERR_INVALID_NAMESPACE;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CIM_ERR_INVALID_PARAMETER.intValue()) {
                return VALUE_ENTRY_CIM_ERR_INVALID_PARAMETER;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_CIM_ERR_INVALID_CLASS.intValue()) {
                return VALUE_ENTRY_CIM_ERR_INVALID_CLASS;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_CIM_ERR_NOT_FOUND.intValue()) {
                return VALUE_ENTRY_CIM_ERR_NOT_FOUND;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_CIM_ERR_NOT_SUPPORTED.intValue()) {
                return VALUE_ENTRY_CIM_ERR_NOT_SUPPORTED;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_CIM_ERR_CLASS_HAS_CHILDREN.intValue()) {
                return VALUE_ENTRY_CIM_ERR_CLASS_HAS_CHILDREN;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_CIM_ERR_CLASS_HAS_INSTANCES.intValue()) {
                return VALUE_ENTRY_CIM_ERR_CLASS_HAS_INSTANCES;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_CIM_ERR_INVALID_SUPERCLASS.intValue()) {
                return VALUE_ENTRY_CIM_ERR_INVALID_SUPERCLASS;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CIM_ERR_ALREADY_EXISTS.intValue()) {
                return VALUE_ENTRY_CIM_ERR_ALREADY_EXISTS;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_CIM_ERR_NO_SUCH_PROPERTY.intValue()) {
                return VALUE_ENTRY_CIM_ERR_NO_SUCH_PROPERTY;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_CIM_ERR_TYPE_MISMATCH.intValue()) {
                return VALUE_ENTRY_CIM_ERR_TYPE_MISMATCH;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED
                    .intValue()) {
                return VALUE_ENTRY_CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_CIM_ERR_INVALID_QUERY.intValue()) {
                return VALUE_ENTRY_CIM_ERR_INVALID_QUERY;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_CIM_ERR_METHOD_NOT_AVAILABLE
                    .intValue()) {
                return VALUE_ENTRY_CIM_ERR_METHOD_NOT_AVAILABLE;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_CIM_ERR_METHOD_NOT_FOUND.intValue()) {
                return VALUE_ENTRY_CIM_ERR_METHOD_NOT_FOUND;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_CIM_ERR_UNEXPECTED_RESPONSE.intValue()) {
                return VALUE_ENTRY_CIM_ERR_UNEXPECTED_RESPONSE;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_CIM_ERR_INVALID_RESPONSE_DESTINATION
                    .intValue()) {
                return VALUE_ENTRY_CIM_ERR_INVALID_RESPONSE_DESTINATION;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_CIM_ERR_NAMESPACE_NOT_EMPTY.intValue()) {
                return VALUE_ENTRY_CIM_ERR_NAMESPACE_NOT_EMPTY;
            }

            if (iValue >= 21) {
                return VALUE_ENTRY_DMTF_Reserved;
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
         * Value Map for the property CIMStatusCode   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_CIM_ERR_FAILED,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIM_ERR_ACCESS_DENIED,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CIM_ERR_INVALID_NAMESPACE,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CIM_ERR_INVALID_PARAMETER,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_CIM_ERR_INVALID_CLASS,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_CIM_ERR_NOT_FOUND,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_CIM_ERR_NOT_SUPPORTED,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_CIM_ERR_CLASS_HAS_CHILDREN,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_CIM_ERR_CLASS_HAS_INSTANCES,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_CIM_ERR_INVALID_SUPERCLASS,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CIM_ERR_ALREADY_EXISTS,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_CIM_ERR_NO_SUCH_PROPERTY,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_CIM_ERR_TYPE_MISMATCH,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_CIM_ERR_INVALID_QUERY,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_CIM_ERR_METHOD_NOT_AVAILABLE,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_CIM_ERR_METHOD_NOT_FOUND,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_CIM_ERR_UNEXPECTED_RESPONSE,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_CIM_ERR_INVALID_RESPONSE_DESTINATION,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_CIM_ERR_NAMESPACE_NOT_EMPTY };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property CIMStatusCode   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_CIM_ERR_FAILED,
                VALUE_ENTRY_CIM_ERR_ACCESS_DENIED, VALUE_ENTRY_CIM_ERR_INVALID_NAMESPACE,
                VALUE_ENTRY_CIM_ERR_INVALID_PARAMETER, VALUE_ENTRY_CIM_ERR_INVALID_CLASS,
                VALUE_ENTRY_CIM_ERR_NOT_FOUND, VALUE_ENTRY_CIM_ERR_NOT_SUPPORTED,
                VALUE_ENTRY_CIM_ERR_CLASS_HAS_CHILDREN, VALUE_ENTRY_CIM_ERR_CLASS_HAS_INSTANCES,
                VALUE_ENTRY_CIM_ERR_INVALID_SUPERCLASS, VALUE_ENTRY_CIM_ERR_ALREADY_EXISTS,
                VALUE_ENTRY_CIM_ERR_NO_SUCH_PROPERTY, VALUE_ENTRY_CIM_ERR_TYPE_MISMATCH,
                VALUE_ENTRY_CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED,
                VALUE_ENTRY_CIM_ERR_INVALID_QUERY, VALUE_ENTRY_CIM_ERR_METHOD_NOT_AVAILABLE,
                VALUE_ENTRY_CIM_ERR_METHOD_NOT_FOUND, VALUE_ENTRY_CIM_ERR_UNEXPECTED_RESPONSE,
                VALUE_ENTRY_CIM_ERR_INVALID_RESPONSE_DESTINATION,
                VALUE_ENTRY_CIM_ERR_NAMESPACE_NOT_EMPTY, VALUE_ENTRY_DMTF_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property CIMStatusCode   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_CIM_ERR_FAILED,
                VALUE_ENTRY_CIM_ERR_ACCESS_DENIED, VALUE_ENTRY_CIM_ERR_INVALID_NAMESPACE,
                VALUE_ENTRY_CIM_ERR_INVALID_PARAMETER, VALUE_ENTRY_CIM_ERR_INVALID_CLASS,
                VALUE_ENTRY_CIM_ERR_NOT_FOUND, VALUE_ENTRY_CIM_ERR_NOT_SUPPORTED,
                VALUE_ENTRY_CIM_ERR_CLASS_HAS_CHILDREN, VALUE_ENTRY_CIM_ERR_CLASS_HAS_INSTANCES,
                VALUE_ENTRY_CIM_ERR_INVALID_SUPERCLASS, VALUE_ENTRY_CIM_ERR_ALREADY_EXISTS,
                VALUE_ENTRY_CIM_ERR_NO_SUCH_PROPERTY, VALUE_ENTRY_CIM_ERR_TYPE_MISMATCH,
                VALUE_ENTRY_CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED,
                VALUE_ENTRY_CIM_ERR_INVALID_QUERY, VALUE_ENTRY_CIM_ERR_METHOD_NOT_AVAILABLE,
                VALUE_ENTRY_CIM_ERR_METHOD_NOT_FOUND, VALUE_ENTRY_CIM_ERR_UNEXPECTED_RESPONSE,
                VALUE_ENTRY_CIM_ERR_INVALID_RESPONSE_DESTINATION,
                VALUE_ENTRY_CIM_ERR_NAMESPACE_NOT_EMPTY };

    }

    /**
     * Constants of property CIMStatusCodeDescription
     * A free-form string containing a human-readable description of CIMStatusCode. This description MAY extend, but MUST be consistent with, the definition of CIMStatusCode.
     */
    public static class PROPERTY_CIMSTATUSCODEDESCRIPTION {
        /**
         * name of the property CIMStatusCodeDescription
         */
        public final static String NAME = "CIMStatusCodeDescription";

    }

    /**
     * Constants of property ErrorSource
     * The identifying information of the entity (i.e., the instance) generating the error. If this entity is modeled in the CIM Schema, this property contains the path of the instance encoded as a string parameter. If not modeled, the property contains some identifying string that names the entity that generated the error. The path or identifying string is formatted per the ErrorSourceFormat property.
     */
    public static class PROPERTY_ERRORSOURCE {
        /**
         * name of the property ErrorSource
         */
        public final static String NAME = "ErrorSource";

    }

    /**
     * Constants of property ErrorSourceFormat
     * The format of the ErrorSource property is interpretable based on the value of this property. Values are defined as: 
     * 0 - Unknown. The format is unknown or not meaningfully interpretable by a CIM client application. 
     * 1 - Other. The format is defined by the value of the OtherErrorSourceFormat property. 
     * 2 - CIMObjectHandle. A CIM Object Handle, encoded using the MOF syntax defined for the objectHandle non-terminal, is used to identify the entity.
     */
    public static class PROPERTY_ERRORSOURCEFORMAT {
        /**
         * name of the property ErrorSourceFormat
         */
        public final static String NAME = "ErrorSourceFormat";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIMObjectHandle = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry CIMObjectHandle (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_CIMObjectHandle = "CIMObjectHandle";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@39d839d8
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_CIMObjectHandle.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIMObjectHandle;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIMObjectHandle.intValue()) {
                return VALUE_ENTRY_CIMObjectHandle;
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
         * Value Map for the property ErrorSourceFormat   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIMObjectHandle };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ErrorSourceFormat   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_CIMObjectHandle };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ErrorSourceFormat   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_CIMObjectHandle };

    }

    /**
     * Constants of property ErrorType
     * Primary classification of the error. The following values are defined: 
     * 2 - Communications Error. Errors of this type are principally associated with the procedures and/or processes required to convey information from one point to another. 
     * 3 - Quality of Service Error. Errors of this type are principally associated with failures that result in reduced functionality or performance. 
     * 4 - Software Error. Error of this type are principally associated with a software or processing fault. 
     * 5 - Hardware Error. Errors of this type are principally associated with an equipment or hardware failure. 
     * 6 - Environmental Error. Errors of this type are principally associated with a failure condition relating the to facility, or other environmental considerations. 
     * 7 - Security Error. Errors of this type are associated with security violations, detection of viruses, and similar issues. 
     * 8 - Oversubscription Error. Errors of this type are principally associated with the failure to allocate sufficient resources to complete the operation. 
     * 9 - Unavailable Resource Error. Errors of this type are principally associated with the failure to access a required resource. 
     * 10 -Unsupported Operation Error. Errors of this type are principally associated with requests that are not supported.
     */
    public static class PROPERTY_ERRORTYPE {
        /**
         * name of the property ErrorType
         */
        public final static String NAME = "ErrorType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Communications_Error = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Communications Error (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Communications_Error = "Communications Error";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Quality_of_Service_Error = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Quality of Service Error (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Quality_of_Service_Error = "Quality of Service Error";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Software_Error = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Software Error (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Software_Error = "Software Error";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Hardware_Error = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Hardware Error (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Hardware_Error = "Hardware Error";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Environmental_Error = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Environmental Error (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Environmental_Error = "Environmental Error";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Security_Error = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Security Error (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Security_Error = "Security Error";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Oversubscription_Error = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Oversubscription Error (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Oversubscription_Error = "Oversubscription Error";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Unavailable_Resource_Error = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Unavailable Resource Error (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Unavailable_Resource_Error = "Unavailable Resource Error";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Unsupported_Operation_Error = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Unsupported Operation Error (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Unsupported_Operation_Error = "Unsupported Operation Error";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@66186618
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Communications_Error.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Communications_Error;
            }

            if (VALUE_ENTRY_Quality_of_Service_Error.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Quality_of_Service_Error;
            }

            if (VALUE_ENTRY_Software_Error.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Software_Error;
            }

            if (VALUE_ENTRY_Hardware_Error.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Hardware_Error;
            }

            if (VALUE_ENTRY_Environmental_Error.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Environmental_Error;
            }

            if (VALUE_ENTRY_Security_Error.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Security_Error;
            }

            if (VALUE_ENTRY_Oversubscription_Error.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Oversubscription_Error;
            }

            if (VALUE_ENTRY_Unavailable_Resource_Error.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Unavailable_Resource_Error;
            }

            if (VALUE_ENTRY_Unsupported_Operation_Error.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Unsupported_Operation_Error;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Communications_Error.intValue()) {
                return VALUE_ENTRY_Communications_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Quality_of_Service_Error.intValue()) {
                return VALUE_ENTRY_Quality_of_Service_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Software_Error.intValue()) {
                return VALUE_ENTRY_Software_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Hardware_Error.intValue()) {
                return VALUE_ENTRY_Hardware_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Environmental_Error.intValue()) {
                return VALUE_ENTRY_Environmental_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Security_Error.intValue()) {
                return VALUE_ENTRY_Security_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Oversubscription_Error.intValue()) {
                return VALUE_ENTRY_Oversubscription_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Unavailable_Resource_Error.intValue()) {
                return VALUE_ENTRY_Unavailable_Resource_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Unsupported_Operation_Error.intValue()) {
                return VALUE_ENTRY_Unsupported_Operation_Error;
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
         * Value Map for the property ErrorType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Communications_Error,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Quality_of_Service_Error,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Software_Error,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Hardware_Error,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Environmental_Error,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Security_Error,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Oversubscription_Error,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Unavailable_Resource_Error,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Unsupported_Operation_Error };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ErrorType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Communications_Error, VALUE_ENTRY_Quality_of_Service_Error,
                VALUE_ENTRY_Software_Error, VALUE_ENTRY_Hardware_Error,
                VALUE_ENTRY_Environmental_Error, VALUE_ENTRY_Security_Error,
                VALUE_ENTRY_Oversubscription_Error, VALUE_ENTRY_Unavailable_Resource_Error,
                VALUE_ENTRY_Unsupported_Operation_Error };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ErrorType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Communications_Error,
                VALUE_ENTRY_Quality_of_Service_Error, VALUE_ENTRY_Software_Error,
                VALUE_ENTRY_Hardware_Error, VALUE_ENTRY_Environmental_Error,
                VALUE_ENTRY_Security_Error, VALUE_ENTRY_Oversubscription_Error,
                VALUE_ENTRY_Unavailable_Resource_Error, VALUE_ENTRY_Unsupported_Operation_Error };

    }

    /**
     * Constants of property Message
     * The formatted message. This message is constructed by combining some or all of the dynamic elements specified in the MessageArguments property with the static elements uniquely identified by the MessageID in a message registry or other catalog associated with the OwningEntity.
     */
    public static class PROPERTY_MESSAGE {
        /**
         * name of the property Message
         */
        public final static String NAME = "Message";

    }

    /**
     * Constants of property MessageArguments
     * An array containing the dynamic content of the message.
     */
    public static class PROPERTY_MESSAGEARGUMENTS {
        /**
         * name of the property MessageArguments
         */
        public final static String NAME = "MessageArguments";

    }

    /**
     * Constants of property MessageID
     * An opaque string that uniquely identifies, within the scope of the OwningEntity, the format of the Message.
     */
    public static class PROPERTY_MESSAGEID {
        /**
         * name of the property MessageID
         */
        public final static String NAME = "MessageID";

    }

    /**
     * Constants of property OtherErrorSourceFormat
     * A string defining "Other" values for ErrorSourceFormat. This value MUST be set to a non NULL value when ErrorSourceFormat is set to a value of 1 ("Other"). For all other values of ErrorSourceFormat, the value of this string must be set to NULL.
     */
    public static class PROPERTY_OTHERERRORSOURCEFORMAT {
        /**
         * name of the property OtherErrorSourceFormat
         */
        public final static String NAME = "OtherErrorSourceFormat";

    }

    /**
     * Constants of property OtherErrorType
     * A free-form string describing the ErrorType when 1, "Other", is specified as the ErrorType.
     */
    public static class PROPERTY_OTHERERRORTYPE {
        /**
         * name of the property OtherErrorType
         */
        public final static String NAME = "OtherErrorType";

    }

    /**
     * Constants of property OwningEntity
     * A string that uniquely identifies the entity that owns the definition of the format of the Message described in this instance. OwningEntity MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity or standards body defining the format.
     */
    public static class PROPERTY_OWNINGENTITY {
        /**
         * name of the property OwningEntity
         */
        public final static String NAME = "OwningEntity";

    }

    /**
     * Constants of property PerceivedSeverity
     * An enumerated value that describes the severity of the Indication from the notifier's point of view: 
     * 1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
     * 3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
     * 4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
     * 5 - Major should be used to indicate action is needed NOW. 
     * 6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
     * 7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
     * 2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the Error is purely informational or its severity is simply unknown.
     */
    public static class PROPERTY_PERCEIVEDSEVERITY {
        /**
         * name of the property PerceivedSeverity
         */
        public final static String NAME = "PerceivedSeverity";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Information = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Information (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Information = "Information";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Degraded_Warning = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Degraded/Warning (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Degraded_Warning = "Degraded/Warning";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Minor = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Minor (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Minor = "Minor";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Major = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Major (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Major = "Major";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Critical = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Critical (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Critical = "Critical";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Fatal_NonRecoverable = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Fatal/NonRecoverable (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Fatal_NonRecoverable = "Fatal/NonRecoverable";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@50aa50aa
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Information.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Information;
            }

            if (VALUE_ENTRY_Degraded_Warning.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Degraded_Warning;
            }

            if (VALUE_ENTRY_Minor.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Minor;
            }

            if (VALUE_ENTRY_Major.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Major;
            }

            if (VALUE_ENTRY_Critical.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Critical;
            }

            if (VALUE_ENTRY_Fatal_NonRecoverable.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Fatal_NonRecoverable;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Information.intValue()) {
                return VALUE_ENTRY_Information;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Degraded_Warning.intValue()) {
                return VALUE_ENTRY_Degraded_Warning;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Minor.intValue()) {
                return VALUE_ENTRY_Minor;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Major.intValue()) {
                return VALUE_ENTRY_Major;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Critical.intValue()) {
                return VALUE_ENTRY_Critical;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Fatal_NonRecoverable.intValue()) {
                return VALUE_ENTRY_Fatal_NonRecoverable;
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
         * Value Map for the property PerceivedSeverity   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Information,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Degraded_Warning,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Minor, VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Major,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Critical,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Fatal_NonRecoverable };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property PerceivedSeverity   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Information, VALUE_ENTRY_Degraded_Warning, VALUE_ENTRY_Minor,
                VALUE_ENTRY_Major, VALUE_ENTRY_Critical, VALUE_ENTRY_Fatal_NonRecoverable };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property PerceivedSeverity   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Information, VALUE_ENTRY_Degraded_Warning,
                VALUE_ENTRY_Minor, VALUE_ENTRY_Major, VALUE_ENTRY_Critical,
                VALUE_ENTRY_Fatal_NonRecoverable };

    }

    /**
     * Constants of property ProbableCause
     * An enumerated value that describes the probable cause of the error.
     */
    public static class PROPERTY_PROBABLECAUSE {
        /**
         * name of the property ProbableCause
         */
        public final static String NAME = "ProbableCause";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Adapter_Card_Error = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Adapter/Card Error (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Adapter_Card_Error = "Adapter/Card Error";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Application_Subsystem_Failure = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Application Subsystem Failure (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Application_Subsystem_Failure = "Application Subsystem Failure";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Bandwidth_Reduced = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Bandwidth Reduced (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Bandwidth_Reduced = "Bandwidth Reduced";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Connection_Establishment_Error = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Connection Establishment Error (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Connection_Establishment_Error = "Connection Establishment Error";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Communications_Protocol_Error = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Communications Protocol Error (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Communications_Protocol_Error = "Communications Protocol Error";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Communications_Subsystem_Failure = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Communications Subsystem Failure (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Communications_Subsystem_Failure = "Communications Subsystem Failure";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Configuration_Customization_Error = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Configuration/Customization Error (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Configuration_Customization_Error = "Configuration/Customization Error";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Congestion = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Congestion (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Congestion = "Congestion";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Corrupt_Data = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Corrupt Data (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Corrupt_Data = "Corrupt Data";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CPU_Cycles_Limit_Exceeded = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry CPU Cycles Limit Exceeded (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_CPU_Cycles_Limit_Exceeded = "CPU Cycles Limit Exceeded";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Dataset_Modem_Error = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Dataset/Modem Error (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Dataset_Modem_Error = "Dataset/Modem Error";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Degraded_Signal = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry Degraded Signal (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_Degraded_Signal = "Degraded Signal";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_DTE_DCE_Interface_Error = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry DTE-DCE Interface Error (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_DTE_DCE_Interface_Error = "DTE-DCE Interface Error";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Enclosure_Door_Open = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry Enclosure Door Open (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_Enclosure_Door_Open = "Enclosure Door Open";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Equipment_Malfunction = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry Equipment Malfunction (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_Equipment_Malfunction = "Equipment Malfunction";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Excessive_Vibration = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry Excessive Vibration (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_Excessive_Vibration = "Excessive Vibration";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_File_Format_Error = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry File Format Error (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_File_Format_Error = "File Format Error";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Fire_Detected = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry Fire Detected (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_Fire_Detected = "Fire Detected";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Flood_Detected = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry Flood Detected (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_Flood_Detected = "Flood Detected";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Framing_Error = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry Framing Error (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_Framing_Error = "Framing Error";

        /**
         * constant for value map entry 22
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_HVAC_Problem = new javax.cim.UnsignedInteger16(
                "22");

        /**
         * constant for value entry HVAC Problem (corresponds to mapEntry 22 )
         */
        public final static String VALUE_ENTRY_HVAC_Problem = "HVAC Problem";

        /**
         * constant for value map entry 23
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_Humidity_Unacceptable = new javax.cim.UnsignedInteger16(
                "23");

        /**
         * constant for value entry Humidity Unacceptable (corresponds to mapEntry 23 )
         */
        public final static String VALUE_ENTRY_Humidity_Unacceptable = "Humidity Unacceptable";

        /**
         * constant for value map entry 24
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_I_O_Device_Error = new javax.cim.UnsignedInteger16(
                "24");

        /**
         * constant for value entry I/O Device Error (corresponds to mapEntry 24 )
         */
        public final static String VALUE_ENTRY_I_O_Device_Error = "I/O Device Error";

        /**
         * constant for value map entry 25
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_Input_Device_Error = new javax.cim.UnsignedInteger16(
                "25");

        /**
         * constant for value entry Input Device Error (corresponds to mapEntry 25 )
         */
        public final static String VALUE_ENTRY_Input_Device_Error = "Input Device Error";

        /**
         * constant for value map entry 26
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_LAN_Error = new javax.cim.UnsignedInteger16(
                "26");

        /**
         * constant for value entry LAN Error (corresponds to mapEntry 26 )
         */
        public final static String VALUE_ENTRY_LAN_Error = "LAN Error";

        /**
         * constant for value map entry 27
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Non_Toxic_Leak_Detected = new javax.cim.UnsignedInteger16(
                "27");

        /**
         * constant for value entry Non-Toxic Leak Detected (corresponds to mapEntry 27 )
         */
        public final static String VALUE_ENTRY_Non_Toxic_Leak_Detected = "Non-Toxic Leak Detected";

        /**
         * constant for value map entry 28
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Local_Node_Transmission_Error = new javax.cim.UnsignedInteger16(
                "28");

        /**
         * constant for value entry Local Node Transmission Error (corresponds to mapEntry 28 )
         */
        public final static String VALUE_ENTRY_Local_Node_Transmission_Error = "Local Node Transmission Error";

        /**
         * constant for value map entry 29
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Loss_of_Frame = new javax.cim.UnsignedInteger16(
                "29");

        /**
         * constant for value entry Loss of Frame (corresponds to mapEntry 29 )
         */
        public final static String VALUE_ENTRY_Loss_of_Frame = "Loss of Frame";

        /**
         * constant for value map entry 30
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Loss_of_Signal = new javax.cim.UnsignedInteger16(
                "30");

        /**
         * constant for value entry Loss of Signal (corresponds to mapEntry 30 )
         */
        public final static String VALUE_ENTRY_Loss_of_Signal = "Loss of Signal";

        /**
         * constant for value map entry 31
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_Material_Supply_Exhausted = new javax.cim.UnsignedInteger16(
                "31");

        /**
         * constant for value entry Material Supply Exhausted (corresponds to mapEntry 31 )
         */
        public final static String VALUE_ENTRY_Material_Supply_Exhausted = "Material Supply Exhausted";

        /**
         * constant for value map entry 32
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Multiplexer_Problem = new javax.cim.UnsignedInteger16(
                "32");

        /**
         * constant for value entry Multiplexer Problem (corresponds to mapEntry 32 )
         */
        public final static String VALUE_ENTRY_Multiplexer_Problem = "Multiplexer Problem";

        /**
         * constant for value map entry 33
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_Out_of_Memory = new javax.cim.UnsignedInteger16(
                "33");

        /**
         * constant for value entry Out of Memory (corresponds to mapEntry 33 )
         */
        public final static String VALUE_ENTRY_Out_of_Memory = "Out of Memory";

        /**
         * constant for value map entry 34
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_Output_Device_Error = new javax.cim.UnsignedInteger16(
                "34");

        /**
         * constant for value entry Output Device Error (corresponds to mapEntry 34 )
         */
        public final static String VALUE_ENTRY_Output_Device_Error = "Output Device Error";

        /**
         * constant for value map entry 35
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_Performance_Degraded = new javax.cim.UnsignedInteger16(
                "35");

        /**
         * constant for value entry Performance Degraded (corresponds to mapEntry 35 )
         */
        public final static String VALUE_ENTRY_Performance_Degraded = "Performance Degraded";

        /**
         * constant for value map entry 36
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_Power_Problem = new javax.cim.UnsignedInteger16(
                "36");

        /**
         * constant for value entry Power Problem (corresponds to mapEntry 36 )
         */
        public final static String VALUE_ENTRY_Power_Problem = "Power Problem";

        /**
         * constant for value map entry 37
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Pressure_Unacceptable = new javax.cim.UnsignedInteger16(
                "37");

        /**
         * constant for value entry Pressure Unacceptable (corresponds to mapEntry 37 )
         */
        public final static String VALUE_ENTRY_Pressure_Unacceptable = "Pressure Unacceptable";

        /**
         * constant for value map entry 38
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_ = new javax.cim.UnsignedInteger16(
                "38");

        /**
         * constant for value entry Processor Problem (Internal Machine Error) (corresponds to mapEntry 38 )
         */
        public final static String VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_ = "Processor Problem (Internal Machine Error)";

        /**
         * constant for value map entry 39
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_Pump_Failure = new javax.cim.UnsignedInteger16(
                "39");

        /**
         * constant for value entry Pump Failure (corresponds to mapEntry 39 )
         */
        public final static String VALUE_ENTRY_Pump_Failure = "Pump Failure";

        /**
         * constant for value map entry 40
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_Queue_Size_Exceeded = new javax.cim.UnsignedInteger16(
                "40");

        /**
         * constant for value entry Queue Size Exceeded (corresponds to mapEntry 40 )
         */
        public final static String VALUE_ENTRY_Queue_Size_Exceeded = "Queue Size Exceeded";

        /**
         * constant for value map entry 41
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_Receive_Failure = new javax.cim.UnsignedInteger16(
                "41");

        /**
         * constant for value entry Receive Failure (corresponds to mapEntry 41 )
         */
        public final static String VALUE_ENTRY_Receive_Failure = "Receive Failure";

        /**
         * constant for value map entry 42
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_Receiver_Failure = new javax.cim.UnsignedInteger16(
                "42");

        /**
         * constant for value entry Receiver Failure (corresponds to mapEntry 42 )
         */
        public final static String VALUE_ENTRY_Receiver_Failure = "Receiver Failure";

        /**
         * constant for value map entry 43
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_Remote_Node_Transmission_Error = new javax.cim.UnsignedInteger16(
                "43");

        /**
         * constant for value entry Remote Node Transmission Error (corresponds to mapEntry 43 )
         */
        public final static String VALUE_ENTRY_Remote_Node_Transmission_Error = "Remote Node Transmission Error";

        /**
         * constant for value map entry 44
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_Resource_at_or_Nearing_Capacity = new javax.cim.UnsignedInteger16(
                "44");

        /**
         * constant for value entry Resource at or Nearing Capacity (corresponds to mapEntry 44 )
         */
        public final static String VALUE_ENTRY_Resource_at_or_Nearing_Capacity = "Resource at or Nearing Capacity";

        /**
         * constant for value map entry 45
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_Response_Time_Excessive = new javax.cim.UnsignedInteger16(
                "45");

        /**
         * constant for value entry Response Time Excessive (corresponds to mapEntry 45 )
         */
        public final static String VALUE_ENTRY_Response_Time_Excessive = "Response Time Excessive";

        /**
         * constant for value map entry 46
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_Retransmission_Rate_Excessive = new javax.cim.UnsignedInteger16(
                "46");

        /**
         * constant for value entry Retransmission Rate Excessive (corresponds to mapEntry 46 )
         */
        public final static String VALUE_ENTRY_Retransmission_Rate_Excessive = "Retransmission Rate Excessive";

        /**
         * constant for value map entry 47
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Software_Error = new javax.cim.UnsignedInteger16(
                "47");

        /**
         * constant for value entry Software Error (corresponds to mapEntry 47 )
         */
        public final static String VALUE_ENTRY_Software_Error = "Software Error";

        /**
         * constant for value map entry 48
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Software_Program_Abnormally_Terminated = new javax.cim.UnsignedInteger16(
                "48");

        /**
         * constant for value entry Software Program Abnormally Terminated (corresponds to mapEntry 48 )
         */
        public final static String VALUE_ENTRY_Software_Program_Abnormally_Terminated = "Software Program Abnormally Terminated";

        /**
         * constant for value map entry 49
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Software_Program_Error__Incorrect_Results_ = new javax.cim.UnsignedInteger16(
                "49");

        /**
         * constant for value entry Software Program Error (Incorrect Results) (corresponds to mapEntry 49 )
         */
        public final static String VALUE_ENTRY_Software_Program_Error__Incorrect_Results_ = "Software Program Error (Incorrect Results)";

        /**
         * constant for value map entry 50
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_Storage_Capacity_Problem = new javax.cim.UnsignedInteger16(
                "50");

        /**
         * constant for value entry Storage Capacity Problem (corresponds to mapEntry 50 )
         */
        public final static String VALUE_ENTRY_Storage_Capacity_Problem = "Storage Capacity Problem";

        /**
         * constant for value map entry 51
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_Temperature_Unacceptable = new javax.cim.UnsignedInteger16(
                "51");

        /**
         * constant for value entry Temperature Unacceptable (corresponds to mapEntry 51 )
         */
        public final static String VALUE_ENTRY_Temperature_Unacceptable = "Temperature Unacceptable";

        /**
         * constant for value map entry 52
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Threshold_Crossed = new javax.cim.UnsignedInteger16(
                "52");

        /**
         * constant for value entry Threshold Crossed (corresponds to mapEntry 52 )
         */
        public final static String VALUE_ENTRY_Threshold_Crossed = "Threshold Crossed";

        /**
         * constant for value map entry 53
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Timing_Problem = new javax.cim.UnsignedInteger16(
                "53");

        /**
         * constant for value entry Timing Problem (corresponds to mapEntry 53 )
         */
        public final static String VALUE_ENTRY_Timing_Problem = "Timing Problem";

        /**
         * constant for value map entry 54
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_Toxic_Leak_Detected = new javax.cim.UnsignedInteger16(
                "54");

        /**
         * constant for value entry Toxic Leak Detected (corresponds to mapEntry 54 )
         */
        public final static String VALUE_ENTRY_Toxic_Leak_Detected = "Toxic Leak Detected";

        /**
         * constant for value map entry 55
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_Transmit_Failure = new javax.cim.UnsignedInteger16(
                "55");

        /**
         * constant for value entry Transmit Failure (corresponds to mapEntry 55 )
         */
        public final static String VALUE_ENTRY_Transmit_Failure = "Transmit Failure";

        /**
         * constant for value map entry 56
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_Transmitter_Failure = new javax.cim.UnsignedInteger16(
                "56");

        /**
         * constant for value entry Transmitter Failure (corresponds to mapEntry 56 )
         */
        public final static String VALUE_ENTRY_Transmitter_Failure = "Transmitter Failure";

        /**
         * constant for value map entry 57
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_Underlying_Resource_Unavailable = new javax.cim.UnsignedInteger16(
                "57");

        /**
         * constant for value entry Underlying Resource Unavailable (corresponds to mapEntry 57 )
         */
        public final static String VALUE_ENTRY_Underlying_Resource_Unavailable = "Underlying Resource Unavailable";

        /**
         * constant for value map entry 58
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Version_Mismatch = new javax.cim.UnsignedInteger16(
                "58");

        /**
         * constant for value entry Version Mismatch (corresponds to mapEntry 58 )
         */
        public final static String VALUE_ENTRY_Version_Mismatch = "Version Mismatch";

        /**
         * constant for value map entry 59
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_Previous_Alert_Cleared = new javax.cim.UnsignedInteger16(
                "59");

        /**
         * constant for value entry Previous Alert Cleared (corresponds to mapEntry 59 )
         */
        public final static String VALUE_ENTRY_Previous_Alert_Cleared = "Previous Alert Cleared";

        /**
         * constant for value map entry 60
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_Login_Attempts_Failed = new javax.cim.UnsignedInteger16(
                "60");

        /**
         * constant for value entry Login Attempts Failed (corresponds to mapEntry 60 )
         */
        public final static String VALUE_ENTRY_Login_Attempts_Failed = "Login Attempts Failed";

        /**
         * constant for value map entry 61
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_Software_Virus_Detected = new javax.cim.UnsignedInteger16(
                "61");

        /**
         * constant for value entry Software Virus Detected (corresponds to mapEntry 61 )
         */
        public final static String VALUE_ENTRY_Software_Virus_Detected = "Software Virus Detected";

        /**
         * constant for value map entry 62
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_Hardware_Security_Breached = new javax.cim.UnsignedInteger16(
                "62");

        /**
         * constant for value entry Hardware Security Breached (corresponds to mapEntry 62 )
         */
        public final static String VALUE_ENTRY_Hardware_Security_Breached = "Hardware Security Breached";

        /**
         * constant for value map entry 63
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Denial_of_Service_Detected = new javax.cim.UnsignedInteger16(
                "63");

        /**
         * constant for value entry Denial of Service Detected (corresponds to mapEntry 63 )
         */
        public final static String VALUE_ENTRY_Denial_of_Service_Detected = "Denial of Service Detected";

        /**
         * constant for value map entry 64
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Security_Credential_Mismatch = new javax.cim.UnsignedInteger16(
                "64");

        /**
         * constant for value entry Security Credential Mismatch (corresponds to mapEntry 64 )
         */
        public final static String VALUE_ENTRY_Security_Credential_Mismatch = "Security Credential Mismatch";

        /**
         * constant for value map entry 65
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_Unauthorized_Access = new javax.cim.UnsignedInteger16(
                "65");

        /**
         * constant for value entry Unauthorized Access (corresponds to mapEntry 65 )
         */
        public final static String VALUE_ENTRY_Unauthorized_Access = "Unauthorized Access";

        /**
         * constant for value map entry 66
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Alarm_Received = new javax.cim.UnsignedInteger16(
                "66");

        /**
         * constant for value entry Alarm Received (corresponds to mapEntry 66 )
         */
        public final static String VALUE_ENTRY_Alarm_Received = "Alarm Received";

        /**
         * constant for value map entry 67
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Loss_of_Pointer = new javax.cim.UnsignedInteger16(
                "67");

        /**
         * constant for value entry Loss of Pointer (corresponds to mapEntry 67 )
         */
        public final static String VALUE_ENTRY_Loss_of_Pointer = "Loss of Pointer";

        /**
         * constant for value map entry 68
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_Payload_Mismatch = new javax.cim.UnsignedInteger16(
                "68");

        /**
         * constant for value entry Payload Mismatch (corresponds to mapEntry 68 )
         */
        public final static String VALUE_ENTRY_Payload_Mismatch = "Payload Mismatch";

        /**
         * constant for value map entry 69
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Transmission_Error = new javax.cim.UnsignedInteger16(
                "69");

        /**
         * constant for value entry Transmission Error (corresponds to mapEntry 69 )
         */
        public final static String VALUE_ENTRY_Transmission_Error = "Transmission Error";

        /**
         * constant for value map entry 70
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Excessive_Error_Rate = new javax.cim.UnsignedInteger16(
                "70");

        /**
         * constant for value entry Excessive Error Rate (corresponds to mapEntry 70 )
         */
        public final static String VALUE_ENTRY_Excessive_Error_Rate = "Excessive Error Rate";

        /**
         * constant for value map entry 71
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_Trace_Problem = new javax.cim.UnsignedInteger16(
                "71");

        /**
         * constant for value entry Trace Problem (corresponds to mapEntry 71 )
         */
        public final static String VALUE_ENTRY_Trace_Problem = "Trace Problem";

        /**
         * constant for value map entry 72
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_Element_Unavailable = new javax.cim.UnsignedInteger16(
                "72");

        /**
         * constant for value entry Element Unavailable (corresponds to mapEntry 72 )
         */
        public final static String VALUE_ENTRY_Element_Unavailable = "Element Unavailable";

        /**
         * constant for value map entry 73
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_Element_Missing = new javax.cim.UnsignedInteger16(
                "73");

        /**
         * constant for value entry Element Missing (corresponds to mapEntry 73 )
         */
        public final static String VALUE_ENTRY_Element_Missing = "Element Missing";

        /**
         * constant for value map entry 74
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_Loss_of_Multi_Frame = new javax.cim.UnsignedInteger16(
                "74");

        /**
         * constant for value entry Loss of Multi Frame (corresponds to mapEntry 74 )
         */
        public final static String VALUE_ENTRY_Loss_of_Multi_Frame = "Loss of Multi Frame";

        /**
         * constant for value map entry 75
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_Broadcast_Channel_Failure = new javax.cim.UnsignedInteger16(
                "75");

        /**
         * constant for value entry Broadcast Channel Failure (corresponds to mapEntry 75 )
         */
        public final static String VALUE_ENTRY_Broadcast_Channel_Failure = "Broadcast Channel Failure";

        /**
         * constant for value map entry 76
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_Invalid_Message_Received = new javax.cim.UnsignedInteger16(
                "76");

        /**
         * constant for value entry Invalid Message Received (corresponds to mapEntry 76 )
         */
        public final static String VALUE_ENTRY_Invalid_Message_Received = "Invalid Message Received";

        /**
         * constant for value map entry 77
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Routing_Failure = new javax.cim.UnsignedInteger16(
                "77");

        /**
         * constant for value entry Routing Failure (corresponds to mapEntry 77 )
         */
        public final static String VALUE_ENTRY_Routing_Failure = "Routing Failure";

        /**
         * constant for value map entry 78
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_Backplane_Failure = new javax.cim.UnsignedInteger16(
                "78");

        /**
         * constant for value entry Backplane Failure (corresponds to mapEntry 78 )
         */
        public final static String VALUE_ENTRY_Backplane_Failure = "Backplane Failure";

        /**
         * constant for value map entry 79
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Identifier_Duplication = new javax.cim.UnsignedInteger16(
                "79");

        /**
         * constant for value entry Identifier Duplication (corresponds to mapEntry 79 )
         */
        public final static String VALUE_ENTRY_Identifier_Duplication = "Identifier Duplication";

        /**
         * constant for value map entry 80
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_Protection_Path_Failure = new javax.cim.UnsignedInteger16(
                "80");

        /**
         * constant for value entry Protection Path Failure (corresponds to mapEntry 80 )
         */
        public final static String VALUE_ENTRY_Protection_Path_Failure = "Protection Path Failure";

        /**
         * constant for value map entry 81
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_Sync_Loss_or_Mismatch = new javax.cim.UnsignedInteger16(
                "81");

        /**
         * constant for value entry Sync Loss or Mismatch (corresponds to mapEntry 81 )
         */
        public final static String VALUE_ENTRY_Sync_Loss_or_Mismatch = "Sync Loss or Mismatch";

        /**
         * constant for value map entry 82
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_Terminal_Problem = new javax.cim.UnsignedInteger16(
                "82");

        /**
         * constant for value entry Terminal Problem (corresponds to mapEntry 82 )
         */
        public final static String VALUE_ENTRY_Terminal_Problem = "Terminal Problem";

        /**
         * constant for value map entry 83
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_Real_Time_Clock_Failure = new javax.cim.UnsignedInteger16(
                "83");

        /**
         * constant for value entry Real Time Clock Failure (corresponds to mapEntry 83 )
         */
        public final static String VALUE_ENTRY_Real_Time_Clock_Failure = "Real Time Clock Failure";

        /**
         * constant for value map entry 84
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_Antenna_Failure = new javax.cim.UnsignedInteger16(
                "84");

        /**
         * constant for value entry Antenna Failure (corresponds to mapEntry 84 )
         */
        public final static String VALUE_ENTRY_Antenna_Failure = "Antenna Failure";

        /**
         * constant for value map entry 85
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_Battery_Charging_Failure = new javax.cim.UnsignedInteger16(
                "85");

        /**
         * constant for value entry Battery Charging Failure (corresponds to mapEntry 85 )
         */
        public final static String VALUE_ENTRY_Battery_Charging_Failure = "Battery Charging Failure";

        /**
         * constant for value map entry 86
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_Disk_Failure = new javax.cim.UnsignedInteger16(
                "86");

        /**
         * constant for value entry Disk Failure (corresponds to mapEntry 86 )
         */
        public final static String VALUE_ENTRY_Disk_Failure = "Disk Failure";

        /**
         * constant for value map entry 87
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_Frequency_Hopping_Failure = new javax.cim.UnsignedInteger16(
                "87");

        /**
         * constant for value entry Frequency Hopping Failure (corresponds to mapEntry 87 )
         */
        public final static String VALUE_ENTRY_Frequency_Hopping_Failure = "Frequency Hopping Failure";

        /**
         * constant for value map entry 88
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_Loss_of_Redundancy = new javax.cim.UnsignedInteger16(
                "88");

        /**
         * constant for value entry Loss of Redundancy (corresponds to mapEntry 88 )
         */
        public final static String VALUE_ENTRY_Loss_of_Redundancy = "Loss of Redundancy";

        /**
         * constant for value map entry 89
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_Power_Supply_Failure = new javax.cim.UnsignedInteger16(
                "89");

        /**
         * constant for value entry Power Supply Failure (corresponds to mapEntry 89 )
         */
        public final static String VALUE_ENTRY_Power_Supply_Failure = "Power Supply Failure";

        /**
         * constant for value map entry 90
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_Signal_Quality_Problem = new javax.cim.UnsignedInteger16(
                "90");

        /**
         * constant for value entry Signal Quality Problem (corresponds to mapEntry 90 )
         */
        public final static String VALUE_ENTRY_Signal_Quality_Problem = "Signal Quality Problem";

        /**
         * constant for value map entry 91
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_Battery_Discharging = new javax.cim.UnsignedInteger16(
                "91");

        /**
         * constant for value entry Battery Discharging (corresponds to mapEntry 91 )
         */
        public final static String VALUE_ENTRY_Battery_Discharging = "Battery Discharging";

        /**
         * constant for value map entry 92
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_Battery_Failure = new javax.cim.UnsignedInteger16(
                "92");

        /**
         * constant for value entry Battery Failure (corresponds to mapEntry 92 )
         */
        public final static String VALUE_ENTRY_Battery_Failure = "Battery Failure";

        /**
         * constant for value map entry 93
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_Commercial_Power_Problem = new javax.cim.UnsignedInteger16(
                "93");

        /**
         * constant for value entry Commercial Power Problem (corresponds to mapEntry 93 )
         */
        public final static String VALUE_ENTRY_Commercial_Power_Problem = "Commercial Power Problem";

        /**
         * constant for value map entry 94
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_Fan_Failure = new javax.cim.UnsignedInteger16(
                "94");

        /**
         * constant for value entry Fan Failure (corresponds to mapEntry 94 )
         */
        public final static String VALUE_ENTRY_Fan_Failure = "Fan Failure";

        /**
         * constant for value map entry 95
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_Engine_Failure = new javax.cim.UnsignedInteger16(
                "95");

        /**
         * constant for value entry Engine Failure (corresponds to mapEntry 95 )
         */
        public final static String VALUE_ENTRY_Engine_Failure = "Engine Failure";

        /**
         * constant for value map entry 96
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_Sensor_Failure = new javax.cim.UnsignedInteger16(
                "96");

        /**
         * constant for value entry Sensor Failure (corresponds to mapEntry 96 )
         */
        public final static String VALUE_ENTRY_Sensor_Failure = "Sensor Failure";

        /**
         * constant for value map entry 97
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_Fuse_Failure = new javax.cim.UnsignedInteger16(
                "97");

        /**
         * constant for value entry Fuse Failure (corresponds to mapEntry 97 )
         */
        public final static String VALUE_ENTRY_Fuse_Failure = "Fuse Failure";

        /**
         * constant for value map entry 98
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_Generator_Failure = new javax.cim.UnsignedInteger16(
                "98");

        /**
         * constant for value entry Generator Failure (corresponds to mapEntry 98 )
         */
        public final static String VALUE_ENTRY_Generator_Failure = "Generator Failure";

        /**
         * constant for value map entry 99
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Low_Battery = new javax.cim.UnsignedInteger16(
                "99");

        /**
         * constant for value entry Low Battery (corresponds to mapEntry 99 )
         */
        public final static String VALUE_ENTRY_Low_Battery = "Low Battery";

        /**
         * constant for value map entry 100
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Low_Fuel = new javax.cim.UnsignedInteger16(
                "100");

        /**
         * constant for value entry Low Fuel (corresponds to mapEntry 100 )
         */
        public final static String VALUE_ENTRY_Low_Fuel = "Low Fuel";

        /**
         * constant for value map entry 101
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Low_Water = new javax.cim.UnsignedInteger16(
                "101");

        /**
         * constant for value entry Low Water (corresponds to mapEntry 101 )
         */
        public final static String VALUE_ENTRY_Low_Water = "Low Water";

        /**
         * constant for value map entry 102
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Explosive_Gas = new javax.cim.UnsignedInteger16(
                "102");

        /**
         * constant for value entry Explosive Gas (corresponds to mapEntry 102 )
         */
        public final static String VALUE_ENTRY_Explosive_Gas = "Explosive Gas";

        /**
         * constant for value map entry 103
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_High_Winds = new javax.cim.UnsignedInteger16(
                "103");

        /**
         * constant for value entry High Winds (corresponds to mapEntry 103 )
         */
        public final static String VALUE_ENTRY_High_Winds = "High Winds";

        /**
         * constant for value map entry 104
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Ice_Buildup = new javax.cim.UnsignedInteger16(
                "104");

        /**
         * constant for value entry Ice Buildup (corresponds to mapEntry 104 )
         */
        public final static String VALUE_ENTRY_Ice_Buildup = "Ice Buildup";

        /**
         * constant for value map entry 105
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_Smoke = new javax.cim.UnsignedInteger16(
                "105");

        /**
         * constant for value entry Smoke (corresponds to mapEntry 105 )
         */
        public final static String VALUE_ENTRY_Smoke = "Smoke";

        /**
         * constant for value map entry 106
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_Memory_Mismatch = new javax.cim.UnsignedInteger16(
                "106");

        /**
         * constant for value entry Memory Mismatch (corresponds to mapEntry 106 )
         */
        public final static String VALUE_ENTRY_Memory_Mismatch = "Memory Mismatch";

        /**
         * constant for value map entry 107
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_107_FOR_VALUE_ENTRY_Out_of_CPU_Cycles = new javax.cim.UnsignedInteger16(
                "107");

        /**
         * constant for value entry Out of CPU Cycles (corresponds to mapEntry 107 )
         */
        public final static String VALUE_ENTRY_Out_of_CPU_Cycles = "Out of CPU Cycles";

        /**
         * constant for value map entry 108
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_108_FOR_VALUE_ENTRY_Software_Environment_Problem = new javax.cim.UnsignedInteger16(
                "108");

        /**
         * constant for value entry Software Environment Problem (corresponds to mapEntry 108 )
         */
        public final static String VALUE_ENTRY_Software_Environment_Problem = "Software Environment Problem";

        /**
         * constant for value map entry 109
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_Software_Download_Failure = new javax.cim.UnsignedInteger16(
                "109");

        /**
         * constant for value entry Software Download Failure (corresponds to mapEntry 109 )
         */
        public final static String VALUE_ENTRY_Software_Download_Failure = "Software Download Failure";

        /**
         * constant for value map entry 110
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_Element_Reinitialized = new javax.cim.UnsignedInteger16(
                "110");

        /**
         * constant for value entry Element Reinitialized (corresponds to mapEntry 110 )
         */
        public final static String VALUE_ENTRY_Element_Reinitialized = "Element Reinitialized";

        /**
         * constant for value map entry 111
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_Timeout = new javax.cim.UnsignedInteger16(
                "111");

        /**
         * constant for value entry Timeout (corresponds to mapEntry 111 )
         */
        public final static String VALUE_ENTRY_Timeout = "Timeout";

        /**
         * constant for value map entry 112
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_Logging_Problems = new javax.cim.UnsignedInteger16(
                "112");

        /**
         * constant for value entry Logging Problems (corresponds to mapEntry 112 )
         */
        public final static String VALUE_ENTRY_Logging_Problems = "Logging Problems";

        /**
         * constant for value map entry 113
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_Leak_Detected = new javax.cim.UnsignedInteger16(
                "113");

        /**
         * constant for value entry Leak Detected (corresponds to mapEntry 113 )
         */
        public final static String VALUE_ENTRY_Leak_Detected = "Leak Detected";

        /**
         * constant for value map entry 114
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_114_FOR_VALUE_ENTRY_Protection_Mechanism_Failure = new javax.cim.UnsignedInteger16(
                "114");

        /**
         * constant for value entry Protection Mechanism Failure (corresponds to mapEntry 114 )
         */
        public final static String VALUE_ENTRY_Protection_Mechanism_Failure = "Protection Mechanism Failure";

        /**
         * constant for value map entry 115
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_Protecting_Resource_Failure = new javax.cim.UnsignedInteger16(
                "115");

        /**
         * constant for value entry Protecting Resource Failure (corresponds to mapEntry 115 )
         */
        public final static String VALUE_ENTRY_Protecting_Resource_Failure = "Protecting Resource Failure";

        /**
         * constant for value map entry 116
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_Database_Inconsistency = new javax.cim.UnsignedInteger16(
                "116");

        /**
         * constant for value entry Database Inconsistency (corresponds to mapEntry 116 )
         */
        public final static String VALUE_ENTRY_Database_Inconsistency = "Database Inconsistency";

        /**
         * constant for value map entry 117
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_Authentication_Failure = new javax.cim.UnsignedInteger16(
                "117");

        /**
         * constant for value entry Authentication Failure (corresponds to mapEntry 117 )
         */
        public final static String VALUE_ENTRY_Authentication_Failure = "Authentication Failure";

        /**
         * constant for value map entry 118
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_Breach_of_Confidentiality = new javax.cim.UnsignedInteger16(
                "118");

        /**
         * constant for value entry Breach of Confidentiality (corresponds to mapEntry 118 )
         */
        public final static String VALUE_ENTRY_Breach_of_Confidentiality = "Breach of Confidentiality";

        /**
         * constant for value map entry 119
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_Cable_Tamper = new javax.cim.UnsignedInteger16(
                "119");

        /**
         * constant for value entry Cable Tamper (corresponds to mapEntry 119 )
         */
        public final static String VALUE_ENTRY_Cable_Tamper = "Cable Tamper";

        /**
         * constant for value map entry 120
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_Delayed_Information = new javax.cim.UnsignedInteger16(
                "120");

        /**
         * constant for value entry Delayed Information (corresponds to mapEntry 120 )
         */
        public final static String VALUE_ENTRY_Delayed_Information = "Delayed Information";

        /**
         * constant for value map entry 121
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_Duplicate_Information = new javax.cim.UnsignedInteger16(
                "121");

        /**
         * constant for value entry Duplicate Information (corresponds to mapEntry 121 )
         */
        public final static String VALUE_ENTRY_Duplicate_Information = "Duplicate Information";

        /**
         * constant for value map entry 122
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_Information_Missing = new javax.cim.UnsignedInteger16(
                "122");

        /**
         * constant for value entry Information Missing (corresponds to mapEntry 122 )
         */
        public final static String VALUE_ENTRY_Information_Missing = "Information Missing";

        /**
         * constant for value map entry 123
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_123_FOR_VALUE_ENTRY_Information_Modification = new javax.cim.UnsignedInteger16(
                "123");

        /**
         * constant for value entry Information Modification (corresponds to mapEntry 123 )
         */
        public final static String VALUE_ENTRY_Information_Modification = "Information Modification";

        /**
         * constant for value map entry 124
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_124_FOR_VALUE_ENTRY_Information_Out_of_Sequence = new javax.cim.UnsignedInteger16(
                "124");

        /**
         * constant for value entry Information Out of Sequence (corresponds to mapEntry 124 )
         */
        public final static String VALUE_ENTRY_Information_Out_of_Sequence = "Information Out of Sequence";

        /**
         * constant for value map entry 125
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_125_FOR_VALUE_ENTRY_Key_Expired = new javax.cim.UnsignedInteger16(
                "125");

        /**
         * constant for value entry Key Expired (corresponds to mapEntry 125 )
         */
        public final static String VALUE_ENTRY_Key_Expired = "Key Expired";

        /**
         * constant for value map entry 126
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_126_FOR_VALUE_ENTRY_Non_Repudiation_Failure = new javax.cim.UnsignedInteger16(
                "126");

        /**
         * constant for value entry Non-Repudiation Failure (corresponds to mapEntry 126 )
         */
        public final static String VALUE_ENTRY_Non_Repudiation_Failure = "Non-Repudiation Failure";

        /**
         * constant for value map entry 127
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_127_FOR_VALUE_ENTRY_Out_of_Hours_Activity = new javax.cim.UnsignedInteger16(
                "127");

        /**
         * constant for value entry Out of Hours Activity (corresponds to mapEntry 127 )
         */
        public final static String VALUE_ENTRY_Out_of_Hours_Activity = "Out of Hours Activity";

        /**
         * constant for value map entry 128
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_Out_of_Service = new javax.cim.UnsignedInteger16(
                "128");

        /**
         * constant for value entry Out of Service (corresponds to mapEntry 128 )
         */
        public final static String VALUE_ENTRY_Out_of_Service = "Out of Service";

        /**
         * constant for value map entry 129
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_129_FOR_VALUE_ENTRY_Procedural_Error = new javax.cim.UnsignedInteger16(
                "129");

        /**
         * constant for value entry Procedural Error (corresponds to mapEntry 129 )
         */
        public final static String VALUE_ENTRY_Procedural_Error = "Procedural Error";

        /**
         * constant for value map entry 130
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Unexpected_Information = new javax.cim.UnsignedInteger16(
                "130");

        /**
         * constant for value entry Unexpected Information (corresponds to mapEntry 130 )
         */
        public final static String VALUE_ENTRY_Unexpected_Information = "Unexpected Information";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@51a851a8
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Adapter_Card_Error.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Adapter_Card_Error;
            }

            if (VALUE_ENTRY_Application_Subsystem_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Application_Subsystem_Failure;
            }

            if (VALUE_ENTRY_Bandwidth_Reduced.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Bandwidth_Reduced;
            }

            if (VALUE_ENTRY_Connection_Establishment_Error.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Connection_Establishment_Error;
            }

            if (VALUE_ENTRY_Communications_Protocol_Error.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Communications_Protocol_Error;
            }

            if (VALUE_ENTRY_Communications_Subsystem_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Communications_Subsystem_Failure;
            }

            if (VALUE_ENTRY_Configuration_Customization_Error.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Configuration_Customization_Error;
            }

            if (VALUE_ENTRY_Congestion.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Congestion;
            }

            if (VALUE_ENTRY_Corrupt_Data.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Corrupt_Data;
            }

            if (VALUE_ENTRY_CPU_Cycles_Limit_Exceeded.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CPU_Cycles_Limit_Exceeded;
            }

            if (VALUE_ENTRY_Dataset_Modem_Error.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Dataset_Modem_Error;
            }

            if (VALUE_ENTRY_Degraded_Signal.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Degraded_Signal;
            }

            if (VALUE_ENTRY_DTE_DCE_Interface_Error.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_DTE_DCE_Interface_Error;
            }

            if (VALUE_ENTRY_Enclosure_Door_Open.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Enclosure_Door_Open;
            }

            if (VALUE_ENTRY_Equipment_Malfunction.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Equipment_Malfunction;
            }

            if (VALUE_ENTRY_Excessive_Vibration.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Excessive_Vibration;
            }

            if (VALUE_ENTRY_File_Format_Error.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_File_Format_Error;
            }

            if (VALUE_ENTRY_Fire_Detected.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Fire_Detected;
            }

            if (VALUE_ENTRY_Flood_Detected.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Flood_Detected;
            }

            if (VALUE_ENTRY_Framing_Error.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Framing_Error;
            }

            if (VALUE_ENTRY_HVAC_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_HVAC_Problem;
            }

            if (VALUE_ENTRY_Humidity_Unacceptable.equals(value)) {
                return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_Humidity_Unacceptable;
            }

            if (VALUE_ENTRY_I_O_Device_Error.equals(value)) {
                return VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_I_O_Device_Error;
            }

            if (VALUE_ENTRY_Input_Device_Error.equals(value)) {
                return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_Input_Device_Error;
            }

            if (VALUE_ENTRY_LAN_Error.equals(value)) {
                return VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_LAN_Error;
            }

            if (VALUE_ENTRY_Non_Toxic_Leak_Detected.equals(value)) {
                return VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Non_Toxic_Leak_Detected;
            }

            if (VALUE_ENTRY_Local_Node_Transmission_Error.equals(value)) {
                return VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Local_Node_Transmission_Error;
            }

            if (VALUE_ENTRY_Loss_of_Frame.equals(value)) {
                return VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Loss_of_Frame;
            }

            if (VALUE_ENTRY_Loss_of_Signal.equals(value)) {
                return VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Loss_of_Signal;
            }

            if (VALUE_ENTRY_Material_Supply_Exhausted.equals(value)) {
                return VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_Material_Supply_Exhausted;
            }

            if (VALUE_ENTRY_Multiplexer_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Multiplexer_Problem;
            }

            if (VALUE_ENTRY_Out_of_Memory.equals(value)) {
                return VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_Out_of_Memory;
            }

            if (VALUE_ENTRY_Output_Device_Error.equals(value)) {
                return VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_Output_Device_Error;
            }

            if (VALUE_ENTRY_Performance_Degraded.equals(value)) {
                return VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_Performance_Degraded;
            }

            if (VALUE_ENTRY_Power_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_Power_Problem;
            }

            if (VALUE_ENTRY_Pressure_Unacceptable.equals(value)) {
                return VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Pressure_Unacceptable;
            }

            if (VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_.equals(value)) {
                return VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_;
            }

            if (VALUE_ENTRY_Pump_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_Pump_Failure;
            }

            if (VALUE_ENTRY_Queue_Size_Exceeded.equals(value)) {
                return VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_Queue_Size_Exceeded;
            }

            if (VALUE_ENTRY_Receive_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_Receive_Failure;
            }

            if (VALUE_ENTRY_Receiver_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_Receiver_Failure;
            }

            if (VALUE_ENTRY_Remote_Node_Transmission_Error.equals(value)) {
                return VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_Remote_Node_Transmission_Error;
            }

            if (VALUE_ENTRY_Resource_at_or_Nearing_Capacity.equals(value)) {
                return VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_Resource_at_or_Nearing_Capacity;
            }

            if (VALUE_ENTRY_Response_Time_Excessive.equals(value)) {
                return VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_Response_Time_Excessive;
            }

            if (VALUE_ENTRY_Retransmission_Rate_Excessive.equals(value)) {
                return VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_Retransmission_Rate_Excessive;
            }

            if (VALUE_ENTRY_Software_Error.equals(value)) {
                return VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Software_Error;
            }

            if (VALUE_ENTRY_Software_Program_Abnormally_Terminated.equals(value)) {
                return VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Software_Program_Abnormally_Terminated;
            }

            if (VALUE_ENTRY_Software_Program_Error__Incorrect_Results_.equals(value)) {
                return VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Software_Program_Error__Incorrect_Results_;
            }

            if (VALUE_ENTRY_Storage_Capacity_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_Storage_Capacity_Problem;
            }

            if (VALUE_ENTRY_Temperature_Unacceptable.equals(value)) {
                return VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_Temperature_Unacceptable;
            }

            if (VALUE_ENTRY_Threshold_Crossed.equals(value)) {
                return VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Threshold_Crossed;
            }

            if (VALUE_ENTRY_Timing_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Timing_Problem;
            }

            if (VALUE_ENTRY_Toxic_Leak_Detected.equals(value)) {
                return VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_Toxic_Leak_Detected;
            }

            if (VALUE_ENTRY_Transmit_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_Transmit_Failure;
            }

            if (VALUE_ENTRY_Transmitter_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_Transmitter_Failure;
            }

            if (VALUE_ENTRY_Underlying_Resource_Unavailable.equals(value)) {
                return VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_Underlying_Resource_Unavailable;
            }

            if (VALUE_ENTRY_Version_Mismatch.equals(value)) {
                return VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Version_Mismatch;
            }

            if (VALUE_ENTRY_Previous_Alert_Cleared.equals(value)) {
                return VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_Previous_Alert_Cleared;
            }

            if (VALUE_ENTRY_Login_Attempts_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_Login_Attempts_Failed;
            }

            if (VALUE_ENTRY_Software_Virus_Detected.equals(value)) {
                return VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_Software_Virus_Detected;
            }

            if (VALUE_ENTRY_Hardware_Security_Breached.equals(value)) {
                return VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_Hardware_Security_Breached;
            }

            if (VALUE_ENTRY_Denial_of_Service_Detected.equals(value)) {
                return VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Denial_of_Service_Detected;
            }

            if (VALUE_ENTRY_Security_Credential_Mismatch.equals(value)) {
                return VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Security_Credential_Mismatch;
            }

            if (VALUE_ENTRY_Unauthorized_Access.equals(value)) {
                return VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_Unauthorized_Access;
            }

            if (VALUE_ENTRY_Alarm_Received.equals(value)) {
                return VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Alarm_Received;
            }

            if (VALUE_ENTRY_Loss_of_Pointer.equals(value)) {
                return VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Loss_of_Pointer;
            }

            if (VALUE_ENTRY_Payload_Mismatch.equals(value)) {
                return VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_Payload_Mismatch;
            }

            if (VALUE_ENTRY_Transmission_Error.equals(value)) {
                return VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Transmission_Error;
            }

            if (VALUE_ENTRY_Excessive_Error_Rate.equals(value)) {
                return VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Excessive_Error_Rate;
            }

            if (VALUE_ENTRY_Trace_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_Trace_Problem;
            }

            if (VALUE_ENTRY_Element_Unavailable.equals(value)) {
                return VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_Element_Unavailable;
            }

            if (VALUE_ENTRY_Element_Missing.equals(value)) {
                return VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_Element_Missing;
            }

            if (VALUE_ENTRY_Loss_of_Multi_Frame.equals(value)) {
                return VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_Loss_of_Multi_Frame;
            }

            if (VALUE_ENTRY_Broadcast_Channel_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_Broadcast_Channel_Failure;
            }

            if (VALUE_ENTRY_Invalid_Message_Received.equals(value)) {
                return VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_Invalid_Message_Received;
            }

            if (VALUE_ENTRY_Routing_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Routing_Failure;
            }

            if (VALUE_ENTRY_Backplane_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_Backplane_Failure;
            }

            if (VALUE_ENTRY_Identifier_Duplication.equals(value)) {
                return VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Identifier_Duplication;
            }

            if (VALUE_ENTRY_Protection_Path_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_Protection_Path_Failure;
            }

            if (VALUE_ENTRY_Sync_Loss_or_Mismatch.equals(value)) {
                return VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_Sync_Loss_or_Mismatch;
            }

            if (VALUE_ENTRY_Terminal_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_Terminal_Problem;
            }

            if (VALUE_ENTRY_Real_Time_Clock_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_Real_Time_Clock_Failure;
            }

            if (VALUE_ENTRY_Antenna_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_Antenna_Failure;
            }

            if (VALUE_ENTRY_Battery_Charging_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_Battery_Charging_Failure;
            }

            if (VALUE_ENTRY_Disk_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_Disk_Failure;
            }

            if (VALUE_ENTRY_Frequency_Hopping_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_Frequency_Hopping_Failure;
            }

            if (VALUE_ENTRY_Loss_of_Redundancy.equals(value)) {
                return VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_Loss_of_Redundancy;
            }

            if (VALUE_ENTRY_Power_Supply_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_Power_Supply_Failure;
            }

            if (VALUE_ENTRY_Signal_Quality_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_Signal_Quality_Problem;
            }

            if (VALUE_ENTRY_Battery_Discharging.equals(value)) {
                return VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_Battery_Discharging;
            }

            if (VALUE_ENTRY_Battery_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_Battery_Failure;
            }

            if (VALUE_ENTRY_Commercial_Power_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_Commercial_Power_Problem;
            }

            if (VALUE_ENTRY_Fan_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_Fan_Failure;
            }

            if (VALUE_ENTRY_Engine_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_Engine_Failure;
            }

            if (VALUE_ENTRY_Sensor_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_Sensor_Failure;
            }

            if (VALUE_ENTRY_Fuse_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_Fuse_Failure;
            }

            if (VALUE_ENTRY_Generator_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_Generator_Failure;
            }

            if (VALUE_ENTRY_Low_Battery.equals(value)) {
                return VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Low_Battery;
            }

            if (VALUE_ENTRY_Low_Fuel.equals(value)) {
                return VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Low_Fuel;
            }

            if (VALUE_ENTRY_Low_Water.equals(value)) {
                return VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Low_Water;
            }

            if (VALUE_ENTRY_Explosive_Gas.equals(value)) {
                return VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Explosive_Gas;
            }

            if (VALUE_ENTRY_High_Winds.equals(value)) {
                return VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_High_Winds;
            }

            if (VALUE_ENTRY_Ice_Buildup.equals(value)) {
                return VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Ice_Buildup;
            }

            if (VALUE_ENTRY_Smoke.equals(value)) {
                return VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_Smoke;
            }

            if (VALUE_ENTRY_Memory_Mismatch.equals(value)) {
                return VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_Memory_Mismatch;
            }

            if (VALUE_ENTRY_Out_of_CPU_Cycles.equals(value)) {
                return VALUE_MAP_ENTRY_107_FOR_VALUE_ENTRY_Out_of_CPU_Cycles;
            }

            if (VALUE_ENTRY_Software_Environment_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_108_FOR_VALUE_ENTRY_Software_Environment_Problem;
            }

            if (VALUE_ENTRY_Software_Download_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_Software_Download_Failure;
            }

            if (VALUE_ENTRY_Element_Reinitialized.equals(value)) {
                return VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_Element_Reinitialized;
            }

            if (VALUE_ENTRY_Timeout.equals(value)) {
                return VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_Timeout;
            }

            if (VALUE_ENTRY_Logging_Problems.equals(value)) {
                return VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_Logging_Problems;
            }

            if (VALUE_ENTRY_Leak_Detected.equals(value)) {
                return VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_Leak_Detected;
            }

            if (VALUE_ENTRY_Protection_Mechanism_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_114_FOR_VALUE_ENTRY_Protection_Mechanism_Failure;
            }

            if (VALUE_ENTRY_Protecting_Resource_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_Protecting_Resource_Failure;
            }

            if (VALUE_ENTRY_Database_Inconsistency.equals(value)) {
                return VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_Database_Inconsistency;
            }

            if (VALUE_ENTRY_Authentication_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_Authentication_Failure;
            }

            if (VALUE_ENTRY_Breach_of_Confidentiality.equals(value)) {
                return VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_Breach_of_Confidentiality;
            }

            if (VALUE_ENTRY_Cable_Tamper.equals(value)) {
                return VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_Cable_Tamper;
            }

            if (VALUE_ENTRY_Delayed_Information.equals(value)) {
                return VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_Delayed_Information;
            }

            if (VALUE_ENTRY_Duplicate_Information.equals(value)) {
                return VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_Duplicate_Information;
            }

            if (VALUE_ENTRY_Information_Missing.equals(value)) {
                return VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_Information_Missing;
            }

            if (VALUE_ENTRY_Information_Modification.equals(value)) {
                return VALUE_MAP_ENTRY_123_FOR_VALUE_ENTRY_Information_Modification;
            }

            if (VALUE_ENTRY_Information_Out_of_Sequence.equals(value)) {
                return VALUE_MAP_ENTRY_124_FOR_VALUE_ENTRY_Information_Out_of_Sequence;
            }

            if (VALUE_ENTRY_Key_Expired.equals(value)) {
                return VALUE_MAP_ENTRY_125_FOR_VALUE_ENTRY_Key_Expired;
            }

            if (VALUE_ENTRY_Non_Repudiation_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_126_FOR_VALUE_ENTRY_Non_Repudiation_Failure;
            }

            if (VALUE_ENTRY_Out_of_Hours_Activity.equals(value)) {
                return VALUE_MAP_ENTRY_127_FOR_VALUE_ENTRY_Out_of_Hours_Activity;
            }

            if (VALUE_ENTRY_Out_of_Service.equals(value)) {
                return VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_Out_of_Service;
            }

            if (VALUE_ENTRY_Procedural_Error.equals(value)) {
                return VALUE_MAP_ENTRY_129_FOR_VALUE_ENTRY_Procedural_Error;
            }

            if (VALUE_ENTRY_Unexpected_Information.equals(value)) {
                return VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Unexpected_Information;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Adapter_Card_Error.intValue()) {
                return VALUE_ENTRY_Adapter_Card_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Application_Subsystem_Failure
                    .intValue()) {
                return VALUE_ENTRY_Application_Subsystem_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Bandwidth_Reduced.intValue()) {
                return VALUE_ENTRY_Bandwidth_Reduced;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Connection_Establishment_Error
                    .intValue()) {
                return VALUE_ENTRY_Connection_Establishment_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Communications_Protocol_Error
                    .intValue()) {
                return VALUE_ENTRY_Communications_Protocol_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Communications_Subsystem_Failure
                    .intValue()) {
                return VALUE_ENTRY_Communications_Subsystem_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Configuration_Customization_Error
                    .intValue()) {
                return VALUE_ENTRY_Configuration_Customization_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Congestion.intValue()) {
                return VALUE_ENTRY_Congestion;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Corrupt_Data.intValue()) {
                return VALUE_ENTRY_Corrupt_Data;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CPU_Cycles_Limit_Exceeded.intValue()) {
                return VALUE_ENTRY_CPU_Cycles_Limit_Exceeded;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Dataset_Modem_Error.intValue()) {
                return VALUE_ENTRY_Dataset_Modem_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Degraded_Signal.intValue()) {
                return VALUE_ENTRY_Degraded_Signal;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_DTE_DCE_Interface_Error.intValue()) {
                return VALUE_ENTRY_DTE_DCE_Interface_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Enclosure_Door_Open.intValue()) {
                return VALUE_ENTRY_Enclosure_Door_Open;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Equipment_Malfunction.intValue()) {
                return VALUE_ENTRY_Equipment_Malfunction;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Excessive_Vibration.intValue()) {
                return VALUE_ENTRY_Excessive_Vibration;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_File_Format_Error.intValue()) {
                return VALUE_ENTRY_File_Format_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Fire_Detected.intValue()) {
                return VALUE_ENTRY_Fire_Detected;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Flood_Detected.intValue()) {
                return VALUE_ENTRY_Flood_Detected;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Framing_Error.intValue()) {
                return VALUE_ENTRY_Framing_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_HVAC_Problem.intValue()) {
                return VALUE_ENTRY_HVAC_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_Humidity_Unacceptable.intValue()) {
                return VALUE_ENTRY_Humidity_Unacceptable;
            }

            if (iValue == VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_I_O_Device_Error.intValue()) {
                return VALUE_ENTRY_I_O_Device_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_Input_Device_Error.intValue()) {
                return VALUE_ENTRY_Input_Device_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_LAN_Error.intValue()) {
                return VALUE_ENTRY_LAN_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Non_Toxic_Leak_Detected.intValue()) {
                return VALUE_ENTRY_Non_Toxic_Leak_Detected;
            }

            if (iValue == VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Local_Node_Transmission_Error
                    .intValue()) {
                return VALUE_ENTRY_Local_Node_Transmission_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Loss_of_Frame.intValue()) {
                return VALUE_ENTRY_Loss_of_Frame;
            }

            if (iValue == VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Loss_of_Signal.intValue()) {
                return VALUE_ENTRY_Loss_of_Signal;
            }

            if (iValue == VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_Material_Supply_Exhausted.intValue()) {
                return VALUE_ENTRY_Material_Supply_Exhausted;
            }

            if (iValue == VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Multiplexer_Problem.intValue()) {
                return VALUE_ENTRY_Multiplexer_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_Out_of_Memory.intValue()) {
                return VALUE_ENTRY_Out_of_Memory;
            }

            if (iValue == VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_Output_Device_Error.intValue()) {
                return VALUE_ENTRY_Output_Device_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_Performance_Degraded.intValue()) {
                return VALUE_ENTRY_Performance_Degraded;
            }

            if (iValue == VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_Power_Problem.intValue()) {
                return VALUE_ENTRY_Power_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Pressure_Unacceptable.intValue()) {
                return VALUE_ENTRY_Pressure_Unacceptable;
            }

            if (iValue == VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_
                    .intValue()) {
                return VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_;
            }

            if (iValue == VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_Pump_Failure.intValue()) {
                return VALUE_ENTRY_Pump_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_Queue_Size_Exceeded.intValue()) {
                return VALUE_ENTRY_Queue_Size_Exceeded;
            }

            if (iValue == VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_Receive_Failure.intValue()) {
                return VALUE_ENTRY_Receive_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_Receiver_Failure.intValue()) {
                return VALUE_ENTRY_Receiver_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_Remote_Node_Transmission_Error
                    .intValue()) {
                return VALUE_ENTRY_Remote_Node_Transmission_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_Resource_at_or_Nearing_Capacity
                    .intValue()) {
                return VALUE_ENTRY_Resource_at_or_Nearing_Capacity;
            }

            if (iValue == VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_Response_Time_Excessive.intValue()) {
                return VALUE_ENTRY_Response_Time_Excessive;
            }

            if (iValue == VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_Retransmission_Rate_Excessive
                    .intValue()) {
                return VALUE_ENTRY_Retransmission_Rate_Excessive;
            }

            if (iValue == VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Software_Error.intValue()) {
                return VALUE_ENTRY_Software_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Software_Program_Abnormally_Terminated
                    .intValue()) {
                return VALUE_ENTRY_Software_Program_Abnormally_Terminated;
            }

            if (iValue == VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Software_Program_Error__Incorrect_Results_
                    .intValue()) {
                return VALUE_ENTRY_Software_Program_Error__Incorrect_Results_;
            }

            if (iValue == VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_Storage_Capacity_Problem.intValue()) {
                return VALUE_ENTRY_Storage_Capacity_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_Temperature_Unacceptable.intValue()) {
                return VALUE_ENTRY_Temperature_Unacceptable;
            }

            if (iValue == VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Threshold_Crossed.intValue()) {
                return VALUE_ENTRY_Threshold_Crossed;
            }

            if (iValue == VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Timing_Problem.intValue()) {
                return VALUE_ENTRY_Timing_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_Toxic_Leak_Detected.intValue()) {
                return VALUE_ENTRY_Toxic_Leak_Detected;
            }

            if (iValue == VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_Transmit_Failure.intValue()) {
                return VALUE_ENTRY_Transmit_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_Transmitter_Failure.intValue()) {
                return VALUE_ENTRY_Transmitter_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_Underlying_Resource_Unavailable
                    .intValue()) {
                return VALUE_ENTRY_Underlying_Resource_Unavailable;
            }

            if (iValue == VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Version_Mismatch.intValue()) {
                return VALUE_ENTRY_Version_Mismatch;
            }

            if (iValue == VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_Previous_Alert_Cleared.intValue()) {
                return VALUE_ENTRY_Previous_Alert_Cleared;
            }

            if (iValue == VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_Login_Attempts_Failed.intValue()) {
                return VALUE_ENTRY_Login_Attempts_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_Software_Virus_Detected.intValue()) {
                return VALUE_ENTRY_Software_Virus_Detected;
            }

            if (iValue == VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_Hardware_Security_Breached.intValue()) {
                return VALUE_ENTRY_Hardware_Security_Breached;
            }

            if (iValue == VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Denial_of_Service_Detected.intValue()) {
                return VALUE_ENTRY_Denial_of_Service_Detected;
            }

            if (iValue == VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Security_Credential_Mismatch
                    .intValue()) {
                return VALUE_ENTRY_Security_Credential_Mismatch;
            }

            if (iValue == VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_Unauthorized_Access.intValue()) {
                return VALUE_ENTRY_Unauthorized_Access;
            }

            if (iValue == VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Alarm_Received.intValue()) {
                return VALUE_ENTRY_Alarm_Received;
            }

            if (iValue == VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Loss_of_Pointer.intValue()) {
                return VALUE_ENTRY_Loss_of_Pointer;
            }

            if (iValue == VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_Payload_Mismatch.intValue()) {
                return VALUE_ENTRY_Payload_Mismatch;
            }

            if (iValue == VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Transmission_Error.intValue()) {
                return VALUE_ENTRY_Transmission_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Excessive_Error_Rate.intValue()) {
                return VALUE_ENTRY_Excessive_Error_Rate;
            }

            if (iValue == VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_Trace_Problem.intValue()) {
                return VALUE_ENTRY_Trace_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_Element_Unavailable.intValue()) {
                return VALUE_ENTRY_Element_Unavailable;
            }

            if (iValue == VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_Element_Missing.intValue()) {
                return VALUE_ENTRY_Element_Missing;
            }

            if (iValue == VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_Loss_of_Multi_Frame.intValue()) {
                return VALUE_ENTRY_Loss_of_Multi_Frame;
            }

            if (iValue == VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_Broadcast_Channel_Failure.intValue()) {
                return VALUE_ENTRY_Broadcast_Channel_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_Invalid_Message_Received.intValue()) {
                return VALUE_ENTRY_Invalid_Message_Received;
            }

            if (iValue == VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Routing_Failure.intValue()) {
                return VALUE_ENTRY_Routing_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_Backplane_Failure.intValue()) {
                return VALUE_ENTRY_Backplane_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Identifier_Duplication.intValue()) {
                return VALUE_ENTRY_Identifier_Duplication;
            }

            if (iValue == VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_Protection_Path_Failure.intValue()) {
                return VALUE_ENTRY_Protection_Path_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_Sync_Loss_or_Mismatch.intValue()) {
                return VALUE_ENTRY_Sync_Loss_or_Mismatch;
            }

            if (iValue == VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_Terminal_Problem.intValue()) {
                return VALUE_ENTRY_Terminal_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_Real_Time_Clock_Failure.intValue()) {
                return VALUE_ENTRY_Real_Time_Clock_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_Antenna_Failure.intValue()) {
                return VALUE_ENTRY_Antenna_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_Battery_Charging_Failure.intValue()) {
                return VALUE_ENTRY_Battery_Charging_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_Disk_Failure.intValue()) {
                return VALUE_ENTRY_Disk_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_Frequency_Hopping_Failure.intValue()) {
                return VALUE_ENTRY_Frequency_Hopping_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_Loss_of_Redundancy.intValue()) {
                return VALUE_ENTRY_Loss_of_Redundancy;
            }

            if (iValue == VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_Power_Supply_Failure.intValue()) {
                return VALUE_ENTRY_Power_Supply_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_Signal_Quality_Problem.intValue()) {
                return VALUE_ENTRY_Signal_Quality_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_Battery_Discharging.intValue()) {
                return VALUE_ENTRY_Battery_Discharging;
            }

            if (iValue == VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_Battery_Failure.intValue()) {
                return VALUE_ENTRY_Battery_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_Commercial_Power_Problem.intValue()) {
                return VALUE_ENTRY_Commercial_Power_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_Fan_Failure.intValue()) {
                return VALUE_ENTRY_Fan_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_Engine_Failure.intValue()) {
                return VALUE_ENTRY_Engine_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_Sensor_Failure.intValue()) {
                return VALUE_ENTRY_Sensor_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_Fuse_Failure.intValue()) {
                return VALUE_ENTRY_Fuse_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_Generator_Failure.intValue()) {
                return VALUE_ENTRY_Generator_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Low_Battery.intValue()) {
                return VALUE_ENTRY_Low_Battery;
            }

            if (iValue == VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Low_Fuel.intValue()) {
                return VALUE_ENTRY_Low_Fuel;
            }

            if (iValue == VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Low_Water.intValue()) {
                return VALUE_ENTRY_Low_Water;
            }

            if (iValue == VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Explosive_Gas.intValue()) {
                return VALUE_ENTRY_Explosive_Gas;
            }

            if (iValue == VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_High_Winds.intValue()) {
                return VALUE_ENTRY_High_Winds;
            }

            if (iValue == VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Ice_Buildup.intValue()) {
                return VALUE_ENTRY_Ice_Buildup;
            }

            if (iValue == VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_Smoke.intValue()) {
                return VALUE_ENTRY_Smoke;
            }

            if (iValue == VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_Memory_Mismatch.intValue()) {
                return VALUE_ENTRY_Memory_Mismatch;
            }

            if (iValue == VALUE_MAP_ENTRY_107_FOR_VALUE_ENTRY_Out_of_CPU_Cycles.intValue()) {
                return VALUE_ENTRY_Out_of_CPU_Cycles;
            }

            if (iValue == VALUE_MAP_ENTRY_108_FOR_VALUE_ENTRY_Software_Environment_Problem
                    .intValue()) {
                return VALUE_ENTRY_Software_Environment_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_Software_Download_Failure.intValue()) {
                return VALUE_ENTRY_Software_Download_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_Element_Reinitialized.intValue()) {
                return VALUE_ENTRY_Element_Reinitialized;
            }

            if (iValue == VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_Timeout.intValue()) {
                return VALUE_ENTRY_Timeout;
            }

            if (iValue == VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_Logging_Problems.intValue()) {
                return VALUE_ENTRY_Logging_Problems;
            }

            if (iValue == VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_Leak_Detected.intValue()) {
                return VALUE_ENTRY_Leak_Detected;
            }

            if (iValue == VALUE_MAP_ENTRY_114_FOR_VALUE_ENTRY_Protection_Mechanism_Failure
                    .intValue()) {
                return VALUE_ENTRY_Protection_Mechanism_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_Protecting_Resource_Failure
                    .intValue()) {
                return VALUE_ENTRY_Protecting_Resource_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_Database_Inconsistency.intValue()) {
                return VALUE_ENTRY_Database_Inconsistency;
            }

            if (iValue == VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_Authentication_Failure.intValue()) {
                return VALUE_ENTRY_Authentication_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_Breach_of_Confidentiality.intValue()) {
                return VALUE_ENTRY_Breach_of_Confidentiality;
            }

            if (iValue == VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_Cable_Tamper.intValue()) {
                return VALUE_ENTRY_Cable_Tamper;
            }

            if (iValue == VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_Delayed_Information.intValue()) {
                return VALUE_ENTRY_Delayed_Information;
            }

            if (iValue == VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_Duplicate_Information.intValue()) {
                return VALUE_ENTRY_Duplicate_Information;
            }

            if (iValue == VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_Information_Missing.intValue()) {
                return VALUE_ENTRY_Information_Missing;
            }

            if (iValue == VALUE_MAP_ENTRY_123_FOR_VALUE_ENTRY_Information_Modification.intValue()) {
                return VALUE_ENTRY_Information_Modification;
            }

            if (iValue == VALUE_MAP_ENTRY_124_FOR_VALUE_ENTRY_Information_Out_of_Sequence
                    .intValue()) {
                return VALUE_ENTRY_Information_Out_of_Sequence;
            }

            if (iValue == VALUE_MAP_ENTRY_125_FOR_VALUE_ENTRY_Key_Expired.intValue()) {
                return VALUE_ENTRY_Key_Expired;
            }

            if (iValue == VALUE_MAP_ENTRY_126_FOR_VALUE_ENTRY_Non_Repudiation_Failure.intValue()) {
                return VALUE_ENTRY_Non_Repudiation_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_127_FOR_VALUE_ENTRY_Out_of_Hours_Activity.intValue()) {
                return VALUE_ENTRY_Out_of_Hours_Activity;
            }

            if (iValue == VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_Out_of_Service.intValue()) {
                return VALUE_ENTRY_Out_of_Service;
            }

            if (iValue == VALUE_MAP_ENTRY_129_FOR_VALUE_ENTRY_Procedural_Error.intValue()) {
                return VALUE_ENTRY_Procedural_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Unexpected_Information.intValue()) {
                return VALUE_ENTRY_Unexpected_Information;
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
         * Value Map for the property ProbableCause   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Adapter_Card_Error,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Application_Subsystem_Failure,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Bandwidth_Reduced,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Connection_Establishment_Error,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Communications_Protocol_Error,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Communications_Subsystem_Failure,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Configuration_Customization_Error,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Congestion,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Corrupt_Data,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CPU_Cycles_Limit_Exceeded,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Dataset_Modem_Error,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Degraded_Signal,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_DTE_DCE_Interface_Error,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Enclosure_Door_Open,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Equipment_Malfunction,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Excessive_Vibration,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_File_Format_Error,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Fire_Detected,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Flood_Detected,
                VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Framing_Error,
                VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_HVAC_Problem,
                VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_Humidity_Unacceptable,
                VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_I_O_Device_Error,
                VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_Input_Device_Error,
                VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_LAN_Error,
                VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Non_Toxic_Leak_Detected,
                VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Local_Node_Transmission_Error,
                VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Loss_of_Frame,
                VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Loss_of_Signal,
                VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_Material_Supply_Exhausted,
                VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Multiplexer_Problem,
                VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_Out_of_Memory,
                VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_Output_Device_Error,
                VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_Performance_Degraded,
                VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_Power_Problem,
                VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Pressure_Unacceptable,
                VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_,
                VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_Pump_Failure,
                VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_Queue_Size_Exceeded,
                VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_Receive_Failure,
                VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_Receiver_Failure,
                VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_Remote_Node_Transmission_Error,
                VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_Resource_at_or_Nearing_Capacity,
                VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_Response_Time_Excessive,
                VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_Retransmission_Rate_Excessive,
                VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Software_Error,
                VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Software_Program_Abnormally_Terminated,
                VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Software_Program_Error__Incorrect_Results_,
                VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_Storage_Capacity_Problem,
                VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_Temperature_Unacceptable,
                VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Threshold_Crossed,
                VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Timing_Problem,
                VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_Toxic_Leak_Detected,
                VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_Transmit_Failure,
                VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_Transmitter_Failure,
                VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_Underlying_Resource_Unavailable,
                VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Version_Mismatch,
                VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_Previous_Alert_Cleared,
                VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_Login_Attempts_Failed,
                VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_Software_Virus_Detected,
                VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_Hardware_Security_Breached,
                VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Denial_of_Service_Detected,
                VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Security_Credential_Mismatch,
                VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_Unauthorized_Access,
                VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Alarm_Received,
                VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Loss_of_Pointer,
                VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_Payload_Mismatch,
                VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Transmission_Error,
                VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Excessive_Error_Rate,
                VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_Trace_Problem,
                VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_Element_Unavailable,
                VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_Element_Missing,
                VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_Loss_of_Multi_Frame,
                VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_Broadcast_Channel_Failure,
                VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_Invalid_Message_Received,
                VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Routing_Failure,
                VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_Backplane_Failure,
                VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Identifier_Duplication,
                VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_Protection_Path_Failure,
                VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_Sync_Loss_or_Mismatch,
                VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_Terminal_Problem,
                VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_Real_Time_Clock_Failure,
                VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_Antenna_Failure,
                VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_Battery_Charging_Failure,
                VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_Disk_Failure,
                VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_Frequency_Hopping_Failure,
                VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_Loss_of_Redundancy,
                VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_Power_Supply_Failure,
                VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_Signal_Quality_Problem,
                VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_Battery_Discharging,
                VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_Battery_Failure,
                VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_Commercial_Power_Problem,
                VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_Fan_Failure,
                VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_Engine_Failure,
                VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_Sensor_Failure,
                VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_Fuse_Failure,
                VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_Generator_Failure,
                VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Low_Battery,
                VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Low_Fuel,
                VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Low_Water,
                VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Explosive_Gas,
                VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_High_Winds,
                VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Ice_Buildup,
                VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_Smoke,
                VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_Memory_Mismatch,
                VALUE_MAP_ENTRY_107_FOR_VALUE_ENTRY_Out_of_CPU_Cycles,
                VALUE_MAP_ENTRY_108_FOR_VALUE_ENTRY_Software_Environment_Problem,
                VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_Software_Download_Failure,
                VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_Element_Reinitialized,
                VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_Logging_Problems,
                VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_Leak_Detected,
                VALUE_MAP_ENTRY_114_FOR_VALUE_ENTRY_Protection_Mechanism_Failure,
                VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_Protecting_Resource_Failure,
                VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_Database_Inconsistency,
                VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_Authentication_Failure,
                VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_Breach_of_Confidentiality,
                VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_Cable_Tamper,
                VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_Delayed_Information,
                VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_Duplicate_Information,
                VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_Information_Missing,
                VALUE_MAP_ENTRY_123_FOR_VALUE_ENTRY_Information_Modification,
                VALUE_MAP_ENTRY_124_FOR_VALUE_ENTRY_Information_Out_of_Sequence,
                VALUE_MAP_ENTRY_125_FOR_VALUE_ENTRY_Key_Expired,
                VALUE_MAP_ENTRY_126_FOR_VALUE_ENTRY_Non_Repudiation_Failure,
                VALUE_MAP_ENTRY_127_FOR_VALUE_ENTRY_Out_of_Hours_Activity,
                VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_Out_of_Service,
                VALUE_MAP_ENTRY_129_FOR_VALUE_ENTRY_Procedural_Error,
                VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Unexpected_Information };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ProbableCause   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Adapter_Card_Error, VALUE_ENTRY_Application_Subsystem_Failure,
                VALUE_ENTRY_Bandwidth_Reduced, VALUE_ENTRY_Connection_Establishment_Error,
                VALUE_ENTRY_Communications_Protocol_Error,
                VALUE_ENTRY_Communications_Subsystem_Failure,
                VALUE_ENTRY_Configuration_Customization_Error, VALUE_ENTRY_Congestion,
                VALUE_ENTRY_Corrupt_Data, VALUE_ENTRY_CPU_Cycles_Limit_Exceeded,
                VALUE_ENTRY_Dataset_Modem_Error, VALUE_ENTRY_Degraded_Signal,
                VALUE_ENTRY_DTE_DCE_Interface_Error, VALUE_ENTRY_Enclosure_Door_Open,
                VALUE_ENTRY_Equipment_Malfunction, VALUE_ENTRY_Excessive_Vibration,
                VALUE_ENTRY_File_Format_Error, VALUE_ENTRY_Fire_Detected,
                VALUE_ENTRY_Flood_Detected, VALUE_ENTRY_Framing_Error, VALUE_ENTRY_HVAC_Problem,
                VALUE_ENTRY_Humidity_Unacceptable, VALUE_ENTRY_I_O_Device_Error,
                VALUE_ENTRY_Input_Device_Error, VALUE_ENTRY_LAN_Error,
                VALUE_ENTRY_Non_Toxic_Leak_Detected, VALUE_ENTRY_Local_Node_Transmission_Error,
                VALUE_ENTRY_Loss_of_Frame, VALUE_ENTRY_Loss_of_Signal,
                VALUE_ENTRY_Material_Supply_Exhausted, VALUE_ENTRY_Multiplexer_Problem,
                VALUE_ENTRY_Out_of_Memory, VALUE_ENTRY_Output_Device_Error,
                VALUE_ENTRY_Performance_Degraded, VALUE_ENTRY_Power_Problem,
                VALUE_ENTRY_Pressure_Unacceptable,
                VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_, VALUE_ENTRY_Pump_Failure,
                VALUE_ENTRY_Queue_Size_Exceeded, VALUE_ENTRY_Receive_Failure,
                VALUE_ENTRY_Receiver_Failure, VALUE_ENTRY_Remote_Node_Transmission_Error,
                VALUE_ENTRY_Resource_at_or_Nearing_Capacity, VALUE_ENTRY_Response_Time_Excessive,
                VALUE_ENTRY_Retransmission_Rate_Excessive, VALUE_ENTRY_Software_Error,
                VALUE_ENTRY_Software_Program_Abnormally_Terminated,
                VALUE_ENTRY_Software_Program_Error__Incorrect_Results_,
                VALUE_ENTRY_Storage_Capacity_Problem, VALUE_ENTRY_Temperature_Unacceptable,
                VALUE_ENTRY_Threshold_Crossed, VALUE_ENTRY_Timing_Problem,
                VALUE_ENTRY_Toxic_Leak_Detected, VALUE_ENTRY_Transmit_Failure,
                VALUE_ENTRY_Transmitter_Failure, VALUE_ENTRY_Underlying_Resource_Unavailable,
                VALUE_ENTRY_Version_Mismatch, VALUE_ENTRY_Previous_Alert_Cleared,
                VALUE_ENTRY_Login_Attempts_Failed, VALUE_ENTRY_Software_Virus_Detected,
                VALUE_ENTRY_Hardware_Security_Breached, VALUE_ENTRY_Denial_of_Service_Detected,
                VALUE_ENTRY_Security_Credential_Mismatch, VALUE_ENTRY_Unauthorized_Access,
                VALUE_ENTRY_Alarm_Received, VALUE_ENTRY_Loss_of_Pointer,
                VALUE_ENTRY_Payload_Mismatch, VALUE_ENTRY_Transmission_Error,
                VALUE_ENTRY_Excessive_Error_Rate, VALUE_ENTRY_Trace_Problem,
                VALUE_ENTRY_Element_Unavailable, VALUE_ENTRY_Element_Missing,
                VALUE_ENTRY_Loss_of_Multi_Frame, VALUE_ENTRY_Broadcast_Channel_Failure,
                VALUE_ENTRY_Invalid_Message_Received, VALUE_ENTRY_Routing_Failure,
                VALUE_ENTRY_Backplane_Failure, VALUE_ENTRY_Identifier_Duplication,
                VALUE_ENTRY_Protection_Path_Failure, VALUE_ENTRY_Sync_Loss_or_Mismatch,
                VALUE_ENTRY_Terminal_Problem, VALUE_ENTRY_Real_Time_Clock_Failure,
                VALUE_ENTRY_Antenna_Failure, VALUE_ENTRY_Battery_Charging_Failure,
                VALUE_ENTRY_Disk_Failure, VALUE_ENTRY_Frequency_Hopping_Failure,
                VALUE_ENTRY_Loss_of_Redundancy, VALUE_ENTRY_Power_Supply_Failure,
                VALUE_ENTRY_Signal_Quality_Problem, VALUE_ENTRY_Battery_Discharging,
                VALUE_ENTRY_Battery_Failure, VALUE_ENTRY_Commercial_Power_Problem,
                VALUE_ENTRY_Fan_Failure, VALUE_ENTRY_Engine_Failure, VALUE_ENTRY_Sensor_Failure,
                VALUE_ENTRY_Fuse_Failure, VALUE_ENTRY_Generator_Failure, VALUE_ENTRY_Low_Battery,
                VALUE_ENTRY_Low_Fuel, VALUE_ENTRY_Low_Water, VALUE_ENTRY_Explosive_Gas,
                VALUE_ENTRY_High_Winds, VALUE_ENTRY_Ice_Buildup, VALUE_ENTRY_Smoke,
                VALUE_ENTRY_Memory_Mismatch, VALUE_ENTRY_Out_of_CPU_Cycles,
                VALUE_ENTRY_Software_Environment_Problem, VALUE_ENTRY_Software_Download_Failure,
                VALUE_ENTRY_Element_Reinitialized, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Logging_Problems, VALUE_ENTRY_Leak_Detected,
                VALUE_ENTRY_Protection_Mechanism_Failure, VALUE_ENTRY_Protecting_Resource_Failure,
                VALUE_ENTRY_Database_Inconsistency, VALUE_ENTRY_Authentication_Failure,
                VALUE_ENTRY_Breach_of_Confidentiality, VALUE_ENTRY_Cable_Tamper,
                VALUE_ENTRY_Delayed_Information, VALUE_ENTRY_Duplicate_Information,
                VALUE_ENTRY_Information_Missing, VALUE_ENTRY_Information_Modification,
                VALUE_ENTRY_Information_Out_of_Sequence, VALUE_ENTRY_Key_Expired,
                VALUE_ENTRY_Non_Repudiation_Failure, VALUE_ENTRY_Out_of_Hours_Activity,
                VALUE_ENTRY_Out_of_Service, VALUE_ENTRY_Procedural_Error,
                VALUE_ENTRY_Unexpected_Information };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ProbableCause   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Adapter_Card_Error,
                VALUE_ENTRY_Application_Subsystem_Failure, VALUE_ENTRY_Bandwidth_Reduced,
                VALUE_ENTRY_Connection_Establishment_Error,
                VALUE_ENTRY_Communications_Protocol_Error,
                VALUE_ENTRY_Communications_Subsystem_Failure,
                VALUE_ENTRY_Configuration_Customization_Error, VALUE_ENTRY_Congestion,
                VALUE_ENTRY_Corrupt_Data, VALUE_ENTRY_CPU_Cycles_Limit_Exceeded,
                VALUE_ENTRY_Dataset_Modem_Error, VALUE_ENTRY_Degraded_Signal,
                VALUE_ENTRY_DTE_DCE_Interface_Error, VALUE_ENTRY_Enclosure_Door_Open,
                VALUE_ENTRY_Equipment_Malfunction, VALUE_ENTRY_Excessive_Vibration,
                VALUE_ENTRY_File_Format_Error, VALUE_ENTRY_Fire_Detected,
                VALUE_ENTRY_Flood_Detected, VALUE_ENTRY_Framing_Error, VALUE_ENTRY_HVAC_Problem,
                VALUE_ENTRY_Humidity_Unacceptable, VALUE_ENTRY_I_O_Device_Error,
                VALUE_ENTRY_Input_Device_Error, VALUE_ENTRY_LAN_Error,
                VALUE_ENTRY_Non_Toxic_Leak_Detected, VALUE_ENTRY_Local_Node_Transmission_Error,
                VALUE_ENTRY_Loss_of_Frame, VALUE_ENTRY_Loss_of_Signal,
                VALUE_ENTRY_Material_Supply_Exhausted, VALUE_ENTRY_Multiplexer_Problem,
                VALUE_ENTRY_Out_of_Memory, VALUE_ENTRY_Output_Device_Error,
                VALUE_ENTRY_Performance_Degraded, VALUE_ENTRY_Power_Problem,
                VALUE_ENTRY_Pressure_Unacceptable,
                VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_, VALUE_ENTRY_Pump_Failure,
                VALUE_ENTRY_Queue_Size_Exceeded, VALUE_ENTRY_Receive_Failure,
                VALUE_ENTRY_Receiver_Failure, VALUE_ENTRY_Remote_Node_Transmission_Error,
                VALUE_ENTRY_Resource_at_or_Nearing_Capacity, VALUE_ENTRY_Response_Time_Excessive,
                VALUE_ENTRY_Retransmission_Rate_Excessive, VALUE_ENTRY_Software_Error,
                VALUE_ENTRY_Software_Program_Abnormally_Terminated,
                VALUE_ENTRY_Software_Program_Error__Incorrect_Results_,
                VALUE_ENTRY_Storage_Capacity_Problem, VALUE_ENTRY_Temperature_Unacceptable,
                VALUE_ENTRY_Threshold_Crossed, VALUE_ENTRY_Timing_Problem,
                VALUE_ENTRY_Toxic_Leak_Detected, VALUE_ENTRY_Transmit_Failure,
                VALUE_ENTRY_Transmitter_Failure, VALUE_ENTRY_Underlying_Resource_Unavailable,
                VALUE_ENTRY_Version_Mismatch, VALUE_ENTRY_Previous_Alert_Cleared,
                VALUE_ENTRY_Login_Attempts_Failed, VALUE_ENTRY_Software_Virus_Detected,
                VALUE_ENTRY_Hardware_Security_Breached, VALUE_ENTRY_Denial_of_Service_Detected,
                VALUE_ENTRY_Security_Credential_Mismatch, VALUE_ENTRY_Unauthorized_Access,
                VALUE_ENTRY_Alarm_Received, VALUE_ENTRY_Loss_of_Pointer,
                VALUE_ENTRY_Payload_Mismatch, VALUE_ENTRY_Transmission_Error,
                VALUE_ENTRY_Excessive_Error_Rate, VALUE_ENTRY_Trace_Problem,
                VALUE_ENTRY_Element_Unavailable, VALUE_ENTRY_Element_Missing,
                VALUE_ENTRY_Loss_of_Multi_Frame, VALUE_ENTRY_Broadcast_Channel_Failure,
                VALUE_ENTRY_Invalid_Message_Received, VALUE_ENTRY_Routing_Failure,
                VALUE_ENTRY_Backplane_Failure, VALUE_ENTRY_Identifier_Duplication,
                VALUE_ENTRY_Protection_Path_Failure, VALUE_ENTRY_Sync_Loss_or_Mismatch,
                VALUE_ENTRY_Terminal_Problem, VALUE_ENTRY_Real_Time_Clock_Failure,
                VALUE_ENTRY_Antenna_Failure, VALUE_ENTRY_Battery_Charging_Failure,
                VALUE_ENTRY_Disk_Failure, VALUE_ENTRY_Frequency_Hopping_Failure,
                VALUE_ENTRY_Loss_of_Redundancy, VALUE_ENTRY_Power_Supply_Failure,
                VALUE_ENTRY_Signal_Quality_Problem, VALUE_ENTRY_Battery_Discharging,
                VALUE_ENTRY_Battery_Failure, VALUE_ENTRY_Commercial_Power_Problem,
                VALUE_ENTRY_Fan_Failure, VALUE_ENTRY_Engine_Failure, VALUE_ENTRY_Sensor_Failure,
                VALUE_ENTRY_Fuse_Failure, VALUE_ENTRY_Generator_Failure, VALUE_ENTRY_Low_Battery,
                VALUE_ENTRY_Low_Fuel, VALUE_ENTRY_Low_Water, VALUE_ENTRY_Explosive_Gas,
                VALUE_ENTRY_High_Winds, VALUE_ENTRY_Ice_Buildup, VALUE_ENTRY_Smoke,
                VALUE_ENTRY_Memory_Mismatch, VALUE_ENTRY_Out_of_CPU_Cycles,
                VALUE_ENTRY_Software_Environment_Problem, VALUE_ENTRY_Software_Download_Failure,
                VALUE_ENTRY_Element_Reinitialized, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Logging_Problems, VALUE_ENTRY_Leak_Detected,
                VALUE_ENTRY_Protection_Mechanism_Failure, VALUE_ENTRY_Protecting_Resource_Failure,
                VALUE_ENTRY_Database_Inconsistency, VALUE_ENTRY_Authentication_Failure,
                VALUE_ENTRY_Breach_of_Confidentiality, VALUE_ENTRY_Cable_Tamper,
                VALUE_ENTRY_Delayed_Information, VALUE_ENTRY_Duplicate_Information,
                VALUE_ENTRY_Information_Missing, VALUE_ENTRY_Information_Modification,
                VALUE_ENTRY_Information_Out_of_Sequence, VALUE_ENTRY_Key_Expired,
                VALUE_ENTRY_Non_Repudiation_Failure, VALUE_ENTRY_Out_of_Hours_Activity,
                VALUE_ENTRY_Out_of_Service, VALUE_ENTRY_Procedural_Error,
                VALUE_ENTRY_Unexpected_Information };

    }

    /**
     * Constants of property ProbableCauseDescription
     * A free-form string describing the probable cause of the error.
     */
    public static class PROPERTY_PROBABLECAUSEDESCRIPTION {
        /**
         * name of the property ProbableCauseDescription
         */
        public final static String NAME = "ProbableCauseDescription";

    }

    /**
     * Constants of property RecommendedActions
     * A free-form string describing recommended actions to take to resolve the error.
     */
    public static class PROPERTY_RECOMMENDEDACTIONS {
        /**
         * name of the property RecommendedActions
         */
        public final static String NAME = "RecommendedActions";

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
     *   CIM_Error is a specialized class that contains information about the severity, cause, recommended actions and other data related to the failure of a CIM Operation. Instances of this type MAY be included as part of the response to a CIM Operation.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_Error(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_Error is a specialized class that contains information about the severity, cause, recommended actions and other data related to the failure of a CIM Operation. Instances of this type MAY be included as part of the response to a CIM Operation.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_Error(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Error() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CIMStatusCode", new CIMProperty("CIMStatusCode",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("CIMStatusCodeDescription", new CIMProperty(
                "CIMStatusCodeDescription", CIMDataType.STRING_T, null));
        propertiesToCheck.put("ErrorSource", new CIMProperty("ErrorSource", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("ErrorSourceFormat", new CIMProperty("ErrorSourceFormat",
                CIMDataType.UINT16_T, null));
        propertiesToCheck
                .put("ErrorType", new CIMProperty("ErrorType", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Message", new CIMProperty("Message", CIMDataType.STRING_T, null));
        propertiesToCheck.put("MessageArguments", new CIMProperty("MessageArguments",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck
                .put("MessageID", new CIMProperty("MessageID", CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherErrorSourceFormat", new CIMProperty("OtherErrorSourceFormat",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherErrorType", new CIMProperty("OtherErrorType",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("OwningEntity", new CIMProperty("OwningEntity", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("PerceivedSeverity", new CIMProperty("PerceivedSeverity",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ProbableCause", new CIMProperty("ProbableCause",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ProbableCauseDescription", new CIMProperty(
                "ProbableCauseDescription", CIMDataType.STRING_T, null));
        propertiesToCheck.put("RecommendedActions", new CIMProperty("RecommendedActions",
                CIMDataType.STRING_ARRAY_T, null));

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
     * Get the property CIMStatusCode
     *     * <br>
     * The CIM status code that characterizes this instance. 
     * This property defines the status codes that MAY be return by a conforming CIM Server or Listener. Note that not all status codes are valid for each operation. The specification for each operation SHOULD define the status codes that may be returned by that operation. 
     * The following values for CIM status code are defined: 
     * 1 - CIM_ERR_FAILED. A general error occurred that is not covered by a more specific error code. 
     * 2 - CIM_ERR_ACCESS_DENIED. Access to a CIM resource was not available to the client. 
     * 3 - CIM_ERR_INVALID_NAMESPACE. The target namespace does not exist. 
     * 4 - CIM_ERR_INVALID_PARAMETER. One or more parameter values passed to the method were invalid. 
     * 5 - CIM_ERR_INVALID_CLASS. The specified Class does not exist. 
     * 6 - CIM_ERR_NOT_FOUND. The requested object could not be found. 
     * 7 - CIM_ERR_NOT_SUPPORTED. The requested operation is not supported. 
     * 8 - CIM_ERR_CLASS_HAS_CHILDREN. Operation cannot be carried out on this class since it has instances. 
     * 9 - CIM_ERR_CLASS_HAS_INSTANCES. Operation cannot be carried out on this class since it has instances. 
     * 10 - CIM_ERR_INVALID_SUPERCLASS. Operation cannot be carried out since the specified superclass does not exist. 
     * 11 - CIM_ERR_ALREADY_EXISTS. Operation cannot be carried out because an object already exists. 
     * 12 - CIM_ERR_NO_SUCH_PROPERTY. The specified Property does not exist. 
     * 13 - CIM_ERR_TYPE_MISMATCH. The value supplied is incompatible with the type. 
     * 14 - CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED. The query language is not recognized or supported. 
     * 15 - CIM_ERR_INVALID_QUERY. The query is not valid for the specified query language. 
     * 16 - CIM_ERR_METHOD_NOT_AVAILABLE. The extrinsic Method could not be executed. 
     * 17 - CIM_ERR_METHOD_NOT_FOUND. The specified extrinsic Method does not exist. 
     * 18 - CIM_ERR_UNEXPECTED_RESPONSE. The returned response to the asynchronous operation was not expected. 
     * 19 - CIM_ERR_INVALID_RESPONSE_DESTINATION. The specified destination for the asynchronous response is not valid. 
     * 20 - CIM_ERR_NAMESPACE_NOT_EMPTY. The specified Namespace is not empty.
     *     */

    public javax.cim.UnsignedInteger32 get_CIMStatusCode() {
        CIMProperty currentProperty = getProperty(PROPERTY_CIMSTATUSCODE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CIMSTATUSCODE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property CIMStatusCode
     * <br>
     * The CIM status code that characterizes this instance. 
     * This property defines the status codes that MAY be return by a conforming CIM Server or Listener. Note that not all status codes are valid for each operation. The specification for each operation SHOULD define the status codes that may be returned by that operation. 
     * The following values for CIM status code are defined: 
     * 1 - CIM_ERR_FAILED. A general error occurred that is not covered by a more specific error code. 
     * 2 - CIM_ERR_ACCESS_DENIED. Access to a CIM resource was not available to the client. 
     * 3 - CIM_ERR_INVALID_NAMESPACE. The target namespace does not exist. 
     * 4 - CIM_ERR_INVALID_PARAMETER. One or more parameter values passed to the method were invalid. 
     * 5 - CIM_ERR_INVALID_CLASS. The specified Class does not exist. 
     * 6 - CIM_ERR_NOT_FOUND. The requested object could not be found. 
     * 7 - CIM_ERR_NOT_SUPPORTED. The requested operation is not supported. 
     * 8 - CIM_ERR_CLASS_HAS_CHILDREN. Operation cannot be carried out on this class since it has instances. 
     * 9 - CIM_ERR_CLASS_HAS_INSTANCES. Operation cannot be carried out on this class since it has instances. 
     * 10 - CIM_ERR_INVALID_SUPERCLASS. Operation cannot be carried out since the specified superclass does not exist. 
     * 11 - CIM_ERR_ALREADY_EXISTS. Operation cannot be carried out because an object already exists. 
     * 12 - CIM_ERR_NO_SUCH_PROPERTY. The specified Property does not exist. 
     * 13 - CIM_ERR_TYPE_MISMATCH. The value supplied is incompatible with the type. 
     * 14 - CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED. The query language is not recognized or supported. 
     * 15 - CIM_ERR_INVALID_QUERY. The query is not valid for the specified query language. 
     * 16 - CIM_ERR_METHOD_NOT_AVAILABLE. The extrinsic Method could not be executed. 
     * 17 - CIM_ERR_METHOD_NOT_FOUND. The specified extrinsic Method does not exist. 
     * 18 - CIM_ERR_UNEXPECTED_RESPONSE. The returned response to the asynchronous operation was not expected. 
     * 19 - CIM_ERR_INVALID_RESPONSE_DESTINATION. The specified destination for the asynchronous response is not valid. 
     * 20 - CIM_ERR_NAMESPACE_NOT_EMPTY. The specified Namespace is not empty.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CIMStatusCode(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CIMSTATUSCODE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_CIMStatusCode(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CIMSTATUSCODE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CIMStatusCode by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CIMStatusCode(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_Error fco = new CIM_Error(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CIMSTATUSCODE.NAME);
        if (property != null) {
            property = setPropertyValue_CIMStatusCode(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CIMSTATUSCODE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CIMStatusCode
     * <br>
     * The CIM status code that characterizes this instance. 
     * This property defines the status codes that MAY be return by a conforming CIM Server or Listener. Note that not all status codes are valid for each operation. The specification for each operation SHOULD define the status codes that may be returned by that operation. 
     * The following values for CIM status code are defined: 
     * 1 - CIM_ERR_FAILED. A general error occurred that is not covered by a more specific error code. 
     * 2 - CIM_ERR_ACCESS_DENIED. Access to a CIM resource was not available to the client. 
     * 3 - CIM_ERR_INVALID_NAMESPACE. The target namespace does not exist. 
     * 4 - CIM_ERR_INVALID_PARAMETER. One or more parameter values passed to the method were invalid. 
     * 5 - CIM_ERR_INVALID_CLASS. The specified Class does not exist. 
     * 6 - CIM_ERR_NOT_FOUND. The requested object could not be found. 
     * 7 - CIM_ERR_NOT_SUPPORTED. The requested operation is not supported. 
     * 8 - CIM_ERR_CLASS_HAS_CHILDREN. Operation cannot be carried out on this class since it has instances. 
     * 9 - CIM_ERR_CLASS_HAS_INSTANCES. Operation cannot be carried out on this class since it has instances. 
     * 10 - CIM_ERR_INVALID_SUPERCLASS. Operation cannot be carried out since the specified superclass does not exist. 
     * 11 - CIM_ERR_ALREADY_EXISTS. Operation cannot be carried out because an object already exists. 
     * 12 - CIM_ERR_NO_SUCH_PROPERTY. The specified Property does not exist. 
     * 13 - CIM_ERR_TYPE_MISMATCH. The value supplied is incompatible with the type. 
     * 14 - CIM_ERR_QUERY_LANGUAGE_NOT_SUPPORTED. The query language is not recognized or supported. 
     * 15 - CIM_ERR_INVALID_QUERY. The query is not valid for the specified query language. 
     * 16 - CIM_ERR_METHOD_NOT_AVAILABLE. The extrinsic Method could not be executed. 
     * 17 - CIM_ERR_METHOD_NOT_FOUND. The specified extrinsic Method does not exist. 
     * 18 - CIM_ERR_UNEXPECTED_RESPONSE. The returned response to the asynchronous operation was not expected. 
     * 19 - CIM_ERR_INVALID_RESPONSE_DESTINATION. The specified destination for the asynchronous response is not valid. 
     * 20 - CIM_ERR_NAMESPACE_NOT_EMPTY. The specified Namespace is not empty.
     */

    private static CIMProperty setPropertyValue_CIMStatusCode(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CIMStatusCodeDescription
     *     * <br>
     * A free-form string containing a human-readable description of CIMStatusCode. This description MAY extend, but MUST be consistent with, the definition of CIMStatusCode.
     *     */

    public String get_CIMStatusCodeDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_CIMSTATUSCODEDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CIMSTATUSCODEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CIMStatusCodeDescription
     * <br>
     * A free-form string containing a human-readable description of CIMStatusCode. This description MAY extend, but MUST be consistent with, the definition of CIMStatusCode.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CIMStatusCodeDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CIMSTATUSCODEDESCRIPTION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_CIMStatusCodeDescription(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CIMSTATUSCODEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CIMStatusCodeDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CIMStatusCodeDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Error fco = new CIM_Error(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CIMSTATUSCODEDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_CIMStatusCodeDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CIMSTATUSCODEDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CIMStatusCodeDescription
     * <br>
     * A free-form string containing a human-readable description of CIMStatusCode. This description MAY extend, but MUST be consistent with, the definition of CIMStatusCode.
     */

    private static CIMProperty setPropertyValue_CIMStatusCodeDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ErrorSource
     *     * <br>
     * The identifying information of the entity (i.e., the instance) generating the error. If this entity is modeled in the CIM Schema, this property contains the path of the instance encoded as a string parameter. If not modeled, the property contains some identifying string that names the entity that generated the error. The path or identifying string is formatted per the ErrorSourceFormat property.
     *     */

    public String get_ErrorSource() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORSOURCE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORSOURCE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ErrorSource
     * <br>
     * The identifying information of the entity (i.e., the instance) generating the error. If this entity is modeled in the CIM Schema, this property contains the path of the instance encoded as a string parameter. If not modeled, the property contains some identifying string that names the entity that generated the error. The path or identifying string is formatted per the ErrorSourceFormat property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorSource(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORSOURCE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ErrorSource(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORSOURCE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorSource by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorSource(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Error fco = new CIM_Error(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORSOURCE.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorSource(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORSOURCE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorSource
     * <br>
     * The identifying information of the entity (i.e., the instance) generating the error. If this entity is modeled in the CIM Schema, this property contains the path of the instance encoded as a string parameter. If not modeled, the property contains some identifying string that names the entity that generated the error. The path or identifying string is formatted per the ErrorSourceFormat property.
     */

    private static CIMProperty setPropertyValue_ErrorSource(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ErrorSourceFormat
     *     * <br>
     * The format of the ErrorSource property is interpretable based on the value of this property. Values are defined as: 
     * 0 - Unknown. The format is unknown or not meaningfully interpretable by a CIM client application. 
     * 1 - Other. The format is defined by the value of the OtherErrorSourceFormat property. 
     * 2 - CIMObjectHandle. A CIM Object Handle, encoded using the MOF syntax defined for the objectHandle non-terminal, is used to identify the entity.
     *     */

    public javax.cim.UnsignedInteger16 get_ErrorSourceFormat() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORSOURCEFORMAT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORSOURCEFORMAT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ErrorSourceFormat
     * <br>
     * The format of the ErrorSource property is interpretable based on the value of this property. Values are defined as: 
     * 0 - Unknown. The format is unknown or not meaningfully interpretable by a CIM client application. 
     * 1 - Other. The format is defined by the value of the OtherErrorSourceFormat property. 
     * 2 - CIMObjectHandle. A CIM Object Handle, encoded using the MOF syntax defined for the objectHandle non-terminal, is used to identify the entity.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorSourceFormat(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORSOURCEFORMAT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ErrorSourceFormat(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORSOURCEFORMAT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorSourceFormat by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorSourceFormat(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Error fco = new CIM_Error(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORSOURCEFORMAT.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorSourceFormat(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORSOURCEFORMAT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorSourceFormat
     * <br>
     * The format of the ErrorSource property is interpretable based on the value of this property. Values are defined as: 
     * 0 - Unknown. The format is unknown or not meaningfully interpretable by a CIM client application. 
     * 1 - Other. The format is defined by the value of the OtherErrorSourceFormat property. 
     * 2 - CIMObjectHandle. A CIM Object Handle, encoded using the MOF syntax defined for the objectHandle non-terminal, is used to identify the entity.
     */

    private static CIMProperty setPropertyValue_ErrorSourceFormat(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ErrorType
     *     * <br>
     * Primary classification of the error. The following values are defined: 
     * 2 - Communications Error. Errors of this type are principally associated with the procedures and/or processes required to convey information from one point to another. 
     * 3 - Quality of Service Error. Errors of this type are principally associated with failures that result in reduced functionality or performance. 
     * 4 - Software Error. Error of this type are principally associated with a software or processing fault. 
     * 5 - Hardware Error. Errors of this type are principally associated with an equipment or hardware failure. 
     * 6 - Environmental Error. Errors of this type are principally associated with a failure condition relating the to facility, or other environmental considerations. 
     * 7 - Security Error. Errors of this type are associated with security violations, detection of viruses, and similar issues. 
     * 8 - Oversubscription Error. Errors of this type are principally associated with the failure to allocate sufficient resources to complete the operation. 
     * 9 - Unavailable Resource Error. Errors of this type are principally associated with the failure to access a required resource. 
     * 10 -Unsupported Operation Error. Errors of this type are principally associated with requests that are not supported.
     *     */

    public javax.cim.UnsignedInteger16 get_ErrorType() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ErrorType
     * <br>
     * Primary classification of the error. The following values are defined: 
     * 2 - Communications Error. Errors of this type are principally associated with the procedures and/or processes required to convey information from one point to another. 
     * 3 - Quality of Service Error. Errors of this type are principally associated with failures that result in reduced functionality or performance. 
     * 4 - Software Error. Error of this type are principally associated with a software or processing fault. 
     * 5 - Hardware Error. Errors of this type are principally associated with an equipment or hardware failure. 
     * 6 - Environmental Error. Errors of this type are principally associated with a failure condition relating the to facility, or other environmental considerations. 
     * 7 - Security Error. Errors of this type are associated with security violations, detection of viruses, and similar issues. 
     * 8 - Oversubscription Error. Errors of this type are principally associated with the failure to allocate sufficient resources to complete the operation. 
     * 9 - Unavailable Resource Error. Errors of this type are principally associated with the failure to access a required resource. 
     * 10 -Unsupported Operation Error. Errors of this type are principally associated with requests that are not supported.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORTYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ErrorType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Error fco = new CIM_Error(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorType
     * <br>
     * Primary classification of the error. The following values are defined: 
     * 2 - Communications Error. Errors of this type are principally associated with the procedures and/or processes required to convey information from one point to another. 
     * 3 - Quality of Service Error. Errors of this type are principally associated with failures that result in reduced functionality or performance. 
     * 4 - Software Error. Error of this type are principally associated with a software or processing fault. 
     * 5 - Hardware Error. Errors of this type are principally associated with an equipment or hardware failure. 
     * 6 - Environmental Error. Errors of this type are principally associated with a failure condition relating the to facility, or other environmental considerations. 
     * 7 - Security Error. Errors of this type are associated with security violations, detection of viruses, and similar issues. 
     * 8 - Oversubscription Error. Errors of this type are principally associated with the failure to allocate sufficient resources to complete the operation. 
     * 9 - Unavailable Resource Error. Errors of this type are principally associated with the failure to access a required resource. 
     * 10 -Unsupported Operation Error. Errors of this type are principally associated with requests that are not supported.
     */

    private static CIMProperty setPropertyValue_ErrorType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Message
     *     * <br>
     * The formatted message. This message is constructed by combining some or all of the dynamic elements specified in the MessageArguments property with the static elements uniquely identified by the MessageID in a message registry or other catalog associated with the OwningEntity.
     *     */

    public String get_Message() {
        CIMProperty currentProperty = getProperty(PROPERTY_MESSAGE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MESSAGE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Message
     * <br>
     * The formatted message. This message is constructed by combining some or all of the dynamic elements specified in the MessageArguments property with the static elements uniquely identified by the MessageID in a message registry or other catalog associated with the OwningEntity.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Message(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MESSAGE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Message(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MESSAGE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Message by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Message(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_Error fco = new CIM_Error(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MESSAGE.NAME);
        if (property != null) {
            property = setPropertyValue_Message(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MESSAGE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Message
     * <br>
     * The formatted message. This message is constructed by combining some or all of the dynamic elements specified in the MessageArguments property with the static elements uniquely identified by the MessageID in a message registry or other catalog associated with the OwningEntity.
     */

    private static CIMProperty setPropertyValue_Message(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MessageArguments
     *     * <br>
     * An array containing the dynamic content of the message.
     *     */

    public String[] get_MessageArguments() {
        CIMProperty currentProperty = getProperty(PROPERTY_MESSAGEARGUMENTS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MESSAGEARGUMENTS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property MessageArguments
     * <br>
     * An array containing the dynamic content of the message.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MessageArguments(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MESSAGEARGUMENTS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_MessageArguments(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MESSAGEARGUMENTS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MessageArguments by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MessageArguments(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_Error fco = new CIM_Error(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MESSAGEARGUMENTS.NAME);
        if (property != null) {
            property = setPropertyValue_MessageArguments(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MESSAGEARGUMENTS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MessageArguments
     * <br>
     * An array containing the dynamic content of the message.
     */

    private static CIMProperty setPropertyValue_MessageArguments(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MessageID
     *     * <br>
     * An opaque string that uniquely identifies, within the scope of the OwningEntity, the format of the Message.
     *     */

    public String get_MessageID() {
        CIMProperty currentProperty = getProperty(PROPERTY_MESSAGEID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MESSAGEID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property MessageID
     * <br>
     * An opaque string that uniquely identifies, within the scope of the OwningEntity, the format of the Message.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MessageID(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MESSAGEID.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_MessageID(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MESSAGEID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MessageID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MessageID(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_Error fco = new CIM_Error(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MESSAGEID.NAME);
        if (property != null) {
            property = setPropertyValue_MessageID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MESSAGEID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MessageID
     * <br>
     * An opaque string that uniquely identifies, within the scope of the OwningEntity, the format of the Message.
     */

    private static CIMProperty setPropertyValue_MessageID(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherErrorSourceFormat
     *     * <br>
     * A string defining "Other" values for ErrorSourceFormat. This value MUST be set to a non NULL value when ErrorSourceFormat is set to a value of 1 ("Other"). For all other values of ErrorSourceFormat, the value of this string must be set to NULL.
     *     */

    public String get_OtherErrorSourceFormat() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERERRORSOURCEFORMAT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERERRORSOURCEFORMAT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherErrorSourceFormat
     * <br>
     * A string defining "Other" values for ErrorSourceFormat. This value MUST be set to a non NULL value when ErrorSourceFormat is set to a value of 1 ("Other"). For all other values of ErrorSourceFormat, the value of this string must be set to NULL.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherErrorSourceFormat(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERERRORSOURCEFORMAT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherErrorSourceFormat(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERERRORSOURCEFORMAT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherErrorSourceFormat by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherErrorSourceFormat(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Error fco = new CIM_Error(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERERRORSOURCEFORMAT.NAME);
        if (property != null) {
            property = setPropertyValue_OtherErrorSourceFormat(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERERRORSOURCEFORMAT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherErrorSourceFormat
     * <br>
     * A string defining "Other" values for ErrorSourceFormat. This value MUST be set to a non NULL value when ErrorSourceFormat is set to a value of 1 ("Other"). For all other values of ErrorSourceFormat, the value of this string must be set to NULL.
     */

    private static CIMProperty setPropertyValue_OtherErrorSourceFormat(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherErrorType
     *     * <br>
     * A free-form string describing the ErrorType when 1, "Other", is specified as the ErrorType.
     *     */

    public String get_OtherErrorType() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERERRORTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERERRORTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherErrorType
     * <br>
     * A free-form string describing the ErrorType when 1, "Other", is specified as the ErrorType.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherErrorType(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERERRORTYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherErrorType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERERRORTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherErrorType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherErrorType(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Error fco = new CIM_Error(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERERRORTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_OtherErrorType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERERRORTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherErrorType
     * <br>
     * A free-form string describing the ErrorType when 1, "Other", is specified as the ErrorType.
     */

    private static CIMProperty setPropertyValue_OtherErrorType(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OwningEntity
     *     * <br>
     * A string that uniquely identifies the entity that owns the definition of the format of the Message described in this instance. OwningEntity MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity or standards body defining the format.
     *     */

    public String get_OwningEntity() {
        CIMProperty currentProperty = getProperty(PROPERTY_OWNINGENTITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OWNINGENTITY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OwningEntity
     * <br>
     * A string that uniquely identifies the entity that owns the definition of the format of the Message described in this instance. OwningEntity MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity or standards body defining the format.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OwningEntity(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OWNINGENTITY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OwningEntity(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OWNINGENTITY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OwningEntity by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OwningEntity(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Error fco = new CIM_Error(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OWNINGENTITY.NAME);
        if (property != null) {
            property = setPropertyValue_OwningEntity(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OWNINGENTITY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OwningEntity
     * <br>
     * A string that uniquely identifies the entity that owns the definition of the format of the Message described in this instance. OwningEntity MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity or standards body defining the format.
     */

    private static CIMProperty setPropertyValue_OwningEntity(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PerceivedSeverity
     *     * <br>
     * An enumerated value that describes the severity of the Indication from the notifier's point of view: 
     * 1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
     * 3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
     * 4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
     * 5 - Major should be used to indicate action is needed NOW. 
     * 6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
     * 7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
     * 2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the Error is purely informational or its severity is simply unknown.
     *     */

    public javax.cim.UnsignedInteger16 get_PerceivedSeverity() {
        CIMProperty currentProperty = getProperty(PROPERTY_PERCEIVEDSEVERITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PERCEIVEDSEVERITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property PerceivedSeverity
     * <br>
     * An enumerated value that describes the severity of the Indication from the notifier's point of view: 
     * 1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
     * 3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
     * 4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
     * 5 - Major should be used to indicate action is needed NOW. 
     * 6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
     * 7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
     * 2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the Error is purely informational or its severity is simply unknown.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PerceivedSeverity(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PERCEIVEDSEVERITY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PerceivedSeverity(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PERCEIVEDSEVERITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PerceivedSeverity by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PerceivedSeverity(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Error fco = new CIM_Error(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PERCEIVEDSEVERITY.NAME);
        if (property != null) {
            property = setPropertyValue_PerceivedSeverity(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PERCEIVEDSEVERITY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PerceivedSeverity
     * <br>
     * An enumerated value that describes the severity of the Indication from the notifier's point of view: 
     * 1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
     * 3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
     * 4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
     * 5 - Major should be used to indicate action is needed NOW. 
     * 6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
     * 7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
     * 2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the Error is purely informational or its severity is simply unknown.
     */

    private static CIMProperty setPropertyValue_PerceivedSeverity(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ProbableCause
     *     * <br>
     * An enumerated value that describes the probable cause of the error.
     *     */

    public javax.cim.UnsignedInteger16 get_ProbableCause() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROBABLECAUSE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROBABLECAUSE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ProbableCause
     * <br>
     * An enumerated value that describes the probable cause of the error.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ProbableCause(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROBABLECAUSE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ProbableCause(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROBABLECAUSE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ProbableCause by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ProbableCause(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Error fco = new CIM_Error(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROBABLECAUSE.NAME);
        if (property != null) {
            property = setPropertyValue_ProbableCause(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROBABLECAUSE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ProbableCause
     * <br>
     * An enumerated value that describes the probable cause of the error.
     */

    private static CIMProperty setPropertyValue_ProbableCause(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ProbableCauseDescription
     *     * <br>
     * A free-form string describing the probable cause of the error.
     *     */

    public String get_ProbableCauseDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROBABLECAUSEDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROBABLECAUSEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ProbableCauseDescription
     * <br>
     * A free-form string describing the probable cause of the error.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ProbableCauseDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROBABLECAUSEDESCRIPTION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ProbableCauseDescription(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROBABLECAUSEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ProbableCauseDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ProbableCauseDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Error fco = new CIM_Error(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROBABLECAUSEDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_ProbableCauseDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROBABLECAUSEDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ProbableCauseDescription
     * <br>
     * A free-form string describing the probable cause of the error.
     */

    private static CIMProperty setPropertyValue_ProbableCauseDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RecommendedActions
     *     * <br>
     * A free-form string describing recommended actions to take to resolve the error.
     *     */

    public String[] get_RecommendedActions() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOMMENDEDACTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECOMMENDEDACTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property RecommendedActions
     * <br>
     * A free-form string describing recommended actions to take to resolve the error.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RecommendedActions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOMMENDEDACTIONS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_RecommendedActions(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECOMMENDEDACTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RecommendedActions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RecommendedActions(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_Error fco = new CIM_Error(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECOMMENDEDACTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_RecommendedActions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECOMMENDEDACTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RecommendedActions
     * <br>
     * A free-form string describing recommended actions to take to resolve the error.
     */

    private static CIMProperty setPropertyValue_RecommendedActions(CIMProperty currentProperty,
            String[] newValue) {
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
     * returns true if the objects are the same
     * 
     * @return
     * @see org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco\#equals(Object)
     */
    public boolean equals(Object object) {
        if (!(object instanceof CIM_Error)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_Error.CIM_CLASS_NAME;
    }

}