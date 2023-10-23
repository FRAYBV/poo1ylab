package _p108_Vehiculo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("CP0100010122,", "Ford", 2023, 125345.22);
        Vehiculo v2 = new Vehiculo("CP1000145555,", "Nissan", 2010, 54500.33);
        Vehiculo v3 = new Vehiculo("CA104014544,", "Dina", 2008, 234567.15);
        Vehiculo v4 = new Vehiculo("CA774814599,", "Hongyan", 2023, 934577.98);
        
        Compacto c1 = new Compacto(v1, 4, 2);
        Compacto c2 = new Compacto(v2, 6, 4);
        Camioneta t1 = new Camioneta(v3, 450.0, 4);
        Camioneta t2 = new Camioneta(v4, 1200, 6);

        System.out.println("Datos de los ");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(t2);
        System.out.println(t2);

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(v1);
        vehiculos.add(v2);
        vehiculos.add(v3);
        vehiculos.add(v4);

        double total = 0;
        System.out.println("\nCalculando el total de precio de todos los vehiculos");
        for(Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.getPrecio());
            total += vehiculo.getPrecio();
        }
        System.out.println("La suma de los precios es: " + total);

    }
}