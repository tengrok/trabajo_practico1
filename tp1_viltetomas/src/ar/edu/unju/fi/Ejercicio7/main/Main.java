package ar.edu.unju.fi.Ejercicio7.main;

import java.util.Scanner;
import ar.edu.unju.fi.Ejercicio7.model.Empleado;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese Nombre del Empleado");
        String nombre = scanner.next();
        System.out.println("Ingrese el Legajo");
        int legajo = scanner.nextInt();
        System.out.println("Ingrese el Sueldo");
        float sueldo = scanner.nextFloat();
        
        Empleado empleado = new Empleado(nombre,legajo,sueldo);
        
        System.out.println(empleado);
        empleado.aumentarSalario();
        System.out.println(empleado);
    }

}
