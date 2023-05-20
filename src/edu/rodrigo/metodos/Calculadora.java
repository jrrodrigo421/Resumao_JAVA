package edu.rodrigo.metodos;

import java.util.Scanner;

public class Calculadora {

  public static String calculadora() {

    Scanner scan = new Scanner(System.in);

    int numero1;
    int numero2;
    String retorno = "Resultado";

    try {
      System.out.println("Por favor escolha dois numeros: ");
      numero1 = scan.nextInt();
      numero2 = scan.nextInt();
    } finally {
      if (scan != null) {
        scan.close();
      }
    }

    System.out.println("SOMA: " + (numero1 + numero2) + "\n");
    System.out.println("SUBTRAÇÃO: " + (numero1 - numero2) + "\n");
    System.out.println("MULTIPLICAÇÃO: " + (numero1 * numero2) + "\n");
    System.out.println("DIVISÃO: " + (numero1 / numero2));

    return retorno;

  }

  public static void testaaaaando() {
    Scanner scan = new Scanner(System.in);

    int numero1;
    int numero2;
    // String retorno2 = "Resultado2";

    try {
      System.out.println("Por favor escolha dois numeros: ");
      numero1 = scan.nextInt();
      numero2 = scan.nextInt();
    } finally {
      if (scan != null) {
        scan.close();
      }
    }

    System.out.println("SOMA: " + (numero1 + numero2) + "\n");
    System.out.println("SUBTRAÇÃO: " + (numero1 - numero2) + "\n");
    System.out.println("MULTIPLICAÇÃO: " + (numero1 * numero2) + "\n");
    System.out.println("DIVISÃO: " + (numero1 / numero2));
    System.out.println("\n ^^ Resultado ^^");
  }
}
