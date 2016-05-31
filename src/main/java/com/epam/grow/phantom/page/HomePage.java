package com.epam.grow.phantom.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageObject {
    private static final String DEFAULT_URL = "http://demoqa.com/";
    private static final String TITLE_TEXT = "Home";

    private static final String HOME_TITLE = "//h1[@class='entry-title']";
    private static final String ABOUT_US_TAB = "//a[@title='About us']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(DEFAULT_URL);
    }

    public boolean isTitlePresent(){
        return driver.findElement(By.xpath(HOME_TITLE)).isDisplayed();
    }

    public String getTitleText(){
        return driver.findElement(By.xpath(HOME_TITLE)).getText();
    }

    public String getExpectedText(){
        return TITLE_TEXT;
    }

    public void clickAboutUs(){
        driver.findElement(By.xpath(ABOUT_US_TAB)).click();
    }
}
