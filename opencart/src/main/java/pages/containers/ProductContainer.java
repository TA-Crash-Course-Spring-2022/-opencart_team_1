package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductContainer {

    private WebElement rootElement;

    public ProductContainer(WebElement element) {
        this.rootElement = element;
    }

    public String getTitle() {
        return rootElement.findElement(By.xpath(".//h4/a")).getText();
    }

    public String getPrice() {
        return rootElement.findElement(By.className("price")).getText();
    }

    public WebElement getAddToCartButton() {
        return rootElement.findElement(By.xpath(".//*[contains(@class,'shopping-cart')]/.."));
    }

    public WebElement getAddToWishListButton() {
        return rootElement.findElement(By.xpath(".//*[contains(@class,'heart')]/.."));
    }

    public WebElement getCompareThisProductButton() {
        return rootElement.findElement(By.xpath(".//*[contains(@class,'exchange')]/.."));
    }
}
