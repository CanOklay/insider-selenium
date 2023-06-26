package com.insider.base;

import com.insider.test.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    public void clickElement(By by) {
        waitUntilClickableOfElementLocatedBy(by);
        Actions action = new Actions(driver);
        action.moveToElement(findElement(by));
        action.click();
        action.build().perform();
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

    public void assertFail() {
        Assert.fail();
    }
}
