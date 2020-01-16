package com.onliner.smoke.tests.onliner;

import com.onliner.smoke.common.BaseTemplateOnliner;
import org.junit.Test;

public class VerifyUserCanAddItemInCart extends BaseTemplateOnliner {

    @Test
    public void verifyUserCanAddItemInCart() {
        openSite();
//        mainPageSteps.openLogInPage();
//        logIn();
        mainPageSteps.openCatalogPage();

        catalogPageSteps.verifyCatalogPageAppears();
        catalogPageSteps.selectMobilePhonesCategory();

        galleryPageSteps.verifyGalleryPageAppears();
        String productNameInGallery = galleryPageSteps.getFirstProductName();
        galleryPageSteps.openFirstProduct();

        productDetailPageSteps.verifyProductDetailPageContainRightItem(productNameInGallery);
        productDetailPageSteps.addToCart();

        mainPageSteps.openCartPage();

        cartPageSteps.verifyCartPageAppears();
        cartPageSteps.verifyCartPageContainRightItem(productNameInGallery);
    }
}
