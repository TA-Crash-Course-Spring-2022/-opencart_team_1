package steps;

import navigation.enums.Pages.SearchField;

public class SearchFieldBL {

    private SearchField searchField;

    public SearchFieldBL() {
        searchField = new SearchField();
    }

    public SearchFieldBL typeSearchProduct(String searchProduct) {
        searchField.getSearchInput().clear();
        searchField.getSearchInput().sendKeys(searchProduct);
        return this;
    }

    public SearchFieldBL clickOnSearchButton() {
        searchField.getSearchButton().click();
        return new SearchFieldBL();
    }
}