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

    public MenuBL getMenuBL() {
        return new MenuBL();
    }

    public MainPageBL addOneProductToShoppingCart() {
        addProductToCart("iPhone");
        clickOnLinkToShoppingCart();
        return new MainPageBL();
    }

    public MainPageBL addTwoProductsToShoppingCart() {
        addProductToCart("iPhone");
        addProductToCart("MacBook");
        clickOnLinkToShoppingCart();
        return new MainPageBL();
    }
    private void addProductToCart(String productName) {
        ProductContainer product = mainPage.getProducts()
                .stream()
                .filter(e -> e.getProductTitle().getText().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        mainPage.waitForElement();
        product.getAddToCartButton().click();
    }

    public MainPageBL addTwoProductsToCompare() {
        addProductToComparePage("iPhone");
        addProductToComparePage("MacBook");
        clickOnProductComparison();
        return new MainPageBL();
    }

    private void addProductToComparePage(String productName) {
        ProductContainer product = mainPage.getProducts()
                .stream()
                .filter(e -> e.getProductTitle().getText().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        mainPage.waitForElement();
        product.getAddToCompareButton().click();
    }

    private void clickOnProductComparison() {
        mainPage.getSuccessfulMessageAlert();
        mainPage.getProductComparison().click();
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
    private MainPageBL clickOnLinkToShoppingCart() {
        Driver.waitBeClickable(mainPage.getSuccessfulAddProductLinkToShoppingCart());
        mainPage.getSuccessfulAddProductLinkToShoppingCart().click();
       // Thread.sleep(10000);
        return this;
    }
}
