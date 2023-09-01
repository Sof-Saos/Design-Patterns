package SolucionPatron;

public class RickC147 extends Rick{
    public RickC147(){
        comportamientoTeletransportacion = new Teletransportable();
        comportamientoLlamarMorty = new ConMorty();
    }

    @Override
    public void mostrar() {
        System.out.println("Soy el Rick C147!");
    }
}
