/** 
  * CreateMigrationContainerPage2bImpl.java
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

public class CreateMigrationContainerPage2bImpl extends BaseDataContainer implements org.sblim.wbemsmt.vm.container.wizard.CreateMigrationContainerPage2b
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_MigrationTargetHostname;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_MigrationTargetPort;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_MigrationTargetNamespace;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_MigrationTargetUser;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_MigrationTargetPassword;
    	
		
	public CreateMigrationContainerPage2bImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_MigrationTargetHostname() {
    		if (ic_usr_MigrationTargetHostname == null)
    		{
				String label = getAdapter().getBundle().getString("CreateMigrationContainerPage2b.migrationTargetHostname");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_MigrationTargetHostname = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_MigrationTargetHostname;
    	}
			/**
		* 
		* DataType UNSIGNED_INT16
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_MigrationTargetPort() {
    		if (ic_usr_MigrationTargetPort == null)
    		{
				String label = getAdapter().getBundle().getString("CreateMigrationContainerPage2b.migrationTargetPort");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter();
    			ic_usr_MigrationTargetPort = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_MigrationTargetPort;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_MigrationTargetNamespace() {
    		if (ic_usr_MigrationTargetNamespace == null)
    		{
				String label = getAdapter().getBundle().getString("CreateMigrationContainerPage2b.migrationTargetNamespace");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_MigrationTargetNamespace = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_MigrationTargetNamespace;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_MigrationTargetUser() {
    		if (ic_usr_MigrationTargetUser == null)
    		{
				String label = getAdapter().getBundle().getString("CreateMigrationContainerPage2b.migrationTargetUser");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_MigrationTargetUser = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_MigrationTargetUser;
    	}
			/**
		* 
		* DataType STRING
		* UIType PASSWORD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_MigrationTargetPassword() {
    		if (ic_usr_MigrationTargetPassword == null)
    		{
				String label = getAdapter().getBundle().getString("CreateMigrationContainerPage2b.migrationTargetPassword");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_MigrationTargetPassword = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_MigrationTargetPassword;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("CreateMigrationContainerPage2b.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_usr_MigrationTargetHostname().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_MigrationTargetHostname()).getValue();
        				printStream.println(get_usr_MigrationTargetHostname().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_MigrationTargetPort().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_MigrationTargetPort()).getValue();
        				printStream.println(get_usr_MigrationTargetPort().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_MigrationTargetNamespace().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_MigrationTargetNamespace()).getValue();
        				printStream.println(get_usr_MigrationTargetNamespace().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_MigrationTargetUser().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_MigrationTargetUser()).getValue();
        				printStream.println(get_usr_MigrationTargetUser().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_MigrationTargetPassword().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_MigrationTargetPassword()).getValue();
        				printStream.println(get_usr_MigrationTargetPassword().getLabelText() + ": " + value);
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
    				fields.add(get_usr_MigrationTargetHostname());
    				fields.add(get_usr_MigrationTargetPort());
    				fields.add(get_usr_MigrationTargetNamespace());
    				fields.add(get_usr_MigrationTargetUser());
    				fields.add(get_usr_MigrationTargetPassword());
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
	    		       CreateMigrationContainerPage2bImpl source = (CreateMigrationContainerPage2bImpl)sourceContainer;
		    		    
    	    		   get_usr_MigrationTargetHostname().copyFrom(source.get_usr_MigrationTargetHostname());
		        		   get_usr_MigrationTargetPort().copyFrom(source.get_usr_MigrationTargetPort());
		        		   get_usr_MigrationTargetNamespace().copyFrom(source.get_usr_MigrationTargetNamespace());
		        		   get_usr_MigrationTargetUser().copyFrom(source.get_usr_MigrationTargetUser());
		        		   get_usr_MigrationTargetPassword().copyFrom(source.get_usr_MigrationTargetPassword());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}