package ua.org.autotest.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.org.autotest.pages.HomePage;

import java.util.ArrayList;
import java.util.List;

public class AutomationTest extends SetUpTest {
    @Test
    public void automationTestMain(){
        homePage.clickCityField();
        homePage.inputCity("New York");
        homePage.selectCity();
        while (!(HomePage.getMonth().equals("September 2019"))){
            homePage.clickTransitionButton();
        }
        homePage.clickDateInButton();
        homePage.clickDateOutButton();
        homePage.clickSearchButton();
        List<WebElement> listTitles = driver.findElements(By.className("sr-hotel__name"));
        for(WebElement listTitle : listTitles){
            listTitle.click();
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            Assert.assertTrue(hotelPage.getTitle().contains("New York"));
            if(driver.findElements(By.xpath("(//span[contains(@class,'header')])[1]")).size() != 0){
                driver.close();
                driver.switchTo().window(tabs2.get(0));
                continue;
            }
                Assert.assertEquals("Sun, Sept 1, 2019", hotelPage.getValueCheckIn());
                Assert.assertEquals("Mon, Sept 30, 2019", hotelPage.getValueChecOut());
                driver.close();
                driver.switchTo().window(tabs2.get(0));
        }
    }

    @Test
    public void automationTest_1(){
        homePage.clickCityField();
        homePage.inputCity("New York");
        homePage.selectCity();
        while (!(HomePage.getMonth().equals("September 2019"))) {
            homePage.clickTransitionButton();
        }
        homePage.clickDateInButton();
        homePage.clickDateOutButton();
        homePage.clickSearchButton();
        pageResult.clickTitle();
        ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        hotelPage.clickRoomField();
        hotelPage.selectCountRoom();
        hotelPage.clickReserveButton();
        reservePage.clickWorkButton();
        reservePage.clickFirstNameField();
        reservePage.inputFirstName("Yuriy");
        reservePage.clickLastNameField();
        reservePage.inputLastName("Yarmish");
        reservePage.clickTitleField();
        reservePage.selectTitle();
        reservePage.clickEmailAdressField();
        reservePage.inputEmailAdress("yarmish.yura@gmail.com");
        reservePage.clickConfirmEmailAdressField();
        reservePage.inputConfirmEmailAdress("yarmish.yura@gmail.com");
        reservePage.clickMainGuastButton();
        reservePage.clickFinalButton();
        finalPage.inputPhoneNumber("662747699");
        finalPage.selectVisaCard();
        finalPage.clickCardNumberButton();
        finalPage.inputCardNumber("5555 5555 5555 5555");
        finalPage.clickCcvField();
        finalPage.inputCcvNumber("333");
        finalPage.clickCompleteButton();
    }

    @Test
    public void automationTest_2(){
        homePage.clickCityField();
        homePage.inputCity("New York");
        homePage.selectCity();
        while (!(HomePage.getMonth().equals("September 2019"))) {
            homePage.clickTransitionButton();
        }
        homePage.clickDateInButton();
        homePage.clickDateOutButton();
        homePage.clickSearchButton();
        pageResult.clickTitle();
        ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        hotelPage.clickRoomField();
        hotelPage.selectCountRoom();
        hotelPage.clickChangeButton();
        hotelPage.clickCheckIn();
        hotelPage.selectDateIn();
        hotelPage.clickCheckOut();
        hotelPage.selectDateOut();
        hotelPage.clickCheckAvailabilityButton();
    }
}
