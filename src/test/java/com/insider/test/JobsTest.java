package com.insider.test;

import com.insider.base.StepImplementations;
import org.testng.annotations.Test;

import static com.insider.element.HomePageElements.*;

/**
 * Created by Fatih Can Oklay
 * Date: 26.06.2023
 */

public class JobsTest extends StepImplementations {

    @Test
    public void test() {
        click(ACCEPT_COOKIES);
    }
}
