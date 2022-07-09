package io.projectName.pages;

import io.projectName.selenium.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductListingPage {
    WebDriver driver;
    private static final String COLOR_OPTION = "//*[@id='pa_color']/option[contains (@value, '%s')]";
    private static final String SIZE_OPTION = "//*[@id='pa_size']/option[contains (@value, '%s')]";

    public ProductListingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='single_add_to_cart_button button alt']")
    private WebElement btn_AddToCart;
    @FindAll(@FindBy(xpath = "//*[@class='noo-product-inner']"))
    private List<WebElement> prd_List;
    // PRODUCT OPTIONS
    @FindBy(xpath = "//*[@id='pa_color']")
    private WebElement ddm_Color;
    @FindBy(xpath = "//*[@id='pa_size']")
    private WebElement ddm_Size;

    public void setColorOption(String colorName) {
        ddm_Color.click();
        driver.findElement(By.xpath(String.format(COLOR_OPTION, colorName))).click();
    }

    public void setSizeOption(String sizeName) {
        ddm_Size.click();
        driver.findElement(By.xpath(String.format(SIZE_OPTION, sizeName))).click();
    }

    public void clickOn_AddToCart() {
        btn_AddToCart.click();
        Wait.untilJqueryIsDone(driver);
    }

    public void select_Product(int productNumber) {
        prd_List.get(productNumber).click();
    }

    public String getProductName(int productNumber) {
        productNumber = productNumber + 1;
        return driver.findElement(By.xpath(String.format("(//*[@class='noo-product-inner'])[%s]/h3", productNumber))).getText();
//        return prd_List.get(productNumber).findElement(By.xpath("/h3")).getText();
    }
}
