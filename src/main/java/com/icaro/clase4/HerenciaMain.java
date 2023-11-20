package com.icaro.clase4;

public class HerenciaMain {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo ("Toyota","Corolla", 2020);
        Coche coche = new Coche ("Ford","Mustang",2021,5000);

        System.out.println("Marca marca : " + vehiculo.getMarca ());
        System.out.println("Modelo modelo : " + vehiculo.getModelo ());
        System.out.println("Ano ano : " + vehiculo.getAno ());

        System.out.println("Marca marca : " + coche.getMarca ());
        System.out.println("Modelo modelo : " + coche.getModelo ());
        System.out.println("Ano ano : " + coche.getAno ());
        System.out.println("Cilindrada cilindrada : " + coche.getCilindrada());

        vehiculo.Acelerar();
        coche.Acelerar();
    }
}
