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

    public void pararMotor() {
        motorEncendido = false;
        System.out.println("Motor parado");
    }

    public void mover() {
        if (!motorEncendido || combustible <= 0) {
            System.out.println("No se puede mover");
        } else {
            combustible--;
            System.out.println("Moviendo");
        }
    }

}
