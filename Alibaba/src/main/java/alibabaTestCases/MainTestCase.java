package alibabaTestCases;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MainTestCase extends CommonAPI {

    @FindBy( xpath = "//div[@class= 'sc-hd-download-link']")
    public static WebElement getAppBotton;
    @FindBy( xpath = "//div[@id= 'login-submit']")
    public static WebElement signHeader;

    public void searchSignIn(){
        getAppBotton.click();


    }


}
