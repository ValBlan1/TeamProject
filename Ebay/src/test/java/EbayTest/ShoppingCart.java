package EbayTest;

import ebayTestCases.MainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCart extends MainTestCases {
    MainTestCases mainTestCases;

    @BeforeMethod
    public void initialElements() {
        mainTestCases = PageFactory.initElements(driver, MainTestCases.class);
    }
    @Test
    public void testStartShopping(){
        startShopping();
    }
    @Test
    public void testShoppingSec(){
        startShoppingSec();
    }

}
