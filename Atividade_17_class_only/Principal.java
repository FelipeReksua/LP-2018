/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg16;

import javax.swing.JOptionPane;

/**
 *
 * @author joaov
 */
public class Principal {

    public static void insereNota(Professor prof, Estudante aluno) {

        for (int i = 0; i < 4; i++) {
            if (prof.getSenha().equals(JOptionPane.showInputDialog("Senha:"))) {
                int notas = Integer.parseInt(JOptionPane.showInputDialog("Quantidades de notas a serem inseridas:"));

                while (notas < 2 || notas > 4) {
                    JOptionPane.showMessageDialog(null, "Erro!\nInsira um valor entre 2 e 4!");
                    notas = Integer.parseInt(JOptionPane.showInputDialog("Quantas notas serão inseridas?"));
                }

                aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog("1ª Nota:")));
                //double media = aluno1.getNota1();
                aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog("2ª Nota:")));
                //media += aluno1.getNota2();
                if (notas == 3) {
                    aluno.setNota3(Double.parseDouble(JOptionPane.showInputDialog("3ª Nota:")));
                    // media += aluno1.getNota3();
                }
                if (notas == 4) {
                    aluno.setNota3(Double.parseDouble(JOptionPane.showInputDialog("3ª Nota:")));
                    // media += aluno1.getNota3();
                    aluno.setNota4(Double.parseDouble(JOptionPane.showInputDialog("4ª Nota:")));
                    //media += aluno1.getNota4();
                }

                //aluno.setMedia(media / notas);
                JOptionPane.showMessageDialog(null, aluno);
                break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudante aluno1 = new Estudante(1, "JV", "Riachuelo, 115");
        Professor prof = new Professor(1, "Arion", "Ponta Grossa", "trupu");
        Estudante aluno2 = new Estudante(2, "Thiago", "Riachuelo, 115");
        Estudante aluno3 = new Estudante(3, "Eduardo Soares", "Maracanã");

        int ra = Integer.parseInt(JOptionPane.showInputDialog("RA do Aluno:"));
        int i=404;
        
        while(i==404){
        if (ra == aluno1.getId()) {
            insereNota(prof, aluno1);
            i=0;
          
        } else if (ra == aluno2.getId()) {
            insereNota(prof, aluno2);
            i=0;
             
        } else if (ra == aluno3.getId()) {
            insereNota(prof, aluno3);
             i=0;
        } else {
            JOptionPane.showMessageDialog(null, "RA não encontrado");
            ra = Integer.parseInt(JOptionPane.showInputDialog("RA do Aluno:"));
             i= 404;

        }}
        
        JOptionPane.showMessageDialog(null, prof.escreveNome());
        JOptionPane.showMessageDialog(null, aluno1.escreveNome());
    }

}
