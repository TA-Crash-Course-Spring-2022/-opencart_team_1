package basePackage;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HeaderPageBL;

import static enums.Url.BASIC_URL_NSTRAFER;

public class ChangeCurrencyOnHomePageTest extends BaseTest {


    @Test(description = "changeCurrencyOnHomePage")
    public void changeCurrencyOnHomePageTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASIC_URL_NSTRAFER.getUrlValue());
        new HeaderPageBL()
                .dropCurrencyDropButton()
                .chooseCurrency((short) 1)
                .dropCurrencyDropButton()
                .verifyCurrencyWasChanged((short) 1);
    }
}
