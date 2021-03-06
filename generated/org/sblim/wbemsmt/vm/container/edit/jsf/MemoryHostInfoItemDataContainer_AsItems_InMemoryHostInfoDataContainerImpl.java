/** 
  * MemoryHostInfoItemDataContainer_AsItems_InMemoryHostInfoDataContainerImpl.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImplMultiLine.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.vm.container.edit.jsf;

import java.util.*;
import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;


	
public class MemoryHostInfoItemDataContainer_AsItems_InMemoryHostInfoDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel2 implements org.sblim.wbemsmt.vm.container.edit.MemoryHostInfoItemDataContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Min;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Max;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_DefaultValue;
		
	public static final int COLS = 3;
	
	public static String[] orientationOfColumnAsCss = new String[]{
    				"left",
    				"left",
    				"left",
    		
	};
	
	
	
	public MemoryHostInfoItemDataContainer_AsItems_InMemoryHostInfoDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,String expressionPrefix,int index) throws WbemsmtException {
	    super(adapter,expressionPrefix,index);
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Min() {
    		if (ic_usr_Min == null)
    		{
				String label = bundle.getString("MemoryHostInfoItemDataContainer.min");
				String binding = expressionPrefix + "items["+ index +"]._usr_Min.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Min = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)ic_usr_Min).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_usr_Min;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Max() {
    		if (ic_usr_Max == null)
    		{
				String label = bundle.getString("MemoryHostInfoItemDataContainer.max");
				String binding = expressionPrefix + "items["+ index +"]._usr_Max.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Max = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)ic_usr_Max).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_usr_Max;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_DefaultValue() {
    		if (ic_usr_DefaultValue == null)
    		{
				String label = bundle.getString("MemoryHostInfoItemDataContainer.defaultValue");
				String binding = expressionPrefix + "items["+ index +"]._usr_DefaultValue.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_DefaultValue = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)ic_usr_DefaultValue).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_usr_DefaultValue;
    	}
		

	/**
	 * @return all the Components
	 */
	public LabeledJSFInputComponent[] getComponents() {
		return new LabeledJSFInputComponent[]{
						(LabeledJSFInputComponent)get_usr_Min(),
						(LabeledJSFInputComponent)get_usr_Max(),
						(LabeledJSFInputComponent)get_usr_DefaultValue(),
					};
	}
	
	
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_Min != null)
    		{
				ic_usr_Min.setLabelText(bundle.getString("MemoryHostInfoItemDataContainer.min"));
    		}
	    		if (ic_usr_Max != null)
    		{
				ic_usr_Max.setLabelText(bundle.getString("MemoryHostInfoItemDataContainer.max"));
    		}
	    		if (ic_usr_DefaultValue != null)
    		{
				ic_usr_DefaultValue.setLabelText(bundle.getString("MemoryHostInfoItemDataContainer.defaultValue"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesVm"};
	}
	
	protected String getOrientationOfColumnAsCss(int column) {
		return orientationOfColumnAsCss[column];
	}
	

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_usr_Min());
    				fields.add(get_usr_Max());
    				fields.add(get_usr_DefaultValue());
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
	    		       MemoryHostInfoItemDataContainer_AsItems_InMemoryHostInfoDataContainerImpl source = (MemoryHostInfoItemDataContainer_AsItems_InMemoryHostInfoDataContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_Min().copyFrom(source.get_usr_Min());
		        		   get_usr_Max().copyFrom(source.get_usr_Max());
		        		   get_usr_DefaultValue().copyFrom(source.get_usr_DefaultValue());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
	
	
	
}