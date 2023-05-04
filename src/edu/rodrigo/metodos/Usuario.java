package edu.rodrigo.metodos;

public class Usuario {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();

    System.out.println("TV ligada ?  " + smartTv.ligada);
    System.out.println("Em qual canal ?? " + smartTv.canal);
    System.out.println("Em qual volume" + smartTv.volume);
    System.out.println(smartTv.cor);

    // SmartTv smartTv2 = new SmartTv();
    smartTv.ligada = true;
    System.out.println("TV ligada ?  " + smartTv.ligada);

    smartTv.desligar();
    System.out.println("A TV esta " + smartTv.ligada);

    smartTv.ligar();
    System.out.println("A TV esta " + smartTv.ligada);

    System.out.println("Qual o volume da SmartTV?? " + smartTv.volume);

    smartTv.donwVol();
    System.out.println("Qual o volume da SmartTV?? " + smartTv.volume);
    smartTv.upVol();
    smartTv.upVol();
    smartTv.upVol();
    System.out.println("Qual o volume da SmartTV?? " + smartTv.volume);
    smartTv.changeChannel(20);
    System.out.println(smartTv.canal);

  }
}
