/**
 * CIM_VirtualSystemMigrationCapabilities.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS
 * PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR
 * DISTRIBUTION OF THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a
 * current copy of the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Capabilities of a
 *            CIM_VirtualSystemMigrationService. generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_VirtualSystemMigrationCapabilities extends CIM_Capabilities {

    public final static String CIM_CLASS_NAME = "CIM_VirtualSystemMigrationCapabilities";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property AsynchronousMethodsSupported
     * Enumeration of method identifiers whose implementation may be asynchronous; that is, the operation may not complete immediately and instead the method may return a job.
     */
    public static class PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED {
        /**
         * name of the property AsynchronousMethodsSupported
         */
        public final static String NAME = "AsynchronousMethodsSupported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MigrateVirtualSystemToHostSupported = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry MigrateVirtualSystemToHostSupported (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_MigrateVirtualSystemToHostSupported = "MigrateVirtualSystemToHostSupported";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_MigrateVirtualSystemToSystemSupported = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry MigrateVirtualSystemToSystemSupported (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_MigrateVirtualSystemToSystemSupported = "MigrateVirtualSystemToSystemSupported";

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

            if (VALUE_ENTRY_MigrateVirtualSystemToHostSupported.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MigrateVirtualSystemToHostSupported;
            }

            if (VALUE_ENTRY_MigrateVirtualSystemToSystemSupported.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_MigrateVirtualSystemToSystemSupported;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MigrateVirtualSystemToHostSupported
                    .intValue()) {
                return VALUE_ENTRY_MigrateVirtualSystemToHostSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_MigrateVirtualSystemToSystemSupported
                    .intValue()) {
                return VALUE_ENTRY_MigrateVirtualSystemToSystemSupported;
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
         * Value Map for the property AsynchronousMethodsSupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MigrateVirtualSystemToHostSupported,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_MigrateVirtualSystemToSystemSupported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property AsynchronousMethodsSupported   
         */
        public final static String[] VALUE_ENTRIES = {
                VALUE_ENTRY_MigrateVirtualSystemToHostSupported,
                VALUE_ENTRY_MigrateVirtualSystemToSystemSupported, VALUE_ENTRY_DMTF_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property AsynchronousMethodsSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_MigrateVirtualSystemToHostSupported,
                VALUE_ENTRY_MigrateVirtualSystemToSystemSupported };

    }

    /**
     * Constants of property DestinationHostFormatsSupported
     * Array of format designators. Values indicate that the designated format is supported for input values of the DestinationHost parameter of the MigrateVirtualSystemToHost( ) method or the CheckVirtualSystemIsMigratableToHost( ) method of the associated instance of the CIM_VirtualSystemMigrationService class.
     * Format designators designate the following formats:
     * 2 - Support of the Domain Name text format according to RFC 1035
     * 3 - Support of the IPv4 dotted decimal format according to RFC 1208
     * 4 - Support of the IPv6 text format according to RFC 4291
     */
    public static class PROPERTY_DESTINATIONHOSTFORMATSSUPPORTED {
        /**
         * name of the property DestinationHostFormatsSupported
         */
        public final static String NAME = "DestinationHostFormatsSupported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DomainNameFormatSupported = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry DomainNameFormatSupported (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_DomainNameFormatSupported = "DomainNameFormatSupported";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_IPv4DottedDecimalFormatSupported = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry IPv4DottedDecimalFormatSupported (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_IPv4DottedDecimalFormatSupported = "IPv4DottedDecimalFormatSupported";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_IPv6TextFormatSupported = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry IPv6TextFormatSupported (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_IPv6TextFormatSupported = "IPv6TextFormatSupported";

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

            if (VALUE_ENTRY_DomainNameFormatSupported.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DomainNameFormatSupported;
            }

            if (VALUE_ENTRY_IPv4DottedDecimalFormatSupported.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_IPv4DottedDecimalFormatSupported;
            }

            if (VALUE_ENTRY_IPv6TextFormatSupported.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_IPv6TextFormatSupported;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DomainNameFormatSupported.intValue()) {
                return VALUE_ENTRY_DomainNameFormatSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_IPv4DottedDecimalFormatSupported
                    .intValue()) {
                return VALUE_ENTRY_IPv4DottedDecimalFormatSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_IPv6TextFormatSupported.intValue()) {
                return VALUE_ENTRY_IPv6TextFormatSupported;
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
         * Value Map for the property DestinationHostFormatsSupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DomainNameFormatSupported,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_IPv4DottedDecimalFormatSupported,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_IPv6TextFormatSupported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property DestinationHostFormatsSupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_DomainNameFormatSupported,
                VALUE_ENTRY_IPv4DottedDecimalFormatSupported, VALUE_ENTRY_IPv6TextFormatSupported,
                VALUE_ENTRY_DMTF_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property DestinationHostFormatsSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_DomainNameFormatSupported,
                VALUE_ENTRY_IPv4DottedDecimalFormatSupported, VALUE_ENTRY_IPv6TextFormatSupported };

    }

    /**
     * Constants of property SynchronousMethodsSupported
     * Enumeration of method identifiers whose implementation may be synchronous; that is, the operation may complete immediately and therefore the method may not return a job.
     */
    public static class PROPERTY_SYNCHRONOUSMETHODSSUPPORTED {
        /**
         * name of the property SynchronousMethodsSupported
         */
        public final static String NAME = "SynchronousMethodsSupported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MigrateVirtualSystemToHostSupported = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry MigrateVirtualSystemToHostSupported (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_MigrateVirtualSystemToHostSupported = "MigrateVirtualSystemToHostSupported";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_MigrateVirtualSystemToSystemSupported = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry MigrateVirtualSystemToSystemSupported (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_MigrateVirtualSystemToSystemSupported = "MigrateVirtualSystemToSystemSupported";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CheckVirtualSystemIsMigratableToHostSupported = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry CheckVirtualSystemIsMigratableToHostSupported (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_CheckVirtualSystemIsMigratableToHostSupported = "CheckVirtualSystemIsMigratableToHostSupported";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_CheckVirtualSystemIsMigratableToSystemSupported = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry CheckVirtualSystemIsMigratableToSystemSupported (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_CheckVirtualSystemIsMigratableToSystemSupported = "CheckVirtualSystemIsMigratableToSystemSupported";

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

            if (VALUE_ENTRY_MigrateVirtualSystemToHostSupported.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MigrateVirtualSystemToHostSupported;
            }

            if (VALUE_ENTRY_MigrateVirtualSystemToSystemSupported.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_MigrateVirtualSystemToSystemSupported;
            }

            if (VALUE_ENTRY_CheckVirtualSystemIsMigratableToHostSupported.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CheckVirtualSystemIsMigratableToHostSupported;
            }

            if (VALUE_ENTRY_CheckVirtualSystemIsMigratableToSystemSupported.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_CheckVirtualSystemIsMigratableToSystemSupported;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MigrateVirtualSystemToHostSupported
                    .intValue()) {
                return VALUE_ENTRY_MigrateVirtualSystemToHostSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_MigrateVirtualSystemToSystemSupported
                    .intValue()) {
                return VALUE_ENTRY_MigrateVirtualSystemToSystemSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CheckVirtualSystemIsMigratableToHostSupported
                    .intValue()) {
                return VALUE_ENTRY_CheckVirtualSystemIsMigratableToHostSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_CheckVirtualSystemIsMigratableToSystemSupported
                    .intValue()) {
                return VALUE_ENTRY_CheckVirtualSystemIsMigratableToSystemSupported;
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
         * Value Map for the property SynchronousMethodsSupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MigrateVirtualSystemToHostSupported,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_MigrateVirtualSystemToSystemSupported,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CheckVirtualSystemIsMigratableToHostSupported,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_CheckVirtualSystemIsMigratableToSystemSupported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property SynchronousMethodsSupported   
         */
        public final static String[] VALUE_ENTRIES = {
                VALUE_ENTRY_MigrateVirtualSystemToHostSupported,
                VALUE_ENTRY_MigrateVirtualSystemToSystemSupported,
                VALUE_ENTRY_CheckVirtualSystemIsMigratableToHostSupported,
                VALUE_ENTRY_CheckVirtualSystemIsMigratableToSystemSupported,
                VALUE_ENTRY_DMTF_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property SynchronousMethodsSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_MigrateVirtualSystemToHostSupported,
                VALUE_ENTRY_MigrateVirtualSystemToSystemSupported,
                VALUE_ENTRY_CheckVirtualSystemIsMigratableToHostSupported,
                VALUE_ENTRY_CheckVirtualSystemIsMigratableToSystemSupported };

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
     *   Capabilities of a CIM_VirtualSystemMigrationService.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_VirtualSystemMigrationCapabilities(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Capabilities of a CIM_VirtualSystemMigrationService.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_VirtualSystemMigrationCapabilities(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_VirtualSystemMigrationCapabilities() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AsynchronousMethodsSupported", new CIMProperty(
                "AsynchronousMethodsSupported", CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("DestinationHostFormatsSupported", new CIMProperty(
                "DestinationHostFormatsSupported", CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("SynchronousMethodsSupported", new CIMProperty(
                "SynchronousMethodsSupported", CIMDataType.UINT16_ARRAY_T, null));

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
     * Get the property AsynchronousMethodsSupported
     *     * <br>
     * Enumeration of method identifiers whose implementation may be asynchronous; that is, the operation may not complete immediately and instead the method may return a job.
     *     */

    public javax.cim.UnsignedInteger16[] get_AsynchronousMethodsSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property AsynchronousMethodsSupported
     * <br>
     * Enumeration of method identifiers whose implementation may be asynchronous; that is, the operation may not complete immediately and instead the method may return a job.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AsynchronousMethodsSupported(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_AsynchronousMethodsSupported(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AsynchronousMethodsSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AsynchronousMethodsSupported(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_VirtualSystemMigrationCapabilities fco = new CIM_VirtualSystemMigrationCapabilities(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_AsynchronousMethodsSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AsynchronousMethodsSupported
     * <br>
     * Enumeration of method identifiers whose implementation may be asynchronous; that is, the operation may not complete immediately and instead the method may return a job.
     */

    private static CIMProperty setPropertyValue_AsynchronousMethodsSupported(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DestinationHostFormatsSupported
     *     * <br>
     * Array of format designators. Values indicate that the designated format is supported for input values of the DestinationHost parameter of the MigrateVirtualSystemToHost( ) method or the CheckVirtualSystemIsMigratableToHost( ) method of the associated instance of the CIM_VirtualSystemMigrationService class.
     * Format designators designate the following formats:
     * 2 - Support of the Domain Name text format according to RFC 1035
     * 3 - Support of the IPv4 dotted decimal format according to RFC 1208
     * 4 - Support of the IPv6 text format according to RFC 4291
     *     */

    public javax.cim.UnsignedInteger16[] get_DestinationHostFormatsSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_DESTINATIONHOSTFORMATSSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DESTINATIONHOSTFORMATSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property DestinationHostFormatsSupported
     * <br>
     * Array of format designators. Values indicate that the designated format is supported for input values of the DestinationHost parameter of the MigrateVirtualSystemToHost( ) method or the CheckVirtualSystemIsMigratableToHost( ) method of the associated instance of the CIM_VirtualSystemMigrationService class.
     * Format designators designate the following formats:
     * 2 - Support of the Domain Name text format according to RFC 1035
     * 3 - Support of the IPv4 dotted decimal format according to RFC 1208
     * 4 - Support of the IPv6 text format according to RFC 4291
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DestinationHostFormatsSupported(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DESTINATIONHOSTFORMATSSUPPORTED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_DestinationHostFormatsSupported(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DESTINATIONHOSTFORMATSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DestinationHostFormatsSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DestinationHostFormatsSupported(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_VirtualSystemMigrationCapabilities fco = new CIM_VirtualSystemMigrationCapabilities(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DESTINATIONHOSTFORMATSSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_DestinationHostFormatsSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DESTINATIONHOSTFORMATSSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DestinationHostFormatsSupported
     * <br>
     * Array of format designators. Values indicate that the designated format is supported for input values of the DestinationHost parameter of the MigrateVirtualSystemToHost( ) method or the CheckVirtualSystemIsMigratableToHost( ) method of the associated instance of the CIM_VirtualSystemMigrationService class.
     * Format designators designate the following formats:
     * 2 - Support of the Domain Name text format according to RFC 1035
     * 3 - Support of the IPv4 dotted decimal format according to RFC 1208
     * 4 - Support of the IPv6 text format according to RFC 4291
     */

    private static CIMProperty setPropertyValue_DestinationHostFormatsSupported(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SynchronousMethodsSupported
     *     * <br>
     * Enumeration of method identifiers whose implementation may be synchronous; that is, the operation may complete immediately and therefore the method may not return a job.
     *     */

    public javax.cim.UnsignedInteger16[] get_SynchronousMethodsSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_SYNCHRONOUSMETHODSSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property SynchronousMethodsSupported
     * <br>
     * Enumeration of method identifiers whose implementation may be synchronous; that is, the operation may complete immediately and therefore the method may not return a job.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SynchronousMethodsSupported(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYNCHRONOUSMETHODSSUPPORTED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SynchronousMethodsSupported(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SynchronousMethodsSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SynchronousMethodsSupported(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_VirtualSystemMigrationCapabilities fco = new CIM_VirtualSystemMigrationCapabilities(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYNCHRONOUSMETHODSSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_SynchronousMethodsSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SynchronousMethodsSupported
     * <br>
     * Enumeration of method identifiers whose implementation may be synchronous; that is, the operation may complete immediately and therefore the method may not return a job.
     */

    private static CIMProperty setPropertyValue_SynchronousMethodsSupported(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16[] newValue) {
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
        return CIM_VirtualSystemMigrationCapabilities.CIM_CLASS_NAME;
    }

}