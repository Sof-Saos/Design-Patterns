package Problem;

public class RickSimple extends Rick{

    @Override
    public void mostrar() {
        System.out.println("Soy el Rick Simple");
    }

    @Override
    public void teletransportarse(String dimension) {
        System.out.println("No es posible la teletransportación, nunca inventó la teletransportación");
    }
}
