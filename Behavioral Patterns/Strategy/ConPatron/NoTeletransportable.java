package SolucionPatron;
public class NoTeletransportable implements ComportamientoTeletransportacion {
    @Override
    public void teletransportar(String dimension) {
        System.out.println("No es posible teletransportarse");
    }
}
