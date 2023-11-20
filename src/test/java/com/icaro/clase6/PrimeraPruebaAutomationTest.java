package com.icaro.clase6;
import com.icaro.opencart.Test.BaseTest;
import org.testng.annotations.*;

public class PrimeraPruebaAutomationTest extends BaseTest {



    @Test
    public void abrirPagina() {
      getDriver().get("https://opencart.abstracta.us/");
    }


}