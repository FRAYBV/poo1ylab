package _p148_ExamenExtraordinario;

import java.io.Serializable;

public class Producto implements Serializable {
    String TipoPago;
    int Clave;
    float Cantidad;
    String UnidadMedida;
    String Descripcion;
    float Precio;

    public Producto() {}
    public Producto(String tipopago, int clave, float cantidad, String unidadmedida, String descripcion, float precio) {
        TipoPago = tipopago;
        Clave = clave;
        Cantidad = cantidad;
        UnidadMedida = unidadmedida;
        Descripcion = descripcion;
        Precio = precio;
    }
    public String getTipoPago() {
        return  TipoPago;
    }
    public void setTipoPago(String tipopago) {
        TipoPago = tipopago;
    }
    public int getClave() {
        return Clave;
    }
    public void setClave(int clave) {
        Clave = clave;
    }
    public float getCantidad() {
        return Cantidad;
    }
    public void setSalario(float cantidad) {
        Cantidad = cantidad;
    }
    public String getUnidadMedida() {
        return UnidadMedida;
    }
    public void setUnidadMedida(String unidadmedida) {
        UnidadMedida = unidadmedida;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public float getPrecio() {
        return Precio;
    }
    public void setPrecio(float precio) {
        Precio = precio;
    }
}