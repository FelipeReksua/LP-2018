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
public class Professor extends Pessoa {

    String senha;

    public Professor(int id, String nome, String endereço, String senha) {
        super(id, nome, endereço);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
