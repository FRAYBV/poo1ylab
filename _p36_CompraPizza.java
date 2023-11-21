// Diseñe un programa que permita procesar la solicitud e imprimir: tamaño de la compra, cantidad comprada, total compra, descuento, total de compra con descuento.

import java.util.Scanner;

public class _p36_CompraPizza {
    public static void main(String[] args) {
        int tamaño, cantidad;
        float descuento=0, total, des, precio=0;
        String salida="";
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Bienvenido Seleccione el tamaño de su pizza");
        System.out.println("1- chica $5");
        System.out.println("2- Mediana $10");
        System.out.println("3- Grande $20");
        System.out.print("Elige Opcion ? "); tamaño = obj.nextInt();
        System.out.print("Cuantas pizzas son en total ? ");
        cantidad = obj.nextInt();

        switch (tamaño){
            case 1 : precio = 5; break;
            case 2 : precio = 10; break;
            case 3 : precio = 20; break;
            default: System.out.println("Opcion Invalida "); break;

        }

        total = precio * cantidad;
        descuento = total * 0.15f;
        des = total - descuento;

        if (total > 2000){
            System.out.println("Tamaño de la compra "+  tamaño + "Cantidad comprada "+ cantidad +" Total compra "+ total + "Descuento "+ descuento +" Total con descuento "+ des);

        }
        else
        System.out.println("Tamaño de la compra " + tamaño + " Cantidad comprada "+ cantidad + " total compra " + total);

    }
}