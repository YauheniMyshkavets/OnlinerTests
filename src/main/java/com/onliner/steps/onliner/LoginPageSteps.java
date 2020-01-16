package com.onliner.steps.onliner;

import com.onliner.pages.onliner.LoginPage;
import com.onliner.steps.onliner.common.CommonSteps;
import net.thucydides.core.annotations.Step;

public class LoginPageSteps extends CommonSteps {
    LoginPage loginPage;

    @Step
    public void verifyLogInPageAppears() {
        loginPage.verifyLogInPageAppears();
    }

    @Step
    public void enterEmail(String email) {
        loginPage.enterEmail(email);
    }

    @Step
    public  void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @Step
    public void clickSignIn() {
        loginPage.clickSignIn();
    }
}
