/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.modelodedados;

/**
 *
 * @author juanbc
 */
public class Funcionarios {
    private String f_nome;
    private String f_cpf;
    private String f_dataNasc;
    private String f_endereco;
    private String f_telefone;
    private String f_rg;
    private String f_dataAd;
    private String f_cargo;

    public String getF_nome() {
        return f_nome;
    }

    public void setF_nome(String f_nome) {
        this.f_nome = f_nome;
    }

    public String getF_cpf() {
        return f_cpf;
    }

    public void setF_cpf(String f_cpf) {
        this.f_cpf = f_cpf;
    }

    public String getF_dataNasc() {
        return f_dataNasc;
    }

    public void setF_dataNasc(String f_dataNasc) {
        this.f_dataNasc = f_dataNasc;
    }

    public String getF_endereco() {
        return f_endereco;
    }

    public void setF_endereco(String f_endereco) {
        this.f_endereco = f_endereco;
    }

    public String getF_telefone() {
        return f_telefone;
    }

    public void setF_telefone(String f_telefone) {
        this.f_telefone = f_telefone;
    }

    public String getF_rg() {
        return f_rg;
    }

    public void setF_rg(String f_rg) {
        this.f_rg = f_rg;
    }

    public String getF_dataAd() {
        return f_dataAd;
    }

    public void setF_dataAd(String f_dataAd) {
        this.f_dataAd = f_dataAd;
    }
    
    public String getF_cargo() {
        return f_cargo;
    }

    public void setF_cargo(String f_cargo) {
        this.f_cargo = f_cargo;
    }

    

    
    public void informacoesFuncionario(){
        System.out.println("Nome:"+this.getF_nome());
        System.out.println("CPF:"+this.getF_cpf());
        System.out.println("Data Nascimento:"+this.getF_dataNasc());
        System.out.println("Endereço:"+this.getF_endereco());
        System.out.println("Telefone:"+this.getF_telefone());
        System.out.println("RG:"+this.getF_rg());
        System.out.println("Cargo:"+this.getF_cargo());
        
    }
    
}
