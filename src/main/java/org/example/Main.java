package org.example;
import clases.Cliente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Producto producto = new Producto("Atun",5000,"Lata de Atun");
        System.out.println("Nombre: "+producto.nombre);
        System.out.println("Precio: "+producto.precioUnitario);
        System.out.println("Descripcion: "+producto.descripcion);
        Cliente cliente = new Cliente("Sebas","12354",15,"56411",true);
    }
}