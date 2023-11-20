package com.icaro.Opencart.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By title = By.xpath("//div[@id='logo']/h1/a");
    private By search = By.name("search");
    private By carrousel = By.id("slideshow0");

    private By myAccountBtn = By.xpath("//a[@title='My Account']");
    private By loginBtn = By.xpath("//a[text()='Login']"); //a[contains(@href, 'account/login')]

    private By registerBtn = By.xpath("//a[text()='Register']");



    public HomePage(WebDriver driver) {

        super(driver);
    }
    public void ingresarAlLogin() {
        click(myAccountBtn);
        click(loginBtn); //Aquí el elemento está visible y está habilitado.
    }
//Cuando el elemento esta visible pero no está habilitado uso:
// WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn));
// element.click();
    public void ingresarAlRegistro() {
        click(myAccountBtn);
        click(registerBtn);
    }

    public String getTitulo() {

        return getText(title);
    }

    public Boolean buscadorEsVisible() {

        return isDisplayed(search);
    }

    public Boolean carrouselEsVisible() {

        return isDisplayed(carrousel);
    }



}

