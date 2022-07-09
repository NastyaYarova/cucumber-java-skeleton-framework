package io.projectName.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage implements BasePageInterface {

    public static final String PAGE_IDENTIFIER = "Cart Page";

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='nav-menu-item-cart']/a")
    private WebElement btnCart;

    @FindBy(xpath = "//*[@id='nav-menu-item-cart']/div/div[3]/div[2]/a[2]")
    private WebElement btnContinueToCheckout;

    public void clickOn_Cart() {
        btnCart.click();
    }

    public void clickOn_ContinueToCheckout() {
        btnContinueToCheckout.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }

    @Override
    public boolean vrify() {
        System.out.println("Cart Page verify");
        return true;
    }
}
