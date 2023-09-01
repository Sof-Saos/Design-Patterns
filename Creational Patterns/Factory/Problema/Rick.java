package SolucionSinPatron;

public abstract class Rick { //Nos aseguramos que nadie la pueda instanciar, haciendola abstracta
    public abstract void mostrar(); //esta clase debería ser abstracta dado que ese metodo no se implementa
    public void teletransportarse(String dimension){ System.out.println("Teletransportandose a la dimensión: " + dimension); }
    public void llamarMorty(){ System.out.println("Hey Morty, ven acá!"); }

}
