package com.icaro.clase5;
    /*Crear la clase Rectangulo que extienda de Figura. Esta clase tiene los
            atributos base y altura*/

public class Rectangulo extends Figura {

        private double base;
        private double altura;

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calculararea() {
            return base * altura;

        }
    }