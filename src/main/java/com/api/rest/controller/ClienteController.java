package com.api.rest.controller;


import com.api.rest.model.entity.Cliente;
import com.api.rest.model.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ClienteController  {

    @Autowired
    private IClienteService iClienteService;

    @PostMapping("cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente){
        return iClienteService.save(cliente);
    }

    @PutMapping("cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente update(@RequestBody  Cliente cliente){
        return iClienteService.save(cliente);
    }

    @DeleteMapping("cliente/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void  delete(@PathVariable  Integer id){
         Cliente clienteDelete= iClienteService.findById(id);
         iClienteService.save(clienteDelete);
    }

    @GetMapping("cliente/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente showById(@PathVariable Integer id){
        return iClienteService.findById(id);
    }


}
