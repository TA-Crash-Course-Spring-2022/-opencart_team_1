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
}
