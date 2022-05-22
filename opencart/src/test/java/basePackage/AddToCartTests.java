package basePackage;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;

import static enums.Url.BASIC_URL;

public class AddToCartTests extends BaseTest {

    @Test
    public void addTwoProductsToCart() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .addProductToCart("iPhone")
                .addProductToCart("MacBook")

    @Test
    public void addFourProductsToCartFromProductPage() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getMenuBL()
                .clickOnDesktopsButton()
                .clickOnShowAllDesktopsButton();
        new ProductPageBL()
                .addProductToCart("iPod Classic")
                .verifyAddToShoppingCart()
                .addProductToCart("HTC Touch HD")
                .verifyAddToShoppingCart()
                .addProductToCart("Sony VAIO")
                .verifyAddToShoppingCart()
                .addProductToCart("Palm Treo Pro")
                .verifyAddToShoppingCart();
    }
}
