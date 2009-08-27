/**
 * CIM_IndicationSubscriptionAlert.java Â© Copyright IBM Corp. 2006,2007 THIS FILE IS PROVIDED UNDER
 * THE TER MS OF THE COMMON PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF
 * THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of
 * the Common Public License from http://www.opensource.org/licenses/cpl1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: This class represents a special type of Alert
 *            Indication to notify a CIM Listener of a state change affecting referencing
 *            subscriptions. A CIM Client would typically not subscribe to one of these Indications,
 *            rather it would be sent to any Listener potentially affected by the state change
 *            affecting referencing subscriptions. generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_IndicationSubscriptionAlert extends CIM_AlertIndication {

    public final static String CIM_CLASS_NAME = "CIM_IndicationSubscriptionAlert";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property IndicationSubscriptionStateChange
     * The type of state change affecting the Indication Subscription. Possible values include: 
     * (0) "Unknown" - the type of state change is unknown; 
     * (1) "Other" - another type of state change as specified in the OtherIndicationSubscriptionStateChange; 
     * (2) "Indication Service Shutdown" - the Indication Service is shutting down; 
     * (3) "Subcomponent Missing" - a subcomponent of the Indication Service (e.g. a provider) is missing; 
     * (4) "Subcomponent Disabled" - a subcomponent of the Indication Service has been disabled; 
     * (5) "Subcomponent Enabled" - a subcomponent of the Indication Service been enabled (re-enabled).
     */
    public static class PROPERTY_INDICATIONSUBSCRIPTIONSTATECHANGE {
        /**
         * name of the property IndicationSubscriptionStateChange
         */
        public final static String NAME = "IndicationSubscriptionStateChange";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Indication_Service_Shutdown = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Indication Service Shutdown (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Indication_Service_Shutdown = "Indication Service Shutdown";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Subcomponent_Missing = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Subcomponent Missing (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Subcomponent_Missing = "Subcomponent Missing";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Subcomponent_Disabled = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Subcomponent Disabled (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Subcomponent_Disabled = "Subcomponent Disabled";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Subcomponent_Enabled = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Subcomponent Enabled (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Subcomponent_Enabled = "Subcomponent Enabled";

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

            if (VALUE_ENTRY_Indication_Service_Shutdown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Indication_Service_Shutdown;
            }

            if (VALUE_ENTRY_Subcomponent_Missing.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Subcomponent_Missing;
            }

            if (VALUE_ENTRY_Subcomponent_Disabled.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Subcomponent_Disabled;
            }

            if (VALUE_ENTRY_Subcomponent_Enabled.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Subcomponent_Enabled;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Indication_Service_Shutdown.intValue()) {
                return VALUE_ENTRY_Indication_Service_Shutdown;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Subcomponent_Missing.intValue()) {
                return VALUE_ENTRY_Subcomponent_Missing;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Subcomponent_Disabled.intValue()) {
                return VALUE_ENTRY_Subcomponent_Disabled;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Subcomponent_Enabled.intValue()) {
                return VALUE_ENTRY_Subcomponent_Enabled;
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
         * Value Map for the property IndicationSubscriptionStateChange   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Indication_Service_Shutdown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Subcomponent_Missing,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Subcomponent_Disabled,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Subcomponent_Enabled };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property IndicationSubscriptionStateChange   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Indication_Service_Shutdown, VALUE_ENTRY_Subcomponent_Missing,
                VALUE_ENTRY_Subcomponent_Disabled, VALUE_ENTRY_Subcomponent_Enabled };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property IndicationSubscriptionStateChange   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Indication_Service_Shutdown,
                VALUE_ENTRY_Subcomponent_Missing, VALUE_ENTRY_Subcomponent_Disabled,
                VALUE_ENTRY_Subcomponent_Enabled };

    }

    /**
     * Constants of property IndicationSubscriptions
     * An IndicationSubscriptionAlert potentially affects one or more IndicationSubscriptions. This property lists the IndicationSubscriptions as an array of CIMObjectPaths with format <NamespacePath>:<ClassName>.Filter="<Value1>", Handler="<Value2>". Value1 and Value2 are in turn the CIMObjectPaths of the IndicationFilter and ListenerDestination, thus each having the format <NamespacePath>:<ClassName>.SystemCreationClassName="<ValueA>", SystemName="<ValueB>",CreationClassName="<ValueC>", Name="<ValueD>". 
     * This array MUST contain only the subscriptions applicable to the Listener to receive the IndicationSubscriptionAlert.
     */
    public static class PROPERTY_INDICATIONSUBSCRIPTIONS {
        /**
         * name of the property IndicationSubscriptions
         */
        public final static String NAME = "IndicationSubscriptions";

    }

    /**
     * Constants of property OtherIndicationSubscriptionStateChange
     * A string defining "Other" values for IndicationSubscriptionStateChange. This value MUST be set to a non NULL value when IndicationSubscriptionStateChange is set to a value of 1 ("Other"). For all other values of IndicationSubscriptionStateChange, the value of this string MUST be set to NULL.
     */
    public static class PROPERTY_OTHERINDICATIONSUBSCRIPTIONSTATECHANGE {
        /**
         * name of the property OtherIndicationSubscriptionStateChange
         */
        public final static String NAME = "OtherIndicationSubscriptionStateChange";

    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
        String[] parentClassPackageList = CIM_AlertIndication.getPackages();

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
     *   This class represents a special type of Alert Indication to notify a CIM Listener of a state change affecting referencing subscriptions. A CIM Client would typically not subscribe to one of these Indications, rather it would be sent to any Listener potentially affected by the state change affecting referencing subscriptions.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_IndicationSubscriptionAlert(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   This class represents a special type of Alert Indication to notify a CIM Listener of a state change affecting referencing subscriptions. A CIM Client would typically not subscribe to one of these Indications, rather it would be sent to any Listener potentially affected by the state change affecting referencing subscriptions.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_IndicationSubscriptionAlert(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_IndicationSubscriptionAlert() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("IndicationSubscriptionStateChange", new CIMProperty(
                "IndicationSubscriptionStateChange", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("IndicationSubscriptions", new CIMProperty("IndicationSubscriptions",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("OtherIndicationSubscriptionStateChange", new CIMProperty(
                "OtherIndicationSubscriptionStateChange", CIMDataType.STRING_T, null));

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
     * Get the property IndicationSubscriptionStateChange
     *     * <br>
     * The type of state change affecting the Indication Subscription. Possible values include: 
     * (0) "Unknown" - the type of state change is unknown; 
     * (1) "Other" - another type of state change as specified in the OtherIndicationSubscriptionStateChange; 
     * (2) "Indication Service Shutdown" - the Indication Service is shutting down; 
     * (3) "Subcomponent Missing" - a subcomponent of the Indication Service (e.g. a provider) is missing; 
     * (4) "Subcomponent Disabled" - a subcomponent of the Indication Service has been disabled; 
     * (5) "Subcomponent Enabled" - a subcomponent of the Indication Service been enabled (re-enabled).
     *     */

    public javax.cim.UnsignedInteger16 get_IndicationSubscriptionStateChange() {
        CIMProperty currentProperty = getProperty(PROPERTY_INDICATIONSUBSCRIPTIONSTATECHANGE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INDICATIONSUBSCRIPTIONSTATECHANGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property IndicationSubscriptionStateChange
     * <br>
     * The type of state change affecting the Indication Subscription. Possible values include: 
     * (0) "Unknown" - the type of state change is unknown; 
     * (1) "Other" - another type of state change as specified in the OtherIndicationSubscriptionStateChange; 
     * (2) "Indication Service Shutdown" - the Indication Service is shutting down; 
     * (3) "Subcomponent Missing" - a subcomponent of the Indication Service (e.g. a provider) is missing; 
     * (4) "Subcomponent Disabled" - a subcomponent of the Indication Service has been disabled; 
     * (5) "Subcomponent Enabled" - a subcomponent of the Indication Service been enabled (re-enabled).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IndicationSubscriptionStateChange(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INDICATIONSUBSCRIPTIONSTATECHANGE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IndicationSubscriptionStateChange(currentProperty,
                    newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INDICATIONSUBSCRIPTIONSTATECHANGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IndicationSubscriptionStateChange by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IndicationSubscriptionStateChange(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_IndicationSubscriptionAlert fco = new CIM_IndicationSubscriptionAlert(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INDICATIONSUBSCRIPTIONSTATECHANGE.NAME);
        if (property != null) {
            property = setPropertyValue_IndicationSubscriptionStateChange(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INDICATIONSUBSCRIPTIONSTATECHANGE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IndicationSubscriptionStateChange
     * <br>
     * The type of state change affecting the Indication Subscription. Possible values include: 
     * (0) "Unknown" - the type of state change is unknown; 
     * (1) "Other" - another type of state change as specified in the OtherIndicationSubscriptionStateChange; 
     * (2) "Indication Service Shutdown" - the Indication Service is shutting down; 
     * (3) "Subcomponent Missing" - a subcomponent of the Indication Service (e.g. a provider) is missing; 
     * (4) "Subcomponent Disabled" - a subcomponent of the Indication Service has been disabled; 
     * (5) "Subcomponent Enabled" - a subcomponent of the Indication Service been enabled (re-enabled).
     */

    private static CIMProperty setPropertyValue_IndicationSubscriptionStateChange(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IndicationSubscriptions
     *     * <br>
     * An IndicationSubscriptionAlert potentially affects one or more IndicationSubscriptions. This property lists the IndicationSubscriptions as an array of CIMObjectPaths with format <NamespacePath>:<ClassName>.Filter="<Value1>", Handler="<Value2>". Value1 and Value2 are in turn the CIMObjectPaths of the IndicationFilter and ListenerDestination, thus each having the format <NamespacePath>:<ClassName>.SystemCreationClassName="<ValueA>", SystemName="<ValueB>",CreationClassName="<ValueC>", Name="<ValueD>". 
     * This array MUST contain only the subscriptions applicable to the Listener to receive the IndicationSubscriptionAlert.
     *     */

    public String[] get_IndicationSubscriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_INDICATIONSUBSCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INDICATIONSUBSCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property IndicationSubscriptions
     * <br>
     * An IndicationSubscriptionAlert potentially affects one or more IndicationSubscriptions. This property lists the IndicationSubscriptions as an array of CIMObjectPaths with format <NamespacePath>:<ClassName>.Filter="<Value1>", Handler="<Value2>". Value1 and Value2 are in turn the CIMObjectPaths of the IndicationFilter and ListenerDestination, thus each having the format <NamespacePath>:<ClassName>.SystemCreationClassName="<ValueA>", SystemName="<ValueB>",CreationClassName="<ValueC>", Name="<ValueD>". 
     * This array MUST contain only the subscriptions applicable to the Listener to receive the IndicationSubscriptionAlert.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IndicationSubscriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INDICATIONSUBSCRIPTIONS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IndicationSubscriptions(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INDICATIONSUBSCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IndicationSubscriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IndicationSubscriptions(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_IndicationSubscriptionAlert fco = new CIM_IndicationSubscriptionAlert(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INDICATIONSUBSCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_IndicationSubscriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INDICATIONSUBSCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IndicationSubscriptions
     * <br>
     * An IndicationSubscriptionAlert potentially affects one or more IndicationSubscriptions. This property lists the IndicationSubscriptions as an array of CIMObjectPaths with format <NamespacePath>:<ClassName>.Filter="<Value1>", Handler="<Value2>". Value1 and Value2 are in turn the CIMObjectPaths of the IndicationFilter and ListenerDestination, thus each having the format <NamespacePath>:<ClassName>.SystemCreationClassName="<ValueA>", SystemName="<ValueB>",CreationClassName="<ValueC>", Name="<ValueD>". 
     * This array MUST contain only the subscriptions applicable to the Listener to receive the IndicationSubscriptionAlert.
     */

    private static CIMProperty setPropertyValue_IndicationSubscriptions(
            CIMProperty currentProperty, String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherIndicationSubscriptionStateChange
     *     * <br>
     * A string defining "Other" values for IndicationSubscriptionStateChange. This value MUST be set to a non NULL value when IndicationSubscriptionStateChange is set to a value of 1 ("Other"). For all other values of IndicationSubscriptionStateChange, the value of this string MUST be set to NULL.
     *     */

    public String get_OtherIndicationSubscriptionStateChange() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERINDICATIONSUBSCRIPTIONSTATECHANGE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERINDICATIONSUBSCRIPTIONSTATECHANGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherIndicationSubscriptionStateChange
     * <br>
     * A string defining "Other" values for IndicationSubscriptionStateChange. This value MUST be set to a non NULL value when IndicationSubscriptionStateChange is set to a value of 1 ("Other"). For all other values of IndicationSubscriptionStateChange, the value of this string MUST be set to NULL.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherIndicationSubscriptionStateChange(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERINDICATIONSUBSCRIPTIONSTATECHANGE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherIndicationSubscriptionStateChange(currentProperty,
                    newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERINDICATIONSUBSCRIPTIONSTATECHANGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherIndicationSubscriptionStateChange by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherIndicationSubscriptionStateChange(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_IndicationSubscriptionAlert fco = new CIM_IndicationSubscriptionAlert(client, namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_OTHERINDICATIONSUBSCRIPTIONSTATECHANGE.NAME);
        if (property != null) {
            property = setPropertyValue_OtherIndicationSubscriptionStateChange(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERINDICATIONSUBSCRIPTIONSTATECHANGE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherIndicationSubscriptionStateChange
     * <br>
     * A string defining "Other" values for IndicationSubscriptionStateChange. This value MUST be set to a non NULL value when IndicationSubscriptionStateChange is set to a value of 1 ("Other"). For all other values of IndicationSubscriptionStateChange, the value of this string MUST be set to NULL.
     */

    private static CIMProperty setPropertyValue_OtherIndicationSubscriptionStateChange(
            CIMProperty currentProperty, String newValue) {
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
        return CIM_IndicationSubscriptionAlert.CIM_CLASS_NAME;
    }

}