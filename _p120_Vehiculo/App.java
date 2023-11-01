package _p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        Sedan sedan = new Sedan("Vochito");
        System.out.println("Maquina [Nombre = "+ sedan.getNombre() + ", Propietrio = Maria Diaz, Pasajeros = 4]");
        sedan.sistemaElectrico();
        sedan.combustionInterna();
        sedan.carroceriaTres();
        sedan.chasisMonocasco();
        sedan.repostar();
        sedan.arrancar();
        sedan.frenar();
        System.out.println();

        Suv suv = new Suv("La mamalona");
        System.out.println("Maquina [Nombre = "+ suv.getNombre() + ", Propietario = Chiwis, Pasajeros= 6]");
        suv.sistemaElectrico();
        suv.combustionInterna();
        suv.traccion4x4();
        suv.chasisIndependiente();
        suv.repostar();
        suv.frenar();
        suv.frenar();
        System.out.println();
    }
}