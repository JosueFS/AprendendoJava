package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import static java.util.logging.Logger.getLogger;
import javax.swing.JOptionPane;
import model.bean.Produto;

public class ProdutoDAO {
    public void create(Produto p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO produto (descricao, qtd, preco)VALUES(?,?,?)");
            stmt.setString(1, p.getDescricao());
            stmt.setInt(2, p.getQtd());
            stmt.setDouble(3, p.getPreco());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso.");
        } catch (SQLException ex) {
            getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar.");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public void update(Produto p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            String sql = "UPDATE produto SET descricao=?, qtd=?, preco=? WHERE id=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getDescricao());
            stmt.setInt(2, p.getQtd());
            stmt.setDouble(3, p.getPreco());
            stmt.setInt(4, p.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso.");
        } catch (SQLException ex) {
            getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar.");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    public void delete(Produto p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            String sql = "DELETE FROM produto WHERE id=?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, p.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso.");
        } catch (SQLException ex) {
            getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao exluir.");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Produto> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos;
        produtos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Produto p = new Produto();
                
                p.setId(rs.getInt("id"));
                p.setDescricao(rs.getString("descricao"));
                p.setQtd(rs.getInt("qtd"));
                p.setPreco(rs.getDouble("preco"));
                p.setQtd(rs.getInt("qtd"));
                produtos.add(p);
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar." + ex );
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
    }


    
//    public String contar() throws SQLException{
//        String total;
//        String sql = "SELECT COUNT(*) as cont FROM produto";
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = con.prepareStatement(sql);
//        ResultSet rs = stmt.executeQuery();
//        total = rs.getString("cont");
//        JOptionPane.showMessageDialog(null, "Teste: "+ total);
//        return total;
//    }
}
