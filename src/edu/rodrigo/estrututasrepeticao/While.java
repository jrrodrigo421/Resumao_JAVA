package edu.rodrigo.estrututasrepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

//Explicação: Esta estrutura de repetição inicia com expressoa de teste (true ou false)
// sendo inicialmente true ela executa a sentença, se continuar true fica na sentença até dar false
// sendo inicialmente false já encerra

public class While {
  // Faça um programa que fique lendo dois valores que o usuario introduza
  // e que se encerre quando um dele for 0

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String nome;
    int idade;

    while (true) {

      System.out.println("Digite um nome: ");
      try {
        nome = scan.next();
        if (nome.equals("0"))
          break;
      } catch (InputMismatchException e) {
        System.out.println("Entrada invalida meu amigo!!!");
        scan.next();
        continue;
      }

      System.out.println("Digite sua idade: ");
      // idade = scan.nextInt();
      // implementando tratamento de excessão, neste caso apontou erro de thread
      try {

        idade = scan.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Entrada de dados invalida!");
        scan.next();
        continue;
      }

    }

    System.out.println("Continua aqui!!!");
  }
}