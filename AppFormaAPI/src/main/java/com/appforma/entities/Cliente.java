package com.appforma.entities;

import java.math.BigDecimal;
import java.sql.Date;

import java.util.List;

import com.appforma.DTOs.Cliente.ClienteRequestDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente extends GenericEntity{
    
    @Column(nullable = false, length = 11)
    private String cpf;
    
    @Column(nullable = false, length = 45)
    private String nome;

    @Column(nullable = false, length = 100)
    private String end_residencial;

    @Column(nullable = false, length = 100)
    private String end_obra;

    @Column(length = 20)
    private String cidade;

    @Column(nullable = false, length = 15)
    private String telefone;

    @Column // Column permite que o campo seja NULL por padrao
    private Date data_nascimento;

    @Column(length = 1)
    private String tipo_projeto;

    @Column(nullable = false)
    private BigDecimal valor_projeto;

    @OneToMany(mappedBy = "clienteFinanceiro")
    private List<Financeiro> financeiro;

    @OneToMany(mappedBy = "clienteItens")
    private List<ItensObra> itensObra;

    @OneToMany(mappedBy = "clienteChecklist")
    private List<Checklist> checklist;

    @OneToMany(mappedBy = "atvCliente")
    private List<Atividades> atividades;

    //Getters e Setters

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndRes(){
        return end_residencial;
    }

    public void setEndRes(String end_residencial){
        this.end_residencial = end_residencial;
    }

    public String getEndObra(){
        return end_obra;
    }

    public void setEndObra(String end_obra){
        this.end_obra = end_obra;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public Date getDataNasc(){
        return data_nascimento;
    }

    public void setDataNasc(Date data_nascimento){
        this.data_nascimento = data_nascimento;
    }

    public String getTipo(){
        return tipo_projeto;
    }

    public void setTipo(String tipo_projeto){
        this.tipo_projeto = tipo_projeto;
    }

    public BigDecimal getValor(){
        return valor_projeto;
    }

    public void setValor(BigDecimal valor_projeto){
        this.valor_projeto = valor_projeto;
    }


    //Getter e setters das colunas que estao relacionadas com outras tabelas

    public List<Financeiro> getFinanceiro(){
        return financeiro;
    }

    public void setFinanceiro(List<Financeiro> financeiro){
        this.financeiro = financeiro;
    }

    public List<ItensObra> getItensObra(){
        return itensObra;
    }

    public void setItensObra(List<ItensObra> itensObra){
        this.itensObra = itensObra;
    }

    public List<Checklist> getChecklist(){
        return checklist;
    }

    public void setChecklist(List<Checklist> checklist){
        this.checklist = checklist;
    }

    public List<Atividades> getAtividades(){
        return atividades;
    }

    public void setAtividades(List<Atividades> atividades){
        this.atividades = atividades;
    }


    //Constructors para metodos REST; Faz com que o metodo POST entenda o que esta sendo passado na requisicao

    public Cliente(ClienteRequestDTO data){
        this.cpf = data.cpf();
        this.nome = data.nome();
        this.end_residencial = data.end_residencial();
        this.end_obra = data.end_obra();
        this.cidade = data.cidade();
        this.telefone = data.telefone();
        this.data_nascimento = data.data_nascimento();
        this.tipo_projeto = data.tipo_projeto();
        this.valor_projeto = data.valor_projeto();
    }

    // Construtor padrão (sem argumentos) necessário pelo JPA
    public Cliente() {
    }
}
