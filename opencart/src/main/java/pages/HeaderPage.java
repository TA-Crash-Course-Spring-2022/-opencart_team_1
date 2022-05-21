package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class HeaderPage extends BasePage {

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//*[contains(@href,'register')]")
    private WebElement registerButton;

    @FindBy(xpath = ".//*[text()= 'Login']")
    private WebElement loginButton;

    @FindBy(id = "wishlist-total")
    private WebElement wishListButton;

    @FindBy(xpath = ".//*[@title= 'Shopping Cart']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = ".//*[@title= 'Checkout']")
    private WebElement checkoutButton;

    @FindBy(xpath = ".//*[span = 'Currency']")
    private WebElement changeCurrencyButton;

    @FindBy(xpath = "//ul[@class = 'dropdown-menu']/li/button")
    private List<WebElement> currencyDropDownUl;

    @FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']/strong")
    private WebElement currencySymbolOnHomePage;

}
