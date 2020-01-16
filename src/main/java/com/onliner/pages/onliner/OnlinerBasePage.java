package com.onliner.pages.onliner;

import com.onliner.pages.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.onliner.by/")
public class OnlinerBasePage extends BasePage {

    @FindBy (xpath = "//div[@class='auth-bar__item auth-bar__item--text']")
    private WebElementFacade loginButton;

    public void openLoginPage() {
        loginButton.click();
    }
}
