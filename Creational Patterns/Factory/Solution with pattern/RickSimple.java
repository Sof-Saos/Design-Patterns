package SolucionPatron;

public class RickSimple extends Rick{
    public RickSimple(){
        comportamientoLlamarMorty = new SinMorty();
        comportamientoTeletransportacion = new NoTeletransportable();
    }
    @Override
    public void mostrar() {
        System.out.println("Soy el Rick Simple!");
    }
}
