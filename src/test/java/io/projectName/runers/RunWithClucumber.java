package io.projectName.runers;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/featureFiles"},
        glue = {"io.projectName.steps"},
        monochrome = true,
        plugin = {"pretty", "json:target/cucumber.json"}
)
public class RunWithClucumber {

}
