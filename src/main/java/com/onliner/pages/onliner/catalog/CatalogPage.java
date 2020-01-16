package com.onliner.pages.onliner.catalog;

import com.onliner.pages.onliner.MainPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CatalogPage extends MainPage {
    @FindBy (xpath = "//li/a[@href='https://catalog.onliner.by/mobile']")
    private WebElementFacade mobilePhonesCategory;

    @FindBy (xpath = "//h1[@class='catalog-navigation__title']")
    private WebElementFacade navigationTitleName;

    public void selectMobilePhonesCategory() {
        mobilePhonesCategory.click();
    }

    public void verifyCatalogPageAppears() {
        navigationTitleName.shouldBeVisible();
    }
}
