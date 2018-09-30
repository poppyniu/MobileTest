package serenity;

import constants.Setup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.PageFactory;
import pages.AreaPage;
import pages.CommonPage;
import pages.LoginPage;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by poppy zhang on 2018/8/13.
 */
public class AreaSteps {
    AppiumDriver appiumDriver = Setup.appiumDriver;
    LoginPage loginPage = new LoginPage(appiumDriver);
    AreaPage areaPage = new AreaPage(appiumDriver);

    @Step
    public void chooseCountry(String country, String platform) throws Exception {
        //initial login page
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), LoginPage.class);
        //initial area page
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), AreaPage.class);
        Thread.sleep(9000);
        if (country != null && !"".equals("美国") && appiumDriver != null && platform.equals("android")) {
            if (CommonPage.elementExist(loginPage.moreCountryIcon)) {
                loginPage.moreCountryIcon.click();
                String countryStr = "new UiScrollable(new UiSelector().scrollable(true).instance(0))." + "scrollIntoView(new UiSelector().textContains(" + "\"" + country + "\"" + ").instance(0))";
                ((AndroidDriver) appiumDriver).findElementByAndroidUIAutomator(countryStr).click();
            }
        } else {
            //CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[6]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]"), 60, platform);
            //loginPage.notAllowNoticeBtn.click();
            Thread.sleep(2000);
            loginPage.countryInLoginPage.click();
            Thread.sleep(20000);
//            boolean countryYouWant = true;
//            while (countryYouWant) {
//                if (appiumDriver.findElementByXPath("//XCUIElementTypeStaticText[@name='" + country + "']").isDisplayed()) {
//                    appiumDriver.findElementByXPath("//XCUIElementTypeStaticText[@name='" + country + "']").click();
//                    countryYouWant = false;
//                } else {
                    CommonPage.swipeToDirection(appiumDriver, "up");
//                }
//            }
//
//        }
        }
        areaPage.saveBtnInAreaPage.click();
    }
}
