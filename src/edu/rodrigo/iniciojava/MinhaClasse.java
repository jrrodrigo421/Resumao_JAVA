package edu.rodrigo.iniciojava;
// import java.util.ArrayList;

// import javax.swing.event.SwingPropertyChangeSupport;

// ###############################################
// Variavel = imperativo
// metodo = verbo

// ###################################################

public class MinhaClasse {
  // String name = "john";

  // ArrayList<String> frutas = new ArrayList<>();

  // frutas.add("Laranja");
  // frutas.add("Laranja");
  // frutas.add("Laranja");

  // for (String fruta : frutas) {
  // System.out.println(frutas);
  // }

  // não sofre alterações:
  final String BR = "brasil";

  // tipo float numero com ponto.
  double PI = 3.14;

  // tipo numero inteiro
  int ESTADOS_BRASILEIROS = 27;
  int ANO_2000 = 2000;

  String teste;
  String teste2 = "1";
  String teste3 = "1";
  // teste3 = "8";

  // criação de metodo estatico
  public void formatarCep(long cep) {

    System.out.println(cep);
  }

  // criaçaõ de metodo nao estatico
  public static String juntarNome(String nome, String sobrenome) {
    return nome.concat(" ").concat(sobrenome);
    // return juntarNome;

  }

  // Declarando um array
  String[] emails = { "teste@teste", "teste@teste" };

  public static void main(String[] args) {
    // System.out.println("HEllo");

    // tipo booleano
    // boolean teste = true;

    // System.out.println(teste);

    // Criação de um metodo com parametros:

    // String nome = "Rodrigo";
    // String sobrenonome = "Lopes";

    MinhaClasse minhaInstancia = new MinhaClasse();
    long valorCep = 2151585615l;
    minhaInstancia.formatarCep(valorCep);

    String nomeCompleto = juntarNome("Rodrigo", "Lopes");
    System.out.println(nomeCompleto);

    // tipos de classes
    Integer um = 10085;
    int um1 = 10085;

    System.out.println(um);
    System.out.println(um1);
  }

}
