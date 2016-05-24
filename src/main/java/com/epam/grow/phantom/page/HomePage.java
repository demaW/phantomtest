package com.epam.grow.phantom.page;

import org.openqa.selenium.WebDriver;

public class HomePage extends PageObject {


    private static final String defaultURL = "http://demoqa.com/";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(defaultURL);
    }
}
