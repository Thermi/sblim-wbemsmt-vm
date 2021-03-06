/** 
  * NetworkHostInfoItemDataContainer_AsItems_InNetworkHostInfoDataContainerImpl.java
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


	
public class NetworkHostInfoItemDataContainer_AsItems_InNetworkHostInfoDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel2 implements org.sblim.wbemsmt.vm.container.edit.NetworkHostInfoItemDataContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Pool;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Network;
		
	public static final int COLS = 2;
	
	public static String[] orientationOfColumnAsCss = new String[]{
    				"left",
    				"left",
    		
	};
	
	
	
	public NetworkHostInfoItemDataContainer_AsItems_InNetworkHostInfoDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,String expressionPrefix,int index) throws WbemsmtException {
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Pool() {
    		if (ic_usr_Pool == null)
    		{
				String label = bundle.getString("NetworkHostInfoItemDataContainer.pool");
				String binding = expressionPrefix + "items["+ index +"]._usr_Pool.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Pool = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)ic_usr_Pool).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_usr_Pool;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Network() {
    		if (ic_usr_Network == null)
    		{
				String label = bundle.getString("NetworkHostInfoItemDataContainer.network");
				String binding = expressionPrefix + "items["+ index +"]._usr_Network.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Network = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent)ic_usr_Network).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_usr_Network;
    	}
		

	/**
	 * @return all the Components
	 */
	public LabeledJSFInputComponent[] getComponents() {
		return new LabeledJSFInputComponent[]{
						(LabeledJSFInputComponent)get_usr_Pool(),
						(LabeledJSFInputComponent)get_usr_Network(),
					};
	}
	
	
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_Pool != null)
    		{
				ic_usr_Pool.setLabelText(bundle.getString("NetworkHostInfoItemDataContainer.pool"));
    		}
	    		if (ic_usr_Network != null)
    		{
				ic_usr_Network.setLabelText(bundle.getString("NetworkHostInfoItemDataContainer.network"));
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
    				fields.add(get_usr_Pool());
    				fields.add(get_usr_Network());
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
	    		       NetworkHostInfoItemDataContainer_AsItems_InNetworkHostInfoDataContainerImpl source = (NetworkHostInfoItemDataContainer_AsItems_InNetworkHostInfoDataContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_Pool().copyFrom(source.get_usr_Pool());
		        		   get_usr_Network().copyFrom(source.get_usr_Network());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
	
	
	
}