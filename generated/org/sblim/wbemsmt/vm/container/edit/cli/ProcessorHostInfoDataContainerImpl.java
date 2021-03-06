/** 
  * ProcessorHostInfoDataContainerImpl.java
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

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.BaseDataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.vm.container.edit.ProcessorHostInfoItemDataContainer;

public class ProcessorHostInfoDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.vm.container.edit.ProcessorHostInfoDataContainer
			, org.sblim.wbemsmt.vm.container.edit.ProcessorHostInfoItemDataContainerHeader		
	{
				
		
		private java.util.List<ProcessorHostInfoItemDataContainer> icItems = new java.util.ArrayList<ProcessorHostInfoItemDataContainer>();

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Min;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_Max;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icItemsHeader_usr_DefaultValue;
		
	
		
	public ProcessorHostInfoDataContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

		
			
		
		/**
		* 
		* linked container ProcessorHostInfoItemDataContainer
		*/
				public java.util.List<ProcessorHostInfoItemDataContainer> getItems()
				{
			return icItems;
		}

   	       /**
		* Header for:
		* 
		* linked container ProcessorHostInfoItemDataContainer
		*/
		public org.sblim.wbemsmt.vm.container.edit.ProcessorHostInfoItemDataContainerHeader getItemsHeader()
		{
			return this;
		}

				/**
   		 * Header for field min
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Min() {
    		if (icItemsHeader_usr_Min == null)
    		{
    			String label = getAdapter().getBundle().getString("ProcessorHostInfoItemDataContainer.min");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icItemsHeader_usr_Min = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icItemsHeader_usr_Min;
    	    }
				/**
   		 * Header for field max
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_Max() {
    		if (icItemsHeader_usr_Max == null)
    		{
    			String label = getAdapter().getBundle().getString("ProcessorHostInfoItemDataContainer.max");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icItemsHeader_usr_Max = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icItemsHeader_usr_Max;
    	    }
				/**
   		 * Header for field defaultValue
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getItemsHeader_usr_DefaultValue() {
    		if (icItemsHeader_usr_DefaultValue == null)
    		{
    			String label = getAdapter().getBundle().getString("ProcessorHostInfoItemDataContainer.defaultValue");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icItemsHeader_usr_DefaultValue = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icItemsHeader_usr_DefaultValue;
    	    }
		

	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("ProcessorHostInfoDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title)
	{
    		        		List<ProcessorHostInfoItemDataContainer> listitems = getItems();
        		printStream.println();
        		printStream.println(getAdapter().getBundle().getString("ProcessorHostInfoDataContainer.role.items") + " " + getAdapter().getBundle().getString("items.found", new Object[]{new Integer(listitems.size())}));
        		for (int i = 0; i < listitems.size(); i++) {
        			BaseDataContainer child = (BaseDataContainer)listitems.get(i);
        			printStream.println();
        			printStream.println(getAdapter().getBundle().getString("item") + ": " + (i+1) + " " + getAdapter().getBundle().getString("of") + " " + listitems.size());
        			child.trace(printStream,listOptions,false);
        		}
    			
			
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
	    		       ProcessorHostInfoDataContainerImpl source = (ProcessorHostInfoDataContainerImpl)sourceContainer;
		    		    
    			
    	    		   List<ProcessorHostInfoItemDataContainer> targetListForItems = getItems();
    		   List<ProcessorHostInfoItemDataContainer> sourceListForItems = source.getItems();
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