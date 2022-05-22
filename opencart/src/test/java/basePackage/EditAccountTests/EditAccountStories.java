package basePackage.EditAccountTests;

import basePackage.BaseTest;
import models.RegisterModel;
import navigation.Navigation;
import org.testng.annotations.Test;
import repository.ChangePasswordModelRepository;
import repository.EditAccountModelRepository;
import repository.RegisterModelRepository;
import repository.RegisterRepository;
import steps.*;

import static enums.Url.BASIC_URL;

public class EditAccountStories extends BaseTest {

    @Test
    public void changeLastNameAndPassword() {
        RegisterModel newUser = RegisterRepository.getValidRegisterUser();
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson(newUser)
                .verifyUserRegistration()
                .clickOnSuccessfulRegistrationContinueButton();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL()
                .clickOnLogoutButton();
        LogoutPageBL logoutPageBL = new LogoutPageBL()
                .verifySuccessfulLogout()
                .clickOnContinueButton();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton();
        LoginPageBL loginPageBL = new LoginPageBL()
                .loginPersonUponRegistration(newUser)
                .verifySuccessfulLogin();
        myAccountPageBL.clickOnEditYourAccountInformation();
        EditAccountPageBL editAccountPageBL = new EditAccountPageBL()
                .editLastNameOnly(EditAccountModelRepository.getLastNameEdit())
                .verifySuccessfulEditInformation();
        myAccountPageBL.clickOnChangeYourPassword();
        ChangePasswordPageBL changePasswordPageBL = new ChangePasswordPageBL()
                .changePassword(ChangePasswordModelRepository.getPositiveChangePassword())
                .verifySuccessfulChangePassword();
    }
}
