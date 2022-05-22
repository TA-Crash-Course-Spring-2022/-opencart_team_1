package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

@Getter
public class MainPage extends BasePage {
    @FindBy(xpath = "//p[@class='price']")
    private List<WebElement> price;

   // @FindBy(xpath = "//span[text()='Add to Cart']")
    @FindBy(xpath = "//button[contains(@onclick,'cart.add')]")
    private List<WebElement> productsAddToCart;

    @FindBy(xpath = "//a[text()='shopping cart']")
    private WebElement successfulAddProductLinkToShoppingCart;

}
