package basePackage.EditAccountTests;

import basePackage.BaseTest;
import navigation.Navigation;
import org.testng.annotations.Test;
import repository.EditAccountModelRepository;
import repository.LoginModelRepository;
import repository.RegisterModelRepository;
import steps.*;

import static enums.Url.BASIC_URL;

public class EditEmailTest extends BaseTest {


    @Test
    public void changeEmailTest() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson(RegisterModelRepository.getValidRegisterUser())
                .clickOnSuccessfulRegistrationContinueButton();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL()
                .clickOnEditYourAccountInformation();
        EditAccountPageBL editAccountBL = new EditAccountPageBL()
                .editEmailOnly(EditAccountModelRepository.getEmailEdit())
                .verifySuccessfulEditInformation();
    }
}
