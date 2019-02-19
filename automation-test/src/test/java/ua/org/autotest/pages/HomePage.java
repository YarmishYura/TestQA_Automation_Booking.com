package ua.org.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

    @FindBy(id = "ss")
    private WebElement cityField;

    @FindBy(xpath = "(//li[@role='option'])[1]")
    private WebElement cityNewYork;

    @FindBy(className = "xp__group")
    private WebElement checkInField;

    @FindBy(xpath = "(//*[@data-date='2019-09-01'])")
    private WebElement firstSeptember;

    @FindBy(className = "bui-calendar__control--next")
    private WebElement transition;

    @FindBy(className = "bui-calendar__month")
    private static WebElement calendarMonth;

    @FindBy(xpath = "(//*[@data-date='2019-09-30'])")
    private WebElement thirtiethSeptember;

    @FindBy(className = "sb-searchbox__button")
    private WebElement search;

    public static String getMonth(){
        return calendarMonth.getText();
    }

    public void inputCity(String city) {
        cityField.sendKeys(city);
    }

    public void selectCity(){
        cityNewYork.click();
    }

    public void clickSearchButton(){
        wait.until(ExpectedConditions.elementToBeClickable(search));
        search.click();
    }

    public void clickDateInButton(){
        wait.until(ExpectedConditions.elementToBeClickable(firstSeptember));
        firstSeptember.click();
    }

    public void clickDateOutButton(){
        wait.until(ExpectedConditions.elementToBeClickable(thirtiethSeptember));
        thirtiethSeptember.click();
    }

    public void clickTransitionButton(){
        wait.until(ExpectedConditions.elementToBeClickable(transition));
        transition.click();
    }

    public void clickCityField(){
        wait.until(ExpectedConditions.elementToBeClickable(cityField));
        cityField.click();
    }
}
