// Calcula el área de un círculo 

import java.util.Scanner;

public class _p02_AreaCirculo {
    public static void main(String[] args) {
        double radio, area;
        Scanner lradio = new Scanner(System.in);

        System.out.print("Dame el radio del circulo ? ");
        radio = lradio.nextFloat();

        area = Math.PI * Math.pow(radio,2);

        System.out.println("El circulo de radio " + radio + " tiene un area de " + area);
    }
}