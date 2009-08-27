/**
 * CreateVM.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF THE
 * ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/createCommand.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Class for creating objects generated Class
 */

package org.sblim.wbemsmt.vm.listener.cli;

import org.apache.commons.cli.*;
import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.bl.messages.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.cli.*;
import org.sblim.wbemsmt.tools.wizard.cli.*;

public class CreateVM extends CimCommand implements ContainerUpdater {

    //All Options that are local and defined for this command
    /**
     *  --referencedSystem
     */
    public static final OptionDefinition KEY_referencedSystem = new OptionDefinition(null,
            "referencedSystem", null, "DefineSystemCLIDataContainer.referencedSystem.argValue",
            false, false, "DefineSystemCLIDataContainer.referencedSystem.argDescription");
    /**
     *  --memory
     */
    public static final OptionDefinition KEY_memory = new OptionDefinition(null, "memory", null,
            "DefineSystemCLIDataContainer.memory.argValue", false, false,
            "DefineSystemCLIDataContainer.memory.argDescription");
    /**
     *  --processor
     */
    public static final OptionDefinition KEY_processor = new OptionDefinition(null, "processor",
            null, "DefineSystemCLIDataContainer.processor.argValue", false, false,
            "DefineSystemCLIDataContainer.processor.argDescription");
    /**
     *  --networks
     */
    public static final OptionDefinition KEY_networks = new OptionDefinition(null, "networks",
            null, "DefineSystemCLIDataContainer.networks.argValue", false, false,
            "DefineSystemCLIDataContainer.networks.argDescription");
    /**
     *  --disks
     */
    public static final OptionDefinition KEY_disks = new OptionDefinition(null, "disks", null,
            "DefineSystemCLIDataContainer.disks.argValue", false, false,
            "DefineSystemCLIDataContainer.disks.argDescription");
    /**
     *  --addDisk
     */
    public static final OptionDefinition KEY_addDisk = new OptionDefinition(null, "addDisk", null,
            null, false, false, "DefineSystemCLIDataContainer.addDisk.argDescription");
    /**
     *  --removeDisk
     */
    public static final OptionDefinition KEY_removeDisk = new OptionDefinition(null, "removeDisk",
            null, null, false, false, "DefineSystemCLIDataContainer.removeDisk.argDescription");
    /**
     *  --diskConfigKey
     */
    public static final OptionDefinition KEY_diskConfigKey = new OptionDefinition(null,
            "diskConfigKey", null, "DefineSystemCLIDataContainer.diskConfigKey.argValue", false,
            false, "DefineSystemCLIDataContainer.diskConfigKey.argDescription");
    /**
     *  --diskConfigValue
     */
    public static final OptionDefinition KEY_diskConfigValue = new OptionDefinition(null,
            "diskConfigValue", null, "DefineSystemCLIDataContainer.diskConfigValue.argValue",
            false, false, "DefineSystemCLIDataContainer.diskConfigValue.argDescription");
    /**
     *  --diskSelector
     */
    public static final OptionDefinition KEY_diskSelector = new OptionDefinition(null,
            "diskSelector", null, "DefineSystemCLIDataContainer.diskSelector.argValue", false,
            false, "DefineSystemCLIDataContainer.diskSelector.argDescription");
    /**
     *  --addNetwork
     */
    public static final OptionDefinition KEY_addNetwork = new OptionDefinition(null, "addNetwork",
            null, null, false, false, "DefineSystemCLIDataContainer.addNetwork.argDescription");
    /**
     *  --removeNetwork
     */
    public static final OptionDefinition KEY_removeNetwork = new OptionDefinition(null,
            "removeNetwork", null, null, false, false,
            "DefineSystemCLIDataContainer.removeNetwork.argDescription");
    /**
     *  --networkConfigKey
     */
    public static final OptionDefinition KEY_networkConfigKey = new OptionDefinition(null,
            "networkConfigKey", null, "DefineSystemCLIDataContainer.networkConfigKey.argValue",
            false, false, "DefineSystemCLIDataContainer.networkConfigKey.argDescription");
    /**
     *  --networkConfigValue
     */
    public static final OptionDefinition KEY_networkConfigValue = new OptionDefinition(null,
            "networkConfigValue", null, "DefineSystemCLIDataContainer.networkConfigValue.argValue",
            false, false, "DefineSystemCLIDataContainer.networkConfigValue.argDescription");
    /**
     *  --networkSelector
     */
    public static final OptionDefinition KEY_networkSelector = new OptionDefinition(null,
            "networkSelector", null, "DefineSystemCLIDataContainer.networkSelector.argValue",
            false, false, "DefineSystemCLIDataContainer.networkSelector.argDescription");
    /**
     *  --configValue
     */
    public static final OptionDefinition KEY_configValue = new OptionDefinition(null,
            "configValue", null, "DefineSystemCLIDataContainer.configValue.argValue", false, false,
            "DefineSystemCLIDataContainer.configValue.argDescription");
    /**
     *  --configKey
     */
    public static final OptionDefinition KEY_configKey = new OptionDefinition(null, "configKey",
            null, "DefineSystemCLIDataContainer.configKey.argValue", false, false,
            "DefineSystemCLIDataContainer.configKey.argDescription");
    /**
     *  --execute
     */
    public static final OptionDefinition KEY_execute = new OptionDefinition(null, "execute", null,
            null, false, false, "DefineSystemCLIDataContainer.execute.argDescription");
    /**
     *  --startAfterCreation
     */
    public static final OptionDefinition KEY_startAfterCreation = new OptionDefinition(null,
            "startAfterCreation", null, "DefineSystemCLIDataContainer.startAfterCreation.argValue",
            false, false, "DefineSystemCLIDataContainer.startAfterCreation.argDescription");
    /**
     *  --listOnly
     */
    public static final OptionDefinition KEY_listOnly = new OptionDefinition(null, "listOnly",
            null, null, false, false, "DefineSystemCLIDataContainer.listOnly.argDescription");
    /**
     * required,  --sessionkey
     */
    public static final OptionDefinition KEY_sessionkey = new OptionDefinition(null, "sessionkey",
            null, "DefineSystemCLIDataContainer.sessionkey.argValue", true, false,
            "DefineSystemCLIDataContainer.sessionkey.argDescription");
    /**
     *  --virtualSystemType
     */
    public static final OptionDefinition KEY_virtualSystemType = new OptionDefinition(null,
            "virtualSystemType", null, "DefineSystemCLIDataContainer.virtualSystemType.argValue",
            false, false, "DefineSystemCLIDataContainer.virtualSystemType.argDescription");
    /**
     *  --deleteSession
     */
    public static final OptionDefinition KEY_deleteSession = new OptionDefinition(null,
            "deleteSession", null, "DefineSystemCLIDataContainer.deleteSession.argValue", false,
            false, "DefineSystemCLIDataContainer.deleteSession.argDescription");
    /**
     *  --cleanupSession
     */
    public static final OptionDefinition KEY_cleanupSession = new OptionDefinition(null,
            "cleanupSession", null, "DefineSystemCLIDataContainer.cleanupSession.argValue", false,
            false, "DefineSystemCLIDataContainer.cleanupSession.argDescription");

