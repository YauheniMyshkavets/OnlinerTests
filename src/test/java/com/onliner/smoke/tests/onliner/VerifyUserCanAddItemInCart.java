package com.onliner.smoke.tests.onliner;

import com.onliner.smoke.common.BaseTemplateOnliner;
import org.junit.Test;

public class VerifyUserCanAddItemInCart extends BaseTemplateOnliner {

    @Test
    public void verifyUserCanAddItemInCart() {
        logIn();
        onlinerBasePageSteps.openCatalogPage();
        catalogPageSteps.selectMobilePhonesCategory();
        galleryPageSteps.openFirstProduct();
        int i = 0;

    }

}
