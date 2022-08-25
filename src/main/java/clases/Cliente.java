package clases;

public class Cliente {
    public String nombre;
    public String cedula;
    public int edad;
    public String celular;
    public boolean aplicaDescuento;

    public Cliente(String sebas, String cedula, int edad, String celular, boolean aplicaDescuento) {
    }

    public Cliente(String nombre, String cedula, byte edad, String celular, boolean aplicaDescuento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.celular = celular;
        this.aplicaDescuento = aplicaDescuento;
    }

    public String saludar(){
        return "oe";
    }
}
