package com.appforma.DTOs.Cliente;

import java.math.BigDecimal;
import java.sql.Date;

public record ClienteRequestDTO(String cpf, String nome, String end_residencial, 
String end_obra, String cidade, String telefone, Date data_nascimento, String tipo_projeto, BigDecimal valor_projeto){    
}