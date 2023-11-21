// Diseña un programa con una función que pida un número entero entre 1 y 7 y devuelva el día de la semana con letra.

import java.util.Scanner;

public class _p76_DiaSemana {
    public static int Semana(int n){
        int dia = new Scanner(System.in).nextInt();

        switch (dia) {
            case 1 : System.out.println("Lunes");break;
            case 2 : System.out.println("Martes");break;
            case 3 : System.out.println("Miercoles");break;
            case 4 : System.out.println("Jueves");break;
            case 5 : System.out.println("Viernes");break;
            case 6 : System.out.println("Sabado");break;
            case 7 : System.out.println("Domingo");break;
            default : System.out.println("Dia invalido");break;
        }
        return dia;
    }
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Dame un numero "); n = obj.nextInt();

        System.out.printf("\nEl dia de la semana es %d",Semana(n));
    }
}