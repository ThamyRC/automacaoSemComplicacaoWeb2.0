package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.maps.LoginMap;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void clickBtnLogin() {
        Driver.visibilityOf(loginMap.btnLogin);
        loginMap.btnLogin.click();
    }

    public void clickBtnFechar() {
        loginMap.btnFechar.click();
    }

    public void clickdivFecharModal() {
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].click();", loginMap.divFecharModal);
    }

    public void setinpUserName(String username) {
        if (username != null) {
            loginMap.inpUserName.sendKeys(username);
        }
    }

    public void setinpPassword(String password) {
        if (password != null) {
            loginMap.inpPassword.sendKeys(password);
        }
    }

    public void clickbtnSignIn() {
        loginMap.btnSignIn.click();
    }

    public boolean isbtnSignIn() {
        return loginMap.btnSignIn.isEnabled();
    }

    public void clickinpRemember() {
        loginMap.inpRemember.click();
    }

    public void clicklinkCreateAccount() {
        loginMap.linkCreateAccount.click();
    }

    public void visibilityOfBtnFechar() {
        Driver.visibilityOf(loginMap.btnFechar);
    }

    public void invisiblityOfBtnBechar() {
        Driver.invisibilityOf(loginMap.btnFechar);
    }

    public void aguardaLoader() {
        Driver.attributeChange(loginMap.divLoader, "display", "none");
    }

    public String getUsusarioLogado(){
        Driver.visibilityOf(loginMap.txtLogado);
        return loginMap.txtLogado.getText();
    }

    public String getErroLogin(){
        Driver.visibilityOf(loginMap.textErroLogin);
        return loginMap.textErroLogin.getText();
    }

}
