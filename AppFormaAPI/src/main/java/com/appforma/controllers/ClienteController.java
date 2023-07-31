package com.appforma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appforma.DTOs.Cliente.ClienteRequestDTO;
import com.appforma.DTOs.Cliente.ClienteResponseDTO;
import com.appforma.entities.Cliente;
import com.appforma.repositories.ClienteRepository;

@RestController
//se possivel fazer essa classe extender um GenericController
public class ClienteController {

    /* @Autowired
    private ClienteService clienteService; */

    @Autowired 
    private ClienteRepository repository;

    @GetMapping("/cliente")   
      public List<ClienteResponseDTO> getCliente() {
        List<ClienteResponseDTO> listaClientes = repository.findAll() //Armazena lista de todos os objetos na variavel listaClientes
        .stream() //Não entendi direito oq faz mas funciona
        .map(ClienteResponseDTO::new) //Mapeia cada objeto cliente para um ClienteResponseDTO 
        .toList(); //Coleta os resultados e armazena em uma lista
        return listaClientes;
    }

    @PostMapping("/cliente")
    public void salvarCliente(@RequestBody ClienteRequestDTO data){
        Cliente clienteData = new Cliente(data);
        repository.save(clienteData);
    }
    
}
