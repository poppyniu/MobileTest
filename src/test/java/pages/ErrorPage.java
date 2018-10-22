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
    @AndroidFindBy(id="com.eco.global.app:id/titleContent")
    public MobileElement errorInfoPageTitle;
    @iOSFindBy(xpath = "")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_title")
    public List<MobileElement> errorTitleList;
    @iOSFindBy(xpath = "")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_content")
    public List<MobileElement> errorContentList;
    @iOSFindBy(xpath = "")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtn;
    @iOSFindBy(xpath = "")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[5]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
    public MobileElement manyErrorPageFifthElement;






    public ErrorPage(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


}
