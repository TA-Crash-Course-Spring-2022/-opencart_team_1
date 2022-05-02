package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchField extends BasePage {

    @FindBy(xpath = "//*[@name= 'search']")
    private WebElement searchInput;

    @FindBy(xpath = "//*[@class= 'btn btn-default btn-lg']")
    private WebElement searchButton;

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}
