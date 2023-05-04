package edu.rodrigo.arrays;

import java.util.Random;

public class Arrays2 {
  public static void main(String[] args) {
    Random random = new Random();
    int[] teste = new int[20];

    for (int i = 0; i < teste.length; i++) {
      int numero = random.nextInt(100);
      teste[i] = numero;
    }
    System.out.print("Numeros Aleatorios: ");
    for (int qualquerNomeDeVariavel : teste) {
      System.out.print(
          qualquerNomeDeVariavel + " ");

    }
    System.out.print(" \nNumeros Sucessores: ");
    for (int qualquerNomeDeVariavel : teste) {
      System.out.print(
          qualquerNomeDeVariavel + 1 + " ");

    }
    System.out.print(" \nNumeros Antecessor: ");
    for (int qualquerNomeDeVariavel : teste) {
      System.out.print(
          qualquerNomeDeVariavel - 1 + " ");

    }

  }
}
