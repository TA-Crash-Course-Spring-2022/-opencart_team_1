package AdminCurrenciesTests;

import basePackage.BaseTest;
import navigation.Navigation;
import org.testng.annotations.Test;
import repository.TaxRateModelRepository;
import steps.*;

import static enums.Url.ADMIN_URL;

public class AddTaxOnAdminPageTest extends BaseTest {
    @Test
    public void addAdminTaxRateTest() {
        new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
        new AdminLoginPageBL()
                .loginAdmin();
        new AdminNavigationPageBL()
                .navigateToTaxRatePage();
        new AdminTaxRatesPageBL()
                .clickAddTaxButton();
        new AdminAddTaxRateBL().buildTaxRate(TaxRateModelRepository.getValidTaxRate());
        new AdminTaxRatesPageBL().verifySuccessfulAddTaxRate();
    }
    @Test
    public void setTaxRateToClass(){
        new AdminTaxRatesPageBL().sortByDateModified();
        new AdminNavigationPageBL().clickTaxClassesButton();
        new AdminTaxClassesPageBL().editTaxableGoodsClass();
    }
}
