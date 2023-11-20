package com.icaro.opencart.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.time.Duration;

public class BaseTest {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

        options.addArguments("start-maximized");
        //this.driver.manage().window().maximized(); ---Es otra forma de maximizar la pantalla
        options.addArguments("incognito");
        options.setPageLoadTimeout(Duration.ofSeconds(90));
        //La siguiente capability es para que el test se ejecute sin una interfaz gráfica.
        // options.addArguments("--headless");

        this.driver = new ChromeDriver(options);
        this.driver.get("https://opencart.abstracta.us/");
    }

    public WebDriver getDriver() {

        return this.driver;
    }

    @AfterMethod
    public void tearDown() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }
}


