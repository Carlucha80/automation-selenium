package com.icaro.clase5;
/* Crear la clase Triangulo que extienda de Figura. Esta clase tiene los atributos
            base y altura
            Desde una clase que contenga main, verificar que Figura no se puede
            instanciar*/
public class Triangulo extends Figura {

    private double altura;
    private double base;

    public Triangulo (double altura, double base){
        this.altura = altura;
        this.base = base;
    }
    @Override
    public double calculararea (){
        return (base * altura) / 2;
    }
}
