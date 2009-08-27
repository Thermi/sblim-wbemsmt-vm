/** 
  * ProcessorDataContainerImpl.java
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

public class ProcessorDataContainerImpl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.vm.container.wizard.ProcessorDataContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Amount;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Min;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Max;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Default;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Weight;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Limit;

    	
		
	
	public ProcessorDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "ProcessorDataContainer.caption","ProcessorDataContainer.subTitle",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Amount());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Min());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Max());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Default());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Weight());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Limit());
        					
		setFooter(getPanelForCustomLayout(),"ProcessorDataContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Amount() {
    		if (ic_usr_Amount == null)
    		{
				String label = bundle.getString("ProcessorDataContainer.amount");
				String binding = expressionPrefix + "_usr_Amount.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Amount = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Amount;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Min() {
    		if (ic_usr_Min == null)
    		{
				String label = bundle.getString("ProcessorDataContainer.min");
				String binding = expressionPrefix + "_usr_Min.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Min = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Min;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Max() {
    		if (ic_usr_Max == null)
    		{
				String label = bundle.getString("ProcessorDataContainer.max");
				String binding = expressionPrefix + "_usr_Max.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Max = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Max;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Default() {
    		if (ic_usr_Default == null)
    		{
				String label = bundle.getString("ProcessorDataContainer.default");
				String binding = expressionPrefix + "_usr_Default.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Default = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Default;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Weight() {
    		if (ic_usr_Weight == null)
    		{
				String label = bundle.getString("ProcessorDataContainer.weight");
				String binding = expressionPrefix + "_usr_Weight.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Weight = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Weight;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Limit() {
    		if (ic_usr_Limit == null)
    		{
				String label = bundle.getString("ProcessorDataContainer.limit");
				String binding = expressionPrefix + "_usr_Limit.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Limit = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Limit;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_Amount != null)
    		{
				ic_usr_Amount.setLabelText(bundle.getString("ProcessorDataContainer.amount"));
    		}
	    		if (ic_usr_Min != null)
    		{
				ic_usr_Min.setLabelText(bundle.getString("ProcessorDataContainer.min"));
    		}
	    		if (ic_usr_Max != null)
    		{
				ic_usr_Max.setLabelText(bundle.getString("ProcessorDataContainer.max"));
    		}
	    		if (ic_usr_Default != null)
    		{
				ic_usr_Default.setLabelText(bundle.getString("ProcessorDataContainer.default"));
    		}
	    		if (ic_usr_Weight != null)
    		{
				ic_usr_Weight.setLabelText(bundle.getString("ProcessorDataContainer.weight"));
    		}
	    		if (ic_usr_Limit != null)
    		{
				ic_usr_Limit.setLabelText(bundle.getString("ProcessorDataContainer.limit"));
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
    				fields.add(get_usr_Amount());
    				fields.add(get_usr_Min());
    				fields.add(get_usr_Max());
    				fields.add(get_usr_Default());
    				fields.add(get_usr_Weight());
    				fields.add(get_usr_Limit());
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
	    		       ProcessorDataContainerImpl source = (ProcessorDataContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_Amount().copyFrom(source.get_usr_Amount());
		        		   get_usr_Min().copyFrom(source.get_usr_Min());
		        		   get_usr_Max().copyFrom(source.get_usr_Max());
		        		   get_usr_Default().copyFrom(source.get_usr_Default());
		        		   get_usr_Weight().copyFrom(source.get_usr_Weight());
		        		   get_usr_Limit().copyFrom(source.get_usr_Limit());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}