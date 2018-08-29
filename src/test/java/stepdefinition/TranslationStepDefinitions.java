package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.TranslateSteps;

/**
 * Created by poppy zhang on 2018/8/9.
 */
public class TranslationStepDefinitions {
    @Steps
    TranslateSteps translateSteps;

    @And("^Select language and check translation result on (.*)$")
    public void doTranslation(String platform) throws Throwable {
        translateSteps.doTranslation(platform);
    }
}