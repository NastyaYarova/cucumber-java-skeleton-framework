package io.projectName.stepDefinitions;

import io.cucumber.java.en.Then;
import io.projectName.dataProvider.TestContext;
import io.projectName.enums.Context;
import io.projectName.pages.ConfirmationPage;
import org.testng.Assert;

public class ConfirmationPageSteps {
    TestContext testContext;
    ConfirmationPage confirmationPage;

    public ConfirmationPageSteps(TestContext context) {
        testContext = context;
        confirmationPage = testContext.getPageObjectManager().getConfirmationPage();
    }

    @Then("verify the order details")
    public void verify_the_order_details() {
        String productName = (String) testContext.scenarioContext.getContext(Context.PRODUCT_NAME);
        //   Assert.assertTrue(confirmationPage.getProductNames().stream().filter(x -> x.contains(productName)).findFirst().get().length()>0);
        //  Assert.assertTrue(confirmationPage.getProductNames().stream().filter(x -> x.contains(productName)).findFirst().get().length()== 0);
        Assert.assertTrue(confirmationPage.getProductNames().stream().filter(x -> x.contains(productName)).findFirst().get().length() == 0, productName + " : is not found on " + confirmationPage.getProductNames().toString());
    }
}
