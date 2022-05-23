package steps;

import models.UserModel;
import org.testng.Assert;
import pages.ChangePasswordPage;
import pages.MyAccountPage;

public class ChangePasswordPageBL {
    private ChangePasswordPage changePasswordPage;

    public ChangePasswordPageBL() {
        changePasswordPage = new ChangePasswordPage();
    }

    public ChangePasswordPageBL changePassword(UserModel userModel) {
        inputPassword(userModel.getPassword());
        inputPasswordConfirm(userModel.getPasswordConfirm());
        clickOnChangePasswordContinueButton();
        return new ChangePasswordPageBL();
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
}
