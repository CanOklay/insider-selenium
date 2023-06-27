package com.insider.base;

import com.insider.test.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static com.insider.utils.WaitElementUtils.*;

/**
 * Created by Fatih Can Oklay
 * Date: 26.06.2023
 */

public abstract class BasePage extends BaseTest {

    public WebElement findElement(By by) {
        waitUntilPresenceOfElementLocatedBy(by);
        waitUntilVisibilityOfElementLocatedBy(by);
        return driver.findElement(by);
    }

    public List<WebElement> findElements(By by) {
        waitUntilPresenceOfElementLocatedBy(by);
        waitUntilVisibilityOfElementLocatedBy(by);
        return driver.findElements(by);
    }

    public void clickElement(By by) {
        waitUntilClickableOfElementLocatedBy(by);
        Actions action = new Actions(driver);
        action.moveToElement(findElement(by));
        action.click();
        action.build().perform();
    }

    public void scrollElement(By by) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", findElement(by));
    }

    public void screenShot(String text) {
        DateFormat dateFormat;
        dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
        String date = dateFormat.format(new Date());
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "/report/screenshot/" + text + "(" + date + ")" + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void hoverElement(By by) {
        WebElement element = findElement(by);
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void wait(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

    public void switchTab() {
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {
            driver.switchTo().window(actual);
        }
    }

    public void refresh() {
        driver.navigate().refresh();
    }

    public String getText(By by) {
        return findElement(by).getText();
    }

    public void isElementDisplayed(By by) {
        findElement(by).isDisplayed();
    }

    public void assertEquals(String actualText, String expectedText) {
        Assert.assertEquals(actualText, expectedText);
    }

    public void assertFail() {
        Assert.fail();
    }
}
