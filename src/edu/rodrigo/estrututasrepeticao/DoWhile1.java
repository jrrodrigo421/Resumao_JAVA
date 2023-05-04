package edu.rodrigo.estrututasrepeticao;
//Faça um programa que peça N numeros para o usuario e some todos eles, 

//passando tbm a soma de todos numeros PARES e IMPARES;

import java.util.Scanner;

public class DoWhile1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero;
    int count = 0;
    int valor;
    int totalPar = 0;
    int somatorioPar = 0;
    int totalImpar = 0;
    int somatorioImpar = 0;

    System.out.println("Insira a quantidade de numeros desejada para realizar o loop: \n");
    numero = scan.nextInt();
    do {
      System.out.println("Insira um valor:");
      valor = scan.nextInt();
      count++;
      if (valor % 2 == 0) {
        totalPar++;
        if (valor % 2 == 0) {
          somatorioPar = somatorioPar + valor;
        }
      } else
        totalImpar++;

    } while (count < numero);

    System.out.println("Quantidade de Loop solicitadas: " + numero);
    System.out.println("Quantidade de numeros Pares inseridos: " + totalPar);
    System.out.println("Quantidade de numeros impares inseridos: " + totalImpar);
    System.out.println("Somatório dos numeoros pares: " + totalPar);
    System.out.println("Somatório dos numeoros impares: " + totalImpar);

  }

}
