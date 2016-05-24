package com.epam.grow.phantom.utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

import static com.epam.grow.phantom.utils.PropertyController.*;

class DriverFactory {

    private final static Logger log = Logger.getLogger(DriverFactory.class);

    private static final String FIREFOX = "firefox";
    private static final String CHROME = "chrome";
    private static RemoteWebDriver driver;

    static RemoteWebDriver getWebDriverType() {
        if (PropertyController.getProperty(DRIVER_KEY).equalsIgnoreCase(FIREFOX) && PropertyController.getProperty(DRIVER_KEY) != null) {
            driver = new FirefoxDriver();
            log.info("Firefox driver was initiated");
        } else if (PropertyController.getProperty(DRIVER_KEY).equalsIgnoreCase(CHROME) && PropertyController.getProperty(DRIVER_KEY) != null) {
            System.setProperty(CHROME_DRIVER_PATH_KEY, PropertyController.getProperty(CHROME_DRIVER_PATH_KEY));
            driver = new ChromeDriver();
            log.info("Chrome driver was initiated");
        }
        setImplicitlyWait();
        return driver;
    }

    private static void setImplicitlyWait() {
        driver.manage().timeouts().implicitlyWait(Long.parseLong(PropertyController.getProperty(WEBDRIVER_IMPLICITLY_WAIT)), TimeUnit.SECONDS);
        log.debug("Webdriver implicitly wait was set to: " + PropertyController.getProperty(WEBDRIVER_IMPLICITLY_WAIT));
    }
}
