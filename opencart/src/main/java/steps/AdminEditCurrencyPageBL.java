package steps;

import driver.Driver;
import models.EditCurrencyModel;
import org.openqa.selenium.support.ui.Select;
import pages.AdminCurrencyPage;
import pages.AdminEditCurrencyPage;
import repository.EditCurrencyModelRepository;
import utils.DriverUtils;


public class AdminEditCurrencyPageBL {

    private AdminEditCurrencyPage adminEditCurrencyPage;

    private String currencyNewTitle;
    public AdminEditCurrencyPageBL() {
        adminEditCurrencyPage = new AdminEditCurrencyPage();
    }

    public AdminEditCurrencyPageBL editCurrency(EditCurrencyModel editCurrencyModel){
        fillCurrencyTitleInput(String.valueOf(editCurrencyModel.getCurrencyTitle()));
        fillCurrencyCodeInput(editCurrencyModel.getCurrencyCode());
        fillCurrencySymbolLeftInput(editCurrencyModel.getSymbolLeft());
        fillCurrencySymbolRightInput(editCurrencyModel.getSymbolRight());
        fillCurrencyDecimalPlacesInput(editCurrencyModel.getDecimalPlaces());
        fillCurrencyValueInput(editCurrencyModel.getCurrencyValue());
        return this;
    }
    public AdminEditCurrencyPageBL editAndSaveNewCurrency(){
        editCurrency(EditCurrencyModelRepository.getPositiveCurrencyModel());
        selectCurrencyStatus();
        clickSaveCurrency();
        return this;
    }
    private void fillCurrencyTitleInput(String title) {
        adminEditCurrencyPage.getCurrencyTitleInput().clear();
        adminEditCurrencyPage.getCurrencyTitleInput().sendKeys(title);
    }
    private void fillCurrencyCodeInput(String code) {
        adminEditCurrencyPage.getCodeInput().clear();
        adminEditCurrencyPage.getCodeInput().sendKeys(code);
    }

    private void fillCurrencySymbolLeftInput(String beforeSymbol) {
        adminEditCurrencyPage.getSymbolLeftInput().clear();
        adminEditCurrencyPage.getSymbolLeftInput().sendKeys(beforeSymbol);
    }

    private void fillCurrencySymbolRightInput(String afterSymbol) {
        adminEditCurrencyPage.getSymbolRightInput().clear();
        adminEditCurrencyPage.getSymbolRightInput().sendKeys(afterSymbol);
    }

    private void fillCurrencyDecimalPlacesInput(String decimalPlaces) {
        adminEditCurrencyPage.getDecimalPlacesInput().clear();
        adminEditCurrencyPage.getDecimalPlacesInput().sendKeys(decimalPlaces);
    }

    private void fillCurrencyValueInput(String currencyValue) {
        adminEditCurrencyPage.getValueInput().clear();
        adminEditCurrencyPage.getValueInput().sendKeys(currencyValue);
    }
    public AdminEditCurrencyPageBL selectCurrencyStatus(){
        Select select = new Select(adminEditCurrencyPage.getStatusSelect());
        select.selectByValue("1");
        return this;
    }
    public AdminCurrencyPage clickSaveCurrency(){
        currencyNewTitle = adminEditCurrencyPage.getCurrencyTitleInput().getText();
        adminEditCurrencyPage.getSaveEditCurrencyButton().click();
        return new AdminCurrencyPage();
    }
}
