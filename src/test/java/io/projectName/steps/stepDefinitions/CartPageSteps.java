package io.projectName.steps.stepDefinitions;

import io.cucumber.java.en.When;
import io.projectName.dataProvider.TestContext;
import io.projectName.pages.CartPage;

public class CartPageSteps {
    TestContext testContext;
    CartPage cartPage;

    public CartPageSteps(TestContext context) {
        testContext = context;
        cartPage = testContext.getPageObjectManager().getCartPage();
    }

    @When("moves to checkout from mini cart")
    public void moves_to_checkout_from_mini_cart() {
        cartPage.clickOn_Cart();
        cartPage.clickOn_ContinueToCheckout();
    }

}
