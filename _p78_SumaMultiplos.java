// Diseña un programa con una función que reciba tres parámetros: dos números que corresponden a un rango (ini, fin), otro número constante que es 3 o 4 regrese la suma de números múltiplos de 3 o múltiplos de 4 en el rango de números especificados.

import java.util.Scanner;

public class _p78_SumaMultiplos {
    public static int SumaMultiplo(int ini, int fin, int cons){
        int s=0;
        for(int i=ini; i<= fin ;i++)
        if (s % cons==0){
            s+=i;
        }
        return s;
    }
    public static boolean Rango(int ini, int fin){
        return ini < fin;
    }
    public static void main(String[] args) {
        int ini, fin, cons;
        Scanner obj =new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Valor inicial: "); ini = obj.nextInt();
        System.out.print("Valor Final: "); fin = obj.nextInt();
        System.out.print("3 o 4 ?"); cons = obj.nextInt();
        if(Rango(ini, fin)){
            int suma = SumaMultiplo(ini, fin, cons);
            System.out.println("La suma de los multiplos de "+ cons +" en el rango ("+ ini +","+fin +")es: " + suma);

        }else {
            System.out.println("Rango no valido ...");

        }
    }
}