// Se desea calcular el 3er angulo de un triangulo dados los dos primeros angulos del mismo, usando la siguiente fórmula:

// • angulo3 = 180-(angulo1 + angulo2)
import java.util.Scanner;

public class _p11_CalcularAngulo {
    public static void main(String[] args) {
        double angulo1, angulo2, angulo3;
        Scanner ang = new Scanner(System.in);

        System.out.println("Dame el primer angulo :");
        angulo1 = ang.nextFloat();
        System.out.println("Dame el segundo angulo :");
        angulo2 = ang.nextFloat();

        angulo3 = 180 - (angulo1 + angulo2);
        System.out.println("El tercer angulo es "+ angulo3);
    }
}