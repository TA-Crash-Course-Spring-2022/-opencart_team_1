package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLoginPage extends BasePage {
    public AdminLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-username")
    private WebElement usernameInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(xpath = "//a[text() ='Forgotten Password']")
    private WebElement forgottenPasswordButton;

    @FindBy(xpath = "//div[@class='panel panel-default']//button[contains(text(),'Login')]")
    private WebElement loginButton;

    @FindBy(xpath = "//a[@href ='http://www.opencart.com']")
    private WebElement opencartMainPageButton;

    @FindBy(xpath = "//*[@id='header-logo']/a")
    private WebElement opencartLogoMainPageLink;

    public WebElement getForgottenPasswordButton() {
        return forgottenPasswordButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getOpencartMainPageButton() {
        return opencartMainPageButton;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getUsernameInput() {
        return usernameInput;
    }

    public WebElement getOpencartLogoMainPageLink() {
        return opencartLogoMainPageLink;
    }
}
