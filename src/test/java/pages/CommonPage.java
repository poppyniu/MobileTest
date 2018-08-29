package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by poppy.zhang on 2018/8/9.
 */
public class CommonPage {
    public static Duration duration = Duration.ofSeconds(1);

    public static void swipeUp(AppiumDriver driver) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<>();
//        params.put("direction", direction);
        params.put("fromX", width / 2);
        params.put("fromY", height * 3 / 4);
        params.put("toX", width / 2);
        params.put("toY", height / 4);
        params.put("duration", 0.5);
        try {
            js.executeScript("mobile: dragFromToForDuration", params);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void swipeDown(AppiumDriver driver)// scroll down to refresh
    {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(width / 2, height / 4).waitAction(Integer.parseInt(duration.toString())).moveTo(width / 2, height * 3 / 4).release();
        action1.perform();
    }

    public static void swipeLeft(AppiumDriver driver) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(width - 10, height / 2).waitAction(Integer.parseInt(duration.toString())).moveTo(width / 4, height / 2).release();
        action1.perform();
    }

    public static void swipeRight(AppiumDriver driver) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(10, height / 2).waitAction(Integer.parseInt(duration.toString())).moveTo(width * 3 / 4 + 10, height / 2).release();
        action1.perform();
    }

    public static boolean elementExist(MobileElement element)
            throws Exception {
        boolean elementExist = element.isDisplayed();
        if (elementExist == true) {
            Assert.assertTrue(true);
            return elementExist;
        }
        Assert.assertFalse("Mobile element does not exist!", false);
        return elementExist;
    }

    public static void waitForVisible(AppiumDriver driver, String xpath, int waitTime, String platform) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        for (int attempt = 0; attempt < waitTime; attempt++) {
            try {
                if (platform.equals("ios")) {
                    driver.findElementByXPath(xpath);
                    break;
                } else {
                    driver.findElementById(xpath);
                    break;
                }

            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            }
        }
        if (platform.equals("ios")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        } else {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(xpath)));
        }
    }

    public static boolean waitElementVisible(AppiumDriver driver, String xpath, int waitTime, String platform) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        for (int attempt = 0; attempt < waitTime; attempt++) {
            try {
                if (platform.equals("ios")) {
                    driver.findElementByXPath(xpath);
                    break;
                } else {
                    driver.findElementById(xpath);
                    break;
                }

            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                return false;
            }
        }
        if (platform.equals("ios")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        } else {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(xpath)));
        }
        return true;
    }

    public static boolean waitForElement(MobileElement element, int duration) {

        try {
            boolean flag = false;
            int i = 1;
            while (i <= duration) {
                if (element.isDisplayed()) {
                    flag = true;
                    Thread.sleep(5000);
                    break;
                } else {
                    i++;
                    Thread.sleep(5000);
                }
            }
            return flag;

        } catch (Exception e) {
            return false;
        }
    }

    public static void swipeToDirection(AppiumDriver driver, String direction) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<>();
        params.put("direction", direction);
        js.executeScript("mobile: swipe", params);

    }


    //控制滑动方向
    public enum Heading {
        UP, DOWN, LEFT
    }


    public static void swipeInElement(AppiumDriver driver, MobileElement xpath, Heading heading) {
        // 获取控件开始位置的坐标轴
        Point start = xpath.getLocation();
        TouchAction ta = new TouchAction(driver);
        Duration duration=Duration.ofSeconds(1);
        int startX = start.x;
        int startY = start.y;

        // 获取控件坐标轴差
        Dimension q = xpath.getSize();
        int x = q.getWidth();
        int y = q.getHeight();
        // 计算出控件结束坐标
        int endX = x + startX;
        int endY = y + startY;

        // 计算中间点坐标
        int centreX = (endX + startX) / 2;
        int centreY = (endY + startY) / 2;

        switch (heading) {
            // 向上滑动
            case UP:
                ta.press(centreX, centreY + 30).moveTo(centreX, centreY - 30).release().perform();
                //driver.swipe(centreX, centreY + 30, centreX, centreY - 30, 500);
                break;
            // 向下滑动
            case DOWN:
                ta.press(centreX, centreY - 30).moveTo(centreX, centreY + 30).release().perform();
                //                driver.swipe(centreX, centreY - 30, centreX, centreY + 30, 500);
                break;
            case LEFT:
                int width = driver.manage().window().getSize().width;
                int height = driver.manage().window().getSize().height;
                ta.press(width * 3 / 4, height / 2).waitAction(Integer.parseInt(Duration.ofSeconds(1).toString())).moveTo(width / 4, height / 2).release().perform();
        }
    }

    public static void stringCompare(String expect, String actual) {
        if (expect.equals(actual)) {
            System.out.println("Pass++++++++++++++++++++++++" + expect + "=" + actual);
        } else {
            System.out.println("Fail++++++++++++++++++++++++" + expect + "!=" + actual);
        }
    }

    public static void swipeElementToLeft(AppiumDriver driver, MobileElement element) throws InterruptedException {
        Point point = element.getLocation();
        int startX = point.x;
        int startY = point.y;
        Dimension dimension = element.getSize();
        int width = dimension.getWidth();
        int height = dimension.getHeight();

        int centerX = startX + width * 1 / 2;
        int centerY = startY + height * 1 / 2;
        TouchAction ta = new TouchAction(driver);
        //ta.press(centerX, centerY).moveTo(100 - centerX, 0).release().perform();
        ta.press(centerX, centerY).moveTo(200 - centerX, 0).release().perform();

    }
}
