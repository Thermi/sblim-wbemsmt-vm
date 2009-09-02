/**
 * CIM_MountedElement.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS PROVIDED UNDER THE TER MS
 * OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Eclipse
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: An association derived from AttachedElement
 *            for use in attaching a FileSystem to a LogicalFile (or Directory). The semantics of
 *            this relationship require that the SystemElement LogicalFile be contained by a
 *            FileSystem (via the FileStorage association) that is different from the FileSystem
 *            referenced as the SameElement. The LogicalFile's containing FileSystem could be either
 *            local or remote. For example, a LocalFileSystem on a Solaris ComputerSystem can mount
 *            on its LogicalFile a FileSystem accessed via the machine's CDROM drive, i.e., another
 *            LocalFileSystem. On the other hand, in a 'remote' case, the LogicalFile must be
 *            surfaced in the namespace of the local host appropriately. generated Class
 */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_MountedElement extends CIM_AttachedElement {

    public final static String CIM_CLASS_NAME = "CIM_MountedElement";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property SystemElement
     * 
     */
    public static class PROPERTY_SYSTEMELEMENT_CIM_LOGICALELEMENT {
        /**
         * name of the property SystemElement
         */
        public final static String NAME = "SystemElement";

    }

    /**
     * Constants of property SameElement
     * 
     */
    public static class PROPERTY_SAMEELEMENT_CIM_LOGICALELEMENT {
        /**
         * name of the property SameElement
         */
        public final static String NAME = "SameElement";

    }

    static {
        addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
        String[] parentClassPackageList = CIM_AttachedElement.getPackages();

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
     *   An association derived from AttachedElement for use in attaching a FileSystem to a LogicalFile (or Directory). The semantics of this relationship require that the SystemElement LogicalFile be contained by a FileSystem (via the FileStorage association) that is different from the FileSystem referenced as the SameElement. The LogicalFile's containing FileSystem could be either local or remote. For example, a LocalFileSystem on a Solaris ComputerSystem can mount on its LogicalFile a FileSystem accessed via the machine's CDROM drive, i.e., another LocalFileSystem. On the other hand, in a 'remote' case, the LogicalFile must be surfaced in the namespace of the local host appropriately.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_MountedElement(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   An association derived from AttachedElement for use in attaching a FileSystem to a LogicalFile (or Directory). The semantics of this relationship require that the SystemElement LogicalFile be contained by a FileSystem (via the FileStorage association) that is different from the FileSystem referenced as the SameElement. The LogicalFile's containing FileSystem could be either local or remote. For example, a LocalFileSystem on a Solaris ComputerSystem can mount on its LogicalFile a FileSystem accessed via the machine's CDROM drive, i.e., another LocalFileSystem. On the other hand, in a 'remote' case, the LogicalFile must be surfaced in the namespace of the local host appropriately.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_MountedElement(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_MountedElement() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("SystemElement", new CIMProperty("SystemElement", new CIMDataType(
                CIM_LogicalElement.CIM_CLASS_NAME), null));
        propertiesToCheck.put("SameElement", new CIMProperty("SameElement", new CIMDataType(
                CIM_LogicalElement.CIM_CLASS_NAME), null));

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
     * Get the property SystemElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_LogicalElement get_SystemElement_CIM_LogicalElement(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMELEMENT_CIM_LOGICALELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYSTEMELEMENT_CIM_LOGICALELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_LogicalElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property SystemElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SystemElement_CIM_LogicalElement(CIM_LogicalElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMELEMENT_CIM_LOGICALELEMENT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SystemElement_CIM_LogicalElement(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMELEMENT_CIM_LOGICALELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SystemElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SystemElement_CIM_LogicalElement(WBEMClient client,
            String namespace, CIM_LogicalElement newValue) throws WbemsmtException {
        CIM_MountedElement fco = new CIM_MountedElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMELEMENT_CIM_LOGICALELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_SystemElement_CIM_LogicalElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMELEMENT_CIM_LOGICALELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SystemElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_SystemElement_CIM_LogicalElement(
            CIMProperty currentProperty, CIM_LogicalElement newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SameElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_LogicalElement get_SameElement_CIM_LogicalElement(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SAMEELEMENT_CIM_LOGICALELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SAMEELEMENT_CIM_LOGICALELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_LogicalElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property SameElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SameElement_CIM_LogicalElement(CIM_LogicalElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SAMEELEMENT_CIM_LOGICALELEMENT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SameElement_CIM_LogicalElement(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SAMEELEMENT_CIM_LOGICALELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SameElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SameElement_CIM_LogicalElement(WBEMClient client,
            String namespace, CIM_LogicalElement newValue) throws WbemsmtException {
        CIM_MountedElement fco = new CIM_MountedElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SAMEELEMENT_CIM_LOGICALELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_SameElement_CIM_LogicalElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SAMEELEMENT_CIM_LOGICALELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SameElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_SameElement_CIM_LogicalElement(
            CIMProperty currentProperty, CIM_LogicalElement newValue) {
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
        return CIM_MountedElement.CIM_CLASS_NAME;
    }

}