/** 
  * DefineSystemCLIDataContainerImpl.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImpl.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.vm.container.wizard.jsf;

import org.sblim.wbemsmt.exception.*;
import java.util.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class DefineSystemCLIDataContainerImpl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_ReferencedSystem;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Memory;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Processor;

    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Networks;

    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Disks;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_AddDisk;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_RemoveDisk;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_DiskConfigKey;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_DiskConfigValue;

    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_DiskSelector;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_AddNetwork;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_RemoveNetwork;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_NetworkConfigKey;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_NetworkConfigValue;

    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_NetworkSelector;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_ConfigValue;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_ConfigKey;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Execute;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_StartAfterCreation;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_ListOnly;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Sessionkey;

    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_VirtualSystemType;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_DeleteSession;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_CleanupSession;

    	
		
	
	public DefineSystemCLIDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "DefineSystemCLIDataContainer.caption","DefineSystemCLIDataContainer.subTitle",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_ReferencedSystem());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Memory());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Processor());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Networks());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Disks());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_AddDisk());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_RemoveDisk());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_DiskConfigKey());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_DiskConfigValue());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_DiskSelector());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_AddNetwork());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_RemoveNetwork());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_NetworkConfigKey());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_NetworkConfigValue());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_NetworkSelector());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_ConfigValue());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_ConfigKey());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Execute());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_StartAfterCreation());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_ListOnly());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Sessionkey());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_VirtualSystemType());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_DeleteSession());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_CleanupSession());
        					
		setFooter(getPanelForCustomLayout(),"DefineSystemCLIDataContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType LIST
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_ReferencedSystem() {
    		if (ic_usr_ReferencedSystem == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.referencedSystem");
				String binding = expressionPrefix + "_usr_ReferencedSystem.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_ReferencedSystem = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFListComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_ReferencedSystem;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Memory() {
    		if (ic_usr_Memory == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.memory");
				String binding = expressionPrefix + "_usr_Memory.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Memory = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Memory;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Processor() {
    		if (ic_usr_Processor == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.processor");
				String binding = expressionPrefix + "_usr_Processor.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Processor = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Processor;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType LIST
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Networks() {
    		if (ic_usr_Networks == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.networks");
				String binding = expressionPrefix + "_usr_Networks.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_Networks = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFListComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Networks;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType LIST
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Disks() {
    		if (ic_usr_Disks == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.disks");
				String binding = expressionPrefix + "_usr_Disks.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_Disks = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFListComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Disks;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_AddDisk() {
    		if (ic_usr_AddDisk == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.addDisk");
				String binding = expressionPrefix + "_usr_AddDisk.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_AddDisk = new org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_AddDisk;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_RemoveDisk() {
    		if (ic_usr_RemoveDisk == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.removeDisk");
				String binding = expressionPrefix + "_usr_RemoveDisk.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_RemoveDisk = new org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_RemoveDisk;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_DiskConfigKey() {
    		if (ic_usr_DiskConfigKey == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.diskConfigKey");
				String binding = expressionPrefix + "_usr_DiskConfigKey.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_DiskConfigKey = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_DiskConfigKey;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_DiskConfigValue() {
    		if (ic_usr_DiskConfigValue == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.diskConfigValue");
				String binding = expressionPrefix + "_usr_DiskConfigValue.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_DiskConfigValue = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_DiskConfigValue;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType LIST
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_DiskSelector() {
    		if (ic_usr_DiskSelector == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.diskSelector");
				String binding = expressionPrefix + "_usr_DiskSelector.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_DiskSelector = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFListComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_DiskSelector;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_AddNetwork() {
    		if (ic_usr_AddNetwork == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.addNetwork");
				String binding = expressionPrefix + "_usr_AddNetwork.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_AddNetwork = new org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_AddNetwork;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_RemoveNetwork() {
    		if (ic_usr_RemoveNetwork == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.removeNetwork");
				String binding = expressionPrefix + "_usr_RemoveNetwork.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_RemoveNetwork = new org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_RemoveNetwork;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_NetworkConfigKey() {
    		if (ic_usr_NetworkConfigKey == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.networkConfigKey");
				String binding = expressionPrefix + "_usr_NetworkConfigKey.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_NetworkConfigKey = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_NetworkConfigKey;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_NetworkConfigValue() {
    		if (ic_usr_NetworkConfigValue == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.networkConfigValue");
				String binding = expressionPrefix + "_usr_NetworkConfigValue.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_NetworkConfigValue = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_NetworkConfigValue;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType LIST
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_NetworkSelector() {
    		if (ic_usr_NetworkSelector == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.networkSelector");
				String binding = expressionPrefix + "_usr_NetworkSelector.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_NetworkSelector = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFListComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_NetworkSelector;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_ConfigValue() {
    		if (ic_usr_ConfigValue == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.configValue");
				String binding = expressionPrefix + "_usr_ConfigValue.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_ConfigValue = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_ConfigValue;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_ConfigKey() {
    		if (ic_usr_ConfigKey == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.configKey");
				String binding = expressionPrefix + "_usr_ConfigKey.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_ConfigKey = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_ConfigKey;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Execute() {
    		if (ic_usr_Execute == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.execute");
				String binding = expressionPrefix + "_usr_Execute.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Execute = new org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Execute;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_StartAfterCreation() {
    		if (ic_usr_StartAfterCreation == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.startAfterCreation");
				String binding = expressionPrefix + "_usr_StartAfterCreation.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_StartAfterCreation = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_StartAfterCreation;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_ListOnly() {
    		if (ic_usr_ListOnly == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.listOnly");
				String binding = expressionPrefix + "_usr_ListOnly.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_ListOnly = new org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_ListOnly;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Sessionkey() {
    		if (ic_usr_Sessionkey == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.sessionkey");
				String binding = expressionPrefix + "_usr_Sessionkey.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Sessionkey = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
								ic_usr_Sessionkey.setRequired(true);
				;
    		}
			
						
    		return ic_usr_Sessionkey;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType LIST
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_VirtualSystemType() {
    		if (ic_usr_VirtualSystemType == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.virtualSystemType");
				String binding = expressionPrefix + "_usr_VirtualSystemType.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_VirtualSystemType = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFListComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_VirtualSystemType;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_DeleteSession() {
    		if (ic_usr_DeleteSession == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.deleteSession");
				String binding = expressionPrefix + "_usr_DeleteSession.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_DeleteSession = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_DeleteSession;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_CleanupSession() {
    		if (ic_usr_CleanupSession == null)
    		{
				String label = bundle.getString("DefineSystemCLIDataContainer.cleanupSession");
				String binding = expressionPrefix + "_usr_CleanupSession.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_CleanupSession = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_CleanupSession;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_ReferencedSystem != null)
    		{
				ic_usr_ReferencedSystem.setLabelText(bundle.getString("DefineSystemCLIDataContainer.referencedSystem"));
    		}
	    		if (ic_usr_Memory != null)
    		{
				ic_usr_Memory.setLabelText(bundle.getString("DefineSystemCLIDataContainer.memory"));
    		}
	    		if (ic_usr_Processor != null)
    		{
				ic_usr_Processor.setLabelText(bundle.getString("DefineSystemCLIDataContainer.processor"));
    		}
	    		if (ic_usr_Networks != null)
    		{
				ic_usr_Networks.setLabelText(bundle.getString("DefineSystemCLIDataContainer.networks"));
    		}
	    		if (ic_usr_Disks != null)
    		{
				ic_usr_Disks.setLabelText(bundle.getString("DefineSystemCLIDataContainer.disks"));
    		}
	    		if (ic_usr_AddDisk != null)
    		{
				ic_usr_AddDisk.setLabelText(bundle.getString("DefineSystemCLIDataContainer.addDisk"));
    		}
	    		if (ic_usr_RemoveDisk != null)
    		{
				ic_usr_RemoveDisk.setLabelText(bundle.getString("DefineSystemCLIDataContainer.removeDisk"));
    		}
	    		if (ic_usr_DiskConfigKey != null)
    		{
				ic_usr_DiskConfigKey.setLabelText(bundle.getString("DefineSystemCLIDataContainer.diskConfigKey"));
    		}
	    		if (ic_usr_DiskConfigValue != null)
    		{
				ic_usr_DiskConfigValue.setLabelText(bundle.getString("DefineSystemCLIDataContainer.diskConfigValue"));
    		}
	    		if (ic_usr_DiskSelector != null)
    		{
				ic_usr_DiskSelector.setLabelText(bundle.getString("DefineSystemCLIDataContainer.diskSelector"));
    		}
	    		if (ic_usr_AddNetwork != null)
    		{
				ic_usr_AddNetwork.setLabelText(bundle.getString("DefineSystemCLIDataContainer.addNetwork"));
    		}
	    		if (ic_usr_RemoveNetwork != null)
    		{
				ic_usr_RemoveNetwork.setLabelText(bundle.getString("DefineSystemCLIDataContainer.removeNetwork"));
    		}
	    		if (ic_usr_NetworkConfigKey != null)
    		{
				ic_usr_NetworkConfigKey.setLabelText(bundle.getString("DefineSystemCLIDataContainer.networkConfigKey"));
    		}
	    		if (ic_usr_NetworkConfigValue != null)
    		{
				ic_usr_NetworkConfigValue.setLabelText(bundle.getString("DefineSystemCLIDataContainer.networkConfigValue"));
    		}
	    		if (ic_usr_NetworkSelector != null)
    		{
				ic_usr_NetworkSelector.setLabelText(bundle.getString("DefineSystemCLIDataContainer.networkSelector"));
    		}
	    		if (ic_usr_ConfigValue != null)
    		{
				ic_usr_ConfigValue.setLabelText(bundle.getString("DefineSystemCLIDataContainer.configValue"));
    		}
	    		if (ic_usr_ConfigKey != null)
    		{
				ic_usr_ConfigKey.setLabelText(bundle.getString("DefineSystemCLIDataContainer.configKey"));
    		}
	    		if (ic_usr_Execute != null)
    		{
				ic_usr_Execute.setLabelText(bundle.getString("DefineSystemCLIDataContainer.execute"));
    		}
	    		if (ic_usr_StartAfterCreation != null)
    		{
				ic_usr_StartAfterCreation.setLabelText(bundle.getString("DefineSystemCLIDataContainer.startAfterCreation"));
    		}
	    		if (ic_usr_ListOnly != null)
    		{
				ic_usr_ListOnly.setLabelText(bundle.getString("DefineSystemCLIDataContainer.listOnly"));
    		}
	    		if (ic_usr_Sessionkey != null)
    		{
				ic_usr_Sessionkey.setLabelText(bundle.getString("DefineSystemCLIDataContainer.sessionkey"));
    		}
	    		if (ic_usr_VirtualSystemType != null)
    		{
				ic_usr_VirtualSystemType.setLabelText(bundle.getString("DefineSystemCLIDataContainer.virtualSystemType"));
    		}
	    		if (ic_usr_DeleteSession != null)
    		{
				ic_usr_DeleteSession.setLabelText(bundle.getString("DefineSystemCLIDataContainer.deleteSession"));
    		}
	    		if (ic_usr_CleanupSession != null)
    		{
				ic_usr_CleanupSession.setLabelText(bundle.getString("DefineSystemCLIDataContainer.cleanupSession"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesVm"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    		}


	/**
	 * count and create childrens
	 * @throws WbemsmtException
	 */
	public void updateControls() throws WbemsmtException {
			   countAndCreateChildren();
			   adapter.updateControls(this);
		
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_usr_ReferencedSystem());
    				fields.add(get_usr_Memory());
    				fields.add(get_usr_Processor());
    				fields.add(get_usr_Networks());
    				fields.add(get_usr_Disks());
    				fields.add(get_usr_AddDisk());
    				fields.add(get_usr_RemoveDisk());
    				fields.add(get_usr_DiskConfigKey());
    				fields.add(get_usr_DiskConfigValue());
    				fields.add(get_usr_DiskSelector());
    				fields.add(get_usr_AddNetwork());
    				fields.add(get_usr_RemoveNetwork());
    				fields.add(get_usr_NetworkConfigKey());
    				fields.add(get_usr_NetworkConfigValue());
    				fields.add(get_usr_NetworkSelector());
    				fields.add(get_usr_ConfigValue());
    				fields.add(get_usr_ConfigKey());
    				fields.add(get_usr_Execute());
    				fields.add(get_usr_StartAfterCreation());
    				fields.add(get_usr_ListOnly());
    				fields.add(get_usr_Sessionkey());
    				fields.add(get_usr_VirtualSystemType());
    				fields.add(get_usr_DeleteSession());
    				fields.add(get_usr_CleanupSession());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       DefineSystemCLIDataContainerImpl source = (DefineSystemCLIDataContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_ReferencedSystem().copyFrom(source.get_usr_ReferencedSystem());
		        		   get_usr_Memory().copyFrom(source.get_usr_Memory());
		        		   get_usr_Processor().copyFrom(source.get_usr_Processor());
		        		   get_usr_Networks().copyFrom(source.get_usr_Networks());
		        		   get_usr_Disks().copyFrom(source.get_usr_Disks());
		        		   get_usr_AddDisk().copyFrom(source.get_usr_AddDisk());
		        		   get_usr_RemoveDisk().copyFrom(source.get_usr_RemoveDisk());
		        		   get_usr_DiskConfigKey().copyFrom(source.get_usr_DiskConfigKey());
		        		   get_usr_DiskConfigValue().copyFrom(source.get_usr_DiskConfigValue());
		        		   get_usr_DiskSelector().copyFrom(source.get_usr_DiskSelector());
		        		   get_usr_AddNetwork().copyFrom(source.get_usr_AddNetwork());
		        		   get_usr_RemoveNetwork().copyFrom(source.get_usr_RemoveNetwork());
		        		   get_usr_NetworkConfigKey().copyFrom(source.get_usr_NetworkConfigKey());
		        		   get_usr_NetworkConfigValue().copyFrom(source.get_usr_NetworkConfigValue());
		        		   get_usr_NetworkSelector().copyFrom(source.get_usr_NetworkSelector());
		        		   get_usr_ConfigValue().copyFrom(source.get_usr_ConfigValue());
		        		   get_usr_ConfigKey().copyFrom(source.get_usr_ConfigKey());
		        		   get_usr_Execute().copyFrom(source.get_usr_Execute());
		        		   get_usr_StartAfterCreation().copyFrom(source.get_usr_StartAfterCreation());
		        		   get_usr_ListOnly().copyFrom(source.get_usr_ListOnly());
		        		   get_usr_Sessionkey().copyFrom(source.get_usr_Sessionkey());
		        		   get_usr_VirtualSystemType().copyFrom(source.get_usr_VirtualSystemType());
		        		   get_usr_DeleteSession().copyFrom(source.get_usr_DeleteSession());
		        		   get_usr_CleanupSession().copyFrom(source.get_usr_CleanupSession());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}