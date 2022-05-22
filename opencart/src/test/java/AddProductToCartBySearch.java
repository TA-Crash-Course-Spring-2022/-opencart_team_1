import basePackage.BaseTest;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.ShoppingCartBL;

import static enums.Url.BASIC_URL;

public class AddProductToCartBySearch extends BaseTest {
    @Test
    public void addiPodToCartBySearch() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        MainPageBL mainPageBL = new MainPageBL();
        String product = "iPod Classic";
        mainPageBL.getHeaderPageBL()
                .clickOnSearchField()
                .sendNameToSearchField(product)
                .clickOnSearchButton()
                .addProductToCart(product);
        mainPageBL.verifySuccessAddToCart(product);
        ShoppingCartBL shoppingCartPage = mainPageBL.getHeaderPageBL()
                .clickOnShoppingCartButton();
        shoppingCartPage.clickOnShoppingCartButton();
        shoppingCartPage.verifyProductInCart(product);
    }
}
