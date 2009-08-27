/** 
  * VMOverviewDataContainerImpl.java
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
import org.sblim.wbemsmt.vm.container.edit.VMOverviewItemDataContainer;

public class VMOverviewDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.vm.container.edit.VMOverviewDataContainer
			, org.sblim.wbemsmt.vm.container.edit.VMOverviewItemDataContainerHeader		
	{
				
				private java.util.List<VMOverviewItemDataContainer> icItems = new java.util.ArrayList<VMOverviewItemDataContainer>();
		
		private MultiLinePanel itemsPanel;
		private int itemsCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_ContainerName;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_State;
				
	
		
	
	public VMOverviewDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "VMOverviewDataContainer.caption",true);
				
					adapter.periodicalRefresh(this);
				
		
				
    			
    	    						
		setFooter(getPanelForCustomLayout(),"VMOverviewDataContainer.footerText");
		adapter.initContainer(this);
	}
	

		
			
				
		/**
		* 
		* linked container VMOverviewItemDataContainer
		*/
				public java.util.List<VMOverviewItemDataContainer> getItems()
				{
						//the container is dynamic so udpate the access time
			adapter.updateAccesTime(this);
			super.checkForUpdateControls();
						return icItems;
		}
		
		public MultiLinePanel getItemsPanel()
		{
			if (itemsPanel == null)
			{
  			   itemsPanel = new ItemsPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "itemsPanel", // binding for Title
							  "VMOverviewItemDataContainer_AsItems_InVMOverviewDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.vm.container.edit.jsf.VMOverviewItemDataContainer_AsItems_InVMOverviewDataContainerImpl.COLS);
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
				return org.sblim.wbemsmt.vm.container.edit.jsf.VMOverviewItemDataContainer_AsItems_InVMOverviewDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addItems(org.sblim.wbemsmt.vm.container.edit.jsf.VMOverviewItemDataContainer_AsItems_InVMOverviewDataContainerImpl child) {

		getItems().add(child);
		getItemsPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getItems_ContainerNameHeader()).getDependentChildFields().add(child.get_ContainerName());
					//((LabeledJSFInputComponent)getItems_usr_StateHeader()).getDependentChildFields().add(child.get_usr_State());
			}
	
	private void clearItems() {
		getItems().clear();
	}

	/**
	* 
	* Get the Items for the UI repesentation
	*/
	public java.util.List<VMOverviewItemDataContainer> getItemsForUI()
	{
					//the container is dynamic so udpate the access time
			adapter.updateAccesTime(this);
			super.checkForUpdateControls();
				
		List<VMOverviewItemDataContainer> result = new ArrayList<VMOverviewItemDataContainer>();
		result.addAll(icItems);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.vm.container.edit.jsf.VMOverviewItemDataContainer_AsItems_InVMOverviewDataContainerImpl item = new org.sblim.wbemsmt.vm.container.edit.jsf.VMOverviewItemDataContainer_AsItems_InVMOverviewDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, result.size());
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
							(LabeledJSFInputComponent)getItemsHeader_ContainerName(),
							(LabeledJSFInputComponent)getItemsHeader_usr_State(),
						};
	}

	private String[] getItemsFieldNames() {
		return new String[]{
							"_ContainerName",
							"_usr_State",
						};
	}

	   /**
		* Header for:
		* 
		* linked container VMOverviewItemDataContainer
		*/
		public org.sblim.wbemsmt.vm.container.edit.VMOverviewItemDataContainerHeader getItemsHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field ContainerName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_ContainerName() {
    		if (icItemsHeader_ContainerName == null)
    		{
				String label = bundle.getString("VMOverviewItemDataContainer.ContainerName");
				String binding = expressionPrefix + "itemsHeader_ContainerName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icItemsHeader_ContainerName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icItemsHeader_ContainerName).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icItemsHeader_ContainerName).setHeader(true);
			
    		return icItemsHeader_ContainerName;
    	}
				/**
   		 * Header for field state
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_State() {
    		if (icItemsHeader_usr_State == null)
    		{
				String label = bundle.getString("VMOverviewItemDataContainer.state");
				String binding = expressionPrefix + "itemsHeader_usr_State.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icItemsHeader_usr_State = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icItemsHeader_usr_State).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)icItemsHeader_usr_State).setHeader(true);
			
    		return icItemsHeader_usr_State;
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
			int count = adapter.count("items",org.sblim.wbemsmt.vm.container.edit.VMOverviewItemDataContainer.class, this);
	        if (count != itemsCount)
	        {
	           itemsCount = count;
	           clearItems();
			   for (int i=0; i < count ; i++) {
	    			addItems(new org.sblim.wbemsmt.vm.container.edit.jsf.VMOverviewItemDataContainer_AsItems_InVMOverviewDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, i));
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
	    		       VMOverviewDataContainerImpl source = (VMOverviewDataContainerImpl)sourceContainer;
		    		    
    			
    	    		   List<VMOverviewItemDataContainer> targetListForItems = getItems();
    		   List<VMOverviewItemDataContainer> sourceListForItems = source.getItems();
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