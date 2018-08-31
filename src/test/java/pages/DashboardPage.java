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
public class DashboardPage {
    @iOSFindBy(xpath = "//*[@name='DEEBOT 705']")
    @AndroidFindBy(id="com.eco.global.app:id/robot_name")
    public MobileElement D700RobotName;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id="com.eco.global.app:id/actionbar_left")
    public MobileElement actionBarLeft;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id="com.eco.global.app:id/robot_status")
    public MobileElement robotStatus;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[2]")
    @AndroidFindBy(id="com.eco.global.app:id/robot_image")
    public MobileElement robotImageBtn;





    public DashboardPage(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


}
