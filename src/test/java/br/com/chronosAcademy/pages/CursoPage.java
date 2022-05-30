package br.com.chronosAcademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CursoPage {
    private WebDriver driver;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitulo2() {
        String xpathTitulo = "//section[5]//div[2]/div/div[1]//h3";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        return titulo;
    }

}
