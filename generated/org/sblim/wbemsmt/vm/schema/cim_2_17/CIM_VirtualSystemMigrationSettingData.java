/**
 * CIM_VirtualSystemMigrationSettingData.java Â© Copyright IBM Corp. 2006,2007 THIS FILE IS PROVIDED
 * UNDER THE TER MS OF THE COMMON PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR
 * DISTRIBUTION OF THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a
 * current copy of the Common Public License from http://www.opensource.org/licenses/cpl1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: CIM_MigrationSettingData defines the
 *            parameters to control a virtual system migration implementation, as managed by a
 *            CIM_VirtualSystemMigrationService. It is expected that a migration implementation will
 *            subclass this class to add implementation-specific migration options. generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_VirtualSystemMigrationSettingData extends CIM_SettingData {

    public final static String CIM_CLASS_NAME = "CIM_VirtualSystemMigrationSettingData";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property MigrationType
     * MigrationType describes a type of migration operation to be performed.
     * A value of 2 - Virtual System is to be migrated in a 'live' manner such that the running of the Virtual System is minimally impacted during the move.
     * A value of 3 - Virtual System will be temporarily paused prior to migration and then resume running after it is moved.
     * A value of 4 - The Virtual System will be quiesced to a stopped state prior to migration and then restarted after it is moved.
     */
    public static class PROPERTY_MIGRATIONTYPE {
        /**
         * name of the property MigrationType
         */
        public final static String NAME = "MigrationType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Live = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Live (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Live = "Live";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Resume = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Resume (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Resume = "Resume";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Restart = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Restart (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Restart = "Restart";

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

            if (VALUE_ENTRY_Live.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Live;
            }

            if (VALUE_ENTRY_Resume.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Resume;
            }

            if (VALUE_ENTRY_Restart.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Restart;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Live.intValue()) {
                return VALUE_ENTRY_Live;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Resume.intValue()) {
                return VALUE_ENTRY_Resume;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Restart.intValue()) {
                return VALUE_ENTRY_Restart;
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
         * Value Map for the property MigrationType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Live, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Resume,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Restart };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property MigrationType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Live, VALUE_ENTRY_Resume, VALUE_ENTRY_Restart };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property MigrationType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Live, VALUE_ENTRY_Resume, VALUE_ENTRY_Restart };

    }

    /**
     * Constants of property Priority
     * Priority specifies a relative migration importance which the virtual system migration implementation may use to order or otherwise give preference among multiple pending migration requests. The lower the value, the higher the priority. A value of 0 indicates:
     * - in migration requests the default priority
     * - otherwise that priorities are not supported
     */
    public static class PROPERTY_PRIORITY {
        /**
         * name of the property Priority
         */
        public final static String NAME = "Priority";

    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
        String[] parentClassPackageList = CIM_SettingData.getPackages();

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
     *   CIM_MigrationSettingData defines the parameters to control a virtual system migration implementation, as managed by a CIM_VirtualSystemMigrationService. It is expected that a migration implementation will subclass this class to add implementation-specific migration options.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_VirtualSystemMigrationSettingData(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_MigrationSettingData defines the parameters to control a virtual system migration implementation, as managed by a CIM_VirtualSystemMigrationService. It is expected that a migration implementation will subclass this class to add implementation-specific migration options.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_VirtualSystemMigrationSettingData(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_VirtualSystemMigrationSettingData() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("MigrationType", new CIMProperty("MigrationType",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Priority", new CIMProperty("Priority", CIMDataType.UINT16_T, null));

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
     * Get the property MigrationType
     *     * <br>
     * MigrationType describes a type of migration operation to be performed.
     * A value of 2 - Virtual System is to be migrated in a 'live' manner such that the running of the Virtual System is minimally impacted during the move.
     * A value of 3 - Virtual System will be temporarily paused prior to migration and then resume running after it is moved.
     * A value of 4 - The Virtual System will be quiesced to a stopped state prior to migration and then restarted after it is moved.
     *     */

    public javax.cim.UnsignedInteger16 get_MigrationType() {
        CIMProperty currentProperty = getProperty(PROPERTY_MIGRATIONTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MIGRATIONTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property MigrationType
     * <br>
     * MigrationType describes a type of migration operation to be performed.
     * A value of 2 - Virtual System is to be migrated in a 'live' manner such that the running of the Virtual System is minimally impacted during the move.
     * A value of 3 - Virtual System will be temporarily paused prior to migration and then resume running after it is moved.
     * A value of 4 - The Virtual System will be quiesced to a stopped state prior to migration and then restarted after it is moved.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MigrationType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MIGRATIONTYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_MigrationType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MIGRATIONTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MigrationType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MigrationType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_VirtualSystemMigrationSettingData fco = new CIM_VirtualSystemMigrationSettingData(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MIGRATIONTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_MigrationType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MIGRATIONTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MigrationType
     * <br>
     * MigrationType describes a type of migration operation to be performed.
     * A value of 2 - Virtual System is to be migrated in a 'live' manner such that the running of the Virtual System is minimally impacted during the move.
     * A value of 3 - Virtual System will be temporarily paused prior to migration and then resume running after it is moved.
     * A value of 4 - The Virtual System will be quiesced to a stopped state prior to migration and then restarted after it is moved.
     */

    private static CIMProperty setPropertyValue_MigrationType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Priority
     *     * <br>
     * Priority specifies a relative migration importance which the virtual system migration implementation may use to order or otherwise give preference among multiple pending migration requests. The lower the value, the higher the priority. A value of 0 indicates:
     * - in migration requests the default priority
     * - otherwise that priorities are not supported
     *     */

    public javax.cim.UnsignedInteger16 get_Priority() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIORITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRIORITY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property Priority
     * <br>
     * Priority specifies a relative migration importance which the virtual system migration implementation may use to order or otherwise give preference among multiple pending migration requests. The lower the value, the higher the priority. A value of 0 indicates:
     * - in migration requests the default priority
     * - otherwise that priorities are not supported
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Priority(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIORITY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Priority(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRIORITY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Priority by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Priority(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_VirtualSystemMigrationSettingData fco = new CIM_VirtualSystemMigrationSettingData(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRIORITY.NAME);
        if (property != null) {
            property = setPropertyValue_Priority(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRIORITY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Priority
     * <br>
     * Priority specifies a relative migration importance which the virtual system migration implementation may use to order or otherwise give preference among multiple pending migration requests. The lower the value, the higher the priority. A value of 0 indicates:
     * - in migration requests the default priority
     * - otherwise that priorities are not supported
     */

    private static CIMProperty setPropertyValue_Priority(CIMProperty currentProperty,
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
        return CIM_VirtualSystemMigrationSettingData.CIM_CLASS_NAME;
    }

}