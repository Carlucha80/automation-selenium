package com.icaro.stepDefinitions;

import com.icaro.Opencart.pages.ShopCartPage;
import com.icaro.hooks.Hooks;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

public class CarritoDefinitions {
    ShopCartPage shopCartPage;
    public CarritoDefinitions() {

        this.shopCartPage = new ShopCartPage(Hooks.getDriver());
    }

    @Y("puede agregar un producto al carrito")
    public void puedeAgregarUnProductoAlCarrito(){
        shopCartPage.agregarCarrito();

    }
    @Y("valida que se agrego ok al carrito")
    public void validaQueSeAgregoOkAlCarrito(){
        shopCartPage.getAlertaCarrito();
    }
}
