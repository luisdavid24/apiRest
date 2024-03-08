package com.api.rest.controller;


import com.api.rest.model.entity.Cliente;
import com.api.rest.model.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

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
    public ResponseEntity<?> delete(@PathVariable  Integer id){
        Map<String,Object> reponse= new HashMap<>();
        try{
             Cliente clienteDelete= iClienteService.findById(id);
             iClienteService.save(clienteDelete);

             return new ResponseEntity<>(clienteDelete,HttpStatus.NO_CONTENT);
        }catch (DataAccessException exDT){
            reponse.put("Mensaje",exDT.getMessage());
            reponse.put("CLiente",null);

            return new ResponseEntity<>(reponse,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("cliente/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente showById(@PathVariable Integer id){
        return iClienteService.findById(id);
    }


}
