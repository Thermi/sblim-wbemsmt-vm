/** 
 * CIM_ResourcePoolConfigurationCapabilities.java
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
 * Description: This class exposes the supported capabilities of a ResourcePoolConfigurationService. Not all implementations will support all methods on the service. Clients may use instances of this class to determine which methods are supported. The same method must not be listed in both lists. Implementations must either be non-blocking and use a Job for long running operations, or always block until the operation completes.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ResourcePoolConfigurationCapabilities extends CIM_Capabilities {

    public final static String CIM_CLASS_NAME = "CIM_ResourcePoolConfigurationCapabilities";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property AsynchronousMethodsSupported
     * This property reflects the methods of the associated service class that are supported that may return a Job.
     */
    public static class PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED {
        /**
         * name of the property AsynchronousMethodsSupported
         */
        public final static String NAME = "AsynchronousMethodsSupported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CreateResourcePool_is_supported = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry CreateResourcePool is supported (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_CreateResourcePool_is_supported = "CreateResourcePool is supported";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CreateChild_ResourcePool_is_supported = new javax.cim.UnsignedInteger32(
                "3");

        /**
         * constant for value entry CreateChild ResourcePool is supported (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_CreateChild_ResourcePool_is_supported = "CreateChild ResourcePool is supported";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DeleteResourcePool_is_supported = new javax.cim.UnsignedInteger32(
                "4");

        /**
         * constant for value entry DeleteResourcePool is supported (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_DeleteResourcePool_is_supported = "DeleteResourcePool is supported";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_AddResourcesToResourcePool_is_supported = new javax.cim.UnsignedInteger32(
                "5");

        /**
         * constant for value entry AddResourcesToResourcePool is supported (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_AddResourcesToResourcePool_is_supported = "AddResourcesToResourcePool is supported";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry RemoveResourcesFromResourcePool is supported (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported = "RemoveResourcesFromResourcePool is supported";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_ChangeParentResourcePool_is_supported = new javax.cim.UnsignedInteger32(
                "7");

        /**
         * constant for value entry ChangeParentResourcePool is supported (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_ChangeParentResourcePool_is_supported = "ChangeParentResourcePool is supported";

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
         * constant for value entry Vendor Reserved (corresponds to mapEntry 32768..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Reserved = "Vendor Reserved";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@2c062c06
        public static javax.cim.UnsignedInteger32 getValueMapEntry(String value) {

            if (VALUE_ENTRY_CreateResourcePool_is_supported.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CreateResourcePool_is_supported;
            }

            if (VALUE_ENTRY_CreateChild_ResourcePool_is_supported.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CreateChild_ResourcePool_is_supported;
            }

            if (VALUE_ENTRY_DeleteResourcePool_is_supported.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DeleteResourcePool_is_supported;
            }

            if (VALUE_ENTRY_AddResourcesToResourcePool_is_supported.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_AddResourcesToResourcePool_is_supported;
            }

            if (VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported;
            }

            if (VALUE_ENTRY_ChangeParentResourcePool_is_supported.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_ChangeParentResourcePool_is_supported;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CreateResourcePool_is_supported
                    .intValue()) {
                return VALUE_ENTRY_CreateResourcePool_is_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CreateChild_ResourcePool_is_supported
                    .intValue()) {
                return VALUE_ENTRY_CreateChild_ResourcePool_is_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DeleteResourcePool_is_supported
                    .intValue()) {
                return VALUE_ENTRY_DeleteResourcePool_is_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_AddResourcesToResourcePool_is_supported
                    .intValue()) {
                return VALUE_ENTRY_AddResourcesToResourcePool_is_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported
                    .intValue()) {
                return VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_ChangeParentResourcePool_is_supported
                    .intValue()) {
                return VALUE_ENTRY_ChangeParentResourcePool_is_supported;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Reserved;
            }
            return VALUE_ENTRY_DMTF_Reserved;

        }

        /**
         * get the ValueEntries of the given valueMapEntries
         * @param values the values to find the ValueMapEntries for
         * @return the array with ValueMap entries. Some of them may be null to if no valueMap entry was found
         */

        public static javax.cim.UnsignedInteger32[] getValueMapEntries(String[] values) {
            javax.cim.UnsignedInteger32[] result = new javax.cim.UnsignedInteger32[values.length];

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

        public static String[] getValueEntries(javax.cim.UnsignedInteger32[] values) {
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
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CreateResourcePool_is_supported,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CreateChild_ResourcePool_is_supported,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DeleteResourcePool_is_supported,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_AddResourcesToResourcePool_is_supported,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_ChangeParentResourcePool_is_supported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property AsynchronousMethodsSupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_CreateResourcePool_is_supported,
                VALUE_ENTRY_CreateChild_ResourcePool_is_supported,
                VALUE_ENTRY_DeleteResourcePool_is_supported,
                VALUE_ENTRY_AddResourcesToResourcePool_is_supported,
                VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported,
                VALUE_ENTRY_ChangeParentResourcePool_is_supported, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property AsynchronousMethodsSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_CreateResourcePool_is_supported,
                VALUE_ENTRY_CreateChild_ResourcePool_is_supported,
                VALUE_ENTRY_DeleteResourcePool_is_supported,
                VALUE_ENTRY_AddResourcesToResourcePool_is_supported,
                VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported,
                VALUE_ENTRY_ChangeParentResourcePool_is_supported };

    }

    /**
     * Constants of property SynchronousMethodsSupported
     * This property reflects the methods of the associated service class that are supported andblock until completed (no Job is returned.)
     */
    public static class PROPERTY_SYNCHRONOUSMETHODSSUPPORTED {
        /**
         * name of the property SynchronousMethodsSupported
         */
        public final static String NAME = "SynchronousMethodsSupported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CreateResourcePool_is_supported = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry CreateResourcePool is supported (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_CreateResourcePool_is_supported = "CreateResourcePool is supported";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CreateChild_ResourcePool_is_supported = new javax.cim.UnsignedInteger32(
                "3");

        /**
         * constant for value entry CreateChild ResourcePool is supported (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_CreateChild_ResourcePool_is_supported = "CreateChild ResourcePool is supported";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DeleteResourcePool_is_supported = new javax.cim.UnsignedInteger32(
                "4");

        /**
         * constant for value entry DeleteResourcePool is supported (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_DeleteResourcePool_is_supported = "DeleteResourcePool is supported";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_AddResourcesToResourcePool_is_supported = new javax.cim.UnsignedInteger32(
                "5");

        /**
         * constant for value entry AddResourcesToResourcePool is supported (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_AddResourcesToResourcePool_is_supported = "AddResourcesToResourcePool is supported";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry RemoveResourcesFromResourcePool is supported (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported = "RemoveResourcesFromResourcePool is supported";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_CIM_ChangeParentResourcePool_is_supported = new javax.cim.UnsignedInteger32(
                "7");

        /**
         * constant for value entry CIM_ChangeParentResourcePool is supported (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_CIM_ChangeParentResourcePool_is_supported = "CIM_ChangeParentResourcePool is supported";

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
         * constant for value entry Vendor Reserved (corresponds to mapEntry 32768..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Reserved = "Vendor Reserved";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@10f010f0
        public static javax.cim.UnsignedInteger32 getValueMapEntry(String value) {

            if (VALUE_ENTRY_CreateResourcePool_is_supported.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CreateResourcePool_is_supported;
            }

            if (VALUE_ENTRY_CreateChild_ResourcePool_is_supported.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CreateChild_ResourcePool_is_supported;
            }

            if (VALUE_ENTRY_DeleteResourcePool_is_supported.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DeleteResourcePool_is_supported;
            }

            if (VALUE_ENTRY_AddResourcesToResourcePool_is_supported.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_AddResourcesToResourcePool_is_supported;
            }

            if (VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported;
            }

            if (VALUE_ENTRY_CIM_ChangeParentResourcePool_is_supported.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_CIM_ChangeParentResourcePool_is_supported;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CreateResourcePool_is_supported
                    .intValue()) {
                return VALUE_ENTRY_CreateResourcePool_is_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CreateChild_ResourcePool_is_supported
                    .intValue()) {
                return VALUE_ENTRY_CreateChild_ResourcePool_is_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DeleteResourcePool_is_supported
                    .intValue()) {
                return VALUE_ENTRY_DeleteResourcePool_is_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_AddResourcesToResourcePool_is_supported
                    .intValue()) {
                return VALUE_ENTRY_AddResourcesToResourcePool_is_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported
                    .intValue()) {
                return VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_CIM_ChangeParentResourcePool_is_supported
                    .intValue()) {
                return VALUE_ENTRY_CIM_ChangeParentResourcePool_is_supported;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Reserved;
            }
            return VALUE_ENTRY_DMTF_Reserved;

        }

        /**
         * get the ValueEntries of the given valueMapEntries
         * @param values the values to find the ValueMapEntries for
         * @return the array with ValueMap entries. Some of them may be null to if no valueMap entry was found
         */

        public static javax.cim.UnsignedInteger32[] getValueMapEntries(String[] values) {
            javax.cim.UnsignedInteger32[] result = new javax.cim.UnsignedInteger32[values.length];

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

        public static String[] getValueEntries(javax.cim.UnsignedInteger32[] values) {
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
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CreateResourcePool_is_supported,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CreateChild_ResourcePool_is_supported,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DeleteResourcePool_is_supported,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_AddResourcesToResourcePool_is_supported,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_CIM_ChangeParentResourcePool_is_supported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property SynchronousMethodsSupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_CreateResourcePool_is_supported,
                VALUE_ENTRY_CreateChild_ResourcePool_is_supported,
                VALUE_ENTRY_DeleteResourcePool_is_supported,
                VALUE_ENTRY_AddResourcesToResourcePool_is_supported,
                VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported,
                VALUE_ENTRY_CIM_ChangeParentResourcePool_is_supported, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property SynchronousMethodsSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_CreateResourcePool_is_supported,
                VALUE_ENTRY_CreateChild_ResourcePool_is_supported,
                VALUE_ENTRY_DeleteResourcePool_is_supported,
                VALUE_ENTRY_AddResourcesToResourcePool_is_supported,
                VALUE_ENTRY_RemoveResourcesFromResourcePool_is_supported,
                VALUE_ENTRY_CIM_ChangeParentResourcePool_is_supported };

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
     *   This class exposes the supported capabilities of a ResourcePoolConfigurationService. Not all implementations will support all methods on the service. Clients may use instances of this class to determine which methods are supported. The same method must not be listed in both lists. Implementations must either be non-blocking and use a Job for long running operations, or always block until the operation completes.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ResourcePoolConfigurationCapabilities(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   This class exposes the supported capabilities of a ResourcePoolConfigurationService. Not all implementations will support all methods on the service. Clients may use instances of this class to determine which methods are supported. The same method must not be listed in both lists. Implementations must either be non-blocking and use a Job for long running operations, or always block until the operation completes.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ResourcePoolConfigurationCapabilities(CIMInstance cimInstance)
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
    protected CIM_ResourcePoolConfigurationCapabilities() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AsynchronousMethodsSupported", new CIMProperty(
                "AsynchronousMethodsSupported", CIMDataType.UINT32_ARRAY_T, null));
        propertiesToCheck.put("SynchronousMethodsSupported", new CIMProperty(
                "SynchronousMethodsSupported", CIMDataType.UINT32_ARRAY_T, null));

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
     * This property reflects the methods of the associated service class that are supported that may return a Job.
     *     */

    public javax.cim.UnsignedInteger32[] get_AsynchronousMethodsSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ASYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32[]) currentProperty.getValue();

    }

    /**
     * Set the property AsynchronousMethodsSupported
     * <br>
     * This property reflects the methods of the associated service class that are supported that may return a Job.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AsynchronousMethodsSupported(javax.cim.UnsignedInteger32[] newValue) {
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
            String namespace, javax.cim.UnsignedInteger32[] newValue) throws WbemsmtException {
        CIM_ResourcePoolConfigurationCapabilities fco = new CIM_ResourcePoolConfigurationCapabilities(
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
     * This property reflects the methods of the associated service class that are supported that may return a Job.
     */

    private static CIMProperty setPropertyValue_AsynchronousMethodsSupported(
            CIMProperty currentProperty, javax.cim.UnsignedInteger32[] newValue) {
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
     * This property reflects the methods of the associated service class that are supported andblock until completed (no Job is returned.)
     *     */

    public javax.cim.UnsignedInteger32[] get_SynchronousMethodsSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_SYNCHRONOUSMETHODSSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYNCHRONOUSMETHODSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32[]) currentProperty.getValue();

    }

    /**
     * Set the property SynchronousMethodsSupported
     * <br>
     * This property reflects the methods of the associated service class that are supported andblock until completed (no Job is returned.)
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SynchronousMethodsSupported(javax.cim.UnsignedInteger32[] newValue) {
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
            String namespace, javax.cim.UnsignedInteger32[] newValue) throws WbemsmtException {
        CIM_ResourcePoolConfigurationCapabilities fco = new CIM_ResourcePoolConfigurationCapabilities(
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
     * This property reflects the methods of the associated service class that are supported andblock until completed (no Job is returned.)
     */

    private static CIMProperty setPropertyValue_SynchronousMethodsSupported(
            CIMProperty currentProperty, javax.cim.UnsignedInteger32[] newValue) {
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
        return CIM_ResourcePoolConfigurationCapabilities.CIM_CLASS_NAME;
    }

}