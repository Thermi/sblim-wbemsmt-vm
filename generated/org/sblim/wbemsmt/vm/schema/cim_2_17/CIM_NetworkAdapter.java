/**
 * CIM_NetworkAdapter.java Â© Copyright IBM Corp. 2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS
 * OF THE COMMON PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/cpl1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Note: The use of the CIM_NetworkAdpater class
 *            has been deprecated in lieu of CIM_NetworkPort. CIM_NetworkPort better reflects that
 *            the hardware of a single port is described and managed. Deprecated description:
 *            NetworkAdapter is an Abstract class that defines general networking hardware concepts
 *            (for example, PermanentAddress or Speed of operation). generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_NetworkAdapter extends CIM_LogicalDevice {

    public final static String CIM_CLASS_NAME = "CIM_NetworkAdapter";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property AutoSense
     * Note: The use of this method has been deprecated. 
     * Deprecated description: A Boolean that indicates whether the NetworkAdapter is capable of automatically determining the speed or other communications characteristics of the attached network media.
     */
    public static class PROPERTY_AUTOSENSE {
        /**
         * name of the property AutoSense
         */
        public final static String NAME = "AutoSense";

    }

    /**
     * Constants of property FullDuplex
     * Note: The use of this method has been deprecated. 
     * Deprecated description: A Boolean that indicates that the Adapter is operating in full duplex mode.
     */
    public static class PROPERTY_FULLDUPLEX {
        /**
         * name of the property FullDuplex
         */
        public final static String NAME = "FullDuplex";

    }

    /**
     * Constants of property MaxSpeed
     * Note: The use of this method has been deprecated. 
     * Deprecated description: The maximum speed, in Bits per Second, for the Network Adapter.
     */
    public static class PROPERTY_MAXSPEED {
        /**
         * name of the property MaxSpeed
         */
        public final static String NAME = "MaxSpeed";

    }

    /**
     * Constants of property NetworkAddresses
     * Note: The use of this method has been deprecated. 
     * Deprecated description: An array of strings that indicates the network addresses for an adapter.
     */
    public static class PROPERTY_NETWORKADDRESSES {
        /**
         * name of the property NetworkAddresses
         */
        public final static String NAME = "NetworkAddresses";

    }

    /**
     * Constants of property OctetsReceived
     * Note: The use of OctetsReceived is deprecated. The replacement is CIM_NetworkPortStatistics.BytesReceived.
     */
    public static class PROPERTY_OCTETSRECEIVED {
        /**
         * name of the property OctetsReceived
         */
        public final static String NAME = "OctetsReceived";

    }

    /**
     * Constants of property OctetsTransmitted
     * Note: The use of this method has been deprecated. The replacement is CIM_NetworkPortStatistics.BytesTransmitted.
     */
    public static class PROPERTY_OCTETSTRANSMITTED {
        /**
         * name of the property OctetsTransmitted
         */
        public final static String NAME = "OctetsTransmitted";

    }

    /**
     * Constants of property PermanentAddress
     * Note: The use of this method has been deprecated. 
     * Deprecated description: PermanentAddress defines the network address that is hardcoded into an adapter. This 'hardcoded' address might be changed through a firmware upgrade or software configuration. If so, this field should be updated when the change is made. PermanentAddress should be left blank if no 'hardcoded' address exists for the NetworkAdapter.
     */
    public static class PROPERTY_PERMANENTADDRESS {
        /**
         * name of the property PermanentAddress
         */
        public final static String NAME = "PermanentAddress";

    }

    /**
     * Constants of property Speed
     * Note: The use of this method has been deprecated. 
     * Deprecated description: An estimate of the current bandwidth in Bits per Second. For Adapters that vary in bandwidth or for those where no accurate estimation can be made, this property should contain the nominal bandwidth.
     */
    public static class PROPERTY_SPEED {
        /**
         * name of the property Speed
         */
        public final static String NAME = "Speed";

    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
        String[] parentClassPackageList = CIM_LogicalDevice.getPackages();

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
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   Note: The use of the CIM_NetworkAdpater class has been deprecated in lieu of CIM_NetworkPort. CIM_NetworkPort better reflects that the hardware of a single port is described and managed. 
     * Deprecated description: NetworkAdapter is an Abstract class that defines general networking hardware concepts (for example, PermanentAddress or Speed of operation).
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    protected CIM_NetworkAdapter(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   Note: The use of the CIM_NetworkAdpater class has been deprecated in lieu of CIM_NetworkPort. CIM_NetworkPort better reflects that the hardware of a single port is described and managed. 
     * Deprecated description: NetworkAdapter is an Abstract class that defines general networking hardware concepts (for example, PermanentAddress or Speed of operation).
     *   @param cimInstance the instance that is used to create the Object
     */

    protected CIM_NetworkAdapter(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_NetworkAdapter() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AutoSense",
                new CIMProperty("AutoSense", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("FullDuplex", new CIMProperty("FullDuplex", CIMDataType.BOOLEAN_T,
                null));
        propertiesToCheck.put("MaxSpeed", new CIMProperty("MaxSpeed", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("NetworkAddresses", new CIMProperty("NetworkAddresses",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("OctetsReceived", new CIMProperty("OctetsReceived",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("OctetsTransmitted", new CIMProperty("OctetsTransmitted",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PermanentAddress", new CIMProperty("PermanentAddress",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("Speed", new CIMProperty("Speed", CIMDataType.UINT64_T, null));

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
     * Get the property AutoSense
     *     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: A Boolean that indicates whether the NetworkAdapter is capable of automatically determining the speed or other communications characteristics of the attached network media.
     *     */

    public Boolean get_AutoSense() {
        CIMProperty currentProperty = getProperty(PROPERTY_AUTOSENSE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_AUTOSENSE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property AutoSense
     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: A Boolean that indicates whether the NetworkAdapter is capable of automatically determining the speed or other communications characteristics of the attached network media.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AutoSense(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_AUTOSENSE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_AutoSense(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_AUTOSENSE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AutoSense by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AutoSense(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        CIM_NetworkAdapter fco = new CIM_NetworkAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AUTOSENSE.NAME);
        if (property != null) {
            property = setPropertyValue_AutoSense(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_AUTOSENSE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AutoSense
     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: A Boolean that indicates whether the NetworkAdapter is capable of automatically determining the speed or other communications characteristics of the attached network media.
     */

    private static CIMProperty setPropertyValue_AutoSense(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FullDuplex
     *     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: A Boolean that indicates that the Adapter is operating in full duplex mode.
     *     */

    public Boolean get_FullDuplex() {
        CIMProperty currentProperty = getProperty(PROPERTY_FULLDUPLEX.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FULLDUPLEX.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property FullDuplex
     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: A Boolean that indicates that the Adapter is operating in full duplex mode.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FullDuplex(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FULLDUPLEX.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_FullDuplex(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FULLDUPLEX.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FullDuplex by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FullDuplex(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_NetworkAdapter fco = new CIM_NetworkAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FULLDUPLEX.NAME);
        if (property != null) {
            property = setPropertyValue_FullDuplex(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FULLDUPLEX.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FullDuplex
     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: A Boolean that indicates that the Adapter is operating in full duplex mode.
     */

    private static CIMProperty setPropertyValue_FullDuplex(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MaxSpeed
     *     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: The maximum speed, in Bits per Second, for the Network Adapter.
     *     */

    public javax.cim.UnsignedInteger64 get_MaxSpeed() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXSPEED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXSPEED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property MaxSpeed
     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: The maximum speed, in Bits per Second, for the Network Adapter.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxSpeed(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXSPEED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_MaxSpeed(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXSPEED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxSpeed by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxSpeed(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_NetworkAdapter fco = new CIM_NetworkAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXSPEED.NAME);
        if (property != null) {
            property = setPropertyValue_MaxSpeed(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXSPEED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxSpeed
     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: The maximum speed, in Bits per Second, for the Network Adapter.
     */

    private static CIMProperty setPropertyValue_MaxSpeed(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NetworkAddresses
     *     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: An array of strings that indicates the network addresses for an adapter.
     *     */

    public String[] get_NetworkAddresses() {
        CIMProperty currentProperty = getProperty(PROPERTY_NETWORKADDRESSES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NETWORKADDRESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property NetworkAddresses
     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: An array of strings that indicates the network addresses for an adapter.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NetworkAddresses(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NETWORKADDRESSES.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_NetworkAddresses(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NETWORKADDRESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NetworkAddresses by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NetworkAddresses(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_NetworkAdapter fco = new CIM_NetworkAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NETWORKADDRESSES.NAME);
        if (property != null) {
            property = setPropertyValue_NetworkAddresses(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NETWORKADDRESSES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NetworkAddresses
     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: An array of strings that indicates the network addresses for an adapter.
     */

    private static CIMProperty setPropertyValue_NetworkAddresses(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OctetsReceived
     *     * <br>
     * Note: The use of OctetsReceived is deprecated. The replacement is CIM_NetworkPortStatistics.BytesReceived.
     *     */

    public javax.cim.UnsignedInteger64 get_OctetsReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_OCTETSRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OCTETSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property OctetsReceived
     * <br>
     * Note: The use of OctetsReceived is deprecated. The replacement is CIM_NetworkPortStatistics.BytesReceived.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OctetsReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OCTETSRECEIVED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OctetsReceived(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OCTETSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OctetsReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OctetsReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_NetworkAdapter fco = new CIM_NetworkAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OCTETSRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_OctetsReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OCTETSRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OctetsReceived
     * <br>
     * Note: The use of OctetsReceived is deprecated. The replacement is CIM_NetworkPortStatistics.BytesReceived.
     */

    private static CIMProperty setPropertyValue_OctetsReceived(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OctetsTransmitted
     *     * <br>
     * Note: The use of this method has been deprecated. The replacement is CIM_NetworkPortStatistics.BytesTransmitted.
     *     */

    public javax.cim.UnsignedInteger64 get_OctetsTransmitted() {
        CIMProperty currentProperty = getProperty(PROPERTY_OCTETSTRANSMITTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OCTETSTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property OctetsTransmitted
     * <br>
     * Note: The use of this method has been deprecated. The replacement is CIM_NetworkPortStatistics.BytesTransmitted.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OctetsTransmitted(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OCTETSTRANSMITTED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OctetsTransmitted(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OCTETSTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OctetsTransmitted by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OctetsTransmitted(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_NetworkAdapter fco = new CIM_NetworkAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OCTETSTRANSMITTED.NAME);
        if (property != null) {
            property = setPropertyValue_OctetsTransmitted(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OCTETSTRANSMITTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OctetsTransmitted
     * <br>
     * Note: The use of this method has been deprecated. The replacement is CIM_NetworkPortStatistics.BytesTransmitted.
     */

    private static CIMProperty setPropertyValue_OctetsTransmitted(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PermanentAddress
     *     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: PermanentAddress defines the network address that is hardcoded into an adapter. This 'hardcoded' address might be changed through a firmware upgrade or software configuration. If so, this field should be updated when the change is made. PermanentAddress should be left blank if no 'hardcoded' address exists for the NetworkAdapter.
     *     */

    public String get_PermanentAddress() {
        CIMProperty currentProperty = getProperty(PROPERTY_PERMANENTADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PERMANENTADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property PermanentAddress
     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: PermanentAddress defines the network address that is hardcoded into an adapter. This 'hardcoded' address might be changed through a firmware upgrade or software configuration. If so, this field should be updated when the change is made. PermanentAddress should be left blank if no 'hardcoded' address exists for the NetworkAdapter.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PermanentAddress(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PERMANENTADDRESS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PermanentAddress(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PERMANENTADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PermanentAddress by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PermanentAddress(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_NetworkAdapter fco = new CIM_NetworkAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PERMANENTADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_PermanentAddress(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PERMANENTADDRESS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PermanentAddress
     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: PermanentAddress defines the network address that is hardcoded into an adapter. This 'hardcoded' address might be changed through a firmware upgrade or software configuration. If so, this field should be updated when the change is made. PermanentAddress should be left blank if no 'hardcoded' address exists for the NetworkAdapter.
     */

    private static CIMProperty setPropertyValue_PermanentAddress(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Speed
     *     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: An estimate of the current bandwidth in Bits per Second. For Adapters that vary in bandwidth or for those where no accurate estimation can be made, this property should contain the nominal bandwidth.
     *     */

    public javax.cim.UnsignedInteger64 get_Speed() {
        CIMProperty currentProperty = getProperty(PROPERTY_SPEED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SPEED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Speed
     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: An estimate of the current bandwidth in Bits per Second. For Adapters that vary in bandwidth or for those where no accurate estimation can be made, this property should contain the nominal bandwidth.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Speed(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SPEED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Speed(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SPEED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Speed by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Speed(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_NetworkAdapter fco = new CIM_NetworkAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SPEED.NAME);
        if (property != null) {
            property = setPropertyValue_Speed(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SPEED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Speed
     * <br>
     * Note: The use of this method has been deprecated. 
     * Deprecated description: An estimate of the current bandwidth in Bits per Second. For Adapters that vary in bandwidth or for those where no accurate estimation can be made, this property should contain the nominal bandwidth.
     */

    private static CIMProperty setPropertyValue_Speed(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
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
        return CIM_NetworkAdapter.CIM_CLASS_NAME;
    }

}