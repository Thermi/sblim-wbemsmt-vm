/**
 * CIM_BaseMetricValue.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS PROVIDED UNDER THE TER MS
 * OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Eclipse
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Each CIM_BaseMetricValue object represents
 *            the instance value of a metric. Since the gathering of metric information can involve
 *            large quantities of information there may be many instances of this class. The use of
 *            this class as an instrumentation source may be inefficient unless the rate of metrics
 *            are known. The length of time a CIM_BaseMetricValue instance exists after the metric
 *            information is captured is not defined and is implementation dependent. Most metric
 *            data values change over time. There are two ways of mapping this into
 *            CIM_BaseMetricValue objects: The value for the next point in time may use the same
 *            object and just change its properties (such as the value or timestamp), or the
 *            existing objects remain unchanged and a new object is created for the new point in
 *            time. The first method is typically used for snapshot data and the second method for
 *            historical data. Which method is used, is indicated by the Volatile property.
 *            generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_BaseMetricValue extends CIM_ManagedElement {

    public final static String CIM_CLASS_NAME = "CIM_BaseMetricValue";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property BreakdownDimension
     * If present, specifies one BreakdownDimension from the BreakdownDimensions array defined in the associated CIM_ BaseMetricDefinition. This is the dimension along which this set of metric values is broken down. For a description of the concept, see the class CIM_BaseMetricDefinition.
     */
    public static class PROPERTY_BREAKDOWNDIMENSION {
        /**
         * name of the property BreakdownDimension
         */
        public final static String NAME = "BreakdownDimension";

    }

    /**
     * Constants of property BreakdownValue
     * Defines a value of the BreakdownDimension property defined for this metric value instance. For instance, if the BreakdownDimension is "TransactionName", this property could name the actual transaction to which this particular metric value applies.
     */
    public static class PROPERTY_BREAKDOWNVALUE {
        /**
         * name of the property BreakdownValue
         */
        public final static String NAME = "BreakdownValue";

    }

    /**
     * Constants of property Duration
     * Property that represents the time duration over which this metric value is valid. This property should not exist for timestamps that apply only to a point in time but should be defined for values that are considered valid for a certain time period (ex. sampling). If the "Duration" property exists and is nonNull, the TimeStamp is to be considered the end of the interval.
     */
    public static class PROPERTY_DURATION {
        /**
         * name of the property Duration
         */
        public final static String NAME = "Duration";

    }

    /**
     * Constants of property InstanceID
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * : 
     * Where and are separated by a colon ':', and where MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between and . 
     * is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the set to 'CIM'.
     */
    public static class PROPERTY_INSTANCEID {
        /**
         * name of the property InstanceID
         */
        public final static String NAME = "InstanceID";

    }

    /**
     * Constants of property MeasuredElementName
     * A descriptive name for the element to which the metric value belongs (i.e., the measured element). This property is required by behavior if there is no association defined to a ManagedElement, but may be used in other cases to provide supplemental information. This allows metrics to be captured independently of any ManagedElement. An example is where a metric value belongs to a combination of elements, such as the input and output ports of the traffic in a switch. If there are multiple ManagedElements associated with the metric value, then usually there is one that naturally belongs to the metric value and that one should be used to create the supplemental information. The property is not meant to be used as a foreign key to search on the measured element. Instead, the association to the ManagedElement should be used.
     */
    public static class PROPERTY_MEASUREDELEMENTNAME {
        /**
         * name of the property MeasuredElementName
         */
        public final static String NAME = "MeasuredElementName";

    }

    /**
     * Constants of property MetricDefinitionId
     * The key of the BaseMetricDefinition instance for this CIM_BaseMetricValue instance value.
     */
    public static class PROPERTY_METRICDEFINITIONID {
        /**
         * name of the property MetricDefinitionId
         */
        public final static String NAME = "MetricDefinitionId";

    }

    /**
     * Constants of property MetricValue
     * The value of the metric represented as a string. Its original data type is specified in CIM_BaseMetricDefinition.
     */
    public static class PROPERTY_METRICVALUE {
        /**
         * name of the property MetricValue
         */
        public final static String NAME = "MetricValue";

    }

    /**
     * Constants of property TimeStamp
     * Identifies the time when the value of a metric instance is computed. Note that this is different from the time when the instance is created. For a given CIM_BaseMetricValue instance, the TimeStamp changes whenever a new measurement snapshot is taken if Volatile is true. A managmenet application may establish a time series of metric data by retrieving the instances of CIM_BaseMetricValue and sorting them according to their TimeStamp.
     */
    public static class PROPERTY_TIMESTAMP {
        /**
         * name of the property TimeStamp
         */
        public final static String NAME = "TimeStamp";

    }

    /**
     * Constants of property Volatile
     * If true, Volatile indicates that the value for the next point in time may use the same object and just change its properties (such as the value or timestamp). If false, the existing objects remain unchanged and a new object is created for the new point in time.
     */
    public static class PROPERTY_VOLATILE {
        /**
         * name of the property Volatile
         */
        public final static String NAME = "Volatile";

    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
        String[] parentClassPackageList = CIM_ManagedElement.getPackages();

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
     *   Each CIM_BaseMetricValue object represents the instance value of a metric. Since the gathering of metric information can involve large quantities of information there may be many instances of this class. The use of this class as an instrumentation source may be inefficient unless the rate of metrics are known. The length of time a CIM_BaseMetricValue instance exists after the metric information is captured is not defined and is implementation dependent. 
     * Most metric data values change over time. There are two ways of mapping this into CIM_BaseMetricValue objects: The value for the next point in time may use the same object and just change its properties (such as the value or timestamp), or the existing objects remain unchanged and a new object is created for the new point in time. The first method is typically used for snapshot data and the second method for historical data. Which method is used, is indicated by the Volatile property.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_BaseMetricValue(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Each CIM_BaseMetricValue object represents the instance value of a metric. Since the gathering of metric information can involve large quantities of information there may be many instances of this class. The use of this class as an instrumentation source may be inefficient unless the rate of metrics are known. The length of time a CIM_BaseMetricValue instance exists after the metric information is captured is not defined and is implementation dependent. 
     * Most metric data values change over time. There are two ways of mapping this into CIM_BaseMetricValue objects: The value for the next point in time may use the same object and just change its properties (such as the value or timestamp), or the existing objects remain unchanged and a new object is created for the new point in time. The first method is typically used for snapshot data and the second method for historical data. Which method is used, is indicated by the Volatile property.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_BaseMetricValue(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_BaseMetricValue() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("BreakdownDimension", new CIMProperty("BreakdownDimension",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("BreakdownValue", new CIMProperty("BreakdownValue",
                CIMDataType.STRING_T, null));
        propertiesToCheck
                .put("Duration", new CIMProperty("Duration", CIMDataType.DATETIME_T, null));
        propertiesToCheck.put("InstanceID", new CIMProperty("InstanceID", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("MeasuredElementName", new CIMProperty("MeasuredElementName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("MetricDefinitionId", new CIMProperty("MetricDefinitionId",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("MetricValue", new CIMProperty("MetricValue", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("TimeStamp", new CIMProperty("TimeStamp", CIMDataType.DATETIME_T,
                null));
        propertiesToCheck.put("Volatile", new CIMProperty("Volatile", CIMDataType.BOOLEAN_T, null));

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
     * Get the property BreakdownDimension
     *     * <br>
     * If present, specifies one BreakdownDimension from the BreakdownDimensions array defined in the associated CIM_ BaseMetricDefinition. This is the dimension along which this set of metric values is broken down. For a description of the concept, see the class CIM_BaseMetricDefinition.
     *     */

    public String get_BreakdownDimension() {
        CIMProperty currentProperty = getProperty(PROPERTY_BREAKDOWNDIMENSION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BREAKDOWNDIMENSION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property BreakdownDimension
     * <br>
     * If present, specifies one BreakdownDimension from the BreakdownDimensions array defined in the associated CIM_ BaseMetricDefinition. This is the dimension along which this set of metric values is broken down. For a description of the concept, see the class CIM_BaseMetricDefinition.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BreakdownDimension(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BREAKDOWNDIMENSION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_BreakdownDimension(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BREAKDOWNDIMENSION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BreakdownDimension by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BreakdownDimension(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_BaseMetricValue fco = new CIM_BaseMetricValue(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BREAKDOWNDIMENSION.NAME);
        if (property != null) {
            property = setPropertyValue_BreakdownDimension(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BREAKDOWNDIMENSION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BreakdownDimension
     * <br>
     * If present, specifies one BreakdownDimension from the BreakdownDimensions array defined in the associated CIM_ BaseMetricDefinition. This is the dimension along which this set of metric values is broken down. For a description of the concept, see the class CIM_BaseMetricDefinition.
     */

    private static CIMProperty setPropertyValue_BreakdownDimension(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property BreakdownValue
     *     * <br>
     * Defines a value of the BreakdownDimension property defined for this metric value instance. For instance, if the BreakdownDimension is "TransactionName", this property could name the actual transaction to which this particular metric value applies.
     *     */

    public String get_BreakdownValue() {
        CIMProperty currentProperty = getProperty(PROPERTY_BREAKDOWNVALUE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BREAKDOWNVALUE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property BreakdownValue
     * <br>
     * Defines a value of the BreakdownDimension property defined for this metric value instance. For instance, if the BreakdownDimension is "TransactionName", this property could name the actual transaction to which this particular metric value applies.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BreakdownValue(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BREAKDOWNVALUE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_BreakdownValue(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BREAKDOWNVALUE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BreakdownValue by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BreakdownValue(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_BaseMetricValue fco = new CIM_BaseMetricValue(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BREAKDOWNVALUE.NAME);
        if (property != null) {
            property = setPropertyValue_BreakdownValue(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BREAKDOWNVALUE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BreakdownValue
     * <br>
     * Defines a value of the BreakdownDimension property defined for this metric value instance. For instance, if the BreakdownDimension is "TransactionName", this property could name the actual transaction to which this particular metric value applies.
     */

    private static CIMProperty setPropertyValue_BreakdownValue(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Duration
     *     * <br>
     * Property that represents the time duration over which this metric value is valid. This property should not exist for timestamps that apply only to a point in time but should be defined for values that are considered valid for a certain time period (ex. sampling). If the "Duration" property exists and is nonNull, the TimeStamp is to be considered the end of the interval.
     *     */

    public javax.cim.CIMDateTime get_Duration() {
        CIMProperty currentProperty = getProperty(PROPERTY_DURATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DURATION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property Duration
     * <br>
     * Property that represents the time duration over which this metric value is valid. This property should not exist for timestamps that apply only to a point in time but should be defined for values that are considered valid for a certain time period (ex. sampling). If the "Duration" property exists and is nonNull, the TimeStamp is to be considered the end of the interval.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Duration(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DURATION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Duration(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DURATION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Duration by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Duration(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_BaseMetricValue fco = new CIM_BaseMetricValue(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DURATION.NAME);
        if (property != null) {
            property = setPropertyValue_Duration(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DURATION.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Duration
     * <br>
     * Property that represents the time duration over which this metric value is valid. This property should not exist for timestamps that apply only to a point in time but should be defined for values that are considered valid for a certain time period (ex. sampling). If the "Duration" property exists and is nonNull, the TimeStamp is to be considered the end of the interval.
     */

    private static CIMProperty setPropertyValue_Duration(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property InstanceID
     *     * <br>
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * : 
     * Where and are separated by a colon ':', and where MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between and . 
     * is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the set to 'CIM'.
     *     */

    public String get_key_InstanceID() {
        CIMProperty currentProperty = getProperty(PROPERTY_INSTANCEID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property InstanceID
     * <br>
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * : 
     * Where and are separated by a colon ':', and where MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between and . 
     * is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the set to 'CIM'.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_InstanceID(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INSTANCEID.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_key_InstanceID(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property InstanceID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_InstanceID(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_BaseMetricValue fco = new CIM_BaseMetricValue(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INSTANCEID.NAME);
        if (property != null) {
            property = setPropertyValue_key_InstanceID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property InstanceID
     * <br>
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * : 
     * Where and are separated by a colon ':', and where MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between and . 
     * is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the set to 'CIM'.
     */

    private static CIMProperty setPropertyValue_key_InstanceID(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MeasuredElementName
     *     * <br>
     * A descriptive name for the element to which the metric value belongs (i.e., the measured element). This property is required by behavior if there is no association defined to a ManagedElement, but may be used in other cases to provide supplemental information. This allows metrics to be captured independently of any ManagedElement. An example is where a metric value belongs to a combination of elements, such as the input and output ports of the traffic in a switch. If there are multiple ManagedElements associated with the metric value, then usually there is one that naturally belongs to the metric value and that one should be used to create the supplemental information. The property is not meant to be used as a foreign key to search on the measured element. Instead, the association to the ManagedElement should be used.
     *     */

    public String get_MeasuredElementName() {
        CIMProperty currentProperty = getProperty(PROPERTY_MEASUREDELEMENTNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MEASUREDELEMENTNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property MeasuredElementName
     * <br>
     * A descriptive name for the element to which the metric value belongs (i.e., the measured element). This property is required by behavior if there is no association defined to a ManagedElement, but may be used in other cases to provide supplemental information. This allows metrics to be captured independently of any ManagedElement. An example is where a metric value belongs to a combination of elements, such as the input and output ports of the traffic in a switch. If there are multiple ManagedElements associated with the metric value, then usually there is one that naturally belongs to the metric value and that one should be used to create the supplemental information. The property is not meant to be used as a foreign key to search on the measured element. Instead, the association to the ManagedElement should be used.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MeasuredElementName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MEASUREDELEMENTNAME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_MeasuredElementName(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MEASUREDELEMENTNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MeasuredElementName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MeasuredElementName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_BaseMetricValue fco = new CIM_BaseMetricValue(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MEASUREDELEMENTNAME.NAME);
        if (property != null) {
            property = setPropertyValue_MeasuredElementName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MEASUREDELEMENTNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MeasuredElementName
     * <br>
     * A descriptive name for the element to which the metric value belongs (i.e., the measured element). This property is required by behavior if there is no association defined to a ManagedElement, but may be used in other cases to provide supplemental information. This allows metrics to be captured independently of any ManagedElement. An example is where a metric value belongs to a combination of elements, such as the input and output ports of the traffic in a switch. If there are multiple ManagedElements associated with the metric value, then usually there is one that naturally belongs to the metric value and that one should be used to create the supplemental information. The property is not meant to be used as a foreign key to search on the measured element. Instead, the association to the ManagedElement should be used.
     */

    private static CIMProperty setPropertyValue_MeasuredElementName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MetricDefinitionId
     *     * <br>
     * The key of the BaseMetricDefinition instance for this CIM_BaseMetricValue instance value.
     *     */

    public String get_MetricDefinitionId() {
        CIMProperty currentProperty = getProperty(PROPERTY_METRICDEFINITIONID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_METRICDEFINITIONID.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property MetricDefinitionId
     * <br>
     * The key of the BaseMetricDefinition instance for this CIM_BaseMetricValue instance value.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MetricDefinitionId(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_METRICDEFINITIONID.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_MetricDefinitionId(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_METRICDEFINITIONID.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MetricDefinitionId by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MetricDefinitionId(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_BaseMetricValue fco = new CIM_BaseMetricValue(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_METRICDEFINITIONID.NAME);
        if (property != null) {
            property = setPropertyValue_MetricDefinitionId(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_METRICDEFINITIONID.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MetricDefinitionId
     * <br>
     * The key of the BaseMetricDefinition instance for this CIM_BaseMetricValue instance value.
     */

    private static CIMProperty setPropertyValue_MetricDefinitionId(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MetricValue
     *     * <br>
     * The value of the metric represented as a string. Its original data type is specified in CIM_BaseMetricDefinition.
     *     */

    public String get_MetricValue() {
        CIMProperty currentProperty = getProperty(PROPERTY_METRICVALUE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_METRICVALUE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property MetricValue
     * <br>
     * The value of the metric represented as a string. Its original data type is specified in CIM_BaseMetricDefinition.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MetricValue(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_METRICVALUE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_MetricValue(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_METRICVALUE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MetricValue by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MetricValue(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_BaseMetricValue fco = new CIM_BaseMetricValue(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_METRICVALUE.NAME);
        if (property != null) {
            property = setPropertyValue_MetricValue(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_METRICVALUE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MetricValue
     * <br>
     * The value of the metric represented as a string. Its original data type is specified in CIM_BaseMetricDefinition.
     */

    private static CIMProperty setPropertyValue_MetricValue(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TimeStamp
     *     * <br>
     * Identifies the time when the value of a metric instance is computed. Note that this is different from the time when the instance is created. For a given CIM_BaseMetricValue instance, the TimeStamp changes whenever a new measurement snapshot is taken if Volatile is true. A managmenet application may establish a time series of metric data by retrieving the instances of CIM_BaseMetricValue and sorting them according to their TimeStamp.
     *     */

    public javax.cim.CIMDateTime get_TimeStamp() {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMESTAMP.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TIMESTAMP.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property TimeStamp
     * <br>
     * Identifies the time when the value of a metric instance is computed. Note that this is different from the time when the instance is created. For a given CIM_BaseMetricValue instance, the TimeStamp changes whenever a new measurement snapshot is taken if Volatile is true. A managmenet application may establish a time series of metric data by retrieving the instances of CIM_BaseMetricValue and sorting them according to their TimeStamp.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TimeStamp(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMESTAMP.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_TimeStamp(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TIMESTAMP.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TimeStamp by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TimeStamp(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_BaseMetricValue fco = new CIM_BaseMetricValue(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TIMESTAMP.NAME);
        if (property != null) {
            property = setPropertyValue_TimeStamp(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TIMESTAMP.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TimeStamp
     * <br>
     * Identifies the time when the value of a metric instance is computed. Note that this is different from the time when the instance is created. For a given CIM_BaseMetricValue instance, the TimeStamp changes whenever a new measurement snapshot is taken if Volatile is true. A managmenet application may establish a time series of metric data by retrieving the instances of CIM_BaseMetricValue and sorting them according to their TimeStamp.
     */

    private static CIMProperty setPropertyValue_TimeStamp(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Volatile
     *     * <br>
     * If true, Volatile indicates that the value for the next point in time may use the same object and just change its properties (such as the value or timestamp). If false, the existing objects remain unchanged and a new object is created for the new point in time.
     *     */

    public Boolean get_Volatile() {
        CIMProperty currentProperty = getProperty(PROPERTY_VOLATILE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VOLATILE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property Volatile
     * <br>
     * If true, Volatile indicates that the value for the next point in time may use the same object and just change its properties (such as the value or timestamp). If false, the existing objects remain unchanged and a new object is created for the new point in time.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Volatile(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VOLATILE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Volatile(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VOLATILE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Volatile by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Volatile(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        CIM_BaseMetricValue fco = new CIM_BaseMetricValue(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VOLATILE.NAME);
        if (property != null) {
            property = setPropertyValue_Volatile(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VOLATILE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Volatile
     * <br>
     * If true, Volatile indicates that the value for the next point in time may use the same object and just change its properties (such as the value or timestamp). If false, the existing objects remain unchanged and a new object is created for the new point in time.
     */

    private static CIMProperty setPropertyValue_Volatile(CIMProperty currentProperty,
            Boolean newValue) {
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
        return CIM_BaseMetricValue.CIM_CLASS_NAME;
    }

}