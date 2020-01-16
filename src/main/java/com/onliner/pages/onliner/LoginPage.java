package com.onliner.pages.onliner;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends OnlinerBasePage {
    @FindBy(xpath = "//input[contains(@placeholder, 'e-mail')]")
    private WebElementFacade fieldEmail;

    @FindBy(name = "password")
    private WebElementFacade fieldPassword;

    @FindBy(className = "auth0-label-submit")
    private WebElementFacade buttonSignIn;
}
