package com.onliner.smoke.tests.onliner;

import com.onliner.smoke.common.BaseTemplateOnliner;
import org.junit.Test;

public class VerifyUserCanSuccessfullyLogIn extends BaseTemplateOnliner {

    String email = "zak820@gmail.com";
    String password = "2099663yauheni";

    @Test
    public void verifyUserCanSuccessfullyLogIn() {
        openSite();
        mainPageSteps.openLogInPage();
        loginPageSteps.verifyLogInPageAppears();
        loginPageSteps.enterEmail(email);
        loginPageSteps.enterPassword(password);
        loginPageSteps.clickSignIn();
        mainPageSteps.verifyProfileImageAppears();
    }
}
