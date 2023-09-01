package SolucionSinPatron;

public class RickC147 extends Rick implements Teletransportarse, LlamarMorty{
    @Override
    public void mostrar() {
        System.out.println("Soy el Rick C147!");
    }

    @Override
    public void teletransportacion(String dimension) {
        System.out.println("Teletransportandose a la dimensión: " + dimension);
    }

    @Override
    public void llamarMorty() {
        System.out.println("Ven acá, Morty!");
    }
}
