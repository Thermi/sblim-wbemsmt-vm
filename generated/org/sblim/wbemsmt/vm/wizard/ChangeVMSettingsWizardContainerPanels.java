/** 
 * ChangeVMSettingsWizardContainerPanels.java
 *
 * 
 * 
 * © Copyright IBM Corp. 2008, 
 * 
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE 
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE 
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. 
 * 
 * You can obtain a current copy of the Eclipse Public License from 
 * http://www.opensource.org/licenses/eclipse-1.0.php 
 
 *
 * @author: org.sblim.wbemsmt.dcg.generator.WizardGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/wizardContainerPanels.vm
 *
 * Contributors: 
 *   Prashanth Karnam <prkarnam@in.ibm.com>
 * 
 * Description: Panels for 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.wizard;

import org.sblim.wbemsmt.exception.WbemsmtException;

public interface ChangeVMSettingsWizardContainerPanels {

    public Object getVssd() throws WbemsmtException;

    public Object getProcessor() throws WbemsmtException;

    public Object getMemory() throws WbemsmtException;

    public Object getNetwork() throws WbemsmtException;

    public Object getDisk() throws WbemsmtException;

    public Object getSummary() throws WbemsmtException;

}