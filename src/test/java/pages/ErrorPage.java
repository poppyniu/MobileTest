package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by poppy zhang on 2018/8/9.
 */
public class ErrorPage {
    @iOSFindBy(xpath = "")
    @AndroidFindBy(id="com.eco.global.app:id/tv_content")
    public MobileElement errorContent;
    @iOSFindBy(xpath = "")
    @AndroidFindBy(id="com.eco.global.app:id/tv_cancel")
    public MobileElement errorCancelBtn;
    @iOSFindBy(xpath = "")
    @AndroidFindBy(id="com.eco.global.app:id/tv_positive")
    public MobileElement errorViewBtn;
    @iOSFindBy(xpath = "")
    @AndroidFindBy(id="com.eco.global.app:id/mavelRoundBgView")
    public MobileElement manyErrorInfo;
    @iOSFindBy(xpath = "")
    @AndroidFindBy(id="com.eco.global.app:id/mavelRoundBgView")
    public MobileElement errorInfoPageTitle;
    @iOSFindBy(xpath = "")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_title")
    public List<MobileElement> errorTitleList;
    @iOSFindBy(xpath = "")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_contentcom.eco.global.app:id/tv_title")
    public List<MobileElement> errorContentList;
    @iOSFindBy(xpath = "")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtn;



    public ErrorPage(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


}
