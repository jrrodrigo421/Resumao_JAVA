package edu.rodrigo.controlefluxo;

//if, else (se, senao)
//switch(escolha)
// comparação logica booleana ? <se> : <senao>; operador ternario

public class ControleDeFluxo {

  private static void ifFlecha() {
    int mes = 100;
    if (mes == 1) {
      System.out.println("Janeiro");
    } else {
      if (mes == 2) {
        System.out.println("fevereiro");
      } else {
        if (mes == 3) {
          System.out.println("março");
        } else {
          if (mes == 4) {
            System.out.println("abril");
          } else {
            if (mes == 5) {
              System.out.println("maio");
            } else {
              if (mes == 6) {
                System.out.println("junho");
              } else {
                if (mes == 7) {
                  System.out.println("julho");
                } else {
                  if (mes == 8) {
                    System.out.println("agosto");
                  } else {
                    if (mes == 9) {
                      System.out.println("setembro");
                    } else {
                      if (mes == 10) {
                        System.out.println("outubro");
                      } else {
                        if (mes == 11) {
                          System.out.println("novembro");
                        } else {
                          if (mes == 12) {
                            System.out.println("dezembro");
                          } else {
                            System.err.println("Mes indefinido");
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  private static void ifSemFlecha() {
    int mes = 10;
    if (mes == 1) {
      System.out.println("Janeiro");
    } else if (mes == 2) {
      System.out.println("fevereiro");
    } else if (mes == 3) {
      System.out.println("março");
    } else if (mes == 4) {
      System.out.println("abril");
    } else if (mes == 5) {
      System.out.println("maio");
    } else if (mes == 6) {
      System.out.println("junho");
    } else if (mes == 7) {
      System.out.println("julho");
    } else if (mes == 8) {
      System.out.println("agosto");
    } else if (mes == 9) {
      System.out.println("setembro");
    } else if (mes == 10) {
      System.out.println("outubro");
    } else if (mes == 11) {
      System.out.println("novembro");
    } else if (mes == 12) {
      System.out.println("dezembro");
    } else {
      System.out.println("Mes indefinido");
    }
  }

  private static void switchSemana() {
    String dia = "Terça";
    switch (dia) {
      case "Segunda":
        System.out.println("O dia da semana é: " + dia);
        break;
      case "Terça":
        System.out.println("O dia da semana é: " + dia);
        break;
      case "Quarta":
        System.out.println("O dia da semana é: " + dia);
        break;
      case "Quinta":
        System.out.println("O dia da semana é: " + dia);
        break;
      case "Sexta":
        System.out.println("O dia da semana é: " + dia);
        break;
      case "Sabado":
        System.out.println("O dia da semana é: " + dia);
        break;
      case "Domingo":
        System.out.println("O dia da semana é: " + dia);

        break;

      default:
        System.out.println("teste");
        break;
    }
  }

  private static void switchNumero() {
    int numero = 1000;
    switch (numero) {
      case 1:
      case 2:
      case 3:
      case 4:
        System.out.println("o numero é ruim");
        break;
      case 5:
        System.out.println("numero bom");
        break;

      default:
        System.out.println("Valor indefinido");
        break;
    }

  }

  public static void teste() {
    int um = 1;
    int dois = 2;
    if (um + dois == 2) {
      System.out.println("erro");

    } else {
      System.out.println("errrooo");
    }
  }

  public static void teste2() {
    int um = 1;
    if (um == 1)
      System.out.println("OK");
    else
      System.out.println("Não");
  }

  public static void main(String[] args) {
    ifFlecha(); // evitar usar
    ifSemFlecha(); // preferir utilizar if alinhado
    switchSemana(); // Quando tivermos apenas uma variavel para testar varias casos, podemos usar o
                    // Switch
    switchNumero();
    teste();
    teste2();
  }

}
