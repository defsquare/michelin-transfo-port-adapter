package com.michelin.transfo_port_adapter.domain.port;

public class ClientFournisseur {
    private String clientId;
    private String clientName;
    private String FournisseurId;
    private String FournisseurName;

    public ClientFournisseur(String clientId, String clientName, String fournisseurId, String fournisseurName) {
        this.clientId = clientId;
        this.clientName = clientName;
        FournisseurId = fournisseurId;
        FournisseurName = fournisseurName;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public String getFournisseurId() {
        return FournisseurId;
    }

    public String getFournisseurName() {
        return FournisseurName;
    }
}
