import io.qameta.allure.Description;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.attribute;
import com.codeborne.selenide.Configuration;
import pages.DashboardPage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.*;

public class JiraLoginTest {

    @BeforeTest
    public void initialSetup(){

        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;

    }

    public void login(String url, String username, String password){

        open(url);

        LoginPage loginPage = new LoginPage();
        loginPage.enterLogin(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.checkLoggedIn();
    }

    @Test
    @Description("Testing Login to Jira")
    public void jiraLoginTest(){

        String url = "http://jira.hillel.it:8080/";
        String login = "webinar5";
        String password = "webinar5";

        login(url,login,password);

        try {
            Thread.sleep(6500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
