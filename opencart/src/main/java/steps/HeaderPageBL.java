package steps;

import pages.HeaderPage;

public class HeaderPageBL {

    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public HeaderPageBL clickOnMyAccountButton() {
        headerPage.getMyAccountButton().click();
        return this;
    }

    public RegisterPageBL clickOnRegisterButton() {
        headerPage.getRegisterButton().click();
        return new RegisterPageBL();
    }

    public LoginPageBL clickOnLoginButton() {
        headerPage.getLoginButton().click();
        return new LoginPageBL();
    }

    public ShoppingCartBL clickOnShoppingCartButton() {
        headerPage.getShoppingCartButton().click();
        return new ShoppingCartBL();
    }

    public CheckoutPageBL clickOnCheckoutButton() {
        headerPage.getCheckoutButton().click();
        return new CheckoutPageBL();
    }
}
