package steps;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import navigation.Navigation;
import org.testng.Assert;
import pages.AdminCurrencyPage;
import pages.HeaderPage;

import static enums.Url.BASIC_URL_NSTRAFER;

public class AdminCurrencyPageBL {

    private AdminCurrencyPage adminCurrencyPageBL;

    public AdminCurrencyPageBL() {
        adminCurrencyPageBL = new AdminCurrencyPage();
    }

    public AdminCurrencyPageBL clickRefreshCurrencyButton() {
        adminCurrencyPageBL.getRefreshCurrencyValuesButton().click();
        return this;
    }

    public AdminCurrencyPageBL clickAddCurrencyButton() {
        adminCurrencyPageBL.getAddCurrencyValueButton().click();
        return this;
    }

    public AdminCurrencyPageBL clickDeleteCurrencyButton() {
        adminCurrencyPageBL.getDeleteCurrencyValueButton().click();
        return this;
    }

    public AdminCurrencyPageBL checkSummaryCurrencyCheckbox(short id) {
        if (!adminCurrencyPageBL.getSummaryCurrencyCheckbox().isSelected()) {
            adminCurrencyPageBL.getSummaryCurrencyCheckbox().click();
        }
        return this;
    }

    public AdminCurrencyPageBL uncheckSummaryCurrencyCheckbox(short id) {
        if (adminCurrencyPageBL.getSummaryCurrencyCheckbox().isSelected()) {
            adminCurrencyPageBL.getSummaryCurrencyCheckbox().click();
        }
        return this;
    }

    public AdminCurrencyPageBL sortByCurrencyTitle() {
        adminCurrencyPageBL.getSortByCurrencyTitleButton().click();
        return this;
    }

    public AdminCurrencyPageBL sortByCurrencyCode() {
        adminCurrencyPageBL.getSortByCodeButton().click();
        return this;
    }

    public AdminCurrencyPageBL sortByCurrencyValue() {
        adminCurrencyPageBL.getSortByValueButton().click();
        return this;
    }

    public AdminCurrencyPageBL sortByLastUpdated() {
        adminCurrencyPageBL.getSortByLastUpdatedButton().click();
        return this;
    }

    public AdminCurrencyPageBL checkCurrencyCheckbox(short id){
        if(!adminCurrencyPageBL.getCurrencies().get(id).getCurrencyCheckbox().isSelected()){
            adminCurrencyPageBL.getCurrencies().get(id).getCurrencyCheckbox().click();
        }
        return this;
    }
    public AdminCurrencyPageBL uncheckCurrencyCheckbox(short id){
        if(adminCurrencyPageBL.getCurrencies().get(id).getCurrencyCheckbox().isSelected()){
            adminCurrencyPageBL.getCurrencies().get(id).getCurrencyCheckbox().click();
        }
        return this;
    }
    public AdminCurrencyPageBL clickEditCurrencyButton(short id){
        adminCurrencyPageBL.getSortByLastUpdatedButton().click();
        adminCurrencyPageBL.getCurrencies().get(1).getEditCurrencyButton().click();
        return this;
    }
    public void verifySuccessfulModifiedOnAdminCurrencyPage(){
        String successfulEditCurrency = "Success: You have modified currencies!";
        Assert.assertTrue(adminCurrencyPageBL.getSuccesfulModifiedCurrency().getText().contains(successfulEditCurrency));
    }
    public void verifySuccessfulModifiedOnHomePage(){
        String currencyCode = adminCurrencyPageBL.getCurrencies().get(1).getCurrencyCodeText().getText();
        String currencyCodeOnHomePage;
        new Navigation().navigateToUrl(BASIC_URL_NSTRAFER.getUrlValue());
        new HeaderPageBL().dropCurrencyDropButton();
        Assert.assertEquals(new HeaderPageBL().findCurrencyByName(), currencyCode);


    }
    public String getCurrencyCode(){
        return  adminCurrencyPageBL.getCurrencies().get(1).getCurrencyCodeText().getText();
    }
}