    //All Options that are global and task-related

    // Global Communication Options
    /**
     *  --hostname
     */
    public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition(null,
            "hostname", null, "hostname.argValue", false, false, "hostname.argDescription");
    /**
     *  --port, default: 5988
     */
    public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition(null, "port",
            "5988", "port.argValue", false, false, "port.argDescription");
    /**
     *  --namespace, default: /root/PG_InterOp
     */
    public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition(null,
            "namespace", "/root/PG_InterOp", "namespace.argValue", false, false,
            "namespace.argDescription");
    /**
     *  --user
     */
    public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition(null, "user", null,
            "user.argValue", false, false, "user.argDescription");
    /**
     *  --password
     */
    public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition(null,
            "password", null, "password.argValue", false, false, "password.argDescription");
    /**
     *  --publickeyfile
     */
    public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition(null,
            "publickeyfile", null, "publickeyfile.argValue", false, false,
            "publickeyfile.argDescription");
    /**
     *  --privatekeyfile
     */
    public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition(null,
            "privatekeyfile", null, "privatekeyfile.argValue", false, false,
            "privatekeyfile.argDescription");
    /**
     * used for selection:  --httpProtocolType, default: http
     */
    public static final OptionDefinition KEY_GLOBAL_httpProtocolType = new OptionDefinition(null,
            "httpProtocolType", "http", "httpProtocolType.argValue", false, false,
            "httpProtocolType.argDescription");

    // Global Common Options
    /**
     *  -L --locale, default: en
     */
    public static final OptionDefinition KEY_GLOBAL_locale = new OptionDefinition("L", "locale",
            "en", "locale.argValue", false, false, "locale.argDescription");
    /**
     *  -?
     */
    public static final OptionDefinition KEY_GLOBAL_QUESTION_MARK_ = new OptionDefinition("?",
            null, null, null, false, false, "?.argDescription");
    /**
     *  -h --help
     */
    public static final OptionDefinition KEY_GLOBAL_help = new OptionDefinition("h", "help", null,
            null, false, false, "help.argDescription");

