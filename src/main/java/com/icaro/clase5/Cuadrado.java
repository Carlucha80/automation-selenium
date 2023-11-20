package com.icaro.clase5;
/* Crear la clase Cuadrado que extienda de Figura. Esta clase tiene el atributo
            lado*/

 public class Cuadrado extends Figura {

    private double lado;

public Cuadrado (double lado){

    this.lado = lado;
}
    @Override
    public double calculararea() {
return lado * lado;
    }
}
