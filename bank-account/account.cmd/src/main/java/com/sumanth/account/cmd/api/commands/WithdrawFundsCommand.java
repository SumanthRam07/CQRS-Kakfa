package com.sumanth.account.cmd.api.commands;

import com.github.sumanth.cqrs.core.commands.BaseCommand;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class WithdrawFundsCommand extends BaseCommand {
    private double amount;
}