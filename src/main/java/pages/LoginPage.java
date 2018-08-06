package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    private String loginInputID = "login-form-username";
    private String passwordInputID = "login-form-password";
    private String loginButtonID = "login";

    public void enterLogin(String login){
        $(byId(this.loginInputID)).sendKeys(login);
    }

    public void enterPassword(String password){
        $(byId(this.passwordInputID)).sendKeys(password);
    }

    public void clickLoginButton(){
        $(byId(this.loginButtonID)).click();
    }
}