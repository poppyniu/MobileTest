package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.AreaSteps;
import serenity.LoginSteps;

/**
 * Created by poppy zhang on 2018/8/13.
 */
public class AreaStepDefinitions {
    @Steps
    AreaSteps areaSteps=new AreaSteps();

    @When("^Choose (.*) as login country on (.*)$")
    public void choose_america_as_login_country(String country,String platform) throws Throwable {
        areaSteps.chooseCountry(country,platform);
    }


}