package com.michelin.transfo_port_adapter.domain.event;

import java.util.Date;

public interface Event {

    String getEventId();

    Date getIssuedAt();

    String getUsername();

    String sourceCommandId();

}
