package basePackage.AdminCurrenciesTests;

import basePackage.BaseTest;
import models.EditCurrencyModel;
import navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminCurrencyPage;
import repository.EditCurrencyModelRepository;
import steps.*;

import static enums.Url.ADMIN_URL;
import static enums.Url.BASIC_URL_NSTRAFER;

public class AdminAddCurrencyTest extends BaseTest {
    @Test
    public void addAdminCurrencyTest() throws InterruptedException {
        new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
        new AdminLoginPageBL()
              //  .fillUserNameInput("admin")
               // .fillPasswordInput("neadmin")
                .loginAdmin()
                .clickLoginButton();
        new AdminNavigationPageBL().dropSettingsButton()
                .dropLocalizationButton()
                .clickCurrenciesButton();
        new AdminCurrencyPageBL().clickAddCurrencyButton();
        new AdminEditCurrencyPageBL()
                .editCurrency(EditCurrencyModelRepository.getPositiveCurrencyModel())
                .selectCurrencyStatus()
                .clickSaveCurrency();
        new AdminCurrencyPageBL().verifySuccessfulModifiedOnAdminCurrencyPage();
        new AdminCurrencyPageBL().verifySuccessfulModifiedOnHomePage();
        Thread.sleep(10000);
    }
    @Test
    public void editAdminCurrencyTest() throws InterruptedException {
        new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
//        new HeaderPageBL()
//                .dropCurrencyDropButton();
        Thread.sleep(1000);
    }
}
