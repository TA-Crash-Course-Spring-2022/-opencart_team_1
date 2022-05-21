package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class CompareContainer extends BasePage {

    private WebElement rootElement;

    public CompareContainer(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    public WebElement getProductDetails() {
        return rootElement.findElement(By.xpath("//table/thead[1]/tr"));
    }

    public WebElement getProductTitle() {
        return rootElement.findElement(By.xpath(".//table/tbody[1]/tr[1]/td"));
    }

    public WebElement getImage() {
        return rootElement.findElement(By.xpath(".//tr[2]"));
    }

    public WebElement getPrice() {
        return rootElement.findElement(By.xpath(".//tr[3]"));
    }

    public WebElement getModel() {
        return rootElement.findElement(By.xpath(".//tr[4]"));
    }

    public WebElement getBrand() {
        return rootElement.findElement(By.xpath(".//tr[5]"));
    }

    public WebElement getAvailability() {
        return rootElement.findElement(By.xpath(".//tr[6]"));
    }

    public WebElement getRating() {
        return rootElement.findElement(By.xpath(".//tr[7]"));
    }

    public WebElement getSummary() {
        return rootElement.findElement(By.xpath(".//tr[8]"));
    }

    public WebElement getWeight() {
        return rootElement.findElement(By.xpath(".//tr[9]"));
    }

    public WebElement getDimensions() {
        return rootElement.findElement(By.xpath(".//tr[10]"));
    }

    public WebElement getMemory() {
        return rootElement.findElement(By.xpath("//table/thead[2]/tr"));
    }

    public WebElement getTest1() {
        return rootElement.findElement(By.xpath("//table/tbody[2]/tr"));
    }

    public WebElement getProcessor() {
        return rootElement.findElement(By.xpath(".//table/thead[3]/tr"));
    }

    public WebElement getNumberOfCores() {
        return rootElement.findElement(By.xpath(".//table/tbody[3]/tr"));
    }

    public WebElement getAddToCartButton() {
        return rootElement.findElement(By.xpath(".//input[@class= 'btn btn-primary btn-block']"));
    }

    public WebElement getRemoveButton() {
        return rootElement.findElement(By.xpath(".//a[@class= 'btn btn-danger btn-block']"));
    }
}
