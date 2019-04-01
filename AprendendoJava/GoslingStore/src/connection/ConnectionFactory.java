/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Home
 */
public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/dbstore?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private static final String USER = "root";
    private static final String PASS = "abcd1234";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return (Connection) DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            //Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro na conexão", ex);
        }
    }
    
    public static void closeConnection(Connection con){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException("Erro ao fechar conexão", ex);
            }
            
        }
    }
    
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        closeConnection(con);
        
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException("Erro ao fechar conexão", ex);
            }
            
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        closeConnection(con, stmt);
        
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException("Erro ao fechar conexão", ex);
            }
            
        }
    }

    private ConnectionFactory() {
    }
    
}