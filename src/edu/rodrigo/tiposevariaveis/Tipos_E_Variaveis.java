package edu.rodrigo.tiposevariaveis;

public class Tipos_E_Variaveis {

  // tipos primitivos: int, byte, short, long, float, double, boolean e char
  // byte = 1 byte
  // short = 2 byte
  // int = 4 bytes a propria JVM tenta sempre converter em INT acima disso declara
  // como long
  // long = 8 bytes

  // float 4 bytes
  // double 8bytes Mais comum, por questao de garantia dos calculos algoritmos
  // efetuados...

  // variaveis: (Estrutura)
  // <tipo> <nomeVariavel> = <atributoDeValorOpcional>

  public static void main(String[] args) {
    String nome;
    byte idade = 20;
    short ano = 2023;
    int cep = 37540000; // se começar com zero, tem que usar outro tipo ou converter
    long cpf = 1000000000L; // se começar com zero, tem que usar outro tipo ou converter
    double salario = 3000.60;
    float pi = 3.14F;
    char tipoCaracter = 'R';
    System.out.println(tipoCaracter);

    nome = "teste";
    System.out.println(pi);
    System.out.println(salario);
    System.out.println(nome);
    System.out.println(idade);
    System.out.println(ano);
    System.out.println(cep);
    System.out.println(cpf);

    String teste = "";
    String teste1;
    teste1 = "ola";
    System.out.println(teste);
    System.out.println(teste1);

    // um short pode ser um int mas um int nao pode ser um short a menos que
    // incrmente o (short) isso é chamado de casting ou cast
    short numero = 1;
    int novoNumero = numero;
    // short numero2 = novoNumero; // Aqui da Erro!
    short numero2 = (short) novoNumero;
    System.out.println(numero2);

    // variaveis pode receber valor e mudar durante o codigo, para que nao mude
    // acrescente final no inicio da declaração e por convenção em CAIXA ALTA
    int numeroo = 1;
    numeroo = 2;

    String casa = "Amarela";
    casa = "verde";

    final int NUMEROW = 500;
    // numerow = 20; --- Aqui da erro
    System.out.println(NUMEROW);

    // outro exemplo de implementação final(CONSTANTE):

    final double PI = 3.14;
    System.out.println(PI);

    String newCep = "00540000";
    System.out.println(newCep);
    int newCepConvet = Integer.parseInt(newCep);
    System.out.println(newCepConvet);

    // concatenação de string
    char somaLetra = 'R';
    char somaLetra2 = 'O';
    System.out.println(somaLetra + " " + somaLetra2);

    System.out.println(somaLetra + somaLetra2);

  }
}
