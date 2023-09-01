package SolucionSinPatron;

public class RickVaquero extends Rick implements Teletransportarse, LlamarMorty {
    @Override
    public void llamarMorty() {
        System.out.println("Ven acá, Morty!");
    }

    @Override
    public void mostrar() {
        System.out.println("Soy el Rick Vaquero!");
    }

    @Override
    public void teletransportacion(String dimension) {
        System.out.println("Teletransportandose a la dimensión: " + dimension);
    }
}
