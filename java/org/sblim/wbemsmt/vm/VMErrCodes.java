 /** 
  * MetaclusterErrCodes.java
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
  * Description: ErrorCodes for metacluster Task
  * 
  */
package org.sblim.wbemsmt.vm;

import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageDefinition;
import org.sblim.wbemsmt.bl.messages.MessageNumber;

/**
 * @author Bauschert
 *
 */
public class VMErrCodes {
	/**
	 * Metacluster
	 */
	public final static String SUBSYS_VMA = "VMA";

	/**
	 * Messages for Virtual Machnne task
	 */
	public static final MessageNumber MSG_CANNOT_SELECT_SERVICE = new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,1);
	public static final MessageNumber MSG_NO_CIM_CLIENT = new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,2);

	public static final MessageDefinition MSGDEF_CONTAINER_STARTED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,3),Message.SUCCESS,"container.started");
	public static final MessageDefinition MSGDEF_CONTAINER_STOPPED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,4),Message.SUCCESS,"container.stopped");

	public static final MessageDefinition MSGDEF_CONTAINER_NOT_STARTED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,5),Message.ERROR,"container.not.started");
	public static final MessageDefinition MSGDEF_CONTAINER_NOT_STOPPED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,6),Message.ERROR,"container.not.stopped");

	public static final MessageDefinition MSGDEF_CONTAINER_NOT_STARTED_NOT_FOUND = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,7),Message.ERROR,"container.not.started.not.found");
	public static final MessageDefinition MSGDEF_NO_ACTIVE_TARGETSYSTEM = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,8),Message.ERROR,"no.active.targetsystems");
	public static final MessageDefinition MSGDEF_NO_TARGETSYSTEM_SELECTED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,9),Message.ERROR,"no.targetsystem.selected");
	
	public static final MessageDefinition MSGDEF_CONTAINER_NOT_RUNNING_MIGRATION_NOT_POSSIBLE = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,10),Message.ERROR,"container.not.running.migration.not.possible");

	public static final MessageDefinition MSGDEF_CONTAINER_ON_TARGETSYSTEM_NOT_FOUND = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,11),Message.ERROR,"container.on.targetsystem.not.found");

	public static final MessageDefinition MSGDEF_CONTAINER_ON_TARGETSYSTEM_NOT_STOPPED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,12),Message.ERROR,"container.on.targetsystem.not.stopped");

	public static final MessageDefinition MSGDEF_TARGET_NOT_FOUND = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,13),Message.ERROR,"targetsystem.not.found");
	
	public static final MessageDefinition MSGDEF_NO_CIM_OBJECTS_FOUND = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,14),Message.ERROR,"no.cimobjects.found");
	
	public static final MessageDefinition MSGDEF_TARGET_NOT_AUTHENTICATED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,15),Message.ERROR,"targetsystem.not.authenticated");

	public static final MessageDefinition MSGDEF_NAMESPACES_NOT_THE_SAME = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,16),Message.WARNING,"namespaces.not.the.same");

	public static final MessageDefinition MSGDEF_INVALID_CIM_CLIENT_PARAMETERS = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,17),Message.ERROR,"invalid.cim.client.parameters");

	public static final MessageDefinition MSGDEF_CANNOT_LOAD_CONTAINERS = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,18),Message.ERROR,"cannot.load.containers");

	public static final MessageDefinition MSGDEF_MORE_THAN_MAX_METRIC = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,19),Message.WARNING,"more.than.max.metrics.selected");
	
	public static final MessageDefinition MSGDEF_CONTAINER_NOT_MIGRATABLE_TO_HOST = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,20),Message.ERROR,"container.not.migratable.to.host");
	
	public static final MessageDefinition MSGDEF_CONTAINER_NOT_MIGRATABLE_TO_SYSTEM = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,21),Message.ERROR,"container.not.migratable.to.sytem");

	public static final MessageDefinition MSGDEF_CONTAINER_MIGRATABLE_CHECK_NOT_POSSIBLE = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,22),Message.WARNING,"container.migratable.check.not.possible");

	public static final MessageDefinition MSGDEF_CONTAINER_MIGRATED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,23),Message.SUCCESS,"container.migrated");

	public static final MessageDefinition MSGDEF_CONTAINER_NOT_MIGRATED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,24),Message.ERROR,"container.not.migrated");

	public static final MessageDefinition MSGDEF_MIGRATION_NOT_POSSIBLE_NO_SERVICE = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,25),Message.ERROR,"migration.not.possible.no.service");
	
	public static final MessageDefinition MSGDEF_MIGRATION_NOT_POSSIBLE_NO_MIGRATION_METHODS = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,26),Message.ERROR,"migration.not.possible.no.migration.methods");
	
	public static final MessageDefinition MSGDEF_ELEMENT_NAME_MAX_LENGTH_EXCEEDED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,27),Message.ERROR,"element.name.max.length.exceeded");

	public static final MessageDefinition MSGDEF_ELEMENT_NAME_MAX_LENGTH_CHECK_NOT_POSSIBLE = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,28),Message.WARNING,"element.name.max.length.check.not.possible");
	
	public static final MessageDefinition MSGDEF_DELETION_NOT_POSSIBLE_CAPABILITIES = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,29),Message.ERROR,"deletion.not.possible.capabilities");
	
	public static final MessageDefinition MSGDEF_CREATION_NOT_POSSIBLE_CAPABILITIES = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,30),Message.ERROR,"creation.not.possible.capabilities");
	
	public static final MessageDefinition MSGDEF_SLASH_ADDED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,31),Message.INFO,"slash.added");

	public static final MessageDefinition MSGDEF_CONTAINER_WITH_NO_VIRTUALSYSTEMTYPE = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,32),Message.ERROR,"container.with.no.virtualsystemtype");
	
	public static final MessageDefinition MSGDEF_STATE_NOT_SUPPORTED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,33),Message.WARNING,"state.not.supported");
	
    public static final MessageDefinition MSGDEF_CANNOT_LOAD_VM = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,34),Message.ERROR,"cannot.load.vm");

    public static final MessageDefinition MSGDEF_STATECHANGE_SUCCESS = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,35),Message.SUCCESS,"statechange.success");

    public static final MessageDefinition MSGDEF_STATECHANGE_FAILED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,36),Message.ERROR,"statechange.failed");

    public static final MessageDefinition MSGDEF_DELETING_JOB_FAILED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,37),Message.WARNING,"deleting.job.failed");
    
    public static final MessageDefinition MSGDEF_NO_RETURN_VALUE = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,38),Message.ERROR,"no.return.value");
    
    public static final MessageDefinition MSGDEF_INVALID_MEMORY = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,39),Message.ERROR,"invalid.memory");

    public static final MessageDefinition MSGDEF_INVALID_PROCESSOR = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,40),Message.ERROR,"invalid.processor");

    public static final MessageDefinition MSGDEF_DEFINESYSTEM_FAILED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,41),Message.ERROR,"definesystem.failed");

    public static final MessageDefinition MSGDEF_NO_RASD = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,42),Message.WARNING,"no.rasd.found");

    public static final MessageDefinition MSGDEF_MEM_BELOW_MIN = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,43),Message.ERROR,"mem.below.min");
    public static final MessageDefinition MSGDEF_MEM_ABOVE_MAX = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,44),Message.ERROR,"mem.above.max");
    public static final MessageDefinition MSGDEF_MEM_VALIDATION_PROBLEMS = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,45),Message.WARNING,"mem.validation.not.possible");

    public static final MessageDefinition MSGDEF_PROC_BELOW_MIN = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,46),Message.ERROR,"proc.below.min");
    public static final MessageDefinition MSGDEF_PROC_ABOVE_MAX = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,47),Message.ERROR,"proc.above.max");
    public static final MessageDefinition MSGDEF_PROC_VALIDATION_PROBLEMS = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,48),Message.WARNING,"proc.validation.not.possible");
    
    public static final MessageDefinition MSGDEF_NO_LONG = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,49),Message.ERROR,"no.long");

    public static final MessageDefinition MSGDEF_ADD_RES_NOT_POSSIBLE_CAPABILITIES = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,50),Message.WARNING,"add.resource.not.possible.capabilities");
    public static final MessageDefinition MSGDEF_MOD_RES_NOT_POSSIBLE_CAPABILITIES = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,51),Message.WARNING,"modify.resource.not.possible.capabilities");
    public static final MessageDefinition MSGDEF_REM_RES_NOT_POSSIBLE_CAPABILITIES = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,52),Message.WARNING,"remove.resource.not.possible.capabilities");
    public static final MessageDefinition MSGDEF_MOD_SET_NOT_POSSIBLE_CAPABILITIES = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,53),Message.WARNING,"modify.settings.not.possible.capabilities");

    public static final MessageDefinition MSGDEF_CHANGE_RES_NOT_POSSIBLE_CAPABILITIES = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,54),Message.ERROR,"changing.resource.not.possible.capabilities");

    public static final MessageDefinition MSGDEF_ADD_RES_FAILED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,55),Message.ERROR,"add.resource.failed");
    public static final MessageDefinition MSGDEF_MOD_RES_FAILED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,56),Message.ERROR,"modify.resource.failed");
    public static final MessageDefinition MSGDEF_REM_RES_FAILED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,57),Message.ERROR,"remove.resource.failed");
    public static final MessageDefinition MSGDEF_MOD_SET_FAILED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VMA,58),Message.ERROR,"modify.config.failed");
}
