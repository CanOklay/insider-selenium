package com.insider.reports;

import com.aventstack.extentreports.ExtentTest;

/**
 * Created by Fatih Can Oklay
 * Date: 26.06.2023
 */

public class ExtentManager {

    private ExtentManager() {
    }

    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public static ExtentTest getExtentTest() {
        return test.get();
    }

    public static void setExtentTest(ExtentTest extentTest) {
        test.set(extentTest);
    }

    public static void unload() {
        test.remove();
    }
}
