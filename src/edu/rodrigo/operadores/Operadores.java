package edu.rodrigo.operadores;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class Operadores {
  public static void main(String[] args) {
    // Operadores:
    // = operador de atribuição
    // == igualdade
    // != diferente
    // > Maior
    // < Menor
    // >= Maior igual
    // <= menor igual

    int soma = 15 + 4;
    System.out.println(soma);
    int subtracao = 15 - 4;
    int multiplicacao = 15 * 4;
    int divisao = 15 / 4;
    int modulo = 15 % 4;
    System.out.println(subtracao);
    System.out.println(multiplicacao);
    System.out.println(divisao);
    System.out.println(modulo);

    // Operadores unarios:
    // + valor porsitivo
    // - valor negativo
    // ++ incremento
    // -- decremento
    // ! negação >> usada em expressao logica ou booleana

    int numero = 1;
    numero = -numero;
    System.out.println(numero);
    // numero = -numero;
    numero = numero * -1;
    System.out.println(numero);

    // operadores de incemento / decremento:
    numero++;
    numero++;
    System.out.println(numero);
    System.out.println(++numero);
    numero--;
    System.out.println(numero);

    // negar expressoes booleanas:
    boolean variavel = false;
    // variavel = !variavel;
    System.out.println(!variavel);// nega somente na impressao
    System.out.println(variavel);
    // ou
    variavel = !variavel; // atribuo o valor de negacao na variavel
    System.out.println(variavel);

    // operador ternario: forma resumida de criar uma condição (if - toda estrutura
    // na mesma linha)
    // <Expressao Condicional> ? <Caso condicao seha true> : <Caso cons=dicao seja
    // false>

    // Exemplo de não ternario
    int a = 5;
    int b = 6;

    // String resultado = "";
    // if (a == b) {
    // resultado = "Verdadeiro";
    // } else {
    // resultado = "Falso";
    // }
    // System.out.println(resultado);

    // aplicando operador ternario (sempre lembrando que tem que ser
    // resultado booleano)
    String resultado = a == b ? "verdadeiro" : "falso";
    System.out.println(resultado);

    int testando = a != b ? 1 : 0;
    System.out.println(testando);

    int numero1 = 1;
    int numero2 = 2;
    boolean simNao = numero1 == numero2;

    System.out.println("Numero1 é maior que numero2 " + simNao);

    simNao = numero1 != numero2;
    System.out.println("Numero1 é diferente de Numero2? " + simNao);

    String nomeUm = "RODRIGO";
    String nomeDois = new String("RODRIGO"); // fica false pois esta em outro local de memoria
    boolean compara = nomeUm == nomeDois;
    System.out.println(compara);
    // para comparar realmente o conteudo no caso
    // objetos usamos o metodo equals(booleano):
    System.out.println(nomeUm.equals(nomeDois));

    // char é um codigo numerico por isso
    // consiguimos comparar as relações
    char d = 'd';
    char e = 'e';
    if (d > e) {
      System.out.println("verdadeiro");

    } else {
      System.out.println("falsaaaaao");
    }

    // OPeradores relacionais &&(e) ou || (ou):
    // Negação ! >> inversão

    // NÃO SÃO OPERADORES LOGICOS
    // , MAS SÃO RARAMENTE USADOS
    // Operadores bitwise: & e |
    // Operadores shift:~, >>, >>>>,<<

    boolean b1 = true;
    boolean b2 = false;
    boolean b3 = true;
    boolean b4 = false;

    // conjunção, dijunção, shor, negação:

    System.out.println("b1 && b2" + (b1 && b2));
    System.out.println("b1 || b2" + (b1 || b2));
    System.out.println("b1 ^ b2" + (b1 ^ b2));
    System.out.println(!b2);

  }

}
