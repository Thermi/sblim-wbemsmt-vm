/** 
  * DiskDataContainerImpl.java
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
import org.sblim.wbemsmt.vm.container.wizard.DiskItemDataContainer;

public class DiskDataContainerImpl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.vm.container.wizard.DiskDataContainer
			, org.sblim.wbemsmt.vm.container.wizard.DiskItemDataContainerHeader		
	{
			private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Disks;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Add;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Remove;

    			
				private java.util.List<DiskItemDataContainer> icDisks = new java.util.ArrayList<DiskItemDataContainer>();
		
		private MultiLinePanel disksPanel;
		private int disksCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Field1;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Field2;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Field3;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Field4;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icDisksHeader_usr_Remove;
				
	
		
	
	public DiskDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "DiskDataContainer.caption","DiskDataContainer.subTitle",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Disks());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Add());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Remove());
        					
		setFooter(getPanelForCustomLayout(),"DiskDataContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType COMBOBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Disks() {
    		if (ic_usr_Disks == null)
    		{
				String label = bundle.getString("DiskDataContainer.disks");
				String binding = expressionPrefix + "_usr_Disks.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
				boolean readOnly = false;
    			ic_usr_Disks = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(parent,label,binding,converter, readOnly);
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Add() {
    		if (ic_usr_Add == null)
    		{
				String label = bundle.getString("DiskDataContainer.add");
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
				String label = bundle.getString("DiskDataContainer.remove");
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
		* linked container DiskItemDataContainer
		*/
				public java.util.List<DiskItemDataContainer> getDisks()
				{
						return icDisks;
		}
		
		public MultiLinePanel getDisksPanel()
		{
			if (disksPanel == null)
			{
  			   disksPanel = new DisksPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "disksPanel", // binding for Title
							  "DiskItemDataContainer_AsDisks_InDiskDataContainer.caption", //Key for title
							  org.sblim.wbemsmt.vm.container.wizard.jsf.DiskItemDataContainer_AsDisks_InDiskDataContainerImpl.COLS);
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
				return org.sblim.wbemsmt.vm.container.wizard.jsf.DiskItemDataContainer_AsDisks_InDiskDataContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addDisks(org.sblim.wbemsmt.vm.container.wizard.jsf.DiskItemDataContainer_AsDisks_InDiskDataContainerImpl child) {

		getDisks().add(child);
		getDisksPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getDisks_usr_Field1Header()).getDependentChildFields().add(child.get_usr_Field1());
					//((LabeledJSFInputComponent)getDisks_usr_Field2Header()).getDependentChildFields().add(child.get_usr_Field2());
					//((LabeledJSFInputComponent)getDisks_usr_Field3Header()).getDependentChildFields().add(child.get_usr_Field3());
					//((LabeledJSFInputComponent)getDisks_usr_Field4Header()).getDependentChildFields().add(child.get_usr_Field4());
					//((LabeledJSFInputComponent)getDisks_usr_RemoveHeader()).getDependentChildFields().add(child.get_usr_Remove());
			}
	
	private void clearDisks() {
		getDisks().clear();
	}

	/**
	* 
	* Get the Disks for the UI repesentation
	*/
	public java.util.List<DiskItemDataContainer> getDisksForUI()
	{
				
		List<DiskItemDataContainer> result = new ArrayList<DiskItemDataContainer>();
		result.addAll(icDisks);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.vm.container.wizard.jsf.DiskItemDataContainer_AsDisks_InDiskDataContainerImpl item = new org.sblim.wbemsmt.vm.container.wizard.jsf.DiskItemDataContainer_AsDisks_InDiskDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, result.size());
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
							(LabeledJSFInputComponent)getDisksHeader_usr_Field1(),
							(LabeledJSFInputComponent)getDisksHeader_usr_Field2(),
							(LabeledJSFInputComponent)getDisksHeader_usr_Field3(),
							(LabeledJSFInputComponent)getDisksHeader_usr_Field4(),
							(LabeledJSFInputComponent)getDisksHeader_usr_Remove(),
						};
	}

	private String[] getDisksFieldNames() {
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
		* linked container DiskItemDataContainer
		*/
		public org.sblim.wbemsmt.vm.container.wizard.DiskItemDataContainerHeader getDisksHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field field1
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field1() {
    		if (icDisksHeader_usr_Field1 == null)
    		{
				String label = bundle.getString("DiskItemDataContainer.field1");
				String binding = expressionPrefix + "disksHeader_usr_Field1.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icDisksHeader_usr_Field1 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icDisksHeader_usr_Field1).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icDisksHeader_usr_Field1).setHeader(true);
			
    		return icDisksHeader_usr_Field1;
    	}
				/**
   		 * Header for field field2
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field2() {
    		if (icDisksHeader_usr_Field2 == null)
    		{
				String label = bundle.getString("DiskItemDataContainer.field2");
				String binding = expressionPrefix + "disksHeader_usr_Field2.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icDisksHeader_usr_Field2 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icDisksHeader_usr_Field2).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icDisksHeader_usr_Field2).setHeader(true);
			
    		return icDisksHeader_usr_Field2;
    	}
				/**
   		 * Header for field field3
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field3() {
    		if (icDisksHeader_usr_Field3 == null)
    		{
				String label = bundle.getString("DiskItemDataContainer.field3");
				String binding = expressionPrefix + "disksHeader_usr_Field3.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icDisksHeader_usr_Field3 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icDisksHeader_usr_Field3).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icDisksHeader_usr_Field3).setHeader(true);
			
    		return icDisksHeader_usr_Field3;
    	}
				/**
   		 * Header for field field4
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Field4() {
    		if (icDisksHeader_usr_Field4 == null)
    		{
				String label = bundle.getString("DiskItemDataContainer.field4");
				String binding = expressionPrefix + "disksHeader_usr_Field4.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icDisksHeader_usr_Field4 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icDisksHeader_usr_Field4).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent)icDisksHeader_usr_Field4).setHeader(true);
			
    		return icDisksHeader_usr_Field4;
    	}
				/**
   		 * Header for field remove
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getDisksHeader_usr_Remove() {
    		if (icDisksHeader_usr_Remove == null)
    		{
				String label = bundle.getString("DiskItemDataContainer.remove");
				String binding = expressionPrefix + "disksHeader_usr_Remove.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icDisksHeader_usr_Remove = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icDisksHeader_usr_Remove).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icDisksHeader_usr_Remove).setHeader(true);
			
    		return icDisksHeader_usr_Remove;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_Disks != null)
    		{
				ic_usr_Disks.setLabelText(bundle.getString("DiskDataContainer.disks"));
    		}
	    		if (ic_usr_Add != null)
    		{
				ic_usr_Add.setLabelText(bundle.getString("DiskDataContainer.add"));
    		}
	    		if (ic_usr_Remove != null)
    		{
				ic_usr_Remove.setLabelText(bundle.getString("DiskDataContainer.remove"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesVm"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    			try
		{
			int count = adapter.count("disks",org.sblim.wbemsmt.vm.container.wizard.DiskItemDataContainer.class, this);
	        if (count != disksCount)
	        {
	           disksCount = count;
	           clearDisks();
			   for (int i=0; i < count ; i++) {
	    			addDisks(new org.sblim.wbemsmt.vm.container.wizard.jsf.DiskItemDataContainer_AsDisks_InDiskDataContainerImpl((org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter)adapter,expressionPrefix, i));
			   }
	        }
			getDisksPanel().setList(getDisks());				   
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
		
			   				      getDisksPanel().updateRows();				
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_usr_Disks());
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
    	    		childs.addAll(getDisks());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       DiskDataContainerImpl source = (DiskDataContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_Disks().copyFrom(source.get_usr_Disks());
		        		   get_usr_Add().copyFrom(source.get_usr_Add());
		        		   get_usr_Remove().copyFrom(source.get_usr_Remove());
		    		
    	    		   List<DiskItemDataContainer> targetListForDisks = getDisks();
    		   List<DiskItemDataContainer> sourceListForDisks = source.getDisks();
    		   if (sourceListForDisks.size() != targetListForDisks.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForDisks.size() + " and target is " + targetListForDisks.size() );
    		   }
			       for (int ii=0; ii < sourceListForDisks.size(); ii++)
			       {
				          ((DataContainer) targetListForDisks.get(ii)).copyFrom(((DataContainer) sourceListForDisks.get(ii)));
			        }
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}