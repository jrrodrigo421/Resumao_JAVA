package edu.rodrigo.arrays;

// Objeto utilizado para armazenar sequencialmente 
//dados do mesmo TIPO
// permanece com o mesmo tamanho depois de criados;

public class Arrays {
  public static void main(String[] args) {

    // Arrays unidimencional:

    // Crie um vetor de 6 numeros inteiros
    // e crie a ordem inversa
    int[] vetor = { 0, -5, 15, 50, 8, 4 };
    // System.out.println(vetor);
    // System.out.println(vetor.length);
    int count = 0;
    while (count < (vetor.length)) {
      // System.out.println(vetor[count]);
      System.out.println(vetor[count] + " " + "\n");
      count++;

    }
    for (int i = (vetor.length - 1); i >= 0; i--) {
      System.out.print(vetor[i] + " ");

    }

  }
}
