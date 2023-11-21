package com.icaro.stepDefinitions;
import com.github.javafaker.Faker;
import com.icaro.Opencart.pages.AccountPage;
import com.icaro.Opencart.pages.HomePage;
import com.icaro.Opencart.pages.RegisterPage;
import com.icaro.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

public class RegisterDefinitions {
    private RegisterPage registerPage;
    private AccountPage accountPage;
    private Faker faker;
    private HomePage homePage;


    public RegisterDefinitions() {
        this.registerPage = new RegisterPage(Hooks.getDriver());
        this.accountPage = new AccountPage(Hooks.getDriver());
        this.faker = new Faker();
        this.homePage = new HomePage(Hooks.getDriver());
    }


    @Entonces("completa el Formulario")
    public void completaElFormulario (){

        registerPage.completarFormulario(faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password());
    }

   @Y("valida que se registro exitosamente")
    public void validaQueSeRegistroExitosamente(){
        Assert.assertEquals(accountPage.getTitulo(),"Account");
        Assert.assertTrue(accountPage.descriptionIsDisplayed());
    }


    @Cuando("ingresa al registro")
    public void ingresaAlRegistro() {
        homePage.ingresarAlRegistro();
    }
}



