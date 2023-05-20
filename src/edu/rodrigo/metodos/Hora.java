package edu.rodrigo.metodos;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;

public class Hora {
  public static String informar_momento() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Olá, que Horas são ? ");
    // int hora = scan.nextLine();
    int horario = scan.nextInt();

    // horário atual
    int hora = LocalTime.now().getHour();
    horario = hora;
    if (7 <= horario && horario <= 12) {
      return "ddd";
    }
    if (13 <= horario && horario <= 18) {
      return "Fundamental";
    }
    return "horário inválido";

  }
}
