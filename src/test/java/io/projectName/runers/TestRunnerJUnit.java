package io.projectName.runers;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featureFiles",
        glue = {"io.projectName.stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber",},
        snippets = CAMELCASE,
        monochrome = true
)
public class TestRunnerJUnit {
}
