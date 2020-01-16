package com.onliner.pages.onliner.catalog.gallery;

import com.onliner.pages.onliner.MainPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class ProductDetailPage extends MainPage {
    @FindBy (xpath = "//a[@class='button button_orange product-aside__item-button']")
    private WebElementFacade addToCartButton;

    @FindBy (className = "catalog-masthead__title")
    private WebElementFacade productTitle;

    public void addToCart() {
        addToCartButton.click();
    }

    public void verifyProductDetailPageContainRightItem(String productNameInGallery) {
        String productNameInPDP = productTitle.getText();
        Assert.assertEquals(productNameInPDP, productNameInGallery);
    }
}
