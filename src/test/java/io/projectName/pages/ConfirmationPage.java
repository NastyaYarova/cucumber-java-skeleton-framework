package io.projectName.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ConfirmationPage {
    WebDriver driver;

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindAll(@FindBy(xpath = "//*[@id='post-7']/div/div/div/section/table/tbody/tr"))
    private List<WebElement> prd_List;

    public List<String> getProductNames() {
        List<String> productNames = new ArrayList<>();
        for(WebElement element : prd_List) {
            productNames.add(element.findElement(By.xpath("//*[@id='post-7']/div/div/div/section/table/tbody/tr/td[1]/a")).getText());
        }
        return productNames;
    }
}
