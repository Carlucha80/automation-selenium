package com.icaro.clase4;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected Integer ano;

    public Vehiculo(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }

   // public void Frenar() {
    //    System.out.println("Vehículo Frenando");

       public void Acelerar () {
          System.out.println("El Vehículo está Acelerando");
        }

    }
