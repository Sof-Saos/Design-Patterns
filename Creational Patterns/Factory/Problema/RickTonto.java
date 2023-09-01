package SolucionSinPatron;

public class RickTonto extends Rick{

    @Override
    public void mostrar() {
        System.out.println("Soy el Rick Tonto");
    }

    @Override
    public void teletransportarse(String dimension) {
        System.out.println("No es posible la teletransportación, nunca inventó la teletransportación");
    }

    @Override
    public void llamarMorty() {
        System.out.println("No es posible llamar a Morty pues no tiene nietos.");
    }
}
