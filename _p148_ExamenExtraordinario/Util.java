package _p148_ExamenExtraordinario;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Producto> inicializarDatos() {
        ArrayList<Producto> datos = new ArrayList<>();
        datos.add(new Producto("Efectivo", 101, 1,"ml", "Agua", '15'));
        datos.add(new Producto("Efectivo", 223, 1,"ml", "Soda", '22'));
        datos.add(new Producto("Efectivo", 310, 1, "ml", "Jugo", '20'));
        return datos;
    }
    public static void serializarDatos(String archivo, ArrayList<Producto> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
    }
    public static ArrayList<Producto> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
    ArrayList<Producto> datos;
    FileInputStream arch = new FileInputStream(archivo);
    ObjectInputStream fpersonas = new ObjectInputStream(arch);
    datos = (ArrayList<Producto>) fpersonas.readObject();
    fpersonas.close();
    return datos;
    }
}