package com.michelin.transfo_port_adapter.domain.port;

import java.util.List;

public interface ComplementRepository {

    List<Complement> getById(String id);

}
