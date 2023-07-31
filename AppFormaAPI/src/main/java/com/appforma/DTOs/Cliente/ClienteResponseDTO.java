package com.appforma.DTOs.Cliente;

import java.math.BigDecimal;
import java.sql.Date;

import com.appforma.entities.Cliente;

public record ClienteResponseDTO(String cpf, String nome, String end_residencial, 
String end_obra, String cidade, String telefone, Date data_nascimento, String tipo_projeto, BigDecimal valor_projeto){
    
    public ClienteResponseDTO(Cliente cliente){ //Constructor do DTO
        this(cliente.getCpf(), cliente.getNome(), cliente.getEndRes(), cliente.getEndObra(), 
        cliente.getCidade(), cliente.getTelefone(), cliente.getDataNasc(), cliente.getTipo(), cliente.getValor());
    }
}