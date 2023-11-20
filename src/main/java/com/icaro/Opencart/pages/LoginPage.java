package com.icaro.Opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    By emailInput = By.id("input-email");
    By passwordInput = By.id("input-password");
    By loginForm = By.xpath("//input[@type='submit' and @value='Login']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        sendKeys(emailInput, email);
        sendKeys(passwordInput, password);
        click(loginForm);
    }

    public void llenarEmail(String email) {
        sendKeys(emailInput, email);
    }

    public void llenarPass(String password) {
        sendKeys(passwordInput, password);
    }

    public void loguearse() {
        click(loginForm);
    }
}