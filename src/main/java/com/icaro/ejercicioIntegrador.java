package com.icaro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicioIntegrador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer numero;
        //int cantidad = 0;

        List<Integer> miLista = new ArrayList<>();
        System.out.println("El ingreso finaliza con un número mayor a 500");
   do {
       System.out.println("Ingrese un número: ");
        numero = scanner.nextInt();

        miLista.add(numero);
        //cant ++;
   }
        while (numero <= 500);
        System.out.println("Cantidad ingresada :"+ miLista.size());
        if (miLista.size() < 3){
            System.out.println("Se ingresaron pocos números ");

        } else {
            System.out.println("Se excedió la cantidad de ingresos ");
        }
    }
}
