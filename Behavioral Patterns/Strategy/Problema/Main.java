package Problem;

public class Main {
    public static void main(String[] args) {
        Rick rick1 = new RickC137();
        System.out.println("\u001B[32m");
        rick1.mostrar();
        rick1.llamarMorty();
        rick1.teletransportarse("T-452");

        System.out.println("--------------");
        Rick rick2 = new RickVaquero();
        rick2.mostrar();
        rick2.llamarMorty();
        rick2.teletransportarse("Box Dimension");

        System.out.println("\u001B[31m" + "--------------");
        Rick rick3 = new RickSimple();
        rick3.mostrar();
        rick3.llamarMorty();
        rick3.teletransportarse("Barbieland");

        System.out.println("--------------");
        Rick rick4 = new RickTonto();
        rick4.mostrar();
        rick4.llamarMorty();
        rick4.teletransportarse("R-234");
    }
}
