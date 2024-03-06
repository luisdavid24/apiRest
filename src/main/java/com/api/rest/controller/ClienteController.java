package com.api.rest.controller;


import com.api.rest.model.entity.Cliente;
import com.api.rest.model.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ClienteController  {

    @Autowired
    private IClienteService iClienteService;

    @PostMapping("cliente")
    public Cliente create(@RequestBody Cliente cliente){
        return iClienteService.save(cliente);
    }

    @PutMapping("cliente")
    public Cliente update(@RequestBody  Cliente cliente){
        return iClienteService.save(cliente);
    }

    @DeleteMapping("cliente/{id}")
    public void  delete(@PathVariable  Integer id){
         Cliente clienteDelete= iClienteService.findById(id);
         iClienteService.save(clienteDelete);
    }

    @GetMapping("cliente/{id}")
    public Cliente showById(@PathVariable Integer id){
        return iClienteService.findById(id);
    }


}
