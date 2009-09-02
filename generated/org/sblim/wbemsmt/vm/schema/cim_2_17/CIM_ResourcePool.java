/** 
  * CIM_ResourcePool.java
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
  * Description: A ResourcePool is a logical entity (with associated controls)provided by the host system for the purpose of allocation and assignment of resources. A given ResourcePool may be used to allocate resources of a specific type. Hierarchies of ResourcePools may be created to provide administrative control over allocations. In the cases where resources are subdivided, multiple resource pools may exist (e.g. nodal boundaries in NUMA-like systems). In systems that support over commitment, pools represent the reservable capacity, not an upper bound or limit on the maximum amount that can be allocated. Admission control during power on may detect and prevent systems from powering due to resource exhaustion. For example, over commitment on a ResourcePool with ResourceType=Memory would require that sufficient space be available in some backing-store, that may be managed through a storage ResourcePool.
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
public class CIM_ResourcePool extends  CIM_LogicalElement {



   public final static String CIM_CLASS_NAME = "CIM_ResourcePool";
   public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    
    /**
     * ElementAllocatedFromPool associates an instance of CIM_LogicalElement representing an allocated Resource with the CIM_ResourcePool from which it was allocated.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL = "CIM_ElementAllocatedFromPool";
    
    /**
     * HostedResourcePool is a specialization of the SystemComponent association that establishes that the ResourcePool is defined in the context of the System
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL = "CIM_HostedResourcePool";
    
    /**
     * ResourceAllocationFromPool associates an instance of CIM_ResourceAllocationSettingData representing a resource allocation with the CIM_ResourcePool from which it is allocated.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL = "CIM_ResourceAllocationFromPool";
    
    
    
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
	     * Constants of property Capacity
     * This property represents the maximum amount (in units of AllocationUnits) of reservations that the ResourcePool can support.
     */
    public static class PROPERTY_CAPACITY
    {
       /**
        * name of the property Capacity
        */
       public final static String NAME = "Capacity";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property InstanceID
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following "preferred" algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness, <OrgID> must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above "preferred" algorithm is not used, the defining entity must ensure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. 
     * For DMTF-defined instances, the "preferred" algorithm must be used with the <OrgID> set to CIM.
     */
    public static class PROPERTY_INSTANCEID
    {
       /**
        * name of the property InstanceID
        */
       public final static String NAME = "InstanceID";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property OtherResourceType
     * A string that describes the resource type when a well defined value is not available and ResourceType is set to 0 for Other.
     */
    public static class PROPERTY_OTHERRESOURCETYPE
    {
       /**
        * name of the property OtherResourceType
        */
       public final static String NAME = "OtherResourceType";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property PoolID
     * An opaque identifier for the pool. This property is used to provide correlation across save and restore of configuration data to underlying persistent storage.
     */
    public static class PROPERTY_POOLID
    {
       /**
        * name of the property PoolID
        */
       public final static String NAME = "PoolID";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Primordial
     * If true, "Primordial" indicates that this ResourcePool is a base from which resources are drawn and returned in the activity of resource management. Being primordial means that this ResourcePool shall not be created or deleted by consumers of this model. However, other actions, modeled or not, may affect the characteristics or size of primordial ResourcePools. If false, "Primordial" indicates that the ResourcePool, a concrete Resource Pool, is subject to resource allocation services functions. This distinction is important because higher-level ResourcePools may be assembled using the Component or ElementAllocatedFromPool associations. Although the higher-level abstractions can be created and deleted, the most basic, (i.e. primordial), hardware-based ResourcePools cannot. They are physically realized as part of the System, or are actually managed by some other System and imported as if they were physically realized.
     */
    public static class PROPERTY_PRIMORDIAL
    {
       /**
        * name of the property Primordial
        */
       public final static String NAME = "Primordial";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Reserved
     * This property represents the current reservations (in units of AllocationUnits) spread across all active allocations from this pool. In a hierarchical configuration, this represents the sum of all descendant ResourcePool current reservations.
     */
    public static class PROPERTY_RESERVED
    {
       /**
        * name of the property Reserved
        */
       public final static String NAME = "Reserved";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property ResourceSubType
     * A string describing an implementation specific sub-type for this pool. For example, this may be used to distinguish different models of the same resource type.
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
     * The type of resource this ResourcePool may allocate.
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
	    	    

   

    
    static {    
           addPackage("org.sblim.wbemsmt.vm.schema.cim_2_17");
                         String[] parentClassPackageList = CIM_LogicalElement.getPackages();
        
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
    *   A ResourcePool is a logical entity (with associated controls)provided by the host system for the purpose of allocation and assignment of resources. A given ResourcePool may be used to allocate resources of a specific type. Hierarchies of ResourcePools may be created to provide administrative control over allocations. In the cases where resources are subdivided, multiple resource pools may exist (e.g. nodal boundaries in NUMA-like systems). In systems that support over commitment, pools represent the reservable capacity, not an upper bound or limit on the maximum amount that can be allocated. Admission control during power on may detect and prevent systems from powering due to resource exhaustion. For example, over commitment on a ResourcePool with ResourceType=Memory would require that sufficient space be available in some backing-store, that may be managed through a storage ResourcePool.
    *   @param client the CIM Client
    *   @param namespace the target namespace
    */  

      
   public CIM_ResourcePool(WBEMClient client, String namespace) throws WbemsmtException
   {
       CIMClass cls = getClass(client,namespace);
       setFromServer(false);
       init(cls.newInstance(),true);
   }
        
   /**
    *   Class constructor
    * 
    *       *   <br>
    *   A ResourcePool is a logical entity (with associated controls)provided by the host system for the purpose of allocation and assignment of resources. A given ResourcePool may be used to allocate resources of a specific type. Hierarchies of ResourcePools may be created to provide administrative control over allocations. In the cases where resources are subdivided, multiple resource pools may exist (e.g. nodal boundaries in NUMA-like systems). In systems that support over commitment, pools represent the reservable capacity, not an upper bound or limit on the maximum amount that can be allocated. Admission control during power on may detect and prevent systems from powering due to resource exhaustion. For example, over commitment on a ResourcePool with ResourceType=Memory would require that sufficient space be available in some backing-store, that may be managed through a storage ResourcePool.
    *   @param cimInstance the instance that is used to create the Object
    */  
   
   public CIM_ResourcePool(CIMInstance cimInstance)  throws WbemsmtException { 
        
       if (cimInstance == null) {
           throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimInstance parameter does not contain a valid reference.");
       }
       setFromServer(true);
       init(cimInstance,false);
   }
   
   /**
    * Default constructor
    */
   protected CIM_ResourcePool()
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
              propertiesToCheck.put("AllocationUnits",new CIMProperty("AllocationUnits",CIMDataType.STRING_T,null));
              propertiesToCheck.put("Capacity",new CIMProperty("Capacity",CIMDataType.UINT64_T,null));
              propertiesToCheck.put("InstanceID",new CIMProperty("InstanceID",CIMDataType.STRING_T,null));
              propertiesToCheck.put("OtherResourceType",new CIMProperty("OtherResourceType",CIMDataType.STRING_T,null));
              propertiesToCheck.put("PoolID",new CIMProperty("PoolID",CIMDataType.STRING_T,null));
              propertiesToCheck.put("Primordial",new CIMProperty("Primordial",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("Reserved",new CIMProperty("Reserved",CIMDataType.UINT64_T,null));
              propertiesToCheck.put("ResourceSubType",new CIMProperty("ResourceSubType",CIMDataType.STRING_T,null));
              propertiesToCheck.put("ResourceType",new CIMProperty("ResourceType",CIMDataType.UINT16_T,null));
       	
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
        CIM_ResourcePool fco = new CIM_ResourcePool(client,namespace);
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
    * Get the property Capacity
    *     * <br>
    * This property represents the maximum amount (in units of AllocationUnits) of reservations that the ResourcePool can support.
    *     */

      

               
   public javax.cim.UnsignedInteger64 get_Capacity()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CAPACITY.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CAPACITY.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger64)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Capacity
    * <br>
    * This property represents the maximum amount (in units of AllocationUnits) of reservations that the ResourcePool can support.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Capacity(javax.cim.UnsignedInteger64 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CAPACITY.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Capacity(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CAPACITY.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Capacity by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Capacity(WBEMClient client, String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_ResourcePool fco = new CIM_ResourcePool(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CAPACITY.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Capacity(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CAPACITY.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Capacity
    * <br>
    * This property represents the maximum amount (in units of AllocationUnits) of reservations that the ResourcePool can support.
    */
    
   private static CIMProperty setPropertyValue_Capacity(CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property InstanceID
    *     * <br>
    * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following "preferred" algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness, <OrgID> must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above "preferred" algorithm is not used, the defining entity must ensure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. 
     * For DMTF-defined instances, the "preferred" algorithm must be used with the <OrgID> set to CIM.
    *     */

      

               
   public String get_key_InstanceID()    {
       CIMProperty currentProperty = getProperty(PROPERTY_INSTANCEID.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property InstanceID
    * <br>
    * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following "preferred" algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness, <OrgID> must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above "preferred" algorithm is not used, the defining entity must ensure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. 
     * For DMTF-defined instances, the "preferred" algorithm must be used with the <OrgID> set to CIM.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_InstanceID(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_INSTANCEID.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_InstanceID(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance " + getCimObjectPath());
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

    public static CIMProperty create_key_InstanceID(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_ResourcePool fco = new CIM_ResourcePool(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INSTANCEID.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_InstanceID(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property InstanceID
    * <br>
    * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following "preferred" algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness, <OrgID> must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above "preferred" algorithm is not used, the defining entity must ensure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. 
     * For DMTF-defined instances, the "preferred" algorithm must be used with the <OrgID> set to CIM.
    */
    
   private static CIMProperty setPropertyValue_key_InstanceID(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property OtherResourceType
    *     * <br>
    * A string that describes the resource type when a well defined value is not available and ResourceType is set to 0 for Other.
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
    * A string that describes the resource type when a well defined value is not available and ResourceType is set to 0 for Other.
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
        CIM_ResourcePool fco = new CIM_ResourcePool(client,namespace);
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
    * A string that describes the resource type when a well defined value is not available and ResourceType is set to 0 for Other.
    */
    
   private static CIMProperty setPropertyValue_OtherResourceType(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property PoolID
    *     * <br>
    * An opaque identifier for the pool. This property is used to provide correlation across save and restore of configuration data to underlying persistent storage.
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
    * An opaque identifier for the pool. This property is used to provide correlation across save and restore of configuration data to underlying persistent storage.
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
        CIM_ResourcePool fco = new CIM_ResourcePool(client,namespace);
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
    * An opaque identifier for the pool. This property is used to provide correlation across save and restore of configuration data to underlying persistent storage.
    */
    
   private static CIMProperty setPropertyValue_PoolID(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Primordial
    *     * <br>
    * If true, "Primordial" indicates that this ResourcePool is a base from which resources are drawn and returned in the activity of resource management. Being primordial means that this ResourcePool shall not be created or deleted by consumers of this model. However, other actions, modeled or not, may affect the characteristics or size of primordial ResourcePools. If false, "Primordial" indicates that the ResourcePool, a concrete Resource Pool, is subject to resource allocation services functions. This distinction is important because higher-level ResourcePools may be assembled using the Component or ElementAllocatedFromPool associations. Although the higher-level abstractions can be created and deleted, the most basic, (i.e. primordial), hardware-based ResourcePools cannot. They are physically realized as part of the System, or are actually managed by some other System and imported as if they were physically realized.
    *     */

      

               
   public Boolean get_Primordial()    {
       CIMProperty currentProperty = getProperty(PROPERTY_PRIMORDIAL.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_PRIMORDIAL.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Primordial
    * <br>
    * If true, "Primordial" indicates that this ResourcePool is a base from which resources are drawn and returned in the activity of resource management. Being primordial means that this ResourcePool shall not be created or deleted by consumers of this model. However, other actions, modeled or not, may affect the characteristics or size of primordial ResourcePools. If false, "Primordial" indicates that the ResourcePool, a concrete Resource Pool, is subject to resource allocation services functions. This distinction is important because higher-level ResourcePools may be assembled using the Component or ElementAllocatedFromPool associations. Although the higher-level abstractions can be created and deleted, the most basic, (i.e. primordial), hardware-based ResourcePools cannot. They are physically realized as part of the System, or are actually managed by some other System and imported as if they were physically realized.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Primordial(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_PRIMORDIAL.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Primordial(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_PRIMORDIAL.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Primordial by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Primordial(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        CIM_ResourcePool fco = new CIM_ResourcePool(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRIMORDIAL.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Primordial(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_PRIMORDIAL.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Primordial
    * <br>
    * If true, "Primordial" indicates that this ResourcePool is a base from which resources are drawn and returned in the activity of resource management. Being primordial means that this ResourcePool shall not be created or deleted by consumers of this model. However, other actions, modeled or not, may affect the characteristics or size of primordial ResourcePools. If false, "Primordial" indicates that the ResourcePool, a concrete Resource Pool, is subject to resource allocation services functions. This distinction is important because higher-level ResourcePools may be assembled using the Component or ElementAllocatedFromPool associations. Although the higher-level abstractions can be created and deleted, the most basic, (i.e. primordial), hardware-based ResourcePools cannot. They are physically realized as part of the System, or are actually managed by some other System and imported as if they were physically realized.
    */
    
   private static CIMProperty setPropertyValue_Primordial(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Reserved
    *     * <br>
    * This property represents the current reservations (in units of AllocationUnits) spread across all active allocations from this pool. In a hierarchical configuration, this represents the sum of all descendant ResourcePool current reservations.
    *     */

      

               
   public javax.cim.UnsignedInteger64 get_Reserved()    {
       CIMProperty currentProperty = getProperty(PROPERTY_RESERVED.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_RESERVED.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger64)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Reserved
    * <br>
    * This property represents the current reservations (in units of AllocationUnits) spread across all active allocations from this pool. In a hierarchical configuration, this represents the sum of all descendant ResourcePool current reservations.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Reserved(javax.cim.UnsignedInteger64 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_RESERVED.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Reserved(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_RESERVED.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Reserved by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Reserved(WBEMClient client, String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_ResourcePool fco = new CIM_ResourcePool(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RESERVED.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Reserved(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_RESERVED.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Reserved
    * <br>
    * This property represents the current reservations (in units of AllocationUnits) spread across all active allocations from this pool. In a hierarchical configuration, this represents the sum of all descendant ResourcePool current reservations.
    */
    
   private static CIMProperty setPropertyValue_Reserved(CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property ResourceSubType
    *     * <br>
    * A string describing an implementation specific sub-type for this pool. For example, this may be used to distinguish different models of the same resource type.
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
    * A string describing an implementation specific sub-type for this pool. For example, this may be used to distinguish different models of the same resource type.
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
        CIM_ResourcePool fco = new CIM_ResourcePool(client,namespace);
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
    * A string describing an implementation specific sub-type for this pool. For example, this may be used to distinguish different models of the same resource type.
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
    * The type of resource this ResourcePool may allocate.
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
    * The type of resource this ResourcePool may allocate.
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
        CIM_ResourcePool fco = new CIM_ResourcePool(client,namespace);
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
    * The type of resource this ResourcePool may allocate.
    */
    
   private static CIMProperty setPropertyValue_ResourceType(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
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
     * Get the list with CIM_LogicalElement objects associated by the association CIM_ElementAllocatedFromPool
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_LogicalElement> getAssociated_CIM_LogicalElement_CIM_ElementAllocatedFromPools(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_LogicalElement_CIM_ElementAllocatedFromPools(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL,
     	                CIM_LogicalElement.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_LogicalElement objects associated by the association CIM_ElementAllocatedFromPool
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_LogicalElement> getAssociated_CIM_LogicalElement_CIM_ElementAllocatedFromPools(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_LogicalElement_CIM_ElementAllocatedFromPools(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_LogicalElement objects associated by the association CIM_ElementAllocatedFromPool
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_LogicalElement> getAssociated_CIM_LogicalElement_CIM_ElementAllocatedFromPools(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_LogicalElement> result = new java.util.ArrayList<CIM_LogicalElement>();
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
                 CIM_ResourcePoolHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_ResourcePoolHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_ResourcePoolHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_LogicalElement(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_LogicalElement(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_LogicalElement)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_LogicalElement(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_ResourcePoolHelper.checkException(enumeration);
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
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementAllocatedFromPool
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_LogicalElement_CIM_ElementAllocatedFromPoolNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_LogicalElement_CIM_ElementAllocatedFromPoolNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL,
    	                             CIM_LogicalElement.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementAllocatedFromPool
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_LogicalElement_CIM_ElementAllocatedFromPoolNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_LogicalElement_CIM_ElementAllocatedFromPoolNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementAllocatedFromPool
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_LogicalElement_CIM_ElementAllocatedFromPoolNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL, 
                CIM_LogicalElement.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_ResourcePoolHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_ResourcePoolHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_LogicalElement.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_ResourcePoolHelper.checkException(enumeration);
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
    * Get the list with CIM_ElementAllocatedFromPool associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<CIM_ElementAllocatedFromPool> getAssociations_CIM_ElementAllocatedFromPool(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<CIM_ElementAllocatedFromPool> result = new java.util.ArrayList<CIM_ElementAllocatedFromPool>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             CIM_ResourcePoolHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_ResourcePoolHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = CIM_ElementAllocatedFromPoolHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new CIM_ElementAllocatedFromPool(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new CIM_ElementAllocatedFromPool(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((CIM_ElementAllocatedFromPool)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new CIM_ElementAllocatedFromPool(cimInstance));
                   continue;
                }
              }
           }
           CIM_ResourcePoolHelper.checkException(enumeration);
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
    * Get a list of CIMObjectPath items of the associations CIM_ElementAllocatedFromPool
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_CIM_ElementAllocatedFromPool(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTALLOCATEDFROMPOOL, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   CIM_ResourcePoolHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_ResourcePoolHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ElementAllocatedFromPool.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_ResourcePoolHelper.checkException(enumeration);
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
     * Get the list with CIM_System objects associated by the association CIM_HostedResourcePool
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_System> getAssociated_CIM_System_CIM_HostedResourcePools(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_System_CIM_HostedResourcePools(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL,
     	                CIM_System.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_System objects associated by the association CIM_HostedResourcePool
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_System> getAssociated_CIM_System_CIM_HostedResourcePools(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_System_CIM_HostedResourcePools(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_System objects associated by the association CIM_HostedResourcePool
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_System> getAssociated_CIM_System_CIM_HostedResourcePools(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

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
                 CIM_ResourcePoolHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_ResourcePoolHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_ResourcePoolHelper.findClass(cimClient, cimInstance);
                    
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
             CIM_ResourcePoolHelper.checkException(enumeration);
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
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_HostedResourcePool
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_System_CIM_HostedResourcePoolNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_System_CIM_HostedResourcePoolNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL,
    	                             CIM_System.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_HostedResourcePool
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_System_CIM_HostedResourcePoolNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_System_CIM_HostedResourcePoolNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_HostedResourcePool
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_System_CIM_HostedResourcePoolNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL, 
                CIM_System.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_ResourcePoolHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_ResourcePoolHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_System.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_ResourcePoolHelper.checkException(enumeration);
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
    * Get the list with CIM_HostedResourcePool associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<CIM_HostedResourcePool> getAssociations_CIM_HostedResourcePool(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<CIM_HostedResourcePool> result = new java.util.ArrayList<CIM_HostedResourcePool>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             CIM_ResourcePoolHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_ResourcePoolHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = CIM_HostedResourcePoolHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new CIM_HostedResourcePool(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new CIM_HostedResourcePool(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((CIM_HostedResourcePool)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new CIM_HostedResourcePool(cimInstance));
                   continue;
                }
              }
           }
           CIM_ResourcePoolHelper.checkException(enumeration);
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
    * Get a list of CIMObjectPath items of the associations CIM_HostedResourcePool
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_CIM_HostedResourcePool(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDRESOURCEPOOL, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   CIM_ResourcePoolHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_ResourcePoolHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_HostedResourcePool.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_ResourcePoolHelper.checkException(enumeration);
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
     * Get the list with CIM_ResourceAllocationSettingData objects associated by the association CIM_ResourceAllocationFromPool
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ResourceAllocationSettingData> getAssociated_CIM_ResourceAllocationSettingData_CIM_ResourceAllocationFromPools(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_ResourceAllocationSettingData_CIM_ResourceAllocationFromPools(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL,
     	                CIM_ResourceAllocationSettingData.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ResourceAllocationSettingData objects associated by the association CIM_ResourceAllocationFromPool
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
                        
     public java.util.List<CIM_ResourceAllocationSettingData> getAssociated_CIM_ResourceAllocationSettingData_CIM_ResourceAllocationFromPools(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_ResourceAllocationSettingData_CIM_ResourceAllocationFromPools(
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
     * Get the list with CIM_ResourceAllocationSettingData objects associated by the association CIM_ResourceAllocationFromPool
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
                        
     public java.util.List<CIM_ResourceAllocationSettingData> getAssociated_CIM_ResourceAllocationSettingData_CIM_ResourceAllocationFromPools(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

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
                 CIM_ResourcePoolHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_ResourcePoolHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_ResourcePoolHelper.findClass(cimClient, cimInstance);
                    
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
             CIM_ResourcePoolHelper.checkException(enumeration);
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
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ResourceAllocationSettingData_CIM_ResourceAllocationFromPoolNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_ResourceAllocationSettingData_CIM_ResourceAllocationFromPoolNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_RESOURCEALLOCATIONFROMPOOL,
    	                             CIM_ResourceAllocationSettingData.CIM_CLASS_NAME,
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
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ResourceAllocationSettingData_CIM_ResourceAllocationFromPoolNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_ResourceAllocationSettingData_CIM_ResourceAllocationFromPoolNames (
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
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ResourceAllocationSettingData_CIM_ResourceAllocationFromPoolNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ResourceAllocationSettingData.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_ResourcePoolHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_ResourcePoolHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ResourceAllocationSettingData.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_ResourcePoolHelper.checkException(enumeration);
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
             CIM_ResourcePoolHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_ResourcePoolHelper.checkException(enumeration);

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
           CIM_ResourcePoolHelper.checkException(enumeration);
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
                   CIM_ResourcePoolHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_ResourcePoolHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ResourceAllocationFromPool.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_ResourcePoolHelper.checkException(enumeration);
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
    	    return CIM_ResourcePool.CIM_CLASS_NAME;
    }



}