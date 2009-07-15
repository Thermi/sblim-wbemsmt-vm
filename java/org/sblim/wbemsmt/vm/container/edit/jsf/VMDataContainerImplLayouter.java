 /** 
  * VMDataContainerImplLayouter.java
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
  * Description: layouter for the VMDataContainerImpl
  * 
  */
package org.sblim.wbemsmt.vm.container.edit.jsf;

import javax.faces.component.html.HtmlPanelGrid;

import org.sblim.wbemsmt.jsf.layout.JsfLayouter;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.vm.container.edit.jsf.VMDataContainerImpl;

/**
 * @author Bauschert
 *
 */
public class VMDataContainerImplLayouter extends JsfLayouter {

	public void layout(HtmlPanelGrid parent, VMDataContainerImpl container, WbemSmtResourceBundle bundle) {
		container.get_VmName().setSize(LabeledBaseInputComponentIf.SIZE_L);
		container.get_VmID().setSize(LabeledBaseInputComponentIf.SIZE_L);
		container.get_EnabledState().setSize(LabeledBaseInputComponentIf.SIZE_L);
		container.get_RequestedState().setSize(LabeledBaseInputComponentIf.SIZE_L);
		
		addComponent(parent, (LabeledJSFInputComponent) container.get_VmID());
		addComponent(parent, (LabeledJSFInputComponent) container.get_VmName());
        addComponent(parent, (LabeledJSFInputComponent) container.get_Info());
		addComponent(parent, (LabeledJSFInputComponent) container.get_EnabledState());
		addComponent(parent, (LabeledJSFInputComponent) container.get_RequestedState());
	}

}
