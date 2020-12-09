package com.michelin.transfo_port_adapter.domain.command;

import java.util.Date;

public interface Command {

    String getCommandId();

    Date getIssuedAt();

    String getUsername() ;
}
