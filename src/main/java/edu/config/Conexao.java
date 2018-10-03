/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.config;

/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public abstract class Conexao {
    private static final String STRING_CONEXAO =  "jdbc:mysql://localhost:3306/client_db?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private static final String USUARIO_CONEXAO = "root";
//    private static final String SENHA_CONEXAO = "123456";
private static final String SENHA_CONEXAO = "rootadmin";
    
    
public static Connection getConnection() throws SQLException    {
return DriverManager.getConnection(STRING_CONEXAO, USUARIO_CONEXAO, SENHA_CONEXAO);    
}

}