
public class Main {
    public static void main(String[] args) {
        Clima clima = new Clima();
        DispositivoMovil movil1 = new DispositivoMovil("Movil 1");
        DispositivoMovil movil2 = new DispositivoMovil("Movil 2");
        DispositivoMovil movil3 = new DispositivoMovil("Movil 3");

        System.out.println("\u001B[32m" + "Actualizando clima sin observadores." + "\u001B[0m");
        clima.actualizarClima(20, 50);

        System.out.println();
        System.out.println("\u001B[32m" + "Agregando observadores " + "\u001B[0m");
        clima.registrarObservador(movil1);
        clima.registrarObservador(movil2);
        clima.mostrarObservadores();
        System.out.println();
        System.out.println("----------------------");

        System.out.println();
        System.out.println("\u001B[32m" + "Actualizando clima con observadores. " + "\u001B[0m");
        clima.actualizarClima(20,40);
        System.out.println();

        System.out.println("\u001B[32m" + "Retirando observadores" + "\u001B[0m");
        System.out.print("Retirando observador que no esta en la lista: ");
        clima.retirarObservador(movil3);
        System.out.print("Retirando observador que si esta en la lista: ");
        clima.retirarObservador(movil2);
        clima.mostrarObservadores();
    }
}
