/** 
 * CIM_SettingsDefineState.java
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
 * Description: SettingsDefineState is used to associate an instance of SettingData with an instance of ManagedElement. This association indicates that the SettingData instance provides additional information about the Current State of the associated ManagedElement. State is broadly defined to include the configuration, status, capabilities, and other information of an instance. 
 * Use of the same instance of SettingData to represent more than one of Current State (SettingsDefineState) and Desired State (ElementSettingData) and Possible State (SettingsDefineCapabilities) for a ManagedElement is not recommended.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_SettingsDefineState extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_SettingsDefineState";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ManagedElement
     * 
     */
    public static class PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT {
        /**
         * name of the property ManagedElement
         */
        public final static String NAME = "ManagedElement";

    }

    /**
     * Constants of property SettingData
     * 
     */
    public static class PROPERTY_SETTINGDATA_CIM_SETTINGDATA {
        /**
         * name of the property SettingData
         */
        public final static String NAME = "SettingData";

    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");

    };

    //**********************************************************************
    // Constructors     
    //**********************************************************************

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   SettingsDefineState is used to associate an instance of SettingData with an instance of ManagedElement. This association indicates that the SettingData instance provides additional information about the Current State of the associated ManagedElement. State is broadly defined to include the configuration, status, capabilities, and other information of an instance. 
     * Use of the same instance of SettingData to represent more than one of Current State (SettingsDefineState) and Desired State (ElementSettingData) and Possible State (SettingsDefineCapabilities) for a ManagedElement is not recommended.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_SettingsDefineState(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   SettingsDefineState is used to associate an instance of SettingData with an instance of ManagedElement. This association indicates that the SettingData instance provides additional information about the Current State of the associated ManagedElement. State is broadly defined to include the configuration, status, capabilities, and other information of an instance. 
     * Use of the same instance of SettingData to represent more than one of Current State (SettingsDefineState) and Desired State (ElementSettingData) and Possible State (SettingsDefineCapabilities) for a ManagedElement is not recommended.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_SettingsDefineState(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_SettingsDefineState() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ManagedElement", new CIMProperty("ManagedElement", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), null));
        propertiesToCheck.put("SettingData", new CIMProperty("SettingData", new CIMDataType(
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
     * Get the property ManagedElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedElement get_ManagedElement_CIM_ManagedElement(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property ManagedElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ManagedElement_CIM_ManagedElement(CIM_ManagedElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ManagedElement_CIM_ManagedElement(currentProperty,
                    newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ManagedElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ManagedElement_CIM_ManagedElement(WBEMClient client,
            String namespace, CIM_ManagedElement newValue) throws WbemsmtException {
        CIM_SettingsDefineState fco = new CIM_SettingsDefineState(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_ManagedElement_CIM_ManagedElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ManagedElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_ManagedElement_CIM_ManagedElement(
            CIMProperty currentProperty, CIM_ManagedElement newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SettingData
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_SettingData get_SettingData_CIM_SettingData(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SETTINGDATA_CIM_SETTINGDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SETTINGDATA_CIM_SETTINGDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_SettingDataHelper
                .getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property SettingData
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SettingData_CIM_SettingData(CIM_SettingData newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SETTINGDATA_CIM_SETTINGDATA.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SettingData_CIM_SettingData(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SETTINGDATA_CIM_SETTINGDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SettingData by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SettingData_CIM_SettingData(WBEMClient client,
            String namespace, CIM_SettingData newValue) throws WbemsmtException {
        CIM_SettingsDefineState fco = new CIM_SettingsDefineState(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SETTINGDATA_CIM_SETTINGDATA.NAME);
        if (property != null) {
            property = setPropertyValue_SettingData_CIM_SettingData(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SETTINGDATA_CIM_SETTINGDATA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SettingData
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_SettingData_CIM_SettingData(
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
     * returns true if the objects are the same
     * 
     * @return
     * @see org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco\#equals(Object)
     */
    public boolean equals(Object object) {
        if (!(object instanceof CIM_SettingsDefineState)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_SettingsDefineState.CIM_CLASS_NAME;
    }

}