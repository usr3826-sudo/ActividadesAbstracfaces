package net.salesianos.Vehiculos;

public abstract class Vehiculo {
    
    protected String color;
    protected int puertas;
    protected int ruedas;
    protected String modelo;
    protected String matricula;

    public Vehiculo(String color, int puertas, int ruedas, String modelo, String matricula) {
        this.color = color;
        this.puertas = puertas;
        this.ruedas = ruedas;
        this.modelo = modelo;
        this.matricula = matricula;
    }
    
    public abstract void arrancar();
    public abstract void pararMotor();
    public abstract void mover();
}