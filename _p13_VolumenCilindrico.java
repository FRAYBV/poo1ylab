// Se desea calcular el volumen de un cilindro dado su radio y altura, usando la siguiente formula:
// • volumen = PI * (radio * radio) * altura

import java.util.Scanner;

public class _p13_VolumenCilindrico {
    public static void main(String[] args) {
        double radio, altura, volumen;
        Scanner rad = new Scanner(System.in);
        Scanner al = new Scanner(System.in);

        System.out.print("Dame el radio : ");
        radio = rad.nextFloat();
        System.out.print("Dame la altura :");
        altura = al.nextFloat();

        volumen = (Math.PI*(radio * radio)) * altura;
        System.out.println("El volumen del cilindro es "+volumen);
    }
}