package com.appforma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appforma.DTOs.Cliente.ClienteRequestDTO;
import com.appforma.entities.Cliente;
import com.appforma.repositories.ClienteRepository;
import com.appforma.services.ClienteService;

@RestController
//se possivel fazer essa classe extender um GenericController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired 
    private ClienteRepository repository;

    @GetMapping("/cliente")
    public String getHello(){
        return clienteService.getHello(); // Precisa configurar o get pra trazer os dados salvos
    }

    @PostMapping("/cliente")
    public void salvarCliente(@RequestBody ClienteRequestDTO data){
        Cliente clienteData = new Cliente(data);
        repository.save(clienteData);
    }
    
}
