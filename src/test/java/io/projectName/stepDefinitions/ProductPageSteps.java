package io.projectName.stepDefinitions;

import io.cucumber.java.en.When;
import io.projectName.dataProvider.TestContext;
import io.projectName.enums.Context;
import io.projectName.pages.ProductListingPage;

public class ProductPageSteps {
    TestContext testContext;
    ProductListingPage productListingPage;

    public ProductPageSteps(TestContext context) {
        testContext = context;
        productListingPage = testContext.getPageObjectManager().getProductListingPage();
    }

    @When("choose to buy the first item with parameters: {string}, {string}")
    public void choose_to_buy_the_first_item(String color, String size) {
        String productName = productListingPage.getProductName(1);
        testContext.scenarioContext.setContext(Context.PRODUCT_NAME, productName);
//        productListingPage.select_Product(1);
        productListingPage.setColorOption(color);
        productListingPage.setSizeOption(size);
        productListingPage.clickOn_AddToCart();
    }
}
