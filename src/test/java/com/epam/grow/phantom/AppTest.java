package com.epam.grow.phantom;

import com.epam.grow.phantom.page.AboutUsPage;
import com.epam.grow.phantom.steps.AboutUsPageSteps;
import com.epam.grow.phantom.steps.HomePageSteps;
import com.epam.grow.phantom.utils.DriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AppTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testApp() {
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps.openHomePage();

        Assert.assertTrue("Title element is not present", homePageSteps.checkTitle());
        Assert.assertTrue("Text not match", homePageSteps.checkTitleText());

        homePageSteps.openAboutUsTab();
        AboutUsPageSteps aboutUsPageSteps = new AboutUsPageSteps();
        Assert.assertTrue(aboutUsPageSteps.isTitleDisplayed());
        Assert.assertTrue("URL not match", "http://demoqa.com/about-us/".equals(driver.getCurrentUrl()));
    }

    @After
    public void tearDown() {
        DriverManager.closeDriver();
    }
}