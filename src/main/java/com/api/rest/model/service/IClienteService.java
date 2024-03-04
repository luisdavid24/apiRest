package com.api.rest.model.service;

import com.api.rest.model.entity.Cliente;

import java.util.List;

public interface IClienteService {

    Cliente  save(Cliente cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);


}
