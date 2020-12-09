package com.michelin.transfo_port_adapter.domain.event;

import com.michelin.transfo_port_adapter.domain.transformation.TransformationResult;

import java.util.Date;

public class TransformationCreated implements Event {

    private String eventId;
    private Date issuedAt;
    private String username;
    private String sourceCommandId;
    private TransformationResult result;

    public TransformationCreated(String eventId, Date issuedAt, String username, String sourceCommandId, TransformationResult result) {
        this.eventId = eventId;
        this.issuedAt = issuedAt;
        this.username = username;
        this.sourceCommandId = sourceCommandId;
        this.result = result;
    }

    @Override
    public String getEventId() {
        return eventId;
    }

    @Override
    public Date getIssuedAt() {
        return issuedAt;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String sourceCommandId() {
        return sourceCommandId;
    }

    public TransformationResult getResult() {
        return result;
    }


    @Override
    public String toString() {
        return "TransformationCreated{" +
                "eventId='" + eventId + '\'' +
                ", issuedAt=" + issuedAt +
                ", username='" + username + '\'' +
                ", sourceCommandId='" + sourceCommandId + '\'' +
                ", result=" + result +
                '}';
    }
}
