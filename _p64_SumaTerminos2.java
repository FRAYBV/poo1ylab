// Se desea imprimir la secuencia de términos, el número de renglones que el usuario desee y su suma:

import java.util.Scanner;

public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
        int i,j,n,f,x,suma;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Cuantos terminos ? "); n = obj.nextInt();
            f= 1; x = 1; suma = 0;
            for (i = 1; i <= n; i++) {
                for (j = 1; j <=i; j++) {
                    System.out.print(f);
                }
                System.out.print("+");
                suma += x;
                x = 1 + (x * 10);
            }
            System.out.printf("\nLa suma es: %d", suma);
            System.out.print("\nDesea continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("Proceso terminado...");
    }
}