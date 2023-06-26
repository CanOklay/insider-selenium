package com.insider.utils;

import com.insider.manager.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Fatih Can Oklay
 * Date: 26.06.2023
 */

public class WaitElementUtils extends DriverFactory {

    private WaitElementUtils() {
    }

    public static void waitUntilPresenceOfElementLocatedBy(By by) {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void waitUntilVisibilityOfElementLocatedBy(By by) {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitUntilClickableOfElementLocatedBy(By by) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
    }
}
