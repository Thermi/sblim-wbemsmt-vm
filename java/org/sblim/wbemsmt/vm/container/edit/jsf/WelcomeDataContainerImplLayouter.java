 /** 
  * WelcomeDataContainerImplLayouter.java
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
  * Description: Layouter for the WelcomeDataContainerImp
  * 
  */
package org.sblim.wbemsmt.vm.container.edit.jsf;

import javax.faces.component.html.HtmlPanelGrid;

import org.sblim.wbemsmt.jsf.layout.JsfLayouter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFPictureComponent;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.vm.container.edit.jsf.WelcomeDataContainerImpl;

/**
 * @author Bauschert
 *
 */
public class WelcomeDataContainerImplLayouter extends JsfLayouter {

	public void layout(HtmlPanelGrid parent, WelcomeDataContainerImpl container, WbemSmtResourceBundle bundle) {
		
		LabeledJSFPictureComponent picture = (LabeledJSFPictureComponent) container.get_usr_Picture();
		LabeledJSFInputComponent text = (LabeledJSFInputComponent)container.get_usr_Welcometext();
		
		parent.getChildren().add(picture.getComponentPanel());
		parent.getChildren().add(text.getComponentPanel());
		
		addComponent(parent, (LabeledJSFInputComponent) container.get_usr_CreateLink());
		
	}

}
