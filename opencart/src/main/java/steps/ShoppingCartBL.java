package steps;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.ShoppingCart;

public class ShoppingCartBL {
    private ShoppingCart shoppingCartBL;

    public ShoppingCartBL(WebDriver driver) {
        shoppingCartBL = new ShoppingCart(driver);
    }

    // Shopping cart
    public ShoppingCartBL enterQuantityValue(short id, String value) {
        WebElement inputQuantityValue = shoppingCartBL.getQuantityInputForm(id);
        inputQuantityValue.clear();
        inputQuantityValue.sendKeys(value);
        return this;
    }

    public ShoppingCartBL clickQuantityRefreshButton(short id) {
        WebElement quantityRefreshButton = shoppingCartBL.getQuantityRefreshButton(id);
        quantityRefreshButton.click();
        return this;
    }

    public ShoppingCartBL clickQuantityRemoveButton(short id) {
        WebElement quantityRemoveButton = shoppingCartBL.getQuantityRemoveButton(id);
        quantityRemoveButton.click();
        return this;
    }

    //Coupon and Taxes part

    public ShoppingCartBL dropUseCouponCodeButton() {
        WebElement useCouponCodeButton = shoppingCartBL.getUseCouponDropButton();
        useCouponCodeButton.click();
        return this;
    }

    public ShoppingCartBL fillCouponInput(String couponCode) {
        WebElement couponInput = shoppingCartBL.getInputCoupon();
        couponInput.clear();
        couponInput.sendKeys(couponCode);
        return this;
    }

    public ShoppingCartBL clickApplyCouponButton() {
        WebElement applyCouponButton = shoppingCartBL.getApplyCouponButton();
        applyCouponButton.click();
        return this;
    }

    public ShoppingCartBL dropEstimateShippingAndTaxesButton() {
        WebElement estimateShippingAndTaxesDropButton = shoppingCartBL.getEstimateShippingAndTaxesDropButton();
        estimateShippingAndTaxesDropButton.click();
        return this;
    }

    public ShoppingCartBL chooseCountry(String countryValue) {
        Select country = new Select(shoppingCartBL.getCountrySelect());
        country.selectByValue(countryValue);
        return this;
    }

    public ShoppingCartBL chooseRegionAndState(String regionAndStateZoneId) {
        Select regionAndStateSelect = new Select(shoppingCartBL.getRegionAndStateSelect());
        regionAndStateSelect.selectByValue(regionAndStateZoneId);
        return this;
    }

    public ShoppingCartBL fillPostCodeInput() {
        WebElement postCodeInput = shoppingCartBL.getPostCodeInput();
        postCodeInput.clear();
        postCodeInput.sendKeys();
        return this;
    }

    public ShoppingCartBL clickGetQuotesButton() {
        WebElement getQuotesButton = shoppingCartBL.getGetQuotesButton();
        getQuotesButton.click();
        return this;
    }
    public ShoppingCartBL dropUseGiftCertificateButton() {
        WebElement useGiftCertificateButton = shoppingCartBL.getUseGiftCertificateDropButton();
        useGiftCertificateButton.click();
        return this;
    }
    public ShoppingCartBL fillGiftCertificateInput(String certificateCode) {
        WebElement giftCertificateInput = shoppingCartBL.getInputCoupon();
        giftCertificateInput.clear();
        giftCertificateInput.sendKeys(certificateCode);
        return this;
    }
    public ShoppingCartBL clickApplyGiftCertificateButton() {
        WebElement applyGiftCertificateButton = shoppingCartBL.getGiftCertificationInput();
        applyGiftCertificateButton.click();
        return this;
    }


    // Bottom page //

    public ShoppingCartBL clickContinueShoppingButton() {
        WebElement continueShoppingButton = shoppingCartBL.getContinueShoppingButton();
        continueShoppingButton.click();
        return this;
    }

    public ShoppingCartBL clickCheckoutButton() {
        WebElement checkoutButton = shoppingCartBL.getCheckoutButton();
        checkoutButton.click();
        return this;
    }

}
