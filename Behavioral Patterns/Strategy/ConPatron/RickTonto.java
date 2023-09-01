package SolucionPatron;

public class RickTonto extends Rick{
    public RickTonto() {
        comportamientoLlamarMorty = new SinMorty();
        comportamientoTeletransportacion = new NoTeletransportable();
    }

    @Override
    public void mostrar() {
        System.out.println("Soy el Rick Tonto!");
    }
}
