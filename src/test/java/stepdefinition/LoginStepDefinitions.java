package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import serenity.LoginSteps;

/**
 * Created by poppy zhang on 2018/8/9.
 */
public class LoginStepDefinitions {
    @Steps
    LoginSteps loginSteps=new LoginSteps();

    @And("^Input ([^\"]*) and ([^\"]*) and click login button$")
    public void input_email_password_and_click_login_button(String email, String password) throws Throwable {
        loginSteps.global_login(email,password);
    }

    @Then("^Check login succeed on ([^\"]*)$")
    public void check_login_succeed(String platform) throws Throwable {
        loginSteps.check_login_result(platform);
    }

}