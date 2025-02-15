package com.github.sumanth.cqrs.core.infra;

import com.github.sumanth.cqrs.core.events.BaseEvent;

import java.util.List;

public interface EventStore {

    void saveEvents(String aggregateId, Iterable<BaseEvent> events, int expectedVersion);

    List<BaseEvent> getEvents(String aggregateId);

    List<String> getAggregateIds();
}