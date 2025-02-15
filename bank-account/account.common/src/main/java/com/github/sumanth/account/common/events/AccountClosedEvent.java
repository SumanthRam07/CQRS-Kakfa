package com.github.sumanth.account.common.events;

import com.github.sumanth.cqrs.core.events.BaseEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AccountClosedEvent extends BaseEvent {
}
