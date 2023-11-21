// Se desea imprimir los números impares de forma ascendente desde 1 hasta el número que el usuario decida (n).

import java.util.Scanner;

public class _p48_ImparesAscendente {
    public static void main(String[] args) {
        int n,c,s;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Imprime numeros impares ascendente\n");
            System.out.print("Hasta donde ?"); n = obj.nextInt();
            s=0;
            c=(n%2==0 ? --n : n);
            while( c >= 1 ) {
                System.out.printf("%d ",c);
                s += c;
                c -= 2;
            }
            System.out.printf("\nLa suma es %d",s);
            System.out.print("\nDeseas continuar (S/N) ?");  resp = Character.toUpperCase(obj.next().charAt(0));

        } while( resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}