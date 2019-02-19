package ua.org.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FinalPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public FinalPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

    @FindBy(xpath = "//input[@id='phone']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//select[@id='cc_type']")
    private WebElement cardTypeField;

    @FindBy(xpath = "//*[@id=\"cc_type\"]/option[3]")
    private WebElement masterCard;

    @FindBy(xpath = "//input[@id='cc_number']")
    private WebElement cardNumber;

    @FindBy(xpath = "//input[@id='cc_cvc']")
    private WebElement ccvField;

    @FindBy(xpath = "(//span[contains(@class,'copy')])[2]")
    private WebElement completeButton;

    public void selectVisaCard(){
        masterCard.click();
    }

    public void inputCcvNumber(String Ccv){
        ccvField.sendKeys(Ccv);
    }

    public void inputCardNumber(String numberCard){
        cardNumber.sendKeys(numberCard);
    }

    public void inputPhoneNumber(String number){
        phoneNumber.sendKeys(number);
    }

    public void clickCompleteButton(){
        completeButton.click();
    }
    public void clickCcvField(){
        ccvField.click();
    }
    public void clickCardNumberButton(){
        cardNumber.click();
    }
}
