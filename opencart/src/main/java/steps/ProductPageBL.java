package steps;

import driver.Driver;
import org.testng.Assert;
import pages.ProductPage;
import pages.containers.ProductContainer;

public class ProductPageBL {

    private ProductPage productPage;

    public ProductPageBL() {
        productPage = new ProductPage();
    }

    public ProductPageBL addFourProductsToCart() {
        addProductToCart("iPhone");
        addProductToCart("iPod Classic");
        addProductToCart("Sony VAIO");
        addProductToCart("Palm Treo Pro");
        clickOnShoppingCartButton();
        return new ProductPageBL();
    }

    public ProductPageBL addOneProductToCompare() {
        addProductToComparePage("MacBook Air");
        clickOnProductCompare();
        return new ProductPageBL();
    }

    public ProductPageBL addTwoProductsToCompare() {
        addProductToComparePage("MacBook Air");
        addProductToComparePage("iPod Classic");
        clickOnProductCompare();
        return new ProductPageBL();
    }

    private void addProductToCart(String productName) {
        ProductContainer product = productPage.getProducts()
                .stream()
                .filter(e -> e.getProductTitle().getText().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        Driver.waitForcibly();
        product.getAddToCartButton().click();
    }

    private void addProductToComparePage(String productName) {
        ProductContainer product = productPage.getProducts()
                .stream()
                .filter(e -> e.getProductTitle().getText().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        Driver.waitForcibly();
        product.getAddToCompareButton().click();
    }

    private void clickOnProductCompare() {
        Driver.waitForcibly();
        productPage.getProductCompare().click();
    }

    private void clickOnShoppingCartButton() {
        Driver.waitForcibly();
        productPage.getShoppingCartButton().click();
    }
    public ProductPageBL clickOnListViewButton() {
        productPage.getListViewButton().click();
        return this;
    }
    public ProductPageBL verifyAddToShoppingCart() {
        Assert.assertTrue(productPage.getSuccessfulMessage().getText().contains("Success: "));
        return this;
    }

    public ProductPageBL verifyAddToComparePage() {
        Assert.assertTrue(productPage.getSuccessfulMessage().getText().contains("Success: "));
        return this;
    }
}
