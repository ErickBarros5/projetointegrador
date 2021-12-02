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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Projeto;
import view.viewCadastro;

/**
 *
 * @author Erick
 */
public class ProjetoDAO {

    private final Connection connection;

    public ProjetoDAO(Connection connection) {
        this.connection = connection;
    }

    public ProjetoDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void insert(Projeto palavra) throws SQLException{
            
            String sql = "insert into palavra(nome,significado) values ('"+palavra.getNome()+"','"+palavra.getSignificado()+"');";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
 
    }

    

}
