package steps;

import driver.Driver;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.WebElement;

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
        ProductContainer product = mainPage.getProducts().stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst().orElseThrow(NullPointerException::new);
        product.getAddToCartButton().click();
        return this;
    }
    public void verifySuccessAddToCart(String productName) {
        Assert.assertTrue(mainPage.getAlert().getAttribute("class").contains("success"));
        Assert.assertTrue(mainPage.getAlert().getText().contains(productName), "Other items added to cart");
    }

    public MainPageBL checkCurrencySymbolOnAllProducts(){
        String selectedCurrencyOnHomePage = new HeaderPageBL().getSelectedCurrencyLeftSymbol();
        for(WebElement price: mainPage.getPrice()){
            Assert.assertTrue(price.getText().contains(selectedCurrencyOnHomePage));
        }
        return this;
    }
  
    public MainPageBL addRandomProductToCart(){
        int quantityProducts = mainPage.getProductsAddToCart().size();
        mainPage.getProductsAddToCart().get(RandomUtils.nextInt(1,quantityProducts)).click();
        return this;
    }
    public MainPageBL clickOnLinkToShoppingCart() throws InterruptedException {
        Driver.waitBeClickable(mainPage.getSuccessfulAddProductLinkToShoppingCart());
        mainPage.getSuccessfulAddProductLinkToShoppingCart().click();
       // Thread.sleep(10000);
        return this;
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
