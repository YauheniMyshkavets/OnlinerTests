package com.onliner.smoke.common;

import com.onliner.steps.onliner.LoginPageSteps;
import com.onliner.steps.onliner.catalog.CatalogPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class BaseTemplateOnliner {
    @Steps
    public LoginPageSteps loginPageSteps;

    @Steps
    public CatalogPageSteps catalogPageSteps;



}
