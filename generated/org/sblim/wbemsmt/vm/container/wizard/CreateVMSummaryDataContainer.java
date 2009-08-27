/** 
  * CreateVMSummaryDataContainer.java
  *
  * 
  * Â© Copyright IBM Corp.  2009,2006,2007
  *
  * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.vm.container.wizard;

public interface CreateVMSummaryDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_USR_REFERENCEDSYSTEM = "usr_ReferencedSystem" ;
			public static final String FIELD_USR_HOSTSYSTEM = "usr_Hostsystem" ;
			public static final String FIELD_PROCESSOR = "Processor" ;
			public static final String FIELD_MEMORY = "Memory" ;
			public static final String FIELD_USR_STARTCONTAINER = "usr_StartContainer" ;
				public static final String ROLE_CONFIGITEMS = "configItems";
			public static final String ROLE_DISKS = "disks";
			public static final String ROLE_NETWORKS = "networks";
	
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType LABEL<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_ReferencedSystem();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType LABEL<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Hostsystem();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType LABEL<br>
		* Relation to FCO: Metacluster_ComputerSystem.get_ContainerName<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Processor();
			
		/**
		* <br>
		* DataType STRING<br>
		* UIType LABEL<br>
		* Relation to FCO: Metacluster_ComputerSystem.get_ApplicationExecutedCmd<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Memory();
			
		/**
		* <br>
		* DataType BOOLEAN<br>
		* UIType CHECKBOX<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_StartContainer();
	
	
	/** 
	 * Linked DataContainers
	 **/
			
				
		/**
		* 
		* linked container SummaryConfigItemDataContainer
		*/

				
		public java.util.List<SummaryConfigItemDataContainer> getConfigItems();
		
		
	   		
	   /**
		* Header for:
		* 
		* linked container SummaryConfigItemDataContainer
		*/
		public  org.sblim.wbemsmt.vm.container.wizard.SummaryConfigItemDataContainerHeader getConfigItemsHeader();
		
					
				
		/**
		* 
		* linked container SummaryDiskItemDataContainer
		*/

				
		public java.util.List<SummaryDiskItemDataContainer> getDisks();
		
		
	   		
	   /**
		* Header for:
		* 
		* linked container SummaryDiskItemDataContainer
		*/
		public  org.sblim.wbemsmt.vm.container.wizard.SummaryDiskItemDataContainerHeader getDisksHeader();
		
					
				
		/**
		* 
		* linked container SummaryNetworkItemDataContainer
		*/

				
		public java.util.List<SummaryNetworkItemDataContainer> getNetworks();
		
		
	   		
	   /**
		* Header for:
		* 
		* linked container SummaryNetworkItemDataContainer
		*/
		public  org.sblim.wbemsmt.vm.container.wizard.SummaryNetworkItemDataContainerHeader getNetworksHeader();
		
			
}