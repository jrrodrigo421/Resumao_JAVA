package edu.rodrigo.estrututasrepeticao;

import java.util.Scanner;

//Explicação: Esta estrutura de repetição inicia com a sentença depois vai pra expressao

// Apos passar pela sentença e tbm expressao, sendo true repepte novamente
// Apos passar pela sentença e tbm expressao, sendo false, encerra

public class DoWhile {

  // Faça um programa que leia 5 numeros
  // e informe o maior numero e a media dessses numeros
  public static void main(String[] args) {
    Scanner scaan = new Scanner(System.in);
    int numero;
    int maior = 0;
    int soma = 0;

    int count = 0;

    do {
      System.out.println("Insira um numero: ");
      numero = scaan.nextInt();
      if (numero > maior)
        maior = numero;
      count++;
      soma = soma + numero;

    } while (count < 5);

    System.out.println("Imprima o maior" + maior);
    System.out.println("Imprima a media " + (soma / 5));
  }

}
