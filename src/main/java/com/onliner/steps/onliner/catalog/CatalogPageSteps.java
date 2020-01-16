package com.onliner.steps.onliner.catalog;

import com.onliner.pages.onliner.catalog.CatalogPage;
import com.onliner.steps.onliner.common.CommonSteps;
import net.thucydides.core.annotations.Step;

public class CatalogPageSteps extends CommonSteps {
    CatalogPage catalogPage;

    @Step
    public void selectMobilePhonesCategory() {
        catalogPage.selectMobilePhonesCategory();
    }

    @Step
    public void verifyCatalogPageAppears() {
        catalogPage.verifyCatalogPageAppears();
    }
}
