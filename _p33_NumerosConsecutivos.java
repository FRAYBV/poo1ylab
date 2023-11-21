// Dados tres números enteros, verificar si son consecutivos (9,10,11) y mandar mensaje confirmándolo, si no lo son (1,4,6) mandar mensaje de error.

import java.util.Scanner;

public class _p33_NumerosConsecutivos {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Verificar si tres numeros son consecutivos\n");
        System.out.print("Dame el primer numero ? "); num1 = obj.nextInt();
        System.out.print("Dame el segundo numero ? "); num2 = obj.nextInt();
        System.out.print("Dame el tercer numero ? "); num3 = obj.nextInt();

        if (num2-1 == num1 && num2+1 ==num3)
        System.out.println("\nSon consecutivos ");
        else
        System.out.println("\nNo son consecutivos");
        System.out.println("\nFin del programa");

    }
}