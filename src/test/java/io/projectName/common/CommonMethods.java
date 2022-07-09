package io.projectName.common;

import io.projectName.dataProvider.TestContext;
import io.projectName.enums.Pages;
import org.openqa.selenium.WebDriverException;

public class CommonMethods {
    TestContext testContext;

    public CommonMethods(TestContext context) {
        testContext = context;
    }

    public boolean verifyPageWasOpened(String pageName) {
        switch (Pages.get(pageName)) {
            case HOME_PAGE:
               return testContext.getPageObjectManager().getHomePage().vrify();
            case CART_PAGE:
                return testContext.getPageObjectManager().getCartPage().vrify();
            default:
                throw new WebDriverException(String.format("Page with name '%s' was not opened.", pageName));
        }
    }
}
