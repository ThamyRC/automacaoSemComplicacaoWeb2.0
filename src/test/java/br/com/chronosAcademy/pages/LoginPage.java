package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;

    public LoginPage(){
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void clickBtnLogin(){
        loginMap.btnLogin.click();
    }

    public void clickBtnFechar(){
        loginMap.btnFechar.click();
    }

    public void clickdivFecharModal(){
        loginMap.divFecharModal.click();
    }

    public void setinpUserName(String username){
        loginMap.inpUserName.sendKeys(username);
    }

    public void setinpPassword(String password){
        loginMap.inpPassword.sendKeys(password);
    }

    public void clickbtnSignIn(){
        loginMap.btnSignIn.click();
    }

    public boolean isbtnSignIn(){
        return loginMap.btnSignIn.isEnabled();
    }

    public void clickinpRemember(){
        loginMap.inpRemember.click();
    }

    public void clicklinkCreateAccount(){
        loginMap.linkCreateAccount.click();
    }
}
