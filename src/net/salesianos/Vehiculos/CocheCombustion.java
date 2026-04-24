package net.salesianos.Vehiculos;

public class CocheCombustion extends Vehiculo {
    
    private boolean motorEncendido;
    private int combustible;

    public CocheCombustion(String color, int puertas, int ruedas, String modelo, String matricula, int combustible) {
        super(color, puertas, ruedas, modelo, matricula);
        this.combustible = combustible;
    }
    
}
