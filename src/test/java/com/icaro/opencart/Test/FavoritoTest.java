package com.icaro.opencart.Test;
import com.icaro.Opencart.pages.HomePage;
import com.icaro.Opencart.pages.LoginPage;
import com.icaro.Opencart.pages.MyAccountPage;
import com.icaro.Opencart.pages.NavBarPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FavoritoTest extends BaseTest {

@Test
    public void agregarFavorito (){
    HomePage homePage = new HomePage(getDriver());
    LoginPage loginPage = new LoginPage(getDriver());
    NavBarPage navPage = new NavBarPage(getDriver());
    MyAccountPage myAccountPage = new MyAccountPage(getDriver());

    getDriver().get("https://opencart.abstracta.us/");
    homePage.ingresarAlLogin();
    loginPage.login("carlucha@gmail.com", "carla123");
    Assert.assertEquals(myAccountPage.getTitulo(), "My Account");
    navPage.seleccionariMacDesktop();
    navPage.seleccionarWishList();
    Assert.assertTrue(navPage.getMensajeExitoso().contains("Success: You have added iMac to your wish list!"));


}







}
