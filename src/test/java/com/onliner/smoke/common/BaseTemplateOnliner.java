package com.onliner.smoke.common;

import com.onliner.steps.onliner.LoginPageSteps;
import com.onliner.steps.onliner.OnlinerBasePageSteps;
import com.onliner.steps.onliner.catalog.CatalogPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTemplateOnliner {
    @Managed
    public WebDriver driver;

    @Steps
    public LoginPageSteps loginPageSteps;

    @Steps
    public CatalogPageSteps catalogPageSteps;

    @Steps
    public OnlinerBasePageSteps onlinerBasePageSteps;

    public void openSite() {
        onlinerBasePageSteps.openURL();
    }

}
