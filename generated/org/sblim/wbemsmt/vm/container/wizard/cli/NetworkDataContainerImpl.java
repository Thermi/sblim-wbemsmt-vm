/** 
  * NetworkDataContainerImpl.java
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

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.BaseDataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.vm.container.wizard.NetworkItemDataContainer;

public class NetworkDataContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.vm.container.wizard.NetworkDataContainer
			, org.sblim.wbemsmt.vm.container.wizard.NetworkItemDataContainerHeader		
	{
			private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Networks;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Add;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Remove;
    			
		
		private java.util.List<NetworkItemDataContainer> icNetworks = new java.util.ArrayList<NetworkItemDataContainer>();

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Field1;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Field2;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Field3;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Field4;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icNetworksHeader_usr_Remove;
		
	
		
	public NetworkDataContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
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
				String label = getAdapter().getBundle().getString("NetworkDataContainer.networks");
				org.sblim.wbemsmt.tools.converter.StringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.UnsignedInt16StringArrayConverter();
    			ic_usr_Networks = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("NetworkDataContainer.add");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Add = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("NetworkDataContainer.remove");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Remove = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(this,label,null,converter);
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
    			String label = getAdapter().getBundle().getString("NetworkItemDataContainer.field1");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.GenericFieldDataConverter();
    			icNetworksHeader_usr_Field1 = new org.sblim.wbemsmt.tools.input.test.LabeledTestGenericDataComponent(this,label,"",converter);
			}
    		return icNetworksHeader_usr_Field1;
    	    }
				/**
   		 * Header for field field2
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Field2() {
    		if (icNetworksHeader_usr_Field2 == null)
    		{
    			String label = getAdapter().getBundle().getString("NetworkItemDataContainer.field2");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.GenericFieldDataConverter();
    			icNetworksHeader_usr_Field2 = new org.sblim.wbemsmt.tools.input.test.LabeledTestGenericDataComponent(this,label,"",converter);
			}
    		return icNetworksHeader_usr_Field2;
    	    }
				/**
   		 * Header for field field3
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Field3() {
    		if (icNetworksHeader_usr_Field3 == null)
    		{
    			String label = getAdapter().getBundle().getString("NetworkItemDataContainer.field3");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.GenericFieldDataConverter();
    			icNetworksHeader_usr_Field3 = new org.sblim.wbemsmt.tools.input.test.LabeledTestGenericDataComponent(this,label,"",converter);
			}
    		return icNetworksHeader_usr_Field3;
    	    }
				/**
   		 * Header for field field4
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Field4() {
    		if (icNetworksHeader_usr_Field4 == null)
    		{
    			String label = getAdapter().getBundle().getString("NetworkItemDataContainer.field4");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.cli.GenericFieldDataConverter();
    			icNetworksHeader_usr_Field4 = new org.sblim.wbemsmt.tools.input.test.LabeledTestGenericDataComponent(this,label,"",converter);
			}
    		return icNetworksHeader_usr_Field4;
    	    }
				/**
   		 * Header for field remove
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getNetworksHeader_usr_Remove() {
    		if (icNetworksHeader_usr_Remove == null)
    		{
    			String label = getAdapter().getBundle().getString("NetworkItemDataContainer.remove");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icNetworksHeader_usr_Remove = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icNetworksHeader_usr_Remove;
    	    }
		

	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("NetworkDataContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_usr_Networks().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Networks()).getValue();
        				printStream.println(get_usr_Networks().getLabelText() + ": " + value);
   			}
   					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title)
	{
    		        		List<NetworkItemDataContainer> listnetworks = getNetworks();
        		printStream.println();
        		printStream.println(getAdapter().getBundle().getString("NetworkDataContainer.role.networks") + " " + getAdapter().getBundle().getString("items.found", new Object[]{new Integer(listnetworks.size())}));
        		for (int i = 0; i < listnetworks.size(); i++) {
        			BaseDataContainer child = (BaseDataContainer)listnetworks.get(i);
        			printStream.println();
        			printStream.println(getAdapter().getBundle().getString("item") + ": " + (i+1) + " " + getAdapter().getBundle().getString("of") + " " + listnetworks.size());
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