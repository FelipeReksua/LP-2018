/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade12;

/**
 *
 * @author joaov
 */
public class Estudante {

    private int ra = 12345678;
    private String nome;
    private String situacao;
    private double nota1, nota2, nota3, nota4, media;

    //CONSTRUTORES
    public Estudante() {
    }

    public Estudante(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public Estudante(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Estudante(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
        
    public Estudante(int ra, String nome, double nota1, double nota2, double nota3, double nota4) {
        this.ra = ra;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    //GETTERS E SETTERS
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
    

 /*   //MÉTODO QUE REALIZA O CÁLCULO DA MÉDIA A PARTIR DAS NOTAS ATRIBUÍDAS AO OBJETO
    public double getMedia() {
        return ((getNota1() + getNota2() + getNota3() + getNota4()) / 4);
    }
*/

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "RA: " + ra + ", Nome: " + nome ;
    }
    
    
}
