package alibabaTestCases;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class MainTestCase extends CommonAPI {
  /*  @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("https://www.alibaba.com/")  String url) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jesse\\IdeaProjects\\TeamProject\\Generic\\driver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }*/

    @FindBy( xpath = "//div[@class= 'sc-hd-download-link']")
    public static WebElement getAppBotton;
    @FindBy( xpath = "//a[@data-spm='dNewArrivals'][1]")
    public static WebElement newArrivals;
    @FindBy(xpath = "//div[@class='text'][1]")
    public static WebElement allCategories;


    public void searchSignIn(){
        getAppBotton.click();
    }
    public void searchNewArrivals(){
        newArrivals.click();

    }


}
