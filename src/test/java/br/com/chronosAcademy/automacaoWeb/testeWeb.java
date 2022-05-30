package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class testeWeb {

    WebDriver driver;
    Driver driverWeb;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br");
    }

    @Test
    public void primeiroTeste (){
        String xpathTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento",titulo);
    }

    @Test
    public void segundoTeste(){
        String xpathBotao = "//section[2]/div[3]//a";
        WebElement btnTitulo = driver.findElement(By.xpath(xpathBotao));
        btnTitulo.click();
        String xpathTitulo = "//*[@id=\"block-216\"]//div[1]/div/h3";
        WebElement h3Titulo = driver.findElement(By.xpath(xpathTitulo));
        assertEquals("Automação Sem Complicação Web 2.0", h3Titulo.getText());
    }

    @After
    public void finalizaTeste(){
        driver.quit();
    }
}
