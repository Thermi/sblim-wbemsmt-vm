/** 
  * CIM_IndicationFilter.java
  *
  * 
  * Â© Copyright IBM Corp. 2006,2007
  *
  * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE COMMON PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Common Public License from
  * http://www.opensource.org/licenses/cpl1.0.php
  *
  * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm
  *
  * Contributors:
  *    Prashanth Karnam<prkarnam@in.ibm.com> 
  * 
  * Description: CIM_IndicationFilter defines the criteria for generating an instance of CIM_Indication and what data should be returned in that instance. It is derived from CIM_ManagedElement to allow modeling the dependency of the filter on a specific service.
  * If used with the "DMTF:CQLT" language, the processing and CQLT tokens that must be supported are described in the description of the QueryLanguage property
  * 
  * generated Class
  */

package org.sblim.wbemsmt.vm.schema.cim_2_17;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
   import org.sblim.wbemsmt.exception.impl.*;
	   import org.sblim.wbemsmt.exception.impl.userobject.*;




import java.lang.reflect.*;
import javax.wbem.*;
public class CIM_IndicationFilter extends  CIM_ManagedElement {



   public final static String CIM_CLASS_NAME = "CIM_IndicationFilter";
   public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    
    /**
     * CIM_IndicationSubscription describes a flow of Indications. The flow is specified by the referenced Filter, and directed to the referenced destination or process in the Handler. Property values of the referenced CIM_IndicationFilter instance and CIM_ListenerDestination instance MAY significantly effect the definition of the subscription. E.g., a subscription associated with a "Transient" destination MAY be deleted when the destination terminates or is no longer available.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION = "CIM_IndicationSubscription";
    
    
    
	    /**
	     * Constants of property CreationClassName
     * Indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, it allows all instances of this class and its subclasses to be uniquely identified.
     */
    public static class PROPERTY_CREATIONCLASSNAME
    {
       /**
        * name of the property CreationClassName
        */
       public final static String NAME = "CreationClassName";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property IndividualSubscriptionSupported
     * If IndividualSubscriptionSupported is true, the implementation shall support direct subscription to this IndicationFilter. If IndividualSubscriptionSupported is false, the implementation shall not support direct subscription to this IndicationFilter.
     */
    public static class PROPERTY_INDIVIDUALSUBSCRIPTIONSUPPORTED
    {
       /**
        * name of the property IndividualSubscriptionSupported
        */
       public final static String NAME = "IndividualSubscriptionSupported";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Name
     * The name of the filter.
     */
    public static class PROPERTY_NAME
    {
       /**
        * name of the property Name
        */
       public final static String NAME = "Name";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Query
     * A query expression that defines the condition(s) under which instances of CIM_Indication will be generated. For CIM_InstIndication subclasses of CIM_Indication classes, the query expression may also define the instance properties to be copied to the CIM_InstIndication's SourceInstance and PreviousInstance properties. Query language semantics include projection (e.g., Select), range (e.g., From) and predicate (e.g., Where). 
     * When used with QueryLanguage set to "DMTF:CQL" or "DMTF:CQLT", the FROM clause shall contain at least one subclass of CIM_Indication and may contain any number of other classes or subqueries. If only one subclass of CIM_Indication is named, it defines the CIM_Indication that this Instance of CIM_IndicationFilter will produce. If more than one subclass of CIM_Indication is named, then one of them must be named explicitly in the select-list. 
     * The select-list must refer explicitly or implicitly to exactly one CIM_Indication subclass. In addition, it shall conform to one of several options: 
     * 1) only a "*": This may only be used if the Indication subclass is the only entry on the FROM list. 
     * 2) only a "<Indicationclass or alias>.*": This form may be used if the FROM clause contains more than one Indication subclass. 
     * 3) a list of the form "<propertyname>*[","[<literal> AS ]<propertyname>]": This form may only be used if the CIM_Indication subclass is the only entry on the FROM list. In this form, the literal is assigned to the named property of the selected CIM_Indication subclass 
     * 4) a list of the form "<Indicationname>.<propertyname> *["," [<Indicationname>.<propertyname> |"": <literal> AS <propertyname> | <fromname>.<propertyname> AS <propertyname> ] ]" : The first term selects the appropriate CIM_Indication subclass to produce. Subsequent terms allow other properties of that indication, or allow a literal or property of another class to be assigned to the output as one of the properties of the selected CIM_Indication subclass. 
     * Note that in all cases, only the property names of the selected CIM_Indication subclass may be referred to in the select-list.
     * When used with "DMTF:CQLT", the additional string array property TemplateVariable should be used to provide additional filtering information to the query.
     */
    public static class PROPERTY_QUERY
    {
       /**
        * name of the property Query
        */
       public final static String NAME = "Query";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property QueryLanguage
     * The language in which the query is expressed. . 
     * "DMTF:CQL" indicates a CIM Query Language string. 
     * "DMTF:CQLT" indicates a CIM Query Language Template string. When used, the identifiers recognized in the $identifier$ tokens are "SELF" and the property names of this class, or one of its subclasses. As seen by a CIM client, the value of the Query property is not changed as a result of template processing. Template processing conceptually produces a new query string, which defines the actual conditions that will trigger production of a CIM_Indication instance. When used in the Query string, $SELF$ will be replaced by a string corresponding to a WBEM URI referencing the instance of this class that contains the Query template string. Tokens of the form $<propertyname>$ will be replaced by a string representing the corresponding property value of the instance of this class that contains the Query string. The Query string must be evaluated when the CIM_IndicationFilter is created and at any time when one any modification of any property referenced by tokens in the Query string are modified.
     */
    public static class PROPERTY_QUERYLANGUAGE
    {
       /**
        * name of the property QueryLanguage
        */
       public final static String NAME = "QueryLanguage";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property SourceNamespace
     * The path to a local namespace where the Indications originate. If NULL, the namespace of the Filter registration is assumed.
     */
    public static class PROPERTY_SOURCENAMESPACE
    {
       /**
        * name of the property SourceNamespace
        */
       public final static String NAME = "SourceNamespace";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property SourceNamespaces
     * The names of the local namespaces where the Indications originate. If NULL, the namespace of the Filter registration is assumed. SourceNamespaces replaces the SourceNamespace property on IndicationFilter to provide a means of defining the multiple namespaces where indications may originate.
     */
    public static class PROPERTY_SOURCENAMESPACES
    {
       /**
        * name of the property SourceNamespaces
        */
       public final static String NAME = "SourceNamespaces";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property SystemCreationClassName
     * A System's CreationClassName. The Filter is defined in the context of a CIM_System, where it is hosted or to which it applies. In a future release, a weak relationship will be explicitly added to the model. This is not done now to allow further refinement of the Filter definition and its inheritance tree. Keys are defined now to allow the class to be instantiated.
     */
    public static class PROPERTY_SYSTEMCREATIONCLASSNAME
    {
       /**
        * name of the property SystemCreationClassName
        */
       public final static String NAME = "SystemCreationClassName";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property SystemName
     * A System's Name. The Filter is defined in the context of a CIM_System, where it is hosted or to which it applies. In a future release, a weak relationship will be explicitly added to the model. This is not done now to allow further refinement of the Filter definition and its inheritance tree. Keys are defined now to allow the class to be instantiated.
     */
    public static class PROPERTY_SYSTEMNAME
    {
       /**
        * name of the property SystemName
        */
       public final static String NAME = "SystemName";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property TemplateVariable
     * This property may be used to hold application specific filtering information for use within a "DMTF:CQLT" formatted query.
     * 
     * For example, each TemplateVariable entry might be filled with the WBEM URI formatted object path of a CIM_ManagedElement, as in the following example, which selects only indications against namedCIM_StorageSynchonized instances. It then uses SELF to select the executing IndicationFilter, and then uses the entries of the TemplateVariable array to select particular instances of CIM_StorageSynchronized.
     * 
     * SELECT I.* 
     * FROM CIM_InstIndication I, CIM_IndicationFilter F 
     * WHERE I.SourceInstance ISA CIM_StorageSynchronized 
     * 	AND ObjectPath(F) = ObjectPath($SELF$)
     * 	AND ANY x IN F.TemplateVariable[*]
     * 		SATISFIES (ObjectPath(I.SourceInstanceModelPath) = ObjectPath(x)).
     */
    public static class PROPERTY_TEMPLATEVARIABLE
    {
       /**
        * name of the property TemplateVariable
        */
       public final static String NAME = "TemplateVariable";                  

	    	
    

    		    
	
	    
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
    *   CIM_IndicationFilter defines the criteria for generating an instance of CIM_Indication and what data should be returned in that instance. It is derived from CIM_ManagedElement to allow modeling the dependency of the filter on a specific service.
     * If used with the "DMTF:CQLT" language, the processing and CQLT tokens that must be supported are described in the description of the QueryLanguage property
    *   @param client the CIM Client
    *   @param namespace the target namespace
    */  

      
   public CIM_IndicationFilter(WBEMClient client, String namespace) throws WbemsmtException
   {
       CIMClass cls = getClass(client,namespace);
       setFromServer(false);
       init(cls.newInstance(),true);
   }
        
   /**
    *   Class constructor
    * 
    *       *   <br>
    *   CIM_IndicationFilter defines the criteria for generating an instance of CIM_Indication and what data should be returned in that instance. It is derived from CIM_ManagedElement to allow modeling the dependency of the filter on a specific service.
     * If used with the "DMTF:CQLT" language, the processing and CQLT tokens that must be supported are described in the description of the QueryLanguage property
    *   @param cimInstance the instance that is used to create the Object
    */  
   
   public CIM_IndicationFilter(CIMInstance cimInstance)  throws WbemsmtException { 
        
       if (cimInstance == null) {
           throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimInstance parameter does not contain a valid reference.");
       }
       setFromServer(true);
       init(cimInstance,false);
   }
   
   /**
    * Default constructor
    */
   protected CIM_IndicationFilter()
   {	
   }
   
   /**
    * initializes the FCO
    *
    *   @param cimInstance the instance that is used to create the Object
    *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
    */
   protected void init(CIMInstance cimInstance,boolean overwrite) throws WbemsmtException
   {
              propertiesToCheck.put("CreationClassName",new CIMProperty("CreationClassName",CIMDataType.STRING_T,null));
              propertiesToCheck.put("IndividualSubscriptionSupported",new CIMProperty("IndividualSubscriptionSupported",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("Name",new CIMProperty("Name",CIMDataType.STRING_T,null));
              propertiesToCheck.put("Query",new CIMProperty("Query",CIMDataType.STRING_T,null));
              propertiesToCheck.put("QueryLanguage",new CIMProperty("QueryLanguage",CIMDataType.STRING_T,null));
              propertiesToCheck.put("SourceNamespace",new CIMProperty("SourceNamespace",CIMDataType.STRING_T,null));
              propertiesToCheck.put("SourceNamespaces",new CIMProperty("SourceNamespaces",CIMDataType.STRING_ARRAY_T,null));
              propertiesToCheck.put("SystemCreationClassName",new CIMProperty("SystemCreationClassName",CIMDataType.STRING_T,null));
              propertiesToCheck.put("SystemName",new CIMProperty("SystemName",CIMDataType.STRING_T,null));
              propertiesToCheck.put("TemplateVariable",new CIMProperty("TemplateVariable",CIMDataType.STRING_ARRAY_T,null));
       	
	       super.init(cimInstance,overwrite);
	       
	       
	       //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
	       //we overwrite the dataType by setting null for every embeddedObject/Instance property
	       if (overwrite)
	       {
			                                                                                                                                                                                                                  
       }
   }

//**********************************************************************
// Properties get/set     
//**********************************************************************


   
   
   /**
    * Get the property CreationClassName
    *     * <br>
    * Indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, it allows all instances of this class and its subclasses to be uniquely identified.
    *     */

      

               
   public String get_key_CreationClassName()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CREATIONCLASSNAME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property CreationClassName
    * <br>
    * Indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, it allows all instances of this class and its subclasses to be uniquely identified.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_CreationClassName(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CREATIONCLASSNAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_CreationClassName(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property CreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_CreationClassName(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_IndicationFilter fco = new CIM_IndicationFilter(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CREATIONCLASSNAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_CreationClassName(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property CreationClassName
    * <br>
    * Indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, it allows all instances of this class and its subclasses to be uniquely identified.
    */
    
   private static CIMProperty setPropertyValue_key_CreationClassName(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property IndividualSubscriptionSupported
    *     * <br>
    * If IndividualSubscriptionSupported is true, the implementation shall support direct subscription to this IndicationFilter. If IndividualSubscriptionSupported is false, the implementation shall not support direct subscription to this IndicationFilter.
    *     */

      

               
   public Boolean get_IndividualSubscriptionSupported()    {
       CIMProperty currentProperty = getProperty(PROPERTY_INDIVIDUALSUBSCRIPTIONSUPPORTED.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_INDIVIDUALSUBSCRIPTIONSUPPORTED.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property IndividualSubscriptionSupported
    * <br>
    * If IndividualSubscriptionSupported is true, the implementation shall support direct subscription to this IndicationFilter. If IndividualSubscriptionSupported is false, the implementation shall not support direct subscription to this IndicationFilter.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_IndividualSubscriptionSupported(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_INDIVIDUALSUBSCRIPTIONSUPPORTED.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_IndividualSubscriptionSupported(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_INDIVIDUALSUBSCRIPTIONSUPPORTED.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property IndividualSubscriptionSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IndividualSubscriptionSupported(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        CIM_IndicationFilter fco = new CIM_IndicationFilter(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INDIVIDUALSUBSCRIPTIONSUPPORTED.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_IndividualSubscriptionSupported(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_INDIVIDUALSUBSCRIPTIONSUPPORTED.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property IndividualSubscriptionSupported
    * <br>
    * If IndividualSubscriptionSupported is true, the implementation shall support direct subscription to this IndicationFilter. If IndividualSubscriptionSupported is false, the implementation shall not support direct subscription to this IndicationFilter.
    */
    
   private static CIMProperty setPropertyValue_IndividualSubscriptionSupported(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Name
    *     * <br>
    * The name of the filter.
    *     */

      

               
   public String get_key_Name()    {
       CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Name
    * <br>
    * The name of the filter.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_Name(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_Name(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Name by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_Name(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_IndicationFilter fco = new CIM_IndicationFilter(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_Name(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Name
    * <br>
    * The name of the filter.
    */
    
   private static CIMProperty setPropertyValue_key_Name(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Query
    *     * <br>
    * A query expression that defines the condition(s) under which instances of CIM_Indication will be generated. For CIM_InstIndication subclasses of CIM_Indication classes, the query expression may also define the instance properties to be copied to the CIM_InstIndication's SourceInstance and PreviousInstance properties. Query language semantics include projection (e.g., Select), range (e.g., From) and predicate (e.g., Where). 
     * When used with QueryLanguage set to "DMTF:CQL" or "DMTF:CQLT", the FROM clause shall contain at least one subclass of CIM_Indication and may contain any number of other classes or subqueries. If only one subclass of CIM_Indication is named, it defines the CIM_Indication that this Instance of CIM_IndicationFilter will produce. If more than one subclass of CIM_Indication is named, then one of them must be named explicitly in the select-list. 
     * The select-list must refer explicitly or implicitly to exactly one CIM_Indication subclass. In addition, it shall conform to one of several options: 
     * 1) only a "*": This may only be used if the Indication subclass is the only entry on the FROM list. 
     * 2) only a "<Indicationclass or alias>.*": This form may be used if the FROM clause contains more than one Indication subclass. 
     * 3) a list of the form "<propertyname>*[","[<literal> AS ]<propertyname>]": This form may only be used if the CIM_Indication subclass is the only entry on the FROM list. In this form, the literal is assigned to the named property of the selected CIM_Indication subclass 
     * 4) a list of the form "<Indicationname>.<propertyname> *["," [<Indicationname>.<propertyname> |"": <literal> AS <propertyname> | <fromname>.<propertyname> AS <propertyname> ] ]" : The first term selects the appropriate CIM_Indication subclass to produce. Subsequent terms allow other properties of that indication, or allow a literal or property of another class to be assigned to the output as one of the properties of the selected CIM_Indication subclass. 
     * Note that in all cases, only the property names of the selected CIM_Indication subclass may be referred to in the select-list.
     * When used with "DMTF:CQLT", the additional string array property TemplateVariable should be used to provide additional filtering information to the query.
    *     */

      

               
   public String get_Query()    {
       CIMProperty currentProperty = getProperty(PROPERTY_QUERY.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_QUERY.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Query
    * <br>
    * A query expression that defines the condition(s) under which instances of CIM_Indication will be generated. For CIM_InstIndication subclasses of CIM_Indication classes, the query expression may also define the instance properties to be copied to the CIM_InstIndication's SourceInstance and PreviousInstance properties. Query language semantics include projection (e.g., Select), range (e.g., From) and predicate (e.g., Where). 
     * When used with QueryLanguage set to "DMTF:CQL" or "DMTF:CQLT", the FROM clause shall contain at least one subclass of CIM_Indication and may contain any number of other classes or subqueries. If only one subclass of CIM_Indication is named, it defines the CIM_Indication that this Instance of CIM_IndicationFilter will produce. If more than one subclass of CIM_Indication is named, then one of them must be named explicitly in the select-list. 
     * The select-list must refer explicitly or implicitly to exactly one CIM_Indication subclass. In addition, it shall conform to one of several options: 
     * 1) only a "*": This may only be used if the Indication subclass is the only entry on the FROM list. 
     * 2) only a "<Indicationclass or alias>.*": This form may be used if the FROM clause contains more than one Indication subclass. 
     * 3) a list of the form "<propertyname>*[","[<literal> AS ]<propertyname>]": This form may only be used if the CIM_Indication subclass is the only entry on the FROM list. In this form, the literal is assigned to the named property of the selected CIM_Indication subclass 
     * 4) a list of the form "<Indicationname>.<propertyname> *["," [<Indicationname>.<propertyname> |"": <literal> AS <propertyname> | <fromname>.<propertyname> AS <propertyname> ] ]" : The first term selects the appropriate CIM_Indication subclass to produce. Subsequent terms allow other properties of that indication, or allow a literal or property of another class to be assigned to the output as one of the properties of the selected CIM_Indication subclass. 
     * Note that in all cases, only the property names of the selected CIM_Indication subclass may be referred to in the select-list.
     * When used with "DMTF:CQLT", the additional string array property TemplateVariable should be used to provide additional filtering information to the query.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Query(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_QUERY.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Query(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_QUERY.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Query by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Query(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_IndicationFilter fco = new CIM_IndicationFilter(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_QUERY.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Query(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_QUERY.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Query
    * <br>
    * A query expression that defines the condition(s) under which instances of CIM_Indication will be generated. For CIM_InstIndication subclasses of CIM_Indication classes, the query expression may also define the instance properties to be copied to the CIM_InstIndication's SourceInstance and PreviousInstance properties. Query language semantics include projection (e.g., Select), range (e.g., From) and predicate (e.g., Where). 
     * When used with QueryLanguage set to "DMTF:CQL" or "DMTF:CQLT", the FROM clause shall contain at least one subclass of CIM_Indication and may contain any number of other classes or subqueries. If only one subclass of CIM_Indication is named, it defines the CIM_Indication that this Instance of CIM_IndicationFilter will produce. If more than one subclass of CIM_Indication is named, then one of them must be named explicitly in the select-list. 
     * The select-list must refer explicitly or implicitly to exactly one CIM_Indication subclass. In addition, it shall conform to one of several options: 
     * 1) only a "*": This may only be used if the Indication subclass is the only entry on the FROM list. 
     * 2) only a "<Indicationclass or alias>.*": This form may be used if the FROM clause contains more than one Indication subclass. 
     * 3) a list of the form "<propertyname>*[","[<literal> AS ]<propertyname>]": This form may only be used if the CIM_Indication subclass is the only entry on the FROM list. In this form, the literal is assigned to the named property of the selected CIM_Indication subclass 
     * 4) a list of the form "<Indicationname>.<propertyname> *["," [<Indicationname>.<propertyname> |"": <literal> AS <propertyname> | <fromname>.<propertyname> AS <propertyname> ] ]" : The first term selects the appropriate CIM_Indication subclass to produce. Subsequent terms allow other properties of that indication, or allow a literal or property of another class to be assigned to the output as one of the properties of the selected CIM_Indication subclass. 
     * Note that in all cases, only the property names of the selected CIM_Indication subclass may be referred to in the select-list.
     * When used with "DMTF:CQLT", the additional string array property TemplateVariable should be used to provide additional filtering information to the query.
    */
    
   private static CIMProperty setPropertyValue_Query(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property QueryLanguage
    *     * <br>
    * The language in which the query is expressed. . 
     * "DMTF:CQL" indicates a CIM Query Language string. 
     * "DMTF:CQLT" indicates a CIM Query Language Template string. When used, the identifiers recognized in the $identifier$ tokens are "SELF" and the property names of this class, or one of its subclasses. As seen by a CIM client, the value of the Query property is not changed as a result of template processing. Template processing conceptually produces a new query string, which defines the actual conditions that will trigger production of a CIM_Indication instance. When used in the Query string, $SELF$ will be replaced by a string corresponding to a WBEM URI referencing the instance of this class that contains the Query template string. Tokens of the form $<propertyname>$ will be replaced by a string representing the corresponding property value of the instance of this class that contains the Query string. The Query string must be evaluated when the CIM_IndicationFilter is created and at any time when one any modification of any property referenced by tokens in the Query string are modified.
    *     */

      

               
   public String get_QueryLanguage()    {
       CIMProperty currentProperty = getProperty(PROPERTY_QUERYLANGUAGE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_QUERYLANGUAGE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property QueryLanguage
    * <br>
    * The language in which the query is expressed. . 
     * "DMTF:CQL" indicates a CIM Query Language string. 
     * "DMTF:CQLT" indicates a CIM Query Language Template string. When used, the identifiers recognized in the $identifier$ tokens are "SELF" and the property names of this class, or one of its subclasses. As seen by a CIM client, the value of the Query property is not changed as a result of template processing. Template processing conceptually produces a new query string, which defines the actual conditions that will trigger production of a CIM_Indication instance. When used in the Query string, $SELF$ will be replaced by a string corresponding to a WBEM URI referencing the instance of this class that contains the Query template string. Tokens of the form $<propertyname>$ will be replaced by a string representing the corresponding property value of the instance of this class that contains the Query string. The Query string must be evaluated when the CIM_IndicationFilter is created and at any time when one any modification of any property referenced by tokens in the Query string are modified.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_QueryLanguage(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_QUERYLANGUAGE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_QueryLanguage(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_QUERYLANGUAGE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property QueryLanguage by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_QueryLanguage(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_IndicationFilter fco = new CIM_IndicationFilter(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_QUERYLANGUAGE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_QueryLanguage(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_QUERYLANGUAGE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property QueryLanguage
    * <br>
    * The language in which the query is expressed. . 
     * "DMTF:CQL" indicates a CIM Query Language string. 
     * "DMTF:CQLT" indicates a CIM Query Language Template string. When used, the identifiers recognized in the $identifier$ tokens are "SELF" and the property names of this class, or one of its subclasses. As seen by a CIM client, the value of the Query property is not changed as a result of template processing. Template processing conceptually produces a new query string, which defines the actual conditions that will trigger production of a CIM_Indication instance. When used in the Query string, $SELF$ will be replaced by a string corresponding to a WBEM URI referencing the instance of this class that contains the Query template string. Tokens of the form $<propertyname>$ will be replaced by a string representing the corresponding property value of the instance of this class that contains the Query string. The Query string must be evaluated when the CIM_IndicationFilter is created and at any time when one any modification of any property referenced by tokens in the Query string are modified.
    */
    
   private static CIMProperty setPropertyValue_QueryLanguage(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property SourceNamespace
    *     * <br>
    * The path to a local namespace where the Indications originate. If NULL, the namespace of the Filter registration is assumed.
    *     */

      

               
   public String get_SourceNamespace()    {
       CIMProperty currentProperty = getProperty(PROPERTY_SOURCENAMESPACE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_SOURCENAMESPACE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property SourceNamespace
    * <br>
    * The path to a local namespace where the Indications originate. If NULL, the namespace of the Filter registration is assumed.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_SourceNamespace(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_SOURCENAMESPACE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_SourceNamespace(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_SOURCENAMESPACE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property SourceNamespace by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SourceNamespace(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_IndicationFilter fco = new CIM_IndicationFilter(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SOURCENAMESPACE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_SourceNamespace(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_SOURCENAMESPACE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property SourceNamespace
    * <br>
    * The path to a local namespace where the Indications originate. If NULL, the namespace of the Filter registration is assumed.
    */
    
   private static CIMProperty setPropertyValue_SourceNamespace(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property SourceNamespaces
    *     * <br>
    * The names of the local namespaces where the Indications originate. If NULL, the namespace of the Filter registration is assumed. SourceNamespaces replaces the SourceNamespace property on IndicationFilter to provide a means of defining the multiple namespaces where indications may originate.
    *     */

      

               
   public String[] get_SourceNamespaces()    {
       CIMProperty currentProperty = getProperty(PROPERTY_SOURCENAMESPACES.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_SOURCENAMESPACES.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String[])currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property SourceNamespaces
    * <br>
    * The names of the local namespaces where the Indications originate. If NULL, the namespace of the Filter registration is assumed. SourceNamespaces replaces the SourceNamespace property on IndicationFilter to provide a means of defining the multiple namespaces where indications may originate.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_SourceNamespaces(String[] newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_SOURCENAMESPACES.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_SourceNamespaces(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_SOURCENAMESPACES.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property SourceNamespaces by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SourceNamespaces(WBEMClient client, String namespace, String[] newValue) throws WbemsmtException {
        CIM_IndicationFilter fco = new CIM_IndicationFilter(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SOURCENAMESPACES.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_SourceNamespaces(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_SOURCENAMESPACES.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property SourceNamespaces
    * <br>
    * The names of the local namespaces where the Indications originate. If NULL, the namespace of the Filter registration is assumed. SourceNamespaces replaces the SourceNamespace property on IndicationFilter to provide a means of defining the multiple namespaces where indications may originate.
    */
    
   private static CIMProperty setPropertyValue_SourceNamespaces(CIMProperty currentProperty, String[] newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property SystemCreationClassName
    *     * <br>
    * A System's CreationClassName. The Filter is defined in the context of a CIM_System, where it is hosted or to which it applies. In a future release, a weak relationship will be explicitly added to the model. This is not done now to allow further refinement of the Filter definition and its inheritance tree. Keys are defined now to allow the class to be instantiated.
    *     */

      

               
   public String get_key_SystemCreationClassName()    {
       CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_SYSTEMCREATIONCLASSNAME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property SystemCreationClassName
    * <br>
    * A System's CreationClassName. The Filter is defined in the context of a CIM_System, where it is hosted or to which it applies. In a future release, a weak relationship will be explicitly added to the model. This is not done now to allow further refinement of the Filter definition and its inheritance tree. Keys are defined now to allow the class to be instantiated.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_SystemCreationClassName(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_SystemCreationClassName(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_SYSTEMCREATIONCLASSNAME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property SystemCreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_SystemCreationClassName(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_IndicationFilter fco = new CIM_IndicationFilter(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_SystemCreationClassName(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_SYSTEMCREATIONCLASSNAME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property SystemCreationClassName
    * <br>
    * A System's CreationClassName. The Filter is defined in the context of a CIM_System, where it is hosted or to which it applies. In a future release, a weak relationship will be explicitly added to the model. This is not done now to allow further refinement of the Filter definition and its inheritance tree. Keys are defined now to allow the class to be instantiated.
    */
    
   private static CIMProperty setPropertyValue_key_SystemCreationClassName(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property SystemName
    *     * <br>
    * A System's Name. The Filter is defined in the context of a CIM_System, where it is hosted or to which it applies. In a future release, a weak relationship will be explicitly added to the model. This is not done now to allow further refinement of the Filter definition and its inheritance tree. Keys are defined now to allow the class to be instantiated.
    *     */

      

               
   public String get_key_SystemName()    {
       CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMNAME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_SYSTEMNAME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property SystemName
    * <br>
    * A System's Name. The Filter is defined in the context of a CIM_System, where it is hosted or to which it applies. In a future release, a weak relationship will be explicitly added to the model. This is not done now to allow further refinement of the Filter definition and its inheritance tree. Keys are defined now to allow the class to be instantiated.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_SystemName(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMNAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_SystemName(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_SYSTEMNAME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property SystemName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_SystemName(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_IndicationFilter fco = new CIM_IndicationFilter(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMNAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_SystemName(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_SYSTEMNAME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property SystemName
    * <br>
    * A System's Name. The Filter is defined in the context of a CIM_System, where it is hosted or to which it applies. In a future release, a weak relationship will be explicitly added to the model. This is not done now to allow further refinement of the Filter definition and its inheritance tree. Keys are defined now to allow the class to be instantiated.
    */
    
   private static CIMProperty setPropertyValue_key_SystemName(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property TemplateVariable
    *     * <br>
    * This property may be used to hold application specific filtering information for use within a "DMTF:CQLT" formatted query.
     * 
     * For example, each TemplateVariable entry might be filled with the WBEM URI formatted object path of a CIM_ManagedElement, as in the following example, which selects only indications against namedCIM_StorageSynchonized instances. It then uses SELF to select the executing IndicationFilter, and then uses the entries of the TemplateVariable array to select particular instances of CIM_StorageSynchronized.
     * 
     * SELECT I.* 
     * FROM CIM_InstIndication I, CIM_IndicationFilter F 
     * WHERE I.SourceInstance ISA CIM_StorageSynchronized 
     * 	AND ObjectPath(F) = ObjectPath($SELF$)
     * 	AND ANY x IN F.TemplateVariable[*]
     * 		SATISFIES (ObjectPath(I.SourceInstanceModelPath) = ObjectPath(x)).
    *     */

      

               
   public String[] get_TemplateVariable()    {
       CIMProperty currentProperty = getProperty(PROPERTY_TEMPLATEVARIABLE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_TEMPLATEVARIABLE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String[])currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property TemplateVariable
    * <br>
    * This property may be used to hold application specific filtering information for use within a "DMTF:CQLT" formatted query.
     * 
     * For example, each TemplateVariable entry might be filled with the WBEM URI formatted object path of a CIM_ManagedElement, as in the following example, which selects only indications against namedCIM_StorageSynchonized instances. It then uses SELF to select the executing IndicationFilter, and then uses the entries of the TemplateVariable array to select particular instances of CIM_StorageSynchronized.
     * 
     * SELECT I.* 
     * FROM CIM_InstIndication I, CIM_IndicationFilter F 
     * WHERE I.SourceInstance ISA CIM_StorageSynchronized 
     * 	AND ObjectPath(F) = ObjectPath($SELF$)
     * 	AND ANY x IN F.TemplateVariable[*]
     * 		SATISFIES (ObjectPath(I.SourceInstanceModelPath) = ObjectPath(x)).
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_TemplateVariable(String[] newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_TEMPLATEVARIABLE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_TemplateVariable(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_TEMPLATEVARIABLE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property TemplateVariable by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TemplateVariable(WBEMClient client, String namespace, String[] newValue) throws WbemsmtException {
        CIM_IndicationFilter fco = new CIM_IndicationFilter(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TEMPLATEVARIABLE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_TemplateVariable(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_TEMPLATEVARIABLE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property TemplateVariable
    * <br>
    * This property may be used to hold application specific filtering information for use within a "DMTF:CQLT" formatted query.
     * 
     * For example, each TemplateVariable entry might be filled with the WBEM URI formatted object path of a CIM_ManagedElement, as in the following example, which selects only indications against namedCIM_StorageSynchonized instances. It then uses SELF to select the executing IndicationFilter, and then uses the entries of the TemplateVariable array to select particular instances of CIM_StorageSynchronized.
     * 
     * SELECT I.* 
     * FROM CIM_InstIndication I, CIM_IndicationFilter F 
     * WHERE I.SourceInstance ISA CIM_StorageSynchronized 
     * 	AND ObjectPath(F) = ObjectPath($SELF$)
     * 	AND ANY x IN F.TemplateVariable[*]
     * 		SATISFIES (ObjectPath(I.SourceInstanceModelPath) = ObjectPath(x)).
    */
    
   private static CIMProperty setPropertyValue_TemplateVariable(CIMProperty currentProperty, String[] newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
    
//**********************************************************************
// Associators methods     
//**********************************************************************



    
                    
                                        
                            
                                        
        
    /**
     * Get the list with CIM_ListenerDestination objects associated by the association CIM_IndicationSubscription
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ListenerDestination> getAssociated_CIM_ListenerDestination_CIM_IndicationSubscriptions(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_ListenerDestination_CIM_IndicationSubscriptions(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION,
     	                CIM_ListenerDestination.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ListenerDestination objects associated by the association CIM_IndicationSubscription
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ListenerDestination> getAssociated_CIM_ListenerDestination_CIM_IndicationSubscriptions(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_ListenerDestination_CIM_IndicationSubscriptions(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ListenerDestination objects associated by the association CIM_IndicationSubscription
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ListenerDestination> getAssociated_CIM_ListenerDestination_CIM_IndicationSubscriptions(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_ListenerDestination> result = new java.util.ArrayList<CIM_ListenerDestination>();
         CloseableIterator enumeration = null;

         try {
             enumeration = cimClient.associators(
                 this.getCimObjectPath(),
                 associationClass, 
                 resultClass,
                 role,resultRole, 
                 includeQualifiers,
                 includeClassOrigin,
                 propertyList);
         } catch (WBEMException e) {
         	  throw new AssociatorException(e, new AssociatorUserObject(
                 this.getCimObjectPath(),
                 associationClass, 
                 resultClass,
                 role,resultRole, 
                 includeQualifiers,
                 includeClassOrigin,
                 propertyList));	
         }
         
         try {
	             while (enumeration.hasNext()) {
                 CIM_IndicationFilterHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_IndicationFilterHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_IndicationFilterHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_ListenerDestination(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_ListenerDestination(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_ListenerDestination)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_ListenerDestination(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_IndicationFilterHelper.checkException(enumeration);
         } finally {
         try {
             if (enumeration != null) {
                 enumeration.close();
             }
         } catch(Exception e) {
             throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
         }
     }

     return result;
   }
    
   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_IndicationSubscription
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ListenerDestination_CIM_IndicationSubscriptionNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_ListenerDestination_CIM_IndicationSubscriptionNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION,
    	                             CIM_ListenerDestination.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_IndicationSubscription
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ListenerDestination_CIM_IndicationSubscriptionNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_ListenerDestination_CIM_IndicationSubscriptionNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_IndicationSubscription
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ListenerDestination_CIM_IndicationSubscriptionNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(
                this.getCimObjectPath(),
                associationClass, 
                resultClass,
                role,resultRole);
		        
         } catch (WBEMException e) {
         	  throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION, 
                CIM_ListenerDestination.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_IndicationFilterHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_IndicationFilterHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ListenerDestination.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_IndicationFilterHelper.checkException(enumeration);
        } finally {
        try {
            if (enumeration != null) {
                    enumeration.close();
            }
        } catch(Exception e) {
               throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
        }
      }
      return result;
   }
    
   /**
    * Get the list with CIM_IndicationSubscription associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<CIM_IndicationSubscription> getAssociations_CIM_IndicationSubscription(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<CIM_IndicationSubscription> result = new java.util.ArrayList<CIM_IndicationSubscription>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             CIM_IndicationFilterHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_IndicationFilterHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = CIM_IndicationSubscriptionHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new CIM_IndicationSubscription(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new CIM_IndicationSubscription(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((CIM_IndicationSubscription)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new CIM_IndicationSubscription(cimInstance));
                   continue;
                }
              }
           }
           CIM_IndicationFilterHelper.checkException(enumeration);
        } finally {
           try {
              if (enumeration != null) {
                 enumeration.close();
              }
           } catch(Exception e) {
              throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
           }
       }

       return result;
   }
    
   /**
    * Get a list of CIMObjectPath items of the associations CIM_IndicationSubscription
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_CIM_IndicationSubscription(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   CIM_IndicationFilterHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_IndicationFilterHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_IndicationSubscription.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_IndicationFilterHelper.checkException(enumeration);
        } finally {
        try {
            if (enumeration != null) {
                    enumeration.close();
            }
        } catch(Exception e) {
               throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
        }
     }
     return result;
   }
    
               
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
    public String getObjectName()
    {
    	    return CIM_IndicationFilter.CIM_CLASS_NAME;
    }



}