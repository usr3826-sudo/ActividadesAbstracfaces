import java.util.Scanner;
import net.salesianos.FigurasGeo.Circulo;
import net.salesianos.FigurasGeo.Rectangulo;
import net.salesianos.Vehiculos.CocheCombustion;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Base:");
        double base = sc.nextDouble();

        System.out.println("Altura:");
        double altura = sc.nextDouble();

        Rectangulo r = new Rectangulo(base, altura);

        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro: " + r.calcularPerimetro());

        System.out.println("Radio:");
        double radio = sc.nextDouble();

        Circulo c = new Circulo();

        System.out.println("Area: " + c.calcularArea());
        System.out.println("Perimetro: " + c.calcularPerimetro());

      
        CocheCombustion coche = new CocheCombustion(
                "Rojo", 5, 4, "Seat", "1234ABC", 20);

        coche.mover();
        coche.arrancar();
        coche.mover();
    }
}