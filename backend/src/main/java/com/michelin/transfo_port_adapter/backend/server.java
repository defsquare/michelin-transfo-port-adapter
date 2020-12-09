package com.michelin.transfo_port_adapter.backend;

import com.michelin.transfo_port_adapter.backend.adapter.InMemoryComplementRepository;
import com.michelin.transfo_port_adapter.backend.adapter.InMemoryEventBus;
import com.michelin.transfo_port_adapter.backend.adapter.InMemoryPMURepository;
import com.michelin.transfo_port_adapter.domain.CBL;
import com.michelin.transfo_port_adapter.domain.Transformation;
import com.michelin.transfo_port_adapter.domain.command.CreateTransformation;
import com.michelin.transfo_port_adapter.domain.event.TransformationCreated;

import java.util.Date;
import java.util.Map;

public class server {

    public static void main(String[] args) {
        InMemoryComplementRepository inMemoryComplementRepository = new InMemoryComplementRepository(Map.of());
        InMemoryPMURepository inMemoryPMURepository = new InMemoryPMURepository(Map.of());
        InMemoryEventBus inMemoryEventBus = new InMemoryEventBus();

        Transformation transformation = new Transformation(inMemoryComplementRepository, inMemoryPMURepository, inMemoryEventBus);


        // By consuming message, HTTP call invocation or anything else when received a new CBL
        CreateTransformation command = new CreateTransformation("CMD-1", new Date(), "michelin", new CBL(null));
        TransformationCreated event = transformation.handle(command);
        System.out.println("The result ---->" + event);
    }
}
