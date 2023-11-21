// Diseña un programa con dos funciones una que convierta pulgadas a centímetros y otra que convierta de metros a pies.

import java.util.Scanner;

public class _p77_MedidasLongitud {
    public static float Pulcen(float num){
        float cen=0;
        cen = num * 2.54f;
        return cen;
    }
    public static float Metpie(float num){
        float pie=0;
        pie = num * 3.281f;
        return pie;
    }
    public static void main(String[] args) {
        int op;
        float temp,res;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("[1] Centimetros\n[2] Pies\nElige ?"); op = obj.nextInt();

        if(op == 1){
            System.out.print("Dame las pulgadas a convertir ? "); temp = obj.nextFloat();
            res = Pulcen(temp);
            System.out.printf("\n%.2f Pulgadas equivale a %.2f Centimetros ...", temp,res);
        }
        else if(op == 2){
            System.out.print("Dame los metros a convertir ? "); temp = obj.nextFloat();
            res = Metpie(temp);
            System.out.printf("\n%.2f metros equivale a %.2f Pies ...", temp, res);
        }
        else System.out.println("Opcion invalida");
    }
}