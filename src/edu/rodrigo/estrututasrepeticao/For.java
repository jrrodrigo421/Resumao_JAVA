package edu.rodrigo.estrututasrepeticao;

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
    teste();
  }

}
