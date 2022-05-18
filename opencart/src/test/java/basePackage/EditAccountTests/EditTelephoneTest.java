package basePackage.EditAccountTests;

import basePackage.BaseTest;
import navigation.Navigation;
import org.testng.annotations.Test;
import repository.EditAccountModelRepository;
import repository.LoginModelRepository;
import steps.EditAccountPageBL;
import steps.LoginPageBL;
import steps.MainPageBL;
import steps.MyAccountPageBL;

import static enums.Url.BASIC_URL;

public class EditTelephoneTest extends BaseTest {

    @Test
    public void changeTelephone() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        MainPageBL mainPageBL = new MainPageBL();
        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton();
        loginPageBL.loginPerson(LoginModelRepository.getLoginUser());
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL()
                .clickOnEditYourAccountInformation();
        EditAccountPageBL editAccountBL = new EditAccountPageBL()
                .editTelephoneOnly(EditAccountModelRepository.getTelephoneEdit())
                .verifySuccessfulEditInformation();
    }
}
