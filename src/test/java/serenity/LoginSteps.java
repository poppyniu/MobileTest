package serenity;

import constants.Setup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.thucydides.core.annotations.Step;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.DashboardPage;
import pages.LoginPage;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.UUID;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by poppy zhang on 2018/8/9.
 */
public class LoginSteps {
    AppiumDriver appiumDriver = Setup.appiumDriver;
    LoginPage loginPage = new LoginPage(appiumDriver);
    DashboardPage dashboardPage = new DashboardPage(appiumDriver);
    private Workbook wb;
    private Sheet sheet;
    private String mailPwd = "ecovacs123";
    private Row row;

    @Step
    public void global_login(String email, String password) throws Exception {
        //initial login page
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), LoginPage.class);
        if (email != null && password != null) {
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
            CommonPage.waitForVisible(appiumDriver, ("//*[@name='DEEBOT 705']"), 60, platform);
            //CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/robot_name"), 60, platform);
            Thread.sleep(6000);
        }
        if (CommonPage.elementExist(dashboardPage.D700RobotName)) {
            System.out.println("Login to app succeed, test pass!");
        } else
            Assert.fail("Login to app  get error, test fail!");

    }

    @Step
    public void multiple_country_register_login(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), LoginPage.class);
        Thread.sleep(20000);
        InputStream is = new FileInputStream("file/gbregion.xlsx");
        wb = new XSSFWorkbook(is);
        sheet = wb.getSheetAt(0);
        row = sheet.getRow(0);
        int rowNum = sheet.getLastRowNum();
        ArrayList<String> list = new ArrayList<String>();
        for (int rowCount = 0; rowCount <= rowNum; rowCount++) {
            XSSFRow xssfRow = (XSSFRow) sheet.getRow(rowCount);
            if (xssfRow == null) {//略过空行
                continue;
            }
            XSSFCell eRow = xssfRow.getCell(0);
            list.add(eRow.toString());
        }
        for (int coun = 0; coun < list.size(); coun++) {
            String tmp = list.get(coun).trim();
            //click register button
            try {
                if (loginPage.registerInLoginPage.isDisplayed()) {
                    loginPage.registerInLoginPage.click();
                    Thread.sleep(2000);
                    if (loginPage.agreeProtocolBtn.isDisplayed()) {
                        loginPage.agreeProtocolBtn.click();
                    }
                    CommonPage.toSelectArea(appiumDriver, tmp, platform);
                    if (loginPage.agreeProtocolBtn.isDisplayed()) {
                        loginPage.agreeProtocolBtn.click();
                    }
                }
            } catch (Exception e) {
                CommonPage.toSelectArea(appiumDriver, tmp, platform);
                loginPage.registerInLoginPage.click();
                if (loginPage.agreeProtocolBtn.isDisplayed()) {
                    loginPage.agreeProtocolBtn.click();
                }
            }

            String testMailName = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
            ;
            loginPage.mailNameInRegisPage.sendKeys(testMailName + "@163.com");
            if (platform.equals("ios")) {
                CommonPage.clickDone(appiumDriver);
            }
            loginPage.pwdInRegisPage.clear();
            loginPage.pwdInRegisPage.sendKeys(mailPwd);
            if (platform.equals("ios")) {
                CommonPage.clickDone(appiumDriver);
            }
            loginPage.regBtnInRegisPage.click();
            Thread.sleep(5000);
            if (platform.equals("ios")) {
                CommonPage.waitForVisible(appiumDriver, "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]", 10, "ios");
            } else {
                CommonPage.waitForElement(loginPage.moreBtnInMainPage, 10);
            }
            Thread.sleep(5000);
            loginPage.moreBtnInMainPage.click();
            loginPage.userInfoInSettingPage.click();
            CommonPage.waitForElement(loginPage.logoutInUserInfoPage, 20);
            loginPage.logoutInUserInfoPage.click();
            CommonPage.waitForElement(loginPage.registerInLoginPage, 10);
            //login with new user
            loginPage.mailNameInLoginPage.clear();
            loginPage.mailNameInLoginPage.sendKeys(testMailName + "@163.com");
            if (platform.equals("ios")) {
                CommonPage.clickDone(appiumDriver);
            }
            loginPage.pwdInuptBtnInLoginPage.sendKeys(mailPwd);
            if (platform.equals("ios")) {
                CommonPage.clickDone(appiumDriver);
            } else {
                loginPage.loginBtnInLoginPage.click();
            }
            if (platform.equals("ios")) {
                CommonPage.waitForVisible(appiumDriver, "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]", 10, "ios");
            } else {
                CommonPage.waitForElement(loginPage.moreBtnInMainPage, 10);
            }
            loginPage.moreBtnInMainPage.click();
            loginPage.userInfoInSettingPage.click();
            CommonPage.waitForElement(loginPage.logoutInUserInfoPage, 20);
            //update password
            loginPage.updatePWDInUserInfoPage.click();
            loginPage.oldPWDInUserInfoPage.sendKeys(mailPwd);
            if (platform.equals("ios")) {
                CommonPage.clickDone(appiumDriver);
            }
            loginPage.newPWDInUserInfoPage.sendKeys("ecovacs1234");
            if (platform.equals("ios")) {
                CommonPage.clickDone(appiumDriver);
            }
            loginPage.renewPWDInUserInfoPage.sendKeys("ecovacs1234");
            if (platform.equals("ios")) {
                CommonPage.clickDone(appiumDriver);
            }
            loginPage.okBtnInUserInfoPage.click();
            CommonPage.waitForElement(loginPage.registerInLoginPage, 20);
//login with new password
            loginPage.mailNameInLoginPage.clear();
            loginPage.mailNameInLoginPage.sendKeys(testMailName + "@163.com");
            if (platform.equals("ios")) {
                CommonPage.clickDone(appiumDriver);
            }
            loginPage.pwdInuptBtnInLoginPage.sendKeys("ecovacs1234");
            if (platform.equals("ios")) {
                CommonPage.clickDone(appiumDriver);
            } else {
                loginPage.loginBtnInLoginPage.click();
            }
            if (platform.equals("ios")) {
                CommonPage.waitForVisible(appiumDriver, "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]", 10, "ios");
            } else {
                CommonPage.waitForElement(loginPage.moreBtnInMainPage, 10);
            }
            loginPage.moreBtnInMainPage.click();
            Thread.sleep(2000);
            loginPage.userInfoInSettingPage.click();
            CommonPage.waitForElement(loginPage.logoutInUserInfoPage, 20);
            loginPage.logoutInUserInfoPage.click();
            CommonPage.waitForElement(loginPage.registerInLoginPage, 10);
/*
    //forget password
            //click forget password
            pb.forgetPWDBtnInLoginPage.click();

            //A verification code has been sent to:
            pb.mailNameInputInForgetPWDPage.sendKeys(testMailName+"@163.com");
            if (platform.equals("ios")) {
                ut.clickDone(appiumDriver);
            }
            pb.veriCodeInputInForgetPWDPage.clear();
            pb.getVeriCodeInForgetPWDPage.click();
            Thread.sleep(10000);

            EmailTest et = new EmailTest();
            boolean flag = true;
            while (flag) {
                String veriCode = et.getVerificationCodeFromMail("martinmaforever@gmail.com");
                if (!veriCode.equals("")) {
                    pb.veriCodeInputInForgetPWDPage.sendKeys(veriCode);
                    if (platform.equals("ios")) {
                        ut.clickDone(appiumDriver);
                    }
                    flag = false;
                }

            }
            pb.nextBtnInForgetPWDPage.click();
            Thread.sleep(10000);

            //Password reset. Please log in again
            pb.newPWDInputInGetPWDPage.sendKeys(mailPwd);
            pb.confirmNewPWDInGetPWDPage.sendKeys(mailPwd);
            if (platform.equals("ios")) {
                ut.clickDone(appiumDriver);
            }
            pb.okBtnInGetPWDPage.click();
            Thread.sleep(5000);
            ut.waitForElement(pb.mailNameInLoginPage, 10);

            pb.mailNameInLoginPage.clear();
            pb.mailNameInLoginPage.sendKeys(testMailName+"@163.com");
            if (platform.equals("ios")) {
                ut.clickDone(appiumDriver);
            }
            pb.pwdInuptBtnInLoginPage.sendKeys(mailPwd);
            if (platform.equals("ios")) {
                ut.clickDone(appiumDriver);
            }else {
                pb.loginBtnInLoginPage.click();
            }

            if (platform.equals("ios")) {
                ut.waitForVisible(appiumDriver, "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]", 10, "ios");
            } else {
                ut.waitForElement(pb.moreBtnInMainPage, 10);
            }
            pb.moreBtnInMainPage.click();
            pb.userInfoInSettingPage.click();
            ut.waitForElement(pb.logoutInUserInfoPage, 10);
            pb.logoutInUserInfoPage.click();
            ut.waitForElement(pb.registerInLoginPage, 10);
*/
            appiumDriver.closeApp();
            appiumDriver.launchApp();
            System.out.println(tmp + " is ok");
            Thread.sleep(10000);
        }
    }

}
