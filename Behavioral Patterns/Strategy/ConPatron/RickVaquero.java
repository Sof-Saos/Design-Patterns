package SolucionPatron;

public class RickVaquero extends Rick{
    public RickVaquero() {
        comportamientoTeletransportacion = new Teletransportable();
        comportamientoLlamarMorty = new ConMorty();
    }

    @Override
    public void mostrar() {
        System.out.println("Soy el Rick vaquero!");
    }
}
