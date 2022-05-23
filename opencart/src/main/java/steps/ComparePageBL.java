package steps;

import driver.Driver;
import org.testng.Assert;
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
        Driver.waitForcibly();
        products.getAddToCartButton().click();
        return this;
    }

    public ComparePageBL verifyAddToShoppingCart() {
        Driver.waitForcibly();
        Assert.assertTrue(comparePage.getSuccessfulMessage().getText().contains("Success: "));
        return this;
    }

    public ComparePageBL verifyAddToCompare() {
        Assert.assertTrue(comparePage.getComparePageText().getText().contains("Product Comparison"));
        return this;
    }
}
