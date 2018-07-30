import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.attribute;
import com.codeborne.selenide.Configuration;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.*;

public class JiraLoginTest {

    @Test
    public void jiraLoginTest(){

        String login = "webinar5";
        String password = "webinar5";

        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";

        open("http://jira.hillel.it:8080/");

        LoginPage loginPage = new LoginPage();

        loginPage.enterLogin(login);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

        try {
            Thread.sleep(6500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
