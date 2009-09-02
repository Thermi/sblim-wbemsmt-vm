/** 
  * CIM_ResourceAllocationSettingData.java
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
  * Description: The ResourceAllocationSettingData class represents settings specifically related to an allocated resource that are outside the scope of the CIM class typically used to represent the resource itself. These settings include information specific to the allocation that may not be visible to the consumer of the resource itself. For example, a virtual processor may look like a 2 ghz processor to the consumer (virtual computer system), however the virtualization system may use time-slicing to schedule the the virtual processor to only allow it to use 1 ghz.
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
public class CIM_ResourceAllocationSettingData extends  CIM_SettingData {



   public final static String CIM_CLASS_NAME = "CIM_ResourceAllocationSettingData";
   public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    
    /**
     * The CIM_VirtualSystemSettingDataComponent association establishes a 'part of' relationship between an instance of the CIM_VirtualSystemSettingData class and a set of instances of the CIM_ResourceAllocationSettingData class.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT = "CIM_VirtualSystemSettingDataComponent";
    
    /**
     * ResourceAllocationFromPool associates an instance of CIM_ResourceAllocationSettingData representing a resource allocation with the CIM_ResourcePool from which it is allocated.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL = "CIM_ResourceAllocationFromPool";
    
    
    
	    /**
	     * Constants of property Address
     * The address of the resource.For example, the MAC address of a Ethernet port.
     */
    public static class PROPERTY_ADDRESS
    {
       /**
        * name of the property Address
        */
       public final static String NAME = "Address";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property AllocationUnits
     * This property specifies the units of allocation used by the Reservation and Limit properties. For example, when ResourceType=Processor, AllocationUnits may be set to hertz*10^6 or percent. When ResourceType=Memory, AllocationUnits may be set to bytes*10^3. The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Appendix C.1 of DSP0004 V2.4 or later.
     */
    public static class PROPERTY_ALLOCATIONUNITS
    {
       /**
        * name of the property AllocationUnits
        */
       public final static String NAME = "AllocationUnits";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property AutomaticAllocation
     * This property specifies if the resource will be automatically allocated. For example when set to true, when the consuming virtual computer system is powered on, this resource would be allocated. A value of false indicates the resource must be explicitly allocated. For example, the setting may represent removable media (cdrom, floppy, etc.) where at power on time, the media isnot present. An explicit operation is required to allocate the resource.
     */
    public static class PROPERTY_AUTOMATICALLOCATION
    {
       /**
        * name of the property AutomaticAllocation
        */
       public final static String NAME = "AutomaticAllocation";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property AutomaticDeallocation
     * This property specifies if the resource will be automatically de-allocated. For example, when set to true, when the consuming virtual computer system is powered off, this resource would be de-allocated. When set to false, the resource will remain allocated and must be explicitly de-allocated.
     */
    public static class PROPERTY_AUTOMATICDEALLOCATION
    {
       /**
        * name of the property AutomaticDeallocation
        */
       public final static String NAME = "AutomaticDeallocation";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Connection
     * The thing to which this resource is connected. For example, a named network or switch port.
     */
    public static class PROPERTY_CONNECTION
    {
       /**
        * name of the property Connection
        */
       public final static String NAME = "Connection";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property ConsumerVisibility
     * Describes the consumers visibility to the allocated resource.
     * A value of "Passed-Through" indicates the underlying or host resource is utilized and passed through to the consumer, possibly using partitioning. At least one item shall be present in the HostResource property. 
     * A value of "Virtualized" indicates the resource is virtualized and may not map directly to an underlying/host resource. Some implementations may support specific assignment for virtualized resources, in which case the host resource(s) are exposed using the HostResource property. 
     * A value of "Not represented" indicates a representation of the resource does not exist within the context of the resource consumer.
     */
    public static class PROPERTY_CONSUMERVISIBILITY
    {
       /**
        * name of the property ConsumerVisibility
        */
       public final static String NAME = "ConsumerVisibility";                  

	    	
    

              
       		
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
           * constant for value map entry 2
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Passed_Through 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry Passed-Through (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_Passed_Through 
                              = "Passed-Through";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Virtualized 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry Virtualized (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_Virtualized 
                              = "Virtualized";
                    
       		
          /**
           * constant for value map entry 4
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Not_represented 
                              = new javax.cim.UnsignedInteger16("4");
	          	
                       /**
              * constant for value entry Not represented (corresponds to mapEntry 4 )
              */
             public final static String VALUE_ENTRY_Not_represented 
                              = "Not represented";
                    
       		
          /**
           * constant for value map entry ..
           */ 
		          	
                       /**
              * constant for value entry DMTF reserved (corresponds to mapEntry .. )
              */
             public final static String VALUE_ENTRY_DMTF_reserved 
                              = "DMTF reserved";
                    
       		
          /**
           * constant for value map entry 32767..65535
           */ 
		          	
                       /**
              * constant for value entry Vendor Reserved (corresponds to mapEntry 32767..65535 )
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
	                      	                             
	                                               if (VALUE_ENTRY_Passed_Through.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Passed_Through;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Virtualized.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Virtualized;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Not_represented.equals(value))
                         {
                            return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Not_represented;
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
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Passed_Through.intValue())
                         {
                            return VALUE_ENTRY_Passed_Through;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Virtualized.intValue())
                         {
                            return VALUE_ENTRY_Virtualized;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Not_represented.intValue())
                         {
                            return VALUE_ENTRY_Not_represented;
                         }
                                                                                        
                         if (iValue >= 32767 || iValue <= 65535)
                         {
                            return VALUE_ENTRY_Vendor_Reserved;
                         }
                                                                                        return VALUE_ENTRY_DMTF_reserved;
                                                                            
                }
          
                                    
          /**
	       * ValueMap entries
       * Contains no entries that having an integer value range representation
       * 
       * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
       *
       * @see \#VALUE_ENTRIES_FOR_DISPLAY
       * 
       * Value Map for the property ConsumerVisibility   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown
                     	                            ,  VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Passed_Through
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Virtualized
                     	                            ,  VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Not_represented
                     	                     	                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property ConsumerVisibility   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Passed_Through
                                                                 ,  VALUE_ENTRY_Virtualized
                                                                 ,  VALUE_ENTRY_Not_represented
                                                                 ,  VALUE_ENTRY_DMTF_reserved
                                                                 ,  VALUE_ENTRY_Vendor_Reserved
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property ConsumerVisibility   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Passed_Through
                                                                 ,  VALUE_ENTRY_Virtualized
                                                                 ,  VALUE_ENTRY_Not_represented
                                                                                              };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property HostResource
     * This property exposes specific assignment to host or underlying resources. The embedded instances shall contain only key properties and be treated as Object Paths. If the virtual resource may be scheduled on a number of underlying resources, this property shall be left NULL. In that case, the DeviceAllocatedFromPool or ResourceAllocationFromPool associations may be used to determine the pool of host resources this virtual resource may be scheduled on. If specific assignment is utilized, all underlying resources used by this virtual resource shall be listed in this array. Typically the array will contain one item, however for aggregate allocations, such as multiple processors, multiple host resources may be specified.
     */
    public static class PROPERTY_HOSTRESOURCE
    {
       /**
        * name of the property HostResource
        */
       public final static String NAME = "HostResource";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Limit
     * This property specifies the upper bound, or maximum amount of resource that will be granted for this allocation. For example, a system which supports memory paging may support setting the Limit of a Memory allocation below that of the VirtualQuantity, thus forcing paging to occur for this allocation.
     */
    public static class PROPERTY_LIMIT
    {
       /**
        * name of the property Limit
        */
       public final static String NAME = "Limit";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property MappingBehavior
     * Specifies how this resource maps to underlying resourcesIf the HostResource array contains any entries, this property reflects how the resource maps to those specific resources.
     */
    public static class PROPERTY_MAPPINGBEHAVIOR
    {
       /**
        * name of the property MappingBehavior
        */
       public final static String NAME = "MappingBehavior";                  

	    	
    

              
       		
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
           * constant for value map entry 2
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Supported 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry Not Supported (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_Not_Supported 
                              = "Not Supported";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Dedicated 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry Dedicated (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_Dedicated 
                              = "Dedicated";
                    
       		
          /**
           * constant for value map entry 4
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Soft_Affinity 
                              = new javax.cim.UnsignedInteger16("4");
	          	
                       /**
              * constant for value entry Soft Affinity (corresponds to mapEntry 4 )
              */
             public final static String VALUE_ENTRY_Soft_Affinity 
                              = "Soft Affinity";
                    
       		
          /**
           * constant for value map entry 5
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Hard_Affinity 
                              = new javax.cim.UnsignedInteger16("5");
	          	
                       /**
              * constant for value entry Hard Affinity (corresponds to mapEntry 5 )
              */
             public final static String VALUE_ENTRY_Hard_Affinity 
                              = "Hard Affinity";
                    
       		
          /**
           * constant for value map entry ..
           */ 
		          	
                       /**
              * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
              */
             public final static String VALUE_ENTRY_DMTF_Reserved 
                              = "DMTF Reserved";
                    
       		
          /**
           * constant for value map entry 32767..65535
           */ 
		          	
                       /**
              * constant for value entry Vendor Reserved (corresponds to mapEntry 32767..65535 )
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
	                      	                             
	                                               if (VALUE_ENTRY_Not_Supported.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Supported;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Dedicated.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Dedicated;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Soft_Affinity.equals(value))
                         {
                            return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Soft_Affinity;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Hard_Affinity.equals(value))
                         {
                            return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Hard_Affinity;
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
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Supported.intValue())
                         {
                            return VALUE_ENTRY_Not_Supported;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Dedicated.intValue())
                         {
                            return VALUE_ENTRY_Dedicated;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Soft_Affinity.intValue())
                         {
                            return VALUE_ENTRY_Soft_Affinity;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Hard_Affinity.intValue())
                         {
                            return VALUE_ENTRY_Hard_Affinity;
                         }
                                                                                        
                         if (iValue >= 32767 || iValue <= 65535)
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
       * Value Map for the property MappingBehavior   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown
                     	                            ,  VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Supported
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Dedicated
                     	                            ,  VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Soft_Affinity
                     	                            ,  VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Hard_Affinity
                     	                     	                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property MappingBehavior   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Not_Supported
                                                                 ,  VALUE_ENTRY_Dedicated
                                                                 ,  VALUE_ENTRY_Soft_Affinity
                                                                 ,  VALUE_ENTRY_Hard_Affinity
                                                                 ,  VALUE_ENTRY_DMTF_Reserved
                                                                 ,  VALUE_ENTRY_Vendor_Reserved
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property MappingBehavior   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Not_Supported
                                                                 ,  VALUE_ENTRY_Dedicated
                                                                 ,  VALUE_ENTRY_Soft_Affinity
                                                                 ,  VALUE_ENTRY_Hard_Affinity
                                                                                              };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property OtherResourceType
     * A string that describes the resource type when a well defined value is not available and ResourceType has the value "Other".
     */
    public static class PROPERTY_OTHERRESOURCETYPE
    {
       /**
        * name of the property OtherResourceType
        */
       public final static String NAME = "OtherResourceType";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Parent
     * The Parent of the resource.For example, a controller for the current allocation
     */
    public static class PROPERTY_PARENT
    {
       /**
        * name of the property Parent
        */
       public final static String NAME = "Parent";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property PoolID
     * This property specifies which ResourcePool the resource is currently allocated from, or which ResourcePool the resource will be allocated from when the allocation occurs.
     */
    public static class PROPERTY_POOLID
    {
       /**
        * name of the property PoolID
        */
       public final static String NAME = "PoolID";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Reservation
     * This property specifies the amount of resource guaranteed to be available for this allocation. On system which support over-commitment of resources, this value is typically used for admission control to prevent an an allocation from being accepted thus preventing starvation.
     */
    public static class PROPERTY_RESERVATION
    {
       /**
        * name of the property Reservation
        */
       public final static String NAME = "Reservation";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property ResourceSubType
     * A string describing an implementation specific sub-type for this resource. For example, this may be used to distinguish different models of the same resource type.
     */
    public static class PROPERTY_RESOURCESUBTYPE
    {
       /**
        * name of the property ResourceSubType
        */
       public final static String NAME = "ResourceSubType";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property ResourceType
     * The type of resource this allocation setting represents.
     */
    public static class PROPERTY_RESOURCETYPE
    {
       /**
        * name of the property ResourceType
        */
       public final static String NAME = "ResourceType";                  

	    	
    

              
       		
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
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Computer_System 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry Computer System (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_Computer_System 
                              = "Computer System";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Processor 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry Processor (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_Processor 
                              = "Processor";
                    
       		
          /**
           * constant for value map entry 4
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Memory 
                              = new javax.cim.UnsignedInteger16("4");
	          	
                       /**
              * constant for value entry Memory (corresponds to mapEntry 4 )
              */
             public final static String VALUE_ENTRY_Memory 
                              = "Memory";
                    
       		
          /**
           * constant for value map entry 5
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IDE_Controller 
                              = new javax.cim.UnsignedInteger16("5");
	          	
                       /**
              * constant for value entry IDE Controller (corresponds to mapEntry 5 )
              */
             public final static String VALUE_ENTRY_IDE_Controller 
                              = "IDE Controller";
                    
       		
          /**
           * constant for value map entry 6
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Parallel_SCSI_HBA 
                              = new javax.cim.UnsignedInteger16("6");
	          	
                       /**
              * constant for value entry Parallel SCSI HBA (corresponds to mapEntry 6 )
              */
             public final static String VALUE_ENTRY_Parallel_SCSI_HBA 
                              = "Parallel SCSI HBA";
                    
       		
          /**
           * constant for value map entry 7
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_FC_HBA 
                              = new javax.cim.UnsignedInteger16("7");
	          	
                       /**
              * constant for value entry FC HBA (corresponds to mapEntry 7 )
              */
             public final static String VALUE_ENTRY_FC_HBA 
                              = "FC HBA";
                    
       		
          /**
           * constant for value map entry 8
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_iSCSI_HBA 
                              = new javax.cim.UnsignedInteger16("8");
	          	
                       /**
              * constant for value entry iSCSI HBA (corresponds to mapEntry 8 )
              */
             public final static String VALUE_ENTRY_iSCSI_HBA 
                              = "iSCSI HBA";
                    
       		
          /**
           * constant for value map entry 9
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_IB_HCA 
                              = new javax.cim.UnsignedInteger16("9");
	          	
                       /**
              * constant for value entry IB HCA (corresponds to mapEntry 9 )
              */
             public final static String VALUE_ENTRY_IB_HCA 
                              = "IB HCA";
                    
       		
          /**
           * constant for value map entry 10
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Ethernet_Adapter 
                              = new javax.cim.UnsignedInteger16("10");
	          	
                       /**
              * constant for value entry Ethernet Adapter (corresponds to mapEntry 10 )
              */
             public final static String VALUE_ENTRY_Ethernet_Adapter 
                              = "Ethernet Adapter";
                    
       		
          /**
           * constant for value map entry 11
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Other_Network_Adapter 
                              = new javax.cim.UnsignedInteger16("11");
	          	
                       /**
              * constant for value entry Other Network Adapter (corresponds to mapEntry 11 )
              */
             public final static String VALUE_ENTRY_Other_Network_Adapter 
                              = "Other Network Adapter";
                    
       		
          /**
           * constant for value map entry 12
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_I_O_Slot 
                              = new javax.cim.UnsignedInteger16("12");
	          	
                       /**
              * constant for value entry I/O Slot (corresponds to mapEntry 12 )
              */
             public final static String VALUE_ENTRY_I_O_Slot 
                              = "I/O Slot";
                    
       		
          /**
           * constant for value map entry 13
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_I_O_Device 
                              = new javax.cim.UnsignedInteger16("13");
	          	
                       /**
              * constant for value entry I/O Device (corresponds to mapEntry 13 )
              */
             public final static String VALUE_ENTRY_I_O_Device 
                              = "I/O Device";
                    
       		
          /**
           * constant for value map entry 14
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Floppy_Drive 
                              = new javax.cim.UnsignedInteger16("14");
	          	
                       /**
              * constant for value entry Floppy Drive (corresponds to mapEntry 14 )
              */
             public final static String VALUE_ENTRY_Floppy_Drive 
                              = "Floppy Drive";
                    
       		
          /**
           * constant for value map entry 15
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_CD_Drive 
                              = new javax.cim.UnsignedInteger16("15");
	          	
                       /**
              * constant for value entry CD Drive (corresponds to mapEntry 15 )
              */
             public final static String VALUE_ENTRY_CD_Drive 
                              = "CD Drive";
                    
       		
          /**
           * constant for value map entry 16
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_DVD_drive 
                              = new javax.cim.UnsignedInteger16("16");
	          	
                       /**
              * constant for value entry DVD drive (corresponds to mapEntry 16 )
              */
             public final static String VALUE_ENTRY_DVD_drive 
                              = "DVD drive";
                    
       		
          /**
           * constant for value map entry 17
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Disk_Drive 
                              = new javax.cim.UnsignedInteger16("17");
	          	
                       /**
              * constant for value entry Disk Drive (corresponds to mapEntry 17 )
              */
             public final static String VALUE_ENTRY_Disk_Drive 
                              = "Disk Drive";
                    
       		
          /**
           * constant for value map entry 18
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Tape_Drive 
                              = new javax.cim.UnsignedInteger16("18");
	          	
                       /**
              * constant for value entry Tape Drive (corresponds to mapEntry 18 )
              */
             public final static String VALUE_ENTRY_Tape_Drive 
                              = "Tape Drive";
                    
       		
          /**
           * constant for value map entry 19
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Storage_Extent 
                              = new javax.cim.UnsignedInteger16("19");
	          	
                       /**
              * constant for value entry Storage Extent (corresponds to mapEntry 19 )
              */
             public final static String VALUE_ENTRY_Storage_Extent 
                              = "Storage Extent";
                    
       		
          /**
           * constant for value map entry 20
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Other_storage_device 
                              = new javax.cim.UnsignedInteger16("20");
	          	
                       /**
              * constant for value entry Other storage device (corresponds to mapEntry 20 )
              */
             public final static String VALUE_ENTRY_Other_storage_device 
                              = "Other storage device";
                    
       		
          /**
           * constant for value map entry 21
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Serial_port 
                              = new javax.cim.UnsignedInteger16("21");
	          	
                       /**
              * constant for value entry Serial port (corresponds to mapEntry 21 )
              */
             public final static String VALUE_ENTRY_Serial_port 
                              = "Serial port";
                    
       		
          /**
           * constant for value map entry 22
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Parallel_port 
                              = new javax.cim.UnsignedInteger16("22");
	          	
                       /**
              * constant for value entry Parallel port (corresponds to mapEntry 22 )
              */
             public final static String VALUE_ENTRY_Parallel_port 
                              = "Parallel port";
                    
       		
          /**
           * constant for value map entry 23
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_USB_Controller 
                              = new javax.cim.UnsignedInteger16("23");
	          	
                       /**
              * constant for value entry USB Controller (corresponds to mapEntry 23 )
              */
             public final static String VALUE_ENTRY_USB_Controller 
                              = "USB Controller";
                    
       		
          /**
           * constant for value map entry 24
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Graphics_controller 
                              = new javax.cim.UnsignedInteger16("24");
	          	
                       /**
              * constant for value entry Graphics controller (corresponds to mapEntry 24 )
              */
             public final static String VALUE_ENTRY_Graphics_controller 
                              = "Graphics controller";
                    
       		
          /**
           * constant for value map entry 25
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_IEEE_1394_Controller 
                              = new javax.cim.UnsignedInteger16("25");
	          	
                       /**
              * constant for value entry IEEE 1394 Controller (corresponds to mapEntry 25 )
              */
             public final static String VALUE_ENTRY_IEEE_1394_Controller 
                              = "IEEE 1394 Controller";
                    
       		
          /**
           * constant for value map entry 26
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_Partitionable_Unit 
                              = new javax.cim.UnsignedInteger16("26");
	          	
                       /**
              * constant for value entry Partitionable Unit (corresponds to mapEntry 26 )
              */
             public final static String VALUE_ENTRY_Partitionable_Unit 
                              = "Partitionable Unit";
                    
       		
          /**
           * constant for value map entry 27
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Base_Partitionable_Unit 
                              = new javax.cim.UnsignedInteger16("27");
	          	
                       /**
              * constant for value entry Base Partitionable Unit (corresponds to mapEntry 27 )
              */
             public final static String VALUE_ENTRY_Base_Partitionable_Unit 
                              = "Base Partitionable Unit";
                    
       		
          /**
           * constant for value map entry 28
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Power 
                              = new javax.cim.UnsignedInteger16("28");
	          	
                       /**
              * constant for value entry Power (corresponds to mapEntry 28 )
              */
             public final static String VALUE_ENTRY_Power 
                              = "Power";
                    
       		
          /**
           * constant for value map entry 29
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Cooling_Capacity 
                              = new javax.cim.UnsignedInteger16("29");
	          	
                       /**
              * constant for value entry Cooling Capacity (corresponds to mapEntry 29 )
              */
             public final static String VALUE_ENTRY_Cooling_Capacity 
                              = "Cooling Capacity";
                    
       		
          /**
           * constant for value map entry 30
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Ethernet_Switch_Port 
                              = new javax.cim.UnsignedInteger16("30");
	          	
                       /**
              * constant for value entry Ethernet Switch Port (corresponds to mapEntry 30 )
              */
             public final static String VALUE_ENTRY_Ethernet_Switch_Port 
                              = "Ethernet Switch Port";
                    
       		
          /**
           * constant for value map entry ..
           */ 
		          	
                       /**
              * constant for value entry DMTF reserved (corresponds to mapEntry .. )
              */
             public final static String VALUE_ENTRY_DMTF_reserved 
                              = "DMTF reserved";
                    
       		
          /**
           * constant for value map entry 0x8000..0xFFFF
           */ 
		          	
                       /**
              * constant for value entry Vendor Reserved (corresponds to mapEntry 0x8000..0xFFFF )
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
                                                
	                                               if (VALUE_ENTRY_Other.equals(value))
                         {
                            return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Computer_System.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Computer_System;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Processor.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Processor;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Memory.equals(value))
                         {
                            return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Memory;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_IDE_Controller.equals(value))
                         {
                            return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IDE_Controller;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Parallel_SCSI_HBA.equals(value))
                         {
                            return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Parallel_SCSI_HBA;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_FC_HBA.equals(value))
                         {
                            return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_FC_HBA;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_iSCSI_HBA.equals(value))
                         {
                            return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_iSCSI_HBA;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_IB_HCA.equals(value))
                         {
                            return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_IB_HCA;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Ethernet_Adapter.equals(value))
                         {
                            return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Ethernet_Adapter;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Other_Network_Adapter.equals(value))
                         {
                            return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Other_Network_Adapter;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_I_O_Slot.equals(value))
                         {
                            return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_I_O_Slot;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_I_O_Device.equals(value))
                         {
                            return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_I_O_Device;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Floppy_Drive.equals(value))
                         {
                            return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Floppy_Drive;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_CD_Drive.equals(value))
                         {
                            return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_CD_Drive;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_DVD_drive.equals(value))
                         {
                            return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_DVD_drive;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Disk_Drive.equals(value))
                         {
                            return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Disk_Drive;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Tape_Drive.equals(value))
                         {
                            return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Tape_Drive;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Storage_Extent.equals(value))
                         {
                            return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Storage_Extent;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Other_storage_device.equals(value))
                         {
                            return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Other_storage_device;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Serial_port.equals(value))
                         {
                            return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Serial_port;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Parallel_port.equals(value))
                         {
                            return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Parallel_port;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_USB_Controller.equals(value))
                         {
                            return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_USB_Controller;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Graphics_controller.equals(value))
                         {
                            return VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Graphics_controller;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_IEEE_1394_Controller.equals(value))
                         {
                            return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_IEEE_1394_Controller;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Partitionable_Unit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_Partitionable_Unit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Base_Partitionable_Unit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Base_Partitionable_Unit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Power.equals(value))
                         {
                            return VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Power;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Cooling_Capacity.equals(value))
                         {
                            return VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Cooling_Capacity;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Ethernet_Switch_Port.equals(value))
                         {
                            return VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Ethernet_Switch_Port;
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
                                                                                     
                         if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue())
                         {
                            return VALUE_ENTRY_Other;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Computer_System.intValue())
                         {
                            return VALUE_ENTRY_Computer_System;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Processor.intValue())
                         {
                            return VALUE_ENTRY_Processor;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Memory.intValue())
                         {
                            return VALUE_ENTRY_Memory;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IDE_Controller.intValue())
                         {
                            return VALUE_ENTRY_IDE_Controller;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Parallel_SCSI_HBA.intValue())
                         {
                            return VALUE_ENTRY_Parallel_SCSI_HBA;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_FC_HBA.intValue())
                         {
                            return VALUE_ENTRY_FC_HBA;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_iSCSI_HBA.intValue())
                         {
                            return VALUE_ENTRY_iSCSI_HBA;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_IB_HCA.intValue())
                         {
                            return VALUE_ENTRY_IB_HCA;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Ethernet_Adapter.intValue())
                         {
                            return VALUE_ENTRY_Ethernet_Adapter;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Other_Network_Adapter.intValue())
                         {
                            return VALUE_ENTRY_Other_Network_Adapter;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_I_O_Slot.intValue())
                         {
                            return VALUE_ENTRY_I_O_Slot;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_I_O_Device.intValue())
                         {
                            return VALUE_ENTRY_I_O_Device;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Floppy_Drive.intValue())
                         {
                            return VALUE_ENTRY_Floppy_Drive;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_CD_Drive.intValue())
                         {
                            return VALUE_ENTRY_CD_Drive;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_DVD_drive.intValue())
                         {
                            return VALUE_ENTRY_DVD_drive;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Disk_Drive.intValue())
                         {
                            return VALUE_ENTRY_Disk_Drive;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Tape_Drive.intValue())
                         {
                            return VALUE_ENTRY_Tape_Drive;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Storage_Extent.intValue())
                         {
                            return VALUE_ENTRY_Storage_Extent;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Other_storage_device.intValue())
                         {
                            return VALUE_ENTRY_Other_storage_device;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Serial_port.intValue())
                         {
                            return VALUE_ENTRY_Serial_port;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Parallel_port.intValue())
                         {
                            return VALUE_ENTRY_Parallel_port;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_USB_Controller.intValue())
                         {
                            return VALUE_ENTRY_USB_Controller;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Graphics_controller.intValue())
                         {
                            return VALUE_ENTRY_Graphics_controller;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_IEEE_1394_Controller.intValue())
                         {
                            return VALUE_ENTRY_IEEE_1394_Controller;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_Partitionable_Unit.intValue())
                         {
                            return VALUE_ENTRY_Partitionable_Unit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Base_Partitionable_Unit.intValue())
                         {
                            return VALUE_ENTRY_Base_Partitionable_Unit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Power.intValue())
                         {
                            return VALUE_ENTRY_Power;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Cooling_Capacity.intValue())
                         {
                            return VALUE_ENTRY_Cooling_Capacity;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Ethernet_Switch_Port.intValue())
                         {
                            return VALUE_ENTRY_Ethernet_Switch_Port;
                         }
                                                                                        
                         if (iValue >= 0x8000 || iValue <= 0xFFFF)
                         {
                            return VALUE_ENTRY_Vendor_Reserved;
                         }
                                                                                        return VALUE_ENTRY_DMTF_reserved;
                                                                            
                }
          
                                    
          /**
	       * ValueMap entries
       * Contains no entries that having an integer value range representation
       * 
       * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
       *
       * @see \#VALUE_ENTRIES_FOR_DISPLAY
       * 
       * Value Map for the property ResourceType   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other
                     	                            ,  VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Computer_System
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Processor
                     	                            ,  VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Memory
                     	                            ,  VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IDE_Controller
                     	                            ,  VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Parallel_SCSI_HBA
                     	                            ,  VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_FC_HBA
                     	                            ,  VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_iSCSI_HBA
                     	                            ,  VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_IB_HCA
                     	                            ,  VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Ethernet_Adapter
                     	                            ,  VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Other_Network_Adapter
                     	                            ,  VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_I_O_Slot
                     	                            ,  VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_I_O_Device
                     	                            ,  VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Floppy_Drive
                     	                            ,  VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_CD_Drive
                     	                            ,  VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_DVD_drive
                     	                            ,  VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Disk_Drive
                     	                            ,  VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Tape_Drive
                     	                            ,  VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Storage_Extent
                     	                            ,  VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Other_storage_device
                     	                            ,  VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Serial_port
                     	                            ,  VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Parallel_port
                     	                            ,  VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_USB_Controller
                     	                            ,  VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Graphics_controller
                     	                            ,  VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_IEEE_1394_Controller
                     	                            ,  VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_Partitionable_Unit
                     	                            ,  VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Base_Partitionable_Unit
                     	                            ,  VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Power
                     	                            ,  VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Cooling_Capacity
                     	                            ,  VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Ethernet_Switch_Port
                     	                     	                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property ResourceType   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_Other
                                                                 ,  VALUE_ENTRY_Computer_System
                                                                 ,  VALUE_ENTRY_Processor
                                                                 ,  VALUE_ENTRY_Memory
                                                                 ,  VALUE_ENTRY_IDE_Controller
                                                                 ,  VALUE_ENTRY_Parallel_SCSI_HBA
                                                                 ,  VALUE_ENTRY_FC_HBA
                                                                 ,  VALUE_ENTRY_iSCSI_HBA
                                                                 ,  VALUE_ENTRY_IB_HCA
                                                                 ,  VALUE_ENTRY_Ethernet_Adapter
                                                                 ,  VALUE_ENTRY_Other_Network_Adapter
                                                                 ,  VALUE_ENTRY_I_O_Slot
                                                                 ,  VALUE_ENTRY_I_O_Device
                                                                 ,  VALUE_ENTRY_Floppy_Drive
                                                                 ,  VALUE_ENTRY_CD_Drive
                                                                 ,  VALUE_ENTRY_DVD_drive
                                                                 ,  VALUE_ENTRY_Disk_Drive
                                                                 ,  VALUE_ENTRY_Tape_Drive
                                                                 ,  VALUE_ENTRY_Storage_Extent
                                                                 ,  VALUE_ENTRY_Other_storage_device
                                                                 ,  VALUE_ENTRY_Serial_port
                                                                 ,  VALUE_ENTRY_Parallel_port
                                                                 ,  VALUE_ENTRY_USB_Controller
                                                                 ,  VALUE_ENTRY_Graphics_controller
                                                                 ,  VALUE_ENTRY_IEEE_1394_Controller
                                                                 ,  VALUE_ENTRY_Partitionable_Unit
                                                                 ,  VALUE_ENTRY_Base_Partitionable_Unit
                                                                 ,  VALUE_ENTRY_Power
                                                                 ,  VALUE_ENTRY_Cooling_Capacity
                                                                 ,  VALUE_ENTRY_Ethernet_Switch_Port
                                                                 ,  VALUE_ENTRY_DMTF_reserved
                                                                 ,  VALUE_ENTRY_Vendor_Reserved
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property ResourceType   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_Other
                                                                 ,  VALUE_ENTRY_Computer_System
                                                                 ,  VALUE_ENTRY_Processor
                                                                 ,  VALUE_ENTRY_Memory
                                                                 ,  VALUE_ENTRY_IDE_Controller
                                                                 ,  VALUE_ENTRY_Parallel_SCSI_HBA
                                                                 ,  VALUE_ENTRY_FC_HBA
                                                                 ,  VALUE_ENTRY_iSCSI_HBA
                                                                 ,  VALUE_ENTRY_IB_HCA
                                                                 ,  VALUE_ENTRY_Ethernet_Adapter
                                                                 ,  VALUE_ENTRY_Other_Network_Adapter
                                                                 ,  VALUE_ENTRY_I_O_Slot
                                                                 ,  VALUE_ENTRY_I_O_Device
                                                                 ,  VALUE_ENTRY_Floppy_Drive
                                                                 ,  VALUE_ENTRY_CD_Drive
                                                                 ,  VALUE_ENTRY_DVD_drive
                                                                 ,  VALUE_ENTRY_Disk_Drive
                                                                 ,  VALUE_ENTRY_Tape_Drive
                                                                 ,  VALUE_ENTRY_Storage_Extent
                                                                 ,  VALUE_ENTRY_Other_storage_device
                                                                 ,  VALUE_ENTRY_Serial_port
                                                                 ,  VALUE_ENTRY_Parallel_port
                                                                 ,  VALUE_ENTRY_USB_Controller
                                                                 ,  VALUE_ENTRY_Graphics_controller
                                                                 ,  VALUE_ENTRY_IEEE_1394_Controller
                                                                 ,  VALUE_ENTRY_Partitionable_Unit
                                                                 ,  VALUE_ENTRY_Base_Partitionable_Unit
                                                                 ,  VALUE_ENTRY_Power
                                                                 ,  VALUE_ENTRY_Cooling_Capacity
                                                                 ,  VALUE_ENTRY_Ethernet_Switch_Port
                                                                                              };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property VirtualQuantity
     * This property specifies the quantity of resources presented to the consumer. For example, when ResourceType=Processor, this property would reflect the number of discrete Processors presented to the virtual computer system. When ResourceType=Memory, this property could reflect the number of MB reported to the virtual computer system.
     */
    public static class PROPERTY_VIRTUALQUANTITY
    {
       /**
        * name of the property VirtualQuantity
        */
       public final static String NAME = "VirtualQuantity";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Weight
     * This property specifies a relative priority for this allocation in relation to other allocations from the same ResourcePool. This property has no unit of measure, and is only relevant when compared to other allocations vying for the same host resources.
     */
    public static class PROPERTY_WEIGHT
    {
       /**
        * name of the property Weight
        */
       public final static String NAME = "Weight";                  

	    	
    

    		    
	
	    
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
    *   The ResourceAllocationSettingData class represents settings specifically related to an allocated resource that are outside the scope of the CIM class typically used to represent the resource itself. These settings include information specific to the allocation that may not be visible to the consumer of the resource itself. For example, a virtual processor may look like a 2 ghz processor to the consumer (virtual computer system), however the virtualization system may use time-slicing to schedule the the virtual processor to only allow it to use 1 ghz.
    *   @param client the CIM Client
    *   @param namespace the target namespace
    */  

      
   public CIM_ResourceAllocationSettingData(WBEMClient client, String namespace) throws WbemsmtException
   {
       CIMClass cls = getClass(client,namespace);
       setFromServer(false);
       init(cls.newInstance(),true);
   }
        
   /**
    *   Class constructor
    * 
    *       *   <br>
    *   The ResourceAllocationSettingData class represents settings specifically related to an allocated resource that are outside the scope of the CIM class typically used to represent the resource itself. These settings include information specific to the allocation that may not be visible to the consumer of the resource itself. For example, a virtual processor may look like a 2 ghz processor to the consumer (virtual computer system), however the virtualization system may use time-slicing to schedule the the virtual processor to only allow it to use 1 ghz.
    *   @param cimInstance the instance that is used to create the Object
    */  
   
   public CIM_ResourceAllocationSettingData(CIMInstance cimInstance)  throws WbemsmtException { 
        
       if (cimInstance == null) {
           throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimInstance parameter does not contain a valid reference.");
       }
       setFromServer(true);
       init(cimInstance,false);
   }
   
   /**
    * Default constructor
    */
   protected CIM_ResourceAllocationSettingData()
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
              propertiesToCheck.put("Address",new CIMProperty("Address",CIMDataType.STRING_T,null));
              propertiesToCheck.put("AllocationUnits",new CIMProperty("AllocationUnits",CIMDataType.STRING_T,null));
              propertiesToCheck.put("AutomaticAllocation",new CIMProperty("AutomaticAllocation",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("AutomaticDeallocation",new CIMProperty("AutomaticDeallocation",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("Connection",new CIMProperty("Connection",CIMDataType.STRING_ARRAY_T,null));
              propertiesToCheck.put("ConsumerVisibility",new CIMProperty("ConsumerVisibility",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("HostResource",new CIMProperty("HostResource",CIMDataType.OBJECT_ARRAY_T,null));
              propertiesToCheck.put("Limit",new CIMProperty("Limit",CIMDataType.UINT64_T,null));
              propertiesToCheck.put("MappingBehavior",new CIMProperty("MappingBehavior",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("OtherResourceType",new CIMProperty("OtherResourceType",CIMDataType.STRING_T,null));
              propertiesToCheck.put("Parent",new CIMProperty("Parent",CIMDataType.STRING_T,null));
              propertiesToCheck.put("PoolID",new CIMProperty("PoolID",CIMDataType.STRING_T,null));
              propertiesToCheck.put("Reservation",new CIMProperty("Reservation",CIMDataType.UINT64_T,null));
              propertiesToCheck.put("ResourceSubType",new CIMProperty("ResourceSubType",CIMDataType.STRING_T,null));
              propertiesToCheck.put("ResourceType",new CIMProperty("ResourceType",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("VirtualQuantity",new CIMProperty("VirtualQuantity",CIMDataType.UINT64_T,null));
              propertiesToCheck.put("Weight",new CIMProperty("Weight",CIMDataType.UINT32_T,null));
       	
	       super.init(cimInstance,overwrite);
	       
	       
	       //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
	       //we overwrite the dataType by setting null for every embeddedObject/Instance property
	       if (overwrite)
	       {
			                                                                                                                                                                          set_HostResource(null);
                                                                                                                                                                                                                            
       }
   }

//**********************************************************************
// Properties get/set     
//**********************************************************************


   
   
   /**
    * Get the property Address
    *     * <br>
    * The address of the resource.For example, the MAC address of a Ethernet port.
    *     */

      

               
   public String get_Address()    {
       CIMProperty currentProperty = getProperty(PROPERTY_ADDRESS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_ADDRESS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Address
    * <br>
    * The address of the resource.For example, the MAC address of a Ethernet port.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Address(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_ADDRESS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Address(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_ADDRESS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Address by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Address(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ADDRESS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Address(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_ADDRESS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Address
    * <br>
    * The address of the resource.For example, the MAC address of a Ethernet port.
    */
    
   private static CIMProperty setPropertyValue_Address(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property AllocationUnits
    *     * <br>
    * This property specifies the units of allocation used by the Reservation and Limit properties. For example, when ResourceType=Processor, AllocationUnits may be set to hertz*10^6 or percent. When ResourceType=Memory, AllocationUnits may be set to bytes*10^3. The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Appendix C.1 of DSP0004 V2.4 or later.
    *     */

      

               
   public String get_AllocationUnits()    {
       CIMProperty currentProperty = getProperty(PROPERTY_ALLOCATIONUNITS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_ALLOCATIONUNITS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property AllocationUnits
    * <br>
    * This property specifies the units of allocation used by the Reservation and Limit properties. For example, when ResourceType=Processor, AllocationUnits may be set to hertz*10^6 or percent. When ResourceType=Memory, AllocationUnits may be set to bytes*10^3. The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Appendix C.1 of DSP0004 V2.4 or later.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_AllocationUnits(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_ALLOCATIONUNITS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_AllocationUnits(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_ALLOCATIONUNITS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property AllocationUnits by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AllocationUnits(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ALLOCATIONUNITS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_AllocationUnits(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_ALLOCATIONUNITS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property AllocationUnits
    * <br>
    * This property specifies the units of allocation used by the Reservation and Limit properties. For example, when ResourceType=Processor, AllocationUnits may be set to hertz*10^6 or percent. When ResourceType=Memory, AllocationUnits may be set to bytes*10^3. The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Appendix C.1 of DSP0004 V2.4 or later.
    */
    
   private static CIMProperty setPropertyValue_AllocationUnits(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property AutomaticAllocation
    *     * <br>
    * This property specifies if the resource will be automatically allocated. For example when set to true, when the consuming virtual computer system is powered on, this resource would be allocated. A value of false indicates the resource must be explicitly allocated. For example, the setting may represent removable media (cdrom, floppy, etc.) where at power on time, the media isnot present. An explicit operation is required to allocate the resource.
    *     */

      

               
   public Boolean get_AutomaticAllocation()    {
       CIMProperty currentProperty = getProperty(PROPERTY_AUTOMATICALLOCATION.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_AUTOMATICALLOCATION.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property AutomaticAllocation
    * <br>
    * This property specifies if the resource will be automatically allocated. For example when set to true, when the consuming virtual computer system is powered on, this resource would be allocated. A value of false indicates the resource must be explicitly allocated. For example, the setting may represent removable media (cdrom, floppy, etc.) where at power on time, the media isnot present. An explicit operation is required to allocate the resource.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_AutomaticAllocation(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_AUTOMATICALLOCATION.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_AutomaticAllocation(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_AUTOMATICALLOCATION.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property AutomaticAllocation by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AutomaticAllocation(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AUTOMATICALLOCATION.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_AutomaticAllocation(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_AUTOMATICALLOCATION.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property AutomaticAllocation
    * <br>
    * This property specifies if the resource will be automatically allocated. For example when set to true, when the consuming virtual computer system is powered on, this resource would be allocated. A value of false indicates the resource must be explicitly allocated. For example, the setting may represent removable media (cdrom, floppy, etc.) where at power on time, the media isnot present. An explicit operation is required to allocate the resource.
    */
    
   private static CIMProperty setPropertyValue_AutomaticAllocation(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property AutomaticDeallocation
    *     * <br>
    * This property specifies if the resource will be automatically de-allocated. For example, when set to true, when the consuming virtual computer system is powered off, this resource would be de-allocated. When set to false, the resource will remain allocated and must be explicitly de-allocated.
    *     */

      

               
   public Boolean get_AutomaticDeallocation()    {
       CIMProperty currentProperty = getProperty(PROPERTY_AUTOMATICDEALLOCATION.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_AUTOMATICDEALLOCATION.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property AutomaticDeallocation
    * <br>
    * This property specifies if the resource will be automatically de-allocated. For example, when set to true, when the consuming virtual computer system is powered off, this resource would be de-allocated. When set to false, the resource will remain allocated and must be explicitly de-allocated.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_AutomaticDeallocation(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_AUTOMATICDEALLOCATION.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_AutomaticDeallocation(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_AUTOMATICDEALLOCATION.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property AutomaticDeallocation by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AutomaticDeallocation(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AUTOMATICDEALLOCATION.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_AutomaticDeallocation(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_AUTOMATICDEALLOCATION.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property AutomaticDeallocation
    * <br>
    * This property specifies if the resource will be automatically de-allocated. For example, when set to true, when the consuming virtual computer system is powered off, this resource would be de-allocated. When set to false, the resource will remain allocated and must be explicitly de-allocated.
    */
    
   private static CIMProperty setPropertyValue_AutomaticDeallocation(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Connection
    *     * <br>
    * The thing to which this resource is connected. For example, a named network or switch port.
    *     */

      

               
   public String[] get_Connection()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CONNECTION.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CONNECTION.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String[])currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Connection
    * <br>
    * The thing to which this resource is connected. For example, a named network or switch port.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Connection(String[] newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CONNECTION.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Connection(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CONNECTION.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Connection by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Connection(WBEMClient client, String namespace, String[] newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONNECTION.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Connection(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CONNECTION.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Connection
    * <br>
    * The thing to which this resource is connected. For example, a named network or switch port.
    */
    
   private static CIMProperty setPropertyValue_Connection(CIMProperty currentProperty, String[] newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property ConsumerVisibility
    *     * <br>
    * Describes the consumers visibility to the allocated resource.
     * A value of "Passed-Through" indicates the underlying or host resource is utilized and passed through to the consumer, possibly using partitioning. At least one item shall be present in the HostResource property. 
     * A value of "Virtualized" indicates the resource is virtualized and may not map directly to an underlying/host resource. Some implementations may support specific assignment for virtualized resources, in which case the host resource(s) are exposed using the HostResource property. 
     * A value of "Not represented" indicates a representation of the resource does not exist within the context of the resource consumer.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_ConsumerVisibility()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CONSUMERVISIBILITY.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CONSUMERVISIBILITY.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property ConsumerVisibility
    * <br>
    * Describes the consumers visibility to the allocated resource.
     * A value of "Passed-Through" indicates the underlying or host resource is utilized and passed through to the consumer, possibly using partitioning. At least one item shall be present in the HostResource property. 
     * A value of "Virtualized" indicates the resource is virtualized and may not map directly to an underlying/host resource. Some implementations may support specific assignment for virtualized resources, in which case the host resource(s) are exposed using the HostResource property. 
     * A value of "Not represented" indicates a representation of the resource does not exist within the context of the resource consumer.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_ConsumerVisibility(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CONSUMERVISIBILITY.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_ConsumerVisibility(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CONSUMERVISIBILITY.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property ConsumerVisibility by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConsumerVisibility(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONSUMERVISIBILITY.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_ConsumerVisibility(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CONSUMERVISIBILITY.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property ConsumerVisibility
    * <br>
    * Describes the consumers visibility to the allocated resource.
     * A value of "Passed-Through" indicates the underlying or host resource is utilized and passed through to the consumer, possibly using partitioning. At least one item shall be present in the HostResource property. 
     * A value of "Virtualized" indicates the resource is virtualized and may not map directly to an underlying/host resource. Some implementations may support specific assignment for virtualized resources, in which case the host resource(s) are exposed using the HostResource property. 
     * A value of "Not represented" indicates a representation of the resource does not exist within the context of the resource consumer.
    */
    
   private static CIMProperty setPropertyValue_ConsumerVisibility(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property HostResource
    *     * <br>
    * This property exposes specific assignment to host or underlying resources. The embedded instances shall contain only key properties and be treated as Object Paths. If the virtual resource may be scheduled on a number of underlying resources, this property shall be left NULL. In that case, the DeviceAllocatedFromPool or ResourceAllocationFromPool associations may be used to determine the pool of host resources this virtual resource may be scheduled on. If specific assignment is utilized, all underlying resources used by this virtual resource shall be listed in this array. Typically the array will contain one item, however for aggregate allocations, such as multiple processors, multiple host resources may be specified.
    *     */

      

               
   public CIM_LogicalDevice[] get_HostResource(javax.wbem.client.WBEMClient client ) throws WbemsmtException    {
       CIMProperty currentProperty = getProperty(PROPERTY_HOSTRESOURCE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_HOSTRESOURCE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
                              
             CIMInstance[] instances = (CIMInstance[])currentProperty.getValue();
             CIM_LogicalDevice[] result = new CIM_LogicalDevice[instances.length];
             for (int i=0; i < instances.length; i++)
            	 {
            	    result[i] = instances[i] != null ? CIM_LogicalDeviceHelper.getInstance(client,instances[i].getObjectPath()) : null;
            	 }
            	 return result;
                     
    }
    
       
      
   /**
    * Set the property HostResource
    * <br>
    * This property exposes specific assignment to host or underlying resources. The embedded instances shall contain only key properties and be treated as Object Paths. If the virtual resource may be scheduled on a number of underlying resources, this property shall be left NULL. In that case, the DeviceAllocatedFromPool or ResourceAllocationFromPool associations may be used to determine the pool of host resources this virtual resource may be scheduled on. If specific assignment is utilized, all underlying resources used by this virtual resource shall be listed in this array. Typically the array will contain one item, however for aggregate allocations, such as multiple processors, multiple host resources may be specified.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_HostResource(CIM_LogicalDevice[] newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_HOSTRESOURCE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_HostResource(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_HOSTRESOURCE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property HostResource by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_HostResource(WBEMClient client, String namespace, CIM_LogicalDevice[] newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_HOSTRESOURCE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_HostResource(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_HOSTRESOURCE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property HostResource
    * <br>
    * This property exposes specific assignment to host or underlying resources. The embedded instances shall contain only key properties and be treated as Object Paths. If the virtual resource may be scheduled on a number of underlying resources, this property shall be left NULL. In that case, the DeviceAllocatedFromPool or ResourceAllocationFromPool associations may be used to determine the pool of host resources this virtual resource may be scheduled on. If specific assignment is utilized, all underlying resources used by this virtual resource shall be listed in this array. Typically the array will contain one item, however for aggregate allocations, such as multiple processors, multiple host resources may be specified.
    */
    
   private static CIMProperty setPropertyValue_HostResource(CIMProperty currentProperty, CIM_LogicalDevice[] newValue)
   {
        Object setThis = null;        


                          
              CIMInstance[] instances = null;
              if (newValue != null)
              {
                 instances = new CIMInstance[newValue.length];
                 for (int i=0; i < instances.length; i++)
               	  {
                	    instances[i] = newValue[i] != null ? newValue[i].getCimInstance() : null;
                	 }
              }
             	 setThis = instances;
                           
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), CIMDataType.OBJECT_ARRAY_T,setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Limit
    *     * <br>
    * This property specifies the upper bound, or maximum amount of resource that will be granted for this allocation. For example, a system which supports memory paging may support setting the Limit of a Memory allocation below that of the VirtualQuantity, thus forcing paging to occur for this allocation.
    *     */

      

               
   public javax.cim.UnsignedInteger64 get_Limit()    {
       CIMProperty currentProperty = getProperty(PROPERTY_LIMIT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_LIMIT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger64)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Limit
    * <br>
    * This property specifies the upper bound, or maximum amount of resource that will be granted for this allocation. For example, a system which supports memory paging may support setting the Limit of a Memory allocation below that of the VirtualQuantity, thus forcing paging to occur for this allocation.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Limit(javax.cim.UnsignedInteger64 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_LIMIT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Limit(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_LIMIT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Limit by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Limit(WBEMClient client, String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LIMIT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Limit(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_LIMIT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Limit
    * <br>
    * This property specifies the upper bound, or maximum amount of resource that will be granted for this allocation. For example, a system which supports memory paging may support setting the Limit of a Memory allocation below that of the VirtualQuantity, thus forcing paging to occur for this allocation.
    */
    
   private static CIMProperty setPropertyValue_Limit(CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property MappingBehavior
    *     * <br>
    * Specifies how this resource maps to underlying resourcesIf the HostResource array contains any entries, this property reflects how the resource maps to those specific resources.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_MappingBehavior()    {
       CIMProperty currentProperty = getProperty(PROPERTY_MAPPINGBEHAVIOR.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_MAPPINGBEHAVIOR.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property MappingBehavior
    * <br>
    * Specifies how this resource maps to underlying resourcesIf the HostResource array contains any entries, this property reflects how the resource maps to those specific resources.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_MappingBehavior(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_MAPPINGBEHAVIOR.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_MappingBehavior(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_MAPPINGBEHAVIOR.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property MappingBehavior by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MappingBehavior(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAPPINGBEHAVIOR.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_MappingBehavior(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_MAPPINGBEHAVIOR.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property MappingBehavior
    * <br>
    * Specifies how this resource maps to underlying resourcesIf the HostResource array contains any entries, this property reflects how the resource maps to those specific resources.
    */
    
   private static CIMProperty setPropertyValue_MappingBehavior(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property OtherResourceType
    *     * <br>
    * A string that describes the resource type when a well defined value is not available and ResourceType has the value "Other".
    *     */

      

               
   public String get_OtherResourceType()    {
       CIMProperty currentProperty = getProperty(PROPERTY_OTHERRESOURCETYPE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_OTHERRESOURCETYPE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property OtherResourceType
    * <br>
    * A string that describes the resource type when a well defined value is not available and ResourceType has the value "Other".
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_OtherResourceType(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_OTHERRESOURCETYPE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_OtherResourceType(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_OTHERRESOURCETYPE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property OtherResourceType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherResourceType(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERRESOURCETYPE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_OtherResourceType(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_OTHERRESOURCETYPE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property OtherResourceType
    * <br>
    * A string that describes the resource type when a well defined value is not available and ResourceType has the value "Other".
    */
    
   private static CIMProperty setPropertyValue_OtherResourceType(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Parent
    *     * <br>
    * The Parent of the resource.For example, a controller for the current allocation
    *     */

      

               
   public String get_Parent()    {
       CIMProperty currentProperty = getProperty(PROPERTY_PARENT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_PARENT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Parent
    * <br>
    * The Parent of the resource.For example, a controller for the current allocation
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Parent(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_PARENT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Parent(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_PARENT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Parent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Parent(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PARENT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Parent(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_PARENT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Parent
    * <br>
    * The Parent of the resource.For example, a controller for the current allocation
    */
    
   private static CIMProperty setPropertyValue_Parent(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property PoolID
    *     * <br>
    * This property specifies which ResourcePool the resource is currently allocated from, or which ResourcePool the resource will be allocated from when the allocation occurs.
    *     */

      

               
   public String get_PoolID()    {
       CIMProperty currentProperty = getProperty(PROPERTY_POOLID.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_POOLID.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property PoolID
    * <br>
    * This property specifies which ResourcePool the resource is currently allocated from, or which ResourcePool the resource will be allocated from when the allocation occurs.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_PoolID(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_POOLID.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_PoolID(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_POOLID.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property PoolID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PoolID(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_POOLID.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_PoolID(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_POOLID.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property PoolID
    * <br>
    * This property specifies which ResourcePool the resource is currently allocated from, or which ResourcePool the resource will be allocated from when the allocation occurs.
    */
    
   private static CIMProperty setPropertyValue_PoolID(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Reservation
    *     * <br>
    * This property specifies the amount of resource guaranteed to be available for this allocation. On system which support over-commitment of resources, this value is typically used for admission control to prevent an an allocation from being accepted thus preventing starvation.
    *     */

      

               
   public javax.cim.UnsignedInteger64 get_Reservation()    {
       CIMProperty currentProperty = getProperty(PROPERTY_RESERVATION.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_RESERVATION.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger64)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Reservation
    * <br>
    * This property specifies the amount of resource guaranteed to be available for this allocation. On system which support over-commitment of resources, this value is typically used for admission control to prevent an an allocation from being accepted thus preventing starvation.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Reservation(javax.cim.UnsignedInteger64 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_RESERVATION.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Reservation(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_RESERVATION.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Reservation by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Reservation(WBEMClient client, String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RESERVATION.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Reservation(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_RESERVATION.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Reservation
    * <br>
    * This property specifies the amount of resource guaranteed to be available for this allocation. On system which support over-commitment of resources, this value is typically used for admission control to prevent an an allocation from being accepted thus preventing starvation.
    */
    
   private static CIMProperty setPropertyValue_Reservation(CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property ResourceSubType
    *     * <br>
    * A string describing an implementation specific sub-type for this resource. For example, this may be used to distinguish different models of the same resource type.
    *     */

      

               
   public String get_ResourceSubType()    {
       CIMProperty currentProperty = getProperty(PROPERTY_RESOURCESUBTYPE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_RESOURCESUBTYPE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property ResourceSubType
    * <br>
    * A string describing an implementation specific sub-type for this resource. For example, this may be used to distinguish different models of the same resource type.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_ResourceSubType(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_RESOURCESUBTYPE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_ResourceSubType(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_RESOURCESUBTYPE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property ResourceSubType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ResourceSubType(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RESOURCESUBTYPE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_ResourceSubType(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_RESOURCESUBTYPE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property ResourceSubType
    * <br>
    * A string describing an implementation specific sub-type for this resource. For example, this may be used to distinguish different models of the same resource type.
    */
    
   private static CIMProperty setPropertyValue_ResourceSubType(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property ResourceType
    *     * <br>
    * The type of resource this allocation setting represents.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_ResourceType()    {
       CIMProperty currentProperty = getProperty(PROPERTY_RESOURCETYPE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_RESOURCETYPE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property ResourceType
    * <br>
    * The type of resource this allocation setting represents.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_ResourceType(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_RESOURCETYPE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_ResourceType(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_RESOURCETYPE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property ResourceType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ResourceType(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RESOURCETYPE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_ResourceType(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_RESOURCETYPE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property ResourceType
    * <br>
    * The type of resource this allocation setting represents.
    */
    
   private static CIMProperty setPropertyValue_ResourceType(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property VirtualQuantity
    *     * <br>
    * This property specifies the quantity of resources presented to the consumer. For example, when ResourceType=Processor, this property would reflect the number of discrete Processors presented to the virtual computer system. When ResourceType=Memory, this property could reflect the number of MB reported to the virtual computer system.
    *     */

      

               
   public javax.cim.UnsignedInteger64 get_VirtualQuantity()    {
       CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALQUANTITY.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_VIRTUALQUANTITY.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger64)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property VirtualQuantity
    * <br>
    * This property specifies the quantity of resources presented to the consumer. For example, when ResourceType=Processor, this property would reflect the number of discrete Processors presented to the virtual computer system. When ResourceType=Memory, this property could reflect the number of MB reported to the virtual computer system.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_VirtualQuantity(javax.cim.UnsignedInteger64 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALQUANTITY.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_VirtualQuantity(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_VIRTUALQUANTITY.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property VirtualQuantity by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_VirtualQuantity(WBEMClient client, String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VIRTUALQUANTITY.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_VirtualQuantity(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_VIRTUALQUANTITY.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property VirtualQuantity
    * <br>
    * This property specifies the quantity of resources presented to the consumer. For example, when ResourceType=Processor, this property would reflect the number of discrete Processors presented to the virtual computer system. When ResourceType=Memory, this property could reflect the number of MB reported to the virtual computer system.
    */
    
   private static CIMProperty setPropertyValue_VirtualQuantity(CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Weight
    *     * <br>
    * This property specifies a relative priority for this allocation in relation to other allocations from the same ResourcePool. This property has no unit of measure, and is only relevant when compared to other allocations vying for the same host resources.
    *     */

      

               
   public javax.cim.UnsignedInteger32 get_Weight()    {
       CIMProperty currentProperty = getProperty(PROPERTY_WEIGHT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_WEIGHT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger32)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Weight
    * <br>
    * This property specifies a relative priority for this allocation in relation to other allocations from the same ResourcePool. This property has no unit of measure, and is only relevant when compared to other allocations vying for the same host resources.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Weight(javax.cim.UnsignedInteger32 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_WEIGHT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Weight(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_WEIGHT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Weight by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Weight(WBEMClient client, String namespace, javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_ResourceAllocationSettingData fco = new CIM_ResourceAllocationSettingData(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_WEIGHT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Weight(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_WEIGHT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Weight
    * <br>
    * This property specifies a relative priority for this allocation in relation to other allocations from the same ResourcePool. This property has no unit of measure, and is only relevant when compared to other allocations vying for the same host resources.
    */
    
   private static CIMProperty setPropertyValue_Weight(CIMProperty currentProperty, javax.cim.UnsignedInteger32 newValue)
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
     * Get the list with CIM_VirtualSystemSettingData objects associated by the association CIM_VirtualSystemSettingDataComponent
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_VirtualSystemSettingData> getAssociated_CIM_VirtualSystemSettingData_CIM_VirtualSystemSettingDataComponents(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_VirtualSystemSettingData_CIM_VirtualSystemSettingDataComponents(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT,
     	                CIM_VirtualSystemSettingData.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_VirtualSystemSettingData objects associated by the association CIM_VirtualSystemSettingDataComponent
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
                        
     public java.util.List<CIM_VirtualSystemSettingData> getAssociated_CIM_VirtualSystemSettingData_CIM_VirtualSystemSettingDataComponents(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_VirtualSystemSettingData_CIM_VirtualSystemSettingDataComponents(
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
     * Get the list with CIM_VirtualSystemSettingData objects associated by the association CIM_VirtualSystemSettingDataComponent
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
                        
     public java.util.List<CIM_VirtualSystemSettingData> getAssociated_CIM_VirtualSystemSettingData_CIM_VirtualSystemSettingDataComponents(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_VirtualSystemSettingData> result = new java.util.ArrayList<CIM_VirtualSystemSettingData>();
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
                 CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_ResourceAllocationSettingDataHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_VirtualSystemSettingData(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_VirtualSystemSettingData(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_VirtualSystemSettingData)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_VirtualSystemSettingData(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);
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
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_VirtualSystemSettingData_CIM_VirtualSystemSettingDataComponentNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_VirtualSystemSettingData_CIM_VirtualSystemSettingDataComponentNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_VIRTUALSYSTEMSETTINGDATACOMPONENT,
    	                             CIM_VirtualSystemSettingData.CIM_CLASS_NAME,
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
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_VirtualSystemSettingData_CIM_VirtualSystemSettingDataComponentNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_VirtualSystemSettingData_CIM_VirtualSystemSettingDataComponentNames (
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
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_VirtualSystemSettingData_CIM_VirtualSystemSettingDataComponentNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_VirtualSystemSettingData.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_ResourceAllocationSettingDataHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_VirtualSystemSettingData.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);
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
             CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);

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
           CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);
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
                   CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_ResourceAllocationSettingDataHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_VirtualSystemSettingDataComponent.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);
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
     * Get the list with CIM_ResourcePool objects associated by the association CIM_ResourceAllocationFromPool
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ResourcePool> getAssociated_CIM_ResourcePool_CIM_ResourceAllocationFromPools(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_ResourcePool_CIM_ResourceAllocationFromPools(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL,
     	                CIM_ResourcePool.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ResourcePool objects associated by the association CIM_ResourceAllocationFromPool
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ResourcePool> getAssociated_CIM_ResourcePool_CIM_ResourceAllocationFromPools(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_ResourcePool_CIM_ResourceAllocationFromPools(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ResourcePool objects associated by the association CIM_ResourceAllocationFromPool
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ResourcePool> getAssociated_CIM_ResourcePool_CIM_ResourceAllocationFromPools(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_ResourcePool> result = new java.util.ArrayList<CIM_ResourcePool>();
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
                 CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_ResourceAllocationSettingDataHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_ResourcePool(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_ResourcePool(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_ResourcePool)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_ResourcePool(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);
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
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_ResourceAllocationFromPool
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ResourcePool_CIM_ResourceAllocationFromPoolNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_ResourcePool_CIM_ResourceAllocationFromPoolNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL,
    	                             CIM_ResourcePool.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_ResourceAllocationFromPool
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ResourcePool_CIM_ResourceAllocationFromPoolNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_ResourcePool_CIM_ResourceAllocationFromPoolNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_ResourceAllocationFromPool
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ResourcePool_CIM_ResourceAllocationFromPoolNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL, 
                CIM_ResourcePool.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_ResourceAllocationSettingDataHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ResourcePool.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);
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
    * Get the list with CIM_ResourceAllocationFromPool associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<CIM_ResourceAllocationFromPool> getAssociations_CIM_ResourceAllocationFromPool(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<CIM_ResourceAllocationFromPool> result = new java.util.ArrayList<CIM_ResourceAllocationFromPool>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = CIM_ResourceAllocationFromPoolHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new CIM_ResourceAllocationFromPool(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new CIM_ResourceAllocationFromPool(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((CIM_ResourceAllocationFromPool)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new CIM_ResourceAllocationFromPool(cimInstance));
                   continue;
                }
              }
           }
           CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);
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
    * Get a list of CIMObjectPath items of the associations CIM_ResourceAllocationFromPool
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_CIM_ResourceAllocationFromPool(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_ResourceAllocationSettingDataHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ResourceAllocationFromPool.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_ResourceAllocationSettingDataHelper.checkException(enumeration);
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
    	    return CIM_ResourceAllocationSettingData.CIM_CLASS_NAME;
    }



}