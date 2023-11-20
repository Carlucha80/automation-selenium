package com.icaro.clase4_practica4_5;

public class NoDocente extends Persona {
   public NoDocente (String nombre, String apellido){
       super(nombre, apellido);

   }
@Override
    public void Saludar () {
    System.out.println("Buen día");
}
}
