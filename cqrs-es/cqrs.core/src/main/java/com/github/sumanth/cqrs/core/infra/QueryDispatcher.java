package com.github.sumanth.cqrs.core.infra;

import com.github.sumanth.cqrs.core.domain.BaseEntity;
import com.github.sumanth.cqrs.core.queries.BaseQuery;
import com.github.sumanth.cqrs.core.queries.QueryHandlerMethod;

import java.util.List;

public interface QueryDispatcher {
    <T extends BaseQuery> void registerHandler(Class<T> type, QueryHandlerMethod<T> handler);

    <U extends BaseEntity> List<U> send(BaseQuery query);
}
