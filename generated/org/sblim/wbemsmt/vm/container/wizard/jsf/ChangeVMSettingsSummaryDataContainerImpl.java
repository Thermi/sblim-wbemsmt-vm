/** 
  * ChangeVMSettingsSummaryDataContainerImpl.java
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

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;
import org.sblim.wbemsmt.vm.container.wizard.SummaryConfigItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.SummaryDiskItemDataContainer;
import org.sblim.wbemsmt.vm.container.wizard.SummaryNetworkItemDataContainer;

public class ChangeVMSettingsSummaryDataContainerImpl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.vm.container.wizard.ChangeVMSettingsSummaryDataContainer
			, org.sblim.wbemsmt.vm.container.wizard.SummaryConfigItemDataContainerHeader		
			, org.sblim.wbemsmt.vm.container.wizard.SummaryDiskItemDataContainerHeader		
			, org.sblim.wbemsmt.vm.container.wizard.SummaryNetworkItemDataContainerHeader		
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_System;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Hostsystem;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Processor;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Memory;

    			
				private java.util.List<SummaryConfigItemDataContainer> icConfigItems = new java.util.ArrayList<SummaryConfigItemDataContainer>();
		
		private MultiLinePanel configItemsPanel;
		private int configItemsCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icConfigItemsHeader_usr_Name;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icConfigItemsHeader_usr_CurrentValue;
				
			
				private java.util.List<SummaryDiskItemDataContainer> icDisks = new java.util.ArrayList<SummaryDiskItemDataContainer>();
		
		private MultiLinePanel disksPanel;
		private int disksCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_FromPool;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Path;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Field1;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Field2;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Field3;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Field4;
				
			
				private java.util.List<SummaryNetworkItemDataContainer> icNetworks = new java.util.ArrayList<SummaryNetworkItemDataContainer>();
		
		private MultiLinePanel networksPanel;
		private int networksCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_FromPool;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Mac;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Field1;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Field2;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Field3;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Field4;
				
	
		
	
	public ChangeVMSettingsSummaryDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "ChangeVMSettingsSummaryDataContainer.caption","ChangeVMSettingsSummaryDataContainer.subTitle",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_System());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Hostsystem());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_Processor());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_Memory());
        					
		setFooter(getPanelForCustomLayout(),"ChangeVMSettingsSummaryDataContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_System() {
    		if (ic_usr_System == null)
    		{
				String label = bundle.getString("ChangeVMSettingsSummaryDataContainer.system");
				String binding = expressionPrefix + "_usr_System.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_usr_System = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_System;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Hostsystem() {
    		if (ic_usr_Hostsystem == null)
    		{
				String label = bundle.getString("ChangeVMSettingsSummaryDataContainer.hostsystem");
				String binding = expressionPrefix + "_usr_Hostsystem.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_usr_Hostsystem = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Hostsystem;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Processor() {
    		if (ic_Processor == null)
    		{
				String label = bundle.getString("ChangeVMSettingsSummaryDataContainer.Processor");
				String binding = expressionPrefix + "_Processor.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_Processor = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_Processor;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Memory() {
    		if (ic_Memory == null)
    		{
				String label = bundle.getString("ChangeVMSettingsSummaryDataContainer.Memory");
				String binding = expressionPrefix + "_Memory.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_Memory = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_Memory;
    	}
		
			
				
		/**
		* 
		* linked container SummaryConfigItemDataContainer
		*/
				public java.util.List<SummaryConfigItemDataContainer> getConfigItems()
				{
						return icConfigItems;
		}
		
		public MultiLinePanel getConfigItemsPanel()
		{
			if (configItemsPanel == null)
			{
  			   configItemsPanel = new ConfigItemsPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "configItemsPanel", // binding for Title
							  "SummaryConfigItemDataContainer_AsConfigItems_InChangeVMSettingsSummaryDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryConfigItemDataContainer_AsConfigItems_InChangeVMSettingsSummaryDataContainerImpl.COLS);
			  addConfigItemsHeader();							  
			}		
			
			return configItemsPanel;
		}

		static class ConfigItemsPanel extends MultiLinePanel
		{
			public ConfigItemsPanel(AbstractBaseCimAdapter adapter, String expressionPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, expressionPrefix, bindigForTitle, keyForTitle, "configItems", cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryConfigItemDataContainer_AsConfigItems_InChangeVMSettingsSummaryDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addConfigItems(org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryConfigItemDataContainer_AsConfigItems_InChangeVMSettingsSummaryDataContainerImpl child) {

		getConfigItems().add(child);
		getConfigItemsPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getConfigItems_usr_NameHeader()).getDependentChildFields().add(child.get_usr_Name());
					//((LabeledJSFInputComponent)getConfigItems_usr_CurrentValueHeader()).getDependentChildFields().add(child.get_usr_CurrentValue());
			}
	
	private void clearConfigItems() {
		getConfigItems().clear();
	}

	/**
	* 
	* Get the ConfigItems for the UI repesentation
	*/
	public java.util.List<SummaryConfigItemDataContainer> getConfigItemsForUI()
	{
				
		List<SummaryConfigItemDataContainer> result = new ArrayList<SummaryConfigItemDataContainer>();
		result.addAll(icConfigItems);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryConfigItemDataContainer_AsConfigItems_InChangeVMSettingsSummaryDataContainerImpl item = new org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryConfigItemDataContainer_AsConfigItems_InChangeVMSettingsSummaryDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, result.size());
				DataContainerUtil.setVisibilityOfFields(item,false);
				result.add(item);
			} catch (WbemsmtException e) {
				e.printStackTrace();
			}
		}
		
		configItemsPanel.setList(result);
		
		return result;
	}		
		
		
	/**
	 * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
	 * @return
	 */
	public String getConfigItemsFooterClass()
	{
		return "multiLineRowHeader center "  
		+ (icConfigItems.size() == 0 || getConfigItemsPanel().isHavingCustomFooter() ?  "visible " : "hidden ");
	}
	
	/**
	 * manages the style for the label which is displayed if there are no entries in the table
	 * @return
	 */
	public String getConfigItemsAvailableFooterClass()
	{
		return icConfigItems.size() > 0 ? " hidden " : " visible ";
	}
	
	private void addConfigItemsHeader() {
		getConfigItemsPanel().setHeader(getConfigItemsHeaderComponents(),getConfigItemsFieldNames());
	}
	
	private LabeledJSFInputComponent[] getConfigItemsHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getConfigItemsHeader_usr_Name(),
							(LabeledJSFInputComponent)getConfigItemsHeader_usr_CurrentValue(),
						};
	}

	private String[] getConfigItemsFieldNames() {
		return new String[]{
							"_usr_Name",
							"_usr_CurrentValue",
						};
	}

	   /**
		* Header for:
		* 
		* linked container SummaryConfigItemDataContainer
		*/
		public org.sblim.wbemsmt.vm.container.wizard.SummaryConfigItemDataContainerHeader getConfigItemsHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field name
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getConfigItemsHeader_usr_Name() {
    		if (icConfigItemsHeader_usr_Name == null)
    		{
				String label = bundle.getString("SummaryConfigItemDataContainer.name");
				String binding = expressionPrefix + "configItemsHeader_usr_Name.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icConfigItemsHeader_usr_Name = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icConfigItemsHeader_usr_Name).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icConfigItemsHeader_usr_Name).setHeader(true);
			
    		return icConfigItemsHeader_usr_Name;
    	}
				/**
   		 * Header for field currentValue
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getConfigItemsHeader_usr_CurrentValue() {
    		if (icConfigItemsHeader_usr_CurrentValue == null)
    		{
				String label = bundle.getString("SummaryConfigItemDataContainer.currentValue");
				String binding = expressionPrefix + "configItemsHeader_usr_CurrentValue.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icConfigItemsHeader_usr_CurrentValue = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icConfigItemsHeader_usr_CurrentValue).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icConfigItemsHeader_usr_CurrentValue).setHeader(true);
			
    		return icConfigItemsHeader_usr_CurrentValue;
    	}
		
			
				
		/**
		* 
		* linked container SummaryDiskItemDataContainer
		*/
				public java.util.List<SummaryDiskItemDataContainer> getDisks()
				{
						return icDisks;
		}
		
		public MultiLinePanel getDisksPanel()
		{
			if (disksPanel == null)
			{
  			   disksPanel = new DisksPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "disksPanel", // binding for Title
							  "SummaryDiskItemDataContainer_AsDisks_InChangeVMSettingsSummaryDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryDiskItemDataContainer_AsDisks_InChangeVMSettingsSummaryDataContainerImpl.COLS);
			  addDisksHeader();							  
			}		
			
			return disksPanel;
		}

		static class DisksPanel extends MultiLinePanel
		{
			public DisksPanel(AbstractBaseCimAdapter adapter, String expressionPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, expressionPrefix, bindigForTitle, keyForTitle, "disks", cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryDiskItemDataContainer_AsDisks_InChangeVMSettingsSummaryDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addDisks(org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryDiskItemDataContainer_AsDisks_InChangeVMSettingsSummaryDataContainerImpl child) {

		getDisks().add(child);
		getDisksPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getDisks_usr_FromPoolHeader()).getDependentChildFields().add(child.get_usr_FromPool());
					//((LabeledJSFInputComponent)getDisks_usr_PathHeader()).getDependentChildFields().add(child.get_usr_Path());
					//((LabeledJSFInputComponent)getDisks_usr_Field1Header()).getDependentChildFields().add(child.get_usr_Field1());
					//((LabeledJSFInputComponent)getDisks_usr_Field2Header()).getDependentChildFields().add(child.get_usr_Field2());
					//((LabeledJSFInputComponent)getDisks_usr_Field3Header()).getDependentChildFields().add(child.get_usr_Field3());
					//((LabeledJSFInputComponent)getDisks_usr_Field4Header()).getDependentChildFields().add(child.get_usr_Field4());
			}
	
	private void clearDisks() {
		getDisks().clear();
	}

	/**
	* 
	* Get the Disks for the UI repesentation
	*/
	public java.util.List<SummaryDiskItemDataContainer> getDisksForUI()
	{
				
		List<SummaryDiskItemDataContainer> result = new ArrayList<SummaryDiskItemDataContainer>();
		result.addAll(icDisks);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryDiskItemDataContainer_AsDisks_InChangeVMSettingsSummaryDataContainerImpl item = new org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryDiskItemDataContainer_AsDisks_InChangeVMSettingsSummaryDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, result.size());
				DataContainerUtil.setVisibilityOfFields(item,false);
				result.add(item);
			} catch (WbemsmtException e) {
				e.printStackTrace();
			}
		}
		
		disksPanel.setList(result);
		
		return result;
	}		
		
		
	/**
	 * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
	 * @return
	 */
	public String getDisksFooterClass()
	{
		return "multiLineRowHeader center "  
		+ (icDisks.size() == 0 || getDisksPanel().isHavingCustomFooter() ?  "visible " : "hidden ");
	}
	
	/**
	 * manages the style for the label which is displayed if there are no entries in the table
	 * @return
	 */
	public String getDisksAvailableFooterClass()
	{
		return icDisks.size() > 0 ? " hidden " : " visible ";
	}
	
	private void addDisksHeader() {
		getDisksPanel().setHeader(getDisksHeaderComponents(),getDisksFieldNames());
	}
	
	private LabeledJSFInputComponent[] getDisksHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getDisksHeader_usr_FromPool(),
							(LabeledJSFInputComponent)getDisksHeader_usr_Path(),
							(LabeledJSFInputComponent)getDisksHeader_usr_Field1(),
							(LabeledJSFInputComponent)getDisksHeader_usr_Field2(),
							(LabeledJSFInputComponent)getDisksHeader_usr_Field3(),
							(LabeledJSFInputComponent)getDisksHeader_usr_Field4(),
						};
	}

	private String[] getDisksFieldNames() {
		return new String[]{
							"_usr_FromPool",
							"_usr_Path",
							"_usr_Field1",
							"_usr_Field2",
							"_usr_Field3",
							"_usr_Field4",
						};
	}

	   /**
		* Header for:
		* 
		* linked container SummaryDiskItemDataContainer
		*/
		public org.sblim.wbemsmt.vm.container.wizard.SummaryDiskItemDataContainerHeader getDisksHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field fromPool
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_FromPool() {
    		if (icDisksHeader_usr_FromPool == null)
    		{
				String label = bundle.getString("SummaryDiskItemDataContainer.fromPool");
				String binding = expressionPrefix + "disksHeader_usr_FromPool.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icDisksHeader_usr_FromPool = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icDisksHeader_usr_FromPool).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icDisksHeader_usr_FromPool).setHeader(true);
			
    		return icDisksHeader_usr_FromPool;
    	}
				/**
   		 * Header for field path
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Path() {
    		if (icDisksHeader_usr_Path == null)
    		{
				String label = bundle.getString("SummaryDiskItemDataContainer.path");
				String binding = expressionPrefix + "disksHeader_usr_Path.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icDisksHeader_usr_Path = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icDisksHeader_usr_Path).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icDisksHeader_usr_Path).setHeader(true);
			
    		return icDisksHeader_usr_Path;
    	}
				/**
   		 * Header for field field1
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field1() {
    		if (icDisksHeader_usr_Field1 == null)
    		{
				String label = bundle.getString("SummaryDiskItemDataContainer.field1");
				String binding = expressionPrefix + "disksHeader_usr_Field1.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icDisksHeader_usr_Field1 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icDisksHeader_usr_Field1).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icDisksHeader_usr_Field1).setHeader(true);
			
    		return icDisksHeader_usr_Field1;
    	}
				/**
   		 * Header for field field2
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field2() {
    		if (icDisksHeader_usr_Field2 == null)
    		{
				String label = bundle.getString("SummaryDiskItemDataContainer.field2");
				String binding = expressionPrefix + "disksHeader_usr_Field2.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icDisksHeader_usr_Field2 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icDisksHeader_usr_Field2).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icDisksHeader_usr_Field2).setHeader(true);
			
    		return icDisksHeader_usr_Field2;
    	}
				/**
   		 * Header for field field3
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field3() {
    		if (icDisksHeader_usr_Field3 == null)
    		{
				String label = bundle.getString("SummaryDiskItemDataContainer.field3");
				String binding = expressionPrefix + "disksHeader_usr_Field3.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icDisksHeader_usr_Field3 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icDisksHeader_usr_Field3).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icDisksHeader_usr_Field3).setHeader(true);
			
    		return icDisksHeader_usr_Field3;
    	}
				/**
   		 * Header for field field4
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field4() {
    		if (icDisksHeader_usr_Field4 == null)
    		{
				String label = bundle.getString("SummaryDiskItemDataContainer.field4");
				String binding = expressionPrefix + "disksHeader_usr_Field4.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icDisksHeader_usr_Field4 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icDisksHeader_usr_Field4).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icDisksHeader_usr_Field4).setHeader(true);
			
    		return icDisksHeader_usr_Field4;
    	}
		
			
				
		/**
		* 
		* linked container SummaryNetworkItemDataContainer
		*/
				public java.util.List<SummaryNetworkItemDataContainer> getNetworks()
				{
						return icNetworks;
		}
		
		public MultiLinePanel getNetworksPanel()
		{
			if (networksPanel == null)
			{
  			   networksPanel = new NetworksPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "networksPanel", // binding for Title
							  "SummaryNetworkItemDataContainer_AsNetworks_InChangeVMSettingsSummaryDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryNetworkItemDataContainer_AsNetworks_InChangeVMSettingsSummaryDataContainerImpl.COLS);
			  addNetworksHeader();							  
			}		
			
			return networksPanel;
		}

		static class NetworksPanel extends MultiLinePanel
		{
			public NetworksPanel(AbstractBaseCimAdapter adapter, String expressionPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, expressionPrefix, bindigForTitle, keyForTitle, "networks", cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryNetworkItemDataContainer_AsNetworks_InChangeVMSettingsSummaryDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addNetworks(org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryNetworkItemDataContainer_AsNetworks_InChangeVMSettingsSummaryDataContainerImpl child) {

		getNetworks().add(child);
		getNetworksPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getNetworks_usr_FromPoolHeader()).getDependentChildFields().add(child.get_usr_FromPool());
					//((LabeledJSFInputComponent)getNetworks_usr_MacHeader()).getDependentChildFields().add(child.get_usr_Mac());
					//((LabeledJSFInputComponent)getNetworks_usr_Field1Header()).getDependentChildFields().add(child.get_usr_Field1());
					//((LabeledJSFInputComponent)getNetworks_usr_Field2Header()).getDependentChildFields().add(child.get_usr_Field2());
					//((LabeledJSFInputComponent)getNetworks_usr_Field3Header()).getDependentChildFields().add(child.get_usr_Field3());
					//((LabeledJSFInputComponent)getNetworks_usr_Field4Header()).getDependentChildFields().add(child.get_usr_Field4());
			}
	
	private void clearNetworks() {
		getNetworks().clear();
	}

	/**
	* 
	* Get the Networks for the UI repesentation
	*/
	public java.util.List<SummaryNetworkItemDataContainer> getNetworksForUI()
	{
				
		List<SummaryNetworkItemDataContainer> result = new ArrayList<SummaryNetworkItemDataContainer>();
		result.addAll(icNetworks);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryNetworkItemDataContainer_AsNetworks_InChangeVMSettingsSummaryDataContainerImpl item = new org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryNetworkItemDataContainer_AsNetworks_InChangeVMSettingsSummaryDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, result.size());
				DataContainerUtil.setVisibilityOfFields(item,false);
				result.add(item);
			} catch (WbemsmtException e) {
				e.printStackTrace();
			}
		}
		
		networksPanel.setList(result);
		
		return result;
	}		
		
		
	/**
	 * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
	 * @return
	 */
	public String getNetworksFooterClass()
	{
		return "multiLineRowHeader center "  
		+ (icNetworks.size() == 0 || getNetworksPanel().isHavingCustomFooter() ?  "visible " : "hidden ");
	}
	
	/**
	 * manages the style for the label which is displayed if there are no entries in the table
	 * @return
	 */
	public String getNetworksAvailableFooterClass()
	{
		return icNetworks.size() > 0 ? " hidden " : " visible ";
	}
	
	private void addNetworksHeader() {
		getNetworksPanel().setHeader(getNetworksHeaderComponents(),getNetworksFieldNames());
	}
	
	private LabeledJSFInputComponent[] getNetworksHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getNetworksHeader_usr_FromPool(),
							(LabeledJSFInputComponent)getNetworksHeader_usr_Mac(),
							(LabeledJSFInputComponent)getNetworksHeader_usr_Field1(),
							(LabeledJSFInputComponent)getNetworksHeader_usr_Field2(),
							(LabeledJSFInputComponent)getNetworksHeader_usr_Field3(),
							(LabeledJSFInputComponent)getNetworksHeader_usr_Field4(),
						};
	}

	private String[] getNetworksFieldNames() {
		return new String[]{
							"_usr_FromPool",
							"_usr_Mac",
							"_usr_Field1",
							"_usr_Field2",
							"_usr_Field3",
							"_usr_Field4",
						};
	}

	   /**
		* Header for:
		* 
		* linked container SummaryNetworkItemDataContainer
		*/
		public org.sblim.wbemsmt.vm.container.wizard.SummaryNetworkItemDataContainerHeader getNetworksHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field fromPool
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_FromPool() {
    		if (icNetworksHeader_usr_FromPool == null)
    		{
				String label = bundle.getString("SummaryNetworkItemDataContainer.fromPool");
				String binding = expressionPrefix + "networksHeader_usr_FromPool.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icNetworksHeader_usr_FromPool = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icNetworksHeader_usr_FromPool).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icNetworksHeader_usr_FromPool).setHeader(true);
			
    		return icNetworksHeader_usr_FromPool;
    	}
				/**
   		 * Header for field mac
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Mac() {
    		if (icNetworksHeader_usr_Mac == null)
    		{
				String label = bundle.getString("SummaryNetworkItemDataContainer.mac");
				String binding = expressionPrefix + "networksHeader_usr_Mac.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icNetworksHeader_usr_Mac = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icNetworksHeader_usr_Mac).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icNetworksHeader_usr_Mac).setHeader(true);
			
    		return icNetworksHeader_usr_Mac;
    	}
				/**
   		 * Header for field field1
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Field1() {
    		if (icNetworksHeader_usr_Field1 == null)
    		{
				String label = bundle.getString("SummaryNetworkItemDataContainer.field1");
				String binding = expressionPrefix + "networksHeader_usr_Field1.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icNetworksHeader_usr_Field1 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icNetworksHeader_usr_Field1).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icNetworksHeader_usr_Field1).setHeader(true);
			
    		return icNetworksHeader_usr_Field1;
    	}
				/**
   		 * Header for field field2
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Field2() {
    		if (icNetworksHeader_usr_Field2 == null)
    		{
				String label = bundle.getString("SummaryNetworkItemDataContainer.field2");
				String binding = expressionPrefix + "networksHeader_usr_Field2.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icNetworksHeader_usr_Field2 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icNetworksHeader_usr_Field2).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icNetworksHeader_usr_Field2).setHeader(true);
			
    		return icNetworksHeader_usr_Field2;
    	}
				/**
   		 * Header for field field3
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Field3() {
    		if (icNetworksHeader_usr_Field3 == null)
    		{
				String label = bundle.getString("SummaryNetworkItemDataContainer.field3");
				String binding = expressionPrefix + "networksHeader_usr_Field3.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icNetworksHeader_usr_Field3 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icNetworksHeader_usr_Field3).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icNetworksHeader_usr_Field3).setHeader(true);
			
    		return icNetworksHeader_usr_Field3;
    	}
				/**
   		 * Header for field field4
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Field4() {
    		if (icNetworksHeader_usr_Field4 == null)
    		{
				String label = bundle.getString("SummaryNetworkItemDataContainer.field4");
				String binding = expressionPrefix + "networksHeader_usr_Field4.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icNetworksHeader_usr_Field4 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icNetworksHeader_usr_Field4).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icNetworksHeader_usr_Field4).setHeader(true);
			
    		return icNetworksHeader_usr_Field4;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_System != null)
    		{
				ic_usr_System.setLabelText(bundle.getString("ChangeVMSettingsSummaryDataContainer.system"));
    		}
	    		if (ic_usr_Hostsystem != null)
    		{
				ic_usr_Hostsystem.setLabelText(bundle.getString("ChangeVMSettingsSummaryDataContainer.hostsystem"));
    		}
	    		if (ic_Processor != null)
    		{
				ic_Processor.setLabelText(bundle.getString("ChangeVMSettingsSummaryDataContainer.Processor"));
    		}
	    		if (ic_Memory != null)
    		{
				ic_Memory.setLabelText(bundle.getString("ChangeVMSettingsSummaryDataContainer.Memory"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesVm"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    			try
		{
			int count = adapter.count("configItems",org.sblim.wbemsmt.vm.container.wizard.SummaryConfigItemDataContainer.class, this);
	        if (count != configItemsCount)
	        {
	           configItemsCount = count;
	           clearConfigItems();
			   for (int i=0; i < count ; i++) {
	    			addConfigItems(new org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryConfigItemDataContainer_AsConfigItems_InChangeVMSettingsSummaryDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, i));
			   }
	        }
			getConfigItemsPanel().setList(getConfigItems());				   
		} catch (WbemsmtException e) {
			throw new WbemsmtException(WbemsmtException.ERR_INIT_CONTAINER,e);
		}
    			try
		{
			int count = adapter.count("disks",org.sblim.wbemsmt.vm.container.wizard.SummaryDiskItemDataContainer.class, this);
	        if (count != disksCount)
	        {
	           disksCount = count;
	           clearDisks();
			   for (int i=0; i < count ; i++) {
	    			addDisks(new org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryDiskItemDataContainer_AsDisks_InChangeVMSettingsSummaryDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, i));
			   }
	        }
			getDisksPanel().setList(getDisks());				   
		} catch (WbemsmtException e) {
			throw new WbemsmtException(WbemsmtException.ERR_INIT_CONTAINER,e);
		}
    			try
		{
			int count = adapter.count("networks",org.sblim.wbemsmt.vm.container.wizard.SummaryNetworkItemDataContainer.class, this);
	        if (count != networksCount)
	        {
	           networksCount = count;
	           clearNetworks();
			   for (int i=0; i < count ; i++) {
	    			addNetworks(new org.sblim.wbemsmt.vm.container.wizard.jsf.SummaryNetworkItemDataContainer_AsNetworks_InChangeVMSettingsSummaryDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, i));
			   }
	        }
			getNetworksPanel().setList(getNetworks());				   
		} catch (WbemsmtException e) {
			throw new WbemsmtException(WbemsmtException.ERR_INIT_CONTAINER,e);
		}
    		}


	/**
	 * count and create childrens
	 * @throws WbemsmtException
	 */
	public void updateControls() throws WbemsmtException {
			   countAndCreateChildren();
			   adapter.updateControls(this);
		
			   				      getConfigItemsPanel().updateRows();				
			   				      getDisksPanel().updateRows();				
			   				      getNetworksPanel().updateRows();				
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_usr_System());
    				fields.add(get_usr_Hostsystem());
    				fields.add(get_Processor());
    				fields.add(get_Memory());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    		childs.addAll(getConfigItems());
    	    		childs.addAll(getDisks());
    	    		childs.addAll(getNetworks());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       ChangeVMSettingsSummaryDataContainerImpl source = (ChangeVMSettingsSummaryDataContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_System().copyFrom(source.get_usr_System());
		        		   get_usr_Hostsystem().copyFrom(source.get_usr_Hostsystem());
		        		   get_Processor().copyFrom(source.get_Processor());
		        		   get_Memory().copyFrom(source.get_Memory());
		    		
    	    		   List<SummaryConfigItemDataContainer> targetListForConfigItems = getConfigItems();
    		   List<SummaryConfigItemDataContainer> sourceListForConfigItems = source.getConfigItems();
    		   if (sourceListForConfigItems.size() != targetListForConfigItems.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForConfigItems.size() + " and target is " + targetListForConfigItems.size() );
    		   }
			       for (int ii=0; ii < sourceListForConfigItems.size(); ii++)
			       {
				          ((DataContainer) targetListForConfigItems.get(ii)).copyFrom(((DataContainer) sourceListForConfigItems.get(ii)));
			        }
			
    	    		   List<SummaryDiskItemDataContainer> targetListForDisks = getDisks();
    		   List<SummaryDiskItemDataContainer> sourceListForDisks = source.getDisks();
    		   if (sourceListForDisks.size() != targetListForDisks.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForDisks.size() + " and target is " + targetListForDisks.size() );
    		   }
			       for (int ii=0; ii < sourceListForDisks.size(); ii++)
			       {
				          ((DataContainer) targetListForDisks.get(ii)).copyFrom(((DataContainer) sourceListForDisks.get(ii)));
			        }
			
    	    		   List<SummaryNetworkItemDataContainer> targetListForNetworks = getNetworks();
    		   List<SummaryNetworkItemDataContainer> sourceListForNetworks = source.getNetworks();
    		   if (sourceListForNetworks.size() != targetListForNetworks.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForNetworks.size() + " and target is " + targetListForNetworks.size() );
    		   }
			       for (int ii=0; ii < sourceListForNetworks.size(); ii++)
			       {
				          ((DataContainer) targetListForNetworks.get(ii)).copyFrom(((DataContainer) sourceListForNetworks.get(ii)));
			        }
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}