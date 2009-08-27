/** 
  * MemoryVMInfoDataContainerImpl.java
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

package org.sblim.wbemsmt.vm.container.edit.jsf;

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;
import org.sblim.wbemsmt.vm.container.edit.MemoryVMInfoItemDataContainer;

public class MemoryVMInfoDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.vm.container.edit.MemoryVMInfoDataContainer
			, org.sblim.wbemsmt.vm.container.edit.MemoryVMInfoItemDataContainerHeader		
	{
				
				private java.util.List<MemoryVMInfoItemDataContainer> icItems = new java.util.ArrayList<MemoryVMInfoItemDataContainer>();
		
		private MultiLinePanel itemsPanel;
		private int itemsCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Current;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Min;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Max;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_DefaultValue;
				
	
		
	
	public MemoryVMInfoDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "MemoryVMInfoDataContainer.caption",false);
				
				
		
				
    			
    	    						
		setFooter(getPanelForCustomLayout(),"MemoryVMInfoDataContainer.footerText");
		adapter.initContainer(this);
	}
	

		
			
				
		/**
		* 
		* linked container MemoryVMInfoItemDataContainer
		*/
				public java.util.List<MemoryVMInfoItemDataContainer> getItems()
				{
						return icItems;
		}
		
		public MultiLinePanel getItemsPanel()
		{
			if (itemsPanel == null)
			{
  			   itemsPanel = new ItemsPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "itemsPanel", // binding for Title
							  "MemoryVMInfoItemDataContainer_AsItems_InMemoryVMInfoDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.vm.container.edit.jsf.MemoryVMInfoItemDataContainer_AsItems_InMemoryVMInfoDataContainerImpl.COLS);
			  addItemsHeader();							  
			}		
			
			return itemsPanel;
		}

		static class ItemsPanel extends MultiLinePanel
		{
			public ItemsPanel(AbstractBaseCimAdapter adapter, String expressionPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, expressionPrefix, bindigForTitle, keyForTitle, "items", cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.vm.container.edit.jsf.MemoryVMInfoItemDataContainer_AsItems_InMemoryVMInfoDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addItems(org.sblim.wbemsmt.vm.container.edit.jsf.MemoryVMInfoItemDataContainer_AsItems_InMemoryVMInfoDataContainerImpl child) {

		getItems().add(child);
		getItemsPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getItems_usr_CurrentHeader()).getDependentChildFields().add(child.get_usr_Current());
					//((LabeledJSFInputComponent)getItems_usr_MinHeader()).getDependentChildFields().add(child.get_usr_Min());
					//((LabeledJSFInputComponent)getItems_usr_MaxHeader()).getDependentChildFields().add(child.get_usr_Max());
					//((LabeledJSFInputComponent)getItems_usr_DefaultValueHeader()).getDependentChildFields().add(child.get_usr_DefaultValue());
			}
	
	private void clearItems() {
		getItems().clear();
	}

	/**
	* 
	* Get the Items for the UI repesentation
	*/
	public java.util.List<MemoryVMInfoItemDataContainer> getItemsForUI()
	{
				
		List<MemoryVMInfoItemDataContainer> result = new ArrayList<MemoryVMInfoItemDataContainer>();
		result.addAll(icItems);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.vm.container.edit.jsf.MemoryVMInfoItemDataContainer_AsItems_InMemoryVMInfoDataContainerImpl item = new org.sblim.wbemsmt.vm.container.edit.jsf.MemoryVMInfoItemDataContainer_AsItems_InMemoryVMInfoDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, result.size());
				DataContainerUtil.setVisibilityOfFields(item,false);
				result.add(item);
			} catch (WbemsmtException e) {
				e.printStackTrace();
			}
		}
		
		itemsPanel.setList(result);
		
		return result;
	}		
		
		
	/**
	 * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
	 * @return
	 */
	public String getItemsFooterClass()
	{
		return "multiLineRowHeader center "  
		+ (icItems.size() == 0 || getItemsPanel().isHavingCustomFooter() ?  "visible " : "hidden ");
	}
	
	/**
	 * manages the style for the label which is displayed if there are no entries in the table
	 * @return
	 */
	public String getItemsAvailableFooterClass()
	{
		return icItems.size() > 0 ? " hidden " : " visible ";
	}
	
	private void addItemsHeader() {
		getItemsPanel().setHeader(getItemsHeaderComponents(),getItemsFieldNames());
	}
	
	private LabeledJSFInputComponent[] getItemsHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getItemsHeader_usr_Current(),
							(LabeledJSFInputComponent)getItemsHeader_usr_Min(),
							(LabeledJSFInputComponent)getItemsHeader_usr_Max(),
							(LabeledJSFInputComponent)getItemsHeader_usr_DefaultValue(),
						};
	}

	private String[] getItemsFieldNames() {
		return new String[]{
							"_usr_Current",
							"_usr_Min",
							"_usr_Max",
							"_usr_DefaultValue",
						};
	}

	   /**
		* Header for:
		* 
		* linked container MemoryVMInfoItemDataContainer
		*/
		public org.sblim.wbemsmt.vm.container.edit.MemoryVMInfoItemDataContainerHeader getItemsHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field current
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Current() {
    		if (icItemsHeader_usr_Current == null)
    		{
				String label = bundle.getString("MemoryVMInfoItemDataContainer.current");
				String binding = expressionPrefix + "itemsHeader_usr_Current.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icItemsHeader_usr_Current = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icItemsHeader_usr_Current).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icItemsHeader_usr_Current).setHeader(true);
			
    		return icItemsHeader_usr_Current;
    	}
				/**
   		 * Header for field min
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Min() {
    		if (icItemsHeader_usr_Min == null)
    		{
				String label = bundle.getString("MemoryVMInfoItemDataContainer.min");
				String binding = expressionPrefix + "itemsHeader_usr_Min.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icItemsHeader_usr_Min = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icItemsHeader_usr_Min).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icItemsHeader_usr_Min).setHeader(true);
			
    		return icItemsHeader_usr_Min;
    	}
				/**
   		 * Header for field max
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Max() {
    		if (icItemsHeader_usr_Max == null)
    		{
				String label = bundle.getString("MemoryVMInfoItemDataContainer.max");
				String binding = expressionPrefix + "itemsHeader_usr_Max.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icItemsHeader_usr_Max = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icItemsHeader_usr_Max).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icItemsHeader_usr_Max).setHeader(true);
			
    		return icItemsHeader_usr_Max;
    	}
				/**
   		 * Header for field defaultValue
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_DefaultValue() {
    		if (icItemsHeader_usr_DefaultValue == null)
    		{
				String label = bundle.getString("MemoryVMInfoItemDataContainer.defaultValue");
				String binding = expressionPrefix + "itemsHeader_usr_DefaultValue.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icItemsHeader_usr_DefaultValue = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icItemsHeader_usr_DefaultValue).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icItemsHeader_usr_DefaultValue).setHeader(true);
			
    		return icItemsHeader_usr_DefaultValue;
    	}
		
	
		
	public void reload()
	{
		super.reload();
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesVm"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    			try
		{
			int count = adapter.count("items",org.sblim.wbemsmt.vm.container.edit.MemoryVMInfoItemDataContainer.class, this);
	        if (count != itemsCount)
	        {
	           itemsCount = count;
	           clearItems();
			   for (int i=0; i < count ; i++) {
	    			addItems(new org.sblim.wbemsmt.vm.container.edit.jsf.MemoryVMInfoItemDataContainer_AsItems_InMemoryVMInfoDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, i));
			   }
	        }
			getItemsPanel().setList(getItems());				   
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
		
			   				      getItemsPanel().updateRows();				
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    		childs.addAll(getItems());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       MemoryVMInfoDataContainerImpl source = (MemoryVMInfoDataContainerImpl)sourceContainer;
		    		    
    			
    	    		   List<MemoryVMInfoItemDataContainer> targetListForItems = getItems();
    		   List<MemoryVMInfoItemDataContainer> sourceListForItems = source.getItems();
    		   if (sourceListForItems.size() != targetListForItems.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForItems.size() + " and target is " + targetListForItems.size() );
    		   }
			       for (int ii=0; ii < sourceListForItems.size(); ii++)
			       {
				          ((DataContainer) targetListForItems.get(ii)).copyFrom(((DataContainer) sourceListForItems.get(ii)));
			        }
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}