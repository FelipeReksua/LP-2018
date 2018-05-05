/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamentoprova;

/**
 *
 * @author joaov
 */
public class Carro {

    private String placa;
    private String modelo;
    private int vaga;
    private String cor;

    public Carro() {
    }

    public Carro(String placa, String modelo, int vaga, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.vaga = vaga;
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVaga() {
        return vaga;
    }

    public void setVaga(int vaga) {
        this.vaga = vaga;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
