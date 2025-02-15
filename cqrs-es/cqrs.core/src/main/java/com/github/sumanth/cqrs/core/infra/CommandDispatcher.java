package com.github.sumanth.cqrs.core.infra;

import com.github.sumanth.cqrs.core.commands.BaseCommand;
import com.github.sumanth.cqrs.core.commands.CommandHandlerMethod;

public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);

    void send(BaseCommand command);
}
