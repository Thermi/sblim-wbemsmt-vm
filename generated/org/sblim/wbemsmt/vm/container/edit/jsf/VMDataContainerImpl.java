/** 
  * VMDataContainerImpl.java
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

package org.sblim.wbemsmt.vm.container.edit.jsf;

import org.sblim.wbemsmt.exception.*;
import java.util.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class VMDataContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.vm.container.edit.VMDataContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_VmID;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_VmName;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_EnabledState;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_RequestedState;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Info;

    	
		
			VMDataContainerImplLayouter layouter = null;
		
		public VMDataContainerImplLayouter getLayouter()
		{
			return layouter;
		}	
	
	public VMDataContainerImpl(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "VMDataContainer.caption",false);
				
				
		
				
    			
    				layouter = new VMDataContainerImplLayouter();
			//layout is done in the edit-method of the Editbean
			//layouter.layout(getPanelForCustomLayout(),this,bundle);
				
		setFooter(getPanelForCustomLayout(),"VMDataContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_VmID() {
    		if (ic_VmID == null)
    		{
				String label = bundle.getString("VMDataContainer.vmID");
				String binding = expressionPrefix + "_VmID.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_VmID = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_VmID;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_VmName() {
    		if (ic_VmName == null)
    		{
				String label = bundle.getString("VMDataContainer.vmName");
				String binding = expressionPrefix + "_VmName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_VmName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_VmName;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_EnabledState() {
    		if (ic_EnabledState == null)
    		{
				String label = bundle.getString("VMDataContainer.EnabledState");
				String binding = expressionPrefix + "_EnabledState.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_EnabledState = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_EnabledState;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_RequestedState() {
    		if (ic_RequestedState == null)
    		{
				String label = bundle.getString("VMDataContainer.RequestedState");
				String binding = expressionPrefix + "_RequestedState.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_RequestedState = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_RequestedState;
    	}
			/**
		* 
		* DataType STRING
		* UIType LABEL
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Info() {
    		if (ic_Info == null)
    		{
				String label = bundle.getString("VMDataContainer.Info");
				String binding = expressionPrefix + "_Info.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_Info = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_Info;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_VmID != null)
    		{
				ic_VmID.setLabelText(bundle.getString("VMDataContainer.vmID"));
    		}
	    		if (ic_VmName != null)
    		{
				ic_VmName.setLabelText(bundle.getString("VMDataContainer.vmName"));
    		}
	    		if (ic_EnabledState != null)
    		{
				ic_EnabledState.setLabelText(bundle.getString("VMDataContainer.EnabledState"));
    		}
	    		if (ic_RequestedState != null)
    		{
				ic_RequestedState.setLabelText(bundle.getString("VMDataContainer.RequestedState"));
    		}
	    		if (ic_Info != null)
    		{
				ic_Info.setLabelText(bundle.getString("VMDataContainer.Info"));
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
    				fields.add(get_VmID());
    				fields.add(get_VmName());
    				fields.add(get_EnabledState());
    				fields.add(get_RequestedState());
    				fields.add(get_Info());
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
	    		       VMDataContainerImpl source = (VMDataContainerImpl)sourceContainer;
		    		    
    	    		   get_VmID().copyFrom(source.get_VmID());
		        		   get_VmName().copyFrom(source.get_VmName());
		        		   get_EnabledState().copyFrom(source.get_EnabledState());
		        		   get_RequestedState().copyFrom(source.get_RequestedState());
		        		   get_Info().copyFrom(source.get_Info());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}