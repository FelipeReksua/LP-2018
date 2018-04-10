/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade12;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author joaov
 */
// Classe Principal
public class Principal {

    /**
     * @param args the command line arguments
     */
    // Método principal
    public static void main(String[] args) {
        ArrayList<Estudante> lstAlunos = new ArrayList();

        //Solicitação da quantidade de estudantes
        int qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos Estudantes serão cadastrados?"));

        //Repetição que solicita os dados para realizar as instâncias de Alunos 
        for (int i = 0; i < qtdAlunos; i++) {
            Estudante aluno = new Estudante();
            aluno.setNome(JOptionPane.showInputDialog("Qual é o nome do " + (i + 1) + "º" + " Estudante?"));
            double notas = Double.parseDouble(JOptionPane.showInputDialog("Quantas notas serão inseridas para o aluno " + aluno.getNome() + "?"));

            //Limita número de notas a valores entre 2 e 4
            while (notas < 2 || notas > 4) {
                JOptionPane.showMessageDialog(null, "Erro!\nInsira um valor entre 2 e 4!");
                notas = Double.parseDouble(JOptionPane.showInputDialog("Quantas notas serão inseridas?"));
            }

            aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog("1ª Nota:")));
            double media = aluno.getNota1();
            aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog("2ª Nota:")));
            media += aluno.getNota2();
            if (notas == 3) {
                aluno.setNota3(Double.parseDouble(JOptionPane.showInputDialog("3ª Nota:")));
                media += aluno.getNota3();
            }
            if (notas == 4) {
                 aluno.setNota3(Double.parseDouble(JOptionPane.showInputDialog("3ª Nota:")));
                media += aluno.getNota3();
                aluno.setNota4(Double.parseDouble(JOptionPane.showInputDialog("4ª Nota:")));
                media += aluno.getNota4();
            }
            aluno.setMedia(media / notas);
            
            //Classificação
            
            if (media >= 7) {
                aluno.setSituacao("Aprovado");
            } else if (media >= 3.5) {
                aluno.setSituacao("Em Exame");
            } else {
                aluno.setSituacao("Reprovado");
            }
            lstAlunos.add(aluno);

        }

        //IMPRESSÃO DO CONTEÚDO DA LISTA (OBJETOS DO TIPO ESTUDANTE INSTANCIADOS) 
        for (Estudante e : lstAlunos) {
            String nomeAluno = e.getNome();
            String situacaoAluno = e.getSituacao();
            JOptionPane.showMessageDialog(null, "Nome do Aluno: " + nomeAluno + "\nSituação do Aluno: " + situacaoAluno);
        }
    }
// FIM DO MÉTODO PRINCIPAL

}
//FIM DA CLASSE
