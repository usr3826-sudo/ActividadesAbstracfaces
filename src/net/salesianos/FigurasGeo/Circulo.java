package net.salesianos.FigurasGeo;

public class Circulo implements CalculoGeo {

    private double radio;

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

}