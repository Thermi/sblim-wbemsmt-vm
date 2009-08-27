/** 
  * DefineSystemCLISummaryDataContainerImpl.java
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
import org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryConfigItemDataContainer;

public class DefineSystemCLISummaryDataContainerImpl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer
			, org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryConfigItemDataContainerHeader		
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Memory;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Processor;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_StartAfterCreation;

    			
				private java.util.List<DefineSystemCLISummaryConfigItemDataContainer> icConfigValues = new java.util.ArrayList<DefineSystemCLISummaryConfigItemDataContainer>();
		
		private MultiLinePanel configValuesPanel;
		private int configValuesCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icConfigValuesHeader_usr_Name;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icConfigValuesHeader_usr_CurrentValue;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icConfigValuesHeader_usr_Userdefined;
				
	
		
	
	public DefineSystemCLISummaryDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "DefineSystemCLISummaryDataContainer.caption","DefineSystemCLISummaryDataContainer.subTitle",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Memory());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Processor());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_StartAfterCreation());
        					
		setFooter(getPanelForCustomLayout(),"DefineSystemCLISummaryDataContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Memory() {
    		if (ic_usr_Memory == null)
    		{
				String label = bundle.getString("DefineSystemCLISummaryDataContainer.memory");
				String binding = expressionPrefix + "_usr_Memory.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Memory = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Memory;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Processor() {
    		if (ic_usr_Processor == null)
    		{
				String label = bundle.getString("DefineSystemCLISummaryDataContainer.processor");
				String binding = expressionPrefix + "_usr_Processor.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Processor = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Processor;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_StartAfterCreation() {
    		if (ic_usr_StartAfterCreation == null)
    		{
				String label = bundle.getString("DefineSystemCLISummaryDataContainer.startAfterCreation");
				String binding = expressionPrefix + "_usr_StartAfterCreation.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_StartAfterCreation = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_StartAfterCreation;
    	}
		
			
				
		/**
		* 
		* linked container DefineSystemCLISummaryConfigItemDataContainer
		*/
				public java.util.List<DefineSystemCLISummaryConfigItemDataContainer> getConfigValues()
				{
						return icConfigValues;
		}
		
		public MultiLinePanel getConfigValuesPanel()
		{
			if (configValuesPanel == null)
			{
  			   configValuesPanel = new ConfigValuesPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "configValuesPanel", // binding for Title
							  "DefineSystemCLISummaryConfigItemDataContainer_AsConfigValues_InDefineSystemCLISummaryDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.vm.container.wizard.jsf.DefineSystemCLISummaryConfigItemDataContainer_AsConfigValues_InDefineSystemCLISummaryDataContainerImpl.COLS);
			  addConfigValuesHeader();							  
			}		
			
			return configValuesPanel;
		}

		static class ConfigValuesPanel extends MultiLinePanel
		{
			public ConfigValuesPanel(AbstractBaseCimAdapter adapter, String expressionPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, expressionPrefix, bindigForTitle, keyForTitle, "configValues", cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.vm.container.wizard.jsf.DefineSystemCLISummaryConfigItemDataContainer_AsConfigValues_InDefineSystemCLISummaryDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addConfigValues(org.sblim.wbemsmt.vm.container.wizard.jsf.DefineSystemCLISummaryConfigItemDataContainer_AsConfigValues_InDefineSystemCLISummaryDataContainerImpl child) {

		getConfigValues().add(child);
		getConfigValuesPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getConfigValues_usr_NameHeader()).getDependentChildFields().add(child.get_usr_Name());
					//((LabeledJSFInputComponent)getConfigValues_usr_CurrentValueHeader()).getDependentChildFields().add(child.get_usr_CurrentValue());
					//((LabeledJSFInputComponent)getConfigValues_usr_UserdefinedHeader()).getDependentChildFields().add(child.get_usr_Userdefined());
			}
	
	private void clearConfigValues() {
		getConfigValues().clear();
	}

	/**
	* 
	* Get the ConfigValues for the UI repesentation
	*/
	public java.util.List<DefineSystemCLISummaryConfigItemDataContainer> getConfigValuesForUI()
	{
				
		List<DefineSystemCLISummaryConfigItemDataContainer> result = new ArrayList<DefineSystemCLISummaryConfigItemDataContainer>();
		result.addAll(icConfigValues);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.vm.container.wizard.jsf.DefineSystemCLISummaryConfigItemDataContainer_AsConfigValues_InDefineSystemCLISummaryDataContainerImpl item = new org.sblim.wbemsmt.vm.container.wizard.jsf.DefineSystemCLISummaryConfigItemDataContainer_AsConfigValues_InDefineSystemCLISummaryDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, result.size());
				DataContainerUtil.setVisibilityOfFields(item,false);
				result.add(item);
			} catch (WbemsmtException e) {
				e.printStackTrace();
			}
		}
		
		configValuesPanel.setList(result);
		
		return result;
	}		
		
		
	/**
	 * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
	 * @return
	 */
	public String getConfigValuesFooterClass()
	{
		return "multiLineRowHeader center "  
		+ (icConfigValues.size() == 0 || getConfigValuesPanel().isHavingCustomFooter() ?  "visible " : "hidden ");
	}
	
	/**
	 * manages the style for the label which is displayed if there are no entries in the table
	 * @return
	 */
	public String getConfigValuesAvailableFooterClass()
	{
		return icConfigValues.size() > 0 ? " hidden " : " visible ";
	}
	
	private void addConfigValuesHeader() {
		getConfigValuesPanel().setHeader(getConfigValuesHeaderComponents(),getConfigValuesFieldNames());
	}
	
	private LabeledJSFInputComponent[] getConfigValuesHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getConfigValuesHeader_usr_Name(),
							(LabeledJSFInputComponent)getConfigValuesHeader_usr_CurrentValue(),
							(LabeledJSFInputComponent)getConfigValuesHeader_usr_Userdefined(),
						};
	}

	private String[] getConfigValuesFieldNames() {
		return new String[]{
							"_usr_Name",
							"_usr_CurrentValue",
							"_usr_Userdefined",
						};
	}

	   /**
		* Header for:
		* 
		* linked container DefineSystemCLISummaryConfigItemDataContainer
		*/
		public org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryConfigItemDataContainerHeader getConfigValuesHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field name
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getConfigValuesHeader_usr_Name() {
    		if (icConfigValuesHeader_usr_Name == null)
    		{
				String label = bundle.getString("DefineSystemCLISummaryConfigItemDataContainer.name");
				String binding = expressionPrefix + "configValuesHeader_usr_Name.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icConfigValuesHeader_usr_Name = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icConfigValuesHeader_usr_Name).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icConfigValuesHeader_usr_Name).setHeader(true);
			
    		return icConfigValuesHeader_usr_Name;
    	}
				/**
   		 * Header for field currentValue
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getConfigValuesHeader_usr_CurrentValue() {
    		if (icConfigValuesHeader_usr_CurrentValue == null)
    		{
				String label = bundle.getString("DefineSystemCLISummaryConfigItemDataContainer.currentValue");
				String binding = expressionPrefix + "configValuesHeader_usr_CurrentValue.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icConfigValuesHeader_usr_CurrentValue = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icConfigValuesHeader_usr_CurrentValue).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icConfigValuesHeader_usr_CurrentValue).setHeader(true);
			
    		return icConfigValuesHeader_usr_CurrentValue;
    	}
				/**
   		 * Header for field userdefined
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getConfigValuesHeader_usr_Userdefined() {
    		if (icConfigValuesHeader_usr_Userdefined == null)
    		{
				String label = bundle.getString("DefineSystemCLISummaryConfigItemDataContainer.userdefined");
				String binding = expressionPrefix + "configValuesHeader_usr_Userdefined.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icConfigValuesHeader_usr_Userdefined = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icConfigValuesHeader_usr_Userdefined).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icConfigValuesHeader_usr_Userdefined).setHeader(true);
			
    		return icConfigValuesHeader_usr_Userdefined;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_Memory != null)
    		{
				ic_usr_Memory.setLabelText(bundle.getString("DefineSystemCLISummaryDataContainer.memory"));
    		}
	    		if (ic_usr_Processor != null)
    		{
				ic_usr_Processor.setLabelText(bundle.getString("DefineSystemCLISummaryDataContainer.processor"));
    		}
	    		if (ic_usr_StartAfterCreation != null)
    		{
				ic_usr_StartAfterCreation.setLabelText(bundle.getString("DefineSystemCLISummaryDataContainer.startAfterCreation"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesVm"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    			try
		{
			int count = adapter.count("configValues",org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryConfigItemDataContainer.class, this);
	        if (count != configValuesCount)
	        {
	           configValuesCount = count;
	           clearConfigValues();
			   for (int i=0; i < count ; i++) {
	    			addConfigValues(new org.sblim.wbemsmt.vm.container.wizard.jsf.DefineSystemCLISummaryConfigItemDataContainer_AsConfigValues_InDefineSystemCLISummaryDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, i));
			   }
	        }
			getConfigValuesPanel().setList(getConfigValues());				   
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
		
			   				      getConfigValuesPanel().updateRows();				
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_usr_Memory());
    				fields.add(get_usr_Processor());
    				fields.add(get_usr_StartAfterCreation());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    		childs.addAll(getConfigValues());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       DefineSystemCLISummaryDataContainerImpl source = (DefineSystemCLISummaryDataContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_Memory().copyFrom(source.get_usr_Memory());
		        		   get_usr_Processor().copyFrom(source.get_usr_Processor());
		        		   get_usr_StartAfterCreation().copyFrom(source.get_usr_StartAfterCreation());
		    		
    	    		   List<DefineSystemCLISummaryConfigItemDataContainer> targetListForConfigValues = getConfigValues();
    		   List<DefineSystemCLISummaryConfigItemDataContainer> sourceListForConfigValues = source.getConfigValues();
    		   if (sourceListForConfigValues.size() != targetListForConfigValues.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForConfigValues.size() + " and target is " + targetListForConfigValues.size() );
    		   }
			       for (int ii=0; ii < sourceListForConfigValues.size(); ii++)
			       {
				          ((DataContainer) targetListForConfigValues.get(ii)).copyFrom(((DataContainer) sourceListForConfigValues.get(ii)));
			        }
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}