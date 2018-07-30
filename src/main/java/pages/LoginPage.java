package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    private String loginInputID = "login-form-username";
    private String passwordInputID = "login-form-password";
    private String loginButtonID = "login";

    public void enterLogin(String login){
        $("#" + this.loginInputID).sendKeys(login);
    }

    public void enterPassword(String password){
        $("#" + this.passwordInputID).sendKeys(password);
    }

    public void clickLoginButton(){
        $("#" + this.loginButtonID).click();
    }
}