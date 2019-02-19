package ua.org.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public HotelPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

    @FindBy(xpath = "(//select[@class='hprt-nos-select'])[1]")
    private WebElement roomField;

    @FindBy(className = "hprt-reservation-cta")
    private WebElement reserveButton;

    @FindBy(xpath = "(//span[@class='b-button__text'])[8]")
    private WebElement reserve_Button;

    @FindBy(xpath = "//span[contains(@data-node_tt_id,'location_score_tooltip')]")
    private WebElement subTitle;

    @FindBy(xpath = "(//a[contains(@class,'date')])[1]")
    private WebElement checkIn;

    @FindBy(xpath = "(//a[@href='#'])[5]")
    private WebElement checkOut;

    @FindBy(xpath = "//span[contains(.,'Change search')]")
    private WebElement chageButton;

    @FindBy(xpath = "//span[contains(.,'September 1, 2019')]")
    private WebElement checkInField;

    @FindBy(xpath = "(//span[contains(.,'10')])[11]")
    private WebElement dateIn;

    @FindBy(xpath = "//span[contains(.,'September 30, 2019')]")
    private WebElement checkOutField;

    @FindBy(xpath = "(//span[contains(.,'18')])[26]")
    private WebElement dateOut;

    @FindBy(xpath = "//span[contains(.,'Check availability')]")
    private WebElement checkAvailability;

    public String getTitle(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(@data-node_tt_id,'location_score_tooltip')]")));
        return subTitle.getText();
    }

    public void selectDateIn(){
        wait.until(ExpectedConditions.elementToBeClickable(dateIn));
        dateIn.click();
    }

    public void selectDateOut(){
        wait.until(ExpectedConditions.elementToBeClickable(dateOut));
        dateOut.click();
    }

    public void clickCheckAvailabilityButton(){
        wait.until(ExpectedConditions.elementToBeClickable(checkAvailability));
        checkAvailability.click();
    }
    public void clickCheckOut(){
        wait.until(ExpectedConditions.elementToBeClickable(checkOutField));
        checkOutField.click();
    }

    public void clickCheckIn(){
        wait.until(ExpectedConditions.elementToBeClickable(checkInField));
        checkInField.click();
    }

    public void clickChangeButton(){
        wait.until(ExpectedConditions.elementToBeClickable(chageButton));
        chageButton.click();
    }

    public void clickRoomField(){
        wait.until(ExpectedConditions.elementToBeClickable(roomField));
        roomField.click();
    }

    public void selectCountRoom(){
        roomField.sendKeys(Keys.ARROW_DOWN);
        roomField.sendKeys(Keys.ENTER);
    }

    public void clickReserveButton(){
        wait.until(ExpectedConditions.elementToBeClickable(reserveButton));
        reserveButton.click();
    }

    public String getValueCheckIn(){
        return checkIn.getText();
    }

    public String getValueChecOut(){
        return checkOut.getText();
    }
}
