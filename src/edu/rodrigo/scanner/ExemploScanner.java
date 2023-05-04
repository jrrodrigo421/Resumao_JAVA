package edu.rodrigo.scanner;

import java.util.Locale;
import java.util.Scanner;

// import edu.rodrigo.metodos.SmartTv;

public class ExemploScanner {
  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu nome: ");
    // String nome = scanner.next();
    String nome = scanner.nextLine();
    System.out.println("Seu nome é " + nome);

  }
}
