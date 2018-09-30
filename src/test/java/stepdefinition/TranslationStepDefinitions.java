package stepdefinition;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.TranslateSteps;

/**
 * Created by poppy zhang on 2018/8/9.
 */
public class TranslationStepDefinitions {
    @Steps
    TranslateSteps translateSteps;

    @When("^Select (.*) and check translation result on (.*)$")
    public void doTranslation(String language,String platform) throws Throwable {
        translateSteps.doTranslation(language,platform);
    }
}