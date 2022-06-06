package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#menuUserLink")
    public WebElement btnLogin;
    @FindBy(css = "closeBtn")
    public WebElement btnFechar;
    @FindBy(css = ".PopUp")
    public WebElement divFecharModal;
    @FindBy(css = "username")
    public WebElement inpUserName;
    @FindBy()
    public WebElement inpPassword;
    @FindBy()
    public WebElement btnSignIn;
    @FindBy()
    public WebElement inpRemember;
    @FindBy()
    public WebElement linkCreateAccount;
}
