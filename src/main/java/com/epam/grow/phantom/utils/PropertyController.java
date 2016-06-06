package com.epam.grow.phantom.utils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyController {
    private static final String DRIVER_PROPERTIES_PATH = "src/main/resources/driver.properties";
    public static final String WEBDRIVER_IMPLICITLY_WAIT = "webdriver.implicitly.wait";
    public static final String DRIVER_KEY = "driver";
    public static final String CHROME_DRIVER_PATH_KEY = "webdriver.chrome.driver";
    public static final String PHANTOM_DRIVER_PATH = "phantom.driver.path";

    static Properties properties;

    private PropertyController() {
    }

    public static String getProperty(String key) {
        if (properties == null) {
            properties = readProperties();
        }
        return properties.getProperty(key);
    }

    public static Properties readProperties() {
        Properties props = new Properties();
        try {
            InputStream inputStream = Files.newInputStream(Paths.get(DRIVER_PROPERTIES_PATH));
            props.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
    }
}
