package EbayTest;

import ebayTestCases.MainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBar extends MainTestCases {
    MainTestCases mainTestCases;

    @BeforeMethod
    public void  initialElements(){
        mainTestCases = PageFactory.initElements(driver,MainTestCases.class);
    }
    @Test
    public void testDayBed(){
        searchDayBed();
    }
    @Test
    public void testEmbroidered(){
        searchEmbroidered();
    }
    @Test
    public void testCandles(){
        searchCandles();
    }
    @Test
    public void testOptions(){
        searchOptions();
    }

}
