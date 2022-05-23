package pages;

import driver.Driver;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.containers.ProductContainer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Getter
public class ProductPage extends BasePage {

    @FindBy(xpath = ".//*[contains(@class, 'product-layout')]")
    private List<WebElement> products;

    @FindBy(xpath = ".//*[@id= 'compare-total']")
    private WebElement productCompare;

    @FindBy(xpath = ".//*[@id= 'list-view']")
    private WebElement listViewButton;

    @FindBy(xpath = ".//*[@id= 'grid-view']")
    private WebElement gridViewButton;

    @FindBy(xpath = ".//*[text()= 'shopping cart']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = ".//*[@class = 'alert alert-success alert-dismissible']")
    private WebElement successfulMessage;

    public List<ProductContainer> getProducts() {
        List<ProductContainer> productContainers = new ArrayList<>();
        for (WebElement element : products) {
            productContainers.add(new ProductContainer(element));
        }
        return productContainers;
    }
}

