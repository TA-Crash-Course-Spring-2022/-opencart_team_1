package steps;

import models.UserModel;
import org.testng.Assert;
import pages.EditAccountPage;
import pages.MyAccountPage;

public class EditAccountPageBL {

    private EditAccountPage editAccountPage;

    public EditAccountPageBL() {
        editAccountPage = new EditAccountPage();
    }

    public EditAccountPageBL editInformation(UserModel userModel) {
        editFirstName(userModel.getFirstName());
        editLastName(userModel.getLastName());
        editEmail(userModel.getEmail());
        editTelephone(userModel.getTelephone());
        clickOnEditContinueButton();
        return new EditAccountPageBL();
    }

    public EditAccountPageBL editFirstNameOnly(UserModel userModel) {
        editFirstName(userModel.getFirstName());
        clickOnEditContinueButton();
        return new EditAccountPageBL();
    }

    public EditAccountPageBL editLastNameOnly(UserModel userModel) {
        editLastName(userModel.getLastName());
        clickOnEditContinueButton();
        return new EditAccountPageBL();
    }

    public EditAccountPageBL editEmailOnly(UserModel userModel) {
        editEmail(userModel.getEmail());
        clickOnEditContinueButton();
        return new EditAccountPageBL();
    }

    public EditAccountPageBL editTelephoneOnly(UserModel userModel) {
        editTelephone(userModel.getTelephone());
        clickOnEditContinueButton();
        return new EditAccountPageBL();
    }

    public void editFirstName(String firstname) {
        editAccountPage.getEditFirstNameInput().clear();
        editAccountPage.getEditFirstNameInput().sendKeys(firstname);
    }

    private void editLastName(String lastname) {
        editAccountPage.getEditLastNameInput().clear();
        editAccountPage.getEditLastNameInput().sendKeys(lastname);
    }

    private void editEmail(String email) {
        editAccountPage.getEditEmailInput().clear();
        editAccountPage.getEditEmailInput().sendKeys(email);
    }

    private void editTelephone(String telephone) {
        editAccountPage.getEditTelephoneInput().clear();
        editAccountPage.getEditTelephoneInput().sendKeys(telephone);
    }

    private void clickOnEditContinueButton() {
        editAccountPage.getEditContinueButton().click();
    }

    public EditAccountPageBL clickOnEditBackButton() {
        return new EditAccountPageBL();
    }
}

