package com.insider.element;

import org.openqa.selenium.By;

/**
 * Created by Fatih Can Oklay
 * Date: 26.06.2023
 */

public class CareersPageElements {

    public static final By FIND_YOUR_CALLING = By.xpath("//h3[contains(text(),'Find your calling')]");
    public static final By OUR_LOCATIONS = By.xpath("//h3[contains(text(),'Our Locations')]");
    public static final By LIFE_AT_INSIDER = By.xpath("//h2[contains(text(),'Life at Insider')]");
    public static final By SEE_ALL_TEAMS_BUTTON = By.cssSelector(".btn-outline-secondary");
    public static final By QUALITY_ASSURANCE_JOBS = By.xpath("//h3[contains(text(),'Quality Assurance')]");
    public static final By FIRST_JOB_IN_JOB_LIST = By.cssSelector("#jobs-list > div:nth-child(1) > div");
}
