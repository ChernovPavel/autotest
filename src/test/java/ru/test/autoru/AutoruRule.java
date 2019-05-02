package ru.test.autoru;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoruRule extends ExternalResource {

    private WebDriver webDriver;

    @Override
    protected void before(){
        webDriver = new ChromeDriver();
    }
    protected void after(){
        webDriver.quit();
    }
    public WebDriver driver(){
        return webDriver;
    }

}
