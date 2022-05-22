package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

@Getter
public class MainPage extends BasePage {
    @FindBy(xpath = "//p[@class='price']")
    private List<WebElement> price;



    @FindBy(xpath = ".//*[contains(@class, 'product-layout')]")
    private List<WebElement> products;

    @FindBy(xpath = ".//*[text() = 'product comparison']")
    private WebElement productComparison;

    @FindBy(xpath = ".//*[@class = 'alert alert-success alert-dismissible']")
    private WebElement successfulAddProductToCompareMessage;

    public List<ProductContainer> getProducts() {
        List<ProductContainer> productContainers = new ArrayList<>();
        for (WebElement element : products) {
            productContainers.add(new ProductContainer(element));
        }
        return productContainers;
    }
  
}
