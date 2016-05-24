package com.epam.grow.phantom.utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class DriverManager {
    public static final Logger log = Logger.getLogger(DriverManager.class);
    private static WebDriver instance;

    private DriverManager() {
    }

    public static WebDriver getDriver() {
        if (instance == null) {
            instance = DriverFactory.getWebDriverType();
        }
        return instance;
    }


    public static void closeDriver() {
        if (instance != null)
            instance.quit();
        instance = null;
        log.debug("Driver was destroyed");
    }
}
