/** 
  * DiskItemDataContainerImpl.java
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

public class DiskItemDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.vm.container.wizard.DiskItemDataContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Field1;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Field2;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Field3;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Field4;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Remove;
    	
		
	public DiskItemDataContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
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
				String label = getAdapter().getBundle().getString("DiskItemDataContainer.field1");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.GenericFieldDataConverter();
    			ic_usr_Field1 = new org.sblim.wbemsmt.tools.input.test.LabeledTestGenericDataComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("DiskItemDataContainer.field2");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.GenericFieldDataConverter();
    			ic_usr_Field2 = new org.sblim.wbemsmt.tools.input.test.LabeledTestGenericDataComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("DiskItemDataContainer.field3");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.GenericFieldDataConverter();
    			ic_usr_Field3 = new org.sblim.wbemsmt.tools.input.test.LabeledTestGenericDataComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("DiskItemDataContainer.field4");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.GenericFieldDataConverter();
    			ic_usr_Field4 = new org.sblim.wbemsmt.tools.input.test.LabeledTestGenericDataComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("DiskItemDataContainer.remove");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Remove = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_Remove;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("DiskItemDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
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
   			   			   			if (get_usr_Remove().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Remove()).getValue();
        				printStream.println(get_usr_Remove().getLabelText() + ": " + value);
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