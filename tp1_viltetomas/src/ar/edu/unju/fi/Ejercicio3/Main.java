package ar.edu.unju.fi.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num = scaner.nextInt();
        if (num % 2 == 0) {
            int par = num * num * num;
            System.out.println(par);
        }
        else {
            int impar = num * num;
            System.out.println(impar);
        }

    }
}


    