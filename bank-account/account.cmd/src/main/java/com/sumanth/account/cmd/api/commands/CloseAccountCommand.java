package com.sumanth.account.cmd.api.commands;

import com.github.sumanth.cqrs.core.commands.BaseCommand;

public class CloseAccountCommand extends BaseCommand {
    public CloseAccountCommand(String id) {
        super(id);
    }
}
