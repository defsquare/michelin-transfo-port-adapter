package com.michelin.transfo_port_adapter.domain;

import com.michelin.transfo_port_adapter.domain.event.TransformationCreated;
import com.michelin.transfo_port_adapter.domain.port.EventBus;
import com.michelin.transfo_port_adapter.domain.command.CreateTransformation;
import com.michelin.transfo_port_adapter.domain.port.ComplementRepository;
import com.michelin.transfo_port_adapter.domain.port.PMURepository;
import com.michelin.transfo_port_adapter.domain.transformation.TransformationResult;

import java.util.Date;

public class Transformation {

    private ComplementRepository complementRepository;
    private PMURepository pmuRepository;
    private EventBus eventBus;

    public Transformation(ComplementRepository complementRepository, PMURepository pmuRepository, EventBus eventBus) {
        this.complementRepository = complementRepository;
        this.pmuRepository = pmuRepository;
        this.eventBus = eventBus;
    }

    public TransformationCreated handle(CreateTransformation command) {
        CBL cbl = command.getCbl();

        complementRepository.getById("1");
        pmuRepository.getByClientId("1");

        if (cbl.isGI()) {
            // DO STUFF
        }
        TransformationResult result = new TransformationResult();

        TransformationCreated event = new TransformationCreated("1", new Date(), "moi", command.getCommandId(), result);
        eventBus.publish(event);

        return event;
    }
}
