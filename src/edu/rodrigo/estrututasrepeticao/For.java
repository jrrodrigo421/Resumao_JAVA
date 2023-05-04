package edu.rodrigo.estrututasrepeticao;

import java.util.Scanner;

//

//
//

public class For {

  // APENAS UM TESTE COM OPERADORES DE INCREMENTO
  public static void teste() {
    int numero = 1;
    int k = 5;
    numero++;
    System.out.println(numero);
    ++numero;
    // tanto com multiplicalção e divisao
    System.out.println(numero);
    numero += k;
    System.out.println(numero);
    numero -= k;
    System.out.println(numero);
  }

  public static void main(String[] args) {
    // teste();

    // Desenvolva um gerador de tabuada,
    // capaz de gerar a tabuada de qualquer numero inteiro entre 1 e 10
    // o usuario deve informar qual o numero que ele deseja ver a tabuada
    // a saida deve ser conforme o exemplo abaixo:

    // tabuada de 5:
    // 5 x 1 = 5
    // 5 x 2 = 10
    // ...
    // 5 x 10 = 50
    Scanner scan = new Scanner(System.in);
    int numero;

    System.out.println("Insira o numero que deseja ver a tabuada: ");
    numero = scan.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(numero + " X " + i + " = " + (numero * i));

    }

  }

}
