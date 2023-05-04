package edu.rodrigo.metodos;

// Uma classe é definida por atributos e metodos

// metodos correspondem a funções ou sub rotinas...
//Metodos devem ser nomeado como verbo..
// seguir o padrao camelCase
// se o metodo nao retornar nemhum valor, ele sera representado pela palavra VOID
// verificar se nao precisa de tratamento de Exceção, ex. usuario nao poder 
//dividir numero por 0 ai dispara uma exceção
//Visibilidade:
// toda aplicação??
// somente em mesmo pacote ??
// herança ? 
// ou somente a nivel da propria classe ? 

public class Metodos {

  // Exemplo:

  // public int somar(int 1, int 2){}
  // abrirConexao(){}
  // findById(int id){}

  // retorna valor "return"
  public double somando(int num1, int num2) {
    // logica - finalidade do metodo
    return somando(num1, num2);
  }

  // Não retorna valor
  public void imprimir(String texto) {
    // logica - finalidade do metodo
    // aqui não precisa do return
    // pois nao sera retornado nenhum resultado
  }

  // disparando uma possivel excessão: Lança exceção pois nao tem como dividir
  // numero por zero
  public double dividir(int dividendo, int divisor) throws Exception {
    double divida = dividendo / divisor;
    return divida;
  }

  // metodo privado:
  private void metodoPrivado() {
  }

  public static void main(String[] args) {

  }
}
