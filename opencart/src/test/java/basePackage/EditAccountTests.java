package basePackage;

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
                .loginPerson(LoginRepository.getLoginUser());
        new MyAccountPageBL()
                .clickOnEditYourAccountInformation();
        new EditAccountPageBL()
                .editFirstNameOnly(EditAccountRepository.getFirstNameEdit())
                .verifySuccessfulEditInformation();
    }

    @Test
    public void changeLastName() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson(LoginRepository.getLoginUser());
        new MyAccountPageBL()
                .clickOnEditYourAccountInformation();
        new EditAccountPageBL()
                .editLastNameOnly(EditAccountRepository.getLastNameEdit())
                .verifySuccessfulEditInformation();
    }

    @Test
    public void changeTelephone() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson(LoginRepository.getLoginUser());
        new MyAccountPageBL()
                .clickOnEditYourAccountInformation();
        new EditAccountPageBL()
                .editTelephoneOnly(EditAccountRepository.getTelephoneEdit())
                .verifySuccessfulEditInformation();
    }

    @Test
    public void changeTelephoneNegative() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson(LoginRepository.getLoginUser());
        new MyAccountPageBL()
                .clickOnEditYourAccountInformation();
        new EditAccountPageBL()
                .editTelephoneOnly(EditAccountRepository.getInvalidTelephoneEdit())
                .checkEditTelephoneInvalid();
    }

    @Test
    public void changeEmail() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson(RegisterRepository.getValidRegisterUser())
                .clickOnSuccessfulRegistrationContinueButton();
        new MyAccountPageBL()
                .clickOnEditYourAccountInformation();
        new EditAccountPageBL()
                .editEmailOnly(EditAccountRepository.getEmailEdit())
                .verifySuccessfulEditInformation();
    }

    @Test
    public void changeAllAccountInformation() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson(RegisterRepository.getValidRegisterUser())
                .clickOnSuccessfulRegistrationContinueButton();
        new MyAccountPageBL()
                .clickOnEditYourAccountInformation();
        new EditAccountPageBL()
                .editInformation(EditAccountRepository.getValidEditAccount())
                .verifySuccessfulEditInformation();
        new MyAccountPageBL()
                .clickOnChangeYourPassword();
        new ChangePasswordPageBL()
                .changePassword(ChangePasswordRepository.getPositiveChangePassword())
                .verifySuccessfulChangePassword();
    }
}
