package com.onliner.pages.onliner.catalog;

import com.onliner.pages.onliner.OnlinerBasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CatalogPage extends OnlinerBasePage {
    @FindBy (xpath = "//li/a[@href='https://catalog.onliner.by/mobile']")
    private WebElementFacade mobilePhonesCategory;

    public void selectMobilePhonesCategory() {
        mobilePhonesCategory.click();
    }
}
