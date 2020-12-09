package com.michelin.transfo_port_adapter.domain.port;

import java.util.List;
import java.util.Optional;

public interface PMURepository {

    List<ClientFournisseur> getByClientId(String clientId);

    List<ClientFournisseur> getByFournisseurId(String fournisseurId);
}
