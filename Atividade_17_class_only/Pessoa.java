/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg16;

/**
 *
 * @author joaov
 */
public abstract class Pessoa {
    int id;
    String nome;
    String endereço;

    public Pessoa(int id, String nome, String endereço) {
        this.id = id;
        this.nome = nome;
        this.endereço = endereço;
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

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
    public String escreveNome(){
        return "Pessoa, você está indo muito bem!";
    }
    
    
    
    
}
