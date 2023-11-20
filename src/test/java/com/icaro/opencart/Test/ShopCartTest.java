package com.icaro.opencart.Test;

import com.icaro.Opencart.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopCartTest extends BaseTest {
    @Test
    public void agregarProductoCarrito (){
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        NavBarPage navPage = new NavBarPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        ShopCartPage shopCartPage =new ShopCartPage(getDriver());

        getDriver().get("https://opencart.abstracta.us/");
        homePage.ingresarAlLogin();
        loginPage.login("carlucha@gmail.com", "carla123");
        Assert.assertEquals(myAccountPage.getTitulo(), "My Account");
        navPage.seleccionariMacDesktop();
        shopCartPage.agregarCarrito();
        Assert.assertEquals(shopCartPage.getAlertaCarrito(),"shopping cart");
    }
}
