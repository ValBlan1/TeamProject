package EbayTest;

import ebayTestCases.MainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage extends MainTestCases {
    MainTestCases mainTestCases;

    @BeforeMethod
    public void initialElements() {
        mainTestCases = PageFactory.initElements(driver, MainTestCases.class);
    }

    @Test
    public void searchBox() {
        searchProducts();
    }

    @Test
    public void dailyDealsTest() {
        searchDailyDeals();
    }

    @Test
    public void BrandOutletTest() {
        searchBrandOutlet();
    }

    @Test
    public void TechAccesoriesTest() {
        searchTechCase();
    }
    @Test
    public  void HealpContactTest(){
        searchHealpContact();
    }
    @Test
    public void SellTest(){
        searchSell();
    }
}
