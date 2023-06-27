package com.insider.test;

import com.insider.base.StepImplementations;
import org.testng.annotations.Test;

import static com.insider.constant.CareerPageConstants.*;
import static com.insider.constant.JobsPageConstants.*;
import static com.insider.element.ApplicationFormPageElements.*;
import static com.insider.element.CareersPageElements.*;
import static com.insider.element.HomePageElements.*;
import static com.insider.element.JobDetailPageElements.*;
import static com.insider.element.JobsPage.*;
import static com.insider.element.QAPageElements.*;

/**
 * Created by Fatih Can Oklay
 * Date: 26.06.2023
 */

public class JobsTest extends StepImplementations {

    @Test(testName = "Search QA jobs in careers and click apply")
    public void search_qa_jobs_in_careers_and_click_apply() throws InterruptedException {
        click(ACCEPT_COOKIES);
        isDisplayed(INSIDER_LOGO);
        click(MORE_BUTTON);
        click(CAREERS_BUTTON);
        scrollElement(FIND_YOUR_CALLING);
        verifyText(FIND_YOUR_CALLING, FIND_YOUR_CALLING_TEXT);
        scrollElement(OUR_LOCATIONS);
        verifyText(OUR_LOCATIONS, OUR_LOCATIONS_TEXT);
        scrollToElement(LIFE_AT_INSIDER);
        verifyText(LIFE_AT_INSIDER, LIFE_AT_INSIDER_TEXT);
        scrollUp();
        scrollUp();
        scrollUp();
        click(SEE_ALL_TEAMS_BUTTON);
        scrollToElement(QUALITY_ASSURANCE_JOBS);
        wait(1);
        scrollUp();
        click(QUALITY_ASSURANCE_JOBS);
        click(SEE_ALL_QA_JOBS_BUTTON);
        verifyText(OPEN_POSITIONS_TITLE, OPEN_POSITIONS_TITLE_TEXT);
        click(FILTER_LOCATION);
        selectOptionByIndex(FILTER_LOCATION_RESULTS, 1);
        scrollDown();
        hover(FIRST_JOB_IN_JOB_LIST);
        verifyText(JOB_TITLE_IN_JOB_LIST, JOB_TITLE_TEXT);
        click(FIRST_VIEW_ROLE_BUTTON);
        wait(5);
        refresh();
        wait(5);
        switchToNewTab();
        verifyText(JOB_TITLE_IN_JOB_DETAIL, JOB_TITLE_TEXT);
        click(APPLY_FOR_THIS_JOB_BUTTON);
        verifyText(JOB_TITLE_IN_APPLICATION_FORM, JOB_TITLE_TEXT);
    }
}
