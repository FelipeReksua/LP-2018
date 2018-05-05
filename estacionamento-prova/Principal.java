/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamentoprova;

import javax.swing.JOptionPane;

/**
 *
 * @author joaov
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vaga;
        // TODO code application logic here
        
        //Objeto instanciado previamente
        
        Carro carro1 = new Carro("ABC-1234", "Feneme", 4, "verde");
        
        // Objetos Instanciados pelo usuário com vereficação de vagas ocupadas
        Carro carro2 = new Carro();
        carro2.setPlaca(JOptionPane.showInputDialog("Placa do carro"));
        carro2.setModelo(JOptionPane.showInputDialog("Modelo do carro"));
        carro2.setCor(JOptionPane.showInputDialog("Cor do carro"));
        vaga = Integer.parseInt(JOptionPane.showInputDialog("Vaga"));
        while (vaga == carro1.getVaga()) {
            vaga = Integer.parseInt(JOptionPane.showInputDialog("Vaga Ocupada, insira outra!"));
        }
        carro2.setVaga(vaga);

        Carro carro3 = new Carro();
        carro3.setPlaca(JOptionPane.showInputDialog("Placa do carro"));
        carro3.setModelo(JOptionPane.showInputDialog("Modelo do carro"));
        carro3.setCor(JOptionPane.showInputDialog("Cor do carro"));
        vaga = Integer.parseInt(JOptionPane.showInputDialog("Vaga"));

        while (vaga == carro1.getVaga() || vaga == carro2.getVaga()) {
            vaga = Integer.parseInt(JOptionPane.showInputDialog("Vaga Ocupada, insira outra!"));
        }

        carro3.setVaga(vaga);

        Carro carro4 = new Carro();
        carro4.setPlaca(JOptionPane.showInputDialog("Placa do carro"));
        carro4.setModelo(JOptionPane.showInputDialog("Modelo do carro"));
        carro4.setCor(JOptionPane.showInputDialog("Cor do carro"));
        vaga = Integer.parseInt(JOptionPane.showInputDialog("Vaga"));

        while (vaga == carro1.getVaga()||vaga == carro2.getVaga()||vaga == carro3.getVaga()) {
            vaga = Integer.parseInt(JOptionPane.showInputDialog("Vaga Ocupada, insira outra!"));
        }
        carro4.setVaga(vaga);

    }

}
