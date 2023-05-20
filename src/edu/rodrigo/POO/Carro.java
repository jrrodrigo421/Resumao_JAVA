package edu.rodrigo.POO;
//clase
public class Carro {
    //atributos
    String cor;
    String modelo;
    int capacidadeTanque;
    Carro() {}

    Carro(String cornew, String modelooo, int capacidade){
        this.cor = cornew;
        this.modelo = modelooo;
        this.capacidadeTanque = capacidade;
    }


    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }
    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }


}
