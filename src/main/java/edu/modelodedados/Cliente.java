/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.modelodedados;

/**
 *
 * @author Juan
 */
public class Cliente {
    private String nome;
    private String tipoLogradouro;
    private String logradouro;
    private Integer numeroLogradouro;
    private String telefoneResidencial;
    private String telefoneComercial;
    private String telefoneCelular;
    private String cpf;
    private String rg;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipoLogradouro() {
        return tipoLogradouro;
    }
    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public Integer getNumeroLogradouro() {
        return numeroLogradouro;
    }
    public void setNumeroLogradouro(Integer numeroLogradouro) {
        this.numeroLogradouro = numeroLogradouro;
    }
    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }
    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }
    public String getTelefoneComercial() {
        return telefoneComercial;
    }
    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }
    public String getTelefoneCelular() {
        return telefoneCelular;
    }
    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
  
    public void informacoesCliente(){
        System.out.println("Nome:"+this.getNome());
        System.out.println("TipoLogradouro:"+this.getTipoLogradouro());
        System.out.println("Logradouro:"+this.getLogradouro());
        System.out.println("NumeroLogradouro:"+this.getNumeroLogradouro());
        System.out.println("TelefoneResidencial:"+this.getTelefoneResidencial());
        System.out.println("TelefoneComercial:"+this.getTelefoneComercial());
        System.out.println("TelefoneCelular:"+this.getTelefoneCelular());
        System.out.println("Cpf:"+this.getCpf());
        System.out.println("Rg:"+this.getRg());
        System.out.println("Profissao:"+this.getProfissao());
        
}
}
