/**
 * CIM_ReferencedProfile.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS PROVIDED UNDER THE TER
 * MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Eclipse
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: A profile that is referenced by another
 *            RegisteredProfile. generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ReferencedProfile extends CIM_Dependency {

    public final static String CIM_CLASS_NAME = "CIM_ReferencedProfile";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Antecedent
     * 
     */
    public static class PROPERTY_ANTECEDENT_CIM_REGISTEREDPROFILE {
        /**
         * name of the property Antecedent
         */
        public final static String NAME = "Antecedent";

    }

    /**
     * Constants of property Dependent
     * 
     */
    public static class PROPERTY_DEPENDENT_CIM_REGISTEREDPROFILE {
        /**
         * name of the property Dependent
         */
        public final static String NAME = "Dependent";

    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
        String[] parentClassPackageList = CIM_Dependency.getPackages();

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
     *   A profile that is referenced by another RegisteredProfile.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ReferencedProfile(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A profile that is referenced by another RegisteredProfile.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ReferencedProfile(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ReferencedProfile() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Antecedent", new CIMProperty("Antecedent", new CIMDataType(
                CIM_RegisteredProfile.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Dependent", new CIMProperty("Dependent", new CIMDataType(
                CIM_RegisteredProfile.CIM_CLASS_NAME), null));

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
     * Get the property Antecedent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_RegisteredProfile get_Antecedent_CIM_RegisteredProfile(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_REGISTEREDPROFILE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_REGISTEREDPROFILE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_RegisteredProfileHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Antecedent_CIM_RegisteredProfile(CIM_RegisteredProfile newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_REGISTEREDPROFILE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Antecedent_CIM_RegisteredProfile(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_REGISTEREDPROFILE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Antecedent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Antecedent_CIM_RegisteredProfile(WBEMClient client,
            String namespace, CIM_RegisteredProfile newValue) throws WbemsmtException {
        CIM_ReferencedProfile fco = new CIM_ReferencedProfile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ANTECEDENT_CIM_REGISTEREDPROFILE.NAME);
        if (property != null) {
            property = setPropertyValue_Antecedent_CIM_RegisteredProfile(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_REGISTEREDPROFILE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Antecedent_CIM_RegisteredProfile(
            CIMProperty currentProperty, CIM_RegisteredProfile newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Dependent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_RegisteredProfile get_Dependent_CIM_RegisteredProfile(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_REGISTEREDPROFILE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_REGISTEREDPROFILE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_RegisteredProfileHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Dependent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Dependent_CIM_RegisteredProfile(CIM_RegisteredProfile newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_REGISTEREDPROFILE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Dependent_CIM_RegisteredProfile(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_REGISTEREDPROFILE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Dependent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Dependent_CIM_RegisteredProfile(WBEMClient client,
            String namespace, CIM_RegisteredProfile newValue) throws WbemsmtException {
        CIM_ReferencedProfile fco = new CIM_ReferencedProfile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEPENDENT_CIM_REGISTEREDPROFILE.NAME);
        if (property != null) {
            property = setPropertyValue_Dependent_CIM_RegisteredProfile(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_REGISTEREDPROFILE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Dependent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Dependent_CIM_RegisteredProfile(
            CIMProperty currentProperty, CIM_RegisteredProfile newValue) {
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
        return CIM_ReferencedProfile.CIM_CLASS_NAME;
    }

}