package com.api.rest.model.service;

import com.api.rest.model.dto.ClienteDto;
import com.api.rest.model.entity.Cliente;

import java.util.List;

public interface IClienteService {

    Cliente save(ClienteDto cliente);

    Cliente findById(Integer id);

    void delete(ClienteDto cliente);


}
