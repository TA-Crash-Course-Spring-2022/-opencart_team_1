package basePackage.ChangePasswordTests;

import basePackage.BaseTest;
import navigation.Navigation;
import org.testng.annotations.Test;
import repository.ChangePasswordModelRepository;
import repository.RegisterModelRepository;
import steps.ChangePasswordPageBL;
import steps.MainPageBL;
import steps.MyAccountPageBL;
import steps.RegisterPageBL;

import static enums.Url.BASIC_URL;

public class ChangePasswordNegativeTest extends BaseTest {

    @Test
    public void changePasswordNegative() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson(RegisterModelRepository.getValidRegisterUser())
                .clickOnSuccessfulRegistrationContinueButton();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL()
                .clickOnChangeYourPassword();
        ChangePasswordPageBL changePasswordPageBL = new ChangePasswordPageBL()
                .changePassword(ChangePasswordModelRepository.getNegativeChangePassword())
                .checkNegativeChangePassword();
    }
}
