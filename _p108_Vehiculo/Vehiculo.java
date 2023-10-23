package _p108_Vehiculo;

public class Vehiculo {
    protected String Serie;
    protected String Marca;
    protected int Year;
    protected double Precio;

    public Vehiculo() {
    }

    public Vehiculo(String serie, String marca, int year, double precio) {
        Serie = serie;
        Marca = marca;
        Year = year;
        Precio = precio;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String serie) {
        Serie = serie;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo [Serie=" + Serie + ", Marca=" + Marca + ", Year=" + Year + ", Precio=" + Precio + "]";
    }
}