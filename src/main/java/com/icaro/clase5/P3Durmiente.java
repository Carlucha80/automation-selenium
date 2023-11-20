package com.icaro.clase5;

public class P3Durmiente {
    public void Dormir () {
        try {
            Thread.sleep(-1);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Falló Sleep");
            e.printStackTrace();
        }
        catch (InterruptedException ignore){ }

    }
}
