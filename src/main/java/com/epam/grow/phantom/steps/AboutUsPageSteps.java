package com.epam.grow.phantom.steps;

import com.epam.grow.phantom.page.AboutUsPage;
import com.epam.grow.phantom.utils.DriverManager;

public class AboutUsPageSteps {
    private AboutUsPage aboutUsPage;

    public AboutUsPageSteps() {
        this.aboutUsPage = new AboutUsPage(DriverManager.getDriver());
    }

    public boolean isTitleDisplayed(){
        return aboutUsPage.isTitleDisplayed();
    }
}
