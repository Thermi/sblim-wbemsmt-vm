/** 
 * MigrationWizardContainerPanels.java
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

public interface MigrationWizardContainerPanels {

    public Object getPanel1() throws WbemsmtException;

    public Object getPanel2a() throws WbemsmtException;

    public Object getPanel2b() throws WbemsmtException;

    public Object getSummary() throws WbemsmtException;

    public Object getPanel2c() throws WbemsmtException;

    public Object getPanel3() throws WbemsmtException;

}