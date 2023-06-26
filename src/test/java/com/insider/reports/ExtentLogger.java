package com.insider.reports;

import static com.aventstack.extentreports.MediaEntityBuilder.createScreenCaptureFromBase64String;
import static com.insider.utils.ScreenshotUtils.getBase64Image;

/**
 * Created by Fatih Can Oklay
 * Date: 26.06.2023
 */

public class ExtentLogger {

    private ExtentLogger() {
    }

    public static void pass(String message) {
        ExtentManager.getExtentTest().pass(message);
    }

    public static void fail(String message) {
        ExtentManager.getExtentTest().fail(message, createScreenCaptureFromBase64String(getBase64Image()).build());
    }

    public static void skip(String message) {
        ExtentManager.getExtentTest().skip(message);
    }

    public static void info(String message) {
        ExtentManager.getExtentTest().info(message);
    }

    public static void infoScreen(String message) {
        ExtentManager.getExtentTest().info(message, createScreenCaptureFromBase64String(getBase64Image()).build());
    }
}
