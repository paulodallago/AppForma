package com.appforma.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente extends GenericEntity{
    
    @Column(nullable = false, length = 11)
    private Integer cpf_cliente;
    
    @Column(nullable = true, length = 20)
    private String cidade;
}
