/** 
  * SummaryNetworkItemDataContainerImpl.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/cmd/containerImpl.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.vm.container.wizard.cli;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class SummaryNetworkItemDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.vm.container.wizard.SummaryNetworkItemDataContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_FromPool;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Mac;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Field1;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Field2;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Field3;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Field4;
    	
		
	public SummaryNetworkItemDataContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_FromPool() {
    		if (ic_usr_FromPool == null)
    		{
				String label = getAdapter().getBundle().getString("SummaryNetworkItemDataContainer.fromPool");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_FromPool = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_FromPool;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Mac() {
    		if (ic_usr_Mac == null)
    		{
				String label = getAdapter().getBundle().getString("SummaryNetworkItemDataContainer.mac");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Mac = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_Mac;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Field1() {
    		if (ic_usr_Field1 == null)
    		{
				String label = getAdapter().getBundle().getString("SummaryNetworkItemDataContainer.field1");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Field1 = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_Field1;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Field2() {
    		if (ic_usr_Field2 == null)
    		{
				String label = getAdapter().getBundle().getString("SummaryNetworkItemDataContainer.field2");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Field2 = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_Field2;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Field3() {
    		if (ic_usr_Field3 == null)
    		{
				String label = getAdapter().getBundle().getString("SummaryNetworkItemDataContainer.field3");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Field3 = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_Field3;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Field4() {
    		if (ic_usr_Field4 == null)
    		{
				String label = getAdapter().getBundle().getString("SummaryNetworkItemDataContainer.field4");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Field4 = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_Field4;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("SummaryNetworkItemDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_usr_FromPool().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_FromPool()).getValue();
        				printStream.println(get_usr_FromPool().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Mac().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Mac()).getValue();
        				printStream.println(get_usr_Mac().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Field1().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Field1()).getValue();
        				printStream.println(get_usr_Field1().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Field2().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Field2()).getValue();
        				printStream.println(get_usr_Field2().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Field3().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Field3()).getValue();
        				printStream.println(get_usr_Field3().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Field4().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Field4()).getValue();
        				printStream.println(get_usr_Field4().getLabelText() + ": " + value);
   			}
   					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title)
	{
    			
			
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
	    		       SummaryNetworkItemDataContainerImpl source = (SummaryNetworkItemDataContainerImpl)sourceContainer;
		    		    
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