/** 
  * VMConfigDataContainerImpl.java
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
import org.sblim.wbemsmt.vm.container.wizard.ConfigItemDataContainer;

public class VMConfigDataContainerImpl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.vm.container.wizard.VMConfigDataContainer
			, org.sblim.wbemsmt.vm.container.wizard.ConfigItemDataContainerHeader		
	{
				
				private java.util.List<ConfigItemDataContainer> icItems = new java.util.ArrayList<ConfigItemDataContainer>();
		
		private MultiLinePanel itemsPanel;
		private int itemsCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Name;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_CurrentValue;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Info;
				
	
		
	
	public VMConfigDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "VMConfigDataContainer.caption","VMConfigDataContainer.subTitle",false);
				
				
		
				
    			
    	    						
		setFooter(getPanelForCustomLayout(),"VMConfigDataContainer.footerText");
		adapter.initContainer(this);
	}
	

		
			
				
		/**
		* 
		* linked container ConfigItemDataContainer
		*/
				public java.util.List<ConfigItemDataContainer> getItems()
				{
						return icItems;
		}
		
		public MultiLinePanel getItemsPanel()
		{
			if (itemsPanel == null)
			{
  			   itemsPanel = new ItemsPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "itemsPanel", // binding for Title
							  "ConfigItemDataContainer_AsItems_InVMConfigDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.vm.container.wizard.jsf.ConfigItemDataContainer_AsItems_InVMConfigDataContainerImpl.COLS);
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
				return org.sblim.wbemsmt.vm.container.wizard.jsf.ConfigItemDataContainer_AsItems_InVMConfigDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addItems(org.sblim.wbemsmt.vm.container.wizard.jsf.ConfigItemDataContainer_AsItems_InVMConfigDataContainerImpl child) {

		getItems().add(child);
		getItemsPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getItems_usr_NameHeader()).getDependentChildFields().add(child.get_usr_Name());
					//((LabeledJSFInputComponent)getItems_usr_CurrentValueHeader()).getDependentChildFields().add(child.get_usr_CurrentValue());
					//((LabeledJSFInputComponent)getItems_usr_InfoHeader()).getDependentChildFields().add(child.get_usr_Info());
			}
	
	private void clearItems() {
		getItems().clear();
	}

	/**
	* 
	* Get the Items for the UI repesentation
	*/
	public java.util.List<ConfigItemDataContainer> getItemsForUI()
	{
				
		List<ConfigItemDataContainer> result = new ArrayList<ConfigItemDataContainer>();
		result.addAll(icItems);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.vm.container.wizard.jsf.ConfigItemDataContainer_AsItems_InVMConfigDataContainerImpl item = new org.sblim.wbemsmt.vm.container.wizard.jsf.ConfigItemDataContainer_AsItems_InVMConfigDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, result.size());
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
							(LabeledJSFInputComponent)getItemsHeader_usr_Name(),
							(LabeledJSFInputComponent)getItemsHeader_usr_CurrentValue(),
							(LabeledJSFInputComponent)getItemsHeader_usr_Info(),
						};
	}

	private String[] getItemsFieldNames() {
		return new String[]{
							"_usr_Name",
							"_usr_CurrentValue",
							"_usr_Info",
						};
	}

	   /**
		* Header for:
		* 
		* linked container ConfigItemDataContainer
		*/
		public org.sblim.wbemsmt.vm.container.wizard.ConfigItemDataContainerHeader getItemsHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field name
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Name() {
    		if (icItemsHeader_usr_Name == null)
    		{
				String label = bundle.getString("ConfigItemDataContainer.name");
				String binding = expressionPrefix + "itemsHeader_usr_Name.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icItemsHeader_usr_Name = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icItemsHeader_usr_Name).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icItemsHeader_usr_Name).setHeader(true);
			
    		return icItemsHeader_usr_Name;
    	}
				/**
   		 * Header for field currentValue
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_CurrentValue() {
    		if (icItemsHeader_usr_CurrentValue == null)
    		{
				String label = bundle.getString("ConfigItemDataContainer.currentValue");
				String binding = expressionPrefix + "itemsHeader_usr_CurrentValue.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icItemsHeader_usr_CurrentValue = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icItemsHeader_usr_CurrentValue).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icItemsHeader_usr_CurrentValue).setHeader(true);
			
    		return icItemsHeader_usr_CurrentValue;
    	}
				/**
   		 * Header for field info
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Info() {
    		if (icItemsHeader_usr_Info == null)
    		{
				String label = bundle.getString("ConfigItemDataContainer.info");
				String binding = expressionPrefix + "itemsHeader_usr_Info.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.jsf.PictureDataConverter();
				boolean readOnly = false;
    			icItemsHeader_usr_Info = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFPictureComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFPictureComponent)icItemsHeader_usr_Info).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFPictureComponent)icItemsHeader_usr_Info).setHeader(true);
			
    		return icItemsHeader_usr_Info;
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
			int count = adapter.count("items",org.sblim.wbemsmt.vm.container.wizard.ConfigItemDataContainer.class, this);
	        if (count != itemsCount)
	        {
	           itemsCount = count;
	           clearItems();
			   for (int i=0; i < count ; i++) {
	    			addItems(new org.sblim.wbemsmt.vm.container.wizard.jsf.ConfigItemDataContainer_AsItems_InVMConfigDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, i));
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
	    		       VMConfigDataContainerImpl source = (VMConfigDataContainerImpl)sourceContainer;
		    		    
    			
    	    		   List<ConfigItemDataContainer> targetListForItems = getItems();
    		   List<ConfigItemDataContainer> sourceListForItems = source.getItems();
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