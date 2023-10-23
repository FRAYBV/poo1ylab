package _p113_SegundoExamenParcial;

public abstract class Jugador {
    private String Nombre;
    private String Descripcion;
    private char Sexo;
    private double Salario;
    private double Total;

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public char getSexo() {
        return Sexo;
    }
    public void setSexo(char sexo) {
        Sexo = sexo;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
    public double getTotal() {
        return Total;
    }
    public void setTotat(double total) {
        Total = total;
    }
    public String toString() {
    return String.format("Nombre: %s, Descripcion: %s, Sexo: %s, Salario: %d",Nombre,Descripcion,Sexo,Salario);
    }
}
