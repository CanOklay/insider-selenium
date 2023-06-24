package com.insider.test;

import com.insider.manager.DriverFactory;
import org.testng.annotations.*;

import java.net.MalformedURLException;

/**
 * Created by Fatih Can Oklay
 * Date: 24.06.2023
 */

public class BaseTest extends DriverFactory {

    @Parameters("browser")
    @BeforeMethod(groups = {"hook"})
    public void before(@Optional("browser") String browser) throws MalformedURLException {
        setDriver(browser);
    }

    @Test
    public void test() {

    }

    @AfterMethod(groups = {"hook"})
    public void after() {
        if (driver != null) {
            driver.quit();
        }
    }
}