package steps;

import org.testng.Assert;
import pages.MyAccountPage;

public class MyAccountPageBL {

    private MyAccountPage myAccountPage;

    public MyAccountPageBL() {
        myAccountPage = new MyAccountPage();
    }

    public MyAccountPageBL clickOnEditYourAccountInformation() {
        myAccountPage.getEditYourAccountInformation().click();
        return new MyAccountPageBL();
    }

    public MyAccountPageBL clickOnChangeYourPassword() {
        myAccountPage.getChangeYourPassword().click();
        return new MyAccountPageBL();
    }

    public MyAccountPageBL clickOnLogoutButton() {
        myAccountPage.getLogout().click();
        return new MyAccountPageBL();
    }

    public MyAccountPageBL verifySuccessfulEditInformation() {
        String expectedMessage = "Success: Your account has been successfully updated.";
        Assert.assertEquals(myAccountPage.getSuccessfulEditAccountMessage().getText(), expectedMessage, "Error!");
        return this;
    }

    public MyAccountPageBL checkEditTelephoneInvalid() {
        String expectedMessage = "Invalid telephone number";
        Assert.assertEquals(myAccountPage.getSuccessfulEditAccountMessage().getText(), expectedMessage, "Success: Your account has been successfully updated.");
        return this;
    }

    public MyAccountPageBL verifySuccessfulChangePassword() {
        String expectedMessage = "Success: Your password has been successfully updated.";
        Assert.assertEquals(myAccountPage.getSuccessfulEditAccountMessage().getText(), expectedMessage, "Error!");
        return this;
    }

    public MyAccountPageBL checkNegativeChangePassword() {
        String expectedMessage = "Error!";
        Assert.assertEquals(myAccountPage.getSuccessfulEditAccountMessage().getText(), expectedMessage, "Success: Your password has been successfully updated.");
        return this;
    }
}
