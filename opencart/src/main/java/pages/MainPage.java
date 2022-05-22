package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.containers.ProductContainer;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends BasePage{

    @FindBy(xpath = ".//*[contains(@class,'product-layout')]")
    private List<WebElement> products;

    @FindBy(xpath = "//div[contains(@class,'alert-')]")
    private WebElement alert;

    @FindBy(xpath = "//a[normalize-space()='product comparison']")
    private WebElement comparisonAlert;

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

    public WebElement getComparisonAlert() {
        wait.until(ExpectedConditions.visibilityOf(comparisonAlert));
        return comparisonAlert;
    }
}

