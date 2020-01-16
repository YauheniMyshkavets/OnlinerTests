package com.onliner.steps.onliner.catalog.gallery;

import com.onliner.pages.onliner.catalog.gallery.GalleryPage;
import com.onliner.steps.onliner.common.CommonSteps;
import net.thucydides.core.annotations.Step;

public class GalleryPageSteps extends CommonSteps {
    GalleryPage galleryPage;

    @Step
    public void openFirstProduct() {
        galleryPage.openFirstProduct();
    }

    @Step
    public void verifyGalleryPageAppears() {
        galleryPage.verifyGalleryPageAppears();
    }

    @Step
    public String getFirstProductName() {
       return galleryPage.getFirstProductName();
    }
}
