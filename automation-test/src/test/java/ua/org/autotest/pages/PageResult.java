package ua.org.autotest.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageResult {
    public WebDriver driver;
    public WebDriverWait wait;

    public PageResult(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

    @FindBy(xpath = "(//span[contains(@class,'sr-hotel__name')])[1]")
    private WebElement title;

    public void clickTitle(){
        title.click();
    }


}
