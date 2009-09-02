/**
 * CIM_MethodResult.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS PROVIDED UNDER THE TERMS OF
 * THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Eclipse
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Jobs are sometimes used to represent
 *            extrinsic method invocations that execute for times longer than the length of time is
 *            reasonable to require a client to wait. The method executing continues beyond the
 *            method return to the client. The class provides the result of the execution of a Job
 *            that was itself started by the side-effect of this extrinsic method invocation. The
 *            indication instances embedded an instance of this class MUST be the same indications
 *            delivered to listening clients or recorded, all or in part, to logs. Basically, this
 *            approach is a corollary to the functionality provided by an instance of
 *            ListenerDestinationLog (as defined in the Interop Model). The latter provides a
 *            comprehensive, persistent mechanism for recording Job results, but is also more
 *            resource-intensive and requires supporting logging functionality. Both the extra
 *            resources and logging MAY NOT be available in all environments (for example, embedded
 *            environments). Therefore, this instance-based approach is also provided. The
 *            MethodResult instances MUST NOT exist after the associated ConcreteJob is deleted.
 *            generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_MethodResult extends CIM_ManagedElement {

    public final static String CIM_CLASS_NAME = "CIM_MethodResult";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property InstanceID
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
     */
    public static class PROPERTY_INSTANCEID {
        /**
         * name of the property InstanceID
         */
        public final static String NAME = "InstanceID";

    }

    /**
     * Constants of property PostCallIndication
     * This property contains a CIM_InstMethodCall Indication that describes the post-execution values of the extrinisic method invocation.
     */
    public static class PROPERTY_POSTCALLINDICATION {
        /**
         * name of the property PostCallIndication
         */
        public final static String NAME = "PostCallIndication";

    }

    /**
     * Constants of property PreCallIndication
     * This property contains a CIM_InstMethodCall Indication that describes the pre-execution values of the extrinisic method invocation.
     */
    public static class PROPERTY_PRECALLINDICATION {
        /**
         * name of the property PreCallIndication
         */
        public final static String NAME = "PreCallIndication";

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
     *   Jobs are sometimes used to represent extrinsic method invocations that execute for times longer than the length of time is reasonable to require a client to wait. The method executing continues beyond the method return to the client. The class provides the result of the execution of a Job that was itself started by the side-effect of this extrinsic method invocation. 
     * The indication instances embedded an instance of this class MUST be the same indications delivered to listening clients or recorded, all or in part, to logs. Basically, this approach is a corollary to the functionality provided by an instance of ListenerDestinationLog (as defined in the Interop Model). The latter provides a comprehensive, persistent mechanism for recording Job results, but is also more resource-intensive and requires supporting logging functionality. Both the extra resources and logging MAY NOT be available in all environments (for example, embedded environments). Therefore, this instance-based approach is also provided. 
     * The MethodResult instances MUST NOT exist after the associated ConcreteJob is deleted.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_MethodResult(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Jobs are sometimes used to represent extrinsic method invocations that execute for times longer than the length of time is reasonable to require a client to wait. The method executing continues beyond the method return to the client. The class provides the result of the execution of a Job that was itself started by the side-effect of this extrinsic method invocation. 
     * The indication instances embedded an instance of this class MUST be the same indications delivered to listening clients or recorded, all or in part, to logs. Basically, this approach is a corollary to the functionality provided by an instance of ListenerDestinationLog (as defined in the Interop Model). The latter provides a comprehensive, persistent mechanism for recording Job results, but is also more resource-intensive and requires supporting logging functionality. Both the extra resources and logging MAY NOT be available in all environments (for example, embedded environments). Therefore, this instance-based approach is also provided. 
     * The MethodResult instances MUST NOT exist after the associated ConcreteJob is deleted.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_MethodResult(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_MethodResult() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("InstanceID", new CIMProperty("InstanceID", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("PostCallIndication", new CIMProperty("PostCallIndication",
                CIMDataType.OBJECT_T, null));
        propertiesToCheck.put("PreCallIndication", new CIMProperty("PreCallIndication",
                CIMDataType.OBJECT_T, null));

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {
            set_PostCallIndication(null);
            set_PreCallIndication(null);

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    /**
     * Get the property InstanceID
     *     * <br>
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
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
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
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
        CIM_MethodResult fco = new CIM_MethodResult(client, namespace);
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
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
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
     * Get the property PostCallIndication
     *     * <br>
     * This property contains a CIM_InstMethodCall Indication that describes the post-execution values of the extrinisic method invocation.
     *     */

    public CIM_InstMethodCall get_PostCallIndication(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_POSTCALLINDICATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_POSTCALLINDICATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_InstMethodCallHelper.getInstance(client, ((CIMInstance) currentProperty
                .getValue()).getObjectPath());

    }

    /**
     * Set the property PostCallIndication
     * <br>
     * This property contains a CIM_InstMethodCall Indication that describes the post-execution values of the extrinisic method invocation.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PostCallIndication(CIM_InstMethodCall newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_POSTCALLINDICATION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PostCallIndication(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_POSTCALLINDICATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PostCallIndication by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PostCallIndication(WBEMClient client, String namespace,
            CIM_InstMethodCall newValue) throws WbemsmtException {
        CIM_MethodResult fco = new CIM_MethodResult(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_POSTCALLINDICATION.NAME);
        if (property != null) {
            property = setPropertyValue_PostCallIndication(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_POSTCALLINDICATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PostCallIndication
     * <br>
     * This property contains a CIM_InstMethodCall Indication that describes the post-execution values of the extrinisic method invocation.
     */

    private static CIMProperty setPropertyValue_PostCallIndication(CIMProperty currentProperty,
            CIM_InstMethodCall newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimInstance() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), CIMDataType.OBJECT_T,
                setThis, currentProperty.isKey(), currentProperty.isPropagated(), currentProperty
                        .getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PreCallIndication
     *     * <br>
     * This property contains a CIM_InstMethodCall Indication that describes the pre-execution values of the extrinisic method invocation.
     *     */

    public CIM_InstMethodCall get_PreCallIndication(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_PRECALLINDICATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRECALLINDICATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_InstMethodCallHelper.getInstance(client, ((CIMInstance) currentProperty
                .getValue()).getObjectPath());

    }

    /**
     * Set the property PreCallIndication
     * <br>
     * This property contains a CIM_InstMethodCall Indication that describes the pre-execution values of the extrinisic method invocation.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PreCallIndication(CIM_InstMethodCall newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRECALLINDICATION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PreCallIndication(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRECALLINDICATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PreCallIndication by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PreCallIndication(WBEMClient client, String namespace,
            CIM_InstMethodCall newValue) throws WbemsmtException {
        CIM_MethodResult fco = new CIM_MethodResult(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRECALLINDICATION.NAME);
        if (property != null) {
            property = setPropertyValue_PreCallIndication(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRECALLINDICATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PreCallIndication
     * <br>
     * This property contains a CIM_InstMethodCall Indication that describes the pre-execution values of the extrinisic method invocation.
     */

    private static CIMProperty setPropertyValue_PreCallIndication(CIMProperty currentProperty,
            CIM_InstMethodCall newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimInstance() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), CIMDataType.OBJECT_T,
                setThis, currentProperty.isKey(), currentProperty.isPropagated(), currentProperty
                        .getOriginClass());

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
        return CIM_MethodResult.CIM_CLASS_NAME;
    }

}