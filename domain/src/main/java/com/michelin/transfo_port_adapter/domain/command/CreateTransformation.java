package com.michelin.transfo_port_adapter.domain.command;

import com.michelin.transfo_port_adapter.domain.CBL;

import java.util.Date;

public class CreateTransformation implements Command{

    private String commandId;
    private Date issuedAt;
    private String username;
    private CBL cbl;


    public CreateTransformation(String commandId, Date issuedAt, String username, CBL cbl) {
        this.commandId = commandId;
        this.issuedAt = issuedAt;
        this.username = username;
        this.cbl = cbl;
    }

    public String getCommandId() {
        return commandId;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public String getUsername() {
        return username;
    }

    public CBL getCbl() {
        return cbl;
    }
}
