package com.onliner.steps.onliner.catalog.gallery;

import com.onliner.pages.onliner.catalog.gallery.ProductDetailPage;
import com.onliner.steps.onliner.common.CommonSteps;
import net.thucydides.core.annotations.Step;

public class ProductDetailPageSteps extends CommonSteps {
    ProductDetailPage productDetailPage;

    @Step
    public void addToCart() {
        productDetailPage.addToCart();
    }

    @Step
    public void verifyProductDetailPageContainRightItem(String productNameInGallery) {
        productDetailPage.verifyProductDetailPageContainRightItem(productNameInGallery);
    }

    @Step
    public void openCart() {
        productDetailPage.openCart();
    }
}
