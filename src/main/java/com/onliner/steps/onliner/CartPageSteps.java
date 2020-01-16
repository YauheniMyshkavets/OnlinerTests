package com.onliner.steps.onliner;

import com.onliner.pages.onliner.CartPage;
import com.onliner.steps.onliner.common.CommonSteps;
import net.thucydides.core.annotations.Step;

public class CartPageSteps extends CommonSteps {
    CartPage cartPage;

    @Step
    public void verifyCartPageAppears() {
        cartPage.verifyCartPageAppears();
    }

    public String verifyCartPageContainRightItem(String productNameInGallery) {
        return cartPage.verifyCartPageContainRightItem(productNameInGallery);
    }
}
