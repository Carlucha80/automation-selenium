package com.icaro.Opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavBarPage extends BasePage {
    private By desktopsDd = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a");
    private By macOption = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a");
    private By wishBtn = By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[2]");

    private By MsjOkAlert = By.xpath("//*[contains(text(),'Success')]");

    public NavBarPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Aquí deberías inicializar 'wait' con un tiempo de espera apropiado
    }

    public void seleccionariMacDesktop() {
        click(desktopsDd);
        click(macOption);

    }

    public void seleccionarWishList() {

        click(wishBtn);
    }


public String getMensajeExitoso(){
        WebElement MensElem = wait.until(ExpectedConditions.visibilityOfElementLocated(MsjOkAlert));
        return  MensElem.getText();
    }
}
