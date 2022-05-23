package basePackage;

import navigation.Navigation;
import org.testng.annotations.Test;
import repository.CheckoutModelRepository;
import repository.LoginRepository;
import steps.*;

import static enums.Url.BASIC_URL;

public class MakeOrdersTests extends BaseTest {

    @Test
    public void makeOrderFromProductPageAsGuestUser() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getMenuBL()
                .clickOnDesktopsButton()
                .clickOnShowAllDesktopsButton();
        new ProductPageBL()
                .addFourProductsToCart();
        new ShoppingCartBL()
                .clickCheckoutButton();
        new CheckoutPageBL()
                .makeOrderAsGuest(CheckoutModelRepository.guestUserCheckout())
                .verifyOrder();
    }
}
