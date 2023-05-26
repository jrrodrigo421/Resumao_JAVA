package edu.rodrigo.POO;

public  class Classe1 {

    public static void main(String[] args) {
        Carro carro1 = new Carro();

        //downcast
        Veiculo honda = (Veiculo) new Conssessonaria();

        //upcast
        Conssessonaria daniloAutomoveis = new Veiculo();

        carro1.setCor("Vermelho");
        carro1.setModelo("Punto TOP");
        carro1.setCapacidadeTanque(120);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(15.35));

        Carro carro2 = new Carro("Perola", "Puntao", 125);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(12));
        System.out.println(carro2.totalValorTanque(12));
    }


}

