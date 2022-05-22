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
    public void addAdminCurrencyTest() throws InterruptedException {
        new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
        new AdminLoginPageBL()
                .loginAdmin();
        new AdminNavigationPageBL()
                .navigateToCurrenciesPage();
        new AdminCurrencyPageBL()
                .clickAddCurrencyButton();
        new AdminEditCurrencyPageBL()
                .addAndSaveNewCurrency();
    }

    @Test(priority = 2)
    public void editAdminCurrencyTest() throws InterruptedException {
        new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
        new AdminLoginPageBL()
                .loginAdmin();
        new AdminNavigationPageBL()
                .navigateToCurrenciesPage();
        new AdminCurrencyPageBL()
                .editLastAddedCurrency();
    }

    @Test(priority = 3)
    public void deleteAdminCurrencyTest() throws InterruptedException {
        new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
        new AdminLoginPageBL()
                .loginAdmin();
        new AdminNavigationPageBL()
                .navigateToCurrenciesPage();
        new AdminCurrencyPageBL()
                .deleteLastAddedCurrency()
                .verifySuccessfulModifiedOnAdminCurrencyPage();
    }
}
