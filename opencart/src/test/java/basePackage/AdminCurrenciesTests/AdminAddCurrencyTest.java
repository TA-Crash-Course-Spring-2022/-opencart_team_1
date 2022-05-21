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
    @Test(priority = 1)
    public void addAdminCurrencyTest() {
        new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
        new AdminLoginPageBL()
                .loginAdmin();
        new AdminNavigationPageBL()
                .navigateToCurrenciesPage();
        new AdminCurrencyPageBL().clickAddCurrencyButton();
        new AdminEditCurrencyPageBL()
                .editAndSaveNewCurrency();
        new AdminCurrencyPageBL()
                .verifySuccessfulModifiedOnAdminCurrencyPage()
                .verifySuccessfulModifiedOnHomePage();
    }

    @Test(priority = 2)
    public void editAdminCurrencyTest() {
        new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
        new AdminLoginPageBL()
                .loginAdmin();
        new AdminNavigationPageBL()
                .navigateToCurrenciesPage();
        new AdminCurrencyPageBL()
                .editLastAddedCurrency()
                .verifySuccessfulModifiedOnAdminCurrencyPage()
                .verifyCurrencyIsChangedOnHomePage();
    }

    @Test(priority = 3)
    public void deleteAdminCurrencyTest() {
        new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
        new AdminLoginPageBL()
                .loginAdmin();
        new AdminNavigationPageBL().navigateToCurrenciesPage();
        new AdminCurrencyPageBL()
                .deleteLastAddedCurrency()
                .verifySuccessfulModifiedOnAdminCurrencyPage()
                .verifyCurrencyWasDeletedOnHomePage();
    }
}
