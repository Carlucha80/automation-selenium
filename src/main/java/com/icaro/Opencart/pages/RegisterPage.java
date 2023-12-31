package com.icaro.Opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {

    By firstNameInput = By.id("input-firstname");
    By lastNameInput = By.id("input-lastname");
    By emailInput = By.id("input-email");
    By telephoneInput = By.id("input-telephone");
    By passwordInput = By.id("input-password");
    By confirmPasswordInput = By.id("input-confirm");
    By termsAndConditionsCheckbox = By.name("agree");
    By continueBtn = By.xpath("//input[@value='Continue']");

    WebDriver driver;
    WebDriverWait wait;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void completarFormulario(String firstname,
                                    String lastname,
                                    String email,
                                    String telephone,
                                    String password) {
        WebElement firstNameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput));
        firstNameElem.sendKeys(firstname);

        WebElement lastNameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameInput));
        lastNameElem.sendKeys(lastname);

        WebElement emailElem = wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        emailElem.sendKeys(email);

        WebElement telElem = wait.until(ExpectedConditions.visibilityOfElementLocated(telephoneInput));
        telElem.sendKeys(telephone);

        WebElement passElem = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        passElem.sendKeys(password);

        WebElement confirmPassElem = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmPasswordInput));
        confirmPassElem.sendKeys(password);

        WebElement checkElem = wait.until(ExpectedConditions.elementToBeClickable(termsAndConditionsCheckbox));
        checkElem.click();

        WebElement continueElem = wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueElem.click();
    }

    //public String getAlertaRegistroOk(){
        //WebElement MensElem = wait.until(ExpectedConditions.visibilityOfElementLocated(MsjOkAlert));
        //return  MensElem.getText();
    //}
}