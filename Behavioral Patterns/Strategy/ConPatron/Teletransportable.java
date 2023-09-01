package SolucionPatron;
public class Teletransportable implements ComportamientoTeletransportacion{
    @Override
    public void teletransportar(String dimension) {
        System.out.println("Teletransportandose a la dimension " + dimension);
    }
}
