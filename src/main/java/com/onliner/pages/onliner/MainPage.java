package com.onliner.pages.onliner;

import com.onliner.pages.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.onliner.by/")
public class MainPage extends BasePage {

    @FindBy (xpath = "//div[@class='auth-bar__item auth-bar__item--text']")
    private WebElementFacade loginButton;

    @FindBy (className = "b-top-profile__image")
    private WebElementFacade profileImage;

    @FindBy (xpath = "//a[@href='https://catalog.onliner.by/']")
    private WebElementFacade catalogPage;

    @FindBy (xpath = "//a[@class='auth-bar__item auth-bar__item--cart']")
    private WebElementFacade cartButton;

    public void openLogInPage() {
        loginButton.click();
    }

    public void verifyProfileImageAppears() {
        profileImage.shouldBeVisible();
    }

    public void openCatalogPage() {
        catalogPage.click();
    }

    public void openCartPage() {
        cartButton.click();
    }
}
