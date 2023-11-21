// Dados tres números enteros, verificar cual es el mayor.

import java.util.Scanner;

public class _p34_NumeroMayor {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println(" Verificar el numero mayor\n");
        System.out.print("Dame el primer numero  ? "); num1 = obj.nextInt();
        System.out.print("Dame el segundo numero ? "); num2 = obj.nextInt();
        System.out.print("Dame el tercer numero ? "); num3 = obj.nextInt();

        if (num1 > num2 && num1 > num3)
        System.out.printf("El numero mayor es "+ num1);
        if (num2 > num1 && num2 > num3)
        System.out.printf("El numero mayor es "+ num2);
        if (num3 > num2 && num3 > num2)
        System.out.printf("El numero mayor es "+num3); 
    }
}