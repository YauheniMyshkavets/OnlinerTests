package com.onliner.steps.onliner;

import com.onliner.pages.onliner.MainPage;
import com.onliner.steps.onliner.common.CommonSteps;
import net.thucydides.core.annotations.Step;

public class MainPageSteps extends CommonSteps {
    MainPage mainPage;

    @Step
    public void openURL() {
        mainPage.open();
    }

    @Step
    public void openLogInPage() {
        mainPage.openLogInPage();
    }

    @Step
    public void verifyProfileImageAppears() {
        mainPage.verifyProfileImageAppears();
    }

    @Step
    public void openCatalogPage() {
        mainPage.openCatalogPage();
    }

    @Step
    public void openCartPage() {
        mainPage.openCartPage();
    }
}
