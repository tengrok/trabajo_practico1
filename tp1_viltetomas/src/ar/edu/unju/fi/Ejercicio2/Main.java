package ar.edu.unju.fi.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Datos info = new Datos("Argentina", 23, 1.70f,
        1.000f, 388, 0.5f);
        System.out.println("Pais: "+info.getPais());
        System.out.println("Edad: "+info.getEdad());
        System.out.println("Altura: "+info.getAltura());
        System.out.println("Precio: "+info.getPrecio());
        System.out.println("Telefono: "+info.getTelefono());
        System.out.println("Coseno: "+info.getCoseno());
    }

}