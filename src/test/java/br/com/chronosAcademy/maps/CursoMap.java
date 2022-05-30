package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CursoMap {
    @FindBy(xpath = "//section[5]//div[2]/div/div[1]//h3")
    public WebElement txtTitulo;

}
