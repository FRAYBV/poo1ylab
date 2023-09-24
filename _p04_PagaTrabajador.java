// Dado el nombre de un trabajador las horas trabajadas, paga por hora y tasa de impuesto 

import java.util.Scanner;

public class _p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        float paga, pagabruta, tasa, impuesto, paganeta;
        Scanner obj = new Scanner(System.in);
        // Entrada
        System.out.print("Nombre           : "); nombre = obj.nextLine();
        System.out.print("Horas Trabajadas : "); horas = obj.nextInt();
        System.out.print("Paga por hora    : "); paga = obj.nextFloat();
        tasa = 0.3f;
        // Calculo
        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;
        // Salida
        System.out.println("Resumen de pagos\n");
        System.out.println(String.format("El trabajador %s, trabajo %d horas, con una paga de %.2f pesos la hora, se asume una tasa de impuesto de %.2f",nombre,horas,paga,tasa));
        System.out.println(String.format("Paga bruta: %.2f", pagabruta));
        System.out.println(String.format("Impuesto  : %.2f", impuesto));
        System.out.println(String.format("Paga neta : %.2f", paganeta));
    }
}
