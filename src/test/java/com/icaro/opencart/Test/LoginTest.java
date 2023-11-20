package com.icaro.opencart.Test;
import com.icaro.Opencart.pages.HomePage;
import com.icaro.Opencart.pages.LoginPage;
import com.icaro.Opencart.pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    @Test
    public void login() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        //1)
        getDriver().get("https://opencart.abstracta.us/");

        // 2) y 3)
        homePage.ingresarAlLogin();

        // 4)
        loginPage.login("carlucha@gmail.com", "carla123");

        // 5)
        Assert.assertEquals(myAccountPage.getTitulo(), "My Account");
    }

    @Test
    public void loginFallido() {

    }


       // WebElement myaccountElement = wait.until(ExpectedConditions.elementToBeClickable(myaccountBtn));


    }


