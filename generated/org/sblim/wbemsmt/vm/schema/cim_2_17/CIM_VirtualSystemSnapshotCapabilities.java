/** 
 * CIM_VirtualSystemSnapshotCapabilities.java
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
 * Description: The CIM_VirtualSystemSnapshotCapabilities class defines the properties that describe the capabilities of a virtual system with respect to snapshots, like for example the set of snapshot operations that it enabled for a virtual system.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_VirtualSystemSnapshotCapabilities extends CIM_Capabilities {

    public final static String CIM_CLASS_NAME = "CIM_VirtualSystemSnapshotCapabilities";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property GuestOSNotificationEnabled
     * Boolean flag indicating the capability of the snapshot service to notify the guest operation system that runs within the virtual system about the imminent snapshot operation.
     */
    public static class PROPERTY_GUESTOSNOTIFICATIONENABLED {
        /**
         * name of the property GuestOSNotificationEnabled
         */
        public final static String NAME = "GuestOSNotificationEnabled";

    }

    /**
     * Constants of property SnapshotTypesEnabled
     * Enumeration of snapshot type identifiers each designating a snapshot type that is presently enabled for the virtual system that is referenced via the CIM_ElementCapabilities association.
     */
    public static class PROPERTY_SNAPSHOTTYPESENABLED {
        /**
         * name of the property SnapshotTypesEnabled
         */
        public final static String NAME = "SnapshotTypesEnabled";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Full_Snapshot = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Full Snapshot (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Full_Snapshot = "Full Snapshot";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disk_Snapshot = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Disk Snapshot (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Disk_Snapshot = "Disk Snapshot";

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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@fe40fe4
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Full_Snapshot.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Full_Snapshot;
            }

            if (VALUE_ENTRY_Disk_Snapshot.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disk_Snapshot;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Full_Snapshot.intValue()) {
                return VALUE_ENTRY_Full_Snapshot;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disk_Snapshot.intValue()) {
                return VALUE_ENTRY_Disk_Snapshot;
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
         * Value Map for the property SnapshotTypesEnabled   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Full_Snapshot,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disk_Snapshot };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property SnapshotTypesEnabled   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Full_Snapshot,
                VALUE_ENTRY_Disk_Snapshot, VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property SnapshotTypesEnabled   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Full_Snapshot,
                VALUE_ENTRY_Disk_Snapshot };

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
     *   The CIM_VirtualSystemSnapshotCapabilities class defines the properties that describe the capabilities of a virtual system with respect to snapshots, like for example the set of snapshot operations that it enabled for a virtual system.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_VirtualSystemSnapshotCapabilities(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The CIM_VirtualSystemSnapshotCapabilities class defines the properties that describe the capabilities of a virtual system with respect to snapshots, like for example the set of snapshot operations that it enabled for a virtual system.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_VirtualSystemSnapshotCapabilities(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_VirtualSystemSnapshotCapabilities() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("GuestOSNotificationEnabled", new CIMProperty(
                "GuestOSNotificationEnabled", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("SnapshotTypesEnabled", new CIMProperty("SnapshotTypesEnabled",
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
     * Get the property GuestOSNotificationEnabled
     *     * <br>
     * Boolean flag indicating the capability of the snapshot service to notify the guest operation system that runs within the virtual system about the imminent snapshot operation.
     *     */

    public Boolean get_GuestOSNotificationEnabled() {
        CIMProperty currentProperty = getProperty(PROPERTY_GUESTOSNOTIFICATIONENABLED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_GUESTOSNOTIFICATIONENABLED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property GuestOSNotificationEnabled
     * <br>
     * Boolean flag indicating the capability of the snapshot service to notify the guest operation system that runs within the virtual system about the imminent snapshot operation.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_GuestOSNotificationEnabled(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_GUESTOSNOTIFICATIONENABLED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_GuestOSNotificationEnabled(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_GUESTOSNOTIFICATIONENABLED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property GuestOSNotificationEnabled by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_GuestOSNotificationEnabled(WBEMClient client,
            String namespace, Boolean newValue) throws WbemsmtException {
        CIM_VirtualSystemSnapshotCapabilities fco = new CIM_VirtualSystemSnapshotCapabilities(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_GUESTOSNOTIFICATIONENABLED.NAME);
        if (property != null) {
            property = setPropertyValue_GuestOSNotificationEnabled(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_GUESTOSNOTIFICATIONENABLED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property GuestOSNotificationEnabled
     * <br>
     * Boolean flag indicating the capability of the snapshot service to notify the guest operation system that runs within the virtual system about the imminent snapshot operation.
     */

    private static CIMProperty setPropertyValue_GuestOSNotificationEnabled(
            CIMProperty currentProperty, Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SnapshotTypesEnabled
     *     * <br>
     * Enumeration of snapshot type identifiers each designating a snapshot type that is presently enabled for the virtual system that is referenced via the CIM_ElementCapabilities association.
     *     */

    public javax.cim.UnsignedInteger16[] get_SnapshotTypesEnabled() {
        CIMProperty currentProperty = getProperty(PROPERTY_SNAPSHOTTYPESENABLED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SNAPSHOTTYPESENABLED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property SnapshotTypesEnabled
     * <br>
     * Enumeration of snapshot type identifiers each designating a snapshot type that is presently enabled for the virtual system that is referenced via the CIM_ElementCapabilities association.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SnapshotTypesEnabled(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SNAPSHOTTYPESENABLED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SnapshotTypesEnabled(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SNAPSHOTTYPESENABLED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SnapshotTypesEnabled by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SnapshotTypesEnabled(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_VirtualSystemSnapshotCapabilities fco = new CIM_VirtualSystemSnapshotCapabilities(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SNAPSHOTTYPESENABLED.NAME);
        if (property != null) {
            property = setPropertyValue_SnapshotTypesEnabled(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SNAPSHOTTYPESENABLED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SnapshotTypesEnabled
     * <br>
     * Enumeration of snapshot type identifiers each designating a snapshot type that is presently enabled for the virtual system that is referenced via the CIM_ElementCapabilities association.
     */

    private static CIMProperty setPropertyValue_SnapshotTypesEnabled(CIMProperty currentProperty,
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
        return CIM_VirtualSystemSnapshotCapabilities.CIM_CLASS_NAME;
    }

}