package steps;

import models.EditAccountModel;
import org.testng.Assert;
import pages.EditAccountPage;
import pages.MyAccountPage;

public class EditAccountPageBL {

    private EditAccountPage editAccountPage;
    private MyAccountPage myAccountPage;

    public EditAccountPageBL() {
        editAccountPage = new EditAccountPage();
    }

    public EditAccountPageBL editInformation(EditAccountModel editAccountModel) {
        editFirstName(editAccountModel.getFirstName());
        editLastName(editAccountModel.getLastName());
        editEmail(editAccountModel.getEmail());
        editTelephone(editAccountModel.getTelephone());
        clickOnEditContinueButton();
        return this;
    }

    public EditAccountPageBL editFirstNameOnly(EditAccountModel editAccountModel) {
        editFirstName(editAccountModel.getFirstName());
        clickOnEditContinueButton();
        return this;
    }

    public EditAccountPageBL editLastNameOnly(EditAccountModel editAccountModel) {
        editLastName(editAccountModel.getLastName());
        clickOnEditContinueButton();
        return this;
    }

    public EditAccountPageBL editEmailOnly(EditAccountModel editAccountModel) {
        editEmail(editAccountModel.getEmail());
        clickOnEditContinueButton();
        return this;
    }

    public EditAccountPageBL editTelephoneOnly(EditAccountModel editAccountModel) {
        editTelephone(editAccountModel.getTelephone());
        clickOnEditContinueButton();
        return this;
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

    public EditAccountPageBL verifySuccessfulEditInformation() {
        String expectedMessage = "Success: Your account has been successfully updated.";
        Assert.assertEquals(myAccountPage.getSuccessfulEditAccountMessage().getText(), expectedMessage, "Error!");
        return this;
    }

    public EditAccountPageBL checkEditTelephoneInvalid() {
        String expectedMessage = "Invalid telephone number";
        Assert.assertEquals(myAccountPage.getSuccessfulEditAccountMessage().getText(), expectedMessage, "Success: Your account has been successfully updated.");
        return this;
    }

    public EditAccountPageBL clickOnEditBackButton() {
        return new EditAccountPageBL();
    }
}

