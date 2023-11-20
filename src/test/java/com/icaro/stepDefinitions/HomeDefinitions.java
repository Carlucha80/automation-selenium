package com.icaro.stepDefinitions;

import com.icaro.Opencart.pages.HomePage;
import com.icaro.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

public class HomeDefinitions {
     HomePage homePage;
     public HomeDefinitions (){

         this.homePage =new HomePage(Hooks.getDriver());
     }


    @Dado("que el usuario ingresa a la pagina de OpenCart")
    public void queElUsuarioIngresaALaPaginaDeOpenCart() {

         Hooks.getDriver().get(Hooks.getConfiValue("url"));
    }


    @Entonces("se valida que el usuario se encuentra en la Home")
    public void seValidaQueElUsuarioSeEncuentraEnLaHome() {
        Assert.assertEquals(homePage.getTitulo(), "Your Store");
        Assert.assertTrue(homePage.buscadorEsVisible());
        Assert.assertTrue(homePage.carrouselEsVisible());

    }


    @Y("el usuario ingresa al login")
    public void elUsuarioIngresaAlLogin() {
        homePage.ingresarAlLogin();
    }
}
