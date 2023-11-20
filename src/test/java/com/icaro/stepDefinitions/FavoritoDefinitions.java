package com.icaro.stepDefinitions;

import com.icaro.Opencart.pages.NavBarPage;
import com.icaro.hooks.Hooks;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

public class FavoritoDefinitions {
    NavBarPage navBarPage;
    public FavoritoDefinitions(){
        this.navBarPage = new NavBarPage(Hooks.getDriver());


   }

@Entonces ("puede agregar un producto a la lista de deseos")
    public void puedeAgregarUnProductoAlaListaDeDeseos(){
    navBarPage.seleccionariMacDesktop();
    navBarPage.seleccionarWishList();
}


    @Y("se muestra la alerta indicando que se agregó el producto Ok")
    public void seMuestraLaAlertaIndicandoQueSeAgregóElProductoOk() {
        Assert.assertTrue(navBarPage.getMensajeExitoso().contains("Success: You have added iMac to your wish list!"));
    }
}




