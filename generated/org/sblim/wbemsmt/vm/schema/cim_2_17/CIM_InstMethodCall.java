/**
 * CIM_InstMethodCall.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS PROVIDED UNDER THE TER MS
 * OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Eclipse
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: CIM_InstMethodCall notifies when an
 *            instance's method is invoked. generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_InstMethodCall extends CIM_InstIndication {

    public final static String CIM_CLASS_NAME = "CIM_InstMethodCall";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Error
     * Error's data is dependent on the PreCall property. When PreCall is TRUE, this property is NULL describing that there is no method Error instances (since the method has not yet executed). When PreCall is FALSE, Error contains an array of zero or more entries containing CIM_ERROR instances represented as an array of Embedded Instances.
     */
    public static class PROPERTY_ERROR {
        /**
         * name of the property Error
         */
        public final static String NAME = "Error";

    }

    /**
     * Constants of property MethodName
     * The name of the method invoked.
     */
    public static class PROPERTY_METHODNAME {
        /**
         * name of the property MethodName
         */
        public final static String NAME = "MethodName";

    }

    /**
     * Constants of property MethodParameters
     * The parameters of the method, formatted as an EmbeddedObject (with a predefined class name of "__MethodParameters".
     */
    public static class PROPERTY_METHODPARAMETERS {
        /**
         * name of the property MethodParameters
         */
        public final static String NAME = "MethodParameters";

    }

    /**
     * Constants of property PreCall
     * Boolean indicating whether the Indication is sent before the method begins executing (TRUE) or when the method completes (FALSE). When TRUE, the inherited property SourceInstance contains the value of the instance (the properties defined by the Filter's Query clause), before execution of the method. When PreCall is FALSE, SourceInstance embeds the instance as it appears after the completion of the method.
     */
    public static class PROPERTY_PRECALL {
        /**
         * name of the property PreCall
         */
        public final static String NAME = "PreCall";

    }

    /**
     * Constants of property ReturnValue
     * ReturnValue's data is dependent on the PreCall property. When PreCall is TRUE, this property is NULL describing that there is no method return value (since the method has not yet executed). When PreCall is FALSE, ReturnValue contains a string representation of the method's return value.
     */
    public static class PROPERTY_RETURNVALUE {
        /**
         * name of the property ReturnValue
         */
        public final static String NAME = "ReturnValue";

    }

    /**
     * Constants of property ReturnValueType
     * The type of the method return value.
     */
    public static class PROPERTY_RETURNVALUETYPE {
        /**
         * name of the property ReturnValueType
         */
        public final static String NAME = "ReturnValueType";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_boolean = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry boolean (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_boolean = "boolean";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_string = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry string (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_string = "string";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_char16 = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry char16 (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_char16 = "char16";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_uint8 = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry uint8 (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_uint8 = "uint8";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_sint8 = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry sint8 (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_sint8 = "sint8";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_uint16 = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry uint16 (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_uint16 = "uint16";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_sint16 = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry sint16 (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_sint16 = "sint16";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_uint32 = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry uint32 (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_uint32 = "uint32";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_sint32 = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry sint32 (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_sint32 = "sint32";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_uint64 = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry uint64 (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_uint64 = "uint64";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_sint64 = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry sint64 (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_sint64 = "sint64";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_datetime = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry datetime (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_datetime = "datetime";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_real32 = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry real32 (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_real32 = "real32";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_real64 = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry real64 (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_real64 = "real64";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_reference = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry reference (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_reference = "reference";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_boolean.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_boolean;
            }

            if (VALUE_ENTRY_string.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_string;
            }

            if (VALUE_ENTRY_char16.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_char16;
            }

            if (VALUE_ENTRY_uint8.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_uint8;
            }

            if (VALUE_ENTRY_sint8.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_sint8;
            }

            if (VALUE_ENTRY_uint16.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_uint16;
            }

            if (VALUE_ENTRY_sint16.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_sint16;
            }

            if (VALUE_ENTRY_uint32.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_uint32;
            }

            if (VALUE_ENTRY_sint32.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_sint32;
            }

            if (VALUE_ENTRY_uint64.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_uint64;
            }

            if (VALUE_ENTRY_sint64.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_sint64;
            }

            if (VALUE_ENTRY_datetime.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_datetime;
            }

            if (VALUE_ENTRY_real32.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_real32;
            }

            if (VALUE_ENTRY_real64.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_real64;
            }

            if (VALUE_ENTRY_reference.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_reference;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_boolean.intValue()) {
                return VALUE_ENTRY_boolean;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_string.intValue()) {
                return VALUE_ENTRY_string;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_char16.intValue()) {
                return VALUE_ENTRY_char16;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_uint8.intValue()) {
                return VALUE_ENTRY_uint8;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_sint8.intValue()) {
                return VALUE_ENTRY_sint8;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_uint16.intValue()) {
                return VALUE_ENTRY_uint16;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_sint16.intValue()) {
                return VALUE_ENTRY_sint16;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_uint32.intValue()) {
                return VALUE_ENTRY_uint32;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_sint32.intValue()) {
                return VALUE_ENTRY_sint32;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_uint64.intValue()) {
                return VALUE_ENTRY_uint64;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_sint64.intValue()) {
                return VALUE_ENTRY_sint64;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_datetime.intValue()) {
                return VALUE_ENTRY_datetime;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_real32.intValue()) {
                return VALUE_ENTRY_real32;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_real64.intValue()) {
                return VALUE_ENTRY_real64;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_reference.intValue()) {
                return VALUE_ENTRY_reference;
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
         * Value Map for the property ReturnValueType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_boolean,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_string, VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_char16,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_uint8, VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_sint8,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_uint16, VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_sint16,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_uint32,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_sint32,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_uint64,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_sint64,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_datetime,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_real32,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_real64,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_reference };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ReturnValueType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_boolean, VALUE_ENTRY_string,
                VALUE_ENTRY_char16, VALUE_ENTRY_uint8, VALUE_ENTRY_sint8, VALUE_ENTRY_uint16,
                VALUE_ENTRY_sint16, VALUE_ENTRY_uint32, VALUE_ENTRY_sint32, VALUE_ENTRY_uint64,
                VALUE_ENTRY_sint64, VALUE_ENTRY_datetime, VALUE_ENTRY_real32, VALUE_ENTRY_real64,
                VALUE_ENTRY_reference, VALUE_ENTRY_DMTF_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ReturnValueType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_boolean,
                VALUE_ENTRY_string, VALUE_ENTRY_char16, VALUE_ENTRY_uint8, VALUE_ENTRY_sint8,
                VALUE_ENTRY_uint16, VALUE_ENTRY_sint16, VALUE_ENTRY_uint32, VALUE_ENTRY_sint32,
                VALUE_ENTRY_uint64, VALUE_ENTRY_sint64, VALUE_ENTRY_datetime, VALUE_ENTRY_real32,
                VALUE_ENTRY_real64, VALUE_ENTRY_reference };

    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
        String[] parentClassPackageList = CIM_InstIndication.getPackages();

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
     *   CIM_InstMethodCall notifies when an instance's method is invoked.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_InstMethodCall(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_InstMethodCall notifies when an instance's method is invoked.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_InstMethodCall(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_InstMethodCall() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Error", new CIMProperty("Error", CIMDataType.OBJECT_ARRAY_T, null));
        propertiesToCheck.put("MethodName", new CIMProperty("MethodName", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("MethodParameters", new CIMProperty("MethodParameters",
                CIMDataType.CLASS_T, null));
        propertiesToCheck.put("PreCall", new CIMProperty("PreCall", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("ReturnValue", new CIMProperty("ReturnValue", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("ReturnValueType", new CIMProperty("ReturnValueType",
                CIMDataType.UINT16_T, null));

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {
            set_Error(null);
            set_MethodParameters(null);

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    /**
     * Get the property Error
     *     * <br>
     * Error's data is dependent on the PreCall property. When PreCall is TRUE, this property is NULL describing that there is no method Error instances (since the method has not yet executed). When PreCall is FALSE, Error contains an array of zero or more entries containing CIM_ERROR instances represented as an array of Embedded Instances.
     *     */

    public CIM_Error[] get_Error(javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ERROR.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERROR.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        CIMInstance[] instances = (CIMInstance[]) currentProperty.getValue();
        CIM_Error[] result = new CIM_Error[instances.length];
        for (int i = 0; i < instances.length; i++) {
            result[i] = instances[i] != null ? CIM_ErrorHelper.getInstance(client, instances[i]
                    .getObjectPath()) : null;
        }
        return result;

    }

    /**
     * Set the property Error
     * <br>
     * Error's data is dependent on the PreCall property. When PreCall is TRUE, this property is NULL describing that there is no method Error instances (since the method has not yet executed). When PreCall is FALSE, Error contains an array of zero or more entries containing CIM_ERROR instances represented as an array of Embedded Instances.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Error(CIM_Error[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERROR.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Error(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERROR.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Error by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Error(WBEMClient client, String namespace, CIM_Error[] newValue)
            throws WbemsmtException {
        CIM_InstMethodCall fco = new CIM_InstMethodCall(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERROR.NAME);
        if (property != null) {
            property = setPropertyValue_Error(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERROR.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Error
     * <br>
     * Error's data is dependent on the PreCall property. When PreCall is TRUE, this property is NULL describing that there is no method Error instances (since the method has not yet executed). When PreCall is FALSE, Error contains an array of zero or more entries containing CIM_ERROR instances represented as an array of Embedded Instances.
     */

    private static CIMProperty setPropertyValue_Error(CIMProperty currentProperty,
            CIM_Error[] newValue) {
        Object setThis = null;

        CIMInstance[] instances = null;
        if (newValue != null) {
            instances = new CIMInstance[newValue.length];
            for (int i = 0; i < instances.length; i++) {
                instances[i] = newValue[i] != null ? newValue[i].getCimInstance() : null;
            }
        }
        setThis = instances;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),
                CIMDataType.OBJECT_ARRAY_T, setThis, currentProperty.isKey(), currentProperty
                        .isPropagated(), currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MethodName
     *     * <br>
     * The name of the method invoked.
     *     */

    public String get_MethodName() {
        CIMProperty currentProperty = getProperty(PROPERTY_METHODNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_METHODNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property MethodName
     * <br>
     * The name of the method invoked.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MethodName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_METHODNAME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_MethodName(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_METHODNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MethodName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MethodName(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_InstMethodCall fco = new CIM_InstMethodCall(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_METHODNAME.NAME);
        if (property != null) {
            property = setPropertyValue_MethodName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_METHODNAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MethodName
     * <br>
     * The name of the method invoked.
     */

    private static CIMProperty setPropertyValue_MethodName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MethodParameters
     *     * <br>
     * The parameters of the method, formatted as an EmbeddedObject (with a predefined class name of "__MethodParameters".
     *     * 
     * @return a org.sblim.wbemsmt.bl.fco.embeddedobject.WbemsmtEmbeddedObject
     *     */

    public org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject get_MethodParameters(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_METHODPARAMETERS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_METHODPARAMETERS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        Object result = currentProperty.getValue();
        if (result == null) {
            return null;
        }

        if (result instanceof CIMInstance) {
            return new org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject((CIMInstance) result);
        }
        if (result instanceof CIMClass) {
            return new org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject((CIMClass) result);
        }
        throw new WbemsmtException(WbemsmtException.ERR_CIM_TYPE_MISMATCH, "The property "
                + PROPERTY_METHODPARAMETERS.NAME + " is no CIMInstance or CIMClass");

    }

    /**
     * Set the property MethodParameters
     * <br>
     * The parameters of the method, formatted as an EmbeddedObject (with a predefined class name of "__MethodParameters".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MethodParameters(org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_METHODPARAMETERS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_MethodParameters(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_METHODPARAMETERS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MethodParameters by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MethodParameters(WBEMClient client, String namespace,
            org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) throws WbemsmtException {
        CIM_InstMethodCall fco = new CIM_InstMethodCall(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_METHODPARAMETERS.NAME);
        if (property != null) {
            property = setPropertyValue_MethodParameters(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_METHODPARAMETERS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MethodParameters
     * <br>
     * The parameters of the method, formatted as an EmbeddedObject (with a predefined class name of "__MethodParameters".
     */

    private static CIMProperty setPropertyValue_MethodParameters(CIMProperty currentProperty,
            org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getValue() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), CIMDataType.CLASS_T,
                setThis, currentProperty.isKey(), currentProperty.isPropagated(), currentProperty
                        .getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PreCall
     *     * <br>
     * Boolean indicating whether the Indication is sent before the method begins executing (TRUE) or when the method completes (FALSE). When TRUE, the inherited property SourceInstance contains the value of the instance (the properties defined by the Filter's Query clause), before execution of the method. When PreCall is FALSE, SourceInstance embeds the instance as it appears after the completion of the method.
     *     */

    public Boolean get_PreCall() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRECALL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRECALL.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property PreCall
     * <br>
     * Boolean indicating whether the Indication is sent before the method begins executing (TRUE) or when the method completes (FALSE). When TRUE, the inherited property SourceInstance contains the value of the instance (the properties defined by the Filter's Query clause), before execution of the method. When PreCall is FALSE, SourceInstance embeds the instance as it appears after the completion of the method.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PreCall(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRECALL.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PreCall(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRECALL.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PreCall by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PreCall(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        CIM_InstMethodCall fco = new CIM_InstMethodCall(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRECALL.NAME);
        if (property != null) {
            property = setPropertyValue_PreCall(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRECALL.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PreCall
     * <br>
     * Boolean indicating whether the Indication is sent before the method begins executing (TRUE) or when the method completes (FALSE). When TRUE, the inherited property SourceInstance contains the value of the instance (the properties defined by the Filter's Query clause), before execution of the method. When PreCall is FALSE, SourceInstance embeds the instance as it appears after the completion of the method.
     */

    private static CIMProperty setPropertyValue_PreCall(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ReturnValue
     *     * <br>
     * ReturnValue's data is dependent on the PreCall property. When PreCall is TRUE, this property is NULL describing that there is no method return value (since the method has not yet executed). When PreCall is FALSE, ReturnValue contains a string representation of the method's return value.
     *     */

    public String get_ReturnValue() {
        CIMProperty currentProperty = getProperty(PROPERTY_RETURNVALUE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RETURNVALUE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ReturnValue
     * <br>
     * ReturnValue's data is dependent on the PreCall property. When PreCall is TRUE, this property is NULL describing that there is no method return value (since the method has not yet executed). When PreCall is FALSE, ReturnValue contains a string representation of the method's return value.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ReturnValue(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RETURNVALUE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ReturnValue(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RETURNVALUE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ReturnValue by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReturnValue(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_InstMethodCall fco = new CIM_InstMethodCall(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RETURNVALUE.NAME);
        if (property != null) {
            property = setPropertyValue_ReturnValue(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RETURNVALUE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ReturnValue
     * <br>
     * ReturnValue's data is dependent on the PreCall property. When PreCall is TRUE, this property is NULL describing that there is no method return value (since the method has not yet executed). When PreCall is FALSE, ReturnValue contains a string representation of the method's return value.
     */

    private static CIMProperty setPropertyValue_ReturnValue(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ReturnValueType
     *     * <br>
     * The type of the method return value.
     *     */

    public javax.cim.UnsignedInteger16 get_ReturnValueType() {
        CIMProperty currentProperty = getProperty(PROPERTY_RETURNVALUETYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RETURNVALUETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ReturnValueType
     * <br>
     * The type of the method return value.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ReturnValueType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RETURNVALUETYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ReturnValueType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RETURNVALUETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ReturnValueType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReturnValueType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_InstMethodCall fco = new CIM_InstMethodCall(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RETURNVALUETYPE.NAME);
        if (property != null) {
            property = setPropertyValue_ReturnValueType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RETURNVALUETYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ReturnValueType
     * <br>
     * The type of the method return value.
     */

    private static CIMProperty setPropertyValue_ReturnValueType(CIMProperty currentProperty,
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
        return CIM_InstMethodCall.CIM_CLASS_NAME;
    }

}