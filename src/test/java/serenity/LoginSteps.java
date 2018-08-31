package serenity;

import constants.Setup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.DashboardPage;
import pages.LoginPage;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by poppy zhang on 2018/8/9.
 */
public class LoginSteps {
    AppiumDriver appiumDriver = Setup.appiumDriver;
    LoginPage loginPage = new LoginPage(appiumDriver);
    DashboardPage dashboardPage =new DashboardPage(appiumDriver);

    @Step
    public void global_login(String email, String password) throws Exception {
        //initial login page
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), LoginPage.class);
        if(email!= null && password!=null){
            loginPage.emailAccountTextbox.clear();
            loginPage.emailAccountTextbox.sendKeys(email);
            loginPage.passwordTextbox.clear();
            loginPage.passwordTextbox.sendKeys(password);
            loginPage.loginButton.click();
        }
    }

    @Step
    public void check_login_result(String platform) throws Exception {
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver,("//*[@name='DEEBOT 705']"),60,platform);
            //CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/robot_name"), 60, platform);
            Thread.sleep(6000);
        }
        if(CommonPage.elementExist(dashboardPage.D700RobotName)){
            System.out.println("Login to app succeed, test pass!");
        }
        else
            Assert.fail("Login to app  get error, test fail!");

    }
}
