package com.epam.grow.phantom.page;

import org.openqa.selenium.WebDriver;

public abstract class PageObject {
    protected WebDriver driver;

    protected PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public abstract void openPage();
}
