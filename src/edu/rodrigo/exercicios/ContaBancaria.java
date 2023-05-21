package edu.rodrigo.exercicios;

public class ContaBancaria {
    int conta;
    double saldo;

    void deposito(double x){
        saldo = saldo + x;

    }
    double sacar(double x){
        if (x<saldo){
            saldo = saldo -x;
        }else {
            System.out.println("Saldo insuficiente");
        }


        return  saldo;
    }

}
