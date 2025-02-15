package com.github.sumanth.cqrs.core.handlers;

import com.github.sumanth.cqrs.core.domain.AggregateRoot;

public interface EventSourcingHandler<T> {

    void save(AggregateRoot aggregate);

    T getById(String id);

    void republishEvents();

}
