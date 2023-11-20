package com.icaro.clase4_practica4_5;

import java.util.ArrayList;
import java.util.List;

public class Polimorfismo {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Carla","Crespo","ABC",6);
        Profesor profesor = new Profesor("Pepito","Perez");
        NoDocente noDocente = new NoDocente("María", "De los Angeles");

        List<Persona>listaDePersonas = new ArrayList<>();
        listaDePersonas.add(alumno);
        listaDePersonas.add(profesor);
        listaDePersonas.add(noDocente);
for (Persona persona: listaDePersonas){
    persona.Saludar();
}
    }
}
