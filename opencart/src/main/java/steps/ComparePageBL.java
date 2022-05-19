package steps;

import pages.ComparePage;
import pages.containers.CompareContainer;

public class ComparePageBL {

    private ComparePage comparePage;

    public ComparePageBL() {
        comparePage = new ComparePage();
    }

    public ComparePageBL addProductToCartFromComparePage(String productName) {
        CompareContainer products = comparePage.getProducts()
                .stream()
                .filter(e -> e.getProductTitle().getText().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        products.getAddToCartButton().click();
        return this;
    }
}
