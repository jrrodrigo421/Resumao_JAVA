package edu.rodrigo.exercicios;

public class Pessoa {
    String nome;
    int idade;
    double altura;

    String informar( String nome, int idade, double altura){
        return "O nome é " + nome + "  a idade é " + idade + "e a altura é " + altura;
    }
}
