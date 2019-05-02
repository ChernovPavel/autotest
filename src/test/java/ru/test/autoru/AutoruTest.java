package ru.test.autoru;

import io.github.chernov.WebDriverRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertThat;


public class AutoruTest {

    MainSteps steps;

    @Rule
    public WebDriverRule driverRule = new WebDriverRule();

    @Before
    public void initSteps() {
        steps = new MainSteps(driverRule.driver());
    }

    @Test
    public void test() throws InterruptedException {
        steps.open("https://auto.ru/cars/all/");
        steps.onListingPage().searchForm().categoryCar("Новые").click();
        steps.onListingPage().searchForm().allParameters().click();
        steps.onListingPage().searchForm().suggestButton("Марка").click();
        steps.onListingPage().searchForm().menuItem("BMW").click();
        steps.onListingPage().searchForm().textInput("Цена от,").sendKeys("600000");
        steps.byVisibleElement("Датчик света");
        steps.onListingPage().searchForm().checkbox("Датчик света").click();
        steps.onListingPage().searchForm().showResults().click();
        steps.shouldSeeUrl("cars/bmw/new/?sort=fresh_relevance_1-desc&price_from=600000&catalog_equipment=light-sensor");
    }
}