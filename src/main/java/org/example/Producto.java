package org.example;

public class Producto {
    String nombre;
    int precioUnitario;
    String descripcion;

    public Producto() {
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public Producto(String nombre, int precioUnitario, String descripcion) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
    }

    public double calcularIva(){
        return 0.0;
    }
}
