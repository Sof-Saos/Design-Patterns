import java.util.ArrayList;

public class Clima {
    private double temperatura;
    private double humedad;
    private ArrayList<Observador> observadores;

    public Clima() {
        this.observadores = new ArrayList<>();
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public void registrarObservador(Observador observador){
        if (observadores.add(observador)) {
            System.out.println("Observador " + observador + " agregado correctamente");
        } else {
            System.out.println("El observador " + observador + " no se pudo agregar.");
        }
    }

    public void retirarObservador(Observador observador){
        if (observadores.remove(observador)) {
            System.out.println("Observador " + observador + " retirado correctamente");
        } else {
            System.out.println("El observador " + observador + " no se pudo retirar.");
        }
    }


    public void actualizarClima(double temperatuea, double humedad) {
        this.setTemperatura(temperatuea);
        this.setHumedad(humedad);
        notificar();
    }

    public void notificar() {
        for (Observador observador: observadores) {
            observador.actualizar(this.temperatura, this.humedad);
        }
    }

    public void mostrarObservadores(){
        System.out.println("\u001B[33m" + "Los observadores en la lista son: " + "\u001B[0m");
        for (Observador observador: observadores) {
            System.out.println(observador);
        }
    }
}
