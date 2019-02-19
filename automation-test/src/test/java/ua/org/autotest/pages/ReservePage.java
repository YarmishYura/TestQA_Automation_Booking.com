package ua.org.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReservePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public ReservePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

    @FindBy(xpath = "//input[@value='business']")
    private WebElement workButton;

    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//select[@id='booker_title']")
    private WebElement titleField;

    @FindBy(xpath = "//*[@id=\"booker_title\"]/option[2]" )
    private WebElement titleMr;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailAdress;

    @FindBy(xpath = "//input[@id='email_confirm']")
    private WebElement confirmEmailAdress;

    @FindBy(xpath = "//input[@id='notstayer_false']")
    private WebElement mainGuast;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement finalButton;

    public void selectTitle(){
        titleMr.click();
    }

    public void inputConfirmEmailAdress(String email){
        confirmEmailAdress.sendKeys(email);
    }

    public void inputEmailAdress(String email){
        emailAdress.sendKeys(email);
    }

    public void inputFirstName(String firstName){
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName){
        lastNameField.sendKeys(lastName);
    }

    public void clickFinalButton(){
        finalButton.click();
    }

    public void clickMainGuastButton(){
        mainGuast.click();
    }

    public void clickConfirmEmailAdressField(){
        confirmEmailAdress.click();
    }

    public void clickEmailAdressField(){
        emailAdress.click();
    }

    public void clickTitleField(){
        titleField.click();
    }
    public void clickLastNameField(){
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.click();
    }

    public void clickWorkButton(){
        wait.until(ExpectedConditions.elementToBeClickable(workButton));
        workButton.click();
    }

    public void clickFirstNameField(){
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.click();
    }


}
