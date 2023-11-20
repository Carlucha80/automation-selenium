package com.icaro.clase4_practica4_5;

public class Alumno extends Persona {
    private String matricula;
    private Integer nota;

    public Alumno(String nombre, String apellido, String matricula, Integer nota) {
        super (nombre, apellido);
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getMatricula () {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getNota() {
        return nota;
    }
    public void setNota (Integer nota) {
        this.nota = nota;
    }
    @Override
    public void Saludar () {
        System.out.println("Qué Ondaaaa");

    }
}
