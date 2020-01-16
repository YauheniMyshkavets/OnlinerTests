package com.onliner.pages.onliner.catalog.gallery;

import com.onliner.pages.onliner.OnlinerBasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class GalleryPage extends OnlinerBasePage {
    @FindBy (className = "//schema-product__title")
    //div[@class='schema-product__title']
    WebElementFacade firstProduct;

    public void openFirstProduct() {
        firstProduct.click();
    }
}
