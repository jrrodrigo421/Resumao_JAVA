package edu.rodrigo.estrututasrepeticao;

import java.util.Scanner;

//Faça um programa que calcule o fatorial 
//de um numero inteiro fornecido pelo usuario
//Ex.: 5! = 120 (5 X 4 X 3 X 2 X 1)
public class for1 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int numero;
    int multiplicacao = 1;
    System.out.println("Insira um numero para o fatorial: ");
    numero = scn.nextInt();
    System.out.println(numero + "! = ");

    for (int i = numero; i >= 1; i--) {
      multiplicacao = multiplicacao * i;

    }
    System.out.println(multiplicacao);

  }
}
