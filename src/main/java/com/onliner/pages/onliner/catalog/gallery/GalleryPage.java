package com.onliner.pages.onliner.catalog.gallery;

import com.onliner.pages.onliner.MainPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class GalleryPage extends MainPage {
    @FindBy (className = "schema-product__title")
    private WebElementFacade firstProduct;

    @FindBy (className = "schema-header__title")
    private WebElementFacade galleryTitle;

    @FindBy (className = "schema-product__title")
    private WebElementFacade productName;

    public void openFirstProduct() {
        firstProduct.click();
    }

    public void verifyGalleryPageAppears() {
        galleryTitle.shouldBeVisible();
    }

    public String getFirstProductName() {
        return productName.getText();
    }
}
