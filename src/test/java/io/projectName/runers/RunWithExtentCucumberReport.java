package io.projectName.runers;

import java.io.*;

import com.cucumber.listener.Reporter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.projectName.dataProvider.FileReaderManager;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        features = "src/test/resources/featureFiles",
        glue = {"io.projectName.stepDefinitions"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true
)
public class RunWithExtentCucumberReport extends AbstractTestNGCucumberTests {

//    @AfterClass
//    public static void writeExtentReport() {
//        Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
//    }

    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.7.0");
        Reporter.setSystemInfo("Maven", "3.5.2");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
    }
}
