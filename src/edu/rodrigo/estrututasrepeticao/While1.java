package edu.rodrigo.estrututasrepeticao;

import java.util.Scanner;

// Faça um programa que peça uma nota, entre 0 e 10
// Mostre uma mensagem caso o valor seja invalido e continue pedindo
// até que o usuario insira uma valor valido

public class While1 {
  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int nota1;

    System.out.println("Insira uma nota entre 0 e 10: ");
    nota1 = scn.nextInt();

    while (nota1 < 0 || nota1 > 10) {
      System.out.println("Digite um valor valido");
      nota1 = scn.nextInt();

    }

  }
}
