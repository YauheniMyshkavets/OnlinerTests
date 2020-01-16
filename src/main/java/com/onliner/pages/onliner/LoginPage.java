package com.onliner.pages.onliner;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends MainPage {
    @FindBy(xpath = "//input[contains(@placeholder, 'e-mail')]")
    private WebElementFacade fieldEmail;

    @FindBy(xpath = "//input[@type='password']")
    private WebElementFacade fieldPassword;

    @FindBy(xpath = "//button[contains(@class, 'auth-button')]")
    private WebElementFacade signInButton;

    public void enterEmail(String email) {
        fieldEmail.sendKeys(email);
    }

    public void enterPassword(String password) {
        fieldPassword.sendKeys(password);
    }

    public void clickSignIn() {
        signInButton.click();
    }

    public void verifyLogInPageAppears() {
        fieldPassword.shouldBeVisible();
        fieldEmail.shouldBeVisible();
    }
}
