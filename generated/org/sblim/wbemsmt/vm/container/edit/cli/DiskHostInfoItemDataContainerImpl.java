/** 
  * DiskHostInfoItemDataContainerImpl.java
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

package org.sblim.wbemsmt.vm.container.edit.cli;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class DiskHostInfoItemDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.vm.container.edit.DiskHostInfoItemDataContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Pool;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Disk;
    	
		
	public DiskHostInfoItemDataContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Pool() {
    		if (ic_usr_Pool == null)
    		{
				String label = getAdapter().getBundle().getString("DiskHostInfoItemDataContainer.pool");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Pool = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_Pool;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Disk() {
    		if (ic_usr_Disk == null)
    		{
				String label = getAdapter().getBundle().getString("DiskHostInfoItemDataContainer.disk");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Disk = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_Disk;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("DiskHostInfoItemDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_usr_Pool().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Pool()).getValue();
        				printStream.println(get_usr_Pool().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Disk().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Disk()).getValue();
        				printStream.println(get_usr_Disk().getLabelText() + ": " + value);
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
    				fields.add(get_usr_Pool());
    				fields.add(get_usr_Disk());
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
	    		       DiskHostInfoItemDataContainerImpl source = (DiskHostInfoItemDataContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_Pool().copyFrom(source.get_usr_Pool());
		        		   get_usr_Disk().copyFrom(source.get_usr_Disk());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}