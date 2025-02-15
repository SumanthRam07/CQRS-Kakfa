package com.github.sumanth.cqrs.core.producers;

import com.github.sumanth.cqrs.core.events.BaseEvent;

public interface EventProducer {
    void produce(String topic, BaseEvent event);
}
