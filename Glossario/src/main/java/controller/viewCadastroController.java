/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.Conexao;
import dao.ProjetoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Projeto;
import view.viewCadastro;

/**
 *
 * @author Erick
 */
public class viewCadastroController {
    
    private viewCadastro view;

    public viewCadastroController(viewCadastro view) {
        this.view = view;
    }
    
    public void salvarProjeto(){
        String nome = view.getjTextFieldNome().getText();
        String significado = view.getjTextFieldSignificado().getText();
        
        Projeto projeto = new Projeto(nome, significado);
        
        try {
            Connection conexao = new Conexao().getConnection();
            ProjetoDAO projetoDao = new ProjetoDAO(conexao);
            projetoDao.insert(projeto);
            
            JOptionPane.showInternalMessageDialog(null, "Palavra cadastrada com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(viewCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
