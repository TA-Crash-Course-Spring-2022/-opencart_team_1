package steps;

import driver.Driver;
import pages.AdminLoginPage;
import pages.AdminNavigationPage;

public class AdminNavigationPageBL {

    private AdminNavigationPage adminNavigationPageBL;

    public AdminNavigationPageBL() {
        adminNavigationPageBL = new AdminNavigationPage();
    }

    public AdminNavigationPageBL dropSettingsButton(){
        Driver.waitBeClickable(adminNavigationPageBL.getSettingsDropButton());
        adminNavigationPageBL.getSettingsDropButton().click();
        return this;
    }

    public AdminNavigationPageBL dropLocalizationButton(){
        Driver.waitBeClickable(adminNavigationPageBL.getLocalizationDropButton());
        adminNavigationPageBL.getLocalizationDropButton().click();
        return this;
    }

    public AdminNavigationPageBL clickCurrenciesButton(){
        Driver.waitBeClickable(adminNavigationPageBL.getCurrenciesButton());
        adminNavigationPageBL.getCurrenciesButton().click();
        return this;
    }
}
