package ua.org.autotest.tests;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ua.org.autotest.pages.*;

import java.util.concurrent.TimeUnit;

public class SetUpTest {
    public static WebDriver driver;
    public static HomePage homePage;
    public static HotelPage hotelPage;
    public static PageResult pageResult;
    public static ReservePage reservePage;
    public static FinalPage finalPage;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        hotelPage = new HotelPage(driver);
        pageResult = new PageResult(driver);
        reservePage = new ReservePage(driver);
        finalPage = new FinalPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.booking.com/?lang=en-us");
    }

    /*AfterClass
    public static void tearDown(){
        driver.quit();
    }*/
}
