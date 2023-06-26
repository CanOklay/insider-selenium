package com.insider.base;

import org.openqa.selenium.By;
import com.insider.reports.ExtentLogger;

/**
 * Created by Fatih Can Oklay
 * Date: 26.06.2023
 */

public class StepImplementations extends BasePage {

    public void click(By by) {
        try {
            clickElement(by);
            ExtentLogger.info("Clicked element: " + by);
        } catch (Exception e) {
            ExtentLogger.info(e.getMessage());
            ExtentLogger.info("Can not clicked element: " + by);
            assertFail();
        }
    }
}
