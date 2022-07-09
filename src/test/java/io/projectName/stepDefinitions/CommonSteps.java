package io.projectName.stepDefinitions;

import io.cucumber.java.en.Then;
import io.projectName.common.CommonMethods;
import io.projectName.dataProvider.TestContext;
import org.testng.Assert;


public class CommonSteps {
    TestContext testContext;
    CommonMethods commonMethods;

    public CommonSteps(TestContext context) {
        testContext = context;
        commonMethods = new CommonMethods(testContext);
    }

    @Then("check page {string} was opened")
    public void checkPageWasOpened(String pageName) {
        Assert.assertTrue(commonMethods.verifyPageWasOpened(pageName));
    }
}
