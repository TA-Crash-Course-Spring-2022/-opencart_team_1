package basePackage.AdminCurrenciesTests;

import basePackage.BaseTest;
import models.TaxRateModel;
import navigation.Navigation;
import org.testng.annotations.Test;
import pages.AdminTaxRatesPage;
import repository.TaxRateModelRepository;
import steps.*;

import static enums.Url.ADMIN_URL;

public class AddTaxOnAdminPageTest extends BaseTest {
    @Test
    public void addAdminTaxRateTest() throws InterruptedException {
        new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
        new AdminLoginPageBL()
                .loginAdmin();
        new AdminNavigationPageBL()
                .navigateToTaxRatePage();
        new AdminTaxRatesPageBL()
                .clickAddTaxButton();
        new AdminAddTaxRateBL().buildTaxRate(TaxRateModelRepository.getValidTaxRate());
        new AdminTaxRatesPageBL().verifySuccessfulAddTaxRate();
        Thread.sleep(10000);
    }
    @Test
    public void setTaxRateToClass(){
        new AdminTaxRatesPageBL().sortByDateModified();
        new AdminNavigationPageBL().clickTaxClassesButton();
        new AdminTaxClassesPageBL().editTaxableGoodsClass();
    }
}
