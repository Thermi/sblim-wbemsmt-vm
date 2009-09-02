/** 
  * CIM_ManagedSystemElement.java
  *
  * 
  * Â© Copyright IBM Corp.  2009,2005
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
  *    Prashanth Karnam<prkarnam@in.ibm.com> 
  * 
  * Description: CIM_ManagedSystemElement is the base class for the System Element hierarchy. Any distinguishable component of a System is a candidate for inclusion in this class. Examples of system components include: 
  * - software components such as application servers, databases, and applications 
  * - operating system components such as files, processes, and threads 
  * - device components such as disk drives, controllers, processors, and printers 
  * - physical components such as chips and cards.
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
public class CIM_ManagedSystemElement extends  CIM_ManagedElement {



   public final static String CIM_CLASS_NAME = "CIM_ManagedSystemElement";
   public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    
    /**
     * CIM_SystemComponent is a specialization of the CIM_Component association that establishes 'part of' relationships between a System and any ManagedSystemElements of which it is composed. 
     * Use this association with caution when using it instead of a subclass such as SystemDevice or a peer association such as HostedService. This class is very broadly defined, which can lead to erroneous use. For example, Access Points that are dependent on (and hosted on) a System are NOT Components of the System. The System is not made up of any AccessPoint 'parts', which is why a Dependency association, HostedAccessPoint, was defined. Similarly, a PhysicalPackage is not a 'part' of a System, because the physical element exists independently of any internal components, software, and so on. In fact, again, a Dependency relationship is true where a ComputerSystem is Dependent on its packaging, as described by the ComputerSystemPackage association.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT = "CIM_SystemComponent";
    
    
    
	    /**
	     * Constants of property CommunicationStatus
     * CommunicationStatus indicates the ability of the instrumentation to communicate with the underlying ManagedElement. CommunicationStatus consists of one of the following values: Unknown, None, Communication OK, Lost Communication, or No Contact. 
     * A Null return indicates the implementation (provider) does not implement this property. 
     * "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at this time. 
     * "Not Available" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is intended to add additional info to another property). 
     * "Communication OK " indicates communication is established with the element, but does not convey any quality of service. 
     * "No Contact" indicates that the monitoring system has knowledge of this element, but has never been able to establish communications with it. 
     * "Lost Communication" indicates that the Managed Element is known to exist and has been contacted successfully in the past, but is currently unreachable.
     */
    public static class PROPERTY_COMMUNICATIONSTATUS
    {
       /**
        * name of the property CommunicationStatus
        */
       public final static String NAME = "CommunicationStatus";                  

	    	
    

              
       		
          /**
           * constant for value map entry 0
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown 
                              = new javax.cim.UnsignedInteger16("0");
	          	
                       /**
              * constant for value entry Unknown (corresponds to mapEntry 0 )
              */
             public final static String VALUE_ENTRY_Unknown 
                              = "Unknown";
                    
       		
          /**
           * constant for value map entry 1
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Available 
                              = new javax.cim.UnsignedInteger16("1");
	          	
                       /**
              * constant for value entry Not Available (corresponds to mapEntry 1 )
              */
             public final static String VALUE_ENTRY_Not_Available 
                              = "Not Available";
                    
       		
          /**
           * constant for value map entry 2
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Communication_OK 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry Communication OK (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_Communication_OK 
                              = "Communication OK";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Lost_Communication 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry Lost Communication (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_Lost_Communication 
                              = "Lost Communication";
                    
       		
          /**
           * constant for value map entry 4
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_No_Contact 
                              = new javax.cim.UnsignedInteger16("4");
	          	
                       /**
              * constant for value entry No Contact (corresponds to mapEntry 4 )
              */
             public final static String VALUE_ENTRY_No_Contact 
                              = "No Contact";
                    
       		
          /**
           * constant for value map entry ..
           */ 
		          	
                       /**
              * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
              */
             public final static String VALUE_ENTRY_DMTF_Reserved 
                              = "DMTF Reserved";
                    
       		
          /**
           * constant for value map entry 0x8000..
           */ 
		          	
                       /**
              * constant for value entry Vendor Reserved (corresponds to mapEntry 0x8000.. )
              */
             public final static String VALUE_ENTRY_Vendor_Reserved 
                              = "Vendor Reserved";
                    
                                        /**
                 * get the ValueMapEntry of the given value
                 * @param value the value to find the ValueMapEntry for
                 * @return the ValueMap entry or null if not found
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntry(String value)
                {
                                                
	                                               if (VALUE_ENTRY_Unknown.equals(value))
                         {
                            return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Not_Available.equals(value))
                         {
                            return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Available;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Communication_OK.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Communication_OK;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Lost_Communication.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Lost_Communication;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_No_Contact.equals(value))
                         {
                            return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_No_Contact;
                         }
	                      	                             
	                      	                             
	                      	                   	                                         return null;
                                   
                }
                
                /**
                 * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
                 * @param indexInPulldown the index within the pulldown element, the list etc
                 * @return the ValueMap entry from the displayed values
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(Number indexInPulldown)
                {
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
                public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue)
                {
                   String valueEntry = getValueEntry(currentValue);
                   if (valueEntry != null)
                   {
                      for (int i=0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++)
                      {
                         if (VALUE_ENTRIES_FOR_DISPLAY[	i].equals(valueEntry))
                         {
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
                
                public static String getValueEntry(javax.cim.UnsignedInteger16 value)
                {
                   int iValue = value.intValue();
                                                                                     
                         if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue())
                         {
                            return VALUE_ENTRY_Unknown;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Available.intValue())
                         {
                            return VALUE_ENTRY_Not_Available;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Communication_OK.intValue())
                         {
                            return VALUE_ENTRY_Communication_OK;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Lost_Communication.intValue())
                         {
                            return VALUE_ENTRY_Lost_Communication;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_No_Contact.intValue())
                         {
                            return VALUE_ENTRY_No_Contact;
                         }
                                                                                        
                         if (iValue >= 0x8000)
                         {
                            return VALUE_ENTRY_Vendor_Reserved;
                         }
                                                                                        return VALUE_ENTRY_DMTF_Reserved;
                                                                            
                }
          
                                    
          /**
	       * ValueMap entries
       * Contains no entries that having an integer value range representation
       * 
       * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
       *
       * @see \#VALUE_ENTRIES_FOR_DISPLAY
       * 
       * Value Map for the property CommunicationStatus   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown
                     	                            ,  VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Available
                     	                            ,  VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Communication_OK
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Lost_Communication
                     	                            ,  VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_No_Contact
                     	                     	                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property CommunicationStatus   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Not_Available
                                                                 ,  VALUE_ENTRY_Communication_OK
                                                                 ,  VALUE_ENTRY_Lost_Communication
                                                                 ,  VALUE_ENTRY_No_Contact
                                                                 ,  VALUE_ENTRY_DMTF_Reserved
                                                                 ,  VALUE_ENTRY_Vendor_Reserved
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property CommunicationStatus   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Not_Available
                                                                 ,  VALUE_ENTRY_Communication_OK
                                                                 ,  VALUE_ENTRY_Lost_Communication
                                                                 ,  VALUE_ENTRY_No_Contact
                                                                                              };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property DetailedStatus
     * DetailedStatus compliments PrimaryStatus with additional status detail. It consists of one of the following values: Not Available, No Additional Information, Stressed, Predictive Failure, Error, Non-Recoverable Error, SupportingEntityInError. Detailed status is used to expand upon the PrimaryStatus of the element. 
     * A Null return indicates the implementation (provider) does not implement this property. 
     * "Not Available" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is intended to add additional info to another property). 
     * "No Additional Information" indicates that the element is functioning normally as indicated by PrimaryStatus = "OK". 
     * "Stressed" indicates that the element is functioning, but needs attention. Examples of "Stressed" states are overload, overheated, and so on. 
     * "Predictive Failure" indicates that an element is functioning normally but a failure is predicted in the near future. 
     * "Non-Recoverable Error " indicates that this element is in an error condition that requires human intervention. 
     * "Supporting Entity in Error" indicates that this element might be "OK" but that another element, on which it is dependent, is in error. An example is a network service or endpoint that cannot function due to lower-layer networking problems.
     */
    public static class PROPERTY_DETAILEDSTATUS
    {
       /**
        * name of the property DetailedStatus
        */
       public final static String NAME = "DetailedStatus";                  

	    	
    

              
       		
          /**
           * constant for value map entry 0
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Not_Available 
                              = new javax.cim.UnsignedInteger16("0");
	          	
                       /**
              * constant for value entry Not Available (corresponds to mapEntry 0 )
              */
             public final static String VALUE_ENTRY_Not_Available 
                              = "Not Available";
                    
       		
          /**
           * constant for value map entry 1
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_No_Additional_Information 
                              = new javax.cim.UnsignedInteger16("1");
	          	
                       /**
              * constant for value entry No Additional Information (corresponds to mapEntry 1 )
              */
             public final static String VALUE_ENTRY_No_Additional_Information 
                              = "No Additional Information";
                    
       		
          /**
           * constant for value map entry 2
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Stressed 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry Stressed (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_Stressed 
                              = "Stressed";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Predictive_Failure 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry Predictive Failure (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_Predictive_Failure 
                              = "Predictive Failure";
                    
       		
          /**
           * constant for value map entry 4
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Non_Recoverable_Error 
                              = new javax.cim.UnsignedInteger16("4");
	          	
                       /**
              * constant for value entry Non-Recoverable Error (corresponds to mapEntry 4 )
              */
             public final static String VALUE_ENTRY_Non_Recoverable_Error 
                              = "Non-Recoverable Error";
                    
       		
          /**
           * constant for value map entry 5
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Supporting_Entity_in_Error 
                              = new javax.cim.UnsignedInteger16("5");
	          	
                       /**
              * constant for value entry Supporting Entity in Error (corresponds to mapEntry 5 )
              */
             public final static String VALUE_ENTRY_Supporting_Entity_in_Error 
                              = "Supporting Entity in Error";
                    
       		
          /**
           * constant for value map entry ..
           */ 
		          	
                       /**
              * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
              */
             public final static String VALUE_ENTRY_DMTF_Reserved 
                              = "DMTF Reserved";
                    
       		
          /**
           * constant for value map entry 0x8000..
           */ 
		          	
                       /**
              * constant for value entry Vendor Reserved (corresponds to mapEntry 0x8000.. )
              */
             public final static String VALUE_ENTRY_Vendor_Reserved 
                              = "Vendor Reserved";
                    
                                        /**
                 * get the ValueMapEntry of the given value
                 * @param value the value to find the ValueMapEntry for
                 * @return the ValueMap entry or null if not found
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntry(String value)
                {
                                                
	                                               if (VALUE_ENTRY_Not_Available.equals(value))
                         {
                            return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Not_Available;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_No_Additional_Information.equals(value))
                         {
                            return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_No_Additional_Information;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Stressed.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Stressed;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Predictive_Failure.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Predictive_Failure;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Non_Recoverable_Error.equals(value))
                         {
                            return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Non_Recoverable_Error;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Supporting_Entity_in_Error.equals(value))
                         {
                            return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Supporting_Entity_in_Error;
                         }
	                      	                             
	                      	                             
	                      	                   	                                         return null;
                                   
                }
                
                /**
                 * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
                 * @param indexInPulldown the index within the pulldown element, the list etc
                 * @return the ValueMap entry from the displayed values
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(Number indexInPulldown)
                {
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
                public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue)
                {
                   String valueEntry = getValueEntry(currentValue);
                   if (valueEntry != null)
                   {
                      for (int i=0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++)
                      {
                         if (VALUE_ENTRIES_FOR_DISPLAY[	i].equals(valueEntry))
                         {
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
                
                public static String getValueEntry(javax.cim.UnsignedInteger16 value)
                {
                   int iValue = value.intValue();
                                                                                     
                         if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Not_Available.intValue())
                         {
                            return VALUE_ENTRY_Not_Available;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_No_Additional_Information.intValue())
                         {
                            return VALUE_ENTRY_No_Additional_Information;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Stressed.intValue())
                         {
                            return VALUE_ENTRY_Stressed;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Predictive_Failure.intValue())
                         {
                            return VALUE_ENTRY_Predictive_Failure;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Non_Recoverable_Error.intValue())
                         {
                            return VALUE_ENTRY_Non_Recoverable_Error;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Supporting_Entity_in_Error.intValue())
                         {
                            return VALUE_ENTRY_Supporting_Entity_in_Error;
                         }
                                                                                        
                         if (iValue >= 0x8000)
                         {
                            return VALUE_ENTRY_Vendor_Reserved;
                         }
                                                                                        return VALUE_ENTRY_DMTF_Reserved;
                                                                            
                }
          
                                    
          /**
	       * ValueMap entries
       * Contains no entries that having an integer value range representation
       * 
       * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
       *
       * @see \#VALUE_ENTRIES_FOR_DISPLAY
       * 
       * Value Map for the property DetailedStatus   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Not_Available
                     	                            ,  VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_No_Additional_Information
                     	                            ,  VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Stressed
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Predictive_Failure
                     	                            ,  VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Non_Recoverable_Error
                     	                            ,  VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Supporting_Entity_in_Error
                     	                     	                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property DetailedStatus   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_Not_Available
                                                                 ,  VALUE_ENTRY_No_Additional_Information
                                                                 ,  VALUE_ENTRY_Stressed
                                                                 ,  VALUE_ENTRY_Predictive_Failure
                                                                 ,  VALUE_ENTRY_Non_Recoverable_Error
                                                                 ,  VALUE_ENTRY_Supporting_Entity_in_Error
                                                                 ,  VALUE_ENTRY_DMTF_Reserved
                                                                 ,  VALUE_ENTRY_Vendor_Reserved
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property DetailedStatus   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_Not_Available
                                                                 ,  VALUE_ENTRY_No_Additional_Information
                                                                 ,  VALUE_ENTRY_Stressed
                                                                 ,  VALUE_ENTRY_Predictive_Failure
                                                                 ,  VALUE_ENTRY_Non_Recoverable_Error
                                                                 ,  VALUE_ENTRY_Supporting_Entity_in_Error
                                                                                              };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property HealthState
     * Indicates the current health of the element. This attribute expresses the health of this element but not necessarily that of its subcomponents. The possible values are 0 to 30, where 5 means the element is entirely healthy and 30 means the element is completely non-functional. The following continuum is defined: 
     * "Non-recoverable Error" (30) - The element has completely failed, and recovery is not possible. All functionality provided by this element has been lost. 
     * "Critical Failure" (25) - The element is non-functional and recovery might not be possible. 
     * "Major Failure" (20) - The element is failing. It is possible that some or all of the functionality of this component is degraded or not working. 
     * "Minor Failure" (15) - All functionality is available but some might be degraded. 
     * "Degraded/Warning" (10) - The element is in working order and all functionality is provided. However, the element is not working to the best of its abilities. For example, the element might not be operating at optimal performance or it might be reporting recoverable errors. 
     * "OK" (5) - The element is fully functional and is operating within normal operational parameters and without error. 
     * "Unknown" (0) - The implementation cannot report on HealthState at this time. 
     * DMTF has reserved the unused portion of the continuum for additional HealthStates in the future.
     */
    public static class PROPERTY_HEALTHSTATE
    {
       /**
        * name of the property HealthState
        */
       public final static String NAME = "HealthState";                  

	    	
    

              
       		
          /**
           * constant for value map entry 0
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown 
                              = new javax.cim.UnsignedInteger16("0");
	          	
                       /**
              * constant for value entry Unknown (corresponds to mapEntry 0 )
              */
             public final static String VALUE_ENTRY_Unknown 
                              = "Unknown";
                    
       		
          /**
           * constant for value map entry 5
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_OK 
                              = new javax.cim.UnsignedInteger16("5");
	          	
                       /**
              * constant for value entry OK (corresponds to mapEntry 5 )
              */
             public final static String VALUE_ENTRY_OK 
                              = "OK";
                    
       		
          /**
           * constant for value map entry 10
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Degraded_Warning 
                              = new javax.cim.UnsignedInteger16("10");
	          	
                       /**
              * constant for value entry Degraded/Warning (corresponds to mapEntry 10 )
              */
             public final static String VALUE_ENTRY_Degraded_Warning 
                              = "Degraded/Warning";
                    
       		
          /**
           * constant for value map entry 15
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Minor_failure 
                              = new javax.cim.UnsignedInteger16("15");
	          	
                       /**
              * constant for value entry Minor failure (corresponds to mapEntry 15 )
              */
             public final static String VALUE_ENTRY_Minor_failure 
                              = "Minor failure";
                    
       		
          /**
           * constant for value map entry 20
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Major_failure 
                              = new javax.cim.UnsignedInteger16("20");
	          	
                       /**
              * constant for value entry Major failure (corresponds to mapEntry 20 )
              */
             public final static String VALUE_ENTRY_Major_failure 
                              = "Major failure";
                    
       		
          /**
           * constant for value map entry 25
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_Critical_failure 
                              = new javax.cim.UnsignedInteger16("25");
	          	
                       /**
              * constant for value entry Critical failure (corresponds to mapEntry 25 )
              */
             public final static String VALUE_ENTRY_Critical_failure 
                              = "Critical failure";
                    
       		
          /**
           * constant for value map entry 30
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Non_recoverable_error 
                              = new javax.cim.UnsignedInteger16("30");
	          	
                       /**
              * constant for value entry Non-recoverable error (corresponds to mapEntry 30 )
              */
             public final static String VALUE_ENTRY_Non_recoverable_error 
                              = "Non-recoverable error";
                    
       		
          /**
           * constant for value map entry ..
           */ 
		          	
                       /**
              * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
              */
             public final static String VALUE_ENTRY_DMTF_Reserved 
                              = "DMTF Reserved";
                    
                                        /**
                 * get the ValueMapEntry of the given value
                 * @param value the value to find the ValueMapEntry for
                 * @return the ValueMap entry or null if not found
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntry(String value)
                {
                                                
	                                               if (VALUE_ENTRY_Unknown.equals(value))
                         {
                            return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_OK.equals(value))
                         {
                            return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_OK;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Degraded_Warning.equals(value))
                         {
                            return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Degraded_Warning;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Minor_failure.equals(value))
                         {
                            return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Minor_failure;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Major_failure.equals(value))
                         {
                            return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Major_failure;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Critical_failure.equals(value))
                         {
                            return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_Critical_failure;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Non_recoverable_error.equals(value))
                         {
                            return VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Non_recoverable_error;
                         }
	                      	                             
	                      	                   	                                         return null;
                                   
                }
                
                /**
                 * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
                 * @param indexInPulldown the index within the pulldown element, the list etc
                 * @return the ValueMap entry from the displayed values
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(Number indexInPulldown)
                {
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
                public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue)
                {
                   String valueEntry = getValueEntry(currentValue);
                   if (valueEntry != null)
                   {
                      for (int i=0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++)
                      {
                         if (VALUE_ENTRIES_FOR_DISPLAY[	i].equals(valueEntry))
                         {
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
                
                public static String getValueEntry(javax.cim.UnsignedInteger16 value)
                {
                   int iValue = value.intValue();
                                                                                     
                         if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue())
                         {
                            return VALUE_ENTRY_Unknown;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_OK.intValue())
                         {
                            return VALUE_ENTRY_OK;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Degraded_Warning.intValue())
                         {
                            return VALUE_ENTRY_Degraded_Warning;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Minor_failure.intValue())
                         {
                            return VALUE_ENTRY_Minor_failure;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Major_failure.intValue())
                         {
                            return VALUE_ENTRY_Major_failure;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_Critical_failure.intValue())
                         {
                            return VALUE_ENTRY_Critical_failure;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Non_recoverable_error.intValue())
                         {
                            return VALUE_ENTRY_Non_recoverable_error;
                         }
                                                                                        return VALUE_ENTRY_DMTF_Reserved;
                                                                            
                }
          
                                    
          /**
	       * ValueMap entries
       * Contains no entries that having an integer value range representation
       * 
       * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
       *
       * @see \#VALUE_ENTRIES_FOR_DISPLAY
       * 
       * Value Map for the property HealthState   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown
                     	                            ,  VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_OK
                     	                            ,  VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Degraded_Warning
                     	                            ,  VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Minor_failure
                     	                            ,  VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Major_failure
                     	                            ,  VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_Critical_failure
                     	                            ,  VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Non_recoverable_error
                     	                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property HealthState   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_OK
                                                                 ,  VALUE_ENTRY_Degraded_Warning
                                                                 ,  VALUE_ENTRY_Minor_failure
                                                                 ,  VALUE_ENTRY_Major_failure
                                                                 ,  VALUE_ENTRY_Critical_failure
                                                                 ,  VALUE_ENTRY_Non_recoverable_error
                                                                 ,  VALUE_ENTRY_DMTF_Reserved
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property HealthState   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_OK
                                                                 ,  VALUE_ENTRY_Degraded_Warning
                                                                 ,  VALUE_ENTRY_Minor_failure
                                                                 ,  VALUE_ENTRY_Major_failure
                                                                 ,  VALUE_ENTRY_Critical_failure
                                                                 ,  VALUE_ENTRY_Non_recoverable_error
                                                                 };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property InstallDate
     * A datetime value that indicates when the object was installed. Lack of a value does not indicate that the object is not installed.
     */
    public static class PROPERTY_INSTALLDATE
    {
       /**
        * name of the property InstallDate
        */
       public final static String NAME = "InstallDate";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Name
     * The Name property defines the label by which the object is known. When subclassed, the Name property can be overridden to be a Key property.
     */
    public static class PROPERTY_NAME
    {
       /**
        * name of the property Name
        */
       public final static String NAME = "Name";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property OperatingStatus
     * OperatingStatus provides a current status value for the operational condition of the element and can be used for providing more detail with respect to the value of EnabledState. It can also provide the transitional states when an element is transitioning from one state to another, such as when an element is transitioning between EnabledState and RequestedState, as well as other transitional conditions.
     * OperatingStatus consists of one of the following values: Unknown, Not Available, In Service, Starting, Stopping, Stopped, Aborted, Dormant, Completed, Migrating, Emmigrating, Immigrating, Snapshotting. Shutting Down, In Test 
     * A Null return indicates the implementation (provider) does not implement this property. 
     * "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at this time. 
     * "None" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is intended to add additional info to another property). 
     * "Servicing" describes an element being configured, maintained, cleaned, or otherwise administered. 
     * "Starting" describes an element being initialized. 
     * "Stopping" describes an element being brought to an orderly stop. 
     * "Stopped" and "Aborted" are similar, although the former implies a clean and orderly stop, while the latter implies an abrupt stop where the state and configuration of the element might need to be updated. 
     * "Dormant" indicates that the element is inactive or quiesced. 
     * "Completed" indicates that the element has completed its operation. This value should be combined with either OK, Error, or Degraded in the PrimaryStatus so that a client can tell if the complete operation Completed with OK (passed), Completed with Error (failed), or Completed with Degraded (the operation finished, but it did not complete OK or did not report an error). 
     * "Migrating" element is being moved between host elements. 
     * "Immigrating" element is being moved to new host element. 
     * "Emigrating" element is being moved away from host element. 
     * "Shutting Down" describes an element being brought to an abrupt stop. 
     * "In Test" element is performing test functions. 
     * "Transitioning" describes an element that is between states, that is, it is not fully available in either its previous state or its next state. This value should be used if other values indicating a transition to a specific state are not applicable.
     * "In Service" describes an element that is in service and operational.
     */
    public static class PROPERTY_OPERATINGSTATUS
    {
       /**
        * name of the property OperatingStatus
        */
       public final static String NAME = "OperatingStatus";                  

	    	
    

              
       		
          /**
           * constant for value map entry 0
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown 
                              = new javax.cim.UnsignedInteger16("0");
	          	
                       /**
              * constant for value entry Unknown (corresponds to mapEntry 0 )
              */
             public final static String VALUE_ENTRY_Unknown 
                              = "Unknown";
                    
       		
          /**
           * constant for value map entry 1
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Available 
                              = new javax.cim.UnsignedInteger16("1");
	          	
                       /**
              * constant for value entry Not Available (corresponds to mapEntry 1 )
              */
             public final static String VALUE_ENTRY_Not_Available 
                              = "Not Available";
                    
       		
          /**
           * constant for value map entry 2
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Servicing 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry Servicing (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_Servicing 
                              = "Servicing";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Starting 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry Starting (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_Starting 
                              = "Starting";
                    
       		
          /**
           * constant for value map entry 4
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Stopping 
                              = new javax.cim.UnsignedInteger16("4");
	          	
                       /**
              * constant for value entry Stopping (corresponds to mapEntry 4 )
              */
             public final static String VALUE_ENTRY_Stopping 
                              = "Stopping";
                    
       		
          /**
           * constant for value map entry 5
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Stopped 
                              = new javax.cim.UnsignedInteger16("5");
	          	
                       /**
              * constant for value entry Stopped (corresponds to mapEntry 5 )
              */
             public final static String VALUE_ENTRY_Stopped 
                              = "Stopped";
                    
       		
          /**
           * constant for value map entry 6
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Aborted 
                              = new javax.cim.UnsignedInteger16("6");
	          	
                       /**
              * constant for value entry Aborted (corresponds to mapEntry 6 )
              */
             public final static String VALUE_ENTRY_Aborted 
                              = "Aborted";
                    
       		
          /**
           * constant for value map entry 7
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Dormant 
                              = new javax.cim.UnsignedInteger16("7");
	          	
                       /**
              * constant for value entry Dormant (corresponds to mapEntry 7 )
              */
             public final static String VALUE_ENTRY_Dormant 
                              = "Dormant";
                    
       		
          /**
           * constant for value map entry 8
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Completed 
                              = new javax.cim.UnsignedInteger16("8");
	          	
                       /**
              * constant for value entry Completed (corresponds to mapEntry 8 )
              */
             public final static String VALUE_ENTRY_Completed 
                              = "Completed";
                    
       		
          /**
           * constant for value map entry 9
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Migrating 
                              = new javax.cim.UnsignedInteger16("9");
	          	
                       /**
              * constant for value entry Migrating (corresponds to mapEntry 9 )
              */
             public final static String VALUE_ENTRY_Migrating 
                              = "Migrating";
                    
       		
          /**
           * constant for value map entry 10
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Emigrating 
                              = new javax.cim.UnsignedInteger16("10");
	          	
                       /**
              * constant for value entry Emigrating (corresponds to mapEntry 10 )
              */
             public final static String VALUE_ENTRY_Emigrating 
                              = "Emigrating";
                    
       		
          /**
           * constant for value map entry 11
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Immigrating 
                              = new javax.cim.UnsignedInteger16("11");
	          	
                       /**
              * constant for value entry Immigrating (corresponds to mapEntry 11 )
              */
             public final static String VALUE_ENTRY_Immigrating 
                              = "Immigrating";
                    
       		
          /**
           * constant for value map entry 12
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Snapshotting 
                              = new javax.cim.UnsignedInteger16("12");
	          	
                       /**
              * constant for value entry Snapshotting (corresponds to mapEntry 12 )
              */
             public final static String VALUE_ENTRY_Snapshotting 
                              = "Snapshotting";
                    
       		
          /**
           * constant for value map entry 13
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Shutting_Down 
                              = new javax.cim.UnsignedInteger16("13");
	          	
                       /**
              * constant for value entry Shutting Down (corresponds to mapEntry 13 )
              */
             public final static String VALUE_ENTRY_Shutting_Down 
                              = "Shutting Down";
                    
       		
          /**
           * constant for value map entry 14
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_In_Test 
                              = new javax.cim.UnsignedInteger16("14");
	          	
                       /**
              * constant for value entry In Test (corresponds to mapEntry 14 )
              */
             public final static String VALUE_ENTRY_In_Test 
                              = "In Test";
                    
       		
          /**
           * constant for value map entry 15
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Transitioning 
                              = new javax.cim.UnsignedInteger16("15");
	          	
                       /**
              * constant for value entry Transitioning (corresponds to mapEntry 15 )
              */
             public final static String VALUE_ENTRY_Transitioning 
                              = "Transitioning";
                    
       		
          /**
           * constant for value map entry 16
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_In_Service 
                              = new javax.cim.UnsignedInteger16("16");
	          	
                       /**
              * constant for value entry In Service (corresponds to mapEntry 16 )
              */
             public final static String VALUE_ENTRY_In_Service 
                              = "In Service";
                    
       		
          /**
           * constant for value map entry ..
           */ 
		          	
                       /**
              * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
              */
             public final static String VALUE_ENTRY_DMTF_Reserved 
                              = "DMTF Reserved";
                    
       		
          /**
           * constant for value map entry 0x8000..
           */ 
		          	
                       /**
              * constant for value entry Vendor Reserved (corresponds to mapEntry 0x8000.. )
              */
             public final static String VALUE_ENTRY_Vendor_Reserved 
                              = "Vendor Reserved";
                    
                                        /**
                 * get the ValueMapEntry of the given value
                 * @param value the value to find the ValueMapEntry for
                 * @return the ValueMap entry or null if not found
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntry(String value)
                {
                                                
	                                               if (VALUE_ENTRY_Unknown.equals(value))
                         {
                            return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Not_Available.equals(value))
                         {
                            return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Available;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Servicing.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Servicing;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Starting.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Starting;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Stopping.equals(value))
                         {
                            return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Stopping;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Stopped.equals(value))
                         {
                            return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Stopped;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Aborted.equals(value))
                         {
                            return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Aborted;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Dormant.equals(value))
                         {
                            return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Dormant;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Completed.equals(value))
                         {
                            return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Completed;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Migrating.equals(value))
                         {
                            return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Migrating;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Emigrating.equals(value))
                         {
                            return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Emigrating;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Immigrating.equals(value))
                         {
                            return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Immigrating;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Snapshotting.equals(value))
                         {
                            return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Snapshotting;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Shutting_Down.equals(value))
                         {
                            return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Shutting_Down;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_In_Test.equals(value))
                         {
                            return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_In_Test;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Transitioning.equals(value))
                         {
                            return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Transitioning;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_In_Service.equals(value))
                         {
                            return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_In_Service;
                         }
	                      	                             
	                      	                             
	                      	                   	                                         return null;
                                   
                }
                
                /**
                 * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
                 * @param indexInPulldown the index within the pulldown element, the list etc
                 * @return the ValueMap entry from the displayed values
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(Number indexInPulldown)
                {
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
                public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue)
                {
                   String valueEntry = getValueEntry(currentValue);
                   if (valueEntry != null)
                   {
                      for (int i=0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++)
                      {
                         if (VALUE_ENTRIES_FOR_DISPLAY[	i].equals(valueEntry))
                         {
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
                
                public static String getValueEntry(javax.cim.UnsignedInteger16 value)
                {
                   int iValue = value.intValue();
                                                                                     
                         if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue())
                         {
                            return VALUE_ENTRY_Unknown;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Available.intValue())
                         {
                            return VALUE_ENTRY_Not_Available;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Servicing.intValue())
                         {
                            return VALUE_ENTRY_Servicing;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Starting.intValue())
                         {
                            return VALUE_ENTRY_Starting;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Stopping.intValue())
                         {
                            return VALUE_ENTRY_Stopping;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Stopped.intValue())
                         {
                            return VALUE_ENTRY_Stopped;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Aborted.intValue())
                         {
                            return VALUE_ENTRY_Aborted;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Dormant.intValue())
                         {
                            return VALUE_ENTRY_Dormant;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Completed.intValue())
                         {
                            return VALUE_ENTRY_Completed;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Migrating.intValue())
                         {
                            return VALUE_ENTRY_Migrating;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Emigrating.intValue())
                         {
                            return VALUE_ENTRY_Emigrating;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Immigrating.intValue())
                         {
                            return VALUE_ENTRY_Immigrating;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Snapshotting.intValue())
                         {
                            return VALUE_ENTRY_Snapshotting;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Shutting_Down.intValue())
                         {
                            return VALUE_ENTRY_Shutting_Down;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_In_Test.intValue())
                         {
                            return VALUE_ENTRY_In_Test;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Transitioning.intValue())
                         {
                            return VALUE_ENTRY_Transitioning;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_In_Service.intValue())
                         {
                            return VALUE_ENTRY_In_Service;
                         }
                                                                                        
                         if (iValue >= 0x8000)
                         {
                            return VALUE_ENTRY_Vendor_Reserved;
                         }
                                                                                        return VALUE_ENTRY_DMTF_Reserved;
                                                                            
                }
          
                                    
          /**
	       * ValueMap entries
       * Contains no entries that having an integer value range representation
       * 
       * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
       *
       * @see \#VALUE_ENTRIES_FOR_DISPLAY
       * 
       * Value Map for the property OperatingStatus   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown
                     	                            ,  VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Available
                     	                            ,  VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Servicing
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Starting
                     	                            ,  VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Stopping
                     	                            ,  VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Stopped
                     	                            ,  VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Aborted
                     	                            ,  VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Dormant
                     	                            ,  VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Completed
                     	                            ,  VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Migrating
                     	                            ,  VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Emigrating
                     	                            ,  VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Immigrating
                     	                            ,  VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Snapshotting
                     	                            ,  VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Shutting_Down
                     	                            ,  VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_In_Test
                     	                            ,  VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Transitioning
                     	                            ,  VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_In_Service
                     	                     	                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property OperatingStatus   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Not_Available
                                                                 ,  VALUE_ENTRY_Servicing
                                                                 ,  VALUE_ENTRY_Starting
                                                                 ,  VALUE_ENTRY_Stopping
                                                                 ,  VALUE_ENTRY_Stopped
                                                                 ,  VALUE_ENTRY_Aborted
                                                                 ,  VALUE_ENTRY_Dormant
                                                                 ,  VALUE_ENTRY_Completed
                                                                 ,  VALUE_ENTRY_Migrating
                                                                 ,  VALUE_ENTRY_Emigrating
                                                                 ,  VALUE_ENTRY_Immigrating
                                                                 ,  VALUE_ENTRY_Snapshotting
                                                                 ,  VALUE_ENTRY_Shutting_Down
                                                                 ,  VALUE_ENTRY_In_Test
                                                                 ,  VALUE_ENTRY_Transitioning
                                                                 ,  VALUE_ENTRY_In_Service
                                                                 ,  VALUE_ENTRY_DMTF_Reserved
                                                                 ,  VALUE_ENTRY_Vendor_Reserved
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property OperatingStatus   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Not_Available
                                                                 ,  VALUE_ENTRY_Servicing
                                                                 ,  VALUE_ENTRY_Starting
                                                                 ,  VALUE_ENTRY_Stopping
                                                                 ,  VALUE_ENTRY_Stopped
                                                                 ,  VALUE_ENTRY_Aborted
                                                                 ,  VALUE_ENTRY_Dormant
                                                                 ,  VALUE_ENTRY_Completed
                                                                 ,  VALUE_ENTRY_Migrating
                                                                 ,  VALUE_ENTRY_Emigrating
                                                                 ,  VALUE_ENTRY_Immigrating
                                                                 ,  VALUE_ENTRY_Snapshotting
                                                                 ,  VALUE_ENTRY_Shutting_Down
                                                                 ,  VALUE_ENTRY_In_Test
                                                                 ,  VALUE_ENTRY_Transitioning
                                                                 ,  VALUE_ENTRY_In_Service
                                                                                              };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property OperationalStatus
     * Indicates the current statuses of the element. Various operational statuses are defined. Many of the enumeration's values are self-explanatory. However, a few are not and are described here in more detail. 
     * "Stressed" indicates that the element is functioning, but needs attention. Examples of "Stressed" states are overload, overheated, and so on. 
     * "Predictive Failure" indicates that an element is functioning nominally but predicting a failure in the near future. 
     * "In Service" describes an element being configured, maintained, cleaned, or otherwise administered. 
     * "No Contact" indicates that the monitoring system has knowledge of this element, but has never been able to establish communications with it. 
     * "Lost Communication" indicates that the ManagedSystem Element is known to exist and has been contacted successfully in the past, but is currently unreachable. 
     * "Stopped" and "Aborted" are similar, although the former implies a clean and orderly stop, while the latter implies an abrupt stop where the state and configuration of the element might need to be updated. 
     * "Dormant" indicates that the element is inactive or quiesced. 
     * "Supporting Entity in Error" indicates that this element might be "OK" but that another element, on which it is dependent, is in error. An example is a network service or endpoint that cannot function due to lower-layer networking problems. 
     * "Completed" indicates that the element has completed its operation. This value should be combined with either OK, Error, or Degraded so that a client can tell if the complete operation Completed with OK (passed), Completed with Error (failed), or Completed with Degraded (the operation finished, but it did not complete OK or did not report an error). 
     * "Power Mode" indicates that the element has additional power model information contained in the Associated PowerManagementService association. 
     * OperationalStatus replaces the Status property on ManagedSystemElement to provide a consistent approach to enumerations, to address implementation needs for an array property, and to provide a migration path from today's environment to the future. This change was not made earlier because it required the deprecated qualifier. Due to the widespread use of the existing Status property in management applications, it is strongly recommended that providers or instrumentation provide both the Status and OperationalStatus properties. Further, the first value of OperationalStatus should contain the primary status for the element. When instrumented, Status (because it is single-valued) should also provide the primary status of the element.
     */
    public static class PROPERTY_OPERATIONALSTATUS
    {
       /**
        * name of the property OperationalStatus
        */
       public final static String NAME = "OperationalStatus";                  

	    	
    

              
       		
          /**
           * constant for value map entry 0
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown 
                              = new javax.cim.UnsignedInteger16("0");
	          	
                       /**
              * constant for value entry Unknown (corresponds to mapEntry 0 )
              */
             public final static String VALUE_ENTRY_Unknown 
                              = "Unknown";
                    
       		
          /**
           * constant for value map entry 1
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other 
                              = new javax.cim.UnsignedInteger16("1");
	          	
                       /**
              * constant for value entry Other (corresponds to mapEntry 1 )
              */
             public final static String VALUE_ENTRY_Other 
                              = "Other";
                    
       		
          /**
           * constant for value map entry 2
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OK 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry OK (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_OK 
                              = "OK";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Degraded 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry Degraded (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_Degraded 
                              = "Degraded";
                    
       		
          /**
           * constant for value map entry 4
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Stressed 
                              = new javax.cim.UnsignedInteger16("4");
	          	
                       /**
              * constant for value entry Stressed (corresponds to mapEntry 4 )
              */
             public final static String VALUE_ENTRY_Stressed 
                              = "Stressed";
                    
       		
          /**
           * constant for value map entry 5
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Predictive_Failure 
                              = new javax.cim.UnsignedInteger16("5");
	          	
                       /**
              * constant for value entry Predictive Failure (corresponds to mapEntry 5 )
              */
             public final static String VALUE_ENTRY_Predictive_Failure 
                              = "Predictive Failure";
                    
       		
          /**
           * constant for value map entry 6
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Error 
                              = new javax.cim.UnsignedInteger16("6");
	          	
                       /**
              * constant for value entry Error (corresponds to mapEntry 6 )
              */
             public final static String VALUE_ENTRY_Error 
                              = "Error";
                    
       		
          /**
           * constant for value map entry 7
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Non_Recoverable_Error 
                              = new javax.cim.UnsignedInteger16("7");
	          	
                       /**
              * constant for value entry Non-Recoverable Error (corresponds to mapEntry 7 )
              */
             public final static String VALUE_ENTRY_Non_Recoverable_Error 
                              = "Non-Recoverable Error";
                    
       		
          /**
           * constant for value map entry 8
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Starting 
                              = new javax.cim.UnsignedInteger16("8");
	          	
                       /**
              * constant for value entry Starting (corresponds to mapEntry 8 )
              */
             public final static String VALUE_ENTRY_Starting 
                              = "Starting";
                    
       		
          /**
           * constant for value map entry 9
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Stopping 
                              = new javax.cim.UnsignedInteger16("9");
	          	
                       /**
              * constant for value entry Stopping (corresponds to mapEntry 9 )
              */
             public final static String VALUE_ENTRY_Stopping 
                              = "Stopping";
                    
       		
          /**
           * constant for value map entry 10
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Stopped 
                              = new javax.cim.UnsignedInteger16("10");
	          	
                       /**
              * constant for value entry Stopped (corresponds to mapEntry 10 )
              */
             public final static String VALUE_ENTRY_Stopped 
                              = "Stopped";
                    
       		
          /**
           * constant for value map entry 11
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_In_Service 
                              = new javax.cim.UnsignedInteger16("11");
	          	
                       /**
              * constant for value entry In Service (corresponds to mapEntry 11 )
              */
             public final static String VALUE_ENTRY_In_Service 
                              = "In Service";
                    
       		
          /**
           * constant for value map entry 12
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_No_Contact 
                              = new javax.cim.UnsignedInteger16("12");
	          	
                       /**
              * constant for value entry No Contact (corresponds to mapEntry 12 )
              */
             public final static String VALUE_ENTRY_No_Contact 
                              = "No Contact";
                    
       		
          /**
           * constant for value map entry 13
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Lost_Communication 
                              = new javax.cim.UnsignedInteger16("13");
	          	
                       /**
              * constant for value entry Lost Communication (corresponds to mapEntry 13 )
              */
             public final static String VALUE_ENTRY_Lost_Communication 
                              = "Lost Communication";
                    
       		
          /**
           * constant for value map entry 14
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Aborted 
                              = new javax.cim.UnsignedInteger16("14");
	          	
                       /**
              * constant for value entry Aborted (corresponds to mapEntry 14 )
              */
             public final static String VALUE_ENTRY_Aborted 
                              = "Aborted";
                    
       		
          /**
           * constant for value map entry 15
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Dormant 
                              = new javax.cim.UnsignedInteger16("15");
	          	
                       /**
              * constant for value entry Dormant (corresponds to mapEntry 15 )
              */
             public final static String VALUE_ENTRY_Dormant 
                              = "Dormant";
                    
       		
          /**
           * constant for value map entry 16
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Supporting_Entity_in_Error 
                              = new javax.cim.UnsignedInteger16("16");
	          	
                       /**
              * constant for value entry Supporting Entity in Error (corresponds to mapEntry 16 )
              */
             public final static String VALUE_ENTRY_Supporting_Entity_in_Error 
                              = "Supporting Entity in Error";
                    
       		
          /**
           * constant for value map entry 17
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Completed 
                              = new javax.cim.UnsignedInteger16("17");
	          	
                       /**
              * constant for value entry Completed (corresponds to mapEntry 17 )
              */
             public final static String VALUE_ENTRY_Completed 
                              = "Completed";
                    
       		
          /**
           * constant for value map entry 18
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Power_Mode 
                              = new javax.cim.UnsignedInteger16("18");
	          	
                       /**
              * constant for value entry Power Mode (corresponds to mapEntry 18 )
              */
             public final static String VALUE_ENTRY_Power_Mode 
                              = "Power Mode";
                    
       		
          /**
           * constant for value map entry ..
           */ 
		          	
                       /**
              * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
              */
             public final static String VALUE_ENTRY_DMTF_Reserved 
                              = "DMTF Reserved";
                    
       		
          /**
           * constant for value map entry 0x8000..
           */ 
		          	
                       /**
              * constant for value entry Vendor Reserved (corresponds to mapEntry 0x8000.. )
              */
             public final static String VALUE_ENTRY_Vendor_Reserved 
                              = "Vendor Reserved";
                    
                                        /**
                 * get the ValueMapEntry of the given value
                 * @param value the value to find the ValueMapEntry for
                 * @return the ValueMap entry or null if not found
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntry(String value)
                {
                                                
	                                               if (VALUE_ENTRY_Unknown.equals(value))
                         {
                            return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Other.equals(value))
                         {
                            return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_OK.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OK;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Degraded.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Degraded;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Stressed.equals(value))
                         {
                            return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Stressed;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Predictive_Failure.equals(value))
                         {
                            return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Predictive_Failure;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Error.equals(value))
                         {
                            return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Error;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Non_Recoverable_Error.equals(value))
                         {
                            return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Non_Recoverable_Error;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Starting.equals(value))
                         {
                            return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Starting;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Stopping.equals(value))
                         {
                            return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Stopping;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Stopped.equals(value))
                         {
                            return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Stopped;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_In_Service.equals(value))
                         {
                            return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_In_Service;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_No_Contact.equals(value))
                         {
                            return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_No_Contact;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Lost_Communication.equals(value))
                         {
                            return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Lost_Communication;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Aborted.equals(value))
                         {
                            return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Aborted;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Dormant.equals(value))
                         {
                            return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Dormant;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Supporting_Entity_in_Error.equals(value))
                         {
                            return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Supporting_Entity_in_Error;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Completed.equals(value))
                         {
                            return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Completed;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Power_Mode.equals(value))
                         {
                            return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Power_Mode;
                         }
	                      	                             
	                      	                             
	                      	                   	                                         return null;
                                   
                }
                
                /**
                 * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
                 * @param indexInPulldown the index within the pulldown element, the list etc
                 * @return the ValueMap entry from the displayed values
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(Number indexInPulldown)
                {
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
                public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue)
                {
                   String valueEntry = getValueEntry(currentValue);
                   if (valueEntry != null)
                   {
                      for (int i=0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++)
                      {
                         if (VALUE_ENTRIES_FOR_DISPLAY[	i].equals(valueEntry))
                         {
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
                
                public static String getValueEntry(javax.cim.UnsignedInteger16 value)
                {
                   int iValue = value.intValue();
                                                                                     
                         if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue())
                         {
                            return VALUE_ENTRY_Unknown;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue())
                         {
                            return VALUE_ENTRY_Other;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OK.intValue())
                         {
                            return VALUE_ENTRY_OK;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Degraded.intValue())
                         {
                            return VALUE_ENTRY_Degraded;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Stressed.intValue())
                         {
                            return VALUE_ENTRY_Stressed;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Predictive_Failure.intValue())
                         {
                            return VALUE_ENTRY_Predictive_Failure;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Error.intValue())
                         {
                            return VALUE_ENTRY_Error;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Non_Recoverable_Error.intValue())
                         {
                            return VALUE_ENTRY_Non_Recoverable_Error;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Starting.intValue())
                         {
                            return VALUE_ENTRY_Starting;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Stopping.intValue())
                         {
                            return VALUE_ENTRY_Stopping;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Stopped.intValue())
                         {
                            return VALUE_ENTRY_Stopped;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_In_Service.intValue())
                         {
                            return VALUE_ENTRY_In_Service;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_No_Contact.intValue())
                         {
                            return VALUE_ENTRY_No_Contact;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Lost_Communication.intValue())
                         {
                            return VALUE_ENTRY_Lost_Communication;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Aborted.intValue())
                         {
                            return VALUE_ENTRY_Aborted;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Dormant.intValue())
                         {
                            return VALUE_ENTRY_Dormant;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Supporting_Entity_in_Error.intValue())
                         {
                            return VALUE_ENTRY_Supporting_Entity_in_Error;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Completed.intValue())
                         {
                            return VALUE_ENTRY_Completed;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Power_Mode.intValue())
                         {
                            return VALUE_ENTRY_Power_Mode;
                         }
                                                                                        
                         if (iValue >= 0x8000)
                         {
                            return VALUE_ENTRY_Vendor_Reserved;
                         }
                                                                                        return VALUE_ENTRY_DMTF_Reserved;
                                                                            
                }
          
                          
                /**
                 * get the ValueEntries of the given valueMapEntries
                 * @param values the values to find the ValueMapEntries for
                 * @return the array with ValueMap entries. Some of them may be null to if no valueMap entry was found
                 */
                 
                public static javax.cim.UnsignedInteger16[] getValueMapEntries(String[] values)
                {
                    javax.cim.UnsignedInteger16[] result = new javax.cim.UnsignedInteger16[values.length];
                    
                    for (int i=0; i < result.length; i++)
                    {
	                       result[i] = getValueMapEntry(values[i]);
                    }
                    
                    return result;
                }
                
                
                /**
                 * get the ValueMapEntries of the given valueEntries
                 * @param valueMapEntries the valueMap entries to find the Values for
                 * @return the array with Value entries. Some of them may be null to if no value entry was found
                 */          
                
                public static String[] getValueEntries(javax.cim.UnsignedInteger16[] values)
                {
                    String[] result = new String[values.length];
                    
                    for (int i=0; i < result.length; i++)
                    {
	                       result[i] = getValueEntry(values[i]);
                    }
                    
                    return result;
                }
                                    
          /**
	       * ValueMap entries
       * Contains no entries that having an integer value range representation
       * 
       * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
       *
       * @see \#VALUE_ENTRIES_FOR_DISPLAY
       * 
       * Value Map for the property OperationalStatus   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown
                     	                            ,  VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other
                     	                            ,  VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OK
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Degraded
                     	                            ,  VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Stressed
                     	                            ,  VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Predictive_Failure
                     	                            ,  VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Error
                     	                            ,  VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Non_Recoverable_Error
                     	                            ,  VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Starting
                     	                            ,  VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Stopping
                     	                            ,  VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Stopped
                     	                            ,  VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_In_Service
                     	                            ,  VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_No_Contact
                     	                            ,  VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Lost_Communication
                     	                            ,  VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Aborted
                     	                            ,  VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Dormant
                     	                            ,  VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Supporting_Entity_in_Error
                     	                            ,  VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Completed
                     	                            ,  VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Power_Mode
                     	                     	                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property OperationalStatus   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Other
                                                                 ,  VALUE_ENTRY_OK
                                                                 ,  VALUE_ENTRY_Degraded
                                                                 ,  VALUE_ENTRY_Stressed
                                                                 ,  VALUE_ENTRY_Predictive_Failure
                                                                 ,  VALUE_ENTRY_Error
                                                                 ,  VALUE_ENTRY_Non_Recoverable_Error
                                                                 ,  VALUE_ENTRY_Starting
                                                                 ,  VALUE_ENTRY_Stopping
                                                                 ,  VALUE_ENTRY_Stopped
                                                                 ,  VALUE_ENTRY_In_Service
                                                                 ,  VALUE_ENTRY_No_Contact
                                                                 ,  VALUE_ENTRY_Lost_Communication
                                                                 ,  VALUE_ENTRY_Aborted
                                                                 ,  VALUE_ENTRY_Dormant
                                                                 ,  VALUE_ENTRY_Supporting_Entity_in_Error
                                                                 ,  VALUE_ENTRY_Completed
                                                                 ,  VALUE_ENTRY_Power_Mode
                                                                 ,  VALUE_ENTRY_DMTF_Reserved
                                                                 ,  VALUE_ENTRY_Vendor_Reserved
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property OperationalStatus   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Other
                                                                 ,  VALUE_ENTRY_OK
                                                                 ,  VALUE_ENTRY_Degraded
                                                                 ,  VALUE_ENTRY_Stressed
                                                                 ,  VALUE_ENTRY_Predictive_Failure
                                                                 ,  VALUE_ENTRY_Error
                                                                 ,  VALUE_ENTRY_Non_Recoverable_Error
                                                                 ,  VALUE_ENTRY_Starting
                                                                 ,  VALUE_ENTRY_Stopping
                                                                 ,  VALUE_ENTRY_Stopped
                                                                 ,  VALUE_ENTRY_In_Service
                                                                 ,  VALUE_ENTRY_No_Contact
                                                                 ,  VALUE_ENTRY_Lost_Communication
                                                                 ,  VALUE_ENTRY_Aborted
                                                                 ,  VALUE_ENTRY_Dormant
                                                                 ,  VALUE_ENTRY_Supporting_Entity_in_Error
                                                                 ,  VALUE_ENTRY_Completed
                                                                 ,  VALUE_ENTRY_Power_Mode
                                                                                              };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property PrimaryStatus
     * PrimaryStatus provides a high level status value, intended to align with Red-Yellow-Green type representation of status. It should be used in conjunction with DetailedStatus to provide high level and detailed health status of the ManagedElement and its subcomponents. 
     * PrimaryStatus consists of one of the following values: Unknown, OK, Degraded or Error. "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at this time. 
     * "OK" indicates the ManagedElement is functioning normally. 
     * "Degraded" indicates the ManagedElement is functioning below normal. 
     * "Error" indicates the ManagedElement is in an Error condition.
     */
    public static class PROPERTY_PRIMARYSTATUS
    {
       /**
        * name of the property PrimaryStatus
        */
       public final static String NAME = "PrimaryStatus";                  

	    	
    

              
       		
          /**
           * constant for value map entry 0
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown 
                              = new javax.cim.UnsignedInteger16("0");
	          	
                       /**
              * constant for value entry Unknown (corresponds to mapEntry 0 )
              */
             public final static String VALUE_ENTRY_Unknown 
                              = "Unknown";
                    
       		
          /**
           * constant for value map entry 1
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_OK 
                              = new javax.cim.UnsignedInteger16("1");
	          	
                       /**
              * constant for value entry OK (corresponds to mapEntry 1 )
              */
             public final static String VALUE_ENTRY_OK 
                              = "OK";
                    
       		
          /**
           * constant for value map entry 2
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Degraded 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry Degraded (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_Degraded 
                              = "Degraded";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Error 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry Error (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_Error 
                              = "Error";
                    
       		
          /**
           * constant for value map entry ..
           */ 
		          	
                       /**
              * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
              */
             public final static String VALUE_ENTRY_DMTF_Reserved 
                              = "DMTF Reserved";
                    
       		
          /**
           * constant for value map entry 0x8000..
           */ 
		          	
                       /**
              * constant for value entry Vendor Reserved (corresponds to mapEntry 0x8000.. )
              */
             public final static String VALUE_ENTRY_Vendor_Reserved 
                              = "Vendor Reserved";
                    
                                        /**
                 * get the ValueMapEntry of the given value
                 * @param value the value to find the ValueMapEntry for
                 * @return the ValueMap entry or null if not found
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntry(String value)
                {
                                                
	                                               if (VALUE_ENTRY_Unknown.equals(value))
                         {
                            return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_OK.equals(value))
                         {
                            return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_OK;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Degraded.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Degraded;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Error.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Error;
                         }
	                      	                             
	                      	                             
	                      	                   	                                         return null;
                                   
                }
                
                /**
                 * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
                 * @param indexInPulldown the index within the pulldown element, the list etc
                 * @return the ValueMap entry from the displayed values
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(Number indexInPulldown)
                {
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
                public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue)
                {
                   String valueEntry = getValueEntry(currentValue);
                   if (valueEntry != null)
                   {
                      for (int i=0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++)
                      {
                         if (VALUE_ENTRIES_FOR_DISPLAY[	i].equals(valueEntry))
                         {
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
                
                public static String getValueEntry(javax.cim.UnsignedInteger16 value)
                {
                   int iValue = value.intValue();
                                                                                     
                         if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue())
                         {
                            return VALUE_ENTRY_Unknown;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_OK.intValue())
                         {
                            return VALUE_ENTRY_OK;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Degraded.intValue())
                         {
                            return VALUE_ENTRY_Degraded;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Error.intValue())
                         {
                            return VALUE_ENTRY_Error;
                         }
                                                                                        
                         if (iValue >= 0x8000)
                         {
                            return VALUE_ENTRY_Vendor_Reserved;
                         }
                                                                                        return VALUE_ENTRY_DMTF_Reserved;
                                                                            
                }
          
                                    
          /**
	       * ValueMap entries
       * Contains no entries that having an integer value range representation
       * 
       * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
       *
       * @see \#VALUE_ENTRIES_FOR_DISPLAY
       * 
       * Value Map for the property PrimaryStatus   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown
                     	                            ,  VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_OK
                     	                            ,  VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Degraded
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Error
                     	                     	                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property PrimaryStatus   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_OK
                                                                 ,  VALUE_ENTRY_Degraded
                                                                 ,  VALUE_ENTRY_Error
                                                                 ,  VALUE_ENTRY_DMTF_Reserved
                                                                 ,  VALUE_ENTRY_Vendor_Reserved
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property PrimaryStatus   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_OK
                                                                 ,  VALUE_ENTRY_Degraded
                                                                 ,  VALUE_ENTRY_Error
                                                                                              };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property Status
     * A string indicating the current status of the object. Various operational and non-operational statuses are defined. This property is deprecated in lieu of OperationalStatus, which includes the same semantics in its enumeration. This change is made for 3 reasons: 
     * 1) Status is more correctly defined as an array. This definition overcomes the limitation of describing status using a single value, when it is really a multi-valued property (for example, an element might be OK AND Stopped. 
     * 2) A MaxLen of 10 is too restrictive and leads to unclear enumerated values. 
     * 3) The change to a uint16 data type was discussed when CIM V2.0 was defined. However, existing V1.0 implementations used the string property and did not want to modify their code. Therefore, Status was grandfathered into the Schema. Use of the deprecated qualifier allows the maintenance of the existing property, but also permits an improved definition using OperationalStatus.
     */
    public static class PROPERTY_STATUS
    {
       /**
        * name of the property Status
        */
       public final static String NAME = "Status";                  

	    	
    

              
       		
          /**
           * constant for value map entry OK
           */ 
		          
          public final static String VALUE_MAP_ENTRY_OK 
                              = new String("OK");
	          	
                    
       		
          /**
           * constant for value map entry Error
           */ 
		          
          public final static String VALUE_MAP_ENTRY_Error 
                              = new String("Error");
	          	
                    
       		
          /**
           * constant for value map entry Degraded
           */ 
		          
          public final static String VALUE_MAP_ENTRY_Degraded 
                              = new String("Degraded");
	          	
                    
       		
          /**
           * constant for value map entry Unknown
           */ 
		          
          public final static String VALUE_MAP_ENTRY_Unknown 
                              = new String("Unknown");
	          	
                    
       		
          /**
           * constant for value map entry Pred Fail
           */ 
		          
          public final static String VALUE_MAP_ENTRY_Pred_Fail 
                              = new String("Pred Fail");
	          	
                    
       		
          /**
           * constant for value map entry Starting
           */ 
		          
          public final static String VALUE_MAP_ENTRY_Starting 
                              = new String("Starting");
	          	
                    
       		
          /**
           * constant for value map entry Stopping
           */ 
		          
          public final static String VALUE_MAP_ENTRY_Stopping 
                              = new String("Stopping");
	          	
                    
       		
          /**
           * constant for value map entry Service
           */ 
		          
          public final static String VALUE_MAP_ENTRY_Service 
                              = new String("Service");
	          	
                    
       		
          /**
           * constant for value map entry Stressed
           */ 
		          
          public final static String VALUE_MAP_ENTRY_Stressed 
                              = new String("Stressed");
	          	
                    
       		
          /**
           * constant for value map entry NonRecover
           */ 
		          
          public final static String VALUE_MAP_ENTRY_NonRecover 
                              = new String("NonRecover");
	          	
                    
       		
          /**
           * constant for value map entry No Contact
           */ 
		          
          public final static String VALUE_MAP_ENTRY_No_Contact 
                              = new String("No Contact");
	          	
                    
       		
          /**
           * constant for value map entry Lost Comm
           */ 
		          
          public final static String VALUE_MAP_ENTRY_Lost_Comm 
                              = new String("Lost Comm");
	          	
                    
       		
          /**
           * constant for value map entry Stopped
           */ 
		          
          public final static String VALUE_MAP_ENTRY_Stopped 
                              = new String("Stopped");
	          	
                    
                 
          /**
	       * ValueMap entries
       * Contains no entries that having an integer value range representation
       * 
       * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
       *
       * @see \#VALUE_ENTRIES_FOR_DISPLAY
       * 
       * Value Map for the property Status   
       */
      public final static String[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_OK
                     	                            ,  VALUE_MAP_ENTRY_Error
                     	                            ,  VALUE_MAP_ENTRY_Degraded
                     	                            ,  VALUE_MAP_ENTRY_Unknown
                     	                            ,  VALUE_MAP_ENTRY_Pred_Fail
                     	                            ,  VALUE_MAP_ENTRY_Starting
                     	                            ,  VALUE_MAP_ENTRY_Stopping
                     	                            ,  VALUE_MAP_ENTRY_Service
                     	                            ,  VALUE_MAP_ENTRY_Stressed
                     	                            ,  VALUE_MAP_ENTRY_NonRecover
                     	                            ,  VALUE_MAP_ENTRY_No_Contact
                     	                            ,  VALUE_MAP_ENTRY_Lost_Comm
                     	                            ,  VALUE_MAP_ENTRY_Stopped
                           };
    	
	        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property StatusDescriptions
     * Strings describing the various OperationalStatus array values. For example, if "Stopping" is the value assigned to OperationalStatus, then this property may contain an explanation as to why an object is being stopped. Note that entries in this array are correlated with those at the same array index in OperationalStatus.
     */
    public static class PROPERTY_STATUSDESCRIPTIONS
    {
       /**
        * name of the property StatusDescriptions
        */
       public final static String NAME = "StatusDescriptions";                  

	    	
    

    		    
	
	    
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
    *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
    *   CIM_ManagedSystemElement is the base class for the System Element hierarchy. Any distinguishable component of a System is a candidate for inclusion in this class. Examples of system components include: 
     * - software components such as application servers, databases, and applications 
     * - operating system components such as files, processes, and threads 
     * - device components such as disk drives, controllers, processors, and printers 
     * - physical components such as chips and cards.
    *   @param client the CIM Client
    *   @param namespace the target namespace
    */  

      
   protected CIM_ManagedSystemElement(WBEMClient client, String namespace) throws WbemsmtException
   {
       CIMClass cls = getClass(client,namespace);
       setFromServer(false);
       init(cls.newInstance(),true);
   }
        
   /**
    *   Class constructor
    * 
    *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
    *   CIM_ManagedSystemElement is the base class for the System Element hierarchy. Any distinguishable component of a System is a candidate for inclusion in this class. Examples of system components include: 
     * - software components such as application servers, databases, and applications 
     * - operating system components such as files, processes, and threads 
     * - device components such as disk drives, controllers, processors, and printers 
     * - physical components such as chips and cards.
    *   @param cimInstance the instance that is used to create the Object
    */  
   
   protected CIM_ManagedSystemElement(CIMInstance cimInstance)  throws WbemsmtException { 
        
       if (cimInstance == null) {
           throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimInstance parameter does not contain a valid reference.");
       }
       setFromServer(true);
       init(cimInstance,false);
   }
   
   /**
    * Default constructor
    */
   protected CIM_ManagedSystemElement()
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
              propertiesToCheck.put("CommunicationStatus",new CIMProperty("CommunicationStatus",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("DetailedStatus",new CIMProperty("DetailedStatus",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("HealthState",new CIMProperty("HealthState",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("InstallDate",new CIMProperty("InstallDate",CIMDataType.DATETIME_T,null));
              propertiesToCheck.put("Name",new CIMProperty("Name",CIMDataType.STRING_T,null));
              propertiesToCheck.put("OperatingStatus",new CIMProperty("OperatingStatus",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("OperationalStatus",new CIMProperty("OperationalStatus",CIMDataType.UINT16_ARRAY_T,null));
              propertiesToCheck.put("PrimaryStatus",new CIMProperty("PrimaryStatus",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("Status",new CIMProperty("Status",CIMDataType.STRING_T,null));
              propertiesToCheck.put("StatusDescriptions",new CIMProperty("StatusDescriptions",CIMDataType.STRING_ARRAY_T,null));
       	
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
    * Get the property CommunicationStatus
    *     * <br>
    * CommunicationStatus indicates the ability of the instrumentation to communicate with the underlying ManagedElement. CommunicationStatus consists of one of the following values: Unknown, None, Communication OK, Lost Communication, or No Contact. 
     * A Null return indicates the implementation (provider) does not implement this property. 
     * "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at this time. 
     * "Not Available" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is intended to add additional info to another property). 
     * "Communication OK " indicates communication is established with the element, but does not convey any quality of service. 
     * "No Contact" indicates that the monitoring system has knowledge of this element, but has never been able to establish communications with it. 
     * "Lost Communication" indicates that the Managed Element is known to exist and has been contacted successfully in the past, but is currently unreachable.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_CommunicationStatus()    {
       CIMProperty currentProperty = getProperty(PROPERTY_COMMUNICATIONSTATUS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_COMMUNICATIONSTATUS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property CommunicationStatus
    * <br>
    * CommunicationStatus indicates the ability of the instrumentation to communicate with the underlying ManagedElement. CommunicationStatus consists of one of the following values: Unknown, None, Communication OK, Lost Communication, or No Contact. 
     * A Null return indicates the implementation (provider) does not implement this property. 
     * "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at this time. 
     * "Not Available" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is intended to add additional info to another property). 
     * "Communication OK " indicates communication is established with the element, but does not convey any quality of service. 
     * "No Contact" indicates that the monitoring system has knowledge of this element, but has never been able to establish communications with it. 
     * "Lost Communication" indicates that the Managed Element is known to exist and has been contacted successfully in the past, but is currently unreachable.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_CommunicationStatus(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_COMMUNICATIONSTATUS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_CommunicationStatus(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_COMMUNICATIONSTATUS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property CommunicationStatus by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CommunicationStatus(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ManagedSystemElement fco = new CIM_ManagedSystemElement(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_COMMUNICATIONSTATUS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_CommunicationStatus(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_COMMUNICATIONSTATUS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property CommunicationStatus
    * <br>
    * CommunicationStatus indicates the ability of the instrumentation to communicate with the underlying ManagedElement. CommunicationStatus consists of one of the following values: Unknown, None, Communication OK, Lost Communication, or No Contact. 
     * A Null return indicates the implementation (provider) does not implement this property. 
     * "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at this time. 
     * "Not Available" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is intended to add additional info to another property). 
     * "Communication OK " indicates communication is established with the element, but does not convey any quality of service. 
     * "No Contact" indicates that the monitoring system has knowledge of this element, but has never been able to establish communications with it. 
     * "Lost Communication" indicates that the Managed Element is known to exist and has been contacted successfully in the past, but is currently unreachable.
    */
    
   private static CIMProperty setPropertyValue_CommunicationStatus(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property DetailedStatus
    *     * <br>
    * DetailedStatus compliments PrimaryStatus with additional status detail. It consists of one of the following values: Not Available, No Additional Information, Stressed, Predictive Failure, Error, Non-Recoverable Error, SupportingEntityInError. Detailed status is used to expand upon the PrimaryStatus of the element. 
     * A Null return indicates the implementation (provider) does not implement this property. 
     * "Not Available" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is intended to add additional info to another property). 
     * "No Additional Information" indicates that the element is functioning normally as indicated by PrimaryStatus = "OK". 
     * "Stressed" indicates that the element is functioning, but needs attention. Examples of "Stressed" states are overload, overheated, and so on. 
     * "Predictive Failure" indicates that an element is functioning normally but a failure is predicted in the near future. 
     * "Non-Recoverable Error " indicates that this element is in an error condition that requires human intervention. 
     * "Supporting Entity in Error" indicates that this element might be "OK" but that another element, on which it is dependent, is in error. An example is a network service or endpoint that cannot function due to lower-layer networking problems.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_DetailedStatus()    {
       CIMProperty currentProperty = getProperty(PROPERTY_DETAILEDSTATUS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_DETAILEDSTATUS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property DetailedStatus
    * <br>
    * DetailedStatus compliments PrimaryStatus with additional status detail. It consists of one of the following values: Not Available, No Additional Information, Stressed, Predictive Failure, Error, Non-Recoverable Error, SupportingEntityInError. Detailed status is used to expand upon the PrimaryStatus of the element. 
     * A Null return indicates the implementation (provider) does not implement this property. 
     * "Not Available" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is intended to add additional info to another property). 
     * "No Additional Information" indicates that the element is functioning normally as indicated by PrimaryStatus = "OK". 
     * "Stressed" indicates that the element is functioning, but needs attention. Examples of "Stressed" states are overload, overheated, and so on. 
     * "Predictive Failure" indicates that an element is functioning normally but a failure is predicted in the near future. 
     * "Non-Recoverable Error " indicates that this element is in an error condition that requires human intervention. 
     * "Supporting Entity in Error" indicates that this element might be "OK" but that another element, on which it is dependent, is in error. An example is a network service or endpoint that cannot function due to lower-layer networking problems.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_DetailedStatus(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_DETAILEDSTATUS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_DetailedStatus(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_DETAILEDSTATUS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property DetailedStatus by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DetailedStatus(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ManagedSystemElement fco = new CIM_ManagedSystemElement(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DETAILEDSTATUS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_DetailedStatus(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_DETAILEDSTATUS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property DetailedStatus
    * <br>
    * DetailedStatus compliments PrimaryStatus with additional status detail. It consists of one of the following values: Not Available, No Additional Information, Stressed, Predictive Failure, Error, Non-Recoverable Error, SupportingEntityInError. Detailed status is used to expand upon the PrimaryStatus of the element. 
     * A Null return indicates the implementation (provider) does not implement this property. 
     * "Not Available" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is intended to add additional info to another property). 
     * "No Additional Information" indicates that the element is functioning normally as indicated by PrimaryStatus = "OK". 
     * "Stressed" indicates that the element is functioning, but needs attention. Examples of "Stressed" states are overload, overheated, and so on. 
     * "Predictive Failure" indicates that an element is functioning normally but a failure is predicted in the near future. 
     * "Non-Recoverable Error " indicates that this element is in an error condition that requires human intervention. 
     * "Supporting Entity in Error" indicates that this element might be "OK" but that another element, on which it is dependent, is in error. An example is a network service or endpoint that cannot function due to lower-layer networking problems.
    */
    
   private static CIMProperty setPropertyValue_DetailedStatus(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property HealthState
    *     * <br>
    * Indicates the current health of the element. This attribute expresses the health of this element but not necessarily that of its subcomponents. The possible values are 0 to 30, where 5 means the element is entirely healthy and 30 means the element is completely non-functional. The following continuum is defined: 
     * "Non-recoverable Error" (30) - The element has completely failed, and recovery is not possible. All functionality provided by this element has been lost. 
     * "Critical Failure" (25) - The element is non-functional and recovery might not be possible. 
     * "Major Failure" (20) - The element is failing. It is possible that some or all of the functionality of this component is degraded or not working. 
     * "Minor Failure" (15) - All functionality is available but some might be degraded. 
     * "Degraded/Warning" (10) - The element is in working order and all functionality is provided. However, the element is not working to the best of its abilities. For example, the element might not be operating at optimal performance or it might be reporting recoverable errors. 
     * "OK" (5) - The element is fully functional and is operating within normal operational parameters and without error. 
     * "Unknown" (0) - The implementation cannot report on HealthState at this time. 
     * DMTF has reserved the unused portion of the continuum for additional HealthStates in the future.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_HealthState()    {
       CIMProperty currentProperty = getProperty(PROPERTY_HEALTHSTATE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_HEALTHSTATE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property HealthState
    * <br>
    * Indicates the current health of the element. This attribute expresses the health of this element but not necessarily that of its subcomponents. The possible values are 0 to 30, where 5 means the element is entirely healthy and 30 means the element is completely non-functional. The following continuum is defined: 
     * "Non-recoverable Error" (30) - The element has completely failed, and recovery is not possible. All functionality provided by this element has been lost. 
     * "Critical Failure" (25) - The element is non-functional and recovery might not be possible. 
     * "Major Failure" (20) - The element is failing. It is possible that some or all of the functionality of this component is degraded or not working. 
     * "Minor Failure" (15) - All functionality is available but some might be degraded. 
     * "Degraded/Warning" (10) - The element is in working order and all functionality is provided. However, the element is not working to the best of its abilities. For example, the element might not be operating at optimal performance or it might be reporting recoverable errors. 
     * "OK" (5) - The element is fully functional and is operating within normal operational parameters and without error. 
     * "Unknown" (0) - The implementation cannot report on HealthState at this time. 
     * DMTF has reserved the unused portion of the continuum for additional HealthStates in the future.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_HealthState(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_HEALTHSTATE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_HealthState(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_HEALTHSTATE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property HealthState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_HealthState(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ManagedSystemElement fco = new CIM_ManagedSystemElement(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_HEALTHSTATE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_HealthState(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_HEALTHSTATE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property HealthState
    * <br>
    * Indicates the current health of the element. This attribute expresses the health of this element but not necessarily that of its subcomponents. The possible values are 0 to 30, where 5 means the element is entirely healthy and 30 means the element is completely non-functional. The following continuum is defined: 
     * "Non-recoverable Error" (30) - The element has completely failed, and recovery is not possible. All functionality provided by this element has been lost. 
     * "Critical Failure" (25) - The element is non-functional and recovery might not be possible. 
     * "Major Failure" (20) - The element is failing. It is possible that some or all of the functionality of this component is degraded or not working. 
     * "Minor Failure" (15) - All functionality is available but some might be degraded. 
     * "Degraded/Warning" (10) - The element is in working order and all functionality is provided. However, the element is not working to the best of its abilities. For example, the element might not be operating at optimal performance or it might be reporting recoverable errors. 
     * "OK" (5) - The element is fully functional and is operating within normal operational parameters and without error. 
     * "Unknown" (0) - The implementation cannot report on HealthState at this time. 
     * DMTF has reserved the unused portion of the continuum for additional HealthStates in the future.
    */
    
   private static CIMProperty setPropertyValue_HealthState(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property InstallDate
    *     * <br>
    * A datetime value that indicates when the object was installed. Lack of a value does not indicate that the object is not installed.
    *     */

      

               
   public javax.cim.CIMDateTime get_InstallDate()    {
       CIMProperty currentProperty = getProperty(PROPERTY_INSTALLDATE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_INSTALLDATE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.CIMDateTime)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property InstallDate
    * <br>
    * A datetime value that indicates when the object was installed. Lack of a value does not indicate that the object is not installed.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_InstallDate(javax.cim.CIMDateTime newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_INSTALLDATE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_InstallDate(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_INSTALLDATE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property InstallDate by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_InstallDate(WBEMClient client, String namespace, javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_ManagedSystemElement fco = new CIM_ManagedSystemElement(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INSTALLDATE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_InstallDate(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_INSTALLDATE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property InstallDate
    * <br>
    * A datetime value that indicates when the object was installed. Lack of a value does not indicate that the object is not installed.
    */
    
   private static CIMProperty setPropertyValue_InstallDate(CIMProperty currentProperty, javax.cim.CIMDateTime newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Name
    *     * <br>
    * The Name property defines the label by which the object is known. When subclassed, the Name property can be overridden to be a Key property.
    *     */

      

               
   public String get_Name()    {
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
    * The Name property defines the label by which the object is known. When subclassed, the Name property can be overridden to be a Key property.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Name(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Name(currentProperty,newValue));
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

    public static CIMProperty create_Name(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_ManagedSystemElement fco = new CIM_ManagedSystemElement(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Name(property,newValue);
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
    * The Name property defines the label by which the object is known. When subclassed, the Name property can be overridden to be a Key property.
    */
    
   private static CIMProperty setPropertyValue_Name(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property OperatingStatus
    *     * <br>
    * OperatingStatus provides a current status value for the operational condition of the element and can be used for providing more detail with respect to the value of EnabledState. It can also provide the transitional states when an element is transitioning from one state to another, such as when an element is transitioning between EnabledState and RequestedState, as well as other transitional conditions.
     * OperatingStatus consists of one of the following values: Unknown, Not Available, In Service, Starting, Stopping, Stopped, Aborted, Dormant, Completed, Migrating, Emmigrating, Immigrating, Snapshotting. Shutting Down, In Test 
     * A Null return indicates the implementation (provider) does not implement this property. 
     * "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at this time. 
     * "None" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is intended to add additional info to another property). 
     * "Servicing" describes an element being configured, maintained, cleaned, or otherwise administered. 
     * "Starting" describes an element being initialized. 
     * "Stopping" describes an element being brought to an orderly stop. 
     * "Stopped" and "Aborted" are similar, although the former implies a clean and orderly stop, while the latter implies an abrupt stop where the state and configuration of the element might need to be updated. 
     * "Dormant" indicates that the element is inactive or quiesced. 
     * "Completed" indicates that the element has completed its operation. This value should be combined with either OK, Error, or Degraded in the PrimaryStatus so that a client can tell if the complete operation Completed with OK (passed), Completed with Error (failed), or Completed with Degraded (the operation finished, but it did not complete OK or did not report an error). 
     * "Migrating" element is being moved between host elements. 
     * "Immigrating" element is being moved to new host element. 
     * "Emigrating" element is being moved away from host element. 
     * "Shutting Down" describes an element being brought to an abrupt stop. 
     * "In Test" element is performing test functions. 
     * "Transitioning" describes an element that is between states, that is, it is not fully available in either its previous state or its next state. This value should be used if other values indicating a transition to a specific state are not applicable.
     * "In Service" describes an element that is in service and operational.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_OperatingStatus()    {
       CIMProperty currentProperty = getProperty(PROPERTY_OPERATINGSTATUS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_OPERATINGSTATUS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property OperatingStatus
    * <br>
    * OperatingStatus provides a current status value for the operational condition of the element and can be used for providing more detail with respect to the value of EnabledState. It can also provide the transitional states when an element is transitioning from one state to another, such as when an element is transitioning between EnabledState and RequestedState, as well as other transitional conditions.
     * OperatingStatus consists of one of the following values: Unknown, Not Available, In Service, Starting, Stopping, Stopped, Aborted, Dormant, Completed, Migrating, Emmigrating, Immigrating, Snapshotting. Shutting Down, In Test 
     * A Null return indicates the implementation (provider) does not implement this property. 
     * "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at this time. 
     * "None" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is intended to add additional info to another property). 
     * "Servicing" describes an element being configured, maintained, cleaned, or otherwise administered. 
     * "Starting" describes an element being initialized. 
     * "Stopping" describes an element being brought to an orderly stop. 
     * "Stopped" and "Aborted" are similar, although the former implies a clean and orderly stop, while the latter implies an abrupt stop where the state and configuration of the element might need to be updated. 
     * "Dormant" indicates that the element is inactive or quiesced. 
     * "Completed" indicates that the element has completed its operation. This value should be combined with either OK, Error, or Degraded in the PrimaryStatus so that a client can tell if the complete operation Completed with OK (passed), Completed with Error (failed), or Completed with Degraded (the operation finished, but it did not complete OK or did not report an error). 
     * "Migrating" element is being moved between host elements. 
     * "Immigrating" element is being moved to new host element. 
     * "Emigrating" element is being moved away from host element. 
     * "Shutting Down" describes an element being brought to an abrupt stop. 
     * "In Test" element is performing test functions. 
     * "Transitioning" describes an element that is between states, that is, it is not fully available in either its previous state or its next state. This value should be used if other values indicating a transition to a specific state are not applicable.
     * "In Service" describes an element that is in service and operational.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_OperatingStatus(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_OPERATINGSTATUS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_OperatingStatus(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_OPERATINGSTATUS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property OperatingStatus by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OperatingStatus(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ManagedSystemElement fco = new CIM_ManagedSystemElement(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OPERATINGSTATUS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_OperatingStatus(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_OPERATINGSTATUS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property OperatingStatus
    * <br>
    * OperatingStatus provides a current status value for the operational condition of the element and can be used for providing more detail with respect to the value of EnabledState. It can also provide the transitional states when an element is transitioning from one state to another, such as when an element is transitioning between EnabledState and RequestedState, as well as other transitional conditions.
     * OperatingStatus consists of one of the following values: Unknown, Not Available, In Service, Starting, Stopping, Stopped, Aborted, Dormant, Completed, Migrating, Emmigrating, Immigrating, Snapshotting. Shutting Down, In Test 
     * A Null return indicates the implementation (provider) does not implement this property. 
     * "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at this time. 
     * "None" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is intended to add additional info to another property). 
     * "Servicing" describes an element being configured, maintained, cleaned, or otherwise administered. 
     * "Starting" describes an element being initialized. 
     * "Stopping" describes an element being brought to an orderly stop. 
     * "Stopped" and "Aborted" are similar, although the former implies a clean and orderly stop, while the latter implies an abrupt stop where the state and configuration of the element might need to be updated. 
     * "Dormant" indicates that the element is inactive or quiesced. 
     * "Completed" indicates that the element has completed its operation. This value should be combined with either OK, Error, or Degraded in the PrimaryStatus so that a client can tell if the complete operation Completed with OK (passed), Completed with Error (failed), or Completed with Degraded (the operation finished, but it did not complete OK or did not report an error). 
     * "Migrating" element is being moved between host elements. 
     * "Immigrating" element is being moved to new host element. 
     * "Emigrating" element is being moved away from host element. 
     * "Shutting Down" describes an element being brought to an abrupt stop. 
     * "In Test" element is performing test functions. 
     * "Transitioning" describes an element that is between states, that is, it is not fully available in either its previous state or its next state. This value should be used if other values indicating a transition to a specific state are not applicable.
     * "In Service" describes an element that is in service and operational.
    */
    
   private static CIMProperty setPropertyValue_OperatingStatus(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property OperationalStatus
    *     * <br>
    * Indicates the current statuses of the element. Various operational statuses are defined. Many of the enumeration's values are self-explanatory. However, a few are not and are described here in more detail. 
     * "Stressed" indicates that the element is functioning, but needs attention. Examples of "Stressed" states are overload, overheated, and so on. 
     * "Predictive Failure" indicates that an element is functioning nominally but predicting a failure in the near future. 
     * "In Service" describes an element being configured, maintained, cleaned, or otherwise administered. 
     * "No Contact" indicates that the monitoring system has knowledge of this element, but has never been able to establish communications with it. 
     * "Lost Communication" indicates that the ManagedSystem Element is known to exist and has been contacted successfully in the past, but is currently unreachable. 
     * "Stopped" and "Aborted" are similar, although the former implies a clean and orderly stop, while the latter implies an abrupt stop where the state and configuration of the element might need to be updated. 
     * "Dormant" indicates that the element is inactive or quiesced. 
     * "Supporting Entity in Error" indicates that this element might be "OK" but that another element, on which it is dependent, is in error. An example is a network service or endpoint that cannot function due to lower-layer networking problems. 
     * "Completed" indicates that the element has completed its operation. This value should be combined with either OK, Error, or Degraded so that a client can tell if the complete operation Completed with OK (passed), Completed with Error (failed), or Completed with Degraded (the operation finished, but it did not complete OK or did not report an error). 
     * "Power Mode" indicates that the element has additional power model information contained in the Associated PowerManagementService association. 
     * OperationalStatus replaces the Status property on ManagedSystemElement to provide a consistent approach to enumerations, to address implementation needs for an array property, and to provide a migration path from today's environment to the future. This change was not made earlier because it required the deprecated qualifier. Due to the widespread use of the existing Status property in management applications, it is strongly recommended that providers or instrumentation provide both the Status and OperationalStatus properties. Further, the first value of OperationalStatus should contain the primary status for the element. When instrumented, Status (because it is single-valued) should also provide the primary status of the element.
    *     */

      

               
   public javax.cim.UnsignedInteger16[] get_OperationalStatus()    {
       CIMProperty currentProperty = getProperty(PROPERTY_OPERATIONALSTATUS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_OPERATIONALSTATUS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16[])currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property OperationalStatus
    * <br>
    * Indicates the current statuses of the element. Various operational statuses are defined. Many of the enumeration's values are self-explanatory. However, a few are not and are described here in more detail. 
     * "Stressed" indicates that the element is functioning, but needs attention. Examples of "Stressed" states are overload, overheated, and so on. 
     * "Predictive Failure" indicates that an element is functioning nominally but predicting a failure in the near future. 
     * "In Service" describes an element being configured, maintained, cleaned, or otherwise administered. 
     * "No Contact" indicates that the monitoring system has knowledge of this element, but has never been able to establish communications with it. 
     * "Lost Communication" indicates that the ManagedSystem Element is known to exist and has been contacted successfully in the past, but is currently unreachable. 
     * "Stopped" and "Aborted" are similar, although the former implies a clean and orderly stop, while the latter implies an abrupt stop where the state and configuration of the element might need to be updated. 
     * "Dormant" indicates that the element is inactive or quiesced. 
     * "Supporting Entity in Error" indicates that this element might be "OK" but that another element, on which it is dependent, is in error. An example is a network service or endpoint that cannot function due to lower-layer networking problems. 
     * "Completed" indicates that the element has completed its operation. This value should be combined with either OK, Error, or Degraded so that a client can tell if the complete operation Completed with OK (passed), Completed with Error (failed), or Completed with Degraded (the operation finished, but it did not complete OK or did not report an error). 
     * "Power Mode" indicates that the element has additional power model information contained in the Associated PowerManagementService association. 
     * OperationalStatus replaces the Status property on ManagedSystemElement to provide a consistent approach to enumerations, to address implementation needs for an array property, and to provide a migration path from today's environment to the future. This change was not made earlier because it required the deprecated qualifier. Due to the widespread use of the existing Status property in management applications, it is strongly recommended that providers or instrumentation provide both the Status and OperationalStatus properties. Further, the first value of OperationalStatus should contain the primary status for the element. When instrumented, Status (because it is single-valued) should also provide the primary status of the element.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_OperationalStatus(javax.cim.UnsignedInteger16[] newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_OPERATIONALSTATUS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_OperationalStatus(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_OPERATIONALSTATUS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property OperationalStatus by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OperationalStatus(WBEMClient client, String namespace, javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_ManagedSystemElement fco = new CIM_ManagedSystemElement(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OPERATIONALSTATUS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_OperationalStatus(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_OPERATIONALSTATUS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property OperationalStatus
    * <br>
    * Indicates the current statuses of the element. Various operational statuses are defined. Many of the enumeration's values are self-explanatory. However, a few are not and are described here in more detail. 
     * "Stressed" indicates that the element is functioning, but needs attention. Examples of "Stressed" states are overload, overheated, and so on. 
     * "Predictive Failure" indicates that an element is functioning nominally but predicting a failure in the near future. 
     * "In Service" describes an element being configured, maintained, cleaned, or otherwise administered. 
     * "No Contact" indicates that the monitoring system has knowledge of this element, but has never been able to establish communications with it. 
     * "Lost Communication" indicates that the ManagedSystem Element is known to exist and has been contacted successfully in the past, but is currently unreachable. 
     * "Stopped" and "Aborted" are similar, although the former implies a clean and orderly stop, while the latter implies an abrupt stop where the state and configuration of the element might need to be updated. 
     * "Dormant" indicates that the element is inactive or quiesced. 
     * "Supporting Entity in Error" indicates that this element might be "OK" but that another element, on which it is dependent, is in error. An example is a network service or endpoint that cannot function due to lower-layer networking problems. 
     * "Completed" indicates that the element has completed its operation. This value should be combined with either OK, Error, or Degraded so that a client can tell if the complete operation Completed with OK (passed), Completed with Error (failed), or Completed with Degraded (the operation finished, but it did not complete OK or did not report an error). 
     * "Power Mode" indicates that the element has additional power model information contained in the Associated PowerManagementService association. 
     * OperationalStatus replaces the Status property on ManagedSystemElement to provide a consistent approach to enumerations, to address implementation needs for an array property, and to provide a migration path from today's environment to the future. This change was not made earlier because it required the deprecated qualifier. Due to the widespread use of the existing Status property in management applications, it is strongly recommended that providers or instrumentation provide both the Status and OperationalStatus properties. Further, the first value of OperationalStatus should contain the primary status for the element. When instrumented, Status (because it is single-valued) should also provide the primary status of the element.
    */
    
   private static CIMProperty setPropertyValue_OperationalStatus(CIMProperty currentProperty, javax.cim.UnsignedInteger16[] newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property PrimaryStatus
    *     * <br>
    * PrimaryStatus provides a high level status value, intended to align with Red-Yellow-Green type representation of status. It should be used in conjunction with DetailedStatus to provide high level and detailed health status of the ManagedElement and its subcomponents. 
     * PrimaryStatus consists of one of the following values: Unknown, OK, Degraded or Error. "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at this time. 
     * "OK" indicates the ManagedElement is functioning normally. 
     * "Degraded" indicates the ManagedElement is functioning below normal. 
     * "Error" indicates the ManagedElement is in an Error condition.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_PrimaryStatus()    {
       CIMProperty currentProperty = getProperty(PROPERTY_PRIMARYSTATUS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_PRIMARYSTATUS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property PrimaryStatus
    * <br>
    * PrimaryStatus provides a high level status value, intended to align with Red-Yellow-Green type representation of status. It should be used in conjunction with DetailedStatus to provide high level and detailed health status of the ManagedElement and its subcomponents. 
     * PrimaryStatus consists of one of the following values: Unknown, OK, Degraded or Error. "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at this time. 
     * "OK" indicates the ManagedElement is functioning normally. 
     * "Degraded" indicates the ManagedElement is functioning below normal. 
     * "Error" indicates the ManagedElement is in an Error condition.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_PrimaryStatus(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_PRIMARYSTATUS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_PrimaryStatus(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_PRIMARYSTATUS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property PrimaryStatus by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PrimaryStatus(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ManagedSystemElement fco = new CIM_ManagedSystemElement(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRIMARYSTATUS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_PrimaryStatus(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_PRIMARYSTATUS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property PrimaryStatus
    * <br>
    * PrimaryStatus provides a high level status value, intended to align with Red-Yellow-Green type representation of status. It should be used in conjunction with DetailedStatus to provide high level and detailed health status of the ManagedElement and its subcomponents. 
     * PrimaryStatus consists of one of the following values: Unknown, OK, Degraded or Error. "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at this time. 
     * "OK" indicates the ManagedElement is functioning normally. 
     * "Degraded" indicates the ManagedElement is functioning below normal. 
     * "Error" indicates the ManagedElement is in an Error condition.
    */
    
   private static CIMProperty setPropertyValue_PrimaryStatus(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Status
    *     * <br>
    * A string indicating the current status of the object. Various operational and non-operational statuses are defined. This property is deprecated in lieu of OperationalStatus, which includes the same semantics in its enumeration. This change is made for 3 reasons: 
     * 1) Status is more correctly defined as an array. This definition overcomes the limitation of describing status using a single value, when it is really a multi-valued property (for example, an element might be OK AND Stopped. 
     * 2) A MaxLen of 10 is too restrictive and leads to unclear enumerated values. 
     * 3) The change to a uint16 data type was discussed when CIM V2.0 was defined. However, existing V1.0 implementations used the string property and did not want to modify their code. Therefore, Status was grandfathered into the Schema. Use of the deprecated qualifier allows the maintenance of the existing property, but also permits an improved definition using OperationalStatus.
    *     */

      

               
   public String get_Status()    {
       CIMProperty currentProperty = getProperty(PROPERTY_STATUS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_STATUS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Status
    * <br>
    * A string indicating the current status of the object. Various operational and non-operational statuses are defined. This property is deprecated in lieu of OperationalStatus, which includes the same semantics in its enumeration. This change is made for 3 reasons: 
     * 1) Status is more correctly defined as an array. This definition overcomes the limitation of describing status using a single value, when it is really a multi-valued property (for example, an element might be OK AND Stopped. 
     * 2) A MaxLen of 10 is too restrictive and leads to unclear enumerated values. 
     * 3) The change to a uint16 data type was discussed when CIM V2.0 was defined. However, existing V1.0 implementations used the string property and did not want to modify their code. Therefore, Status was grandfathered into the Schema. Use of the deprecated qualifier allows the maintenance of the existing property, but also permits an improved definition using OperationalStatus.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Status(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_STATUS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Status(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_STATUS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Status by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Status(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_ManagedSystemElement fco = new CIM_ManagedSystemElement(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STATUS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Status(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_STATUS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Status
    * <br>
    * A string indicating the current status of the object. Various operational and non-operational statuses are defined. This property is deprecated in lieu of OperationalStatus, which includes the same semantics in its enumeration. This change is made for 3 reasons: 
     * 1) Status is more correctly defined as an array. This definition overcomes the limitation of describing status using a single value, when it is really a multi-valued property (for example, an element might be OK AND Stopped. 
     * 2) A MaxLen of 10 is too restrictive and leads to unclear enumerated values. 
     * 3) The change to a uint16 data type was discussed when CIM V2.0 was defined. However, existing V1.0 implementations used the string property and did not want to modify their code. Therefore, Status was grandfathered into the Schema. Use of the deprecated qualifier allows the maintenance of the existing property, but also permits an improved definition using OperationalStatus.
    */
    
   private static CIMProperty setPropertyValue_Status(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property StatusDescriptions
    *     * <br>
    * Strings describing the various OperationalStatus array values. For example, if "Stopping" is the value assigned to OperationalStatus, then this property may contain an explanation as to why an object is being stopped. Note that entries in this array are correlated with those at the same array index in OperationalStatus.
    *     */

      

               
   public String[] get_StatusDescriptions()    {
       CIMProperty currentProperty = getProperty(PROPERTY_STATUSDESCRIPTIONS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_STATUSDESCRIPTIONS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String[])currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property StatusDescriptions
    * <br>
    * Strings describing the various OperationalStatus array values. For example, if "Stopping" is the value assigned to OperationalStatus, then this property may contain an explanation as to why an object is being stopped. Note that entries in this array are correlated with those at the same array index in OperationalStatus.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_StatusDescriptions(String[] newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_STATUSDESCRIPTIONS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_StatusDescriptions(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_STATUSDESCRIPTIONS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property StatusDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_StatusDescriptions(WBEMClient client, String namespace, String[] newValue) throws WbemsmtException {
        CIM_ManagedSystemElement fco = new CIM_ManagedSystemElement(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STATUSDESCRIPTIONS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_StatusDescriptions(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_STATUSDESCRIPTIONS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property StatusDescriptions
    * <br>
    * Strings describing the various OperationalStatus array values. For example, if "Stopping" is the value assigned to OperationalStatus, then this property may contain an explanation as to why an object is being stopped. Note that entries in this array are correlated with those at the same array index in OperationalStatus.
    */
    
   private static CIMProperty setPropertyValue_StatusDescriptions(CIMProperty currentProperty, String[] newValue)
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
     * Get the list with CIM_System objects associated by the association CIM_SystemComponent
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_System> getAssociated_CIM_System_CIM_SystemComponents(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_System_CIM_SystemComponents(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT,
     	                CIM_System.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_System objects associated by the association CIM_SystemComponent
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_System> getAssociated_CIM_System_CIM_SystemComponents(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_System_CIM_SystemComponents(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_System objects associated by the association CIM_SystemComponent
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_System> getAssociated_CIM_System_CIM_SystemComponents(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_System> result = new java.util.ArrayList<CIM_System>();
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
                 CIM_ManagedSystemElementHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_ManagedSystemElementHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_ManagedSystemElementHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_System(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_System(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_System)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_System(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_ManagedSystemElementHelper.checkException(enumeration);
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
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_SystemComponent
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_System_CIM_SystemComponentNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_System_CIM_SystemComponentNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT,
    	                             CIM_System.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_SystemComponent
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_System_CIM_SystemComponentNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_System_CIM_SystemComponentNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_SystemComponent
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_System_CIM_SystemComponentNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT, 
                CIM_System.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_ManagedSystemElementHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_ManagedSystemElementHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_System.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_ManagedSystemElementHelper.checkException(enumeration);
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
    * Get the list with CIM_SystemComponent associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<CIM_SystemComponent> getAssociations_CIM_SystemComponent(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<CIM_SystemComponent> result = new java.util.ArrayList<CIM_SystemComponent>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             CIM_ManagedSystemElementHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_ManagedSystemElementHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = CIM_SystemComponentHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new CIM_SystemComponent(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new CIM_SystemComponent(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((CIM_SystemComponent)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new CIM_SystemComponent(cimInstance));
                   continue;
                }
              }
           }
           CIM_ManagedSystemElementHelper.checkException(enumeration);
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
    * Get a list of CIMObjectPath items of the associations CIM_SystemComponent
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_CIM_SystemComponent(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMCOMPONENT, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   CIM_ManagedSystemElementHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_ManagedSystemElementHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_SystemComponent.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_ManagedSystemElementHelper.checkException(enumeration);
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
    	    return CIM_ManagedSystemElement.CIM_CLASS_NAME;
    }



}