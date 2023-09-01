package SolucionSinPatron;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u001B[32m");
        RickC147 rick1 = new RickC147();
        rick1.mostrar();
        rick1.teletransportacion("Dimensión XYZ");
        rick1.llamarMorty();

        System.out.println();
        System.out.println("-------------------");
        System.out.println();

        RickVaquero rick2 = new RickVaquero();
        rick2.mostrar();
        rick2.teletransportacion("Barbieland");
        rick2.llamarMorty();

        System.out.println();
        System.out.println("-------------------" + "\u001B[31m");
        System.out.println();

        RickSimple rick3 = new RickSimple();
        rick3.mostrar();

        System.out.println();
        System.out.println("-------------------");
        System.out.println();

        RickTonto rick4 = new RickTonto();
        rick4.mostrar();
    }
}
