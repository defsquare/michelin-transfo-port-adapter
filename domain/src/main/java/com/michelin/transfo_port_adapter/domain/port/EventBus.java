package com.michelin.transfo_port_adapter.domain.port;

import com.michelin.transfo_port_adapter.domain.event.Event;

public interface EventBus {
    void publish(Event event);
}
