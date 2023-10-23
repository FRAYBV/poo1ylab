import java.util.Scanner;

public class _p91_MayoresPromedio {
    public static void main(String[] args) {
        float n, suma=0, promedio=0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Cuantas calificaciones: "); n = obj.nextFloat();
        
        float[] nums = new float[(int) n];

        for (int i=0; i < nums.length; i++ ) {

            System.out.printf("\nCalificacion %d ", i+1);
            nums[i] = obj.nextFloat();
        }
        System.out.print("\nLas calificaciones son:\n" );
        for (float sum : nums) {
            System.out.printf("%.2f ", sum);
            suma = suma + sum;
            
        }
        promedio = suma/nums.length;
        System.out.printf("\nSuma de calificaciones:  %.2f", suma);
        System.out.printf("\nPromedio de calificaciones: %.2f", promedio);
        
        int MayoresProm=0;
        System.out.print("\nCalificaciones mayores al promedio son: ");
        for (float su : nums){
            if (su > promedio) {
                System.out.printf("\n%.2f",su); MayoresProm++;


            }
        }
System.out.printf("\nTotal de calificaciones mayores %d ", MayoresProm );
    }

}