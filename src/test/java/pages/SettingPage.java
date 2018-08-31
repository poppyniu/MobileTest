package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by poppy zhang on 2018/8/9.
 */
public class SettingPage {
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id="com.eco.global.app:id/ll_setting")
    public MobileElement settingButton;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id="com.eco.global.app:id/iv_current_language")
    public MobileElement settingMultipleLanguage;
    @iOSFindBy(xpath = "//*[@name='global back black arrow']")
    @AndroidFindBy(id="com.eco.global.app:id/fl_left_container")
    public MobileElement settingBackBtn;



    public SettingPage(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


}
