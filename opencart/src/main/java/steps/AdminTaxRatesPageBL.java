package steps;

import pages.AdminTaxRatesPage;
import pages.containers.TaxRateContainer;

public class AdminTaxRatesPageBL {
    private AdminTaxRatesPage adminTaxRatesPage;

    public AdminTaxRatesPageBL() {
        adminTaxRatesPage = new AdminTaxRatesPage();
    }

    public AdminTaxRatesPageBL checkSummaryCheckbox() {
        if (!adminTaxRatesPage.getSummaryCheckBoxInput().isSelected()) {
            adminTaxRatesPage.getSummaryCheckBoxInput().click();
        }
        return this;
    }

    public AdminTaxRatesPageBL uncheckSummaryCheckbox() {
        if (adminTaxRatesPage.getSummaryCheckBoxInput().isSelected()) {
            adminTaxRatesPage.getSummaryCheckBoxInput().click();
        }
        return this;
    }

    public AdminTaxRatesPageBL sortByTaxName() {
        adminTaxRatesPage.getTaxNameSortButton().click();
        return this;
    }

    public AdminTaxRatesPageBL sortByTaxRate() {
        adminTaxRatesPage.getTaxRateSortButton().click();
        return this;
    }

    public AdminTaxRatesPageBL sortByGeoZone() {
        adminTaxRatesPage.getGeoZoneSortButton().click();
        return this;
    }

    public AdminTaxRatesPageBL sortByDateAdded() {
        adminTaxRatesPage.getGeoZoneSortButton().click();
        return this;
    }

    public AdminTaxRatesPageBL sortByDateModified() {
        adminTaxRatesPage.getGeoZoneSortButton().click();
        return this;
    }

    public AdminTaxRatesPageBL addTaxClick() {
        adminTaxRatesPage.getAddNewButton().click();
        return this;
    }

    public AdminTaxRatesPageBL deleteTaxClick() {
        adminTaxRatesPage.getDeleteButton().click();
        return this;
    }

    public AdminTaxRatesPageBL editTaxClick(int id) {
        adminTaxRatesPage.getTaxes().get(id).getEditButton().click();
        return this;
    }

    public AdminTaxRatesPageBL checkTaxCheckbox(int id) {
        if (!adminTaxRatesPage.getTaxes().get(id).getTaxCheckbox().isSelected()) {
            adminTaxRatesPage.getTaxes().get(id).getTaxCheckbox().click();
        }
        return this;
    }
    public AdminTaxRatesPageBL uncheckTaxCheckbox(int id) {
        if (adminTaxRatesPage.getTaxes().get(id).getTaxCheckbox().isSelected()) {
            adminTaxRatesPage.getTaxes().get(id).getTaxCheckbox().click();
        }
        return this;
    }
}
