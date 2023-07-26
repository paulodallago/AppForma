package com.appforma.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_itens_obra")
public class ItensObra extends GenericEntity {
    
    @ManyToOne //Coloca o nome da chave estrangeira como "id_cliente" e relaciona com a tb_cliente pelo id 
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    private Cliente clienteItens;

    @Column(nullable = false, length = 45)
    private String nome_cliente;

    @Column(nullable = false, length = 11)
    private String cpf_cliente;

    @Column(length = 20)
    private String piso_area_intima;

    @Column(length = 20)
    private String piso_area_social;

    @Column(length = 20)
    private String esquadrias_internas;

    @Column(length = 20)
    private String esquadrias_externas;

    @Column(length = 20)
    private String telhado;

    @Column(length = 20)
    private String forro;

    @Column(length = 20)
    private String rodaforro;

    @Column(length = 20)
    private String rodape;

    //Getters e Setters

    public Cliente getClienteItens(){
        return clienteItens;
    }

    public void setClienteItens(Cliente clienteItens){
        this.clienteItens = clienteItens;
    }

    public String getClienteNome(){ //itensObra = clienteNome; financeiro = nomeCliente
        return nome_cliente;
    }

    public void setClienteNome(String nome_cliente){
        this.nome_cliente = nome_cliente;
    }

    public String getClienteCpf(){// itensObra = ClienteCpf; financeiro = cpfCliente
        return cpf_cliente;
    }
    
    public void setClienteCpf(String cpf_cliente){
        this.cpf_cliente = cpf_cliente;
    }

    public String getAreaIntima(){
        return piso_area_intima;
    }

    public void setAreaIntima(String piso_area_intima){
        this.piso_area_intima = piso_area_intima;
    }

    public String getAreaSocial(){
        return piso_area_social;
    }

    public void setAreaSocial(String piso_area_social){
        this.piso_area_social = piso_area_social;
    }

    public String getInternas(){
        return esquadrias_internas;
    }

    public void setInternas(String esquadrias_internas){
        this.esquadrias_internas = esquadrias_internas;
    }

    public String getExternas(){
        return esquadrias_externas;
    }

    public void setExternas(String esquadrias_externas){
        this.esquadrias_externas = esquadrias_externas;
    }

    public String getTelhado(){
        return telhado;
    }

    public void setTelhado(String telhado){
        this.telhado = telhado;
    }

    public String getForro(){
        return forro;
    }

    public void setForro(String forro){
        this.forro = forro;
    }

    public String getRodaforro(){
        return rodaforro;
    }

    public void setRodaforro(String rodaforro){
        this.rodaforro = rodaforro;
    }

    public String getRodape(){
        return rodape;
    }

    public void setRodape(String rodape){
        this.rodape = rodape;
    }
}
