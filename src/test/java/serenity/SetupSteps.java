package serenity;

import constants.Setup;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pages.LoginPage;

/**
 * Created by poppy zhang on 2018/8/9.
 */
public class SetupSteps {
    Setup setUp=new Setup();

    @Step
    public void setUp(String platform) throws Exception {
        setUp.setUp(platform);
    }

    @Step
    public void tearDown( ) throws Exception {
        setUp.tearDown();
    }
}