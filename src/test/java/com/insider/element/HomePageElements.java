package com.insider.element;

import org.openqa.selenium.By;

/**
 * Created by Fatih Can Oklay
 * Date: 26.06.2023
 */

public class HomePageElements {

    public static final By ACCEPT_COOKIES = By.id("wt-cli-accept-all-btn");
    public static final By INSIDER_LOGO = By.cssSelector("a[class='navbar-brand d-flex flex-row align-items-center'] > img");
    public static final By MORE_BUTTON = By.xpath("//span[contains(text(),'More')]");
    public static final By CAREERS_BUTTON = By.xpath("//h5[contains(text(),'Careers')]");
}
