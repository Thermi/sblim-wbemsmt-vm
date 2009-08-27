/** 
  * WelcomeDataContainer.java
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

package org.sblim.wbemsmt.vm.container.edit;

public interface WelcomeDataContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
			public static final String FIELD_USR_PICTURE = "usr_Picture" ;
			public static final String FIELD_USR_WELCOMETEXT = "usr_Welcometext" ;
			public static final String FIELD_USR_CREATELINK = "usr_CreateLink" ;
				public static final String ROLE_ITEMS = "items";
	
	
	/** 
	 * Defined Fields
	 **/
			
		/**
		* <br>
		* DataType PICTUREDATA<br>
		* UIType PICTURE<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Picture();
			
		/**
		* <br>
		* DataType MEMODATA<br>
		* UIType MEMO<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Welcometext();
			
		/**
		* <br>
		* DataType LINKDATA<br>
		* UIType LINK<br>
		* Relation to FCO: userdefined<br>
		*/
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_CreateLink();
	
	
	/** 
	 * Linked DataContainers
	 **/
			
				
		/**
		* 
		* linked container WelcomeItemDataContainer
		*/

				
		public java.util.List<WelcomeItemDataContainer> getItems();
		
		
	   		
	   /**
		* Header for:
		* 
		* linked container WelcomeItemDataContainer
		*/
		public  org.sblim.wbemsmt.vm.container.edit.WelcomeItemDataContainerHeader getItemsHeader();
		
			
}