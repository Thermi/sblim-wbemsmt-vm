/** 
 * Commands.java
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
 * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/commands.vm
 *
 * Contributors: 
 *   Prashanth Karnam <prkarnam@in.ibm.com> 
 *
 * Description: Class containing the mapping between Commands and the Commandlet
 * 
 * generated Class
 */

package org.sblim.wbemsmt.vm.cli;

public class Commands extends org.sblim.wbemsmt.tools.cli.Commands {

    public Commands() {

        addCommand("DeleteVM", org.sblim.wbemsmt.vm.listener.cli.DeleteVM.class);
        addCommand("CreateVM", org.sblim.wbemsmt.vm.listener.cli.CreateVM.class);
        addCommand("EditVM", org.sblim.wbemsmt.vm.listener.cli.EditVM.class);
    }
}