package pages.containers;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ProductContainer extends BasePage {

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

    public WebElement getProductTitle() {
        return element.findElement(By.xpath(".//h4/a"));
    }

    public WebElement getAddToCartButton() {
        return element.findElement(By.xpath(".//*[@class= 'button-group']/button[1]"));
    }

    public WebElement getAddToWishListButton() {
        return element.findElement(By.xpath(".//*[@class= 'button-group']/button[2]"));
    }

    public WebElement getAddToCompareButton() {
        return element.findElement(By.xpath(".//*[@class= 'button-group']/button[3]"));

    }
}
