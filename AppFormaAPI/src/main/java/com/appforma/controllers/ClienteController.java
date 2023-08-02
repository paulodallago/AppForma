package com.appforma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appforma.DTOs.Cliente.ClienteRequestDTO;
import com.appforma.DTOs.Cliente.ClienteResponseDTO;
import com.appforma.entities.Cliente;
import com.appforma.repositories.ClienteRepository;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

    /* @Autowired
    private ClienteService clienteService; */

    @Autowired 
    private ClienteRepository repository;

    @GetMapping  
      public List<ClienteResponseDTO> getCliente() {
        List<ClienteResponseDTO> listaClientes = repository.findAll() //Armazena lista de todos os objetos na variavel listaClientes
        .stream() //Não entendi direito oq faz mas funciona
        .map(ClienteResponseDTO::new) //Mapeia cada objeto cliente para um ClienteResponseDTO 
        .toList(); //Coleta os resultados e armazena em uma lista
        return listaClientes;
    }

    @PostMapping
    public ResponseEntity<Object> salvarCliente(@RequestBody ClienteRequestDTO data){
        try{
            Cliente clienteData = new Cliente(data);
            repository.save(clienteData);
            return ResponseEntity.status(HttpStatus.OK).body(clienteData);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
	public ResponseEntity<Object> updateCliente(@PathVariable Integer id, @RequestBody ClienteRequestDTO data) {
		try {
            Cliente clienteData = new Cliente(data); //Instancia uma classe Cliente passando os parâmetros do corpo da requisicao JSON
			clienteData.setId(id); //Define o ID passado na URL como identificador unico do objeto que foi alterado
			repository.save(clienteData); //Salva no banco de dados
			return ResponseEntity.status(HttpStatus.OK).body(data);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCliente(@PathVariable Integer id){
        try{
            repository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("ID "+id+" deletado");
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }        
    }

}