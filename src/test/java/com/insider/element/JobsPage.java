package com.insider.element;

import org.openqa.selenium.By;

/**
 * Created by Fatih Can Oklay
 * Date: 27.06.2023
 */

public class JobsPage {

    public static final By JOB_TITLE_IN_JOB_LIST = By.cssSelector("#jobs-list > div:nth-child(1) > div > p");
    public static final By OPEN_POSITIONS_TITLE = By.cssSelector("h3[class='mb-2']");
    public static final By FILTER_LOCATION = By.id("select2-filter-by-location-container");
    public static final By FILTER_LOCATION_RESULTS = By.xpath("//ul[@class='select2-results__options']/li");
    public static final By FIRST_VIEW_ROLE_BUTTON = By.cssSelector("#jobs-list > div:nth-child(1) > div > a");
}
