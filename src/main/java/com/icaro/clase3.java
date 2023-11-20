package com.icaro;

import java.util.ArrayList;
import java.util.List;

public class clase3 {
    public static void main(String[] args) {
       List<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("Hola");
        listaDeStrings.add("Carla");
        listaDeStrings.add("Bella");
        System.out.println(listaDeStrings.get(0));
        System.out.println("La posición 1 contiene: "+listaDeStrings.get(1));

        String nombre = "Petra ";
        if (nombre.equals("Petra ")) {
            System.out.println( nombre + "es hija de Sol");
        } else if (nombre.equals("Carla ")) {
            System.out.println("Es hija de Juana");
        }

int var1 = 100;
        if (var1 < 100) {
            System.out.println("El número es superior a 100");}
        else  {
            System.out.println("El número es inferior a 100");}




    }
}
