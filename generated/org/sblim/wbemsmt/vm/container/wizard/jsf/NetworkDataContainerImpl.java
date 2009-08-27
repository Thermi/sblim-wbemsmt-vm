/** 
  * NetworkDataContainerImpl.java
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
import org.sblim.wbemsmt.vm.container.wizard.NetworkItemDataContainer;

public class NetworkDataContainerImpl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.vm.container.wizard.NetworkDataContainer
			, org.sblim.wbemsmt.vm.container.wizard.NetworkItemDataContainerHeader		
	{
			private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Networks;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Add;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Remove;

    			
				private java.util.List<NetworkItemDataContainer> icNetworks = new java.util.ArrayList<NetworkItemDataContainer>();
		
		private MultiLinePanel networksPanel;
		private int networksCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Field1;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Field2;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Field3;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Field4;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Remove;
				
	
		
	
	public NetworkDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "NetworkDataContainer.caption","NetworkDataContainer.subTitle",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Networks());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Add());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Remove());
        					
		setFooter(getPanelForCustomLayout(),"NetworkDataContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType COMBOBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Networks() {
    		if (ic_usr_Networks == null)
    		{
				String label = bundle.getString("NetworkDataContainer.networks");
				String binding = expressionPrefix + "_usr_Networks.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_Networks = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Networks;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Add() {
    		if (ic_usr_Add == null)
    		{
				String label = bundle.getString("NetworkDataContainer.add");
				String binding = expressionPrefix + "_usr_Add.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Add = new org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Add;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Remove() {
    		if (ic_usr_Remove == null)
    		{
				String label = bundle.getString("NetworkDataContainer.remove");
				String binding = expressionPrefix + "_usr_Remove.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Remove = new org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Remove;
    	}
		
			
				
		/**
		* 
		* linked container NetworkItemDataContainer
		*/
				public java.util.List<NetworkItemDataContainer> getNetworks()
				{
						return icNetworks;
		}
		
		public MultiLinePanel getNetworksPanel()
		{
			if (networksPanel == null)
			{
  			   networksPanel = new NetworksPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "networksPanel", // binding for Title
							  "NetworkItemDataContainer_AsNetworks_InNetworkDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.vm.container.wizard.jsf.NetworkItemDataContainer_AsNetworks_InNetworkDataContainerImpl.COLS);
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
				return org.sblim.wbemsmt.vm.container.wizard.jsf.NetworkItemDataContainer_AsNetworks_InNetworkDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addNetworks(org.sblim.wbemsmt.vm.container.wizard.jsf.NetworkItemDataContainer_AsNetworks_InNetworkDataContainerImpl child) {

		getNetworks().add(child);
		getNetworksPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getNetworks_usr_Field1Header()).getDependentChildFields().add(child.get_usr_Field1());
					//((LabeledJSFInputComponent)getNetworks_usr_Field2Header()).getDependentChildFields().add(child.get_usr_Field2());
					//((LabeledJSFInputComponent)getNetworks_usr_Field3Header()).getDependentChildFields().add(child.get_usr_Field3());
					//((LabeledJSFInputComponent)getNetworks_usr_Field4Header()).getDependentChildFields().add(child.get_usr_Field4());
					//((LabeledJSFInputComponent)getNetworks_usr_RemoveHeader()).getDependentChildFields().add(child.get_usr_Remove());
			}
	
	private void clearNetworks() {
		getNetworks().clear();
	}

	/**
	* 
	* Get the Networks for the UI repesentation
	*/
	public java.util.List<NetworkItemDataContainer> getNetworksForUI()
	{
				
		List<NetworkItemDataContainer> result = new ArrayList<NetworkItemDataContainer>();
		result.addAll(icNetworks);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.vm.container.wizard.jsf.NetworkItemDataContainer_AsNetworks_InNetworkDataContainerImpl item = new org.sblim.wbemsmt.vm.container.wizard.jsf.NetworkItemDataContainer_AsNetworks_InNetworkDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, result.size());
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
							(LabeledJSFInputComponent)getNetworksHeader_usr_Field1(),
							(LabeledJSFInputComponent)getNetworksHeader_usr_Field2(),
							(LabeledJSFInputComponent)getNetworksHeader_usr_Field3(),
							(LabeledJSFInputComponent)getNetworksHeader_usr_Field4(),
							(LabeledJSFInputComponent)getNetworksHeader_usr_Remove(),
						};
	}

	private String[] getNetworksFieldNames() {
		return new String[]{
							"_usr_Field1",
							"_usr_Field2",
							"_usr_Field3",
							"_usr_Field4",
							"_usr_Remove",
						};
	}

	   /**
		* Header for:
		* 
		* linked container NetworkItemDataContainer
		*/
		public org.sblim.wbemsmt.vm.container.wizard.NetworkItemDataContainerHeader getNetworksHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field field1
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Field1() {
    		if (icNetworksHeader_usr_Field1 == null)
    		{
				String label = bundle.getString("NetworkItemDataContainer.field1");
				String binding = expressionPrefix + "networksHeader_usr_Field1.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icNetworksHeader_usr_Field1 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icNetworksHeader_usr_Field1).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icNetworksHeader_usr_Field1).setHeader(true);
			
    		return icNetworksHeader_usr_Field1;
    	}
				/**
   		 * Header for field field2
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Field2() {
    		if (icNetworksHeader_usr_Field2 == null)
    		{
				String label = bundle.getString("NetworkItemDataContainer.field2");
				String binding = expressionPrefix + "networksHeader_usr_Field2.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icNetworksHeader_usr_Field2 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icNetworksHeader_usr_Field2).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icNetworksHeader_usr_Field2).setHeader(true);
			
    		return icNetworksHeader_usr_Field2;
    	}
				/**
   		 * Header for field field3
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Field3() {
    		if (icNetworksHeader_usr_Field3 == null)
    		{
				String label = bundle.getString("NetworkItemDataContainer.field3");
				String binding = expressionPrefix + "networksHeader_usr_Field3.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icNetworksHeader_usr_Field3 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icNetworksHeader_usr_Field3).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icNetworksHeader_usr_Field3).setHeader(true);
			
    		return icNetworksHeader_usr_Field3;
    	}
				/**
   		 * Header for field field4
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Field4() {
    		if (icNetworksHeader_usr_Field4 == null)
    		{
				String label = bundle.getString("NetworkItemDataContainer.field4");
				String binding = expressionPrefix + "networksHeader_usr_Field4.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icNetworksHeader_usr_Field4 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icNetworksHeader_usr_Field4).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icNetworksHeader_usr_Field4).setHeader(true);
			
    		return icNetworksHeader_usr_Field4;
    	}
				/**
   		 * Header for field remove
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Remove() {
    		if (icNetworksHeader_usr_Remove == null)
    		{
				String label = bundle.getString("NetworkItemDataContainer.remove");
				String binding = expressionPrefix + "networksHeader_usr_Remove.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icNetworksHeader_usr_Remove = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icNetworksHeader_usr_Remove).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icNetworksHeader_usr_Remove).setHeader(true);
			
    		return icNetworksHeader_usr_Remove;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_Networks != null)
    		{
				ic_usr_Networks.setLabelText(bundle.getString("NetworkDataContainer.networks"));
    		}
	    		if (ic_usr_Add != null)
    		{
				ic_usr_Add.setLabelText(bundle.getString("NetworkDataContainer.add"));
    		}
	    		if (ic_usr_Remove != null)
    		{
				ic_usr_Remove.setLabelText(bundle.getString("NetworkDataContainer.remove"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesVm"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    			try
		{
			int count = adapter.count("networks",org.sblim.wbemsmt.vm.container.wizard.NetworkItemDataContainer.class, this);
	        if (count != networksCount)
	        {
	           networksCount = count;
	           clearNetworks();
			   for (int i=0; i < count ; i++) {
	    			addNetworks(new org.sblim.wbemsmt.vm.container.wizard.jsf.NetworkItemDataContainer_AsNetworks_InNetworkDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, i));
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
		
			   				      getNetworksPanel().updateRows();				
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_usr_Networks());
    				fields.add(get_usr_Add());
    				fields.add(get_usr_Remove());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    		childs.addAll(getNetworks());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       NetworkDataContainerImpl source = (NetworkDataContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_Networks().copyFrom(source.get_usr_Networks());
		        		   get_usr_Add().copyFrom(source.get_usr_Add());
		        		   get_usr_Remove().copyFrom(source.get_usr_Remove());
		    		
    	    		   List<NetworkItemDataContainer> targetListForNetworks = getNetworks();
    		   List<NetworkItemDataContainer> sourceListForNetworks = source.getNetworks();
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