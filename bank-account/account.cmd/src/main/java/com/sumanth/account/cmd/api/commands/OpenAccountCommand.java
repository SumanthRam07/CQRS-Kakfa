package com.sumanth.account.cmd.api.commands;

import com.github.sumanth.account.common.dto.AccountType ;
import com.github.sumanth.cqrs.core.commands.BaseCommand;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;

}
