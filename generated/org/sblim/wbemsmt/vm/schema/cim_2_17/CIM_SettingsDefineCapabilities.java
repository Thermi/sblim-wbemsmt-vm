/**
 * CIM_SettingsDefineCapabilities.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS PROVIDED UNDER
 * THE TERMS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF
 * THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of
 * the Common Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: This association indicates that the non-null,
 *            non-key set of properties of the component SettingData instance specifies some
 *            capabilities of the associated Capabilities instance. The interpretation of the set of
 *            properties in the associated SettingData is governed by the properties: PropertyPolicy
 *            and ValueRole. For a particular Capabilities instance, the complete set of Component
 *            SettingData instances, together with properties of the Capabilities instance itself,
 *            defines the overall range of supported capabilities. PropertyPolicy determines whether
 *            the properties of the set are interpreted independently or as a whole (i.e.
 *            correlated.) ValueRole further qualifies the members of the set. This association
 *            eliminates the need to define and maintain corresponding property definitions and
 *            values in both a Capabilities subclass and a SettingData subclass. Typically these
 *            setting instances will be published along with the associated Capabilities instance
 *            and will not be modifiable by the client. generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_SettingsDefineCapabilities extends CIM_Component {

    public final static String CIM_CLASS_NAME = "CIM_SettingsDefineCapabilities";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property PropertyPolicy
     * PropertyPolicy defines whether or not the non-null, non-key properties of the associated SettingData instance are treated independently or as a correlated set. For instance, an independent set of maximum properties might be defined, when there is no relationship between each property. On the other hand, several correlated sets of maximum properties might need to be defined when the maximum values of each are dependent on some of the others.
     */
    public static class PROPERTY_PROPERTYPOLICY {
        /**
         * name of the property PropertyPolicy
         */
        public final static String NAME = "PropertyPolicy";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Independent = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Independent (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Independent = "Independent";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Correlated = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Correlated (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Correlated = "Correlated";

        /**
         * constant for value map entry 2..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 2.. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Independent.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Independent;
            }

            if (VALUE_ENTRY_Correlated.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Correlated;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Independent.intValue()) {
                return VALUE_ENTRY_Independent;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Correlated.intValue()) {
                return VALUE_ENTRY_Correlated;
            }

            if (iValue >= 2) {
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
         * Value Map for the property PropertyPolicy   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Independent,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Correlated };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property PropertyPolicy   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Independent,
                VALUE_ENTRY_Correlated, VALUE_ENTRY_DMTF_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property PropertyPolicy   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Independent,
                VALUE_ENTRY_Correlated };

    }

    /**
     * Constants of property ValueRange
     * The ValueRange property indicates further semantics on the interpretation of all non-null, non-key properties of the Component SettingData.
     * "Point" indicates that this SettingData instance provides a single set of values.
     * "Minimums", "Maximums", and "Increments", are only evaluated against non-null, non-key, non-enumerated, non-boolean, numeric properties of the SettingData instance. Each property of that set shall be mathematically comparable to other instances of that property.
     * "Minimums" indicates that this SettingData instance provides minimum values for evaluated properties. When used with PropertyPolicy = "Independent", only one such setting per particular SettingData instance shall be specified for any Capabilities. Unless restricted by a Maximums on the same set of properties, all values that compare higher than the specified values are also considered to be supported by the associated capabilities instance. 
     * "Maximums" indicates that this SettingData instance provides maximum values for evaluated properties. When used with PropertyPolicy = "Independent", only one such setting per particular SettingData instance shall be specified for any Capabilities. Unless restricted by a Minimums on the same set of properties, all values that compare lower than the specified values are also considered to be supported by the associated capabilities instance.
     * "Increments" indicates that this SettingData instance provides increment values for evaluated properties. For the associated Capabilities, if an evaluated property currently has no corresponding minimums or maximums, then the property has no affect. Otherwise, for each evaluated property: its value x shall be between the minimum and maximum, inclusively, and shall have the property that both the result of maximum minus x and the result of x minus minimum are each an integer multiple of the increment. If either minimum or maximum is not specified and the other is, then the missing value shall be respectively assumed to be the lowest or highest supported value for the property's data-type. Additionally, if both a minimum and a maximum are specified for an evaluated property, then the result of maximum minus minimum shall be an integer multiple of the increment.
     */
    public static class PROPERTY_VALUERANGE {
        /**
         * name of the property ValueRange
         */
        public final static String NAME = "ValueRange";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Point = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Point (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Point = "Point";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Minimums = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Minimums (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Minimums = "Minimums";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Maximums = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Maximums (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Maximums = "Maximums";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Increments = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Increments (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Increments = "Increments";

        /**
         * constant for value map entry 4..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 4.. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Point.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Point;
            }

            if (VALUE_ENTRY_Minimums.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Minimums;
            }

            if (VALUE_ENTRY_Maximums.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Maximums;
            }

            if (VALUE_ENTRY_Increments.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Increments;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Point.intValue()) {
                return VALUE_ENTRY_Point;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Minimums.intValue()) {
                return VALUE_ENTRY_Minimums;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Maximums.intValue()) {
                return VALUE_ENTRY_Maximums;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Increments.intValue()) {
                return VALUE_ENTRY_Increments;
            }

            if (iValue >= 4) {
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
         * Value Map for the property ValueRange   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Point,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Minimums,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Maximums,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Increments };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ValueRange   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Point, VALUE_ENTRY_Minimums,
                VALUE_ENTRY_Maximums, VALUE_ENTRY_Increments, VALUE_ENTRY_DMTF_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ValueRange   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Point,
                VALUE_ENTRY_Minimums, VALUE_ENTRY_Maximums, VALUE_ENTRY_Increments };

    }

    /**
     * Constants of property ValueRole
     * The ValueRole property indicates further semantics on the interpretation of the non-null, non-key properties of the Component SettingData.
     * "Default" indicates that property values of the component SettingData instance will be used as default values, when a new SettingData instance is created for elements whose capabilities are defined by the associated Capabilities instance.
     * Across instances of settingdata, for particular properties having the same semantic purpose, at most one such settingdata instance shall be specified as a default.
     * "Optimal" indicates that the SettingData instance represents optimal setting values for elements associated with the associated capabilities instance. Multiple component SettingData instances may be declared as optimal."Mean" indicates that the non-null, non-key, non-enumerated, non-boolean, numeric properties of the associated SettingData instance represents an average point along some dimension. For different combinations of SettingData properties, multiple component SettingData instances may be declared as "Mean". "Supported" indicates that the non-null, non-key properties of the Component SettingData instance represents a set of supported property values that are not otherwise qualified.
     */
    public static class PROPERTY_VALUEROLE {
        /**
         * name of the property ValueRole
         */
        public final static String NAME = "ValueRole";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Default = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Default (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Default = "Default";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Optimal = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Optimal (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Optimal = "Optimal";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Mean = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Mean (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Mean = "Mean";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Supported = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Supported (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Supported = "Supported";

        /**
         * constant for value map entry 4..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 4.. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Default.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Default;
            }

            if (VALUE_ENTRY_Optimal.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Optimal;
            }

            if (VALUE_ENTRY_Mean.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Mean;
            }

            if (VALUE_ENTRY_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Supported;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Default.intValue()) {
                return VALUE_ENTRY_Default;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Optimal.intValue()) {
                return VALUE_ENTRY_Optimal;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Mean.intValue()) {
                return VALUE_ENTRY_Mean;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Supported.intValue()) {
                return VALUE_ENTRY_Supported;
            }

            if (iValue >= 4) {
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
         * Value Map for the property ValueRole   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Default,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Optimal, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Mean,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Supported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ValueRole   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Default, VALUE_ENTRY_Optimal,
                VALUE_ENTRY_Mean, VALUE_ENTRY_Supported, VALUE_ENTRY_DMTF_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ValueRole   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Default,
                VALUE_ENTRY_Optimal, VALUE_ENTRY_Mean, VALUE_ENTRY_Supported };

    }

    /**
     * Constants of property GroupComponent
     * 
     */
    public static class PROPERTY_GROUPCOMPONENT_CIM_CAPABILITIES {
        /**
         * name of the property GroupComponent
         */
        public final static String NAME = "GroupComponent";

    }

    /**
     * Constants of property PartComponent
     * 
     */
    public static class PROPERTY_PARTCOMPONENT_CIM_SETTINGDATA {
        /**
         * name of the property PartComponent
         */
        public final static String NAME = "PartComponent";

    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
        String[] parentClassPackageList = CIM_Component.getPackages();

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
     *   This association indicates that the non-null, non-key set of properties of the component SettingData instance specifies some capabilities of the associated Capabilities instance. The interpretation of the set of properties in the associated SettingData is governed by the properties: PropertyPolicy and ValueRole.
     * For a particular Capabilities instance, the complete set of Component SettingData instances, together with properties of the Capabilities instance itself, defines the overall range of supported capabilities.
     * PropertyPolicy determines whether the properties of the set are interpreted independently or as a whole (i.e. correlated.)
     * ValueRole further qualifies the members of the set.
     * This association eliminates the need to define and maintain corresponding property definitions and values in both a Capabilities subclass and a SettingData subclass.
     * Typically these setting instances will be published along with the associated Capabilities instance and will not be modifiable by the client.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_SettingsDefineCapabilities(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   This association indicates that the non-null, non-key set of properties of the component SettingData instance specifies some capabilities of the associated Capabilities instance. The interpretation of the set of properties in the associated SettingData is governed by the properties: PropertyPolicy and ValueRole.
     * For a particular Capabilities instance, the complete set of Component SettingData instances, together with properties of the Capabilities instance itself, defines the overall range of supported capabilities.
     * PropertyPolicy determines whether the properties of the set are interpreted independently or as a whole (i.e. correlated.)
     * ValueRole further qualifies the members of the set.
     * This association eliminates the need to define and maintain corresponding property definitions and values in both a Capabilities subclass and a SettingData subclass.
     * Typically these setting instances will be published along with the associated Capabilities instance and will not be modifiable by the client.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_SettingsDefineCapabilities(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_SettingsDefineCapabilities() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("PropertyPolicy", new CIMProperty("PropertyPolicy",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ValueRange", new CIMProperty("ValueRange", CIMDataType.UINT16_T,
                null));
        propertiesToCheck
                .put("ValueRole", new CIMProperty("ValueRole", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("GroupComponent", new CIMProperty("GroupComponent", new CIMDataType(
                CIM_Capabilities.CIM_CLASS_NAME), null));
        propertiesToCheck.put("PartComponent", new CIMProperty("PartComponent", new CIMDataType(
                CIM_SettingData.CIM_CLASS_NAME), null));

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
     * Get the property PropertyPolicy
     *     * <br>
     * PropertyPolicy defines whether or not the non-null, non-key properties of the associated SettingData instance are treated independently or as a correlated set. For instance, an independent set of maximum properties might be defined, when there is no relationship between each property. On the other hand, several correlated sets of maximum properties might need to be defined when the maximum values of each are dependent on some of the others.
     *     */

    public javax.cim.UnsignedInteger16 get_PropertyPolicy() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROPERTYPOLICY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROPERTYPOLICY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property PropertyPolicy
     * <br>
     * PropertyPolicy defines whether or not the non-null, non-key properties of the associated SettingData instance are treated independently or as a correlated set. For instance, an independent set of maximum properties might be defined, when there is no relationship between each property. On the other hand, several correlated sets of maximum properties might need to be defined when the maximum values of each are dependent on some of the others.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PropertyPolicy(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROPERTYPOLICY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PropertyPolicy(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROPERTYPOLICY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PropertyPolicy by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PropertyPolicy(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SettingsDefineCapabilities fco = new CIM_SettingsDefineCapabilities(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROPERTYPOLICY.NAME);
        if (property != null) {
            property = setPropertyValue_PropertyPolicy(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROPERTYPOLICY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PropertyPolicy
     * <br>
     * PropertyPolicy defines whether or not the non-null, non-key properties of the associated SettingData instance are treated independently or as a correlated set. For instance, an independent set of maximum properties might be defined, when there is no relationship between each property. On the other hand, several correlated sets of maximum properties might need to be defined when the maximum values of each are dependent on some of the others.
     */

    private static CIMProperty setPropertyValue_PropertyPolicy(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ValueRange
     *     * <br>
     * The ValueRange property indicates further semantics on the interpretation of all non-null, non-key properties of the Component SettingData.
     * "Point" indicates that this SettingData instance provides a single set of values.
     * "Minimums", "Maximums", and "Increments", are only evaluated against non-null, non-key, non-enumerated, non-boolean, numeric properties of the SettingData instance. Each property of that set shall be mathematically comparable to other instances of that property.
     * "Minimums" indicates that this SettingData instance provides minimum values for evaluated properties. When used with PropertyPolicy = "Independent", only one such setting per particular SettingData instance shall be specified for any Capabilities. Unless restricted by a Maximums on the same set of properties, all values that compare higher than the specified values are also considered to be supported by the associated capabilities instance. 
     * "Maximums" indicates that this SettingData instance provides maximum values for evaluated properties. When used with PropertyPolicy = "Independent", only one such setting per particular SettingData instance shall be specified for any Capabilities. Unless restricted by a Minimums on the same set of properties, all values that compare lower than the specified values are also considered to be supported by the associated capabilities instance.
     * "Increments" indicates that this SettingData instance provides increment values for evaluated properties. For the associated Capabilities, if an evaluated property currently has no corresponding minimums or maximums, then the property has no affect. Otherwise, for each evaluated property: its value x shall be between the minimum and maximum, inclusively, and shall have the property that both the result of maximum minus x and the result of x minus minimum are each an integer multiple of the increment. If either minimum or maximum is not specified and the other is, then the missing value shall be respectively assumed to be the lowest or highest supported value for the property's data-type. Additionally, if both a minimum and a maximum are specified for an evaluated property, then the result of maximum minus minimum shall be an integer multiple of the increment.
     *     */

    public javax.cim.UnsignedInteger16 get_ValueRange() {
        CIMProperty currentProperty = getProperty(PROPERTY_VALUERANGE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VALUERANGE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ValueRange
     * <br>
     * The ValueRange property indicates further semantics on the interpretation of all non-null, non-key properties of the Component SettingData.
     * "Point" indicates that this SettingData instance provides a single set of values.
     * "Minimums", "Maximums", and "Increments", are only evaluated against non-null, non-key, non-enumerated, non-boolean, numeric properties of the SettingData instance. Each property of that set shall be mathematically comparable to other instances of that property.
     * "Minimums" indicates that this SettingData instance provides minimum values for evaluated properties. When used with PropertyPolicy = "Independent", only one such setting per particular SettingData instance shall be specified for any Capabilities. Unless restricted by a Maximums on the same set of properties, all values that compare higher than the specified values are also considered to be supported by the associated capabilities instance. 
     * "Maximums" indicates that this SettingData instance provides maximum values for evaluated properties. When used with PropertyPolicy = "Independent", only one such setting per particular SettingData instance shall be specified for any Capabilities. Unless restricted by a Minimums on the same set of properties, all values that compare lower than the specified values are also considered to be supported by the associated capabilities instance.
     * "Increments" indicates that this SettingData instance provides increment values for evaluated properties. For the associated Capabilities, if an evaluated property currently has no corresponding minimums or maximums, then the property has no affect. Otherwise, for each evaluated property: its value x shall be between the minimum and maximum, inclusively, and shall have the property that both the result of maximum minus x and the result of x minus minimum are each an integer multiple of the increment. If either minimum or maximum is not specified and the other is, then the missing value shall be respectively assumed to be the lowest or highest supported value for the property's data-type. Additionally, if both a minimum and a maximum are specified for an evaluated property, then the result of maximum minus minimum shall be an integer multiple of the increment.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ValueRange(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VALUERANGE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ValueRange(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VALUERANGE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ValueRange by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ValueRange(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SettingsDefineCapabilities fco = new CIM_SettingsDefineCapabilities(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VALUERANGE.NAME);
        if (property != null) {
            property = setPropertyValue_ValueRange(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VALUERANGE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ValueRange
     * <br>
     * The ValueRange property indicates further semantics on the interpretation of all non-null, non-key properties of the Component SettingData.
     * "Point" indicates that this SettingData instance provides a single set of values.
     * "Minimums", "Maximums", and "Increments", are only evaluated against non-null, non-key, non-enumerated, non-boolean, numeric properties of the SettingData instance. Each property of that set shall be mathematically comparable to other instances of that property.
     * "Minimums" indicates that this SettingData instance provides minimum values for evaluated properties. When used with PropertyPolicy = "Independent", only one such setting per particular SettingData instance shall be specified for any Capabilities. Unless restricted by a Maximums on the same set of properties, all values that compare higher than the specified values are also considered to be supported by the associated capabilities instance. 
     * "Maximums" indicates that this SettingData instance provides maximum values for evaluated properties. When used with PropertyPolicy = "Independent", only one such setting per particular SettingData instance shall be specified for any Capabilities. Unless restricted by a Minimums on the same set of properties, all values that compare lower than the specified values are also considered to be supported by the associated capabilities instance.
     * "Increments" indicates that this SettingData instance provides increment values for evaluated properties. For the associated Capabilities, if an evaluated property currently has no corresponding minimums or maximums, then the property has no affect. Otherwise, for each evaluated property: its value x shall be between the minimum and maximum, inclusively, and shall have the property that both the result of maximum minus x and the result of x minus minimum are each an integer multiple of the increment. If either minimum or maximum is not specified and the other is, then the missing value shall be respectively assumed to be the lowest or highest supported value for the property's data-type. Additionally, if both a minimum and a maximum are specified for an evaluated property, then the result of maximum minus minimum shall be an integer multiple of the increment.
     */

    private static CIMProperty setPropertyValue_ValueRange(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ValueRole
     *     * <br>
     * The ValueRole property indicates further semantics on the interpretation of the non-null, non-key properties of the Component SettingData.
     * "Default" indicates that property values of the component SettingData instance will be used as default values, when a new SettingData instance is created for elements whose capabilities are defined by the associated Capabilities instance.
     * Across instances of settingdata, for particular properties having the same semantic purpose, at most one such settingdata instance shall be specified as a default.
     * "Optimal" indicates that the SettingData instance represents optimal setting values for elements associated with the associated capabilities instance. Multiple component SettingData instances may be declared as optimal."Mean" indicates that the non-null, non-key, non-enumerated, non-boolean, numeric properties of the associated SettingData instance represents an average point along some dimension. For different combinations of SettingData properties, multiple component SettingData instances may be declared as "Mean". "Supported" indicates that the non-null, non-key properties of the Component SettingData instance represents a set of supported property values that are not otherwise qualified.
     *     */

    public javax.cim.UnsignedInteger16 get_ValueRole() {
        CIMProperty currentProperty = getProperty(PROPERTY_VALUEROLE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VALUEROLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ValueRole
     * <br>
     * The ValueRole property indicates further semantics on the interpretation of the non-null, non-key properties of the Component SettingData.
     * "Default" indicates that property values of the component SettingData instance will be used as default values, when a new SettingData instance is created for elements whose capabilities are defined by the associated Capabilities instance.
     * Across instances of settingdata, for particular properties having the same semantic purpose, at most one such settingdata instance shall be specified as a default.
     * "Optimal" indicates that the SettingData instance represents optimal setting values for elements associated with the associated capabilities instance. Multiple component SettingData instances may be declared as optimal."Mean" indicates that the non-null, non-key, non-enumerated, non-boolean, numeric properties of the associated SettingData instance represents an average point along some dimension. For different combinations of SettingData properties, multiple component SettingData instances may be declared as "Mean". "Supported" indicates that the non-null, non-key properties of the Component SettingData instance represents a set of supported property values that are not otherwise qualified.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ValueRole(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VALUEROLE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ValueRole(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VALUEROLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ValueRole by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ValueRole(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SettingsDefineCapabilities fco = new CIM_SettingsDefineCapabilities(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VALUEROLE.NAME);
        if (property != null) {
            property = setPropertyValue_ValueRole(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VALUEROLE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ValueRole
     * <br>
     * The ValueRole property indicates further semantics on the interpretation of the non-null, non-key properties of the Component SettingData.
     * "Default" indicates that property values of the component SettingData instance will be used as default values, when a new SettingData instance is created for elements whose capabilities are defined by the associated Capabilities instance.
     * Across instances of settingdata, for particular properties having the same semantic purpose, at most one such settingdata instance shall be specified as a default.
     * "Optimal" indicates that the SettingData instance represents optimal setting values for elements associated with the associated capabilities instance. Multiple component SettingData instances may be declared as optimal."Mean" indicates that the non-null, non-key, non-enumerated, non-boolean, numeric properties of the associated SettingData instance represents an average point along some dimension. For different combinations of SettingData properties, multiple component SettingData instances may be declared as "Mean". "Supported" indicates that the non-null, non-key properties of the Component SettingData instance represents a set of supported property values that are not otherwise qualified.
     */

    private static CIMProperty setPropertyValue_ValueRole(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property GroupComponent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Capabilities get_GroupComponent_CIM_Capabilities(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPCOMPONENT_CIM_CAPABILITIES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_CAPABILITIES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_CapabilitiesHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property GroupComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_GroupComponent_CIM_Capabilities(CIM_Capabilities newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPCOMPONENT_CIM_CAPABILITIES.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_GroupComponent_CIM_Capabilities(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_CAPABILITIES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property GroupComponent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_GroupComponent_CIM_Capabilities(WBEMClient client,
            String namespace, CIM_Capabilities newValue) throws WbemsmtException {
        CIM_SettingsDefineCapabilities fco = new CIM_SettingsDefineCapabilities(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_GROUPCOMPONENT_CIM_CAPABILITIES.NAME);
        if (property != null) {
            property = setPropertyValue_GroupComponent_CIM_Capabilities(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_CAPABILITIES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property GroupComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_GroupComponent_CIM_Capabilities(
            CIMProperty currentProperty, CIM_Capabilities newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PartComponent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_SettingData get_PartComponent_CIM_SettingData(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTCOMPONENT_CIM_SETTINGDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_CIM_SETTINGDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_SettingDataHelper
                .getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property PartComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PartComponent_CIM_SettingData(CIM_SettingData newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTCOMPONENT_CIM_SETTINGDATA.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PartComponent_CIM_SettingData(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_CIM_SETTINGDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PartComponent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PartComponent_CIM_SettingData(WBEMClient client,
            String namespace, CIM_SettingData newValue) throws WbemsmtException {
        CIM_SettingsDefineCapabilities fco = new CIM_SettingsDefineCapabilities(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PARTCOMPONENT_CIM_SETTINGDATA.NAME);
        if (property != null) {
            property = setPropertyValue_PartComponent_CIM_SettingData(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_CIM_SETTINGDATA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PartComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_PartComponent_CIM_SettingData(
            CIMProperty currentProperty, CIM_SettingData newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

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
        return CIM_SettingsDefineCapabilities.CIM_CLASS_NAME;
    }

}