    private static final OptionDefinition[] LOCAL_OPTIONS = new OptionDefinition[] {
            KEY_referencedSystem, KEY_memory, KEY_processor, KEY_networks, KEY_disks, KEY_addDisk,
            KEY_removeDisk, KEY_diskConfigKey, KEY_diskConfigValue, KEY_diskSelector,
            KEY_addNetwork, KEY_removeNetwork, KEY_networkConfigKey, KEY_networkConfigValue,
            KEY_networkSelector, KEY_configValue, KEY_configKey, KEY_execute,
            KEY_startAfterCreation, KEY_listOnly, KEY_sessionkey, KEY_virtualSystemType,
            KEY_deleteSession, KEY_cleanupSession, };

    private static final OptionDefinition[] GLOBAL_TASK_OPTIONS = new OptionDefinition[] {};

    private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS = new OptionDefinition[] {
            KEY_GLOBAL_hostname, KEY_GLOBAL_port, KEY_GLOBAL_namespace, KEY_GLOBAL_user,
            KEY_GLOBAL_password, KEY_GLOBAL_publickeyfile, KEY_GLOBAL_privatekeyfile,
            KEY_GLOBAL_httpProtocolType, };

    private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMON_OPTIONS = new OptionDefinition[] {
            KEY_GLOBAL_locale, KEY_GLOBAL_QUESTION_MARK_, KEY_GLOBAL_help, };

    CommandLine cmd = null;
    AbstractBaseCimAdapter adapter = null;

    public CreateVM(java.util.Locale locale) {
        super("CreateVM", new String[] { "messages", "messagesVm" }, locale);
    }

    public void execute(CimCommandValues values) throws WbemsmtException {

        //do the real processing
        try {

            commandValues = values;
            cmd = values.getCommandLine();

            Options options = values.getOptions();

            //first handle the help options and then the parseException
            //if the user wants help parsing the args will fail (due to missing required args)
            //and so the helpOptions should be handled first

            if (hasOption(values.getArgs(), "-" + KEY_GLOBAL_QUESTION_MARK_.getShortKey())
                    || hasOption(values.getArgs(), "-" + KEY_GLOBAL_help.getShortKey())) {
                showUsage(values.getOut(), options);
                return;
            }
            else if (hasOption(values.getArgs(), "--" + KEY_GLOBAL_help.getLongKey())) {
                //TODO add extendedHelp by loading a manpage or sth else
                showUsage(values.getOut(), options);
                return;
            }

            else if (values.getParseException() != null) {
                handleParseException(values, KEY_GLOBAL_password);
                return;
            }
            adapter = (org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter) CimAdapterFactory
                    .getInstance().getAdapter(org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter.class,
                            this);
            adapter.setBundle(bundle);
            adapter.setCimClient(values.getCimClient());

            adapter.loadInitial(adapter.getCimClient());

            values.getOut().println("\n" + bundle.getString("DefineSystemCLIWizard.create.start"));

            CliDataLoader loader = new CreateVMLoader();
            loader.load(bundle, adapter, commandValues);

            org.sblim.wbemsmt.vm.wizard.cli.DefineSystemCLIWizard wizard = new org.sblim.wbemsmt.vm.wizard.cli.DefineSystemCLIWizard(
                    (org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter) adapter);
            if (!wizard.canBeExecuted()) {
                traceErrors("error.while.execution", wizard.getMessageList());
                return;
            }
            wizard.startWizard();

            while (!wizard.getContainer().isLast(wizard.getContainer().getCurrentPageName())) {
                BaseDataContainer dataContainer = wizard.getCurrentPanel();
                if (true == false)
                    ;
                else if (dataContainer instanceof org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer)
                    setCommandLineValues(
                            cmd,
                            adapter,
                            (org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer) dataContainer);
                else if (dataContainer instanceof org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer)
                    setCommandLineValues(
                            cmd,
                            adapter,
                            (org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer) dataContainer);
                else {
                    logger.severe(dataContainer.getClass().getName()
                            + " cannot be handled from command class " + this.getClass().getName());
                    throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, bundle
                            .getString("internal.error"));
                }

                MessageList result = MessageList.init(dataContainer);
                if (result.hasErrors()) {
                    traceErrors(result);
                    return;
                }
                else {
                    Message caption = Message.create(ErrCodes.MSG_ADDITIONAL_MESSAGES,
                            Message.ERROR, bundle, "additional.messages");
                    traceMessages(caption, result);
                    result.clear();
                }

                wizard.next(this);
                result = wizard.getCurrentPanel().getMessagesList();

                if (result != null) {
                    if (result.hasErrors()) {
                        Message caption = Message.create(ErrCodes.MSG_VALIDATION_ERROR,
                                Message.ERROR, bundle, "validation.error");
                        traceMessages(caption, result);
                        return;
                    }
                    else {
                        Message caption = Message.create(ErrCodes.MSG_ADDITIONAL_MESSAGES,
                                Message.ERROR, bundle, "additional.messages");
                        traceMessages(caption, result);
                        dataContainer.getMessagesList().clear();
                    }
                }
            }

            BaseDataContainer lastPanel = wizard.getCurrentPanel();

            MessageList result = wizard.finish();
            String wizardName = ClassUtils.getShortClassName(wizard.getClass());
            if (result != null && result.hasErrors()) {
                result.addMessage(new Message(ErrCodes.MSG_CREATE_FAILED, Message.ERROR, bundle
                        .getString(wizardName + ".create.failed")));
            }
            else {
                result.addMessage(new Message(ErrCodes.MSG_CREATE_SUCCESS, Message.SUCCESS, bundle
                        .getString(wizardName + ".create.success")));
            }
            traceErrors(result);

            if (true == false)
                ;
            else if (lastPanel instanceof org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer)
                ((CreateVMLoader) loader)
                        .loadTracingObject(
                                bundle,
                                adapter,
                                (org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer) lastPanel);
            else {
                logger.severe("Cannot loadTracingObject for " + lastPanel.getClass().getName());
                throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, bundle
                        .getString("internal.error"));
            }

