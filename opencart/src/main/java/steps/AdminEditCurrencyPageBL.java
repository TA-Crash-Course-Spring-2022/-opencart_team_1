package steps;

import models.EditCurrencyModel;
import pages.AdminEditCurrencyPage;
import repository.EditCurrencyModelRepository;


public class AdminEditCurrencyPageBL {

    private AdminEditCurrencyPage adminEditCurrencyPageBL;
    private AdminEditCurrencyPage adminEditCurrencyPage;

    public AdminEditCurrencyPageBL() {
        adminEditCurrencyPageBL = new AdminEditCurrencyPage();
    }

    public AdminEditCurrencyPageBL editCurrency(EditCurrencyModel editCurrencyModel){
        fillCurrencyTitleInput(editCurrencyModel.getCurrencyTitle());
        fillCurrencyCodeInput(editCurrencyModel.getCurrencyCode());
        fillCurrencySymbolLeftInput(editCurrencyModel.getSymbolLeft());
        fillCurrencySymbolRightInput(editCurrencyModel.getSymbolRight());
        fillCurrencyDecimalPlacesInput(editCurrencyModel.getDecimalPlaces());
        fillCurrencyValueInput(editCurrencyModel.getCurrencyValue());
        selectCurrencyStatus(editCurrencyModel.isCurrencyStatus());
        clickSaveCurrencyButton();
        return this;
    }

    private void fillCurrencyTitleInput(String title) {
        adminEditCurrencyPage.getCurrencyTitleInput().clear();
        adminEditCurrencyPage.getCurrencyTitleInput().sendKeys(title);
    }
    private void fillCurrencyCodeInput(String code) {
        adminEditCurrencyPage.getCurrencyTitleInput().clear();
        adminEditCurrencyPage.getCurrencyTitleInput().sendKeys(code);
    }

    private void fillCurrencySymbolLeftInput(String beforeSymbol) {
        adminEditCurrencyPage.getCurrencyTitleInput().clear();
        adminEditCurrencyPage.getCurrencyTitleInput().sendKeys(beforeSymbol);
    }

    private void fillCurrencySymbolRightInput(String afterSymbol) {
        adminEditCurrencyPage.getCurrencyTitleInput().clear();
        adminEditCurrencyPage.getCurrencyTitleInput().sendKeys(afterSymbol);
    }

    private void fillCurrencyDecimalPlacesInput(String decimalPlaces) {
        adminEditCurrencyPage.getCurrencyTitleInput().clear();
        adminEditCurrencyPage.getCurrencyTitleInput().sendKeys(decimalPlaces);
    }

    private void fillCurrencyValueInput(String currencyValue) {
        adminEditCurrencyPage.getCurrencyTitleInput().clear();
        adminEditCurrencyPage.getCurrencyTitleInput().sendKeys(currencyValue);
    }

    private void selectCurrencyStatus(boolean currencyStatus) {
        adminEditCurrencyPage.getCurrencyTitleInput().clear();
        adminEditCurrencyPage.getStatusSelect().selectByValue(String.valueOf(currencyStatus));
    }
    private void clickSaveCurrencyButton(){
        adminEditCurrencyPage.getSaveEditCurrencyButton().click();
    }

    private void clickCancelCurrencyButton(){
        adminEditCurrencyPage.getCancelEditCurrencyButton().click();
    }
}
