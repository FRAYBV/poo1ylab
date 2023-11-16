package _p147_TercerExamenParcial;

import java.io.Serializable;

public class Jugador implements Serializable {
    String Nombre;
    int Edad;
    double Salario;
    String EstadoCivil;
    String Descripcion;
    char Sexo;

    public Jugador() {}
    public Jugador(String nombre, int edad, double salario, String estadocivil, String descripcion, char sexo) {
        Nombre = nombre;
        Edad = edad;
        Salario = salario;
        EstadoCivil = estadocivil;
        Descripcion = descripcion;
        Sexo = sexo;
    }
    public String getNombre() {
        return  Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
    public String getEstadoCivil() {
        return EstadoCivil;
    }
    public void setEstadoCivil(String estadocivil) {
        EstadoCivil = estadocivil;
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
}