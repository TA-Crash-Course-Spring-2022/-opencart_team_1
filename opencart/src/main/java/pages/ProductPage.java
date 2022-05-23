package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.containers.ProductContainer;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ProductPage extends BasePage {

    @FindBy(xpath = ".//*[@id= 'content']")
    private List<WebElement> products;

    @FindBy(xpath = ".//*[@id= 'compare-total']")
    private WebElement productCompare;

    @FindBy(xpath = ".//*[@id= 'list-view']")
    private WebElement listViewButton;

    @FindBy(xpath = ".//*[@id= 'grid-view']")
    private WebElement gridViewButton;

    public List<ProductContainer> getProducts() {
        List<ProductContainer> productContainers = new ArrayList<>();
        for (WebElement element : products) {
            productContainers.add(new ProductContainer(element));
        }
        return productContainers;
    }
}
