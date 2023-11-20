package com.icaro.clase7;

import com.icaro.opencart.Test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class EsperasTest extends BaseTest {

    @Test
    public void ValidarTitle (){

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(8));

        By title = By.xpath("//div[@id='finish']/h4");
        By starBtn = By.xpath ("//div[@id='start']/button");

        getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //WebElement titleElement = getDriver().findElement(title);
        WebElement starElement = wait.until(ExpectedConditions.elementToBeClickable(starBtn));

        starElement.click();

        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(title));

        Assert.assertEquals(titleElement.getText(),"Hello World!");

    }
}
