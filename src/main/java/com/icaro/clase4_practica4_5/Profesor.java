package com.icaro.clase4_practica4_5;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    private List<Alumno> alumnos;
    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
        this.alumnos = new ArrayList<>();
    }
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
    public void agregarAlumno(Alumno alumno){this.alumnos.add (alumno);}

@Override
public void Saludar () {
    System.out.println("Hola a todos");
    }
    /*En profesor se debe implementar un método calificar () sobrecargado
    Si calificar recibe un alumno y la nota,agrega a ese alumno la nota
    Si calificar solo recibe una nota, agrega a todos sus alumnos la misma nota
     */
    public void Calificar (Alumno alumno, Integer nota) {
        alumno.setNota(nota);
    }
        public void Calificar (Integer nota) {
        alumnos.get(0).setNota(nota);
       for (int i = 0; i < alumnos.size();i++) {
         alumnos.get(i).setNota(nota);
           //for (Alumno alumno: alumnos) {
             //  alumno.setNota(nota);

               //alumnos.forEach(alumno -> alumno.setNota(nota));

           }
       }
    }
