// Se desea imprimir la secuencia de números mostrados el número de renglones que el usuario desee:

import java.util.Scanner;

public class _p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        int i,j,n;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Cuantos renglones ? "); n = obj.nextInt();
            for(i=1; i<=n; i++){
                for(j=1; j<=i; j++);{
                    System.out.print(j);

                }
               System.out.println();
            }
            System.out.print("\nDeseas continuar (S/N) ? ");
            resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');
        System.out.println("\nProceso terminado ...");
    }
}