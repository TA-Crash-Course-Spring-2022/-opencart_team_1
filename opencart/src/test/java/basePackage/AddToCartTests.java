package basePackage;

import navigation.Navigation;
import org.testng.annotations.Test;
import pages.ShoppingCart;
import steps.MainPageBL;
import steps.ProductPageBL;
import steps.ShoppingCartBL;

import static enums.Url.BASIC_URL;

public class AddToCartTests extends BaseTest {

    @Test
    public void addProductToCart() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .addOneProductToShoppingCart();
        new ShoppingCartBL()
                .verifyAddToCart();
    }

    @Test
    public void addTwoProductsToCart() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .addTwoProductsToShoppingCart();
        new ShoppingCartBL()
                .verifyAddToCart();
    }

    @Test
    public void addFourProductsToCartFromProductPage() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getMenuBL()
                .clickOnDesktopsButton()
                .clickOnShowAllDesktopsButton();
        new ProductPageBL()
                .addFourProductsToCart();
        new ShoppingCartBL()
                .verifyAddToCart();
    }
}
