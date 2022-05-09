package steps;

import org.openqa.selenium.WebElement;
import pages.SearchPage;

public class SearchPageBL {

    private SearchPage searchPage = new SearchPage();

    public SearchPageBL() {
    }

    public SearchPageBL setSearchCategory(String category) {
        searchPage.getSearchFormButton().click();
        for (WebElement target : searchPage.getSearchInCategories()) {
            if (target != null & target.getText().equalsIgnoreCase(category)) {
                target.click();
                break;
            }
        }
        return this;
    }

    public SearchPageBL searchInDescription() {
        searchPage.getSearchInDesc().click();
        return this;
    }

    public SearchPageBL searchInSubcategories() {
        searchPage.getSearchInSubCategories().click();
        return this;
    }
}