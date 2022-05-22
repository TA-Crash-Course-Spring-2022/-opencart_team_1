package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.containers.ProductContainer;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MainPage extends BasePage {

    @FindBy(xpath = ".//*[contains(@class, 'product-layout')]")
    private List<WebElement> products;

    @FindBy(xpath = ".//*[text() = 'product comparison']")
    private WebElement productComparison;

    @FindBy(xpath = ".//*[@class = 'alert alert-success alert-dismissible']")
    private WebElement successfulAddProductToCompareMessage;

    @FindBy(xpath = "//div[contains(@class,'alert-')]")
    private WebElement alert;

    public List<ProductContainer> getProducts() {
        List<ProductContainer> productContainers = new ArrayList<>();
        for (WebElement element : products) {
            productContainers.add(new ProductContainer(element));
        }
        return productContainers;
    }
    public WebElement getAlert() {
        wait.until(ExpectedConditions.visibilityOf(alert));
        return alert;
    }
}
