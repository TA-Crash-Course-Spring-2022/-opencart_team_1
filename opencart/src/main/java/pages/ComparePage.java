package pages;

import driver.Driver;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.containers.CompareContainer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Getter
public class ComparePage extends BasePage {

    @FindBy(xpath = ".//*[@class = 'alert alert-success alert-dismissible']")
    private WebElement successfulMessage;

    @FindBy(xpath = ".//table[@class= 'table table-bordered']")
    private List <WebElement> products;

    @FindBy(xpath = ".//*[@id= 'content']/h1")
    private WebElement comparePageText;
    public List<CompareContainer> getProducts() {
        List<CompareContainer> compareContainers = new ArrayList<>();
        for (WebElement rootElement : products) {
            compareContainers.add(new CompareContainer(rootElement));
        }
        return compareContainers;
    }
}
