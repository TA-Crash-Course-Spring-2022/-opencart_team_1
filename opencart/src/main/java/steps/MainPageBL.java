package steps;

import org.testng.Assert;
import pages.MainPage;
import pages.containers.ProductContainer;

public class MainPageBL {

    private MainPage mainPage;

    public MainPageBL() {
        mainPage = new MainPage();
    }

    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
    }

    public MainPageBL addProductToCart(String productName) {
        ProductContainer product = mainPage.getProducts()
                .stream()
                .filter(e -> e.getProductTitle().getText().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        mainPage.waitForElement();
        product.getAddToCartButton().click();
        mainPage.waitForElement();
        return this;
    }

    public MainPageBL addProductToComparePage(String productName) {
        ProductContainer product = mainPage.getProducts()
                .stream()
                .filter(e -> e.getProductTitle().getText().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        mainPage.waitForElement();
        product.getAddToCompareButton().click();
        mainPage.waitForElement();
        return this;
    }

    public MainPageBL clickOnProductComparison() {
        mainPage.waitForElement();
        mainPage.getProductComparison().click();
        return new MainPageBL();
    }

    public MainPageBL verifyAddToShoppingCart() {
        mainPage.waitForElement();
        Assert.assertTrue(mainPage.getSuccessfulMessage().getText().contains("Success: "));
        return this;
    }

    public MainPageBL verifyAddToCompare() {
        mainPage.waitForElement();
        Assert.assertTrue(mainPage.getSuccessfulMessage().getText().contains("Success: "));
        return this;
    }
}
