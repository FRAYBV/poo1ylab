// Dado el nombre del estudiante, sexo (h/m), su edad y tres calificaciones, decidir si el estudiante es aceptado. La Universidad Kitty Kat SA es solo para mujeres mayores de 21 años con un promedio de entre 8 y 9.5.

import java.util.Scanner;

public class _p38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        String nombre;
        int edad;
        float c1, c2, c3, promedio, f, m;
        char op;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Proceso de acceptacion Universidad Kitty Kat SA");
        System.out.print("Dame tu nombre "); nombre = obj.nextLine();
        System.out.println("Cual es tu Sexo ? ");
        System.out.println("[F]emenino");
        System.out.println("[M]asculino");
        op = Character.toUpperCase(obj.next().charAt(0));

        if (op == 'M'){
            System.out.println("\nEsta es una escuela solo para mujeres ");

        }else if (op == 'F')
        System.out.println("Cual es su edad ?");
        edad = obj.nextInt();

        if ( edad > 21){
            System.out.println("Eres mayor de edad, continuemos");
            System.out.println("Dame las tres calificaciones separadas por enter:");
            c1 = obj.nextFloat();
            c2 = obj.nextFloat();
            c3 = obj.nextFloat();

            promedio = (c1 + c2 +c3)/3;

            if ( c1 >= 8 && c2 >= 8 && c3 >=8)
            System.out.printf("\nBienvenida "+ nombre +" Tu promedio es de " + promedio);
            else
            System.out.println("Solo aceptamos estudiantes con calificaciones de 8 en adelante");

        }else
        System.out.println("Solo aceptamos estudiantes mayores de edad");

        System.out.println("\nProceso terminado ...");
    }
}