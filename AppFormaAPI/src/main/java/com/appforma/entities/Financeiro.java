package com.appforma.entities;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_financeiro")
public class Financeiro extends GenericEntity {

    @ManyToOne //Coloca o nome da chave estrangeira como "id_cliente" e relaciona com a tb_cliente pelo id
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    private Cliente clienteFinanceiro;

    @Column(nullable = false, length = 45)
    private String nome_cliente;

    @Column(nullable = false, length = 11)
    private String cpf_cliente;

    @Column(nullable = false)
    private Date data_para_pgto;

    @Column(nullable = false)
    private BigDecimal valor_total;

    @Column
    private Date data_pgto_realizado;

    @Column(length = 150)
    private String descricao_financeiro;

    @Column(nullable = false, length = 2)
    private String status;

    //Getters e Setters

    public String getNomeCliente(){
        return nome_cliente;
    }

    public void setNomeCliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getCpfCliente(){
        return cpf_cliente;
    }

    public void setCpfCliente(String cpf_cliente){
        this.cpf_cliente = cpf_cliente;
    }

    public Date getDataPrazo(){
        return data_para_pgto;
    }

    public void setDataPrazo(Date data_para_pgto){
        this.data_para_pgto = data_para_pgto;
    }

    public BigDecimal getValTotal(){
        return valor_total;
    }

    public void setValTotal(BigDecimal valor_total){
        this.valor_total = valor_total;
    }

    public Date getDataPgto(){
        return data_pgto_realizado;
    }

    public void setDataPgto(Date data_pgto_realizado){
        this.data_pgto_realizado = data_pgto_realizado;
    }

    public String getDescricao(){
        return descricao_financeiro;
    }

    public void setDescricao(String descricao_financeiro){
        this.descricao_financeiro = descricao_financeiro;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    //Getter e setters das colunas que estao relacionadas com outras tabelas

    public Cliente getClienteFinanceiro(){
        return clienteFinanceiro;
    }

    public void setClienteFinanceiro(Cliente clienteFinanceiro){
        this.clienteFinanceiro = clienteFinanceiro;
    }
}