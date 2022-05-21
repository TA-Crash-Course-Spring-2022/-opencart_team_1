package steps;

import org.testng.Assert;
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

    public HeaderPageBL dropCurrencyDropButton(){
        headerPage.getChangeCurrencyButton().click();
        return this;
    }
    public HeaderPageBL chooseCurrency(short id){
        headerPage.getCurrencyDropDownUl().get(id).click();
        return this;
    }
    public HeaderPageBL getSelectedCurrencySymbol(){
        headerPage.getCurrencySymbolOnHomePage().getText();
        return this;
    }
    public String findCurrencyByName(){
        return headerPage.getCurrencyDropDownUl().get(1).getAttribute("name");
    }
    public String findCurrencyByCode(){
        return headerPage.getCurrencyDropDownUl().get(1).getAttribute("name");
    }
    public void verifyCurrencyWasChanged(short id){

        Assert.assertEquals(headerPage.getCurrencySymbolOnHomePage().getText(), String.valueOf(headerPage.getCurrencyDropDownUl().get(id).getText().charAt(0)));
    }
}
