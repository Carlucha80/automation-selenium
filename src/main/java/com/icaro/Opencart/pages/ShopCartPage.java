package com.icaro.Opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopCartPage extends BasePage {

    By addToCartBtn = By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]");
    By AgregasteAlCarritoAlert = By.xpath("//a[text()='shopping cart']");
public ShopCartPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Aquí deberías inicializar 'wait' con un tiempo de espera apropiado
    }

public void agregarCarrito (){

    click(addToCartBtn);
}
    public String getAlertaCarrito() {
        WebElement alertElem = wait.until(ExpectedConditions.visibilityOfElementLocated(AgregasteAlCarritoAlert));
        return alertElem.getText();
    }

}

