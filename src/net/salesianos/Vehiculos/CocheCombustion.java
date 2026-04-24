package net.salesianos.Vehiculos;

public class CocheCombustion extends Vehiculo {
    
    private boolean motorEncendido;
    private int combustible;

    public CocheCombustion(String color, int puertas, int ruedas, String modelo, String matricula, int combustible) {
        super(color, puertas, ruedas, modelo, matricula);
        this.combustible = combustible;
    }

    public void arrancar() {
        if (combustible > 0) {
            motorEncendido = true;
            combustible--;
            System.out.println("Arrancado");
        } else {
            System.out.println("Sin combustible");
        }
    }
}
