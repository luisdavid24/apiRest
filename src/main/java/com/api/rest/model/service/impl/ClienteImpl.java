package com.api.rest.model.service.impl;

import com.api.rest.model.dao.ClienteDao;
import com.api.rest.model.entity.Cliente;
import com.api.rest.model.service.IClienteService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteImpl implements IClienteService {

    @Autowired
    private ClienteDao clienteDao;

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }


    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }
}
