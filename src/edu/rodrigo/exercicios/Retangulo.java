package edu.rodrigo.exercicios;

public class Retangulo {
    double comprimento;
    double largura;

    double calcularArea(double base, double altura){
        double calculoArea = base * altura;
        return calculoArea;
    }
    double calcularPerimetro(double lado1, double lado2, double lado3, double lado4 ){
        double calculoPerimetro = lado1 + lado2 + lado3 + lado4;
        return calculoPerimetro;
    }
}
