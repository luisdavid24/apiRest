package com.api.rest.model.service;

import com.api.rest.model.entity.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> listAlll();

    Cliente findById(Integer id);

    void delete(Cliente cliente);

    boolean existsById(Integer id);

}
