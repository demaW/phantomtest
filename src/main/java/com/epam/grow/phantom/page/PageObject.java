package com.epam.grow.phantom.page;

import org.openqa.selenium.WebDriver;

abstract class PageObject {
    WebDriver driver;

    PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public abstract void openPage();
}
