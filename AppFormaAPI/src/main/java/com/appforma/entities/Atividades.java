package com.appforma.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_atividade")
public class Atividades extends GenericEntity {
    
    @ManyToOne
    @JoinColumn(name = "id_atv_cliente", referencedColumnName = "id")
    private Cliente atvCliente;

    @Column(nullable = false)
    private Date data_inicio;

    @Column(nullable = false)
    private Date data_final;

    @Column(length = 100)
    private String descricao_atv;

    @Column(nullable = false, length = 2)
    private String status_atv;

    //Getters e setters

    public Cliente getAtvCliente(){
        return atvCliente;
    }

    public void setAtvCliente(Cliente atvCliente){
        this.atvCliente = atvCliente;
    }

    public Date getDataInicio(){
        return data_inicio;
    }

    public void setDataInicio(Date data_inicio){
        this.data_inicio = data_inicio;
    }

    public Date getDataFinal(){
        return data_final;
    }

    public void setDataFinal(Date data_final){
        this.data_final = data_final;
    }
    
    public String getDescricaoAtv(){
        return descricao_atv;
    }

    public void setDescricaoAtv(String descricao_atv){
        this.descricao_atv = descricao_atv;
    }

    public String getStatusAtv(){
        return status_atv;
    }

    public void setStatusAtv(String status_atv){
        this.status_atv = status_atv;
    }
}
