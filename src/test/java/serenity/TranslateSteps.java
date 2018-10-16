package serenity;

import constants.JsonUtility;
import constants.Setup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.thucydides.core.annotations.Step;
import org.apache.http.entity.StringEntity;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by poppy zhang on 2018/8/9.
 */
public class TranslateSteps {
    AppiumDriver appiumDriver = Setup.appiumDriver;
    private Workbook workBook;
    private Sheet sheet;
    private Row row;
    DashboardPage dashboardPage = new DashboardPage(appiumDriver);
    SettingPage settingPage = new SettingPage(appiumDriver);
    LanguagePage languagePage = new LanguagePage(appiumDriver);
    CleanPage cleanPage = new CleanPage(appiumDriver);
    GuidePage guidePage = new GuidePage(appiumDriver);
    MorePage morePage = new MorePage(appiumDriver);
    ErrorPage errorPage = new ErrorPage(appiumDriver);
    List<String> everyWeek;

    @Step
    public void doTranslation(String language, String platform, String deebotType) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), DashboardPage.class);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), SettingPage.class);
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//*[@name='DEEBOT 711']"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/robot_name"), 60, platform);
            Thread.sleep(6000);
        }
        //get excel row content by column name
        ArrayList<String> excelList = getExcelRowItemByColumnName(language);
        String tmpLanguage = "";
        System.out.println("********** Begin translate language : " + language);
        if (language.equals("zh-CN中文")) {
            tmpLanguage = "简体中文";
        } else if (language.equals("en英文")) {
            tmpLanguage = "English";
        } else if (language.equals("de-DE德文")) {
            tmpLanguage = "Deutsch";
        } else if (language.equals("fr-FR法文")) {
            tmpLanguage = "Français";
        } else if (language.equals("he-IL希伯来文")) {
            tmpLanguage = "עברית";
        } else if (language.equals("it-IT意大利文")) {
            tmpLanguage = "Italiano";
        } else if (language.equals("ja-JP日文")) {
            tmpLanguage = "日本語";
        } else if (language.equals("ko-KR韩文")) {
            tmpLanguage = "한국어";
        } else if (language.equals("ms-MY马来文")) {
            tmpLanguage = "Bahasa Melayu";
        } else if (language.equals("pt-PT葡萄牙文")) {
            tmpLanguage = "Português";
        } else if (language.equals("ru-RU俄文")) {
            tmpLanguage = "Русский";
        } else if (language.equals("th-TH泰文")) {
            tmpLanguage = "ไทย";
        } else if (language.equals("zh-TW繁体中文")) {
            tmpLanguage = "繁體中文";
        } else if (language.equals("es-ES西班牙文")) {
            tmpLanguage = "Español";
        }
        //choose language and go back to dashboard page
        chooseLanguage(tmpLanguage, platform);
        //check dashboard page translate
        //dashboardPageTranslate(excelList);
        // check clean page translate
        cleanPageTranslate(excelList, platform, deebotType);
        //check more page translate
        morePageTranslate(excelList, platform, deebotType);
    }

    @Step
    public void doTranslationForError(String language, String platform, String deebotType) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), DashboardPage.class);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), SettingPage.class);
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//*[@name='DEEBOT 711']"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/robot_name"), 60, platform);
            Thread.sleep(6000);
        }
        //get excel row content by column name
        ArrayList<String> excelList = getExcelRowItemByColumnName(language);
        String tmpLanguage = "";
        System.out.println("********** Begin translate language : " + language);
        if (language.equals("zh-CN中文")) {
            tmpLanguage = "简体中文";
        } else if (language.equals("en英文")) {
            tmpLanguage = "English";
        } else if (language.equals("de-DE德文")) {
            tmpLanguage = "Deutsch";
        } else if (language.equals("fr-FR法文")) {
            tmpLanguage = "Français";
        } else if (language.equals("he-IL希伯来文")) {
            tmpLanguage = "עברית";
        } else if (language.equals("it-IT意大利文")) {
            tmpLanguage = "Italiano";
        } else if (language.equals("ja-JP日文")) {
            tmpLanguage = "日本語";
        } else if (language.equals("ko-KR韩文")) {
            tmpLanguage = "한국어";
        } else if (language.equals("ms-MY马来文")) {
            tmpLanguage = "Bahasa Melayu";
        } else if (language.equals("pt-PT葡萄牙文")) {
            tmpLanguage = "Português";
        } else if (language.equals("ru-RU俄文")) {
            tmpLanguage = "Русский";
        } else if (language.equals("th-TH泰文")) {
            tmpLanguage = "ไทย";
        } else if (language.equals("zh-TW繁体中文")) {
            tmpLanguage = "繁體中文";
        } else if (language.equals("es-ES西班牙文")) {
            tmpLanguage = "Español";
        }
        //choose language and go back to dashboard page
        chooseLanguage(tmpLanguage, platform);
        getIntoCleanPage(platform);
        //send 102 error request to 930
        StringEntity inputBody1 = new StringEntity("{\"errors\":\"102\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody1);
        Thread.sleep(3000);
        TranslateError(excelList, platform, deebotType);
        //send 103 error request to 930
        StringEntity inputBody2 = new StringEntity("{\"errors\":\"103\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody2);
        Thread.sleep(3000);
        TranslateError(excelList, platform, deebotType);
        //send 104 error request to 930
        StringEntity inputBody3 = new StringEntity("{\"errors\":\"104\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody3);
        Thread.sleep(3000);
        TranslateError(excelList, platform, deebotType);
        //send 105 error request to 930
        StringEntity inputBody4 = new StringEntity("{\"errors\":\"105\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody4);
        Thread.sleep(3000);
        TranslateError(excelList, platform, deebotType);
        //send 108 error request to 930
        StringEntity inputBody5 = new StringEntity("{\"errors\":\"108\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody5);
        Thread.sleep(3000);
        TranslateError(excelList, platform, deebotType);
        //send 109 error request to 930
        StringEntity inputBody6 = new StringEntity("{\"errors\":\"109\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody6);
        Thread.sleep(3000);
        TranslateError(excelList, platform, deebotType);
        //send 110 error request to 930
        StringEntity inputBody7 = new StringEntity("{\"errors\":\"110\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody7);
        Thread.sleep(3000);
        TranslateError(excelList, platform, deebotType);
        //send 111 error request to 930
        StringEntity inputBody8 = new StringEntity("{\"errors\":\"111\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody8);
        Thread.sleep(3000);
        TranslateError(excelList, platform, deebotType);
        //send 112 error request to 930
        StringEntity inputBody9 = new StringEntity("{\"errors\":\"112\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody9);
        Thread.sleep(3000);
        TranslateError(excelList, platform, deebotType);
        //send all 9 error request to 930
        StringEntity inputBody10 = new StringEntity("{\"errors\":\"102,103,104,105,108,109,110,111,112\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody10);
        Thread.sleep(3000);
        TranslateError(excelList, platform, deebotType);
        TranlateManyError(excelList, platform, deebotType);

    }

    private void getIntoCleanPage(String platform) throws InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), DashboardPage.class);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), CleanPage.class);
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//*[@name='DEEBOT 711']"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/robot_image"), 3, platform);
            Thread.sleep(5000);
        }
        dashboardPage.D700RobotName.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/tv_mode_name"), 3, platform);
            Thread.sleep(5000);
        }
    }

    private void TranlateManyError(ArrayList<String> excelList, String platform, String deebotType) throws InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), ErrorPage.class);
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/tv_content"), 60, platform);
            Thread.sleep(6000);
        }
        if (deebotType.equals("dr930")) {
            String manyErrorStr = errorPage.manyErrorInfo.getText();
            verifyTranslate(manyErrorStr, excelList, "many error");
            errorPage.manyErrorInfo.click();
            String errorInfoPageTitle = errorPage.errorInfoPageTitle.getText();
            String errorTitleStr1 = errorPage.errorTitleList.get(0).getText();
            System.out.println("00000000000errorTitleStr1"+errorTitleStr1);
            String errorContentStr1 = errorPage.errorContentList.get(0).getText();
            System.out.println("00000000000errorContentStr1"+errorContentStr1);
            String errorTitleStr2 = errorPage.errorTitleList.get(1).getText();
            String errorContentStr2 = errorPage.errorContentList.get(1).getText();
            String errorTitleStr3 = errorPage.errorTitleList.get(2).getText();
            String errorContentStr3 = errorPage.errorContentList.get(2).getText();
            String errorTitleStr4 = errorPage.errorTitleList.get(3).getText();
            String errorContentStr4 = errorPage.errorContentList.get(3).getText();
            String errorTitleStr5 = errorPage.errorTitleList.get(4).getText();
            String errorContentStr5 = errorPage.errorContentList.get(4).getText();
            String errorTitleStr6 = errorPage.errorTitleList.get(5).getText();
            String errorContentStr6 = errorPage.errorContentList.get(5).getText();
            verifyTranslate(errorInfoPageTitle, excelList, "many error");
            verifyTranslate(errorTitleStr1, excelList, "many error");
            verifyTranslate(errorContentStr1, excelList, "many error");
            verifyTranslate(errorTitleStr2, excelList, "many error");
            verifyTranslate(errorContentStr2, excelList, "many error");
            verifyTranslate(errorTitleStr3, excelList, "many error");
            verifyTranslate(errorContentStr3, excelList, "many error");
            verifyTranslate(errorTitleStr4, excelList, "many error");
            verifyTranslate(errorContentStr4, excelList, "many error");
            verifyTranslate(errorTitleStr5, excelList, "many error");
            verifyTranslate(errorContentStr5, excelList, "many error");
            verifyTranslate(errorTitleStr6, excelList, "many error");
            verifyTranslate(errorContentStr6, excelList, "many error");
            CommonPage.swipeToDirection(appiumDriver, "up");
            Thread.sleep(3000);
            String errorTitleStr7 = errorPage.errorTitleList.get(6).getText();
            String errorContentStr7 = errorPage.errorContentList.get(6).getText();
            String errorTitleStr8 = errorPage.errorTitleList.get(7).getText();
            String errorContentStr8 = errorPage.errorContentList.get(7).getText();
            String errorTitleStr9 = errorPage.errorTitleList.get(8).getText();
            String errorContentStr9 = errorPage.errorContentList.get(8).getText();
            verifyTranslate(errorTitleStr7, excelList, "many error");
            verifyTranslate(errorContentStr7, excelList, "many error");
            verifyTranslate(errorTitleStr8, excelList, "many error");
            verifyTranslate(errorContentStr8, excelList, "many error");
            verifyTranslate(errorTitleStr9, excelList, "many error");
            verifyTranslate(errorContentStr9, excelList, "many error");
            errorPage.backBtn.click();
        }
    }

    private void TranslateError(ArrayList<String> excelList, String platform, String deebotType) throws InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), ErrorPage.class);
        if (deebotType.equals("dr930")) {
            if (platform.equals("ios")) {
                CommonPage.waitForVisible(appiumDriver, (""), 60, platform);
            } else {
                CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/tv_content"), 60, platform);
                Thread.sleep(6000);
            }
            String errorContentStr = errorPage.errorContent.getText();
            String errorCancelStr = errorPage.errorCancelBtn.getText();
            String errorViewStr = errorPage.errorViewBtn.getText();
            verifyTranslate(errorContentStr, excelList, "error");
            verifyTranslate(errorCancelStr, excelList, "error");
            verifyTranslate(errorViewStr, excelList, "error");
            errorPage.errorCancelBtn.click();
            Thread.sleep(2000);
            String error2Str = errorPage.manyErrorInfo.getText();
            verifyTranslate(error2Str, excelList, "error");
        }
    }

    private void dashboardPageTranslate(ArrayList<String> excelList) throws InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), DashboardPage.class);
        String robotStatusStr = dashboardPage.robotStatus.getText();
        verifyTranslate(robotStatusStr, excelList, "dashboard");
    }

    private ArrayList<String> getExcelRowItemByColumnName(String language) throws Exception {
        InputStream inputStream = new FileInputStream("file/d700Translation.xlsx");
        ArrayList<String> excelList = new ArrayList<String>();
        workBook = new XSSFWorkbook(inputStream);
        sheet = workBook.getSheetAt(0);
        row = sheet.getRow(0);
        int rowNum = sheet.getLastRowNum();
        int colNum = row.getPhysicalNumberOfCells();
        int col = 0;
        if (language.equals("zh-CN中文")) {
            col = 0;
        } else if (language.equals("en英文")) {
            col = 1;
        } else if (language.equals("de-DE德文")) {
            col = 2;
        } else if (language.equals("fr-FR法文")) {
            col = 3;
        } else if (language.equals("he-IL希伯来文")) {
            col = 4;
        } else if (language.equals("it-IT意大利文")) {
            col = 5;
        } else if (language.equals("ja-JP日文")) {
            col = 6;
        } else if (language.equals("ko-KR韩文")) {
            col = 7;
        } else if (language.equals("ms-MY马来文")) {
            col = 8;
        } else if (language.equals("pt-PT葡萄牙文")) {
            col = 9;
        } else if (language.equals("ru-RU俄文")) {
            col = 10;
        } else if (language.equals("th-TH泰文")) {
            col = 11;
        } else if (language.equals("zh-TW繁体中文")) {
            col = 12;
        } else if (language.equals("es-ES西班牙文")) {
            col = 13;
        }
        for (int rowCount = 0; rowCount <= rowNum; rowCount++) {
            XSSFRow xssfRow = (XSSFRow) sheet.getRow(rowCount);
            if (xssfRow == null) {
                continue;
            }
            XSSFCell eRow = xssfRow.getCell(col);
            excelList.add(eRow.toString());
        }
        return excelList;
    }

    private void cleanPageTranslate(ArrayList<String> excelList, String platform, String deebotType) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), DashboardPage.class);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), CleanPage.class);
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//*[@name='DEEBOT 711']"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/robot_image"), 3, platform);
            Thread.sleep(5000);
        }
        dashboardPage.D700RobotName.click();
        Thread.sleep(8000);
        //first time login need to translate guide page
        //cancelUpgradeFirmware(platform);
        guidePageTranslate(excelList, platform, deebotType);
        if (deebotType.equals("d700")) {
            //wait clean page loading
            if (platform.equals("ios")) {
                CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"), 60, platform);
            } else {
                CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/tv_mode_name"), 20, platform);
                Thread.sleep(5000);
            }
            //auto clean page translate
            String cleanBtnStr = "";
            String autoCleanStr = cleanPage.autoClean.getText();
            String cleanWholeHouseStr = cleanPage.cleanWholeHouse.getText();
            if (platform.equals("ios")) {
                cleanBtnStr = cleanPage.autoButton.getAttribute("name");
            } else {
                cleanBtnStr = cleanPage.autoButton.getText();
            }
            verifyTranslate(autoCleanStr, excelList, "clean");
            verifyTranslate(cleanWholeHouseStr, excelList, "clean");
            verifyTranslate(cleanBtnStr, excelList, "clean");
            //spot clean page translate
            String spotCleanBtnStr = "";
            cleanPage.cleanPageSpotBtn.click();
            if (platform.equals("ios")) {
                spotCleanBtnStr = cleanPage.cleanPageSpotBtn.getAttribute("name");
            } else {
                spotCleanBtnStr = cleanPage.cleanPageSpotBtn.getText();
            }
            String spotCleanStr = cleanPage.spotCleanPanel.getText();
            String spotCleanStr1 = cleanPage.localCleanPanel.getText();
            verifyTranslate(spotCleanBtnStr, excelList, "clean");
            verifyTranslate(spotCleanStr, excelList, "clean");
            verifyTranslate(spotCleanStr1, excelList, "clean");
            //edge clean page translate
            String edgeCleanBtnStr = "";
            cleanPage.cleanPageEdgeBtn.click();
            if (platform.equals("ios")) {
                edgeCleanBtnStr = cleanPage.cleanPageEdgeBtn.getAttribute("name");
            } else {
                edgeCleanBtnStr = cleanPage.cleanPageEdgeBtn.getText();
            }
            String edgeCleanStr = cleanPage.edgeCleanPanel.getText();
            String edgeCleanStr1 = cleanPage.edgeCleanPanel1.getText();
            verifyTranslate(edgeCleanBtnStr, excelList, "clean");
            verifyTranslate(edgeCleanStr, excelList, "clean");
            verifyTranslate(edgeCleanStr1, excelList, "clean");
        } else if (deebotType.equals("dr930")) {
            //wait clean page loading
            if (platform.equals("ios")) {
                CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"), 60, platform);
            } else {
                CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/tv_mode_name"), 20, platform);
                Thread.sleep(5000);
            }
            String cleanPageStr1 = cleanPage.oneBtnCleanFor930.getText();
            String cleanPageStr2 = cleanPage.cleanWholeHouseFor930.getText();
            String cleanPageStr3 = cleanPage.buildTipFor930.getText();
            verifyTranslate(cleanPageStr1, excelList, "930 clean");
            verifyTranslate(cleanPageStr2, excelList, "930 clean");
            verifyTranslate(cleanPageStr3, excelList, "930 clean");
        }
    }

    private void morePageTranslate(ArrayList<String> excelList, String platform, String deebotType) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), CleanPage.class);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        cleanPage.cleanPageMoreBtn.click();
        Thread.sleep(6000);
        if (deebotType.equals("d700")) {
            String cleanPowerStr = morePage.cleanPower.getText();
            String noDisturbModeStr = morePage.noDisturbMode.getText();
            String cleanscheduleStr = morePage.cleanSchedule.getText();
            String cleanLogStr = morePage.cleanlog.getText();
            String accessoriesTimeStr = morePage.accessoriesTime.getText();
            String debootVoiceStr = morePage.debootVoice.getText();
            String renameStr = morePage.rename.getText();
            String useHelpStr = morePage.useHelp.getText();
            String debootInfoStr = morePage.debootInfo.getText();
            String lookForDebootStr = morePage.lookForDeboot.getText();
            verifyTranslate(cleanPowerStr, excelList, "more");
            verifyTranslate(noDisturbModeStr, excelList, "more");
            verifyTranslate(cleanscheduleStr, excelList, "more");
            verifyTranslate(cleanLogStr, excelList, "more");
            verifyTranslate(accessoriesTimeStr, excelList, "more");
            verifyTranslate(debootVoiceStr, excelList, "more");
            verifyTranslate(renameStr, excelList, "more");
            verifyTranslate(useHelpStr, excelList, "more");
            verifyTranslate(debootInfoStr, excelList, "more");
            verifyTranslate(lookForDebootStr, excelList, "more");
            //1:clean power page translate
            cleanPowerPageTranslate(excelList, platform, deebotType);
            //2:No disturb mode page translate
            noDisturbPageTranslate(excelList, platform, deebotType);
            //3:clean schedule translate
            cleanSchedulePageTranslate(excelList, platform, deebotType);
            //4:clean log page translate
            cleanLogPageTranslate(excelList, platform, deebotType);
            //5:accessories time page translate
            accessoriesTimePageTranslate(excelList, platform, deebotType);
            //6:deboot voice page translate
            debootVoicePageTranslate(excelList, platform, deebotType);
            //7:rename page translate
            renamePageTranslate(excelList, platform, deebotType);
            //8:use help page translate
            useHelpPageTranslate(excelList, platform, deebotType);
            //9:deboot info page translate
            debootInfoPageTranslate(excelList, platform, deebotType);
        } else if (deebotType.equals("dr930")) {
            String cleanPowerStr = morePage.cleanPowerOnMorePageFor930.getText();
            String waterAmountStr = morePage.waterAmountOnMorePageFor930.getText();
            String continueSweepStr = morePage.continueSweepOnMorePageFor930.getText();
            String noDisturbModeStr = morePage.noDisturbModeOnMorePageFor930.getText();
            String cleanscheduleStr = morePage.cleanScheduleOnMorePageFor930.getText();
            String resetMapStr = morePage.resetMapOnMorePageFor930.getText();
            String cleanLogStr = morePage.cleanLogOnMorePageFor930.getText();
            String accessoriesTimeStr = morePage.accessoriesTimeOnMorePageFor930.getText();
            String debootVoiceStr = morePage.deebotVoiceOnMorePageFor930.getText();
            String renameStr = morePage.renameOnMorePageFor930.getText();
            String useHelpStr = morePage.useHelpOnMorePageFor930.getText();
            String debootInfoStr = morePage.deebotInfoOnMorePageFor930.getText();
            String lookForDebootStr = morePage.lookForDeebotOnMorePageFor930.getText();
            verifyTranslate(cleanPowerStr, excelList, "more");
            verifyTranslate(waterAmountStr, excelList, "more");
            verifyTranslate(continueSweepStr, excelList, "more");
            verifyTranslate(noDisturbModeStr, excelList, "more");
            verifyTranslate(cleanscheduleStr, excelList, "more");
            verifyTranslate(resetMapStr, excelList, "more");
            verifyTranslate(cleanLogStr, excelList, "more");
            verifyTranslate(accessoriesTimeStr, excelList, "more");
            verifyTranslate(debootVoiceStr, excelList, "more");
            verifyTranslate(renameStr, excelList, "more");
            verifyTranslate(useHelpStr, excelList, "more");
            verifyTranslate(debootInfoStr, excelList, "more");
            verifyTranslate(lookForDebootStr, excelList, "more");
            //1:clean power page translate
            cleanPowerPageTranslate(excelList, platform, deebotType);
            //2:water amount page translate
            waterAmountPageTranslate(excelList, platform, deebotType);
            //3:continue sweep page translate
            continueSweepPageTranslate(excelList, platform, deebotType);
            //4:No disturb mode page translate
            noDisturbPageTranslate(excelList, platform, deebotType);
            //5:clean schedule translate
            cleanSchedulePageTranslate(excelList, platform, deebotType);
            //6:reset map translate
            resetMapPageTranslate(excelList, platform, deebotType);
            //7:clean log page translate
            cleanLogPageTranslate(excelList, platform, deebotType);
            //8:accessories time page translate
            accessoriesTimePageTranslate(excelList, platform, deebotType);
            //9:deboot voice page translate
            debootVoicePageTranslate(excelList, platform, deebotType);
            //10:rename page translate
            renamePageTranslate(excelList, platform, deebotType);
            //11:use help page translate
            useHelpPageTranslate(excelList, platform, deebotType);
            //12:deboot info page translate
            debootInfoPageTranslate(excelList, platform, deebotType);
        }

    }

    private void resetMapPageTranslate(ArrayList<String> excelList, String platform, String deebotType) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        if (deebotType.equals("dr930")) {
            morePage.resetMapOnMorePageFor930.click();
        }
        Thread.sleep(3000);
        String contentStr = morePage.resetMapContentFor930.getText();
        String cancelStr = morePage.resetMapCancelBtnFor930.getText();
        String resetStr = morePage.resetMapResetBtnFor930.getText();
        verifyTranslate(contentStr, excelList, "reset map");
        verifyTranslate(cancelStr, excelList, "reset map");
        verifyTranslate(resetStr, excelList, "reset map");
        morePage.resetMapCancelBtnFor930.click();

    }

    private void continueSweepPageTranslate(ArrayList<String> excelList, String platform, String deebotType) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        if (deebotType.equals("dr930")) {
            morePage.continueSweepOnMorePageFor930.click();
        }
        Thread.sleep(3000);
        if (platform.equals("ios")) {
            if (!CommonPage.waitElementVisible(appiumDriver, (""), 60, platform)) {
                morePage.switchBtnOnContinueSweepPageFor930.click();
            }
        } else {
            if (!CommonPage.waitElementVisible(appiumDriver, ("com.eco.global.app:id/tv_hint"), 20, platform)) {
                morePage.switchBtnOnContinueSweepPageFor930.click();
            }
            Thread.sleep(6000);
        }
        String titleStr = morePage.titleOnContinueSweepPageFor930.getText();
        String label1Str = morePage.label1OnContinueSweepPageFor930.getText();
        String label2Str = morePage.label2OnContinueSweepPageFor930.getText();
        String label3Str = morePage.label3OnContinueSweepPageFor930.getText();
        String label4Str = morePage.label4OnContinueSweepPageFor930.getText();
        verifyTranslate(titleStr, excelList, "continue sweep");
        verifyTranslate(label1Str, excelList, "continue sweep");
        verifyTranslate(label2Str, excelList, "continue sweep");
        verifyTranslate(label3Str, excelList, "continue sweep");
        verifyTranslate(label4Str, excelList, "continue sweep");
        morePage.backBtnOnContinueSweepPageFor930.click();
    }

    private void waterAmountPageTranslate(ArrayList<String> excelList, String platform, String deebotType) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        if (deebotType.equals("dr930")) {
            morePage.waterAmountOnMorePageFor930.click();
        }
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 3, platform);
            Thread.sleep(6000);
        }
        //translate sweep water amount page
        String cancelStr = morePage.cancelBtnOnWaterAmountPageFor930.getText();
        String titleStr = morePage.titleOnWaterAmountPageFor930.getText();
        String saveStr = morePage.saveBtnOnWaterAmountPageFor930.getText();
        String label1Str = morePage.label1OnWaterAmountPageFor930.getText();
        String label2Str = morePage.label2OnWaterAmountPageFor930.getText();
        String label3Str = morePage.label3OnWaterAmountPageFor930.getText();
        String label4Str = morePage.label4OnWaterAmountPageFor930.getText();
        String label5Str = morePage.label5OnWaterAmountPageFor930.getText();
        String btnStr = morePage.startGuideBtnOnWaterAmountPageFor930.getText();
        verifyTranslate(cancelStr, excelList, "water amount");
        verifyTranslate(titleStr, excelList, "water amount");
        verifyTranslate(saveStr, excelList, "water amount");
        verifyTranslate(label1Str, excelList, "water amount");
        verifyTranslate(label2Str, excelList, "water amount");
        verifyTranslate(label3Str, excelList, "water amount");
        verifyTranslate(label4Str, excelList, "water amount");
        verifyTranslate(label5Str, excelList, "water amount");
        verifyTranslate(btnStr, excelList, "water amount");
        //translate sweep water amount guide page
        morePage.startGuideBtnOnWaterAmountPageFor930.click();
        String guide1Label1Str = morePage.stepTitleOnWaterAmountPageFor930.getText();
        String guide1Label2Str = morePage.stepContentOnWaterAmountPageFor930.getText();
        verifyTranslate(guide1Label1Str, excelList, "water amount");
        verifyTranslate(guide1Label2Str, excelList, "water amount");
        //swipe left to go ro the second guide page
        CommonPage.swipeElementToLeft(appiumDriver, morePage.stepContentOnWaterAmountPageFor930);
        Thread.sleep(1000);
        String guide2Label1Str = morePage.stepTitleOnWaterAmountPageFor930.getText();
        String guide2Label2Str = morePage.stepContentOnWaterAmountPageFor930.getText();
        verifyTranslate(guide2Label1Str, excelList, "water amount");
        verifyTranslate(guide2Label2Str, excelList, "water amount");
        //swipe left to go ro the third guide page
        CommonPage.swipeElementToLeft(appiumDriver, morePage.stepContentOnWaterAmountPageFor930);
        Thread.sleep(1000);
        String guide3Label1Str = morePage.stepTitleOnWaterAmountPageFor930.getText();
        String guide3Label2Str = morePage.stepContentOnWaterAmountPageFor930.getText();
        verifyTranslate(guide3Label1Str, excelList, "water amount");
        verifyTranslate(guide3Label2Str, excelList, "water amount");
        //swipe left to go ro the fourth guide page
        CommonPage.swipeElementToLeft(appiumDriver, morePage.stepContentOnWaterAmountPageFor930);
        Thread.sleep(1000);
        String guide4Label1Str = morePage.stepTitleOnWaterAmountPageFor930.getText();
        String guide4Label2Str = morePage.stepContentOnWaterAmountPageFor930.getText();
        String guide4BtnStr = morePage.step4BtnOnWaterAmountPageFor930.getText();
        verifyTranslate(guide4Label1Str, excelList, "water amount");
        verifyTranslate(guide4Label2Str, excelList, "water amount");
        verifyTranslate(guide4BtnStr, excelList, "water amount");
        morePage.step4BtnOnWaterAmountPageFor930.click();
        morePage.cancelBtnOnWaterAmountPageFor930.click();
    }

    private void debootInfoPageTranslate(ArrayList<String> excelList, String platform, String deebotType) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        if (deebotType.equals("d700")) {
            morePage.debootInfo.click();
        } else if (deebotType.equals("dr930")) {
            morePage.deebotInfoOnMorePageFor930.click();
        }
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 3, platform);
            Thread.sleep(6000);
        }
        String titleStr = morePage.titleOnDebootInfoPage.getText();
        String label1Str = morePage.firmwareVersionOnDebootInfoPage.getText();
        String label2Str = morePage.snNumberOnDebootInfoPage.getText();
        String label3Str = morePage.netInfoOnDebootInfoPage.getText();
        verifyTranslate(titleStr, excelList, "deboot info");
        verifyTranslate(label1Str, excelList, "deboot info");
        verifyTranslate(label2Str, excelList, "deboot info");
        verifyTranslate(label3Str, excelList, "deboot info");
        //translate firmware version page
        morePage.firmwareVersionOnDebootInfoPage.click();
        String infoStr = morePage.checkingInfoOnFirmwareVersionPage.getText();
        verifyTranslate(infoStr, excelList, "deboot info");
        Thread.sleep(6000);
        if (platform.equals("ios")) {
            if (CommonPage.waitElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"), 60, platform)) {
                String title1Str = morePage.titleOnFirmwareVersionPage.getText();
                String latesetLableStr = morePage.latestVersionLableOnFirmwareVersionPage.getText().replaceAll("\\d+", "").replace(" ", "").replace(".", "");
                verifyTranslate(title1Str, excelList, "firmware version");
                verifyTranslate(latesetLableStr, excelList, "firmware version");
            } else {
                String title1Str = morePage.titleOnFirmwareVersionPage.getText();
                String label4Str = morePage.label1OnFirmwareVersionPage.getText();
                String[] label5Str = morePage.label2OnFirmwareVersionPage.getText().replaceAll("\\d+", "").replace(" ", "").replace("\r", "").replace("\n", "").replace(".", "").split(":");
                ;
                for (int i = 0; i < label5Str.length; i++) {
                    String label1 = label5Str[i] + ":";
                    verifyTranslate(label1, excelList, "firmware version");
                }
                String label7Str = morePage.label3OnFirmwareVersionPage.getText();
                //String label8Str = morePage.label4OnFirmwareVersionPage.getText();
                String btnStr = morePage.upgradeBtnOnFirmwareVersionPage.getText();
                verifyTranslate(title1Str, excelList, "firmware version");
                verifyTranslate(label4Str, excelList, "firmware version");
                verifyTranslate(label7Str, excelList, "firmware version");
                verifyTranslate(btnStr, excelList, "firmware version");
            }
        } else {
            if (CommonPage.waitElementVisible(appiumDriver, ("com.eco.global.app:id/update_status"), 30, platform)) {
                String title1Str = morePage.titleOnFirmwareVersionPage.getText();
                String latesetLableStr = morePage.latestVersionLableOnFirmwareVersionPage.getText().replaceAll("\\d+", "").replace(" ", "").replace(".", "");
                verifyTranslate(title1Str, excelList, "firmware version");
                verifyTranslate(latesetLableStr, excelList, "firmware version");
            } else {
                String title1Str = morePage.titleOnFirmwareVersionPage.getText();
                String label4Str = morePage.label1OnFirmwareVersionPage.getText();
                String[] label5Str = morePage.label2OnFirmwareVersionPage.getText().replaceAll("\\d+", "").replace(" ", "").replace("\r", "").replace("\n", "").replace(".", "").split(":");
                ;
                for (int i = 0; i < label5Str.length; i++) {
                    String label1 = label5Str[i] + ":";
                    verifyTranslate(label1, excelList, "firmware version");
                }
                String label7Str = morePage.label3OnFirmwareVersionPage.getText();
                //String label8Str = morePage.label4OnFirmwareVersionPage.getText();
                String btnStr = morePage.upgradeBtnOnFirmwareVersionPage.getText();
                verifyTranslate(title1Str, excelList, "firmware version");
                verifyTranslate(label4Str, excelList, "firmware version");
                verifyTranslate(label7Str, excelList, "firmware version");
                verifyTranslate(btnStr, excelList, "firmware version");
            }
            Thread.sleep(6000);
        }

        morePage.backBtnOnFirmwareVersionPage.click();
        Thread.sleep(5000);
        //translate network info
        morePage.netInfoOnDebootInfoPage.click();
        Thread.sleep(8000);
        String title2Str = morePage.titleOnNetInfoPage.getText();
        String wifiNameStr = morePage.wifiNameOnNetInfoPage.getText();
        String wifiStrengthStr = morePage.wifiStrengthOnNetInfoPage.getText();
        String ipStr = morePage.ipAddressOnNetInfoPage.getText();
        String wifiStrengthValueStr = morePage.wifiStrengthValueOnNetInfoPage.getText();
        verifyTranslate(title2Str, excelList, "network info");
        verifyTranslate(wifiNameStr, excelList, "network info");
        verifyTranslate(wifiStrengthStr, excelList, "network info");
        verifyTranslate(ipStr, excelList, "network info");
        verifyTranslate(wifiStrengthValueStr, excelList, "network info");
        morePage.backBtnOnNetInfoPage.click();
        Thread.sleep(3000);
        morePage.backBtnOnDebootInfoPage.click();
        Thread.sleep(3000);
        morePage.backBtnOnMorePage.click();
        Thread.sleep(3000);
        cleanPage.cleanPageBackBtn.click();
        Thread.sleep(3000);
    }

    private void useHelpPageTranslate(ArrayList<String> excelList, String platform, String deebotType) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        if (deebotType.equals("d700")) {
            morePage.useHelp.click();
        } else if (deebotType.equals("dr930")) {
            morePage.useHelpOnMorePageFor930.click();
        }
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 20, platform);
            Thread.sleep(6000);
        }
        String titleStr = morePage.titleOnUseHelpPage.getText();
        String tab1Str = morePage.tab1OnUseHelpPage.getText();
        String tab2Str = morePage.tab2OnUseHelpPage.getText();
        String lable1Str = morePage.noQuestionlabelOnUseHelpPage.getText();
        verifyTranslate(titleStr, excelList, "use help");
        verifyTranslate(tab1Str, excelList, "use help");
        verifyTranslate(tab2Str, excelList, "use help");
        verifyTranslate(lable1Str, excelList, "use help");
        //translate use guide tab page
        morePage.tab2OnUseHelpPage.click();
        Thread.sleep(5000);
        String label2Str = morePage.noGuidelabelOnUseHelpPage.getText();
        //String label3Str = morePage.downloadGuideOnUseHelpPage.getText();
        verifyTranslate(label2Str, excelList, "use help");
        //verifyTranslate(label3Str, excelList, "use help");
        //translate use video tab page
        morePage.tab3OnUseHelpPage.click();
        Thread.sleep(5000);
        String tab3Str = morePage.tab3OnUseHelpPage.getText();
        verifyTranslate(tab3Str, excelList, "use help");
        String label4Str = morePage.noVideolabelOnUseHelpPage.getText();
        verifyTranslate(label4Str, excelList, "use help");
        morePage.backBtnOnUseHelpPage.click();
        Thread.sleep(5000);
    }

    private void renamePageTranslate(ArrayList<String> excelList, String platform, String deebotType) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        if (deebotType.equals("d700")) {
            morePage.rename.click();
        } else if (deebotType.equals("dr930")) {
            morePage.renameOnMorePageFor930.click();
        }
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 3, platform);
            Thread.sleep(6000);
        }
        String titleStr = morePage.titleOnRenamePage.getText();
        String cancelStr = morePage.cancelBtnOnRenamePage.getText();
        String saveStr = morePage.saveBtnOnRenamePage.getText();
        String hintStr = morePage.hintInfoOnRenamePage.getText();
        verifyTranslate(titleStr, excelList, "rename");
        verifyTranslate(cancelStr, excelList, "rename");
        verifyTranslate(saveStr, excelList, "rename");
        verifyTranslate(hintStr, excelList, "rename");
        morePage.cancelBtnOnRenamePage.click();
        Thread.sleep(5000);
    }

    private void debootVoicePageTranslate(ArrayList<String> excelList, String platform, String deebotType) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        if (deebotType.equals("d700")) {
            morePage.debootVoice.click();
        } else if (deebotType.equals("dr930")) {
            morePage.deebotVoiceOnMorePageFor930.click();
        }
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 6, platform);
            Thread.sleep(6000);
        }
        String titleStr = morePage.titleOnDebootVoicePage.getText();
        String debootVoviceStr = morePage.debootVoiceOnDebootVoicePage.getText();
        String chooseLanguageStr = morePage.chooseLanguageOnDebootVoicePage.getText();
        verifyTranslate(titleStr, excelList, "deboot voice");
        verifyTranslate(debootVoviceStr, excelList, "deboot voice");
        verifyTranslate(chooseLanguageStr, excelList, "deboot voice");
        morePage.backBtnOnDebootVoicePage.click();
        Thread.sleep(5000);
    }

    private void accessoriesTimePageTranslate(ArrayList<String> excelList, String platform, String deebotType) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        if (deebotType.equals("d700")) {
            morePage.accessoriesTime.click();
        } else if (deebotType.equals("dr930")) {
            morePage.accessoriesTimeOnMorePageFor930.click();
        }
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 6, platform);
            Thread.sleep(6000);
        }
        String titleStr = morePage.titleOnAccessoriesPage.getText();
        String resetStr1 = morePage.reset1OnAccessoriesPage.getText();
        String resetStr2 = morePage.reset2OnAccessoriesPage.getText();
        String resetStr3 = morePage.reset3OnAccessoriesPage.getText();
        String sideBrushStr = morePage.sideBrushOnAccessoriesPage.getText();
        String rollBrushStr = morePage.rollBrushOnAccessoriesPage.getText();
        String filterStr = morePage.filterElementOnAccessoriesPage.getText();
        //translate left time for side brush
        String leftTimeStr1 = morePage.lefttime1OnAccessoriesPage.getText();
        char ss[] = leftTimeStr1.toCharArray();
        loop:
        for (int i = 0; i < ss.length; i++) {
            if (String.valueOf(ss[i]).equals("0") || String.valueOf(ss[i]).equals("1") || String.valueOf(ss[i]).equals("2") || String.valueOf(ss[i]).equals("3") || String.valueOf(ss[i]).equals("4") || String.valueOf(ss[i]).equals("5") || String.valueOf(ss[i]).equals("6") || String.valueOf(ss[i]).equals("7") || String.valueOf(ss[i]).equals("8") || String.valueOf(ss[i]).equals("9")) {
                verifyTranslate(leftTimeStr1.substring(0, i), excelList, "accessories time");
                break;
            }
        }
        loop1:
        for (int i = ss.length - 1; i > 0; i--) {
            if (String.valueOf(ss[i]).equals("0") || String.valueOf(ss[i]).equals("1") || String.valueOf(ss[i]).equals("2") || String.valueOf(ss[i]).equals("3") || String.valueOf(ss[i]).equals("4") || String.valueOf(ss[i]).equals("5") || String.valueOf(ss[i]).equals("6") || String.valueOf(ss[i]).equals("7") || String.valueOf(ss[i]).equals("8") || String.valueOf(ss[i]).equals("9")) {
                verifyTranslate(leftTimeStr1.substring(i + 1, ss.length), excelList, "accessories time");
                break;
            }
        }
        //translate left time for roll brush
        String leftTimeStr2 = morePage.lefttime2OnAccessoriesPage.getText();
        char ss2[] = leftTimeStr2.toCharArray();
        loop:
        for (int i = 0; i < ss2.length; i++) {
            if (String.valueOf(ss2[i]).equals("0") || String.valueOf(ss2[i]).equals("1") || String.valueOf(ss2[i]).equals("2") || String.valueOf(ss2[i]).equals("3") || String.valueOf(ss2[i]).equals("4") || String.valueOf(ss2[i]).equals("5") || String.valueOf(ss2[i]).equals("6") || String.valueOf(ss2[i]).equals("7") || String.valueOf(ss2[i]).equals("8") || String.valueOf(ss2[i]).equals("9")) {
                verifyTranslate(leftTimeStr2.substring(0, i), excelList, "accessories time");
                break;
            }
        }
        loop1:
        for (int i = ss2.length - 1; i > 0; i--) {
            if (String.valueOf(ss2[i]).equals("0") || String.valueOf(ss2[i]).equals("1") || String.valueOf(ss2[i]).equals("2") || String.valueOf(ss2[i]).equals("3") || String.valueOf(ss2[i]).equals("4") || String.valueOf(ss2[i]).equals("5") || String.valueOf(ss2[i]).equals("6") || String.valueOf(ss2[i]).equals("7") || String.valueOf(ss2[i]).equals("8") || String.valueOf(ss2[i]).equals("9")) {
                verifyTranslate(leftTimeStr2.substring(i + 1, ss.length), excelList, "accessories time");
                break;
            }
        }
        //translate left time for filter element
        String leftTimeStr3 = morePage.lefttime3OnAccessoriesPage.getText();
        char ss3[] = leftTimeStr3.toCharArray();
        loop:
        for (int i = 0; i < ss3.length; i++) {
            if (String.valueOf(ss3[i]).equals("0") || String.valueOf(ss3[i]).equals("1") || String.valueOf(ss3[i]).equals("2") || String.valueOf(ss3[i]).equals("3") || String.valueOf(ss3[i]).equals("4") || String.valueOf(ss3[i]).equals("5") || String.valueOf(ss3[i]).equals("6") || String.valueOf(ss3[i]).equals("7") || String.valueOf(ss3[i]).equals("8") || String.valueOf(ss3[i]).equals("9")) {
                verifyTranslate(leftTimeStr3.substring(0, i), excelList, "accessories time");
                break;
            }
        }
        loop1:
        for (int i = ss3.length - 1; i > 0; i--) {
            if (String.valueOf(ss3[i]).equals("0") || String.valueOf(ss3[i]).equals("1") || String.valueOf(ss3[i]).equals("2") || String.valueOf(ss3[i]).equals("3") || String.valueOf(ss3[i]).equals("4") || String.valueOf(ss3[i]).equals("5") || String.valueOf(ss3[i]).equals("6") || String.valueOf(ss3[i]).equals("7") || String.valueOf(ss3[i]).equals("8") || String.valueOf(ss3[i]).equals("9")) {
                verifyTranslate(leftTimeStr3.substring(i + 1, ss.length), excelList, "accessories time");
                break;
            }
        }
        verifyTranslate(titleStr, excelList, "accessories time");
        verifyTranslate(resetStr1, excelList, "accessories time");
        verifyTranslate(resetStr2, excelList, "accessories time");
        verifyTranslate(resetStr3, excelList, "accessories time");
        verifyTranslate(sideBrushStr, excelList, "accessories time");
        verifyTranslate(sideBrushStr, excelList, "accessories time");
        verifyTranslate(rollBrushStr, excelList, "accessories time");
        verifyTranslate(filterStr, excelList, "accessories time");
        //reset side brush translate
        morePage.reset1OnAccessoriesPage.click();
        Thread.sleep(5000);
        String alertLableStr1 = morePage.alertLableOnAccessoriesPage.getText();
        String cancelStr1 = morePage.cancelBtnOnAccessoriesPage.getText();
        String okStr1 = morePage.okBtnOnAccessoriesPage.getText();
        verifyTranslate(alertLableStr1, excelList, "accessories time");
        verifyTranslate(cancelStr1, excelList, "accessories time");
        verifyTranslate(okStr1, excelList, "accessories time");
        morePage.cancelBtnOnAccessoriesPage.click();
        Thread.sleep(2000);
        //reset roll brush translate
        morePage.reset2OnAccessoriesPage.click();
        Thread.sleep(5000);
        String alertLableStr2 = morePage.alertLableOnAccessoriesPage.getText();
        String cancelStr2 = morePage.cancelBtnOnAccessoriesPage.getText();
        String okStr2 = morePage.okBtnOnAccessoriesPage.getText();
        verifyTranslate(alertLableStr2, excelList, "accessories time");
        verifyTranslate(cancelStr2, excelList, "accessories time");
        verifyTranslate(okStr2, excelList, "accessories time");
        morePage.cancelBtnOnAccessoriesPage.click();
        Thread.sleep(2000);
        //reset filter element translate
        morePage.reset3OnAccessoriesPage.click();
        Thread.sleep(5000);
        String alertLableStr3 = morePage.alertLableOnAccessoriesPage.getText();
        String cancelStr3 = morePage.cancelBtnOnAccessoriesPage.getText();
        String okStr3 = morePage.okBtnOnAccessoriesPage.getText();
        verifyTranslate(alertLableStr3, excelList, "accessories time");
        verifyTranslate(cancelStr3, excelList, "accessories time");
        verifyTranslate(okStr3, excelList, "accessories time");
        morePage.cancelBtnOnAccessoriesPage.click();
        Thread.sleep(2000);
        morePage.backBtnOnAccessoriesPage.click();
        Thread.sleep(5000);
    }

    private void cleanLogPageTranslate(ArrayList<String> excelList, String platform, String deebotType) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        if (deebotType.equals("d700")) {
            morePage.cleanlog.click();
        } else if (deebotType.equals("dr930")) {
            morePage.cleanLogOnMorePageFor930.click();
        }
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 50, platform);
            Thread.sleep(6000);
        }
        String titleStr = morePage.titleLabelOnCleanLogPage.getText();
        String areaStr = morePage.areaOnCleanLogPage.getText();
        String timesStr = morePage.timesOnCleanLogPage.getText();
        String totalDurationStr = morePage.totalDurationOnCleanLogPage.getText();
        verifyTranslate(titleStr, excelList, "clean log");
        verifyTranslate(areaStr, excelList, "clean log");
        verifyTranslate(timesStr, excelList, "clean log");
        verifyTranslate(totalDurationStr, excelList, "clean log");
        morePage.log1OnCleanLogPage.click();
        Thread.sleep(5000);
        String titleStr1 = morePage.titleOnCleanLogDetailPage.getText();
        String areaStr1 = morePage.areaOnCleanLogDetailPage.getText();
        String totalDurationStr1 = morePage.totalDurationOnCleanLogDetailPage.getText();
        verifyTranslate(titleStr1, excelList, "clean log detail");
        verifyTranslate(areaStr1, excelList, "clean log detail");
        verifyTranslate(totalDurationStr1, excelList, "clean log detail");
        morePage.backBtnOnCleanLogDetailPage.click();
        Thread.sleep(6000);
        morePage.backBtnOnCleanLogPage.click();
        Thread.sleep(5000);

    }

    private void cleanSchedulePageTranslate(ArrayList<String> excelList, String platform, String deebotType) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), CleanPage.class);
        if (deebotType.equals("d700")) {
            morePage.cleanSchedule.click();
        } else if (deebotType.equals("dr930")) {
            morePage.cleanScheduleOnMorePageFor930.click();
        }
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 10, platform);
            Thread.sleep(6000);
        }
        if (CommonPage.elementExist(morePage.titleOnCleanSchedulePage)) {
            //clean schedule page translate
            String titleStr = morePage.titleOnCleanSchedulePage.getText();
            String contentStr = morePage.contentOnCleanSchedulePage.getText();
            verifyTranslate(titleStr, excelList, "clean schedule");
            verifyTranslate(contentStr, excelList, "clean schedule");
        }
        //and new clean schedule and translate
        morePage.addScheduleBtnOnCleanSchedulePage.click();
        Thread.sleep(3000);
        String cancelStr = morePage.cancelBtnOnAddNewSchedulePage.getText();
        String titleStr = morePage.titleOnAddNewSchedulePage.getText();
        String saveStr = morePage.saveBtnOnAddNewSchedulePage.getText();
        String scheduleTypeStr = morePage.scheduleTypeOnAddNewSchedulePage.getText();
        String autoCleanStr = morePage.autoCleanOnAddNewSchedulePage.getText();
        String timeSettingStr = morePage.timeSettingOnAddNewSchedulePage.getText();
        String repeatRateStr = morePage.repeatReatOnAddNewSchedulePage.getText();
        String oneTimeStr = morePage.repeatTimesOnAddNewSchedulePage.getText();
        verifyTranslate(cancelStr, excelList, "add new schedule");
        verifyTranslate(titleStr, excelList, "add new schedule");
        verifyTranslate(saveStr, excelList, "add new schedule");
        verifyTranslate(scheduleTypeStr, excelList, "add new schedule");
        verifyTranslate(autoCleanStr, excelList, "add new schedule");
        verifyTranslate(timeSettingStr, excelList, "add new schedule");
        verifyTranslate(repeatRateStr, excelList, "add new schedule");
        verifyTranslate(oneTimeStr, excelList, "add new schedule");
        //repeat rate page translate
        morePage.repeatReatOnAddNewSchedulePage.click();
        Thread.sleep(5000);
        String repeatRateTitleStr = morePage.titleOnRepeatRatePage.getText();
        String weekDayStr1 = morePage.panel1OnRepeatRatePage.getText();
        String weekDayStr2 = morePage.panel2OnRepeatRatePage.getText();
        String weekDayStr3 = morePage.panel3OnRepeatRatePage.getText();
        String weekDayStr4 = morePage.panel4OnRepeatRatePage.getText();
        String weekDayStr5 = morePage.panel5OnRepeatRatePage.getText();
        String weekDayStr6 = morePage.panel6OnRepeatRatePage.getText();
        String weekDayStr7 = morePage.panel7OnRepeatRatePage.getText();
        verifyTranslate(repeatRateTitleStr, excelList, "repeat rate");
        verifyTranslate(weekDayStr1, excelList, "repeat rate");
        verifyTranslate(weekDayStr2, excelList, "repeat rate");
        verifyTranslate(weekDayStr3, excelList, "repeat rate");
        verifyTranslate(weekDayStr4, excelList, "repeat rate");
        verifyTranslate(weekDayStr5, excelList, "repeat rate");
        verifyTranslate(weekDayStr6, excelList, "repeat rate");
        verifyTranslate(weekDayStr7, excelList, "repeat rate");
        morePage.backBtnOnRepeatRatePage.click();
        morePage.cancelBtnOnAddNewSchedulePage.click();
        Thread.sleep(4000);
        //add different kind of clean schedule and check translate result
        delSchedule(appiumDriver, platform);
        //choose every sunday and check translate
        everyWeek = new ArrayList<>();
        everyWeek.add("周日");
        addScheduleAndValidation(appiumDriver, everyWeek, excelList, platform);
        //verify delete
        if (platform.equals("ios")) {
            CommonPage.swipeElementToLeft(appiumDriver, morePage.scheduleList.get(1));
        } else {
            CommonPage.swipeElementToLeft(appiumDriver, morePage.scheduleList.get(0));
        }
        String deleteBtnStr = morePage.delBtn.getText();
        verifyTranslate(deleteBtnStr, excelList, "delete schedule");
        if (platform.equals("ios")) {
            morePage.scheduleList.get(1).click();
        } else {
            morePage.scheduleList.get(0).click();
        }
        //get into edit mode
        if (platform.equals("ios")) {
            morePage.scheduleList.get(1).click();
        } else {
            morePage.scheduleList.get(0).click();
        }
        //标题
        String editScheTitle = morePage.titleLabelOnEditSchedulePage.getText();
        verifyTranslate(editScheTitle, excelList, "edit schedule");
        //取消
        String editScheCancel = morePage.cancelBtnnEditSchedulePage.getText();
        verifyTranslate(editScheCancel, excelList, "edit schedule");
        //保存
        String editScheSave = morePage.saveBtnnEditSchedulePage.getText();
        verifyTranslate(editScheSave, excelList, "edit schedule");
        //预约类型
        String editScheType = morePage.scheduleTypeLabelnEditSchedulePage.getText();
        verifyTranslate(editScheType, excelList, "edit schedule");
        //自动清扫
        String editScheAutoClean = morePage.autoCleanLabelnEditSchedulePage.getText();
        verifyTranslate(editScheAutoClean, excelList, "edit schedule");
        //时间设置
        String editScheTimeSet = morePage.timeSettingLabelnEditSchedulePage.getText();
        verifyTranslate(editScheTimeSet, excelList, "edit schedule");
        //重复频率
        String editScheFrequency = morePage.frequencyLabelnEditSchedulePage.getText();
        verifyTranslate(editScheFrequency, excelList, "edit schedule");
        //重复频率值-周日
        String editScheFrequencyValue = morePage.frequencyValueLabelnEditSchedulePage.getText();
        verifyTranslate(editScheFrequencyValue, excelList, "edit schedule");
        //删除预约
        String delSche = morePage.delScheBtnInEditSchedulePage.getText();
        verifyTranslate(delSche, excelList, "edit schedule");
        morePage.delScheBtnInEditSchedulePage.click();
        Thread.sleep(5000);

        //选择每周一,查看重复频率是否为周一
        everyWeek.clear();
        everyWeek.add("周一");
        addScheduleAndValidation(appiumDriver, everyWeek, excelList, platform);

        //选择每周二,查看重复频率是否为周二
        everyWeek.clear();
        everyWeek.add("周二");
        addScheduleAndValidation(appiumDriver, everyWeek, excelList, platform);

        //选择每周三,查看重复频率是否为周三
        everyWeek.clear();
        everyWeek.add("周三");
        addScheduleAndValidation(appiumDriver, everyWeek, excelList, platform);

        //选择每周四,查看重复频率是否为周四
        everyWeek.clear();
        everyWeek.add("周四");
        addScheduleAndValidation(appiumDriver, everyWeek, excelList, platform);

        //选择每周五,查看重复频率是否为周五
        everyWeek.clear();
        everyWeek.add("周五");
        addScheduleAndValidation(appiumDriver, everyWeek, excelList, platform);

        //选择每周六,查看重复频率是否为周六
        everyWeek.clear();
        everyWeek.add("周六");
        addScheduleAndValidation(appiumDriver, everyWeek, excelList, platform);

        //选择每周六和日,查看重复频率是否为周末
        everyWeek.clear();
        everyWeek.add("周日");
        everyWeek.add("周六");
        addScheduleAndValidation(appiumDriver, everyWeek, excelList, platform);
        delSchedule(appiumDriver, platform);

        //选择每周一到五,查看重复频率是否为工作日
        everyWeek.clear();
        everyWeek.add("周一");
        everyWeek.add("周二");
        everyWeek.add("周三");
        everyWeek.add("周四");
        everyWeek.add("周五");
        addScheduleAndValidation(appiumDriver, everyWeek, excelList, platform);

        //选择所有,查看重复频率是否每天
        everyWeek.clear();
        everyWeek.add("周日");
        everyWeek.add("周一");
        everyWeek.add("周二");
        everyWeek.add("周三");
        everyWeek.add("周四");
        everyWeek.add("周五");
        everyWeek.add("周六");
        addScheduleAndValidation(appiumDriver, everyWeek, excelList, platform);
        delSchedule(appiumDriver, platform);

        //周日和周一
        everyWeek.clear();
        everyWeek.add("周日");
        everyWeek.add("周一");
        addScheduleAndValidation(appiumDriver, everyWeek, excelList, platform);
        delSchedule(appiumDriver, platform);

        //周二,周三和周四
        everyWeek.clear();
        everyWeek.add("周二");
        everyWeek.add("周三");
        everyWeek.add("周四");
        addScheduleAndValidation(appiumDriver, everyWeek, excelList, platform);
        delSchedule(appiumDriver, platform);

        //周三,周四,周五和周六
        everyWeek.clear();
        everyWeek.add("周三");
        everyWeek.add("周四");
        everyWeek.add("周五");
        everyWeek.add("周六");
        addScheduleAndValidation(appiumDriver, everyWeek, excelList, platform);
        delSchedule(appiumDriver, platform);

        //周日,周一,周二,周三和周四
        everyWeek.clear();
        everyWeek.add("周日");
        everyWeek.add("周一");
        everyWeek.add("周二");
        everyWeek.add("周三");
        everyWeek.add("周四");
        addScheduleAndValidation(appiumDriver, everyWeek, excelList, platform);
        delSchedule(appiumDriver, platform);

        //周一到周六
        everyWeek.clear();
        everyWeek.add("周一");
        everyWeek.add("周二");
        everyWeek.add("周三");
        everyWeek.add("周四");
        everyWeek.add("周五");
        everyWeek.add("周六");
        addScheduleAndValidation(appiumDriver, everyWeek, excelList, platform);
        delSchedule(appiumDriver, platform);
        addSchedule(appiumDriver, 10, platform);
        //已达最大预约次数
        Thread.sleep(3000);
        morePage.addScheduleBtnOnCleanSchedulePage.click();
        Thread.sleep(2000);
        String alertBoxContent = morePage.alertBoxContent.getText();
        verifyTranslate(alertBoxContent, excelList, "maximum shedule times");

        //知道了
        String getIt = morePage.getIt.getText();
        verifyTranslate(getIt, excelList, "maximum schedule");
        morePage.getIt.click();
        Thread.sleep(5000);
        delSchedule(appiumDriver, platform);
        Thread.sleep(5000);
        morePage.backBtnOnCleanSchedulePage.click();
        Thread.sleep(2000);
        morePage.backBtnOnMorePage.click();
        Thread.sleep(2000);
        cleanPage.cleanPageBackBtn.click();
    }

    private void noDisturbPageTranslate(ArrayList<String> excelList, String platform, String deebotType) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        if (deebotType.equals("d700")) {
            morePage.noDisturbMode.click();
        } else if (deebotType.equals("dr930")) {
            morePage.noDisturbModeOnMorePageFor930.click();
        }
        Thread.sleep(3000);
        String titleStr = morePage.titleContentOnNoDisturbPage.getText();
        String panel1Str = morePage.panel1OnNoDisturbPage.getText();
        String panel2Str = morePage.panel2OnNoDisturbPage.getText();
        verifyTranslate(titleStr, excelList, "no disturb");
        verifyTranslate(panel1Str, excelList, "no disturb");
        verifyTranslate(panel2Str, excelList, "no disturb");
        System.out.print("0000000000000" + CommonPage.waitElementVisible(appiumDriver, ("com.eco.global.app:id/dnd_interval"), 20, platform));
        //enable no disturb mode and translate
        Thread.sleep(3000);
        if (platform.equals("ios")) {
            if (!CommonPage.waitElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeStaticText[1]"), 60, platform)) {
                morePage.switchBtnOnNoDisturbPage.click();
            }
        } else {
            if (!CommonPage.waitElementVisible(appiumDriver, ("com.eco.global.app:id/dnd_interval"), 20, platform)) {
                morePage.switchBtnOnNoDisturbPage.click();
            }
            Thread.sleep(6000);
        }
        Thread.sleep(8000);
        String noDisturbIntervalStr = morePage.noDisturbIntervalOnNoDisturbPage.getText();
        String startTimeStr = morePage.startTimeOnNoDisturbPage.getText();
        String endTimeStr = morePage.endTimeOnNoDisturbPage.getText();
        String hintInfoStr = morePage.hintInfoOnNoDisturbPage.getText();
        verifyTranslate(noDisturbIntervalStr, excelList, "no disturb");
        verifyTranslate(startTimeStr, excelList, "no disturb");
        verifyTranslate(endTimeStr, excelList, "no disturb");
        verifyTranslate(hintInfoStr, excelList, "no disturb");
        //click start time and translate
        morePage.startTimeOnNoDisturbPage.click();
        Thread.sleep(3000);
        String cancelStr = morePage.cancelBtnOnStartTimeNoDisturbPage.getText();
        String saveStr = morePage.saveBtnOnStartTimeNoDisturbPage.getText();
        verifyTranslate(cancelStr, excelList, "no disturb");
        verifyTranslate(saveStr, excelList, "no disturb");
        morePage.cancelBtnOnStartTimeNoDisturbPage.click();
        Thread.sleep(3000);
        //click end time and translate
        morePage.endTimeOnNoDisturbPage.click();
        Thread.sleep(3000);
        String cancelStr1 = morePage.cancelBtnOnEndTimeNoDisturbPage.getText();
        String saveStr1 = morePage.saveBtnOnEndTimeNoDisturbPage.getText();
        verifyTranslate(cancelStr1, excelList, "no disturb");
        verifyTranslate(saveStr1, excelList, "no disturb");
        morePage.cancelBtnOnEndTimeNoDisturbPage.click();
        Thread.sleep(3000);
        morePage.backBtnOnNoDisturbPage.click();
        Thread.sleep(3000);
    }

    private void cleanPowerPageTranslate(ArrayList<String> excelList, String platform, String deebotType) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        if (deebotType.equals("d700")) {
            morePage.cleanPower.click();
        } else if (deebotType.equals("dr930")) {
            morePage.cleanPowerOnMorePageFor930.click();
        }
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/title_back"), 20, platform);
            Thread.sleep(6000);
        }
        String cancelStr = morePage.cancelBtnOnCleanPowerPage.getText();
        String saveStr = morePage.saveBtnOnCleanPowerPage.getText();
        String titleStr = morePage.titleOnCleanPowerPage.getText();
        String panel1Str = morePage.panel1OnCleanPowerPage.getText();
        String panel2Str = morePage.panel2OnCleanPowerPage.getText();
        String panel3Str = morePage.panel3OnCleanPowerPage.getText();
        verifyTranslate(cancelStr, excelList, "clean power");
        verifyTranslate(saveStr, excelList, "clean power");
        verifyTranslate(titleStr, excelList, "clean power");
        verifyTranslate(panel1Str, excelList, "clean power");
        //bug exist on 德语
        verifyTranslate(panel2Str, excelList, "clean power");
        morePage.cancelBtnOnCleanPowerPage.click();
        Thread.sleep(3000);
    }


    private void guidePageTranslate(ArrayList<String> excelList, String platform, String deebotType) throws InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), GuidePage.class);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), CleanPage.class);
        if (deebotType.equals("d700")) {
            if (platform.equals("ios")) {
                CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"), 60, platform);
            } else {
                CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/tv_mode_name"), 2, platform);
                Thread.sleep(6000);
            }
            //translate the first guide page
            String guidePageStr1 = guidePage.guidePageLayout.getText();
            verifyTranslate(guidePageStr1, excelList, "guide");
            cleanPage.autoClean.click();
            Thread.sleep(5000);
            //translate the second guide page
            String guidePageStr2 = guidePage.guidePageElement.getText();
            verifyTranslate(guidePageStr2, excelList, "guide");
            cleanPage.autoClean.click();
            Thread.sleep(5000);
            //translate the third guide page
            String guidePageStr3 = guidePage.guidePageElement1.getText();
            verifyTranslate(guidePageStr3, excelList, "guide");
            guidePage.startExperienceBtn.click();
            Thread.sleep(2000);
        }
        if (deebotType.equals("dr930")) {
            if (platform.equals("ios")) {
                CommonPage.waitForVisible(appiumDriver, (""), 60, platform);
            } else {
                CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/iv_idle_clean"), 2, platform);
                Thread.sleep(6000);
            }
            //translate the first guide page for 930
            String guidePage1Str1 = guidePage.guidePage1Element1For930.getText();
            verifyTranslate(guidePage1Str1, excelList, "guide");
            String guidePage1Str2 = guidePage.guidePage1Element2For930.getText();
            verifyTranslate(guidePage1Str2, excelList, "guide");
            String guidePage1Str3 = guidePage.guidePage1Element3For930.getText();
            verifyTranslate(guidePage1Str3, excelList, "guide");
            String guidePage1Str4 = guidePage.guidePage1Element4For930.getText();
            verifyTranslate(guidePage1Str4, excelList, "guide");
            cleanPage.cleanBtnFor930.click();
            Thread.sleep(5000);
            //translate the second guide page for 930
            String guidePage2Str1 = guidePage.guidePage1Element1For930.getText();
            verifyTranslate(guidePage2Str1, excelList, "guide");
            String guidePage2Str2 = guidePage.guidePage1Element2For930.getText();
            verifyTranslate(guidePage2Str2, excelList, "guide");
            String guidePage2Str3 = guidePage.guidePage1Element3For930.getText();
            verifyTranslate(guidePage2Str3, excelList, "guide");
            String guidePage2Str4 = guidePage.guidePage1Element4For930.getText();
            verifyTranslate(guidePage2Str4, excelList, "guide");
            cleanPage.cleanBtnFor930.click();
            Thread.sleep(5000);
            //translate the third guide page for 930
            String guidePage3Str1 = guidePage.guidePage3Element1For930.getText();
            verifyTranslate(guidePage3Str1, excelList, "guide");
            String guidePage3Str2 = guidePage.guidePage3Element2For930.getText();
            verifyTranslate(guidePage3Str2, excelList, "guide");
            String guidePage3Str3 = guidePage.guidePage3Element3For930.getText();
            verifyTranslate(guidePage3Str3, excelList, "guide");
            String guidePage3Str4 = guidePage.guidePage3Element4For930.getText();
            verifyTranslate(guidePage3Str4, excelList, "guide");
            String guidePage3Str5 = guidePage.guidePage3Element5For930.getText();
            verifyTranslate(guidePage3Str5, excelList, "guide");
            cleanPage.cleanBtnFor930.click();
            Thread.sleep(5000);
            //translate the fourth guide page for 930
            String guidePage4Str1 = guidePage.guidePage1Element1For930.getText();
            verifyTranslate(guidePage4Str1, excelList, "guide");
            String guidePage4Str2 = guidePage.guidePage1Element2For930.getText();
            verifyTranslate(guidePage4Str2, excelList, "guide");
            String guidePage4Str3 = guidePage.guidePage1Element3For930.getText();
            verifyTranslate(guidePage4Str3, excelList, "guide");
            String guidePage4Str4 = guidePage.guidePage1Element4For930.getText();
            verifyTranslate(guidePage4Str4, excelList, "guide");
            cleanPage.cleanBtnFor930.click();
            Thread.sleep(5000);
            //translate the fifth guide page for 930
            String guidePage5Str1 = guidePage.guidePage5Element1For930.getText();
            verifyTranslate(guidePage5Str1, excelList, "guide");
            morePage.titleOnMorePageFor930.click();
            Thread.sleep(5000);
            //translate the sixth guide page for 930
            String guidePage6Str1 = guidePage.guidePage6Element1For930.getText();
            String guidePage6Str2 = guidePage.guidePage6Element2For930.getText();
            String guidePage6Str3 = guidePage.startExperienceBtnFor930.getText();
            verifyTranslate(guidePage6Str1, excelList, "guide");
            verifyTranslate(guidePage6Str2, excelList, "guide");
            verifyTranslate(guidePage6Str3, excelList, "guide");
            guidePage.startExperienceBtnFor930.click();
            //translate the seventh guide page for 930
            String guidePage7Str1 = guidePage.guidePage7Element1For930.getText();
            verifyTranslate(guidePage7Str1, excelList, "guide");
            String guidePage7Str2 = guidePage.guidePage7Element2For930.getText();
            verifyTranslate(guidePage7Str2, excelList, "guide");
            String guidePage7Str3 = guidePage.guidePage7KnowBtnFor930.getText();
            verifyTranslate(guidePage7Str3, excelList, "guide");
            guidePage.guidePage7KnowBtnFor930.click();
        }
    }

    private void cancelUpgradeFirmware(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), GuidePage.class);
        if (platform.equals("ios")) {
            ///CommonPage.waitForVisible(appiumDriver, (""), 2, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/tv_title"), 8, platform);
            Thread.sleep(6000);
        }
        if (CommonPage.elementExist(guidePage.firmwareUpgrade)) {
            guidePage.firmwareUpgradeCancelBtn.click();
        }
    }


    public void setLanguage(AppiumDriver appiumDriver, String language, String platform) throws InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), DashboardPage.class);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), SettingPage.class);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), LanguagePage.class);
        MobileElement textViewCountry = null;
        try {
            boolean flag = true;
            // IOS关闭调试
            if (platform.equals("ios")) {
                while (flag) {
                    if (appiumDriver.findElementByXPath("//XCUIElementTypeStaticText[@name='" + language + "']").isDisplayed()) {
                        appiumDriver.findElementByXPath("//XCUIElementTypeStaticText[@name='" + language + "']").click();
                        languagePage.languagePageSaveBtn.click();
                        // waiting to be done on ios...
                        flag = false;
                    } else {
                        CommonPage.swipeToDirection(appiumDriver, "up");
                    }
                }
            } else {
                String languageStr = "new UiScrollable(new UiSelector().scrollable(true).instance(0))." + "scrollIntoView(new UiSelector().textContains(" + "\"" + language + "\"" + ").instance(0))";
                textViewCountry = (MobileElement) ((AndroidDriver) appiumDriver).findElementByAndroidUIAutomator(languageStr);
                textViewCountry.click();
                languagePage.languagePageSaveBtn.click();
            }

        } catch (Exception e) {
            System.out.println("Cannot select " + language + " as language,test fail!");
        }
        Thread.sleep(5000);

    }

    private void chooseLanguage(String tmpLanguage, String platform) throws InterruptedException {
        Thread.sleep(10000);
        dashboardPage.actionBarLeft.click();
        settingPage.settingButton.click();
        settingPage.settingMultipleLanguage.click();
        Thread.sleep(3000);
        setLanguage(appiumDriver, tmpLanguage, platform);
        Thread.sleep(3000);
        settingPage.settingBackBtn.click();
    }

    private void verifyTranslate(String appValue, ArrayList<String> list, String pageName) {
        boolean flag = false;
        for (String str : list) {
            if (str.replaceAll("\\pP", "").trim().replace(" ", "").replace("\r", "").replace("\n", "").replace("Integer", "").equals(appValue.replaceAll("\\pP", "").trim().replace(" ", "").replace("\r", "").replace("\n", ""))) {
                System.out.println("Translation on " + pageName + " page succeed, test pass!");
                System.out.println("Expect value is:" + str + "******" + "Actual value is:" + appValue);
                flag = true;
                break;
            }
        }
        if (!flag) {
            Assert.fail("Translation on " + pageName + " page get error, test fail!" + "Actual value is:" + appValue.replaceAll("\\pP", "").trim().replace(" ", "").replace("\r", "").replace("\n", "") + "Expected value is:" + list.toString().replaceAll("\\pP", "").trim().replace(" ", "").replace("\r", "").replace("\n", "").replace("Integer", ""));
        }
    }

    public void addScheduleAndValidation(AppiumDriver driver, List<String> everyWeek, ArrayList<String> list, String platform) throws InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        addSchedule(driver, everyWeek);
        morePage.backBtnOnRepeatRatePage.click();
        int i = 0;
        String weekStr = morePage.repeatTimesOnAddNewSchedulePage.getText().trim();
        while (i < weekStr.replaceAll(" ", "\\|").split("\\|").length) {
            //verifyTranslate(weekStr.replaceAll(" ", "\\|").split("\\|")[i], list, "add schedule");
            verifyUI(weekStr.replaceAll(" ", "\\|").split("\\|")[i], list);
            i++;
        }
        morePage.saveBtnOnAddNewSchedulePage.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/lly"), 60, platform);
            Thread.sleep(6000);
        }
        if (platform.equals("ios")) {
            CommonPage.stringCompare(weekStr, morePage.everyWeekLabel.get(morePage.scheduleList.size()).getText().trim());
        } else {
            CommonPage.stringCompare(weekStr, morePage.everyWeekLabel.get(morePage.scheduleList.size() - 1).getText().trim());
        }

    }

    public void verifyUI(String appValue, ArrayList<String> list) {

        boolean flag = false;
        for (String str : list) {
            if (str.replaceAll("\\pP", "").trim().replace(" ", "").equals(appValue.replaceAll("\\pP", "").trim().replace(" ", "")) || str.replaceAll("\\pP", "").trim().replace(" ", "").contains(appValue.replaceAll("\\pP", "").trim().replace(" ", ""))) {
                System.out.println("Pass************" + "Expect value:" + str.replaceAll("\\pP", "").trim().replace(" ", "") + "Actual value:" + appValue.replaceAll("\\pP", "").trim().replace(" ", ""));
                flag = true;
                break;
            }
        }
        if (!flag) {
            Assert.fail("Fail************" + "Expected value is:" + list.toString().replaceAll("\\pP", "").trim().replace(" ", "") + "Actual value:" + appValue.replaceAll("\\pP", "").trim().replace(" ", ""));
        }
    }

    public void addSchedule(AppiumDriver driver, List<String> list) throws InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        Thread.sleep(5000);
        morePage.addScheduleBtnOnCleanSchedulePage.click();
        CommonPage.swipeInElement(driver, morePage.hourWheel, CommonPage.Heading.DOWN);
        morePage.repeatTimesOnAddNewSchedulePage.click();
        for (int i = 0; i < list.size(); i++) {
            switch (list.get(i)) {
                case "周日":
                    morePage.panel1OnRepeatRatePage.click();
                    continue;
                case "周一":
                    morePage.panel2OnRepeatRatePage.click();
                    continue;
                case "周二":
                    morePage.panel3OnRepeatRatePage.click();
                    continue;
                case "周三":
                    morePage.panel4OnRepeatRatePage.click();
                    continue;
                case "周四":
                    morePage.panel5OnRepeatRatePage.click();
                    continue;
                case "周五":
                    morePage.panel6OnRepeatRatePage.click();
                    continue;
                case "周六":
                    morePage.panel7OnRepeatRatePage.click();
                    continue;
            }
        }

    }

    public void delSchedule(AppiumDriver driver, String platform) throws InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        int num = 0;
        boolean flag = true;
        while (flag) {
            morePage = new MorePage(driver);
            int listNum = morePage.scheduleList.size();
            if (listNum > 0) {
                if (platform.equals("ios")) {
                    CommonPage.swipeElementToLeft(driver, morePage.scheduleList.get(1));
                } else {
                    CommonPage.swipeElementToLeft(driver, morePage.scheduleList.get(0));
                }

                Thread.sleep(1000);
                morePage.delBtn.click();
                Thread.sleep(3000);
                num++;
            } else {
                flag = false;
            }
        }
    }

    //循环添加预约
    public void addSchedule(AppiumDriver driver, int num, String platform) throws InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MorePage.class);
        for (int i = 0; i < num; i++) {
            if (platform.equals("ios")) {
                CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]"), 60, platform);
            } else {
                CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/right"), 60, platform);
                Thread.sleep(6000);
            }
            morePage.addScheduleBtnOnCleanSchedulePage.click();
            Thread.sleep(1000);
            CommonPage.swipeInElement(driver, morePage.hourWheel, CommonPage.Heading.DOWN);
            morePage.saveBtnOnAddNewSchedulePage.click();
            Thread.sleep(8000);
        }
    }

}
