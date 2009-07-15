/** 
 * CIM_VirtualSystemSnapshotServiceCapabilities.java
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
 * Description: The CIM_VirtualSystemSnapshotServiceCapabilities class defines the properties that describe the capabilities of a virtual system snapshot service, like for example which snapshot operations are implemented.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_VirtualSystemSnapshotServiceCapabilities extends CIM_Capabilities {

    public final static String CIM_CLASS_NAME = "CIM_VirtualSystemSnapshotServiceCapabilities";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property AynchronousMethodsSupported
     * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemSnapshotService that is supported synchronously and asynchronously by the implementation.
     */
    public static class PROPERTY_AYNCHRONOUSMETHODSSUPPORTED {
        /**
         * name of the property AynchronousMethodsSupported
         */
        public final static String NAME = "AynchronousMethodsSupported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CreateSnapshotSupported = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry CreateSnapshotSupported (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_CreateSnapshotSupported = "CreateSnapshotSupported";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySnapshotSupported = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry DestroySnapshotSupported (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_DestroySnapshotSupported = "DestroySnapshotSupported";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ApplySnapshotSupported = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry ApplySnapshotSupported (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_ApplySnapshotSupported = "ApplySnapshotSupported";

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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@1f2e1f2e
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_CreateSnapshotSupported.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CreateSnapshotSupported;
            }

            if (VALUE_ENTRY_DestroySnapshotSupported.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySnapshotSupported;
            }

            if (VALUE_ENTRY_ApplySnapshotSupported.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ApplySnapshotSupported;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CreateSnapshotSupported.intValue()) {
                return VALUE_ENTRY_CreateSnapshotSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySnapshotSupported.intValue()) {
                return VALUE_ENTRY_DestroySnapshotSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ApplySnapshotSupported.intValue()) {
                return VALUE_ENTRY_ApplySnapshotSupported;
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
         * Value Map for the property AynchronousMethodsSupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CreateSnapshotSupported,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySnapshotSupported,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ApplySnapshotSupported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property AynchronousMethodsSupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_CreateSnapshotSupported,
                VALUE_ENTRY_DestroySnapshotSupported, VALUE_ENTRY_ApplySnapshotSupported,
                VALUE_ENTRY_DMTF_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property AynchronousMethodsSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_CreateSnapshotSupported, VALUE_ENTRY_DestroySnapshotSupported,
                VALUE_ENTRY_ApplySnapshotSupported };

    }

    /**
     * Constants of property SnapshotTypesSupported
     * Supported snapshot types:
     * Full Snapshot: Complete snapshot of the virtual system.
     * Disk Snapshot: Snapshot of virtual system disks.
     */
    public static class PROPERTY_SNAPSHOTTYPESSUPPORTED {
        /**
         * name of the property SnapshotTypesSupported
         */
        public final static String NAME = "SnapshotTypesSupported";

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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@52925292
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
         * Value Map for the property SnapshotTypesSupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Full_Snapshot,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disk_Snapshot };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property SnapshotTypesSupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Full_Snapshot,
                VALUE_ENTRY_Disk_Snapshot, VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property SnapshotTypesSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Full_Snapshot,
                VALUE_ENTRY_Disk_Snapshot };

    }

    /**
     * Constants of property SynchronousMethodsSupported
     * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemSnapshotService that is supported synchronously by the implementation.
     */
    public static class PROPERTY_SYNCHRONOUSMETHODSSUPPORTED {
        /**
         * name of the property SynchronousMethodsSupported
         */
        public final static String NAME = "SynchronousMethodsSupported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CreateSnapshotSupported = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry CreateSnapshotSupported (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_CreateSnapshotSupported = "CreateSnapshotSupported";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySnapshotSupported = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry DestroySnapshotSupported (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_DestroySnapshotSupported = "DestroySnapshotSupported";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ApplySnapshotSupported = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry ApplySnapshotSupported (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_ApplySnapshotSupported = "ApplySnapshotSupported";

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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@1aa01aa0
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_CreateSnapshotSupported.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CreateSnapshotSupported;
            }

            if (VALUE_ENTRY_DestroySnapshotSupported.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySnapshotSupported;
            }

            if (VALUE_ENTRY_ApplySnapshotSupported.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ApplySnapshotSupported;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CreateSnapshotSupported.intValue()) {
                return VALUE_ENTRY_CreateSnapshotSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySnapshotSupported.intValue()) {
                return VALUE_ENTRY_DestroySnapshotSupported;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ApplySnapshotSupported.intValue()) {
                return VALUE_ENTRY_ApplySnapshotSupported;
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
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CreateSnapshotSupported,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DestroySnapshotSupported,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ApplySnapshotSupported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property SynchronousMethodsSupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_CreateSnapshotSupported,
                VALUE_ENTRY_DestroySnapshotSupported, VALUE_ENTRY_ApplySnapshotSupported,
                VALUE_ENTRY_DMTF_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property SynchronousMethodsSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_CreateSnapshotSupported, VALUE_ENTRY_DestroySnapshotSupported,
                VALUE_ENTRY_ApplySnapshotSupported };

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
     *   The CIM_VirtualSystemSnapshotServiceCapabilities class defines the properties that describe the capabilities of a virtual system snapshot service, like for example which snapshot operations are implemented.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_VirtualSystemSnapshotServiceCapabilities(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The CIM_VirtualSystemSnapshotServiceCapabilities class defines the properties that describe the capabilities of a virtual system snapshot service, like for example which snapshot operations are implemented.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_VirtualSystemSnapshotServiceCapabilities(CIMInstance cimInstance)
            throws WbemsmtException {

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
    protected CIM_VirtualSystemSnapshotServiceCapabilities() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AynchronousMethodsSupported", new CIMProperty(
                "AynchronousMethodsSupported", CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("SnapshotTypesSupported", new CIMProperty("SnapshotTypesSupported",
                CIMDataType.UINT16_ARRAY_T, null));
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
     * Get the property AynchronousMethodsSupported
     *     * <br>
     * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemSnapshotService that is supported synchronously and asynchronously by the implementation.
     *     */

    public javax.cim.UnsignedInteger16[] get_AynchronousMethodsSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_AYNCHRONOUSMETHODSSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_AYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property AynchronousMethodsSupported
     * <br>
     * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemSnapshotService that is supported synchronously and asynchronously by the implementation.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AynchronousMethodsSupported(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_AYNCHRONOUSMETHODSSUPPORTED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_AynchronousMethodsSupported(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_AYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AynchronousMethodsSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AynchronousMethodsSupported(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_VirtualSystemSnapshotServiceCapabilities fco = new CIM_VirtualSystemSnapshotServiceCapabilities(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AYNCHRONOUSMETHODSSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_AynchronousMethodsSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_AYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AynchronousMethodsSupported
     * <br>
     * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemSnapshotService that is supported synchronously and asynchronously by the implementation.
     */

    private static CIMProperty setPropertyValue_AynchronousMethodsSupported(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SnapshotTypesSupported
     *     * <br>
     * Supported snapshot types:
     * Full Snapshot: Complete snapshot of the virtual system.
     * Disk Snapshot: Snapshot of virtual system disks.
     *     */

    public javax.cim.UnsignedInteger16[] get_SnapshotTypesSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_SNAPSHOTTYPESSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SNAPSHOTTYPESSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property SnapshotTypesSupported
     * <br>
     * Supported snapshot types:
     * Full Snapshot: Complete snapshot of the virtual system.
     * Disk Snapshot: Snapshot of virtual system disks.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SnapshotTypesSupported(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SNAPSHOTTYPESSUPPORTED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SnapshotTypesSupported(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SNAPSHOTTYPESSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SnapshotTypesSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SnapshotTypesSupported(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_VirtualSystemSnapshotServiceCapabilities fco = new CIM_VirtualSystemSnapshotServiceCapabilities(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SNAPSHOTTYPESSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_SnapshotTypesSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SNAPSHOTTYPESSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SnapshotTypesSupported
     * <br>
     * Supported snapshot types:
     * Full Snapshot: Complete snapshot of the virtual system.
     * Disk Snapshot: Snapshot of virtual system disks.
     */

    private static CIMProperty setPropertyValue_SnapshotTypesSupported(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
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
     * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemSnapshotService that is supported synchronously by the implementation.
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
     * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemSnapshotService that is supported synchronously by the implementation.
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
        CIM_VirtualSystemSnapshotServiceCapabilities fco = new CIM_VirtualSystemSnapshotServiceCapabilities(
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
     * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemSnapshotService that is supported synchronously by the implementation.
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
        return CIM_VirtualSystemSnapshotServiceCapabilities.CIM_CLASS_NAME;
    }

}