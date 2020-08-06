package AlibabaTest;

import alibabaTestCases.MainTestCase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AliHomePage extends MainTestCase {
    MainTestCase mainTestCase;

    @BeforeMethod
    public void  initialElements(){
        mainTestCase = PageFactory.initElements(driver,MainTestCase.class);
    }
    @Test
    public void testSignIn(){
        searchSignIn();
    }
}
