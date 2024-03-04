package com.api.rest.model.service.impl;

import com.api.rest.model.dao.ClienteDao;
import com.api.rest.model.entity.Cliente;
import com.api.rest.model.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteImpl implements IClienteService {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }
}
