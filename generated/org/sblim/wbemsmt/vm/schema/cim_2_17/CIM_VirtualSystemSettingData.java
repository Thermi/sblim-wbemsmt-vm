/** 
  * CIM_VirtualSystemSettingData.java
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
  * Description: CIM_VirtualSystemSettingData defines the virtual aspects of a virtual system through a set of virtualization specific properties. CIM_VirtualSystemSettingData is also used as the top level class of virtual system configurations. Virtual system configurations model configuration information about virtual systems and their components. A virtual system configuration consists of one top-level instance of class CIM_VirtualSystemSettingData that aggregates a number of instances of class CIM_ResourceAllocationSettingData, using association CIM_ConcreteComponent. 
  * Virtual system configurations may for example be used to reflect configurations of 
  * - virtual systems that are defined at a virtualization platform, 
  * - virtual systems that are currently active, 
  * - input requests to create new virtual systems, 
  * - input requests to modify existing virtual systems, or 
  * - snapshots of virtual systems.
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
public class CIM_VirtualSystemSettingData extends  CIM_SettingData {



   public final static String CIM_CLASS_NAME = "CIM_VirtualSystemSettingData";
   public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    
    /**
     * The CIM_VirtualSystemSettingDataComponent association establishes a 'part of' relationship between an instance of the CIM_VirtualSystemSettingData class and a set of instances of the CIM_ResourceAllocationSettingData class.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT = "CIM_VirtualSystemSettingDataComponent";
    
    /**
     * The CIM_LastAppliedSnapshot association associates an instance of the CIM_VirtualSystemSettingData class representing a virtual system snapshot that was most recently applied to a virtual system, and the instance of the CIM_ComputerSystem class representing the related virtual system.
     * An instance of this assocation indicates that the referenced snapshot is the snapshot the was last applied to the virtual system from the set of snapshots taken from that virtual system. For each virtual system at any time there is at most one snapshot the last applied snapshot.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT = "CIM_LastAppliedSnapshot";
    
    /**
     * The CIM_MostCurrentSnapshotInBranch association associates an instance of the CIM_ComputerSystem class representing a virtual system, and the instance of the CIM_VirtualSystemSettingData class representing the virtual system snapshot that is the most current snapshot in a branch of dependent snapshots. 
     * Note that a new branch is implied as a snapshot that is part of an existing branch is applied to a virtual system, such that in this case initially that snapshot is the most current snapshot in that new branch. Note that this association does not exist if the virtual system was not activated based on a snapshot or no snapshot was yet created from the current instance of the virtual system.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH = "CIM_MostCurrentSnapshotInBranch";
    
    /**
     * The CIM_SnapshotOfVirtuaSystem association associates an instance of the CIM_ComputerSystem class representing a virtual system, and an instance of the CIM_VirtualSystemSettingData class representing a snapshot that was captured from the virtual system.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM = "CIM_SnapshotOfVirtualSystem";
    
    
    
	    /**
	     * Constants of property AutomaticRecoveryAction
     * Action to take for the virtual system when the software executed by the virtual system fails. Failures in this case means a failure that is detectable by the host platform, such as a non-interuptable wait state condition.
     */
    public static class PROPERTY_AUTOMATICRECOVERYACTION
    {
       /**
        * name of the property AutomaticRecoveryAction
        */
       public final static String NAME = "AutomaticRecoveryAction";                  

	    	
    

              
       		
          /**
           * constant for value map entry 2
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry None (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_None 
                              = "None";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Restart 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry Restart (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_Restart 
                              = "Restart";
                    
       		
          /**
           * constant for value map entry 4
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Revert_to_snapshot 
                              = new javax.cim.UnsignedInteger16("4");
	          	
                       /**
              * constant for value entry Revert to snapshot (corresponds to mapEntry 4 )
              */
             public final static String VALUE_ENTRY_Revert_to_snapshot 
                              = "Revert to snapshot";
                    
       		
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
                                                
	                                               if (VALUE_ENTRY_None.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Restart.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Restart;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Revert_to_snapshot.equals(value))
                         {
                            return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Revert_to_snapshot;
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
                                                                                     
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None.intValue())
                         {
                            return VALUE_ENTRY_None;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Restart.intValue())
                         {
                            return VALUE_ENTRY_Restart;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Revert_to_snapshot.intValue())
                         {
                            return VALUE_ENTRY_Revert_to_snapshot;
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
       * Value Map for the property AutomaticRecoveryAction   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Restart
                     	                            ,  VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Revert_to_snapshot
                     	                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property AutomaticRecoveryAction   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_None
                                                                 ,  VALUE_ENTRY_Restart
                                                                 ,  VALUE_ENTRY_Revert_to_snapshot
                                                                 ,  VALUE_ENTRY_DMTF_Reserved
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property AutomaticRecoveryAction   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_None
                                                                 ,  VALUE_ENTRY_Restart
                                                                 ,  VALUE_ENTRY_Revert_to_snapshot
                                                                 };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property AutomaticShutdownAction
     * Action to take for the virtual system when the host is shut down.
     */
    public static class PROPERTY_AUTOMATICSHUTDOWNACTION
    {
       /**
        * name of the property AutomaticShutdownAction
        */
       public final static String NAME = "AutomaticShutdownAction";                  

	    	
    

              
       		
          /**
           * constant for value map entry 2
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Turn_Off 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry Turn Off (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_Turn_Off 
                              = "Turn Off";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Save_state 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry Save state (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_Save_state 
                              = "Save state";
                    
       		
          /**
           * constant for value map entry 4
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutdown 
                              = new javax.cim.UnsignedInteger16("4");
	          	
                       /**
              * constant for value entry Shutdown (corresponds to mapEntry 4 )
              */
             public final static String VALUE_ENTRY_Shutdown 
                              = "Shutdown";
                    
       		
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
                                                
	                                               if (VALUE_ENTRY_Turn_Off.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Turn_Off;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Save_state.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Save_state;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Shutdown.equals(value))
                         {
                            return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutdown;
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
                                                                                     
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Turn_Off.intValue())
                         {
                            return VALUE_ENTRY_Turn_Off;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Save_state.intValue())
                         {
                            return VALUE_ENTRY_Save_state;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutdown.intValue())
                         {
                            return VALUE_ENTRY_Shutdown;
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
       * Value Map for the property AutomaticShutdownAction   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Turn_Off
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Save_state
                     	                            ,  VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutdown
                     	                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property AutomaticShutdownAction   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_Turn_Off
                                                                 ,  VALUE_ENTRY_Save_state
                                                                 ,  VALUE_ENTRY_Shutdown
                                                                 ,  VALUE_ENTRY_DMTF_Reserved
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property AutomaticShutdownAction   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_Turn_Off
                                                                 ,  VALUE_ENTRY_Save_state
                                                                 ,  VALUE_ENTRY_Shutdown
                                                                 };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property AutomaticStartupAction
     * Action to take for the virtual system when the host is started.
     */
    public static class PROPERTY_AUTOMATICSTARTUPACTION
    {
       /**
        * name of the property AutomaticStartupAction
        */
       public final static String NAME = "AutomaticStartupAction";                  

	    	
    

              
       		
          /**
           * constant for value map entry 2
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry None (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_None 
                              = "None";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Restart_if_previously_active 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry Restart if previously active (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_Restart_if_previously_active 
                              = "Restart if previously active";
                    
       		
          /**
           * constant for value map entry 4
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Always_startup 
                              = new javax.cim.UnsignedInteger16("4");
	          	
                       /**
              * constant for value entry Always startup (corresponds to mapEntry 4 )
              */
             public final static String VALUE_ENTRY_Always_startup 
                              = "Always startup";
                    
       		
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
                                                
	                                               if (VALUE_ENTRY_None.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Restart_if_previously_active.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Restart_if_previously_active;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Always_startup.equals(value))
                         {
                            return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Always_startup;
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
                                                                                     
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None.intValue())
                         {
                            return VALUE_ENTRY_None;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Restart_if_previously_active.intValue())
                         {
                            return VALUE_ENTRY_Restart_if_previously_active;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Always_startup.intValue())
                         {
                            return VALUE_ENTRY_Always_startup;
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
       * Value Map for the property AutomaticStartupAction   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Restart_if_previously_active
                     	                            ,  VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Always_startup
                     	                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property AutomaticStartupAction   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_None
                                                                 ,  VALUE_ENTRY_Restart_if_previously_active
                                                                 ,  VALUE_ENTRY_Always_startup
                                                                 ,  VALUE_ENTRY_DMTF_Reserved
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property AutomaticStartupAction   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_None
                                                                 ,  VALUE_ENTRY_Restart_if_previously_active
                                                                 ,  VALUE_ENTRY_Always_startup
                                                                 };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property AutomaticStartupActionDelay
     * Delay applicable to startup action. The value shall be in the interval variant of the datetime datatype.
     */
    public static class PROPERTY_AUTOMATICSTARTUPACTIONDELAY
    {
       /**
        * name of the property AutomaticStartupActionDelay
        */
       public final static String NAME = "AutomaticStartupActionDelay";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property AutomaticStartupActionSequenceNumber
     * Number indicating the relative sequence of virtual system activation when the host system is started. A lower number indicates earlier activation. If one or more configurations show the same value, the sequence is implementation dependent. A value of 0 indicates that the sequence is implementation dependent.
     */
    public static class PROPERTY_AUTOMATICSTARTUPACTIONSEQUENCENUMBER
    {
       /**
        * name of the property AutomaticStartupActionSequenceNumber
        */
       public final static String NAME = "AutomaticStartupActionSequenceNumber";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property ConfigurationDataRoot
     * Filepath of a directory where information about the virtual system configuration is stored.Format shall be URI based on RFC 2079.
     */
    public static class PROPERTY_CONFIGURATIONDATAROOT
    {
       /**
        * name of the property ConfigurationDataRoot
        */
       public final static String NAME = "ConfigurationDataRoot";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property ConfigurationFile
     * Filepath of a file where information about the virtual system configuration is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
     */
    public static class PROPERTY_CONFIGURATIONFILE
    {
       /**
        * name of the property ConfigurationFile
        */
       public final static String NAME = "ConfigurationFile";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property ConfigurationID
     * Unique id of the virtual system configuration. Note that the ConfigurationID is different from the InstanceID as it is assigned by the implementation to a virtual system or a virtual system configuration. It is not a key, and the same value may occur within more than one instance.
     */
    public static class PROPERTY_CONFIGURATIONID
    {
       /**
        * name of the property ConfigurationID
        */
       public final static String NAME = "ConfigurationID";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property CreationTime
     * Time when the virtual system configuration was created.
     */
    public static class PROPERTY_CREATIONTIME
    {
       /**
        * name of the property CreationTime
        */
       public final static String NAME = "CreationTime";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property LogDataRoot
     * Filepath of a directory where log information about the virtual system is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
     */
    public static class PROPERTY_LOGDATAROOT
    {
       /**
        * name of the property LogDataRoot
        */
       public final static String NAME = "LogDataRoot";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Notes
     * End-user supplied notes that are related to the virtual system.
     */
    public static class PROPERTY_NOTES
    {
       /**
        * name of the property Notes
        */
       public final static String NAME = "Notes";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property RecoveryFile
     * Filepath of a file where recovery relateded information of the virtual system is stored.Format shall be URI based on RFC 2079.
     */
    public static class PROPERTY_RECOVERYFILE
    {
       /**
        * name of the property RecoveryFile
        */
       public final static String NAME = "RecoveryFile";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property SnapshotDataRoot
     * Filepath of a directory where information about virtual system snapshots is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
     */
    public static class PROPERTY_SNAPSHOTDATAROOT
    {
       /**
        * name of the property SnapshotDataRoot
        */
       public final static String NAME = "SnapshotDataRoot";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property SuspendDataRoot
     * Filepath of a directory where suspend related information about the virtual system is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
     */
    public static class PROPERTY_SUSPENDDATAROOT
    {
       /**
        * name of the property SuspendDataRoot
        */
       public final static String NAME = "SuspendDataRoot";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property SwapFileDataRoot
     * Filepath of a directory where swapfiles of the virtual system are stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
     */
    public static class PROPERTY_SWAPFILEDATAROOT
    {
       /**
        * name of the property SwapFileDataRoot
        */
       public final static String NAME = "SwapFileDataRoot";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property VirtualSystemIdentifier
     * VirtualSystemIdentifier shall reflect a unique name for the system as it is used within the virtualization platform. Note that the VirtualSystemIdentifier is not the hostname assigned to the operating system instance running within the virtual system, nor is it an IP address or MAC address assigned to any of its network ports. 
     * On create requests VirtualSystemIdentifier may contain implementation specific rules (like simple patterns or regular expresssion) that may be interpreted by the implementation when assigning a VirtualSystemIdentifier.
     */
    public static class PROPERTY_VIRTUALSYSTEMIDENTIFIER
    {
       /**
        * name of the property VirtualSystemIdentifier
        */
       public final static String NAME = "VirtualSystemIdentifier";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property VirtualSystemType
     * VirtualSystemType shall reflect a particular type of virtual system. Implementations are commonly capable to support various implementation defined virtual system types. 
     * As stated in the class description, instances of this class may be used for various purposes. A management application intending to use an instance of this class as input parameter to an operation that creates or modifies a virtual system should first determine the set of valid virtual system types that are supported by the virtualization platform hosting the virtual system by inspecting values of array property VirtualSystemTypesSupported of the instance of class CIM_VirtualSystemManagementCapabilities that describes the capabilities of the virtualization platform.
     */
    public static class PROPERTY_VIRTUALSYSTEMTYPE
    {
       /**
        * name of the property VirtualSystemType
        */
       public final static String NAME = "VirtualSystemType";                  

	    	
    

    		    
	
	    
	    }
	    	    

   

    
    static {    
           addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
                         String[] parentClassPackageList = CIM_SettingData.getPackages();
        
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
    *   CIM_VirtualSystemSettingData defines the virtual aspects of a virtual system through a set of virtualization specific properties. CIM_VirtualSystemSettingData is also used as the top level class of virtual system configurations. Virtual system configurations model configuration information about virtual systems and their components. A virtual system configuration consists of one top-level instance of class CIM_VirtualSystemSettingData that aggregates a number of instances of class CIM_ResourceAllocationSettingData, using association CIM_ConcreteComponent. 
     * Virtual system configurations may for example be used to reflect configurations of 
     * - virtual systems that are defined at a virtualization platform, 
     * - virtual systems that are currently active, 
     * - input requests to create new virtual systems, 
     * - input requests to modify existing virtual systems, or 
     * - snapshots of virtual systems.
    *   @param client the CIM Client
    *   @param namespace the target namespace
    */  

      
   public CIM_VirtualSystemSettingData(WBEMClient client, String namespace) throws WbemsmtException
   {
       CIMClass cls = getClass(client,namespace);
       setFromServer(false);
       init(cls.newInstance(),true);
   }
        
   /**
    *   Class constructor
    * 
    *       *   <br>
    *   CIM_VirtualSystemSettingData defines the virtual aspects of a virtual system through a set of virtualization specific properties. CIM_VirtualSystemSettingData is also used as the top level class of virtual system configurations. Virtual system configurations model configuration information about virtual systems and their components. A virtual system configuration consists of one top-level instance of class CIM_VirtualSystemSettingData that aggregates a number of instances of class CIM_ResourceAllocationSettingData, using association CIM_ConcreteComponent. 
     * Virtual system configurations may for example be used to reflect configurations of 
     * - virtual systems that are defined at a virtualization platform, 
     * - virtual systems that are currently active, 
     * - input requests to create new virtual systems, 
     * - input requests to modify existing virtual systems, or 
     * - snapshots of virtual systems.
    *   @param cimInstance the instance that is used to create the Object
    */  
   
   public CIM_VirtualSystemSettingData(CIMInstance cimInstance)  throws WbemsmtException { 
        
       if (cimInstance == null) {
           throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimInstance parameter does not contain a valid reference.");
       }
       setFromServer(true);
       init(cimInstance,false);
   }
   
   /**
    * Default constructor
    */
   protected CIM_VirtualSystemSettingData()
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
              propertiesToCheck.put("AutomaticRecoveryAction",new CIMProperty("AutomaticRecoveryAction",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("AutomaticShutdownAction",new CIMProperty("AutomaticShutdownAction",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("AutomaticStartupAction",new CIMProperty("AutomaticStartupAction",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("AutomaticStartupActionDelay",new CIMProperty("AutomaticStartupActionDelay",CIMDataType.DATETIME_T,null));
              propertiesToCheck.put("AutomaticStartupActionSequenceNumber",new CIMProperty("AutomaticStartupActionSequenceNumber",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("ConfigurationDataRoot",new CIMProperty("ConfigurationDataRoot",CIMDataType.STRING_T,null));
              propertiesToCheck.put("ConfigurationFile",new CIMProperty("ConfigurationFile",CIMDataType.STRING_T,null));
              propertiesToCheck.put("ConfigurationID",new CIMProperty("ConfigurationID",CIMDataType.STRING_T,null));
              propertiesToCheck.put("CreationTime",new CIMProperty("CreationTime",CIMDataType.DATETIME_T,null));
              propertiesToCheck.put("LogDataRoot",new CIMProperty("LogDataRoot",CIMDataType.STRING_T,null));
              propertiesToCheck.put("Notes",new CIMProperty("Notes",CIMDataType.STRING_ARRAY_T,null));
              propertiesToCheck.put("RecoveryFile",new CIMProperty("RecoveryFile",CIMDataType.STRING_T,null));
              propertiesToCheck.put("SnapshotDataRoot",new CIMProperty("SnapshotDataRoot",CIMDataType.STRING_T,null));
              propertiesToCheck.put("SuspendDataRoot",new CIMProperty("SuspendDataRoot",CIMDataType.STRING_T,null));
              propertiesToCheck.put("SwapFileDataRoot",new CIMProperty("SwapFileDataRoot",CIMDataType.STRING_T,null));
              propertiesToCheck.put("VirtualSystemIdentifier",new CIMProperty("VirtualSystemIdentifier",CIMDataType.STRING_T,null));
              propertiesToCheck.put("VirtualSystemType",new CIMProperty("VirtualSystemType",CIMDataType.STRING_T,null));
       	
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
    * Get the property AutomaticRecoveryAction
    *     * <br>
    * Action to take for the virtual system when the software executed by the virtual system fails. Failures in this case means a failure that is detectable by the host platform, such as a non-interuptable wait state condition.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_AutomaticRecoveryAction()    {
       CIMProperty currentProperty = getProperty(PROPERTY_AUTOMATICRECOVERYACTION.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_AUTOMATICRECOVERYACTION.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property AutomaticRecoveryAction
    * <br>
    * Action to take for the virtual system when the software executed by the virtual system fails. Failures in this case means a failure that is detectable by the host platform, such as a non-interuptable wait state condition.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_AutomaticRecoveryAction(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_AUTOMATICRECOVERYACTION.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_AutomaticRecoveryAction(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_AUTOMATICRECOVERYACTION.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property AutomaticRecoveryAction by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AutomaticRecoveryAction(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AUTOMATICRECOVERYACTION.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_AutomaticRecoveryAction(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_AUTOMATICRECOVERYACTION.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property AutomaticRecoveryAction
    * <br>
    * Action to take for the virtual system when the software executed by the virtual system fails. Failures in this case means a failure that is detectable by the host platform, such as a non-interuptable wait state condition.
    */
    
   private static CIMProperty setPropertyValue_AutomaticRecoveryAction(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property AutomaticShutdownAction
    *     * <br>
    * Action to take for the virtual system when the host is shut down.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_AutomaticShutdownAction()    {
       CIMProperty currentProperty = getProperty(PROPERTY_AUTOMATICSHUTDOWNACTION.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_AUTOMATICSHUTDOWNACTION.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property AutomaticShutdownAction
    * <br>
    * Action to take for the virtual system when the host is shut down.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_AutomaticShutdownAction(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_AUTOMATICSHUTDOWNACTION.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_AutomaticShutdownAction(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_AUTOMATICSHUTDOWNACTION.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property AutomaticShutdownAction by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AutomaticShutdownAction(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AUTOMATICSHUTDOWNACTION.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_AutomaticShutdownAction(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_AUTOMATICSHUTDOWNACTION.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property AutomaticShutdownAction
    * <br>
    * Action to take for the virtual system when the host is shut down.
    */
    
   private static CIMProperty setPropertyValue_AutomaticShutdownAction(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property AutomaticStartupAction
    *     * <br>
    * Action to take for the virtual system when the host is started.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_AutomaticStartupAction()    {
       CIMProperty currentProperty = getProperty(PROPERTY_AUTOMATICSTARTUPACTION.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_AUTOMATICSTARTUPACTION.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property AutomaticStartupAction
    * <br>
    * Action to take for the virtual system when the host is started.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_AutomaticStartupAction(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_AUTOMATICSTARTUPACTION.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_AutomaticStartupAction(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_AUTOMATICSTARTUPACTION.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property AutomaticStartupAction by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AutomaticStartupAction(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AUTOMATICSTARTUPACTION.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_AutomaticStartupAction(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_AUTOMATICSTARTUPACTION.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property AutomaticStartupAction
    * <br>
    * Action to take for the virtual system when the host is started.
    */
    
   private static CIMProperty setPropertyValue_AutomaticStartupAction(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property AutomaticStartupActionDelay
    *     * <br>
    * Delay applicable to startup action. The value shall be in the interval variant of the datetime datatype.
    *     */

      

               
   public javax.cim.CIMDateTime get_AutomaticStartupActionDelay()    {
       CIMProperty currentProperty = getProperty(PROPERTY_AUTOMATICSTARTUPACTIONDELAY.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_AUTOMATICSTARTUPACTIONDELAY.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.CIMDateTime)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property AutomaticStartupActionDelay
    * <br>
    * Delay applicable to startup action. The value shall be in the interval variant of the datetime datatype.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_AutomaticStartupActionDelay(javax.cim.CIMDateTime newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_AUTOMATICSTARTUPACTIONDELAY.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_AutomaticStartupActionDelay(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_AUTOMATICSTARTUPACTIONDELAY.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property AutomaticStartupActionDelay by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AutomaticStartupActionDelay(WBEMClient client, String namespace, javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AUTOMATICSTARTUPACTIONDELAY.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_AutomaticStartupActionDelay(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_AUTOMATICSTARTUPACTIONDELAY.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property AutomaticStartupActionDelay
    * <br>
    * Delay applicable to startup action. The value shall be in the interval variant of the datetime datatype.
    */
    
   private static CIMProperty setPropertyValue_AutomaticStartupActionDelay(CIMProperty currentProperty, javax.cim.CIMDateTime newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property AutomaticStartupActionSequenceNumber
    *     * <br>
    * Number indicating the relative sequence of virtual system activation when the host system is started. A lower number indicates earlier activation. If one or more configurations show the same value, the sequence is implementation dependent. A value of 0 indicates that the sequence is implementation dependent.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_AutomaticStartupActionSequenceNumber()    {
       CIMProperty currentProperty = getProperty(PROPERTY_AUTOMATICSTARTUPACTIONSEQUENCENUMBER.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_AUTOMATICSTARTUPACTIONSEQUENCENUMBER.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property AutomaticStartupActionSequenceNumber
    * <br>
    * Number indicating the relative sequence of virtual system activation when the host system is started. A lower number indicates earlier activation. If one or more configurations show the same value, the sequence is implementation dependent. A value of 0 indicates that the sequence is implementation dependent.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_AutomaticStartupActionSequenceNumber(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_AUTOMATICSTARTUPACTIONSEQUENCENUMBER.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_AutomaticStartupActionSequenceNumber(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_AUTOMATICSTARTUPACTIONSEQUENCENUMBER.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property AutomaticStartupActionSequenceNumber by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AutomaticStartupActionSequenceNumber(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AUTOMATICSTARTUPACTIONSEQUENCENUMBER.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_AutomaticStartupActionSequenceNumber(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_AUTOMATICSTARTUPACTIONSEQUENCENUMBER.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property AutomaticStartupActionSequenceNumber
    * <br>
    * Number indicating the relative sequence of virtual system activation when the host system is started. A lower number indicates earlier activation. If one or more configurations show the same value, the sequence is implementation dependent. A value of 0 indicates that the sequence is implementation dependent.
    */
    
   private static CIMProperty setPropertyValue_AutomaticStartupActionSequenceNumber(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property ConfigurationDataRoot
    *     * <br>
    * Filepath of a directory where information about the virtual system configuration is stored.Format shall be URI based on RFC 2079.
    *     */

      

               
   public String get_ConfigurationDataRoot()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CONFIGURATIONDATAROOT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CONFIGURATIONDATAROOT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property ConfigurationDataRoot
    * <br>
    * Filepath of a directory where information about the virtual system configuration is stored.Format shall be URI based on RFC 2079.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_ConfigurationDataRoot(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CONFIGURATIONDATAROOT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_ConfigurationDataRoot(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CONFIGURATIONDATAROOT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property ConfigurationDataRoot by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConfigurationDataRoot(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONFIGURATIONDATAROOT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_ConfigurationDataRoot(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CONFIGURATIONDATAROOT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property ConfigurationDataRoot
    * <br>
    * Filepath of a directory where information about the virtual system configuration is stored.Format shall be URI based on RFC 2079.
    */
    
   private static CIMProperty setPropertyValue_ConfigurationDataRoot(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property ConfigurationFile
    *     * <br>
    * Filepath of a file where information about the virtual system configuration is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
    *     */

      

               
   public String get_ConfigurationFile()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CONFIGURATIONFILE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CONFIGURATIONFILE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property ConfigurationFile
    * <br>
    * Filepath of a file where information about the virtual system configuration is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_ConfigurationFile(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CONFIGURATIONFILE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_ConfigurationFile(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CONFIGURATIONFILE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property ConfigurationFile by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConfigurationFile(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONFIGURATIONFILE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_ConfigurationFile(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CONFIGURATIONFILE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property ConfigurationFile
    * <br>
    * Filepath of a file where information about the virtual system configuration is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
    */
    
   private static CIMProperty setPropertyValue_ConfigurationFile(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property ConfigurationID
    *     * <br>
    * Unique id of the virtual system configuration. Note that the ConfigurationID is different from the InstanceID as it is assigned by the implementation to a virtual system or a virtual system configuration. It is not a key, and the same value may occur within more than one instance.
    *     */

      

               
   public String get_ConfigurationID()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CONFIGURATIONID.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CONFIGURATIONID.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property ConfigurationID
    * <br>
    * Unique id of the virtual system configuration. Note that the ConfigurationID is different from the InstanceID as it is assigned by the implementation to a virtual system or a virtual system configuration. It is not a key, and the same value may occur within more than one instance.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_ConfigurationID(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CONFIGURATIONID.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_ConfigurationID(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CONFIGURATIONID.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property ConfigurationID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConfigurationID(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONFIGURATIONID.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_ConfigurationID(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CONFIGURATIONID.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property ConfigurationID
    * <br>
    * Unique id of the virtual system configuration. Note that the ConfigurationID is different from the InstanceID as it is assigned by the implementation to a virtual system or a virtual system configuration. It is not a key, and the same value may occur within more than one instance.
    */
    
   private static CIMProperty setPropertyValue_ConfigurationID(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property CreationTime
    *     * <br>
    * Time when the virtual system configuration was created.
    *     */

      

               
   public javax.cim.CIMDateTime get_CreationTime()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CREATIONTIME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CREATIONTIME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.CIMDateTime)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property CreationTime
    * <br>
    * Time when the virtual system configuration was created.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_CreationTime(javax.cim.CIMDateTime newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CREATIONTIME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_CreationTime(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CREATIONTIME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property CreationTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CreationTime(WBEMClient client, String namespace, javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CREATIONTIME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_CreationTime(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CREATIONTIME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property CreationTime
    * <br>
    * Time when the virtual system configuration was created.
    */
    
   private static CIMProperty setPropertyValue_CreationTime(CIMProperty currentProperty, javax.cim.CIMDateTime newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property LogDataRoot
    *     * <br>
    * Filepath of a directory where log information about the virtual system is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
    *     */

      

               
   public String get_LogDataRoot()    {
       CIMProperty currentProperty = getProperty(PROPERTY_LOGDATAROOT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_LOGDATAROOT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property LogDataRoot
    * <br>
    * Filepath of a directory where log information about the virtual system is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_LogDataRoot(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_LOGDATAROOT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_LogDataRoot(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_LOGDATAROOT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property LogDataRoot by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LogDataRoot(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOGDATAROOT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_LogDataRoot(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_LOGDATAROOT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property LogDataRoot
    * <br>
    * Filepath of a directory where log information about the virtual system is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
    */
    
   private static CIMProperty setPropertyValue_LogDataRoot(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Notes
    *     * <br>
    * End-user supplied notes that are related to the virtual system.
    *     */

      

               
   public String[] get_Notes()    {
       CIMProperty currentProperty = getProperty(PROPERTY_NOTES.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_NOTES.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String[])currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Notes
    * <br>
    * End-user supplied notes that are related to the virtual system.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Notes(String[] newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_NOTES.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Notes(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_NOTES.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Notes by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Notes(WBEMClient client, String namespace, String[] newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NOTES.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Notes(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_NOTES.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Notes
    * <br>
    * End-user supplied notes that are related to the virtual system.
    */
    
   private static CIMProperty setPropertyValue_Notes(CIMProperty currentProperty, String[] newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property RecoveryFile
    *     * <br>
    * Filepath of a file where recovery relateded information of the virtual system is stored.Format shall be URI based on RFC 2079.
    *     */

      

               
   public String get_RecoveryFile()    {
       CIMProperty currentProperty = getProperty(PROPERTY_RECOVERYFILE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_RECOVERYFILE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property RecoveryFile
    * <br>
    * Filepath of a file where recovery relateded information of the virtual system is stored.Format shall be URI based on RFC 2079.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_RecoveryFile(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_RECOVERYFILE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_RecoveryFile(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_RECOVERYFILE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property RecoveryFile by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RecoveryFile(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECOVERYFILE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_RecoveryFile(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_RECOVERYFILE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property RecoveryFile
    * <br>
    * Filepath of a file where recovery relateded information of the virtual system is stored.Format shall be URI based on RFC 2079.
    */
    
   private static CIMProperty setPropertyValue_RecoveryFile(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property SnapshotDataRoot
    *     * <br>
    * Filepath of a directory where information about virtual system snapshots is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
    *     */

      

               
   public String get_SnapshotDataRoot()    {
       CIMProperty currentProperty = getProperty(PROPERTY_SNAPSHOTDATAROOT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_SNAPSHOTDATAROOT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property SnapshotDataRoot
    * <br>
    * Filepath of a directory where information about virtual system snapshots is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_SnapshotDataRoot(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_SNAPSHOTDATAROOT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_SnapshotDataRoot(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_SNAPSHOTDATAROOT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property SnapshotDataRoot by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SnapshotDataRoot(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SNAPSHOTDATAROOT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_SnapshotDataRoot(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_SNAPSHOTDATAROOT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property SnapshotDataRoot
    * <br>
    * Filepath of a directory where information about virtual system snapshots is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
    */
    
   private static CIMProperty setPropertyValue_SnapshotDataRoot(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property SuspendDataRoot
    *     * <br>
    * Filepath of a directory where suspend related information about the virtual system is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
    *     */

      

               
   public String get_SuspendDataRoot()    {
       CIMProperty currentProperty = getProperty(PROPERTY_SUSPENDDATAROOT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_SUSPENDDATAROOT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property SuspendDataRoot
    * <br>
    * Filepath of a directory where suspend related information about the virtual system is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_SuspendDataRoot(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_SUSPENDDATAROOT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_SuspendDataRoot(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_SUSPENDDATAROOT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property SuspendDataRoot by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SuspendDataRoot(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SUSPENDDATAROOT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_SuspendDataRoot(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_SUSPENDDATAROOT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property SuspendDataRoot
    * <br>
    * Filepath of a directory where suspend related information about the virtual system is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
    */
    
   private static CIMProperty setPropertyValue_SuspendDataRoot(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property SwapFileDataRoot
    *     * <br>
    * Filepath of a directory where swapfiles of the virtual system are stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
    *     */

      

               
   public String get_SwapFileDataRoot()    {
       CIMProperty currentProperty = getProperty(PROPERTY_SWAPFILEDATAROOT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_SWAPFILEDATAROOT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property SwapFileDataRoot
    * <br>
    * Filepath of a directory where swapfiles of the virtual system are stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_SwapFileDataRoot(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_SWAPFILEDATAROOT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_SwapFileDataRoot(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_SWAPFILEDATAROOT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property SwapFileDataRoot by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SwapFileDataRoot(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SWAPFILEDATAROOT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_SwapFileDataRoot(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_SWAPFILEDATAROOT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property SwapFileDataRoot
    * <br>
    * Filepath of a directory where swapfiles of the virtual system are stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
    */
    
   private static CIMProperty setPropertyValue_SwapFileDataRoot(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property VirtualSystemIdentifier
    *     * <br>
    * VirtualSystemIdentifier shall reflect a unique name for the system as it is used within the virtualization platform. Note that the VirtualSystemIdentifier is not the hostname assigned to the operating system instance running within the virtual system, nor is it an IP address or MAC address assigned to any of its network ports. 
     * On create requests VirtualSystemIdentifier may contain implementation specific rules (like simple patterns or regular expresssion) that may be interpreted by the implementation when assigning a VirtualSystemIdentifier.
    *     */

      

               
   public String get_VirtualSystemIdentifier()    {
       CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALSYSTEMIDENTIFIER.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_VIRTUALSYSTEMIDENTIFIER.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property VirtualSystemIdentifier
    * <br>
    * VirtualSystemIdentifier shall reflect a unique name for the system as it is used within the virtualization platform. Note that the VirtualSystemIdentifier is not the hostname assigned to the operating system instance running within the virtual system, nor is it an IP address or MAC address assigned to any of its network ports. 
     * On create requests VirtualSystemIdentifier may contain implementation specific rules (like simple patterns or regular expresssion) that may be interpreted by the implementation when assigning a VirtualSystemIdentifier.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_VirtualSystemIdentifier(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALSYSTEMIDENTIFIER.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_VirtualSystemIdentifier(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_VIRTUALSYSTEMIDENTIFIER.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property VirtualSystemIdentifier by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_VirtualSystemIdentifier(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VIRTUALSYSTEMIDENTIFIER.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_VirtualSystemIdentifier(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_VIRTUALSYSTEMIDENTIFIER.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property VirtualSystemIdentifier
    * <br>
    * VirtualSystemIdentifier shall reflect a unique name for the system as it is used within the virtualization platform. Note that the VirtualSystemIdentifier is not the hostname assigned to the operating system instance running within the virtual system, nor is it an IP address or MAC address assigned to any of its network ports. 
     * On create requests VirtualSystemIdentifier may contain implementation specific rules (like simple patterns or regular expresssion) that may be interpreted by the implementation when assigning a VirtualSystemIdentifier.
    */
    
   private static CIMProperty setPropertyValue_VirtualSystemIdentifier(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property VirtualSystemType
    *     * <br>
    * VirtualSystemType shall reflect a particular type of virtual system. Implementations are commonly capable to support various implementation defined virtual system types. 
     * As stated in the class description, instances of this class may be used for various purposes. A management application intending to use an instance of this class as input parameter to an operation that creates or modifies a virtual system should first determine the set of valid virtual system types that are supported by the virtualization platform hosting the virtual system by inspecting values of array property VirtualSystemTypesSupported of the instance of class CIM_VirtualSystemManagementCapabilities that describes the capabilities of the virtualization platform.
    *     */

      

               
   public String get_VirtualSystemType()    {
       CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALSYSTEMTYPE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_VIRTUALSYSTEMTYPE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property VirtualSystemType
    * <br>
    * VirtualSystemType shall reflect a particular type of virtual system. Implementations are commonly capable to support various implementation defined virtual system types. 
     * As stated in the class description, instances of this class may be used for various purposes. A management application intending to use an instance of this class as input parameter to an operation that creates or modifies a virtual system should first determine the set of valid virtual system types that are supported by the virtualization platform hosting the virtual system by inspecting values of array property VirtualSystemTypesSupported of the instance of class CIM_VirtualSystemManagementCapabilities that describes the capabilities of the virtualization platform.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_VirtualSystemType(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALSYSTEMTYPE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_VirtualSystemType(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_VIRTUALSYSTEMTYPE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property VirtualSystemType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_VirtualSystemType(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_VirtualSystemSettingData fco = new CIM_VirtualSystemSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VIRTUALSYSTEMTYPE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_VirtualSystemType(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_VIRTUALSYSTEMTYPE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property VirtualSystemType
    * <br>
    * VirtualSystemType shall reflect a particular type of virtual system. Implementations are commonly capable to support various implementation defined virtual system types. 
     * As stated in the class description, instances of this class may be used for various purposes. A management application intending to use an instance of this class as input parameter to an operation that creates or modifies a virtual system should first determine the set of valid virtual system types that are supported by the virtualization platform hosting the virtual system by inspecting values of array property VirtualSystemTypesSupported of the instance of class CIM_VirtualSystemManagementCapabilities that describes the capabilities of the virtualization platform.
    */
    
   private static CIMProperty setPropertyValue_VirtualSystemType(CIMProperty currentProperty, String newValue)
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
     * Get the list with CIM_ResourceAllocationSettingData objects associated by the association CIM_VirtualSystemSettingDataComponent
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ResourceAllocationSettingData> getAssociated_CIM_ResourceAllocationSettingData_CIM_VirtualSystemSettingDataComponents(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_ResourceAllocationSettingData_CIM_VirtualSystemSettingDataComponents(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT,
     	                CIM_ResourceAllocationSettingData.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ResourceAllocationSettingData objects associated by the association CIM_VirtualSystemSettingDataComponent
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ResourceAllocationSettingData> getAssociated_CIM_ResourceAllocationSettingData_CIM_VirtualSystemSettingDataComponents(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_ResourceAllocationSettingData_CIM_VirtualSystemSettingDataComponents(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ResourceAllocationSettingData objects associated by the association CIM_VirtualSystemSettingDataComponent
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ResourceAllocationSettingData> getAssociated_CIM_ResourceAllocationSettingData_CIM_VirtualSystemSettingDataComponents(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_ResourceAllocationSettingData> result = new java.util.ArrayList<CIM_ResourceAllocationSettingData>();
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
                 CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_VirtualSystemSettingDataHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_VirtualSystemSettingDataHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_ResourceAllocationSettingData(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_ResourceAllocationSettingData(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_ResourceAllocationSettingData)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_ResourceAllocationSettingData(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
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
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_VirtualSystemSettingDataComponent
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ResourceAllocationSettingData_CIM_VirtualSystemSettingDataComponentNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_ResourceAllocationSettingData_CIM_VirtualSystemSettingDataComponentNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT,
    	                             CIM_ResourceAllocationSettingData.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_VirtualSystemSettingDataComponent
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ResourceAllocationSettingData_CIM_VirtualSystemSettingDataComponentNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_ResourceAllocationSettingData_CIM_VirtualSystemSettingDataComponentNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_VirtualSystemSettingDataComponent
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ResourceAllocationSettingData_CIM_VirtualSystemSettingDataComponentNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT, 
                CIM_ResourceAllocationSettingData.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_VirtualSystemSettingDataHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ResourceAllocationSettingData.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
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
    * Get the list with CIM_VirtualSystemSettingDataComponent associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<CIM_VirtualSystemSettingDataComponent> getAssociations_CIM_VirtualSystemSettingDataComponent(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<CIM_VirtualSystemSettingDataComponent> result = new java.util.ArrayList<CIM_VirtualSystemSettingDataComponent>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_VirtualSystemSettingDataHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = CIM_VirtualSystemSettingDataComponentHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new CIM_VirtualSystemSettingDataComponent(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new CIM_VirtualSystemSettingDataComponent(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((CIM_VirtualSystemSettingDataComponent)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new CIM_VirtualSystemSettingDataComponent(cimInstance));
                   continue;
                }
              }
           }
           CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
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
    * Get a list of CIMObjectPath items of the associations CIM_VirtualSystemSettingDataComponent
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_CIM_VirtualSystemSettingDataComponent(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_VirtualSystemSettingDataHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_VirtualSystemSettingDataComponent.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
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
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_LastAppliedSnapshot
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ComputerSystem> getAssociated_CIM_ComputerSystem_CIM_LastAppliedSnapshots(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_ComputerSystem_CIM_LastAppliedSnapshots(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT,
     	                CIM_ComputerSystem.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_LastAppliedSnapshot
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ComputerSystem> getAssociated_CIM_ComputerSystem_CIM_LastAppliedSnapshots(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_ComputerSystem_CIM_LastAppliedSnapshots(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_LastAppliedSnapshot
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ComputerSystem> getAssociated_CIM_ComputerSystem_CIM_LastAppliedSnapshots(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_ComputerSystem> result = new java.util.ArrayList<CIM_ComputerSystem>();
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
                 CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_VirtualSystemSettingDataHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_VirtualSystemSettingDataHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_ComputerSystem(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_ComputerSystem(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_ComputerSystem)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_ComputerSystem(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
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
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_LastAppliedSnapshot
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ComputerSystem_CIM_LastAppliedSnapshotNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_ComputerSystem_CIM_LastAppliedSnapshotNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT,
    	                             CIM_ComputerSystem.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_LastAppliedSnapshot
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ComputerSystem_CIM_LastAppliedSnapshotNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_ComputerSystem_CIM_LastAppliedSnapshotNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_LastAppliedSnapshot
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ComputerSystem_CIM_LastAppliedSnapshotNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT, 
                CIM_ComputerSystem.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_VirtualSystemSettingDataHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ComputerSystem.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
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
    * Get the list with CIM_LastAppliedSnapshot associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<CIM_LastAppliedSnapshot> getAssociations_CIM_LastAppliedSnapshot(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<CIM_LastAppliedSnapshot> result = new java.util.ArrayList<CIM_LastAppliedSnapshot>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_VirtualSystemSettingDataHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = CIM_LastAppliedSnapshotHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new CIM_LastAppliedSnapshot(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new CIM_LastAppliedSnapshot(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((CIM_LastAppliedSnapshot)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new CIM_LastAppliedSnapshot(cimInstance));
                   continue;
                }
              }
           }
           CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
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
    * Get a list of CIMObjectPath items of the associations CIM_LastAppliedSnapshot
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_CIM_LastAppliedSnapshot(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_LASTAPPLIEDSNAPSHOT, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_VirtualSystemSettingDataHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_LastAppliedSnapshot.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
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
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_MostCurrentSnapshotInBranch
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ComputerSystem> getAssociated_CIM_ComputerSystem_CIM_MostCurrentSnapshotInBranchs(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_ComputerSystem_CIM_MostCurrentSnapshotInBranchs(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH,
     	                CIM_ComputerSystem.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_MostCurrentSnapshotInBranch
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ComputerSystem> getAssociated_CIM_ComputerSystem_CIM_MostCurrentSnapshotInBranchs(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_ComputerSystem_CIM_MostCurrentSnapshotInBranchs(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_MostCurrentSnapshotInBranch
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ComputerSystem> getAssociated_CIM_ComputerSystem_CIM_MostCurrentSnapshotInBranchs(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_ComputerSystem> result = new java.util.ArrayList<CIM_ComputerSystem>();
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
                 CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_VirtualSystemSettingDataHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_VirtualSystemSettingDataHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_ComputerSystem(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_ComputerSystem(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_ComputerSystem)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_ComputerSystem(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
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
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_MostCurrentSnapshotInBranch
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ComputerSystem_CIM_MostCurrentSnapshotInBranchNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_ComputerSystem_CIM_MostCurrentSnapshotInBranchNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH,
    	                             CIM_ComputerSystem.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_MostCurrentSnapshotInBranch
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ComputerSystem_CIM_MostCurrentSnapshotInBranchNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_ComputerSystem_CIM_MostCurrentSnapshotInBranchNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_MostCurrentSnapshotInBranch
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ComputerSystem_CIM_MostCurrentSnapshotInBranchNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH, 
                CIM_ComputerSystem.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_VirtualSystemSettingDataHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ComputerSystem.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
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
    * Get the list with CIM_MostCurrentSnapshotInBranch associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<CIM_MostCurrentSnapshotInBranch> getAssociations_CIM_MostCurrentSnapshotInBranch(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<CIM_MostCurrentSnapshotInBranch> result = new java.util.ArrayList<CIM_MostCurrentSnapshotInBranch>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_VirtualSystemSettingDataHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = CIM_MostCurrentSnapshotInBranchHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new CIM_MostCurrentSnapshotInBranch(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new CIM_MostCurrentSnapshotInBranch(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((CIM_MostCurrentSnapshotInBranch)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new CIM_MostCurrentSnapshotInBranch(cimInstance));
                   continue;
                }
              }
           }
           CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
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
    * Get a list of CIMObjectPath items of the associations CIM_MostCurrentSnapshotInBranch
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_CIM_MostCurrentSnapshotInBranch(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MOSTCURRENTSNAPSHOTINBRANCH, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_VirtualSystemSettingDataHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_MostCurrentSnapshotInBranch.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
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
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_SnapshotOfVirtualSystem
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ComputerSystem> getAssociated_CIM_ComputerSystem_CIM_SnapshotOfVirtualSystems(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_ComputerSystem_CIM_SnapshotOfVirtualSystems(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM,
     	                CIM_ComputerSystem.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_SnapshotOfVirtualSystem
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ComputerSystem> getAssociated_CIM_ComputerSystem_CIM_SnapshotOfVirtualSystems(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_ComputerSystem_CIM_SnapshotOfVirtualSystems(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_SnapshotOfVirtualSystem
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ComputerSystem> getAssociated_CIM_ComputerSystem_CIM_SnapshotOfVirtualSystems(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_ComputerSystem> result = new java.util.ArrayList<CIM_ComputerSystem>();
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
                 CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_VirtualSystemSettingDataHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_VirtualSystemSettingDataHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_ComputerSystem(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_ComputerSystem(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_ComputerSystem)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_ComputerSystem(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
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
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_SnapshotOfVirtualSystem
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ComputerSystem_CIM_SnapshotOfVirtualSystemNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_ComputerSystem_CIM_SnapshotOfVirtualSystemNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM,
    	                             CIM_ComputerSystem.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_SnapshotOfVirtualSystem
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ComputerSystem_CIM_SnapshotOfVirtualSystemNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_ComputerSystem_CIM_SnapshotOfVirtualSystemNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_SnapshotOfVirtualSystem
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ComputerSystem_CIM_SnapshotOfVirtualSystemNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM, 
                CIM_ComputerSystem.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_VirtualSystemSettingDataHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ComputerSystem.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
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
    * Get the list with CIM_SnapshotOfVirtualSystem associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<CIM_SnapshotOfVirtualSystem> getAssociations_CIM_SnapshotOfVirtualSystem(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<CIM_SnapshotOfVirtualSystem> result = new java.util.ArrayList<CIM_SnapshotOfVirtualSystem>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_VirtualSystemSettingDataHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = CIM_SnapshotOfVirtualSystemHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new CIM_SnapshotOfVirtualSystem(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new CIM_SnapshotOfVirtualSystem(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((CIM_SnapshotOfVirtualSystem)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new CIM_SnapshotOfVirtualSystem(cimInstance));
                   continue;
                }
              }
           }
           CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
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
    * Get a list of CIMObjectPath items of the associations CIM_SnapshotOfVirtualSystem
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_CIM_SnapshotOfVirtualSystem(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFVIRTUALSYSTEM, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_VirtualSystemSettingDataHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_SnapshotOfVirtualSystem.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_VirtualSystemSettingDataHelper.checkException(enumeration);
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
    	    return CIM_VirtualSystemSettingData.CIM_CLASS_NAME;
    }



}