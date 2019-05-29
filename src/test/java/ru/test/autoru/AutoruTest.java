package ru.test.autoru;

import io.github.chernov.WebDriverRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


public class AutoruTest {

    MainSteps steps;

    @Rule
    public WebDriverRule driverRule = new WebDriverRule();

    @Before
    public void initSteps() {
        steps = new MainSteps(driverRule.driver());
        steps.open("https://auto.ru/cars/all/");
    }

    @Test
    public void shouldSeeMarkInUrl() throws InterruptedException {
        steps.onListingPage().searchForm().categoryCar("Новые").click();
        steps.onListingPage().searchForm().suggestButton("Марка").click();
        steps.onListingPage().searchForm().menuItem("BMW").click();
        steps.onListingPage().searchForm().showResults().click();
        steps.shouldSeeUrl("cars/bmw/new/?sort=fresh_relevance_1-desc");
    }

    @Test
    public void shouldSeePriceFromInUrl() throws InterruptedException {
        steps.onListingPage().searchForm().inputGroup("Цена").input("от").sendKeys("600000");
        steps.onListingPage().searchForm().showResults().click();
        steps.shouldSeeUrl("cars/all/?sort=fresh_relevance_1-desc&price_from=600000");
    }

    @Test
    public void shouldSeePriceToInUrl() throws InterruptedException {
        steps.onListingPage().searchForm().inputGroup("Цена").input("до").sendKeys("1000000");
        steps.onListingPage().searchForm().showResults().click();
        steps.shouldSeeUrl("cars/all/?sort=fresh_relevance_1-desc&price_to=1000000");
    }

    @Test
    public void shouldSeeFilterInUrl() {
        steps.onListingPage().searchForm().allParameters().click();
        steps.byVisibleElement("Датчик света");
        steps.onListingPage().searchForm().checkbox("Датчик дождя").click();
        steps.onListingPage().searchForm().showResults().click();
        steps.shouldSeeUrl("cars/all/?sort=fresh_relevance_1-desc&catalog_equipment=rain-sensor");
    }
}