package _p120_Vehiculo;

public class Maquina {
    private String Nombre;
    public Maquina(String nombre){
        Nombre = nombre;
    }
    public String getNombre() {
        return Nombre;
    }    
    public void repostar() {
        System.out.println("Repostando...");
    }
    public void arrancar() {
        System.out.println("Arrancando ...");
    }
    public void frenar() {
        System.out.println("Frenando...");
    }
}