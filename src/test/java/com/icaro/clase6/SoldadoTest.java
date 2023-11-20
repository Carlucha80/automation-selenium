package com.icaro.clase6;

import com.icaro.Clase6.Soldado;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoldadoTest {
 @Test
 public void pelearTest() {
  Soldado soldado = new Soldado(60);
  soldado.pelear(30);
  Assert.assertEquals(soldado.getSalud(), 45, "Error en la salud");
 }

 @Test
 public void morirTest() {
  Soldado soldado = new Soldado(50);
  soldado.pelear(500);
  Assert.assertTrue(soldado.estarmuerto());

 }

 @Test
 public void NoMorirTest() {
  Soldado soldado = new Soldado(50);
  soldado.pelear(10);
  Assert.assertFalse(soldado.estarmuerto());
 }

 @Test (description = "Probando método descansar")
 public void descansarTest () {
  Soldado soldado = new Soldado(80);
  soldado.descansar();
  Assert.assertEquals(soldado.getSalud(), 90);
 }
}