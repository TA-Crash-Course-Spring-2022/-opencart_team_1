package steps;

import pages.SearchField;

public class SearchFieldBL {

    private SearchField searchField;

    public SearchFieldBL() {
        searchField = new SearchField();
    }

    public SearchFieldBL typeSearchProduct(String productInput) {
        searchField.getSearchInput().clear();
        searchField.getSearchInput().sendKeys(productInput);
        return this;
    }

    public SearchFieldBL clickOnSearchButton() {
        searchField.getSearchButton().click();
        return this;
    }
}
