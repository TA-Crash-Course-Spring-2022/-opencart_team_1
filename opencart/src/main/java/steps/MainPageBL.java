package steps;

import driver.Driver;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.MainPage;

public class MainPageBL {

    private MainPage mainPage;

    public MainPageBL() {
        mainPage = new MainPage();
    }

    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
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
    public MainPageBL clickOnLinkToShoppingCart() throws InterruptedException {
        Driver.waitBeClickable(mainPage.getSuccessfulAddProductLinkToShoppingCart());
        mainPage.getSuccessfulAddProductLinkToShoppingCart().click();
       // Thread.sleep(10000);
        return this;
    }
}
