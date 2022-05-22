package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class MainPage extends BasePage {
    @FindBy(xpath = "//p[@class='price']")
    private List<WebElement> price;
}
