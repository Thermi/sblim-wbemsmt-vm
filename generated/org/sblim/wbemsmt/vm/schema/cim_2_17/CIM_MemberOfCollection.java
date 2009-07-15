/** 
 * CIM_MemberOfCollection.java
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
 * Description: CIM_MemberOfCollection is an aggregation used to establish membership of ManagedElements in a Collection.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_MemberOfCollection extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_MemberOfCollection";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Collection
     * 
     */
    public static class PROPERTY_COLLECTION_CIM_COLLECTION {
        /**
         * name of the property Collection
         */
        public final static String NAME = "Collection";

    }

    /**
     * Constants of property Member
     * 
     */
    public static class PROPERTY_MEMBER_CIM_MANAGEDELEMENT {
        /**
         * name of the property Member
         */
        public final static String NAME = "Member";

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
     *   CIM_MemberOfCollection is an aggregation used to establish membership of ManagedElements in a Collection.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_MemberOfCollection(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_MemberOfCollection is an aggregation used to establish membership of ManagedElements in a Collection.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_MemberOfCollection(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_MemberOfCollection() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Collection", new CIMProperty("Collection", new CIMDataType(
                CIM_Collection.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Member", new CIMProperty("Member", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), null));

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
     * Get the property Collection
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Collection get_Collection_CIM_Collection(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_COLLECTION_CIM_COLLECTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_COLLECTION_CIM_COLLECTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_CollectionHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Collection
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Collection_CIM_Collection(CIM_Collection newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_COLLECTION_CIM_COLLECTION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Collection_CIM_Collection(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_COLLECTION_CIM_COLLECTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Collection by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Collection_CIM_Collection(WBEMClient client, String namespace,
            CIM_Collection newValue) throws WbemsmtException {
        CIM_MemberOfCollection fco = new CIM_MemberOfCollection(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_COLLECTION_CIM_COLLECTION.NAME);
        if (property != null) {
            property = setPropertyValue_Collection_CIM_Collection(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_COLLECTION_CIM_COLLECTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Collection
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Collection_CIM_Collection(
            CIMProperty currentProperty, CIM_Collection newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Member
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedElement get_Member_CIM_ManagedElement(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_MEMBER_CIM_MANAGEDELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MEMBER_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Member
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Member_CIM_ManagedElement(CIM_ManagedElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MEMBER_CIM_MANAGEDELEMENT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Member_CIM_ManagedElement(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MEMBER_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Member by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Member_CIM_ManagedElement(WBEMClient client, String namespace,
            CIM_ManagedElement newValue) throws WbemsmtException {
        CIM_MemberOfCollection fco = new CIM_MemberOfCollection(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MEMBER_CIM_MANAGEDELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_Member_CIM_ManagedElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MEMBER_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Member
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Member_CIM_ManagedElement(
            CIMProperty currentProperty, CIM_ManagedElement newValue) {
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
        if (!(object instanceof CIM_MemberOfCollection)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_MemberOfCollection.CIM_CLASS_NAME;
    }

}