//Se desea calcular la hipotenusa de un triángulo rectángulo dadas las longitudes de sus lados, usando la siguiente fórmula:
// • hipotenusa = raizcuadrada(longitudLado1 * longitudLado1 + longitudLado2 * longitudLado2)

import java.util.Scanner;

public class _p10_HipotenusaTriangulo{
    public static void main(String[] args) {
        double lado1, lado2, hipotenusa;
        Scanner hip = new Scanner(System.in);

        System.out.println("Primera longitud :");
        lado1 = hip.nextFloat();
        System.out.println("Segunda Longitud : ");
        lado2 = hip.nextFloat();

        hipotenusa = Math.sqrt((lado1*lado1)+(lado2*lado2));
        System.out.println("La hipotenusa es "+ hipotenusa);
    }
}