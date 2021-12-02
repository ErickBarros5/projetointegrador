/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Erick
 */
public class Projeto {
    private int id;
    private String nome;
    private String significado;

    public Projeto(int id, String nome, String significado) {
        this.id = id;
        this.nome = nome;
        this.significado = significado;
    }

    public Projeto(String nome, String significado) {
        this.nome = nome;
        this.significado = significado;
    }

    public Projeto(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Projeto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }
    
    
}
