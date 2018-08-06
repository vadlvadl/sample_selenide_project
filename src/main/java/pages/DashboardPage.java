package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    private String accountFullNameID = "header-details-user-fullname";

    public void checkLoggedIn(){
        $(byId(accountFullNameID)).shouldBe(Condition.visible);
    }

}
