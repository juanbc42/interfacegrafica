/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.modeloDAO;

import edu.config.Conexao;
import edu.modelodedados.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanbc
 */
public abstract class FuncionarioDAO {
    public static void adicionarFuncionarios(Funcionarios funcionario) throws SQLException{
    Connection con = Conexao.getConnection();
    System.out.println("Conectado");
        String sql = "insert into funcionario" + "(f_nome,f_cpf,f_dataNasc,f_endereco,f_telefone,f_rg,f_dataAdmissao,f_cargo)" 
            + "values(?,?,?,?,?,?,?,?)";
    PreparedStatement stmt = con.prepareStatement(sql);
    stmt.setString(1,funcionario.getF_nome());
    stmt.setString(2,funcionario.getF_cpf());
    stmt.setString(3,funcionario.getF_dataNasc());
    stmt.setString(4,funcionario.getF_endereco());
    stmt.setString(5,funcionario.getF_telefone());
    stmt.setString(6,funcionario.getF_rg());
    stmt.setString(7,funcionario.getF_dataNasc());
    stmt.setString(8,funcionario.getF_cargo());
    
    stmt.execute();
    stmt.close();
    con.close();
    }
    
    public static List<Funcionarios> buscarFunc() throws SQLException{
    
        Connection con = Conexao.getConnection();
        System.out.println("Conectado");
            String sql = "select * from funcionario";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List <Funcionarios> funcionarios = new ArrayList<Funcionarios>();
        while (rs.next()){
        Funcionarios funcionario = new Funcionarios();
        //(f_nome,f_cpf,f_dataNasc,f_endereco,f_telefone,f_rg,f_dataAdmissao,f_cargo)
        
        funcionario.setF_nome(rs.getString("f_nome"));
        funcionario.setF_cpf(rs.getString("f_cpf"));
        funcionario.setF_dataNasc(rs.getString("f_dataNasc"));
        funcionario.setF_endereco(rs.getString("f_endereco"));
        funcionario.setF_telefone(rs.getString("f_telefone"));
        funcionario.setF_rg(rs.getString("f_rg"));
        funcionario.setF_dataAd(rs.getString("f_dataAdmissao"));
        funcionario.setF_cargo(rs.getString("f_cargo"));
        
        funcionarios.add(funcionario);
        }
        rs.close();
        stmt.close();
        con.close();
        return funcionarios;
    
    }
}
