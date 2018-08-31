package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * Created by poppy zhang on 2018/8/9.
 */
public class GuidePage {
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@index='2']")
    public MobileElement guidePageElement;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id="com.eco.global.app:id/msg")
    public MobileElement guidePageElement1;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(className="android.widget.Button")
    public MobileElement startExperienceBtn;
    @iOSFindBy(xpath="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]")
    @AndroidFindBy(className="android.widget.LinearLayout")
    public MobileElement guidePageLayout;
    @iOSFindBy(xpath="//poppytest")
    @AndroidFindBy(id="com.eco.global.app:id/tv_title")
    public MobileElement firmwareUpgrade;
    @iOSFindBy(xpath="//poppytest")
    @AndroidFindBy(id="com.eco.global.app:id/tv_cancel")
    public MobileElement firmwareUpgradeCancelBtn;



    public GuidePage(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


}
