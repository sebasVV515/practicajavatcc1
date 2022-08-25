package org.example;
import clases.Cliente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        /*Producto producto = new Producto();
        System.out.println("Ingrese el nombre del producto");
        producto.nombre = lea.next();
        System.out.println("El producto es: "+producto.nombre);*/

        Cliente cliente = new Cliente();
        System.out.println("Ingrese el nombre del cliente");
        cliente.nombre = lea.next();
        System.out.println("Ingrese la cedula");
        cliente.cedula = lea.next();
        System.out.println("Ingrese la edad");
        cliente.edad = lea.nextByte();
        System.out.println("Ingrese el celular");
        cliente.celular = lea.next();
        System.out.println("Aplica descuento?");
        cliente.aplicaDescuento = lea.nextBoolean();

    }
}