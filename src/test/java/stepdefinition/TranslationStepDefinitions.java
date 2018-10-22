package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.TranslateSteps;

/**
 * Created by poppy zhang on 2018/8/9.
 */
public class TranslationStepDefinitions {
    @Steps
    TranslateSteps translateSteps;

    @And("^Select (.*) for translation on (.*)$")
    public void selectLanguage(String language,String platform) throws Throwable {
        translateSteps.selectLanguage(language,platform);
    }

    @And("^Translate guide page for (.*) on (.*) for deebot (.*)$")
    public void guidePageTranslate(String language,String platform,String deebotType) throws Throwable {
        translateSteps.guidePageTranslate(language,platform,deebotType);
    }

    @And("^Translate clean page for (.*) on (.*) for deebot (.*)$")
    public void cleanPageTranslate(String language,String platform,String deebotType) throws Throwable {
        translateSteps.cleanPageTranslate(language,platform,deebotType);
    }

    @And("^Translate error page for (.*) on (.*) for deebot (.*)$")
    public void errorPageTranslate(String language,String platform,String deebotType) throws Throwable {
        translateSteps.errorPageTranslate(language,platform,deebotType);
    }

    @And("^Translate more page for (.*) on (.*) for deebot (.*)$")
    public void morePageTranslate(String language,String platform,String deebotType) throws Throwable {
        translateSteps.morePageTranslate(language,platform,deebotType);
    }




}