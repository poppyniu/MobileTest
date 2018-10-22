package stepdefinition;

import constants.Setup;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import io.appium.java_client.AppiumDriver;
import net.thucydides.core.annotations.Steps;
import serenity.SetupSteps;
import serenity.TranslateSteps;

/**
 * Created by poppy zhang on 2018/8/9.
 */
public class SetupStepDefinitions {
    @Steps
    SetupSteps setupSteps=new SetupSteps();

    @Given("^Set up testing environment on (.*) for deebot (.*)$")
    public void set_up_testing_environment_on_android(String platfrom,String deebotType) throws Throwable {
        setupSteps.setUp(platfrom,deebotType);
    }

    @And("^Tear down$")
    public void tear_down() throws Throwable {
        setupSteps.tearDown();
    }
}