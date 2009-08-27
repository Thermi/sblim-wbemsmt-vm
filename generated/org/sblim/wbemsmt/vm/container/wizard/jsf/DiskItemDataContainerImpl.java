/** 
  * DiskItemDataContainerImpl.java
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

public class DiskItemDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.vm.container.wizard.DiskItemDataContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Field1;

    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Field2;

    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Field3;

    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Field4;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Remove;

    	
		
	
	public DiskItemDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "DiskItemDataContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Field1());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Field2());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Field3());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Field4());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Remove());
        					
		setFooter(getPanelForCustomLayout(),"DiskItemDataContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType GENERICFIELDDATA
		* UIType GENERIC
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Field1() {
    		if (ic_usr_Field1 == null)
    		{
				String label = bundle.getString("DiskItemDataContainer.field1");
				String binding = expressionPrefix + "_usr_Field1.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Field1 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Field1;
    	}
			/**
		* 
		* DataType GENERICFIELDDATA
		* UIType GENERIC
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Field2() {
    		if (ic_usr_Field2 == null)
    		{
				String label = bundle.getString("DiskItemDataContainer.field2");
				String binding = expressionPrefix + "_usr_Field2.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Field2 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Field2;
    	}
			/**
		* 
		* DataType GENERICFIELDDATA
		* UIType GENERIC
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Field3() {
    		if (ic_usr_Field3 == null)
    		{
				String label = bundle.getString("DiskItemDataContainer.field3");
				String binding = expressionPrefix + "_usr_Field3.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Field3 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Field3;
    	}
			/**
		* 
		* DataType GENERICFIELDDATA
		* UIType GENERIC
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Field4() {
    		if (ic_usr_Field4 == null)
    		{
				String label = bundle.getString("DiskItemDataContainer.field4");
				String binding = expressionPrefix + "_usr_Field4.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Field4 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Field4;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Remove() {
    		if (ic_usr_Remove == null)
    		{
				String label = bundle.getString("DiskItemDataContainer.remove");
				String binding = expressionPrefix + "_usr_Remove.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Remove = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Remove;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_Field1 != null)
    		{
				ic_usr_Field1.setLabelText(bundle.getString("DiskItemDataContainer.field1"));
    		}
	    		if (ic_usr_Field2 != null)
    		{
				ic_usr_Field2.setLabelText(bundle.getString("DiskItemDataContainer.field2"));
    		}
	    		if (ic_usr_Field3 != null)
    		{
				ic_usr_Field3.setLabelText(bundle.getString("DiskItemDataContainer.field3"));
    		}
	    		if (ic_usr_Field4 != null)
    		{
				ic_usr_Field4.setLabelText(bundle.getString("DiskItemDataContainer.field4"));
    		}
	    		if (ic_usr_Remove != null)
    		{
				ic_usr_Remove.setLabelText(bundle.getString("DiskItemDataContainer.remove"));
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
    				fields.add(get_usr_Field1());
    				fields.add(get_usr_Field2());
    				fields.add(get_usr_Field3());
    				fields.add(get_usr_Field4());
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
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       DiskItemDataContainerImpl source = (DiskItemDataContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_Field1().copyFrom(source.get_usr_Field1());
		        		   get_usr_Field2().copyFrom(source.get_usr_Field2());
		        		   get_usr_Field3().copyFrom(source.get_usr_Field3());
		        		   get_usr_Field4().copyFrom(source.get_usr_Field4());
		        		   get_usr_Remove().copyFrom(source.get_usr_Remove());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}