package io.projectName.pages;

import io.projectName.dataProvider.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage implements BasePageInterface {

    public static final String PAGE_IDENTIFIER = "Home Page";
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void perform_Search(String search) {
        driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getApplicationUrl() + "/?s=" + search + "&post_type=product");
    }

    public void navigateTo_HomePage() {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    @Override
    public boolean vrify() {
        System.out.println("Home page verify");
        return true;
    }
}