            org.sblim.wbemsmt.vm.container.wizard.cli.DefineSystemCLISummaryDataContainerImpl dc = new org.sblim.wbemsmt.vm.container.wizard.cli.DefineSystemCLISummaryDataContainerImpl(
                    adapter);

            int count = 0;

            count = adapter
                    .count(
                            "configValues",
                            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryConfigItemDataContainer.class,
                            dc);
            dc.getConfigValues().clear();
            for (int i = 0; i < count; i++) {
                org.sblim.wbemsmt.vm.container.wizard.cli.DefineSystemCLISummaryConfigItemDataContainerImpl child = new org.sblim.wbemsmt.vm.container.wizard.cli.DefineSystemCLISummaryConfigItemDataContainerImpl(
                        adapter);
                dc.getConfigValues().add(child);
            }

            adapter.updateControls(dc);
            values.getOut().println("\n" + bundle.getString("createdObject") + ":\n");
            dc.trace(values.getOut());

            //values.getOut().println("\n" + bundle.getString("DefineSystemCLIWizard.create.success"));

        }
        catch (Exception e) {
            super.handleException(e, values.getArgs(), values.getOptions(), KEY_GLOBAL_password);
        }
        finally {
            if (adapter != null)
                adapter.cleanup();
        }
    }

    public void prepareForUpdateControls(DataContainer dataContainer) throws WbemsmtException {
        if (true == false)
            ;
        else if (dataContainer instanceof org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer)
            updateContainerChilds(
                    cmd,
                    adapter,
                    (org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer) dataContainer);
        else if (dataContainer instanceof org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer)
            updateContainerChilds(
                    cmd,
                    adapter,
                    (org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer) dataContainer);
        else {

            logger.severe("Cannot setValues for Container " + dataContainer.getClass().getName());
            throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,
                    "Cannot setValues for Container " + dataContainer.getClass().getName());
        }
    }

    private void updateContainerChilds(CommandLine cmd, AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer dc)
            throws WbemsmtException {

        try {
            //update the child-containers

        }
        catch (Exception e) {
            throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS, bundle
                    .getString("internal.error"), e);
        }

    }

    private void setCommandLineValues(CommandLine cmd, AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLIDataContainer dc)
            throws WbemsmtException {
        //set the values
        setMultiValue(adapter.getBundle(), cmd, dc.get_usr_ReferencedSystem(), KEY_referencedSystem);
        setValue(cmd, dc.get_usr_Memory(), KEY_memory);
        setValue(cmd, dc.get_usr_Processor(), KEY_processor);
        setMultiValue(adapter.getBundle(), cmd, dc.get_usr_Networks(), KEY_networks);
        setMultiValue(adapter.getBundle(), cmd, dc.get_usr_Disks(), KEY_disks);
        setValue(cmd, dc.get_usr_DiskConfigKey(), KEY_diskConfigKey);
        setValue(cmd, dc.get_usr_DiskConfigValue(), KEY_diskConfigValue);
        setMultiValue(adapter.getBundle(), cmd, dc.get_usr_DiskSelector(), KEY_diskSelector);
        setValue(cmd, dc.get_usr_NetworkConfigKey(), KEY_networkConfigKey);
        setValue(cmd, dc.get_usr_NetworkConfigValue(), KEY_networkConfigValue);
        setMultiValue(adapter.getBundle(), cmd, dc.get_usr_NetworkSelector(), KEY_networkSelector);
        setValue(cmd, dc.get_usr_ConfigValue(), KEY_configValue);
        setValue(cmd, dc.get_usr_ConfigKey(), KEY_configKey);
        setCheckboxValue(cmd, dc.get_usr_StartAfterCreation(), KEY_startAfterCreation);
        setValue(cmd, dc.get_usr_Sessionkey(), KEY_sessionkey);
        setMultiValue(adapter.getBundle(), cmd, dc.get_usr_VirtualSystemType(),
                KEY_virtualSystemType);
        setCheckboxValue(cmd, dc.get_usr_DeleteSession(), KEY_deleteSession);
        setCheckboxValue(cmd, dc.get_usr_CleanupSession(), KEY_cleanupSession);

        //The Buttons
        if (!pressButton(cmd, adapter, dc, dc.get_usr_AddDisk(), KEY_addDisk))
            return;
        if (!pressButton(cmd, adapter, dc, dc.get_usr_RemoveDisk(), KEY_removeDisk))
            return;
        if (!pressButton(cmd, adapter, dc, dc.get_usr_AddNetwork(), KEY_addNetwork))
            return;
        if (!pressButton(cmd, adapter, dc, dc.get_usr_RemoveNetwork(), KEY_removeNetwork))
            return;
        if (!pressButton(cmd, adapter, dc, dc.get_usr_Execute(), KEY_execute))
            return;
        if (!pressButton(cmd, adapter, dc, dc.get_usr_ListOnly(), KEY_listOnly))
            return;

    }

    private void updateContainerChilds(CommandLine cmd, AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer dc)
            throws WbemsmtException {

        try {
            //update the child-containers

            int count = 0;

            count = adapter
                    .count(
                            "configValues",
                            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryConfigItemDataContainer.class,
                            dc);
            dc.getConfigValues().clear();
            for (int i = 0; i < count; i++) {
                org.sblim.wbemsmt.vm.container.wizard.cli.DefineSystemCLISummaryConfigItemDataContainerImpl child = new org.sblim.wbemsmt.vm.container.wizard.cli.DefineSystemCLISummaryConfigItemDataContainerImpl(
                        adapter);
                dc.getConfigValues().add(child);
            }
        }
        catch (Exception e) {
            throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS, bundle
                    .getString("internal.error"), e);
        }

    }

    private void setCommandLineValues(CommandLine cmd, AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.vm.container.wizard.DefineSystemCLISummaryDataContainer dc)
            throws WbemsmtException {
        //set the values

        //The Buttons

    }

    protected LoginOptionValues getLoginOptions() {
        return new LoginOptionValues(KEY_GLOBAL_hostname, KEY_GLOBAL_user, KEY_GLOBAL_password);
    }

    protected CimClientOptionValues getCimClientOptions() {

        return new CimClientOptionValues(KEY_GLOBAL_httpProtocolType, KEY_GLOBAL_hostname,
                KEY_GLOBAL_port, KEY_GLOBAL_namespace, KEY_GLOBAL_user, KEY_GLOBAL_password,
                KEY_GLOBAL_publickeyfile, KEY_GLOBAL_privatekeyfile);
    }

    public Options getOptions() throws WbemsmtException {
        Options options = super.createOptions(LOCAL_OPTIONS, bundle);
        super.createOptions(options, GLOBAL_TASK_OPTIONS, bundle);
        super.createOptions(options, GLOBAL_WBEMSMT_COMMON_OPTIONS, bundle);
        super.createOptions(options, GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS, bundle);
        return options;
    }

    public Options getLocalOptions() throws WbemsmtException {
        Options options = super.createOptions(LOCAL_OPTIONS, bundle);
        return options;
    }

    public Options getGlobalWbemsmtCommonOptions() throws WbemsmtException {
        Options options = super.createOptions(GLOBAL_WBEMSMT_COMMON_OPTIONS, bundle);
        return options;
    }

    public Options getGlobalWbemsmtCommunicationOptions() throws WbemsmtException {
        Options options = super.createOptions(GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS, bundle);
        return options;
    }

    public Options getGlobalTaskOptions() throws WbemsmtException {
        Options options = super.createOptions(GLOBAL_TASK_OPTIONS, bundle);
        return options;
    }

}