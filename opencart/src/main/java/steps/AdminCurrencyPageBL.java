package steps;

import pages.AdminCurrencyPage;

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
        adminCurrencyPageBL.getCurrencies().get(id).getEditCurrencyButton().click();
        return this;
    }
}
