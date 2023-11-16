package _p147_TercerExamenParcial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
        datos.add(new Jugador("Juan Perez", 22, 60,"Soltero", "Portero", 'h'));
        datos.add(new Jugador("Mario Jimenez", 18, 45,"Viudo", "Delantero", 'h'));
        datos.add(new Jugador("Carlos Fuentes", 30,45, "Casado", "Defensa", 'h'));
        return datos;
    }
    public static void serializarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
    }
    public static ArrayList<Jugador> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
    ArrayList<Jugador> datos;
    FileInputStream arch = new FileInputStream(archivo);
    ObjectInputStream fpersonas = new ObjectInputStream(arch);
    datos = (ArrayList<Jugador>) fpersonas.readObject();
    fpersonas.close();
    return datos;
    }
}