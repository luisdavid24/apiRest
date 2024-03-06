package com.api.rest.controller;


import com.api.rest.model.entity.Cliente;
import com.api.rest.model.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ClienteController  {

    @Autowired
    private IClienteService iClienteService;

    @PostMapping("cliente")
    public Cliente create(@RequestBody Cliente cliente){
        return iClienteService.save(cliente);
    }


    public Cliente update(Cliente cliente){
        return iClienteService.save(cliente);
    }

    public void  delete(Integer id){
         Cliente clienteDelete= iClienteService.findById(id);
         iClienteService.save(clienteDelete);
    }

    public Cliente showById(Integer id){
        return iClienteService.findById(id);
    }


}
