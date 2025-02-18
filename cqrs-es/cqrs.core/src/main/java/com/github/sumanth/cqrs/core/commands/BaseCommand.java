package com.github.sumanth.cqrs.core.commands;

import com.github.sumanth.cqrs.core.messages.Message;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public abstract class BaseCommand extends Message {
    protected BaseCommand(String id){
        super(id);
    }
}
