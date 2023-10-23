package _p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo extends Jugador {
    private String Nombre;
    private char Liga;
    private String Jugadores;
    public Jugador() {};
    private ArrayList<Jugador> jugadores;
    public Equipo() {
        jugadores = new ArrayList<>();
    }
    public Jugador(String nombre,char liga,String Jugadores) {
        this.Nombre = nombre;
        this.Liga = liga;
        this.Jugadores = jugadores;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public char getLiga() {
        return Liga;
    }
    public void setLiga(char liga) {
        Liga = liga;
    }
    public String getJugadores() {
    return Jugadores;
    }
    public void setJugadores (String jugadores) {
        Jugadores = jugadores;
    }
    public String toString() {
    return String.format("Nombre: %s, Liga: %d, Jugadores: %d",Nombre,Liga,Jugadores);
    }
}
