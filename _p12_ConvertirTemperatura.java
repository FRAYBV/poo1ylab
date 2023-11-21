// Se desea convertir una temperatura de grados fahrenheit a grados celsius, usando la siguiente formula:
// • celsius = (fahrenheit – 32) * (5/9).

import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        double faherenheit, celsius;
        Scanner far = new Scanner(System.in);

        System.out.print("Cantos grados Fahrenheit : ");
        faherenheit = far.nextFloat();

        celsius = (faherenheit - 32) * 5/9;
        System.out.println("En grados celsius es : "+ celsius);
    }
}