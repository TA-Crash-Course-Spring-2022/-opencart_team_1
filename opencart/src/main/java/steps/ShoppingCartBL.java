package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.ShoppingCartPage;

public class ShoppingCartBL {
    private ShoppingCartPage shoppingCartPageBL;

    public ShoppingCartBL() {
        shoppingCartPageBL = new ShoppingCartPage();
    }

    // Shopping cart
    public ShoppingCartBL enterQuantityValue(short id, String value) {
        WebElement inputQuantityValue = shoppingCartPageBL.getQuantityInputForm(id);
        inputQuantityValue.clear();
        inputQuantityValue.sendKeys(value);
        return this;
    }

    public ShoppingCartBL clickQuantityRefreshButton(short id) {
        WebElement quantityRefreshButton = shoppingCartPageBL.getQuantityRefreshButton(id);
        quantityRefreshButton.click();
        return this;
    }

    public ShoppingCartBL clickQuantityRemoveButton(short id) {
        WebElement quantityRemoveButton = shoppingCartPageBL.getQuantityRemoveButton(id);
        quantityRemoveButton.click();
        return this;
    }

    //Coupon and Taxes part

    public ShoppingCartBL dropUseCouponCodeButton() {
        WebElement useCouponCodeButton = shoppingCartPageBL.getUseCouponDropButton();
        useCouponCodeButton.click();
        return this;
    }

    public ShoppingCartBL fillCouponInput(String couponCode) {
        WebElement couponInput = shoppingCartPageBL.getInputCoupon();
        couponInput.clear();
        couponInput.sendKeys(couponCode);
        return this;
    }

    public ShoppingCartBL clickApplyCouponButton() {
        WebElement applyCouponButton = shoppingCartPageBL.getApplyCouponButton();
        applyCouponButton.click();
        return this;
    }

    public ShoppingCartBL dropEstimateShippingAndTaxesButton() {
        WebElement estimateShippingAndTaxesDropButton = shoppingCartPageBL.getEstimateShippingAndTaxesDropButton();
        estimateShippingAndTaxesDropButton.click();
        return this;
    }

    public ShoppingCartBL chooseCountry(String countryValue) {
        Select country = new Select(shoppingCartPageBL.getCountrySelect());
        country.selectByValue(countryValue);
        return this;
    }

    public ShoppingCartBL chooseRegionAndState(String regionAndStateZoneId) {
        Select regionAndStateSelect = new Select(shoppingCartPageBL.getRegionAndStateSelect());
        regionAndStateSelect.selectByValue(regionAndStateZoneId);
        return this;
    }

    public ShoppingCartBL fillPostCodeInput() {
        WebElement postCodeInput = shoppingCartPageBL.getPostCodeInput();
        postCodeInput.clear();
        postCodeInput.sendKeys();
        return this;
    }

    public ShoppingCartBL clickGetQuotesButton() {
        WebElement getQuotesButton = shoppingCartPageBL.getGetQuotesButton();
        getQuotesButton.click();
        return this;
    }

    public ShoppingCartBL dropUseGiftCertificateButton() {
        WebElement useGiftCertificateButton = shoppingCartPageBL.getUseGiftCertificateDropButton();
        useGiftCertificateButton.click();
        return this;
    }

    public ShoppingCartBL fillGiftCertificateInput(String certificateCode) {
        WebElement giftCertificateInput = shoppingCartPageBL.getInputCoupon();
        giftCertificateInput.clear();
        giftCertificateInput.sendKeys(certificateCode);
        return this;
    }

    public ShoppingCartBL clickApplyGiftCertificateButton() {
        WebElement applyGiftCertificateButton = shoppingCartPageBL.getGiftCertificationInput();
        applyGiftCertificateButton.click();
        return this;
    }


    // Bottom page //

    public ShoppingCartBL clickContinueShoppingButton() {
        WebElement continueShoppingButton = shoppingCartPageBL.getContinueShoppingButton();
        continueShoppingButton.click();
        return this;
    }

    public ShoppingCartBL clickCheckoutButton() {
        WebElement checkoutButton = shoppingCartPageBL.getCheckoutButton();
        checkoutButton.click();
        return this;
    }

}
