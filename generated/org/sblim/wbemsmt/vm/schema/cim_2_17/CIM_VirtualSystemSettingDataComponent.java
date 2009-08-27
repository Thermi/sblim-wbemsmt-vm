/**
 * CIM_VirtualSystemSettingDataComponent.java Â© Copyright IBM Corp. 2006,2007 THIS FILE IS PROVIDED
 * UNDER THE TER MS OF THE COMMON PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR
 * DISTRIBUTION OF THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a
 * current copy of the Common Public License from http://www.opensource.org/licenses/cpl1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: The CIM_VirtualSystemSettingDataComponent
 *            association establishes a 'part of' relationship between an instance of the
 *            CIM_VirtualSystemSettingData class and a set of instances of the
 *            CIM_ResourceAllocationSettingData class. generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_VirtualSystemSettingDataComponent extends CIM_Component {

    public final static String CIM_CLASS_NAME = "CIM_VirtualSystemSettingDataComponent";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property GroupComponent
     * 
     */
    public static class PROPERTY_GROUPCOMPONENT_CIM_VIRTUALSYSTEMSETTINGDATA {
        /**
         * name of the property GroupComponent
         */
        public final static String NAME = "GroupComponent";

    }

    /**
     * Constants of property PartComponent
     * 
     */
    public static class PROPERTY_PARTCOMPONENT_CIM_RESOURCEALLOCATIONSETTINGDATA {
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
     *   The CIM_VirtualSystemSettingDataComponent association establishes a 'part of' relationship between an instance of the CIM_VirtualSystemSettingData class and a set of instances of the CIM_ResourceAllocationSettingData class.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_VirtualSystemSettingDataComponent(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The CIM_VirtualSystemSettingDataComponent association establishes a 'part of' relationship between an instance of the CIM_VirtualSystemSettingData class and a set of instances of the CIM_ResourceAllocationSettingData class.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_VirtualSystemSettingDataComponent(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_VirtualSystemSettingDataComponent() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("GroupComponent", new CIMProperty("GroupComponent", new CIMDataType(
                CIM_VirtualSystemSettingData.CIM_CLASS_NAME), null));
        propertiesToCheck.put("PartComponent", new CIMProperty("PartComponent", new CIMDataType(
                CIM_ResourceAllocationSettingData.CIM_CLASS_NAME), null));

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
     * Get the property GroupComponent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_VirtualSystemSettingData get_GroupComponent_CIM_VirtualSystemSettingData(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPCOMPONENT_CIM_VIRTUALSYSTEMSETTINGDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_VIRTUALSYSTEMSETTINGDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_VirtualSystemSettingDataHelper.getInstance(client,
                (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property GroupComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_GroupComponent_CIM_VirtualSystemSettingData(
            CIM_VirtualSystemSettingData newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPCOMPONENT_CIM_VIRTUALSYSTEMSETTINGDATA.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_GroupComponent_CIM_VirtualSystemSettingData(
                    currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_VIRTUALSYSTEMSETTINGDATA.NAME
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

    public static CIMProperty create_GroupComponent_CIM_VirtualSystemSettingData(WBEMClient client,
            String namespace, CIM_VirtualSystemSettingData newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingDataComponent fco = new CIM_VirtualSystemSettingDataComponent(
                client, namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_GROUPCOMPONENT_CIM_VIRTUALSYSTEMSETTINGDATA.NAME);
        if (property != null) {
            property = setPropertyValue_GroupComponent_CIM_VirtualSystemSettingData(property,
                    newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_VIRTUALSYSTEMSETTINGDATA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property GroupComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_GroupComponent_CIM_VirtualSystemSettingData(
            CIMProperty currentProperty, CIM_VirtualSystemSettingData newValue) {
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

    public CIM_ResourceAllocationSettingData get_PartComponent_CIM_ResourceAllocationSettingData(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTCOMPONENT_CIM_RESOURCEALLOCATIONSETTINGDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property "
                    + PROPERTY_PARTCOMPONENT_CIM_RESOURCEALLOCATIONSETTINGDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ResourceAllocationSettingDataHelper.getInstance(client,
                (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property PartComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PartComponent_CIM_ResourceAllocationSettingData(
            CIM_ResourceAllocationSettingData newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTCOMPONENT_CIM_RESOURCEALLOCATIONSETTINGDATA.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PartComponent_CIM_ResourceAllocationSettingData(
                    currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property "
                    + PROPERTY_PARTCOMPONENT_CIM_RESOURCEALLOCATIONSETTINGDATA.NAME
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

    public static CIMProperty create_PartComponent_CIM_ResourceAllocationSettingData(
            WBEMClient client, String namespace, CIM_ResourceAllocationSettingData newValue)
            throws WbemsmtException {
        CIM_VirtualSystemSettingDataComponent fco = new CIM_VirtualSystemSettingDataComponent(
                client, namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_PARTCOMPONENT_CIM_RESOURCEALLOCATIONSETTINGDATA.NAME);
        if (property != null) {
            property = setPropertyValue_PartComponent_CIM_ResourceAllocationSettingData(property,
                    newValue);
        }
        else {
            logger.warning("Property "
                    + PROPERTY_PARTCOMPONENT_CIM_RESOURCEALLOCATIONSETTINGDATA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PartComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_PartComponent_CIM_ResourceAllocationSettingData(
            CIMProperty currentProperty, CIM_ResourceAllocationSettingData newValue) {
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
        return CIM_VirtualSystemSettingDataComponent.CIM_CLASS_NAME;
    }

}