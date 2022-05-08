package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AdminLoginPage;
import pages.ShoppingCart;

public class AdminLoginPageBL {
    private AdminLoginPage adminLoginPageBL;


    public AdminLoginPageBL(WebDriver driver) {
        adminLoginPageBL = new AdminLoginPage(driver);
    }

    public AdminLoginPageBL fillUsernameInput(String username) {
        WebElement usernameInput = adminLoginPageBL.getUsernameInput();
        usernameInput.clear();
        usernameInput.sendKeys(username);
        return this;
    }
    public AdminLoginPageBL fillPasswordInput(String password) {
        WebElement passwordInput = adminLoginPageBL.getPasswordInput();
        passwordInput.clear();
        passwordInput.sendKeys(password);
        return this;
    }
    public AdminLoginPageBL clickForgottenPassword(){
        WebElement forgottenPasswordButton = adminLoginPageBL.getForgottenPasswordButton();
        forgottenPasswordButton.click();
        return this;
    }
    public AdminLoginPageBL clickLoginButton(){
        WebElement loginButton = adminLoginPageBL.getLoginButton();
        loginButton.click();
        return this;
    }
    public AdminLoginPageBL clickOpencartMainPageLinkButton(){
        WebElement opencartAdminLoginPageButton = adminLoginPageBL.getOpencartMainPageButton();
        opencartAdminLoginPageButton.click();
        return this;
    }
    public AdminLoginPageBL clickOpencartLogoMainPageLink(){
        WebElement opencartAdminLoginPageButton = adminLoginPageBL.getOpencartLogoMainPageLink();
        opencartAdminLoginPageButton.click();
        return this;
    }

}
