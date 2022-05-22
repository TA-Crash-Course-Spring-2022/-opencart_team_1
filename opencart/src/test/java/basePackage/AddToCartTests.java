package basePackage;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;

import static enums.Url.BASIC_URL;

public class AddToCartTests extends BaseTest {

    @Test
    public void addToCart() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .addProductToCart("iPhone")
                .verifyAddToShoppingCart();
    }
}
