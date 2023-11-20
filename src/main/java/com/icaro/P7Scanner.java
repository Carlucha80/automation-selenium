package com.icaro;

import java.util.Scanner;

//ingresar por consola un número, mientras sea menor o igual a 500 y almacenar un número en una//
//lista. Al finalizar ingreso, mostrar los datos y la cantidad ingresada en pantalla.
//también si hubo menos de diez ingresos mostrar "Se ingresaron pocos números" o de lo
//contrario mostrar "Se excedio la cantidad de números"
public class P7Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = scanner.nextInt();
        System.out.println("El número ingresado es  "+ numero);



    }
}
