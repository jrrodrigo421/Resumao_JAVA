package edu.rodrigo.exercicios;

import edu.rodrigo.POO.Carro;

import java.awt.*;

public class Play {
    public static void main(String[] args) {
        Retangulo calculo1 = new Retangulo();
        ContaBancaria teste1 = new ContaBancaria();
        Pessoa pessoa1 = new Pessoa();
        Carro carro1 = new Carro();

        System.out.println(calculo1.calcularArea(12.3, 121.3));
        System.out.println(calculo1.calcularPerimetro(1, 1, 1, 1));

        teste1.deposito(300);
        System.out.println(teste1.saldo);
        teste1.sacar(290);
        System.out.println(teste1.saldo);


        System.out.println(pessoa1.informar("Rodrigo", 29, 1.84));
        System.out.println(SystemColor.getColor(pessoa1.toString()));
        System.out.println(carro1.equals("{Carro@742}"));

    }

}
