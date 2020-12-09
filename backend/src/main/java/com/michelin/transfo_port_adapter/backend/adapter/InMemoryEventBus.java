package com.michelin.transfo_port_adapter.backend.adapter;

import com.michelin.transfo_port_adapter.domain.event.Event;
import com.michelin.transfo_port_adapter.domain.port.EventBus;

import java.util.ArrayList;
import java.util.List;

public class InMemoryEventBus implements EventBus {

    private List<Event> events = new ArrayList<>();

    @Override
    public void publish(Event event) {
        events.add(event);
    }

    public List<Event> getEvents() {
        return events;
    }
}
