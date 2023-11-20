package com.icaro.opencart.Test;
import com.icaro.Opencart.pages.HomePage;
import org.testng.annotations.Test;
import org.testng.Assert;

public class HomeTest extends BaseTest {


    @Test
    public void validarHome() {
        HomePage homePage = new HomePage(getDriver());


        getDriver().get("https://opencart.abstracta.us/");

        HomePage homepage = new HomePage(getDriver());

        getDriver().get("https://opencart.abstracta.us/");

        Assert.assertEquals(homePage.getTitulo(), "Your Store");
        Assert.assertTrue(homePage.buscadorEsVisible());
        Assert.assertTrue(homePage.carrouselEsVisible());

    }
}