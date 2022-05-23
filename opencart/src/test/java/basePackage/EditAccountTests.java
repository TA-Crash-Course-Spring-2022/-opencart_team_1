package basePackage;

import models.UserModel;
import navigation.Navigation;
import org.testng.annotations.Test;
import repository.ChangePasswordRepository;
import repository.EditAccountRepository;
import repository.LoginRepository;
import repository.RegisterRepository;
import steps.*;

import static enums.Url.BASIC_URL;

public class EditAccountTests extends BaseTest {

    @Test
    public void changeFirstName() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson(LoginRepository.getLoginUser())
                .verifySuccessfulLogin();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL()
                .clickOnEditYourAccountInformation();
        new EditAccountPageBL()
                .editFirstNameOnly(EditAccountRepository.getFirstNameEdit());
        myAccountPageBL.verifySuccessfulEditInformation();
    }

    @Test
    public void changeLastName() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson(LoginRepository.getLoginUser())
                .verifySuccessfulLogin();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL()
                .clickOnEditYourAccountInformation();
        new EditAccountPageBL()
                .editLastNameOnly(EditAccountRepository.getLastNameEdit());
        myAccountPageBL.verifySuccessfulEditInformation();
    }

    @Test
    public void changeTelephone() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson(LoginRepository.getLoginUser())
                .verifySuccessfulLogin();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL()
                .clickOnEditYourAccountInformation();
        new EditAccountPageBL()
                .editTelephoneOnly(EditAccountRepository.getTelephoneEdit());
        myAccountPageBL.verifySuccessfulEditInformation();
    }

    @Test
    public void changeTelephoneNegative() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson(LoginRepository.getLoginUser())
                .verifySuccessfulLogin();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL()
                .clickOnEditYourAccountInformation();
        new EditAccountPageBL()
                .editTelephoneOnly(EditAccountRepository.getInvalidTelephoneEdit());
        myAccountPageBL.checkEditTelephoneInvalid();
    }

    @Test
    public void changeEmail() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson(RegisterRepository.getValidRegisterUser())
                .verifyUserRegistration()
                .clickOnSuccessfulRegistrationContinueButton();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL()
                .clickOnEditYourAccountInformation();
        new EditAccountPageBL()
                .editEmailOnly(EditAccountRepository.getEmailEdit());
        myAccountPageBL.verifySuccessfulEditInformation();
    }

    @Test
    public void changeAllAccountInformation() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson(RegisterRepository.getValidRegisterUser())
                .verifyUserRegistration()
                .clickOnSuccessfulRegistrationContinueButton();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL()
                .clickOnEditYourAccountInformation();
        new EditAccountPageBL()
                .editInformation(EditAccountRepository.getValidEditAccount());
        myAccountPageBL.verifySuccessfulEditInformation()
                .clickOnChangeYourPassword();
        new ChangePasswordPageBL()
                .changePassword(ChangePasswordRepository.getPositiveChangePassword());
        myAccountPageBL.verifySuccessfulChangePassword();
    }
    @Test
    public void changeLastNameAndPasswordStory() {
        UserModel newUser = RegisterRepository.getValidRegisterUser();
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson(newUser)
                .verifyUserRegistration()
                .clickOnSuccessfulRegistrationContinueButton();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL()
                .clickOnLogoutButton();
        new LogoutPageBL()
                .verifySuccessfulLogout()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton();
        new LoginPageBL()
                .loginPerson(newUser)
                .verifySuccessfulLogin();
        myAccountPageBL.clickOnEditYourAccountInformation();
        new EditAccountPageBL()
                .editLastNameOnly(EditAccountRepository.getLastNameEdit());
        myAccountPageBL.verifySuccessfulEditInformation()
        .clickOnChangeYourPassword();
        new ChangePasswordPageBL()
                .changePassword(ChangePasswordRepository.getPositiveChangePassword());
        myAccountPageBL.verifySuccessfulChangePassword();
    }
}
