package io.projectName.runers;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/featureFiles",
        glue = {"io.projectName.steps"},
        tags = {"not @Ignore"},
        plugin = {"pretty", "json:target/cucumber-report/cucumber.json"}
)
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {
}
