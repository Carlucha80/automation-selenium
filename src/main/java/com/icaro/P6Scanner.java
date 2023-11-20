package com.icaro;

import java.util.Scanner;

public class P6Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un número entero");
        int numeroentero = scanner.nextInt();

        System.out.println("Ingresar una cadena de texto");
        String cadena = scanner.next();

        System.out.println("Ingresar un número decimal");
        float decimal = scanner.nextFloat();

        System.out.println("El número entero ingresado es " + numeroentero);
        System.out.println("La cadena de texto ingresada es " + cadena);
        System.out.println("El número decimal ingresado es " + decimal);

        scanner.close();

    }
}
