package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.containers.CompareContainer;
import pages.containers.ProductContainer;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ComparePage extends BasePage {

    @FindBy(xpath = ".//table[@class= 'table table-bordered']")
    private List <WebElement> products;

    public List<CompareContainer> getProducts() {
        List<CompareContainer> compareContainers = new ArrayList<>();
        for (WebElement rootElement : products) {
            compareContainers.add(new CompareContainer(rootElement));
        }
        return compareContainers;
    }
}
