/**
 * MigrationWizardContainerPanels.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER
 * THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF
 * THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of
 * the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.WizardGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/wizardContainerPanels.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Panels for generated Class
 */

package org.sblim.wbemsmt.vm.wizard;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.bl.adapter.DataContainer;

public interface MigrationWizardContainerPanels {

    public DataContainer getPanel1() throws WbemsmtException;

    public DataContainer getPanel2a() throws WbemsmtException;

    public DataContainer getPanel2b() throws WbemsmtException;

    public DataContainer getSummary() throws WbemsmtException;

    public DataContainer getPanel2c() throws WbemsmtException;

    public DataContainer getPanel3() throws WbemsmtException;

}