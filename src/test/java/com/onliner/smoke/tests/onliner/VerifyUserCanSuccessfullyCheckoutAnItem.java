package com.onliner.smoke.tests.onliner;

import com.onliner.smoke.common.BaseTemplateOnliner;
import org.junit.Test;

public class VerifyUserCanSuccessfullyCheckoutAnItem extends BaseTemplateOnliner {

    @Test
    public void verifyUserCanSuccessfullyCheckoutAnItem() {
        openSite();
        logIn();
        addItemToCart();

        productDetailPageSteps.openCart();

        cartPageSteps.verifyCartPageAppears();
        cartPageSteps.openCheckoutForm();
        cartPageSteps.verifyCheckoutFormAppears();
    }
}
