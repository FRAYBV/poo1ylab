// Dado un número entero entre 1 y 6 que corresponde a un continente del mundo, escribir su nombre: 1 Asia, 2 África, 3 América del Norte, 4 América del Sur, 5 Antártida, 6 Europa. Si el número no está en el rango especificado, mostrar un mensaje de error.

import java.util.Scanner;

public class _p35_ContinentesMundo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Dado un numero entre 1 y 6 imprime un continente del mundo\n");
        System.out.print("Dame un numero ");
        int continente = new Scanner(System.in).nextInt();
        switch (continente){
            case 1 : System.out.println("Asia");break;
            case 2 : System.out.println("África");break;
            case 3 : System.out.println("America del norte");break;
            case 4 : System.out.println("America del sur ");break;
            case 5 : System.out.println("Antartida");break;
            case 6 : System.out.println("Europa");break;
            default : System.out.println("Numero no valido ");break;

        }
        System.out.println("\n\nProceso terminado ...");
    }
}