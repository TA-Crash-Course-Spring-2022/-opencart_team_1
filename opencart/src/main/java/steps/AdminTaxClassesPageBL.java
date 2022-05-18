package steps;

import pages.AdminTaxClassesPage;

public class AdminTaxClassesPageBL {
    private AdminTaxClassesPage adminTaxClassesPage;

    public AdminTaxClassesPageBL() {
        adminTaxClassesPage = new AdminTaxClassesPage();
    }

    public AdminTaxClassesPageBL checkSummaryTaxClassesCheckbox() {
        if (!adminTaxClassesPage.getSummaryTaxClassesCheckbox().isSelected()) {
            adminTaxClassesPage.getSummaryTaxClassesCheckbox().click();
        }
        return this;
    }

    public AdminTaxClassesPageBL uncheckSummaryTaxClassesCheckbox() {
        if (adminTaxClassesPage.getSummaryTaxClassesCheckbox().isSelected()) {
            adminTaxClassesPage.getSummaryTaxClassesCheckbox().click();
        }
        return this;
    }

    public AdminTaxClassesPageBL checkTaxClassCheckbox(short id) {
        if (!adminTaxClassesPage.getTaxes().get(id).getTaxClassCheckbox().isSelected()) {
            adminTaxClassesPage.getTaxes().get(id).getTaxClassCheckbox().click();
        }
        return this;
    }
    public AdminTaxClassesPageBL clickEditTaxClass(short id){
        adminTaxClassesPage.getTaxes().get(id).getTaxClassEditButton().click();
        return this;
    }
}
