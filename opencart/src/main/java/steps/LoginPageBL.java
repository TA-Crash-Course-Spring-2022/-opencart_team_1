package steps;

import models.LoginModel;
import org.testng.Assert;
import pages.LoginPage;
import pages.MyAccountPage;

public class LoginPageBL {

    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    public LoginPageBL() {
        loginPage = new LoginPage();
    }

    public LoginPageBL loginPerson(LoginModel loginModel) {
        inputEmail(loginModel.getEmail());
        inputPassword(loginModel.getPassword());
        clickOnLoginContinueButton();
        return this;
    }

    private void inputEmail(String email) {
        loginPage.getInputLoginEmail().clear();
        loginPage.getInputLoginEmail().sendKeys(email);
    }

    private void inputPassword(String password) {
        loginPage.getInputLoginPassword().clear();
        loginPage.getInputLoginPassword().sendKeys(password);
    }

    private void clickOnLoginContinueButton() {
        loginPage.getContinueLoginButton().click();
    }

    public LoginPageBL verifySuccessfulLogin() {
        String expectedMessage = "My Account";
        Assert.assertEquals(myAccountPage.getTextMyAccount().getText(), expectedMessage, "Error!");
        return this;
    }
}
