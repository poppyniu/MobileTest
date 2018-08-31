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
public class MorePage {
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement cleanPower;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]")
    public MobileElement noDisturbMode;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[3]/android.widget.TextView[1]")
    public MobileElement cleanSchedule;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[4]/android.widget.TextView[1]")
    public MobileElement cleanlog;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[5]/android.widget.TextView[1]")
    public MobileElement accessoriesTime;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[6]/android.widget.TextView[1]")
    public MobileElement debootVoice;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[7]/android.widget.TextView[1]")
    public MobileElement rename;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[8]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[8]/android.widget.TextView[1]")
    public MobileElement useHelp;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[9]/android.widget.TextView[1]")
    public MobileElement debootInfo;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[10]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[10]/android.widget.TextView[1]")
    public MobileElement lookForDeboot;
    @iOSFindBy(xpath = "//*[@name=\"comnav back black\"]")
    //@iOSFindBy(xpath = "///XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnOnMorePage;


    //clean power page element
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement cancelBtnOnCleanPowerPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleOnCleanPowerPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/right")
    public MobileElement saveBtnOnCleanPowerPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement panel1OnCleanPowerPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement panel2OnCleanPowerPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_cleanspeed_tip")
    public MobileElement panel3OnCleanPowerPage;

    //do not disturb mode page element
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnOnNoDisturbPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleContentOnNoDisturbPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv")
    public MobileElement panel1OnNoDisturbPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/dnd_description")
    public MobileElement panel2OnNoDisturbPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/rl_switch")
    public MobileElement switchBtnOnNoDisturbPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/dnd_interval")
    public MobileElement noDisturbIntervalOnNoDisturbPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/disturb_start_time")
    public MobileElement startTimeOnNoDisturbPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/disturb_end_time")
    public MobileElement endTimeOnNoDisturbPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_home_hint")
    public MobileElement hintInfoOnNoDisturbPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/ib_cancel")
    public MobileElement cancelBtnOnStartTimeNoDisturbPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2] ")
    @AndroidFindBy(id = "com.eco.global.app:id/ib_ok")
    public MobileElement saveBtnOnStartTimeNoDisturbPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/ib_cancel")
    public MobileElement cancelBtnOnEndTimeNoDisturbPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/ib_ok")
    public MobileElement saveBtnOnEndTimeNoDisturbPage;


    //clean schedule page element
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnOnCleanSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/right")
    public MobileElement addScheduleBtnOnCleanSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleOnCleanSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_empty_hint")
    public MobileElement contentOnCleanSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/*")
    @AndroidFindBy(id = "com.eco.global.app:id/lly")
    public List<MobileElement> scheduleList;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_delete")
    public MobileElement delBtn;
    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_week")
    public List<MobileElement> everyWeekLabel;


    //add new schedule page element
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement cancelBtnOnAddNewSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleOnAddNewSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/right")
    public MobileElement saveBtnOnAddNewSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_type")
    public MobileElement scheduleTypeOnAddNewSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appointtype_value")
    public MobileElement autoCleanOnAddNewSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_time_setting")
    public MobileElement timeSettingOnAddNewSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_repeat_hint")
    public MobileElement repeatReatOnAddNewSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_repeat")
    public MobileElement repeatTimesOnAddNewSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypePicker[1]/XCUIElementTypePickerWheel[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.TimePicker[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.NumberPicker[1]/android.widget.EditText[1]")
    public MobileElement hourWheel;


    //repeat rate page element
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnOnRepeatRatePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleOnRepeatRatePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement panel1OnRepeatRatePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]")
    public MobileElement panel2OnRepeatRatePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.TextView[1]")
    public MobileElement panel3OnRepeatRatePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[4]/android.widget.TextView[1]")
    public MobileElement panel4OnRepeatRatePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[5]/android.widget.TextView[1]")
    public MobileElement panel5OnRepeatRatePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[6]/android.widget.TextView[1]")
    public MobileElement panel6OnRepeatRatePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[7]/android.widget.TextView[1]")
    public MobileElement panel7OnRepeatRatePage;

    //edit schedule page element
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleLabelOnEditSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement cancelBtnnEditSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/right")
    public MobileElement saveBtnnEditSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_type")
    public MobileElement scheduleTypeLabelnEditSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appointtype_value")
    public MobileElement autoCleanLabelnEditSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_time_setting")
    public MobileElement timeSettingLabelnEditSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_repeat_hint")
    public MobileElement frequencyLabelnEditSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_repeat")
    public MobileElement frequencyValueLabelnEditSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/btn_appoint_delete")
    public MobileElement delScheBtnInEditSchedulePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_content")
    public MobileElement alertBoxContent;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_cancel")
    public MobileElement getIt;

    //clean log page element
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleLabelOnCleanLogPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnOnCleanLogPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_cumulative_area_name")
    public MobileElement areaOnCleanLogPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_cumulative_times_name")
    public MobileElement timesOnCleanLogPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_cumulative_duration_name")
    public MobileElement totalDurationOnCleanLogPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement log1OnCleanLogPage;

    //clean log detail page element
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleOnCleanLogDetailPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnOnCleanLogDetailPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_areaname")
    public MobileElement areaOnCleanLogDetailPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[4]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_timename")
    public MobileElement totalDurationOnCleanLogDetailPage;

    //accessories time page element
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleOnAccessoriesPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnOnAccessoriesPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_reset_side_brush")
    public MobileElement reset1OnAccessoriesPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_side_brush")
    public MobileElement sideBrushOnAccessoriesPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_side_brush_desc")
    public MobileElement lefttime1OnAccessoriesPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_reset_roll_brush")
    public MobileElement reset2OnAccessoriesPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_roll_brush")
    public MobileElement rollBrushOnAccessoriesPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_roll_brush_desc")
    public MobileElement lefttime2OnAccessoriesPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_reset_hepa")
    public MobileElement reset3OnAccessoriesPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_hepa")
    public MobileElement filterElementOnAccessoriesPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_hepa_desc")
    public MobileElement lefttime3OnAccessoriesPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_content")
    public MobileElement alertLableOnAccessoriesPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_cancel")
    public MobileElement cancelBtnOnAccessoriesPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_positive")
    public MobileElement okBtnOnAccessoriesPage;

    //deboot voice page element
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleOnDebootVoicePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnOnDebootVoicePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/fun_name")
    public MobileElement debootVoiceOnDebootVoicePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_left")
    public MobileElement chooseLanguageOnDebootVoicePage;

    //rename page element
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleOnRenamePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement cancelBtnOnRenamePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/right")
    public MobileElement saveBtnOnRenamePage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_rename_hint")
    public MobileElement hintInfoOnRenamePage;

    //use help page element
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleOnUseHelpPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnOnUseHelpPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement tab1OnUseHelpPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[2]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]")
    public MobileElement tab2OnUseHelpPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[3]/XCUIElementTypeButton[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.TextView[1]")
    public MobileElement tab3OnUseHelpPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_no_faq")
    public MobileElement noQuestionlabelOnUseHelpPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_no_guide")
    public MobileElement noGuidelabelOnUseHelpPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]")
    public MobileElement downloadGuideOnUseHelpPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_no_video")
    public MobileElement noVideolabelOnUseHelpPage;

    //deboot info page element
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleOnDebootInfoPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnOnDebootInfoPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement firmwareVersionOnDebootInfoPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement snNumberOnDebootInfoPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement netInfoOnDebootInfoPage;

    //firmware version page element
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleOnFirmwareVersionPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnOnFirmwareVersionPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/fw_update_checking")
    public MobileElement checkingInfoOnFirmwareVersionPage;
    @iOSFindBy(xpath = "//poppytest")
    @AndroidFindBy(id = "com.eco.global.app:id/new_version_title")
    public MobileElement label1OnFirmwareVersionPage;
    @iOSFindBy(xpath = "//poppytest")
    @AndroidFindBy(id = "com.eco.global.app:id/version_number")
    public MobileElement label2OnFirmwareVersionPage;
    @iOSFindBy(xpath = "//poppytest")
    @AndroidFindBy(id = "com.eco.global.app:id/ota_new_version_desc")
    public MobileElement label3OnFirmwareVersionPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/update_status")
    public MobileElement latestVersionLableOnFirmwareVersionPage;
    @iOSFindBy(xpath = "//poppytest")
    @AndroidFindBy(id = "com.eco.global.app:id/update_btn")
    public MobileElement upgradeBtnOnFirmwareVersionPage;

    //network info page element
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleOnNetInfoPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnOnNetInfoPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement wifiNameOnNetInfoPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement wifiStrengthOnNetInfoPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement ipAddressOnNetInfoPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement wifiStrengthValueOnNetInfoPage;


    public MorePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


}
