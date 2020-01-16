package com.onliner.pages.onliner;

import com.onliner.pages.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.onliner.by/")
public class OnlinerBasePage extends BasePage {

    @FindBy (xpath = "//div[@class='auth-bar__item auth-bar__item--text']")
    private WebElementFacade loginButton;

    @FindBy (xpath = "//div[contains(@class, 'b-top-profile__image ')]")
    private WebElementFacade profileImage;

    @FindBy (xpath = "//a[@href='https://catalog.onliner.by/']")
    private WebElementFacade catalogPage;

    public void openLogInPage() {
        loginButton.click();
    }

    public void verifyProfileImageAppears() {
        profileImage.shouldBeVisible();
    }

    public void openCatalogPage() {
        catalogPage.click();
    }
}
