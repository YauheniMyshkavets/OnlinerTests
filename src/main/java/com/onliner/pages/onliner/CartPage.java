package com.onliner.pages.onliner;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends MainPage {
    @FindBy (xpath = "//div[@class='cart-form__title cart-form__title_big-alter']")
    private WebElementFacade cartTitle;

    @FindBy (xpath = "//div[contains(@class, 'cart-form__description_condensed-other')]/a")
    private WebElementFacade productInCartTitle;

    @FindBy (xpath = "//a[@class='button-style button-style_primary button-style_small cart-form__button']")
    private WebElementFacade checkoutButton;

    @FindBy (xpath = "//div[@class='cart-form__description-part cart-form__description-part_1']")
    private WebElementFacade checkoutForm;

    public void verifyCartPageAppears() {
        cartTitle.shouldBeVisible();
    }

    public String verifyCartPageContainRightItem(String productNameInGallery) {
        return productInCartTitle.getText();
    }

    public void openCheckoutPage() {
        checkoutButton.click();
    }

    public void verifyCheckoutFormAppears() {
        checkoutForm.shouldBeVisible();
    }
}
