package com.michelin.transfo_port_adapter.backend.adapter;

import com.michelin.transfo_port_adapter.domain.port.ClientFournisseur;
import com.michelin.transfo_port_adapter.domain.port.PMURepository;

import java.util.List;
import java.util.Map;

public class InMemoryPMURepository implements PMURepository {

    private Map<String, List<ClientFournisseur>> fournissuerById;

    public InMemoryPMURepository(Map<String, List<ClientFournisseur>> fournissuerById) {
        this.fournissuerById = fournissuerById;
    }

    @Override
    public List<ClientFournisseur> getByClientId(String clientId) {
        return null;
    }

    @Override
    public List<ClientFournisseur> getByFournisseurId(String fournisseurId) {
        return null;
    }
}
