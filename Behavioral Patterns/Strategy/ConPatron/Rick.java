package SolucionPatron;

public abstract class Rick {
    public ComportamientoTeletransportacion comportamientoTeletransportacion;
    public ComportamientoLlamarMorty comportamientoLlamarMorty;

    public abstract void mostrar();
    public void ejecutarteletransportar(String dimension) {
        comportamientoTeletransportacion.teletransportar(dimension);
    }
    public void ejecutarllamarMorty(){
        comportamientoLlamarMorty.llamarMorty();
    }

    public void setComportamientoTeletransportacion(ComportamientoTeletransportacion comportamientoTeletransportacion) {
        this.comportamientoTeletransportacion = comportamientoTeletransportacion;
    }

    public void setComportamientoLlamarMorty(ComportamientoLlamarMorty comportamientoLlamarMorty) {
        this.comportamientoLlamarMorty = comportamientoLlamarMorty;
    }
}
