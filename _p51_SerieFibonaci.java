// Se desean imprimir los primeros n números de la será de fibbonaci.

import java.util.Scanner;

public class _p51_SerieFibonaci {
    public static void main(String[] args) {
        int a = 0, b = 1,c,n;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Imprime n numeros de la serie fibonaci ");
            System.out.print("Ingrese el valor maximo: ");n = obj.nextInt();
            for(int i = 0; i < n; i++ ){
                System.out.printf("%d",a);
                c=a+b;
                a = b;
                b=c;
            }while(n !=1);
            System.out.printf("%d",n);
            System.out.print("\nDeseas continuar (S/N) ?"); resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa");
    }
}