/**
 * CIM_MetricDefinition.java Â© Copyright IBM Corp. 2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS
 * OF THE COMMON PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/cpl1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: The metrics that are associated with a
 *            UnitOfWork. These metrics usually describe some aspect of a UnitOfWork such as how
 *            much work was done, or the size of the UnitOfWork. For example, the size of a print
 *            job or the number of pages printed could be metrics of a 'print' UnitOfWork. generated
 *            Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_MetricDefinition extends CIM_BaseMetricDefinition {

    public final static String CIM_CLASS_NAME = "CIM_MetricDefinition";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Id
     * A 16 byte value that uniquely identifies the Metric Definition. The use of OSF UUID/GUIDs is recommended.
     */
    public static class PROPERTY_ID {
        /**
         * name of the property Id
         */
        public final static String NAME = "Id";

    }

    /**
     * Constants of property Validity
     * An enumerated value describing when the Metric may be considered valid. Some metrics are valid only at the beginning of a transaction (e.g., bytes to print), while the transaction is running (e.g., percent complete), or when the transaction is finished (e.g., pages printed). If a metric is valid at more than one of the enumerated values, such as both when the unit of work starts and when it stops, it is recommended to not use Validity.
     */
    public static class PROPERTY_VALIDITY {
        /**
         * name of the property Validity
         */
        public final static String NAME = "Validity";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_At_Start = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry At Start (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_At_Start = "At Start";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_In_Middle = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry In Middle (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_In_Middle = "In Middle";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_At_Stop = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry At Stop (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_At_Stop = "At Stop";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_At_Start.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_At_Start;
            }

            if (VALUE_ENTRY_In_Middle.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_In_Middle;
            }

            if (VALUE_ENTRY_At_Stop.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_At_Stop;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_At_Start.intValue()) {
                return VALUE_ENTRY_At_Start;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_In_Middle.intValue()) {
                return VALUE_ENTRY_In_Middle;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_At_Stop.intValue()) {
                return VALUE_ENTRY_At_Stop;
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
         * Value Map for the property Validity   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_At_Start,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_In_Middle,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_At_Stop };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Validity   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_At_Start, VALUE_ENTRY_In_Middle,
                VALUE_ENTRY_At_Stop };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Validity   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_At_Start,
                VALUE_ENTRY_In_Middle, VALUE_ENTRY_At_Stop };

    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
        String[] parentClassPackageList = CIM_BaseMetricDefinition.getPackages();

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
     *   The metrics that are associated with a UnitOfWork. These metrics usually describe some aspect of a UnitOfWork such as how much work was done, or the size of the UnitOfWork. For example, the size of a print job or the number of pages printed could be metrics of a 'print' UnitOfWork.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_MetricDefinition(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The metrics that are associated with a UnitOfWork. These metrics usually describe some aspect of a UnitOfWork such as how much work was done, or the size of the UnitOfWork. For example, the size of a print job or the number of pages printed could be metrics of a 'print' UnitOfWork.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_MetricDefinition(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_MetricDefinition() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Id", new CIMProperty("Id", CIMDataType.STRING_T, null));
        propertiesToCheck.put("Validity", new CIMProperty("Validity", CIMDataType.UINT16_T, null));

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
     * Get the property Id
     *     * <br>
     * A 16 byte value that uniquely identifies the Metric Definition. The use of OSF UUID/GUIDs is recommended.
     *     */

    public String get_Id() {
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
     * A 16 byte value that uniquely identifies the Metric Definition. The use of OSF UUID/GUIDs is recommended.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Id(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ID.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Id(currentProperty, newValue));
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

    public static CIMProperty create_Id(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_MetricDefinition fco = new CIM_MetricDefinition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ID.NAME);
        if (property != null) {
            property = setPropertyValue_Id(property, newValue);
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
     * A 16 byte value that uniquely identifies the Metric Definition. The use of OSF UUID/GUIDs is recommended.
     */

    private static CIMProperty setPropertyValue_Id(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Validity
     *     * <br>
     * An enumerated value describing when the Metric may be considered valid. Some metrics are valid only at the beginning of a transaction (e.g., bytes to print), while the transaction is running (e.g., percent complete), or when the transaction is finished (e.g., pages printed). If a metric is valid at more than one of the enumerated values, such as both when the unit of work starts and when it stops, it is recommended to not use Validity.
     *     */

    public javax.cim.UnsignedInteger16 get_Validity() {
        CIMProperty currentProperty = getProperty(PROPERTY_VALIDITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VALIDITY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property Validity
     * <br>
     * An enumerated value describing when the Metric may be considered valid. Some metrics are valid only at the beginning of a transaction (e.g., bytes to print), while the transaction is running (e.g., percent complete), or when the transaction is finished (e.g., pages printed). If a metric is valid at more than one of the enumerated values, such as both when the unit of work starts and when it stops, it is recommended to not use Validity.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Validity(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VALIDITY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Validity(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VALIDITY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Validity by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Validity(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_MetricDefinition fco = new CIM_MetricDefinition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VALIDITY.NAME);
        if (property != null) {
            property = setPropertyValue_Validity(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VALIDITY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Validity
     * <br>
     * An enumerated value describing when the Metric may be considered valid. Some metrics are valid only at the beginning of a transaction (e.g., bytes to print), while the transaction is running (e.g., percent complete), or when the transaction is finished (e.g., pages printed). If a metric is valid at more than one of the enumerated values, such as both when the unit of work starts and when it stops, it is recommended to not use Validity.
     */

    private static CIMProperty setPropertyValue_Validity(CIMProperty currentProperty,
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
        return CIM_MetricDefinition.CIM_CLASS_NAME;
    }

}