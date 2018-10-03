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
 * @author user
 */
public abstract class ClienteDAO {
    public static void adicionarCliente(Cliente cliente) throws SQLException {
    
    Connection con = Conexao.getConnection();
    System.out.println("Conectado");
        String sql = "insert into clientes" + "(nome,cpf,TipoLogradouro,Logradouro,NumeroLogradouro,TelefoneResidencial,TelefoneComercial,TelefoneCelular,rg,Profissao)" 
            + "values(?,?,?,?,?,?,?,?,?,?)";
    PreparedStatement  stmt = con.prepareStatement(sql);
    stmt.setString(1,cliente.getNome());
    stmt.setString(2,cliente.getCpf());
    stmt.setString(3,cliente.getTipoLogradouro());
    stmt.setString(4,cliente.getLogradouro());
    stmt.setInt(5,cliente.getNumeroLogradouro());
    stmt.setString(6,cliente.getTelefoneResidencial());
    stmt.setString(7,cliente.getTelefoneComercial());
    stmt.setString(8,cliente.getTelefoneCelular());
    stmt.setString(9,cliente.getRg());
    stmt.setString(10,cliente.getProfissao());
    
    stmt.execute();
    stmt.close();
    con.close();
    }
    public static List<Cliente> buscarClientes() throws SQLException{
    
        Connection con=Conexao.getConnection();
        System.out.println("Conectado");
        String sql = "select * from clientes";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List <Cliente> clientes = new ArrayList<Cliente>();
        while (rs.next()){
        Cliente cliente = new Cliente();
        
        cliente.setNome(rs.getString("nome"));
        cliente.setCpf(rs.getString("cpf"));
        cliente.setTipoLogradouro(rs.getString("TipoLogradouro"));
        cliente.setLogradouro(rs.getString("Logradouro"));
        cliente.setNumeroLogradouro(rs.getInt("NumeroLogradouro"));
        cliente.setTelefoneResidencial(rs.getString("TelefoneResidencial"));
        cliente.setTelefoneComercial(rs.getString("TelefoneComercial"));
        cliente.setTelefoneCelular(rs.getString("TelefoneCelular"));
        cliente.setRg(rs.getString("rg"));
        cliente.setProfissao(rs.getString("Profissao"));
        
        clientes.add(cliente);
        }
        rs.close();
        stmt.close();
        con.close();
        return clientes;
    
    }
    
   }

