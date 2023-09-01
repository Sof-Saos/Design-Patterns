package SolucionPatron;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u001B[31m");
        Rick rick1 = new RickSimple();
        rick1.mostrar();
        rick1.ejecutarllamarMorty();
        rick1.ejecutarteletransportar("T-432");

        System.out.println();
        System.out.println("-------------------");
        System.out.println();

        Rick rick2 = new RickTonto();
        rick2.mostrar();
        rick2.ejecutarllamarMorty();
        rick2.ejecutarteletransportar("UI-323");

        System.out.println();
        System.out.println("-------------------");
        System.out.println();

        System.out.println("\u001B[32m");
        Rick rick3 = new RickVaquero();
        rick3.mostrar();
        rick3.ejecutarllamarMorty();
        rick3.ejecutarteletransportar("QW-232");

    }
}
