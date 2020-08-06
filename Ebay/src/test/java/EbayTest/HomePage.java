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
    @Test
    public void testAllCateg(){
        searchAllCateg();
    }
    @Test
    public void testMyEbay(){
        searchMyEbay();
    }
    @Test
    public void testMotors(){
        searchMotors();
    }
    @Test
    public void testFashionBotton(){
        searchFashionBotton();
    }
    @Test
    public void testElectronicBotton(){
        searchElectronicBotton();
    }
    @Test
    public void testcollectibleBotton(){
        searchCollectiblesBotton();
    }
    @Test
    public void testHomeGardenBotton(){
        searchHomeGardenBotton();
    }
    @Test
    public void testSportingBotton(){
        searchSportingBotton();
    }
    @Test
    public void testtoysBotton(){
        searchtoysBotton();
    }
    @Test
    public void testBussinesBotton(){
        searchBussinesBotton();
    }
    @Test
    public void testMusicBotton(){
        searchMusicBotton();
    }
    @Test
    public void testDealsBotton(){
        searchDealsBotton();
    }
    @Test
    public void testShoppingBotton(){
        searchShoppingBotton();
    }


}
