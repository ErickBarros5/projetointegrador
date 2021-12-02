/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Projeto;

/**
 *
 * @author Erick
 */
public class pesquisaDAO {
    
    Connection conexao;
    
    public ResultSet autenticarPesquisa(Projeto projetoPesquisa) throws SQLException {
        conexao = new Conexao().getConnection();
        
        try {
            String sql = "select nome from palavra where nome = ?";
            PreparedStatement pstm = conexao.prepareStatement(sql);
            pstm.setString(1, projetoPesquisa.getNome());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Resultado:" + erro);
            return null;
        }
    }
    
}
