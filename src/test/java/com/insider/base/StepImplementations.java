package com.insider.base;

import com.insider.logs.Logs;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import com.insider.reports.ExtentLogger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Fatih Can Oklay
 * Date: 26.06.2023
 */

public class StepImplementations extends BasePage {

    Logger logger = LogManager.getLogger(Logs.class.getName());

    public void click(By by) {
        try {
            clickElement(by);
            ExtentLogger.info("Clicked element: " + by);
            logger.info("Clicked element: " + by);
        } catch (Exception e) {
            ExtentLogger.info(e.getMessage());
            ExtentLogger.info("Can not clicked element: " + by);
            logger.error("Can not clicked element: " + by);
            assertFail();
        }
    }

    public void scrollToElement(By by) {
        try {
            scrollElement(by);
            ExtentLogger.info("Scrolled to element successfully");
            logger.info("Scrolled to element successfully");
        } catch (Exception e) {
            ExtentLogger.info(e.getMessage());
            ExtentLogger.info("Can not scrolled to element successfully");
            logger.error("Can not scrolled to element successfully");
            assertFail();
        }
    }

    public void verifyText(By by, String text) {
        try {
            assertEquals(getText(by), text);
            ExtentLogger.info(by + " text is checked successfully");
            logger.info(by + " text is checked successfully");
        } catch (Exception e) {
            ExtentLogger.info(e.getMessage());
            ExtentLogger.info(by + " text is not checked successfully");
            logger.error(by + " text is not checked successfully");
            assertFail();
        }
    }

    public void scrollUp() {
        try {
            wait(1);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("javascript:window.scrollBy(0,-500)");
            wait(1);
            ExtentLogger.info("Scrolled up successfully");
        } catch (Exception e) {
            ExtentLogger.info(e.getMessage());
            ExtentLogger.info("Can not scrolled up successfully");
            assertFail();
        }
    }

    public void scrollDown() {
        try {
            wait(1);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("javascript:window.scrollBy(0,500)");
            wait(1);
            ExtentLogger.info("Scrolled down successfully");
        } catch (Exception e) {
            ExtentLogger.info(e.getMessage());
            ExtentLogger.info("Can not scrolled down successfully");
            assertFail();
        }
    }

    public void isDisplayed(By by) {
        try {
            isElementDisplayed(by);
            ExtentLogger.info("Element is checked successfully");
            logger.info("Element is checked successfully");
        } catch (Exception e) {
            ExtentLogger.info(e.getMessage());
            ExtentLogger.info("Element is not checked successfully");
            logger.error("Element is not checked successfully");
            assertFail();
        }
    }

    public void selectOptionByIndex(By by, int i) {
        try {
            List<WebElement> country = findElements(by);
            country.stream().forEach(c -> country.get(i).click());
            ExtentLogger.info("Option is selected successfully");
            logger.info("Option is selected successfully");
        } catch (Exception e) {
            ExtentLogger.info(e.getMessage());
            ExtentLogger.info("Option is not selected successfully");
            logger.error("Option is not selected successfully");
        }
    }

    public void switchToNewTab() {
        try {
            switchTab();
            ExtentLogger.info("Switched to new tab successfully");
            logger.info("Switched to new tab successfully");
        } catch (Exception e) {
            ExtentLogger.info(e.getMessage());
            ExtentLogger.info("Can not switched to new tab successfully");
            logger.error("Can not switched to new tab successfully");
            assertFail();
        }
    }

    public void hover(By by) {
        try {
            hoverElement(by);
            ExtentLogger.info("Hovered element successfully");
            logger.info("Hovered element successfully");
        } catch (Exception e) {
            ExtentLogger.info(e.getMessage());
            ExtentLogger.info("Can not hovered element successfully");
            logger.error("Can not hovered element successfully");
            assertFail();
        }
    }

    public void refreshPage() {
        try {
            refresh();
            ExtentLogger.info("Screenshot is taken successfully");
        } catch (Exception e) {
            ExtentLogger.info(e.getMessage());
            ExtentLogger.info("Can not take screenshot successfully");
            assertFail();
        }
    }
}
