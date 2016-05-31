package com.epam.grow.phantom.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUsPage extends PageObject {
    private static final String DEFAULT_URL = "http://demoqa.com/about-us/";
    private static final String PAGE_TITLE = "//h1[@class='entry-title']";

    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(DEFAULT_URL);
    }

    public boolean isTitleDisplayed() {
        return driver.findElement(By.xpath(PAGE_TITLE)).isDisplayed();
    }
}
