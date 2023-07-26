package com.appforma.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_checklist")
public class Checklist extends GenericEntity {

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    private Cliente clienteChecklist;

    @Column
    private Boolean matricula_status;

    @Column
    private Boolean vistoria_status;

    @Column
    private Boolean contrato_assinado;

    @Column
    private Boolean doc_financiamento;

    @Column
    private Boolean art_status;

    @Column(length = 150)
    private String obs_checklist;

    //Getters e setters

    public Cliente getClienteChecklist(){
        return clienteChecklist;
    }

    public void setClienteChecklist(Cliente clienteChecklist){
        this.clienteChecklist = clienteChecklist;
    }

    public Boolean getMatriculaStatus(){
        return matricula_status;
    }

    public void setMatriculaStatus(Boolean matricula_status){
        this.matricula_status = matricula_status;
    }

    public Boolean getVistoriaStatus(){
        return vistoria_status;
    }

    public void setVistoriaStatus(Boolean vistoria_status){
        this.vistoria_status = vistoria_status;
    }

    public Boolean getContratoStatus(){
        return contrato_assinado;
    }

    public void setContratoStatus(Boolean contrato_assinado){
        this.contrato_assinado = contrato_assinado;
    }

    public Boolean getDocStatus(){
        return doc_financiamento;
    }

    public void setDocStatus(Boolean doc_financiamento){
        this.doc_financiamento = doc_financiamento;
    }

    public Boolean getArtStatus(){
        return art_status;
    }

    public void setArtStatus(Boolean art_status){
        this.art_status = art_status;
    }
}