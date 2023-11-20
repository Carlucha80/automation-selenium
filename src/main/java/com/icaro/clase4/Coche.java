package com.icaro.clase4;

public class Coche extends Vehiculo {
    private int cilindrada;

    public Coche(String marca, String modelo, Integer ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void Acelerar() {
        System.out.println("El Coche está acelerando");

    }
}