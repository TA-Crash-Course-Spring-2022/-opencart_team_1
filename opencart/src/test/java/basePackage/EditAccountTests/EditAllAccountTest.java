package basePackage.EditAccountTests;

import basePackage.BaseTest;
import navigation.Navigation;
import org.testng.annotations.Test;
import repository.ChangePasswordModelRepository;
import repository.EditAccountModelRepository;
import repository.RegisterModelRepository;
import steps.*;

import static enums.Url.BASIC_URL;

public class EditAllAccountTest extends BaseTest {

    @Test
    public void changePassword() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson(RegisterModelRepository.getValidRegisterUser())
                .clickOnSuccessfulRegistrationContinueButton();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL()
                .clickOnEditYourAccountInformation();
        EditAccountPageBL editAccountPageBL = new EditAccountPageBL()
                .editInformation(EditAccountModelRepository.getValidEditAccount())
                .verifySuccessfulEditInformation();
        myAccountPageBL.clickOnChangeYourPassword();
        ChangePasswordPageBL changePasswordPageBL = new ChangePasswordPageBL()
                .changePassword(ChangePasswordModelRepository.getPositiveChangePassword())
                .verifySuccessfulChangePassword();
    }




}
