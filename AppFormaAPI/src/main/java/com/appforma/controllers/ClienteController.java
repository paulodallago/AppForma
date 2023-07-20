package com.appforma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appforma.services.ClienteService;

@RestController
//se possivel fazer essa classe extender um GenericController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente")
    public String getHello(){
        return clienteService.getHello();
    }
    
}
