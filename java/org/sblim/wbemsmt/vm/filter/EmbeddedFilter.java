 /** 
  * EmbeddedFilter.java
  *
  * © Copyright IBM Corp. 2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Common Public License from
  * http://www.opensource.org/licenses/cpl1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Filter for the Metacluster tree used in embedded mode
  * 
  */
package org.sblim.wbemsmt.vm.filter;

import java.util.logging.Level;

import org.apache.xmlbeans.XmlObject;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.TreenodeDocument.Treenode;


public class EmbeddedFilter extends org.sblim.wbemsmt.filter.EmbeddedFilter {

	public Treenode filter(Treenode root) {
		try {
			XmlObject editServiceListener = root.getTreenodeArray(0).getEventListenerArray(0).copy();
			XmlObject initAdapterListener = root.getTreenodeArray(0).getEventListenerArray(1).copy();
			XmlObject dynamicTreeBuilder  = root.getTreenodeArray(0).getTreenodeArray(0).getEventListenerArray(0).copy();
			
			root.getTreenodeArray(0).getTreenodeArray(0).removeEventListener(0);
			//Node with the service
			XmlObject serviceNode  = root.getTreenodeArray(0).getTreenodeArray(0).copy();
 
			
			//remove the node with the taskname
			root.removeTreenode(0);
			
			Treenode newNode = root.addNewTreenode();
			newNode.set(serviceNode);
						
			newNode.addNewEventListener().set(initAdapterListener);
			newNode.addNewEventListener().set(editServiceListener);
			newNode.addNewEventListener().set(dynamicTreeBuilder);
			
			return root;
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot filter Treemodel",e);
			return null;
		}
	}
	
}
