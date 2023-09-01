public class DispositivoMovil implements Observador{
    private String nombre;

    public DispositivoMovil(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(double temperatura, double humedad) {
        System.out.println("Actualizando clima desde dispositivo móvil " + nombre + " C, a temperatura: " + temperatura + ", y una humedad de: " + humedad + "%.");
    }

    @Override
    public String toString() {
        return "DispositivoMovil{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
