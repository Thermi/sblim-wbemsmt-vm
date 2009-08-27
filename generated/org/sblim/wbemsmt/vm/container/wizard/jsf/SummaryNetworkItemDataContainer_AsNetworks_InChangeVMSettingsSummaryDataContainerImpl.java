/** 
  * SummaryNetworkItemDataContainer_AsNetworks_InChangeVMSettingsSummaryDataContainerImpl.java
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

package org.sblim.wbemsmt.vm.container.wizard.jsf;

import java.util.*;
import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;


	
public class SummaryNetworkItemDataContainer_AsNetworks_InChangeVMSettingsSummaryDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel2 implements org.sblim.wbemsmt.vm.container.wizard.SummaryNetworkItemDataContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_FromPool;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Mac;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Field1;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Field2;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Field3;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Field4;
		
	public static final int COLS = 6;
	
	public static String[] orientationOfColumnAsCss = new String[]{
    				"left",
    				"left",
    				"left",
    				"left",
    				"left",
    				"left",
    		
	};
	
	
	
	public SummaryNetworkItemDataContainer_AsNetworks_InChangeVMSettingsSummaryDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,String expressionPrefix,int index) throws WbemsmtException {
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_FromPool() {
    		if (ic_usr_FromPool == null)
    		{
				String label = bundle.getString("SummaryNetworkItemDataContainer.fromPool");
				String binding = expressionPrefix + "networks["+ index +"]._usr_FromPool.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_FromPool = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)ic_usr_FromPool).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_usr_FromPool;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Mac() {
    		if (ic_usr_Mac == null)
    		{
				String label = bundle.getString("SummaryNetworkItemDataContainer.mac");
				String binding = expressionPrefix + "networks["+ index +"]._usr_Mac.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Mac = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)ic_usr_Mac).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_usr_Mac;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Field1() {
    		if (ic_usr_Field1 == null)
    		{
				String label = bundle.getString("SummaryNetworkItemDataContainer.field1");
				String binding = expressionPrefix + "networks["+ index +"]._usr_Field1.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Field1 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)ic_usr_Field1).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_usr_Field1;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Field2() {
    		if (ic_usr_Field2 == null)
    		{
				String label = bundle.getString("SummaryNetworkItemDataContainer.field2");
				String binding = expressionPrefix + "networks["+ index +"]._usr_Field2.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Field2 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)ic_usr_Field2).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_usr_Field2;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Field3() {
    		if (ic_usr_Field3 == null)
    		{
				String label = bundle.getString("SummaryNetworkItemDataContainer.field3");
				String binding = expressionPrefix + "networks["+ index +"]._usr_Field3.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Field3 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)ic_usr_Field3).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_usr_Field3;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Field4() {
    		if (ic_usr_Field4 == null)
    		{
				String label = bundle.getString("SummaryNetworkItemDataContainer.field4");
				String binding = expressionPrefix + "networks["+ index +"]._usr_Field4.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Field4 = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)ic_usr_Field4).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_usr_Field4;
    	}
		

	/**
	 * @return all the Components
	 */
	public LabeledJSFInputComponent[] getComponents() {
		return new LabeledJSFInputComponent[]{
						(LabeledJSFInputComponent)get_usr_FromPool(),
						(LabeledJSFInputComponent)get_usr_Mac(),
						(LabeledJSFInputComponent)get_usr_Field1(),
						(LabeledJSFInputComponent)get_usr_Field2(),
						(LabeledJSFInputComponent)get_usr_Field3(),
						(LabeledJSFInputComponent)get_usr_Field4(),
					};
	}
	
	
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_FromPool != null)
    		{
				ic_usr_FromPool.setLabelText(bundle.getString("SummaryNetworkItemDataContainer.fromPool"));
    		}
	    		if (ic_usr_Mac != null)
    		{
				ic_usr_Mac.setLabelText(bundle.getString("SummaryNetworkItemDataContainer.mac"));
    		}
	    		if (ic_usr_Field1 != null)
    		{
				ic_usr_Field1.setLabelText(bundle.getString("SummaryNetworkItemDataContainer.field1"));
    		}
	    		if (ic_usr_Field2 != null)
    		{
				ic_usr_Field2.setLabelText(bundle.getString("SummaryNetworkItemDataContainer.field2"));
    		}
	    		if (ic_usr_Field3 != null)
    		{
				ic_usr_Field3.setLabelText(bundle.getString("SummaryNetworkItemDataContainer.field3"));
    		}
	    		if (ic_usr_Field4 != null)
    		{
				ic_usr_Field4.setLabelText(bundle.getString("SummaryNetworkItemDataContainer.field4"));
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
    				fields.add(get_usr_FromPool());
    				fields.add(get_usr_Mac());
    				fields.add(get_usr_Field1());
    				fields.add(get_usr_Field2());
    				fields.add(get_usr_Field3());
    				fields.add(get_usr_Field4());
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
	    		       SummaryNetworkItemDataContainer_AsNetworks_InChangeVMSettingsSummaryDataContainerImpl source = (SummaryNetworkItemDataContainer_AsNetworks_InChangeVMSettingsSummaryDataContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_FromPool().copyFrom(source.get_usr_FromPool());
		        		   get_usr_Mac().copyFrom(source.get_usr_Mac());
		        		   get_usr_Field1().copyFrom(source.get_usr_Field1());
		        		   get_usr_Field2().copyFrom(source.get_usr_Field2());
		        		   get_usr_Field3().copyFrom(source.get_usr_Field3());
		        		   get_usr_Field4().copyFrom(source.get_usr_Field4());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
	
	
	
}