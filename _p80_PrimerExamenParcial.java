// Control de inscripción de los participantes y el dinero recaudado

import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void main(String[] args) {
    char op;
    int tA, tD, tT, tH, tM, tAll, n;
    double tmA, tmD, tmT, tmGral, tAge;
    float ok, suma, cost1, cost2, cost3;
    Scanner obj = new Scanner(System.in);
          tA = 0;
          tD = 0;
          tT = 0;
          tH = 0;
          tM = 0;
          tAll = 0;
          tmA = 0;
          tmD = 0;
          tmT = 0;
          tmGral = 0;
          tAge = 0;
          cost1 = 50;
          cost2 = 80;
          cost3 = 60;
          
          System.out.print("\033[H\033[2J"); System.out.flush();
          System.out.println("Ingresa el tipo de inscripción: ");
          System.out.println("[A]lumno");
          System.out.println("[D]ocente");
          System.out.println("[T]rabajador");
          System.out.print("Elije una opcion ? "); op = obj.next().charAt(0);
          op = Character.toUpperCase(op);

          if ( op=='A') {
            System.out.print("Alumnos a inscribir: "); tA = obj.nextInt();
            System.out.println("\nInscripción Alumno\n");
            System.out.print("Nombre: ", tA);
            tA = obj.nextInt();
            obj.nextLine();
            int nombre = obj.nextInt();
            
            System.out.print("Edad/es:");
            age = obj.nextInt();
            obj.nextLine();
            while ( age >= 18);
          }
          
          System.out.println("\nGracias por utilizar este programa");
    }
}