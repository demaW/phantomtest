package com.epam.grow.phantom.steps;


import com.epam.grow.phantom.page.HomePage;
import com.epam.grow.phantom.utils.DriverManager;

public class HomePageSteps {
    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage(DriverManager.getDriver());
    }

    public void openHomePage() {
        homePage.openPage();
    }

    public boolean checkTitle() {
        return homePage.isTitlePresent();
    }

    public boolean checkTitleText() {
        return homePage.getExpectedText().equalsIgnoreCase(homePage.getTitleText());
    }

    public void openAboutUsTab(){
        homePage.clickAboutUs();
    }
}
