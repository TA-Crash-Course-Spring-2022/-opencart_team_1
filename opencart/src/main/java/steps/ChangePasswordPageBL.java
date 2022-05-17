package steps;

import models.ChangePasswordModel;
import org.testng.Assert;
import pages.ChangePasswordPage;
import pages.MyAccountPage;

public class ChangePasswordPageBL {
    private ChangePasswordPage changePasswordPage;
    private MyAccountPage myAccountPage;

    public ChangePasswordPageBL() {
        changePasswordPage = new ChangePasswordPage();
    }

    public ChangePasswordPageBL changePassword(ChangePasswordModel changePasswordModel) {
        inputPassword(changePasswordModel.getPassword());
        inputPasswordConfirm(changePasswordModel.getConfirmPassword());
        clickOnChangePasswordContinueButton();
        return this;
    }

    private void inputPassword(String password) {
        changePasswordPage.getChangePasswordInput().clear();
        changePasswordPage.getChangePasswordInput().sendKeys(password);
    }

    private void inputPasswordConfirm(String passwordConfirm) {
        changePasswordPage.getChangePasswordConfirmInput().clear();
        changePasswordPage.getChangePasswordConfirmInput().sendKeys(passwordConfirm);
    }

    private void clickOnChangePasswordContinueButton() {
        changePasswordPage.getChangePasswordContinueButton().click();
    }

    public ChangePasswordPageBL verifySuccessfulChangePassword() {
        String expectedMessage = "Success: Your password has been successfully updated.";
        Assert.assertEquals(myAccountPage.getSuccessfulEditAccountMessage().getText(), expectedMessage, "Error!");
        return this;
    }

    public ChangePasswordPageBL checkInvalidChangePassword() {
        String expectedMessage = "Error!";
        Assert.assertEquals(myAccountPage.getSuccessfulEditAccountMessage().getText(), expectedMessage, "Success: Your password has been successfully updated.");
        return this;
    }
}
