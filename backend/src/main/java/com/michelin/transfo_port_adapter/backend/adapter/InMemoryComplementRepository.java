package com.michelin.transfo_port_adapter.backend.adapter;

import com.michelin.transfo_port_adapter.domain.port.Complement;
import com.michelin.transfo_port_adapter.domain.port.ComplementRepository;

import java.util.List;
import java.util.Map;

public class InMemoryComplementRepository implements ComplementRepository {

    private Map<String, List<Complement>> complementListById;

    public InMemoryComplementRepository(Map<String, List<Complement>> complementListById) {
        this.complementListById = complementListById;
    }

    @Override
    public List<Complement> getById(String id) {
        return null;
    }
}
