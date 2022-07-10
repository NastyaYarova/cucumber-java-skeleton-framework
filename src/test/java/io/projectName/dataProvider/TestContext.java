package io.projectName.dataProvider;

import io.projectName.managers.PageObjectManager;
import io.projectName.managers.WebDriverManager;
import org.testng.annotations.Parameters;

public class TestContext {
    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;
    public ScenarioContext scenarioContext;

    @Parameters("Browser")
    public TestContext(String parameter) {
        webDriverManager = new WebDriverManager(parameter);
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
        scenarioContext = new ScenarioContext();
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }
}
