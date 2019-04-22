package io.github.chernov;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class WebDriverTest {

    MainSteps mainSteps;

    @Rule
    public WebDriverRule driverRule = new WebDriverRule();

    @Before public void setUp(){
        mainSteps = new MainSteps(driverRule.driver());

    }

    @Test
    public void test() {

        mainSteps.open("https://auto.ru");
        mainSteps.onMainPage().offers().click();
        mainSteps.shouldSeeUrl("cars/all");

    }

}
