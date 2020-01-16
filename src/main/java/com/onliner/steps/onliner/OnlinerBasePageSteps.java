package com.onliner.steps.onliner;

import com.onliner.pages.onliner.OnlinerBasePage;
import com.onliner.steps.onliner.common.CommonSteps;
import net.thucydides.core.annotations.Step;

public class OnlinerBasePageSteps extends CommonSteps {
    OnlinerBasePage onlinerBasePage;

    @Step
    public void openURL() {
        onlinerBasePage.open();
    }

    @Step
    public void openLogInPage() {
        onlinerBasePage.openLogInPage();
    }

    @Step
    public void verifyProfileImageAppears() {
        onlinerBasePage.verifyProfileImageAppears();
    }

}
